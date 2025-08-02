package dibugger.debuglogic.interpreter;

import java.util.List;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.VariableNotFoundException;

/**
 * Represents an arrayaccess based on the arrays of a single program.
 * 
 * @author wagner
 *
 */
public final class ArrayAccessTerm extends Term {
    private final int DIM;
    private Term indexA;
    private Term indexB;
    private Term indexC;
    private String identifier;

    /**
     * Constructor of an ArrayAccess on an onedimensional Array
     * 
     * @param identifier
     * @param index
     */
    public ArrayAccessTerm(String identifier, Term index) {
        DIM = 1;
        this.indexA = index;
        // Dummy indices
        this.indexB = new ConstantTerm(new IntValue(0));
        this.indexC = this.indexB; // maybe you could make this more efficient
                                   // by
                                   // using one global 0 Term
        this.identifier = identifier;
    }

    /**
     * Constructor of an ArrayAccess on an twodimensional Array
     * 
     * @param identifier
     * @param firstIndex
     * @param secondIndex
     */
    public ArrayAccessTerm(String identifier, Term firstIndex, Term secondIndex) {
        DIM = 2;
        this.indexA = firstIndex;
        this.indexB = secondIndex;
        // Dummy index
        this.indexC = new ConstantTerm(new IntValue(0));
        this.identifier = identifier;
    }

    /**
     * Constructor of an ArrayAccess on an threedimensional Array
     * 
     * @param identifier
     * @param firstIndex
     * @param secondIndex
     * @param thirdIndex
     */
    public ArrayAccessTerm(String identifier, Term firstIndex, Term secondIndex, Term thirdIndex) {
        DIM = 3;
        this.indexA = firstIndex;
        this.indexB = secondIndex;
        this.indexC = thirdIndex;
        this.identifier = identifier;
    }

    @Override
    public TermValue evaluate(List<TraceState> states) throws VariableNotFoundException {
    	throw new VariableNotFoundException(-1);
    }

    @Override
    public TermValue evaluate(Scope currentScope) throws DIbuggerLogicException {
        TermValue t = currentScope.getValueOf(identifier); // get the Array
        TermValue firstIndex = this.indexA.evaluate(currentScope);
        TermValue secondIndex = this.indexB.evaluate(currentScope);
        TermValue thirdIndex = this.indexC.evaluate(currentScope);
        // Hope that this is an array and the indeces are Integers
        if (t.getType() == Type.ARRAY && firstIndex.getType() == Type.INT && secondIndex.getType() == Type.INT
                && thirdIndex.getType() == Type.INT) {
            int i = ((IntValue) firstIndex).getValue();
            int j = ((IntValue) secondIndex).getValue();
            int k = ((IntValue) thirdIndex).getValue();
            TermValue[][][] array = ((ArrayValue) t).getValue();
            // make sure that i,j,k are not out of bounds
            if (i < array.length) {
                TermValue[][] innerArray = array[i];
                if (j < innerArray.length) {
                    TermValue[] innerInnerArray = innerArray[j];
                    if (k < innerInnerArray.length) {
                        return innerInnerArray[k];
                    }
                }
            }
        }
        return new CharValue('?');
    }

}
