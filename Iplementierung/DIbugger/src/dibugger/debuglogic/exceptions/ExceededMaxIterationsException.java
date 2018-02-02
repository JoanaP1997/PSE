package dibugger.debuglogic.exceptions;

/**
 * Exception thrown if a while command does more iterations than allowed.
 * 
 * @author scheler
 *
 */
public class ExceededMaxIterationsException extends DIbuggerLogicException {
    /**
     * Default serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor of a ExceededMaxIterationsException.
     * 
     * @param occurrence
     *            the line of occurrence of the exception
     */
    public ExceededMaxIterationsException(int occurrence) {
        super(occurrence, "dl_exc_exceeded_max_iterations");
    }

}
