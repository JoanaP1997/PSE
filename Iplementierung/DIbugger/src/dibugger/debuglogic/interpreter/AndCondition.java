package dibugger.debuglogic.interpreter;

import java.util.List;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;

/**
 * 
 * @author wagner Represents the Conjunction of two terms.
 */
public final class AndCondition extends BinaryCondition {
    /**
     * Contructor
     * 
     * @param left
     * @param right
     */
    public AndCondition(Term left, Term right) {
        this.leftOperand = left;
        this.rightOperand = right;
    }

    @Override
    public BooleanValue evaluate(List<TraceState> states) throws DIbuggerLogicException {
        boolean b = this.leftOperand.evaluate(states).and(this.rightOperand.evaluate(states));
        return new BooleanValue(b);
    }

    @Override
    public BooleanValue evaluate(Scope currentScope) throws DIbuggerLogicException {
        boolean b = this.leftOperand.evaluate(currentScope).and(this.rightOperand.evaluate(currentScope));
        return new BooleanValue(b);
    }

}
