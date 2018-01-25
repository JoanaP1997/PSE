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

	public ListIterator<TraceState> generateTrace(String programText, List<String> input, String programIdentifier)
			throws DIbuggerLogicException {
		// create parsetree
		CharStream stream = CharStreams.fromString(programText);
		WlangLexer lexer = new WlangLexer(stream);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		WlangParser parser = new WlangParser(tokens);
		ParseTree mainTree;
		try {
			mainTree = parser.program();
		} catch (RecognitionException re) {
			throw new SyntaxException(re.getExpectedTokens().toString());
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

	private String getIdentifierOfInput(String s) throws DIbuggerLogicException {
		if (!s.contains("=")) {
			throw new SyntaxException("Input in wrong format: Something like x = 5 expected.");
		}
		// delete all whitespaces
		String newString = s.replaceAll("\\s", "");
		return newString.split("=")[0];
	}

	private Term getDefaultTerm(Type type) {
		return type.getDefault();
	}

	/**
	 * Returns the current Scope during Runtime of TraceGeneration
	 * 
	 * @return
	 */
	public Scope getCurrentScope() {
		Scope current = this.scopes.peek();
		return current;
	}

	public void pushScope(Scope scope) throws DIbuggerLogicException {
		if (this.currentScopeCount < this.maxFuncCalls) {
			this.scopes.push(scope);
			this.currentScopeCount++;
		}
		else throw new ExceededMaxFuncCallException(-1);
	}

	public Scope popScope() {
		this.currentScopeCount--;
		return this.scopes.pop();
	}

	public void setReturnValue(TermValue value) {
		this.returnValue = value;
	}

	public TermValue getReturnValue() {
		return this.returnValue;
	}

	public RoutineCommand getRoutineRootCommand(String routine) {
		return this.routines.get(routine);
	}

	public void setMaxIterations(int maxIterations) {
		this.maxIterations = maxIterations;
	}

	public int getMaxIterations() {
		return this.maxIterations;
	}

	public void setMaxFuncCalls(int maxFuncCalls) {
		this.maxFuncCalls = maxFuncCalls;
	}

	public int getMaxFuncCalls() {
		return this.maxFuncCalls;
	}

	private Term getTermFromInput(String input) throws DIbuggerLogicException {
		if (!input.contains("=")) {
			throw new SyntaxException("Input in wrong format: Something like x = 5 expected.");
		}
		// delete all whitespaces
		String newString = input.replaceAll("\\s", "");
		newString = newString.split("=")[1];

		// create parse tree
		CharStream stream = CharStreams.fromString(newString);
		WlangLexer lexer = new WlangLexer(stream);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		WlangParser parser = new WlangParser(tokens);
		ParseTree tree = parser.term();
		return termGenerator.visit(tree);

	}
}
