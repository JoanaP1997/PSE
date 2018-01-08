package dibugger.FileHandler.Facade;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Pascal
 * Represents the translation of identifiers into a specific Language.
 */
public class LanguageFile {
	private String langID;
	private String name;
	
	private Map<String, String> map_translations;
	
	public LanguageFile(String langID, String name) {
		map_translations = new HashMap<String, String>();
		
		this.langID = langID;
		this.name = name;
	}

	public void putTranslation(String id, String text){
		map_translations.put(id, text);
	}
	
	public String getTranslation(String textID){
		String text = map_translations.get(textID);
		return (text!=null) ? text : "No Translation Available";
	}
	
	public String getLangID() {
		return langID;
	}
	public String getName() {
		return name;
	}
	
	public void setLangID(String langID) {
		this.langID = langID;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Map<String, String> getMap_translations() {
		return map_translations;
	}
}
