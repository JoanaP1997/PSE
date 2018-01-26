package dibugger.control;

import static dibugger.debuglogic.debugger.DebugControl.STEP_BACK;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dibugger.debuglogic.debugger.DebugLogicFacade;
import dibugger.debuglogic.debugger.ProgramInput;
import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.interpreter.ScopeTuple;
import dibugger.userinterface.GUIFacade;

/**
 *  DebugLogicController provides methods used to alter DIbugger's model
 *  component. 
 */
public class DebugLogicController {
    private DebugLogicFacade debugLogicFacade;

    private TextInputBuffer inputBuffer;
    
    private Map<String, Integer> map_programNameIDs;

    /**
     * Creates a new {@code DebugLogicController} object.
     */
    public DebugLogicController() {
        debugLogicFacade = new DebugLogicFacade();
        inputBuffer = new TextInputBuffer();
        
        map_programNameIDs = new HashMap<String, Integer>();
    }

    /**
     * Attaches given {@code GUIFacade} to DIbugger's model component, 
     * which causes guiFacade to be informed on change of model's data.
     * 
     * @param guiFacade the {@code GUIFacade} to attach to model
     */
    public void attachToModel(GUIFacade guiFacade) {
        debugLogicFacade.addObserver(guiFacade);
    }

    /**
     * Getter for all breakpoints of a given program.
     * 
     * @param numberOfProgram
     *            the number of program to return breakpoints of
     * @return a list containing all breakpoints of specified program
     * @see DebugLogicFacade#getBreakpoints(int)
     */
    public List<Integer> getBreakpoints(int numberOfProgram) {
        return debugLogicFacade.getBreakpoints(numberOfProgram);
    }

    /**
     * Returns the conditions of all conditional breakpoints known to DIbugger's
     * model-component.
     * 
     * @return a list containing the conditions of all conditional breakpoints
     */
    public List<String> getConditionalBreakpoints() {
        return debugLogicFacade.getConditionalBreakpoints();
    }

    int getNumberOfBufferedPrograms() {
        return inputBuffer.getNumberOfPrograms();
    }

    int getNumberOfPrograms() {
        return debugLogicFacade.getNumPrograms();
    }

    int getStepSize(int programNumber) {
        return debugLogicFacade.getStepSize(programNumber);
    }
    
    public List<ProgramInput> getProgramInput() {
        return inputBuffer.getProgramInput();
    }

    /**
     * Sets the stepsize of a program
     * 
     * @param numberOfProgram
     *            the number of program to change the stepsize of
     * @param size
     *            the new stepsize to use while debugging
     * @see DebugLogicFacade#setStepSize(int, int)
     */
    public void setStepSize(int numberOfProgram, int size) {
        debugLogicFacade.setStepSize(numberOfProgram, size);
    }

    /**
     * Executes a step defined by a given step type.
     * 
     * @param type
     *            the type of the step
     * @see DebugLogicFacade#step(int)
     */
    public void step(int type) throws DIbuggerLogicException {
        debugLogicFacade.step(type);
    }

    /**
     * Continues Debugging / Stepping in all programs until a Breakpoint or
     * Conditional Breakpoint is reached.
     * 
     * @see DebugLogicFacade#continueDebug()
     */
    public void continueDebug() throws DIbuggerLogicException {
        debugLogicFacade.continueDebug();
    }

    /**
     * Executes a normal step of size 1 in a given program
     * 
     * @param numberOfProgram
     *            the number of program to do a step in
     * @see DebugLogicFacade#singleStep(int)
     */
    public void singleStep(String programNameID) {
    	if(map_programNameIDs.containsKey(programNameID)){
    		debugLogicFacade.singleStep(map_programNameIDs.get(programNameID));
    	}
    }

    /**
     * Causes DIbugger to perform a step in reverse order of execution
     * of each program's instructions.
     * 
     * @see step(int)
     */
    public void stepBack() throws DIbuggerLogicException {
        step(STEP_BACK);
    }
    
    /**
     * Returns all current variables.
     * 
     * @return list containing all variables
     * @see DebugLogicFacade#getAllVariables(String)
     */
    public List<String> getAllVariables(String programId) {
        return debugLogicFacade.getAllVariables(programId);
    }
    
    /**
     * Returns the value of a specified variable.
     * 
     * @param variable
     *            variable
     * @return the value of specified variable
     * @see DebugLogicFacade#getValueOf(String, String)
     */
    public String getValueOf(String programId, String variable) {
        return debugLogicFacade.getValueOf(programId, variable);
    }
  
    public List<String> getWatchExpressions() {
        return debugLogicFacade.getWatchExpressions();
    }

    public List<Integer> getWatchExpressionScopeBeginnnings(int expressionId) {
        return debugLogicFacade.getWEScopeBegin(expressionId);
    }

    public List<Integer> getWatchExpressionScopeEnds(int expressionId) {
        return debugLogicFacade.getWEScopeEnd(expressionId);
    }
    
    /**
     * Creates a new watch expression.
     * 
     * @param id
     *            the id of the watch expression
     * @param expr
     *            the expression of the watch expression
     * @see DebugLogicFacade#createWatchExpression(int, String)
     */
    public void createWatchExpression(int watchExpressionId, String expression) {
        debugLogicFacade.createWatchExpression(watchExpressionId, expression);
    }

    void createWatchExpressions(Collection<String> expressions) {
        int watchExpressionId = 0;
        for (String expression : expressions) {
            createWatchExpression(watchExpressionId, expression);
            watchExpressionId++;
        }
    }

    /**
     * Changes the specified watch expression.
     * 
     * @param id
     *            the id of the watch expression to change
     * @param expr
     *            the new expression
     * @param scopes
     *            a list of scopes for the new watch expression
     * @see DebugLogicFacade#changeWatchExpression(int, String, List)
     */
    public void changeWatchExpression(int watchExpressionId, String expression, List<ScopeTuple> scopes) {
        debugLogicFacade.changeWatchExpression(watchExpressionId, expression, scopes);
    }

    /**
     * Deletes the specified watch expression.
     * 
     * @param id
     *            the id of the watch expression
     * @see DebugLogicFacade#deleteWatchExpression(int)
     */
    public void deleteWatchExpression(int watchExpressionId) {
        debugLogicFacade.deleteWatchExpression(watchExpressionId);
    }

    /**
     * Creates a new conditional breakpoint.
     * 
     * @param id
     *            the id of the breakpoint
     * @param cond
     *            the condition of the breakpoint
     * @see DebugLogicFacade#createConditionalBreakpoint(int, String)            
     */
    public void createConditionalBreakpoint(int breakPointId, String condition) {
        debugLogicFacade.createCondBreakpoint(breakPointId, condition);
    }

    /**
     * Getter for the Scope-begins of a given conditional breakpoint.
     * 
     * @param expressionId
     *            the id of the expression
     * @return a List containing all Scope begins for the given conditional
     *         breakpoint
     * @see DebugLogicFacade#getCBScopeBegin(int)
     */
    public List<Integer> getConditionalBreakpointScopeBeginnings(int expressionId) {
        return debugLogicFacade.getCBScopeBegin(expressionId);
    }

    /**
     * Getter for the Scope ends of a given conditional breakpoint.
     * 
     * @param expressionId
     *            the id of the expression
     * @return a List containing all Scope ends for the given conditional
     *         breakpoint
     */
    public List<Integer> getConditionalBreakpointScopeEnds(int expressionId) {
        return debugLogicFacade.getCBScopeEnd(expressionId);
    }

    void createConditionalBreakpoints(List<String> conditions) {
        int breakpointId = 0;
        for (String condition : conditions) {
            createConditionalBreakpoint(breakpointId, condition);
            breakpointId++;
        }
    }

    /**
     * Changes the specified conditional breakpoint.
     * 
     * @param id
     *            the id of the breakpoint to change
     * @param cond
     *            the condition of the breakpoint
     * @param scopes
     *            a list of all scopes
     * @see DebugLogicFacade#changeConditionalBreakpoint(int, String, List)
     */
    public void changeConditionalBreakpoint(int breakPointId, String condition, List<ScopeTuple> scopes) {
        debugLogicFacade.changeCondBreakpoint(breakPointId, condition, scopes);
    }

    /**
     * Deletes specified breakpoint.
     * 
     * @param id
     *            the id of the breakpoint
     * @see DebugLogicFacade#deleteConditionalBreakpoint(int)
     */
    public void deleteConditionalBreakpoint(int conditionalBreakPointId) {
        debugLogicFacade.deleteCondBreakpoint(conditionalBreakPointId);
    }

//    /**
//     * Creates a breakpoint at given line in all programs known to DIbugger.
//     * 
//     * @param line the line to create a breakpoint at
//     */
//    public void createSynchronousBreakpoint(int line) {
//        int numberOfPrograms = getNumberOfPrograms();
//        for (int i = 0; i < numberOfPrograms; i++) {
//            createBreakpoint(i, line);
//        }
//    }

    /**
     * Creates a new breakpoint at given line of specified program.
     * 
     * @param numberOfProgram
     *            the program's number
     * @param line
     *            the line to create a breakpoint at
     * @see DebugLogicFacade#createBreakpoint(int, int)
     */
    public void createBreakpoint(String programNameID, int line) {
        if(map_programNameIDs.containsKey(programNameID)){
            int programID = map_programNameIDs.get(programNameID);
            debugLogicFacade.createBreakpoint(programID, line);
        }
    }

    void createBreakpoints(String programNameID, List<Integer> lines) {
        for (int line : lines) {
            createBreakpoint(programNameID, line);
        }
    }

    /**
     * Deletes a breakpoint at given line of specified program.
     * 
     * @param numberOfProgram
     *            the number of program to delete a breakpoint of
     * @param line
     *            the line number referring to the breakpoint
     * @see DebugLogicFacade#deleteBreakpoint(int, int)
     */
    public void deleteBreakpoint(String programNameID, int line) {
        if(map_programNameIDs.containsKey(programNameID)){
            int programID = map_programNameIDs.get(programNameID);
            debugLogicFacade.deleteBreakpoint(programID, line);
        }
    }

    /**
     * Deletes all breakpoints in all programs.
     * 
     * @see DebugLogicFacade#deleteAllBreakpoints()
     */
    public void deleteAllBreakpoints() {
        debugLogicFacade.deleteAllBreakpoints();
    }

    /**
     * Stores given lists of multiple program's assigments of input variables, 
     * text and identifier.
     * For each program, its assignments of input variables is expected to
     * a {@code String} of this kind: "a = 10;b = "bridge"", where "a" and "b" are
     * input variables.
     * 
     * @param inputTexts a list containing each program's input variable-assignments
     * @param programTexts a list containing each program's text
     * @param programIdentifiers a list of containing each program's identifier
     */
    public void saveText(List<String> inputVariables, List<String> programTexts, List<String> programIdentifiers) {
        inputBuffer.storeTextInput(inputVariables, programTexts, programIdentifiers);
        debugLogicFacade.syncProgramInput(getProgramInput());
        for(int i=0;i<programIdentifiers.size();++i){
            map_programNameIDs.put(programIdentifiers.get(i), i);
        }
    }

    /**
     * Switches DIbugger's mode to debug-mode. Input of user stored in this
     * Controlfacade via {@link saveText(List, List, List) will be sent to package
     * {@code dibugger.debuglogic.debugger}.
     * 
     * @see DebugLogicFacade#launchRun(List)
     * @throws DIbuggerLogicException if an exception occured 
     */
    public void startDebug() throws DIbuggerLogicException {
        debugLogicFacade.launchRun(getProgramInput());
    }

    /**
     * Might perform steps related to DIbugger's model component, 
     * if necessary to stop process of debugging.
     */
    public void stopDebug() {
        /*  */
    }
    
    /**
     * Partially resets state of DIbugger's model component.
     * 
     * @see DebugLogicFacade#reset()
     */
    public void reset() {
        debugLogicFacade.reset();
    }

    /**
     * Sets the maximum-iteration-count (example: while loop).
     * 
     * @param count
     *            the new maximum
     * @see DebugLogicFacade#setMaximumIterations(int)
     */
    public void setMaximumIterations(int maximum) {
        debugLogicFacade.setMaximumIterations(maximum);
    }

    /**
     * Sets the upper limit of function calls allowed when executing
     * a program.
     * 
     * @param count
     *            the new maximum
     * @see DebugLogicFacade#setMaximumFunctionCalls(int)
     */
    public void setMaximumFunctionCalls(int maximum) {
        debugLogicFacade.setMaximumFunctionCalls(maximum);
    }

    /**
     * Suggest a stepsize for all programs.
     * 
     * @param programText
     *            list containing all program texts
     * @see DebugLogicFacade#suggestStepSize(List)
     */
    public void suggestStepSize() {
        List<ProgramInput> currentInput = getProgramInput();
        List<String> programTexts = new ArrayList<>();

        // programTexts containing null-objects is unlikely
        currentInput.stream().map(programInput -> programInput.getText()).forEach(text -> programTexts.add(text));
        debugLogicFacade.suggestStepSize(programTexts);
    }

    /**
     * Suggests a watch expression.
     * 
     * @return String representing the expression
     * @see DebugLogicFacade#suggestWatchExpression(List)
     */
    public String suggestWatchExpression() {
        return debugLogicFacade.suggestWatchExpression();
    }

    /**
     * Suggests a conditional breakpoint.
     * 
     * @return String representing the condition
     * @see DebugLogicFacade#suggestConditionalBreakpoint(List)
     */
    public String suggestConditionalBreakpoint() {
        return debugLogicFacade.suggestConditionalBreakpoint();
    }

    /**
     * Suggests an InputValue for a given variable in a given range.
     * 
     * @param identifier
     *            the variable's name
     * @param range
     *            the range containing the value to suggest
     * @param type
     *            the type of the variable
     * @return String representing the suggestion value
     * @see DebugLogicFacade#suggestInputValue(String, String, int)
     */
    public String suggestInputValue(String inputVariableId, String range, int type) {
        return debugLogicFacade.suggestInputValue(inputVariableId, range, type);
    }

    /**
     * Select a strategy to be used to suggest step sizes.
     * 
     * @param id
     *            the strategy id to select
     * @see DebugLogicFacade#selectStepSizeStrategy(int)
     */
    public void selectStepSizeStrategy(int stepSizeStrategyId) {
        debugLogicFacade.selectStepSizeStrategy(stepSizeStrategyId);
    }

    /**
     * Select a strategy to be used to suggest realtional expressions
     * 
     * @param id
     *            the strategy id to select
     * @see DebugLogicFacade#selectRelationalExpressionStrategy(int)
     */
    public void selectRelationalExpressionStrategy(int expressionStrategyId) {
        debugLogicFacade.selectRelationalStrategy(expressionStrategyId);
    }

    /**
     * Select a strategy to be used to suggest input values
     * 
     * @param id
     *            the strategy id to select
     * @see DebugLogicFacade#selectInputValueStrategy(int)
     */
    public void selectInputValueStrategy(int inputValueStrategyId) {
        debugLogicFacade.selectInputValueStrategy(inputValueStrategyId);
    }

    /**
     * Returns the DebugLogicFacade known to this ControlFacade.
     * 
     * @return the DebugLogicFacade known to this
     */
    public DebugLogicFacade getDebugLogicFacade() {
        return debugLogicFacade;
    }
}
