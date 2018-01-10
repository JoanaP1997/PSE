/**
 * 
 */
package dibugger.DebugLogic.Interpreter;

import java.util.List;

/**
 * @author wagner
 *
 */
public final class OrCondition extends BinaryCondition {
    @Override
    public BooleanValue evaluate(List<TraceState> states) {
	boolean b = this.leftOperand.evaluate(states).or(this.rightOperand.evaluate(states));
	return new BooleanValue(b);
    }
    @Override
    public BooleanValue evaluate(Scope currentScope) {
	boolean b = this.leftOperand.evaluate(currentScope).or(this.rightOperand.evaluate(currentScope));
	return new BooleanValue(b);
    }

}
