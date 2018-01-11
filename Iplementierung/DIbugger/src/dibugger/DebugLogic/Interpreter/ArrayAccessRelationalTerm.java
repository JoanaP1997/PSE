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
    private String identifier;
    
    /**
     * Constructor of an ArrayAccess on an onedimensional Array
     * @param identifier
     * @param index
     */
    public ArrayAccessRelationalTerm(String identifier, Term index) {
	DIM = 1; 
	this.indexA = index;
	this.identifier = identifier;
    }
    /**
     * Constructor of an ArrayAccess on an twodimensional Array
     * @param identifier
     * @param firstIndex
     * @param secondIndex
     */
    public ArrayAccessRelationalTerm(String identifier, Term firstIndex, Term secondIndex) {
	DIM = 2;
	this.indexA = firstIndex;
	this.indexB = secondIndex;
	this.identifier = identifier;
    }
    /**
     * Constructor of an ArrayAccess on an threedimensional Array
     * @param identifier
     * @param firstIndex
     * @param secondIndex
     * @param thirdIndex
     */
    public ArrayAccessRelationalTerm(String identifier, Term firstIndex, Term secondIndex, Term thirdIndex) {
	DIM = 3;
	this.indexA = firstIndex;
	this.indexB = secondIndex;
	this.indexC = thirdIndex;
	this.identifier = identifier;
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
