package dibugger.filehandler.facade;

import java.io.File;

/**
 * 
 * @author Pascal Contains Properties Data for the DIbugger UI to work.
 */
public class PropertiesFile {

    private String selectedLanguage;
    private String configFile;
    private int maxWhileIterations;
    private int maxFunctionCalls;

    public PropertiesFile() {
        // TODO Default Values from Pflichtenheft
        selectedLanguage = "english";
        configFile = "";
        maxWhileIterations = 100;
        maxFunctionCalls = 100;
    }

    /**
     * 
     * @return the selected LanguageID of the DIbugger
     */
    public String getSelectedLanguage() {
        return selectedLanguage;
    }

    /**
     * set the language
     * 
     * @param selectedLanguage
     *            new languageID
     */
    public void setSelectedLanguage(String selectedLanguage) {
        this.selectedLanguage = selectedLanguage;
    }

    /**
     * 
     * @return the filesystem location of the last used configurationFile as
     *         String
     */
    public String getConfigFile() {
        return configFile;
    }

    /**
     * sets the last config file
     * 
     * @param configFile
     *            new location of the last configFile
     */
    public void setConfigFile(String configFile) {
        this.configFile = configFile;
    }

    /**
     * 
     * @return maximum number of while iterations
     */
    public int getMaxWhileIterations() {
        return maxWhileIterations;
    }

    /**
     * 
     * @param maxWhileIterations
     *            new number of while iterations
     */
    public void setMaxWhileIterations(int maxWhileIterations) {
        this.maxWhileIterations = maxWhileIterations;
    }

    /**
     * 
     * @return maximum amount of recursive function calls
     */
    public int getMaxFunctionCalls() {
        return maxFunctionCalls;
    }

    /**
     * 
     * @param maxFunctionCalls
     *            new maximum amount of recursive function calls
     */
    public void setMaxFunctionCalls(int maxFunctionCalls) {
        this.maxFunctionCalls = maxFunctionCalls;
    }

    // Default Location
    /**
     * Default properties file location
     */
    public static File DEFAULT_LOCATION = new File("config.cfg");

}
