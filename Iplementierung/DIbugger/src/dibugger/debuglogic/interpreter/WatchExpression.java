package dibugger.debuglogic.interpreter;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import dibugger.debuglogic.antlrparser.ActuallyHelpfulErrorListener;
import dibugger.debuglogic.antlrparser.ActuallyHelpfulSyntaxException;
import dibugger.debuglogic.antlrparser.WlangLexer;
import dibugger.debuglogic.antlrparser.WlangParser;
import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.SyntaxException;

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

    public WatchExpression(String specifier) throws DIbuggerLogicException {
        this.specifier = specifier;
        this.scopes = new ArrayList<ScopeTuple>();
        this.value = "?";
        this.createTerm();

    }

    public WatchExpression(String specifier, List<ScopeTuple> scopes) throws DIbuggerLogicException {
        this.specifier = specifier;
        this.scopes = scopes;
        this.value = "?";
        this.createTerm();
    }

    public void change(String specifier, List<ScopeTuple> scopes) throws DIbuggerLogicException {
        this.specifier = specifier;
        this.scopes = scopes;
        this.createTerm();
    }

    public String evaluate(List<TraceState> states) throws DIbuggerLogicException {
        boolean isValid = true;   
        // check whether #states = #scopes
        if (states.size() != this.scopes.size())
            isValid = false;
        // check whether we are in the right scope
        else if (!this.scopes.isEmpty()) {
            for (int i = 0; i < this.scopes.size(); ++i)
                if (!this.scopes.get(i).contains(states.get(i).getLineNumber()))
                    isValid = false;
        }
        if (isValid || this.scopes.isEmpty())
            this.value = this.expression.evaluate(states).toString();
        return this.value;
    }

    private void createTerm() throws DIbuggerLogicException {
    	ParseTree tree;
		try {
			CharStream input = CharStreams.fromString(this.specifier);
			WlangLexer lexer = new WlangLexer(input);
			lexer.removeErrorListeners();
			lexer.addErrorListener(new ActuallyHelpfulErrorListener());
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			WlangParser parser = new WlangParser(tokens);
			parser.removeErrorListeners();
			parser.addErrorListener(new ActuallyHelpfulErrorListener());
			// Chose start rule
			tree = parser.wecbterm();
		} catch (ActuallyHelpfulSyntaxException e) {
			throw new SyntaxException(e.getMessage());
		}
		TermGenerationVisitor visitor = new TermGenerationVisitor();
		this.expression = visitor.visit(tree);
    }

    public String getValue() {
        return value;
    }

    public String getSpecifier() {
        return specifier;
    }

    public List<ScopeTuple> getScopes() {
        return scopes;
    }
}
