package dibugger.debuglogic.exceptions;

public class IncompatibleTypeException extends DIbuggerLogicException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IncompatibleTypeException(int occurrence, String id) {
		super(occurrence, id);
	}

}
