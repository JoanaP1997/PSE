package dibugger.Control;

import java.io.File;
import java.util.List;
import java.util.Objects;

import dibugger.FileHandler.Exceptions.FileHandlerException;
import dibugger.FileHandler.Facade.FileHandlerFacade;
import dibugger.FileHandler.Facade.LanguageFile;
import dibugger.UserInterface.GUIFacade;

public class FileHandlerInteractor {
    private static final String LANGUAGE_DEFAULT = "german";
    
    private FileHandlerFacade fileHandlerFacade;
    private GUIFacade guiFacade;
    
    private LanguageFile languageFile;
    
    public FileHandlerInteractor(GUIFacade guiFacade) throws FileHandlerException {
        Objects.requireNonNull(guiFacade);
        this.guiFacade = guiFacade;
        
        //  throws FileHandlerException
        fileHandlerFacade = new FileHandlerFacade();    
        
        //  throws LanguageNotFoundException
        languageFile = fileHandlerFacade.getLanguageFile(LANGUAGE_DEFAULT);
    }
    
    public LanguageFile getLanguageFile() {
        return languageFile;
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
        //  Oberfläche "schlau" genug um das entgegenzunehmen? (Sonderfall "null")
        return fileHandlerFacade.getLanguages();     
    }   
    
    public void changeLanguage(String languageId) {
        throw new UnsupportedOperationException();      
    }
}
