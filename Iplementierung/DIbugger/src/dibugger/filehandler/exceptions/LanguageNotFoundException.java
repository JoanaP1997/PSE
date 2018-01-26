package dibugger.filehandler.exceptions;

public class LanguageNotFoundException extends FileHandlerException {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public LanguageNotFoundException() {

    }

    @Override
    public String getID() {
        return "fh_exc_lang_not_found";
    }

}
