package dibugger.userinterface;

import dibugger.control.ControlFacade;
import dibugger.filehandler.facade.LanguageFile;
import dibugger.userinterface.dibuggerpopups.ErrorPopUp;
import dibugger.userinterface.dibuggerpopups.VariableSuggestionPopUp;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.TreeMap;

/**
 * MainInterface of the DIbugger including the main method.
 *
 * @author joana & chiara
 */
public class MainInterface extends JFrame {
    private static String FILE_MENU = "Datei";
    private static String RESET_GUI = "Zur\u00fccksetzen";
    private static String ADD_PROGRAM = "Programm hinzuf\u00fcgen";
    private static String TOO_MANY_PROGRAM_PANELS = "Zu viele Programme";
    private static String LOAD_CONFIG = "Konfigurationsdatei laden";
    private static String SAVE_CONFIG = "Konfigurationsdatei speichern";
    private static String END_DIBUGGER = "DIbugger beenden";
    private static String SUGGESTIONS = "Vorschl\u00e4ge";
    private static String SUGGEST_STEPSIZE = "Vorschlag f\u00fcr Schrittgr\u00f6\u00dfe";
    private static String SUGGEST_INPUT_VAR = "Vorschlag f\u00fcr Eingabevariablen";
    private static String SUGGEST_WATCHEXPRESSION = "Vorschlag f\u00fcr Watch Expressions";
    private static String SUGGEST_COND_BREAKPOINT = "Vorschlag f\u00fcr Bedingte Breakpoints";
    private static String SETTINGS = "Einstellungen";
    private static String CHANGE_LANGUAGE = "Sprache \u00e4ndern";
    private static String MAX_FUNCTION_CALLS = "Maximale Funktionsaufrufe festlegen";
    private static String MAX_ITERATION = "Maximale Iterationen festlegen";
    private static String SUGGESTION_STRATEGY_STEPSIZE = "Strategie f\u00fcr Vorschl\u00e4ge der Schrittgr\u00f6\u00dfe";
    private static String SUGGESTION_STRATEGY_EXPRESSION = "Strategie f\u00fcr Vorschl\u00e4ge von Watch Expressions / bedingten Breakpoints";
    private static String SUGGESTION_STRATEGY_INPUT = "Strategie f\u00fcr Vorschl\u00e4ge von Eingabevariablen";
    private static String CONFIRM_CLOSE = "DIbugger beenden";
    private static String CONFIRM_CLOSE_QUESTION = "Sind sie sicher, dass sie das Programm beenden möchten?";
    private static String YES_OPTION = "Ja";
    private static String NO_OPTION = "Nein";

    TreeMap<String, ProgramPanel> programPanels;

    private JMenu fileMenu;
    private JMenu suggestionMenu;
    private JMenu settingsMenu;
    private JMenuItem helpMenu;

    private JMenuBar menuBar;
    private JPanel rightControlBar;

    private JPanel controlButtonsPanel;
    private JPanel watchExpPanel;
    private JPanel condBreakPanel;

    private JPanel codePanel;
    private FlowLayout codePanelLayout;
    private JScrollPane codeScrollPane;

    private JMenuItem newView;
    private JMenuItem newProgram;
    private JMenuItem loadConfig;
    private JMenuItem saveConfig;
    private JMenuItem exit;
    private JMenuItem stepSizeSuggestion;
    private JMenuItem inputSuggestion;
    private JMenuItem watchExpressionSuggestion;
    private JMenuItem condBreakpointSuggestion;
    private JMenu maxFunctionCalls;
    private JMenu maxIterations;
    private JMenu languageMenu;
    private JMenu stepSizeStrategyMenu;
    private JMenu expressionStrategyMenu;
    private JMenu inputStrategyMenu;

    private GUIFacade guiFacade;
    private ControlFacade controlFacade;

    private TreeMap<String, String> inputStrategies;
    private TreeMap<String, String> expressionStrategies;
    private TreeMap<String, String> stepsizeStrategies;

    private LanguageFile languageFile;

    /**
     * Creates new MainInterface.
     */
    public MainInterface() {
        guiFacade = new GUIFacade(this);
        controlFacade = guiFacade.getControlFacade();
        initComponents();
    }

    /**
     * main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.setErr(new PrintStream(new FileOutputStream(new File("error.log"))));
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }

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
        mainInterface.setSize(1200, 900);
        mainInterface.setMinimumSize(new Dimension(1165, 0));
        mainInterface.setVisible(true);
    }

    /**
     * initializes the components of the main interface.
     */
    private void initComponents() {
        rightControlBar = new JPanel();
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                showCloseConfirmationDialog();
            }
        });

        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent componentEvent) {
                super.componentResized(componentEvent);
            }
        });
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        getContentPane().setLayout(groupLayout);

        configureMenuBar();

        initProgramPanels();

        initRightControlBar();

        groupLayout.setHorizontalGroup(
                groupLayout.createSequentialGroup().addComponent(codeScrollPane).addComponent(rightControlBar));
        groupLayout.setVerticalGroup(groupLayout.createSequentialGroup()
                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(codeScrollPane)
                        .addComponent(rightControlBar)));

        changeLanguage();
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setTitle("DIbugger");
        ImageIcon icon = new ImageIcon("res/ui/logo_nongi.png");
        this.setIconImage(icon.getImage());

    }

    /**
     * configures components of menu bar.
     */
    private void configureMenuBar() {
        menuBar = new JMenuBar();
        fileMenu = new JMenu();
        suggestionMenu = new JMenu();
        settingsMenu = new JMenu();
        helpMenu = new JMenuItem();

        // file menu
        fileMenu.setText(FILE_MENU);
        menuBar.add(fileMenu);
        newView = new JMenuItem();
        newView.setText(RESET_GUI);
        newView.addActionListener(actionEvent -> {
            reset();
        });
        newProgram = new JMenuItem();
        newProgram.setText(ADD_PROGRAM);
        newProgram.addActionListener(actionEvent -> {
            if (programPanels.size() >= 26) {
                new ErrorPopUp(TOO_MANY_PROGRAM_PANELS, this);
            } else {
                String nextId = calcNextProgramId();
                ProgramPanel newPanel = new ProgramPanel(nextId, this);
                newPanel.setTextWithFileChooser();
                newPanel.changeLanguage();
                programPanels.put(nextId, newPanel);
                codePanel.add(programPanels.get(nextId), codePanelLayout);
                codePanel.updateUI();
            }
        });
        loadConfig = new JMenuItem();
        loadConfig.setText(LOAD_CONFIG);
        loadConfig.addActionListener(actionEvent -> {
            JFileChooser fileChooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("rdbf files (*.rdbf)", "rdbf");
            fileChooser.setFileFilter(filter);
            int returnVal = fileChooser.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                controlFacade.loadConfiguration(file);
            }
        });
        saveConfig = new JMenuItem();
        saveConfig.setText(SAVE_CONFIG);
        saveConfig.addActionListener(actionEvent -> {
            JFileChooser fileChooser = new JFileChooser();
            int returnVal = fileChooser.showSaveDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                saveText();
                File file = fileChooser.getSelectedFile();
                controlFacade.saveConfiguration(file);
            }
        });
        exit = new JMenuItem();
        exit.setText(END_DIBUGGER);
        exit.addActionListener(actionEvent -> {
            showCloseConfirmationDialog();
        });
        fileMenu.add(newView);
        fileMenu.add(newProgram);
        fileMenu.add(loadConfig);
        fileMenu.add(saveConfig);
        fileMenu.add(exit);

        // menu for suggestions
        suggestionMenu.setText(SUGGESTIONS);
        condBreakpointSuggestion = new JMenuItem(SUGGEST_COND_BREAKPOINT);
        condBreakpointSuggestion.addActionListener(
                actionEvent -> new VariableSuggestionPopUp(VariableSuggestionPopUp.CONDITIONAL_BREAKPOINT, this));
        watchExpressionSuggestion = new JMenuItem(SUGGEST_WATCHEXPRESSION);
        watchExpressionSuggestion.addActionListener(
                actionEvent -> new VariableSuggestionPopUp(VariableSuggestionPopUp.WATCH_EXPRESSION, this));
        inputSuggestion = new JMenuItem(SUGGEST_INPUT_VAR);
        inputSuggestion
                .addActionListener(actionEvent -> new VariableSuggestionPopUp(VariableSuggestionPopUp.VARIABLES, this));
        stepSizeSuggestion = new JMenuItem(SUGGEST_STEPSIZE);
        stepSizeSuggestion
                .addActionListener(actionEvent -> new VariableSuggestionPopUp(VariableSuggestionPopUp.STEP_SIZE, this));
        suggestionMenu.add(stepSizeSuggestion);
        suggestionMenu.add(inputSuggestion);
        suggestionMenu.add(watchExpressionSuggestion);
        suggestionMenu.add(condBreakpointSuggestion);

        initStepSizeStrategyMenu();

        initInputStrategyMenu();

        initExpressionStrategyMenu();

        suggestionMenu.add(stepSizeStrategyMenu);
        suggestionMenu.add(inputStrategyMenu);
        suggestionMenu.add(expressionStrategyMenu);

        menuBar.add(suggestionMenu);

        // settings menu
        settingsMenu.setText(SETTINGS);

        initLanguageMenu();

        initMaxFunctionCallsMenu();

        initMaxIterationsMenu();

        settingsMenu.add(languageMenu);
        settingsMenu.add(maxFunctionCalls);
        settingsMenu.add(maxIterations);
        menuBar.add(settingsMenu);

        // help menu
        helpMenu.setText("?");
        helpMenu.addActionListener(actionEvent -> {
            Desktop desktop = Desktop.getDesktop();
            File file = new File("res/ui/Help.pdf");
            try {
                desktop.open(file);
            } catch (IOException e) {
                // do nothing
            }
        });
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
    }

    /**
     * initializes the expression strategy menu and adds an ActionListener to
     * it.
     */
    private void initExpressionStrategyMenu() {
        expressionStrategies = new TreeMap<>();
        expressionStrategyMenu = new JMenu(SUGGESTION_STRATEGY_EXPRESSION);
        ActionListener expressionStrategyListener = e -> {
            String expressionStrategy = ((JMenuItem) e.getSource()).getText();
            // TODO: Map! ausfüllen
        };
        for (String expressionStrategy : controlFacade.getRelationalExpressionSuggestionStrategies()) {
            JMenuItem expressionStrategyItem = new JMenuItem(expressionStrategy);
            expressionStrategyItem.addActionListener(expressionStrategyListener);
            expressionStrategyMenu.add(expressionStrategyItem);
        }
    }

    /**
     * initializes the input strategy menu and adds an ActionListener to it.
     */
    private void initInputStrategyMenu() {
        inputStrategies = new TreeMap<>();
        inputStrategyMenu = new JMenu(SUGGESTION_STRATEGY_INPUT);
        ActionListener inputStrategyListener = e -> {
            String inputStrategy = ((JMenuItem) e.getSource()).getText();
            // TODO: Map? ändern?
        };
        for (String strategy : controlFacade.getInputValueSuggestionStrategies()) {
            JMenuItem strategyItem = new JMenuItem(strategy);
            strategyItem.addActionListener(inputStrategyListener);
            inputStrategyMenu.add(strategyItem);
        }
    }

    /**
     * initializes the step size strategy menu and adds an ActionListener to it.
     */
    private void initStepSizeStrategyMenu() {
        stepsizeStrategies = new TreeMap<>();
        stepSizeStrategyMenu = new JMenu(SUGGESTION_STRATEGY_STEPSIZE);
        ActionListener stepSizeStrategyListener = e -> {
            String stepSizeStrategyItem = ((JMenuItem) e.getSource()).getText();
            // TODO: Map? Ändern?
        };
        for (String stepSizeStrategy : controlFacade.getStepSizeSuggestionStrategies()) {
            JMenuItem stepSizeStrategyItem = new JMenuItem(stepSizeStrategy);
            stepSizeStrategyItem.addActionListener(stepSizeStrategyListener);
            stepSizeStrategyMenu.add(stepSizeStrategyItem);
        }
    }

    /**
     * initializes the menu to choose the maximum of function calls after which
     * the DIbugger stops debugging Also adds an ActionListener to the MenuItems
     */
    private void initMaxFunctionCallsMenu() {
        maxFunctionCalls = new JMenu(MAX_FUNCTION_CALLS);
        ActionListener maxFunctionCallsListener = e -> {
            int maxFunctionCalls = Integer.valueOf(((JMenuItem) e.getSource()).getText());
            controlFacade.setMaximumFunctionCalls(maxFunctionCalls);
        };
        for (int i = 0; i <= 200; i += 10) {
            JMenuItem maxFunctionCallsItem = new JMenuItem(Integer.toString(i));
            maxFunctionCallsItem.addActionListener(maxFunctionCallsListener);
            maxFunctionCalls.add(maxFunctionCallsItem);
        }
    }

    /**
     * initializes the menu to choose the maximum of iterations after which the
     * DIbugger stops debugging Also adds an ActionListener to the MenuItems
     */
    private void initMaxIterationsMenu() {
        maxIterations = new JMenu(MAX_ITERATION);
        ActionListener maxIterationsChangedListener = e -> {
            int maxIterations = Integer.valueOf(((JMenuItem) e.getSource()).getText());
            controlFacade.setMaximumIterations(maxIterations);
        };
        for (int i = 0; i <= 200; i += 10) {
            JMenuItem maxIterationsItem = new JMenuItem(Integer.toString(i));
            maxIterationsItem.addActionListener(maxIterationsChangedListener);
            maxIterations.add(maxIterationsItem);
        }
    }

    /**
     * initializes the menu to choose the language of the UI
     */
    private void initLanguageMenu() {
        languageMenu = new JMenu(CHANGE_LANGUAGE);
        ActionListener languageListener = e -> {
            String language = ((JMenuItem) e.getSource()).getText();
            controlFacade.changeLanguage(language);
        };
        for (String language : controlFacade.getAvailableLanuages()) {
            JMenuItem languageItem = new JMenuItem(language);
            languageItem.addActionListener(languageListener);
            languageMenu.add(languageItem);
        }
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
        rightControlBar.setPreferredSize(new Dimension(300, 1000));
        rightControlBar.setMaximumSize(new Dimension(300, 1000));
    }

    private void initProgramPanels() {
        programPanels = new TreeMap<>();
        programPanels.put("A", new ProgramPanel("A", this));
        programPanels.put("B", new ProgramPanel("B", this));
        codePanel = new JPanel();
        codePanelLayout = new FlowLayout();
        codePanel.setLayout(codePanelLayout);
        programPanels.get("A").setText(controlFacade.loadProgramText(new File("res/ui/previewcode_iterative.txt")));
        programPanels.get("A").showInput("n = 5;");
        programPanels.get("B").setText(controlFacade.loadProgramText(new File("res/ui/previewcode_recursive.txt")));
        programPanels.get("B").showInput("k = 4;");
        codePanel.add(programPanels.get("A"), codePanelLayout);
        codePanel.add(programPanels.get("B"), codePanelLayout);
        codePanel.setMinimumSize(new Dimension(450, 870));

        codeScrollPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        codeScrollPane.setViewportView(codePanel);
        codeScrollPane.setPreferredSize(new Dimension(800, 1000));
    }

    /**
     * get method for the ids of existing programPanels.
     *
     * @return ArrayList of ids
     */
    public ArrayList<String> getProgramIds() {
        return new ArrayList<>(programPanels.keySet());
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

    /**
     * getter for the control facade.
     *
     * @return control facade
     */
    public ControlFacade getControlFacade() {
        return controlFacade;
    }

    /**
     * Resets the user interface.
     */
    void reset() {
        CommandPanel.getCommandPanel(this).reset();
        programPanels.clear();
        programPanels.put("A", new ProgramPanel("A", this));
        programPanels.put("B", new ProgramPanel("B", this));
        programPanels.get("A").setText(controlFacade.loadProgramText(new File("res/ui/previewcode_iterative.txt")));
        programPanels.get("A").showInput("n = 5;");
        programPanels.get("B").setText(controlFacade.loadProgramText(new File("res/ui/previewcode_recursive.txt")));
        programPanels.get("B").showInput("k = 4;");
        codePanel.removeAll();
        codePanel.add(programPanels.get("A"), codePanelLayout);
        codePanel.add(programPanels.get("B"), codePanelLayout);
        WatchExpressionPanel.getWatchExpressionPanel(this).reset();
        ConditionalBreakpointPanel.getConditionalBreakpointPanel(this).reset();

    }

    /**
     * Makes a specified ProgramPanel show a certain input variable String.
     *
     * @param programId
     *            program ID
     * @param vars
     *            new input String
     */
    void showInput(String programId, List<String> vars) {
        for (String id : programPanels.descendingKeySet()) {
            if (id.equals(programId)) {
                String input = "";
                for (String s : vars) {
                    input += s + "; ";
                }
                programPanels.get(id).showInput(input);
            }
        }
    }

    /**
     * Makes a specified ProgramPanel show a new program text.
     *
     * @param programText
     *            program text
     * @param programId
     *            program ID
     */
    void showProgramText(String programText, String programId) {
        for (String id : programPanels.descendingKeySet()) {
            if (id.equals(programId)) {
                programPanels.get(id).setText(programText);
                break;
            }
        }
        programPanels.put(programId, new ProgramPanel(programId, this));
        codePanel.removeAll();
        for (ProgramPanel p : programPanels.values()) {
            p.changeLanguage();
            codePanel.add(p, codePanelLayout);
        }
        programPanels.get(programId).setText(programText);
        codePanel.updateUI();

    }

    /**
     * Returns the inspected variables of a certain ProgramPanel.
     *
     * @param programId
     *            programs ID
     * @return List of Strings containing the variables
     */
    List<String> getVariablesOfInspector(String programId) {
        for (String id : programPanels.descendingKeySet()) {
            if (id.equals(programId)) {
                return programPanels.get(id).getInspectedVariables();
            }
        }
        return new ArrayList<>();
    }

    /**
     * Let's a specified ProgramPanel show new Variables.
     *
     * @param programId
     *            programs ID
     * @param variables
     *            new variables
     */
    void showVariables(String programId, List<String> variables) {
        for (String id : programPanels.descendingKeySet()) {
            if (id.equals(programId)) {
                programPanels.get(id).showVariables(variables);
            }
        }
    }

    /**
     * update-method as part of the observer pattern.
     *
     * @param observable
     *            DebugLogicFacade
     * @param o
     *            Object o
     */
    void update(Observable observable, Object o) {
        for (ProgramPanel panel : programPanels.values()) {
            panel.update(observable);
        }
        WatchExpressionPanel.getWatchExpressionPanel(this).update(observable);
        ConditionalBreakpointPanel.getConditionalBreakpointPanel(this).update(observable);
    }

    /**
     * Starts the debug mode.
     */
    void startDebug() {
        saveText();
        newProgram.setEnabled(false);
        for (ProgramPanel p : programPanels.values()) {
            p.startDebug();
        }
        controlFacade.startDebug();
    }

    /**
     * saves the current code inputs in the control facade.
     */
    public void saveText() {
        ArrayList<String> inputVars = new ArrayList<>();
        ArrayList<String> programTexts = new ArrayList<>();
        ArrayList<String> programIds = new ArrayList<>();
        for (String id : programPanels.keySet()) {
            programIds.add(id);
            ProgramPanel current = programPanels.get(id);
            programTexts.add(current.getText());
            inputVars.add(current.getInputVars());
        }
        controlFacade.saveText(inputVars, programTexts, programIds);
    }

    /**
     * Change of languageMenu.
     */
    public void changeLanguage() {
        if (controlFacade != null) {
            languageFile = controlFacade.getLanguageFile();
            ConditionalBreakpointPanel.getConditionalBreakpointPanel(this).changeLanguage();
            WatchExpressionPanel.getWatchExpressionPanel(this).changeLanguage();
            CommandPanel.getCommandPanel(this).changeLanguage();
            if (programPanels != null) {
                for (ProgramPanel p : programPanels.values()) {
                    p.changeLanguage();
                }
            }
            fileMenu.setText(languageFile.getTranslation("ui_file_menu"));
            newView.setText(languageFile.getTranslation("ui_reset_gui"));
            newProgram.setText(languageFile.getTranslation("ui_add_program"));
            TOO_MANY_PROGRAM_PANELS = languageFile.getTranslation("ui_program_limit_reached");
            loadConfig.setText(languageFile.getTranslation("ui_load_config"));
            saveConfig.setText(languageFile.getTranslation("ui_save_config"));
            exit.setText(languageFile.getTranslation("ui_exit"));
            suggestionMenu.setText(languageFile.getTranslation("ui_suggestions"));
            stepSizeSuggestion.setText(languageFile.getTranslation("ui_suggest_stepsize"));
            inputSuggestion.setText(languageFile.getTranslation("ui_suggest_input"));
            watchExpressionSuggestion.setText(languageFile.getTranslation("ui_suggest_watchexpression"));
            condBreakpointSuggestion.setText(languageFile.getTranslation("ui_suggest_condbreakpoint"));
            settingsMenu.setText(languageFile.getTranslation("ui_settings"));
            languageMenu.setText(languageFile.getTranslation("ui_change_language"));
            maxFunctionCalls.setText(languageFile.getTranslation("ui_max_functioncalls"));
            maxIterations.setText(languageFile.getTranslation("ui_max_iterations"));
            stepSizeStrategyMenu.setText(languageFile.getTranslation("ui_suggestion_strategy_stepsize"));
            expressionStrategyMenu.setText(languageFile.getTranslation("ui_suggestion_strategy_expression"));
            inputStrategyMenu.setText(languageFile.getTranslation("ui_suggestion_strategy_input"));

            CONFIRM_CLOSE = languageFile.getTranslation("ui_confirm_close");
            CONFIRM_CLOSE_QUESTION = languageFile.getTranslation("ui_confirm_close_question");
            YES_OPTION = languageFile.getTranslation("ui_yes");
            NO_OPTION = languageFile.getTranslation("ui_no");

        }

    }

    /**
     * deletes a single ProgramPanel, if there are more than 2.
     *
     * @param id
     *            id of the deleted ProgramPanel
     */
    void deleteProgramPanel(String id) {
        if (programPanels.size() > 2) {
            programPanels.remove(id);
        } else {
            programPanels.put(id, new ProgramPanel(id, this));
        }
        codePanel.removeAll();
        for (ProgramPanel p : programPanels.values()) {
            p.changeLanguage();
            codePanel.add(p, codePanelLayout);
        }
        codePanel.updateUI();
    }

    /**
     * stops the debug mode.
     */
    void stopDebug() {
        for (ProgramPanel p : programPanels.values()) {
            p.stopDebug();
            controlFacade.stopDebug();
            newProgram.setEnabled(true);
        }
    }

    /**
     * returns the length of the text of a program panel.
     *
     * @param programId
     *            program ID
     * @return end line
     */
    public String getProgramLength(String programId) {
        return programPanels.get(programId).getProgramLength();
    }

    /**
     * shows close dialog to confirm end of DIbugger.
     */
    private void showCloseConfirmationDialog() {
        Object[] options = {YES_OPTION,
            NO_OPTION};
        int confirm = JOptionPane.showOptionDialog(
            null, CONFIRM_CLOSE_QUESTION,
            CONFIRM_CLOSE, JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, options, null);
        if (confirm == JOptionPane.YES_OPTION) {
            controlFacade.saveProperties();
            System.exit(0);
        }
    }

}
