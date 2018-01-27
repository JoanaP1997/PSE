package dibugger.control;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Observable;

import dibugger.debuglogic.debugger.ProgramInput;
import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.filehandler.exceptions.FileHandlerException;
import dibugger.filehandler.exceptions.LanguageNotFoundException;
import dibugger.filehandler.facade.ConfigurationFile;
import dibugger.filehandler.facade.FileHandlerFacade;
import dibugger.filehandler.facade.LanguageFile;
import dibugger.filehandler.facade.PropertiesFile;
import dibugger.userinterface.GUIFacade;

/**
 *  {@code FileHandlerInteractor} is responsible for saving and
 *  loading DIbugger-configurations, managing UI's (user -)
 *  language and more.
 */
public class FileHandlerInteractor extends Observable {
    private FileHandlerFacade fileHandlerFacade;
    private GUIFacade guiFacade;

    private DebugLogicController debugLogicController;

    private LanguageFile languageFile;
    private PropertiesFile propertiesFile;

    /**
     * Creates a new {@code FileHandlerInteractor} with specified arguments. 
     * 
     * @param debugLogicController a {@code DebugLogicController} used to alter DIbugger-model
     * @param guiFacade a facade to presentation-component of DIbugger
     * @throws FileHandlerException
     */
    public FileHandlerInteractor(DebugLogicController debugLogicController, GUIFacade guiFacade)
            throws FileHandlerException {
        Objects.requireNonNull(guiFacade);
        this.guiFacade = guiFacade;

        Objects.requireNonNull(debugLogicController);
        this.debugLogicController = debugLogicController;

        // throws FileHandlerException
        fileHandlerFacade = new FileHandlerFacade();

        propertiesFile = fileHandlerFacade.loadPropertiesFile();

        // throws LanuageNotFoundException
        changeLanguage(propertiesFile.getSelectedLanguage());
    }

    /**
     * Returns the {@code LanguageFile} managed by this 
     * {@code FileHandlerInteractor}.
     * 
     * @return this {@code FileHandlerInteractor}s language file
     */
    public LanguageFile getLanguageFile() {
        return languageFile;
    }

    private void setLanguageFile(LanguageFile languageFile) {
        Objects.requireNonNull(languageFile);
        this.languageFile = languageFile;
        this.notifyObservers();
    }

    /**
     * Creates a {@code ConfigurationFile} using given {@code File} and
     * attempts to restore a debugging-session by altering DIbugger's
     * model- and presentation-component.
     * 
     * @param configurationFile the {@code File} to load
     * @throws FileHandlerException
     * @throws DIbuggerLogicException 
     */
    public void loadConfigurationFile(File configurationFile) throws FileHandlerException, DIbuggerLogicException {
        ConfigurationFile nextConfigFile = fileHandlerFacade.loadConfig(configurationFile);
        debugLogicController.reset();
        applyConfiguration(nextConfigFile);
    }

    private void applyConfiguration(ConfigurationFile configFile) throws DIbuggerLogicException {
        int numberOfPrograms = configFile.getNumPrograms();
        for (int i = 0; i < numberOfPrograms; i++) {
            String programIdentifier = configFile.getProgramNameID(i);
            String programText = configFile.getProgramText(i);
            
            guiFacade.showProgramText(programText, programIdentifier);

            List<String> inputValueIdentifiers = configFile.getInputValueIdentifiers(i);
            List<String> variablesAndValues = new ArrayList<>();

            for (String identifier : inputValueIdentifiers) {
                String inputValue = configFile.getInputValue(i, identifier);
                variablesAndValues.add(identifier + " = " + inputValue);
            }
            guiFacade.showInput(programIdentifier, variablesAndValues);

            List<String> variablesOfInspector = configFile.getVariablesOfInspector(i);
            guiFacade.showVariables(programIdentifier, variablesOfInspector);
            
            // Notiz: "configFile.getLatestExecutionLine" muss noch verwendet werden

            int stepSize = configFile.getStepSize(i);
            debugLogicController.setStepSize(i, stepSize);

            List<Integer> lineNumbers = configFile.getBreakpoints(i);
            debugLogicController.createBreakpoints(configFile.getProgramNameID(i), lineNumbers);

            List<String> conditions = configFile.getConditionalBreakpoints();
            debugLogicController.createConditionalBreakpoints(conditions);

            List<String> expressions = configFile.getWatchExpressions();
            debugLogicController.createWatchExpressions(expressions);
        }

    }

    /**
     * Saves some of Dibugger's model- and presentation-component's state
     * to a specified {@code File}.
     * 
     * @param configurationFile a {@code File} to save DIbugger's state to
     */
    public void saveConfiguration(File file) {
        /*
         * Notiz: Möglicher Fall: unterschiedliche Anzahl an Programmen im Modell und
         * zwischengespeichert in Kontrolle. Vielleicht inkonsistenter
         * DIbugger-Zustand, vielleicht anders/überhaupt berücksichtigen.
         */
        ConfigurationFile configurationFile = new ConfigurationFile(file);
        List<ProgramInput> currentInput = debugLogicController.getProgramInput();

        int numberOfBufferedPrograms = debugLogicController.getNumberOfBufferedPrograms();
        for (int i = 0; i < numberOfBufferedPrograms; i++) {
            ProgramInput input = currentInput.get(i);
            
            String bufferedProgramIdentifier = input.getProgramID();
            configurationFile.setProgramNameID(i, bufferedProgramIdentifier);
            
            String programText = input.getText();
            configurationFile.setProgramText(i, programText);
            
            List<String> variableAssignments = input.getInputValues();

            for (String assignment : variableAssignments) {
                String[] variableAndValue = assignment.split(" = ");
                if (variableAndValue.length != 2) {
                    throw new IllegalStateException();
                }
                String variable = variableAndValue[0];
                String value = variableAndValue[1];
                configurationFile.setInputValue(i, variable, value);
            }
                        
            List<String> variablesOfInspector = guiFacade.getVariablesOfInspector(bufferedProgramIdentifier);
            configurationFile.setVariablesOfInspector(i, variablesOfInspector);
        }

        // Notiz: "configurationFile.setLatestExecutionLines" muss noch verwendet werden

        int numberOfPrograms = debugLogicController.getNumberOfPrograms();
        for (int i = 0; i < numberOfPrograms; i++) {
            int stepSize = debugLogicController.getStepSize(i);
            configurationFile.setStepSize(i, stepSize);
            
            List<Integer> breakpoints = debugLogicController.getBreakpoints(i);
            List<Integer> lines = new ArrayList<>();
            for (Integer element : breakpoints) {
                lines.add(element);
            }
            configurationFile.setBreakpoints(i, lines);
        }
        List<String> conditions = debugLogicController.getConditionalBreakpoints();

        // Notiz: evtl. getSizeOfConditionalBreakpoints benutzen
        int numberOfConditionalBreakpoints = conditions.size();
        /*
         * Notiz: Schnittstellen in DebugLogicController, DebugLogicFacade,
         * DebugControl und ConfigurationFile sollten verändert werden - z.B.
         * Zugriffsmethoden auf "Scope-Ebene" (also ScopeTuple nicht
         * scopebegin/-end)
         */
        for (int i = 0; i < numberOfConditionalBreakpoints; i++) {
            String condition = conditions.get(i);
            List<Integer> breakpointScopeBeginnings = debugLogicController.getConditionalBreakpointScopeBeginnings(i);
            List<Integer> breakpointScopeEnds = debugLogicController.getConditionalBreakpointScopeEnds(i);
            configurationFile.addConditionalBreakpoint(condition, breakpointScopeBeginnings, breakpointScopeEnds);
        }

        List<String> expressions = debugLogicController.getWatchExpressions();
        int numberOfExpressions = expressions.size();
        for (int i = 0; i < numberOfExpressions; i++) {
            String expression = expressions.get(i);
            List<Integer> expressionScopeBeginnings = debugLogicController.getWatchExpressionScopeBeginnnings(i);
            List<Integer> expressionScopeEnds = debugLogicController.getWatchExpressionScopeEnds(i);
            configurationFile.addWatchExpressions(expression, expressionScopeBeginnings, expressionScopeEnds);
        }
    }

    /**
     *  Loads a program's text using specified {@code File}
     *  
     *  @param file the File containing a program's text
     */
    public String loadProgramText(File file) {
        return fileHandlerFacade.loadProgramText(file);
    }

    /**
     * Returns a list containing all languages available for use by this'
     * GUIFacade
     * 
     * @return a list containing all languages available
     * @see FileHandlerFacade#getLanguages()
     */
    public List<String> getAvailableLanuages() {
        // Notiz: Oberfläche "schlau" genug um das entgegenzunehmen? (Sonderfall "null")
        return fileHandlerFacade.getLanguages();
    }

    /**
     * Changes the language in which information is shown by
     * this' GUIFacade.
     * 
     * @param languageId the id specifieng the language
     * @see GUIFacade#changeLanguage()
     * @throws LanguageNotFoundException
     */
    public void changeLanguage(String languageId) throws LanguageNotFoundException {
        LanguageFile nextLanguageFile = fileHandlerFacade.getLanguageFile(languageId);
        setLanguageFile(nextLanguageFile);
        guiFacade.changeLanguage();
    }
}
