package test.debuglogic.interpreter;

import static org.junit.Assert.*;

import org.junit.Test;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.interpreter.AdditionTerm;
import dibugger.debuglogic.interpreter.ArrayDeclaration;
import dibugger.debuglogic.interpreter.ArrayValue;
import dibugger.debuglogic.interpreter.Command;
import dibugger.debuglogic.interpreter.ConstantTerm;
import dibugger.debuglogic.interpreter.Declaration;
import dibugger.debuglogic.interpreter.GenerationController;
import dibugger.debuglogic.interpreter.IntValue;
import dibugger.debuglogic.interpreter.Scope;
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
  public void testComplicatedOneDimensinArrayDeclaration() throws DIbuggerLogicException {
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
}
