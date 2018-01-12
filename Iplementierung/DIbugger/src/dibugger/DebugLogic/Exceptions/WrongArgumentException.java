package dibugger.DebugLogic.Exceptions;

/**
 * An abstract class for exceptions caused by wrong arguments.
 * @author scheler
 *
 */
public abstract class WrongArgumentException extends DIbuggerLogicException {

	public WrongArgumentException(String occurrence, String id) {
		super(occurrence, id);
	}
	
}
