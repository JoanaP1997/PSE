package dibugger.DebugLogic.Exceptions;

public class WrongTypeArgumentException extends DIbuggerLogicException {

	public WrongTypeArgumentException(String occurrence) {
		super(occurrence, "wrongTypeArgumentException");
	}

}
