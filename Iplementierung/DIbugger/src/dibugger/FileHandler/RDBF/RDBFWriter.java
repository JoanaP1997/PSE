package dibugger.FileHandler.RDBF;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

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
				writer.write(tab+"def_blockLen="+data.getValue().split("\n").length+"\n");
				writer.write(data.getValue()+"\n");
			}
		}
		for(RDBFBlock block : ad.getList_blocks()){
			writer.write(tab+block.getName()+"{\n");
			saveBlock(writer, block, tab+"\t");
			writer.write(tab+"}\n");
		}
	}
}
