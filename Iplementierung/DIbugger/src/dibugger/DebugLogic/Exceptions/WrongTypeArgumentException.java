package dibugger.DebugLogic.Exceptions;

/**
 * Exception thrown if an argument has a wrong type.
 * @author scheler
 *
 */
public class WrongTypeArgumentException extends WrongArgumentException {

	/**
	 * Default serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructor for a WrongTypeArgumentException.
	 * @param occurrence the line of occurrence of the exception
	 */
	public WrongTypeArgumentException(String occurrence) {
		super(occurrence, "wrongTypeArgumentException");
	}

}
