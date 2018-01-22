package test.filehandler;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SplittableRandom;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

import dibugger.filehandler.exceptions.FileHandlerException;
import dibugger.filehandler.facade.ConfigurationFile;
import dibugger.filehandler.facade.LanguageFile;
import dibugger.filehandler.facade.PropertiesFile;
import dibugger.filehandler.rdbf.RDBFAdditions;
import dibugger.filehandler.rdbf.RDBFBlock;
import dibugger.filehandler.rdbf.RDBFDBReader;
import dibugger.filehandler.rdbf.RDBFDBWriter;
import dibugger.filehandler.rdbf.RDBFData;
import dibugger.filehandler.rdbf.RDBFFile;
import dibugger.filehandler.rdbf.RDBFPropReader;
import dibugger.filehandler.rdbf.RDBFPropWriter;
import dibugger.filehandler.rdbf.RDBFReader;
import dibugger.filehandler.rdbf.RDBFWriter;

public class FileHandlerTest {
	@Test
	public void testWrite() throws IOException{
		RDBFWriter writer = new RDBFWriter();
		RDBFFile f = new RDBFFile(new File("res/testing/test_out.txt"));
		SplittableRandom rand = new SplittableRandom();
		addRandomData(f, rand, 5);
		
		writer.saveRDBFFile(f);
	}
	@Test
	public void testRead() throws IOException, FileHandlerException{
		RDBFReader reader = new RDBFReader();
		
		RDBFFile f = reader.loadRDBFFile(new File("res/testing/config_test_out.rdbf"));
		System.out.println("-----File-----");
		for(RDBFData d : f.getList_data()){
			System.out.println(d.getName()+" "+d.getValue());
		}
		for(RDBFBlock b : f.getList_blocks()){
			sysoutBlock(b,"\t");
		}
	
	}
	
	@Test
	public void testProperties(){
		RDBFPropReader reader = new RDBFPropReader();
		PropertiesFile f = reader.loadProperties(PropertiesFile.DEFAULT_LOCATION);
		RDBFPropWriter writer = new RDBFPropWriter();
		writer.saveProperties(f);
	}
	
	@Test
	public void testRDBFConfig() throws FileHandlerException{
		RDBFDBWriter writer = new RDBFDBWriter();
		ConfigurationFile f = generateConfig(new File("res/testing/config_test_out.rdbf"));
		writer.saveConfigFile(f);
		RDBFDBReader reader = new RDBFDBReader();
		f = reader.loadConfigFile(f.getSystemFile());
	}
	
	@Test
	public void testRDBFLanguage() throws FileHandlerException{
		RDBFDBReader reader = new RDBFDBReader();
		LanguageFile f = reader.loadLanguageFile(new File("res/testing/lang_test_in.txt"));
	}
	
	private static void sysoutBlock(RDBFBlock block, String tab){
		System.out.println(tab+"-----"+block.getName()+"-----");
		for(RDBFData d : block.getList_data()){
			System.out.println(tab+d.getName()+" "+d.getValue());
		}
		for(RDBFBlock b : block.getList_blocks()){
			sysoutBlock(b, tab+"\t");
		}
	}
	
	private static void addRandomData(RDBFAdditions ad, SplittableRandom rand, int max){
		for(int i=0;i<rand.nextInt(2, 5);++i){
			String name = generateWord(rand);
			String value = generateValue(rand);
			ad.addData(new RDBFData(name, value));
		}
		for(int i=0;i< (max>0 ? rand.nextInt(1, 5) : 0);++i){
			String name = generateWord(rand);
			RDBFBlock b = new RDBFBlock(name);
			addRandomData(b, rand, max-1);
			ad.addBlock(b);
		}
	}
	private static String generateWord(SplittableRandom rand){
		StringBuilder s = new StringBuilder();
		for(int i=0;i<rand.nextInt(5, 9);++i){
			s.append((char)rand.nextInt('a', 'z'));
		}
		return s.toString();
	}
	private static String generateText(SplittableRandom rand){
		StringBuilder s = new StringBuilder();
		for(int i=0;i<rand.nextInt(9, 34);++i){
			s.append(generateWord(rand)).append(" ");
			if(rand.nextBoolean()){
				s.append("\n");
			}
		}
		return s.toString();
	}
	private static String generateNumber(SplittableRandom rand){
		StringBuilder s = new StringBuilder();
		for(int i=0;i<rand.nextInt(2, 5);++i){
			s.append(rand.nextInt('0', '9'));
		}
		return s.toString();
	}
	private static String generateValue(SplittableRandom rand){
		int type = rand.nextInt(6);
		if(type==RDBFData.DATA_STRING){
			return "'"+generateWord(rand)+"'";
		}
		else if(type==RDBFData.DATA_INT){
			return generateNumber(rand);
		}
		else if(type==RDBFData.DATA_LONG){
			return generateNumber(rand)+"L";
		}
		else if(type==RDBFData.DATA_FLOAT){
			return generateNumber(rand)+"."+generateNumber(rand)+"f";
		}
		else if(type==RDBFData.DATA_DOUBLE){
			return generateNumber(rand)+"."+generateNumber(rand);
		}
		else if(type==RDBFData.DATA_BOOLEAN){
			return ""+rand.nextBoolean();
		}
		return "";
	}
	
	private static ConfigurationFile generateConfig(File file){
		ConfigurationFile f = new ConfigurationFile(file);
		SplittableRandom rand = new SplittableRandom();
		
		for(int i=0;i<2;++i){
			f.getList_programText().add(generateText(rand));
			Map<String, String> input = new HashMap<String, String>();
			for(int j=0;j<rand.nextInt(5);++j){
				String val = generateValue(rand);
				input.put(generateWord(rand), (val.startsWith("'") ? val.substring(1, val.length()-1) : val));
			}
			f.getList_inputValues().add(input);
			f.getList_lastExecLine().add(0);
			f.getList_programStepSize().add(rand.nextInt(1, 5));
			List<String> insp = new ArrayList<String>();
			for(int j=0;j<rand.nextInt(5);++j){
				insp.add(generateWord(rand));
			}
			f.getList_varInspector().add(insp);
			List<Integer> bp = new ArrayList<Integer>();
			for(int j=0;j<rand.nextInt(5);++j){
				bp.add(Integer.parseInt(generateNumber(rand)));
			}
			f.getList_breakpoints().add(bp);
		}
		f.setNumPrograms(2);
		for(int i=0;i<rand.nextInt(4);++i){
			List<Integer> lb = new ArrayList<Integer>();
			List<Integer> le = new ArrayList<Integer>();
			for(int j=0;j<rand.nextInt(1,3);++j){
				lb.add(rand.nextInt(8*j,8+8*j));
				le.add(rand.nextInt(8+8*j,16+8*j));
			}
			f.addWatchExpressions(generateWord(rand), lb, le);
		}
		for(int i=0;i<rand.nextInt(4);++i){
			List<Integer> lb = new ArrayList<Integer>();
			List<Integer> le = new ArrayList<Integer>();
			for(int j=0;j<rand.nextInt(1,3);++j){
				lb.add(rand.nextInt(8*j,8+8*j));
				le.add(rand.nextInt(8+8*j,16+8*j));
			}
			f.addConditionalBreakpoint(generateWord(rand), lb, le);
		}
		
		return f;
	}
}
