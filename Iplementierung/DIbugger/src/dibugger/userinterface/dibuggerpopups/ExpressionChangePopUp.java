package dibugger.userinterface.dibuggerpopups;

import javax.swing.*;
<<<<<<< HEAD:Iplementierung/DIbugger/src/dibugger/UserInterface/DIbuggerPopUps/ExpressionChangePopUp.java
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
=======

import dibugger.userinterface.MainInterface;

>>>>>>> 6b0322bac787ec445679813482d6870e65e1a962:Iplementierung/DIbugger/src/dibugger/userinterface/dibuggerpopups/ExpressionChangePopUp.java
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExpressionChangePopUp extends DIbuggerPopUp {
    JPanel scopeChangePanel;
    MainInterface mainInterface;
    GroupLayout groupLayout;
    JLabel title;
    JComboBox<String> optionChooser;
    JButton okButton;
    JScrollPane scrollPane;


    //TODO: bei löschen Panel von Bereichsbindung wieder entfernen
    public ExpressionChangePopUp(MainInterface mainInterface, String message) {
        this.setSize(400, 400);
        this.setResizable(false);
        this.mainInterface = mainInterface;
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setModalityType(ModalityType.APPLICATION_MODAL);
        groupLayout = new GroupLayout(getContentPane());
        getContentPane().setLayout(groupLayout);

        title = new JLabel(message);
        optionChooser = new JComboBox<>();
        optionChooser.addItem("Löschen");
        optionChooser.addItem("Bereichsbindung anpassen");
        optionChooser.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent actionEvent) {
                                                if (optionChooser.getSelectedItem() == "Bereichsbindung anpassen") {
                                                    showScopePanel();
                                                } else if (optionChooser.getSelectedItem() == "Löschen") {
                                                    hideScopePanel();
                                                }
                                            }
                                        });

        scopeChangePanel = new JPanel();
        scrollPane = new JScrollPane(scopeChangePanel);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        okButton = new JButton("Ok");
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
        setPopUpLayout();
    }

    private void setPopUpLayout() {
        groupLayout.setHorizontalGroup(
                groupLayout.createSequentialGroup()
                        .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(title)
                                .addComponent(optionChooser)
                                .addComponent(scrollPane)
                                .addComponent(okButton))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createSequentialGroup()
                        .addComponent(title)
                        .addComponent(optionChooser, 25, 25, 35)
                        .addGap(20)
                        .addComponent(scrollPane)
                        .addComponent(okButton)
        );

        this.setVisible(true);
    }

    private void showScopePanel() {
        BoxLayout layout = new BoxLayout(scopeChangePanel, BoxLayout.PAGE_AXIS);
        scopeChangePanel.setLayout(layout);
        for (int x = 0; x < mainInterface.getProgramCount(); x++) {
            scopeChangePanel.add(new ProgramScopeChooser(x), layout);
        }
        setPopUpLayout();

    }

    private void hideScopePanel() {
        scopeChangePanel.removeAll();
        scopeChangePanel.updateUI();
    }

    private class ProgramScopeChooser extends JPanel {
        JTextField begin;
        JTextField end;
        FlowLayout layout;
        JLabel labelStart;
        JLabel labelEnd;

        ProgramScopeChooser(int id) {
            layout = new FlowLayout();
            this.setLayout(layout);
            begin = new JTextField();
            begin.setPreferredSize(new Dimension(50,20));
            end = new JTextField();
            end.setPreferredSize(new Dimension(50,20));
            labelStart = new JLabel("Program " + id + ": Start");
            labelStart.setPreferredSize(new Dimension(100, 20));
            //TODO ID richtig machen
            labelEnd = new JLabel("End: ");
            labelEnd.setPreferredSize(new Dimension(30,20));


            layout.setHgap(20);
            layout.setVgap(10);
            this.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
            this.revalidate();

            this.add(labelStart);
            this.add(begin);
            this.add(labelEnd);
            this.add(end);

            this.setVisible(true);
            this.updateUI();
        }


        public String getStart() {
            return begin.getText();
        }

        public String getEnd() {
            return end.getText();
        }
    }

}
