package dibugger.debuglogic.interpreter;

/**
 * Represents a Binary Term, which is a Term with two Operands e.g. Addition
 * 
 * @author wagner
 *
 */
public abstract class BinaryArithmeticTerm extends Term {
    protected Term left;
    protected Term right;
    /**
     * Returns the left child.
     * @return left child
     */
    public Term getLeftChild() {
    	return left;
    }
    /**
     * Returns the right child.
     * @return right child
     */
    public Term getRightChild() {
    	return right;
    }
}
