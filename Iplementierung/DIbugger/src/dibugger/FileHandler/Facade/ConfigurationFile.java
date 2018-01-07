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
	
	private int numPrograms;
	
	public ConfigurationFile(File file) {
		systemFile = file;
		//TODO create Lists
		list_programText = new ArrayList<String>();
		list_programStepSize = new ArrayList<Integer>();
		list_inputValues = new ArrayList<Map<String, String>>();
		list_lastExecLine = new ArrayList<Integer>();
		
		list_varInspector = new ArrayList<List<String>>();
		
		list_watchExpressions = new ArrayList<WCBExpression>();
		list_condBreakpoints = new ArrayList<WCBExpression>();
		list_breakpoints = new ArrayList<List<Integer>>();
	}	
	
	//Complex Getter
	public String getProgramText(int programID){
		return list_programText.get(programID);
	}
	
	public int getStepSize(int programID){
		return list_programStepSize.get(programID);
	}
	
	public String getInputValue(int programID, String identifier){
		return list_inputValues.get(programID).get(identifier);
	}
	
	public int getLatestExecutionLine(int programID){
		return list_lastExecLine.get(programID);
	}
	
	public List<String> getVariablesOfInspector(int programID){
		return list_varInspector.get(programID);
	}
	
	public List<Integer> getWEScopeBegin(int expressionID){
		List<Integer> l = new ArrayList<Integer>();
		for(IntTuple it : list_watchExpressions.get(expressionID).list_scopes){
			l.add(it.a);
		}
		return l;
	}
	public List<Integer> getWEScopeEnd(int expressionID){
		List<Integer> l = new ArrayList<Integer>();
		for(IntTuple it : list_watchExpressions.get(expressionID).list_scopes){
			l.add(it.b);
		}
		return l;
	}
	
	public List<Integer> getCBScopeBegin(int expressionID){
		List<Integer> l = new ArrayList<Integer>();
		for(IntTuple it : list_condBreakpoints.get(expressionID).list_scopes){
			l.add(it.a);
		}
		return l;
	}
	public List<Integer> getCBScopeEnd(int expressionID){
		List<Integer> l = new ArrayList<Integer>();
		for(IntTuple it : list_condBreakpoints.get(expressionID).list_scopes){
			l.add(it.b);
		}
		return l;
	}
	
	public List<Integer> getBreakpoints(int programID){
		return list_breakpoints.get(programID);
	}
	
	//Simple Getter
	public File getSystemFile() {
		return systemFile;
	}
	public List<String> getList_programText() {
		return list_programText;
	}
	public List<Integer> getList_programStepSize() {
		return list_programStepSize;
	}
	public List<Map<String, String>> getList_inputValues() {
		return list_inputValues;
	}
	public List<Integer> getList_lastExecLine() {
		return list_lastExecLine;
	}
	public List<List<String>> getList_varInspector() {
		return list_varInspector;
	}
	public List<WCBExpression> getList_watchExpressions() {
		return list_watchExpressions;
	}
	public List<WCBExpression> getList_condBreakpoints() {
		return list_condBreakpoints;
	}
	public List<List<Integer>> getList_breakpoints() {
		return list_breakpoints;
	}
	public int getNumPrograms() {
		return numPrograms;
	}
	public void setNumPrograms(int numPrograms) {
		this.numPrograms = numPrograms;
	}

	//Private helper structs	
	public class WCBExpression{
		String expression;
		List<IntTuple> list_scopes;
		
		public WCBExpression(String expression){
			this.expression = expression;
			list_scopes = new ArrayList<IntTuple>();
		}

		public String getExpression() {
			return expression;
		}
		
		public List<IntTuple> getList_scopes() {
			return list_scopes;
		}
	}
	public class IntTuple{
		int a,b;

		public IntTuple(int a, int b) {
			this.a = a;
			this.b = b;
		}
		
		public int getA() {
			return a;
		}
		public int getB() {
			return b;
		}
	}
	
}
