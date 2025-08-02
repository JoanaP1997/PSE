package test.debuglogic.interpreter.commands;

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
    public void test_arrayDeclaration_one_dim() throws DIbuggerLogicException {
        GenerationController gc = new GenerationController(1000, 1000);
        Scope s = new Scope();
        gc.pushScope(s);
        // create Command
        // int[7] array;
        Command declareArray = new ArrayDeclaration(gc, 0, "array", new ConstantTerm(new IntValue(7)));
        declareArray.run();
        assertTrue(s.getTypeOf("array") == Type.ARRAY);
        assertTrue (s.getValueOf("array") instanceof ArrayValue);
        assertTrue (((ArrayValue) s.getValueOf("array")).getValue().length == 7);
    }
    @Test
    public void test_arrayDeclaration_one_dim_complicated() throws DIbuggerLogicException {
        GenerationController gc = new GenerationController(1000, 1000);
        Scope s = new Scope();
        gc.pushScope(s);
        s.setTypeOf("x", Type.INT);
        s.setValueOf("x", new IntValue(41));
        // create Command
        // int[7+x] array;
        Command declareArray = new ArrayDeclaration(gc, 0, "array",
                new AdditionTerm(new ConstantTerm(new IntValue(7)), new VariableTerm("x")));
        declareArray.run();
        assertTrue (s.getTypeOf("array") == Type.ARRAY);
        assertTrue (s.getValueOf("array") instanceof ArrayValue);
        assertTrue (((ArrayValue) s.getValueOf("array")).getValue().length == 48);
    }
    @Test
    public void test_arrayDeclaration_two_dim() throws DIbuggerLogicException {
    	GenerationController gc = new GenerationController(1000, 1000);
        Scope s = new Scope();
        gc.pushScope(s);
        // create Command
        // char[7][3] array;
        Command declareArray = new ArrayDeclaration(gc, 0, "array", new ConstantTerm(new IntValue(7)), new ConstantTerm(new IntValue(3)));
        declareArray.run();
        assertTrue(s.getTypeOf("array") == Type.ARRAY);
        assertTrue (s.getValueOf("array") instanceof ArrayValue);
        assertTrue (((ArrayValue) s.getValueOf("array")).getValue().length == 7);
        assertTrue (((ArrayValue) s.getValueOf("array")).getValue()[0].length == 3);
    }
    @Test
    public void test_arrayDeclaration_three_dim() throws DIbuggerLogicException {
    	GenerationController gc = new GenerationController(1000, 1000);
        Scope s = new Scope();
        gc.pushScope(s);
        // create Command
        // char[7][3][2+2] array;
        Command declareArray = new ArrayDeclaration(gc, 0, "array", new ConstantTerm(new IntValue(7)), new ConstantTerm(new IntValue(3)),
        		new AdditionTerm(new ConstantTerm(new IntValue(2)),new ConstantTerm(new IntValue(2))));
        declareArray.run();
        assertTrue(s.getTypeOf("array") == Type.ARRAY);
        assertTrue (s.getValueOf("array") instanceof ArrayValue);
        assertTrue (((ArrayValue) s.getValueOf("array")).getValue().length == 7);
        assertTrue (((ArrayValue) s.getValueOf("array")).getValue()[0].length == 3);
        assertTrue (((ArrayValue) s.getValueOf("array")).getValue()[0][0].length == 4);
    }
    @Test
    public void test_arrayDeclaration_and_elementAssign_one_dim() throws DIbuggerLogicException {
        GenerationController gc = new GenerationController(1000, 1000);
        Scope s = new Scope();
        gc.pushScope(s);
        // create Command
        // int[2] array;
        Command declareArray = new ArrayDeclaration(gc, 0, "array", new ConstantTerm(new IntValue(2)));
        List<TraceState> states = declareArray.run();
        assertTrue (s.getTypeOf("array") == Type.ARRAY);
        assertTrue (s.getValueOf("array") instanceof ArrayValue);
        assertTrue (((ArrayValue) s.getValueOf("array")).getValue().length == 2);
        assertTrue (states.get(0).getValueOf("array").getType() == Type.ARRAY);
        assertTrue (((ArrayValue) states.get(0).getValueOf("array")).getValue().length == 2);

        // array[0] = 1;
        Command assignElement = new ArrayElementAssignment(gc, 1, "array", new ConstantTerm(new IntValue(0)),
                new ConstantTerm(new IntValue(1)));
        states = assignElement.run();
        assertTrue (s.getTypeOf("array") == Type.ARRAY);
        assertTrue (s.getValueOf("array") instanceof ArrayValue);
        assertTrue (((ArrayValue) s.getValueOf("array")).getValue().length == 2);
        assertTrue (states.get(0).getValueOf("array").getType() == Type.ARRAY);
        assertTrue (((ArrayValue) states.get(0).getValueOf("array")).getValue().length == 2);
        assertTrue (((ArrayValue) s.getValueOf("array")).getValue()[0][0][0].toString().equals("1"));
    }
    @Test
    public void test_arrayDeclaration_and_elementAssign_two_dim() throws DIbuggerLogicException {
        GenerationController gc = new GenerationController(1000, 1000);
        Scope s = new Scope();
        gc.pushScope(s);
        // create Command
        // int[7][3] array;
        Command declareArray = new ArrayDeclaration(gc, 0, "array", new ConstantTerm(new IntValue(7)), new ConstantTerm(new IntValue(3)));
        List<TraceState> states = declareArray.run();
        assertTrue(s.getTypeOf("array") == Type.ARRAY);
        assertTrue (s.getValueOf("array") instanceof ArrayValue);
        assertTrue (((ArrayValue) s.getValueOf("array")).getValue().length == 7);
        assertTrue (((ArrayValue) s.getValueOf("array")).getValue()[0].length == 3);

        // array[0][1] = 1;
        Command assignElement = new ArrayElementAssignment(gc, 1, "array", new ConstantTerm(new IntValue(0)), new ConstantTerm(new IntValue(1)),
                new ConstantTerm(new IntValue(1)));
        states = assignElement.run();
        assertTrue (s.getTypeOf("array") == Type.ARRAY);
        assertTrue (s.getValueOf("array") instanceof ArrayValue);
        assertTrue (((ArrayValue) s.getValueOf("array")).getValue().length == 7);
        assertTrue (states.get(0).getValueOf("array").getType() == Type.ARRAY);
        assertTrue (((ArrayValue) states.get(0).getValueOf("array")).getValue().length == 7);
        assertTrue (((ArrayValue) s.getValueOf("array")).getValue()[0][1][0].toString().equals("1"));
    }
    @Test
    public void test_arrayDeclaration_and_elementAssign_three_dim() throws DIbuggerLogicException {
        GenerationController gc = new GenerationController(1000, 1000);
        Scope s = new Scope();
        gc.pushScope(s);
        // create Command
        // int[7][3][9] array;
        Command declareArray = new ArrayDeclaration(gc, 0, "array", new ConstantTerm(new IntValue(7)), new ConstantTerm(new IntValue(3)), new ConstantTerm(new IntValue(9)));
        List<TraceState> states = declareArray.run();
        assertTrue(s.getTypeOf("array") == Type.ARRAY);
        assertTrue (s.getValueOf("array") instanceof ArrayValue);
        assertTrue (((ArrayValue) s.getValueOf("array")).getValue().length == 7);
        assertTrue (((ArrayValue) s.getValueOf("array")).getValue()[0].length == 3);
        assertTrue (((ArrayValue) s.getValueOf("array")).getValue()[0][0].length == 9);

        // array[0][1][2] = 1;
        Command assignElement = new ArrayElementAssignment(gc, 1, "array", new ConstantTerm(new IntValue(0)), new ConstantTerm(new IntValue(1)),
        		new ConstantTerm(new IntValue(2)), new ConstantTerm(new IntValue(1)));
        states = assignElement.run();
        assertTrue (s.getTypeOf("array") == Type.ARRAY);
        assertTrue (s.getValueOf("array") instanceof ArrayValue);
        assertTrue (((ArrayValue) s.getValueOf("array")).getValue().length == 7);
        assertTrue (states.get(0).getValueOf("array").getType() == Type.ARRAY);
        assertTrue (((ArrayValue) states.get(0).getValueOf("array")).getValue().length == 7);
        assertTrue (((ArrayValue) s.getValueOf("array")).getValue()[0][1][2].toString().equals("1"));
    }
    
}
