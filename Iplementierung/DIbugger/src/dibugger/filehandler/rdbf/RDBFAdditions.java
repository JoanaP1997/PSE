package dibugger.filehandler.rdbf;

import java.util.ArrayList;
import java.util.List;

/**
 * abstract class containing a list of RDBFBlock and RDBFData and methods for
 * getting the items inside
 * 
 * @author Pascal
 *
 */
public abstract class RDBFAdditions {

    private List<RDBFBlock> list_blocks;
    private List<RDBFData> list_data;

    public RDBFAdditions() {
        list_blocks = new ArrayList<RDBFBlock>();
        list_data = new ArrayList<RDBFData>();
    }

    /**
     * 
     * @return the list object containing all RDBFBlock objects
     */
    public List<RDBFBlock> getList_blocks() {
        return list_blocks;
    }

    /**
     * @see List#add(Object)
     * @param data
     */
    public void addBlock(RDBFBlock data) {
        list_blocks.add(data);
    }

    /**
     * Getter via BlockName
     * 
     * @param identifier
     *            the name of the block
     * @return a list containing all RDBFBlock object with the given name
     *         (identifier)
     */
    public List<RDBFBlock> getBlocksByName(String identifier) {
        List<RDBFBlock> l = new ArrayList<RDBFBlock>();
        for (int i = 0; i < list_blocks.size(); ++i) {
            RDBFBlock b = list_blocks.get(i);
            if (b.getName().equals(identifier)) {
                l.add(b);
            }
        }
        return l;
    }

    /**
     * Same as {@linkplain RDBFAdditions#getBlocksByName(String)} except return
     * 
     * @return only the first block with the given name
     */
    public RDBFBlock getFirstBlockByName(String identifier) {
        for (int i = 0; i < list_blocks.size(); ++i) {
            RDBFBlock b = list_blocks.get(i);
            if (b.getName().equals(identifier)) {
                return b;
            }
        }
        return null;
    }

    /**
     * 
     * @return the list object containing all RDBFData objects
     */
    public List<RDBFData> getList_data() {
        return list_data;
    }

    /**
     * @see List#add(Object)
     * @param data
     */
    public void addData(RDBFData data) {
        list_data.add(data);
    }

    /**
     * Getter for all RDBFData objects with the given name
     * 
     * @param identifier
     *            the identifier of the RDBFData
     * @return a list containing all RDBFData objects with the given identifier
     *         as their name
     */
    public List<RDBFData> getDataByName(String identifier) {
        List<RDBFData> l = new ArrayList<RDBFData>();
        for (int i = 0; i < list_data.size(); ++i) {
            RDBFData d = list_data.get(i);
            if (d.getName().equals(identifier)) {
                l.add(d);
            }
        }
        return l;
    }

    /**
     * Same as {@linkplain RDBFAdditions#getDataByName(String)} except return
     * 
     * @return only the first data with the given name
     */
    public RDBFData getFirstDataByName(String identifier) {
        for (int i = 0; i < list_data.size(); ++i) {
            RDBFData d = list_data.get(i);
            if (d.getName().equals(identifier)) {
                return d;
            }
        }
        return null;
    }

}
