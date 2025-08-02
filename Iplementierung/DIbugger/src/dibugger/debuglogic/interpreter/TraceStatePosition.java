package dibugger.debuglogic.interpreter;

/**
 * Where a trace state can possibly be located regarding its position in a
 * trace.
 *
 * @author scheler
 *
 */
public enum TraceStatePosition {

    /**
     * The state after the execution of the last command in a function call.
     * Relevant for "Step Out" and "Step Over".
     */
    AFTERRETURN,

    /**
     * The state after the command that calls a function;
     * Relevant for "Step Over" in recursive functions.
     */
    AFTERFUNCCALL,

    /**
     * All other states.
     */
    NOTSPECIAL;

}
