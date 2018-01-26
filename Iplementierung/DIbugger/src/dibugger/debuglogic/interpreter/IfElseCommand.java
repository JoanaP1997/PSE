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

    private Command ifChild;
    private Command elseChild;
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
            traceStateList.addAll(this.ifChild.run());
        } else {
            traceStateList.addAll(this.elseChild.run());
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
        this.ifChild = child;
    }

    /**
     * Setter for the else-child.
     * 
     * @param child
     *            the else-child
     */
    public void addElseChild(Command child) {
        this.elseChild = child;
    }
}
