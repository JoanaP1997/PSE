package dibugger.UserInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CommandPanel extends JPanel {
    private JButton start;
    private JButton stop;
    private JButton step;
    private JButton stepOver;
    private JButton stepOut;
    private JButton stepBack;
    private static CommandPanel singleton = null;

    private CommandPanel() {
        initComponents();
        this.setVisible(true);
    }

    private void initComponents() {
        LayoutManager layout = new GridLayout(0, 2);
        this.setLayout(layout);


        JButton start = new JButton("start");
        this.add(start,layout);

        JButton stop = new JButton(("stop"));
        this.add(stop, layout);

        JButton step = new JButton(("Step"));
        this.add(step, layout);

        JButton stepOver = new JButton("StepOver");
        this.add(stepOver);

        JButton stepOut = new JButton(("StepOut"));
        this.add(stepOut, layout);

        JButton stepBack = new JButton("StepBack");
        this.add(stepBack, layout);
    }

    public static CommandPanel getCommandPanel() {
        if (singleton == null) {
            singleton = new CommandPanel();
        }
        return singleton;
    }
}
