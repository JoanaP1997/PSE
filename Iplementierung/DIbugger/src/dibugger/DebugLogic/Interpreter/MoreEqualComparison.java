package dibugger.DebugLogic.Interpreter;

import java.util.List;
/**
 * 
 * @author wagner
 *
 */
public final class MoreEqualComparison extends Comparison {
	public MoreEqualComparison(Term leftOperand, Term rightOperand){
		super(leftOperand, rightOperand);
	}
	@Override
	public BooleanValue evaluate(List<TraceState> states) {
		return new BooleanValue(leftOperand.evaluate(states).moreEqual(rightOperand.evaluate(states)));
	}

	@Override
	public BooleanValue evaluate(Scope currentScope) {
		return new BooleanValue(leftOperand.evaluate(currentScope).moreEqual(rightOperand.evaluate(currentScope)));
		
	}
}
