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
    private javax.swing.JPanel rightControlBar;

    private JPanel controlButtonsPanel;
    private JPanel watchExpPanel;
    private JPanel condBreakPanel;

    private JPanel codePanel;

    private JMenuItem newView;
    private JMenuItem newProgram;
    private JMenuItem loadConfig;
    private JMenuItem saveConfig;
    private JMenuItem exit;

    private  FlowLayout codePanelLayout;

    /**
     * Creates new MainInterface
     */
    public MainInterface() {
        new GUIFacade(this);
        initComponents();
    }


    private void initComponents() {

        rightControlBar = new javax.swing.JPanel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        GroupLayout groupLayout = new GroupLayout(getContentPane());
        getContentPane().setLayout(groupLayout);

        configureMenuBar();
        programPanels = new ArrayList<>();
        programPanels.add(new ProgramPanel(1));
        programPanels.add(new ProgramPanel(2));
        codePanel = new JPanel();
        codePanelLayout = new FlowLayout();
        codePanel.setLayout(codePanelLayout);
        codePanel.add(programPanels.get(0), codePanelLayout);
        codePanel.add(programPanels.get(1), codePanelLayout);
        JScrollPane codeScrollPane = new JScrollPane( JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS );
        codeScrollPane.setViewportView(codePanel);

        initRightControlBar();

        groupLayout.setHorizontalGroup(
                groupLayout.createSequentialGroup()
                                .addComponent(codeScrollPane)
                                .addComponent(rightControlBar)

        );
        groupLayout.setVerticalGroup(
                groupLayout.createSequentialGroup()
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(codeScrollPane)
                        .addComponent(rightControlBar))
        );

        this.setTitle("DIbugger");
        ImageIcon icon = new ImageIcon("res/logo_nongi.png");
        this.setIconImage(icon.getImage());

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) { }


        MainInterface mface = new MainInterface();
        mface.setSize(1200,800);
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
        newView.setText("Neu");
        newView.addActionListener(actionEvent -> {
            //TODO: Decision PoPUP -> wirklich? ja nein
            dispose();
            MainInterface.main(null);
        });
        newProgram = new JMenuItem();
        newProgram.setText("Programm hinzufügen");
        newProgram.addActionListener(actionEvent -> {
            programPanels.add(new ProgramPanel(programPanels.size() + 1));
            codePanel.add(programPanels.get(programPanels.size() - 1), codePanelLayout);
            codePanel.updateUI();
            //TODO: hier aus Datei einbinden einfügen? mit DecisionPopUP?
        });
        loadConfig = new JMenuItem();
        loadConfig.setText("Konfigurationsdatei laden");
        saveConfig = new JMenuItem();
        saveConfig.setText("Aktuellen Lauf speichern");
        exit = new JMenuItem();
        exit.setText("DIbugger beenden");
        exit.addActionListener(actionEvent -> System.exit(0));
        dateiMenu.add(newView);
        dateiMenu.add(newProgram);
        dateiMenu.add(loadConfig);
        dateiMenu.add(saveConfig);
        dateiMenu.add(exit);
        //Vorschläge Menü
        vorschläge.setText("Vorschläge");
        menuBar.add(vorschläge);


        //Einstellungen Menü
        settings.setText("Einstellungen");
        menuBar.add(settings);


        //Hilfe Menü
        help.setText("?");
        menuBar.add(help);






        setJMenuBar(menuBar);
    }

    private void initRightControlBar() {
        condBreakPanel = new JPanel();
        condBreakPanel.add(ConditionalBreakpointPanel.getConditionalBreakpointPanel());

        controlButtonsPanel = new JPanel();
        controlButtonsPanel.add(CommandPanel.getCommandPanel());

        watchExpPanel = new JPanel();
        watchExpPanel.add(WatchExpressionPanel.getWatchExpressionPanel(this));

        GroupLayout groupLayout = new GroupLayout(rightControlBar);
        rightControlBar.setLayout(groupLayout);

        groupLayout.setHorizontalGroup(
                groupLayout.createSequentialGroup()
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(controlButtonsPanel)
                            .addComponent(watchExpPanel)
                            .addComponent(condBreakPanel))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createSequentialGroup()
                                .addComponent(controlButtonsPanel)
                                .addComponent(watchExpPanel)
                                .addComponent(condBreakPanel)
        );

    }

    public int getProgramCount() {
        return programPanels.size();
    }


}
