package dibugger.FileHandler.Exceptions;

public class ParseAssignmentException extends FileHandlerException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ParseAssignmentException() {
		
	}

	@Override
	public String getID() {
		return "fh_exc_parse_assign";
	}
}
