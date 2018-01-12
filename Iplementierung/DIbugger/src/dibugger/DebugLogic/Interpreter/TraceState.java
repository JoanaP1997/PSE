package dibugger.DebugLogic.Interpreter;

import java.util.TreeMap;

/**
 * 
 * @author wagner
 *
 */
public class TraceState {

	private TreeMap<String, TermValue> vars;
	private TraceStatePosition position;
	private int lineNumber;
	
	public TraceState(TraceStatePosition position, int lineNumber) {
		this.position = position;
		this.lineNumber = lineNumber;
	}
	
	public TermValue getValueOf(String identifier) {
		return vars.get(identifier);
	}
	
	public TraceStatePosition getPosition() {
		return this.position;
	}
	
	public int getLineNumber() {
		return this.lineNumber;
	}
}
