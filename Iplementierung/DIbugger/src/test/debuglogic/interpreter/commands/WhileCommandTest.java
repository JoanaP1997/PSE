package test.debuglogic.interpreter.commands;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.ExceededMaxIterationsException;
import dibugger.debuglogic.exceptions.WrongTypeArgumentException;
import dibugger.debuglogic.interpreter.AdditionTerm;
import dibugger.debuglogic.interpreter.Assignment;
import dibugger.debuglogic.interpreter.BooleanValue;
import dibugger.debuglogic.interpreter.CharValue;
import dibugger.debuglogic.interpreter.Command;
import dibugger.debuglogic.interpreter.ConstantTerm;
import dibugger.debuglogic.interpreter.GenerationController;
import dibugger.debuglogic.interpreter.IntValue;
import dibugger.debuglogic.interpreter.LessComparison;
import dibugger.debuglogic.interpreter.Scope;
import dibugger.debuglogic.interpreter.TraceState;
import dibugger.debuglogic.interpreter.Type;
import dibugger.debuglogic.interpreter.VariableTerm;
import dibugger.debuglogic.interpreter.WhileCommand;

public class WhileCommandTest {

    @Test
    public void whileTest() throws DIbuggerLogicException {
        for (int i = 0; i < 1000; i++) {
            whileTestIterations(i);
        }
    }

    /**
     * Tests a simple while loop with k iterations.
     * 
     * @param k
     *            #iterations.
     * @throws DIbuggerLogicException
     */
    public void whileTestIterations(int k) throws DIbuggerLogicException {
        GenerationController gc = new GenerationController(1000, 1000);
        Scope s = new Scope();
        s.setTypeOf("i", Type.INT);
        s.setValueOf("i", new IntValue(0)); // int i = 0;
        s.setTypeOf("a", Type.CHAR);
        s.setValueOf("a", new CharValue('a'));
        gc.pushScope(s);
        WhileCommand whilecmd = new WhileCommand(gc, 0,
                new LessComparison(new VariableTerm("i"), new ConstantTerm(new IntValue(k)))); // while
                                                                                               // (i<k)
        Assignment assign = new Assignment(gc, 0, "i",
                new AdditionTerm(new VariableTerm("i"), new ConstantTerm(new IntValue(1)))); // i=i+1;
        whilecmd.addChild(assign);
        List<TraceState> states = whilecmd.run();
        assertEquals(states.size(), k + 1); // k iterations + first check
        assertEquals(s.getValueOf("i").toString(), (k + ""));
    }

    
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
