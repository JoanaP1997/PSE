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

import dibugger.DebugLogic.AntlrParser.TermsLexer;
import dibugger.DebugLogic.AntlrParser.TermsParser;

/**
 * @author wagner
 *
 */
public class ConditionalBreakpoint {
    private String value;
    private String specifier;
    private List<ScopeTuple> scopes;
    private Term condition;
    public ConditionalBreakpoint(String specifier) {
	this.specifier = specifier;
	this.scopes = new ArrayList<ScopeTuple>();
	this.value = "?";
	this.createTerm();
	
    }
    public ConditionalBreakpoint(String specifier, List<ScopeTuple> scopes) {
	this.specifier = specifier;
	this.scopes = scopes;
	this.value = "?";
	this.createTerm();
    }
    public void change(String specifier, List<ScopeTuple> scopes){
	this.specifier = specifier;
	this.scopes = scopes;
    }
    public boolean evaluate(List<TraceState> states) {
	//return this.condition.evaluate(states)./toBOOL;
	return false;
    }
    private void createTerm(){
	CharStream input = CharStreams.fromString(this.specifier);
	TermsLexer lexer = new TermsLexer(input);
	CommonTokenStream tokens = new CommonTokenStream(lexer);
	TermsParser parser = new TermsParser(tokens);
        ParseTree tree = parser.r();
	TermGenerationVisitor visitor = new TermGenerationVisitor();
	this.condition = visitor.visit(tree);
    }
}
