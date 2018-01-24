package dibugger.debuglogic.debugger;

import java.util.List;

/**
 * abstract class for suggesting watch expressions and conditional breakpoints.
 * 
 * @author Pascal
 *
 */
public abstract class RelationalSuggestion {
    /**
     * suggests a watch expression for the DIbugger.
     * 
     * @return String representing the expression.
     */
    public abstract String suggestWatchExpression(List<String> programText);

    /**
     * suggests a conditional Breakpoint for the DIbugger.
     * 
     * @return String representing the condition.
     */
    public abstract String suggestConditionalBreakpoint(List<String> programText);
}
