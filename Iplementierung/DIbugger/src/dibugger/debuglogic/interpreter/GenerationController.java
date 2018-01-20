package dibugger.debuglogic.interpreter;
/**
 * 
 * @author wagner
 *
 *
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

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

  public TraceIterator generateTrace(String programText, List<String> input) {
    return null;
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
    // MaxFuncCall ueberpruefen
    this.scopes.push(scope);
  }

  public Scope popScope() {
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
}
