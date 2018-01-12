package dibugger.UserInterface;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
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

    JEditorPane codeField;

    JPanel firstRow;
    JPanel secondRow;
    JPanel textEditorPanel;
    JPanel variableInspectorPanel;

    public ProgramPanel(int identifier) {
        id = identifier;
        initComponents();
    }

    private void initComponents() {
        GridLayout layout = new GridLayout(0, 1);
        this.setLayout(layout);

        GridLayout rowLayout = new GridLayout(1, 0);


        //First row: id of programm (+ plus/minus Buttons)
        firstRow = new JPanel();
        firstRow.setLayout(rowLayout);

        identifier = new JLabel();
        identifier.setText("<html><body>Programm:<br>" + id + "</body></html>");
        identifier.setBorder(new LineBorder(Color.BLACK));

        firstRow.add(identifier);
        this.add(firstRow, layout);

        //SecondRow: Stepsize and Input
        secondRow = new JPanel();
        secondRow.setLayout(rowLayout);

        stepsizelabel = new JLabel("<html><body>Stepsize:<br>" + stepSize + "</body></html>");
        stepsizelabel.setBorder(new LineBorder(new Color(0)));
        secondRow.add(stepsizelabel, rowLayout);

        inputvars = new JLabel("<html><body>Eingabevariablen:<br>" + inputVar + "</body></html>");
        inputvars.setBorder(new LineBorder(new Color(0)));
        secondRow.add(inputvars, rowLayout);



        this.add(secondRow, layout);


        //Text editor panel
        textEditorPanel = new JPanel();

        codeField = new JEditorPane();
        codeField.setSize(100, 100);
        codeField.setBorder(new LineBorder(Color.BLACK));



        this.add(codeField, layout);






        this.setVisible(true);

    }

    public void update() {
        //TODO
    }


}
