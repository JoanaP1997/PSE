/**
 * 
 */
package dibugger.debuglogic.interpreter;

import java.util.List;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;

/**
 * @author wagner
 * Represents the Disjunction of two Terms
 */
public final class OrCondition extends BinaryCondition {
    /**
     * Constructor
     * @param left
     * @param right
     */
    public OrCondition(Term left, Term right) {
	this.leftOperand = left;
	this.rightOperand = right;
    }
    @Override
    public BooleanValue evaluate(List<TraceState> states) throws DIbuggerLogicException {
	boolean b = this.leftOperand.evaluate(states).or(this.rightOperand.evaluate(states));
	return new BooleanValue(b);
    }
    @Override
    public BooleanValue evaluate(Scope currentScope) throws DIbuggerLogicException {
	boolean b = this.leftOperand.evaluate(currentScope).or(this.rightOperand.evaluate(currentScope));
	return new BooleanValue(b);
    }

}
