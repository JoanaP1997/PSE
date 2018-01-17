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
	
	public Scope() {
		this.values = new HashMap<String, TermValue>();
		this.types = new HashMap<String, Type>();
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
	 * @param identifier the identifier of the variable
	 * @return the value of the variable
	 */
	public TermValue getValueOf(String identifier) {
		return this.values.get(identifier);
	}
	
	/**
	 * Setter for the value of a variable inside the scope.
	 * @param identifier the identifier of the variable
	 * @param value the value of the variable
	 */
	public void setValueOf(String identifier, TermValue value) {
		this.values.put(identifier, value);
	}

	/**
	 * Getter for the type of a variable inside the scope.
	 * @param identifier the identifier of the variable
	 * @return type the type of the variable
	 */
	public Type getTypeOf(String identifier) {
		return this.types.get(identifier);
	}

	/**
	 * Setter for the type of a variable inside the scope.
	 * @param identifier the identifier of the variable
	 * @param type the type to be set
	 */
	public void setTypeOf(String identifier, Type type) {
		this.types.put(identifier, type);
	}

	/**
	 * Getter for the expected return type of a scope.
	 * @return the expectedReturnType
	 */
	public Type getExpectedReturnType() {
		return expectedReturnType;
	}

	/**
	 * Getter for the return value of a scope.
	 * @return the returnValue
	 */
	public TermValue getReturnValue() {
		return returnValue;
	}

	/**
	 * Getter for the id of a scope.
	 * @return the id
	 */
	public int getId() {
		return this.id;
	}
	
	/**
	 * Returns true if the routine of the scope is finished. False otherwise.
	 * @return the value of isRoutineFinished
	 */
	public boolean isRoutineFinished() {
		return this.routineFinished;
	}
}
