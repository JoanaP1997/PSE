package dibugger.userinterface;

import dibugger.control.ControlFacade;
import dibugger.debuglogic.debugger.DebugLogicFacade;
import dibugger.filehandler.facade.LanguageFile;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.TreeMap;

public class ProgramPanel extends JPanel {
  private static String PROGRAM = "Programm";
  private static String STEPSIZE = "Schrittgr\u00f6\u00dfe";
  private static String INPUT_VARS = "Eingabevariablen";
  private static String VAR_INSPECTOR_TOOL_TIP = "Zelle markieren und mit Rechtsklick ausblenden";
  private static String VARIABLE_INSPECTOR = "Variableninspektor";
  private static String SHOW_HIDDEN_VARIABLES = "Ausgeblendete Variablen anzeigen";
  private static String ADD_PROGRAM = "Programm hinzuf\u00fcgen";
  private static String SINGLE_STEP = "Einzelschritt";
  private static String RETURN = "R\u00fcckgabewert";
  private static String STEP_SIZE_TOOLTIP = "Schrittgr\u00f6\u00dfe mit Enter best\u00e4tigen";
  private static String INPUT_TOOLTIP = "Einzelne Eingaben durch Semikola trennen.";

  private final short MARGIN_WIDTH_PX = 36;
  private List<Integer> listBreakpointLines;

  private String id;
  private MainInterface mainInterface;
  private ControlFacade controlFacade;

  private JLabel programName;
  private JLabel stepsize;
  private JTextField stepsizeInput;
  private JLabel inputvariablesLabel;
  private JTextField inputvariableTextField;

  private JPanel codePanel;
  private JScrollPane codeScrollPane;
  private JEditorPane editor;

  private JButton delete;
  private JButton loadFile;

  private JButton singleStepButton;

  private JPanel variableInspector;
  private TreeMap<String, String> variableValueMap;
  private List<String> shownVariables;
  private DefaultListModel<String> listModel;
  private JScrollPane variableInspectorScrollPane;
  private JList<String> variableInspectorList;

  private JLabel result;

  private int currentExcecutionLine;

  /**
   * Constructor for a nem ProgramPanel.
   *
   * @param identifier identifier of program panel
   */
  public ProgramPanel(String identifier, MainInterface mainInterface) {
    id = identifier;
    this.mainInterface = mainInterface;
    controlFacade = mainInterface.getControlFacade();
    initComponents();
  }

  /**
   * initializes main components of program panel.
   */
  private void initComponents() {
    programName = new JLabel();
    stepsize = new JLabel();
    stepsizeInput = new JTextField();
    inputvariablesLabel = new JLabel();
    inputvariableTextField = new JTextField();
    codeScrollPane = new JScrollPane();
    singleStepButton = new JButton();

    singleStepButton.setText(SINGLE_STEP);
    singleStepButton.setEnabled(false);
    programName.setText(PROGRAM + ": " + id);

    stepsize.setText(STEPSIZE + ": ");
    stepsize.setToolTipText(STEP_SIZE_TOOLTIP);
    stepsizeInput.setText("1");
    stepsizeInput.setPreferredSize(new Dimension(40, 40));
    stepsizeInput.addActionListener(evt1 -> stepsizeInputActionPerformed());
    stepsizeInput.setToolTipText(STEP_SIZE_TOOLTIP);

    inputvariablesLabel.setText(INPUT_VARS + ": ");

    inputvariableTextField.setText("");
    inputvariableTextField.setToolTipText(INPUT_TOOLTIP);
    inputvariableTextField.addActionListener(evt -> variableInputActionPerformed());
    inputvariableTextField.setPreferredSize(new Dimension(288, 40));

    loadFile = new JButton();
    ImageIcon iconLoad = new ImageIcon("res/ui/load-icon.png");
    iconLoad = new ImageIcon(iconLoad.getImage().getScaledInstance(25, 25, 25));
    loadFile.setIcon(iconLoad);
    loadFile.addActionListener(actionEvent -> setTextWithFileChooser());

    delete = new JButton();
    ImageIcon deleteIcon = new ImageIcon("res/ui/delete-icon.png");
    deleteIcon = new ImageIcon(deleteIcon.getImage().getScaledInstance(25, 25, 25));
    delete.setIcon(deleteIcon);
    delete.addActionListener(actionEvent -> mainInterface.deleteProgramPanel(id));
    initCodeArea();

    singleStepButton.addActionListener(e -> mainInterface.getControlFacade().singleStep(id));

    initVariableInspector();

    result = new JLabel(RETURN + ": ");

    GroupLayout firstTextPanelLayout = new GroupLayout(this);
    setLayout(firstTextPanelLayout);
    firstTextPanelLayout.setHorizontalGroup(firstTextPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(firstTextPanelLayout.createSequentialGroup().addGroup(firstTextPanelLayout
            .createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(firstTextPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                .addGroup(firstTextPanelLayout.createSequentialGroup().addComponent(stepsize)
                    .addComponent(stepsizeInput, GroupLayout.PREFERRED_SIZE,
                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addGap(110, 110, 110)
                    .addComponent(singleStepButton))
                .addGroup(firstTextPanelLayout.createSequentialGroup().addComponent(programName)
                    .addGap(150, 150, 150).addComponent(loadFile).addComponent(delete))
                .addGroup(firstTextPanelLayout.createSequentialGroup().addComponent(inputvariablesLabel)
                    .addComponent(inputvariableTextField)))
            .addComponent(codePanel).addComponent(variableInspector).addComponent(result))));

    firstTextPanelLayout.setVerticalGroup(firstTextPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(firstTextPanelLayout.createSequentialGroup()
            .addGroup(firstTextPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(programName).addComponent(loadFile).addComponent(delete)).addGap(15, 15, 15)
            .addGroup(firstTextPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(stepsize).addComponent(stepsizeInput, GroupLayout.PREFERRED_SIZE,
                    GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addComponent(singleStepButton))

            .addGap(10, 10, 10)
            .addGroup(firstTextPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(inputvariablesLabel).addComponent(inputvariableTextField,
                    GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            .addGap(10, 10, 10).addComponent(codePanel, GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(variableInspector).addComponent(result)

        ));
  }

  private void stepsizeInputActionPerformed() {
    controlFacade.setStepSize(id, stepsizeInput.getText());
  }

  private void variableInputActionPerformed() {
    mainInterface.saveText();
  }

  /**
   * initializes code area of program panel.
   */
  private void initCodeArea() {
    codePanel = new JPanel();
    listBreakpointLines = new ArrayList<>();

    editor = new JEditorPane();
    editor.setEditorKit(new StyledEditorKit() {
      @Override
      public ViewFactory getViewFactory() {
        return new CustomViewFactory(super.getViewFactory());
      }
    });
    Font font = new Font("SansSerif", Font.PLAIN, 12);
    editor.setFont(font);
    editor.addMouseListener(new MouseListener() {

      @Override
      public void mouseReleased(MouseEvent e) {

      }

      @Override
      public void mousePressed(MouseEvent e) {
        if (e.getClickCount() == 2) {
          if (e.getX() > 0 && e.getX() < MARGIN_WIDTH_PX) {
            int height = editor.getFontMetrics(editor.getFont()).getHeight();
            int lineID = e.getY() / height + 1;
            if (!listBreakpointLines.contains(lineID)) {
              listBreakpointLines.add(lineID);
              controlFacade.createBreakpoint(id, lineID);
            } else {
              listBreakpointLines.remove((Integer) lineID);
              controlFacade.deleteBreakpoint(id, lineID);
            }
          }
          editor.updateUI();
        }
      }

      @Override
      public void mouseExited(MouseEvent e) {
        mainInterface.saveText();
      }

      @Override
      public void mouseEntered(MouseEvent e) {

      }

      @Override
      public void mouseClicked(MouseEvent e) {

      }
    });


    codeScrollPane.setViewportView(editor);

    codeScrollPane.setPreferredSize(new Dimension(400, 300));
    codeScrollPane.setSize(400, 800);
    codePanel.add(codeScrollPane);
  }

  /**
   * initializes components of variable inspector.
   */
  private void initVariableInspector() {
    variableInspector = new JPanel();

    GroupLayout variableInspectorLayout = new GroupLayout(variableInspector);
    variableInspector.setLayout(variableInspectorLayout);
    variableValueMap = new TreeMap<>();
    shownVariables = new ArrayList<>();
    listModel = new DefaultListModel<>();

    variableInspectorList = new JList<>(listModel);
    variableInspectorList.setDragEnabled(true);
    variableInspectorList.setSelectionBackground(Color.YELLOW);
    variableInspectorList.setSelectionForeground(Color.BLACK);
    variableInspectorList.setFixedCellHeight(20);
    variableInspectorList.setToolTipText(VAR_INSPECTOR_TOOL_TIP);

    variableInspectorList.addMouseListener(new MouseListener() {
      @Override
      public void mouseClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getButton() == MouseEvent.BUTTON3) {
          for (int i = 0; i < shownVariables.size(); i++) {
            if (shownVariables.get(i).equals(variableInspectorList.getSelectedValue())) {
              shownVariables.remove(variableInspectorList.getSelectedValue());
            }
          }
          listModel.remove(variableInspectorList.getSelectedIndex());
        }
        variableInspectorList.updateUI();
        variableInspectorScrollPane.updateUI();
      }

      @Override
      public void mousePressed(MouseEvent mouseEvent) {

      }

      @Override
      public void mouseReleased(MouseEvent mouseEvent) {

      }

      @Override
      public void mouseEntered(MouseEvent mouseEvent) {

      }

      @Override
      public void mouseExited(MouseEvent mouseEvent) {

      }
    });

    variableInspectorScrollPane = new JScrollPane();
    variableInspectorScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    variableInspectorScrollPane.setPreferredSize(new Dimension(400, 200));
    variableInspectorScrollPane.setViewportView(variableInspectorList);

    JButton showHiddenVariables = new JButton(SHOW_HIDDEN_VARIABLES);
    showHiddenVariables.addActionListener(actionEvent -> {
      listModel.clear();
      shownVariables.clear();
      for (String variable : variableValueMap.keySet()) {
        shownVariables.add(variable);
        listModel.addElement(variableValueMap.get(variable));
      }
      variableInspectorList.updateUI();
    });

    JLabel varLabel = new JLabel(VARIABLE_INSPECTOR);

    variableInspectorLayout.setHorizontalGroup(variableInspectorLayout.createParallelGroup().addComponent(varLabel)
        .addComponent(showHiddenVariables).addComponent(variableInspectorScrollPane));
    variableInspectorLayout
        .setVerticalGroup(variableInspectorLayout
            .createSequentialGroup().addGroup(variableInspectorLayout.createSequentialGroup()
                .addComponent(varLabel).addComponent(showHiddenVariables))
            .addComponent(variableInspectorScrollPane));

  }

  /**
   * Getter-method for ID of the program panel.
   *
   * @return identifier
   */
  public String getId() {
    return id;
  }

  /**
   * Sets the program text.
   *
   * @param programText new program text
   */
  public void setText(String programText) {
    editor.setText(programText);
    listModel.clear();
    variableInspectorList.updateUI();
  }

  /**
   * Shows the variables of the List in the variable inspector panel.
   *
   * @param variables displayed variables
   */
  public void showVariables(List<String> variables) {
    listModel.clear();
    variableValueMap.clear();
    shownVariables = variables;
    for (String s : variables) {
      listModel.addElement(s);
      variableValueMap.put(s, s + " = ");
    }
    variableInspectorList.updateUI();
  }

  /**
   * Returns the currently inspected variables.
   *
   * @return inspected variables in an ArrayList
   */
  public List<String> getInspectedVariables() {
    return shownVariables;
  }

  /**
   * Returns the current text of the code text area.
   *
   * @return current text
   */
  public String getText() {
    return editor.getText();
  }

  /**
   * Returns the input variables.
   *
   * @return input variable string
   */
  public String getInputVars() {
    return inputvariableTextField.getText();
  }

  /**
   * Shows a new input String.
   *
   * @param input new input String
   */
  public void showInput(String input) {
    inputvariableTextField.setText(input);
  }

  /**
   * updates the ProgramPanels variable inspector pane.
   *
   * @param observable Observable
   */
  public void update(Observable observable) {
    //update variable inspector
    DebugLogicFacade logicFacade = (DebugLogicFacade) observable;
    listModel.clear();
    for (String currentVariable : logicFacade.getAllVariables(id)) {
      if (!variableValueMap.containsKey(currentVariable)) {
        shownVariables.add(currentVariable);
      }
      variableValueMap.put(currentVariable,
          currentVariable + " = " + logicFacade.getValueOf(id, currentVariable));
    }
    for (String variable : shownVariables) {
      listModel.addElement(variableValueMap.get(variable));
    }
    variableInspectorList.updateUI();

    //show current excecution line
    currentExcecutionLine =
        (logicFacade.getCurrentExecutionLines().containsKey(id))
            ? logicFacade.getCurrentExecutionLines().get(id) : 0;

    //show result
    result.setText(RETURN + ": " + logicFacade.getReturnValue(id));
    result.updateUI();

    //update stepsize
    stepsizeInput.setText(Integer.toString(logicFacade.getStepSize(id)));
    this.updateUI();
  }

  /**
   * sets a new text based on the file chosen by the user.
   */
  public void setTextWithFileChooser() {
    JFileChooser fileChooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "java files (*.java)", "java", "text files (*.txt)", "txt");

    fileChooser.setDialogTitle(ADD_PROGRAM);
    fileChooser.setFileFilter(filter);
    int returnVal = fileChooser.showOpenDialog(ProgramPanel.this);
    if (returnVal == JFileChooser.APPROVE_OPTION) {
      File file = fileChooser.getSelectedFile();
      editor.setText(controlFacade.loadProgramText(file));

    }
  }

  /**
   * Produces custom ParagraphViews, but uses the default ViewFactory for all
   * other elements.
   */
  private class CustomViewFactory implements ViewFactory {

    private ViewFactory defaultViewFactory;

    CustomViewFactory(ViewFactory defaultViewFactory) {
      this.defaultViewFactory = defaultViewFactory;
    }

    @Override
    public View create(Element elem) {
      if (elem != null && elem.getName().equals(AbstractDocument.ParagraphElementName)) {
        return new CustomParagraphView(elem);
      }
      return defaultViewFactory.create(elem);
    }
  }

  /**
   * Paints a left hand child view with the line number for this Paragraph.
   */
  private class CustomParagraphView extends ParagraphView {
    private Element thisElement;

    private Font font;

    CustomParagraphView(Element elem) {
      super(elem);
      thisElement = elem;
      this.setInsets((short) 0, (short) 0, (short) 0, (short) 0);
    }

    @Override
    protected void setInsets(short top, short left, short bottom, short right) {
      super.setInsets(top, (short) (left + MARGIN_WIDTH_PX), bottom, right);
    }

    @Override
    public void paintChild(Graphics g, Rectangle alloc, int index) {
      super.paintChild(g, alloc, index);
      if (index > 0) {
        return;
      }
      
      int lineNumber = getLineNumber() + 1;
      String lnStr = String.format("%3d", lineNumber);
      font = font != null ? font : new Font(Font.MONOSPACED, Font.PLAIN, getFont().getSize());
      //g.setFont(font);
      
      int x = alloc.x - g.getFontMetrics().stringWidth(lnStr) - 4;
      int y = alloc.y + alloc.height - 3;
      int height = g.getFontMetrics(g.getFont()).getHeight();
      int lineID = y / height;
      if (lineID == currentExcecutionLine) {
          g.setColor(Color.RED);
      } else{
          g.setColor(Color.BLACK);
      }
      
      g.drawString(lnStr, x, y);

      //draw Breakpoints
      if (lineID != currentExcecutionLine) {
        g.setColor(Color.RED);
      } else {
        g.setColor(Color.BLUE);
      }
      if (listBreakpointLines.contains(lineID)) {
        g.fillOval(8, y - 8, 8, 8);
      }
      g.setColor(Color.BLACK);
    }

    private int getLineNumber() {
      Element root = getDocument().getDefaultRootElement();
      int len = root.getElementCount();
      for (int i = 0; i < len; i++) {
        if (root.getElement(i) == thisElement) {
          return i;
        }
      }
      return 0;
    }
  }

  void changeLanguage() {
    LanguageFile languageFile = controlFacade.getLanguageFile();
    //TODO: Übersetzungen von allen angezeigten Texten holen
  }

  /**
   * Disables all functions not available in editmode.
   */
  void stopDebug() {
    editor.setEditable(true);
    loadFile.setEnabled(true);
    delete.setEnabled(true);
    inputvariableTextField.setEditable(true);
    singleStepButton.setEnabled(false);
  }

  /**
   * Disables all functions not available in debugmode.
   */
  void startDebug() {
    editor.setEditable(false);
    loadFile.setEnabled(false);
    delete.setEnabled(false);
    inputvariableTextField.setEditable(false);
    singleStepButton.setEnabled(true);
  }

  /**
   * Returns length of the editors text by returning the number of the end line.
   *
   * @return length of the text
   */
  String getProgramLength() {
    if (editor.getText().split("\n").length == 1) {
      return "1";
    } else {
      return Integer.toString(editor.getText().split("\n").length + 1);
    }
  }
}
