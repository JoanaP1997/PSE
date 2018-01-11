package dibugger.DebugLogic.Debugger;

import java.util.List;

/**
 * class to suggest a step size via program text lengths
 * @author Pascal
 *
 */
public class SimpleStepSizeSuggestion extends StepSizeSuggestion{

	public SimpleStepSizeSuggestion(DebugControl debugControl) {
		super(debugControl);
	}

	/**
	 * Suggest step sizes for all programs via programtext length
	 */
	@Override
	public void suggest(List<String> programText) {
		//TODO
	}

}
