package dibugger.userinterface;

import dibugger.control.ControlFacade;
import dibugger.debuglogic.debugger.DebugLogicFacade;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Element;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import java.util.List;

public class ProgramPanel extends JPanel {

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
  private JTextPane codeTextArea;
  private JTextPane lines;
  private List<JRadioButton> breakpointButtons;

  private JPanel variableInspector;
  private TreeMap<String, String> variableValueMap;
  private List<String> shownVariables;
  private DefaultListModel<String> listModel;
  private JScrollPane variableInspectorScrollPane;
  private JList<String> variableInspectorList;

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

    programName.setText("Programm: " + id);

    stepsize.setText("Stepsize: ");

    stepsizeInput.setText("jTextField2");
    stepsizeInput.setPreferredSize(new Dimension(40, 40));
    stepsizeInput.addActionListener(this::stepsizeInputActionPerformed);

    inputvariablesLabel.setText("Eingabevariablen: ");

    inputvariableTextField.setText("jTextField1");
    inputvariableTextField.addActionListener(this::variableInputActionPerformed);
    inputvariableTextField.setPreferredSize(new Dimension(288, 40));

    JButton loadFile = new JButton();
    ImageIcon iconLoad = new ImageIcon("res/ui/load-icon.png");
    iconLoad = new ImageIcon(iconLoad.getImage().getScaledInstance(25, 25, 25));
    loadFile.setIcon(iconLoad);
    JButton delete = new JButton();
    ImageIcon deleteIcon = new ImageIcon("res/ui/delete-icon.png");
    deleteIcon = new ImageIcon(deleteIcon.getImage().getScaledInstance(25, 25, 25));
    delete.setIcon(deleteIcon);
    delete.addActionListener(actionEvent -> mainInterface.deleteProgramPanel(id));
    initCodeArea();

    initVariableInspector();

    GroupLayout firstTextPanelLayout = new GroupLayout(this);
    setLayout(firstTextPanelLayout);
    firstTextPanelLayout.setHorizontalGroup(firstTextPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(firstTextPanelLayout.createSequentialGroup().addGroup(firstTextPanelLayout
            .createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(firstTextPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                .addGroup(firstTextPanelLayout.createSequentialGroup().addComponent(stepsize)
                    .addComponent(stepsizeInput, GroupLayout.PREFERRED_SIZE,
                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGroup(firstTextPanelLayout.createSequentialGroup().addComponent(programName)
                    .addGap(150, 150, 150).addComponent(loadFile).addComponent(delete))
                .addGroup(firstTextPanelLayout.createSequentialGroup().addComponent(inputvariablesLabel)
                    .addComponent(inputvariableTextField)))
            .addComponent(codePanel).addComponent(variableInspector))));
    firstTextPanelLayout.setVerticalGroup(firstTextPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
        .addGroup(firstTextPanelLayout.createSequentialGroup()
            .addGroup(firstTextPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(programName).addComponent(loadFile).addComponent(delete)).addGap(15, 15, 15)
            .addGroup(firstTextPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(stepsize).addComponent(stepsizeInput, GroupLayout.PREFERRED_SIZE,
                    GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))

            .addGap(10, 10, 10)
            .addGroup(firstTextPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(inputvariablesLabel).addComponent(inputvariableTextField,
                    GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            .addGap(10, 10, 10).addComponent(codePanel, GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(variableInspector)

        ));
  }

  private void stepsizeInputActionPerformed(ActionEvent evt) {
    mainInterface.saveText();
  }

  private void variableInputActionPerformed(ActionEvent evt) {
    mainInterface.saveText();
  }

  /**
   * initializes code area of program panel.
   */
  private void initCodeArea() {
    JPanel breakpointButtonPanel = new JPanel();

    SpringLayout breakpointPanelLayout = new SpringLayout();
    breakpointButtonPanel.setLayout(breakpointPanelLayout);

    codeScrollPane = new JScrollPane();
    lines = new JTextPane();
    lines.setText("1");
    codeTextArea = new JTextPane();
    lines.setBackground(Color.YELLOW);
    lines.setEditable(false);
    lines.setFont(lines.getFont().deriveFont(16.509f));
    codeTextArea.setFont(codeTextArea.getFont().deriveFont(16.509f));
    codeTextArea.getDocument().addDocumentListener(new DocumentListener() {
      String getText() {
        int caretPosition = codeTextArea.getDocument().getLength();
        Element root = codeTextArea.getDocument().getDefaultRootElement();
        String text = "1" + System.getProperty("line.separator");
        for (int i = 2; i < root.getElementIndex(caretPosition) + 2; i++) {
          text += i + System.getProperty("line.separator");
        }
        return text;
      }

      @Override
      public void changedUpdate(DocumentEvent de) {

      }

      @Override
      public void insertUpdate(DocumentEvent de) {
        int lineCount = codeTextArea.getText().split(System.getProperty("line.separator")).length;
        if (lineCount != lines.getText().split(System.getProperty("line.separator")).length) {
          lines.setText(getText());
          breakpointButtons.add(new JRadioButton());
          breakpointButtons.get(breakpointButtons.size() - 1).setPreferredSize(new Dimension(20, 20));
          breakpointPanelLayout.putConstraint(SpringLayout.WEST,
              breakpointButtons.get(breakpointButtons.size() - 1), 0, SpringLayout.WEST,
              breakpointButtons.get(breakpointButtons.size() - 2));
          breakpointPanelLayout.putConstraint(SpringLayout.NORTH,
              breakpointButtons.get(breakpointButtons.size() - 1), 20, SpringLayout.NORTH,
              breakpointButtons.get(breakpointButtons.size() - 2));
          breakpointButtonPanel.add(breakpointButtons.get(breakpointButtons.size() - 1));
          breakpointButtonPanel.updateUI();
        }
      }

      @Override
      public void removeUpdate(DocumentEvent de) {
        int lineCount = codeTextArea.getText().split(System.getProperty("line.separator")).length;
        if (lineCount != lines.getText().split(System.getProperty("line.separator")).length) {
          lines.setText(getText());
          breakpointButtonPanel.removeAll();
          breakpointPanelLayout.putConstraint(SpringLayout.WEST, breakpointButtons.get(0), 0,
              SpringLayout.WEST, breakpointButtonPanel);
          breakpointPanelLayout.putConstraint(SpringLayout.NORTH, breakpointButtons.get(0), 1,
              SpringLayout.NORTH, breakpointButtonPanel);
          breakpointButtonPanel.add(breakpointButtons.get(0));
          int caretPosition = codeTextArea.getDocument().getLength();
          Element root = codeTextArea.getDocument().getDefaultRootElement();
          for (int i = 1; i < root.getElementIndex(caretPosition) + 1; i++) {
            breakpointPanelLayout.putConstraint(SpringLayout.WEST, breakpointButtons.get(i), 0,
                SpringLayout.WEST, breakpointButtons.get(i - 1));
            breakpointPanelLayout.putConstraint(SpringLayout.NORTH, breakpointButtons.get(i), 20,
                SpringLayout.NORTH, breakpointButtons.get(i - 1));
            breakpointButtonPanel.add(breakpointButtons.get(i));
          }
          for (int i = root.getElementIndex(caretPosition); i < breakpointButtons.size(); i++) {
            breakpointButtons.remove(i);
          }
          breakpointButtonPanel.updateUI();
        }
      }

    });

    codeTextArea.setPreferredSize(new Dimension(400, 800));
    codeScrollPane.getViewport().add(codeTextArea);

    codeScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    codeScrollPane.setPreferredSize(new Dimension(400, 800));

    codePanel = new JPanel();

    breakpointButtons = new ArrayList<>();
    breakpointButtons.add(new JRadioButton());
    breakpointButtons.get(0).setPreferredSize(new Dimension(20, 20));
    breakpointButtonPanel.setPreferredSize(new Dimension(20, 100000000));
    breakpointPanelLayout.putConstraint(SpringLayout.WEST, breakpointButtons.get(0), 0, SpringLayout.WEST,
        breakpointButtonPanel);
    breakpointPanelLayout.putConstraint(SpringLayout.NORTH, breakpointButtons.get(0), 1, SpringLayout.NORTH,
        breakpointButtonPanel);
    breakpointButtonPanel.add(breakpointButtons.get(0));
    breakpointButtonPanel.setVisible(true);

    JLayeredPane rowHeaderView = new JLayeredPane();
    rowHeaderView.setOpaque(true);
    SpringLayout headerLayout = new SpringLayout();
    rowHeaderView.setLayout(headerLayout);
    headerLayout.putConstraint(SpringLayout.WEST, lines, 20, SpringLayout.WEST, rowHeaderView);
    headerLayout.putConstraint(SpringLayout.WEST, breakpointButtonPanel, 0, SpringLayout.WEST, rowHeaderView);
    rowHeaderView.add(lines);
    lines.setOpaque(true);
    rowHeaderView.setForeground(Color.LIGHT_GRAY);
    rowHeaderView.add(breakpointButtonPanel);

    rowHeaderView.setPreferredSize(new Dimension(60, 100000000));
    codeScrollPane.setRowHeaderView(rowHeaderView);
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
    variableInspectorList.setToolTipText("Zelle markieren und mit Rechtsklick löschen");

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

    JButton showHiddenVariables = new JButton("Ausgeblendete Variablen anzeigen");
    showHiddenVariables.addActionListener(actionEvent -> {
      listModel.clear();
      shownVariables.clear();
      for (String variable : variableValueMap.keySet()) {
        shownVariables.add(variable);
        listModel.addElement(variableValueMap.get(variable));
      }
      variableInspectorList.updateUI();
    });

    JLabel varLabel = new JLabel("Variableninspektor");

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
    codeTextArea.setText(programText);
    listModel.clear();
    variableInspectorList.updateUI();
  }

  /**
   * Shows the variables of the List in the variable inspector panel.
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
   * @return current text
   */
  public String getText() {
    return codeTextArea.getText();
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
   * @param input new input String
   */
  public void showInput(String input) {
    inputvariableTextField.setText(input);
  }

  /**
   * updates the ProgramPanels variable inspector pane.
   * @param debugLogicFacade Observable
   */
  public void update(Observable debugLogicFacade) {
    //update variable inspector
    DebugLogicFacade logicFacade = (DebugLogicFacade) debugLogicFacade;
    listModel.clear();
    for (String currentVariable : ((DebugLogicFacade) debugLogicFacade).getAllVariables(id)) {
      if (!variableValueMap.containsKey(currentVariable)) {
        shownVariables.add(currentVariable);
      }
      variableValueMap.put(currentVariable, logicFacade.getValueOf(id,currentVariable));
    }
    for (String variable : shownVariables)  {
      listModel.addElement(variableValueMap.get(variable));
    }
    variableInspectorList.updateUI();

  }


}
