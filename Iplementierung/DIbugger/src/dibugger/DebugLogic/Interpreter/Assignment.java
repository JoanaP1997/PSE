package dibugger.DebugLogic.Interpreter;

import java.util.List;

public class Assignment extends Command {
    private String identifier;
    private Term term;
    public Assignment(GenerationController controller, String identifier, Term term) {
	super(controller);
	this.identifier = identifier;
	this.term = term;
    }

    @Override
    public List<TraceState> run() {
	// TODO Auto-generated method stub
	return null;
    }

}
