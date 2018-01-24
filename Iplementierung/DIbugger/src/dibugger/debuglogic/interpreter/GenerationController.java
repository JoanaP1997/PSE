package dibugger.debuglogic.interpreter;
/**
 * 
 * @author wagner
 *
 *
 */

import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Stack;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import dibugger.debuglogic.antlrparser.WlangLexer;
import dibugger.debuglogic.antlrparser.WlangParser;
import dibugger.debuglogic.interpreter.Trace.TraceIterator;

public class GenerationController {
  private Map<String, RoutineCommand> routines;
  private Stack<Scope> scopes;
  private TermValue returnValue;

  private int maxIterations;
  private int maxFuncCalls;

  private int currentScopeCount;

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

  public ListIterator<TraceState> generateTrace(String programText, List<String> input, String programIdentifier) {
    // TODO split texts into routines?
    // hand program text and inputs to the AntlrParser
    
    CharStream stream = CharStreams.fromString(programText);
    WlangLexer lexer = new WlangLexer(stream);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    WlangParser parser = new WlangParser(tokens);
    ParseTree mainTree = parser.program();
    CommandGenerationVisitor commandGenerator = new CommandGenerationVisitor(this);
    TermGenerationVisitor termGenerator = new TermGenerationVisitor();
    
    // 
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
    

    // = mainTree.accept(commandGenerator);
    
    // run main routine
    RoutineCommand mainRoutine = routines.get("main");
   // mainRoutine.
    
  //  for ()
    
  //  mainRoutine.setArgs(args);
    List<TraceState> traceStates = mainRoutine.run();
    Trace trace = new Trace(traceStates, programIdentifier);
    
     
    // return iterator over trace
    return trace.iterator(); 
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

  public void pushScope(Scope scope) {
    if (this.currentScopeCount < this.maxFuncCalls) {
      this.scopes.push(scope);
      this.currentScopeCount++;
    }
    // else: Warnung-->Exception
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

  public void setMaxFuncCalls(int maxFuncCalls) {
    this.maxFuncCalls = maxFuncCalls;
  }
  
  private TermValue getTermFromString(String input) {
    // TODO implement
    return null;
  }
}
