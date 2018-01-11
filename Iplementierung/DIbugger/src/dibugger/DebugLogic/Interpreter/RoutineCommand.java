package dibugger.DebugLogic.Interpreter;

import java.util.List;



public class RoutineCommand extends Command {

    public RoutineCommand(GenerationController controller) {
	super(controller);
    }

    @Override
    public List<TraceState> run() {
	// TODO Auto-generated method stub
	return null;
    }
    //Bisher nur zu Testzwecken notwendig
    public Command getChild(int i) {
	// TODO Auto-generated method stub
	return null;
    }

}
