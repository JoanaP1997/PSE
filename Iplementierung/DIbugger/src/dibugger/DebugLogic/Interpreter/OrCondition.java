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
	//TODOreturn this.leftOperand.evaluate(states).or();
    }
    @Override
    public BooleanValue evaluate(Scope currentScope) {
	// TODO Auto-generated method stub
	return null;
    }

}
