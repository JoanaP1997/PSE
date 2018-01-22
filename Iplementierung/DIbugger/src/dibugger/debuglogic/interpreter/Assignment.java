package dibugger.debuglogic.interpreter;

import java.util.ArrayList;
import java.util.List;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.VariableNotFoundException;
import dibugger.debuglogic.exceptions.WrongTypeAssignmentException;

/**
 * Command to assign a value to an already declared variable.s
 * 
 * @author scheler, wagner
 *
 */
public class Assignment extends Command {
  private String identifier;
  private Term term;

  public Assignment(GenerationController controller, int linenumber, String identifier, Term term) {
    super(controller, linenumber);
    this.identifier = identifier;
    this.term = term;
  }

  @Override
  public List<TraceState> run() throws DIbuggerLogicException {
    Scope scope = this.controller.getCurrentScope();
    TermValue value = this.term.evaluate(scope);
    Type type = scope.getTypeOf(identifier);
    // check if variable exists
    if (type == null) {
      throw new VariableNotFoundException(this.linenumber);
    }

    // check type
    if (type != value.getType()) {
      throw new WrongTypeAssignmentException(this.linenumber);
    }

    // set value
    scope.setValueOf(this.identifier, value);

    List<TraceState> traceStateList = new ArrayList<TraceState>();
    traceStateList.add(new TraceState(TraceStatePosition.NOTSPECIAL, this.linenumber, scope));
    return traceStateList;
  }

}
