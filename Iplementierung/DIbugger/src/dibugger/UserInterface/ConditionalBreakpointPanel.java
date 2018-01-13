package dibugger.UserInterface;

import javax.swing.*;
import java.awt.*;

public class ConditionalBreakpointPanel extends ExpressionPanel {

    private static ConditionalBreakpointPanel singleton = null;

    private JLabel title;

    private ConditionalBreakpointPanel() {
        initComponents();
    }

    public static ConditionalBreakpointPanel getConditionalBreakpointPanel() {
        if (singleton == null) {
            singleton = new ConditionalBreakpointPanel();
        }
        return singleton;
    }

    public void update() {
        //TODO
    }

    private void initComponents() {

        panelType = "Conditional Breakpoints:";

        String[] columnTitles = { panelType , "Auswertung" };
        Object[][] dataEntries = { {"hier könnte ihre Expression stehen", "ausgewertet"}};
        JTable table = new JTable(dataEntries, columnTitles);
        table.setSize(50, 50);

        JScrollPane tableContainer = new JScrollPane(table);
        tableContainer.createVerticalScrollBar();
        tableContainer.setSize(100, 100);

        this.add(tableContainer);



    }
}
