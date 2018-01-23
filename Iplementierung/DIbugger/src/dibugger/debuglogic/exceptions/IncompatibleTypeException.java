package dibugger.debuglogic.exceptions;

public class IncompatibleTypeException extends DIbuggerLogicException {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public IncompatibleTypeException(String id) {
        super(-1, id);
    }

    public IncompatibleTypeException(int occurence, String id) {
        super(occurence, id);
    }
}
