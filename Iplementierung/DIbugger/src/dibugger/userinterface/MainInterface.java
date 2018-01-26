package dibugger.userinterface;

import dibugger.control.ControlFacade;
import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.userinterface.dibuggerpopups.ErrorPopUp;
import dibugger.userinterface.dibuggerpopups.VariableSuggestionPopUp;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.File;
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
  private static String RESET_GUI = "Zur\u00fcksetzen";
  private static String ADD_PROGRAM = "Programm hinzuf\u00fcgen";
  private static String TOO_MANY_PROGRAM_PANELS = "Zu viele Programme";
  private static String LOAD_CONFIG = "Konfigurationsdatei laden";
  private static String SAVE_CONFIG = "Konfigurationsdatei speichern";
  private static String END_DIBUGGER = "DIbugger beenden";
  private static String SUGGESTIONS = "Vorschl\u00e4ge";
  private static String SUGGEST_STEPSIZE = "Vorschlag für Schrittgr\u00f6ße";
  private static String SUGGEST_INPUT_VAR = "Vorschlag für Eingabevariablen";
  private static String SUGGEST_WATCHEXPRESSION = "Vorschlag für Watch Expressions";
  private static String SUGGEST_COND_BREAKPOINT = "Vorschlag für Bedingte Breakpoints";
  private static String SETTINGS = "Einstellungen";


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

  private GUIFacade guiFacade;
  private ControlFacade controlFacade;

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
   * @param args the command line arguments
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
    mainInterface.setSize(1200, 900);
    mainInterface.setVisible(true);
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

    initProgramPanels();

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
   * configures components of menu bar.
   */
  private void configureMenuBar() {
    menuBar = new JMenuBar();
    fileMenu = new JMenu();
    suggestionMenu = new JMenu();
    settingsMenu = new JMenu();
    helpMenu = new JMenu();

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
        programPanels.put(nextId, newPanel);
        codePanel.add(programPanels.get(nextId), codePanelLayout);
        codePanel.updateUI();
      }
    });
    loadConfig = new JMenuItem();
    loadConfig.setText(LOAD_CONFIG);
    loadConfig.addActionListener(actionEvent -> {
      JFileChooser fileChooser = new JFileChooser();
      FileNameExtensionFilter filter = new FileNameExtensionFilter(
          "rdbf files (*.rdbf)", "rdbf");
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
    exit.addActionListener(actionEvent -> System.exit(0));
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
    inputSuggestion.addActionListener(
        actionEvent -> new VariableSuggestionPopUp(VariableSuggestionPopUp.VARIABLES, this));
    stepSizeSuggestion = new JMenuItem(SUGGEST_STEPSIZE);
    stepSizeSuggestion.addActionListener(
        actionEvent -> new VariableSuggestionPopUp(VariableSuggestionPopUp.STEP_SIZE, this));
    suggestionMenu.add(stepSizeSuggestion);
    suggestionMenu.add(inputSuggestion);
    suggestionMenu.add(watchExpressionSuggestion);
    suggestionMenu.add(condBreakpointSuggestion);
    menuBar.add(suggestionMenu);

    // settings menu
    settingsMenu.setText(SETTINGS);
    menuBar.add(settingsMenu);

    // help menu
    helpMenu.setText("?");
    menuBar.add(helpMenu);

    this.setJMenuBar(menuBar);
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

  private void initProgramPanels() {
    programPanels = new TreeMap<>();
    programPanels.put("A", new ProgramPanel("A", this));
    programPanels.put("B", new ProgramPanel("B", this));
    codePanel = new JPanel();
    codePanelLayout = new FlowLayout();
    codePanel.setLayout(codePanelLayout);
    codePanel.add(programPanels.get("A"), codePanelLayout);
    codePanel.add(programPanels.get("B"), codePanelLayout);

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
    ArrayList<String> programIds = new ArrayList<String>();
    programIds.addAll(programPanels.keySet());
    return programIds;
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
    codePanel.removeAll();
    codePanel.add(programPanels.get("A"), codePanelLayout);
    codePanel.add(programPanels.get("B"), codePanelLayout);
    WatchExpressionPanel.getWatchExpressionPanel(this).reset();
    ConditionalBreakpointPanel.getConditionalBreakpointPanel(this).reset();

  }

  /**
   * Makes a specified ProgramPanel show a certain input variable String.
   *
   * @param programId program ID
   * @param vars      new input String
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
   * @param programText program text
   * @param programId   program ID
   */
  void showProgramText(String programText, String programId) {
    for (String id : programPanels.descendingKeySet()) {
      if (id.equals(programId)) {
        programPanels.get(id).setText(programText);
        break;
      }
    }
    programPanels.put(programId, new ProgramPanel(programText, this));

  }

  /**
   * Returns the inspected variables of a certain ProgramPanel.
   *
   * @param programId programs ID
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
   * @param programId programs ID
   * @param variables new variables
   */
  void showVariables(String programId, List<String> variables) {
    for (String id : programPanels.descendingKeySet()) {
      if (id.equals(programId)) {
        programPanels.get(id).showVariables(variables);
      }
    }
  }

  /**
   * update-method as part of the obbserver pattern.
   *
   * @param observable DebugLogicFacade
   * @param o          Object o
   */
  void update(Observable observable, Object o) {
    for (ProgramPanel panel : programPanels.values()) {
      panel.update(observable);
    }
    WatchExpressionPanel.getWatchExpressionPanel(this).update();
    ConditionalBreakpointPanel.getConditionalBreakpointPanel(this).update();
  }

  /**
   * Starts the debug mode.
   */
  void startDebug() {
    saveText();
    controlFacade.startDebug();
  }

  /**
   * saves the current code inputs in the control facade.
   */
  void saveText() {
    ArrayList<String> inputVars = new ArrayList<>();
    ArrayList<String> programTexts = new ArrayList<>();
    ArrayList<String> programIds = new ArrayList<>();
    for (String id : programPanels.descendingKeySet()) {
      programIds.add(id);
      ProgramPanel current = programPanels.get(id);
      programTexts.add(current.getText());
      inputVars.add(current.getInputVars());
    }
    controlFacade.saveText(inputVars, programTexts, programIds);
  }

  /**
   * Change of language.
   */
  public void changeLanguage() {
    // TODO
  }

  /**
   * deletes a single ProgramPanel, if there are more than 2.
   *
   * @param id id of the deleted ProgramPanel
   */
  void deleteProgramPanel(String id) {
    if (programPanels.size() > 2) {
      programPanels.remove(id);
      codePanel.removeAll();
      for (ProgramPanel p : programPanels.values()) {
        codePanel.add(p, codePanelLayout);
      }
      codePanel.updateUI();
    }
  }

}
