package dibugger.FileHandler.RDBF;

import java.util.ArrayList;
import java.util.List;

public abstract class RDBFAdditions {
	
	private List<RDBFBlock> list_blocks;
	private List<RDBFData> list_data;
	
	public RDBFAdditions(){
		list_blocks = new ArrayList<RDBFBlock>();
		list_data = new ArrayList<RDBFData>();
	}

	public List<RDBFBlock> getList_blocks() {
		return list_blocks;
	}
	public void addBlock(RDBFBlock data){
		list_blocks.add(data);
	}
	public List<RDBFBlock> getBlocksByName(String identifier){
		List<RDBFBlock> l = new ArrayList<RDBFBlock>();
		for(int i=0;i<list_blocks.size();++i){
			RDBFBlock b = list_blocks.get(i);
			if(b.getName().equals(identifier)){
				l.add(b);
			}
		}
		return l;
	}
	public RDBFBlock getFirstBlockByName(String identifier){
		for(int i=0;i<list_blocks.size();++i){
			RDBFBlock b = list_blocks.get(i);
			if(b.getName().equals(identifier)){
				return b;
			}
		}
		return null;
	}
	
	
	public List<RDBFData> getList_data() {
		return list_data;
	}
	public void addData(RDBFData data){
		list_data.add(data);
	}
	public List<RDBFData> getDataByName(String identifier){
		List<RDBFData> l = new ArrayList<RDBFData>();
		for(int i=0;i<list_data.size();++i){
			RDBFData d = list_data.get(i);
			if(d.getName().equals(identifier)){
				l.add(d);
			}
		}
		return l;
	}
	public RDBFData getFirstDataByName(String identifier){
		for(int i=0;i<list_data.size();++i){
			RDBFData d = list_data.get(i);
			if(d.getName().equals(identifier)){
				return d;
			}
		}
		return null;
	}
	
}
