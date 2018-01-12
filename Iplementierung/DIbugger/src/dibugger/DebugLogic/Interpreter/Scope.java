package dibugger.DebugLogic.Interpreter;

/**
 * A scope of a function during trace creation.
 * Encapsulates the values of the variables during the function call.
 * @author wagner, scheler
 *
 */

import java.util.HashMap;
import java.util.Map;

public class Scope {
	
	private Map<String, TermValue> values;
	private Map<String, Type> types;
	private TermValue returnValue;
	private Type expectedReturnType;
	private int id;
	private boolean routineFinished;
	
	// evtl. löschen; ist hier damit die Tests weiter laufen
	public Scope() {
		this.values = new HashMap<String, TermValue>();
		this.routineFinished = false;
	}
	
	/**
	 * Constructor for a new scope.
	 * @param id the id 
	 * @param expectedReturnType the expected return type
	 */
	public Scope(int id, Type expectedReturnType) {
		this.values = new HashMap<String, TermValue>();
		this.id = id;
		this.expectedReturnType = expectedReturnType;
		this.routineFinished = false;
	}

	/**
	 * Getter for the values of the variables inside the scope. 
	 * @return a map of the values
	 */
	public Map<String, TermValue> getValues() {
		return this.values;
	}
	
	/**
	 * Getter for the value of a variable inside the scope.
	 * @param the identifier of the variable
	 * @return the value
	 */
	public TermValue getValue(String identifier) {
		return this.values.get(identifier);
	}
	
	/**
	 * Setter for the value of a variable inside the scope.
	 * @param identifier of the variable
	 * @param value of the variable
	 */
	public void setValue(String identifier, TermValue value) {
		this.values.put(identifier, value);
		// TODO evtl. Types gleich mit einfügen, siehe Frage im Trello
	}

	
}
