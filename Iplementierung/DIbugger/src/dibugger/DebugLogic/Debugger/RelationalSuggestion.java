package dibugger.DebugLogic.Debugger;

/**
 * abstract class for suggesting watch expressions and conditional breakpoints.
 * @author Pascal
 *
 */
public abstract class RelationalSuggestion {
	/**
	 * suggests a watch expression for the DIbugger.
	 * @return String representing the expression.
	 */
	public abstract String suggestWatchExpression();
	/**
	 * suggests a conditional Breakpoint for the DIbugger.
	 * @return String representing the condition.
	 */
	public abstract String suggestConditionalBreakpoint();
}
