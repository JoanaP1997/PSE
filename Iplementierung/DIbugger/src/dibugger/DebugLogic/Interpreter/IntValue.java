package dibugger.DebugLogic.Interpreter;

/**
 * 
 * @author Pascal
 *
 */
public class IntValue extends TermValue{
	private int value; 
	public IntValue(int val) {
		this.value = val;
	}
	public Integer getValue(){
		return this.value;
	}
	
	@Override
	public TermValue add(TermValue operand) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public TermValue mult(TermValue operand) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public TermValue div(TermValue operand) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public TermValue modulo(TermValue operand) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public TermValue sub(TermValue operand) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean greaterEqual(TermValue operand) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean greaterThan(TermValue operand) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean lessEqual(TermValue operand) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean lessThan(TermValue operand) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean equal(TermValue operand) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public String toString() {
		return null;
	}
	
}
