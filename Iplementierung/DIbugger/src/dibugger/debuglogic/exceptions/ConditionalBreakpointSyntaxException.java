package dibugger.debuglogic.exceptions;

public class ConditionalBreakpointSyntaxException extends DIbuggerLogicException {
    /**
     * Represents the recognition of a wrong syntactical input in a conditional.
     * Wagner
     */
    private static final long serialVersionUID = 1L;
    private String expected;

    /**
     * Constructor.
     * 
     * @param expected
     *            the expected syntactical values.
     */
    public ConditionalBreakpointSyntaxException(String expected) {
        super(-1, "dl_exc_cbsyntax");
        this.expected = expected;
    }

    @Override
    public String getMessage() {
        String message = super.getMessage();
        return message + "\n\n" + this.expected;
    }
}
