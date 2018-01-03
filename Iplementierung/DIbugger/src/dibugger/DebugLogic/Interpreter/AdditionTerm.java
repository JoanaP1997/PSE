package dibugger.DebugLogic.Interpreter;

import java.util.List;
/**
 * Represents a Addition of two Terms. This is a special Binary Term.
 * @author wagner
 *
 */
public final class AdditionTerm extends BinaryArithmeticTerm {
	public AdditionTerm(Term left, Term right) {
		this.left = left;
		this.right = right;
	}
	@Override
	public TermValue evaluate(List<TraceState> states) {
		return left.evaluate(states).add(right.evaluate(states));
	}
	@Override
	public TermValue evaluate(Scope currentScope) {
		return left.evaluate(currentScope).add(right.evaluate(currentScope));
	}

}
