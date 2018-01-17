package dibugger.DebugLogic.Interpreter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dibugger.DebugLogic.Exceptions.DIbuggerLogicException;
import dibugger.DebugLogic.Exceptions.WrongNumberArgumentException;
import dibugger.DebugLogic.Exceptions.WrongTypeArgumentException;

public class RoutineCommand extends Command {

	private List<Type> expectedTypes;
	private List<Command> children;
	private List<Term> args;

	public RoutineCommand(GenerationController controller, int linenumber, List<Type> expectedTypes,
			List<Command> children) {
		super(controller, linenumber);
		this.expectedTypes = expectedTypes;
		this.children = new ArrayList<Command>();

	}

	@Override
	public List<TraceState> run() throws DIbuggerLogicException {

		// OLD SCOPE
		Scope scope = this.controller.getCurrentScope();
		// check number of arguments
		if (this.expectedTypes.size() != this.args.size()) {
			throw new WrongNumberArgumentException(this.linenumber);
		}
		
		// compare type of arguments with expected types
		Map<String, TermValue> values = new HashMap<String, TermValue>();
		for (int i = 0; i < expectedTypes.size(); i++) {
			TermValue value = this.args.get(i).evaluate(scope);
			if (this.expectedTypes.get(i) != value.getType()) {
				throw new WrongTypeArgumentException(this.linenumber);
			}
			values.put(key, value)
		}
			
			
		// NEW SCOPE
		//TODO für alle Kinder: run while nicht return value gesetzt
		//TODO check: return value gesetzt, richtiger typ
		//TODO generationController.popScope
	}

	public Command getChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Adds a child to the children of the command.
	 * @param child the child to be added
	 */
	public void addChild(Command child) {
		this.children.add(child);
	}
	
	//TODO change to Map
	/**
	 * Setter for the arguments of a routine.
	 * @param args the arguments
	 */
	public void setArgs(List<Term> args) {
		this.args.addAll(args);
	}
}
