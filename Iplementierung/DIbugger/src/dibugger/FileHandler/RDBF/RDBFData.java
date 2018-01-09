package dibugger.FileHandler.RDBF;

import dibugger.FileHandler.Exceptions.ParseAssignmentException;

/**
 * Represents a Data object / Assignment of the RDBF File Format
 * @author Pascal
 *
 */
public class RDBFData {
	
	private String name;
	private int dataType;
	private String value;
	
	public RDBFData(String name, String value) {
		this.name = name;
		setValue(value);
	}
	public RDBFData(String name, String value, boolean isText) {
		if(!isText){
			this.name = name;
			setValue(value);
		}
		else{
			this.name = name;
			this.value = value;
			this.dataType = DATA_TEXT;
		}
	}
	
	/**
	 * 
	 * @return the name of the assignment
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @param name new assignment name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 
	 * @return the type of the value as an integer supplied by the constants (DATA_STRING,DATA_INT,...) in this class
	 */
	public int getDataType() {
		return dataType;
	}
	
	/**
	 * 
	 * @return the value of the assignment as string
	 */
	public String getValue() {
		return value;
	}
	/**
	 * Sets the value of this assignment and generates the dataType from the given value
	 * @param value new value of the assignment
	 */
	public void setValue(String value) {
		this.value = value;
		try {
			dataType = RDBFParser.getInstance().getDataType("temp="+value);
		} catch (ParseAssignmentException e) {
			//TODO something
		}
	}

	//Data Types
	public static final int DATA_STRING = 0;
	public static final int DATA_INT = 1;
	public static final int DATA_LONG = 2;
	public static final int DATA_FLOAT = 3;
	public static final int DATA_DOUBLE = 4;
	public static final int DATA_BOOLEAN = 5;
	public static final int DATA_TEXT = 6;
}
