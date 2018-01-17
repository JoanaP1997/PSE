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
    private JLabel EingabevariablenLabel;
    private JTextField EingabevariablenInput;
    private JPanel VariableWindow;
    private JScrollPane codeScrollPane;
    private JTextArea codeArea;
    private JTextArea lines;

    public ProgramPanel(int identifier) {
        id = identifier;
        initComponents();
    }

    private void initComponents() {
        ProgramName = new JLabel();
        Stepsize = new JLabel();
        StepsizeInput = new JTextField();
        EingabevariablenLabel = new JLabel();
        EingabevariablenInput = new JTextField();
        VariableWindow = new JPanel();
        codeScrollPane = new JScrollPane();

        ProgramName.setText("Programm: " + id);

        Stepsize.setText("Stepsize: ");

        StepsizeInput.setText("jTextField2");
        StepsizeInput.addActionListener(this::StepsizeInputActionPerformed);

        EingabevariablenLabel.setText("Eingabevariablen:");

        EingabevariablenInput.setText("jTextField1");
        EingabevariablenInput.addActionListener(this::EingabevariablenInputActionPerformed);


        GroupLayout VariableWindowLayout = new GroupLayout(VariableWindow);
        VariableWindow.setLayout(VariableWindowLayout);
        VariableWindowLayout.setHorizontalGroup(
                VariableWindowLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        VariableWindowLayout.setVerticalGroup(
                VariableWindowLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 171, Short.MAX_VALUE)
        );

        initCodeArea();

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
                                                .addComponent(EingabevariablenLabel)
                                                .addComponent(EingabevariablenInput))
                                        .addComponent(codeScrollPane)
                                        .addComponent(VariableWindow, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                )
        );
        firstTextPanelLayout.setVerticalGroup(
                firstTextPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(firstTextPanelLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(ProgramName)
                                .addGap(18, 18, 18)
                                .addGroup(firstTextPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(Stepsize)
                                        .addComponent(StepsizeInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(EingabevariablenLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EingabevariablenInput, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(codeScrollPane, GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(VariableWindow, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
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
        lines.setBackground(Color.LIGHT_GRAY);
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
        codeArea.setTabSize(3);

        codeScrollPane.getViewport().add(codeArea);
        codeScrollPane.setRowHeaderView(lines);
        codeScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        codeScrollPane.setPreferredSize(new Dimension(400, 700));

    }
}
 