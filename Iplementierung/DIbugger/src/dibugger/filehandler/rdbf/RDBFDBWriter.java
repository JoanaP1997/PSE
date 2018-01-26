package dibugger.filehandler.rdbf;

import java.io.File;
import java.io.IOException;
import java.util.List;

import dibugger.filehandler.facade.ConfigurationFile;
import dibugger.filehandler.facade.DBFileWriter;
import dibugger.filehandler.facade.LanguageFile;

/**
 * SPecific implementation of the {@linkplain DBFileWriter} for the RDBF Format
 * 
 * @author Pascal
 *
 */
public class RDBFDBWriter extends DBFileWriter {

    private RDBFWriter writer;

    public RDBFDBWriter() {
        writer = new RDBFWriter();
    }

    @Override
    public void saveConfigFile(ConfigurationFile f) {
        RDBFFile file = new RDBFFile(f.getSystemFile());

        // Programs
        for (int i = 0; i < f.getNumPrograms(); ++i) {
            RDBFBlock block_program = new RDBFBlock("PROGRAM");
            // Program StepSize
            block_program.addData(new RDBFData("stepsize", "" + f.getStepSize(i)));
            // Program nameID
            block_program.addData(new RDBFData("name",	"'"+f.getProgramNameID(i)+"'"));
            // Last Exec Line
            block_program.addData(new RDBFData("lastExecLine", "" + f.getLatestExecutionLine(i)));
            // Program Text
            RDBFBlock block = new RDBFBlock("PROGRAMTEXT");
            block.addData(new RDBFData("text", f.getProgramText(i), true));
            block_program.addBlock(block);
            // InputValues
            block = new RDBFBlock("INPUTVALUES");
            for (String key : f.getList_inputValues().get(i).keySet()) {
                block.addData(new RDBFData(key, "'" + f.getInputValue(i, key) + "'"));
            }
            block_program.addBlock(block);
            // Var Inspector
            block = new RDBFBlock("VARINSPECTOR");
            for (String var : f.getVariablesOfInspector(i)) {
                block.addData(new RDBFData("variable", "'" + var + "'"));
            }
            block_program.addBlock(block);
            // Breakpoints
            block = new RDBFBlock("BREAKPOINTS");
            for (int line : f.getBreakpoints(i)) {
                block.addData(new RDBFData("line", "" + line));
            }
            block_program.addBlock(block);

            file.addBlock(block_program);
        }
        // WatchExpressions
        List<String> l_expressions = f.getWatchExpressions();
        for (int i = 0; i < f.getWatchExpressionSize(); ++i) {
            RDBFBlock block_we = new RDBFBlock("WATCHEXPR");
            // Expression
            block_we.addData(new RDBFData("expression", "'" + l_expressions.get(i) + "'"));
            // scopes
            List<Integer> l_scopeBegin = f.getWEScopeBegin(i);
            List<Integer> l_scopeEnd = f.getWEScopeEnd(i);
            for (int j = 0; j < l_scopeBegin.size(); ++j) {
                RDBFBlock block = new RDBFBlock("SCOPE");
                block.addData(new RDBFData("begin", "" + l_scopeBegin.get(j)));
                block.addData(new RDBFData("end", "" + l_scopeEnd.get(j)));
                block_we.addBlock(block);
            }

            file.addBlock(block_we);
        }
        // CondBreakpoints
        l_expressions = f.getConditionalBreakpoints();
        for (int i = 0; i < f.getConditionalBreakpointSize(); ++i) {
            RDBFBlock block_cb = new RDBFBlock("CONDBREAKPOINT");
            // condition
            block_cb.addData(new RDBFData("expression", "'" + l_expressions.get(i) + "'"));
            // scopes
            List<Integer> l_scopeBegin = f.getCBScopeBegin(i);
            List<Integer> l_scopeEnd = f.getCBScopeEnd(i);
            for (int j = 0; j < l_scopeBegin.size(); ++j) {
                RDBFBlock block = new RDBFBlock("SCOPE");
                block.addData(new RDBFData("begin", "" + l_scopeBegin.get(j)));
                block.addData(new RDBFData("end", "" + l_scopeEnd.get(j)));
                block_cb.addBlock(block);
            }

            file.addBlock(block_cb);
        }
        // final Write to storage
        try {
            writer.saveRDBFFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveLanguageFile(LanguageFile file) {
        RDBFFile f = new RDBFFile(new File(LanguageFile.DEFAULT_LANG_FILE_PATH + file.getLangID() + ".rdbf"));
        f.addData(new RDBFData("langID", "'" + file.getLangID() + "'"));
        f.addData(new RDBFData("langName", "'" + file.getName() + "'"));
        for (String key : file.getMap_translations().keySet()) {
            RDBFBlock b = new RDBFBlock(key);
            b.addData(new RDBFData("text", file.getTranslation(key), true));
            f.addBlock(b);
        }
        try {
            writer.saveRDBFFile(f);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
