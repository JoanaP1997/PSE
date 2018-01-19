package dibugger.debuglogic.interpreter;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.IncompatibleTypeException;

/**
 * 
 * @author Pascal
 *
 */
public final class FloatValue extends TermValue {
	
	private float value;
	
	public FloatValue(float val) {
		super(Type.FLOAT);
		this.value = val;
	}
	@Override
	public TermValue add(TermValue operand) throws DIbuggerLogicException {	
		if(operand.getType()==Type.FLOAT){
			return new FloatValue(value+((FloatValue)operand).getValue());
		}
		else if(operand.getType()==Type.DOUBLE){
			return new DoubleValue(value+((DoubleValue)operand).getValue());
		}
		else if(operand.getType()==Type.INT){
			return new FloatValue(value+((IntValue)operand).getValue());
		}
		else if(operand.getType()==Type.LONG){
			return new DoubleValue(value+((LongValue)operand).getValue());
		}
		else if(operand.getType()==Type.CHAR){
			return new FloatValue(value+((CharValue)operand).getValue());
		}
		throw new IncompatibleTypeException("db_it_exc_add");
	}
	@Override
	public TermValue mul(TermValue operand) throws DIbuggerLogicException {
		if(operand.getType()==Type.FLOAT){
			return new FloatValue(value*((FloatValue)operand).getValue());
		}
		else if(operand.getType()==Type.DOUBLE){
			return new DoubleValue(value*((DoubleValue)operand).getValue());
		}
		else if(operand.getType()==Type.INT){
			return new FloatValue(value*((IntValue)operand).getValue());
		}
		else if(operand.getType()==Type.LONG){
			return new DoubleValue(value*((LongValue)operand).getValue());
		}
		else if(operand.getType()==Type.CHAR){
			return new FloatValue(value*((CharValue)operand).getValue());
		}
		throw new IncompatibleTypeException("db_it_exc_mul");
	}

	@Override
	public TermValue div(TermValue operand) throws DIbuggerLogicException {
		if(operand.getType()==Type.FLOAT){
			return new FloatValue(value/((FloatValue)operand).getValue());
		}
		else if(operand.getType()==Type.DOUBLE){
			return new DoubleValue(value/((DoubleValue)operand).getValue());
		}
		else if(operand.getType()==Type.INT){
			return new FloatValue(value/((IntValue)operand).getValue());
		}
		else if(operand.getType()==Type.LONG){
			return new DoubleValue(value/((LongValue)operand).getValue());
		}
		else if(operand.getType()==Type.CHAR){
			return new FloatValue(value/((CharValue)operand).getValue());
		}
		throw new IncompatibleTypeException("db_it_exc_div");
	}

	@Override
	public TermValue mod(TermValue operand) throws DIbuggerLogicException {
		if(operand.getType()==Type.FLOAT){
			return new FloatValue(value%((FloatValue)operand).getValue());
		}
		else if(operand.getType()==Type.DOUBLE){
			return new DoubleValue(value%((DoubleValue)operand).getValue());
		}
		else if(operand.getType()==Type.INT){
			return new FloatValue(value%((IntValue)operand).getValue());
		}
		else if(operand.getType()==Type.LONG){
			return new DoubleValue(value%((LongValue)operand).getValue());
		}
		else if(operand.getType()==Type.CHAR){
			return new FloatValue(value%((CharValue)operand).getValue());
		}
		throw new IncompatibleTypeException("db_it_exc_mod");
	}

	@Override
	public TermValue sub(TermValue operand) throws DIbuggerLogicException {
		if(operand.getType()==Type.FLOAT){
			return new FloatValue(value-((FloatValue)operand).getValue());
		}
		else if(operand.getType()==Type.DOUBLE){
			return new DoubleValue(value-((DoubleValue)operand).getValue());
		}
		else if(operand.getType()==Type.INT){
			return new FloatValue(value-((IntValue)operand).getValue());
		}
		else if(operand.getType()==Type.LONG){
			return new DoubleValue(value-((LongValue)operand).getValue());
		}
		else if(operand.getType()==Type.CHAR){
			return new FloatValue(value-((CharValue)operand).getValue());
		}
		throw new IncompatibleTypeException("db_it_exc_sub");
	}
	
	@Override
	public boolean greaterEqual(TermValue operand) throws DIbuggerLogicException {
		if(operand.getType()==Type.FLOAT){
			return value>=((FloatValue)operand).getValue();
		}
		else if(operand.getType()==Type.DOUBLE){
			return value>=((DoubleValue)operand).getValue();
		}
		else if(operand.getType()==Type.INT){
			return value>=((IntValue)operand).getValue();
		}
		else if(operand.getType()==Type.LONG){
			return value>=((LongValue)operand).getValue();
		}
		else if(operand.getType()==Type.CHAR){
			return value>=((CharValue)operand).getValue();
		}
		throw new IncompatibleTypeException("db_it_exc_ge");
	}

	@Override
	public boolean greaterThan(TermValue operand) throws DIbuggerLogicException {
		if(operand.getType()==Type.FLOAT){
			return value>((FloatValue)operand).getValue();
		}
		else if(operand.getType()==Type.DOUBLE){
			return value>((DoubleValue)operand).getValue();
		}
		else if(operand.getType()==Type.INT){
			return value>((IntValue)operand).getValue();
		}
		else if(operand.getType()==Type.LONG){
			return value>((LongValue)operand).getValue();
		}
		else if(operand.getType()==Type.CHAR){
			return value>((CharValue)operand).getValue();
		}
		throw new IncompatibleTypeException("db_it_exc_gt");
	}

	@Override
	public boolean lessEqual(TermValue operand) throws DIbuggerLogicException {
		if(operand.getType()==Type.FLOAT){
			return value<=((FloatValue)operand).getValue();
		}
		else if(operand.getType()==Type.DOUBLE){
			return value<=((DoubleValue)operand).getValue();
		}
		else if(operand.getType()==Type.INT){
			return value<=((IntValue)operand).getValue();
		}
		else if(operand.getType()==Type.LONG){
			return value<=((LongValue)operand).getValue();
		}
		else if(operand.getType()==Type.CHAR){
			return value<=((CharValue)operand).getValue();
		}
		throw new IncompatibleTypeException("db_it_exc_le");
	}

	@Override
	public boolean lessThan(TermValue operand) throws DIbuggerLogicException {
		if(operand.getType()==Type.FLOAT){
			return value<((FloatValue)operand).getValue();
		}
		else if(operand.getType()==Type.DOUBLE){
			return value<((DoubleValue)operand).getValue();
		}
		else if(operand.getType()==Type.INT){
			return value<((IntValue)operand).getValue();
		}
		else if(operand.getType()==Type.LONG){
			return value<((LongValue)operand).getValue();
		}
		else if(operand.getType()==Type.CHAR){
			return value<((CharValue)operand).getValue();
		}
		throw new IncompatibleTypeException("db_it_exc_lt");
	}

	@Override
	public boolean equal(TermValue operand) throws DIbuggerLogicException {
		if(operand.getType()==Type.FLOAT){
			return value==((FloatValue)operand).getValue();
		}
		else if(operand.getType()==Type.DOUBLE){
			return value==((DoubleValue)operand).getValue();
		}
		else if(operand.getType()==Type.INT){
			return value==((IntValue)operand).getValue();
		}
		else if(operand.getType()==Type.LONG){
			return value==((LongValue)operand).getValue();
		}
		else if(operand.getType()==Type.CHAR){
			return value==((CharValue)operand).getValue();
		}
		throw new IncompatibleTypeException("db_it_exc_eq");
	}
	
	@Override
	public boolean or(TermValue operand) throws DIbuggerLogicException {
		throw new IncompatibleTypeException("db_it_exc_or");
	}
	
	@Override
	public boolean and(TermValue operand) throws DIbuggerLogicException {
		throw new IncompatibleTypeException("db_it_exc_and");
	}
	
	@Override
	public boolean not() throws DIbuggerLogicException {
		throw new IncompatibleTypeException("db_it_exc_not");
	}
	
	@Override
	public String toString() {
		return ""+this.value;
	}
	
	public float getValue() {
		return value;
	}
	
}
