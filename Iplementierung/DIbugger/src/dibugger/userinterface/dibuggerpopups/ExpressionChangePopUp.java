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

/**
 * class that represents a PopUp that is a menu for an ExpressionPanel.
 * Holds the components to let the user delete an Expression or define the scope of an Expression.
 */
public class ExpressionChangePopUp extends DIbuggerPopUp {

  private static String DELETE = "L\u00f6schen";
  private static String ADJUST_SCOPEASSIGNMENT = "Bereichsbindung anpassen";
  private static String PROGRAM = "Program";
  private static String START = "Start";
  private static String END = "Ende";

  private JPanel scopeChangePanel;
  private MainInterface mainInterface;
  private GroupLayout groupLayout;
  private JLabel title;
  private JComboBox<String> optionChooser;
  private JButton okButton;
  private JScrollPane scrollPane;
  private int row;
  private JTable table;
  private ExpressionPanel panel;
  private String type = "";
  private int Eid;
  private ArrayList<ScopeTuple> scopes = new ArrayList<>();

  /**
   * constructor for an ExpressionChangePopUp, should only be called by ExpressionPanels
   * @param mainInterface MainInterface of the ExpressionPanel that calls the constructor
   * @param message String that gives useful information about the ExpressionPanel that calls this constructor
   * @param row int that represents the row in which the Expression stands in the table
   * @param table JTable in which the Expressions are displayed
   * @param panel ExpressionPanel that calls the constructor
   * @param Eid Expression ID of the Expression that calls the constructor
   */
  public ExpressionChangePopUp(MainInterface mainInterface, String message, int row, JTable table, ExpressionPanel panel, int Eid) {

    //init:
    this.row = row;
    this.Eid = Eid;
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
    optionChooser.addItem(DELETE);
    optionChooser.addItem(ADJUST_SCOPEASSIGNMENT);
    optionChooser.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent actionEvent) {
        if (optionChooser.getSelectedItem() == ADJUST_SCOPEASSIGNMENT) {
          showScopePanel();
        } else if (optionChooser.getSelectedItem() == DELETE) {
          hideScopePanel();
        }
      }
    });

    //init Swing Components
    scopeChangePanel = new JPanel();
    scrollPane = new JScrollPane(scopeChangePanel);
    scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
    okButton = new JButton("Ok");

    okButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent actionEvent) {
        if (optionChooser.getSelectedItem() == DELETE) {
          //delete a row and the WE or CB:
          if (message.startsWith("WatchExpression")) {
            WatchExpressionPanel p = (WatchExpressionPanel) panel;
            p.deleteEntry(row);
            mainInterface.getControlFacade().deleteWatchExpression(ExpressionChangePopUp.this.Eid);
            dispose();
          } else if (message.startsWith("ConditionalBreakpoint")) {
            ConditionalBreakpointPanel p = (ConditionalBreakpointPanel) panel;
            p.deleteEntry(row);
            mainInterface.getControlFacade().deleteConditionalBreakpoint(ExpressionChangePopUp.this.Eid);
            dispose();
          }
        } else if(optionChooser.getSelectedItem() == ADJUST_SCOPEASSIGNMENT) {
          // save Scopes in scopes List:
          if (type.equals("WatchExpression")) {
            WatchExpressionPanel p = (WatchExpressionPanel) panel;
            int n = scopeChangePanel.getComponentCount();
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
    for (String id : mainInterface.getProgramIds()) {
      scopeChangePanel.add(new ProgramScopeChooser(id), layout);
    }
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
    String programId;

    ProgramScopeChooser(String id) {
      //init:
      programId = id;
      layout = new FlowLayout();
      this.setLayout(layout);
      begin = new JTextField();
      begin.setPreferredSize(new Dimension(50, 20));
      end = new JTextField();
      end.setPreferredSize(new Dimension(50, 20));
      labelStart = new JLabel(PROGRAM + " " + id + ": " + START);
      labelStart.setPreferredSize(new Dimension(120, 20));
      labelEnd = new JLabel(END +": ");
      labelEnd.setPreferredSize(new Dimension(40, 20));

      setScopes();

      //set look:
      layout.setHgap(20);
      layout.setVgap(10);
      this.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
      this.revalidate();
      this.add(labelStart);
      this.add(begin);
      this.add(labelEnd);
      this.add(end);

      //set visible:
      this.setVisible(true);
      this.updateUI();

    }

    /**
     * method to get the values set for the start of a scope by the user
     * @return String that should be a number
     */
    public String getStart() {
      return begin.getText();
    }

    /**
     * method to get the values set for the end of a scope by the user
     * @return String that should be a number
     */
    public String getEnd() {
      return end.getText();
    }

    private void setScopes() {
      if (type.equals("WatchExpression")) {
        try {
          begin.setText(mainInterface.getControlFacade().getDebugLogicFacade().getWEScopeBegin(Eid).toString());
          end.setText(mainInterface.getControlFacade().getDebugLogicFacade().getWEScopeEnd(Eid).toString());
        } catch (NullPointerException e) {
          begin.setText("1");
          end.setText(mainInterface.getProgramLength(programId));
        }
      } else if (type.equals("ConditionalBreakpoint")) {
        try {
          begin.setText(mainInterface.getControlFacade().getDebugLogicFacade().getCBScopeBegin(Eid).toString());
          end.setText(mainInterface.getControlFacade().getDebugLogicFacade().getCBScopeEnd(Eid).toString());
        } catch (NullPointerException e) {
          begin.setText("1");
          end.setText(mainInterface.getProgramLength(programId));
        }
      }
    }

  }

}
