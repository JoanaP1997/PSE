package test.debuglogic.interpreter;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.ExceededMaxIterationsException;
import dibugger.debuglogic.exceptions.SyntaxException;
import dibugger.debuglogic.exceptions.WrongTypeArgumentException;
import dibugger.debuglogic.interpreter.GenerationController;

public class StressTest {

    @Test
    public void testAckermann() throws DIbuggerLogicException {
        GenerationController gc = new GenerationController(1000, 1000);
        String code =
             " int ackermann(int m, int n) {\n"
            +"    if (m == 0) {\n"
            + "       int i = n+1;\n"      
            +"        return i;\n"
            +"    }\n"
            + "   if (n == 0) {\n"
            + "         int l = m-1;\n"        
            + "         int x;\n"
            + "         x = ackermann(l,1);\n"
            +"          return x;\n"
            +"    } else {\n"
            + "         int y;\n"
            + "         y = ackermann(m,n-1);\n"
            + "         int z;\n"
            + "         z = ackermann(m-1,y);\n"
            +"          return z;\n"
            +"    }\n"
            +"}\n"
            +"void main (int m, int n) {\n"
            +"      int a;\n"
            +"      a = ackermann(m, n);\n"
            +"}\n";
        List<String> input = new ArrayList<String>();
        input.add(" m = 2 ");
        input.add(" n = 8 ");
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
            +" while (false) {\n"
            + "a = a + m + n;\n"
            + "}\n"
            +"}\n";
        List<String> input = new ArrayList<String>();
        gc.generateTrace(code, input , "A");
    }
    
    @Test(expected=WrongTypeArgumentException.class)
    public void testWrongTypeUserInput() throws DIbuggerLogicException {
        GenerationController gc = new GenerationController(1000, 1000);
        String code = "void main (int m, int n) {\n"
            + "int a = 0;\n"
            +" while (true) {\n"
            + "a = a + m + n;\n"
            + "}\n"
            +"}\n";
        List<String> input = new ArrayList<String>();
        input.add(" m = true ");
        input.add(" n = 12 ");
        gc.generateTrace(code, input , "A");
    }
    
    @Test(expected=SyntaxException.class)
    public void testWrongSyntaxUserInput() throws DIbuggerLogicException {
        GenerationController gc = new GenerationController(1000, 1000);
        String code = "void main (int m, int n) {\n"
            + "int a = 0;\n"
            +" while (true) {\n"
            + "a = a + m + n;\n"
            + "}\n"
            +"}\n";
        List<String> input = new ArrayList<String>();
        input.add(" m = 10 ");
        input.add(" n == 12 ");
        gc.generateTrace(code, input , "A");
    }
    
    
    
}