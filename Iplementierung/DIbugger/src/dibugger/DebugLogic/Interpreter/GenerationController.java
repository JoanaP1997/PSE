package dibugger.DebugLogic.Interpreter;
/**
 * 
 * @author wagner
 *
 *
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class GenerationController {
    private Map<String,RoutineCommand> routines;
    private Stack<Scope> scopes;
    private TermValue returnValue; 
    
    private int maxIterations;
    private int maxFuncCalls;
    
    private int currentScopeCount;
    /**
     * Constructs a GenerationController Object with the given limitations.
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
   /* public TraceIterator generateTrace(String test, List<String> input) {
	 //Stack leeren
    }*/
    /**
     * Returns the current Scope during Runtime of TraceGeneration
     * @return
     */
    public Scope getCurrentScope() {
	Scope current = this.scopes.peek();
	return current;
    }
    public void pushScope(Scope scope) {
	//MaxFuncCall ueberpruefen
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
}
