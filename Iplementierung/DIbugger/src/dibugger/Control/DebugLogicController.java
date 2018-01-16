package dibugger.Control;

import static dibugger.DebugLogic.Debugger.DebugControl.STEP_BACK;

import java.util.List;

import dibugger.DebugLogic.Debugger.DebugLogicFacade;
import dibugger.DebugLogic.Exceptions.DIbuggerLogicException;
import dibugger.DebugLogic.Interpreter.ScopeTuple;
import dibugger.UserInterface.GUIFacade;

public class DebugLogicController {
    private DebugLogicFacade debugLogicFacade;
    
    public DebugLogicController() {
        debugLogicFacade = new DebugLogicFacade();
    }
    
    public DebugLogicController(GUIFacade guiFacade) {
        this();
//        debugLogicFacade.addObserver(guiFacade);
    }
    
    
    public void setStepSize(int programId, int size) {
        debugLogicFacade.setStepSize(programId, size);
    }
    
    public void step(int type) throws DIbuggerLogicException {
        debugLogicFacade.step(type);
    }
    
    public void continueDebug() throws DIbuggerLogicException {
        debugLogicFacade.continueDebug();
    }
    
    public void singleStep(int programId) {
        debugLogicFacade.singleStep(programId);
    }
    
    public void stepBack() throws DIbuggerLogicException {
        step(STEP_BACK);        
    }
    

    public void createWatchExpression(int watchExpressionId, String expression) {
        debugLogicFacade.createWatchExpression(watchExpressionId, expression);      
    }
    
    public void changeWatchExpression(int watchExpressionId, 
            String expression, 
            List<ScopeTuple> scopes) {
        debugLogicFacade.changeWatchExpression(watchExpressionId, expression, scopes);       
    }
    
    public void deleteWatchExpression(int watchExpressionId) {
        debugLogicFacade.deleteWatchExpression(watchExpressionId);      
    }
    
    
    public void createConditionalBreakpoint(int breakPointId, String condition) {
        debugLogicFacade.createCondBreakpoint(breakPointId, condition);      
    }
    
    public void changeConditionalBreakpoint(int breakPointId, 
            String condition, 
            List<ScopeTuple> scopes) {
        debugLogicFacade.changeCondBreakpoint(breakPointId, condition, scopes); 
    }
    
    public void deleteConditionalBreakpoint(int conditionalBreakPointId) {
        debugLogicFacade.deleteCondBreakpoint(conditionalBreakPointId);     
    }
    

    public void createSynchronousBreakpoint(int line) {
        throw new UnsupportedOperationException();      
    }
    
    public void createBreakpoint(int programId, int line) {
        debugLogicFacade.createBreakpoint(programId, line);      
    }
    
    public void deleteBreakpoint(int programId, int line) {
        debugLogicFacade.deleteBreakpoint(programId, line);  
    }
    
    public void deleteAllBreakpoints() {
        debugLogicFacade.deleteAllBreakpoints();       
    }
    

    public void saveText(List<String> programTexts, List<String> inputVariables) {
        throw new UnsupportedOperationException();     
    }
    
    public void startDebug() {
        throw new UnsupportedOperationException();     
    }
    
    public void stopDebug() {
        throw new UnsupportedOperationException(); 
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
    

    public String suggestStepSize() {
        throw new UnsupportedOperationException();      
    }
    
    public String suggestWatchExpression() {
        return debugLogicFacade.suggestWatchExpression();      
    }
    
    public String suggestConditionalBreakpoint() {
        return debugLogicFacade.suggestConditionalBreakpoint();      
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
}
