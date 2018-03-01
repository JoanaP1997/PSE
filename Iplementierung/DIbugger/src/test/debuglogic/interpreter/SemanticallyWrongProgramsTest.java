package test.debuglogic.interpreter;

import static org.junit.Assert.*;

import org.junit.Test;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.MissingReturnCallException;
import dibugger.debuglogic.exceptions.SyntaxException;
import dibugger.debuglogic.interpreter.GenerationController;

public class SemanticallyWrongProgramsTest {
    
    @Test(expected=MissingReturnCallException.class)
    public void testGenerateTrace_missingReturnCall() throws DIbuggerLogicException {
        GenerationController controller = new GenerationController(1000, 1000);
        String code = "int main() {\n"
                + "int i;\n"
                + "i = 2;\n"
                + "}";
        controller.generateTrace(code, null, "A");
    }
}
