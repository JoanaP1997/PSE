package dibugger.DebugLogic.Debugger;

import java.util.List;

/**
 * Heart of the Debug-Logic. The logic for start / stop / continue and all steps is in this class.
 * Additionally the creation of breakpoints and watch expressions are handled here.
 * @author Pascal
 *
 */
public class DebugControl {
	
	private List<null> list_watchExpressions;	
	private List<null> list_condBreakpoints;
	private List<List<Breakpoint>> list_breakpoints;
	
	private List<null> list_traceIterator;
	
	private List<ProgramInput> list_programInput;
	
	
	private int maxIterations;
	private int maxFunctionCalls;
	
	
	//Step Types
	public static final int STEP_NORMAL = 0;
	public static final int STEP_OUT = 1;
	public static final int STEP_OVER = 2;
	public static final int STEP_BACK = 3;
}
