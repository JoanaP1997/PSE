package dibugger.debuglogic.debugger;

/**
 * class to suggest watch expressions or conditional breakpoints extremely simple.
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
        return "A.x - 42";
    }

    @Override
    public String suggestConditionalBreakpoint() {
        return "A.x == B.x";
    }

}
