package dibugger.UserInterface;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Element;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ProgramPanel extends JPanel {

    int id;

    private JLabel ProgramName;
    private JLabel Stepsize;
    private JTextField StepsizeInput;
    private JLabel inputvariablesLabel;
    private JTextField inputvariableTextField;

    private JScrollPane codeScrollPane;
    private JTextArea codeArea;
    private JTextArea lines;

    private JScrollPane variableInspectorScrollPane;
    private JList<String> variableInspector;


    public ProgramPanel(int identifier) {
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
        StepsizeInput.addActionListener(this::StepsizeInputActionPerformed);

        inputvariablesLabel.setText("Eingabevariablen:");

        inputvariableTextField.setText("jTextField1");
        inputvariableTextField.addActionListener(this::EingabevariablenInputActionPerformed);


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
                                        .addComponent(codeScrollPane)
                                        .addComponent(variableInspectorScrollPane))
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
                                .addComponent(codeScrollPane, GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(variableInspectorScrollPane)

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
        codeArea = new JTextArea();
        lines.setBackground(Color.YELLOW);
        lines.setEditable(false);
        codeArea.getDocument().addDocumentListener(new DocumentListener(){
            String getText(){
                int caretPosition = codeArea.getDocument().getLength();
                Element root = codeArea.getDocument().getDefaultRootElement();
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
        codeArea.setTabSize(2);
        codeScrollPane.getViewport().add(codeArea);
        codeScrollPane.setRowHeaderView(lines);
        codeScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        codeScrollPane.setPreferredSize(new Dimension(400, 700));
    }

    private void initVariableInspector() {
        variableInspector = new JList<>();
        variableInspector.setDragEnabled(true);
        variableInspector.setSelectionBackground(Color.YELLOW);

        variableInspectorScrollPane = new JScrollPane();
        variableInspectorScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        variableInspectorScrollPane.setPreferredSize(new Dimension(400, 200));
        variableInspectorScrollPane.setViewportView(variableInspector);
    }
}
 