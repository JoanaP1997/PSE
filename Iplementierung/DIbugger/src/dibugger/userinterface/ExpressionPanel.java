package dibugger.userinterface;

import javax.swing.JPanel;

/**
 * Abstract class.
 */
public abstract class ExpressionPanel extends JPanel {

  String panelType = "ExpressionPanel";

  /**
   * update-Method for observer pattern.
   */
  public abstract void update();


}
