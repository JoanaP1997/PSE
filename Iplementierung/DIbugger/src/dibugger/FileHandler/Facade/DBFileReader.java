package dibugger.FileHandler.Facade;

import java.io.File;

import dibugger.FileHandler.Exceptions.FileHandlerException;
/**
 * 
 * @author Pascal
 * Abstract class to help for the creation of several File Reader for loading Configuration and Language files.
 * Head of a Strategy
 */
public abstract class DBFileReader {
	/**
	 * Loads a Configuration of the DIbugger from a Filesystem location and creates a representing ConfigurationFile from that file.
	 * @param f the File to load
	 * @return ConfigurationFile object representing the Configuration defined in the given File
	 * @throws FileHandlerException if some error during file parsing occured 
	 */
	public abstract ConfigurationFile loadConfigFile(File f) throws FileHandlerException;
	/**
	 * Loads a Language of the DIbugger from a Filesystem location and creates a representing LanguageFile from that file.
	 * @param f the file to load
	 * @return LanguageFile object holding translation data.
	 * @throws FileHandlerException if some error during file parsing occured
	 */
	public abstract LanguageFile loadLanguageFile(File f) throws FileHandlerException;
	
}
