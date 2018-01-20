package dibugger.control;

import java.util.Objects;
import java.util.Observable;
import java.util.Observer;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.filehandler.exceptions.FileHandlerException;
import dibugger.filehandler.exceptions.LanguageNotFoundException;
import dibugger.filehandler.facade.LanguageFile;
import dibugger.userinterface.GUIFacade;

public class ExceptionHandler implements Observer {    
    private GUIFacade guiFacade;
    
    private LanguageFile languageFile;
    
    public ExceptionHandler(FileHandlerInteractor fileHandlerInteractor, 
            GUIFacade guiFacade) {
        Objects.requireNonNull(guiFacade);
        this.guiFacade = guiFacade;
        Objects.requireNonNull(fileHandlerInteractor);
        setLanguageFile(fileHandlerInteractor.getLanguageFile());
    }
    
    public void handle(DIbuggerLogicException exception) {
        String exceptionId = exception.getID();
        guiFacade.showError(languageFile.getTranslation(exceptionId));
    }    
    
    public void handle(FileHandlerException exception) {
        String exceptionId = exception.getID();
        guiFacade.showError(exceptionId);
    }
    
    public void setLanguageFile(LanguageFile languageFile) {
        Objects.requireNonNull(languageFile);
        this.languageFile = languageFile;
    }

    @Override
    public void update(Observable observable, Object argument) {
        if (observable instanceof FileHandlerInteractor) {
            setLanguageFile(((FileHandlerInteractor)observable).getLanguageFile());
        }        
    }
}
