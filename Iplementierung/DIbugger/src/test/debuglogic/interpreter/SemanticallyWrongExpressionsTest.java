package test.debuglogic.interpreter;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.IncompatibleTypeException;
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
        
        String variableValue = variableRelational.evaluate(defaultStates);
        assertEquals("?", variableValue);
        
        String comparisonValue = equalComparison.evaluate(defaultStates);
        assertEquals("?", comparisonValue);
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
        WatchExpression multiplication = new WatchExpression("A.a * A.b");
        WatchExpression andCondition = new WatchExpression("A.a && A.b");
        WatchExpression arrayAccess = new WatchExpression("A.a[0]");
        
        defaultScope.setTypeOf("a", Type.BOOLEAN);
        defaultScope.setValueOf("a", new BooleanValue(false));
        defaultScope.setTypeOf("b", Type.DOUBLE);
        defaultScope.setValueOf("b", new DoubleValue(1.0));
        TraceState state = new TraceState(TraceStatePosition.NOTSPECIAL, 0, defaultScope);
        defaultStates.add(state);
        state.setProgramId("A");
        
        String multiplicationValue = multiplication.evaluate(defaultStates);
        assertEquals("?", multiplicationValue);
        
        String conditionValue = andCondition.evaluate(defaultStates);
        assertEquals("?", conditionValue);
        
        String accessValue = arrayAccess.evaluate(defaultStates);
        assertEquals("?", accessValue);
    }
    
    @Test
    @Ignore
    public void testEvaluate_other() throws DIbuggerLogicException {
        WatchExpression expression = new WatchExpression("A.a A.b A.c");
        WatchExpression secondExpression = new WatchExpression("A.a;1234j;jiiop$$$");
        
        defaultScope.setTypeOf("a", Type.INT);
        defaultScope.setValueOf("a", new IntValue(4));
        defaultScope.setTypeOf("b", Type.INT);
        defaultScope.setValueOf("b", new IntValue(4));
        defaultScope.setTypeOf("c", Type.INT);
        defaultScope.setValueOf("c", new IntValue(8));
        TraceState state = new TraceState(TraceStatePosition.NOTSPECIAL, 0, defaultScope);
        defaultStates.add(state);
        state.setProgramId("A");
        
        String value = expression.evaluate(defaultStates);
        assertEquals("?", value);
        
        String secondValue = secondExpression.evaluate(defaultStates);
        assertEquals("?", secondValue);
    }
    
}
