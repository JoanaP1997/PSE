package dibugger.debuglogic.interpreter;

import java.util.ArrayList;
import java.util.List;

import dibugger.debuglogic.exceptions.AlreadyDeclaredException;
import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.VariableNotFoundException;
/**
 * Command to declare a variable.
 * @author scheler
 *
 */
public class Declaration extends Command {
    private String identifier;
    private Type type;
    public Declaration(GenerationController controller, int linenumber, String identifier, Type type) {
	super(controller, linenumber);
	this.identifier = identifier;
	this.type = type;
    }

    @Override
    public List<TraceState> run() throws DIbuggerLogicException {

    	Scope scope = this.controller.getCurrentScope();
		
		// check if variable already exists
		if (scope.getTypeOf(identifier) != null) {
			throw new AlreadyDeclaredException(this.linenumber);
		}

		// set type
		scope.setTypeOf(this.identifier, this.type);
		
		List<TraceState> traceStateList = new ArrayList<TraceState>();
		traceStateList.add(new TraceState(TraceStatePosition.NOTSPECIAL, this.linenumber, scope));
		return traceStateList;
    }


}
