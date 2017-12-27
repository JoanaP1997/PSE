package dibugger.DebugLogic.Interpreter;

import java.util.List;

public abstract class Comparison extends Term{
	protected Term leftOperand;
	protected Term rightOperand;
	public Comparison(Term leftOperand, Term rightOperand) {
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
	}
	public abstract BooleanValue evaluate(List<TraceState> states);
	public abstract BooleanValue evaluate(Scope currentScope);
}
