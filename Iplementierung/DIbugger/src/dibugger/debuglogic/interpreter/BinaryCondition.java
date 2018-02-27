package dibugger.debuglogic.interpreter;

import java.util.List;

/**
 * Represents a Binary Condition, which is a Term with two Operands evaluating
 * to a boolean
 * 
 * @author wagner
 *
 */
public abstract class BinaryCondition extends Term {
    protected Term leftOperand;
    protected Term rightOperand;
    /**
     * Returns the left child.
     * @return left child
     */
    public Term getLeftChild() {
    	return leftOperand;
    }
    /**
     * Returns the right child.
     * @return right child
     */
    public Term getRightChild() {
    	return rightOperand;
    }

}
