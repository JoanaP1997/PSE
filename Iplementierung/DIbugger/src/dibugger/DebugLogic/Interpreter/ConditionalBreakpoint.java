/**
 * 
 */
package dibugger.DebugLogic.Interpreter;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import dibugger.DebugLogic.AntlrParser.WlangLexer;
import dibugger.DebugLogic.AntlrParser.WlangParser;
import dibugger.DebugLogic.AntlrParser.WlangLexer;
import dibugger.DebugLogic.AntlrParser.WlangParser;
import dibugger.DebugLogic.Exceptions.DIbuggerLogicException;

/**
 * @author wagner
 *
 */
public class ConditionalBreakpoint {
    private boolean value;
    private String specifier;
    private List<ScopeTuple> scopes;
    private Term condition;
    public ConditionalBreakpoint(String specifier) {
	this.specifier = specifier;
	this.scopes = new ArrayList<ScopeTuple>();
	this.value = false;
	this.createTerm();
	
    }
    public ConditionalBreakpoint(String specifier, List<ScopeTuple> scopes) {
	this.specifier = specifier;
	this.scopes = scopes;
	this.value = false;
	this.createTerm();
    }
    public void change(String specifier, List<ScopeTuple> scopes){
	this.specifier = specifier;
	this.scopes = scopes;
	this.createTerm();
    }
    public boolean evaluate(List<TraceState> states) throws DIbuggerLogicException {
	boolean isValid = true;
	//check wether #states = #scopes
	if (states.size() != this.scopes.size())
	    isValid = false;
	//check wether we are in the right scope
	else if(!this.scopes.isEmpty()) {
	    for(int i = 0; i<this.scopes.size(); ++i)
		if(!this.scopes.get(i).contains(states.get(i).getLineNumber()))
		    isValid = false;
	}
	if(isValid) {
	    TermValue result = this.condition.evaluate(states);
	    if (result.getType() == Type.BOOLEAN) {
		return ((BooleanValue)result).getValue();
	    }
	    this.value = false;
	}
	TermValue result = this.condition.evaluate(states);
	if (result.getType() == Type.BOOLEAN) {
	    return ((BooleanValue)result).getValue();
	}
	return this.value;
    }
    private void createTerm(){
	CharStream input = CharStreams.fromString(this.specifier);
	WlangLexer lexer = new WlangLexer(input);
	CommonTokenStream tokens = new CommonTokenStream(lexer);
	WlangParser parser = new WlangParser(tokens);
	//Chose start rule
        ParseTree tree = parser.webppterm();
	TermGenerationVisitor visitor = new TermGenerationVisitor();
	this.condition = visitor.visit(tree);
    }
}
