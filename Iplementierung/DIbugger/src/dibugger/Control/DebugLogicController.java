package dibugger.Control;

import dibugger.DebugLogic.Debugger.DebugLogicFacade;
import dibugger.UserInterface.GUIFacade;

public class DebugLogicController {
    private DebugLogicFacade debugLogicFacade;
    
    public DebugLogicController() {
        debugLogicFacade = new DebugLogicFacade();
    }
    
    public DebugLogicController(GUIFacade guiFacade) {
        this();
//        debugLogicFacade.addObserver(guiFacade);
    }
}
