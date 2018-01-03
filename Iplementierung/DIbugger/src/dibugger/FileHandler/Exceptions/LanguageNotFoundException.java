package dibugger.FileHandler.Exceptions;

public class LanguageNotFoundException extends FileHandlerException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LanguageNotFoundException() {
		
	}

	@Override
	public String getID() {
		return "exc_lang_not_found";
	}

}
