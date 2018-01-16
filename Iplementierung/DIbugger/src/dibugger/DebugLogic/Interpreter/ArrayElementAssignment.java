package dibugger.DebugLogic.Interpreter;

import java.util.List;

public class ArrayElementAssignment extends Command {

    public ArrayElementAssignment(GenerationController controller, String identifier, Term index, Term value) {
	super(controller);
	// TODO Auto-generated constructor stub
    }
    public ArrayElementAssignment(GenerationController controller, String identifier, Term firstIndex, Term secondIndex , Term value) {
	super(controller);
	// TODO Auto-generated constructor stub
    }
    public ArrayElementAssignment(GenerationController controller, String identifier, Term firstIndex, Term secondIndex , Term thirdIndex, Term value) {
	super(controller);
	// TODO Auto-generated constructor stub
    }

    @Override
    public List<TraceState> run() {
	// TODO Auto-generated method stub
	return null;
    }


}
