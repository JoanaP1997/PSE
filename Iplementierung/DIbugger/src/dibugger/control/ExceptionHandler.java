package dibugger.control;

import java.util.Objects;
import java.util.Observable;
import java.util.Observer;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.filehandler.exceptions.FileHandlerException;
import dibugger.filehandler.facade.LanguageFile;
import dibugger.userinterface.GUIFacade;

/**
 * Responsible for handling exceptions, which are thrown by DIbuggers
 * model-component. Mainly prompts UI of DIbugger to inform user about errors.
 */
public class ExceptionHandler implements Observer {
    private GUIFacade guiFacade;

    private LanguageFile languageFile;

    /**
     * Creates a new {@code ExceptionHandler} with given arguments.
     * 
     * @param fileHandlerInteractor
     *            the {@code FileHandlerInteractor} known to this
     * @param guiFacade
     *            the {@code GUIFacade} known to this
     */
    public ExceptionHandler(FileHandlerInteractor fileHandlerInteractor, GUIFacade guiFacade) {
        Objects.requireNonNull(guiFacade);
        this.guiFacade = guiFacade;
        Objects.requireNonNull(fileHandlerInteractor);
        setLanguageFile(fileHandlerInteractor.getLanguageFile());
    }

    /**
     * Handles exceptions of type {@code DIbuggerLogicException}.
     * 
     * @param exception
     *            the {@code DIbuggerLogicException} to handle
     */
    public void handle(DIbuggerLogicException exception) {
        String exceptionId = exception.getID();
        guiFacade.showError(languageFile.getTranslation(exceptionId));
    }

    /**
     * Handles exception of type {@code FileHandlerException}.
     * 
     * @param exception
     *            the {@code FileHandlerException} to handle
     */
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
            setLanguageFile(((FileHandlerInteractor) observable).getLanguageFile());
        }
    }
}
