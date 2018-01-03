package dibugger.FileHandler.RDBF;

import dibugger.FileHandler.Exceptions.InvalidLineTypeExeption;
import dibugger.FileHandler.Exceptions.ParseAssignmentException;
import dibugger.FileHandler.Exceptions.ParseBlockException;

public class RDBFParser {

	private static RDBFParser parser;
	
	private RDBFParser(){
		
	}
	
	public static RDBFParser getInstance(){
		return (parser!=null) ? parser : (parser = new RDBFParser());
	}
	
	public String getBlockName(String line) throws ParseBlockException{
		if(line.endsWith("{")){
			String[] s = line.split("\\{");
			if(s.length>0 && s[0].matches("(\\w|$|&|\\_)+")){
				return s[0];
			}
		}
		throw new ParseBlockException();
	}
	
	public int getDataType(String line) throws ParseAssignmentException{
		String[] as = line.split("=");
		if(as.length==2){
			if(as[1].matches("\\d+")){
				return RDBFData.DATA_INT;
			}
			else if(as[1].matches("\\d+L")){
				return RDBFData.DATA_LONG;
			}
			else if(as[1].matches("\\d+(\\.\\d*)?f")){
				return RDBFData.DATA_FLOAT;
			}
			else if(as[1].matches("\\d+(\\.\\d*)?")){
				return RDBFData.DATA_DOUBLE;
			}
			else if(as[1].matches("(true)|(false)")){
				return RDBFData.DATA_BOOLEAN;
			}
			else if(as[1].matches("'([\\w[^'\n]]+)*'")){
				return RDBFData.DATA_STRING;
			}
		}
		
		throw new ParseAssignmentException();
	}
	
	public String getVariableName(String line) throws ParseAssignmentException{
		String[] as = line.split("=");
		if(as.length==2){
			return as[0];
		}
		throw new ParseAssignmentException();
	}
	
	public String getValue(String line) throws ParseAssignmentException{
		String[] as = line.split("=");
		if(as.length==2){
			return as[1];
		}
		throw new ParseAssignmentException();
	}
	
	
	public int evaluateLineType(String line) throws InvalidLineTypeExeption{
		if(line.matches("(\\w|$|&|\\_)+\\{")){
			return LINE_BLOCK;
		}
		else if(line.matches("def_blockLen=\\d+")){
			return LINE_BLOCK_TEXT_LENGTH;
		}
		else if(line.split("=").length==2){
			return LINE_ASSIGNMENT;
		}
		else if(line.matches("\\}")){
			return LINE_BLOCK_END;
		}
		else if(line.matches("//([\\w[^'\n]]+)*")){
			return LINE_COMMENT;
		}
		System.out.println(line);
		throw new InvalidLineTypeExeption();
	}
	
	
	public String getSValue(String s) throws ParseAssignmentException{
		String[] s1 = s.split("'");
		if(s1.length==3){
			return s1[1];
		}
		throw new ParseAssignmentException();
	}
	public int getIValue(String s) throws ParseAssignmentException{
		try{
			return Integer.valueOf(s);
		}
		catch(NumberFormatException e){
			throw new ParseAssignmentException();
		}
	}
	public long getLValue(String s) throws ParseAssignmentException{
		if(s.endsWith("L")){
			try{
				return Long.valueOf(s.substring(0, s.length()-1));
			}
			catch(NumberFormatException e){
				throw new ParseAssignmentException();
			}
		}
		throw new ParseAssignmentException();
	}
	public float getFValue(String s) throws ParseAssignmentException{
		if(s.endsWith("f")){
			try{
				return Float.valueOf(s);
			}
			catch(NumberFormatException e){
				throw new ParseAssignmentException();
			}
		}
		throw new ParseAssignmentException();
	}
	public double getDValue(String s) throws ParseAssignmentException{
		try{
			return Double.valueOf(s);
		}
		catch(NumberFormatException e){
			throw new ParseAssignmentException();
		}
	}
	
	
	//Line Types
	public static final int LINE_ASSIGNMENT = 0;
	public static final int LINE_BLOCK = 1;
	public static final int LINE_BLOCK_TEXT_LENGTH = 2;
	public static final int LINE_BLOCK_END = 3;
	public static final int LINE_COMMENT = 4;
}
