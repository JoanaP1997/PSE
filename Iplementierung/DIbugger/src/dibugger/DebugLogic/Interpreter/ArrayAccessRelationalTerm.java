package dibugger.DebugLogic.Interpreter;

import java.util.List;

/**
 * Represents an arrayaccess based on the arrays of multiple programs
 * 
 * @author wagner
 *
 */
public final class ArrayAccessRelationalTerm extends Term {
    private final int DIM;
    private Term indexA;
    private Term indexB;
    private Term indexC;
    private String identifier;
    private int programId;

    /**
     * Constructor of an ArrayAccess on an onedimensional Array
     * 
     * @param identifier
     * @param index
     */
    public ArrayAccessRelationalTerm(String identifier, Term index) {
	DIM = 1;
	this.indexA = index;
	// Dummy indices
	this.indexB = new ConstantTerm(new IntValue(0));
	this.indexC = this.indexB; // maybe you could make this more efficient
	                           // by using one global 0 Term
	splitId();
    }

    /**
     * Constructor of an ArrayAccess on an twodimensional Array
     * 
     * @param identifier
     * @param firstIndex
     * @param secondIndex
     */
    public ArrayAccessRelationalTerm(String identifier, Term firstIndex, Term secondIndex) {
	DIM = 2;
	this.indexA = firstIndex;
	this.indexB = secondIndex;
	// Dummy index
	this.indexC = new ConstantTerm(new IntValue(0));
	this.identifier = identifier;
	splitId();
    }

    /**
     * Constructor of an ArrayAccess on an threedimensional Array
     * 
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
	splitId();
    }

    @Override
    public TermValue evaluate(List<TraceState> states) {
	if (this.programId <= states.size()) {
	    TermValue t = states.get(this.programId).getValueOf(identifier); //get the Array
		TermValue firstIndex = this.indexA.evaluate(states);
		TermValue secondIndex = this.indexB.evaluate(states);
		TermValue thirdIndex = this.indexC.evaluate(states);
		//Hope that this is an array and the indices are Integers
		if(t.getType() == Type.ARRAY && firstIndex.getType() == Type.INT 
			&& secondIndex.getType() == Type.INT && thirdIndex.getType() == Type.INT) { 
		    int i = ((IntValue)firstIndex).getValue();
		    int j = ((IntValue)secondIndex).getValue();
		    int k = ((IntValue)thirdIndex).getValue();
		    TermValue [][][] array =   ((ArrayValue)t).getValue();
		    //make sure that i,j,k are not out of bounds
		    if(i < array.length) {
			TermValue [][] innerArray = array[i];
			if (j < innerArray.length) {
			    TermValue[] innerInnerArray = innerArray[j];
			    if (k < innerInnerArray.length) {
				return innerInnerArray[k];
			    }
			}
		    }
		}
	}
	return new CharValue('?');
    }

    @Override
    public TermValue evaluate(Scope currentScope) {
	return new CharValue('?');
    }

    private void splitId() {
	if (identifier.contains("\\.")) {
	    // split into programId part and variable identifier
	    String[] parts = identifier.split("\\.");
	    this.identifier = parts[1];
	    char programIdChar = parts[0].charAt(0);
	    this.programId = (int) programIdChar - (int) 'A';
	} else {
	    this.programId = 0;
	    this.identifier = identifier;
	}
    }
}
