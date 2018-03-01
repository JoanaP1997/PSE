package test.debuglogic.interpreter;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.IncompatibleTypeException;
import dibugger.debuglogic.exceptions.VariableNotFoundException;
import dibugger.debuglogic.interpreter.BooleanValue;
import dibugger.debuglogic.interpreter.DoubleValue;
import dibugger.debuglogic.interpreter.IntValue;
import dibugger.debuglogic.interpreter.Scope;
import dibugger.debuglogic.interpreter.TraceState;
import dibugger.debuglogic.interpreter.TraceStatePosition;
import dibugger.debuglogic.interpreter.Type;
import dibugger.debuglogic.interpreter.WatchExpression;

public class SemanticallyWrongExpressionsTest {
    private List<TraceState> defaultStates;
    private Scope defaultScope;
    
    @Before
    public void setUp() {
        defaultStates = new ArrayList<>();
        defaultScope = new Scope();
    }
    
    @Test
    public void testEvaluate_variableNotFound() throws DIbuggerLogicException {
        WatchExpression variableRelational = new WatchExpression("A.a");
        WatchExpression equalComparison = new WatchExpression("A.a == 5"); 
        
        defaultScope.setTypeOf("a", Type.INT);
        defaultScope.setValueOf("a", new IntValue(5));
        TraceState state = new TraceState(TraceStatePosition.NOTSPECIAL, 0, defaultScope);
        defaultStates.add(state);
        state.setProgramId("B");
        
        String variableResult = variableRelational.evaluate(defaultStates);
        assertEquals("?", variableResult);
        
        String comparisonResult = equalComparison.evaluate(defaultStates);
        assertEquals("false", comparisonResult);
    }
    
    @Test(expected = IncompatibleTypeException.class)
    @Ignore
    public void testEvaluate_exceptionThrown_incompatibleType() throws DIbuggerLogicException {
        WatchExpression expression = new WatchExpression("A.a * A.b");

        defaultScope.setTypeOf("a", Type.BOOLEAN);
        defaultScope.setValueOf("a", new BooleanValue(false));
        defaultScope.setTypeOf("b", Type.DOUBLE);
        defaultScope.setValueOf("b", new DoubleValue(1.0));
        TraceState state = new TraceState(TraceStatePosition.NOTSPECIAL, 0, defaultScope);
        defaultStates.add(state);
        state.setProgramId("A");
        
        expression.evaluate(defaultStates);
    }
    
    @Test
    public void testEvaluate_incompatibleType() throws DIbuggerLogicException {
        WatchExpression expression = new WatchExpression("A.a * A.b");

        defaultScope.setTypeOf("a", Type.BOOLEAN);
        defaultScope.setValueOf("a", new BooleanValue(false));
        defaultScope.setTypeOf("b", Type.DOUBLE);
        defaultScope.setValueOf("b", new DoubleValue(1.0));
        TraceState state = new TraceState(TraceStatePosition.NOTSPECIAL, 0, defaultScope);
        defaultStates.add(state);
        state.setProgramId("A");
        
        String result = expression.evaluate(defaultStates);
        assertEquals("?", result);
    }
}
