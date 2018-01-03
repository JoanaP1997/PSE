package dibugger.DebugLogic.Interpreter;

import java.util.List;

/**
 * Represents a variableaccess based on the values of multiple programs.
 * @author wagner
 *
 */
public final class VariableRelationalTerm extends Term {
    private String identifier;
    public VariableRelationalTerm(String identifier) {
	this.identifier = identifier;
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
