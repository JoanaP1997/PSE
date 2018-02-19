package test.debuglogic.interpreter;

import static org.junit.Assert.*;
import org.junit.Test;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.interpreter.CharValue;
import dibugger.debuglogic.interpreter.DoubleValue;
import dibugger.debuglogic.interpreter.FloatValue;
import dibugger.debuglogic.interpreter.IntValue;
import dibugger.debuglogic.interpreter.LongValue;
import dibugger.debuglogic.interpreter.TermValue;

public class TermValueTest {
	@Test
	public void test_doubleValue_getValue_valid() throws DIbuggerLogicException {
		// normal positive value
		DoubleValue value = new DoubleValue(1.6);
		assertEquals("" + value.getValue(), "1.6");
		// passing an int
		value = new DoubleValue(2);
		assertEquals("" + value.getValue(), "2.0");
		// negative value
		value = new DoubleValue(-2);
		assertEquals("" + value.getValue(), "-2.0");
		value = new DoubleValue(-2.43f);
		assertTrue(Math.abs(value.getValue() + 2.43) <= 0.001);
		value = new DoubleValue(-3.1212124151461785790);
		assertTrue(Math.abs(value.getValue() + 3.1212124151461785790) <= 0.001);
		value = new DoubleValue(5.124567876543211234557);
		assertTrue(Math.abs(value.getValue() - 5.124567876543211234557) <= 0.001);
	}

	@Test
	public void test_floatValue_getValue_valid() throws DIbuggerLogicException {
		// normal positive value
		FloatValue value = new FloatValue(1.6f);
		assertEquals("" + value.getValue(), "1.6");
		// passing an int
		value = new FloatValue(2);
		assertEquals("" + value.getValue(), "2.0");
		// negative value
		value = new FloatValue(-2);
		assertEquals("" + value.getValue(), "-2.0");
		value = new FloatValue(-2.43f);
		assertEquals("" + value.getValue(), "-2.43");
	}

	@Test
	public void test_intValue_getValue_valid() throws DIbuggerLogicException {
		// positive value
		IntValue value = new IntValue(3);
		assertEquals("" + value.getValue(), "3");
		// negative value
		value = new IntValue(-2);
		assertEquals("" + value.getValue(), "-2");
	}

	@Test
	public void test_longValue_getValue_valid() throws DIbuggerLogicException {
		// positive value
		LongValue value = new LongValue(3);
		assertEquals("" + value.getValue(), "3");
		// negative value
		value = new LongValue(-2);
		assertEquals("" + value.getValue(), "-2");
		value = new LongValue(2000000000);
		assertEquals("" + value.getValue(), "2000000000");
		value = new LongValue(-2000000000);
		assertEquals("" + value.getValue(), "-2000000000");
	}

	@Test
	public void test_charValue_getValue_valid() throws DIbuggerLogicException {
		// positive value
		CharValue value = new CharValue('c');
		assertEquals("" + value.getValue(), "c");
		// negative value
		value = new CharValue('4');
		assertEquals("" + value.getValue(), "4");
	}

	// tests the arithmetic operations
	@Test
	public void test_add_float_float_valid() throws DIbuggerLogicException {
		FloatValue v0 = new FloatValue(1.6f);
		FloatValue v1 = new FloatValue(3.2f);
		IntValue i0 = new IntValue(3);
		assertEquals(v0.add(v1).toString(), "4.8");
		assertEquals(v0.add(i0).toString(), "4.6");
		assertEquals(((FloatValue) v0.sub(v1)).getValue(), -1.6f, 0.01f);// float
																			// precison
																			// problem
																			// epsilon
		assertEquals(((FloatValue) v0.mul(v1)).getValue(), 5.12f, 0.01f);
	}

	// tests the clone methods
	@Test
	public void test_clone_float() {
		TermValue tv = new FloatValue(1.5f);
		assertEquals("" + ((FloatValue) tv.clone()).getValue(), "1.5");

	}

	public void test_clone_double() {
		TermValue tv = new DoubleValue(1.534);
		assertEquals("" + ((DoubleValue) tv.clone()).getValue(), "1.534");
	}

	public void test_clone_int() {
		TermValue tv = new IntValue(10);
		assertEquals("" + ((IntValue) tv.clone()).getValue(), "10");
	}

	public void test_clone_long() {
		TermValue tv = new LongValue(100000000);
		assertEquals("" + ((LongValue) tv.clone()).getValue(), "100000000");
	}

	public void test_clone_char() {
		TermValue tv = new CharValue('r');
		assertEquals("" + ((CharValue) tv.clone()).getValue(), "r");
	}
}
