package dibugger.DebugLogic.Interpreter;

public final class FloatValue implements TermValue {
	private float value;
	public FloatValue(float val) {
		this.value = val;
	}
	@Override
	public TermValue add(TermValue operand) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String toString() {
		return ""+this.value;
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
	public boolean moreEqual(TermValue operand) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean more(TermValue operand) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean lessEqual(TermValue operand) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean less(TermValue operand) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equal(TermValue operand) {
		// TODO Auto-generated method stub
		return false;
	}

}
