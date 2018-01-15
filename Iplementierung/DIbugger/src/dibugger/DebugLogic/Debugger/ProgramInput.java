package dibugger.DebugLogic.Debugger;

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
}
