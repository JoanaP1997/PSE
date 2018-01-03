package dibugger.FileHandler.RDBF;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import dibugger.FileHandler.Exceptions.FileHandlerException;

public class RDBFReader {
	
	public RDBFFile loadRDBFFile(File file) throws IOException{
		if(!file.exists()){
			throw new IOException();
		}
		RDBFFile f = new RDBFFile(file);
		BufferedReader reader = new BufferedReader(new FileReader(file));
		try {
			readBlock(reader, f);
		} catch (FileHandlerException e) {
			//TODO something
			//e.printStackTrace();
		}
		reader.close();
		return f;
	}
	
	private void readBlock(BufferedReader reader, RDBFAdditions ad) throws FileHandlerException, IOException{
		String line;
		while((line = reader.readLine())!=null){
			line = line.replace("\t", "");
			int lineType = RDBFParser.getInstance().evaluateLineType(line);
			if(lineType==RDBFParser.LINE_ASSIGNMENT){
				String name = RDBFParser.getInstance().getVariableName(line);
				String value = RDBFParser.getInstance().getValue(line);
				ad.addData(new RDBFData(name, value));
			}
			else if(lineType==RDBFParser.LINE_BLOCK){
				String name = RDBFParser.getInstance().getBlockName(line);
				RDBFBlock block = new RDBFBlock(name);
				ad.addBlock(block);
				readBlock(reader, block);
			}
			else if(lineType==RDBFParser.LINE_BLOCK_TEXT_LENGTH){
				int len = RDBFParser.getInstance().getIValue(RDBFParser.getInstance().getValue(line));
				String text = readTextBlock(reader, ad, len);
				ad.addData(new RDBFData("text", text, true));
			}
			else if(lineType==RDBFParser.LINE_BLOCK_END){
				return;
			}
		}
	}
	private String readTextBlock(BufferedReader reader, RDBFAdditions block, int len) throws IOException{
		String line;
		StringBuilder text = new StringBuilder();
		int i=0;
		while(i<len && (line = reader.readLine())!=null){
			text.append(line+"\n");
			++i;
		}
		return text.toString();
	}
	
	
	
	
	public static void main(String[] args){
		RDBFReader reader = new RDBFReader();
		try {
			RDBFFile f = reader.loadRDBFFile(new File("res/testing/test.txt"));
			System.out.println("-----File-----");
			for(RDBFData d : f.getList_data()){
				System.out.println(d.getName()+" "+d.getValue());
			}
			for(RDBFBlock b : f.getList_blocks()){
				sysoutBlock(b);
			}
		} catch (IOException e) {
			e.printStackTrace();
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
	
}
