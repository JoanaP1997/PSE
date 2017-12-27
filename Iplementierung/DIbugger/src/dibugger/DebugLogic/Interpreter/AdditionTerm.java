package dibugger.DebugLogic.Interpreter;

import java.util.List;

public final class AdditionTerm extends Term {
	private Term left;
	private Term right;
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
