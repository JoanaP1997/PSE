package test.debuglogic.interpreter;

import static org.junit.Assert.*;

import org.junit.Test;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.SyntaxException;
import dibugger.debuglogic.interpreter.GenerationController;

public class SyntacticallyWrongProgramsTest {

	@Test(expected=SyntaxException.class)
	public void test_emptycode() throws DIbuggerLogicException {
		GenerationController gc = new GenerationController(1000, 1000);
		String code = "";
		gc.generateTrace(code,null , "A");
	}
	@Test(expected=SyntaxException.class)
	public void test_codeWithoutFunction() throws DIbuggerLogicException {
		GenerationController gc = new GenerationController(1000, 1000);
		String code = "int i; \n"
				+ "i = 2;";
		gc.generateTrace(code,null , "A");
	}
	@Test(expected=SyntaxException.class)
	public void test_codeWithWrongMainHeadA() throws DIbuggerLogicException {
		GenerationController gc = new GenerationController(1000, 1000);
		String code = "init main()"
				+ "int i; \n"
				+ "i = 2;";
		gc.generateTrace(code,null , "A");
	}
	@Test(expected=SyntaxException.class)
	public void test_codeWithWrongMainHeadB() throws DIbuggerLogicException {
		GenerationController gc = new GenerationController(1000, 1000);
		String code = "int main({)"
				+ "int i; \n"
				+ "i = 2; }";
		gc.generateTrace(code,null , "A");
	}
	@Test(expected=SyntaxException.class)
	public void test_codeWithoutMain() throws DIbuggerLogicException {
		GenerationController gc = new GenerationController(1000, 1000);
		String code = "int foo() {"
				+ "int i; \n"
				+ "i = 2; }";
		gc.generateTrace(code,null , "A");
	}
	@Test(expected=SyntaxException.class)
	public void test_codeWithwrongOtherFunctionStructure() throws DIbuggerLogicException {
		GenerationController gc = new GenerationController(1000, 1000);
		String code = "int foo({) {"
				+ "int i; \n"
				+ "i = 2; "
				+ "int main(){"
				+ "int x;"
				+ "}";
		gc.generateTrace(code,null , "A");
	}
	@Test(expected=SyntaxException.class)
	public void test_codeWithwrongTermUsage() throws DIbuggerLogicException {
		GenerationController gc = new GenerationController(1000, 1000);
		String code = "void main() {"
				+ "int x=3,4+A.a"
				+ "}";
		gc.generateTrace(code,null , "A");
	}
	@Test(expected=SyntaxException.class)
	public void test_codeWithwrongTermUsageB() throws DIbuggerLogicException {
		GenerationController gc = new GenerationController(1000, 1000);
		String code = "void main() {"
				+ "int x=3;"
				+ "char c = 2^a:"
				+ "}";
		gc.generateTrace(code,null , "A");
	}
	@Test(expected=SyntaxException.class)
	public void test_codeWithMissingSemikolon() throws DIbuggerLogicException {
		GenerationController gc = new GenerationController(1000, 1000);
		String code = "void main() {"
				+ "int x=3"
				+ "}";
		gc.generateTrace(code,null , "A");
	}

	@Test(expected=SyntaxException.class)
	public void test_codeWithWrongReturn() throws DIbuggerLogicException {
		GenerationController gc = new GenerationController(1000, 1000);
		String code = "void main() {"
				+ "int x=3;"
				+ "returnn a;"
				+ "}";
		gc.generateTrace(code,null , "A");
	}
	@Test(expected=SyntaxException.class)
	public void test_codeWithWrongArrayUsage() throws DIbuggerLogicException {
		GenerationController gc = new GenerationController(1000, 1000);
		String code = "void main() {"
				+ "int x=3;"
				+ "int[a,b] c;"
				+ "}";
		gc.generateTrace(code,null , "A");
	}
	@Test(expected=SyntaxException.class)
	public void test_codeWithWrongArrayUsageB() throws DIbuggerLogicException {
		GenerationController gc = new GenerationController(1000, 1000);
		String code = "void main() {"
				+ "int x=3;"
				+ "int[a][b] c;"
				+ "int a[];"
				+ "}";
		gc.generateTrace(code,null , "A");
	}
	@Test(expected=SyntaxException.class)
	public void test_codeWithWrongArrayUsageC() throws DIbuggerLogicException {
		GenerationController gc = new GenerationController(1000, 1000);
		String code = "void main() {"
				+ "int x=3;"
				+ "int[a][b] c;"
				+ "c[1,2];"
				+ "}";
		gc.generateTrace(code,null , "A");
	}
	@Test(expected=SyntaxException.class)
	public void test_codeWithWrongAssignment() throws DIbuggerLogicException {
		GenerationController gc = new GenerationController(1000, 1000);
		String code = "void main() {"
				+ "int x:=3;"
				+ "}";
		gc.generateTrace(code,null , "A");
	}

}
