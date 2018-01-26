package dibugger.debuglogic.debugger;

import java.util.List;

/**
 * class to suggest watch expressions or conditional breakpoints very simple.
 * 
 * @author Pascal
 *
 */
public class SimpleRelationalSuggestion extends RelationalSuggestion {

    public SimpleRelationalSuggestion(DebugControl debugControl) {
        super(debugControl);
    }

    @Override
    public String suggestWatchExpression() {
        return "A.x";
    }

    @Override
    public String suggestConditionalBreakpoint() {
        return "A.x = A.x";
    }

}
