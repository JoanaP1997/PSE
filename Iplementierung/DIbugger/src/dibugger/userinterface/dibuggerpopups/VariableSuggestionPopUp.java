package dibugger.userinterface.dibuggerpopups;

import dibugger.filehandler.facade.LanguageFile;
import dibugger.userinterface.MainInterface;

import javax.swing.*;
import java.awt.*;
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
  private static String INFO_TEXT = "Ok dr\u00fccken um Vorschlag zu erhalten";
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
  private JTextField suggestedLabel;

  /**
   * constructor for a new VariableSuggestionPopUp.
   *
   * @param type          has to be 0,1,2 or 3 (see the static final ints in this class)
   * @param mainInterface MainInterface on which this PopUp should be shown
   */
  public VariableSuggestionPopUp(int type, MainInterface mainInterface) {
    this.mainInterface = mainInterface;
    mainInterface.saveText();
    this.setSize(300, 310);
    this.setResizable(false);
    this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    this.setLocationRelativeTo(mainInterface);

    setLanguage();

    if (type == 0) {
      stepSizeSuggestion();
    } else if (type == 1) {
      variableSuggestion();
    } else if (type == 2) {
      wesuggestion();
    } else if (type == 3) {
      cbsuggestion();
    }

    this.setModal(true);
    this.setVisible(true);

  }

  private void variableSuggestion() {
    JLabel intervallStartLabel = new JLabel();
    JTextField intervallStartField = new JTextField();
    intervallStartField.setPreferredSize(new Dimension(100, 30));
    JLabel intervallEndLabel = new JLabel();
    JTextField intervallEndField = new JTextField();
    intervallEndField.setPreferredSize(new Dimension(100, 30));
    JLabel intervallLabel = new JLabel();
    JLabel typeLabel = new JLabel();
    JComboBox typeChooser = new JComboBox<>();
    JButton okButton = new JButton();
    JLabel suggestionLabel = new JLabel();
    suggestedLabel = new JTextField();

    intervallStartLabel.setText(FROM + ":");

    intervallStartField.setText("");

    intervallEndLabel.setText(TO + ":");

    intervallEndField.setText("");

    intervallLabel.setText(INTERVAL);

    typeLabel.setText(TYPE + ":");

    typeChooser.setModel(new DefaultComboBoxModel<>(new String[]{"int", "char", "long",
        "float", "double", "boolean"}));

    okButton.setText("Ok");

    suggestionLabel.setText(SUGGESTION + ":");

    suggestedLabel.setText(INFO_TEXT);
    suggestedLabel.setEditable(false);
    suggestedLabel.setPreferredSize(new Dimension(190, 15));

    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(intervallLabel))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(intervallStartLabel)
                                    .addComponent(typeLabel))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING
                                    , false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(intervallStartField, GroupLayout.PREFERRED_SIZE
                                            , GroupLayout.DEFAULT_SIZE
                                            , GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(intervallEndLabel)
                                        .addGap(50, 50, 50)
                                        .addComponent(intervallEndField, GroupLayout.PREFERRED_SIZE
                                            , GroupLayout.DEFAULT_SIZE
                                            , GroupLayout.PREFERRED_SIZE))
                                    .addComponent(typeChooser, GroupLayout.PREFERRED_SIZE
                                        , 102, GroupLayout.PREFERRED_SIZE)))
                            .addComponent(suggestionLabel))))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(suggestedLabel)
                    .addComponent(okButton))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(intervallLabel)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(intervallStartLabel)
                    .addComponent(intervallStartField, GroupLayout.PREFERRED_SIZE
                        , GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(intervallEndLabel)
                    .addComponent(intervallEndField, GroupLayout.PREFERRED_SIZE
                        , GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(typeLabel)
                    .addComponent(typeChooser, GroupLayout.PREFERRED_SIZE
                        , GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(suggestionLabel)
                    .addComponent(suggestedLabel))
                .addGap(35, 35, 35)
                .addComponent(okButton)
                .addContainerGap())
    );

    pack();

    okButton.addActionListener(e -> {
      String type = typeChooser.getSelectedItem().toString();
      int typeAsInt = getTypeFromString(type);
      String startRange = intervallStartField.getText();
      String endRange = intervallEndField.getText();
      String suggestion = mainInterface.getControlFacade().suggestInputValue(
          "x", "(" + startRange + "," + endRange + ")", typeAsInt);
      suggestedLabel.setText(type + " x = " + suggestion);
    });
  }

  private void stepSizeSuggestion() {
    //TODO: evtl. keine Programme auswählen und keinen Vorschlag anzeigen
    JLabel programLabel = new JLabel();
    JLabel headerLabel = new JLabel();
    JComboBox programChooser = new JComboBox<>();
    JLabel stepSizeSuggestionLabel = new JLabel();
    JLabel suggestedLabel = new JLabel();
    JButton okButton = new JButton();

    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    programLabel.setText(PROGRAM + ":");

    headerLabel.setText(STEPSIZE + " " + SUGGESTION);

    ArrayList programs = mainInterface.getProgramIds();
    String[] programsAsArray = new String[programs.size()];
    programs.toArray(programsAsArray);

    programChooser.setModel(new DefaultComboBoxModel<>(programsAsArray));

    stepSizeSuggestionLabel.setText(STEPSIZE + " " + SUGGESTION);

    suggestedLabel.setText("");

    okButton.setText("ok");

    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);

    layout.setHorizontalGroup(
        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(headerLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(programLabel)
                            .addComponent(stepSizeSuggestionLabel))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(suggestedLabel)
                            .addComponent(programChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(okButton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLabel)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(programLabel)
                    .addComponent(programChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(stepSizeSuggestionLabel)
                    .addComponent(suggestedLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(okButton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
    );

    pack();

    okButton.addActionListener(e -> {
      mainInterface.getControlFacade().suggestStepSize();
      dispose();
    });
  }

  private void wesuggestion() {
    showExpression("Watch-Expression " + SUGGESTION);

    okButtonExpression.addActionListener(e -> {
      String suggestion = mainInterface.getControlFacade().suggestWatchExpression();
      suggestedLabel.setText(suggestion);
    });
  }

  private void cbsuggestion() {
    showExpression(SUGGESTION + FOR + CONDITIONAL_BREAKPOINT_AKKUSATIV);

    okButtonExpression.addActionListener(e -> {
      String suggestion = mainInterface.getControlFacade().suggestConditionalBreakpoint();
      suggestedLabel.setText(suggestion);
    });
  }

  private void showExpression(String type) {
    JLabel suggestionLabel = new JLabel();
    JLabel showingLabel = new JLabel();
    suggestedLabel = new JTextField();
    okButtonExpression = new JButton();

    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    suggestionLabel.setText(type);

    showingLabel.setText(SUGGESTION + ": ");

    suggestedLabel.setText("");
    suggestedLabel.setEditable(false);

    okButtonExpression.setText("ok");

    GroupLayout layout = new GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
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
                        .addComponent(okButtonExpression, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addGap(135, 135, 135))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(suggestionLabel)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(showingLabel)
                    .addComponent(suggestedLabel))
                .addGap(130, 130, 130)
                .addComponent(okButtonExpression, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
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

  /**
   * sets the language according to the current language file.
   */
  private void setLanguage() {
    LanguageFile languageFile = mainInterface.getControlFacade().getLanguageFile();
    FROM = languageFile.getTranslation("ui_from");
    TO = languageFile.getTranslation("ui_to");
    INTERVAL = languageFile.getTranslation("ui_interval");
    TYPE = languageFile.getTranslation("ui_type");
    SUGGESTION = languageFile.getTranslation("ui_suggestion");
    INFO_TEXT = languageFile.getTranslation("ui_suggestion_infotext");
    PROGRAM = languageFile.getTranslation("ui_program");
    STEPSIZE = languageFile.getTranslation("ui_stepsize");
    FOR = languageFile.getTranslation("ui_for");
    CONDITIONAL_BREAKPOINT_AKKUSATIV = languageFile.getTranslation("ui_cond_breakpoint_akkusativ");
  }


}
