package dibugger.userinterface;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import dibugger.userinterface.dibuggerpopups.ErrorPopUp;
import dibugger.userinterface.dibuggerpopups.ExpressionChangePopUp;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class WatchExpressionPanel extends ExpressionPanel {
    private MainInterface mainInterface;
    private Object[][] dataEntries;

    private static WatchExpressionPanel singleton = null;

    private WatchExpressionPanel(MainInterface mainInterface) {
        this.mainInterface = mainInterface;
        initComponents();
        this.setVisible(true);
    }

    public static WatchExpressionPanel getWatchExpressionPanel(MainInterface mainInterface) {
        if (singleton == null) {
            singleton = new WatchExpressionPanel(mainInterface);
        }
        return singleton;
    }

    public void update() {
        //TODO
    }

    private void initComponents() {

        panelType = "Watch Expressions:";

        String[] columnTitles = {"Opt", panelType , "=" };
        dataEntries = new Object[1][3];
        dataEntries[0][0] =  " ";
        dataEntries[0][1] =  " ";
        dataEntries[0][2] =  " ";
        DefaultTableModel tableModel = new DefaultTableModel(dataEntries, columnTitles) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 1;
            }
        };
        JTable table = new JTable(tableModel);
        table.getColumnModel().getColumn(0).setPreferredWidth(5);
        table.getColumnModel().getColumn(1).setPreferredWidth(150);
        table.getColumnModel().getColumn(2).setPreferredWidth(10);
        table.addMouseListener(new MouseListener() {
                                   @Override
                                   public void mouseClicked(MouseEvent mouseEvent) {
                                       Point p = mouseEvent.getPoint();
                                       if( (table.columnAtPoint(p) == 0)) {
                                           //TODO: richtige ID übergeben
                                           new ExpressionChangePopUp(mainInterface, "Expression", 1);
                                       }
                                       if (table.rowAtPoint(p) == dataEntries.length - 1 & table.columnAtPoint(p) == 1) {
                                           Object[] newRow = {" ", "Fügen Sie hier Ihre neue Watch-Expression ein", " "};
                                           tableModel.addRow(newRow);
                                           ArrayList<Object[]> dataAsList = new ArrayList<Object[]>(dataEntries.length);
                                           dataAsList.addAll(Arrays.asList(dataEntries));
                                           dataAsList.add(newRow);
                                           dataEntries = new Object[dataAsList.size()][];
                                           for(int j = 0; j < dataAsList.size(); j++) {
                                               dataEntries[j] = dataAsList.get(j);
                                           }
                                           getWatchExpressionPanel(mainInterface).updateUI();
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
                                        //TODO: bei verlassen WE an Control geben
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

}
