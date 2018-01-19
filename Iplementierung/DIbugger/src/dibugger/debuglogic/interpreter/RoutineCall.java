package dibugger.debuglogic.interpreter;

import java.util.ArrayList;
import java.util.List;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.InvalidProgramException;

public class RoutineCall extends Command {
  
  private String calleeName;
  private List<Term> args;

  public RoutineCall(GenerationController controller, int linenumber, String calleeName, List<Term> args) {
    super(controller, linenumber);
    this.calleeName = calleeName;
    this.args = args;
  }

  @Override
  public List<TraceState> run() throws DIbuggerLogicException {
    RoutineCommand rootCommand = this.controller.getRoutineRootCommand(calleeName);
    if (rootCommand == null) {
      throw new InvalidProgramException(this.linenumber);
    }
    
    List<TraceState> traceStateList = new ArrayList<TraceState>();
    
    rootCommand.setArgs(this.args);
    traceStateList.addAll(rootCommand.run());

    this.controller.getCurrentScope().setReturnValue(this.controller.getReturnValue());
    
    return traceStateList;
  }

}
