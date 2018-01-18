package dibugger.debuglogic.interpreter;

import java.util.List;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
/**
 * Represents a Subtraction. This is a special Binary Term.
 * @author wagner
 *
 */
public final class SubtractionTerm extends BinaryArithmeticTerm {
	public SubtractionTerm(Term left, Term right) {
		this.left = left;
		this.right = right;
	}
	@Override
	public TermValue evaluate(List<TraceState> states) throws DIbuggerLogicException {
		return left.evaluate(states).sub(right.evaluate(states));
	}
	@Override
	public TermValue evaluate(Scope currentScope) throws DIbuggerLogicException {
		return left.evaluate(currentScope).sub(right.evaluate(currentScope));
	}
}
