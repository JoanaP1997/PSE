package dibugger.userinterface;

import dibugger.debuglogic.debugger.DebugControl;
import dibugger.filehandler.facade.LanguageFile;

import javax.swing.*;

/**
 * class that represents the CommandPanel where the user can control the debug
 * mechanisms.
 */
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

    private static String START_TOOLTIP = "Hier klicken um den Debug-Modus zu starten";
    private static String STOP_TOOLTIP = "Hier klicken um den Debug-Modus zu beenden.";
    private static String STEP_TOOLTIP = "Bei Schrittgröße festgelegte Anzahl an Befehlen wird ausgeführt";
    private static String STEP_OVER_TOOLTIP = "Methodenausführung nur im Hintergrund ausführen und nächsten Schritt "
            + "danach anzeigen";
    private static String STEP_OUT_TOOLTIP = "Methode verlassen und debuggen danach fortführen";
    private static String STEP_BACK_TOOLTIP = "Die in Schrittgröße festgelegte Anzahl an Befehlsausführen wird rückgängig"
            + " gemacht";
    private static String CONTINUE_TOOLTIP = "Befehle werden bis zum nächsten Breakpoint ausgeführt";

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
            startDebug();
            WatchExpressionPanel.getWatchExpressionPanel(mainInterface).saveWEs();
            ConditionalBreakpointPanel.getConditionalBreakpointPanel(mainInterface).saveCBs();
        });
        ImageIcon iconStart = new ImageIcon("res/ui/play-arrow.png");
        start.setIcon(iconStart);
        start.setToolTipText(START_TOOLTIP);

        stop = new JButton();
        stop.setEnabled(false);
        stop.addActionListener(actionEvent -> {
            stopDebug();
            WatchExpressionPanel.getWatchExpressionPanel(mainInterface).saveWEs();
            ConditionalBreakpointPanel.getConditionalBreakpointPanel(mainInterface).saveCBs();
        });
        ImageIcon iconStop = new ImageIcon("res/ui/stop-button.png");
        stop.setIcon(iconStop);
        stop.setToolTipText(STOP_TOOLTIP);

        step = new JButton(("Step"));
        step.setEnabled(false);
        step.addActionListener(actionEvent -> {
            mainInterface.getControlFacade().step(DebugControl.STEP_NORMAL);
            WatchExpressionPanel.getWatchExpressionPanel(mainInterface).saveWEs();
            ConditionalBreakpointPanel.getConditionalBreakpointPanel(mainInterface).saveCBs();
        });
        step.setToolTipText(STEP_TOOLTIP);

        stepOver = new JButton("StepOver");
        stepOver.setEnabled(false);
        stepOver.addActionListener(actionEvent -> {
            mainInterface.getControlFacade().step(DebugControl.STEP_OVER);
            WatchExpressionPanel.getWatchExpressionPanel(mainInterface).saveWEs();
            ConditionalBreakpointPanel.getConditionalBreakpointPanel(mainInterface).saveCBs();
        });
        stepOver.setToolTipText(STEP_OVER_TOOLTIP);

        stepOut = new JButton(("StepOut"));
        stepOut.setEnabled(false);
        stepOut.addActionListener(actionEvent -> {
            mainInterface.getControlFacade().step(DebugControl.STEP_OUT);
            WatchExpressionPanel.getWatchExpressionPanel(mainInterface).saveWEs();
            ConditionalBreakpointPanel.getConditionalBreakpointPanel(mainInterface).saveCBs();
        });
        stepOut.setToolTipText(STEP_OUT_TOOLTIP);

        stepBack = new JButton("StepBack");
        stepBack.setEnabled(false);
        stepBack.addActionListener(actionEvent -> {
            mainInterface.getControlFacade().step(DebugControl.STEP_BACK);
            WatchExpressionPanel.getWatchExpressionPanel(mainInterface).saveWEs();
            ConditionalBreakpointPanel.getConditionalBreakpointPanel(mainInterface).saveCBs();
        });
        stepBack.setToolTipText(STEP_BACK_TOOLTIP);

        continueDebug = new JButton("Continue");
        continueDebug.setEnabled(false);
        continueDebug.addActionListener(actionEvent -> {
            mainInterface.getControlFacade().continueDebug();
            WatchExpressionPanel.getWatchExpressionPanel(mainInterface).saveWEs();
            ConditionalBreakpointPanel.getConditionalBreakpointPanel(mainInterface).saveCBs();
        });
        continueDebug.setToolTipText(CONTINUE_TOOLTIP);

        groupLayout.setHorizontalGroup(groupLayout.createSequentialGroup()
                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(start)
                        .addComponent(step).addComponent(stepOut).addComponent(continueDebug))
                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(stop)
                        .addComponent(stepBack).addComponent(stepOver))

        );
        groupLayout.setVerticalGroup(groupLayout.createSequentialGroup()
                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(start)
                        .addComponent(stop))
                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(step)
                        .addComponent(stepBack))
                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(stepOut)
                        .addComponent(stepOver))
                .addComponent(continueDebug));
    }

    /**
     * Singleton-pattern. Get Method for single instance of CommandPanel
     *
     * @param mainInterface
     *            main Interface
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
        step.setEnabled(false);
        stepOut.setEnabled(false);
        stepOver.setEnabled(false);
        stepBack.setEnabled(false);
        continueDebug.setEnabled(false);
        stop.setEnabled(false);
        start.setEnabled(true);
        mainInterface.stopDebug();
    }

    /**
     * continues debug mode.
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
        this.updateUI();
    }

    /**
     * starts the debug mode.
     */
    void startDebug() {
        stop.setEnabled(true);
        start.setEnabled(false);
        stepBack.setEnabled(true);
        step.setEnabled(true);
        stepOut.setEnabled(true);
        stepOver.setEnabled(true);
        continueDebug.setEnabled(true);
        mainInterface.startDebug();
    }

    /**
     * changes language of the tooltips.
     */
    void changeLanguage() {
        LanguageFile languageFile = mainInterface.getControlFacade().getLanguageFile();
        start.setToolTipText(languageFile.getTranslation("ui_start_tooltip"));
        stop.setToolTipText(languageFile.getTranslation("ui_stop_tooltip"));
        step.setToolTipText(languageFile.getTranslation("ui_step_tooltip"));
        stepOver.setToolTipText(languageFile.getTranslation("ui_stepover_tooltip"));
        stepOut.setToolTipText(languageFile.getTranslation("ui_stepout_tooltip"));
        stepBack.setToolTipText(languageFile.getTranslation("ui_stepback_tooltip"));
        continueDebug.setToolTipText(languageFile.getTranslation("ui_continue_tooltip"));
    }
}
