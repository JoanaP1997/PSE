package dibugger.DebugLogic.Interpreter;

import java.util.List;

public final class MultiplicationTerm extends Term {
	private Term left;
	private Term right;
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
