package test.debuglogic.interpreter;

import org.junit.Test;

import dibugger.debuglogic.exceptions.AlreadyDeclaredException;
import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.MissingReturnCallException;
import dibugger.debuglogic.exceptions.RoutineNotFoundException;
import dibugger.debuglogic.exceptions.VariableNotFoundException;
import dibugger.debuglogic.exceptions.WrongTypeAssignmentException;
import dibugger.debuglogic.interpreter.GenerationController;

public class SemanticallyWrongProgramsTest {    
    @Test(expected=AlreadyDeclaredException.class)
    public void testGenerateTrace_alreadyDeclared() throws DIbuggerLogicException {
        GenerationController controller = new GenerationController(1000, 1000);
        String code = "int main() {\n"
                + "int i;\n"
                + "int i = 2;\n"
                + "}";
        controller.generateTrace(code, null, "A");
    }
    
    @Test(expected=MissingReturnCallException.class)
    public void testGenerateTrace_missingReturnCall() throws DIbuggerLogicException {
        GenerationController controller = new GenerationController(1000, 1000);
        String code = "int main() {\n"
                + "int i;\n"
                + "i = 2;\n"
                + "}";
        controller.generateTrace(code, null, "A");
    }
    
    @Test(expected=RoutineNotFoundException.class)
    public void testGenerateTrace_routineNotFound() throws DIbuggerLogicException {
        GenerationController controller = new GenerationController(1000, 1000);
        String code = "int main() {\n"
                + "int i;\n"
                + "i = 2;\n"
                + "foo();\n"
                + "}";
        controller.generateTrace(code, null, "A");
    }
    
    @Test(expected=VariableNotFoundException.class)
    public void testGenerateTrace_variableNotFound() throws DIbuggerLogicException {
        GenerationController controller = new GenerationController(1000, 1000);
        String code = "int main() {\n"
                + "int i;\n"
                + "j = 2;\n"
                + "}";
        controller.generateTrace(code, null, "A");
    }
    
    @Test(expected=WrongTypeAssignmentException.class)
    public void testGenerateTrace_wrongTypeAssignment() throws DIbuggerLogicException {
        GenerationController controller = new GenerationController(1000, 1000);
        String code = "int main() {\n"
                + "int i;\n"
                + "i = true;\n"
                + "}";
        controller.generateTrace(code, null, "A");
    }
}
