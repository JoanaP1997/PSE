package dibugger.control;

import java.io.File;
import java.util.List;
import java.util.Objects;

import dibugger.debuglogic.debugger.DebugLogicFacade;
import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.interpreter.ScopeTuple;
import dibugger.filehandler.exceptions.FileHandlerException;
import dibugger.filehandler.exceptions.LanguageNotFoundException;
import dibugger.userinterface.GUIFacade;

/**
 *  Provides an interface for this package's functionality.
 */
public class ControlFacade {
    private boolean isInDebugMode;

    private DebugLogicController debugLogicController;
    private ExceptionHandler exceptionHandler;
    private FileHandlerInteractor fileHandlerInteractor;

    /**
     * Creates a new ControlFacade object.
     * Change in presentation of DIbugger's model component will be triggered
     * by given GUIFacade.
     * 
     * @param guiFacade a UI-facade of DIbugger
     */
    public ControlFacade(GUIFacade guiFacade) {
        disableDebugMode();
        Objects.requireNonNull(guiFacade);
        debugLogicController = new DebugLogicController();
        debugLogicController.attachToModel(guiFacade);
        try {
            fileHandlerInteractor = new FileHandlerInteractor(debugLogicController, guiFacade);
        } catch (FileHandlerException exception) {
            System.exit(0);
        }
        exceptionHandler = new ExceptionHandler(fileHandlerInteractor, guiFacade);
    }

    boolean isInDebugMode() {
        return isInDebugMode;
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

    /**
     * Sets the stepsize of a program
     * 
     * @param numberOfProgram
     *            the number of program to change the stepsize of
     * @param size
     *            the new stepsize to use while debugging
     * @see DebugLogicController#setStepSize(int, int)
     */ //TODO: javadoc
    public void setStepSize(String programId, String size) {
        debugLogicController.setStepSize(programId, size);
    }

    /**
     * Executes a step defined by a given step type.
     * 
     * @param type
     *            the type of the step
     * @see DebugLogicController#step(int)
     */
    public void step(int type) {
        ensureInDebugMode();
        try {
            debugLogicController.step(type);
        } catch (DIbuggerLogicException exception) {
            exceptionHandler.handle(exception);
        }
    }

    /**
     * Continues Debugging / Stepping in all programs until a Breakpoint or
     * Conditional Breakpoint is reached.
     * 
     * @see DebugLogicController#continueDebug()
     */
    public void continueDebug() {
        ensureInDebugMode();
        try {
            debugLogicController.continueDebug();
        } catch (DIbuggerLogicException exception) {
            exceptionHandler.handle(exception);
        }
    }

    /**
     * Executes a normal step of size 1 in a given program
     * 
     * @param programNameId
     *            the id of program to do a step in
     * @see DebugLogicController#singleStep(String)
     */
    public void singleStep(String programNameId) {
        ensureInDebugMode();
        debugLogicController.singleStep(programNameId);
    }

    /**
     * Creates a new watch expression.
     * 
     * @param id
     *            the id of the watch expression
     * @param expr
     *            the expression of the watch expression
     * @see DebugLogicController#createWatchExpression(int, String)
     */
    public void createWatchExpression(int watchExpressionId, String expression) {
        try {
			debugLogicController.createWatchExpression(watchExpressionId, expression);
		} catch (DIbuggerLogicException e) {
			exceptionHandler.handle(e);
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
     * @see DebugLogicController#changeWatchExpression(int, String, List)
     */
    public void changeWatchExpression(int watchExpressionId, String expression, List<ScopeTuple> scopes) {
        try {
			debugLogicController.changeWatchExpression(watchExpressionId, expression, scopes);
		} catch (DIbuggerLogicException e) {
			exceptionHandler.handle(e);
		}
    }

    /**
     * Deletes the specified watch expression.
     * 
     * @param id
     *            the id of the watch expression
     * @see DebugLogicController#deleteWatchExpression(int)
     */
    public void deleteWatchExpression(int watchExpressionId) {
        debugLogicController.deleteWatchExpression(watchExpressionId);
    }

    /**
     * Creates a new conditional breakpoint.
     * 
     * @param breakPointId
     *            the id of the breakpoint
     * @param condition
     *            the condition of the breakpoint
     * @see DebugLogicController#createConditionalBreakpoint(int, String)            
     */
    public void createConditionalBreakpoint(int breakPointId, String condition) {
        try {
			debugLogicController.createConditionalBreakpoint(breakPointId, condition);
		} catch (DIbuggerLogicException e) {
			exceptionHandler.handle(e);
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
     * @see DebugLogicController#changeConditionalBreakpoint(int, String, List)
     */
    public void changeConditionalBreakpoint(int breakPointId, String condition, List<ScopeTuple> scopes) {
        try {
			debugLogicController.changeConditionalBreakpoint(breakPointId, condition, scopes);
		} catch (DIbuggerLogicException e) {
			exceptionHandler.handle(e);
		}
    }

    /**
     * Deletes specified breakpoint.
     * 
     * @param id
     *            the id of the breakpoint
     * @see DebugLogicController#deleteConditionalBreakpoint(int)
     */
    public void deleteConditionalBreakpoint(int conditionalBreakPointId) {
        debugLogicController.deleteConditionalBreakpoint(conditionalBreakPointId);
    }

//    /**
//     * Creates a breakpoint at given line in all programs known to DIbugger.
//     * 
//     * @param line the line to create a breakpoint at
//     * @see DebugLogicController#createSynchronousBreakpoint(int) 
//     */
//    public void createSynchronousBreakpoint(int line) {
//        debugLogicController.createSynchronousBreakpoint(line);
//    }

    /**
     * Creates a new breakpoint at given line of specified program.
     * 
     * @param programNameId
     *            the program's id
     * @param line
     *            the line to create a breakpoint at
     * @see DebugLogicController#createBreakpoint(int, int)
     */
    public void createBreakpoint(String programNameID, int line) {
        debugLogicController.createBreakpoint(programNameID, line);
    }

    /**
     * Deletes a breakpoint at given line of specified program.
     * 
     * @param programNameId
     *            the id of program to delete a breakpoint of
     * @param line
     *            the line number referring to the breakpoint
     * @see DebugLogicController#deleteBreakpoint(String, int)
     */
    public void deleteBreakpoint(String programNameID, int line) {
        debugLogicController.deleteBreakpoint(programNameID, line);
    }

    /**
     * Deletes all breakpoints in all programs.
     * 
     * @see DebugLogicController#deleteAllBreakpoints()
     */
    public void deleteAllBreakpoints() {
        debugLogicController.deleteAllBreakpoints();
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
     * @see DebugLogicController#saveText(List, List, List)
     */
    public void saveText(List<String> inputTexts, List<String> programTexts, List<String> programIdentifiers) {
        /*
         * Notiz: Prüfen ob Beispiel im Kommentar oben stimmt.
         */
        debugLogicController.saveText(inputTexts, programTexts, programIdentifiers);
    }

    /**
     * Switches DIbugger's mode to debug-mode. Input of user stored in this
     * Controlfacade via {@link saveText(List, List, List)} will be sent to package
     * {@code dibugger.debuglogic.debugger}.
     * 
     * @see DebugLogicController#startDebug()
     */
    public void startDebug() {
        enableDebugMode();
        try {
			debugLogicController.startDebug();
		} catch (DIbuggerLogicException exception) {
			exceptionHandler.handle(exception);
		}      
    }

    /**
     * Switches DIbugger's mode to edit-mode.
     * 
     * @see DebugLogicController#stopDebug()
     */
    public void stopDebug() {
        disableDebugMode();
        debugLogicController.stopDebug();
    }

    /**
     * Partially resets state of DIbugger's model component.
     * 
     * @see DebugLogicController#reset()
     */
    public void reset() {
        debugLogicController.reset();
    }

    /**
     * Creates a {@code ConfigurationFile} using given {@code File} and
     * attempts to restore a debugging-session by altering DIbugger's
     * model- and presentation-component.
     * 
     * @param configurationFile the {@code File} to load
     * @see FileHandlerInteractor#loadConfigurationFile(File)
     */
    public void loadConfiguration(File configurationFile) {
        ensureNotInDebugMode();

        try {
            fileHandlerInteractor.loadConfigurationFile(configurationFile);
        } catch (FileHandlerException exception) {
            exceptionHandler.handle(exception);
        } catch (DIbuggerLogicException e) {
			exceptionHandler.handle(e);
		}
    }

    /**
     * Saves some of Dibugger's model- and presentation-component's state
     * to a specified {@code File}.
     * 
     * @param configurationFile a {@code File} to save DIbugger's state to
     * @see FileHandlerInteractor#saveConfiguration(File)
     */
    public void saveConfiguration(File configurationFile) {
        fileHandlerInteractor.saveConfiguration(configurationFile);
    }

    /**
     * Prompts this' GUIFacade to display a specified program's text.
     * 
     * @param file the file containing the text
     * @return the text contained in file
     * @see FileHandlerInteractor#loadProgramText(File)
     */
    public String loadProgramText(File file) {
        ensureNotInDebugMode();
        return fileHandlerInteractor.loadProgramText(file);
    }

    /**
     * Returns a list containing all languages available for use by this'
     * GUIFacade.
     * 
     * @return a list containing all languages available
     * @see FileHandlerInteractor#getAvailableLanuages()
     */
    public List<String> getAvailableLanuages() {
        return fileHandlerInteractor.getAvailableLanuages();
    }

    /**
     * Sets the maximum-iteration-count (example: while loop).
     * 
     * @param count
     *            the new maximum
     * @see DebugLogicController#setMaximumIterations(int)
     */
    public void setMaximumIterations(int maximum) {
        debugLogicController.setMaximumIterations(maximum);
    }

    /**
     * Sets the upper limit of function calls allowed when executing
     * a program.
     * 
     * @param count
     *            the new maximum
     * @see DebugLogicController#setMaximumFunctionCalls(int)
     */
    public void setMaximumFunctionCalls(int maximum) {
        debugLogicController.setMaximumFunctionCalls(maximum);
    }

    /**
     * Suggest a stepsize for all programs.
     * 
     * @see DebugLogicController#suggestStepSize()
     */
    public void suggestStepSize() {
        debugLogicController.suggestStepSize();
    }

    /**
     * Suggests a watch expression.
     * 
     * @return String representing the expression
     * @see DebugLogicController#suggestWatchExpression()
     */
    public String suggestWatchExpression() {
        return debugLogicController.suggestWatchExpression();
    }

    /**
     * Suggests a conditional breakpoint.
     * 
     * @return String representing the condition
     * @see DebugLogicController#suggestConditionalBreakpoint()
     */
    public String suggestConditionalBreakpoint() {
        return debugLogicController.suggestConditionalBreakpoint();
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
     * @see DebugLogicController#suggestInputValue(String, String, int)
     */
    public String suggestInputValue(String inputVariableId, String range, int type) {
        return debugLogicController.suggestInputValue(inputVariableId, range, type);
    }

    /**
     * Select a strategy to be used to suggest step sizes.
     * 
     * @param id
     *            the strategy id to select
     * @see DebugLogicController#selectStepSizeStrategy(int)
     */
    public void selectStepSizeStrategy(int stepSizeStrategyId) {
        debugLogicController.selectStepSizeStrategy(stepSizeStrategyId);
    }

    /**
     * Select a strategy to be used to suggest realtional expressions
     * 
     * @param id
     *            the strategy id to select
     * @see DebugLogicController#selectRelationalExpressionStrategy(int)
     */
    public void selectRelationalExpressionStrategy(int expressionStrategyId) {
        debugLogicController.selectRelationalExpressionStrategy(expressionStrategyId);
    }

    /**
     * Select a strategy to be used to suggest input values
     * 
     * @param id
     *            the strategy id to select
     * @see DebugLogicController#selectInputValueStrategy(int)
     */
    public void selectInputValueStrategy(int inputValueStrategyId) {
        debugLogicController.selectInputValueStrategy(inputValueStrategyId);
    }

    /**
     * Changes the language in which information is shown by
     * this' GUIFacade.
     * 
     * @param languageId the id specifying the language
     * @see FileHandlerInteractor#changeLanguage(String)
     */
    public void changeLanguage(String languageId) {
        try {
            fileHandlerInteractor.changeLanguage(languageId);
        } catch (LanguageNotFoundException exception) {
            exceptionHandler.handle(exception);
        }
    }

    /**
     * Returns the DebugLogicFacade known to this ControlFacade.
     * 
     * @return the DebugLogicFacade known to this
     */
    public DebugLogicFacade getDebugLogicFacade() {
        return debugLogicController.getDebugLogicFacade();
    }
}
