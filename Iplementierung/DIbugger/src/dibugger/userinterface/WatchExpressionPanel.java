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

        String[] columnTitles = {"Opt", panelType , "Auswertung" };
        dataEntries = new Object[1][3];
        dataEntries[0][0] =  " ";
        dataEntries[0][1] =  " ";
        dataEntries[0][2] =  " ";
        TableModel tableModel = new DefaultTableModel(dataEntries, columnTitles);
        JTable table = new JTable(tableModel);
        table.addMouseListener(new MouseListener() {
                                   @Override
                                   public void mouseClicked(MouseEvent mouseEvent) {
                                       Point p = mouseEvent.getPoint();
                                       if((table.rowAtPoint(p) == 0) & (table.columnAtPoint(p) == 0)) {
                                           new ExpressionChangePopUp(mainInterface, "Expression");
                                       } else if (table.columnAtPoint(p) != 0 & table.rowAtPoint(p) == 1){
                                           //TODO: Watch-Expression hinzufügen
                                           if (table.rowAtPoint(p) == dataEntries.length) {
                                               //TODO: neue Zeile hinzufügen
                                               int length = dataEntries.length;
                                               dataEntries = new Object[length + 2][3];
                                               getWatchExpressionPanel(mainInterface).updateUI();
                                           }
                                       } else if (table.columnAtPoint(p) != 0 & table.rowAtPoint(p) == 2) {
                                           //TODO: Auswertung
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

                                   }
                               });
        table.setSize(50, 50);

        JScrollPane tableContainer = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        tableContainer.setViewportView(table);
        tableContainer.createVerticalScrollBar();
        tableContainer.setPreferredSize(new Dimension(290, 250));

        this.add(tableContainer);




        //TODO: JTable oder JList? -editierbar, muss Container für Auswertung enthalten können

    }

}
