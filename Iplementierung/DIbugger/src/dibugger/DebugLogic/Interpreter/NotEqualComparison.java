package dibugger.DebugLogic.Interpreter;
import java.util.List;
/**
 * 
 * @author wagner
 *
 */
public final class NotEqualComparison extends Comparison {
	public NotEqualComparison(Term leftOperand, Term rightOperand){
		super(leftOperand, rightOperand);
	}
	@Override
	public BooleanValue evaluate(List<TraceState> states) {
		return new BooleanValue(!leftOperand.evaluate(states).equal(rightOperand.evaluate(states)));
	}

	@Override
	public BooleanValue evaluate(Scope currentScope) {
		return new BooleanValue(!leftOperand.evaluate(currentScope).equal(rightOperand.evaluate(currentScope)));
		
	}
}
