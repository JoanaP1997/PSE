package dibugger.DebugLogic.Interpreter;

/**
 * 
 * @author Pascal
 *
 */
public class BooleanValue extends TermValue {
	private boolean value;
	
	public BooleanValue(boolean value) {
		this.value = value;
		setType(Type.BOOLEAN);
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
		if(operand.getType()==Type.BOOLEAN){
			return value == ((BooleanValue)operand).getValue();
		}
		return false;
	}

	@Override
	public boolean or(TermValue operand) {
		if(operand.getType()==Type.BOOLEAN){
			return value || ((BooleanValue) operand).getValue();
		}
		return false;
	}
	
	@Override
	public boolean and(TermValue operand) {
		if(operand.getType()==Type.BOOLEAN){
			return value && ((BooleanValue) operand).getValue();
		}
		return false;
	}
	
	@Override
	public boolean not() {
		return !value;
	}
	
	@Override
	public String toString() {
		return ""+this.value;
	}

	public boolean getValue(){
		return value;
	}
	
}
