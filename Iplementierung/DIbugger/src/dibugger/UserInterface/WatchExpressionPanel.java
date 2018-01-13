package dibugger.UserInterface;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;

public class WatchExpressionPanel extends ExpressionPanel {

    private static WatchExpressionPanel singleton = null;



    private WatchExpressionPanel() {
        initComponents();
        this.setVisible(true);
    }

    public static WatchExpressionPanel getWatchExpressionPanel() {
        if (singleton == null) {
            singleton = new WatchExpressionPanel();
        }
        return singleton;
    }

    public void update() {
        //TODO
    }

    private void initComponents() {

        panelType = "Watch Expressions:";

        String[] columnTitles = {"Opt", panelType , "Auswertung" };
        Object[][] dataEntries = { {new JComboBox<>() ,"hier könnte ihre Expression stehen", "ausgewertet"}};
        JTable table = new JTable(dataEntries, columnTitles);
        table.setDragEnabled(true);
        table.setSize(50, 50);

        JScrollPane tableContainer = new JScrollPane(table);
        tableContainer.createVerticalScrollBar();
        tableContainer.setSize(150, 150);

        this.add(tableContainer);




        //TODO: JTable oder JList? -editierbar, muss Container für Auswertung enthalten können

    }

}
