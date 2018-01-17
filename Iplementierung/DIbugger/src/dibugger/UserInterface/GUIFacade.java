package dibugger.UserInterface;

import dibugger.Control.ControlFacade;
import dibugger.UserInterface.DIbuggerPopUps.ErrorPopUp;

import java.util.List;

public class GUIFacade {
    private MainInterface mainInterface;
    private ControlFacade controlFacade;

    public GUIFacade(MainInterface mainInterface) {
        this.mainInterface = mainInterface;
        controlFacade = new ControlFacade(this);
    }

    public void showProgramText(String programText, int id) {
       //TODO
    }

    public void reset() {
        //TODO
    }

    public void showInput(int program, List<String> vars) {
        //TODO
    }

    public void update() {
       //TODO
    }

    public void showError(String s) {
        new ErrorPopUp(s);
    }

    public void showWarning(String s) {
        //TODO: Rückgabewert??
    }

    public void changeLanguage() {
        //TODO
    }
}
