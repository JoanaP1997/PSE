package dibugger.DebugLogic.Interpreter;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import dibugger.DebugLogic.AntlrParser.TermsLexer;
import dibugger.DebugLogic.AntlrParser.TermsParser;
import dibugger.DebugLogic.Exceptions.DIbuggerLogicException;

/**
 * 
 * @author wagner
 *
 */
public class WatchExpression {
    private String value;
    private String specifier;
    private List<ScopeTuple> scopes;
    private Term expression;
    public WatchExpression(String specifier) {
	this.specifier = specifier;
	this.scopes = new ArrayList<ScopeTuple>();
	this.value = "?";
	this.createTerm();
	
    }
    public WatchExpression(String specifier, List<ScopeTuple> scopes) {
	this.specifier = specifier;
	this.scopes = scopes;
	this.value = "?";
	this.createTerm();
    }
    public void change(String specifier, List<ScopeTuple> scopes){
	this.specifier = specifier;
	this.scopes = scopes;
	this.createTerm();
    }
    public String evaluate(List<TraceState> states) throws DIbuggerLogicException {
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
	if(isValid)
	    this.value = this.expression.evaluate(states).toString();	 
	return this.value;
    }
    private void createTerm(){
	CharStream input = CharStreams.fromString(this.specifier);
	TermsLexer lexer = new TermsLexer(input);
	CommonTokenStream tokens = new CommonTokenStream(lexer);
	TermsParser parser = new TermsParser(tokens);
        ParseTree tree = parser.r();
	TermGenerationVisitor visitor = new TermGenerationVisitor();
	this.expression = visitor.visit(tree);
    }
}
