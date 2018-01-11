package dibugger.DebugLogic.Interpreter;

import java.util.List;
/**
 * 
 * @author wagner
 * Represents the Conjunction of two terms.
 */
public final class AndCondition extends BinaryCondition {
    /**
     * Contructor
     * @param left
     * @param right
     */
    public AndCondition(Term left, Term right) {
		this.leftOperand = left;
		this.rightOperand = right;
	}
    @Override
    public BooleanValue evaluate(List<TraceState> states) {
	boolean b = this.leftOperand.evaluate(states).and(this.rightOperand.evaluate(states));
	return new BooleanValue(b);
    }
    @Override
    public BooleanValue evaluate(Scope currentScope) {
	boolean b = this.leftOperand.evaluate(currentScope).and(this.rightOperand.evaluate(currentScope));
	return new BooleanValue(b);
    }

}
