package dibugger.debuglogic.interpreter;

import java.util.ArrayList;
import java.util.List;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.WrongTypeArgumentException;

/**
 * A command to execute an if statement.
 * @author scheler, wagner
 *
 */
public class IfCommand extends Command {

private Term condition;
private List<Command> children;

	/**
	 * Constructor for an IfCommand.
	 * @param controller the generation controller
	 * @param linenumber the linenumber
	 * @param condition the condition of the if command
	 */
	public IfCommand(GenerationController controller, int linenumber, Term condition) {
		super(controller, linenumber);
		this.condition = condition;
		this.children = new ArrayList<Command>();
	}

	/**
	 * Adds a child to the children of the command.
	 * @param child the child to be added
	 */
	public void addChild(Command child) {
		this.children.add(child);
	}
	
	@Override
	public List<TraceState> run() throws DIbuggerLogicException {
		
		Scope scope = this.controller.getCurrentScope();
		
		// check if condition is of type boolean
		TermValue value = this.condition.evaluate(scope);
		if (value.getType() != Type.BOOLEAN) {
			throw new WrongTypeArgumentException(this.linenumber);
		}
		
		List<TraceState> traceStateList = new ArrayList<TraceState>();
		traceStateList.add(new TraceState(TraceStatePosition.NOTSPECIAL, this.linenumber, scope));
		// check if condition is true
		if (((BooleanValue)value).getValue()) {
			for (Command child : this.children) {
				traceStateList.addAll(child.run());
			}
		}
		return traceStateList;
	}

	public Command getChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
