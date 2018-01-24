package dibugger.debuglogic.interpreter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * A trace of a program. Consists of trace states.
 * 
 * @author scheler
 *
 */
public class Trace {

    private List<TraceState> traceStates;
    private String programId;

    /**
     * Constructor for a Trace.
     * @param programId the id of the program the TraceState corresponds to
     */
    public Trace(List<TraceState> traceStates, String programId) {
        this.traceStates = traceStates;
        this.programId = programId;
    }

    /**
     * Attaches a trace state to the end of the trace.
     * 
     * @param traceState
     *            the trace state
     */
    public void appendTraceState(TraceState traceState) {
        this.traceStates.add(traceState);
    }

    public ListIterator<TraceState> iterator() {
        return this.traceStates.listIterator();
    }
    
}
