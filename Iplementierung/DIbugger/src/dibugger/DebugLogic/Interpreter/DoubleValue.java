package dibugger.DebugLogic.Interpreter;
/**
 * 
 * @author pascal
 *
 */
public class DoubleValue extends TermValue {

	private double value;
	
	public DoubleValue(double value) {
		this.value = value;
		setType(Type.DOUBLE);
	}

	@Override
	public TermValue add(TermValue operand) {
		//TODO throw exception
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
		// TODO Auto-generated method stub
		return null;
	}

	public double getValue() {
		return value;
	}
	
}