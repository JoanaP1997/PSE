package dibugger.DebugLogic.Interpreter;

import java.util.List;

public final class SubtractionTerm extends Term {
	private Term left;
	private Term right;
	public SubtractionTerm(Term left, Term right) {
		this.left = left;
		this.right = right;
	}
	@Override
	public TermValue evaluate(List<TraceState> states) {
		return left.evaluate(states).sub(right.evaluate(states));
	}
	@Override
	public TermValue evaluate(Scope currentScope) {
		return left.evaluate(currentScope).sub(right.evaluate(currentScope));
	}
}
