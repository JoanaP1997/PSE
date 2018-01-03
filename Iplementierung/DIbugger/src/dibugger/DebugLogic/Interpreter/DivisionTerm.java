package dibugger.DebugLogic.Interpreter;
import java.util.List;
/**
 * Represents a Division of two Terms. This is a special Binary Term.
 * @author wagner
 *
 */
public final class DivisionTerm extends BinaryArithmeticTerm {
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
