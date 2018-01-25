package dibugger.debuglogic.interpreter;

import java.util.ArrayList;
import java.util.List;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.IncompatibleTypeException;
import dibugger.debuglogic.exceptions.MissingReturnCallException;
import dibugger.debuglogic.exceptions.WrongNumberArgumentException;
import dibugger.debuglogic.exceptions.WrongTypeArgumentException;

/**
 * A command to call and execute a routine.
 * 
 * @author scheler, wagner
 *
 */
public class RoutineCommand extends Command {

    private List<Type> expectedTypes;
    private List<Command> children;
    private List<Term> args;
    private List<String> identifiers;
    private Type expectedReturnType;
    private String name;

    /**
     * Constructor for a RoutineCall.
     * 
     * @param controller
     *            the generation controller
     * @param routinename
     *            the name of the routine
     * @param linenumber
     *            the line number of the command
     * @param identifiers
     *            the identifiers of the routine arguments
     * @param expectedTypes
     *            the expected types of the routine arguments
     * @param expectedReturnType
     *            the expected return type of the routine
     */
    public RoutineCommand(GenerationController controller, String routinename, int linenumber, List<String> identifiers,
            List<Type> expectedTypes, Type expectedReturnType) {
        super(controller, linenumber);
        this.expectedTypes = expectedTypes;
        this.children = new ArrayList<Command>();
        this.identifiers = identifiers;
        this.expectedReturnType = expectedReturnType;
        this.name = routinename;
        this.args = new ArrayList<Term>();
    }

    @Override
    public List<TraceState> run() throws DIbuggerLogicException {

        // OLD SCOPE
        Scope scope = this.controller.getCurrentScope();
        // check number of arguments
        if (this.expectedTypes.size() != this.args.size() || this.expectedTypes.size() != this.identifiers.size()) {
            throw new WrongNumberArgumentException(this.linenumber);
        }

        // compare type of arguments with expected types
        List<TermValue> values = new ArrayList<TermValue>();
        for (int i = 0; i < expectedTypes.size(); i++) {
            TermValue value = this.args.get(i).evaluate(scope);
            if (this.expectedTypes.get(i) != value.getType()) {
                throw new WrongTypeArgumentException(this.linenumber);
            }
            values.add(value);
        }

        // NEW SCOPE
        this.controller.pushScope(new Scope());
        Scope newScope = this.controller.getCurrentScope();

        for (int i = 0; i < expectedTypes.size(); i++) {
            newScope.setTypeOf(this.identifiers.get(i), this.expectedTypes.get(i));
            newScope.setValueOf(this.identifiers.get(i), values.get(i));
        }
        //reset return value
        this.controller.setReturnValue(null);
        // run all kids while return value not set
        List<TraceState> traceStateList = new ArrayList<TraceState>();
        int i = 0;
        while (i < this.children.size() && !newScope.isRoutineFinished()) {
            traceStateList.addAll(this.children.get(i).run());
            i++;
        }

        // check if return value of controller is set and of correct type
        TermValue returnValue = this.controller.getReturnValue();
        
        if ((returnValue == null) && (this.expectedReturnType != Type.NULL)) {
            throw new MissingReturnCallException(this.linenumber);
        }

        else if (returnValue != null && returnValue.getType() != this.expectedReturnType) {
            throw new IncompatibleTypeException(this.linenumber, "incompatible_return_value");
        }

        // pop Scope
        this.controller.popScope();
        return traceStateList;
    }

    /**
     * Adds a child to the children of the command.
     * 
     * @param child
     *            the child to be added
     */
    public void addChild(Command child) {
        this.children.add(child);
    }

    /**
     * Setter for the arguments of a routine.
     * 
     * @param args
     *            the arguments
     */
    public void setArgs(List<Term> args) {
        this.args = args;
    }

    /**
     * Getter for a single child of the children in the command. For testing
     * purposes.
     * 
     * @param i
     *            the index of the child
     * @return the child
     */
    public Command getChild(int i) {
        return this.children.get(i);
    }
    
    /**
     * Getter for the name of a routine.
     * @return the name of the routine
     */
    public String getName() {
      return this.name;
    }
    
    public List<Type> getExpectedTypes() {
      return this.expectedTypes;
    }
    
    public List<String> getIdentifiersOfArgs() {
      return this.identifiers;
    }
}
