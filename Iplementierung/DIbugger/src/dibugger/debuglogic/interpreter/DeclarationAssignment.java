package dibugger.debuglogic.interpreter;

import java.util.ArrayList;
import java.util.List;

import dibugger.debuglogic.exceptions.AlreadyDeclaredException;
import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.WrongTypeAssignmentException;

/**
 * Represents a command of the type "int i = 2;".
 * 
 * @author wagner
 *
 */
public class DeclarationAssignment extends Command {
    private String identifier;
    private Term term;
    private Type type;

    /**
     * Constructor.
     * 
     * @param controller
     *            the controller
     * @param linenumber
     *            the linenumber
     * @param identifier
     *            the identifier
     * @param type
     *            the type
     * @param term
     *            the term
     */
    public DeclarationAssignment(GenerationController controller, int linenumber, String identifier, Type type,
            Term term) {
        super(controller, linenumber);
        this.controller = controller;
        this.identifier = identifier;
        this.type = type;
        this.term = term;
    }

    @Override
    public List<TraceState> run() throws DIbuggerLogicException {

        Scope scope = this.controller.getCurrentScope();

        // check if variable already exists
        if (scope.getTypeOf(identifier) != null) {
            throw new AlreadyDeclaredException(this.linenumber);
        }

        // set type
        scope.setTypeOf(this.identifier, this.type);
        TermValue value = this.term.evaluate(scope);
        // check type
        if (this.type != value.getType()) {
            throw new WrongTypeAssignmentException(this.linenumber);
        }
        // set value
        scope.setValueOf(this.identifier, value);

        List<TraceState> traceStateList = new ArrayList<TraceState>();
        traceStateList.add(new TraceState(TraceStatePosition.NOTSPECIAL, this.linenumber, scope));
        return traceStateList;

    }

}
