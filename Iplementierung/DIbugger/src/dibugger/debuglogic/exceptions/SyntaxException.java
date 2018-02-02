package dibugger.debuglogic.exceptions;

public class SyntaxException extends DIbuggerLogicException {

    /**
     * Represents the recognition of a wrong syntactical input. Wagner
     */
    private static final long serialVersionUID = 1L;
    private String expected;

    /**
     * Constructor.
     * 
     * @param expected
     *            the expected syntactical values.
     */
    public SyntaxException(String expected) {
        super(-1, "dl_exc_syntax");
        this.expected = expected;
    }

    @Override
    public String getMessage() {
        String message = super.getMessage();
        return (message==null) ? this.expected : message + "\n\n" + this.expected;
    }
}
