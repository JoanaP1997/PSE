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
    this.setSize(300,310);
    this.setResizable(false);
    this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

    //TODO: StepSize, Expressions

    GroupLayout layout = new GroupLayout(this);
    getContentPane().setLayout(layout);
    variableSuggestion();

    this.setModal(true);
    this.setVisible(true);

  }

  private void variableSuggestion() {
    JLabel intervallStartLabel = new javax.swing.JLabel();
    JTextField intervallStartField = new javax.swing.JTextField();
    intervallStartField.setPreferredSize(new Dimension(100,20));
    JLabel intervallEndLabel = new javax.swing.JLabel();
    JTextField intervallEndField = new javax.swing.JTextField();
    intervallEndField.setPreferredSize(new Dimension(100,20));
    JLabel intervallLabel = new javax.swing.JLabel();
    JLabel typeLabel = new javax.swing.JLabel();
    JComboBox typeChooser = new javax.swing.JComboBox<>();
    JButton okButton = new javax.swing.JButton();
    JLabel suggestionLabel = new javax.swing.JLabel();
    JLabel suggestedLabel = new javax.swing.JLabel();

    intervallStartLabel.setText("von:");

    intervallStartField.setText("");

    intervallEndLabel.setText("bis:");

    intervallEndField.setText("");

    intervallLabel.setText("Intervall");

    typeLabel.setText("Type:");

    typeChooser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "int", "char", "long", "float", "double"
        , "boolean" }));

    okButton.setText("ok");

    suggestionLabel.setText("Vorschlag:");

    suggestedLabel.setText("Ok-Butto betätigen um Vorschlag zu erhalten");

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

  public static void main(String[] args) {
    VariableSuggestionPopUp p = new VariableSuggestionPopUp(1,new MainInterface());
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
