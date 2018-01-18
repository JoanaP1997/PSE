package dibugger.debuglogic.interpreter;

import java.util.List;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
/**
 * Represents a Negation of a Term.
 * @author wagner
 *
 */
public final class NotCondition extends Term {
    private Term child;
    /**
     * Constructor
     * @param child the Term, you want to negate
     */
    public NotCondition(Term child) {
	this.child = child;
    }
    @Override
    public BooleanValue evaluate(List<TraceState> states) throws DIbuggerLogicException {
	return new BooleanValue(this.child.evaluate(states).not());
    }

    @Override
    public BooleanValue evaluate(Scope currentScope) throws DIbuggerLogicException {
	return new BooleanValue(this.child.evaluate(currentScope).not());
    }

}