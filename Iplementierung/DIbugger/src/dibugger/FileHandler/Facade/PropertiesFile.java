package dibugger.FileHandler.Facade;

/**
 * 
 * @author Pascal
 * Holds Properties Data for the DIbugger UI to work.
 */
public class PropertiesFile {
	
	private String selectedLanguage;
	private String configFile;
	private int maxWhileIterations;
	private int maxFunctionCalls;
	
	public PropertiesFile() {
		//TODO Default Values
	}

	public String getSelectedLanguage() {
		return selectedLanguage;
	}
	public void setSelectedLanguage(String selectedLanguage) {
		this.selectedLanguage = selectedLanguage;
	}

	public String getConfigFile() {
		return configFile;
	}
	public void setConfigFile(String configFile) {
		this.configFile = configFile;
	}

	public int getMaxWhileIterations() {
		return maxWhileIterations;
	}
	public void setMaxWhileIterations(int maxWhileIterations) {
		this.maxWhileIterations = maxWhileIterations;
	}

	public int getMaxFunctionCalls() {
		return maxFunctionCalls;
	}
	public void setMaxFunctionCalls(int maxFunctionCalls) {
		this.maxFunctionCalls = maxFunctionCalls;
	}	
	
}
