package test.debuglogic.interpreter.integration;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.ExceededMaxIterationsException;
import dibugger.debuglogic.interpreter.GenerationController;

public class StressTest {

    @Ignore
    public void testAckermann() throws DIbuggerLogicException {
        GenerationController gc = new GenerationController(1000, 1000);
        String code = " int ackermann(int m, int n) {\n"
            +"    if (m == 0) {\n"
            +"        return n + 1;\n"
            +"    }\n"
            + "   if (n == 0) {\n"
            + "int x = m-1;\n"
            +"return ackermann(x,1);\n"
            +"    } else {\n"
            +"        return ackermann(m-1, ackermann(m,n-1));\n"
            +"    }\n"
            +"}\n"
            +"void main (int m, int n) {\n"
            +" int a;\n"
            +" a = ackermann(int m, int n);\n"
            +"}\n";
        List<String> input = new ArrayList<String>();
        input.add(" m = 10 ");
        input.add(" n = 12 ");
        gc.generateTrace(code, input , "A");
    }

    @Test(expected=ExceededMaxIterationsException.class)
    public void testEndlessLoop() throws DIbuggerLogicException {
        GenerationController gc = new GenerationController(1000, 1000);
        String code = "void main (int m, int n) {\n"
            + "int a = 0;\n"
            +" while (true) {\n"
            + "a = a + m + n;\n"
            + "}\n"
            +"}\n";
        List<String> input = new ArrayList<String>();
        input.add(" m = 10 ");
        input.add(" n = 12 ");
        gc.generateTrace(code, input , "A");
    }
    
    @Test
    public void testNoUserInputAlthoughExpected() throws DIbuggerLogicException {
        GenerationController gc = new GenerationController(1000, 1000);
        String code = "void main (int m, int n) {\n"
            + "int a = 0;\n"
            +" while (true) {\n"
            + "a = a + m + n;\n"
            + "}\n"
            +"}\n";
        List<String> input = new ArrayList<String>();
        gc.generateTrace(code, input , "A");
    }
}