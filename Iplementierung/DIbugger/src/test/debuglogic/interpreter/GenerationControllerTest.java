package test.debuglogic.interpreter;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.junit.Ignore;
import org.junit.Test;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.SyntaxException;
import dibugger.debuglogic.interpreter.GenerationController;
import dibugger.debuglogic.interpreter.Trace;
import dibugger.debuglogic.interpreter.TraceState;

public class GenerationControllerTest {

	@Test
	public void withoutInputTest() throws DIbuggerLogicException {
		String code = "void main() { \n" + "int i = 2 \n;" + "int x = 3+i; \n" + "while (x<80) { \n" + "	i = i+2; \n"
				+ " x = x +1; \n" + " } \n" + "}";
		List<String> input = new ArrayList<String>();
		GenerationController gc = new GenerationController(10000, 10000);
		ListIterator<TraceState> iterator = gc.generateTrace(code, input, "A");
		while (iterator.hasNext()) {
			TraceState state = iterator.next();
			/*
			 * System.out.println("linenumber: "+ state.getLineNumber());
			 * System.out.println("existing variables: "+
			 * state.getAllVariableIdentifiers());
			 * System.out.println("Value i= " +state.getValueOf("i"));
			 * System.out.println("Value x= " +state.getValueOf("x"));
			 * System.out.println(
			 * "-----------------------------------------------");
			 */
		}
	}
	
	@Test(expected=SyntaxException.class)
	  public void noProgramTextTest() throws DIbuggerLogicException {
	    String code = "";
	    List<String> input = new ArrayList<String>();
	    GenerationController gc = new GenerationController(10000, 10000);
	    ListIterator<TraceState> iterator = gc.generateTrace(code, input, "A");
	    while (iterator.hasNext()) {
	      TraceState state = iterator.next();
	      /*
	       * System.out.println("linenumber: "+ state.getLineNumber());
	       * System.out.println("existing variables: "+
	       * state.getAllVariableIdentifiers());
	       * System.out.println("Value i= " +state.getValueOf("i"));
	       * System.out.println("Value x= " +state.getValueOf("x"));
	       * System.out.println(
	       * "-----------------------------------------------");
	       */
	    }
	  }

	@Test
	public void withInputTest() throws DIbuggerLogicException {
		String code = "void main(int k) { \n" + "int i = k \n;" + "int x = 3+i; \n" + "while (x<80) { \n"
				+ " i = i+2; \n" + " x = x +1; \n" + " } \n" + "}";
		List<String> input = new ArrayList<String>();
		input.add(" k = 34 ");
		GenerationController gc = new GenerationController(10000, 10000);
		ListIterator<TraceState> iterator = gc.generateTrace(code, input, "A");
		while (iterator.hasNext()) {
			TraceState state = iterator.next();
			/*
			 * System.out.println("linenumber: "+ state.getLineNumber());
			 * System.out.println("existing variables: "+
			 * state.getAllVariableIdentifiers());
			 * System.out.println("Value i= " +state.getValueOf("i"));
			 * System.out.println("Value x= " +state.getValueOf("x"));
			 * System.out.println(
			 * "-----------------------------------------------");
			 */
		}
	}
	@Test
	public void withArrayInputTest() throws DIbuggerLogicException {
		String code = "void main(int[] a) { \n" + "int i = a[1]; \n" + "}";
		List<String> input = new ArrayList<String>();
		input.add(" a = {3,1,2} ");
		GenerationController gc = new GenerationController(10000, 10000);
		ListIterator<TraceState> iterator = gc.generateTrace(code, input, "A");
		while (iterator.hasNext()) {
			TraceState state = iterator.next();
			/*
			 * System.out.println("linenumber: "+ state.getLineNumber());
			 * System.out.println("existing variables: "+
			 * state.getAllVariableIdentifiers());
			 * System.out.println("Value i= " +state.getValueOf("i"));
			 * System.out.println("Value x= " +state.getValueOf("x"));
			 * System.out.println(
			 * "-----------------------------------------------");
			 */
		}
	}
	@Ignore
	public void withBadInputTest() throws DIbuggerLogicException {
		String code = "void main(int k) { \n" + "int i = k \n;" + "int x = 3+i; \n" + "while (x<80) { \n"
				+ " i = i+2; \n" + " x = x +1; \n" + " } \n" + "}";
		List<String> input = new ArrayList<String>();
		input.add(" k ==== 34 ");
		GenerationController gc = new GenerationController(10000, 10000);
		ListIterator<TraceState> iterator = gc.generateTrace(code, input, "A");
		while (iterator.hasNext()) {
			TraceState state = iterator.next();
			/*
			 * System.out.println("linenumber: "+ state.getLineNumber());
			 * System.out.println("existing variables: "+
			 * state.getAllVariableIdentifiers());
			 * System.out.println("Value i= " +state.getValueOf("i"));
			 * System.out.println("Value x= " +state.getValueOf("x"));
			 * System.out.println(
			 * "-----------------------------------------------");
			 */
		}
	}
	/** 
	 * Tests the factorial recursive implemented.
	 * @throws DIbuggerLogicException
	 */
	@Test
	public void testFunctionCalls() throws DIbuggerLogicException {
		String code = "int main(int k) {\n"
				+ "if(k<=1) {"
				+ "	return 1;\n"
				+ "}\n"
				+ "int res;\n"
				+ "res = main(k-1);\n"
				+ "res = res*k;\n"
				+ "return res;\n"
				+ "}";
		List<String> input = new ArrayList<String>();
		input.add(" k = 5 ");
		GenerationController gc = new GenerationController(10000, 10000);
		ListIterator<TraceState> iterator = gc.generateTrace(code, input, "A");
		while (iterator.hasNext()) {
			TraceState state = iterator.next();
			System.out.println("linenumber: " + state.getLineNumber());
			System.out.println("existing variables: " + state.getAllVariableIdentifiers());
			System.out.println("Value k = " + state.getValueOf("k"));
			System.out.println("Value res = " + state.getValueOf("res"));
			System.out.println("-----------------------------------------------");
		}
		
		System.out.println("####################################################");
		System.out.println("Result of computation: " +  gc.getReturnValue().toString());
		assert(gc.getReturnValue().toString().equals("120"));
	}
	
	 @Test
	  public void testExtraCarriageReturn() throws DIbuggerLogicException {
	    String code = "int main(int k) {\n"
	        + "\n"
	        + "if(k<=1) \n {"
	        + " return 1;\n"
	        + "}\n"
	        + "int res;\n"
	        + "res \n= main(k-1);\n"
	        + "res = res*k;\n"
	        + "return res;\n"
	        + "}";
	    List<String> input = new ArrayList<String>();
	    input.add(" k = 5 ");
	    GenerationController gc = new GenerationController(10000, 10000);
	    ListIterator<TraceState> iterator = gc.generateTrace(code, input, "A");
	    assert(gc.getReturnValue().toString().equals("120"));
	  }
	
	@Test
	public void testSimpleArrayUse() throws DIbuggerLogicException {
		String code = "int main(int k) {\n"
				+ "int[2] array; \n"
				+ "array[0] = 0; \n"
				+ "if (k<3) { \n"
				+ "		array[0] = 1;"
				+ "}\n"
				+ "array[1] = 4;\n"
				+ "int res = array[0] + array[1];\n"
				+ "return res;\n" //should return 4 if k>=3, 5 else
				+ "}";
		List<String> input = new ArrayList<String>();
		input.add(" k = 1 ");
		GenerationController gc = new GenerationController(10000, 10000);
		ListIterator<TraceState> iterator = gc.generateTrace(code, input, "A");
		while (iterator.hasNext()) {
			TraceState state = iterator.next();
			System.out.println("linenumber: " + state.getLineNumber());
			System.out.println("existing variables: " + state.getAllVariableIdentifiers());
			System.out.println("Value k = " + state.getValueOf("k"));
			System.out.println("Value array = " + state.getValueOf("array"));
			System.out.println("Value res = " + state.getValueOf("res"));
			System.out.println("-----------------------------------------------");
		}
		
		System.out.println("####################################################");
		System.out.println("Result of computation: " +  gc.getReturnValue().toString());
		assert(gc.getReturnValue().toString().equals("5"));
	}
	
	// unfertig
	@Ignore
	public void testQuickSort() throws DIbuggerLogicException {
	  String code =
	      "void main(int[] values, int length) {\n"
	      + "       if (values ==null){\n"
        + "             return;\n"
        + "       }\n"
        + "       quicksort(0, length - 1, int[] numbers);\n"
        + "}\n"
        
        + "void quicksort(int low, int high, int[] numbers) {\n"
        + "      int i = low, j = high;\n"
        + "      int i = low, j = high;\n"
        + "      int pivot = numbers[low + (high-low)/2];\n  "
        + "      while (i <= j) {\n"
        + "            while (numbers[i] < pivot) {\n"
        + "                i++;\n"
        + "            }\n"
        + "            while (numbers[j] > pivot) {\n"
        + "                j--;\n"
        + "            }\n"
        + "            if (i <= j) {\n"
        + "                exchange(i, j);\n"
        + "                i++;\n"
        + "                j--;\n"
        + "            }\n"
        + "        }\n"
        + "            if (i <= j) {\n"
        + "                numbers = exchange(i, j, numbers[]);\n"
        + "                i++;\n"
        + "                j--;\n"
        + "            }\n"
        + "        }\n"
        + "        if (low < j) {\n"
        + "            quicksort(low, j);\n"
        + "        }\n"
        + "        if (i < high) {\n"
        + "            quicksort(i, high);\n"
        + "        }\n"
        + "}\n"
        
        + "private int[] exchange(int i, int j, int[] numbers) {\n"
        + "        int temp = numbers[i];\n"
        + "        numbers[i] = numbers[j];\n"
        + "        numbers[j] = temp;"
        + "        return numbers;\n"
        + "}\n";
	   List<String> input = new ArrayList<String>();
	   // Declaration of array in the input
	   
	    input.add("");
	    GenerationController gc = new GenerationController(10000, 10000);
	    ListIterator<TraceState> iterator = gc.generateTrace(code, input, "A");
	}

}
