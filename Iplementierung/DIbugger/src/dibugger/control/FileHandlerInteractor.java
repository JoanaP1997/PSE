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
    private static final String LANGUAGE_DEFAULT = "german";
    
    private FileHandlerFacade fileHandlerFacade;
    private GUIFacade guiFacade;
    
    private DebugLogicController debugLogicController;
    
    private LanguageFile languageFile;
    private PropertiesFile propertiesFile;
    
    public FileHandlerInteractor(DebugLogicController debugLogicController, 
            GUIFacade guiFacade) throws FileHandlerException {
        Objects.requireNonNull(guiFacade);
        this.guiFacade = guiFacade;
        
        Objects.requireNonNull(debugLogicController);
        this.debugLogicController = debugLogicController;
        
        //  throws FileHandlerException
        fileHandlerFacade = new FileHandlerFacade();    
        
        propertiesFile = fileHandlerFacade.loadPropertiesFile();
        
        //  throws LanuageNotFoundException
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
            guiFacade.showProgramText(programText, i);
            
            List<String> inputValueIdentifiers = configFile.getInputValueIdentifiers(i);
            List<String> variablesAndValues = new ArrayList<>();
            
            for (String identifier : inputValueIdentifiers) {
                String inputValue = configFile.getInputValue(i, identifier);
                variablesAndValues.add(identifier + " = " + inputValue);
            }
            guiFacade.showInput(i, variablesAndValues);
            
            List<String> variablesOfInspector = configFile.getVariablesOfInspector(i);
            guiFacade.showVariables(i, variablesOfInspector);
            
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
         *   Möglicher Fall: unterschiedliche Anzahl an Programmen im Modell und
         *   zwischengespeichert in Kontrolle. Vielleicht inkonsistenter DIbugger-Zustand,
         *   vielleicht anders damit umgehen als momentan und in dieser Methode.
         */
        
        ConfigurationFile configurationFile = new ConfigurationFile(file);
        int numberOfBufferedPrograms = debugLogicController.getNumberOfBufferedPrograms();
        List<ProgramInput> currentInput = debugLogicController.getProgramInput();        
        
        for (int i = 0; i < numberOfBufferedPrograms; i++) {
            ProgramInput input = currentInput.get(i);
            configurationFile.setProgramInput(i, input);
            
            List<String> variablesOfInspector = guiFacade.getVariablesOfInspector(i);
            configurationFile.setVariablesOfInspector(i, variablesOfInspector);          
        }
        
        int numberOfPrograms = debugLogicController.getNumberOfPrograms();        
        
        for (int i = 0; i < numberOfPrograms; i++) {
            int stepSize = debugLogicController.getStepSize(i);
            configurationFile.setStepSize(i, stepSize);
            
            List<Breakpoint> breakpoints = debugLogicController.getBreakpoints(i);
            List<Integer> lines = new ArrayList<>();
            for (Breakpoint element: breakpoints) {
                lines.add(element.getLine());
            }
            configurationFile.setBreakpoints(i, lines);
        }
        List<String> conditions = debugLogicController.getConditionalBreakpoints();
        
        //  evtl. getSizeOfConditionalBreakpoints benutzen
        int numberOfConditionalBreakpoints = conditions.size(); 
        
        /*
         *   Hier müssen noch bedingte Haltepunkte und WE's eingestellt werden,
         *   vielleicht können vorher die Schnittstellen in DebugControl und
         *   ConfigurationFile verändert werden (zB Zugriffsmethoden auf 
         *   "Scope-Ebene" (also ScopeTuple nicht scopebegin/-end)?
         */
    }
    
    public void loadProgramText(File file) {
        String programText = fileHandlerFacade.loadProgramText(file);
        int numberOfPrograms = debugLogicController.getNumberOfPrograms();
        guiFacade.showProgramText(programText, numberOfPrograms + 1);
    }

    public List<String> getAvailableLanuages() {
        //  Oberfläche "schlau" genug um das entgegenzunehmen? (Sonderfall "null")
        return fileHandlerFacade.getLanguages();     
    }   
    
    public void changeLanguage(String languageId) throws LanguageNotFoundException {
        LanguageFile nextLanguageFile = fileHandlerFacade.getLanguageFile(languageId);
        setLanguageFile(nextLanguageFile);
        guiFacade.changeLanguage();
    }
}
