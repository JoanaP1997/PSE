package dibugger.DebugLogic.Interpreter;

import java.util.List;

public final class ModuloTerm extends Term {
	private Term left;
	private Term right;
	public ModuloTerm(Term left, Term right) {
		this.left = left;
		this.right = right;
	}
	@Override
	public TermValue evaluate(List<TraceState> states) {
		return left.evaluate(states).modulo(right.evaluate(states));
	}
	@Override
	public TermValue evaluate(Scope currentScope) {
		return left.evaluate(currentScope).modulo(right.evaluate(currentScope));
	}
}
