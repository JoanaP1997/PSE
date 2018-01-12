package dibugger.DebugLogic.Exceptions;

public class MissingReturnCallException extends DIbuggerLogicException {
	
	/**
	 * Default serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;

	public MissingReturnCallException(String occurrence) {
		super(occurrence, "missingReturnCallException");
	}

}
