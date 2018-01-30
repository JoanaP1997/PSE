package dibugger.userinterface.dibuggerpopups;

import dibugger.filehandler.facade.LanguageFile;
import dibugger.userinterface.CommandPanel;
import dibugger.userinterface.MainInterface;

import javax.swing.*;

/**
 * PopUp where the user can decide whether he wants to continue or change something that caused an Error but can be
 * handled by the Logic itself.
 */
public class DecisionPopUp extends DIbuggerPopUp {

  private static String YES_OPTION = "Ja";
  private static String NO_OPTION = "Nein";
  private String message;
  private MainInterface mainInterface;

  /**
   * constructor for a DecisionPopUp.
   *
   * @param message       String that is shown to the user
   * @param mainInterface MainInterface from which this PopUp is called
   */
  public DecisionPopUp(String message, MainInterface mainInterface) {
    this.mainInterface = mainInterface;
    this.message = message;
    this.setSize(300, 100);
    this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
    setLanguage();
    initComponents();

    pack();

    this.setVisible(true);
  }

  private void setLanguage() {
    LanguageFile languageFile = mainInterface.getControlFacade().getLanguageFile();
    YES_OPTION = languageFile.getTranslation("ui_yes");
    NO_OPTION = languageFile.getTranslation("ui_no");
  }

  private void initComponents() {
    GroupLayout layout = new GroupLayout(getContentPane());
    this.setLayout(layout);
    getContentPane().setLayout(layout);
    this.setModal(true);
    this.setLocationRelativeTo(mainInterface);

    JLabel messageText = new JLabel(message);

    JButton continueDebug = new JButton(YES_OPTION);
    continueDebug.addActionListener(actionEvent -> {
      CommandPanel.getCommandPanel(mainInterface).continueWithDebug();
      dispose();
    });

    JButton stopDebug = new JButton(NO_OPTION);
    stopDebug.addActionListener(actionEvent -> {
      CommandPanel.getCommandPanel(mainInterface).stopDebug();
      dispose();
    });

    layout.setHorizontalGroup(
        layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addContainerGap(112, Short.MAX_VALUE)
                .addComponent(continueDebug).addGap(18, 18, 18).addComponent(stopDebug)
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(messageText)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
    layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup().addGap(43, 43, 43).addComponent(messageText).addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(continueDebug).addComponent(stopDebug))
            .addContainerGap(198, Short.MAX_VALUE)));

  }

}
