package dibugger.userinterface;

import dibugger.userinterface.dibuggerpopups.ExpressionChangePopUp;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;

public class ConditionalBreakpointPanel extends ExpressionPanel {

    private static ConditionalBreakpointPanel singleton = null;

    private JLabel title;
    private MainInterface mainInterface;
    private Object[][] dataEntries;
    private ConditionalBreakpointPanel thisCBP = this;

    private ConditionalBreakpointPanel(MainInterface mainInterface) {
        this.mainInterface = mainInterface;
        initComponents();
    }

    public static ConditionalBreakpointPanel getConditionalBreakpointPanel(MainInterface mainInterface) {
        if (singleton == null) {
            singleton = new ConditionalBreakpointPanel(mainInterface);
        }
        return singleton;
    }

    public void update() {
        //TODO
    }

    private void initComponents() {

        panelType = "Conditional Breakpoints:";
        String[] columnTitles = { "Opt", panelType , "Auswertung" };
        dataEntries = new Object[1][3];
        dataEntries[0][0] = " ";
        dataEntries[0][1] = "hier könnte ihre Expression stehen";
        dataEntries[0][2] = "ausgewertet";
        DefaultTableModel tableModel = new DefaultTableModel(dataEntries, columnTitles) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 1;
            }
        };
        JTable table = new JTable(tableModel);
        table.getColumnModel().getColumn(0).setPreferredWidth(5);
        table.getColumnModel().getColumn(1).setPreferredWidth(150);
        table.getColumnModel().getColumn(2).setPreferredWidth(5);
        table.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                Point p = mouseEvent.getPoint();
                if(table.columnAtPoint(p) == 0) {
                    new ExpressionChangePopUp(mainInterface, "ConditionalBreakpoint", 1, table, thisCBP);
                }
                else if( (table.columnAtPoint(p) == 1)) {
                    //TODO: CB speichern
                }
                if (table.rowAtPoint(p) == dataEntries.length - 1 & table.columnAtPoint(p) == 1) {
                    Object[] newRow = {" ", "Fügen Sie hier Ihren neuen ConditionalBreakpoint ein ", ""};
                    tableModel.addRow(newRow);
                    ArrayList<Object[]> dataAsList = new ArrayList<Object[]>(dataEntries.length);
                    dataAsList.addAll(Arrays.asList(dataEntries));
                    dataAsList.add(newRow);
                    dataEntries = new Object[dataAsList.size()][];
                    for(int j = 0; j < dataAsList.size(); j++) {
                        dataEntries[j] = dataAsList.get(j);
                    }

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
                //TODO: bei verlassen CB an Control geben
            }
        });


        JScrollPane tableContainer = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED );
        tableContainer.setViewportView(table);
        tableContainer.createVerticalScrollBar();
        tableContainer.setPreferredSize(new Dimension(290, 250));

        this.add(tableContainer);



    }

    public void deleteEntry(int id) {
        //TODO
    }
}
