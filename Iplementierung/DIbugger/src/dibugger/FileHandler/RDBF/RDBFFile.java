package dibugger.FileHandler.RDBF;

import java.io.File;

public class RDBFFile extends RDBFAdditions{
	
	private File sysFile;
	
	public RDBFFile(File sysFile) {
		this.sysFile = sysFile;
	}

	public File getSysFile() {
		return sysFile;
	}
	public void setSysFile(File sysFile) {
		this.sysFile = sysFile;
	}
	
}
