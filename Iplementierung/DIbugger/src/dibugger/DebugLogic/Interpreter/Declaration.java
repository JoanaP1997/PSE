package dibugger.DebugLogic.Interpreter;

import java.util.List;
/**
 * 
 * @author wagner
 *
 */
public class Declaration extends Command {
    private String identifier;
    public Declaration(GenerationController controller, String identifier) {
	super(controller);
	this.identifier = identifier;
    }

    @Override
    public List<TraceState> run() {
	// TODO Auto-generated method stub
	return null;
    }


}
