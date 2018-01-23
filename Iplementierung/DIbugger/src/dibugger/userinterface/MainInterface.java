package dibugger.userinterface;

import dibugger.control.ControlFacade;
import dibugger.userinterface.dibuggerpopups.ErrorPopUp;

import java.awt.*;
import java.util.*;
import java.util.List;
import javax.swing.*;

/**
 * MainInterface of the Dibugger including the main method.
 * 
 * @author joana & chiara
 */
public class MainInterface extends JFrame {

    TreeMap<String, ProgramPanel> programPanels;

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

    private GUIFacade guiFacade;
    private ControlFacade controlFacade;

    /**
     * Creates new MainInterface.
     */
    public MainInterface() {
        guiFacade = new GUIFacade(this);
        controlFacade = new ControlFacade(guiFacade);
        initComponents();
    }

    /**
     * initializes the components of the main interface.
     */
    private void initComponents() {
        rightControlBar = new JPanel();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        GroupLayout groupLayout = new GroupLayout(getContentPane());
        getContentPane().setLayout(groupLayout);

        configureMenuBar();
        programPanels = new TreeMap<>();
        programPanels.put("A", new ProgramPanel("A"));
        programPanels.put("B", new ProgramPanel("B"));
        codePanel = new JPanel();
        codePanelLayout = new FlowLayout();
        codePanel.setLayout(codePanelLayout);
        codePanel.add(programPanels.get("A"), codePanelLayout);
        codePanel.add(programPanels.get("B"), codePanelLayout);

        JScrollPane codeScrollPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        codeScrollPane.setViewportView(codePanel);
        codeScrollPane.setPreferredSize(new Dimension(800, 1000));
        initRightControlBar();

        groupLayout.setHorizontalGroup(
                groupLayout.createSequentialGroup().addComponent(codeScrollPane).addComponent(rightControlBar));
        groupLayout.setVerticalGroup(groupLayout.createSequentialGroup()
                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(codeScrollPane)
                        .addComponent(rightControlBar)));

        this.setTitle("DIbugger");
        ImageIcon icon = new ImageIcon("res/ui/logo_nongi.png");
        this.setIconImage(icon.getImage());

    }

    /**
     * main method.
     * 
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // do nothing
        }
        MainInterface mainInterface = new MainInterface();
        mainInterface.setSize(1200, 800);
        mainInterface.setVisible(true);
    }

    /**
     * configures components of menu bar.
     */
    private void configureMenuBar() {
        menuBar = new JMenuBar();
        fileMenu = new JMenu();
        suggestionMenu = new JMenu();
        settingsMenu = new JMenu();
        helpMenu = new JMenu();

        // file menu
        fileMenu.setText("Datei");
        menuBar.add(fileMenu);
        newView = new JMenuItem();
        newView.setText("Neu");
        newView.addActionListener(actionEvent -> {
            reset();
        });
        newProgram = new JMenuItem();
        newProgram.setText("Programm hinzufügen");
        newProgram.addActionListener(actionEvent -> {
            if (programPanels.size() >= 26) {
                new ErrorPopUp("Too many ProgramPanels", this);
            } else {
                String nextId = calcNextProgramId();
                ProgramPanel newPanel = new ProgramPanel(nextId);
                programPanels.put(nextId, newPanel);
                codePanel.add(programPanels.get(nextId), codePanelLayout);
                codePanel.updateUI();
            }
            // TODO: hier aus Datei einbinden einfügen? mit DecisionPopUP?
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
        // menu for suggestions
        suggestionMenu.setText("Vorschläge");
        menuBar.add(suggestionMenu);

        // settings menu
        settingsMenu.setText("Einstellungen");
        menuBar.add(settingsMenu);

        // help menu
        helpMenu.setText("?");
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);
    }

    /**
     * initializes right control bar.
     */
    private void initRightControlBar() {
        condBreakPanel = new JPanel();
        condBreakPanel.add(ConditionalBreakpointPanel.getConditionalBreakpointPanel(this));

        controlButtonsPanel = new JPanel();
        controlButtonsPanel.add(CommandPanel.getCommandPanel(this));

        watchExpPanel = new JPanel();
        watchExpPanel.add(WatchExpressionPanel.getWatchExpressionPanel(this));

        GroupLayout groupLayout = new GroupLayout(rightControlBar);
        rightControlBar.setLayout(groupLayout);

        groupLayout.setHorizontalGroup(groupLayout.createSequentialGroup()
                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(controlButtonsPanel).addComponent(watchExpPanel).addComponent(condBreakPanel)));
        groupLayout.setVerticalGroup(groupLayout.createSequentialGroup().addComponent(controlButtonsPanel)
                .addComponent(watchExpPanel).addComponent(condBreakPanel));
        rightControlBar.setPreferredSize(new Dimension(200, 1000));
    }

    /**
     * get method for the number of programPanels.
     *
     * @return number of programPanels
     */
    public int getProgramCount() {
        return programPanels.size();
    }

    /**
     * calculates ID for next ProgramPanel.
     *
     * @return identifier of next program panel
     */
    private String calcNextProgramId() {
        String newId;
        char[] lastId = programPanels.lastKey().toCharArray();
        char newChar = (char) (lastId[lastId.length - 1] + 1);
        newId = Character.toString(newChar);
        return newId;
    }

    public ControlFacade getControlFacade() {
        return controlFacade;
    }

    public void showProgramText(String programText, String programId) {
        for (String iD : programPanels.descendingKeySet()) {
            if (iD.equals(programId)) {
                programPanels.get(iD).setText(programText);
                break;
            }
        }
        programPanels.put(programId, new ProgramPanel(programText));

    }

    public void reset() {
        CommandPanel.getCommandPanel(this).reset();
        programPanels.clear();
        programPanels.put("A", new ProgramPanel("A"));
        programPanels.put("B", new ProgramPanel("B"));
        WatchExpressionPanel.getWatchExpressionPanel(this).reset();
        ConditionalBreakpointPanel.getConditionalBreakpointPanel(this).reset();

    }

    public void showInput(String programId, List<String> vars) {
        for (String iD : programPanels.descendingKeySet()) {
            if (iD.equals(programId)) {
                String input = "";
                for (String s : vars) {
                    input += s + "; ";
                }
                programPanels.get(iD).showInput(input);
            }
        }
    }

    public List<String> getVariablesOfInspector(String programId) {
        for (String iD : programPanels.descendingKeySet()) {
            if (iD.equals(programId)) {
                return programPanels.get(iD).getInspectedVariables();
            }
        }
        return new ArrayList<>();
    }

    public void showVariables(String programId, List<String> variables) {
        for (String iD : programPanels.descendingKeySet()) {
            if (iD.equals(programId)) {
                programPanels.get(iD).showVariables(variables);
            }
        }
    }

    public void update(Observable observable, Object o) {
        // TODO
    }

    public void changeLanguage() {
        // TODO
    }

    public void startDebug() {

    }

}
