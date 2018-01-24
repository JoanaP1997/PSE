package dibugger.control;

import static dibugger.debuglogic.debugger.DebugControl.STEP_BACK;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import dibugger.debuglogic.debugger.Breakpoint;
import dibugger.debuglogic.debugger.DebugLogicFacade;
import dibugger.debuglogic.debugger.ProgramInput;
import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.interpreter.ScopeTuple;
import dibugger.userinterface.GUIFacade;

public class DebugLogicController {
    private DebugLogicFacade debugLogicFacade;

    private TextInputBuffer inputBuffer;

    public DebugLogicController() {
        debugLogicFacade = new DebugLogicFacade();
        inputBuffer = new TextInputBuffer();
    }

    public void attachToModel(GUIFacade guiFacade) {
        debugLogicFacade.addObserver(guiFacade);
    }

    public List<Integer> getBreakpoints(int programNumber) {
        return debugLogicFacade.getBreakpoints(programNumber);
    }

    public List<String> getConditionalBreakpoints() {
        return debugLogicFacade.getConditionalBreakpoints();
    }

    /*TODO private, public, protected???
    */
    public int getNumberOfBufferedPrograms() {
        return inputBuffer.getNumberOfPrograms();
    }

    public int getNumberOfPrograms() {
        return debugLogicFacade.getNumPrograms();
    }

    public int getStepSize(int programNumber) {
        return debugLogicFacade.getStepSize(programNumber);
    }
    //END TODO
    
    public List<ProgramInput> getProgramInput() {
        return inputBuffer.getProgramInput();
    }

    public void setStepSize(int numberOfProgram, int size) {
        debugLogicFacade.setStepSize(numberOfProgram, size);
    }

    public void step(int type) throws DIbuggerLogicException {
        debugLogicFacade.step(type);
    }

    public void continueDebug() throws DIbuggerLogicException {
        debugLogicFacade.continueDebug();
    }

    public void singleStep(int numberOfProgram) {
        debugLogicFacade.singleStep(numberOfProgram);
    }

    public void stepBack() throws DIbuggerLogicException {
        step(STEP_BACK);
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

    public void createWatchExpression(int watchExpressionId, String expression) {
        debugLogicFacade.createWatchExpression(watchExpressionId, expression);
    }

    public void createWatchExpressions(Collection<String> expressions) {
        int watchExpressionId = 0;
        for (String expression : expressions) {
            createWatchExpression(watchExpressionId, expression);
            watchExpressionId++;
        }
    }

    public void changeWatchExpression(int watchExpressionId, String expression, List<ScopeTuple> scopes) {
        debugLogicFacade.changeWatchExpression(watchExpressionId, expression, scopes);
    }

    public void deleteWatchExpression(int watchExpressionId) {
        debugLogicFacade.deleteWatchExpression(watchExpressionId);
    }

    public void createConditionalBreakpoint(int breakPointId, String condition) {
        debugLogicFacade.createCondBreakpoint(breakPointId, condition);
    }

    public List<Integer> getConditionalBreakpointScopeBeginnings(int expressionId) {
        return debugLogicFacade.getCBScopeBegin(expressionId);
    }

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

    public void changeConditionalBreakpoint(int breakPointId, String condition, List<ScopeTuple> scopes) {
        debugLogicFacade.changeCondBreakpoint(breakPointId, condition, scopes);
    }

    public void deleteConditionalBreakpoint(int conditionalBreakPointId) {
        debugLogicFacade.deleteCondBreakpoint(conditionalBreakPointId);
    }

    public void createSynchronousBreakpoint(int line) {
        int numberOfPrograms = getNumberOfPrograms();
        for (int i = 0; i < numberOfPrograms; i++) {
            createBreakpoint(i, line);
        }
    }

    public void createBreakpoint(int numberOfProgram, int line) {
        debugLogicFacade.createBreakpoint(numberOfProgram, line);
    }

    public void createBreakpoints(int numberOfProgram, List<Integer> lines) {
        for (int line : lines) {
            createBreakpoint(numberOfProgram, line);
        }
    }

    public void deleteBreakpoint(int numberOfProgram, int line) {
        debugLogicFacade.deleteBreakpoint(numberOfProgram, line);
    }

    public void deleteAllBreakpoints() {
        debugLogicFacade.deleteAllBreakpoints();
    }

    public void saveText(List<String> inputVariables, List<String> programTexts, List<String> programIdentifiers) {
        inputBuffer.storeTextInput(inputVariables, programTexts, programIdentifiers);
    }

    public void startDebug() {
        debugLogicFacade.launchRun(getProgramInput());
    }

    public void stopDebug() {
        /*  */
    }

    public void reset() {
        debugLogicFacade.reset();
    }

    public void setMaximumIterations(int maximum) {
        debugLogicFacade.setMaximumIterations(maximum);
    }

    public void setMaximumFunctionCalls(int maximum) {
        debugLogicFacade.setMaximumFunctionCalls(maximum);
    }

    public void suggestStepSize() {
        List<ProgramInput> currentInput = getProgramInput();
        List<String> programTexts = new ArrayList<>();

        // programTexts containing null-objects is unlikely
        currentInput.stream().map(programInput -> programInput.getText()).forEach(text -> programTexts.add(text));
        debugLogicFacade.suggestStepSize(programTexts);
    }

    public String suggestWatchExpression(List<String> programText) {
        return debugLogicFacade.suggestWatchExpression(programText);
    }

    public String suggestConditionalBreakpoint(List<String> programText) {
        return debugLogicFacade.suggestConditionalBreakpoint(programText);
    }

    public String suggestInputValue(String inputVariableId, String range, int type) {
        return debugLogicFacade.suggestInputValue(inputVariableId, range, type);
    }

    public void selectStepSizeStrategy(int stepSizeStrategyId) {
        debugLogicFacade.selectStepSizeStrategy(stepSizeStrategyId);
    }

    public void selectRelationalExpressionStrategy(int expressionStrategyId) {
        debugLogicFacade.selectRelationalStrategy(expressionStrategyId);
    }

    public void selectInputValueStrategy(int inputValueStrategyId) {
        debugLogicFacade.selectInputValueStrategy(inputValueStrategyId);
    }

    public DebugLogicFacade getDebugLogicFacade() {
        return debugLogicFacade;
    }
}
