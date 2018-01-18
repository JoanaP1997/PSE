package dibugger.debuglogic.exceptions;

/**
 * Exception thrown if a method in the program code of a user requires a return
 * value but does not contain a return statement.
 * 
 * @author scheler
 *
 */
public class MissingReturnCallException extends DIbuggerLogicException {

	/**
	 * Default serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of a MissingReturnCallException.
	 * @param occurrence the line of occurrence of the exception
	 */
	public MissingReturnCallException(int occurrence) {
		super(occurrence, "missingReturnCallException");
	}

}
