package dibugger.UserInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author joana & chiara
 */
public class MainInterface extends javax.swing.JFrame {

    ArrayList<ProgramPanel> programPanels;
    ArrayList<ExpressionPanel> expressionPanels;

    private javax.swing.JMenu dateiMenu;
    private javax.swing.JMenu vorschläge;
    private javax.swing.JMenu settings;
    private javax.swing.JMenu help;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPanel firstTextPanel;
    private javax.swing.JPanel secondTextPanel;
    private javax.swing.JPanel rightControlBar;

    private JPanel controlButtonsPanel;
    private JPanel watchExpPanel;
    private JPanel condBreakPanel;
    
    private JMenuItem newView;
    private JMenuItem loadConfig;
    private JMenuItem saveConfig;
    private JMenuItem exit;

    /**
     * Creates new MainInterface
     */
    public MainInterface() {
        new GUIFacade(this);
        initComponents();
    }


    private void initComponents() {

        firstTextPanel = new javax.swing.JPanel();
        secondTextPanel = new javax.swing.JPanel();
        rightControlBar = new javax.swing.JPanel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        configureMenuBar();

        constraints.fill = GridBagConstraints.HORIZONTAL;


        firstTextPanel.add(new ProgramPanel(1));
        constraints.gridx = 0;
        constraints.gridy = 0;
        this.add(firstTextPanel, constraints);


        secondTextPanel.add(new ProgramPanel(2));
        constraints.gridx = 1;
        this.add(secondTextPanel, constraints);

        initRightControlBar();

        constraints.gridx = 3;
        this.add(rightControlBar, constraints);


        pack();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) { }


        MainInterface mface = new MainInterface();
        mface.setSize(800,800);
        mface.setVisible(true);
    }

    private void configureMenuBar() {
        menuBar = new javax.swing.JMenuBar();
        dateiMenu = new javax.swing.JMenu();
        vorschläge = new javax.swing.JMenu();
        settings = new javax.swing.JMenu();
        help = new javax.swing.JMenu();

        //Datei Menü
        dateiMenu.setText("Datei");
        menuBar.add(dateiMenu);
        newView = new JMenuItem();
        newView.setText("Neu..");
        loadConfig = new JMenuItem();
        loadConfig.setText("Konfigurationsdatei laden");
        saveConfig = new JMenuItem();
        saveConfig.setText("Aktuellen Lauf speichern");
        exit = new JMenuItem();
        exit.setText("DIbugger beenden");

        //Vorschläge Menü
        vorschläge.setText("Vorschläge");
        menuBar.add(vorschläge);


        //Einstellungen Menü
        settings.setText("Einstellungen");
        menuBar.add(settings);


        //Hilfe Menü
        help.setText("?");
        menuBar.add(help);



        exit.addActionListener(actionEvent -> System.exit(0));

        dateiMenu.add(newView);
        dateiMenu.add(loadConfig);
        dateiMenu.add(saveConfig);
        dateiMenu.add(exit);
        setJMenuBar(menuBar);
    }

    private void initRightControlBar() {
        condBreakPanel = new JPanel();
        condBreakPanel.add(ConditionalBreakpointPanel.getConditionalBreakpointPanel());

        controlButtonsPanel = new JPanel();
        controlButtonsPanel.add(CommandPanel.getCommandPanel());

        watchExpPanel = new JPanel();
        watchExpPanel.add(WatchExpressionPanel.getWatchExpressionPanel());

        rightControlBar.setLayout(new GridBagLayout());
        GridBagConstraints controlConstraints = new GridBagConstraints();
        controlConstraints.gridx = 0;
        controlConstraints.gridy = 0;

        rightControlBar.add(controlButtonsPanel, controlConstraints);

        controlConstraints.gridy = 1;
        rightControlBar.add(condBreakPanel, controlConstraints);

        controlConstraints.gridy = 2;
        rightControlBar.add(watchExpPanel, controlConstraints);
    }

    void update() {
        for (ProgramPanel p : programPanels) {
            p.update();
        }

        for (ExpressionPanel e : expressionPanels) {
            e.update();
        }
    }
}
