package test.DebugLogic.Interpreter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dibugger.DebugLogic.Interpreter.WatchExpression;

public class WatchExpressionTest {
    WatchExpression we;
    @Test
    public void constantTest() {
	we = new WatchExpression("3-2");
	assert(we.evaluate(null).equals("1"));
	we.change("(4%2)+3", null);
	assert(we.evaluate(null).equals("3"));
	assert(we.evaluate(null).equals("3"));
	we.change("true||false", null);
	assert(we.evaluate(null).equals("true"));
	we.change("!!true", null);
	assert(we.evaluate(null).equals("true"));
	we.change("(5+3)*2 == 5+3*2", null);
	assert(we.evaluate(null).equals("false"));
	we.change("(5+3)*2!=16", null);
	assert(we.evaluate(null).equals("false"));
	we.change("3<1+3", null);
	assert(we.evaluate(null).equals("true"));
    }
}
