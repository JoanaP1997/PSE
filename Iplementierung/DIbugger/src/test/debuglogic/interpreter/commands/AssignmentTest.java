package test.debuglogic.interpreter.commands;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.VariableNotFoundException;
import dibugger.debuglogic.exceptions.WrongTypeAssignmentException;
import dibugger.debuglogic.interpreter.AdditionTerm;
import dibugger.debuglogic.interpreter.Assignment;
import dibugger.debuglogic.interpreter.BooleanValue;
import dibugger.debuglogic.interpreter.Command;
import dibugger.debuglogic.interpreter.ConstantTerm;
import dibugger.debuglogic.interpreter.GenerationController;
import dibugger.debuglogic.interpreter.IntValue;
import dibugger.debuglogic.interpreter.MultiplicationTerm;
import dibugger.debuglogic.interpreter.Scope;
import dibugger.debuglogic.interpreter.Term;
import dibugger.debuglogic.interpreter.TraceState;
import dibugger.debuglogic.interpreter.Type;
import dibugger.debuglogic.interpreter.VariableTerm;

public class AssignmentTest {

  @Test
  public void test_Assignment_valid() throws DIbuggerLogicException {

      for (int k = 0; k < 1000; k++) {
          // test "x=x+k;"
          GenerationController gc = new GenerationController(1000, 1000);
          Scope s = new Scope();
          s.setTypeOf("x", Type.INT);
          s.setValueOf("x", new IntValue(3));
          gc.pushScope(s);
          // create Command
          Term t = new AdditionTerm(new VariableTerm("x"), new ConstantTerm(new IntValue(k))); // x+k
          Command assign = new Assignment(gc, 4, "x", t);
          List<TraceState> result = assign.run(); // run it
          assertEquals(s.getValueOf("x").toString(),(new Integer(3 + k).toString()));
          assertEquals(result.size(),1);
          assertEquals(result.get(0).getValueOf("x").toString(),(new Integer(3 + k).toString()));
      }
      
      for (int k = 0; k < 1000; k++) {
          // test "y=y*k;"
          GenerationController gc = new GenerationController(1000, 1000);
          Scope s = new Scope();
          s.setTypeOf("y", Type.INT);
          s.setValueOf("y", new IntValue(3));
          gc.pushScope(s);
          // create Command
          Term t = new MultiplicationTerm(new VariableTerm("y"), new ConstantTerm(new IntValue(k))); // y*k
          Command assign = new Assignment(gc, 4, "y", t);
          List<TraceState> result = assign.run(); // run it
          assertEquals (s.getValueOf("y").toString(), (new Integer(3 * k).toString()));
          assertEquals(result.size(), 1);
          assertEquals(result.get(0).getValueOf("y").toString(), (new Integer(3 * k).toString()));
      }
  }

  
  @Test(expected=VariableNotFoundException.class)
  public void test_Assignment_VariableNotFound() throws DIbuggerLogicException {
      GenerationController gc = new GenerationController(1000, 1000);
      Scope s = new Scope();
      gc.pushScope(s);
      // create Command
      Command assign = new Assignment(gc, 1, "y", new ConstantTerm(new IntValue(3)));
      List<TraceState> result = assign.run(); // run it
  }
  
  @Test(expected=WrongTypeAssignmentException.class)
  public void test_Assignment_WrongTypeAssignment() throws DIbuggerLogicException {
      GenerationController gc = new GenerationController(1000, 1000);
      Scope s = new Scope();
      s.setTypeOf("x", Type.BOOLEAN);
      s.setValueOf("x", new BooleanValue(false));
      gc.pushScope(s);
      // create Command
      Command assign = new Assignment(gc, 1, "x", new ConstantTerm(new IntValue(3)));
      List<TraceState> result = assign.run(); // run it
  }
}
