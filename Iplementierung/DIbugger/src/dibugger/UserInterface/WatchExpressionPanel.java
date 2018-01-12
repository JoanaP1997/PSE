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

        LayoutManager layout = new GridLayout(0,1);
        this.setLayout(layout);

        panelType = "Watch Expressions:";

        String[] columnTitles = { panelType , "Auswertung" };
        Object[][] dataEntries = { {"hier könnte ihre Expression stehen", "ausgewertet"}};
        JTable table = new JTable(dataEntries, columnTitles);
        table.setSize(200, 200);

        JScrollPane tableContainer = new JScrollPane(table);
        tableContainer.createVerticalScrollBar();

        this.add(tableContainer, layout);




        //TODO: JTable oder JList? -editierbar, muss Container für Auswertung enthalten können

    }

}
