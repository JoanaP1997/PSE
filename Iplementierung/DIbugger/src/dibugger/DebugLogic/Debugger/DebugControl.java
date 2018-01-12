package dibugger.DebugLogic.Debugger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dibugger.DebugLogic.Interpreter.ConditionalBreakpoint;
import dibugger.DebugLogic.Interpreter.ScopeTuple;
import dibugger.DebugLogic.Interpreter.TraceIterator;
import dibugger.DebugLogic.Interpreter.WatchExpression;

/**
 * Heart of the Debug-Logic. The logic for start / stop / continue and all steps is in this class.
 * Additionally the creation of breakpoints and watch expressions is handled here.
 * @author Pascal
 *
 */
public class DebugControl {
	
	private static final int DEF_IT = 100;
	private static final int DEF_MAX_FUNC_CALLS = 100;
	
	private Map<Integer, WatchExpression> map_watchExpressions;	
	private Map<Integer, ConditionalBreakpoint> map_condBreakpoints;
	private List<List<Breakpoint>> list_breakpoints;
	
	private List<TraceIterator> list_traceIterator;
	
	private List<ProgramInput> list_programInput;
	
	private List<Integer> list_stepSize;
	
	private int maxIterations = DEF_IT;
	private int maxFunctionCalls = DEF_MAX_FUNC_CALLS;
	
	private int programCount=0;
	
	/**
	 * Creates a new debugControl without programs, watch expressions or breakpoints and default values
	 */
	public DebugControl(){
		map_watchExpressions = new HashMap<Integer, WatchExpression>();
		map_condBreakpoints = new HashMap<Integer, ConditionalBreakpoint>();
		list_breakpoints = new ArrayList<List<Breakpoint>>();
		
//		list_traceIterator = new ArrayList<TraceIterator>();
		
		list_programInput = new ArrayList<ProgramInput>();
		
		list_stepSize = new ArrayList<Integer>();
	}
	
	/**
	 * Launches the Debug Mode with a given List of programs.
	 * @param programs the programs to run
	 */
	public void launchRun(List<ProgramInput> programs){
		//TODO
		
		programCount = programs.size();
	}
	
	/**
	 * Executes a step defined by a given step type.
	 * @param type the type of the step (STEP_NORMAL,STEP_OVER,STEP_OUT,STEP_BACK)
	 */
	public void step(int type){
		//TODO
	}
	
	/**
	 * Executes a normal step in a given program with size 1
	 * @param programID the progeam to do a step
	 */
	public void singleStep(int programID){
		//TODO
	}
	
	/**
	 * Continues the Debugging / Stepping in all programs until a Breakpoint or Conditional Breakpoint is reached.
	 */
	public void continueDebug(){
		//TODO
		for(int i=0;i<programCount;++i){
			step(STEP_NORMAL);
			//TODO check breakpoints / cond breakpoints
		}
	}
	
	/**
	 * Creates a new watch expression
	 * @param id the id of the watch expression
	 * @param expr the expression of the watch expression
	 */
	public void createWatchExpression(int id, String expr){
		map_watchExpressions.put(id, new WatchExpression(expr));
		//TODO default Scope hinzuf�gen
	}
	/**
	 * changes the watch expression with a given id
	 * @param id the id of the watch expression to change
	 * @param expr the new expression
	 * @param scopes a list of scopes for the new watch expression
	 */
	public void changeWatchExpression(int id, String expr, List<ScopeTuple> scopes){
		WatchExpression e = map_watchExpressions.get(id);
		if(e!=null){
			e.change(expr, scopes);
		}
	}
	/**
	 * Deletes the watch expression with a given id
	 * @param id the id of the watch expression
	 */
	public void deleteWatchExpression(int id){
		map_watchExpressions.remove(id);
	}
	
	/**
	 * creates a new conditional breakpoint
	 * @param id the id of the breakpoint
	 * @param cond the condition of the breakpoint
	 */
	public void createCondBreakpoint(int id, String cond){
		map_condBreakpoints.put(id, new ConditionalBreakpoint(cond));
		//TODO default scope
	}
	/**
	 * changes the conditional breakpoint with a given id
	 * @param id the id of the breakpoint to change
	 * @param cond the condition of the breakpoint
	 * @param scopes a list of all scopes
	 */
	public void changeCondBreakpoint(int id, String cond, List<ScopeTuple> scopes){
		ConditionalBreakpoint cb = map_condBreakpoints.get(id);
		if(cb!=null){
			cb.change(cond, scopes);
		}
	}
	/**
	 * deletes the breakpoint with a given id
	 * @param id the id of the breakpoint
	 */
	public void deleteCondBreakpoint(int id){
		map_condBreakpoints.remove(id);
	}
	
	/**
	 * creates a new breakpoint in a given program and line
	 * @param program the programID to create the breakpoint in
	 * @param line the line where the breakpoint should be
	 */
	public void createBreakpoint(int program, int line){
		while(list_breakpoints.size()<program-1){
			list_breakpoints.add(new ArrayList<Breakpoint>());
		}
		list_breakpoints.get(program).add(new Breakpoint(line, program));
	}
	/**
	 * deletes a breakpoint in a given proogram and line
	 * @param program the program to search in
	 * @param line the line to delete the breakpoint from
	 */
	public void deleteBreakpoint(int program, int line){
		List<Breakpoint> l = list_breakpoints.get(program);
		for(int i=0;i<l.size();++i){
			if(line==l.get(line).getLine()){
				l.remove(i);
				--i;
			}
		}
	}
	
	/**
	 * Deletes all Breakpoints in all programs
	 */
	public void deleteAllBreakpoints(){
		list_breakpoints.clear();
	}
	
	/**
	 * Resets the DebugControl to an empty instance containing default values
	 */
	public void reset(){
		list_breakpoints.clear();
		list_stepSize.clear();
		list_programInput.clear();
		list_traceIterator.clear();
		map_watchExpressions.clear();
		map_condBreakpoints.clear();
		
		maxIterations = DEF_IT;
		maxFunctionCalls = DEF_MAX_FUNC_CALLS;
	}
	
	/**
	 * Sets the stepsize of a program
	 * @param programID the program to change the stepsize
	 * @param stepSize the new stepsize to use while debugging
	 */
	public void setStepSize(int programID, int stepSize){
		while(list_stepSize.size()<programID-1){
			list_stepSize.add(1);
		}
		list_stepSize.set(programID, stepSize);
	}
	
	/**
	 * Getter for the current programCounter of all programs
	 * @return list of integers representing all programCounters
	 */
	public List<Integer> getProgramCounter(){
		List<Integer> l = new ArrayList<Integer>();
		for(int i=0;i<programCount;++i){
			l.add(list_programInput.get(i).getCounter());
		}
		return l;
	}
	
	
	/**
	 * Sets the maximum iteration count for loops (example: while loop)
	 * @param count the new maximum value
	 */
	public void setMaximumIterations(int count){
		this.maxIterations = count;
	}
	
	/**
	 * Sets the maximum iteration count for recursive function calls
	 * @param count the new maximum value
	 */
	public void setMaximumFunctionCalls(int count){
		this.maxFunctionCalls = count;
	}
	
	//Step Types
	/**
	 * Indicator for a normal single step with the size of the defined stepsize
	 */
	public static final int STEP_NORMAL = 0;
	/**
	 * Indicator for a step out of the current function
	 */
	public static final int STEP_OUT = 1;
	/**
	 * Indicator for a step past the next function while executing it
	 */
	public static final int STEP_OVER = 2;
	/**
	 * Indicator for a step back with the size 1 (steps back 1 command)
	 */
	public static final int STEP_BACK = 3;
}
