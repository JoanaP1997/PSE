package dibugger.userinterface.dibuggerpopups;

import dibugger.debuglogic.interpreter.ScopeTuple;
import dibugger.userinterface.ConditionalBreakpointPanel;
import dibugger.userinterface.ExpressionPanel;
import dibugger.userinterface.MainInterface;
import dibugger.userinterface.WatchExpressionPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ExpressionChangePopUp extends DIbuggerPopUp {

  JPanel scopeChangePanel;
  MainInterface mainInterface;
  GroupLayout groupLayout;
  JLabel title;
  JComboBox<String> optionChooser;
  JButton okButton;
  JScrollPane scrollPane;
  int id;
  JTable table;
  ExpressionPanel panel;
  String type = "";
  int WEid;

  public ExpressionChangePopUp(MainInterface mainInterface, String message, int row, JTable table, ExpressionPanel panel, int WEid) {
    //init:
    this.id = row;
    this.WEid =WEid;
    this.panel = panel;
    this.table = table;
    this.setSize(400, 400);
    this.setResizable(false);
    this.mainInterface = mainInterface;
    this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    this.setModalityType(ModalityType.APPLICATION_MODAL);
    groupLayout = new GroupLayout(getContentPane());
    getContentPane().setLayout(groupLayout);

    if(message.startsWith("WatchExpression")) {
      this.type = "WatchExpression";
    } else if (message.startsWith("ConditionalBreakpoint")) {
      this.type = "ConditionalBreakpoint";
    }

    //Selection::
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
          //delete a row and the WE or CB:
          if (message.startsWith("WatchExpression")) {
            WatchExpressionPanel p = (WatchExpressionPanel) panel;
            p.deleteEntry(row);
            dispose();
          } else if (message.startsWith("ConditionalBreakpoint")) {
            ConditionalBreakpointPanel p = (ConditionalBreakpointPanel) panel;
            p.deleteEntry(row);
            dispose();
          }
        } else {
          // save Scopes in scopes List:
          if (type.equals("WatchExpression")) {
            WatchExpressionPanel p = (WatchExpressionPanel) panel;
            int n = scopeChangePanel.getComponentCount();
            ArrayList<ScopeTuple> scopes = new ArrayList<>();
            for (int j = 0; j < n; j++) {
              int start = Integer.parseInt(((ProgramScopeChooser) scopeChangePanel.getComponent(j)).getStart());
              int end = Integer.parseInt((((ProgramScopeChooser) scopeChangePanel.getComponent(j)).getEnd()));
              ScopeTuple scopeTuple = new ScopeTuple(start, end);
              scopes.add(scopeTuple);
            }
            p.saveScopes(row, scopes);
          } else if (type.equals("ConditionalBreakpoint")) {
            ConditionalBreakpointPanel p = (ConditionalBreakpointPanel) panel;
            int n = scopeChangePanel.getComponentCount();
            ArrayList<ScopeTuple> scopes = new ArrayList<>();
            for (int j = 0; j < n; j++) {
              int start = Integer.parseInt(((ProgramScopeChooser) scopeChangePanel.getComponent(j)).getStart());
              int end = Integer.parseInt((((ProgramScopeChooser) scopeChangePanel.getComponent(j)).getEnd()));
              ScopeTuple scopeTuple = new ScopeTuple(start, end);
              scopes.add(scopeTuple);
            }
            p.saveScopes(row, scopes);
          }
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
    //TODO: ID richtig machen
    for (int x = 0; x < mainInterface.getProgramCount(); x++) {
      scopeChangePanel.add(new ProgramScopeChooser(x), layout);
    }
    //setPopUpLayout();
    scopeChangePanel.updateUI();
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
      begin.setPreferredSize(new Dimension(50, 20));
      end = new JTextField();
      end.setPreferredSize(new Dimension(50, 20));
      labelStart = new JLabel("Program " + id + ": Start");
      labelStart.setPreferredSize(new Dimension(100, 20));
      labelEnd = new JLabel("End: ");
      labelEnd.setPreferredSize(new Dimension(30, 20));

      //init:
      //TODO

      if (type.equals("WatchExpression")) {
        begin.setText(mainInterface.getControlFacade().getDebugLogicFacade().getWEScopeBegin(WEid).toString());
        end.setText(mainInterface.getControlFacade().getDebugLogicFacade().getWEScopeEnd(WEid).toString());
      } else if (type.equals("ConditionalBreakpoint")) {
        begin.setText(mainInterface.getControlFacade().getDebugLogicFacade().getCBScopeBegin(WEid).toString());
        end.setText(mainInterface.getControlFacade().getDebugLogicFacade().getCBScopeEnd(WEid).toString());
      }




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
