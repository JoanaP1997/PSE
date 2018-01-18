package dibugger.userinterface.dibuggerpopups;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ErrorPopUp extends DIbuggerPopUp {

    public ErrorPopUp(String message) {
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
                dispose();
            }
        });
        this.add(ok, constraints);

        this.setVisible(true);
    }

}
