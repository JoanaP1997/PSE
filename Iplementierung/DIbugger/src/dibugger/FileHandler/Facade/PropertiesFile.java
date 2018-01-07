package dibugger.FileHandler.Facade;

import java.io.File;

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
		//TODO Default Values from Pflichtenheft
		selectedLanguage="english";
		configFile="";
		maxWhileIterations = 100;
		maxFunctionCalls = 100;
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
	
	
	//Default Location
	public static final File DEFAULT_LOCATION = new File("config.cfg");
	
}
