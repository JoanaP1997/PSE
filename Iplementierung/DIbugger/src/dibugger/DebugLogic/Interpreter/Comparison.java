package dibugger.DebugLogic.Interpreter;

import java.util.List;

import dibugger.DebugLogic.Exceptions.DIbuggerLogicException;
/**
 * 
 * @author wagner
 *
 */
public abstract class Comparison extends Term{
	protected Term leftOperand;
	protected Term rightOperand;
	public Comparison(Term leftOperand, Term rightOperand) {
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
	}
	public abstract BooleanValue evaluate(List<TraceState> states) throws DIbuggerLogicException;
	public abstract BooleanValue evaluate(Scope currentScope) throws DIbuggerLogicException;
}
