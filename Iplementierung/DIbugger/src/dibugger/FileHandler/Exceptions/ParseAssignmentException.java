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
		return "exc_parse_assign";
	}
}
