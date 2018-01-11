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
        LayoutManager layout = new GridLayout(0,1);
        this.setLayout(layout);

        title = new JLabel("ConditionalBreakpoints:");
        this.add(title, layout);
    }
}
