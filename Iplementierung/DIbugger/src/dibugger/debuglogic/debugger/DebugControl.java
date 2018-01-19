package dibugger.debuglogic.debugger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.interpreter.ConditionalBreakpoint;
import dibugger.debuglogic.interpreter.GenerationController;
import dibugger.debuglogic.interpreter.ScopeTuple;
import dibugger.debuglogic.interpreter.TraceState;
import dibugger.debuglogic.interpreter.TraceStatePosition;
import dibugger.debuglogic.interpreter.WatchExpression;
import dibugger.debuglogic.interpreter.Trace.TraceIterator;
import dibugger.filehandler.facade.ConfigurationFile.IntTuple;

/**
 * Heart of the Debug-Logic. The logic for start / stop / continue and all steps is in this class.
 * Additionally the creation of breakpoints and watch expressions is handled here.
 * @author Pascal
 *
 */
public class DebugControl {
	
	private static final int DEF_IT = 100;
	private static final int DEF_MAX_FUNC_CALLS = 100;
	
	private List<WatchExpression> list_watchExpressions;	
	private List<ConditionalBreakpoint> list_condBreakpoints;
	private List<List<Breakpoint>> list_breakpoints;
	
	private List<TraceIterator> list_traceIterator;
	private List<TraceState> list_currentTraceStates;
	
	private List<ProgramInput> list_programInput;
	
	private List<Integer> list_stepSize;
	
	private int maxIterations = DEF_IT;
	private int maxFunctionCalls = DEF_MAX_FUNC_CALLS;
	
	private int programCount=0;
	
	//interpreter objects
	private GenerationController generationController;
	
	/**
	 * Creates a new debugControl without programs, watch expressions or breakpoints and default values
	 */
	public DebugControl(){
		list_watchExpressions = new ArrayList<WatchExpression>();
		list_condBreakpoints = new ArrayList<ConditionalBreakpoint>();
		list_breakpoints = new ArrayList<List<Breakpoint>>();
		
		list_traceIterator = new ArrayList<TraceIterator>();
		list_currentTraceStates = new ArrayList<TraceState>();
		
		list_programInput = new ArrayList<ProgramInput>();
		
		list_stepSize = new ArrayList<Integer>();
		
		generationController = new GenerationController(DEF_IT, DEF_MAX_FUNC_CALLS);
	}
	
	/**
	 * Launches the Debug Mode with a given List of programs.
	 * @param programs the programs to run
	 */
	public void launchRun(List<ProgramInput> programs){
		list_traceIterator.clear();
		
		generationController.setMaxFuncCalls(maxFunctionCalls);
		generationController.setMaxIterations(maxIterations);
		for(int i=0;i<programs.size();++i){
			ProgramInput pi = programs.get(i);
			list_traceIterator.add(generationController.generateTrace(pi.getText(), pi.getInputValues()));
			jumpTraceIterator(i, pi.getCounter());
		}
		
		list_programInput = programs;
		programCount = programs.size();
	}
	
	/**
	 * Executes a step defined by a given step type.
	 * @param type the type of the step (STEP_NORMAL,STEP_OVER,STEP_OUT,STEP_BACK)
	 */
	public void step(int type) throws DIbuggerLogicException{
		if(type==STEP_NORMAL || type==STEP_BACK){
			int maxSteps = getMaximumOfList(list_stepSize);	
			for(int stepID=0;stepID<maxSteps;++stepID){
				//Do step in all programs
				boolean breakpointFound=false;
				for(int i=0;i<programCount;++i){
					int cpss = list_stepSize.get(i);
					if(stepID<cpss){
						//do step in program
						singleStepNoEvaluation(i, type);
					}
					//evaluate breakpoints
					breakpointFound = !breakpointFound ? evaluateBreakpoints(i) : true;
				}
				//evaluate conditional breakpoints
				breakpointFound = !breakpointFound ? evaluateConditionalBreakpoints() : true;
				if(breakpointFound){
					stepID=maxSteps;
				}
			}
		}
		else if(type==STEP_OUT){
			boolean[] breaked = new boolean[programCount];
			boolean forceStop = false;
			//infinite loop till end of function
			while(!checkBoolArrayOnValue(breaked, true) && !forceStop){
				boolean breakpointFound=false;
				for(int i=0;i<programCount;++i){
					if(!breaked[i]){
						singleStepNoEvaluation(i, STEP_NORMAL);
						TraceState state = list_currentTraceStates.get(i);
						breakpointFound = !breakpointFound ? evaluateBreakpoints(i) : true;
						//only stop stepping when trace state is after a return call
						if(breakpointFound || state.getPosition()==TraceStatePosition.AFTERRETURN){
							breaked[i]=true;
						}
					}
				}
				breakpointFound = evaluateConditionalBreakpoints();
				if(breakpointFound){
					forceStop=true;
				}
			}
		}
		else if(type==STEP_OVER){
			int[] inline = new int[programCount];
			boolean[] breaked = new boolean[programCount];
			boolean first=true;
			boolean forceStop = false;
			while(!checkBoolArrayOnValue(breaked, true) && !forceStop){
				boolean breakpointFound=false;
				for(int i=0;i<programCount;++i){
					if(!breaked[i]){
						singleStepNoEvaluation(i, STEP_NORMAL);
						TraceState state = list_currentTraceStates.get(i);
						if(state.getPosition()==TraceStatePosition.AFTERFUNCCALL){
							++inline[i];
						}
						else if(first){
							breaked[i]=true;
						}
						breakpointFound = !breakpointFound ? evaluateBreakpoints(i) : true;
						if(breakpointFound){
							breaked[i]=true;
						}
						//only stop stepping when trace state is after the outer most return call
						else if(state.getPosition()==TraceStatePosition.AFTERRETURN){
							if(inline[i]==1){
								breaked[i]=true;
							}
							else{
								--inline[i];
							}
						}
					}
				}
				breakpointFound = evaluateConditionalBreakpoints();
				if(breakpointFound){
					forceStop=true;
				}
				first=false;
			}
		}
	}
	
	/**
	 * Executes a normal step in a given program with size 1
	 * @param programID the program to do a step
	 */
	public void singleStep(int programID){
		singleStepNoEvaluation(programID, STEP_NORMAL);
	}
	/**
	 * Executes a single step without evaluating breakpoints
	 * @param programID
	 */
	private void singleStepNoEvaluation(int programID, int direction){
		while(list_currentTraceStates.size()<programID){
			list_currentTraceStates.add(null);
		}
		TraceIterator it = list_traceIterator.get(programID);
		if((direction==STEP_NORMAL || direction==STEP_OVER || direction==STEP_OUT) && it.hasNext()){
			list_currentTraceStates.set(programID, it.next());
			list_programInput.get(programID).setCounter(list_programInput.get(programID).getCounter()+1);
		}
		else if(direction==STEP_BACK && it.hasPrev()){
			list_currentTraceStates.set(programID, it.prev());
			list_programInput.get(programID).setCounter(list_programInput.get(programID).getCounter()-1);
		}
	}
	
	private void jumpTraceIterator(int programID, int numberOfIterations){
		for(int i=0;i<numberOfIterations;++i){
			if(list_traceIterator.get(i).hasNext()){
				list_traceIterator.get(programID).next();
			}
		}
	}
	
	private boolean evaluateBreakpoints(int programID){
		TraceState state = list_currentTraceStates.get(programID);
		for(Breakpoint bp : list_breakpoints.get(programID)){
			if(bp.getLine()==state.getLineNumber()){
				return true;
			}
		}
		return false;
	}
	private boolean evaluateConditionalBreakpoints() throws DIbuggerLogicException{
		for(int i=0;i<list_condBreakpoints.size();++i){
			ConditionalBreakpoint cb = list_condBreakpoints.get(i);
			if(cb.evaluate(list_currentTraceStates)){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Continues the Debugging / Stepping in all programs until a Breakpoint or Conditional Breakpoint is reached.
	 */
	public void continueDebug() throws DIbuggerLogicException{
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
		while(list_watchExpressions.size()<id){
			list_watchExpressions.add(new WatchExpression(""));
		}
		list_watchExpressions.set(id, new WatchExpression(expr));
		//TODO add default Scope
	}
	/**
	 * changes the watch expression with a given id
	 * @param id the id of the watch expression to change
	 * @param expr the new expression
	 * @param scopes a list of scopes for the new watch expression
	 */
	public void changeWatchExpression(int id, String expr, List<ScopeTuple> scopes){
		WatchExpression e = list_watchExpressions.get(id);
		if(e!=null){
			e.change(expr, scopes);
		}
	}
	/**
	 * Deletes the watch expression with a given id
	 * @param id the id of the watch expression
	 */
	public void deleteWatchExpression(int id){
		list_watchExpressions.remove(id);
	}
	
	/**
	 * creates a new conditional breakpoint
	 * @param id the id of the breakpoint
	 * @param cond the condition of the breakpoint
	 */
	public void createCondBreakpoint(int id, String cond){
		list_condBreakpoints.add(id, new ConditionalBreakpoint(cond));
		//TODO default scope
	}
	/**
	 * changes the conditional breakpoint with a given id
	 * @param id the id of the breakpoint to change
	 * @param cond the condition of the breakpoint
	 * @param scopes a list of all scopes
	 */
	public void changeCondBreakpoint(int id, String cond, List<ScopeTuple> scopes){
		ConditionalBreakpoint cb = list_condBreakpoints.get(id);
		if(cb!=null){
			cb.change(cond, scopes);
		}
	}
	/**
	 * deletes the breakpoint with a given id
	 * @param id the id of the breakpoint
	 */
	public void deleteCondBreakpoint(int id){
		list_condBreakpoints.remove(id);
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
		list_watchExpressions.clear();
		list_condBreakpoints.clear();
		
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
	 * @return a list of integers representing all programCounters
	 */
	public List<Integer> getProgramCounter(){
		List<Integer> l = new ArrayList<Integer>();
		for(int i=0;i<programCount;++i){
			l.add(list_programInput.get(i).getCounter());
		}
		return l;
	}
	
	/**
	 * Getter for the current line of all programs
	 * @return a list countaining the current execution line of all programs
	 */
	public List<Integer> getCurrentExecutionLines(){
		List<Integer> l = new ArrayList<Integer>();
		for(int i=0;i<programCount;++i){
			l.add(list_currentTraceStates.get(i).getLineNumber());
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
	
	//Getter
	/**
	 * 
	 * @return the amount of conditional breakpoints
	 */
	public int getWatchExpressionSize(){
		return list_watchExpressions.size();
	}
	/**
	 * 
	 * @return a list containing all expression of the watch expressions
	 */
	public List<String> getWatchExpressions(){
		List<String> l = new ArrayList<String>();
		for(int i=0;i<list_watchExpressions.size();++i){
			l.add(list_watchExpressions.get(i).getSpecifier());
		}
		return l;
	}
	/**
	 * Getter for the Scope Begin of a given Watch Expression
	 * @param expressionID the id of the expression
	 * @return a List containing all Scope begins for the given watch expression.
	 */
	public List<Integer> getWEScopeBegin(int expressionID){
		List<Integer> l = new ArrayList<Integer>();
		for(ScopeTuple it : list_watchExpressions.get(expressionID).getScopes()){
			l.add(it.getStartLine());
		}
		return l;
	}
	/**
	 * Getter for the Scope End of a given Watch Expression
	 * @param expressionID the id of the expression
	 * @return a List containing all Scope ends for the given watch expression.
	 */
	public List<Integer> getWEScopeEnd(int expressionID){
		List<Integer> l = new ArrayList<Integer>();
		for(ScopeTuple it : list_watchExpressions.get(expressionID).getScopes()){
			l.add(it.getEndLine());
		}
		return l;
	}
	/**
	 * Getter for the value of a watch expression
	 * @param expressionID the id of the expression
	 * @return the current Value of the expression
	 * @throws DIbuggerLogicException {@linkplain WatchExpression#evaluate(List)}
	 */
	public String getWEValue(int expressionID) throws DIbuggerLogicException{
		return list_watchExpressions.get(expressionID).evaluate(list_currentTraceStates);
	}
	
	/**
	 * 
	 * @return the amount of conditional breakpoints
	 */
	public int getConditionalBreakpointSize(){
		return list_condBreakpoints.size();
	}
	/**
	 * 
	 * @return a list containing all conditions of the conditional breakpoints
	 */
	public List<String> getConditionalBreakpoints(){
		List<String> l = new ArrayList<String>();
		for(int i=0;i<list_condBreakpoints.size();++i){
			l.add(list_condBreakpoints.get(i).getSpecifier());
		}
		return l;
	}
	/**
	 * Getter for the Scope Begin of a given Conditional Breakpoint
	 * @param expressionID the id of the expression
	 * @return a List containing all Scope begins for the given conditional breakpoint.
	 */
	public List<Integer> getCBScopeBegin(int expressionID){
		List<Integer> l = new ArrayList<Integer>();
		for(ScopeTuple it : list_condBreakpoints.get(expressionID).getScopes()){
			l.add(it.getStartLine());
		}
		return l;
	}
	/**
	 * Getter for the Scope end of a given Conditional Breakpoint
	 * @param expressionID the id of the expression
	 * @return a List containing all Scope ends for the given conditional breakpoint.
	 */
	public List<Integer> getCBScopeEnd(int expressionID){
		List<Integer> l = new ArrayList<Integer>();
		for(ScopeTuple it : list_condBreakpoints.get(expressionID).getScopes()){
			l.add(it.getEndLine());
		}
		return l;
	}
	/**
	 * Getter for the value of a conditional breakpoint
	 * @param breakpointID the id of the conditional breakpoint
	 * @return the current Value of the condition
	 * @throws DIbuggerLogicException {@linkplain ConditionalBreakpoint#evaluate(List)}
	 */
	public boolean getCBValue(int breakpointID) throws DIbuggerLogicException{
		return list_condBreakpoints.get(breakpointID).evaluate(list_currentTraceStates);
	}
	
	//private helper methods
	private int getMaximumOfList(List<Integer> l){
		int max=0;
		for(int i=0;i<l.size();++i){
			max = Math.max(max, l.get(i));
		}
		return max;
	}
	
	private boolean checkBoolArrayOnValue(boolean[] array, boolean value){
		for(int i=0;i<array.length;++i){
			if(array[i]!=value){
				return false;
			}
		}
		return true;
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
