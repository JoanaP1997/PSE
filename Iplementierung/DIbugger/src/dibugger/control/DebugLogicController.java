package dibugger.control;

import dibugger.debuglogic.debugger.DebugLogicFacade;
import dibugger.debuglogic.debugger.ProgramInput;
import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.SyntaxException;
import dibugger.debuglogic.interpreter.ScopeTuple;
import dibugger.userinterface.GUIFacade;

import java.util.*;

/**
 * DebugLogicController provides methods used to alter DIbugger's model
 * component.
 */
public class DebugLogicController {
    private DebugLogicFacade debugLogicFacade;

    private TextInputBuffer inputBuffer;

    private Map<String, Integer> programIds;

    /**
     * Creates a new {@code DebugLogicController} object.
     */
    public DebugLogicController() {
        this(new DebugLogicFacade());
    }
    
    public DebugLogicController(DebugLogicFacade facade) {
        Objects.requireNonNull(facade);
        this.debugLogicFacade = facade;
        inputBuffer = new TextInputBuffer();
        
        programIds = new HashMap<>();
    }

    private int getProgramId(String programId) {
        Integer integerId = programIds.get(programId);
        assert (programId != null);
        return integerId;
    }

    private boolean isKnownId(String programId) {
        return programIds.containsKey(programId);
    }

    void putId(String programId, int integerId) {
        programIds.put(programId, integerId);
    }

    /**
     * Attaches given {@code GUIFacade} to DIbugger's model component, which
     * causes guiFacade to be informed on change of model's data.
     *
     * @param guiFacade
     *            the {@code GUIFacade} to attach to model
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

    int getStepSize(String programNumber) {
        return debugLogicFacade.getStepSize(programNumber);
    }

    public List<ProgramInput> getProgramInput() {
        return inputBuffer.getProgramInput();
    }

    /**
     * Sets the stepsize of a program.
     *
     * @param programId
     *            the ID of program to change the stepsize of
     * @param stepSize
     *            the new stepsize to use while debugging
     * @see DebugLogicFacade#setStepSize(int, int)
     */
    public void setStepSize(String programId, int stepSize) {
        if (isKnownId(programId)) {
            int integerId = getProgramId(programId);
            debugLogicFacade.setStepSize(integerId, stepSize);
        }
    }

    /**
     * Sets the stepsize of a program.
     *
     * @param programId
     *            the ID of program to change the stepsize of
     * @param stepSize
     *            the new stepsize to use while debugging
     * @throws SyntaxException
     *             in case the syntax of the stepsize string is wrong
     * @see DebugLogicFacade#setStepSize(int, int)
     */
    public void setStepSize(String programId, String stepSize) throws SyntaxException {
        if (isKnownId(programId)) {
            int integerId = getProgramId(programId);

            try {
                debugLogicFacade.setStepSize(integerId, Integer.parseInt(stepSize));
            } catch (NumberFormatException e) {
                throw new SyntaxException("mismatched input: int expected!");
            }
        }
    }

    /**
     * Executes a step defined by a given step type.
     *
     * @param type
     *            the type of the step
     * @throws DIbuggerLogicException
     *             in case no step can be performed
     * @see DebugLogicFacade#step(int)
     */
    public void step(int type) throws DIbuggerLogicException {
        debugLogicFacade.step(type);
    }

    /**
     * Continues Debugging / Stepping in all programs until a Breakpoint or
     * Conditional Breakpoint is reached.
     *
     * @throws DIbuggerLogicException
     *             in case continue cannot be performed
     * @see DebugLogicFacade#continueDebug()
     */
    public void continueDebug() throws DIbuggerLogicException {
        debugLogicFacade.continueDebug();
    }

    /**
     * Executes a normal step of size 1 in a given program.
     *
     * @param programNameId
     *            the id of program to do a step in
     * @see DebugLogicFacade#singleStep(int)
     */
    public void singleStep(String programNameId) {
        if (isKnownId(programNameId)) {
            debugLogicFacade.singleStep(getProgramId(programNameId));
        }
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
     * Returns the value of a specified program's variable.
     *
     * @param programId
     *            the program's id
     * @param variable
     *            variable
     * @return the value of specified variable
     * @see DebugLogicFacade#getValueOf(String, String)
     */
    public String getValueOf(String programId, String variable) {
        return debugLogicFacade.getValueOf(programId, variable);
    }

    /**
     * Returns List of WatchExpressions.
     * 
     * @return watch expressions
     */
    public List<String> getWatchExpressions() {
        return debugLogicFacade.getWatchExpressions();
    }

    /**
     * Returns scope beginnings of a WatchExpression.
     * 
     * @param expressionId
     *            id of the WatchExpression
     * @return scope beginnings for each program of one WatchExpression
     */
    public Map<String, Integer> getWatchExpressionScopeBeginnnings(int expressionId) {
        List<Integer> l = debugLogicFacade.getWEScopeBegin(expressionId);
        Map<String, Integer> m = new HashMap<>();
        for (int i = 0; i < l.size(); ++i) {
            m.put(inverseMapping(programIds, i), l.get(i));
        }
        return m;
    }

    /**
     * Returns scope endings of a WatchExpression.
     * 
     * @param expressionId
     *            id of the WatchExpression
     * @return scope endings for each program of one WatchExpression
     */
    public Map<String, Integer> getWatchExpressionScopeEnds(int expressionId) {
        List<Integer> l = debugLogicFacade.getWEScopeEnd(expressionId);
        Map<String, Integer> m = new HashMap<>();
        for (int i = 0; i < l.size(); ++i) {
            m.put(inverseMapping(programIds, i), l.get(i));
        }
        return m;
    }

    /**
     * Creates a new watch expression.
     *
     * @param watchExpressionId
     *            the id of the watch expression
     * @param expression
     *            the expression of the watch expression
     * @throws DIbuggerLogicException
     *             in case the WatchExpression cannot be created
     * @see DebugLogicFacade#createWatchExpression(int, String)
     */
    public void createWatchExpression(int watchExpressionId, String expression) throws DIbuggerLogicException {
        debugLogicFacade.createWatchExpression(watchExpressionId, expression);
    }

    /**
     * Creates new WatchExpressions.
     *
     * @param expressions
     *            WatchExpressions
     * @throws DIbuggerLogicException
     *             in case one or more WatchExpressions cannot be created
     */
    void createWatchExpressions(Collection<String> expressions) throws DIbuggerLogicException {
        int watchExpressionId = 0;
        for (String expression : expressions) {
            createWatchExpression(watchExpressionId, expression);
            watchExpressionId++;
        }
    }

    /**
     * Changes the specified watch expression.
     *
     * @param watchExpressionId
     *            the id of the watch expression to change
     * @param expression
     *            the new expression
     * @param scopes
     *            a list of scopes for the new watch expression
     * @throws DIbuggerLogicException
     * @see DebugLogicFacade#changeWatchExpression(int, String, List)
     */
    public void changeWatchExpression(int watchExpressionId, String expression, List<ScopeTuple> scopes)
            throws DIbuggerLogicException {
        debugLogicFacade.changeWatchExpression(watchExpressionId, expression, scopes);
    }

    /**
     * Deletes the specified watch expression.
     *
     * @param watchExpressionId
     *            the id of the watch expression
     * @see DebugLogicFacade#deleteWatchExpression(int)
     */
    public void deleteWatchExpression(int watchExpressionId) {
        debugLogicFacade.deleteWatchExpression(watchExpressionId);
    }

    /**
     * Creates a new conditional breakpoint.
     *
     * @param breakPointId
     *            the id of the breakpoint
     * @param condition
     *            the condition of the breakpoint
     * @throws DIbuggerLogicException
     *             in case the Cond Breakpoint cannot be created
     * @see DebugLogicFacade#createCondBreakpoint(int, String)
     */
    public void createConditionalBreakpoint(int breakPointId, String condition) throws DIbuggerLogicException {
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
    public Map<String, Integer> getConditionalBreakpointScopeBeginnings(int expressionId) {
        List<Integer> l = debugLogicFacade.getCBScopeBegin(expressionId);
        Map<String, Integer> m = new HashMap<String, Integer>();
        for (int i = 0; i < l.size(); ++i) {
            m.put(inverseMapping(programIds, i), l.get(i));
        }
        return m;
    }

    /**
     * Getter for the Scope ends of a given conditional breakpoint.
     *
     * @param expressionId
     *            the id of the expression
     * @return a List containing all Scope ends of given conditional breakpoint
     */
    public Map<String, Integer> getConditionalBreakpointScopeEnds(int expressionId) {
        List<Integer> l = debugLogicFacade.getCBScopeEnd(expressionId);
        Map<String, Integer> m = new HashMap<String, Integer>();
        for (int i = 0; i < l.size(); ++i) {
            m.put(inverseMapping(programIds, i), l.get(i));
        }
        return m;
    }

    void createConditionalBreakpoints(List<String> conditions) throws DIbuggerLogicException {
        int breakpointId = 0;
        for (String condition : conditions) {
            createConditionalBreakpoint(breakpointId, condition);
            breakpointId++;
        }
    }

    /**
     * Changes the specified conditional breakpoint.
     *
     * @param breakPointId
     *            the id of the breakpoint to change
     * @param condition
     *            the condition of the breakpoint
     * @param scopes
     *            a list of all scopes
     * @throws DIbuggerLogicException
     *             in case the Cond Breakpoint cannot be changed
     * @see DebugLogicFacade#changeCondBreakpoint(int, String, List)
     */
    public void changeConditionalBreakpoint(int breakPointId, String condition, List<ScopeTuple> scopes)
            throws DIbuggerLogicException {
        debugLogicFacade.changeCondBreakpoint(breakPointId, condition, scopes);
    }

    /**
     * Deletes specified breakpoint.
     *
     * @param conditionalBreakPointId
     *            the id of the breakpoint
     * @see DebugLogicFacade#deleteCondBreakpoint(int)
     */
    public void deleteConditionalBreakpoint(int conditionalBreakPointId) {
        debugLogicFacade.deleteCondBreakpoint(conditionalBreakPointId);
    }

    // /**
    // * Creates a breakpoint at given line in all programs known to DIbugger.
    // *
    // * @param line the line to create a breakpoint at
    // */
    // public void createSynchronousBreakpoint(int line) {
    // int numberOfPrograms = getNumberOfPrograms();
    // for (int i = 0; i < numberOfPrograms; i++) {
    // createBreakpoint(i, line);
    // }
    // }

    /**
     * Creates a new breakpoint at given line of specified program.
     *
     * @param programNameId
     *            the program's number
     * @param line
     *            the line to create a breakpoint at
     * @see DebugLogicFacade#createBreakpoint(int, int)
     */
    public void createBreakpoint(String programNameId, int line) {
        if (isKnownId(programNameId)) {
            int programId = programIds.get(programNameId);
            debugLogicFacade.createBreakpoint(programId, line);
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
     * @param programNameId
     *            the number of program to delete a breakpoint of
     * @param line
     *            the line number referring to the breakpoint
     * @see DebugLogicFacade#deleteBreakpoint(int, int)
     */
    public void deleteBreakpoint(String programNameId, int line) {
        if (isKnownId(programNameId)) {
            int programId = programIds.get(programNameId);
            debugLogicFacade.deleteBreakpoint(programId, line);
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
     * text and identifier. For each program, its assignments of input variables
     * is expected to a {@code String} of this kind: "a = 10;b = "bridge"",
     * where "a" and "b" are input variables.
     *
     * @param inputTexts
     *            a list containing each program's input variable-assignments
     * @param programTexts
     *            a list containing each program's text
     * @param programIdentifiers
     *            a list of containing each program's identifier
     */
    public void saveText(List<String> inputTexts, List<String> programTexts, List<String> programIdentifiers) {
        inputBuffer.storeTextInput(inputTexts, programTexts, programIdentifiers);
        debugLogicFacade.syncProgramInput(getProgramInput());
        for (int i = 0; i < programIdentifiers.size(); ++i) {
            putId(programIdentifiers.get(i), i);
        }
    }

    /**
     * Switches DIbugger's mode to debug-mode. Input of user stored in this
     * Controlfacade will be sent to package
     * {@code dibugger.debuglogic.debugger}.
     *
     * @throws DIbuggerLogicException
     *             in case the debug mode cannot be started
     * @see DebugLogicFacade#launchRun(List)
     */
    public void startDebug() throws DIbuggerLogicException {
        debugLogicFacade.launchRun(getProgramInput());
    }

    /**
     * Might perform steps related to DIbugger's model component, if necessary
     * to stop process of debugging.
     */
    public void stopDebug() {
        /*  */
    	debugLogicFacade.endRun();
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
     * @param maximum
     *            the new maximum
     * @see DebugLogicFacade#setMaximumIterations(int)
     */
    public void setMaximumIterations(int maximum) {
        debugLogicFacade.setMaximumIterations(maximum);
    }

    /**
     * Sets the upper limit of function calls allowed when executing a program.
     *
     * @param maximum
     *            the new maximum
     * @see DebugLogicFacade#setMaximumFunctionCalls(int)
     */
    public void setMaximumFunctionCalls(int maximum) {
        debugLogicFacade.setMaximumFunctionCalls(maximum);
    }

    /**
     * Suggest a stepsize for all programs.
     *
     * @see DebugLogicFacade#suggestStepSize(List)
     */
    public void suggestStepSize() {
        List<ProgramInput> currentInput = getProgramInput();
        List<String> programTexts = new ArrayList<>();

        currentInput.stream().map(ProgramInput::getText).forEach(programTexts::add);
        debugLogicFacade.suggestStepSize(programTexts);
    }

    /**
     * Suggests a watch expression.
     *
     * @return String representing the expression
     * @see DebugLogicFacade#suggestWatchExpression()
     */
    public String suggestWatchExpression() {
        return debugLogicFacade.suggestWatchExpression();
    }

    /**
     * Suggests a conditional breakpoint.
     *
     * @return String representing the condition
     * @see DebugLogicFacade#suggestConditionalBreakpoint()
     */
    public String suggestConditionalBreakpoint() {
        return debugLogicFacade.suggestConditionalBreakpoint();
    }

    /**
     * Suggests an InputValue for a given variable in a given range.
     *
     * @param inputVariableId
     *            the variable's name
     * @param range
     *            the range containing the value to suggest
     * @param type
     *            the type of the variable
     * @return String representing the suggestion value
     * @see DebugLogicFacade#suggestInputValue(String, String, int)
     */
    public String suggestInputValue(String inputVariableId, String range, int type) throws DIbuggerLogicException {
        return debugLogicFacade.suggestInputValue(inputVariableId, range, type);
    }

    /**
     * Select a strategy to be used to suggest step sizes.
     *
     * @param stepSizeStrategyId
     *            the strategy id to select
     * @see DebugLogicFacade#selectStepSizeStrategy(int)
     */
    public void selectStepSizeStrategy(String stepSizeStrategyId) {
        debugLogicFacade.selectStepSizeStrategy(stepSizeStrategyId);
    }

    /**
     * Select a strategy to be used to suggest realtional expressions.
     *
     * @param expressionStrategyId
     *            the strategy id to select
     * @see DebugLogicFacade#selectRelationalStrategy(int)
     */
    public void selectRelationalExpressionStrategy(String expressionStrategyId) {
        debugLogicFacade.selectRelationalStrategy(expressionStrategyId);
    }

    /**
     * Select a strategy to be used to suggest input values.
     *
     * @param inputValueStrategyId
     *            the strategy id to select
     * @see DebugLogicFacade#selectInputValueStrategy(int)
     */
    public void selectInputValueStrategy(String inputValueStrategyId) {
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

    /**
     * Returns all available strategies for RelationalExpressionSuggestions.
     *
     * @return all available strategies for RelationalExpressionSuggestions
     */
    public List<String> getRelationalExpressionSuggestionStrategies() {
        return debugLogicFacade.getRelationalExpressionSuggestionStrategies();
    }

    /**
     * Returns all available strategies for StepSizeSuggestions.
     *
     * @return all available strategies for StepSizeSuggestions
     */
    public List<String> getStepSizeSuggestionStrategies() {
        return debugLogicFacade.getStepSizeSuggestionStrategies();
    }

    /**
     * Returns all available strategies for InputValueSuggestions.
     *
     * @return all available strategies for InputValueSuggestions
     */
    public List<String> getInputValueSuggestionStrategies() {
        return debugLogicFacade.getInputValueSuggestionStrategies();
    }

    private String inverseMapping(Map<String, Integer> map, int value) {
        for (String key : map.keySet()) {
            if (map.get(key) == value) {
                return key;
            }
        }
        return "";
    }
}
