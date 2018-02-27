package test.debuglogic.interpreter;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.interpreter.AdditionTerm;
import dibugger.debuglogic.interpreter.AndCondition;
import dibugger.debuglogic.interpreter.ArrayAccessRelationalTerm;
import dibugger.debuglogic.interpreter.ArrayAccessTerm;
import dibugger.debuglogic.interpreter.ArrayValue;
import dibugger.debuglogic.interpreter.BooleanValue;
import dibugger.debuglogic.interpreter.CharValue;
import dibugger.debuglogic.interpreter.ConstantTerm;
import dibugger.debuglogic.interpreter.DivisionTerm;
import dibugger.debuglogic.interpreter.EqualComparison;
import dibugger.debuglogic.interpreter.FloatValue;
import dibugger.debuglogic.interpreter.IntValue;
import dibugger.debuglogic.interpreter.LessComparison;
import dibugger.debuglogic.interpreter.LessEqualComparison;
import dibugger.debuglogic.interpreter.ModuloTerm;
import dibugger.debuglogic.interpreter.MoreComparison;
import dibugger.debuglogic.interpreter.MoreEqualComparison;
import dibugger.debuglogic.interpreter.MultiplicationTerm;
import dibugger.debuglogic.interpreter.NegativeTerm;
import dibugger.debuglogic.interpreter.NotCondition;
import dibugger.debuglogic.interpreter.NotEqualComparison;
import dibugger.debuglogic.interpreter.OrCondition;
import dibugger.debuglogic.interpreter.Scope;
import dibugger.debuglogic.interpreter.SubtractionTerm;
import dibugger.debuglogic.interpreter.Term;
import dibugger.debuglogic.interpreter.TermList;
import dibugger.debuglogic.interpreter.TermValue;
import dibugger.debuglogic.interpreter.TraceState;
import dibugger.debuglogic.interpreter.TraceStatePosition;
import dibugger.debuglogic.interpreter.Type;
import dibugger.debuglogic.interpreter.VariableRelationalTerm;
import dibugger.debuglogic.interpreter.VariableTerm;

/**
 * 
 * @author wagner
 *
 */
public class TermTest {
    Term constantA, constantB, constantTrue, constantFalse;
    Scope currentScope;
    List<TraceState> states;

    @Before
    public void init() {
        constantA = new ConstantTerm(new IntValue(5));
        currentScope = new Scope();
        constantB = new ConstantTerm(new IntValue(7));
        constantTrue = new ConstantTerm(new BooleanValue(true));
        constantFalse = new ConstantTerm(new BooleanValue(false));
        states = new ArrayList<TraceState>();
        Scope s = new Scope();
        s.setValueOf("a", new IntValue(42));
        TraceState stateInA = new TraceState(TraceStatePosition.NOTSPECIAL, 10, s);
        stateInA.setProgramId("A");
        Scope t = new Scope();
        t.setValueOf("b", new FloatValue(3.04f));
        TraceState stateInB = new TraceState(TraceStatePosition.NOTSPECIAL, 10, t);
        stateInB.setProgramId("B");
        states.add(stateInA);
        states.add(stateInB);
        
    }

    @Test
    public void test_variableTerm() throws DIbuggerLogicException {
        Term variableA = new VariableTerm("a");
        Term variableB = new VariableTerm("b");
        Scope s = new Scope();
        s.setValueOf("a", new IntValue(42));
        s.setValueOf("b", new FloatValue(3.04f));
        assertTrue(variableA.evaluate(s).toString().equals("42"));
        assertTrue(variableB.evaluate(s).toString().equals("3.04"));
        Term addition = new AdditionTerm(variableA, variableB);
        assertTrue(addition.evaluate(s).toString().equals("45.04"));
    }

    @Test
    public void test_variableRelationalTerm() throws DIbuggerLogicException {
        Term variableA = new VariableRelationalTerm("A.a");
        Term variableB = new VariableRelationalTerm("B.b");   
        assertTrue(variableA.evaluate(states).toString().equals("42"));
        assertTrue(variableB.evaluate(states).toString().equals("3.04"));
        Term addition = new AdditionTerm(variableA, variableB);
        assertTrue(addition.evaluate(states).toString().equals("45.04"));
    }

    @Test
    public void test_constantTerm() throws DIbuggerLogicException {
        // Constant Term
        assertTrue (constantA.evaluate(currentScope).toString().equals("5"));
        assertTrue (constantB.evaluate(currentScope).toString().equals("7"));
        assertTrue (constantFalse.evaluate(currentScope).toString().equals("false"));
        assertTrue (constantTrue.evaluate(currentScope).toString().equals("true"));
        
        assertTrue (constantA.evaluate(states).toString().equals("5"));
        assertTrue (constantB.evaluate(states).toString().equals("7"));
        assertTrue (constantFalse.evaluate(states).toString().equals("false"));
        assertTrue (constantTrue.evaluate(states).toString().equals("true"));
    }

    @Test
    public void test_multiplicationTerm() throws DIbuggerLogicException {

        // Multiply
        Term mult = new MultiplicationTerm(constantA, constantB);
        assertTrue (mult.evaluate(currentScope).toString().equals("35"));
        assertTrue (mult.evaluate(states).toString().equals("35"));
    }

    @Test
    public void test_divisionTerm() throws DIbuggerLogicException {
        // Div
        Term div = new DivisionTerm(constantA, constantB);
        assertTrue (div.evaluate(currentScope).toString().equals("0"));
        assertTrue (div.evaluate(states).toString().equals("0"));
    }

    @Test
    public void test_additionTerm() throws DIbuggerLogicException {

        Term add = new AdditionTerm(constantA, constantB);
        assertTrue (add.evaluate(currentScope).toString().equals("12"));
        assertTrue (add.evaluate(states).toString().equals("12"));
        assertTrue (add.evaluateToString(states).equals("12"));
    }

    @Test
    public void test_subtractionTerm() throws DIbuggerLogicException {

        Term sub = new SubtractionTerm(constantA, constantB);
        assertTrue (sub.evaluate(currentScope).toString().equals("-2"));
        assertTrue (sub.evaluate(states).toString().equals("-2"));
    }

    @Test
    public void test_moduloTerm() throws DIbuggerLogicException {

        Term mod = new ModuloTerm(constantB, constantA);
        assertTrue (mod.evaluate(currentScope).toString().equals("2"));
        assertTrue (mod.evaluate(states).toString().equals("2"));
    }
    @Test
    public void test_negativeTerm() throws DIbuggerLogicException {
    	 Term negA = new NegativeTerm(constantA);
         Term negB = new NegativeTerm(constantB);
         assertTrue (negA.evaluate(currentScope).toString().equals("-5"));
         assertTrue (negB.evaluate(currentScope).toString().equals("-7"));
         assertTrue (negA.evaluate(states).toString().equals("-5"));
         assertTrue (negB.evaluate(states).toString().equals("-7"));
    }
    //////////////////////////////// Boolean Terms/////////////////////////////
    @Test
    public void test_NotCondition() throws DIbuggerLogicException {

        Term notA = new NotCondition(constantFalse);
        Term notB = new NotCondition(constantTrue);
        assertTrue (notA.evaluate(currentScope).toString().equals("true"));
        assertTrue (notB.evaluate(currentScope).toString().equals("false"));
        assertTrue (notA.evaluate(states).toString().equals("true"));
        assertTrue (notB.evaluate(states).toString().equals("false"));
    }

    @Test
    public void test_OrCondition() throws DIbuggerLogicException {

        Term or = new OrCondition(constantFalse, constantTrue);
        assertTrue (or.evaluate(currentScope).toString().equals("true"));
        assertTrue (or.evaluate(states).toString().equals("true"));
    }
    @Test
    public void test_AndCondition() throws DIbuggerLogicException {

        Term and = new AndCondition(constantFalse, constantTrue);
        assertTrue (and.evaluate(currentScope).toString().equals("false"));
        assertTrue (and.evaluate(states).toString().equals("false"));
        and = new AndCondition(constantTrue, constantTrue);
        assertTrue (and.evaluate(currentScope).toString().equals("true"));
        assertTrue (and.evaluate(states).toString().equals("true"));
    }
    //conditions
    @Test 
    public void test_moreComparison() throws DIbuggerLogicException {
    	Term left = new ConstantTerm(new IntValue(10));
    	Term right = new ConstantTerm(new IntValue(11));
    	MoreComparison comp = new MoreComparison(left, right);
    	assertFalse(comp.evaluate(currentScope).getValue());
    	left = new ConstantTerm(new FloatValue(12.1f));
    	right = new ConstantTerm(new FloatValue(12.01f));
    	comp = new MoreComparison(left,right);
    	assertTrue(comp.evaluate(states).getValue()); 
    	
    }
    @Test 
    public void test_moreEqualComparison() throws DIbuggerLogicException {
    	Term left = new ConstantTerm(new IntValue(10));
    	Term right = new ConstantTerm(new IntValue(10));
    	MoreEqualComparison comp = new MoreEqualComparison(left, right);
    	assertTrue(comp.evaluate(currentScope).getValue());
    	left = new ConstantTerm(new FloatValue(12.1f));
    	right = new ConstantTerm(new FloatValue(12.01f));
    	comp = new MoreEqualComparison(left,right);
    	assertTrue(comp.evaluate(states).getValue()); 
    }
    @Test 
    public void test_equalComparison() throws DIbuggerLogicException {
    	Term left = new ConstantTerm(new IntValue(10));
    	Term right = new ConstantTerm(new IntValue(10));
    	EqualComparison comp = new EqualComparison(left, right);
    	assertTrue(comp.evaluate(currentScope).getValue());
    	left = new ConstantTerm(new FloatValue(12.1f));
    	right = new ConstantTerm(new FloatValue(12.01f));
    	comp = new EqualComparison(left,right);
    	assertFalse(comp.evaluate(states).getValue()); 
    }
    @Test 
    public void test_notEqualComparison() throws DIbuggerLogicException {
    	Term left = new ConstantTerm(new IntValue(10));
    	Term right = new ConstantTerm(new IntValue(10));
    	NotEqualComparison comp = new NotEqualComparison(left, right);
    	assertFalse(comp.evaluate(currentScope).getValue());
    	left = new ConstantTerm(new IntValue(12));
    	right = new ConstantTerm(new FloatValue(12.01f));
    	comp = new NotEqualComparison(left,right);
    	assertTrue(comp.evaluate(states).getValue()); 
    }
    @Test 
    public void test_lessComparison() throws DIbuggerLogicException {
    	Term left = new ConstantTerm(new IntValue(10));
    	Term right = new ConstantTerm(new IntValue(10));
    	LessComparison comp = new LessComparison(left, right);
    	assertFalse(comp.evaluate(currentScope).getValue());
    	left = new ConstantTerm(new FloatValue(12.1f));
    	right = new ConstantTerm(new FloatValue(12.01f));
    	comp = new LessComparison(left,right);
    	assertFalse(comp.evaluate(states).getValue()); 
    	left = new ConstantTerm(new FloatValue(12.0f));
    	right = new ConstantTerm(new FloatValue(12.01f));
    	comp = new LessComparison(left,right);
    	assertTrue(comp.evaluate(states).getValue()); 
    }
    @Test 
    public void test_lessEqualComparison() throws DIbuggerLogicException {
    	Term left = new ConstantTerm(new IntValue(10));
    	Term right = new ConstantTerm(new IntValue(10));
    	LessEqualComparison comp = new LessEqualComparison(left, right);
    	assertTrue(comp.evaluate(currentScope).getValue());
    	left = new ConstantTerm(new FloatValue(12.1f));
    	right = new ConstantTerm(new FloatValue(12.01f));
    	comp = new LessEqualComparison(left,right);
    	assertFalse(comp.evaluate(states).getValue()); 
    	left = new ConstantTerm(new IntValue(12));
    	right = new ConstantTerm(new FloatValue(12.01f));
    	comp = new LessEqualComparison(left,right);
    	assertTrue(comp.evaluate(states).getValue()); 
    }
    //TermList
    @Test
    public void test_termList() throws DIbuggerLogicException {
    	List<Term> theTerms = new ArrayList<Term>();
    	theTerms.add(constantA);
    	theTerms.add(constantB);
    	Term list = new TermList(theTerms);
    	assertEquals(((CharValue) list.evaluate(states)).getValue(),'?');
    	assertEquals(list.evaluate(currentScope).getType(), Type.ARRAY);
    	assertEquals(((ArrayValue)list.evaluate(currentScope)).getValue()[0][0][0].getType(), constantA.evaluate(currentScope).getType());
    	assertTrue(((IntValue) ((ArrayValue)list.evaluate(currentScope)).getValue()[0][0][0]).getValue() == 5);
    }
    //ArrayTerme
    @Test
    public void test_arrayAccessTerm_one_dim() throws DIbuggerLogicException {
    	Term term = new ArrayAccessTerm("a", new ConstantTerm(new IntValue(0)));
    	currentScope.setTypeOf("a", Type.ARRAY);
    	TermValue[][][] array  = new TermValue[2][1][1];
    	array[0][0][0] = new IntValue(20);
    	currentScope.setValueOf("a", new ArrayValue(array)) ;
    	assertEquals(term.evaluate(currentScope).getType(), Type.INT);
    	assertEquals(((CharValue)term.evaluate(states)).getValue(), '?');
    	assertTrue(((IntValue)term.evaluate(currentScope)).getValue()==20);
    }
    @Test
    public void test_arrayAccessTerm_two_dim() throws DIbuggerLogicException {
    	Term term = new ArrayAccessTerm("a", new ConstantTerm(new IntValue(0)), new ConstantTerm(new IntValue(1)));
    	currentScope.setTypeOf("a", Type.ARRAY);
    	TermValue[][][] array  = new TermValue[2][2][1];
    	array[0][0][0] = new CharValue('e');
    	array[0][1][0] = new CharValue('f');
    	currentScope.setValueOf("a", new ArrayValue(array)) ;
    	assertEquals(term.evaluate(currentScope).getType(), Type.CHAR);
    	assertEquals(((CharValue)term.evaluate(states)).getValue(), '?');
    	assertTrue(((CharValue)term.evaluate(currentScope)).getValue()=='f');
    }
    @Test
    public void test_arrayAccessTerm_three_dim() throws DIbuggerLogicException {
    	Term term = new ArrayAccessTerm("a", new ConstantTerm(new IntValue(0)), new ConstantTerm(new IntValue(1)), new ConstantTerm(new IntValue(0)));
    	currentScope.setTypeOf("a", Type.ARRAY);
    	TermValue[][][] array  = new TermValue[2][2][1];
    	array[0][0][0] = new CharValue('e');
    	array[0][1][0] = new CharValue('f');
    	currentScope.setValueOf("a", new ArrayValue(array));
    	assertEquals(term.evaluate(currentScope).getType(), Type.CHAR);
    	assertEquals(((CharValue)term.evaluate(states)).getValue(), '?');
    	assertTrue(((CharValue)term.evaluate(currentScope)).getValue()=='f');
    }
    @Test
    public void test_arrayAccessRelationalTerm_one_dim() throws DIbuggerLogicException {
    	Term term = new ArrayAccessRelationalTerm("Z.a", new ConstantTerm(new IntValue(0)));
    	currentScope.setTypeOf("a", Type.ARRAY);
    	TermValue[][][] array  = new TermValue[2][1][1];
    	array[0][0][0] = new IntValue(20);
    	currentScope.setValueOf("a", new ArrayValue(array));
    	TraceState state = new TraceState(TraceStatePosition.NOTSPECIAL, 0, currentScope);
    	state.setProgramId("Z");
    	states.add(state);
    	assertEquals(term.evaluate(states).getType(), Type.INT);
    	assertEquals(((CharValue)term.evaluate(currentScope)).getValue(), '?');
    	assertTrue(((IntValue)term.evaluate(states)).getValue()==20);
    }
    @Test
    public void test_arrayAccessRelationalTerm_two_dim() throws DIbuggerLogicException {
    	Term term = new ArrayAccessRelationalTerm("Z.a", new ConstantTerm(new IntValue(0)),  new ConstantTerm(new IntValue(1)));
    	currentScope.setTypeOf("a", Type.ARRAY);
    	TermValue[][][] array  = new TermValue[2][2][1];
    	array[0][0][0] = new CharValue('e');
    	array[0][1][0] = new CharValue('f');
    	currentScope.setValueOf("a", new ArrayValue(array));
    	TraceState state = new TraceState(TraceStatePosition.NOTSPECIAL, 0, currentScope);
    	state.setProgramId("Z");
        states.add(state);
    	assertEquals(term.evaluate(states).getType(), Type.CHAR);
    	assertEquals(((CharValue)term.evaluate(currentScope)).getValue(), '?');
    	assertTrue(((CharValue)term.evaluate(states)).getValue()=='f');
    }
    @Test
    public void test_arrayAccessRelationalTerm_three_dim() throws DIbuggerLogicException {
    	Term term = new ArrayAccessRelationalTerm("Z.a", new ConstantTerm(new IntValue(0)),  new ConstantTerm(new IntValue(1)),new ConstantTerm(new IntValue(0)));
    	currentScope.setTypeOf("a", Type.ARRAY);
    	TermValue[][][] array  = new TermValue[2][2][1];
    	array[0][0][0] = new CharValue('e');
    	array[0][1][0] = new CharValue('f');
    	currentScope.setValueOf("a", new ArrayValue(array));
    	TraceState state = new TraceState(TraceStatePosition.NOTSPECIAL, 0, currentScope);
    	state.setProgramId("Z");
    	states.add(state);
    	assertEquals(term.evaluate(states).getType(), Type.CHAR);
    	assertEquals(((CharValue)term.evaluate(currentScope)).getValue(), '?');
    	assertTrue(((CharValue)term.evaluate(states)).getValue()=='f');
    }
}
