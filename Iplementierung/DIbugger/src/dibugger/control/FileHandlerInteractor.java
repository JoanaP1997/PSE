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
            String programText = configFile.getProgramText(i);
            // TODO not temporary value "A", use from configuration file
            guiFacade.showProgramText(programText, "A");

            List<String> inputValueIdentifiers = configFile.getInputValueIdentifiers(i);
            List<String> variablesAndValues = new ArrayList<>();

            for (String identifier : inputValueIdentifiers) {
                String inputValue = configFile.getInputValue(i, identifier);
                variablesAndValues.add(identifier + " = " + inputValue);
            }
            // TODO not temporary value "A", use from configuration file
            guiFacade.showInput("A", variablesAndValues);

            // "configFile.getLatestExecutionLine" muss noch verwendet werden

            List<String> variablesOfInspector = configFile.getVariablesOfInspector(i);
            // TODO not temporary value "A", use from configuration file
            guiFacade.showVariables("A", variablesOfInspector);

            int stepSize = configFile.getStepSize(i);
            debugLogicController.setStepSize(i, stepSize);

            List<Integer> lineNumbers = configFile.getBreakpoints(i);
            debugLogicController.createBreakpoints(i, lineNumbers);

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
//            configurationFile.setProgramInput(i, input);//TODO NOPE

            // TODO not temporary value "A", use from configuration file
            List<String> variablesOfInspector = guiFacade.getVariablesOfInspector("A");

            configurationFile.setVariablesOfInspector(i, variablesOfInspector);
        }

        // etwas wie "configurationFile.setLatestExecutionLines" muss noch
        // verwendet werden

        int numberOfPrograms = debugLogicController.getNumberOfPrograms();
        for (int i = 0; i < numberOfPrograms; i++) {
            int stepSize = debugLogicController.getStepSize(i);
            configurationFile.setStepSize(i, stepSize);

//            List<Breakpoint> breakpoints = debugLogicController.getBreakpoints(i);//TODO INT
//            List<Integer> lines = new ArrayList<>();
//            for (Breakpoint element : breakpoints) {
//                lines.add(element.getLine());
//            }
//            configurationFile.setBreakpoints(i, lines);
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
            ;
        }
    }

    public void loadProgramText(File file) {
        String programText = fileHandlerFacade.loadProgramText(file);
        int numberOfPrograms = debugLogicController.getNumberOfBufferedPrograms();

        // TODO no temporary value "A"
        guiFacade.showProgramText(programText, "A");

    }

    public List<String> getAvailableLanuages() {
        // Oberfläche "schlau" genug um das entgegenzunehmen? (Sonderfall
        // "null")
        return fileHandlerFacade.getLanguages();
    }

    public void changeLanguage(String languageId) throws LanguageNotFoundException {
        LanguageFile nextLanguageFile = fileHandlerFacade.getLanguageFile(languageId);
        setLanguageFile(nextLanguageFile);
        guiFacade.changeLanguage();
    }
}
