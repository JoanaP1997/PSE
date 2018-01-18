package dibugger.debuglogic.interpreter;

import java.util.List;

public class WhileCommand extends Command {

    public WhileCommand(GenerationController controller,int linenumber) {
	super(controller, linenumber);
	// TODO Auto-generated constructor stub
    }

    @Override
    public List<TraceState> run() {
	// TODO Auto-generated method stub
	return null;
    }
//MEthode nur zu Testzecken bisher
    public Command getChild(int i) {
	// TODO Auto-generated method stub
	return null;
    }

}
