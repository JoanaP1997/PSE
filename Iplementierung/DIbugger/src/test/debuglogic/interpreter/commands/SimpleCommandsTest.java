package test.debuglogic.interpreter.commands;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.ExceededMaxIterationsException;
import dibugger.debuglogic.exceptions.IncompatibleTypeException;
import dibugger.debuglogic.exceptions.WrongTypeArgumentException;
import dibugger.debuglogic.interpreter.AdditionTerm;
import dibugger.debuglogic.interpreter.Assignment;
import dibugger.debuglogic.interpreter.BooleanValue;
import dibugger.debuglogic.interpreter.Command;
import dibugger.debuglogic.interpreter.ConstantTerm;
import dibugger.debuglogic.interpreter.Declaration;
import dibugger.debuglogic.interpreter.GenerationController;
import dibugger.debuglogic.interpreter.IntValue;
import dibugger.debuglogic.interpreter.MultiplicationTerm;
import dibugger.debuglogic.interpreter.Scope;
import dibugger.debuglogic.interpreter.Term;
import dibugger.debuglogic.interpreter.TraceState;
import dibugger.debuglogic.interpreter.Type;
import dibugger.debuglogic.interpreter.VariableTerm;
import dibugger.debuglogic.interpreter.WhileCommand;

public class SimpleCommandsTest {

    @Test(expected = WrongTypeArgumentException.class)
    public void testWhileCommandWithInt() throws DIbuggerLogicException {
        GenerationController gc = new GenerationController(1000, 1000);
        gc.setMaxFuncCalls(3);
        Scope s = new Scope();
        gc.pushScope(s);
        // create Command
        Command whileCommand = new WhileCommand(gc, 0, new ConstantTerm(new IntValue(1)));
        whileCommand.run();
    }

    /**
     * Only checks if the Command stops running.
     * 
     * @throws DIbuggerLogicException
     */
    @Test(expected = ExceededMaxIterationsException.class)
    public void testWhileCommand() throws DIbuggerLogicException {
        GenerationController gc = new GenerationController(1000, 1000);
        gc.setMaxFuncCalls(3);
        Scope s = new Scope();
        gc.pushScope(s);
        // create Command
        Command whileCommand = new WhileCommand(gc, 0, new ConstantTerm(new BooleanValue(true)));
        whileCommand.run();

    }
}
