package dibugger.UserInterface;

import dibugger.UserInterface.DIbuggerPopUps.ErrorPopUp;
import dibugger.UserInterface.DIbuggerPopUps.ExpressionChangePopUp;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class WatchExpressionPanel extends ExpressionPanel {
    private MainInterface mainInterface;

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
        Object[][] dataEntries = { {"b","hier könnte ihre Expression stehen", "ausgewertet"}};
        TableModel tableModel = new DefaultTableModel(dataEntries, columnTitles);
        JTable table = new JTable(tableModel);
        table.addMouseListener(new MouseListener() {
                                   @Override
                                   public void mouseClicked(MouseEvent mouseEvent) {
                                       new ExpressionChangePopUp(mainInterface, "Expression");
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

        JScrollPane tableContainer = new JScrollPane(table);
        tableContainer.createVerticalScrollBar();
        tableContainer.setSize(150, 150);

        this.add(tableContainer);




        //TODO: JTable oder JList? -editierbar, muss Container für Auswertung enthalten können

    }

}
