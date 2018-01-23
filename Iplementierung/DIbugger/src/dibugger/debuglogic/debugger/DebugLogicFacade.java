package dibugger.debuglogic.debugger;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.interpreter.ConditionalBreakpoint;
import dibugger.debuglogic.interpreter.ScopeTuple;
import dibugger.debuglogic.interpreter.WatchExpression;

/**
 * Facade class for the Debugger. It delegates functions calls to the
 * DebugControl and / or Suggestion classes.
 * 
 * @author Pascal
 *
 */
public class DebugLogicFacade extends Observable {

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
    public void setStepSize(int program, int size) {
        debugControl.setStepSize(program, size);
    }

    /**
     * @see DebugControl#step(int)
     */
    public void step(int type) throws DIbuggerLogicException {
        debugControl.step(type);
    }

    /**
     * @see DebugControl#singleStep(int)
     */
    public void singleStep(int programID) {
        debugControl.singleStep(programID);
    }

    /**
     * @see DebugControl#continueDebug()
     */
    public void continueDebug() throws DIbuggerLogicException {
        debugControl.continueDebug();
    }

    /**
     * @see DebugControl#createWatchExpression(int, String)
     */
    public void createWatchExpression(int id, String expr) {
        debugControl.createWatchExpression(id, expr);
    }

    /**
     * @see DebugControl#changeWatchExpression(int, String, List)
     */
    public void changeWatchExpression(int id, String expr, List<ScopeTuple> scopes) {
        debugControl.changeWatchExpression(id, expr, scopes);
    }

    /**
     * @see DebugControl#deleteWatchExpression(int)
     */
    public void deleteWatchExpression(int id) {
        debugControl.deleteWatchExpression(id);
    }

    /**
     * @see DebugControl#changeCondBreakpoint(int, String, List)
     */
    public void createCondBreakpoint(int id, String cond) {
        debugControl.createCondBreakpoint(id, cond);
    }

    /**
     * @see DebugControl#changeCondBreakpoint(int, String, List)
     */
    public void changeCondBreakpoint(int id, String cond, List<ScopeTuple> scopes) {
        debugControl.changeCondBreakpoint(id, cond, scopes);
    }

    /**
     * @see DebugControl#deleteCondBreakpoint(int)
     */
    public void deleteCondBreakpoint(int id) {
        debugControl.deleteCondBreakpoint(id);
    }

    /**
     * @see DebugControl#createBreakpoint(int, int)
     */
    public void createBreakpoint(int programID, int line) {
        debugControl.createBreakpoint(programID, line);
    }

    /**
     * @see DebugControl#deleteBreakpoint(int, int)
     */
    public void deleteBreakpoint(int programID, int line) {
        debugControl.deleteBreakpoint(programID, line);
    }

    /**
     * @see DebugControl#launchRun(List)
     */
    public void launchRun(List<ProgramInput> programs) {
        debugControl.launchRun(programs);
    }

    /**
     * @see DebugControl#getProgramCounter()
     */
    public List<Integer> getProgramCounter() {
        return debugControl.getProgramCounter();
    }

    /**
     * @see DebugControl#getCurrentExecutionLines()
     */
    public List<Integer> getCurrentExecutionLines() {
        return debugControl.getCurrentExecutionLines();
    }

    /**
     * @see DebugControl#reset()
     */
    public void reset() {
        debugControl.reset();
    }

    /**
     * @see DebugControl#setMaximumIterations(int)
     */
    public void setMaximumIterations(int count) {
        debugControl.setMaximumIterations(count);
    }

    /**
     * @see DebugControl#setMaximumFunctionCalls(int)
     */
    public void setMaximumFunctionCalls(int count) {
        debugControl.setMaximumFunctionCalls(count);
    }

    public void deleteAllBreakpoints() {
        debugControl.deleteAllBreakpoints();
    }

    // Suggestions
    /**
     * @see StepSizeSuggestion#suggest(List)
     */
    public void suggestStepSize(List<String> programText) {
        suggest_stepsize.suggest(programText);
    }

    /**
     * @see RelationalSuggestion#suggestWatchExpression()
     */
    public String suggestWatchExpression() {
        return suggest_relational.suggestWatchExpression();
    }

    /**
     * @see RelationalSuggestion#suggestConditionalBreakpoint()
     */
    public String suggestConditionalBreakpoint() {
        return suggest_relational.suggestConditionalBreakpoint();
    }

    /**
     * @see InputValueSuggestion#suggest(String, String, int)
     */
    public String suggestInputValue(String identifier, String range, int type) {
        return suggest_input.suggest(identifier, range, type);
    }

    /**
     * Select a strategy to be used to suggest step sizes
     * 
     * @param id
     *            the strategy id to select
     */
    public void selectStepSizeStrategy(int id) {
        if (id == STRAT_STEP_SIZE_SIMPLE) {
            suggest_stepsize = new SimpleStepSizeSuggestion(debugControl);
        }
    }

    /**
     * Select a strategy to be used to suggest realtional expressions
     * 
     * @param id
     *            the strategy id to select
     */
    public void selectRelationalStrategy(int id) {
        if (id == STRAT_REL_SIMPLE) {
            suggest_relational = new SimpleRelationalSuggestion();
        }
    }

    /**
     * Select a strategy to be used to suggest input values
     * 
     * @param id
     *            the strategy id to select
     */
    public void selectInputValueStrategy(int id) {
        if (id == STRAT_INPUT_SIMPLE) {
            suggest_input = new SimpleInputSuggestion();
        }
    }

    // Getter delegated to DebugControl    
    /**
     * 
     * @return the amount of conditional breakpoints
     */
    public int getWatchExpressionSize() {
        return debugControl.getWatchExpressionSize();
    }

    /**
     * 
     * @return a list containing all expression of the watch expressions
     */
    public List<String> getWatchExpressions() {
        return debugControl.getWatchExpressions();
    }

    /**
     * Getter for the Scope Begin of a given Watch Expression
     * 
     * @param expressionID
     *            the id of the expression
     * @return a List containing all Scope begins for the given watch
     *         expression.
     */
    public List<Integer> getWEScopeBegin(int expressionID) {
        return debugControl.getWEScopeBegin(expressionID);
    }

    /**
     * Getter for the Scope End of a given Watch Expression
     * 
     * @param expressionID
     *            the id of the expression
     * @return a List containing all Scope ends for the given watch expression.
     */
    public List<Integer> getWEScopeEnd(int expressionID) {
        return debugControl.getWEScopeEnd(expressionID);
    }

    /**
     * Getter for the value of a watch expression
     * 
     * @param expressionID
     *            the id of the expression
     * @return the current Value of the expression
     * @throws DIbuggerLogicException
     *             {@linkplain WatchExpression#evaluate(List)}
     */
    public String getWEValue(int expressionID) throws DIbuggerLogicException {
        return debugControl.getWEValue(expressionID);
    }

    /**
     * 
     * @return the amount of conditional breakpoints
     */
    public int getConditionalBreakpointSize() {
        return debugControl.getConditionalBreakpointSize();
    }

    /**
     * 
     * @return a list containing all conditions of the conditional breakpoints
     */
    public List<String> getConditionalBreakpoints() {
        return debugControl.getConditionalBreakpoints();
    }

    /**
     * Getter for the Scope Begin of a given Conditional Breakpoint
     * 
     * @param expressionID
     *            the id of the expression
     * @return a List containing all Scope begins for the given conditional
     *         breakpoint.
     */
    public List<Integer> getCBScopeBegin(int expressionID) {
        return debugControl.getCBScopeBegin(expressionID);
    }

    /**
     * Getter for the Scope end of a given Conditional Breakpoint
     * 
     * @param expressionID
     *            the id of the expression
     * @return a List containing all Scope ends for the given conditional
     *         breakpoint.
     */
    public List<Integer> getCBScopeEnd(int expressionID) {
        return debugControl.getCBScopeEnd(expressionID);
    }

    /**
     * Getter for the value of a conditional breakpoint
     * 
     * @param breakpointID
     *            the id of the conditional breakpoint
     * @return the current Value of the condition
     * @throws DIbuggerLogicException
     *             {@linkplain ConditionalBreakpoint#evaluate(List)}
     */
    public boolean getCBValue(int breakpointID) throws DIbuggerLogicException {
        return debugControl.getCBValue(breakpointID);
    }

    /**
     * Getter for all breakpoints of a given program
     * @param programID the program id
     * @return a list containing all programs of program programID
     */
    public List<Integer> getBreakpoints(int programID){
    	return debugControl.getBreakpoints(programID);
    }
    
    
    // Strategy Types
    public static final int STRAT_STEP_SIZE_SIMPLE = 0;
    public static final int STRAT_REL_SIMPLE = 1;
    public static final int STRAT_INPUT_SIMPLE = 2;
}
