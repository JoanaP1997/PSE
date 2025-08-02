package test.debuglogic.interpreter;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.WatchExpressionSyntaxException;
import dibugger.debuglogic.interpreter.IntValue;
import dibugger.debuglogic.interpreter.Scope;
import dibugger.debuglogic.interpreter.TraceState;
import dibugger.debuglogic.interpreter.TraceStatePosition;
import dibugger.debuglogic.interpreter.Type;
import dibugger.debuglogic.interpreter.WatchExpression;

public class SyntacticallyWrongExpressionsTest {

	@Test
	public void test_variablesWithoutProgrammIds() throws DIbuggerLogicException {
		WatchExpression we = new WatchExpression("a");
		List<TraceState> states = new ArrayList<TraceState>();
		Scope s = new Scope();
		s.setTypeOf("a", Type.INT);
		s.setValueOf("a", new IntValue(3));
		states.add(new TraceState(TraceStatePosition.NOTSPECIAL,0,s));
		assertEquals(we.evaluate(states).toString(),"?");
		we = new WatchExpression("b");
		assertEquals(we.evaluate(states).toString(), "?");
		we = new WatchExpression("a+b");
		assertEquals(we.evaluate(states).toString(), "?");
	}
	@Test(expected=WatchExpressionSyntaxException.class)
	public void test_unknownOperatorA() throws DIbuggerLogicException {
		WatchExpression we = new WatchExpression("~a");
		List<TraceState> states = new ArrayList<TraceState>();
		Scope s = new Scope();
		s.setTypeOf("a", Type.INT);
		s.setValueOf("a", new IntValue(3));
		states.add(new TraceState(TraceStatePosition.NOTSPECIAL,0,s));
		we.evaluate(states);
	}
	@Test(expected=WatchExpressionSyntaxException.class)
	public void test_unknownOperatorB() throws DIbuggerLogicException {
		WatchExpression we = new WatchExpression("~a");
		List<TraceState> states = new ArrayList<TraceState>();
		Scope s = new Scope();
		s.setTypeOf("a", Type.INT);
		s.setValueOf("a", new IntValue(3));
		states.add(new TraceState(TraceStatePosition.NOTSPECIAL,0,s));
		we.evaluate(states);
	}
	@Test(expected=WatchExpressionSyntaxException.class)
	public void test_unknownOperatorC() throws DIbuggerLogicException {
		WatchExpression we = new WatchExpression("[a");
		List<TraceState> states = new ArrayList<TraceState>();
		Scope s = new Scope();
		s.setTypeOf("a", Type.INT);
		s.setValueOf("a", new IntValue(3));
		states.add(new TraceState(TraceStatePosition.NOTSPECIAL,0,s));
		we.evaluate(states);
	}
	@Test(expected=WatchExpressionSyntaxException.class)
	public void test_unknownOperatorE() throws DIbuggerLogicException {
		WatchExpression we = new WatchExpression("3.1.a");
		List<TraceState> states = new ArrayList<TraceState>();
		Scope s = new Scope();
		s.setTypeOf("a", Type.INT);
		s.setValueOf("a", new IntValue(3));
		states.add(new TraceState(TraceStatePosition.NOTSPECIAL,0,s));
		System.out.println(we.evaluate(states));
	}
	@Test(expected=WatchExpressionSyntaxException.class)
	public void test_unknownOperatorF() throws DIbuggerLogicException {
		WatchExpression we = new WatchExpression(",,a");
		List<TraceState> states = new ArrayList<TraceState>();
		Scope s = new Scope();
		s.setTypeOf("a", Type.INT);
		s.setValueOf("a", new IntValue(3));
		states.add(new TraceState(TraceStatePosition.NOTSPECIAL,0,s));
		System.out.println(we.evaluate(states));
	}
	@Test(expected=WatchExpressionSyntaxException.class)
	public void test_unknownOperatorG() throws DIbuggerLogicException {
		WatchExpression we = new WatchExpression("[3.4f");
		List<TraceState> states = new ArrayList<TraceState>();
		Scope s = new Scope();
		s.setTypeOf("a", Type.INT);
		s.setValueOf("a", new IntValue(3));
		states.add(new TraceState(TraceStatePosition.NOTSPECIAL,0,s));
		we.evaluate(states);
	}
	@Test(expected=WatchExpressionSyntaxException.class)
	public void test_unknownOperatorH() throws DIbuggerLogicException {
		WatchExpression we = new WatchExpression("arr<>3.1;");
		List<TraceState> states = new ArrayList<TraceState>();
		Scope s = new Scope();
		s.setTypeOf("a", Type.INT);
		s.setValueOf("a", new IntValue(3));
		states.add(new TraceState(TraceStatePosition.NOTSPECIAL,0,s));
		we.evaluate(states);
	}
	@Test(expected=WatchExpressionSyntaxException.class)
	public void test_unknownOperatorI() throws DIbuggerLogicException {
		WatchExpression we = new WatchExpression("a+=b");
		List<TraceState> states = new ArrayList<TraceState>();
		Scope s = new Scope();
		s.setTypeOf("a", Type.INT);
		s.setValueOf("a", new IntValue(3));
		states.add(new TraceState(TraceStatePosition.NOTSPECIAL,0,s));
		we.evaluate(states);
	}
}
