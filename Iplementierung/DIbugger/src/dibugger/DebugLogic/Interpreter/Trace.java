package dibugger.DebugLogic.Interpreter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
	
	// TODO evtl. löschen - je nach Implementierungsentscheidung im GenerationController
	// TODO entsprechend oben einen entsprechenden Konstruktor einfügen
	/**
	 * Attaches a trace state to the end of the trace.
	 * @param traceState the trace state
	 */
	public void appendTraceState(TraceState traceState) {
		this.traceStates.add(traceState);
	}
	
	public Iterator<TraceState> iterator() {
		return this.traceStates.listIterator();
	}
	
	// TODO ggf. Klasse löschen
	
	/**
	 * Iterator over a trace.
	 * Nested class due to encapsulation of implementation details of the trace.
	 * 
	 * @author scheler
	 *
	 */
	public class TraceIterator implements Iterator<TraceState> {
		
		private Trace trace;
		private Iterator<TraceState> iterator;

		private TraceIterator(Trace trace) {
			this.trace = trace;
			this.iterator = this.trace.iterator();
		}
		
		@Override
		public boolean hasNext() {
			//if trace.traceStates.
			return false;
		}

		@Override
		public TraceState next() {
			// TODO Auto-generated method stub
			return null;
		}
		
		public boolean hasPrev() {
			// TODO implement
			return false;
		}
		
		public TraceState prev() {
			// TODO implement
			return null;
		}

	}	
}
