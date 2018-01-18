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
	/**
	 * Getter for the program text of program programID
	 * @param programID the ID of the program
	 * @return program text corresponding to the given programID
	 */
	public String getProgramText(int programID){
		return list_programText.get(programID);
	}
	/**
	 * Getter for the StepSize of program programID
	 * @param programID the ID of the program
	 * @return stepSize of the program programID 
	 */
	public int getStepSize(int programID){
		return list_programStepSize.get(programID);
	}
	/**
	 * Getter for the inputValue defined by the variable identifier of program programID
	 * @param programID the id of the program
	 * @param identifier the variable to read the input value
	 * @return the input value of the variable identifier in program programID
	 */
	public String getInputValue(int programID, String identifier){
		return list_inputValues.get(programID).get(identifier);
	}
	/**
	 * Getter for the last Execution Line of a given program
	 * @param programID the ID of the program
	 * @return the last execution line, if the configuration was saved within the Debug-Mode, else 0
	 */
	public int getLatestExecutionLine(int programID){
		return list_lastExecLine.get(programID);
	}
	/**
	 * Getter for all viewed variables of the variable inspector of the given program
	 * @param programID the id of the program
	 * @return a list, that contains all viewed variables as a String.
	 */
	public List<String> getVariablesOfInspector(int programID){
		return list_varInspector.get(programID);
	}
	
	/**
	 * 
	 * @return the amount of Watch Expressions
	 */
	public int getWatchExpressionSize(){
		return list_watchExpressions.size();
	}
	/**
	 * 
	 * @return a list containing all expression of the watch expressions
	 */
	public List<String> getWatchExpressions(){
		List<String> l = new ArrayList<String>();
		for(int i=0;i<list_watchExpressions.size();++i){
			l.add(list_watchExpressions.get(i).expression);
		}
		return l;
	}
	/**
	 * Getter for the Scope Begin of a given Watch Expression
	 * @param expressionID the id of the expression
	 * @return a List containing all Scope begins for the given watch expression.
	 */
	public List<Integer> getWEScopeBegin(int expressionID){
		List<Integer> l = new ArrayList<Integer>();
		for(IntTuple it : list_watchExpressions.get(expressionID).list_scopes){
			l.add(it.a);
		}
		return l;
	}
	/**
	 * Getter for the Scope End of a given Watch Expression
	 * @param expressionID the id of the expression
	 * @return a List containing all Scope ends for the given watch expression.
	 */
	public List<Integer> getWEScopeEnd(int expressionID){
		List<Integer> l = new ArrayList<Integer>();
		for(IntTuple it : list_watchExpressions.get(expressionID).list_scopes){
			l.add(it.b);
		}
		return l;
	}
	
	/**
	 * 
	 * @return the amount of conditional breakpoints
	 */
	public int getConditionalBreakpointSize(){
		return list_condBreakpoints.size();
	}
	/**
	 * 
	 * @return a list containing all conditions of the conditional breakpoints
	 */
	public List<String> getConditionalBreakpoints(){
		List<String> l = new ArrayList<String>();
		for(int i=0;i<list_condBreakpoints.size();++i){
			l.add(list_condBreakpoints.get(i).expression);
		}
		return l;
	}
	/**
	 * Getter for the Scope Begin of a given Conditional Breakpoint
	 * @param expressionID the id of the expression
	 * @return a List containing all Scope begins for the given conditional breakpoint.
	 */
	public List<Integer> getCBScopeBegin(int expressionID){
		List<Integer> l = new ArrayList<Integer>();
		for(IntTuple it : list_condBreakpoints.get(expressionID).list_scopes){
			l.add(it.a);
		}
		return l;
	}
	/**
	 * Getter for the Scope end of a given Conditional Breakpoint
	 * @param expressionID the id of the expression
	 * @return a List containing all Scope ends for the given conditional breakpoint.
	 */
	public List<Integer> getCBScopeEnd(int expressionID){
		List<Integer> l = new ArrayList<Integer>();
		for(IntTuple it : list_condBreakpoints.get(expressionID).list_scopes){
			l.add(it.b);
		}
		return l;
	}
	/**
	 * Getter for all breakpoint lines of a given program
	 * @param programID the id of the program
	 * @return a list containing all breakpoint lines of the given program as integers.
	 */
	public List<Integer> getBreakpoints(int programID){
		return list_breakpoints.get(programID);
	}
	
	//Simple Getter
	/**
	 * @see java.io.File
	 * @return the system file object of the Configuration
	 */
	public File getSystemFile() {
		return systemFile;
	}
	/**
	 * 
	 * @return the list object containing all program texts
	 */
	public List<String> getList_programText() {
		return list_programText;
	}
	/**
	 * 
	 * @return the list object containing all program step sizes.
	 */
	public List<Integer> getList_programStepSize() {
		return list_programStepSize;
	}
	/**
	 * 
	 * @return the list object containing all input values.
	 */
	public List<Map<String, String>> getList_inputValues() {
		return list_inputValues;
	}
	/**
	 * 
	 * @return the list object containing all last program execution lines.
	 */
	public List<Integer> getList_lastExecLine() {
		return list_lastExecLine;
	}
	/**
	 * 
	 * @return the list obejct containing all focused variables of the programs.
	 */
	public List<List<String>> getList_varInspector() {
		return list_varInspector;
	}
	/**
	 * 
	 * @return the list obejct containing all Watch Expressions
	 */
	public List<WCBExpression> getList_watchExpressions() {
		return list_watchExpressions;
	}
	/**
	 * 
	 * @return the list obejct containing all conditional breakpoints
	 */
	public List<WCBExpression> getList_condBreakpoints() {
		return list_condBreakpoints;
	}
	/**
	 * 
	 * @return the list obejct containing all breakpoints.
	 */
	public List<List<Integer>> getList_breakpoints() {
		return list_breakpoints;
	}
	/**
	 * Getter for the amount of programs
	 * @return the amount of programs
	 */
	public int getNumPrograms() {
		return numPrograms;
	}
	/**
	 * Setter for the amount of programs
	 * @param numPrograms new amount of programs
	 */
	public void setNumPrograms(int numPrograms) {
		this.numPrograms = numPrograms;
	}
	
	//Private helper structs	
	public class WCBExpression{
		private String expression;
		private List<IntTuple> list_scopes;
		
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
		private int a,b;

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
