package dibugger.userinterface;

import dibugger.debuglogic.debugger.DebugLogicFacade;
import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.interpreter.ScopeTuple;
import dibugger.filehandler.facade.LanguageFile;
import dibugger.userinterface.dibuggerpopups.ExpressionChangePopUp;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
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
 * class that represents a WatchExpressionPanel where a user can see, edit and
 * delete his watch-expressions.
 */
public class WatchExpressionPanel extends ExpressionPanel {

    private MainInterface mainInterface;
    private java.util.List<String[]> dataEntries;
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
        Map<Integer, String> map = debugLogicFacade.getWatchExpressionMap();
//        for (int i = 0; i <= currentHighestId; i++) {
//            try {
//            	String val = map.get(i);
//                if (dataEntries[i] != null && val!=null) {
//                    dataEntries[i][1] = val;
//                    dataEntries[i][2] = debugLogicFacade.getWEValue(i);
//                    table.getModel().setValueAt(dataEntries[i][1], i, 1);
//                    table.getModel().setValueAt(dataEntries[i][2], i, 2);
//                }
//            } catch (DIbuggerLogicException e) {
//                // TODO: Muss von der LogicFacade gefangen werden
//            }
//        }
        for(Integer i : map.keySet()){
        	if(!idMap.containsValue(i)){
        		addRow(i);
        	}
        }
        Object[][] oa = new Object[dataEntries.size()][3];
        for(int i=0;i<dataEntries.size();++i){
        	try {
            	String val = map.get(idMap.get(i));
            	String[] data = dataEntries.get(i);
                if (data != null && val!=null) {
                	data[1] = val;
                	data[2] = debugLogicFacade.getWEValue(idMap.get(i));
                	for(int j=0;j<3;++j){
                		oa[i][j] = data[j];
                		table.getModel().setValueAt(data[j], i, j);
                	}
                }
            } catch (DIbuggerLogicException e) {
                // TODO: Muss von der LogicFacade gefangen werden
            }
        }
        table.updateUI();
    }

    private void initComponents() {

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JPanel panel_ar = new JPanel();
        panel_ar.setLayout(new BoxLayout(panel_ar, BoxLayout.X_AXIS));
        this.add(panel_ar);
        
        JButton addButton = new JButton("+");
        panel_ar.add(addButton);

        addButton.addActionListener(e -> {
            addRow();
            mainInterface.getControlFacade().createWatchExpression(currentHighestId, "A.i * B.k");
            getWatchExpressionPanel(mainInterface).updateUI();
            saveWEs();
        });

        JButton removeButton = new JButton("-");
        panel_ar.add(removeButton);
        removeButton.addActionListener(e -> {
        	int row = table.getSelectedRow();
        	if(row!=-1){
        		deleteEntry(row);
            	mainInterface.getControlFacade().deleteWatchExpression(idMap.get(row));
        	}
        });

        
        idMap.put(0, 0);

        panelType = "Watch Expressions:";

        String[] columnTitles;
        columnTitles = new String[] { "Opt", panelType, "=" };
        dataEntries = new ArrayList<String[]>();
        String[] s = new String[3];
        s[0] = " ";
        s[1] = "A.i * B.k";
        s[2] = " ";
        dataEntries.add(s);
        mainInterface.getControlFacade().createWatchExpression(0, "A.i * B.k");
        
        tableModel = new DefaultTableModel(createDataFromList(), columnTitles) {
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
            	if(mouseEvent.getButton()==MouseEvent.BUTTON1){
	                Point p = mouseEvent.getPoint();
	                if ((table.columnAtPoint(p) == 0)) {
	                    int row = table.rowAtPoint(p);
	                    int id = idMap.get(row);
	                    new ExpressionChangePopUp(mainInterface, "WatchExpression", row, table, WatchExpressionPanel.this,
	                            id);
	                }
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
        table.getColumnModel().getColumn(0).setCellRenderer(new ButtonCellRenderer());
        
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
//        ArrayList<Object[]> dataEntriesAsList = new ArrayList<>(Arrays.asList(dataEntries));
        if (dataEntries.size() > 0) {
            tableModel.removeRow(rowToDelete);
            dataEntries.remove(rowToDelete);
//            for (int row : idMap.keySet()) {
//                if (row > rowToDelete) {
//                    idMap.put(row - 1, idMap.get(row));
//                }
//            }
            for(int i=rowToDelete;i<dataEntries.size()-1;++i){
            	idMap.put(i, idMap.get(i+1));
            }
        }
//        dataEntriesAsList.toArray(dataEntries);
    }

    /**
     * method to reset the WatchExpressionPanel.
     */
    public void reset() {
        singleton = new WatchExpressionPanel(mainInterface);
        this.updateUI();
    }

    /**
     * method to save all the watch-expressions that are displayed in this
     * WatchExpressionPanel.
     */
    protected void saveWEs() {
        for (int j = 0; j < table.getRowCount(); j++) {
            mainInterface.getControlFacade().changeWatchExpression(idMap.get(j),
                    table.getModel().getValueAt(j, 1).toString(), scopes.get(j));
        }
    }


    private void addRow() {
        int row = this.table.getRowCount();
        idMap.put(row, currentHighestId + 1);
        currentHighestId += 1;
        String[] newRow = { " ", "A.i * B.k", " " };
        tableModel.addRow(newRow);
//        ArrayList<Object[]> dataAsList = new ArrayList<>(dataEntries.length);
//        dataAsList.addAll(Arrays.asList(dataEntries));
//        dataAsList.add(newRow);
//        dataEntries = new Object[dataAsList.size()][];
//        for (int j = 0; j < dataAsList.size(); j++) {
//            dataEntries[j] = dataAsList.get(j);
//        }
        dataEntries.add(newRow);
        this.updateUI();
    }

    private void addRow(int id) {
        int row = this.table.getRowCount();
        idMap.put(row, id);
        currentHighestId = Math.max(currentHighestId, id);
        String[] newRow = { " ", "A.i * B.k", " " };
        tableModel.addRow(newRow);
        dataEntries.add(newRow);
        this.updateUI();
    }

    
    /**
     * changes language.
     */
    void changeLanguage() {
        LanguageFile languageFile = mainInterface.getControlFacade().getLanguageFile();
        if (languageFile != null) {
            table.setToolTipText(languageFile.getTranslation("ui_we_tooltip"));
        }
    }

    private Object[][] createDataFromList(){
    	Object[][] o = new Object[dataEntries.size()][3];
    	for(int i=0;i<dataEntries.size();++i){
    		String[] s = dataEntries.get(i);
    		for(int j=0;j<3;++j){
    			o[i][j] = s[j];
    		}
    	}
    	return o;
    }
    
    
    //Option Cell Renderer
    private class ButtonCellRenderer extends DefaultTableCellRenderer{
		private static final long serialVersionUID = 1L;
		private final JButton btn = new JButton("");
		
		@Override
    	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
    			int row, int column) {
    		return btn;
    	}
    	
    }
    
}
