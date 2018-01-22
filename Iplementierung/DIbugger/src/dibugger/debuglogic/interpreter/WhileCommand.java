package dibugger.debuglogic.interpreter;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.WrongTypeArgumentException;
import java.util.ArrayList;
import java.util.List;

/**
 * A command to execute an while statement.
 * 
 * @author scheler, wagner
 */

public class WhileCommand extends Command {
  private Term condition;
  private List<Command> children;

  /**
   * Constructor.
   * 
   * @param controller
   *          the generationcontroller
   * @param linenumber
   *          the linenumber
   * @param condition
   *          the condition
   */
  public WhileCommand(GenerationController controller, int linenumber, Term condition) {
    super(controller, linenumber);
    this.condition = condition;
    this.children = new ArrayList<Command>();
  }

  @Override
  public List<TraceState> run() throws DIbuggerLogicException {
    Scope scope = this.controller.getCurrentScope();
    // check if condition is of type boolean
    TermValue value = this.condition.evaluate(scope);
    if (value.getType() != Type.BOOLEAN) {
      throw new WrongTypeArgumentException(this.linenumber);
    }
    List<TraceState> traceStateList = new ArrayList<TraceState>();
    traceStateList.add(new TraceState(TraceStatePosition.NOTSPECIAL, this.linenumber, scope));
    // run the loop
    while (((BooleanValue) this.condition.evaluate(scope)).getValue()) {
      for (Command child : this.children) {
        traceStateList.addAll(child.run());
      }
    }
    return traceStateList;
  }

  /**
   * Adds a child to the children of the command.**
   * 
   * @param child
   *          the child to be added
   */

  public void addChild(Command child) {
    this.children.add(child);
  }

  // MEthode nur zu Testzecken bisher
  public Command getChild(int i) {
    return this.children.get(i);
  }

}
