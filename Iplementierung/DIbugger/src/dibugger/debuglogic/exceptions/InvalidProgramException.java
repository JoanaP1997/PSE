package dibugger.debuglogic.exceptions;

/**
 * Exception that is thrown if a program code of the user does not correspsond
 * to the format specified by the grammar WLang.
 * 
 * @author scheler
 *
 */
public class InvalidProgramException extends DIbuggerLogicException {

    /**
     * Default serialVersionUID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor of an InvalidProgramException.
     * 
     * @param occurrence
     *            the line of occurrence of the exception
     */
    public InvalidProgramException(int occurrence) {
        super(occurrence, "dl_exc_invalid_program");
    }

}
