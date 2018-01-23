package dibugger.userinterface;

import dibugger.debuglogic.debugger.DebugLogicFacade;
import dibugger.debuglogic.interpreter.ScopeTuple;
import dibugger.userinterface.dibuggerpopups.ExpressionChangePopUp;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ConditionalBreakpointPanel extends ExpressionPanel {

  private static ConditionalBreakpointPanel singleton = null;

  private JLabel title;
  private MainInterface mainInterface;
  private Object[][] dataEntries;
  private ConditionalBreakpointPanel thisCBP;
  private HashMap<Integer, Integer> idMap = new HashMap<>();
  private int currentHighestId = 0;
  private HashMap<Integer, ArrayList<ScopeTuple>> scopes = new HashMap<>();
  private JTable table;

  {
    thisCBP = this;
  }

  private ConditionalBreakpointPanel(MainInterface mainInterface) {
    this.mainInterface = mainInterface;
    initComponents();
    this.setVisible(true);
  }

  public static ConditionalBreakpointPanel getConditionalBreakpointPanel(MainInterface mainInterface) {
    if (singleton == null) {
      singleton = new ConditionalBreakpointPanel(mainInterface);
    }
    return singleton;
  }

  public void update() {
    DebugLogicFacade debugLogicFacade = mainInterface.getControlFacade().getDebugLogicFacade();
    for(int i = 0; i <= currentHighestId; i++) {
      dataEntries[i][2] = debugLogicFacade.getCBValue(i);
      table.updateUI();
    }
    //TODO: check
  }

  private void initComponents() {

    idMap.put(0, 0);

    panelType = "Conditional Breakpoints:";
    String[] columnTitles = {"Opt", panelType, "Auswertung"};
    dataEntries = new Object[1][3];
    dataEntries[0][0] = " ";
    dataEntries[0][1] = "5 = 5";
    dataEntries[0][2] = "true";
    DefaultTableModel tableModel = new DefaultTableModel(dataEntries, columnTitles) {
      @Override
      public boolean isCellEditable(int row, int column) {
        return column == 1;
      }
    };
    table = new JTable(tableModel);
    table.getColumnModel().getColumn(0).setPreferredWidth(5);
    table.getColumnModel().getColumn(1).setPreferredWidth(150);
    table.getColumnModel().getColumn(2).setPreferredWidth(5);
    table.addMouseListener(new MouseListener() {
      @Override
      public void mouseClicked(MouseEvent mouseEvent) {
        Point p = mouseEvent.getPoint();
        if (table.columnAtPoint(p) == 0) {
          int row = table.rowAtPoint(p);
          int id = idMap.get(row);
          new ExpressionChangePopUp(mainInterface, "ConditionalBreakpoint", id, table, thisCBP);
        } else if ((table.columnAtPoint(p) == 1)) {
          //TODO: CB speichern
        }
        if (table.rowAtPoint(p) == dataEntries.length - 1 & table.columnAtPoint(p) == 1) {
          int row = table.rowAtPoint(p) + 1;
          idMap.put(row, currentHighestId + 1);
          currentHighestId++;
          Object[] newRow = {" ", "5 = 5 ", ""};
          tableModel.addRow(newRow);
          ArrayList<Object[]> dataAsList = new ArrayList<Object[]>(dataEntries.length);
          dataAsList.addAll(Arrays.asList(dataEntries));
          dataAsList.add(newRow);
          dataEntries = new Object[dataAsList.size()][];
          for (int j = 0; j < dataAsList.size(); j++) {
            dataEntries[j] = dataAsList.get(j);
          }
          mainInterface.getControlFacade().createConditionalBreakpoint(currentHighestId, "5 = 5");
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
        for (int j = 0; j < table.getRowCount(); j++) {
          mainInterface.getControlFacade().changeConditionalBreakpoint(idMap.get(j),
              table.getModel().getValueAt(j, 1).toString(), scopes.get(idMap.get(j)));

        }
      }
    });


    JScrollPane tableContainer = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
        JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    tableContainer.setViewportView(table);
    tableContainer.createVerticalScrollBar();
    tableContainer.setPreferredSize(new Dimension(290, 250));

    this.add(tableContainer);

  }



  public void saveScopes(int id, ArrayList<ScopeTuple> scopeTupels) {
    scopes.put(id, scopeTupels);
    //TODO: weitergeben, evtl. schon bei MouseExcited
    }


public void reset() {
  singleton = new ConditionalBreakpointPanel(mainInterface);
}

  public void deleteEntry(int id) {
    //TODO
  }
}
