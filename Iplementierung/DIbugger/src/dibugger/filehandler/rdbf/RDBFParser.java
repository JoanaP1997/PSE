package dibugger.filehandler.rdbf;

import dibugger.filehandler.exceptions.InvalidLineTypeExeption;
import dibugger.filehandler.exceptions.ParseAssignmentException;
import dibugger.filehandler.exceptions.ParseBlockException;

/**
 * Singleton Parser for Lines contained in a RDBF File
 * 
 * @author Pascal
 *
 */
public class RDBFParser {

    private static RDBFParser parser;

    private RDBFParser() {

    }

    /**
     * 
     * @return singleton instance object of this class
     */
    public static RDBFParser getInstance() {
        return (parser != null) ? parser : (parser = new RDBFParser());
    }

    /**
     * Getter for the block name of a line
     * 
     * @param line
     *            the line to parse
     * @return the block name of the given line, if it is a block begin line
     * @throws ParseBlockException
     *             if the line is invalid or contains no block start
     */
    public String getBlockName(String line) throws ParseBlockException {
        if (line.endsWith("{")) {
            String[] s = line.split("\\{");
            if (s.length > 0 && s[0].matches("(\\w|$|&|\\_)+")) {
                return s[0];
            }
        }
        System.err.println("ParseBlockException: " + line);
        throw new ParseBlockException();
    }

    /**
     * Getter for the data type of an assignment
     * 
     * @param line
     *            the line to parse
     * @return the Data Type as Defined in {@linkplain RDBFData}
     * @throws ParseAssignmentException
     *             if the line is no valid assignment or assigns data of an
     *             invalid type
     */
    public int getDataType(String line) throws ParseAssignmentException {
        String[] as = line.split("=");
        if (as.length >= 2) {
            String s = as[1];
            for (int i = 2; i < as.length; ++i) {
                s += "=" + as[i];
            }
            as[1] = s;
            if (as[1].matches("-?\\d+")) {
                return RDBFData.DATA_INT;
            } else if (as[1].matches("-?\\d+L")) {
                return RDBFData.DATA_LONG;
            } else if (as[1].matches("-?\\d+(\\.\\d*)?(E\\d+)?f")) {
                return RDBFData.DATA_FLOAT;
            } else if (as[1].matches("-?\\d+(\\.\\d*)?(E\\d+)?")) {
                return RDBFData.DATA_DOUBLE;
            } else if (as[1].matches("(true)|(false)")) {
                return RDBFData.DATA_BOOLEAN;
            } else if (as[1].matches("'([\\w[^'\n]]+)*'")) {
                return RDBFData.DATA_STRING;
            }
        }
        System.err.println("ParseAssignmentException dataType: " + line);
        throw new ParseAssignmentException();
    }

    /**
     * Getter for the variable name of an assignment
     * 
     * @param line
     *            the line to parse
     * @return the name of the assignment
     * @throws ParseAssignmentException
     *             if the line is not an valid assignment
     */
    public String getVariableName(String line) throws ParseAssignmentException {
        String[] as = line.split("=");
        if (as.length >= 2) {
            return as[0];
        }
        System.err.println("ParseAssignmentException varName: " + line);
        throw new ParseAssignmentException();
    }

    /**
     * Getter for the value of an assignment
     * 
     * @param line
     *            the line to parse
     * @return the value of the assignment
     * @throws ParseAssignmentException
     *             if the line is not an valid assignment
     */
    public String getValue(String line) throws ParseAssignmentException {
        String[] as = line.split("=");
        if (as.length >= 2) {
            String s = as[1];
            for (int i = 2; i < as.length; ++i) {
                s += "=" + as[i];
            }
            return s;
        }
        System.err.println("Parse Exception: " + line);
        throw new ParseAssignmentException();
    }

    /**
     * Finds the LineType as defined in constants with prefix LINE_ in this
     * class
     * 
     * @param line
     *            this line to evaluate
     * @return the lineType as Defined in this class
     * @throws InvalidLineTypeExeption
     *             if the line is not a valid line defined in the RDBF Format
     */
    public int evaluateLineType(String line) throws InvalidLineTypeExeption {
        // System.out.println(line);
        if (line.matches("(\\w|$|&|\\_)+\\{")) {
            return LINE_BLOCK;
        } else if (line.matches("def_blockLen=\\d+")) {
            return LINE_BLOCK_TEXT_LENGTH;
        } else if (line.split("=").length >= 2) {
            return LINE_ASSIGNMENT;
        } else if (line.matches("\\}")) {
            return LINE_BLOCK_END;
        } else if (line.matches("//([\\w[^'\n]]+)*")) {
            return LINE_COMMENT;
        } else if (line.matches("")) {
            return LINE_EMPTY;
        }
        System.err.println("Invalid Line: " + line);
        throw new InvalidLineTypeExeption();
    }

    /**
     * Value Parser for String
     * 
     * @param s
     *            the value to parse
     * @return the RDBFData value s as String
     * @throws ParseAssignmentException
     *             if the value is not a String value
     */
    public String getSValue(String s) throws ParseAssignmentException {
        if (s.startsWith("'") && s.endsWith("'")) {
            return s.substring(1, s.length() - 1);
        }
        throw new ParseAssignmentException();
    }

    /**
     * Value Parser for Integer
     * 
     * @param s
     *            the value to parse
     * @return the RDBFData value s as Integer
     * @throws ParseAssignmentException
     *             if the value is not an Integer value
     */
    public int getIValue(String s) throws ParseAssignmentException {
        try {
            return Integer.valueOf(s);
        } catch (NumberFormatException e) {
            throw new ParseAssignmentException();
        }
    }

    /**
     * Value Parser for Long
     * 
     * @param s
     *            the value to parse
     * @return the RDBFData value s as Long
     * @throws ParseAssignmentException
     *             if the value is not a Long value
     */
    public long getLValue(String s) throws ParseAssignmentException {
        if (s.endsWith("L")) {
            try {
                return Long.valueOf(s.substring(0, s.length() - 1));
            } catch (NumberFormatException e) {
                throw new ParseAssignmentException();
            }
        }
        throw new ParseAssignmentException();
    }

    /**
     * Value Parser for Float
     * 
     * @param s
     *            the value to parse
     * @return the RDBFData value s as Float
     * @throws ParseAssignmentException
     *             if the value is not a Float value
     */
    public float getFValue(String s) throws ParseAssignmentException {
        if (s.endsWith("f")) {
            try {
                return Float.valueOf(s);
            } catch (NumberFormatException e) {
                throw new ParseAssignmentException();
            }
        }
        throw new ParseAssignmentException();
    }

    /**
     * Value Parser for Double
     * 
     * @param s
     *            the value to parse
     * @return the RDBFData value s as Double
     * @throws ParseAssignmentException
     *             if the value is not a Double value
     */
    public double getDValue(String s) throws ParseAssignmentException {
        try {
            return Double.valueOf(s);
        } catch (NumberFormatException e) {
            throw new ParseAssignmentException();
        }
    }

    /**
     * Value Parser for Boolean
     * 
     * @param s
     *            the value to parse
     * @return the RDBFData value s as Boolean
     * @throws ParseAssignmentException
     *             if the value is not a Boolean value
     */
    public boolean getBValue(String s) throws ParseAssignmentException {
        try {
            return Boolean.valueOf(s);
        } catch (NumberFormatException e) {
            throw new ParseAssignmentException();
        }
    }

    // Line Types
    public static final int LINE_ASSIGNMENT = 0;
    public static final int LINE_BLOCK = 1;
    public static final int LINE_BLOCK_TEXT_LENGTH = 2;
    public static final int LINE_BLOCK_END = 3;
    public static final int LINE_COMMENT = 4;
    public static final int LINE_EMPTY = 5;
}
