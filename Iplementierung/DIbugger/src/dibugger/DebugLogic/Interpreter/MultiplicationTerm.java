package dibugger.DebugLogic.Interpreter;

import java.util.List;
/**
 * Represents a Multiplication of two Terms. This is a special Binary Term.
 * @author wagner
 *
 */
public final class MultiplicationTerm extends BinaryArithmeticTerm {
	public MultiplicationTerm(Term left, Term right) {
		this.left = left;
		this.right = right;
	}
	@Override
	public TermValue evaluate(List<TraceState> states) {
		return left.evaluate(states).mult(right.evaluate(states));
	}
	@Override
	public TermValue evaluate(Scope currentScope) {
		return left.evaluate(currentScope).mult(right.evaluate(currentScope));
	}
}
