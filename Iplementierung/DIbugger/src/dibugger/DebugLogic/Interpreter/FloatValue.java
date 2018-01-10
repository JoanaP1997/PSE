package dibugger.DebugLogic.Interpreter;

/**
 * 
 * @author Pascal
 *
 */
public final class FloatValue extends TermValue {
	private float value;
	public FloatValue(float val) {
		this.value = val;
		setType(Type.FLOAT);
	}
	@Override
	public TermValue add(TermValue operand) {	
		if(operand.getType()==Type.FLOAT){
			return new FloatValue((float)value+((FloatValue)operand).getValue());
		}
		else if(operand.getType()==Type.DOUBLE){
			return new DoubleValue((float)value+((DoubleValue)operand).getValue());
		}
		else if(operand.getType()==Type.INT){
			return new FloatValue((float)value+((IntValue)operand).getValue());
		}
		else if(operand.getType()==Type.LONG){
			return new DoubleValue((float)value+((LongValue)operand).getValue());
		}
		//TODO throw exception
		return null;
	}
	@Override
	public TermValue mult(TermValue operand) {
		if(operand.getType()==Type.FLOAT){
			return new FloatValue((float)value*((FloatValue)operand).getValue());
		}
		else if(operand.getType()==Type.DOUBLE){
			return new DoubleValue((float)value*((DoubleValue)operand).getValue());
		}
		else if(operand.getType()==Type.INT){
			return new FloatValue((float)value*((IntValue)operand).getValue());
		}
		else if(operand.getType()==Type.LONG){
			return new DoubleValue((float)value*((LongValue)operand).getValue());
		}
		return null;
	}

	@Override
	public TermValue div(TermValue operand) {
		if(operand.getType()==Type.FLOAT){
			return new FloatValue((float)value/((FloatValue)operand).getValue());
		}
		else if(operand.getType()==Type.DOUBLE){
			return new DoubleValue((float)value/((DoubleValue)operand).getValue());
		}
		else if(operand.getType()==Type.INT){
			return new FloatValue((float)value/((IntValue)operand).getValue());
		}
		else if(operand.getType()==Type.LONG){
			return new DoubleValue((float)value/((LongValue)operand).getValue());
		}
		return null;
	}

	@Override
	public TermValue modulo(TermValue operand) {
		if(operand.getType()==Type.FLOAT){
			return new FloatValue((float)value%((FloatValue)operand).getValue());
		}
		else if(operand.getType()==Type.DOUBLE){
			return new DoubleValue((float)value%((DoubleValue)operand).getValue());
		}
		else if(operand.getType()==Type.INT){
			return new FloatValue((float)value%((IntValue)operand).getValue());
		}
		else if(operand.getType()==Type.LONG){
			return new DoubleValue((float)value%((LongValue)operand).getValue());
		}
		return null;
	}

	@Override
	public TermValue sub(TermValue operand) {
		if(operand.getType()==Type.FLOAT){
			return new FloatValue((float)value-((FloatValue)operand).getValue());
		}
		else if(operand.getType()==Type.DOUBLE){
			return new DoubleValue((float)value-((DoubleValue)operand).getValue());
		}
		else if(operand.getType()==Type.INT){
			return new FloatValue((float)value-((IntValue)operand).getValue());
		}
		else if(operand.getType()==Type.LONG){
			return new DoubleValue((float)value-((LongValue)operand).getValue());
		}
		return null;
	}

	@Override
	public boolean greaterEqual(TermValue operand) {
		if(operand.getType()==Type.FLOAT){
			return (float)value>=((FloatValue)operand).getValue();
		}
		else if(operand.getType()==Type.DOUBLE){
			return (float)value>=((DoubleValue)operand).getValue();
		}
		else if(operand.getType()==Type.INT){
			return (float)value>=((IntValue)operand).getValue();
		}
		else if(operand.getType()==Type.LONG){
			return (float)value>=((LongValue)operand).getValue();
		}
		return false;
	}

	@Override
	public boolean greaterThan(TermValue operand) {
		if(operand.getType()==Type.FLOAT){
			return (float)value>((FloatValue)operand).getValue();
		}
		else if(operand.getType()==Type.DOUBLE){
			return (float)value>((DoubleValue)operand).getValue();
		}
		else if(operand.getType()==Type.INT){
			return (float)value>((IntValue)operand).getValue();
		}
		else if(operand.getType()==Type.LONG){
			return (float)value>((LongValue)operand).getValue();
		}
		return false;
	}

	@Override
	public boolean lessEqual(TermValue operand) {
		if(operand.getType()==Type.FLOAT){
			return (float)value<=((FloatValue)operand).getValue();
		}
		else if(operand.getType()==Type.DOUBLE){
			return (float)value<=((DoubleValue)operand).getValue();
		}
		else if(operand.getType()==Type.INT){
			return (float)value<=((IntValue)operand).getValue();
		}
		else if(operand.getType()==Type.LONG){
			return (float)value<=((LongValue)operand).getValue();
		}
		return false;
	}

	@Override
	public boolean lessThan(TermValue operand) {
		if(operand.getType()==Type.FLOAT){
			return (float)value<((FloatValue)operand).getValue();
		}
		else if(operand.getType()==Type.DOUBLE){
			return (float)value<((DoubleValue)operand).getValue();
		}
		else if(operand.getType()==Type.INT){
			return (float)value<((IntValue)operand).getValue();
		}
		else if(operand.getType()==Type.LONG){
			return (float)value<((LongValue)operand).getValue();
		}
		return false;
	}

	@Override
	public boolean equal(TermValue operand) {
		if(operand.getType()==Type.FLOAT){
			return (float)value==((FloatValue)operand).getValue();
		}
		else if(operand.getType()==Type.DOUBLE){
			return (float)value==((DoubleValue)operand).getValue();
		}
		else if(operand.getType()==Type.INT){
			return (float)value==((IntValue)operand).getValue();
		}
		else if(operand.getType()==Type.LONG){
			return (float)value==((LongValue)operand).getValue();
		}
		return false;
	}
	
	@Override
	public String toString() {
		return ""+this.value;
	}
	
	public float getValue() {
		return value;
	}
	
}
