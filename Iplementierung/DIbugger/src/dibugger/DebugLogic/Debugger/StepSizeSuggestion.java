package dibugger.DebugLogic.Debugger;

import java.util.List;

/**
 * abstract class for Suggesting StepSizes
 * @author Pascal
 *
 */
public abstract class StepSizeSuggestion {
	
	private DebugControl debugControl;
	
	public StepSizeSuggestion(DebugControl debugControl) {
		this.debugControl = debugControl;
	}

	/**
	 * suggest a stepsize for all programs
	 * @param programText list containing all program texts
	 */
	public abstract void suggest(List<String> programText);
}
