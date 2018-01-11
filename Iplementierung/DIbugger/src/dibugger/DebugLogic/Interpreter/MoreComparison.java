package dibugger.DebugLogic.Interpreter;

import java.util.List;
/**
 * Represents a Comparison in the Form "a>b", where a and b are terms.
 * @author wagner
 *
 */
public final class MoreComparison extends Comparison {
	public MoreComparison(Term leftOperand, Term rightOperand){
		super(leftOperand, rightOperand);
	}

	@Override
	public BooleanValue evaluate(List<TraceState> states) {
		return new BooleanValue(leftOperand.evaluate(states).greaterThan(rightOperand.evaluate(states)));
	}

	@Override
	public BooleanValue evaluate(Scope currentScope) {
		return new BooleanValue(leftOperand.evaluate(currentScope).greaterThan(rightOperand.evaluate(currentScope)));
		
	}
}
