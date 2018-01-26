package dibugger.filehandler.facade;

/**
 * 
 * @author Pascal Abstract class to help for the creation of several File Writer
 *         for saving Configuration and Language files. Head of a Strategy
 */
public abstract class DBFileWriter {

    /**
     * Saves a ConfigurationFile onto the Filesystem location defined by the
     * given systemFile
     * 
     * @param f
     *            the Configration to save
     */
    public abstract void saveConfigFile(ConfigurationFile f);

    /**
     * Saves a LanguageFile onto a Filesystem location
     * 
     * @param f
     *            the LanguageFile to save
     */
    public abstract void saveLanguageFile(LanguageFile f);

}
