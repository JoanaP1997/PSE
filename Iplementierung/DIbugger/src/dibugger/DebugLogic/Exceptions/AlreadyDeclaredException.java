package dibugger.DebugLogic.Exceptions;

/**
 * Exception thrown if trying to declarer a variable that already exists.
 * @author scheler
 *
 */
public class AlreadyDeclaredException extends DIbuggerLogicException {
	
	/**
	 * Default serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for an AlreadyDeclaredException.
	 * @param occurrence the line of occurrence of the exception
	 */
	public AlreadyDeclaredException(int occurrence) {
		super(occurrence, "alreadyDeclaredException");
	}

}
