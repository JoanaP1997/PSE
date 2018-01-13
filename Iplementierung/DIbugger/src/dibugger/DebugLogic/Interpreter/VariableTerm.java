package dibugger.DebugLogic.Interpreter;

import java.util.List;
/**
 * Represents a variableaccess based on the values of a single program.
 * @author wagner
 *
 */
public final class VariableTerm extends Term {
    private String identifier;
    public VariableTerm(String identifier) {
	this.identifier = identifier;
    }
    @Override
    public TermValue evaluate(List<TraceState> states) {
	return new CharValue('?');
    }

    @Override
    public TermValue evaluate(Scope currentScope) {
	return currentScope.getValue(identifier);
    }

}
