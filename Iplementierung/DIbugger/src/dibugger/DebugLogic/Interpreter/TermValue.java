package dibugger.DebugLogic.Interpreter;
/**
 * Represents the Value of a Term (e.g. some Variable)
 * @author wagner
 *
 */
public abstract class TermValue {
	private Type type;
	
	public abstract TermValue add(TermValue operand);
	public abstract TermValue mult(TermValue operand);
	public abstract TermValue div(TermValue operand);
	public abstract TermValue modulo(TermValue operand);
	public abstract TermValue sub(TermValue operand);
	public abstract boolean greaterEqual(TermValue operand);
	public abstract boolean greaterThan(TermValue operand);
	public abstract boolean lessEqual(TermValue operand);
	public abstract boolean lessThan(TermValue operand);
	public abstract boolean equal(TermValue operand);
	public abstract String toString();
	
	public Type getType(){
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
}
