package dibugger.userinterface.dibuggerpopups;

import dibugger.userinterface.MainInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VariableSuggestionPopUp extends DIbuggerPopUp {

  private MainInterface mainInterface;
  public static final int STEP_SIZE = 0;
  public static final int VARIABLES = 1;
  public static final int WATCH_EXPRESSION = 2;
  public static final int CONDITIONAL_BREAKPOINT = 3;

  public VariableSuggestionPopUp (int message, MainInterface mainInterface) {
    this.mainInterface = mainInterface;
    this.setSize(300,300);
    this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

    //TODO: StepSize, Eingabevariablen, Expressions

    FlowLayout layout = new FlowLayout();
    this.setLayout(layout);


    this.setModal(true);
    this.setVisible(true);

  }

  private void variableSuggestion() {
    JLabel programLabel = new JLabel("Program: ");
    JComboBox program = new JComboBox();
    this.add(programLabel);
    this.add(program);
    ArrayList<String> programIds = mainInterface.getProgramIds();
    for(String id: programIds) {
      program.addItem(id);
    }
    this.add(new Label("Variable:"));

    JComboBox options = new JComboBox<>();
    java.util.List<String> variable = mainInterface.getControlFacade().getDebugLogicFacade()
        .getAllVariables((String)program.getSelectedItem());
    for(String var: variable) {
      options.addItem(var);
    }

    this.add(new Label("Vorschlag: "));
    //TODO: Zwick in Hintern treten
    String optionChoosed = options.getSelectedItem().toString();
    //JTextField suggestionText = new JTextField(mainInterface.getControlFacade()
        //.suggestInputValue(optionChoosed);
    //this.add(suggestionText);
    //suggestionText.setToolTipText("Vorgeschlagene Variable, kann noch manuell geändert werden. Bitte mit ok bestätigen.");

    JButton ok = new JButton("Ok");
    ok.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        //TODO: Variable an Chiara geben
      }
    });

    this.add(ok);
  }

  public static void main(String[] args) {
    VariableSuggestionPopUp p = new VariableSuggestionPopUp(1,new MainInterface());
  }


}
