/**
 * 
 */
package dibugger.DebugLogic.Interpreter;

import java.util.List;

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
    public BooleanValue evaluate(List<TraceState> states) {
	boolean b = this.leftOperand.evaluate(states).or(this.rightOperand.evaluate(states));
	return new BooleanValue(b);
    }
    @Override
    public BooleanValue evaluate(Scope currentScope) {
	boolean b = this.leftOperand.evaluate(currentScope).or(this.rightOperand.evaluate(currentScope));
	return new BooleanValue(b);
    }

}
