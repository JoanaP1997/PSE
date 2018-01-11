package dibugger.DebugLogic.Interpreter;

import java.util.List;
/**
 * Represents a Comparison in the Form "a==b", where a and b are terms.
 * @author wagner
 *
 */
public final class EqualComparison extends Comparison {
	public EqualComparison(Term leftOperand, Term rightOperand){
		super(leftOperand, rightOperand);
	}
	@Override
	public BooleanValue evaluate(List<TraceState> states) {
		return new BooleanValue(leftOperand.evaluate(states).equal(rightOperand.evaluate(states)));
	}

	@Override
	public BooleanValue evaluate(Scope currentScope) {
		return new BooleanValue(leftOperand.evaluate(currentScope).equal(rightOperand.evaluate(currentScope)));
	}
	
}
