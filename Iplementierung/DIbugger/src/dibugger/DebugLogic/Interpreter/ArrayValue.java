package dibugger.DebugLogic.Interpreter;

public class ArrayValue extends TermValue{

	private TermValue[][][] value;
	
	public ArrayValue(TermValue[][][] value) {
		this.value = value;
		setType(Type.ARRAY);
	}

	@Override
	public TermValue add(TermValue operand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TermValue mul(TermValue operand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TermValue div(TermValue operand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TermValue mod(TermValue operand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TermValue sub(TermValue operand) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public TermValue or(TermValue operand) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public TermValue and(TermValue operand) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public TermValue not(TermValue operand) {
//		// TODO Auto-generated method stub
//		return null;
//	}

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
	public boolean or(TermValue operand) {
		return false;
	}
	
	@Override
	public boolean and(TermValue operand) {
		return false;
	}
	
	@Override
	public boolean not() {
		return false;
	}
	
	@Override
	public String toString() {
		return null;
	}
	
	public TermValue[][][] getValue() {
		return value;
	}

}
