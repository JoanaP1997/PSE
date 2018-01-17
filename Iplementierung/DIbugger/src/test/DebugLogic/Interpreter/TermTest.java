package test.DebugLogic.Interpreter;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dibugger.DebugLogic.Exceptions.DIbuggerLogicException;
import dibugger.DebugLogic.Interpreter.AdditionTerm;
import dibugger.DebugLogic.Interpreter.BooleanValue;
import dibugger.DebugLogic.Interpreter.ConstantTerm;
import dibugger.DebugLogic.Interpreter.DivisionTerm;
import dibugger.DebugLogic.Interpreter.FloatValue;
import dibugger.DebugLogic.Interpreter.IntValue;
import dibugger.DebugLogic.Interpreter.ModuloTerm;
import dibugger.DebugLogic.Interpreter.MultiplicationTerm;
import dibugger.DebugLogic.Interpreter.NotCondition;
import dibugger.DebugLogic.Interpreter.OrCondition;
import dibugger.DebugLogic.Interpreter.Scope;
import dibugger.DebugLogic.Interpreter.SubtractionTerm;
import dibugger.DebugLogic.Interpreter.Term;
import dibugger.DebugLogic.Interpreter.TraceState;
import dibugger.DebugLogic.Interpreter.TraceStatePosition;
import dibugger.DebugLogic.Interpreter.VariableRelationalTerm;
import dibugger.DebugLogic.Interpreter.VariableTerm;

/**
 * 
 * @author wagner
 *
 */
public class TermTest {
	Term constantA, constantB, constantTrue, constantFalse;
	Scope currentScope;

	@Before
	public void init() {
		constantA = new ConstantTerm(new IntValue(5));
		currentScope = new Scope();
		constantB = new ConstantTerm(new IntValue(7));
		constantTrue = new ConstantTerm(new BooleanValue(true));
		constantFalse = new ConstantTerm(new BooleanValue(false));
	}
	@Test
	public void variableTermsTest() throws DIbuggerLogicException {
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
	public void variableRelationalTermsTest() throws DIbuggerLogicException {
	    Term variableA = new VariableRelationalTerm("A.a");
	    Term variableB = new VariableRelationalTerm("B.b");
	    List<TraceState> states = new ArrayList<TraceState>();
	    Scope s = new Scope();
	    s.setValueOf("a", new IntValue(42));
	    TraceState stateInA = new TraceState(TraceStatePosition.NOTSPECIAL, 10, s);
	    Scope t = new Scope();
	    t.setValueOf("b", new FloatValue(3.04f));
	    TraceState stateInB = new TraceState(TraceStatePosition.NOTSPECIAL, 10, t);
	    states.add(stateInA);
	    states.add(stateInB);
	    assert (variableA.evaluate(states).toString().equals("42"));
	    assert (variableB.evaluate(states).toString().equals("3.04"));
	    Term addition = new AdditionTerm(variableA, variableB);
	    assert (addition.evaluate(states).toString().equals("45.04"));
	}
	@Test
	public void constantTermsTest() throws DIbuggerLogicException {
		// Constant Term
		assert (constantA.evaluate(currentScope).toString().equals("5"));
		assert (constantB.evaluate(currentScope).toString().equals("7"));
		assert (constantFalse.evaluate(currentScope).toString().equals("false"));
		assert (constantTrue.evaluate(currentScope).toString().equals("true"));
	}

	@Test
	public void multiplicationTermsTest() throws DIbuggerLogicException {

		// Multiply
		Term mult = new MultiplicationTerm(constantA, constantB);
		assert (mult.evaluate(currentScope).toString().equals("35"));
	}

	@Test
	public void divisionTermsTest() throws DIbuggerLogicException {
		// Div
		Term div = new DivisionTerm(constantA, constantB);
		// System.out.println(div.evaluate(currentScope).toString());
		assert (div.evaluate(currentScope).toString().equals("0"));
	}

	@Test
	public void additionTermsTest() throws DIbuggerLogicException {

		Term add = new AdditionTerm(constantA, constantB);
		// System.out.println(div.evaluate(currentScope).toString());
		assert (add.evaluate(currentScope).toString().equals("12"));
	}

	@Test
	public void subtractionTermsTest() throws DIbuggerLogicException {

		Term sub = new SubtractionTerm(constantA, constantB);
		// System.out.println(div.evaluate(currentScope).toString());
		assert (sub.evaluate(currentScope).toString().equals("-2"));
	}

	@Test
	public void moduloTermsTest() throws DIbuggerLogicException {

		Term mod = new ModuloTerm(constantB, constantA);
		// System.out.println(mod.evaluate(currentScope).toString());
		assert (mod.evaluate(currentScope).toString().equals("2"));
	}

	//////////////////////////////// Boolean Terms/////////////////////////////
	@Test
	public void NotConditionTermsTest() throws DIbuggerLogicException {

		Term notA = new NotCondition(constantFalse);
		Term notB = new NotCondition(constantTrue);
		// System.out.println(mod.evaluate(currentScope).toString());
		assert (notA.evaluate(currentScope).toString().equals("true"));
		assert (notB.evaluate(currentScope).toString().equals("false"));
	}

	@Test
	public void OrConditionTermsTest() throws DIbuggerLogicException {

		Term or = new OrCondition(constantFalse, constantTrue);
		// System.out.println(mod.evaluate(currentScope).toString());
		assert (or.evaluate(currentScope).toString().equals("true"));
	}
}
