package dibugger.DebugLogic.Interpreter;
/**
 * Represents the Value of a Term (e.g. some Variable)
 * @author wagner
 *
 */
public interface TermValue {
	public TermValue add(TermValue operand);
	public TermValue mult(TermValue operand);
	public TermValue div(TermValue operand);
	public TermValue modulo(TermValue operand);
	public TermValue sub(TermValue operand);
	public boolean moreEqual(TermValue operand);
	public boolean more(TermValue operand);
	public boolean lessEqual(TermValue operand);
	public boolean less(TermValue operand);
	public boolean equal(TermValue operand);
	public String toString();
}
