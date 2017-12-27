package dibugger.DebugLogic.Interpreter;

import java.util.List;

public abstract class Term {
	public abstract TermValue evaluate(List<TraceState> states);
	public abstract TermValue evaluate(Scope currentScope);
	public String evaluateToString(List<TraceState> states){
		return this.evaluate(states).toString();
	}
}
