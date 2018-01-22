package dibugger.userinterface;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

import dibugger.userinterface.dibuggerpopups.DecisionPopUp;
import dibugger.userinterface.dibuggerpopups.ErrorPopUp;

public class GUIFacade implements Observer {
    private MainInterface mainInterface;
   // private ControlFacade controlFacade;

    public GUIFacade(MainInterface mainInterface) {
        this.mainInterface = mainInterface;
        //controlFacade = new ControlFacade(this);
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
    
    public List<String> getVariablesOfInspector(int programNumber) {
        throw new UnsupportedOperationException();
    }
    
    public void showVariables(int numberOfProgram, List<String> variables) {
        //TODO
    }

    @Override
    public void update(Observable observable, Object o) {
        //TODO
    }

    public void showError(String s) {
        new ErrorPopUp(s, mainInterface);
    }

    public void showWarning(String s) {
        new DecisionPopUp(s, mainInterface);
    }
    //TODO: Rückgabewert

    public void changeLanguage() {
        //TODO
    }


}
