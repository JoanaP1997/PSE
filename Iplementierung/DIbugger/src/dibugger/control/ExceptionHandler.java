package dibugger.control;

import java.util.Objects;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.filehandler.exceptions.FileHandlerException;
import dibugger.filehandler.exceptions.LanguageNotFoundException;
import dibugger.filehandler.facade.LanguageFile;
import dibugger.userinterface.GUIFacade;

public class ExceptionHandler {
    private static final String NO_LANGUAGEFILE_FOUND = "Es konnte keine Sprachdatei zum Anzeigen von "
                                                    + "Texten der Benutzeroberfläche gefunden werden!"
                                                    + "Möglicherweise wurde DIBugger nicht korrekt "
                                                    + "installiert. Bitte tuen Sie dieses und jenes";
    
    private GUIFacade guiFacade;
    private LanguageFile languageFile;
    
    public ExceptionHandler(GUIFacade guiFacade) {
        //  LanguageFile object acts as sentinel
        this(guiFacade, new LanguageFile("sentinel", "sentinel"));
        
        //  Elegantere Lösung für Zugriff auf id finden
        languageFile.putTranslation((new LanguageNotFoundException()).getID(), NO_LANGUAGEFILE_FOUND);
    }
    
    public ExceptionHandler(GUIFacade guiFacade, LanguageFile languageFile) {
        Objects.requireNonNull(guiFacade);
        this.guiFacade = guiFacade;
        Objects.requireNonNull(languageFile);
        this.languageFile = languageFile;
    }
    
    public void handle(DIbuggerLogicException exception) {
        guiFacade.showError(exception.getID());
    }    
    
    public void handle(FileHandlerException exception) {
        guiFacade.showError(exception.getID());
    }
    
    public void setLanguageFile(LanguageFile languageFile) {
        Objects.requireNonNull(languageFile);
        this.languageFile = languageFile;
    }
}
