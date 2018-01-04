package testing;

import java.io.File;
import java.io.IOException;
import java.util.SplittableRandom;

import org.junit.Test;
import static org.junit.Assert.*;

import dibugger.FileHandler.RDBF.RDBFAdditions;
import dibugger.FileHandler.RDBF.RDBFBlock;
import dibugger.FileHandler.RDBF.RDBFData;
import dibugger.FileHandler.RDBF.RDBFFile;
import dibugger.FileHandler.RDBF.RDBFReader;
import dibugger.FileHandler.RDBF.RDBFWriter;

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
	public void testRead() throws IOException{
		RDBFReader reader = new RDBFReader();
		
		RDBFFile f = reader.loadRDBFFile(new File("res/testing/test.txt"));
		System.out.println("-----File-----");
		for(RDBFData d : f.getList_data()){
			System.out.println(d.getName()+" "+d.getValue());
		}
		for(RDBFBlock b : f.getList_blocks()){
			sysoutBlock(b);
		}
	
	}
	
	private static void sysoutBlock(RDBFBlock block){
		System.out.println("-----"+block.getName()+"-----");
		for(RDBFData d : block.getList_data()){
			System.out.println(d.getName()+" "+d.getValue());
		}
		for(RDBFBlock b : block.getList_blocks()){
			sysoutBlock(b);
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
}
