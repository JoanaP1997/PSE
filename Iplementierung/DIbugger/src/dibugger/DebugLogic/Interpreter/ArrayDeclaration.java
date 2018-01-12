package dibugger.DebugLogic.Interpreter;

import java.util.List;

public class ArrayDeclaration extends Command {

    public ArrayDeclaration(GenerationController controller, String identifier, Term index) {
	super(controller);
	// TODO Auto-generated constructor stub
    }

    public ArrayDeclaration(GenerationController controller, String identifier, Term firstIndex, Term secondIndex) {
	super(controller);
    }

    public ArrayDeclaration(GenerationController controller, String identifier, Term firstIndex, Term secondIndex,
            Term thirdIndex) {
	super(controller);
    }

    @Override
    public List<TraceState> run() {
	// TODO Auto-generated method stub
	return null;
    }

}
