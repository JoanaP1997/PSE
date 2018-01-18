package dibugger.userinterface;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

public class ProgramPanel extends JPanel {

    String id;

    private JLabel ProgramName;
    private JLabel Stepsize;
    private JTextField StepsizeInput;
    private JLabel inputvariablesLabel;
    private JTextField inputvariableTextField;

    private JPanel codePanel;
    private JScrollPane codeScrollPane;
    private JTextArea codeTextArea;
    private JTextArea lines;
    private List breakpointButtons;

    private JPanel variableInspector;
    private JScrollPane variableInspectorScrollPane;
    private JList<String> variableInspectorList;


    public ProgramPanel(String identifier) {
        id = identifier;
        initComponents();
    }

    private void initComponents() {
        ProgramName = new JLabel();
        Stepsize = new JLabel();
        StepsizeInput = new JTextField();
        inputvariablesLabel = new JLabel();
        inputvariableTextField = new JTextField();
        codeScrollPane = new JScrollPane();

        ProgramName.setText("Programm: " + id);

        Stepsize.setText("Stepsize: ");

        StepsizeInput.setText("jTextField2");
        StepsizeInput.setPreferredSize(new Dimension(40, 40));
        StepsizeInput.addActionListener(this::StepsizeInputActionPerformed);

        inputvariablesLabel.setText("Eingabevariablen: ");

        inputvariableTextField.setText("jTextField1");
        inputvariableTextField.addActionListener(this::EingabevariablenInputActionPerformed);
        inputvariableTextField.setPreferredSize(new Dimension(288, 40));


        initCodeArea();

        initVariableInspector();

        GroupLayout firstTextPanelLayout = new GroupLayout(this);
        setLayout(firstTextPanelLayout);
        firstTextPanelLayout.setHorizontalGroup(
                firstTextPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(firstTextPanelLayout.createSequentialGroup()
                                .addGroup(firstTextPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(firstTextPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addGroup(firstTextPanelLayout.createSequentialGroup()
                                                        .addComponent(Stepsize)
                                                        .addComponent(StepsizeInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addComponent(ProgramName)
                                                .addGroup(firstTextPanelLayout.createSequentialGroup()
                                                        .addComponent(inputvariablesLabel)
                                                        .addComponent(inputvariableTextField)))
                                        .addComponent(codePanel)
                                        .addComponent(variableInspector))
                                )
        );
        firstTextPanelLayout.setVerticalGroup(
                firstTextPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(firstTextPanelLayout.createSequentialGroup()
                                .addComponent(ProgramName)
                                .addGap(15, 15, 15)
                                .addGroup(firstTextPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(Stepsize)
                                        .addComponent(StepsizeInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(firstTextPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(inputvariablesLabel)
                                        .addComponent(inputvariableTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addComponent(codePanel, GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(variableInspector)

                                )
        );
    }

    private void StepsizeInputActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void EingabevariablenInputActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void initCodeArea() {
        codeScrollPane = new JScrollPane();
        lines = new JTextArea("1");
        codeTextArea = new JTextArea();
        lines.setBackground(Color.YELLOW);
        lines.setEditable(false);
        codeTextArea.getDocument().addDocumentListener(new DocumentListener(){
            String getText(){
                int caretPosition = codeTextArea.getDocument().getLength();
                Element root = codeTextArea.getDocument().getDefaultRootElement();
                String text = "1" + System.getProperty("line.separator");
                for(int i = 2; i < root.getElementIndex( caretPosition ) + 2; i++){
                    text += i + System.getProperty("line.separator");
                }
                return text;
            }
            @Override
            public void changedUpdate(DocumentEvent de) {
                lines.setText(getText());
            }

            @Override
            public void insertUpdate(DocumentEvent de) {
                lines.setText(getText());
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                lines.setText(getText());
            }

        });
        codeTextArea.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                int line = 0;
                if (mouseEvent.getClickCount() == 2) {
                    try {
                        line = codeTextArea.getLineOfOffset(codeTextArea.getCaretPosition());
                        //TODO: Breakpoint einfügen
                    } catch (BadLocationException e) {

                    }
                }
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
        codeTextArea.setTabSize(2);
        codeScrollPane.getViewport().add(codeTextArea);
        codeScrollPane.setRowHeaderView(lines);
        codeScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        codeScrollPane.setPreferredSize(new Dimension(400, 700));

        codePanel = new JPanel();
        FlowLayout codePanelLayout = new FlowLayout(FlowLayout.LEFT);
        codePanel.setLayout(codePanelLayout);

        JPanel breakpointButtonPanel = new JPanel(new FlowLayout());

        breakpointButtons = new ArrayList<JRadioButton>();
        breakpointButtons.add(new JRadioButton());

        breakpointButtonPanel.add((JRadioButton)breakpointButtons.get(0));
        breakpointButtonPanel.setVisible(true);
        //TODO: Breakpoint stuff... Idee: List mit Radio Buttons, wenn geklickt NR in Liste rausfinden und BP weiter geben
        codePanel.add(breakpointButtonPanel, codePanelLayout);
        codePanel.add(codeScrollPane, codePanelLayout);


    }

    private void initVariableInspector() {
        variableInspector = new JPanel();

        GroupLayout variableInspectorLayout = new GroupLayout(variableInspector);
        variableInspector.setLayout(variableInspectorLayout);
        String[] allData = {"x = true", "y = ?", "count = 42"};
        String[] data = {"x = true", "y = ?", "count = 42"};
        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (String s : data) {
            listModel.addElement(s);
        }
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
        showHiddenVariables.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                listModel.clear();
                for (String s : allData) {
                    listModel.addElement(s);
                }
            }
        });

        JLabel varLabel = new JLabel("Variableninspektor");

        variableInspectorLayout.setHorizontalGroup(
                variableInspectorLayout.createParallelGroup()
                        .addComponent(varLabel)
                        .addComponent(showHiddenVariables)
                        .addComponent(variableInspectorScrollPane)
        );
        variableInspectorLayout.setVerticalGroup(
                variableInspectorLayout.createSequentialGroup()
                        .addGroup(variableInspectorLayout.createSequentialGroup()
                                .addComponent(varLabel)
                                .addComponent(showHiddenVariables))
                        .addComponent(variableInspectorScrollPane)
        );


    }
}