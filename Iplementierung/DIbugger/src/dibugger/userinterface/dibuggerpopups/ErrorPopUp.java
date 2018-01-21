package dibugger.userinterface.dibuggerpopups;


import dibugger.userinterface.CommandPanel;
import dibugger.userinterface.MainInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ErrorPopUp extends DIbuggerPopUp {

    private MainInterface mainInterface;

    public ErrorPopUp(String message, MainInterface mainInterface) {
        this.setSize(300, 100);
        this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        GridBagLayout layout = new GridBagLayout();
        this.setLayout(layout);
        GridBagConstraints constraints = new GridBagConstraints();
        this.add(new JLabel(message), constraints);
        constraints.gridy = 1;
        this.setModal(true);

        JButton ok = new JButton("OK");
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                CommandPanel.getCommandPanel(mainInterface).stopDebug();
                dispose();
            }
        });
        this.add(ok, constraints);

        this.setVisible(true);
    }

}
