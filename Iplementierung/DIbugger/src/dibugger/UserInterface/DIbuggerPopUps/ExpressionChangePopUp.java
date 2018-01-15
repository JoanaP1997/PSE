package dibugger.UserInterface.DIbuggerPopUps;

import dibugger.UserInterface.MainInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ExpressionChangePopUp extends DIbuggerPopUp {
    JPanel scopeChangePanel;
    MainInterface mainInterface;

    public ExpressionChangePopUp(MainInterface mainInterface, String message) {
        this.setSize(400, 400);
        this.mainInterface = mainInterface;
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        getContentPane().setLayout(groupLayout);

        JLabel title = new JLabel(message);
        JComboBox<String> optionChooser = new JComboBox<>();
        optionChooser.addItem("Löschen");
        optionChooser.addItem("Bereichsbindung anpassen");
        optionChooser.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent actionEvent) {
                                                if (optionChooser.getSelectedItem() == "Bereichsbindung anpassen") {
                                                    showScopePanel();
                                                }
                                            }
                                        });

        scopeChangePanel = new JPanel();
        JButton okButton = new JButton("Ok");
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (optionChooser.getSelectedItem() == "Löschen") {
                    //TODO: Zeile löschen in Table, Löschen weiter geben an Control, dann Fenster schließen
                } else {
                    //TODO: neue Bereichsbindung überprüfen, weitergeben und so Zeug

                }
            }
        });
        groupLayout.setHorizontalGroup(
                groupLayout.createSequentialGroup()
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(title)
                                .addComponent(optionChooser)
                                .addComponent(scopeChangePanel)
                                .addComponent(okButton))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createSequentialGroup()
                        .addComponent(title)
                        .addComponent(optionChooser)
                        .addComponent(scopeChangePanel)
                        .addComponent(okButton)
        );




        this.setVisible(true);
    }

    private void showScopePanel() {
        scopeChangePanel = new JPanel();
        FlowLayout layout = new FlowLayout();
        scopeChangePanel.setLayout(layout);
        for (int x = 0; x <= mainInterface.getProgramCount(); x++) {
            scopeChangePanel.add(new ProgramScopeChooser(x), layout);
        }

    }

    private class ProgramScopeChooser extends JPanel {
        JTextField begin;
        JTextField end;

        ProgramScopeChooser(int id) {
            FlowLayout layout = new FlowLayout();
            this.setLayout(layout);
            this.add(new JLabel("Program " + id + ": Start"), layout);
            begin = new JTextField();
            end = new JTextField();
            this.add(begin, layout);
            this.add(new JLabel("End:"), layout);
            this.add(end, layout);
            this.setVisible(true);
        }

        public String getStart() {
            return begin.getText();
        }

        public String getEnd() {
            return end.getText();
        }
    }

}
