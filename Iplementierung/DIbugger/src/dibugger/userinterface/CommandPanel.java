package dibugger.userinterface;

import javax.swing.*;
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
  private MainInterface mainInterface;

  private CommandPanel(MainInterface mainInterface) {
    this.mainInterface = mainInterface;
    initComponents();
    this.setVisible(true);
  }

  private void initComponents() {
    GroupLayout groupLayout = new GroupLayout(this);
    this.setLayout(groupLayout);


    start = new JButton();
    start.addActionListener(actionEvent -> {
      start.setEnabled(false);
      stop.setEnabled(true);
      mainInterface.startDebug();
    });
    ImageIcon iconStart = new ImageIcon("res/ui/play-arrow.png");
    start.setIcon(iconStart);

    stop = new JButton();
    stop.addActionListener(actionEvent -> {
      stop.setEnabled(false);
      start.setEnabled(true);
      stopDebug();
    });
    ImageIcon iconStop = new ImageIcon("res/ui/stop-button.png");
    stop.setIcon(iconStop);

    //TODO: richtiger Step Typ
    step = new JButton(("Step"));
    step.addActionListener(actionEvent -> mainInterface.getControlFacade().step(0));

    stepOver = new JButton("StepOver");
    stepOver.addActionListener(actionEvent -> mainInterface.getControlFacade().step(0));

    stepOut = new JButton(("StepOut"));
    stepOut.addActionListener(actionEvent -> mainInterface.getControlFacade().step(0));

    stepBack = new JButton("StepBack");
    stepBack.addActionListener(actionEvent -> mainInterface.getControlFacade().step(0));

    continueDebug = new JButton("Continue");
    continueDebug.addActionListener(
        actionEvent -> mainInterface.getControlFacade().continueDebug());

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

  public static CommandPanel getCommandPanel(MainInterface mainInterface) {
    if (singleton == null) {
      singleton = new CommandPanel(mainInterface);
    }
    return singleton;
  }

  public void stopDebug() {
    mainInterface.getControlFacade().stopDebug();
  }


  public void continueWithDebug() {
    mainInterface.getControlFacade().continueDebug();
  }

  public void reset() {
    stop.setEnabled(false);
    start.setEnabled(true);
  }
}
