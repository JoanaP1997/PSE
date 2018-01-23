package dibugger.debuglogic.interpreter;

import java.util.List;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;

/**
 * Represents a Comparison in the Form "a<b", where a and b are terms.
 * 
 * @author wagner
 *
 */
public final class LessComparison extends Comparison {
    public LessComparison(Term leftOperand, Term rightOperand) {
        super(leftOperand, rightOperand);
    }

    @Override
    public BooleanValue evaluate(List<TraceState> states) throws DIbuggerLogicException {
        return new BooleanValue(leftOperand.evaluate(states).lessThan(rightOperand.evaluate(states)));
    }

    @Override
    public BooleanValue evaluate(Scope currentScope) throws DIbuggerLogicException {
        return new BooleanValue(leftOperand.evaluate(currentScope).lessThan(rightOperand.evaluate(currentScope)));

    }
}
