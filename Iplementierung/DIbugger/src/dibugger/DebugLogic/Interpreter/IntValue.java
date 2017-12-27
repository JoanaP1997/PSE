package dibugger.DebugLogic.Interpreter;

public class IntValue implements TermValue{
	private int value; 
	public IntValue(int val) {
		this.value = val;
	}
	public Integer getValue(){
		return this.value;
	}
	@Override
	public String toString() {
		return ""+this.value;
	}
	@Override
	public TermValue add(TermValue operand) {
		if(operand instanceof IntValue) {
			return new IntValue(this.value+((IntValue)operand).getValue());
		}
		return null;
	}
	@Override
	public TermValue mult(TermValue operand) {
		if(operand instanceof IntValue) {
			return new IntValue(this.value*((IntValue)operand).getValue());
		}
		return null;
	}
	@Override
	public TermValue div(TermValue operand) {
		if(operand instanceof IntValue) {
			return new IntValue(this.value*((IntValue)operand).getValue());
		}
		return null;
	}
	@Override
	public TermValue sub(TermValue operand) {
		if(operand instanceof IntValue) {
			return new IntValue(this.value-((IntValue)operand).getValue());
		}
		return null;
	}
	@Override
	public TermValue modulo(TermValue operand) {
		if(operand instanceof IntValue) {
			return new IntValue(this.value%((IntValue)operand).getValue());
		}
		return null;
	}
	@Override
	public boolean moreEqual(TermValue operand) {
		if(operand instanceof IntValue) {
			return (this.value>=((IntValue)operand).getValue());
		}
		return false;
	}
	@Override
	public boolean more(TermValue operand) {
		if(operand instanceof IntValue) {
			return (this.value>((IntValue)operand).getValue());
		}
		return false;
	}
	@Override
	public boolean lessEqual(TermValue operand) {
		if(operand instanceof IntValue) {
			return (this.value<=((IntValue)operand).getValue());
		}
		return false;
	}
	@Override
	public boolean less(TermValue operand) {
		if(operand instanceof IntValue) {
			return (this.value<((IntValue)operand).getValue());
		}
		return false;
	}
	@Override
	public boolean equal(TermValue operand) {
		if(operand instanceof IntValue) {
			return (this.value==((IntValue)operand).getValue());
		}
		return false;
	}
}
