package dibugger.debuglogic.debugger;

/**
 * Represents a Breakpoint (line and programID)
 * @author Pascal
 *
 */
public class Breakpoint {
	private int line;
	private int programID;

	public Breakpoint(int line, int programID) {
		this.line = line;
		this.programID = programID;
	}

	/**
	 * 
	 * @return the line of the breakpoint
	 */
	public int getLine() {
		return line;
	}
	/**
	 * 
	 * @param line new line of the breakpoint
	 */
	public void setLine(int line) {
		this.line = line;
	}

	/**
	 * 
	 * @return the programID of the breakpoint
	 */
	public int getProgramID() {
		return programID;
	}
	/**
	 * 
	 * @param programID new programID of the program
	 */
	public void setProgramID(int programID) {
		this.programID = programID;
	}
	
}
