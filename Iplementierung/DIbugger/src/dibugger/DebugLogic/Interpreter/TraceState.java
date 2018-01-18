package dibugger.DebugLogic.Interpreter;

import java.util.HashMap;

/**
 * A state of trace. Part of the trace. Saves the variables after the execution of a command.
 * 
 * @author scheler
 *
 */
public class TraceState {

	private HashMap<String, TermValue> vars;
	private TraceStatePosition position;
	private int lineNumber;
	
	/**
	 * Constructor for a new TraceState.
	 * 
	 * @param the position
	 * @param the lineNumber of the command
	 * @param the current scope (= the scope wherein the command was executed)
	 */
	public TraceState(TraceStatePosition position, int lineNumber, Scope scope) {
		this.position = position;
		this.lineNumber = lineNumber;
		
		// TODO oder soll scope.getValues() gleich eine HashMap zurückgeben?
		this.vars = (HashMap<String, TermValue>) scope.getValues();
	}
	
	/**
	 * Returns the value of a variable by its identifier.
	 * @param the identifier
	 * @return the value of the identified variable
	 */
	public TermValue getValueOf(String identifier) {
		return vars.get(identifier);
	}
	
	/**
	 * Returns the trace state position of the trace.
	 * @return the trace state position
	 */
	public TraceStatePosition getPosition() {
		return this.position;
	}
	
	/**
	 * Setter for the trace state position of the trace.
	 * @param the trace state position
	 * @return 
	 */
	public void setPosition(TraceStatePosition position) {
		this.position = position;
	}
	
	/**
	 * Returns the line number of a trace state, that is the line number in which its command occurred.
	 * @return the line number
	 */
	public int getLineNumber() {
		return this.lineNumber;
	}
}
