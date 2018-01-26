package dibugger.debuglogic.debugger;

import java.util.List;

/**
 * abstract class for suggesting watch expressions and conditional breakpoints.
 * 
 * @author Pascal
 *
 */
public abstract class RelationalSuggestion {
    DebugControl debugControl;
    
    public RelationalSuggestion(DebugControl debugControl){
        this.debugControl = debugControl;
    }
    
    /**
     * suggests a watch expression for the DIbugger.
     * 
     * @return String representing the expression.
     */
    public abstract String suggestWatchExpression();

    /**
     * suggests a conditional Breakpoint for the DIbugger.
     * 
     * @return String representing the condition.
     */
    public abstract String suggestConditionalBreakpoint();
}
