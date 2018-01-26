package test.debuglogic.interpreter;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.junit.Ignore;
import org.junit.Test;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.interpreter.GenerationController;
import dibugger.debuglogic.interpreter.Trace;
import dibugger.debuglogic.interpreter.TraceState;

public class GenerationControllerTest {

	@Ignore
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

	@Ignore
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
		System.out.println("Result of computation: " + gc.getReturnValue().toString());
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
	}

}
