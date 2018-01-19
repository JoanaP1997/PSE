package dibugger.control;

import java.io.File;
import java.util.List;
import java.util.Objects;
import java.util.Observable;

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
    
    private LanguageFile languageFile;
    private PropertiesFile propertiesFile;
    
    private DebugLogicController debugLogicController;
    
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
        throw new UnsupportedOperationException();
    }
    
    public void saveConfiguration(File configurationFile) {
        throw new UnsupportedOperationException();       
    }
    
    public void loadProgramText(File file) {
        throw new UnsupportedOperationException();
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
