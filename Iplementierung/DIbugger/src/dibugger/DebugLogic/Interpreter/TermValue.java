package dibugger.DebugLogic.Interpreter;
/**
 * Represents the Value of a Term (e.g. some Variable)
 * @author Benedikt, Pascal
 *
 */
public abstract class TermValue {
	private Type type;
	
	public abstract TermValue add(TermValue operand);
	public abstract TermValue mul(TermValue operand);
	public abstract TermValue div(TermValue operand);
	public abstract TermValue mod(TermValue operand);
	public abstract TermValue sub(TermValue operand);
//	public abstract TermValue or(TermValue operand);
//	public abstract TermValue and(TermValue operand);
//	public abstract TermValue not(TermValue operand);
	public abstract boolean greaterEqual(TermValue operand);
	public abstract boolean greaterThan(TermValue operand);
	public abstract boolean lessEqual(TermValue operand);
	public abstract boolean lessThan(TermValue operand);
	public abstract boolean equal(TermValue operand);
	public abstract boolean or(TermValue operand);
	public abstract boolean and(TermValue operand);
	public abstract boolean not();
	public abstract String toString();
	
	public Type getType(){
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
}
