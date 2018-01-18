package dibugger.control;

import java.io.File;
import java.util.List;
import java.util.Objects;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debugLogic.interpreter.ScopeTuple;
import dibugger.filehandler.exceptions.FileHandlerException;
import dibugger.filehandler.facade.ConfigurationFile;
import dibugger.userinterface.GUIFacade;

public class ControlFacade {
    private boolean isInDebugMode;
    
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
    
    
    boolean isInDebugMode() {
        return isInDebugMode();
    }
    
    private void enableDebugMode() {
        isInDebugMode = true;
    }
    
    private void disableDebugMode() {
        isInDebugMode = false;
    }
    
    private void ensureInDebugMode() {
        if (!isInDebugMode()) {
            throw new IllegalStateException();
        }
    }
    
    private void ensureNotInDebugMode() {
        if (isInDebugMode()) {
            throw new IllegalStateException();
        }
    }
    

    public void setStepSize(int programId, int size) {
        debugLogicController.setStepSize(programId, size);
    }
    
    public void step(int type) {
        ensureInDebugMode();
        try {
            debugLogicController.step(type);
        } catch (DIbuggerLogicException exception) {
            exceptionHandler.handle(exception);
        }
    }
    
    public void continueDebug() {
        ensureInDebugMode();
        try {
            debugLogicController.continueDebug();
        } catch (DIbuggerLogicException exception) {
            exceptionHandler.handle(exception);
        }        
    }
    
    public void singleStep(int programId) {
        ensureInDebugMode();
        debugLogicController.singleStep(programId);        
    }
    
    public void stepBack() {
        ensureInDebugMode();
        try {
            debugLogicController.stepBack();
        } catch (DIbuggerLogicException exception) {
            exceptionHandler.handle(exception);
        }          
    }

    public void createWatchExpression(int watchExpressionId, String expression) {
        debugLogicController.createWatchExpression(watchExpressionId, expression);      
    }
    
    public void changeWatchExpression(int watchExpressionId, 
            String expression, 
            List<ScopeTuple> scopes) {
        debugLogicController.changeWatchExpression(watchExpressionId, expression, scopes);       
    }
    
    public void deleteWatchExpression(int watchExpressionId) {
        debugLogicController.deleteWatchExpression(watchExpressionId);      
    }
    
    public void createConditionalBreakpoint(int breakPointId, String condition) {
        debugLogicController.createConditionalBreakpoint(breakPointId, condition);      
    }
    
    public void changeConditionalBreakpoint(int breakPointId, 
            String condition, 
            List<ScopeTuple> scopes) {
        debugLogicController.changeConditionalBreakpoint(breakPointId, condition, scopes);      
    }
    
    public void deleteConditionalBreakpoint(int conditionalBreakPointId) {
        debugLogicController.deleteConditionalBreakpoint(conditionalBreakPointId);     
    }

    public void createSynchronousBreakpoint(int line) {
        debugLogicController.createSynchronousBreakpoint(line);     
    }
    
    public void createBreakpoint(int programId, int line) {
        debugLogicController.createBreakpoint(programId, line);      
    }
    
    public void deleteBreakpoint(int programId, int line) {
        debugLogicController.deleteBreakpoint(programId, line);   
    }
    
    public void deleteAllBreakpoints() {
        debugLogicController.deleteAllBreakpoints();      
    }

    public void saveText(List<String> programTexts, List<String> inputVariables) {
        debugLogicController.saveText(programTexts, inputVariables);     
    }
    
    public void startDebug() {
        enableDebugMode();     
    }
    
    public void stopDebug() {
        disableDebugMode();     
    }
    
    public void reset() {
        debugLogicController.reset();       
    }

    public void loadConfiguration(File configurationFile) {
        ensureNotInDebugMode();
        
        ConfigurationFile configFile;
        
        try {
            configFile = fileHandlerInteractor.loadConfigurationFile(configurationFile);
            reset();
            
            fileHandlerInteractor.applyConfiguration(configFile);
        } catch (FileHandlerException exception) {
            exceptionHandler.handle(exception);
        }     
    }
    
    public void saveConfiguration(File configurationFile) {
        fileHandlerInteractor.saveConfiguration(configurationFile);       
    }
    
    public void loadProgramText(File file) {
        ensureNotInDebugMode();
        fileHandlerInteractor.loadProgramText(file);     
    }

    public List<String> getAvailableLanuages() {
        return fileHandlerInteractor.getAvailableLanuages();    
    }

    
    public void setMaximumIterations(int maximum) {
        debugLogicController.setMaximumIterations(maximum);    
    }
    
    public void setMaximumFunctionCalls(int maximum) {
        debugLogicController.setMaximumFunctionCalls(maximum);      
    }

    public String suggestStepSize() {
        return debugLogicController.suggestStepSize();      
    }
    
    public String suggestWatchExpression() {
        return debugLogicController.suggestWatchExpression();      
    }
    
    public String suggestConditionalBreakpoint() {
        return debugLogicController.suggestConditionalBreakpoint();      
    }
    
    public String suggestInputValue(String inputVariableId, String range, int type) {
        return debugLogicController.suggestInputValue(inputVariableId, range, type);     
    }
    

    public void selectStepSizeStrategy(int stepSizeStrategyId) {
        debugLogicController.selectStepSizeStrategy(stepSizeStrategyId);     
    }
    
    public void selectRelationalExpressionStrategy(int expressionStrategyId) {
        debugLogicController.selectRelationalExpressionStrategy(expressionStrategyId);     
    }
    
    public void selectInputValueStrategy(int inputValueStrategyId) {
        debugLogicController.selectInputValueStrategy(inputValueStrategyId);      
    }
    
    
    public void changeLanguage(String languageId) {
        fileHandlerInteractor.changeLanguage(languageId);      
    }
}
