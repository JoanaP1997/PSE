package dibugger.DebugLogic.Interpreter;

import java.util.Iterator;

public class Trace {

	private String test = "test";
	
	private String getTest() {
		return this.test;
	}
	
	public class TraceIterator implements Iterator<TraceState> {

		private TraceIterator(Trace trace) {
			 trace.getTest();
		}
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
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

	public static TraceIterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
