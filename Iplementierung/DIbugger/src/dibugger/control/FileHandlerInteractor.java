package dibugger.control;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Observable;

import dibugger.debuglogic.debugger.Breakpoint;
import dibugger.debuglogic.debugger.ProgramInput;
import dibugger.filehandler.exceptions.FileHandlerException;
import dibugger.filehandler.exceptions.LanguageNotFoundException;
import dibugger.filehandler.facade.ConfigurationFile;
import dibugger.filehandler.facade.FileHandlerFacade;
import dibugger.filehandler.facade.LanguageFile;
import dibugger.filehandler.facade.PropertiesFile;
import dibugger.userinterface.GUIFacade;

public class FileHandlerInteractor extends Observable {
    private FileHandlerFacade fileHandlerFacade;
    private GUIFacade guiFacade;

    private DebugLogicController debugLogicController;

    private LanguageFile languageFile;
    private PropertiesFile propertiesFile;

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

    public LanguageFile getLanguageFile() {
        return languageFile;
    }

    private void setLanguageFile(LanguageFile languageFile) {
        Objects.requireNonNull(languageFile);
        this.languageFile = languageFile;
        this.notifyObservers();
    }

    public void loadConfigurationFile(File configurationFile) throws FileHandlerException {
        ConfigurationFile nextConfigFile = fileHandlerFacade.loadConfig(configurationFile);
        debugLogicController.reset();
        applyConfiguration(nextConfigFile);
    }

    private void applyConfiguration(ConfigurationFile configFile) {
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
            
            // "configFile.getLatestExecutionLine" muss noch verwendet werden

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

    public void saveConfiguration(File file) {
        /*
         * Möglicher Fall: unterschiedliche Anzahl an Programmen im Modell und
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

        // "configurationFile.setLatestExecutionLines" muss noch verwendet werden

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

        // evtl. getSizeOfConditionalBreakpoints benutzen
        int numberOfConditionalBreakpoints = conditions.size();
        /*
         * Schnittstellen in DebugLogicController, DebugLogicFacade,
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

    public String loadProgramText(File file) {
        return fileHandlerFacade.loadProgramText(file);
    }

    public List<String> getAvailableLanuages() {
        // Oberfläche "schlau" genug um das entgegenzunehmen? (Sonderfall "null")
        return fileHandlerFacade.getLanguages();
    }

    public void changeLanguage(String languageId) throws LanguageNotFoundException {
        LanguageFile nextLanguageFile = fileHandlerFacade.getLanguageFile(languageId);
        setLanguageFile(nextLanguageFile);
        guiFacade.changeLanguage();
    }
}
