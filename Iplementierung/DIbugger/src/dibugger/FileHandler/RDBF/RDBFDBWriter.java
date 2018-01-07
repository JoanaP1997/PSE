package dibugger.FileHandler.RDBF;

import java.io.IOException;

import dibugger.FileHandler.Facade.ConfigurationFile;
import dibugger.FileHandler.Facade.ConfigurationFile.IntTuple;
import dibugger.FileHandler.Facade.ConfigurationFile.WCBExpression;
import dibugger.FileHandler.Facade.DBFileWriter;
import dibugger.FileHandler.Facade.LanguageFile;

public class RDBFDBWriter extends DBFileWriter{

	private RDBFWriter writer;
	
	public RDBFDBWriter(){
		writer = new RDBFWriter();
	}
	
	@Override
	public void saveConfigFile(ConfigurationFile f) {
		RDBFFile file = new RDBFFile(f.getSystemFile());
		
		//Programs
		for(int i=0;i<f.getNumPrograms();++i){
			RDBFBlock block_program = new RDBFBlock("PROGRAM");
			//Program StepSize
			block_program.addData(new RDBFData("stepsize", ""+f.getStepSize(i)));
			//Last Exec Line
			block_program.addData(new RDBFData("lastExecLine", ""+f.getLatestExecutionLine(i)));
			//Program Text
			RDBFBlock block = new RDBFBlock("PROGRAMTEXT");
			block.addData(new RDBFData("text", f.getProgramText(i), true));
			block_program.addBlock(block);
			//InputValues
			block = new RDBFBlock("INPUTVALUES");
			for(String key : f.getList_inputValues().get(i).keySet()){
				block.addData(new RDBFData(key, "'"+f.getInputValue(i, key)+"'"));
			}
			block_program.addBlock(block);
			//Var Inspector
			block = new RDBFBlock("VARINSPECTOR");
			for(String var : f.getVariablesOfInspector(i)){
				block.addData(new RDBFData("variable", "'"+var+"'"));
			}
			//Breakpoints
			block = new RDBFBlock("BREAKPOINTS");
			for(int line : f.getBreakpoints(i)){
				block.addData(new RDBFData("line", ""+line));
			}
			
			file.addBlock(block_program);
		}
		//WatchExpressions	
		for(WCBExpression expr : f.getList_watchExpressions()){
			RDBFBlock block_we = new RDBFBlock("WATCHEXPR");
			//Expression
			block_we.addData(new RDBFData("expression", "'"+expr.getExpression()+"'"));
			//Scopes
			for(IntTuple it : expr.getList_scopes()){
				RDBFBlock block = new RDBFBlock("SCOPE");
				block.addData(new RDBFData("begin", ""+it.getA()));
				block.addData(new RDBFData("end", ""+it.getB()));
				block_we.addBlock(block);
			}
			
			file.addBlock(block_we);
		}
		//CondBreakpoints
		for(WCBExpression expr : f.getList_condBreakpoints()){
			RDBFBlock block_cb = new RDBFBlock("CONDBREAKPOINT");
			//Expression
			block_cb.addData(new RDBFData("expression", "'"+expr.getExpression()+"'"));
			//Scopes
			for(IntTuple it : expr.getList_scopes()){
				RDBFBlock block = new RDBFBlock("SCOPE");
				block.addData(new RDBFData("begin", ""+it.getA()));
				block.addData(new RDBFData("end", ""+it.getB()));
				block_cb.addBlock(block);
			}
			
			file.addBlock(block_cb);
		}
		//final Write to storage
		try {
			writer.saveRDBFFile(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void saveLanguageFile(LanguageFile f) {
		//TODO
	}
	
}
