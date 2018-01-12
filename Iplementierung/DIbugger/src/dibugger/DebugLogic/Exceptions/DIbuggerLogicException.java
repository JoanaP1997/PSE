package dibugger.DebugLogic.Exceptions;

import java.util.ArrayList;
import java.util.List;

public abstract class DIbuggerLogicException extends Exception {

	/**
	 * Default serialVersionUID.
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	private List<String> occurrences;
	
	public DIbuggerLogicException (String occurrence, String id) {
		this.occurrences = new ArrayList<String>();
		this.occurrences.add(occurrence);
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
