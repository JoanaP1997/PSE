package dibugger.UserInterface;

public class WatchExpressionPanel extends ExpressionPanel {

    private  WatchExpressionPanel singleton = null;

    private WatchExpressionPanel() {
        //TODO
    }

    public WatchExpressionPanel getWatchExpressionPanel() {
        if (singleton == null) {
            singleton = new WatchExpressionPanel();
        }
        return singleton;
    }

    public void update() {
        //TODO
    }

}
