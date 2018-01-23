package dibugger.filehandler.facade;

/**
 * 
 * @author Pascal abstract class to be used for saving properties files
 */
public abstract class PropertiesFileWriter {

    /**
     * Saves a given PropertiesFile to the File System
     * 
     * @param f
     *            the PropertiesFile to save
     */
    public abstract void saveProperties(PropertiesFile f);

}
