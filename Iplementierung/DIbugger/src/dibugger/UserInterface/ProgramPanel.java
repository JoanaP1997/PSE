package dibugger.UserInterface;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ProgramPanel extends JPanel {

    int id;

    private JLabel ProgramName;
    private JLabel Stepsize;
    private JTextField StepsizeInput;
    private JLabel EingabevariablenLabel;
    private JTextField EingabevariablenInput;
    private JPanel VariableWindow;
    private JScrollPane jScrollPane1;
    private JTextPane TextPaneCode;

    public ProgramPanel(int identifier) {
        id = identifier;
        initComponents();
    }

    private void initComponents() {
        ProgramName = new javax.swing.JLabel();
        Stepsize = new javax.swing.JLabel();
        StepsizeInput = new javax.swing.JTextField();
        EingabevariablenLabel = new javax.swing.JLabel();
        EingabevariablenInput = new javax.swing.JTextField();
        VariableWindow = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextPaneCode = new javax.swing.JTextPane();

        ProgramName.setText("Programm 1");

        Stepsize.setText("Stepsize");

        StepsizeInput.setText("jTextField2");
        StepsizeInput.addActionListener(this::StepsizeInputActionPerformed);

        EingabevariablenLabel.setText("Eingabevariablen:");

        EingabevariablenInput.setText("jTextField1");
        EingabevariablenInput.addActionListener(this::EingabevariablenInputActionPerformed);

        javax.swing.GroupLayout VariableWindowLayout = new javax.swing.GroupLayout(VariableWindow);
        VariableWindow.setLayout(VariableWindowLayout);
        VariableWindowLayout.setHorizontalGroup(
                VariableWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        VariableWindowLayout.setVerticalGroup(
                VariableWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 171, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(TextPaneCode);

        javax.swing.GroupLayout firstTextPanelLayout = new javax.swing.GroupLayout(this);
        setLayout(firstTextPanelLayout);
        firstTextPanelLayout.setHorizontalGroup(
                firstTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(firstTextPanelLayout.createSequentialGroup()
                                .addGroup(firstTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(firstTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(firstTextPanelLayout.createSequentialGroup()
                                                        .addComponent(Stepsize)
                                                        .addComponent(StepsizeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(ProgramName)
                                                .addComponent(EingabevariablenLabel)
                                                .addComponent(EingabevariablenInput))
                                        .addComponent(jScrollPane1)
                                        .addComponent(VariableWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                )
        );
        firstTextPanelLayout.setVerticalGroup(
                firstTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(firstTextPanelLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(ProgramName)
                                .addGap(18, 18, 18)
                                .addGroup(firstTextPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Stepsize)
                                        .addComponent(StepsizeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(EingabevariablenLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EingabevariablenInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(VariableWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25))
        );
    }

    private void StepsizeInputActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void EingabevariablenInputActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }
}
 