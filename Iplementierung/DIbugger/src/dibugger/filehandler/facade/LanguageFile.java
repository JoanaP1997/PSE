package dibugger.filehandler.facade;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Pascal Represents the translation of identifiers into a specific
 *         Language.
 */
public class LanguageFile {
    private String langID;
    private String name;

    private Map<String, String> map_translations;

    /**
     * Creates a new LanguageFile object with the specific languageID and name
     * 
     * @param langID
     *            the id of the language
     * @param name
     *            the name of the language
     */
    public LanguageFile(String langID, String name) {
        map_translations = new HashMap<String, String>();

        this.langID = langID;
        this.name = name;
    }

    /**
     * Add a new translation
     * 
     * @param id
     *            the identifier to translate
     * @param text
     *            the translation of the identifier
     */
    public void putTranslation(String id, String text) {
        map_translations.put(id, text);
    }

    /**
     * 
     * @param textID
     *            the id to translate
     * @return translation of the given textID as String
     */
    public String getTranslation(String textID) {
        String text = map_translations.get(textID);
        return (text != null) ? text : "No Translation Available: "+textID;
    }

    /**
     * 
     * @return the lang id of this LanguageFile
     */
    public String getLangID() {
        return langID;
    }

    /**
     * 
     * @return the name of the language
     */
    public String getName() {
        return name;
    }

    /**
     * sets the langID
     * 
     * @param langID
     *            new langID
     */
    public void setLangID(String langID) {
        this.langID = langID;
    }

    /**
     * sets the language name
     * 
     * @param name
     *            new language name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return the map containing all translations
     */
    public Map<String, String> getMap_translations() {
        return map_translations;
    }

    /**
     * Default Folder filepath for language Files
     */
    public static final String DEFAULT_LANG_FILE_PATH = "res/lang/";
}
