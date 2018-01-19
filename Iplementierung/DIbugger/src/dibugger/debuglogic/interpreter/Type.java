package dibugger.debuglogic.interpreter;
/**
 * Represents a Datatype.
 * @author wagner, scheler
 *
 */
public enum Type {
	NULL,
	INT,
	LONG,
	FLOAT,
	DOUBLE,
	CHAR,
	BOOLEAN,
	ARRAY; 
	
  /**
   * Returns a type based on its String representation.
   * @param string the string to be converted
   * @return the corresponding type, NULL if no match is found or if type is array.
   */
	public Type fromStringToType(String string) {
	  switch (string) {
	  case "null": return NULL;
	  case "int": return INT;
	  case "long": return LONG;
	  case "float": return FLOAT;
	  case "double": return DOUBLE;
	  case "char": return CHAR;
	  case "boolean": return BOOLEAN;
	  default: return NULL;
	          
	  }
	}
}
