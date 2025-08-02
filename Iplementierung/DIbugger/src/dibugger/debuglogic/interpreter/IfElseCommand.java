package dibugger.debuglogic.interpreter;

import java.util.ArrayList;
import java.util.List;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.WrongTypeArgumentException;

/**
 * A command to execute an if-else-statement.
 * 
 * @author scheler
 *
 */
public class IfElseCommand extends Command {

    private List<Command> ifChilds;
    private List<Command> elseChilds;
    private Term condition;

    /**
     * A constructor for an IfElseCommand.
     * 
     * @param controller
     *            the generation controller
     * @param linenumber
     *            the line number
     * @param condition
     *            the condition to be evaluated
     */
    public IfElseCommand(GenerationController controller, int linenumber, Term condition) {
        super(controller, linenumber);
        this.condition = condition;
        this.ifChilds = new ArrayList<Command>();
        this.elseChilds = new ArrayList<Command>();
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
        if (((BooleanValue) value).getValue()) {
        	for(Command ifChild : this.ifChilds)
        		traceStateList.addAll(ifChild.run());
        } else {
        	for(Command elseChild: this.elseChilds)
        		traceStateList.addAll(elseChild.run());
        }
        return traceStateList;
    }

    /**
     * Setter for the if-child.
     * 
     * @param child
     *            the if-child
     */
    public void addIfChild(Command child) {
    	 this.ifChilds.add(child);
    }

    /**
     * Setter for the else-child.
     * 
     * @param child
     *            the else-child
     */
    public void addElseChild(Command child) {
        this.elseChilds.add(child);
    }

	public Command getIfChild(int i) {
		if (this.ifChilds.size()>i) return this.ifChilds.get(i);
		return null;
	}
	public Command getElseChild(int i) {
		if (this.elseChilds.size()>i) return this.elseChilds.get(i);
		return null;
	}
}
