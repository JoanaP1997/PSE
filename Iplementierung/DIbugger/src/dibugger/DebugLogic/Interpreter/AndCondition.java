package dibugger.DebugLogic.Interpreter;

import java.util.List;

public final class AndCondition extends BinaryCondition {
    @Override
    public BooleanValue evaluate(List<TraceState> states) {
	boolean b = this.leftOperand.evaluate(states).and(this.rightOperand.evaluate(states));
	return new BooleanValue(b);
    }
    @Override
    public BooleanValue evaluate(Scope currentScope) {
	boolean b = this.leftOperand.evaluate(currentScope).and(this.rightOperand.evaluate(currentScope));
	return new BooleanValue(b);
    }

}
