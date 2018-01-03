package dibugger.DebugLogic.Interpreter;

import java.util.List;

public final class NotCondition extends Term {
    private Term child;
    public NotCondition(Term child) {
	this.child = child;
    }
    @Override
    public TermValue evaluate(List<TraceState> states) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public TermValue evaluate(Scope currentScope) {
	// TODO Auto-generated method stub
	return null;
    }

}
