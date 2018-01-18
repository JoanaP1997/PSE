package dibugger.userinterface;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 *
 * @author joana & chiara
 */
public class MainInterface extends JFrame {

    ArrayList<ProgramPanel> programPanels;

    private JMenu fileMenu;
    private JMenu suggestionMenu;
    private JMenu settingsMenu;
    private JMenu helpMenu;
    
    private JMenuBar menuBar;
    private JPanel rightControlBar;

    private JPanel controlButtonsPanel;
    private JPanel watchExpPanel;
    private JPanel condBreakPanel;

    private JPanel codePanel;
    private FlowLayout codePanelLayout;

    private JMenuItem newView;
    private JMenuItem newProgram;
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

        rightControlBar = new JPanel();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        GroupLayout groupLayout = new GroupLayout(getContentPane());
        getContentPane().setLayout(groupLayout);

        configureMenuBar();
        programPanels = new ArrayList<>();
        programPanels.add(new ProgramPanel("A"));
        programPanels.add(new ProgramPanel("B"));
        codePanel = new JPanel();
        codePanelLayout = new FlowLayout();
        codePanel.setLayout(codePanelLayout);
        codePanel.add(programPanels.get(0), codePanelLayout);
        codePanel.add(programPanels.get(1), codePanelLayout);


        JScrollPane codeScrollPane = new JScrollPane( JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS );
        codeScrollPane.setViewportView(codePanel);
        codeScrollPane.setPreferredSize(new Dimension(800,1000));
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
        ImageIcon icon = new ImageIcon("res/ui/logo_nongi.png");
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
        menuBar = new JMenuBar();
        fileMenu = new JMenu();
        suggestionMenu = new JMenu();
        settingsMenu = new JMenu();
        helpMenu = new JMenu();

        //Datei Menü
        fileMenu.setText("Datei");
        menuBar.add(fileMenu);
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
            programPanels.add(new ProgramPanel(calcNextProgramID()));
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
        fileMenu.add(newView);
        fileMenu.add(newProgram);
        fileMenu.add(loadConfig);
        fileMenu.add(saveConfig);
        fileMenu.add(exit);
        //Vorschläge Menü
        suggestionMenu.setText("Vorschläge");
        menuBar.add(suggestionMenu);


        //Einstellungen Menü
        settingsMenu.setText("Einstellungen");
        menuBar.add(settingsMenu);


        //Hilfe Menü
        helpMenu.setText("?");
        menuBar.add(helpMenu);






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
        rightControlBar.setPreferredSize(new Dimension(200, 1000));
    }

    public int getProgramCount() {
        return programPanels.size();
    }

    private String calcNextProgramID() {
        return "A";
    }


}
