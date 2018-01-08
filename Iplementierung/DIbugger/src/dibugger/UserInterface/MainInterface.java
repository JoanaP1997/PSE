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

    private JLabel controlButtons;
    private JLabel watchExps;
    private JLabel condBreaks;

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

        JLabel first = new JLabel("Erster Text");
        firstTextPanel.add(new ProgramPanel(1));
        constraints.gridx = 0;
        constraints.gridy = 0;
        this.add(firstTextPanel, constraints);

        JLabel second = new JLabel("Zweiter Text");
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
    public static void main(String args[]) throws Exception {
        /* Set the Nimbus look and feel */
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }

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

        dateiMenu.setText("Datei");
        menuBar.add(dateiMenu);

        vorschläge.setText("Vorschläge");
        menuBar.add(vorschläge);

        settings.setText("Einstellungen");
        menuBar.add(settings);

        help.setText("?");
        menuBar.add(help);

        newView = new JMenuItem();
        newView.setText("Neu..");
        loadConfig = new JMenuItem();
        loadConfig.setText("Konfigurationsdatei laden");
        saveConfig = new JMenuItem();
        saveConfig.setText("Aktuellen Lauf speichern");
        exit = new JMenuItem();
        exit.setText("DIbugger beenden");

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

        dateiMenu.add(newView);
        dateiMenu.add(loadConfig);
        dateiMenu.add(saveConfig);
        dateiMenu.add(exit);
        setJMenuBar(menuBar);
    }

    private void initRightControlBar() {
        condBreakPanel = new JPanel();
        condBreaks = new JLabel();
        condBreaks.setText("bedingte Breakpoints");
        condBreakPanel.add(condBreaks);

        controlButtonsPanel = new JPanel();
        controlButtons = new JLabel();
        controlButtons.setText("Control Buttons");
        controlButtonsPanel.add(controlButtons);

        watchExpPanel = new JPanel();
        watchExps = new JLabel("Watch Expressions");
        watchExpPanel.add(watchExps);

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
