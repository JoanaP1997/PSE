package dibugger.userinterface;


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


    JButton start = new JButton();
    ImageIcon iconStart = new ImageIcon("res/ui/play-arrow.png");
    start.setIcon(iconStart);

    JButton stop = new JButton();
    ImageIcon iconStop = new ImageIcon("res/ui/stop-button.png");
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
}
