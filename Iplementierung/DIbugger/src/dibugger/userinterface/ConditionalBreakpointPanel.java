package dibugger.userinterface;

import dibugger.debuglogic.debugger.DebugLogicFacade;
import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.interpreter.ScopeTuple;
import dibugger.filehandler.facade.LanguageFile;
import dibugger.userinterface.dibuggerpopups.ExpressionChangePopUp;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

/**
 * class that represents a ConditionalBreakpointPanel where the user can see,
 * edit and delete his conditional breakpoints.
 */
public class ConditionalBreakpointPanel extends ExpressionPanel {

    private static ConditionalBreakpointPanel singleton = null;
    private MainInterface mainInterface;
    private Object[][] dataEntries;
    private HashMap<Integer, Integer> idMap = new HashMap<>();
    private int currentHighestId = 0;
    private HashMap<Integer, ArrayList<ScopeTuple>> scopes = new HashMap<>();
    private JTable table;
    private DefaultTableModel tableModel;

    private static String CB_TOOLTIP = "<html>Erstes Feld für Optionen zu diesem bedingten "
            + "Breakpoint, <br> mittleres Feld um den CB zu ändern. <br> Um einen neuen CB "
            + "hinzuzufügen, mittleres Feld der letzten Zeile anklicken.</html>";

    private ConditionalBreakpointPanel(MainInterface mainInterface) {
        this.mainInterface = mainInterface;
        initComponents();
        this.setVisible(true);
    }

    /**
     * method that implements the singleton aspect of this class.
     *
     * @param mainInterface
     *            MainInterface on which the ConditionalBreakpointPanel is used
     * @return the ConditionalBreakpointPanel (if it does not exists it creates
     *         a new one, if it exists you get the existing one)
     */
    public static ConditionalBreakpointPanel getConditionalBreakpointPanel(MainInterface mainInterface) {
        if (singleton == null) {
            singleton = new ConditionalBreakpointPanel(mainInterface);
        }
        return singleton;
    }

    /**
     * update Method that implements the observer pattern is called by the model
     * part of the mvc pattern updates the important values that are calculated
     * by the model part.
     */
    public void update(Observable o) {
        DebugLogicFacade debugLogicFacade = (DebugLogicFacade) o;
        Map<Integer, String> map = debugLogicFacade.getConditionalBreakpointMap();
        for (int i = 0; i <= currentHighestId; i++) {
            try {
            	String val = map.get(i);
                if (dataEntries[i] != null && val!=null) {
                    dataEntries[i][1] = val;
                    dataEntries[i][2] = debugLogicFacade.getCBValue(i);
                    table.getModel().setValueAt(dataEntries[i][1], i, 1);
                    table.getModel().setValueAt(dataEntries[i][2], i, 2);
                }
            } catch (DIbuggerLogicException e) {
                // TODO do nothing?
            }
        }
        table.updateUI();
        // TODO: check
    }

    private void initComponents() {

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JButton addButton = new JButton("+");
        this.add(addButton);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addRow();
                mainInterface.getControlFacade().createConditionalBreakpoint(currentHighestId, "A.i <= B.k");
                getConditionalBreakpointPanel(mainInterface).updateUI();
                saveCBs();
            }
        });

        idMap.put(0, 0);

        panelType = "Conditional Breakpoints:";
        String[] columnTitles;
        columnTitles = new String[] { "Opt", panelType, "=" };
        dataEntries = new Object[1][3];
        dataEntries[0][0] = " ";
        dataEntries[0][1] = "A.i <= B.k";
        dataEntries[0][2] = "false";
        mainInterface.getControlFacade().createConditionalBreakpoint(0, "A.i <= B.k");
        tableModel = new DefaultTableModel(dataEntries, columnTitles) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 1;
            }
        };
        table = new JTable(tableModel);
        table.setToolTipText(CB_TOOLTIP);
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
                    new ExpressionChangePopUp(mainInterface, "ConditionalBreakpoint", row, table,
                            ConditionalBreakpointPanel.this, id);
                }
                saveCBs();
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
                saveCBs();
            }
        });
        table.setSize(50,50);

        JScrollPane tableContainer = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        tableContainer.setViewportView(table);
        tableContainer.createVerticalScrollBar();
        tableContainer.setPreferredSize(new Dimension(290, 250));

        this.add(tableContainer);

    }

    /**
     * method to save the scopes of a ConditionalBreakpoint.
     *
     * @param id
     *            ID of the ConditionalBreakpoint
     * @param scopeTupels
     *            Tuple with (start, end)
     */
    public void saveScopes(int id, ArrayList<ScopeTuple> scopeTupels) {
        scopes.put(id, scopeTupels);
    }

    /**
     * method to reset the ConditionalBreakpointPanel.
     */
    public void reset() {
        singleton = new ConditionalBreakpointPanel(mainInterface);
        this.updateUI();
    }

    /**
     * method to delete an entry of the ConditionalBreakpointPanel.
     *
     * @param rowToDelete
     *            row that should be deleted
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

    private void addRow() {
        int row = this.table.getRowCount();
        idMap.put(row, currentHighestId + 1);
        currentHighestId++;
        Object[] newRow = { " ", "A.i <= B.k", "" };
        tableModel.addRow(newRow);
        ArrayList<Object[]> dataAsList = new ArrayList<>(dataEntries.length);
        dataAsList.addAll(Arrays.asList(dataEntries));
        dataAsList.add(newRow);
        dataEntries = new Object[dataAsList.size()][];
        for (int j = 0; j < dataAsList.size(); j++) {
            dataEntries[j] = dataAsList.get(j);
        }
        this.updateUI();
    }

    protected void saveCBs() {
        for (int j = 0; j < table.getRowCount(); j++) {
            mainInterface.getControlFacade().changeConditionalBreakpoint(idMap.get(j),
                    table.getModel().getValueAt(j, 1).toString(), scopes.get(j));
        }
    }

    void changeLanguage() {
        LanguageFile languageFile = mainInterface.getControlFacade().getLanguageFile();
        table.setToolTipText(languageFile.getTranslation("ui_cb_tooltip"));
    }
}
