package dibugger.debuglogic.interpreter;

import java.util.ArrayList;
import java.util.List;

import dibugger.debuglogic.exceptions.AlreadyDeclaredException;
import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.WrongTypeAssignmentException;

public class ArrayDeclarationAssignment extends Command {

    private String identifier;
    private Term values;
    private Term sizeA; // length of the first dimension
    private Term sizeB;
    private Term sizeC;
    private int linenumber;

    public ArrayDeclarationAssignment(GenerationController controller, int linenumber, String identifier, Term size,
            Term values) {
        super(controller, linenumber);
        this.sizeA = size;
        // Dummy indices
        this.sizeB = new ConstantTerm(new IntValue(1));
        this.sizeC = this.sizeB; // maybe you could make this more efficient by
                                 // using one global 0 Term
        this.identifier = identifier;
        this.linenumber = linenumber;
        this.values = values;
    }

    @Override
    public List<TraceState> run() throws DIbuggerLogicException {
        Scope scope = this.controller.getCurrentScope();

        // check if variable already exists
        if (scope.getTypeOf(identifier) != null) {
            throw new AlreadyDeclaredException(this.linenumber);
        }

        // set type
        scope.setTypeOf(this.identifier, Type.ARRAY);

        TermValue value = this.values.evaluate(scope);

        // check type
        if (Type.ARRAY != value.getType()) {
            throw new WrongTypeAssignmentException(this.linenumber);
        }
        // set value
        scope.setValueOf(this.identifier, value);

        List<TraceState> traceStateList = new ArrayList<TraceState>();
        traceStateList.add(new TraceState(TraceStatePosition.NOTSPECIAL, this.linenumber, scope));
        return traceStateList;
    }

}
