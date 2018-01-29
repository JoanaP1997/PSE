package dibugger.userinterface.dibuggerpopups;

import dibugger.userinterface.CommandPanel;
import dibugger.userinterface.MainInterface;
import java.awt.*;
import javax.swing.*;

/**
 * PopUp that informs the user about an Error which can´t be handled by the logic itself. The user needs to change
 * something to make the debugging process work
 */
public class ErrorPopUp extends DIbuggerPopUp {

    private MainInterface mainInterface;

  /**
   * constructor for an ErrorPopUp
   * @param message String that is be shown to the user
   * @param mainInterface MainInterface on which the PopUp is called
   */
    public ErrorPopUp(String message, MainInterface mainInterface) {
        this.mainInterface = mainInterface;
        this.setSize(300, 100);
        this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        GridBagLayout layout = new GridBagLayout();
        this.setLayout(layout);
        GridBagConstraints constraints = new GridBagConstraints();
        this.add(new JLabel(message), constraints);
        constraints.gridy = 1;
        this.setModal(true);
        this.setLocationRelativeTo(mainInterface);

        JButton ok = new JButton("OK");
        ok.addActionListener(actionEvent -> {
            CommandPanel.getCommandPanel(this.mainInterface).stopDebug();
            dispose();
        });

        this.add(ok, constraints);

        this.setVisible(true);
    }

}
