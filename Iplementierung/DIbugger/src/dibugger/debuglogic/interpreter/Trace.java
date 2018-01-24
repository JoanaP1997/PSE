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

    /**
     * Constructor for an empty trace.
     */
    public Trace() {
        this.traceStates = new ArrayList<TraceState>();
    }

    // TODO evtl. löschen - je nach Implementierungsentscheidung im
    // GenerationController
    // TODO entsprechend oben einen entsprechenden Konstruktor einfügen
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
