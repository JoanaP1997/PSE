package dibugger.DebugLogic.Debugger;

import java.util.ArrayList;
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
	 * Suggest step sizes for all programs via relational programtext length
	 */
	@Override
	public void suggest(List<String> programText) {
		int min=Integer.MAX_VALUE,max=0;
		for(String text : programText){
			min = Math.min(min, text.split("\n").length);
			max = Math.max(max, text.split("\n").length);
		}
		int i=0;
		for(String text : programText){
			getDebugControl().setStepSize(i, text.split("\n").length / min);
			++i;
		}
	}
	
}
