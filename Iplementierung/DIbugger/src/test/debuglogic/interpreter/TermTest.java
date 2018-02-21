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
import dibugger.debuglogic.interpreter.BooleanValue;
import dibugger.debuglogic.interpreter.ConstantTerm;
import dibugger.debuglogic.interpreter.DivisionTerm;
import dibugger.debuglogic.interpreter.FloatValue;
import dibugger.debuglogic.interpreter.IntValue;
import dibugger.debuglogic.interpreter.ModuloTerm;
import dibugger.debuglogic.interpreter.MultiplicationTerm;
import dibugger.debuglogic.interpreter.NegativeTerm;
import dibugger.debuglogic.interpreter.NotCondition;
import dibugger.debuglogic.interpreter.OrCondition;
import dibugger.debuglogic.interpreter.Scope;
import dibugger.debuglogic.interpreter.SubtractionTerm;
import dibugger.debuglogic.interpreter.Term;
import dibugger.debuglogic.interpreter.TraceState;
import dibugger.debuglogic.interpreter.TraceStatePosition;
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
        assert (variableA.evaluate(s).toString().equals("42"));
        assert (variableB.evaluate(s).toString().equals("3.04"));
        Term addition = new AdditionTerm(variableA, variableB);
        assert (addition.evaluate(s).toString().equals("45.04"));
    }

    @Test
    public void test_variableRelationalTerm() throws DIbuggerLogicException {
        Term variableA = new VariableRelationalTerm("A.a");
        Term variableB = new VariableRelationalTerm("B.b");   
        assert (variableA.evaluate(states).toString().equals("42"));
        assert (variableB.evaluate(states).toString().equals("3.04"));
        Term addition = new AdditionTerm(variableA, variableB);
        assert (addition.evaluate(states).toString().equals("45.04"));
    }

    @Test
    public void test_constantTerm() throws DIbuggerLogicException {
        // Constant Term
        assert (constantA.evaluate(currentScope).toString().equals("5"));
        assert (constantB.evaluate(currentScope).toString().equals("7"));
        assert (constantFalse.evaluate(currentScope).toString().equals("false"));
        assert (constantTrue.evaluate(currentScope).toString().equals("true"));
        
        assert (constantA.evaluate(states).toString().equals("5"));
        assert (constantB.evaluate(states).toString().equals("7"));
        assert (constantFalse.evaluate(states).toString().equals("false"));
        assert (constantTrue.evaluate(states).toString().equals("true"));
    }

    @Test
    public void test_multiplicationTerm() throws DIbuggerLogicException {

        // Multiply
        Term mult = new MultiplicationTerm(constantA, constantB);
        assert (mult.evaluate(currentScope).toString().equals("35"));
        assert (mult.evaluate(states).toString().equals("35"));
    }

    @Test
    public void test_divisionTerm() throws DIbuggerLogicException {
        // Div
        Term div = new DivisionTerm(constantA, constantB);
        assert (div.evaluate(currentScope).toString().equals("0"));
        assert (div.evaluate(states).toString().equals("0"));
    }

    @Test
    public void test_additionTerm() throws DIbuggerLogicException {

        Term add = new AdditionTerm(constantA, constantB);
        assert (add.evaluate(currentScope).toString().equals("12"));
        assert (add.evaluate(states).toString().equals("12"));
    }

    @Test
    public void test_subtractionTerm() throws DIbuggerLogicException {

        Term sub = new SubtractionTerm(constantA, constantB);
        assert (sub.evaluate(currentScope).toString().equals("-2"));
        assert (sub.evaluate(states).toString().equals("-2"));
    }

    @Test
    public void test_moduloTerm() throws DIbuggerLogicException {

        Term mod = new ModuloTerm(constantB, constantA);
        assert (mod.evaluate(currentScope).toString().equals("2"));
        assert (mod.evaluate(states).toString().equals("2"));
    }
    @Test
    public void test_negativeTerm() throws DIbuggerLogicException {
    	 Term negA = new NegativeTerm(constantA);
         Term negB = new NegativeTerm(constantB);
         assert (negA.evaluate(currentScope).toString().equals("-5"));
         assert (negB.evaluate(currentScope).toString().equals("-7"));
         assert (negA.evaluate(states).toString().equals("-5"));
         assert (negB.evaluate(states).toString().equals("-7"));
    }
    //////////////////////////////// Boolean Terms/////////////////////////////
    @Test
    public void test_NotCondition() throws DIbuggerLogicException {

        Term notA = new NotCondition(constantFalse);
        Term notB = new NotCondition(constantTrue);
        assert (notA.evaluate(currentScope).toString().equals("true"));
        assert (notB.evaluate(currentScope).toString().equals("false"));
        assert (notA.evaluate(states).toString().equals("true"));
        assert (notB.evaluate(states).toString().equals("false"));
    }

    @Test
    public void test_OrCondition() throws DIbuggerLogicException {

        Term or = new OrCondition(constantFalse, constantTrue);
        assert (or.evaluate(currentScope).toString().equals("true"));
        assert (or.evaluate(states).toString().equals("true"));
    }
    @Test
    public void test_AndCondition() throws DIbuggerLogicException {

        Term and = new AndCondition(constantFalse, constantTrue);
        assert (and.evaluate(currentScope).toString().equals("false"));
        assert (and.evaluate(states).toString().equals("false"));
        and = new AndCondition(constantTrue, constantTrue);
        assert (and.evaluate(currentScope).toString().equals("true"));
        assert (and.evaluate(states).toString().equals("true"));
    }
    //conditions
    
}
