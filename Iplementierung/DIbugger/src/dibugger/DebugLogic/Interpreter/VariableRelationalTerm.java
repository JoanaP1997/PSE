package dibugger.DebugLogic.Interpreter;

import java.util.List;

/**
 * Represents a variableaccess based on the values of multiple programs.
 * @author wagner
 *
 */
public final class VariableRelationalTerm extends Term {
    private String identifier;
    private int programId; 
    public VariableRelationalTerm(String identifier) {
	if(identifier.contains(".")) {
	    //split into programId part and variable identifier 
	    //here we must pass a regex into split(...), so we have to escape the dot
	    String [] parts = identifier.split("\\.");
	    this.identifier = parts[1];
	    char programIdChar = parts[0].charAt(0);
	    //A should indicate the first (index 0) program
	    this.programId = (int)programIdChar - (int)'A';
	} else {
	    this.programId = 0;
	    this.identifier = identifier;
	}
    }
    @Override
    public TermValue evaluate(List<TraceState> states) {
	if (this.programId < states.size())
	    return states.get(this.programId).getValueOf(identifier);
	return new CharValue('?');
    }
    @Override
    public TermValue evaluate(Scope currentScope) {
	return new CharValue('?');
    }

}
