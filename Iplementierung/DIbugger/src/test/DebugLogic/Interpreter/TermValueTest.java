package test.DebugLogic.Interpreter;

import static org.junit.Assert.*;
import org.junit.Test;

import dibugger.DebugLogic.Interpreter.FloatValue;
import dibugger.DebugLogic.Interpreter.IntValue;

public class TermValueTest {
	
	@Test
	public void FloatValueTest(){
		FloatValue v0 = new FloatValue(1.6f);
		FloatValue v1 = new FloatValue(3.2f);
		IntValue i0 = new IntValue(3);
		
		assertEquals(v0.add(v1).toString(), "4.8");
		assertEquals(v0.add(i0).toString(), "4.6");
		assertEquals(((FloatValue)v0.sub(v1)).getValue(), -1.6f, 0.01f);//float precison problem epsilon
		assertEquals(((FloatValue)v0.mul(v1)).getValue(), 5.12f, 0.01f);
	}
	
}
