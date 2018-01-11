package dibugger.DebugLogic.Interpreter;

import java.util.List;

/**
 * @author wagner
 * Represents a runnalbe command in a WLANG program
 */
public abstract class Command {
    GenerationController controller;
    public Command(GenerationController controller) {
	this.controller = controller;
    }
    /**
     * Runs the command
     * @return the states, in which the program was during the execution of the command
     */
    public abstract List<TraceState> run();
}