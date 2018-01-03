package dibugger.DebugLogic.Interpreter;

import java.util.List;

public final class MoreComparison extends Comparison {
	public MoreComparison(Term leftOperand, Term rightOperand){
		super(leftOperand, rightOperand);
	}

	@Override
	public BooleanValue evaluate(List<TraceState> states) {
		return new BooleanValue(leftOperand.evaluate(states).more(rightOperand.evaluate(states)));
	}

	@Override
	public BooleanValue evaluate(Scope currentScope) {
		return new BooleanValue(leftOperand.evaluate(currentScope).more(rightOperand.evaluate(currentScope)));
		
	}
}
