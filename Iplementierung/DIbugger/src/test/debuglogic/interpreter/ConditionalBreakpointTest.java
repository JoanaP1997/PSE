package test.debuglogic.interpreter;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.interpreter.ConditionalBreakpoint;
import dibugger.debuglogic.interpreter.DoubleValue;
import dibugger.debuglogic.interpreter.Scope;
import dibugger.debuglogic.interpreter.ScopeTuple;
import dibugger.debuglogic.interpreter.TraceState;
import dibugger.debuglogic.interpreter.TraceStatePosition;
import dibugger.debuglogic.interpreter.Type;

public class ConditionalBreakpointTest {
    private ConditionalBreakpoint breakpoint;
      
    @Test
    public void testEvaluate_validConstantComparison() throws DIbuggerLogicException {
        //  "valid": no DIbuggerLogicException expected
        List<TraceState> states = new ArrayList<TraceState>();
        states.add(new TraceState(TraceStatePosition.NOTSPECIAL, 1, new Scope()));       
        List<ScopeTuple> scopeTuples = new ArrayList<ScopeTuple>();
        scopeTuples.add(new ScopeTuple(0, 100));

        breakpoint = new ConditionalBreakpoint("0 == 2", scopeTuples);
        assertFalse(breakpoint.evaluate(states));
        
        breakpoint.change("4 == 4", scopeTuples);
        assertTrue(breakpoint.evaluate(states));
    }

    @Test
    public void testEvaluate_validArithmeticComparison() throws DIbuggerLogicException {
        List<TraceState> states = new ArrayList<TraceState>();
        List<ScopeTuple> scopeTuples = Arrays.asList(new ScopeTuple(0, 100));
        Scope scope = new Scope();
        scope.setTypeOf("a", Type.DOUBLE);
        scope.setValueOf("a", new DoubleValue(5.3));
        TraceState state = new TraceState(TraceStatePosition.NOTSPECIAL, 1, scope);
        state.setProgramId("A");
        states.add(state);
        
        breakpoint = new ConditionalBreakpoint("3 + A.a == 8.3");
        assertTrue(breakpoint.evaluate(states));
        
        breakpoint.change("A.a / 5.3 <= 1", scopeTuples);
        assertTrue(breakpoint.evaluate(states));
        
        breakpoint.change("A.a - 7 < -1.6", scopeTuples);
        assertTrue(breakpoint.evaluate(states));
    }
}
