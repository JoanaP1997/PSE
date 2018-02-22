package test.debuglogic.interpreter;

import static org.junit.Assert.*;

import java.util.SplittableRandom;

import org.junit.Test;



import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.interpreter.BooleanValue;
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
	@Test
	public void test_booleanValue_getValue_valid() throws DIbuggerLogicException {
		// positive value
		BooleanValue valueTrue = new BooleanValue(true);
		assertEquals("" + valueTrue.getValue(), "true");
		// negative value
		BooleanValue valueFalse = new BooleanValue(false);
		assertEquals("" + valueFalse.getValue(), "false");
	}
	// tests the arithmetic operations
//	@Test
//	public void test_add_double_double_valid() throws DIbuggerLogicException {
//		DoubleValue v0 = new DoubleValue(1.6);
//		DoubleValue v1 = new DoubleValue(3.2);
//		assertTrue(Math.abs(((DoubleValue)v0.add(v1)).getValue()-4.8)<0.001);
//		assertTrue(Math.abs(((DoubleValue)v1.add(v1)).getValue()-6.4)<0.001);
//	}
//	@Test
//	public void test_add_float_float_valid() throws DIbuggerLogicException {
//		FloatValue v0 = new FloatValue(1.6f);
//		FloatValue v1 = new FloatValue(3.2f);
//		assertEquals(v0.add(v1).toString(), "4.8");
//		assertEquals(v1.add(v1).toString(), "6.4");
//	}
//	@Test
//	public void test_add_int_int_valid() throws DIbuggerLogicException {
//		IntValue i0 = new IntValue(3);
//		IntValue i1 = new IntValue(332);
//		assertEquals(i0.add(i1).toString(), "335");
//		assertEquals(i1.add(i1).toString(), "664");
//	}
//	@Test
//	public void test_add_long_long_valid() throws DIbuggerLogicException {
//		LongValue l0 = new LongValue(302392311);
//		LongValue l1 = new LongValue(332L);
//		assertEquals(l0.add(l1).toString(), String.valueOf(302392311+332L));
//		assertEquals(l1.add(l1).toString(), "664");
//	}
	@Test
	public void test_add_char_char_valid() throws DIbuggerLogicException {
		CharValue c1 = new CharValue('#'); //0x23
		CharValue c2 = new CharValue('%'); //0x25
		assertEquals(c1.add(c2).toString(), "H"); //H = 0x48
	}
	// tests the clone methods
	@Test
	public void test_clone_float() {
		TermValue tv = new FloatValue(1.5f);
		assertEquals("" + ((FloatValue) tv.clone()).getValue(), "1.5");

	}
	@Test
	public void test_clone_double() {
		TermValue tv = new DoubleValue(1.534);
		assertEquals("" + ((DoubleValue) tv.clone()).getValue(), "1.534");
	}
	@Test
	public void test_clone_int() {
		TermValue tv = new IntValue(10);
		assertEquals("" + ((IntValue) tv.clone()).getValue(), "10");
	}
	@Test
	public void test_clone_long() {
		TermValue tv = new LongValue(100000000);
		assertEquals("" + ((LongValue) tv.clone()).getValue(), "100000000");
	}
	@Test
	public void test_clone_char() {
		TermValue tv = new CharValue('r');
		assertEquals("" + ((CharValue) tv.clone()).getValue(), "r");
	}
	@Test
	public void test_clone_boolean() {
		TermValue tv = new BooleanValue(true);
		assertEquals("" + ((BooleanValue) tv.clone()).getValue(), "true");
	}
	
	//Arithmetic Test 
	@Test
	public void test_arythmetic_operations() throws DIbuggerLogicException{
		SplittableRandom rand = new SplittableRandom();
		int cycleAmount = 100;
		for(int i=0;i<cycleAmount;++i){
			int i_a_v = rand.nextInt();
			int i_b_v = rand.nextInt();	
			float f_a_v = (float) rand.nextDouble() * Float.MAX_VALUE;
			float f_b_v = (float) rand.nextDouble() * Float.MAX_VALUE;
			long l_a_v = (long) rand.nextLong();
			long l_b_v = (long) rand.nextLong();	
			double d_a_v = rand.nextDouble() * Double.MAX_VALUE;
			double d_b_v = rand.nextDouble() * Double.MAX_VALUE;
			
			IntValue i_a = new IntValue(i_a_v);
			IntValue i_b = new IntValue(i_b_v);
			FloatValue f_a = new FloatValue(f_a_v);
			FloatValue f_b = new FloatValue(f_b_v);
			LongValue l_a = new LongValue(l_a_v);
			LongValue l_b = new LongValue(l_b_v);
			DoubleValue d_a = new DoubleValue(d_a_v);
			DoubleValue d_b = new DoubleValue(d_b_v);
						
			//Comparisons
			//int int
			String[] correct = _generate_correct_arithmetic_results(i_a_v, i_b_v);
			_test_arithmeticOperations(i_a, i_b, correct);
				//int float
				correct = _generate_correct_arithmetic_results(i_a_v, f_b_v);
				_test_arithmeticOperations(i_a, f_b, correct);
				//int long
				correct = _generate_correct_arithmetic_results(i_a_v, l_b_v);
				_test_arithmeticOperations(i_a, l_b, correct);
				//int double
				correct = _generate_correct_arithmetic_results(i_a_v, d_b_v);
				_test_arithmeticOperations(i_a, d_b, correct);
			//float float
			correct = _generate_correct_arithmetic_results(f_a_v, f_b_v);
			_test_arithmeticOperations(f_a, f_b, correct);
				//float int
				correct = _generate_correct_arithmetic_results(f_a_v, i_b_v);
				_test_arithmeticOperations(f_a, i_b, correct);
				//float long
				correct = _generate_correct_arithmetic_results(f_a_v, l_b_v);
				_test_arithmeticOperations(f_a, l_b, correct);
				//float double
				correct = _generate_correct_arithmetic_results(f_a_v, d_b_v);
				_test_arithmeticOperations(f_a, d_b, correct);
			//long long
			correct = _generate_correct_arithmetic_results(l_a_v, l_b_v);
			_test_arithmeticOperations(l_a, l_b, correct);
				//long int
				correct = _generate_correct_arithmetic_results(l_a_v, i_b_v);
				_test_arithmeticOperations(l_a, i_b, correct);
				//long float
				correct = _generate_correct_arithmetic_results(l_a_v, f_b_v);
				_test_arithmeticOperations(l_a, f_b, correct);
				//long double
				correct = _generate_correct_arithmetic_results(l_a_v, d_b_v);
				_test_arithmeticOperations(l_a, d_b, correct);
			//double double
			correct = _generate_correct_arithmetic_results(d_a_v, d_b_v);
			_test_arithmeticOperations(d_a, d_b, correct);
				//double int
				correct = _generate_correct_arithmetic_results(d_a_v, i_b_v);
				_test_arithmeticOperations(d_a, i_b, correct);
				//double float
				correct = _generate_correct_arithmetic_results(d_a_v, f_b_v);
				_test_arithmeticOperations(d_a, l_b, correct);
				//double long
				correct = _generate_correct_arithmetic_results(d_a_v, l_b_v);
				_test_arithmeticOperations(d_a, l_b, correct);
		}
	}
	
	//Helper methods
	private String[] _generate_correct_arithmetic_results(Number a, Number b){
		String[] results = new String[10];
		if(a instanceof Integer){
			if(b instanceof Integer){
				results[0] = ""+((int)a+(int)b);
				results[1] = ""+((int)a-(int)b);
				results[2] = ""+((int)a*(int)b);
				results[3] = ""+((int)a/(int)b);
				results[4] = ""+((int)a%(int)b);
				
				results[5] = ""+((int)a>=(int)b);
				results[6] = ""+((int)a<=(int)b);
				results[7] = ""+((int)a>(int)b);
				results[8] = ""+((int)a<(int)b);
				results[9] = ""+((int)a==(int)b);
			}	
			else if(b instanceof Float){
				results[0] = ""+((int)a+(float)b);
				results[1] = ""+((int)a-(float)b);
				results[2] = ""+((int)a*(float)b);
				results[3] = ""+((int)a/(float)b);
				results[4] = ""+((int)a%(float)b);
				
				results[5] = ""+((int)a>=(float)b);
				results[6] = ""+((int)a<=(float)b);
				results[7] = ""+((int)a>(float)b);
				results[8] = ""+((int)a<(float)b);	
				results[9] = ""+((int)a==(float)b);
			}
			else if(b instanceof Long){
				results[0] = ""+((int)a+(long)b);
				results[1] = ""+((int)a-(long)b);
				results[2] = ""+((int)a*(long)b);
				results[3] = ""+((int)a/(long)b);
				results[4] = ""+((int)a%(long)b);

				results[5] = ""+((int)a>=(long)b);
				results[6] = ""+((int)a<=(long)b);
				results[7] = ""+((int)a>(long)b);
				results[8] = ""+((int)a<(long)b);	
				results[9] = ""+((int)a==(long)b);
			}
			else if(b instanceof Double){
				results[0] = ""+((int)a+(double)b);
				results[1] = ""+((int)a-(double)b);
				results[2] = ""+((int)a*(double)b);
				results[3] = ""+((int)a/(double)b);
				results[4] = ""+((int)a%(double)b);
				
				results[5] = ""+((int)a>=(double)b);
				results[6] = ""+((int)a<=(double)b);
				results[7] = ""+((int)a>(double)b);
				results[8] = ""+((int)a<(double)b);
				results[9] = ""+((int)a==(double)b);
			}
		}	
		else if(a instanceof Float){
			if(b instanceof Integer){
				results[0] = ""+((float)a+(int)b);
				results[1] = ""+((float)a-(int)b);
				results[2] = ""+((float)a*(int)b);
				results[3] = ""+((float)a/(int)b);
				results[4] = ""+((float)a%(int)b);
				
				results[5] = ""+((float)a>=(int)b);
				results[6] = ""+((float)a<=(int)b);
				results[7] = ""+((float)a>(int)b);
				results[8] = ""+((float)a<(int)b);	
				results[9] = ""+((float)a==(int)b);
			}	
			else if(b instanceof Float){
				results[0] = ""+((float)a+(float)b);
				results[1] = ""+((float)a-(float)b);
				results[2] = ""+((float)a*(float)b);
				results[3] = ""+((float)a/(float)b);
				results[4] = ""+((float)a%(float)b);
				
				results[5] = ""+((float)a>=(float)b);
				results[6] = ""+((float)a<=(float)b);
				results[7] = ""+((float)a>(float)b);
				results[8] = ""+((float)a<(float)b);
				results[9] = ""+((float)a==(float)b);
			}
			else if(b instanceof Long){
				results[0] = ""+((float)a+(long)b);
				results[1] = ""+((float)a-(long)b);
				results[2] = ""+((float)a*(long)b);
				results[3] = ""+((float)a/(long)b);
				results[4] = ""+((float)a%(long)b);
				
				results[5] = ""+((float)a>=(long)b);
				results[6] = ""+((float)a<=(long)b);
				results[7] = ""+((float)a>(long)b);
				results[8] = ""+((float)a<(long)b);	
				results[9] = ""+((float)a==(long)b);
			}
			else if(b instanceof Double){
				results[0] = ""+((float)a+(double)b);
				results[1] = ""+((float)a-(double)b);
				results[2] = ""+((float)a*(double)b);
				results[3] = ""+((float)a/(double)b);
				results[4] = ""+((float)a%(double)b);
				
				results[5] = ""+((float)a>=(double)b);
				results[6] = ""+((float)a<=(double)b);
				results[7] = ""+((float)a>(double)b);
				results[8] = ""+((float)a<(double)b);	
				results[9] = ""+((float)a==(double)b);
			}
		}
		else if(a instanceof Long){
			if(b instanceof Integer){
				results[0] = ""+((long)a+(int)b);
				results[1] = ""+((long)a-(int)b);
				results[2] = ""+((long)a*(int)b);
				results[3] = ""+((long)a/(int)b);
				results[4] = ""+((long)a%(int)b);
				
				results[5] = ""+((long)a>=(int)b);
				results[6] = ""+((long)a<=(int)b);
				results[7] = ""+((long)a>(int)b);
				results[8] = ""+((long)a<(int)b);	
				results[9] = ""+((long)a==(int)b);
			}	
			else if(b instanceof Float){
				results[0] = ""+((long)a+(float)b);
				results[1] = ""+((long)a-(float)b);
				results[2] = ""+((long)a*(float)b);
				results[3] = ""+((long)a/(float)b);
				results[4] = ""+((long)a%(float)b);

				results[5] = ""+((long)a>=(float)b);
				results[6] = ""+((long)a<=(float)b);
				results[7] = ""+((long)a>(float)b);
				results[8] = ""+((long)a<(float)b);	
				results[9] = ""+((long)a==(float)b);
			}
			else if(b instanceof Long){
				results[0] = ""+((long)a+(long)b);
				results[1] = ""+((long)a-(long)b);
				results[2] = ""+((long)a*(long)b);
				results[3] = ""+((long)a/(long)b);
				results[4] = ""+((long)a%(long)b);
				
				results[5] = ""+((long)a>=(long)b);
				results[6] = ""+((long)a<=(long)b);
				results[7] = ""+((long)a>(long)b);
				results[8] = ""+((long)a<(long)b);
				results[9] = ""+((long)a==(long)b);
			}
			else if(b instanceof Double){
				results[0] = ""+((long)a+(double)b);
				results[1] = ""+((long)a-(double)b);
				results[2] = ""+((long)a*(double)b);
				results[3] = ""+((long)a/(double)b);
				results[4] = ""+((long)a%(double)b);
				
				results[5] = ""+((long)a>=(double)b);
				results[6] = ""+((long)a<=(double)b);
				results[7] = ""+((long)a>(double)b);
				results[8] = ""+((long)a<(double)b);	
				results[9] = ""+((long)a==(double)b);
			}
		}
		else if(a instanceof Double){
			if(b instanceof Integer){
				results[0] = ""+((double)a+(int)b);
				results[1] = ""+((double)a-(int)b);
				results[2] = ""+((double)a*(int)b);
				results[3] = ""+((double)a/(int)b);
				results[4] = ""+((double)a%(int)b);
				
				results[5] = ""+((double)a>=(int)b);
				results[6] = ""+((double)a<=(int)b);
				results[7] = ""+((double)a>(int)b);
				results[8] = ""+((double)a<(int)b);	
				results[9] = ""+((double)a==(int)b);	
			}	
			else if(b instanceof Float){
				results[0] = ""+((double)a+(float)b);
				results[1] = ""+((double)a-(float)b);
				results[2] = ""+((double)a*(float)b);
				results[3] = ""+((double)a/(float)b);
				results[4] = ""+((double)a%(float)b);				

				results[5] = ""+((double)a>=(float)b);
				results[6] = ""+((double)a<=(float)b);
				results[7] = ""+((double)a>(float)b);
				results[8] = ""+((double)a<(float)b);
				results[9] = ""+((double)a==(float)b);	
			}
			else if(b instanceof Long){
				results[0] = ""+((double)a+(long)b);
				results[1] = ""+((double)a-(long)b);
				results[2] = ""+((double)a*(long)b);
				results[3] = ""+((double)a/(long)b);
				results[4] = ""+((double)a%(long)b);
				
				results[5] = ""+((double)a>=(long)b);
				results[6] = ""+((double)a<=(long)b);
				results[7] = ""+((double)a>(long)b);
				results[8] = ""+((double)a<(long)b);
				results[9] = ""+((double)a==(long)b);	
			}
			else if(b instanceof Double){
				results[0] = ""+((double)a+(double)b);
				results[1] = ""+((double)a-(double)b);
				results[2] = ""+((double)a*(double)b);
				results[3] = ""+((double)a/(double)b);
				results[4] = ""+((double)a%(double)b);

				results[5] = ""+((double)a>=(double)b);
				results[6] = ""+((double)a<=(double)b);
				results[7] = ""+((double)a>(double)b);
				results[8] = ""+((double)a<(double)b);	
				results[9] = ""+((double)a==(double)b);	
			}
		}

		return results;
	}
	private void _test_arithmeticOperations(TermValue a, TermValue b, String[] correct) throws DIbuggerLogicException{
		String msg = " ->a:"+a.getClass().getName()+" b:"+b.getClass().getName()+"<-";
		assertEquals(msg,correct[0], a.add(b).toString());
		assertEquals(msg,correct[1], a.sub(b).toString());
		assertEquals(msg,correct[2], a.mul(b).toString());
		assertEquals(msg,correct[3], a.div(b).toString());
		assertEquals(msg,correct[4], a.mod(b).toString());
		
		assertEquals(msg,correct[5], ""+a.greaterEqual(b));
		assertEquals(msg,correct[6], ""+a.lessEqual(b));
		assertEquals(msg,correct[7], ""+a.greaterThan(b));
		assertEquals(msg,correct[8], ""+a.lessThan(b));
		assertEquals(msg,correct[9], ""+a.equal(b));
	}
}
