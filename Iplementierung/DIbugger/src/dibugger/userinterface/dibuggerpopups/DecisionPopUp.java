package dibugger.userinterface.dibuggerpopups;

import dibugger.userinterface.CommandPanel;
import dibugger.userinterface.GUIFacade;
import dibugger.userinterface.MainInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DecisionPopUp extends DIbuggerPopUp {
    private String yesOption = "Yes";
    private String noOption = "No";
    private String message;
    private MainInterface mainInterface;

    public DecisionPopUp(String message, MainInterface mainInterface) {
        this.mainInterface = mainInterface;
        this.message = message;
        this.setSize(300, 100);
        this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        GroupLayout layout = new GroupLayout(getContentPane());
        this.setLayout(layout);
        getContentPane().setLayout(layout);
        this.setModal(true);

        JLabel messageText = new JLabel(message);

        JButton continueDebug = new JButton(yesOption);
        continueDebug.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                CommandPanel.getCommandPanel(mainInterface).continueWithDebug();
                dispose();
            }
        });

        JButton StopDebug = new JButton(noOption);
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
