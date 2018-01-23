package dibugger.debuglogic.debugger;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Represents the start parameters of a program.
 * The programtext,-input and -counter.
 * @author Pascal
 *
 */
public class ProgramInput {
	private String text;
	private List<String> inputValues;
	private int counter;
	private String programID;

	public ProgramInput(String text, List<String> inputValues, int counter) {
		this.text = text;
		this.inputValues = inputValues;
		this.counter = counter;
	}

	/**
	 * 
	 * @return the programtext parameter
	 */
	public String getText() {
		return text;
	}
	/**
	 * Setter for the programText
	 * @param text the new programText
	 */
	public void setText(String text) {
		this.text = text;
	}
	/**
	 * 
	 * @return a list of all input values
	 */
	public List<String> getInputValues() {
		return inputValues;
	}
	
	public Collection<VariableAndValue> getVariablesAndValues() {
	    List<VariableAndValue> variablesAndValues = new ArrayList<>();
	    List<String> inputValues = getInputValues();
	    
	    for (String element : inputValues) {
	        String[] splitInputValue = element.split(" = ");
	        
	        if (splitInputValue.length != 2) {
	            /*
	             *   Hier muss etwas anderes ausgelöst werden, vielleicht eine
	             *   neue DIbuggerLogicException (, falls diese Methode und/oder 
	             *   die Klasse VariableAndValue nicht bald verworfen werden)
	             */
	            throw new IllegalStateException();
	        }
	        
	        String variable = splitInputValue[0];
	        String value = splitInputValue[1];
	        VariableAndValue variableAndValue = new VariableAndValue(variable, value);
	        variablesAndValues.add(variableAndValue);
	    }
	    return variablesAndValues;
	}
	
	/**
	 * Setter for the input value list
	 * @param inputValues the new list containing alll input values
	 */
	public void setInputValues(List<String> inputValues) {
		this.inputValues = inputValues;
	}
	/**
	 * 
	 * @return the programCounter of this input
	 */
	public int getCounter() {
		return counter;
	}
	/**
	 * Setter for the programcounter
	 * @param counter the new programcounter
	 */
	public void setCounter(int counter) {
		this.counter = counter;
	}

	/**
	 * 
	 * @return the program id of this input, etc. "A"
	 */
	public String getProgramID() {
		return programID;
	}

	/**
	 * Setter for the program id, etc "A"
	 * @param programID the new program id of this input
	 */
	public void setProgramID(String programID) {
		this.programID = programID;
	}
	
	
}
