package dibugger.debuglogic.debugger;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;

/**
 * abstract class for suggesting a inputvalue
 * 
 * @author Pascal
 *
 */
public abstract class InputValueSuggestion {
    /**
     * Suggests an InputValue for a given variable in a given range
     * 
     * @param identifier
     *            the variable name
     * @param range
     *            the range to suggest from
     * @param type
     *            the type of the variable
     * @return String representing the suggestion value
     */
    public abstract String suggest(String identifier, String range, int type) throws DIbuggerLogicException;

    // Input Types
    public static final int TYPE_CHAR = 0;
    public static final int TYPE_INT = 1;
    public static final int TYPE_LONG = 2;
    public static final int TYPE_FLOAT = 3;
    public static final int TYPE_DOUBLE = 4;
    public static final int TYPE_BOOLEAN = 5;
}
