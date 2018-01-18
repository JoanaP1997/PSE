package dibugger.filehandler.exceptions;

public class InvalidLineTypeExeption extends FileHandlerException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidLineTypeExeption() {

	}
	
	@Override
	public String getID() {
		return "fh_exc_invalid_line_type";
	}

}
