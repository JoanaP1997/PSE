package dibugger.DebugLogic.Interpreter;

/**
 * Represents the beginning and end of an scope in a programm.
 * 
 * @author wagner
 *
 */
public class ScopeTuple {
	/**
	 * Linenumber, where the Scope starts
	 */
	private int startLine;
	/**
	 * Linenumber, where the Scope ends
	 */
	private int endLine;

	/**
	 * Constructor
	 */
	public ScopeTuple(int startLine, int endLine) {
		this.endLine = endLine;
		this.startLine = startLine;
	}

	/**
	 * returns the Startline
	 * 
	 * @return startline
	 */
	public int getStartLine() {
		return this.startLine;
	}

	/**
	 * returns the Endline
	 * 
	 * @return endline
	 */
	public int getEndLine() {
		return this.endLine;
	}

	/**
	 * Sets the Startline
	 * 
	 * @param startLine
	 */
	public void setStartLine(int startLine) {
		this.startLine = startLine;
	}

	/**
	 * Sets the Endline
	 * 
	 * @param endLine
	 */
	public void setEndLine(int endLine) {
		this.endLine = endLine;
	}

	/**
	 * Checks, wether the scope contains a certain line
	 * 
	 * @param line
	 * @return boolean
	 */
	public boolean contains(int line) {
		return (this.startLine <= line && line <= this.endLine);
	}
}
