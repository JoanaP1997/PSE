package dibugger.DebugLogic.Debugger;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dibugger.DebugLogic.Interpreter.ConditionalBreakpoint;
import dibugger.DebugLogic.Interpreter.ScopeTuple;
import dibugger.DebugLogic.Interpreter.WatchExpression;

/**
 * Heart of the Debug-Logic. The logic for start / stop / continue and all steps is in this class.
 * Additionally the creation of breakpoints and watch expressions are handled here.
 * @author Pascal
 *
 */
public class DebugControl {
	
	private Map<Integer, WatchExpression> map_watchExpressions;	
	private Map<Integer, ConditionalBreakpoint> map_condBreakpoints;
	private List<List<Breakpoint>> list_breakpoints;
	
//	private List<TraceIterator> list_traceIterator;
	
	private List<ProgramInput> list_programInput;
	
	
	private int maxIterations;
	private int maxFunctionCalls;
	
	public DebugControl(){
		
	}
	
	
	public void launchRun(List<ProgramInput> programs){
		//TODO
	}
	
	public void step(int type){
		//TODO
	}
	
	public void singleStep(int programID){
		//TODO
	}
	
	public void continueDebug(){
		//TODO
	}
	
	
	public void createWatchExpression(int id, String expr){
		map_watchExpressions.put(id, new WatchExpression(expr));
	}
	public void changewatchExpression(int id, String expr, List<ScopeTuple> scopes){
		WatchExpression e = map_watchExpressions.get(id);
		if(e!=null){
			e.change(expr, scopes);
		}
	}
	public void deleteWatchExpression(int id){
		map_watchExpressions.remove(id);
	}
	
	
	public void createCondBreakpoint(int id, String cond){
		map_condBreakpoints.put(id, new ConditionalBreakpoint(cond));
	}
	public void changeCondBreakpoint(int id, String cond, List<ScopeTuple> scopes){
		ConditionalBreakpoint cb = map_condBreakpoints.get(id);
		if(cb!=null){
			cb.change(cond, scopes);
		}
	}
	public void deleteCondBreakpoint(int id){
		map_condBreakpoints.remove(id);
	}
	
	
	public void createBreakpoint(int program, int line){
		while(list_breakpoints.size()<program){
			list_breakpoints.add(new ArrayList<Breakpoint>());
		}
		list_breakpoints.get(program).add(new Breakpoint(line, program));
	}
	public void deleteBreakpoint(int program, int line){
		List<Breakpoint> l = list_breakpoints.get(program);
		for(int i=0;i<l.size();++i){
			if(line==l.get(line).getLine()){
				l.remove(i);
				--i;
			}
		}
	}
	
	
	public void deleteAllBreakpoints(){
		list_breakpoints.clear();
	}
	
	
	public List<Integer> getProgramCounter(){
		List<Integer> l = new ArrayList<Integer>();
		for(int i=0;i<list_programInput.size();++i){
			l.add(list_programInput.get(i).getCounter());
		}
		return l;
	}
	
	
	public void setMaximumIterations(int count){
		this.maxIterations = count;
	}
	
	public void setMaximumFunctionCalls(int count){
		this.maxFunctionCalls = count;
	}
	
	//Step Types
	public static final int STEP_NORMAL = 0;
	public static final int STEP_OUT = 1;
	public static final int STEP_OVER = 2;
	public static final int STEP_BACK = 3;
}
