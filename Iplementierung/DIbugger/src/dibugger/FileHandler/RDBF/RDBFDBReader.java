package dibugger.FileHandler.RDBF;

import static dibugger.FileHandler.RDBF.RDBFParser.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.File;
import java.io.IOException;

import dibugger.FileHandler.Exceptions.FileHandlerException;
import dibugger.FileHandler.Facade.ConfigurationFile;
import dibugger.FileHandler.Facade.ConfigurationFile.WCBExpression;
import dibugger.FileHandler.Facade.DBFileReader;
import dibugger.FileHandler.Facade.LanguageFile;

/**
 * Specific implementation of the {@linkplain DBFileReader} for the RDBF Format
 * @author Pascal
 *
 */
public class RDBFDBReader extends DBFileReader{
	
	private RDBFReader reader;
	
	public RDBFDBReader() {
		reader = new RDBFReader();
	}
	
	@Override
	public ConfigurationFile loadConfigFile(File file) throws FileHandlerException {
		try {
			RDBFFile f0 = reader.loadRDBFFile(file);
			ConfigurationFile f = new ConfigurationFile(file);
			
			List<RDBFBlock> l_b = f0.getBlocksByName("PROGRAM");
			f.setNumPrograms(l_b.size());
			//Load ProgramData
			for(RDBFBlock b : l_b){
				f.getList_programStepSize().add(getInstance().getIValue(b.getFirstDataByName("stepsize").getValue()));
				f.getList_lastExecLine().add(getInstance().getIValue(b.getFirstDataByName("lastExecLine").getValue()));
				f.getList_programText().add(b.getFirstBlockByName("PROGRAMTEXT").getFirstDataByName("text").getValue());
				Map<String, String> map_input = new HashMap<String, String>();
				for(RDBFData d : b.getFirstBlockByName("INPUTVALUES").getList_data()){
					map_input.put(d.getName(), getInstance().getSValue(d.getValue()));
				}
				f.getList_inputValues().add(map_input);
				List<String> list_varIns = new ArrayList<String>();
				for(RDBFData d : b.getFirstBlockByName("VARINSPECTOR").getList_data()){
					list_varIns.add(getInstance().getSValue(d.getValue()));
				}
				f.getList_varInspector().add(list_varIns);
				List<Integer> list_bp = new ArrayList<Integer>();
				for(RDBFData d : b.getFirstBlockByName("BREAKPOINTS").getList_data()){
					list_bp.add(getInstance().getIValue(d.getValue()));
				}
				f.getList_breakpoints().add(list_bp);
			}
			//Load WCB Data
			l_b = f0.getBlocksByName("WATCHEXPR");
			for(RDBFBlock b : l_b){
				String expression = getInstance().getSValue(b.getFirstDataByName("expression").getValue());
				WCBExpression e = f.new WCBExpression(expression);
				for(RDBFBlock b0 : b.getBlocksByName("SCOPE")){
					e.getList_scopes().add(f.new IntTuple(getInstance().getIValue(b0.getFirstDataByName("begin").getValue()), getInstance().getIValue(b0.getFirstDataByName("end").getValue())));
				}
				f.getList_watchExpressions().add(e);
			}
			l_b = f0.getBlocksByName("CONDBREAKPOINT");
			for(RDBFBlock b : l_b){
				String expression = getInstance().getSValue(b.getFirstDataByName("expression").getValue());
				WCBExpression e = f.new WCBExpression(expression);
				for(RDBFBlock b0 : b.getBlocksByName("SCOPE")){
					e.getList_scopes().add(f.new IntTuple(getInstance().getIValue(b0.getFirstDataByName("begin").getValue()), getInstance().getIValue(b0.getFirstDataByName("end").getValue())));
				}
				f.getList_condBreakpoints().add(e);
			}
			
			return f;
		} catch (IOException e) {//TODO no stack trace
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public LanguageFile loadLanguageFile(File file) throws FileHandlerException {
		try {
			RDBFFile f0 = reader.loadRDBFFile(file);
			
			LanguageFile f = new LanguageFile(getInstance().getSValue(f0.getFirstDataByName("langID").getValue()), getInstance().getSValue(f0.getFirstDataByName("langName").getValue()));
			
			for(RDBFBlock b : f0.getList_blocks()){
				f.putTranslation(b.getName(), b.getFirstDataByName("text").getValue());
			}
			
			return f;			
		} catch (IOException e) {//TODO no stack trace
			e.printStackTrace();
		}		
		
		return null;
	}

}
