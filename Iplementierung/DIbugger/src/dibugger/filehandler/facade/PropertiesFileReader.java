package dibugger.filehandler.facade;

import java.io.File;

/**
 * 
 * @author Pascal abstract class to be used for reading Properties files Head of
 *         a strategy
 */
public abstract class PropertiesFileReader {

    /**
     * Loads a given File as a properties File
     * 
     * @see PropertiesFile
     * @param f
     *            the filesystem file to load
     * @return a new PropertiesFile object representing the given file
     */
    public abstract PropertiesFile loadProperties(File f);

}
