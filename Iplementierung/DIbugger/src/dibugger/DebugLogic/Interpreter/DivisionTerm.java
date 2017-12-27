package dibugger.DebugLogic.Interpreter;
import java.util.List;

public final class DivisionTerm extends Term {
	private Term left;
	private Term right;
	public DivisionTerm(Term left, Term right) {
		this.left = left;
		this.right = right;
	}
	@Override
	public TermValue evaluate(List<TraceState> states) {
		return left.evaluate(states).div(right.evaluate(states));
	}
	@Override
	public TermValue evaluate(Scope currentScope) {
		return left.evaluate(currentScope).div(right.evaluate(currentScope));
	}
}
