package dibugger.filehandler.facade;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import dibugger.filehandler.exceptions.FileHandlerException;
import dibugger.filehandler.exceptions.LanguageNotFoundException;
import dibugger.filehandler.rdbf.RDBFDBReader;
import dibugger.filehandler.rdbf.RDBFDBWriter;
import dibugger.filehandler.rdbf.RDBFPropReader;
import dibugger.filehandler.rdbf.RDBFPropWriter;

/**
 * 
 * @author Pascal The Facade to control all actions of the FileHandler.
 */
public class FileHandlerFacade {

    private List<LanguageFile> list_languages;

    // Properties Reader / Writer
    private RDBFPropReader reader_rdbf_prop;
    private RDBFPropWriter writer_rdbf_prop;

    // DBReader / Writer
    private RDBFDBReader reader_rdbf_db;
    private RDBFDBWriter writer_rdbf_db;

    /**
     * @throws FileHandlerException
     *             see {@linkplain DBFileReader#loadLanguageFile(File)}
     */
    public FileHandlerFacade() throws FileHandlerException {
        reader_rdbf_prop = new RDBFPropReader();
        writer_rdbf_prop = new RDBFPropWriter();

        reader_rdbf_db = new RDBFDBReader();
        writer_rdbf_db = new RDBFDBWriter();

        // Load all Languages probably not a good idea to load all Translations
        list_languages = loadAllAvailableLanguages();
    }

    /**
     * Saves a given ConfigurationFile
     * 
     * @see ConfigurationFile
     * @param config
     *            the Configuration to save
     */
    public void saveConfig(ConfigurationFile config) {
        writer_rdbf_db.saveConfigFile(config);
    }

    /**
     * Loads a ConfigurationFile given by a location on the filesystem.
     * 
     * @see ConfigurationFile
     * @param file
     *            the file to load.
     * @return a newly created ConfigurationFile
     * @throws FileHandlerException
     *             {@linkplain DBFileReader#loadConfigFile(File)}
     */
    public ConfigurationFile loadConfig(File file) throws FileHandlerException {
        return reader_rdbf_db.loadConfigFile(file);
    }

    /**
     * Loads a programtext from an uncompressed textfile located on the
     * filesystem.
     * 
     * @param f
     *            the textfile to load.
     * @return a String representing a program text
     */
    public String loadProgramText(File f) {
        try {
            StringBuilder s = new StringBuilder();

            for (String line : Files.readAllLines(Paths.get(f.toURI()))) {
                s.append(line).append("\n");
            }

            return s.toString();
        } catch (IOException e) {
            // e.printStackTrace();
            // TODO
            return "INVALID_FILE";
        }
    }

    /**
     * Loads the Properties of the DIBugger
     * 
     * @see PropertiesFile
     * @return a PropertiesFile representing the properties of the DIBugger
     */
    public PropertiesFile loadPropertiesFile() {
        return reader_rdbf_prop.loadProperties(PropertiesFile.DEFAULT_LOCATION);
    }

    /**
     * Saves a given DIbugger Properties file
     * 
     * @param file
     *            the properties to save
     */
    public void savePropertiesFile(PropertiesFile file) {
        writer_rdbf_prop.saveProperties(file);
    }

    /**
     * 
     * @return all available languages for translation
     */
    public List<String> getLanguages() {
        List<String> list = new ArrayList<String>();
        for (LanguageFile f : list_languages) {
            list.add(f.getLangID());
        }
        return list;
    }

    // TODO Use right Exception
    /**
     * 
     * @param langID
     *            identifier of the language
     * @return a LanugageFile object that corresponds to the given langID
     * @throws LanguageNotFoundException
     *             if no Language with the given langID exists
     */
    public LanguageFile getLanguageFile(String langID) throws LanguageNotFoundException {
        for (LanguageFile f : list_languages) {
            if (f.getLangID().equals(langID)) {
                return f;
            }
        }
        throw new LanguageNotFoundException();
    }

    /**
     * help method to read all available languages
     * 
     * @return a list of all avilable LanguageFiles
     * @throws FileHandlerException
     *             see {@linkplain DBFileReader#loadLanguageFile(File)}
     */
    private List<LanguageFile> loadAllAvailableLanguages() throws FileHandlerException {
        List<LanguageFile> l = new ArrayList<LanguageFile>();

        File d = new File(LanguageFile.DEFAULT_LANG_FILE_PATH);
        for (File f : d.listFiles()) {
            if (f.isFile()) {
                l.add(reader_rdbf_db.loadLanguageFile(f));
            }
        }

        return l;
    }

}
