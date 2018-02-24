package test.debuglogic.interpreter.commands;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import dibugger.debuglogic.exceptions.AlreadyDeclaredException;
import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.WrongTypeAssignmentException;
import dibugger.debuglogic.interpreter.Assignment;
import dibugger.debuglogic.interpreter.BooleanValue;
import dibugger.debuglogic.interpreter.Command;
import dibugger.debuglogic.interpreter.ConstantTerm;
import dibugger.debuglogic.interpreter.Declaration;
import dibugger.debuglogic.interpreter.DeclarationAssignment;
import dibugger.debuglogic.interpreter.DoubleValue;
import dibugger.debuglogic.interpreter.GenerationController;
import dibugger.debuglogic.interpreter.IntValue;
import dibugger.debuglogic.interpreter.Scope;
import dibugger.debuglogic.interpreter.Term;
import dibugger.debuglogic.interpreter.TraceState;
import dibugger.debuglogic.interpreter.Type;

public class DeclarationAssignmentTest {

    @Test
    public void test_DeclarationAssignmet_valid() throws DIbuggerLogicException {
        GenerationController gc = new GenerationController(1000, 1000);
        Scope s = new Scope();
        gc.pushScope(s);
        // create Command
        Command decAssign = new DeclarationAssignment(gc, 0, "var", Type.DOUBLE,
                new ConstantTerm(new DoubleValue(2.0)));
        List<TraceState> result = decAssign.run(); // run it
        assertEquals(s.getTypeOf("var"), Type.DOUBLE);
        assertEquals(result.size(), 1);
    }

    @Test(expected = AlreadyDeclaredException.class)
    public void test_Declaration_variableAlreadyDeclared() throws DIbuggerLogicException {
        GenerationController gc = new GenerationController(1000, 1000);
        Scope s = new Scope();
        gc.pushScope(s);
        // create Command
        Command decAssign = new DeclarationAssignment(gc, 0, "var", Type.DOUBLE,
                new ConstantTerm(new DoubleValue(2.0)));
        List<TraceState> result = decAssign.run(); // run it
        // run Command a second time
        List<TraceState> result2 = decAssign.run(); // run it
    }

    @Test(expected = WrongTypeAssignmentException.class)
    public void test_Assignment_WrongTypeAssignment() throws DIbuggerLogicException {
        GenerationController gc = new GenerationController(1000, 1000);
        Scope s = new Scope();
        gc.pushScope(s);
        // create Command
        Command decAssign = new DeclarationAssignment(gc, 0, "var", Type.BOOLEAN,
                new ConstantTerm(new DoubleValue(2.0)));
        List<TraceState> result = decAssign.run(); // run it
    }

}
