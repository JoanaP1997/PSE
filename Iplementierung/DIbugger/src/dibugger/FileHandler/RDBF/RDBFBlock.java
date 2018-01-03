package dibugger.FileHandler.RDBF;

public class RDBFBlock extends RDBFAdditions{
	
	private String name;

	public RDBFBlock(String blockname) {
		super();
		this.name = blockname;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
