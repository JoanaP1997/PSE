package dibugger.FileHandler.Facade;

import java.io.File;

import dibugger.FileHandler.Exceptions.FileHandlerException;

public abstract class DBFileReader {
	
	public abstract ConfigurationFile loadConfigFile(File f) throws FileHandlerException;
	public abstract LanguageFile loadLanguageFile(File f) throws FileHandlerException;
	
}
