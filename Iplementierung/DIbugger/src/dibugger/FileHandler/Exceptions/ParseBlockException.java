package dibugger.FileHandler.Exceptions;

public class ParseBlockException extends FileHandlerException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ParseBlockException() {

	}

	@Override
	public String getID() {
		return "fh_exc_parse_block";
	}
	
}
