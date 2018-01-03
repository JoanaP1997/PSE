package dibugger.FileHandler.Facade;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author Pascal
 * Holds Data representing a stored Configuration of the DIbugger UI and Logic.
 */
public class ConfigurationFile {
	
	private File systemFile;
	
	private List<String> list_programText;
	private List<Integer> list_programStepSize;
	private List<Map<String, String>> list_inputValues;
	private List<Integer> list_lastExecLine;
	
	private List<List<String>> list_varInspector;
	
	private List<WCBExpression> list_watchExpressions;
	private List<WCBExpression> list_condBreakpoints;
	private List<List<Integer>>	list_breakpoints;
	
	public ConfigurationFile(File file) {
		systemFile = file;
		//TODO create Lists
	}
	
	
	
	//Private helper structs	
	private class WCBExpression{
		String expression;
		List<IntTuple> list_scopes;
		
		public WCBExpression(String expression){
			this.expression = expression;
			list_scopes = new ArrayList<IntTuple>();
		}
	}
	private class IntTuple{
		int a,b;

		public IntTuple(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}
	
}
