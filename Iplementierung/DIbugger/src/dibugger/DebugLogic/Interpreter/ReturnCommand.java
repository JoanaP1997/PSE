package dibugger.DebugLogic.Interpreter;

import java.util.ArrayList;
import java.util.List;

import dibugger.DebugLogic.Exceptions.DIbuggerLogicException;

public class ReturnCommand extends Command {

	private Term returnValue;
    public ReturnCommand(GenerationController controller, int linenumber, Term returnValue) {
	super(controller, linenumber);
	this.returnValue = returnValue;
    }

    @Override
    public List<TraceState> run() throws DIbuggerLogicException {
		Scope scope = this.controller.getCurrentScope();
		// set scope to finished
		scope.routineIsFinished();
		
		// set return value in controller
		// routine call with get the value from the controller later
		controller.setReturnValue(returnValue.evaluate(scope));
		List<TraceState> traceStateList = new ArrayList<TraceState>();
		traceStateList.add(new TraceState(TraceStatePosition.AFTERRETURN, this.linenumber, scope));
		return traceStateList;
    }

}
