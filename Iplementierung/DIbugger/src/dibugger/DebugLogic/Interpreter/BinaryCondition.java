package dibugger.DebugLogic.Interpreter;

import java.util.List;
/**
 * Represents a Binary Condition, which is a Term with two Operands evaluating to a boolean
 * @author wagner
 *
 */
public abstract class BinaryCondition extends Term {
    @Override
    public abstract BooleanValue evaluate(List<TraceState> states);

    @Override
    public abstract BooleanValue evaluate(Scope currentScope);
	

}
