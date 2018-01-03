package dibugger.FileHandler.Facade;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import dibugger.FileHandler.Exceptions.LanguageNotFoundException;

public class FileHandlerFacade {
	
	private List<LanguageFile> list_languages;
	
	public FileHandlerFacade() {
		list_languages = new ArrayList<LanguageFile>();
	}
	
	public void saveConfig(ConfigurationFile config){
		
	}
	public ConfigurationFile loadConfig(File file){
		return null;
	}
	
	public String loadProgramText(File f){
		return null;
	}
	
	public PropertiesFile loadPropertiesFile(){
		return null;
	}
	
	public List<String> getLanguages(){
		List<String> list = new ArrayList<String>();
		for(LanguageFile f : list_languages){
			list.add(f.getLangID());
		}
		return list;
	}
	
	//TODO Use right Exception
	public LanguageFile getLanguageFile(String langID) throws LanguageNotFoundException{
		for(LanguageFile f : list_languages){
			if(f.getLangID().equals(langID)){
				return f;
			}
		}
		throw new LanguageNotFoundException();
	}
	
}
