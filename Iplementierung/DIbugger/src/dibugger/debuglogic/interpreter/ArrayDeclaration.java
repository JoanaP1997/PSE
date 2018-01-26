package dibugger.debuglogic.interpreter;

import java.util.ArrayList;
import java.util.List;

import dibugger.debuglogic.exceptions.AlreadyDeclaredException;
import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.WrongTypeArgumentException;

public class ArrayDeclaration extends Command {

    private final int DIM;
    private String identifier;
    private Term sizeA; // length of the first dimension
    private Term sizeB;
    private Term sizeC;

    public ArrayDeclaration(GenerationController controller, int linenumber, String identifier, Term size) {
        super(controller, linenumber);
        DIM = 1;
        this.sizeA = size;
        // Dummy indices
        this.sizeB = new ConstantTerm(new IntValue(1));
        this.sizeC = this.sizeB; // maybe you could make this more efficient by
                                 // using one global 0 Term
        this.identifier = identifier;
    }

    public ArrayDeclaration(GenerationController controller, int linenumber, String identifier, Term firstsize,
            Term secondsize) {
        super(controller, linenumber);
        DIM = 2;
        this.sizeA = firstsize;
        this.sizeB = secondsize;
        // Dummy index
        this.sizeC = new ConstantTerm(new IntValue(1));
        this.identifier = identifier;
    }

    public ArrayDeclaration(GenerationController controller, int linenumber, String identifier, Term firstsize,
            Term secondsize, Term thirdsize) {
        super(controller, linenumber);
        DIM = 3;
        this.sizeA = firstsize;
        this.sizeB = secondsize;
        this.sizeC = thirdsize;
        this.identifier = identifier;
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
        TermValue sizeAv = this.sizeA.evaluate(scope);
        TermValue sizeBv = this.sizeB.evaluate(scope);
        TermValue sizeCv = this.sizeC.evaluate(scope);
        if (sizeAv.getType() != Type.INT || sizeBv.getType() != Type.INT || sizeCv.getType() != Type.INT)
            throw new WrongTypeArgumentException(this.linenumber);

        int sizeAi = ((IntValue) sizeAv).getValue();
        int sizeBi = ((IntValue) sizeBv).getValue();
        int sizeCi = ((IntValue) sizeCv).getValue();

        scope.setValueOf(this.identifier, new ArrayValue(new TermValue[sizeAi][sizeBi][sizeCi]));
        List<TraceState> traceStateList = new ArrayList<TraceState>();
        traceStateList.add(new TraceState(TraceStatePosition.NOTSPECIAL, this.linenumber, scope));
        return traceStateList;
    }

}
