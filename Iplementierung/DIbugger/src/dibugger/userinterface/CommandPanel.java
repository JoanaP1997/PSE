package dibugger.userinterface;

import dibugger.debuglogic.debugger.DebugControl;

import javax.swing.*;

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
    stop.setEnabled(false);
    stop.addActionListener(actionEvent -> {
      stop.setEnabled(false);
      start.setEnabled(true);
      stopDebug();
    });
    ImageIcon iconStop = new ImageIcon("res/ui/stop-button.png");
    stop.setIcon(iconStop);

    step = new JButton(("Step"));
    step.addActionListener(
        actionEvent -> mainInterface.getControlFacade().step(DebugControl.STEP_NORMAL));

    stepOver = new JButton("StepOver");
    stepOver.addActionListener(
        actionEvent -> mainInterface.getControlFacade().step(DebugControl.STEP_OVER));

    stepOut = new JButton(("StepOut"));
    stepOut.addActionListener(
        actionEvent -> mainInterface.getControlFacade().step(DebugControl.STEP_OUT));

    stepBack = new JButton("StepBack");
    stepBack.addActionListener(
        actionEvent -> mainInterface.getControlFacade().step(DebugControl.STEP_BACK));

    continueDebug = new JButton("Continue");
    continueDebug.addActionListener(
        actionEvent -> mainInterface.getControlFacade().continueDebug());

    groupLayout.setHorizontalGroup(groupLayout.createSequentialGroup()
        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(start)
            .addComponent(step).addComponent(stepOut).addComponent(continueDebug))
        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(stop)
            .addComponent(stepBack)
            .addComponent(stepOver))

    );
    groupLayout.setVerticalGroup(groupLayout.createSequentialGroup()
        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(start)
            .addComponent(stop))
        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(step)
            .addComponent(stepBack))
        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(stepOut)
            .addComponent(stepOver))
        .addComponent(continueDebug));
  }

  /**
   * Singleton-pattern. Get Method for single instance of CommandPanel
   * @param mainInterface main Interface
   * @return single instance of CommandPanel
   */
  public static CommandPanel getCommandPanel(MainInterface mainInterface) {
    if (singleton == null) {
      singleton = new CommandPanel(mainInterface);
    }
    return singleton;
  }

  /**
   * Stops Debugmode.
   */
  public void stopDebug() {
    mainInterface.getControlFacade().stopDebug();
  }

  /**
   * starts debugmode.
   */
  public void continueWithDebug() {
    mainInterface.getControlFacade().continueDebug();
  }

  /**
   * resets the command panel.
   */
  public void reset() {
    stop.setEnabled(false);
    start.setEnabled(true);
  }
}
