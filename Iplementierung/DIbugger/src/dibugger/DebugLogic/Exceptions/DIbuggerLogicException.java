package dibugger.DebugLogic.Exceptions;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract class for exceptions thrown in the DIbuggerLogic package.
 * @author scheler
 *
 */
public abstract class DIbuggerLogicException extends Exception {

	/**
	 * Default serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	private List<String> occurrences;
	
	/**
	 * Constructor for a DIbuggerLogicException
	 * @param occurrence the line of occurrence of the exception
	 * @param id the identifier of the exception for the corresponding string in the language file
	 */
	public DIbuggerLogicException (int occurrence, String id) {
		this.occurrences = new ArrayList<String>();
		this.occurrences.add("" + occurrence);
		this.id = id;
	}

	
	/**
	 * Getter for the identifier of an exception.
	 * 
	 * @return the exception ID
	 */
	public String getID() {
		return this.id;
	}
	
	/**
	 * Getter for the occurrence of the exception.
	 * 
	 * @return the list of occurrences of the exception.
	 */
	public List<String> getOccurrence() {
		return this.occurrences;
	}
	
	/**
	 * Adds a new occurrence of an exception to its occurrence list.
	 * 
	 * @param the occurrence to be added
	 */
	public void addOccurence(String occurrence) {
		this.occurrences.add(occurrence);
	}
}
