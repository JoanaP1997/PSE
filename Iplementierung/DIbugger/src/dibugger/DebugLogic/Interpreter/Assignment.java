package dibugger.DebugLogic.Interpreter;

import java.util.List;

import dibugger.DebugLogic.Exceptions.DIbuggerLogicException;
import dibugger.DebugLogic.Exceptions.WrongTypeArgumentException;

public class Assignment extends Command {
	private String identifier;
	private Term term;

	public Assignment(GenerationController controller, int linenumber, String identifier, Term term) {
		super(controller, linenumber);
		this.identifier = identifier;
		this.term = term;
	}

	@Override
	public List<TraceState> run() throws DIbuggerLogicException {
		// get scope
		Scope scope = this.controller.getCurrentScope();
		TermValue value = this.term.evaluate(scope);
		// check type
		if (scope.getTypeOf(this.identifier) != value.getType())
			throw new WrongTypeArgumentException(this.linenumber);
		scope.setValue(this.identifier, value);
		return ;
	}

}
