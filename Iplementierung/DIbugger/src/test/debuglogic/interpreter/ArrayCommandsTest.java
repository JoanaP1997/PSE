package test.debuglogic.interpreter;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.interpreter.AdditionTerm;
import dibugger.debuglogic.interpreter.ArrayDeclaration;
import dibugger.debuglogic.interpreter.ArrayElementAssignment;
import dibugger.debuglogic.interpreter.ArrayValue;
import dibugger.debuglogic.interpreter.Command;
import dibugger.debuglogic.interpreter.ConstantTerm;
import dibugger.debuglogic.interpreter.Declaration;
import dibugger.debuglogic.interpreter.GenerationController;
import dibugger.debuglogic.interpreter.IntValue;
import dibugger.debuglogic.interpreter.Scope;
import dibugger.debuglogic.interpreter.TraceState;
import dibugger.debuglogic.interpreter.Type;
import dibugger.debuglogic.interpreter.VariableTerm;

public class ArrayCommandsTest {

  @Test
  public void testOneDimensionalArrayDeclaration() throws DIbuggerLogicException {
      GenerationController gc = new GenerationController(1000, 1000);
      Scope s = new Scope();
      gc.pushScope(s);
      // create Command
      // int[7] array;
      Command declareArray = new ArrayDeclaration(gc, 0, "array", new ConstantTerm(new IntValue(7)));
      declareArray.run();
      assert(s.getTypeOf("array") == Type.ARRAY);
      assert(s.getValueOf("array") instanceof ArrayValue);
      assert(((ArrayValue)s.getValueOf("array")).getValue().length == 7);
  }
  
  @Test
  public void testComplicatedOneDimensionalArrayDeclaration() throws DIbuggerLogicException {
    GenerationController gc = new GenerationController(1000, 1000);
    Scope s = new Scope();
    gc.pushScope(s);
    s.setTypeOf("x", Type.INT);
    s.setValueOf("x", new IntValue(41));
    // create Command
    // int[7+x] array;
    Command declareArray = new ArrayDeclaration(gc, 0, "array", new AdditionTerm(new ConstantTerm(new IntValue(7)), new VariableTerm("x")));
    declareArray.run();
    assert(s.getTypeOf("array") == Type.ARRAY);
    assert(s.getValueOf("array") instanceof ArrayValue);
    assert(((ArrayValue)s.getValueOf("array")).getValue().length == 48);
  }
  @Test
  public void testOnedimensionalArrayDeclarationAndElementAssign() throws DIbuggerLogicException {
	  GenerationController gc = new GenerationController(1000, 1000);
      Scope s = new Scope();
      gc.pushScope(s);
      // create Command
      // int[7] array;
      Command declareArray = new ArrayDeclaration(gc, 0, "array", new ConstantTerm(new IntValue(2)));
      List<TraceState> states = declareArray.run();
      assert(s.getTypeOf("array") == Type.ARRAY);
      assert(s.getValueOf("array") instanceof ArrayValue);
      assert(((ArrayValue)s.getValueOf("array")).getValue().length == 2);
      assert(states.get(0).getValueOf("array").getType() == Type.ARRAY);
      assert(((ArrayValue)states.get(0).getValueOf("array")).getValue().length == 2);
      
      //array[0] = 1;
      Command assignElement = new ArrayElementAssignment(gc, 1, "array", new ConstantTerm(new IntValue(0)), new ConstantTerm(new IntValue(1)));
      states = assignElement.run();
      assert(s.getTypeOf("array") == Type.ARRAY);
      assert(s.getValueOf("array") instanceof ArrayValue);
      assert(((ArrayValue)s.getValueOf("array")).getValue().length == 2);
      assert(states.get(0).getValueOf("array").getType() == Type.ARRAY);
      assert(((ArrayValue)states.get(0).getValueOf("array")).getValue().length == 2);
      assert(((ArrayValue)s.getValueOf("array")).getValue()[0][0][0].toString().equals("1"));
  }
}
