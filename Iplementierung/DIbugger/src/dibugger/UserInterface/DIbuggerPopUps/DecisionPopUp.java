package dibugger.UserInterface.DIbuggerPopUps;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DecisionPopUp extends DIbuggerPopUp {
    private String yesOption = "Yes";
    private String noOption = "No";

    public DecisionPopUp(String message) {
        this.setSize(300, 100);
        this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        GridBagLayout layout = new GridBagLayout();
        this.setLayout(layout);
        GridBagConstraints constraints = new GridBagConstraints();
        this.add(new JLabel(message), constraints);
        constraints.gridy = 1;
        this.setModal(true);

        JButton ok = new JButton(yesOption);
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        this.add(ok, constraints);

        JButton no = new JButton(noOption);
        no.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        constraints.gridx = 1;
        this.add(no, constraints);

        this.setVisible(true);
    }

}
