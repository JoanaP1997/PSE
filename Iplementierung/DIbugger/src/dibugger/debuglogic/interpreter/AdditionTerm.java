package dibugger.debuglogic.interpreter;

import java.util.List;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;

/**
 * Represents a Addition of two Terms. This is a special Binary Term.
 * 
 * @author wagner
 *
 */
public final class AdditionTerm extends BinaryArithmeticTerm {
    /**
     * Contructor
     * 
     * @param left
     * @param right
     */
    public AdditionTerm(Term left, Term right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public TermValue evaluate(List<TraceState> states) throws DIbuggerLogicException {
        return left.evaluate(states).add(right.evaluate(states));
    }

    @Override
    public TermValue evaluate(Scope currentScope) throws DIbuggerLogicException {
        return left.evaluate(currentScope).add(right.evaluate(currentScope));
    }

}
