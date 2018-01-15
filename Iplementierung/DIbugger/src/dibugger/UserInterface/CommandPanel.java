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
    private JButton continueDebug;
    private static CommandPanel singleton = null;

    private static final int ICON_SIZE = 32;
    
    private CommandPanel() {
        initComponents();
        this.setVisible(true);
    }

    private void initComponents() {
        GroupLayout groupLayout = new GroupLayout(this);
        this.setLayout(groupLayout);


        JButton start = new JButton();
        ImageIcon iconStart = new ImageIcon("res/play-arrow.png");
        iconStart.setImage(iconStart.getImage().getScaledInstance(ICON_SIZE, ICON_SIZE,  Image.SCALE_SMOOTH ));
        start.setIcon(iconStart);

        JButton stop = new JButton();
        ImageIcon iconStop = new ImageIcon("res/stop-button.png");
        iconStop.setImage(iconStop.getImage().getScaledInstance(ICON_SIZE, ICON_SIZE,  Image.SCALE_SMOOTH ));
        stop.setIcon(iconStop);

        JButton step = new JButton(("Step"));

        JButton stepOver = new JButton("StepOver");

        JButton stepOut = new JButton(("StepOut"));

        JButton stepBack = new JButton("StepBack");

        JButton continueDebug = new JButton("Continue");

        groupLayout.setHorizontalGroup(
                groupLayout.createSequentialGroup()
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(start)
                                .addComponent(step)
                                .addComponent(stepOut)
                                .addComponent(continueDebug))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(stop)
                                .addComponent(stepBack)
                                .addComponent(stepOver))

        );
        groupLayout.setVerticalGroup(
                groupLayout.createSequentialGroup()
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(start)
                                .addComponent(stop))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(step)
                                .addComponent(stepBack))
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(stepOut)
                                .addComponent(stepOver))
                        .addComponent(continueDebug)
        );
    }

    public static CommandPanel getCommandPanel() {
        if (singleton == null) {
            singleton = new CommandPanel();
        }
        return singleton;
    }
}
