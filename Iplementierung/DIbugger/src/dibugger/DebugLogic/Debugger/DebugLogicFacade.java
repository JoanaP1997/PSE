package dibugger.DebugLogic.Debugger;

/**
 * Facade class for the Debugger. It delegates functions calls to the DebugControl and / or Suggestion classes.
 * @author Pascal
 *
 */
public class DebugLogicFacade extends Subject{
	
	DebugControl debugControl;
	
	public DebugLogicFacade() {
		super();
		debugControl = new DebugControl();
	}
	
	
	
	//Strtegy Types
	public static final int STRAT_STEP_SIZE_SIMPLE = 0;
	public static final int STRAT_REL_SIMPLE = 1;
	public static final int STRAT_INPUT_SIMPLE = 2;
}
