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
    public String suggestWatchExpression(List<ProgramInput> programInput) {
        //debugControl.launchRun(programInput);
        return "A.x";
    }

    @Override
    public String suggestConditionalBreakpoint(List<ProgramInput> programInput) {
        return "A.x = A.x";
    }

}
