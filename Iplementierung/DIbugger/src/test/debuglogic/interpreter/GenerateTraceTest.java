package test.debuglogic.interpreter;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.junit.Test;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.interpreter.GenerationController;
import dibugger.debuglogic.interpreter.TraceState;

public class GenerateTraceTest {

	@Test
	public void test() throws DIbuggerLogicException {
		GenerationController gc = new GenerationController(1000, 1000);
		String code = "//Calculate the factorial of k recursively.\n" + 
				"//other functions must be declared before the main\n" + 
				"int fac(int k) {\n" + 
				"	if (k <= 1) \n" + 
				"		return 1;\n" + 
				"	int res;\n" + 
				"	res = fac(k-1);\n" + 
				"	res = res * k;\n" + 
				"	return res;\n" + 
				"}\n" + 
				"\n" + 
				"//every program needs a main method\n" + 
				"int main(int k) {\n" + 
				"	int res;\n" + 
				"	res = fac(k);\n" + 
				"	return res;\n" + 
				"}";
		List<String> list = new ArrayList<String>();
		list.add("k=3;");
		ListIterator<TraceState> li = gc.generateTrace(code, list, "A");
		while(li.hasNext()) {
			TraceState state = li.next();
			System.out.println(state.getLineNumber()+19 + ": " + state.getPosition() +"         " + state);
		}
	}

}
