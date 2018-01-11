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
	 * 
	 * @return a list of all input values
	 */
	public List<String> getInputValues() {
		return inputValues;
	}

	/**
	 * 
	 * @return the programCounter of this input
	 */
	public int getCounter() {
		return counter;
	}
}
