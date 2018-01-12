package dibugger.DebugLogic.Interpreter;

/**
 * Positions where a trace state can possibly located regarding its position in
 * a trace.
 *
 * @author scheler
 *
 */
public enum TraceStatePosition {

	/**
	 * The command previous to the one this trace state is corresponding to, is a return statement. Relevant for "Step Out".
	 */
	AFTERRETURN,
	/**
	 * The command previous to the one this trace state is corresponding to, is a function call. Relevant for "Step Over".
	 */
	AFTERFUNCCALL,
	
	/**
	 * All other types of previous commands.
	 */
	NOTSPECIAL;

}
