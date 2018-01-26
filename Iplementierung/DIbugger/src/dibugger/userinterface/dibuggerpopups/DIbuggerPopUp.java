package dibugger.userinterface.dibuggerpopups;

import javax.swing.ImageIcon;
import javax.swing.JDialog;


/**
 * DIbuggerPopUP.
 */
class DIbuggerPopUp extends JDialog {

  /**
   * Constructor for a DIbuggerPopUP
   */
  DIbuggerPopUp() {
    this.setTitle("DIbugger");
    ImageIcon icon = new ImageIcon("res/logo_nongi.png");
    this.setIconImage(icon.getImage());
  }

}
