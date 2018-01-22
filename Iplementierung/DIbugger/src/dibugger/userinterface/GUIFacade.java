package dibugger.userinterface;

import dibugger.control.ControlFacade;
import dibugger.userinterface.dibuggerpopups.DecisionPopUp;
import dibugger.userinterface.dibuggerpopups.ErrorPopUp;

import java.util.List;
import java.util.Observable;
import java.util.Observer;


/**
 * Facade of the Dibuggers user interface.
 */
public class GUIFacade implements Observer {
  private MainInterface mainInterface;
  private ControlFacade controlFacade;

  /**
   * Constructs a new GUIFacade using the mainInterface.
   * @param mainInterface main interface
   */
  public GUIFacade(MainInterface mainInterface) {
    this.mainInterface = mainInterface;
    controlFacade = new ControlFacade(this);
  }

  public void showProgramText(String programText, String programId) {
    mainInterface.showProgramText(programText, programId);
  }

  public void reset() {
    mainInterface.reset();
  }

  public void showInput(String programId, List<String> vars) {
    mainInterface.showInput(programId, vars);
  }

  public List<String> getVariablesOfInspector(String programId) {
    return mainInterface.getVariablesOfInspector(programId);
  }

  public void showVariables(String idOfProgram, List<String> variables) {
    mainInterface.showVariables(idOfProgram, variables);
  }

  @Override
  public void update(Observable observable, Object o) {
    mainInterface.update(observable, o);
  }

  public void showError(String s) {
    new ErrorPopUp(s, mainInterface);
  }

  public void showWarning(String s) {
    new DecisionPopUp(s, mainInterface);
  }


  public void changeLanguage() {
    mainInterface.changeLanguage();
  }


}
