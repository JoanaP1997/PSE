package dibugger.userinterface;

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

        JScrollPane tableContainer = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED );
        tableContainer.setViewportView(table);
        tableContainer.createVerticalScrollBar();
        tableContainer.setPreferredSize(new Dimension(290, 250));

        this.add(tableContainer);



    }
}
