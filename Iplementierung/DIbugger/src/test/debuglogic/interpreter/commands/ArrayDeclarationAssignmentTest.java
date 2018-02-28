package test.debuglogic.interpreter.commands;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import dibugger.debuglogic.exceptions.AlreadyDeclaredException;
import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.WrongNumberArgumentException;
import dibugger.debuglogic.interpreter.ArrayDeclarationAssignment;
import dibugger.debuglogic.interpreter.ArrayValue;
import dibugger.debuglogic.interpreter.Command;
import dibugger.debuglogic.interpreter.ConstantTerm;
import dibugger.debuglogic.interpreter.GenerationController;
import dibugger.debuglogic.interpreter.IntValue;
import dibugger.debuglogic.interpreter.Scope;
import dibugger.debuglogic.interpreter.TermList;
import dibugger.debuglogic.interpreter.TermValue;
import dibugger.debuglogic.interpreter.TraceState;
import dibugger.debuglogic.interpreter.Type;

public class ArrayDeclarationAssignmentTest {
    private TermList simpleIntTermList;
    private GenerationController defaultController;
    
    @Before
    public void setUp() {
        defaultController = new GenerationController(1000, 1000);
        simpleIntTermList = new TermList(Arrays.asList(
                new ConstantTerm(new IntValue(1)), 
                new ConstantTerm(new IntValue(2)), 
                new ConstantTerm(new IntValue(3))));
    }
    
    public static boolean areEqual(ArrayValue one, ArrayValue other) throws DIbuggerLogicException {
        if (one == other) {
            return true;
        }
        
        boolean areEqual = true;
        
        if (one == null || other == null) {
            areEqual = false;
        }
        
        TermValue[][][] onesValue = one.getValue();
        TermValue[][][] otherValue = ((ArrayValue)other).getValue();
 
        int iSize = onesValue.length;
        int jSize = onesValue[0].length;
        int kSize = onesValue[0][0].length;
        
        for (int i = 0; (i < iSize) && areEqual; i++) {
            areEqual = onesValue[i].length == otherValue[i].length;
            for (int j = 0; (j < jSize) && areEqual; j++) {
                areEqual = onesValue[i][j].length == otherValue[i][j].length;
                for (int k = 0; (k < kSize) && areEqual; k++) {
                    areEqual = onesValue[i][j][k].equal(otherValue[i][j][k]);
                }
            }
        }
        return areEqual;
    }
    
    @Test
    public void testRun_valid() throws DIbuggerLogicException {
        Scope scope = new Scope();
        defaultController.pushScope(scope);
        
        Command assignment = new ArrayDeclarationAssignment(defaultController, 0, "testArray", new ConstantTerm(new IntValue(3)), simpleIntTermList);
        List<TraceState> result = assignment.run();
        
        assertEquals(scope.getTypeOf("testArray"), Type.ARRAY);
        assertSame(result.size(), 1);
        
        TermValue value = scope.getValueOf("testArray");
        ArrayValue arrayValue = (ArrayValue)value;
        
        TermValue[][][] expectedValue = new TermValue[][][] {{{new IntValue(1)}}, {{new IntValue(2)}}, {{new IntValue(3)}}};
        ArrayValue expected = new ArrayValue(expectedValue);
        
        assertTrue(areEqual(arrayValue, expected));
    }
    
    @Test(expected = AlreadyDeclaredException.class)
    public void test_alreadyDeclared() throws DIbuggerLogicException {
        Scope scope = new Scope();
        defaultController.pushScope(scope);

        Command assignment = new ArrayDeclarationAssignment(defaultController, 0, "testArray", 
                new ConstantTerm(new IntValue(3)), 
                simpleIntTermList);
        Command secondAssignment = new ArrayDeclarationAssignment(defaultController, 0, "testArray", 
                new ConstantTerm(new IntValue(0)), 
                new TermList(new ArrayList<>()));
        
        assignment.run();       //  once 
        secondAssignment.run(); //  twice
    }
    
    @Test(expected = WrongNumberArgumentException.class)
    public void test_invalidSizeArgument() throws DIbuggerLogicException {
        Scope scope = new Scope();
        defaultController.pushScope(scope);
        ArrayDeclarationAssignment assignment = new ArrayDeclarationAssignment(defaultController, 0, "testArray", 
                new ConstantTerm(new IntValue(0)), 
                simpleIntTermList);
        
        assignment.run();
    }
}
