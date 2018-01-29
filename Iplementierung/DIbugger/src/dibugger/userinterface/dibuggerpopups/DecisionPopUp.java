package dibugger.userinterface.dibuggerpopups;

import dibugger.userinterface.CommandPanel;
import dibugger.userinterface.MainInterface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * PopUp where the user can decide wether he wants to continue or change something that caused an Error but can be
 * handled by the Logic itself
 */
public class DecisionPopUp extends DIbuggerPopUp {

    private static String YES_OPTION = "Ja";
    private static String NO_OPTION = "Nein";
    private String message;
    private MainInterface mainInterface;

  /**
   * constructor for a DecisionPopUp
   * @param message String that is shown to the user
   * @param mainInterface MainInterface from which this PopUp is called
   */
    public DecisionPopUp(String message, MainInterface mainInterface) {
        this.mainInterface = mainInterface;
        this.message = message;
        this.setSize(300, 100);
        this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        GroupLayout layout = new GroupLayout(getContentPane());
        this.setLayout(layout);
        getContentPane().setLayout(layout);
        this.setModal(true);
        this.setLocationRelativeTo(mainInterface);

        JLabel messageText = new JLabel(message);

        JButton continueDebug = new JButton(YES_OPTION);
        continueDebug.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                CommandPanel.getCommandPanel(mainInterface).continueWithDebug();
                dispose();
            }
        });

        JButton StopDebug = new JButton(NO_OPTION);
        StopDebug.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                CommandPanel.getCommandPanel(mainInterface).stopDebug();
                dispose();
            }
        });

        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup().addContainerGap(112, Short.MAX_VALUE)
                                .addComponent(continueDebug).addGap(18, 18, 18).addComponent(StopDebug)
                                .addContainerGap(112, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(messageText)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(43, 43, 43).addComponent(messageText).addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(continueDebug).addComponent(StopDebug))
                        .addContainerGap(198, Short.MAX_VALUE)));

        pack();

        this.setVisible(true);
    }

}
