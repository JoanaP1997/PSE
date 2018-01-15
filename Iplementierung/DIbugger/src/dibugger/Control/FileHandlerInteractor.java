package dibugger.Control;

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
        fileHandlerFacade = new FileHandlerFacade();    //  throws FileHandlerException
        
        //throws LanguageNotFoundException
        languageFile = fileHandlerFacade.getLanguageFile(LANGUAGE_DEFAULT);
    }
    
    public LanguageFile getLanguageFile() {
        return languageFile;
    }
}
