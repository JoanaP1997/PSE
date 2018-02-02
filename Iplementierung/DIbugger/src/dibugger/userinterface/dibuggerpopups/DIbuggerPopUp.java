package dibugger.userinterface.dibuggerpopups;

import javax.swing.ImageIcon;
import javax.swing.JDialog;

/**
 * DIbuggerPopUp.
 */
class DIbuggerPopUp extends JDialog {

    /**
     * Constructor for a DIbuggerPopUp.
     */
    DIbuggerPopUp() {
        this.setTitle("DIbugger");
        ImageIcon icon = new ImageIcon("res/logo_nongi.png");
        this.setIconImage(icon.getImage());
    }

}
