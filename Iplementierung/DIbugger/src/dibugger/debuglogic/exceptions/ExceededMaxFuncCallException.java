package dibugger.debuglogic.exceptions;

/**
 * Exception thrown if during the execution of a program (in total!) more functions are called and executed than allowed.
 * @author scheler
 *
 */
public class ExceededMaxFuncCallException extends DIbuggerLogicException {
  
  /**
   * Default serialVersionUID.
   */
  private static final long serialVersionUID = 1L;

  /**
   * Constructor of a ExceededMaxFuncCallException.
   * 
   * @param occurrence
   *            the line of occurrence of the exception
   */
  public ExceededMaxFuncCallException(int occurrence) {
      super(occurrence, "dl_exc_exceeded_max_func_calls");
  }
  
}
