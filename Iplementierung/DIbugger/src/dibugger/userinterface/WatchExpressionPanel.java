package dibugger.userinterface;

import dibugger.debuglogic.debugger.DebugLogicFacade;
import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.interpreter.ScopeTuple;
import dibugger.filehandler.facade.LanguageFile;
import dibugger.userinterface.dibuggerpopups.ExpressionChangePopUp;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Observable;

/**
 * class that represents a WatchExpressionPanel where a user can see, edit and
 * delete his watch-expressions.
 */
public class WatchExpressionPanel extends ExpressionPanel {

    private MainInterface mainInterface;
    private Object[][] dataEntries;
    private HashMap<Integer, Integer> idMap = new HashMap<>();
    private int currentHighestId = 0;
    private HashMap<Integer, ArrayList<ScopeTuple>> scopes = new HashMap<>();
    private JTable table;
    private DefaultTableModel tableModel;

    private static String WE_TOOLTIP = "<html>Erstes Feld für Optionen zu dieser"
            + " Watch-Expression, mittleres Feld um die WE " + "zu ändern. <br>Um eine neue WE hinzuzufügen, "
            + "mittleres Feld der letzten Zeile anklicken.</html>";

    private static WatchExpressionPanel singleton = null;

    private WatchExpressionPanel(MainInterface mainInterface) {
        this.mainInterface = mainInterface;
        initComponents();
        this.setVisible(true);
    }

    /**
     * method that implements the singleton pattern of this class.
     *
     * @param mainInterface
     *            MainInterface on which this panel should be displayed
     * @return a WatchExpressionPanel (a new one if none existed, the existing
     *         one if there exists one)
     */
    public static WatchExpressionPanel getWatchExpressionPanel(MainInterface mainInterface) {
        if (singleton == null) {
            singleton = new WatchExpressionPanel(mainInterface);
        }
        return singleton;
    }

    /**
     * method that implements the observer pattern. is called by the model part
     * of the mvc pattern. updates the important values that are calculated by
     * the model part.
     */
    public void update(Observable o) {
        DebugLogicFacade debugLogicFacade = (DebugLogicFacade) o;
        for (int i = 0; i <= currentHighestId; i++) {
            try {
                if (dataEntries[i] != null) {
                    dataEntries[i][2] = debugLogicFacade.getWEValue(i);
                    table.getModel().setValueAt(dataEntries[i][2], i, 2);
                }
            } catch (DIbuggerLogicException e) {
                // TODO: Muss von der LogicFacade gefangen werden
            }
        }
        table.updateUI();
    }

    private void initComponents() {

        idMap.put(0, 0);

        panelType = "Watch Expressions:";

        String[] columnTitles;
        columnTitles = new String[] { "Opt", panelType, "=" };
        dataEntries = new Object[1][3];
        dataEntries[0][0] = " ";
        dataEntries[0][1] = "5 == 5";
        dataEntries[0][2] = " ";
        mainInterface.getControlFacade().createWatchExpression(0, "5 == 5");
        tableModel = new DefaultTableModel(dataEntries, columnTitles) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 1;
            }
        };
        table = new JTable(tableModel);
        table.setToolTipText(WE_TOOLTIP);
        table.getColumnModel().getColumn(0).setPreferredWidth(5);
        table.getColumnModel().getColumn(1).setPreferredWidth(150);
        table.getColumnModel().getColumn(2).setPreferredWidth(10);
        table.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                Point p = mouseEvent.getPoint();
                if ((table.columnAtPoint(p) == 0)) {
                    int row = table.rowAtPoint(p);
                    int id = idMap.get(row);
                    new ExpressionChangePopUp(mainInterface, "WatchExpression", row, table, WatchExpressionPanel.this,
                            id);
                }
                if (table.rowAtPoint(p) == table.getRowCount() - 1 & table.columnAtPoint(p) == 1) {
                    addRow(p);
                    mainInterface.getControlFacade().createWatchExpression(currentHighestId, "5 == 5");
                    getWatchExpressionPanel(mainInterface).updateUI();
                }
                saveWEs();
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
                saveWEs();
            }
        });
        table.setSize(50, 50);

        JScrollPane tableContainer = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        tableContainer.setViewportView(table);
        tableContainer.createVerticalScrollBar();
        tableContainer.setPreferredSize(new Dimension(290, 250));

        this.add(tableContainer);

    }

    /**
     * method to save the scopes of a watch-expression.
     *
     * @param id
     *            ID of the watch-expression
     * @param scopeTupels
     *            scopeTupel of the type (start, end) of the watch-expression
     */
    public void saveScopes(int id, ArrayList<ScopeTuple> scopeTupels) {
        scopes.put(id, scopeTupels);
    }

    /**
     * method to delete an entry in the WatchExpressionPanel, deletes the
     * watch-expression that is displayed in this row.
     *
     * @param rowToDelete
     *            row as int (from 0 to n) in which the watch-expression is to
     *            be deleted
     */
    public void deleteEntry(int rowToDelete) {
        ArrayList<Object[]> dataEntriesAsList = new ArrayList<>(Arrays.asList(dataEntries));
        if (dataEntriesAsList.size() > 1) {
            tableModel.removeRow(rowToDelete);
            dataEntriesAsList.remove(rowToDelete);
            for (int row : idMap.keySet()) {
                if (row > rowToDelete) {
                    idMap.put(row - 1, idMap.get(row));
                }
            }
        }
        dataEntriesAsList.toArray(dataEntries);
    }

    /**
     * method to reset the WatchExpressionPanel.
     */
    public void reset() {
        singleton = new WatchExpressionPanel(mainInterface);
    }

    /**
     * method to save all the watch-expressions that are displayed in this
     * WatchExpressionPanel.
     */
    private void saveWEs() {
        for (int j = 0; j < table.getRowCount(); j++) {
            mainInterface.getControlFacade().changeWatchExpression(idMap.get(j),
                    table.getModel().getValueAt(j, 1).toString(), scopes.get(j));
        }
    }

    /**
     * adds a row.
     *
     * @param p
     *            point p
     */
    private void addRow(Point p) {
        int row = table.rowAtPoint(p) + 1;
        idMap.put(row, currentHighestId + 1);
        currentHighestId += 1;
        Object[] newRow = { " ", "5 == 5", " " };
        tableModel.addRow(newRow);
        ArrayList<Object[]> dataAsList = new ArrayList<>(dataEntries.length);
        dataAsList.addAll(Arrays.asList(dataEntries));
        dataAsList.add(newRow);
        dataEntries = new Object[dataAsList.size()][];
        for (int j = 0; j < dataAsList.size(); j++) {
            dataEntries[j] = dataAsList.get(j);
        }
    }

    /**
     * changes language.
     */
    void changeLanguage() {
        LanguageFile languageFile = mainInterface.getControlFacade().getLanguageFile();
        table.setToolTipText(languageFile.getTranslation("ui_we_tooltip"));
    }

}
