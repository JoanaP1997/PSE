package dibugger.userinterface.dibuggerpopups;

import dibugger.userinterface.MainInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Class that represents a PopUp to let the user generate a Suggestion for StepSize, variable input, Watch expression or
 * conditional breakpoint.
 */
public class VariableSuggestionPopUp extends DIbuggerPopUp {

  private static String FROM = "von";
  private static String TO = "bis";
  private static String INTERVAL = "Intervall";
  private static String TYPE = "Typ";
  private static String SUGGESTION = "Vorschlag";
  private static String HELP_TEXT = "Ok-Button bet\u00e4tigen um Vorschlag zu erhalten";
  private static String PROGRAM = "Program";
  private static String STEPSIZE = "Schrittgr\u00f6ße";
  private static String FOR = "f\u00fcr";
  private static String CONDITIONAL_BREAKPOINT_AKKUSATIV = "bedingten Breakpoint";


  private MainInterface mainInterface;
  public static final int STEP_SIZE = 0;
  public static final int VARIABLES = 1;
  public static final int WATCH_EXPRESSION = 2;
  public static final int CONDITIONAL_BREAKPOINT = 3;
  private JButton okButtonExpression;
  private JLabel suggestedLabel;

  /**
   * constructor for a new VariableSuggestionPopUp
   * @param type has to be 0,1,2 or 3 (see the static final ints in this class)
   * @param mainInterface MainInterface on which this PopUp should be shown
   */
  public VariableSuggestionPopUp (int type, MainInterface mainInterface) {
    this.mainInterface = mainInterface;
    this.setSize(300,310);
    this.setResizable(false);
    this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

    if(type == 0) {
      stepSizeSuggestion();
    } else if (type == 1) {
      variableSuggestion();
    } else if (type == 2) {
      wESuggestion();
    } else if (type == 3) {
      cBSuggestion();
    }

    this.setModal(true);
    this.setVisible(true);

  }

  private void variableSuggestion() {
    JLabel intervallStartLabel = new javax.swing.JLabel();
    JTextField intervallStartField = new javax.swing.JTextField();
    intervallStartField.setPreferredSize(new Dimension(100,30));
    JLabel intervallEndLabel = new javax.swing.JLabel();
    JTextField intervallEndField = new javax.swing.JTextField();
    intervallEndField.setPreferredSize(new Dimension(100,30));
    JLabel intervallLabel = new javax.swing.JLabel();
    JLabel typeLabel = new javax.swing.JLabel();
    JComboBox typeChooser = new javax.swing.JComboBox<>();
    JButton okButton = new javax.swing.JButton();
    JLabel suggestionLabel = new javax.swing.JLabel();
    JLabel suggestedLabel = new javax.swing.JLabel();

    intervallStartLabel.setText(FROM + ":");

    intervallStartField.setText("");

    intervallEndLabel.setText(TO + ":");

    intervallEndField.setText("");

    intervallLabel.setText(INTERVAL);

    typeLabel.setText(TYPE + ":");

    typeChooser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "int", "char", "long", "float", "double"
        , "boolean" }));

    okButton.setText("ok");

    suggestionLabel.setText(SUGGESTION + ":");

    suggestedLabel.setText(HELP_TEXT);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(intervallLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(intervallStartLabel)
                                    .addComponent(typeLabel))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING
                                    , false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(intervallStartField, javax.swing.GroupLayout.PREFERRED_SIZE
                                            , javax.swing.GroupLayout.DEFAULT_SIZE
                                            , javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(intervallEndLabel)
                                        .addGap(50, 50, 50)
                                        .addComponent(intervallEndField, javax.swing.GroupLayout.PREFERRED_SIZE
                                            , javax.swing.GroupLayout.DEFAULT_SIZE
                                            , javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(typeChooser, javax.swing.GroupLayout.PREFERRED_SIZE
                                        , 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(suggestionLabel))))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(suggestedLabel)
                    .addComponent(okButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(intervallLabel)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(intervallStartLabel)
                    .addComponent(intervallStartField, javax.swing.GroupLayout.PREFERRED_SIZE
                        , javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(intervallEndLabel)
                    .addComponent(intervallEndField, javax.swing.GroupLayout.PREFERRED_SIZE
                        , javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeLabel)
                    .addComponent(typeChooser, javax.swing.GroupLayout.PREFERRED_SIZE
                        , javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suggestionLabel)
                    .addComponent(suggestedLabel))
                .addGap(35, 35, 35)
                .addComponent(okButton)
                .addContainerGap())
    );

    pack();

    okButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String type = typeChooser.getSelectedItem().toString();
        int typeAsInt = getTypeFromString(type);
        String startRange = intervallStartField.getText();
        String endRange = intervallEndField.getText();
        String suggestion = mainInterface.getControlFacade().suggestInputValue("x"
            ,"(" + startRange + "," + endRange + ")", typeAsInt);
        suggestedLabel.setText(type + " x = " + suggestion);
        System.out.println(typeAsInt);
      }
    });
  }

  private void stepSizeSuggestion() {
    //TODO: evtl. keine Programme auswählen und keinen Vorschlag anzeigen
    //TODO: Label kopierbar machen
    JLabel programLabel = new javax.swing.JLabel();
    JLabel headerLabel = new javax.swing.JLabel();
    JComboBox programChooser = new javax.swing.JComboBox<>();
    JLabel stepSizeSuggestionLabel = new javax.swing.JLabel();
    JLabel suggestedLabel = new javax.swing.JLabel();
    JButton okButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    programLabel.setText(PROGRAM + ":");

    headerLabel.setText(STEPSIZE + " " + SUGGESTION);

    ArrayList programs = mainInterface.getProgramIds();
    String[] programsAsArray = new String[programs.size()];
    programs.toArray(programsAsArray);

    programChooser.setModel(new javax.swing.DefaultComboBoxModel<>(programsAsArray));

    stepSizeSuggestionLabel.setText(STEPSIZE + " " + SUGGESTION);

    suggestedLabel.setText("");

    okButton.setText("ok");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);

    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(headerLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(programLabel)
                            .addComponent(stepSizeSuggestionLabel))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(suggestedLabel)
                            .addComponent(programChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLabel)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(programLabel)
                    .addComponent(programChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stepSizeSuggestionLabel)
                    .addComponent(suggestedLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
    );

    pack();

    okButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        mainInterface.getControlFacade().suggestStepSize();
        dispose();
      }
    });
  }

  private void wESuggestion() {
    showExpression("Watch-Expression " + SUGGESTION);

    okButtonExpression.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String suggestion = mainInterface.getControlFacade().suggestWatchExpression();
        suggestedLabel.setText(suggestion);
      }
    });
  }

  private void cBSuggestion() {
    showExpression(SUGGESTION + FOR + CONDITIONAL_BREAKPOINT_AKKUSATIV);

    okButtonExpression.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String suggestion = mainInterface.getControlFacade().suggestConditionalBreakpoint();
        suggestedLabel.setText(suggestion);
      }
    });
  }

  private void showExpression(String type) {
    JLabel suggestionLabel = new javax.swing.JLabel();
    JLabel showingLabel = new javax.swing.JLabel();
    suggestedLabel = new javax.swing.JLabel();
    okButtonExpression = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    suggestionLabel.setText(type);

    showingLabel.setText(SUGGESTION +": ");

    suggestedLabel.setText("");

    okButtonExpression.setText("ok");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(showingLabel)
                        .addGap(120, 120, 120)
                        .addComponent(suggestedLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(suggestionLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(okButtonExpression, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(135, 135, 135))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(suggestionLabel)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showingLabel)
                    .addComponent(suggestedLabel))
                .addGap(130, 130, 130)
                .addComponent(okButtonExpression, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
    );

    pack();
  }

  private int getTypeFromString(String typeAsString) {
    switch (typeAsString) {
      case "char":
        return 0;
      case "int":
        return 1;
      case "long":
        return 2;
      case "float":
        return 3;
      case "double":
        return 4;
      case "boolean":
        return 5;
      default:
        return -1;
    }
  }


}
