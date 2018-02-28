package dibugger.debuglogic.interpreter;

import java.util.List;

import dibugger.debuglogic.exceptions.VariableNotFoundException;

/**
 * Represents a variableaccess based on the values of multiple programs.
 * 
 * @author wagner
 *
 */
public final class VariableRelationalTerm extends Term {
    private String identifier;
    private String programId;

    public VariableRelationalTerm(String identifier) {
        if (identifier.contains(".")) {
            // split into programId part and variable identifier
            // here we must pass a regex into split(...), so we have to escape
            // the dot
            String[] parts = identifier.split("\\.");
            this.identifier = parts[1];
            this.programId = parts[0];
        } else {
            this.programId = "A";
            this.identifier = identifier;
        }
    }

    @Override
    public TermValue evaluate(List<TraceState> states) {
        // find the state the variable belongs to
        for (TraceState state : states) {
            if (state.getProgramId() != null && state.getProgramId().equals(this.programId)) {
                TermValue value = state.getValueOf(identifier);
                if (value != null)
                    return value;
            }
        }
        return new CharValue('?');
    }

    @Override
    public TermValue evaluate(Scope currentScope) throws VariableNotFoundException {
    	throw new VariableNotFoundException(-1);
    }

}
