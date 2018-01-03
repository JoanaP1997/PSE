package dibugger.FileHandler.RDBF;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.SplittableRandom;

public class RDBFWriter {
	
	public void saveRDBFFile(RDBFFile f) throws IOException{
		if(f.getSysFile()==null){
			throw new FileNotFoundException();
		}
		BufferedWriter writer = new BufferedWriter(new FileWriter(f.getSysFile()));
		saveBlock(writer, f, "");
		writer.close();
	}
	private void saveBlock(BufferedWriter writer, RDBFAdditions ad, String tab) throws IOException{
		for(RDBFData data : ad.getList_data()){
			if(data.getDataType()!=RDBFData.DATA_TEXT){
				writer.write(tab+data.getName()+"="+data.getValue()+"\n");
			}
			else{
				writer.write("def_blockLen="+data.getValue().split("\n").length+"\n");
				writer.write(data.getValue());
			}
		}
		for(RDBFBlock block : ad.getList_blocks()){
			writer.write(tab+block.getName()+"{\n");
			saveBlock(writer, block, tab+"\t");
			writer.write(tab+"}\n");
		}
	}
	
	
	
	
	public static void main(String[] args){
		RDBFWriter writer = new RDBFWriter();
		RDBFFile f = new RDBFFile(new File("res/testing/test_out.txt"));
		SplittableRandom rand = new SplittableRandom();
		addRandomData(f, rand, 5);
		try {
			writer.saveRDBFFile(f);
		} catch (IOException e) {
			e.printStackTrace();
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
