package dibugger.FileHandler.Facade;

import java.io.File;

public abstract class DBFileReader {
	
	public abstract ConfigurationFile loadConfigFile(File f);
	public abstract LanguageFile loadLanguageFile(File f);
	
}
