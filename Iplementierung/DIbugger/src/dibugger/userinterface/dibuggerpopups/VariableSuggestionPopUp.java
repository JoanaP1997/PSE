package dibugger.userinterface.dibuggerpopups;

import dibugger.userinterface.MainInterface;
import dibugger.userinterface.dibuggerpopups.DIbuggerPopUp;

import javax.swing.*;

public class VariableSuggestionPopUp extends DIbuggerPopUp {

  private MainInterface mainInterface;
  public static final int STEP_SIZE = 0;
  public static final int VARIABLES = 1;
  public static final int WATCH_EXPRESSION = 2;
  public static final int CONDITIONAL_BREAKPOINT = 3;

  public VariableSuggestionPopUp (String message, MainInterface mainInterface) {
    this.mainInterface = mainInterface;
    this.setSize(300,300);
    this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

    //TODO: StepSize, Eingabevariablen,

    this.setVisible(true);

  }

  public static void main(String[] args) {
    VariableSuggestionPopUp p = new VariableSuggestionPopUp("Bla",new MainInterface());
  }


}
