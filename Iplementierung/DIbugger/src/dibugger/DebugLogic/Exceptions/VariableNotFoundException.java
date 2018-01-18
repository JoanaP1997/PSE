package dibugger.DebugLogic.Exceptions;

/**
 * Exception thrown if trying to access a non-existing variable.
 * @author scheler
 *
 */
public class VariableNotFoundException extends DIbuggerLogicException {

	/**
	 * Default serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructor for a VariableNotFoundException.
	 * @param occurrence the line of occurrence of the exception
	 */
	public VariableNotFoundException(int occurrence) {
		super(occurrence, "variableNotFoundException");
	}

}
