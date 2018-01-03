package dibugger.DebugLogic.Interpreter;

import java.util.List;
/**
 * Represents an arrayaccess based on the arrays of multiple programs
 * @author wagner
 *
 */
public final class ArrayAccessRelationalTerm extends Term {
    private final int DIM;
    private Term indexA;
    private Term indexB;
    private Term indexC;
    /**
     * Constructor of an ArrayAccess on an onedimensional Array
     * @param index
     */
    public ArrayAccessRelationalTerm(Term index) {
	DIM = 1;
	this.indexA = index;
    }
    /**
     * Constructor of an ArrayAccess on an twodimensional Array
     * @param firstIndex
     * @param secondIndex
     */
    public ArrayAccessRelationalTerm(Term firstIndex, Term secondIndex) {
	DIM = 2;
	this.indexA = firstIndex;
	this.indexB = secondIndex;
    }
    /**
     * Constructor of an ArrayAccess on an threedimensional Array
     * @param firstIndex
     * @param secondIndex
     * @param thirdIndex
     */
    public ArrayAccessRelationalTerm(Term firstIndex, Term secondIndex, Term thirdIndex) {
	DIM = 3;
	this.indexA = firstIndex;
	this.indexB = secondIndex;
	this.indexC = thirdIndex;
    }
    @Override
    public TermValue evaluate(List<TraceState> states) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public TermValue evaluate(Scope currentScope) {
	// TODO Auto-generated method stub
	return null;
    }

}
