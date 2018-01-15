package dibugger.DebugLogic.Interpreter;

import java.util.List;

import dibugger.DebugLogic.Exceptions.DIbuggerLogicException;
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
	public BooleanValue evaluate(List<TraceState> states) throws DIbuggerLogicException {
		return new BooleanValue(leftOperand.evaluate(states).lessEqual(rightOperand.evaluate(states)));
	}

	@Override
	public BooleanValue evaluate(Scope currentScope) throws DIbuggerLogicException {
		return new BooleanValue(leftOperand.evaluate(currentScope).lessEqual(rightOperand.evaluate(currentScope)));
		
	}
}
