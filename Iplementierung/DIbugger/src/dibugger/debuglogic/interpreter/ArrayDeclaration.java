package dibugger.debuglogic.interpreter;

import java.util.List;

public class ArrayDeclaration extends Command {

    public ArrayDeclaration(GenerationController controller, int linenumber,  String identifier, Term index) {
	super(controller, linenumber);
	// TODO Auto-generated constructor stub
    }

    public ArrayDeclaration(GenerationController controller, int linenumber,  String identifier, Term firstIndex, Term secondIndex) {
	super(controller, linenumber);
    }

    public ArrayDeclaration(GenerationController controller, int linenumber, String identifier, Term firstIndex, Term secondIndex,
            Term thirdIndex) {
	super(controller, linenumber);
    }

    @Override
    public List<TraceState> run() {
	// TODO Auto-generated method stub
	return null;
    }

}
