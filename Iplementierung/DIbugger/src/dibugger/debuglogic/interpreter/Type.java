package dibugger.debuglogic.interpreter;

/**
 * Represents a Datatype.
 * 
 * @author wagner, scheler
 *
 */
public enum Type {
    NULL(new ConstantTerm(null)),
    INT(new ConstantTerm(new IntValue(0))),
    LONG((new ConstantTerm(new LongValue(0)))),
    FLOAT((new ConstantTerm(new FloatValue(0)))),
    DOUBLE((new ConstantTerm(new DoubleValue(0)))),
    CHAR((new ConstantTerm(new CharValue('a')))),
    BOOLEAN((new ConstantTerm(new BooleanValue(false)))),
    ARRAY((new ConstantTerm(null)));
    private final Term defaultConstantTerm;
    private Type(final Term defaultConstantTerm) {
      this.defaultConstantTerm = defaultConstantTerm;
      }
    
    public Term getDefault() {
      return this.defaultConstantTerm;
    }
    /**
     * Returns a type based on its String representation.
     * 
     * @param string
     *            the string to be converted
     * @return the corresponding type, NULL if no match is found or if type is
     *         array.
     */
    public static Type fromStringToType(String string) {
        switch (string) {
            case "null":
                return NULL;
            case "int":
                return INT;
            case "long":
                return LONG;
            case "float":
                return FLOAT;
            case "double":
                return DOUBLE;
            case "char":
                return CHAR;
            case "boolean":
                return BOOLEAN;
            case "int[]":
            case "int []":
            case "long[]":
            case "long []":
            case "float[]":
            case "float []":
            case "double[]":
            case "double []":
            case "char[]":
            case "char []":
            case "boolean[]":
            case "boolean []":
                return ARRAY;
            default:
                return NULL;

        }
    }
}
