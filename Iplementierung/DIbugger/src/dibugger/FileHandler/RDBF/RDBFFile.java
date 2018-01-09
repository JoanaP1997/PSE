package dibugger.FileHandler.RDBF;

import java.io.File;

/**
 * Represents a RDBF File as a Data Structure
 * @author Pascal
 *
 */
public class RDBFFile extends RDBFAdditions{
	
	private File sysFile;
	
	public RDBFFile(File sysFile) {
		this.sysFile = sysFile;
	}

	/**
	 * @see File
	 * @return the systemfile
	 */
	public File getSysFile() {
		return sysFile;
	}
	/**
	 * Setter for a System File located on the filesystem
	 * @see File
	 * @param sysFile new systemfile as location
	 */
	public void setSysFile(File sysFile) {
		this.sysFile = sysFile;
	}
	
}
