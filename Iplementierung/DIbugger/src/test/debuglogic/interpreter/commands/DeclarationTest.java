package test.debuglogic.interpreter.commands;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import dibugger.debuglogic.exceptions.AlreadyDeclaredException;
import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.interpreter.Command;
import dibugger.debuglogic.interpreter.Declaration;
import dibugger.debuglogic.interpreter.GenerationController;
import dibugger.debuglogic.interpreter.Scope;
import dibugger.debuglogic.interpreter.TraceState;
import dibugger.debuglogic.interpreter.Type;

public class DeclarationTest {

  @Test
  public void test_Declaration_valid() throws DIbuggerLogicException {
      GenerationController gc = new GenerationController(1000, 1000);
      Scope s = new Scope();
      gc.pushScope(s);
      // create Command
      Command declare = new Declaration(gc, 0, "var", Type.DOUBLE);
      List<TraceState> result = declare.run(); // run it
      assertEquals(s.getTypeOf("var"), Type.DOUBLE);
      assertEquals(result.size(), 1);
  }
  
  @Test(expected=AlreadyDeclaredException.class)
  public void test_Declaration_variableAlreadyDeclared() throws DIbuggerLogicException {
    GenerationController gc = new GenerationController(1000, 1000);
    Scope s = new Scope();
    gc.pushScope(s);    
    // create Command
    Command declare = new Declaration(gc, 0, "var", Type.DOUBLE);
    List<TraceState> result = declare.run(); // run it
    // run Command a second time
    List<TraceState> result2 = declare.run();
  }
  
}