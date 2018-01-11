package dibugger.UserInterface;

import javax.swing.*;
import java.awt.*;

public class WatchExpressionPanel extends ExpressionPanel {

    private static WatchExpressionPanel singleton = null;

    private JLabel title;
    private JTable list;


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

        title = new JLabel("WatchExpressions:");
        this.add(title, layout);


        list = new JTable();
        list.setCellSelectionEnabled(true);
        list.setDragEnabled(true);
        list.add(new JLabel("hi"));
        list.add(new JLabel("huhu"));
        JScrollPane scrollPane = new JScrollPane(list);
        list.setFillsViewportHeight(true);
        this.add(scrollPane, layout);

    }

}
