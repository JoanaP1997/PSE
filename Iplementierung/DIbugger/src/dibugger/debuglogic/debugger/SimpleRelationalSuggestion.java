package dibugger.debuglogic.debugger;

import java.util.List;

/**
 * class to suggest watch expressions or conditional breakpoints very simple.
 * 
 * @author Pascal
 *
 */
public class SimpleRelationalSuggestion extends RelationalSuggestion {

    @Override
    public String suggestWatchExpression(List<String> programText) {
        return "A.x";
    }

    @Override
    public String suggestConditionalBreakpoint(List<String> programText) {
        return "A.x=A.x";
    }

}
