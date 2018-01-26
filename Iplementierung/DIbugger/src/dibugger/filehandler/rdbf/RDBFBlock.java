package dibugger.filehandler.rdbf;

/**
 * Representing a Block object of the RDBF File Format
 * 
 * @author Pascal
 *
 */
public class RDBFBlock extends RDBFAdditions {

    private String name;

    public RDBFBlock(String blockname) {
        super();
        this.name = blockname;
    }

    /**
     * Getter for the Blockname
     * 
     * @return the name of the block
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for the Blockname
     * 
     * @param name
     *            new name of the block
     */
    public void setName(String name) {
        this.name = name;
    }
}
