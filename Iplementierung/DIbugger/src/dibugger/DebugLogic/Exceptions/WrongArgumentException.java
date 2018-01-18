package dibugger.DebugLogic.Exceptions;

/**
 * An abstract class for exceptions caused by wrong arguments.
 * @author scheler
 *
 */
public abstract class WrongArgumentException extends DIbuggerLogicException {

	/**
	 * Default serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Constructor for a WrongARgumentException.
	 * @param occurrence the line of occurrence of the exception
	 */
	public WrongArgumentException(int occurrence, String id) {
		super(occurrence, id);

	}
	
}
