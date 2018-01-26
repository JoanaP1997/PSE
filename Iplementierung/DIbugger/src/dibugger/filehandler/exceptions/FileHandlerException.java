package dibugger.filehandler.exceptions;

/**
 * 
 * @author Pascal Exception, that is throwed by the FileHandler package.
 */
public abstract class FileHandlerException extends Exception {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * Simple getter for the identifier, that could be used to get a translation
     * via a LanguageFile.
     * 
     * @return identifier of the Exception
     */
    public abstract String getID();

}
