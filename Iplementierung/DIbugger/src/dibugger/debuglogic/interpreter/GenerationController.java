package dibugger.debuglogic.interpreter;
/**
 * 
 * @author wagner, scheler
 *
 *
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Stack;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;

import dibugger.debuglogic.antlrparser.ActuallyHelpfulErrorListener;
import dibugger.debuglogic.antlrparser.ActuallyHelpfulSyntaxException;
import dibugger.debuglogic.antlrparser.WlangLexer;
import dibugger.debuglogic.antlrparser.WlangParser;
import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.ExceededMaxFuncCallException;
import dibugger.debuglogic.exceptions.SyntaxException;

public class GenerationController {
    private Map<String, RoutineCommand> routines;
    private Stack<Scope> scopes;
    private TermValue returnValue;

    private int maxIterations;
    private int maxFuncCalls;

    private int currentScopeCount;

    private CommandGenerationVisitor commandGenerator;
    private TermGenerationVisitor termGenerator;

    /**
     * Constructs a GenerationController Object with the given limitations.
     * 
     * @param maxIterations
     * @param maxFuncCalls
     */
    public GenerationController(int maxIterations, int maxFuncCalls) {
        this.maxFuncCalls = maxFuncCalls;
        this.maxIterations = maxIterations;
        this.routines = new HashMap<String, RoutineCommand>();
        this.scopes = new Stack<Scope>();
        this.currentScopeCount = 0;
        this.returnValue = null;
    }

    /**
     * Generates a trace, consisting of all the states adopted during the run of
     * the program.
     * 
     * @param programText
     *            the code of the program.
     * @param input
     *            the input of the program given as a list of Strings e.g.
     *            "x=5".
     * @param programIdentifier
     *            the identifier of the program.
     * @return an iterator of the trace.
     * @throws DIbuggerLogicException
     *             if there is some syntactical or semantical error in the
     *             program.
     */
    public ListIterator<TraceState> generateTrace(String programText, List<String> input, String programIdentifier)
            throws DIbuggerLogicException {
        ParseTree mainTree;
        // create parsetree
        try {
            CharStream stream = CharStreams.fromString(programText);
            WlangLexer lexer = new WlangLexer(stream);
            // Setting our own error listener.
            lexer.removeErrorListeners();
            lexer.addErrorListener(new ActuallyHelpfulErrorListener());
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            WlangParser parser = new WlangParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(new ActuallyHelpfulErrorListener());
            mainTree = parser.program();
        } catch (ActuallyHelpfulSyntaxException e) {
            throw new SyntaxException(e.getMessage());
        }
        this.commandGenerator = new CommandGenerationVisitor(this);
        this.termGenerator = new TermGenerationVisitor();

        int childCount = mainTree.getChildCount();

        // add names of routines and routine commands to the map "routines"
        for (int i = 0; i < childCount; i++) {
            ParseTree childTree = mainTree.getChild(i);
            RoutineCommand command = (RoutineCommand) commandGenerator.visit(childTree);
            this.routines.put(command.getName(), command);
        }

        // initialize scope stack
        Scope firstScope = new Scope();
        scopes.push(firstScope);

        
        //remove empty strings
        if(input != null) {
        	for(int i = 0; i < input.size();++i) {
            	if(input.get(i).isEmpty()) {
            		input.remove(i);
            		--i;
            	}
            }
        }
        // run main routine
        RoutineCommand mainRoutine = routines.get("main");
        ArrayList<Term> args = new ArrayList<Term>();
        List<Type> expectedTypes = mainRoutine.getExpectedTypes();
        List<String> identifiers = mainRoutine.getIdentifiersOfArgs();
        for (int i = 0; i < identifiers.size(); ++i) {
            // add argument to args
            String id = identifiers.get(i);
            // find this id in the users input
            boolean found = false;
            for (String s : input) {
            	if (getIdentifierOfInput(s).equals(id)) {
                    args.add(getTermFromInput(s));
                    found = true;
                }
            }
            if (!found) { // then there is no input for this parameter
                args.add(getDefaultTerm(expectedTypes.get(i)));
            }
        }

        mainRoutine.setArgs(args);
        List<TraceState> traceStates = mainRoutine.run();
        Trace trace = new Trace(traceStates, programIdentifier);

        // return iterator over trace
        return trace.iterator();
    }

    /**
     * Returns the identifier of an input string.
     * 
     * @param s
     *            the input string
     * @return the identifier of the input string
     * @throws DIbuggerLogicException
     */
    private String getIdentifierOfInput(String s) throws DIbuggerLogicException {
        if (!s.contains("=")) {
            throw new SyntaxException("Input in wrong format: Something like x = 5 expected.");
        }
        // delete all whitespaces
        String newString = s.replaceAll("\\s", "");
        return newString.split("=")[0];
    }

    /**
     * Returns the default value of a type.
     * 
     * @param type
     *            the type
     * @return the default value of a type
     */
    private Term getDefaultTerm(Type type) {
        return type.getDefault();
    }

    /**
     * Returns the current Scope during Runtime of TraceGeneration.
     * 
     * @return the scope.
     */
    public Scope getCurrentScope() {
        Scope current = this.scopes.peek();
        return current;
    }

    /**
     * Pushes a scope on the top of the runtimestack.
     * 
     * @param scope
     *            the new scope.
     * @throws DIbuggerLogicException
     *             if the maximum functioncalls are exceeded.
     */
    public void pushScope(Scope scope) throws DIbuggerLogicException {
        if (this.currentScopeCount < this.maxFuncCalls) {
            this.scopes.push(scope);
            this.currentScopeCount++;
        } else
            throw new ExceededMaxFuncCallException(-1);
    }

    /**
     * Pops a scope from the stack.
     * 
     * @return the top of the scopestack.
     */
    public Scope popScope() {
        this.currentScopeCount--;
        return this.scopes.pop();
    }

    /**
     * Sets the return value of the last functionreturn.
     * 
     * @param value
     *            the return value.
     */
    public void setReturnValue(TermValue value) {
        this.returnValue = value;
    }

    /**
     * Returns the return value of the last functionreturn.
     * 
     * @return the return value.
     */
    public TermValue getReturnValue() {
        return this.returnValue;
    }

    /**
     * Returns the Routinecommand belonging to the routine with the given name.
     * 
     * @param routine
     *            the name of the routine.
     * @return the routinecommand.
     */
    public RoutineCommand getRoutineRootCommand(String routine) {
        return this.routines.get(routine);
    }

    /**
     * Sets the maximum number of iterations allowed during the program run.
     * 
     * @param maxIterations
     *            the maximum number of iterations.
     */
    public void setMaxIterations(int maxIterations) {
        this.maxIterations = maxIterations;
    }

    /**
     * Returns the number of maximum iterations allowed in the program run.
     * 
     * @return the maximum iterations.
     */
    public int getMaxIterations() {
        return this.maxIterations;
    }

    /**
     * Sets the maximum number of function calls (total) allowed during the
     * program run.
     * 
     * @param maxFuncCalls
     *            the maximum number of function calls
     */
    public void setMaxFuncCalls(int maxFuncCalls) {
        this.maxFuncCalls = maxFuncCalls;
    }

    /**
     * Returns the maximum number of function calls (total) allowed during the
     * program run.
     * 
     * @return the maximum number of function calls
     */
    public int getMaxFuncCalls() {
        return this.maxFuncCalls;
    }

    /**
     * Turns an input string into a Term.
     * 
     * @param input
     *            the input string
     * @return the Term
     * @throws DIbuggerLogicException
     */
    private Term getTermFromInput(String input) throws DIbuggerLogicException {
        if (!input.contains("=")) {
            throw new SyntaxException("Input in wrong format: Something like x = 5 expected.");
        }
        // delete all whitespaces
        String newString = input.replaceAll("\\s", "");
        newString = newString.split("=")[1];

        // create parse tree
        ParseTree tree;
        try {
            CharStream stream = CharStreams.fromString(newString);
            WlangLexer lexer = new WlangLexer(stream);
            lexer.removeErrorListeners();
            lexer.addErrorListener(new ActuallyHelpfulErrorListener());
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            WlangParser parser = new WlangParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(new ActuallyHelpfulErrorListener());
            tree = parser.inputparameter();
        } catch (ActuallyHelpfulSyntaxException e) {
            throw new SyntaxException(e.getMessage());
        }
        return termGenerator.visit(tree);

    }
}
