package dibugger.debuglogic.exceptions;

/**
 * Exception thrown if during an assignment goal variable and value do not match
 * regarding their types.
 * 
 * @author scheler
 *
 */
public class WrongTypeAssignmentException extends DIbuggerLogicException {

    /**
     * Default serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor for a WrongTypeAssignmentException.
     * 
     * @param occurrence
     *            the line of occurrence of the exception
     */
    public WrongTypeAssignmentException(int occurrence) {
        super(occurrence, "dl_exc_wrong_type_assignment");
    }

}
