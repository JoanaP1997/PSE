package test.debuglogic.interpreter.commands;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.interpreter.AdditionTerm;
import dibugger.debuglogic.interpreter.Assignment;
import dibugger.debuglogic.interpreter.BooleanValue;
import dibugger.debuglogic.interpreter.CharValue;
import dibugger.debuglogic.interpreter.ConstantTerm;
import dibugger.debuglogic.interpreter.DeclarationAssignment;
import dibugger.debuglogic.interpreter.GenerationController;
import dibugger.debuglogic.interpreter.IfCommand;
import dibugger.debuglogic.interpreter.IntValue;
import dibugger.debuglogic.interpreter.LessComparison;
import dibugger.debuglogic.interpreter.Scope;
import dibugger.debuglogic.interpreter.TraceState;
import dibugger.debuglogic.interpreter.Type;
import dibugger.debuglogic.interpreter.VariableTerm;
import dibugger.debuglogic.interpreter.WhileCommand;

public class ComplexCommandTest {

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
        assert (states.size() == k + 1); // k iterations + first check
        assert (s.getValueOf("i").toString().equals(k + ""));
    }
}
