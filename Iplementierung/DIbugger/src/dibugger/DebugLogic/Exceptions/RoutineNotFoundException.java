package dibugger.DebugLogic.Exceptions;

/**
 * Exception thrown if trying to call a routine that does not exist.
 * @author scheler
 *
 */
public class RoutineNotFoundException extends DIbuggerLogicException {

	/**
	 * Default serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructor of a RoutineNotFoundException.
	 * @param occurrence the line of occurrence of the exception
	 */
	public RoutineNotFoundException(int occurrence) {
		super(occurrence, "routineNotFoundException");
	}

}
