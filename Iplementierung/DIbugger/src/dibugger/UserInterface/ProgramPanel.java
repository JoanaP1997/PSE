package dibugger.UserInterface;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.metal.MetalBorders;
import java.awt.*;

public class ProgramPanel extends JPanel {
    int id;
    String inputVar = "default";
    String stepSize = "1";
    String text = "<html><body>Zeile 1<br>Zeile 2<br> Zeile 3<br> Zeile 4</body></html>";

    JLabel identifier;
    JLabel code;
    JLabel stepsizelabel;
    JLabel inputvars;

    public ProgramPanel(int identifier) {
        id = identifier;
        initComponents();
    }

    private void initComponents() {
        this.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        this.setVisible(true);
        identifier = new JLabel();
        identifier.setText("<html><body>Programm:<br>" + id + "</body></html>");
        identifier.setBorder(new BevelBorder(BevelBorder.RAISED));
        constraints.gridy = 0;
        constraints.gridx = 0;
        this.add(identifier, constraints);

        code = new JLabel();
        code.setText(text);
        code.setBorder(new LineBorder(new Color(0)));
        constraints.gridy = 2;
        constraints.fill = GridBagConstraints.BOTH;
        this.add(code, constraints);

        inputvars = new JLabel("<html><body>Eingabevariablen:<br>" + inputVar + "</body></html>");
        inputvars.setBorder(new LineBorder(new Color(0)));
        constraints.gridx = 1;
        constraints.gridy = 1;
        this.add(inputvars, constraints);

        stepsizelabel = new JLabel("<html><body>Stepsize:<br>" + stepSize + "</body></html>");
        stepsizelabel.setBorder(new LineBorder(new Color(0)));
        constraints.gridx = 0;
        this.add(stepsizelabel, constraints);



    }
}
