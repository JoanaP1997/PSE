package dibugger.UserInterface;

public class ConditionalBreakpointPanel extends ExpressionPanel {

    ConditionalBreakpointPanel singleton = null;

    private ConditionalBreakpointPanel() {
        //TODO
    }

    public ConditionalBreakpointPanel getConditionalBreakpointPanel() {
        if (singleton == null) {
            singleton = new ConditionalBreakpointPanel();
        }
        return singleton;
    }

    public void update() {
        //TODO
    }
}
