/**
 * 
 */
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
import dibugger.debuglogic.exceptions.ConditionalBreakpointSyntaxException;
import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.SyntaxException;

/**
 * @author wagner
 *
 */
public class ConditionalBreakpoint {
    private boolean value;
    private String specifier;
    private List<ScopeTuple> scopes;
    private Term condition;

    public ConditionalBreakpoint(String specifier) throws DIbuggerLogicException {
        this.specifier = specifier;
        this.scopes = new ArrayList<ScopeTuple>();
        this.value = false;
        this.createTerm();

    }

    public ConditionalBreakpoint(String specifier, List<ScopeTuple> scopes) throws DIbuggerLogicException {
        this.specifier = specifier;
        this.scopes = scopes;
        this.value = false;
        this.createTerm();
    }

    public void change(String specifier, List<ScopeTuple> scopes) throws DIbuggerLogicException {
        this.specifier = specifier;
        this.scopes = scopes;
        this.createTerm();
    }

    public boolean evaluate(List<TraceState> states) throws DIbuggerLogicException {
        boolean isValid = true;
        // check wether #states = #scopes
        if (states.size() != this.scopes.size())
            isValid = false;
        // check wether we are in the right scope
        else if (!this.scopes.isEmpty()) {
            for (int i = 0; i < this.scopes.size(); ++i)
                if (!this.scopes.get(i).contains(states.get(i).getLineNumber()))
                    isValid = false;
        }
        if (isValid || this.scopes.isEmpty()) {
            TermValue result = this.condition.evaluate(states);
            if (result.getType() == Type.BOOLEAN) {
                return ((BooleanValue) result).getValue();
            }
            this.value = false;
        }
        TermValue result = this.condition.evaluate(states);
        if (result.getType() == Type.BOOLEAN) {
            return ((BooleanValue) result).getValue();
        }
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
            throw new ConditionalBreakpointSyntaxException(e.getMessage());
        }
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        this.condition = visitor.visit(tree);
    }

    public String getSpecifier() {
        return specifier;
    }

    public List<ScopeTuple> getScopes() {
        return scopes;
    }

    public boolean isValue() {
        return value;
    }
}
