package test.filehandler;

import org.junit.Test;

import dibugger.filehandler.exceptions.FileHandlerException;
import dibugger.filehandler.exceptions.InvalidLineTypeExeption;
import dibugger.filehandler.exceptions.ParseAssignmentException;
import dibugger.filehandler.exceptions.ParseBlockException;
import dibugger.filehandler.facade.ConfigurationFile;
import dibugger.filehandler.facade.LanguageFile;
import dibugger.filehandler.facade.PropertiesFile;
import dibugger.filehandler.rdbf.RDBFBlock;
import dibugger.filehandler.rdbf.RDBFDBReader;
import dibugger.filehandler.rdbf.RDBFDBWriter;
import dibugger.filehandler.rdbf.RDBFData;
import dibugger.filehandler.rdbf.RDBFFile;
import dibugger.filehandler.rdbf.RDBFParser;
import dibugger.filehandler.rdbf.RDBFPropReader;
import dibugger.filehandler.rdbf.RDBFPropWriter;
import dibugger.filehandler.rdbf.RDBFReader;

import static org.junit.Assert.*;
import static test.filehandler.FileHandlerTestUtilities.*;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.SplittableRandom;

public class RDBFTest {
	
	SplittableRandom rand = new SplittableRandom();
	final int LOOP_SAMPLES = 128;
	
	@Test
	public void test_RDBFData() throws ParseAssignmentException{
		for(int i=0;i<LOOP_SAMPLES;++i){
			String name = generateWord(rand);
			String value = generateValue(rand);
			boolean isText = rand.nextBoolean();
			RDBFData id = new RDBFData(name, value, isText);
			
			assertEquals(name, id.getName());
			assertEquals(value, id.getValue());	
			assertEquals(isText ? RDBFData.DATA_TEXT : RDBFParser.getInstance().getDataType(name+"="+value), id.getDataType());
			
			name = generateWord(rand);
			value = generateValue(rand);
			
			id.setName(name);
			id.setValue(value);
			
			assertEquals(name, id.getName());
			assertEquals(value, id.getValue());	
			assertNotEquals(RDBFData.DATA_TEXT, id.getDataType());
		}
	}

	@Test
	public void test_RDBFBlock(){
		for(int i=0;i<LOOP_SAMPLES;++i){
			RDBFBlock base = new RDBFBlock("BASE");

			String name = generateWord(rand);
			RDBFBlock block = new RDBFBlock(name);
			String name1 = generateWord(rand);
			String value = generateValue(rand);
			RDBFData data = new RDBFData(name1, value);
			
			block.addData(data);
			
			base.addBlock(block);
			
			assertEquals(1, base.getList_blocks().size());
			assertEquals(1, base.getBlocksByName(name).size());
			assertEquals(block, base.getFirstBlockByName(name));
			assertEquals("BASE", base.getName());
			
			assertEquals(0, block.getList_blocks().size());
			assertEquals(1, block.getList_data().size());
			assertEquals(name, block.getName());
			RDBFData data_new = block.getFirstDataByName(name1);
			assertEquals(value, data_new.getValue());
		}
	}
	
	@Test
	public void test_RDBFParser() throws ParseBlockException, ParseAssignmentException, InvalidLineTypeExeption{
		RDBFParser parser = RDBFParser.getInstance();
		for(int i=0;i<LOOP_SAMPLES;++i){
			//getBlockName
			String block_name = generateWord(rand);
			String line = block_name+"{";
			
			assertEquals(block_name, parser.getBlockName(line));
			
			//getDataType
			Number val = rand.nextInt();
			line = "value="+val;
			assertEquals(RDBFData.DATA_INT, parser.getDataType(line));
			val = rand.nextLong();
			line = "value="+val+"L";
			assertEquals(RDBFData.DATA_LONG, parser.getDataType(line));
			val = (float)(rand.nextDouble()*(Float.MAX_VALUE-Float.MIN_VALUE)+Float.MIN_VALUE);
			line = "value="+val+"f";
			assertEquals(RDBFData.DATA_FLOAT, parser.getDataType(line));
			val = rand.nextDouble()*(Double.MAX_VALUE-Double.MIN_VALUE)+Double.MIN_VALUE;
			line = "value="+val;
			assertEquals(RDBFData.DATA_DOUBLE, parser.getDataType(line));
			boolean b = rand.nextBoolean();
			line = "value="+b;
			assertEquals(RDBFData.DATA_BOOLEAN, parser.getDataType(line));
			String s = generateWord(rand);
			line = "value='"+s+"'";
			assertEquals(RDBFData.DATA_STRING, parser.getDataType(line));
			
			//getVariableName
			String varName = generateWord(rand);
			assertEquals(varName, parser.getVariableName(varName+"=0"));
			
			//getValue
			String value = generateWord(rand)+" "+generateWord(rand);
			assertEquals("'"+value+"'", parser.getValue("value='"+value+"'"));
			
			//evaluateLineType
			line = generateWord(rand)+"{";
			assertEquals(RDBFParser.LINE_BLOCK, parser.evaluateLineType(line));
			line = "def_blockLen="+rand.nextInt(0, 1024);
			assertEquals(RDBFParser.LINE_BLOCK_TEXT_LENGTH, parser.evaluateLineType(line));
			line = generateWord(rand)+"="+generateNumber(rand);
			assertEquals(RDBFParser.LINE_ASSIGNMENT, parser.evaluateLineType(line));
			line = "}";
			assertEquals(RDBFParser.LINE_BLOCK_END, parser.evaluateLineType(line));
			line = "//"+generateWord(rand)+" "+generateWord(rand);
			assertEquals(RDBFParser.LINE_COMMENT, parser.evaluateLineType(line));
			line = "";
			assertEquals(RDBFParser.LINE_EMPTY, parser.evaluateLineType(line));
			
			//getValues
			s = generateWord(rand)+" "+generateWord(rand);
			assertEquals(s, parser.getSValue("'"+s+"'"));
			val = rand.nextInt();
			assertEquals(val, parser.getIValue(val.toString()));
			val = rand.nextLong();
			assertEquals(val, parser.getLValue(val.toString()+"L"));
			val = (float)(rand.nextDouble()*(Float.MAX_VALUE-Float.MIN_VALUE)+Float.MIN_VALUE);
			assertEquals(val, parser.getFValue(val.toString()+"f"));
			val = rand.nextDouble()*(Double.MAX_VALUE-Double.MIN_VALUE)+Double.MIN_VALUE;
			assertEquals(val, parser.getDValue(val.toString()));
			assertEquals(b, parser.getBValue(""+b));
		}
	}
	
	@Test
	public void test_RDBFPropReader(){
		File f = new File("res/testing/prop_test.cfg");
		RDBFPropReader reader = new RDBFPropReader();
		PropertiesFile p = reader.loadProperties(f);
		
		assertEquals(100, p.getMaxFunctionCalls());
		assertEquals("res/helloWorld.rdbf", p.getConfigFile());
		assertEquals(100, p.getMaxWhileIterations());
		assertEquals("english", p.getSelectedLanguage());
	}
	
	@Test
	public void test_RDBFPropWriter() throws IOException{
		RDBFPropWriter writer = new RDBFPropWriter();
		PropertiesFile p = new PropertiesFile();
		PropertiesFile.DEFAULT_LOCATION = new File("res/testing/prop_test_out.cfg");
		p.setMaxFunctionCalls(100);
		p.setMaxWhileIterations(100);
		p.setSelectedLanguage("german");
		p.setConfigFile("res/helloWorld.rdbf");
		
		writer.saveProperties(p);
		
		String data = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\r\n"
				+ "<!DOCTYPE properties SYSTEM \"http://java.sun.com/dtd/properties.dtd\">\r\n"
				+ "<properties>\r\n"
				+ "<entry key=\"maxFuncCalls\">100</entry>\r\n"
				+ "<entry key=\"configFileLoc\">res/helloWorld.rdbf</entry>\r\n"
				+ "<entry key=\"maxWhileIterations\">100</entry>\r\n"
				+ "<entry key=\"language\">german</entry>\r\n"
				+ "</properties>\r\n";
		byte[] b = Files.readAllBytes(Paths.get(PropertiesFile.DEFAULT_LOCATION.toURI()));
		String file = new String(b, "UTF-8");
		
//		assertEquals(data, file);//TODO ignore on linux
	}
	
	@Test
	public void test_RDBFReader() throws IOException, FileHandlerException{
		RDBFFile f = new RDBFReader().loadRDBFFile(new File("res/testing/rdbf_reader_test.rdbf"));
		RDBFBlock block = f.getList_blocks().get(0);
		
		assertEquals("A_BLOCK", block.getName());
		assertEquals("value", block.getList_data().get(0).getName());
		assertEquals("5", block.getList_data().get(0).getValue());
		assertEquals("7f", block.getList_data().get(1).getValue());
		assertEquals("INNER_BLOCK", block.getList_blocks().get(0).getName());
		assertEquals("'something great is happening'", block.getList_blocks().get(0).getList_data().get(0).getValue());
		
		block = f.getList_blocks().get(1);
		assertEquals(RDBFData.DATA_TEXT, block.getList_data().get(0).getDataType());
		assertEquals("Hello World,\ntoday is a great day.\nI'm done...", block.getList_data().get(0).getValue());
	}
	

	@Test
	public void test_RDBFDBReader() throws FileHandlerException{
		RDBFDBReader reader = new RDBFDBReader();
		ConfigurationFile f = reader.loadConfigFile(new File("res/testing/test_config.rdbf"));
		assertEquals(1,f.getStepSize(0));
		assertEquals("A",f.getProgramNameID(0));
		assertEquals(5,f.getLatestExecutionLine(0));
		assertEquals("n",f.getInputValueIdentifiers(0).get(0));
		assertEquals("5",f.getInputValue(0, "n"));
		String programText = "//factorial programmed in an iterative manner\n"
				+ "int main(int n){\n"
				+ "\tint i = 1;\n"
				+ "\tint sum = 1;\n"
				+ "\twhile(i<=n) {\n"
				+ "\t\tsum = sum * i;\n"
				+ "\t\ti = i + 1;\n"
				+ "\t}\n"
				+ "\treturn sum;\n"
				+ "}";
		assertEquals(programText,f.getProgramText(0));
		assertEquals("5 == 5", f.getWatchExpressions().get(0));
		assertEquals(1, (int)f.getWEScopeBegin(0).get(0));
		assertEquals(10, (int)f.getWEScopeEnd(0).get(0));
		
		LanguageFile l = reader.loadLanguageFile(new File("res/lang/testLang.rdbf"));
		assertEquals("testLang", l.getLangID());
		assertEquals("Testing Language", l.getName());
		assertEquals("Thats a test", l.getTranslation("test"));
	}
	
	@Test
	public void test_RDBFDBWriter(){
		ConfigurationFile f = new ConfigurationFile(new File("res/testing/test_config_out.rdbf"));
		f.setStepSize(0, 1);
		f.setProgramNameID(0, "AX");
		f.setLastExecutionLine(0, 7);
		String programText = "//factorial programmed in an iterative manner\n"
				+ "int main(int n){\n"
				+ "\tint i = 1;\n"
				+ "\tint sum = 1;\n"
				+ "\twhile(i<=n) {\n"
				+ "\t\tsum = sum * i;\n"
				+ "\t\ti = i + 1;\n"
				+ "\t}\n"
				+ "\treturn sum;\n"
				+ "}";
		f.setProgramText(0, programText);
		f.setInputValue(0, "n", "37");
		f.addWatchExpressions("A.x == 3", Arrays.asList(1), Arrays.asList(5));
		f.setBreakpoints(0, Arrays.asList(2,4));
		f.setNumPrograms(1);
		f.setVariablesOfInspector(0, new ArrayList<String>());
		
		RDBFDBWriter writer = new RDBFDBWriter();
		writer.saveConfigFile(f);		
		
		//lang
		LanguageFile l = new LanguageFile("testLang", "Testing Language");
		l.putTranslation("test", "Thats a test");
		writer.saveLanguageFile(l);
	}
}
