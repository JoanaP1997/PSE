package dibugger.DebugLogic.Interpreter;

import java.util.List;
/**
 * Represents a Comparison in the Form "a<=b", where a and b are terms.
 * @author wagner
 *
 */
public final class LessEqualComparison extends Comparison {
	public LessEqualComparison(Term leftOperand, Term rightOperand){
		super(leftOperand, rightOperand);
	}

	@Override
	public BooleanValue evaluate(List<TraceState> states) {
		return new BooleanValue(leftOperand.evaluate(states).lessEqual(rightOperand.evaluate(states)));
	}

	@Override
	public BooleanValue evaluate(Scope currentScope) {
		return new BooleanValue(leftOperand.evaluate(currentScope).lessEqual(rightOperand.evaluate(currentScope)));
		
	}
}
