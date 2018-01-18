package dibugger.debuglogic.debugger;

import java.util.List;
import java.util.Observable;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.interpreter.ScopeTuple;

/**
 * Facade class for the Debugger. It delegates functions calls to the DebugControl and / or Suggestion classes.
 * @author Pascal
 *
 */
public class DebugLogicFacade extends Observable{
	
	private DebugControl debugControl;
	
	private StepSizeSuggestion suggest_stepsize;
	private InputValueSuggestion suggest_input;
	private RelationalSuggestion suggest_relational;
	
	public DebugLogicFacade() {
		super();
		debugControl = new DebugControl();
		
		suggest_stepsize = new SimpleStepSizeSuggestion(debugControl);
		suggest_input = new SimpleInputSuggestion();
		suggest_relational = new SimpleRelationalSuggestion();
	}
	
	/**
	 * @see DebugControl#setStepSize(int, int)
	 */
	public void setStepSize(int program, int size){
		debugControl.setStepSize(program, size);
	}
	
	/**
	 * @see DebugControl#step(int)
	 */
	public void step(int type) throws DIbuggerLogicException{
		debugControl.step(type);
	}
	/**
	 * @see DebugControl#singleStep(int)
	 */
	public void singleStep(int programID){
		debugControl.singleStep(programID);
	}
	/**
	 * @see DebugControl#continueDebug()
	 */
	public void continueDebug() throws DIbuggerLogicException{
		debugControl.continueDebug();
	}
	
	/**
	 * @see DebugControl#createWatchExpression(int, String)
	 */
	public void createWatchExpression(int id, String expr){
		debugControl.createWatchExpression(id, expr);
	}
	/**
	 * @see DebugControl#changeWatchExpression(int, String, List)
	 */
	public void changeWatchExpression(int id, String expr, List<ScopeTuple> scopes){
		debugControl.changeWatchExpression(id, expr, scopes);
	}
	/**
	 * @see DebugControl#deleteWatchExpression(int)
	 */
	public void deleteWatchExpression(int id){
		debugControl.deleteWatchExpression(id);	
	}
	
	/**
	 * @see DebugControl#changeCondBreakpoint(int, String, List)
	 */
	public void createCondBreakpoint(int id, String cond){
		debugControl.createCondBreakpoint(id, cond);
	}
	/**
	 * @see DebugControl#changeCondBreakpoint(int, String, List)
	 */
	public void changeCondBreakpoint(int id, String cond, List<ScopeTuple> scopes){
		debugControl.changeCondBreakpoint(id, cond, scopes);
	}
	/**
	 * @see DebugControl#deleteCondBreakpoint(int)
	 */
	public void deleteCondBreakpoint(int id){
		debugControl.deleteCondBreakpoint(id);	
	}
	
	/**
	 * @see DebugControl#createBreakpoint(int, int)
	 */
	public void createBreakpoint(int programID, int line){
		debugControl.createBreakpoint(programID, line);
	}
	/**
	 * @see DebugControl#deleteBreakpoint(int, int)
	 */
	public void deleteBreakpoint(int programID, int line){
		debugControl.deleteBreakpoint(programID, line);
	}
	
	/**
	 * @see DebugControl#launchRun(List)
	 */
	public void launchRun(List<ProgramInput> programs){
		debugControl.launchRun(programs);
	}
	
	/**
	 * @see DebugControl#getProgramCounter()
	 */
	public List<Integer> getProgramCounter(){
		return debugControl.getProgramCounter();
	}
	
	/**
	 * @see DebugControl#reset()
	 */
	public void reset(){
		debugControl.reset();
	}
	
	/**
	 * @see DebugControl#setMaximumIterations(int)
	 */
	public void setMaximumIterations(int count){
		debugControl.setMaximumIterations(count);
	}
	
	/**
	 * @see DebugControl#setMaximumFunctionCalls(int)
	 */
	public void setMaximumFunctionCalls(int count){
		debugControl.setMaximumFunctionCalls(count);
	}
	
	public void deleteAllBreakpoints(){
		debugControl.deleteAllBreakpoints();
	}
	
	
	//Suggestions
	/**
	 * @see StepSizeSuggestion#suggest(List)
	 */
	public void suggestStepSize(List<String> programText){
		suggest_stepsize.suggest(programText);
	}
	public String suggestWatchExpression(){
		return suggest_relational.suggestWatchExpression();
	}
	public String suggestConditionalBreakpoint(){
		return suggest_relational.suggestConditionalBreakpoint();
	}
	public String suggestInputValue(String identifier, String range, int type){
		return suggest_input.suggest(identifier, range, type);
	}
	
	public void selectStepSizeStrategy(int id){
		if(id == STRAT_STEP_SIZE_SIMPLE){
			suggest_stepsize = new SimpleStepSizeSuggestion(debugControl);
		}
	}
	public void selectRelationalStrategy(int id){
		if(id == STRAT_REL_SIMPLE){
			suggest_relational = new SimpleRelationalSuggestion();
		}
	}
	public void selectInputValueStrategy(int id){
		if(id == STRAT_INPUT_SIMPLE){
			suggest_input = new SimpleInputSuggestion();
		}
	}
	
	//Strategy Types
	public static final int STRAT_STEP_SIZE_SIMPLE = 0;
	public static final int STRAT_REL_SIMPLE = 1;
	public static final int STRAT_INPUT_SIMPLE = 2;
}
