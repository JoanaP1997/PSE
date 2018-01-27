package dibugger.debuglogic.interpreter;

import java.util.ArrayList;
import java.util.List;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.VariableNotFoundException;
import dibugger.debuglogic.exceptions.WrongArgumentException;
import dibugger.debuglogic.exceptions.WrongTypeArgumentException;
import dibugger.debuglogic.exceptions.WrongTypeAssignmentException;

public class ArrayElementAssignment extends Command {

    private final int DIM;
    private String identifier;
    private Term indexA; // index in the first dimension
    private Term indexB;
    private Term indexC;
    private Term value;

    public ArrayElementAssignment(GenerationController controller, int linenumber, String identifier, Term index,
            Term value) {
        super(controller, linenumber);
        DIM = 1;
        this.indexA = index;
        // Dummy indices
        this.indexB = new ConstantTerm(new IntValue(0));
        this.indexC = this.indexB; // maybe you could make this more efficient
                                   // by using one global 0 Term
        this.identifier = identifier;
        this.value = value;
    }

    public ArrayElementAssignment(GenerationController controller, int linenumber, String identifier, Term firstIndex,
            Term secondIndex, Term value) {
        super(controller, linenumber);
        DIM = 2;
        this.indexA = firstIndex;
        this.indexB = secondIndex;
        // Dummy index
        this.indexC = new ConstantTerm(new IntValue(0));
        this.identifier = identifier;
        this.value = value;
    }

    public ArrayElementAssignment(GenerationController controller, int linenumber, String identifier, Term firstIndex,
            Term secondIndex, Term thirdIndex, Term value) {
        super(controller, linenumber);
        DIM = 3;
        this.indexA = firstIndex;
        this.indexB = secondIndex;
        this.indexC = thirdIndex;
        this.identifier = identifier;
        this.value = value;
    }

    @Override
    public List<TraceState> run() throws DIbuggerLogicException {
        Scope scope = this.controller.getCurrentScope();
        TermValue value = this.value.evaluate(scope);
        Type type = scope.getTypeOf(this.identifier);

        // check if variable exists
        if (type == null) {
            throw new VariableNotFoundException(this.linenumber);
        }

        // check type
        if (type != Type.ARRAY) {
            throw new WrongTypeAssignmentException(this.linenumber);
        }
        // calculate indices
        TermValue indexAv = this.indexA.evaluate(scope);
        TermValue indexBv = this.indexB.evaluate(scope);
        TermValue indexCv = this.indexC.evaluate(scope);
        if (indexAv.getType() != Type.INT || indexBv.getType() != Type.INT || indexCv.getType() != Type.INT)
            throw new WrongTypeArgumentException(this.linenumber);

        int i = ((IntValue) indexAv).getValue();
        int j = ((IntValue) indexBv).getValue();
        int k = ((IntValue) indexCv).getValue();

        // get the reference to the array
        TermValue theArrayTv = scope.getValueOf(this.identifier);
        if (theArrayTv.getType() != Type.ARRAY)
            throw new WrongTypeAssignmentException(this.linenumber);
        TermValue[][][] theArray = ((ArrayValue) theArrayTv).getValue();
        // evaluate the right side of the assignment(value : Term)
        TermValue val = this.value.evaluate(scope);
        // another type checking: Make sure that the arrays elements and the
        // value have the same type
        if (theArray[0][0][0] != null && val.getType() != theArray[0][0][0].getType())
            throw new WrongTypeAssignmentException(this.linenumber);
        // set the value and check the bounds of it

        if (i < theArray.length) {
            TermValue[][] innerArray = theArray[i];
            if (j < innerArray.length) {
                TermValue[] innerInnerArray = innerArray[j];
                if (k < innerInnerArray.length) {
                    innerInnerArray[k] = val;
                } else
                    throw new VariableNotFoundException(this.linenumber);
            } else
                throw new VariableNotFoundException(this.linenumber);
        } else
            throw new VariableNotFoundException(this.linenumber);

        // save the state and return it
        List<TraceState> traceStateList = new ArrayList<TraceState>();
        traceStateList.add(new TraceState(TraceStatePosition.NOTSPECIAL, this.linenumber, scope));
        return traceStateList;
    }

}
