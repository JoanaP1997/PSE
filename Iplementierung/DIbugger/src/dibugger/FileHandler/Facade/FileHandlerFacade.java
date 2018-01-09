package dibugger.FileHandler.Facade;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import dibugger.FileHandler.Exceptions.LanguageNotFoundException;

/**
 * 
 * @author Pascal
 * The Facade to control all actions of the FileHandler.
 */
public class FileHandlerFacade {
	
	private List<LanguageFile> list_languages;
	
	
	public FileHandlerFacade() {
		list_languages = new ArrayList<LanguageFile>();
		//TODO load language Files
	}
	
	/**
	 * Saves a given ConfigurationFile
	 * @see ConfigurationFile
	 * @param config the Configuration to save
	 */
	public void saveConfig(ConfigurationFile config){
		
	}
	/**
	 * Loads a ConfigurationFile given by a location on the filesystem.
	 * @see ConfigurationFile
	 * @param file the file to load.
	 * @return a newly created ConfigurationFile
	 */
	public ConfigurationFile loadConfig(File file){
		return null;
	}
	
	/**
	 * Loads a programtext from an uncompressed textfile located on the filesystem.
	 * @param f the textfile to load.
	 * @return a String representing a program text
	 */
	public String loadProgramText(File f){
		return null;
	}
	
	/**
	 * Loads the Properties of the DIBugger
	 * @see PropertiesFile
	 * @return a PropertiesFile representing the properties of the DIBugger
	 */
	public PropertiesFile loadPropertiesFile(){
		return null;
	}
	
	/**
	 * 
	 * @return all available languages for translation
	 */
	public List<String> getLanguages(){
		List<String> list = new ArrayList<String>();
		for(LanguageFile f : list_languages){
			list.add(f.getLangID());
		}
		return list;
	}
	
	//TODO Use right Exception
	/**
	 * 
	 * @param langID identifier of the language
	 * @return a LanugageFile object that corresponds to the given langID
	 * @throws LanguageNotFoundException if no Language with the given langID exists
	 */
	public LanguageFile getLanguageFile(String langID) throws LanguageNotFoundException{
		for(LanguageFile f : list_languages){
			if(f.getLangID().equals(langID)){
				return f;
			}
		}
		throw new LanguageNotFoundException();
	}
	
}
