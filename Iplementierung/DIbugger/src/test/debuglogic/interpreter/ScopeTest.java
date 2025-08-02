package test.debuglogic.interpreter;

import static org.junit.Assert.*;

import org.junit.Test;

import dibugger.debuglogic.interpreter.Scope;
import dibugger.debuglogic.interpreter.Type;

public class ScopeTest {

    @Test
    public void test_scope_constructorWithParameters() {
        Scope scope = new Scope(3, Type.CHAR);
        assertEquals(scope.getExpectedReturnType(),Type.CHAR);
        assertEquals(scope.getId(), 3);
        assertEquals(scope.getValues().size(), 0);
        assertEquals(scope.isRoutineFinished(), false);
        
    }

}
