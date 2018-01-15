package dibugger.Control;

import java.io.File;
import java.util.List;
import java.util.Objects;

import dibugger.DebugLogic.Interpreter.ScopeTuple;
import dibugger.FileHandler.Exceptions.FileHandlerException;
import dibugger.UserInterface.GUIFacade;

public class ControlFacade {
    private DebugLogicController debugLogicController;
    private ExceptionHandler exceptionHandler;
    private FileHandlerInteractor fileHandlerInteractor;
    
    public ControlFacade(GUIFacade guiFacade) {
        Objects.requireNonNull(guiFacade);
        debugLogicController = new DebugLogicController(guiFacade);
        exceptionHandler = new ExceptionHandler(guiFacade);
        try {
            fileHandlerInteractor = new FileHandlerInteractor(guiFacade);
        } catch (FileHandlerException exception) {
            exceptionHandler.handle(exception);
        }
        exceptionHandler.setLanguageFile(fileHandlerInteractor.getLanguageFile());
    }
    
    

    public void setStepSize(int programId, int size) {
        throw new UnsupportedOperationException();
    }
    
    public void step(int type) {
        throw new UnsupportedOperationException();
    }
    
    public void continueDebug() {
        throw new UnsupportedOperationException();        
    }
    
    public void singleStep(int programId) {
        throw new UnsupportedOperationException();        
    }
    
    public void stepBack() {
        throw new UnsupportedOperationException();        
    }

    public void createWatchExpression(int watchExpressionId, String expression) {
        throw new UnsupportedOperationException();      
    }
    
    public void changeWatchExpression(int watchExpressionId, 
            String expression, 
            List<ScopeTuple> scope) {
        throw new UnsupportedOperationException();       
    }
    
    public void deleteWatchExpression(int watchExpressionId) {
        throw new UnsupportedOperationException();      
    }
    
    public void createConditionalBreakpoint(int breakPointId, String condition) {
        throw new UnsupportedOperationException();      
    }
    
    public void changeConditionalBreakpoint(int breakPointId, 
            String condition, 
            List<ScopeTuple> scope) {
        throw new UnsupportedOperationException();      
    }
    
    public void deleteConditionalBreakpoint(int conditionalBreakPointId) {
        throw new UnsupportedOperationException();     
    }

    public void createSynchronousBreakpoint(int line) {
        throw new UnsupportedOperationException();      
    }
    
    public void createBreakpoint(int programId, int line) {
        throw new UnsupportedOperationException();      
    }
    
    public void deleteBreakpoint(int programId, int line) {
        throw new UnsupportedOperationException();   
    }
    
    public void deleteAllBreakpoints() {
        throw new UnsupportedOperationException();       
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
        throw new UnsupportedOperationException();       
    }

    public void loadConfiguration(File configurationFile) {
        throw new UnsupportedOperationException();      
    }
    
    public void saveConfiguration(File configurationFile) {
        throw new UnsupportedOperationException();       
    }
    
    public void loadProgramText(File file) {
        throw new UnsupportedOperationException();      
    }

    public List<String> getAvailableLanuages() {
        throw new UnsupportedOperationException();     
    }

    
    public void setMaximumIterations(int maximum) {
        throw new UnsupportedOperationException();    
    }
    
    public void setMaximumFunctionCalls(int maximum) {
        throw new UnsupportedOperationException();      
    }

    public String suggestStepSize() {
        throw new UnsupportedOperationException();      
    }
    
    public String suggestWatchExpression() {
        throw new UnsupportedOperationException();       
    }
    
    public String suggestConditionalBreakpoint() {
        throw new UnsupportedOperationException();      
    }
    
    //  Name "inputVariableId" überprüfen
    public String suggestInputValue(String inputVariableId, String range, int type) {
        throw new UnsupportedOperationException();     
    }
    

    public void selectStepSizeStrategy(int stepSizeStrategyId) {
        throw new UnsupportedOperationException();     
    }
    
    public void selectRelationalExpressionStrategy(int expressionStrategyId) {
        throw new UnsupportedOperationException();     
    }
    
    public void selectInputValueStrategy(int inputValueStrategyId) {
        throw new UnsupportedOperationException();       
    }
    

    public void changeLanguage(String languageId) {
        throw new UnsupportedOperationException();      
    }
}
