package dibugger.debuglogic.interpreter;

import java.util.ArrayList;
import java.util.List;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.InvalidProgramException;

/**
 * A command to represent a routine call.
 * 
 * @author scheler
 *
 */
public class RoutineCall extends Command {

    private String calleeName;
    private List<Term> args;

    /**
     * Constructor for a RoutineCall.
     * 
     * @param controller
     *            the generation controller
     * @param linenumber
     *            the line number of the command
     * @param calleeName
     *            the name of the function to be called
     * @param args
     *            the arguments to be passed to the function
     */
    public RoutineCall(GenerationController controller, int linenumber, String calleeName, List<Term> args) {
        super(controller, linenumber);
        this.calleeName = calleeName;
        this.args = args;
    }

    @Override
    public List<TraceState> run() throws DIbuggerLogicException {
        RoutineCommand rootCommand = this.controller.getRoutineRootCommand(calleeName);
        if (rootCommand == null) {
            throw new InvalidProgramException(this.linenumber);
        }

        List<TraceState> traceStateList = new ArrayList<TraceState>();

        rootCommand.setArgs(this.args);
        traceStateList.addAll(rootCommand.run());

        this.controller.getCurrentScope().setReturnValue(this.controller.getReturnValue());

        return traceStateList;
    }

}
