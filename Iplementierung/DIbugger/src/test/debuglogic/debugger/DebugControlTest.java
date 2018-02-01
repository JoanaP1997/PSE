package test.debuglogic.debugger;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import dibugger.debuglogic.debugger.DebugControl;
import dibugger.debuglogic.debugger.DebugLogicFacade;
import dibugger.debuglogic.debugger.ProgramInput;
import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.VariableNotFoundException;

import static org.junit.Assert.*;

public class DebugControlTest {
    
    @Test
    public void steppingTest() throws DIbuggerLogicException{
    	
        DebugLogicFacade facade = new DebugLogicFacade();
        ProgramInput in = new ProgramInput(
                "void main() { \n"
                + "int i = 2 \n;"
                + "int x = 3+i; \n"
                + "boolean b = true; \n"
                + "while (x<80) { \n"
                + " i = i+2; \n"
                + " x = x +1; \n"
                + " } \n"
                + "}", new ArrayList<String>(), 0, "A");
        List<ProgramInput> l_in = new ArrayList<ProgramInput>();
        l_in.add(in);
        facade.setStepSize(0, 1);
        facade.launchRun(l_in);
        for(int i=0;i<5;++i){
            facade.step(DebugControl.STEP_NORMAL);
        }
        assertArrayEquals(new Object[]{"b","x","i"}, facade.getAllVariables("A").toArray());
        for(int i=0;i<4;++i){
            facade.step(DebugControl.STEP_BACK);
        }
        assertArrayEquals(new Object[]{"x","i"}, facade.getAllVariables("A").toArray());
        facade.step(DebugControl.STEP_OUT);
        assertArrayEquals(new Object[]{"b","x","i"}, facade.getAllVariables("A").toArray());
    }
    
    @Test
    public void breakpointTest() throws DIbuggerLogicException{
    	 DebugLogicFacade facade = new DebugLogicFacade();
         ProgramInput in = new ProgramInput(
                 "void main() { \n"
                 + "int i = 2 \n;"
                 + "int x = 3+i; \n"
                 + "boolean b = true; \n"
                 + "while (x<80) { \n"
                 + " i = i+2; \n"
                 + " x = x +1; \n"
                 + " } \n"
                 + "}", new ArrayList<String>(), 0, "A");
         List<ProgramInput> l_in = new ArrayList<ProgramInput>();
         l_in.add(in);
         facade.setStepSize(0, 5);
         facade.launchRun(l_in);
         facade.createBreakpoint(0, 3);
         facade.step(DebugControl.STEP_NORMAL);       
         assertArrayEquals(new Object[]{"x","i"}, facade.getAllVariables("A").toArray());
         facade.step(DebugControl.STEP_BACK);
         assertArrayEquals(new Object[]{"i"}, facade.getAllVariables("A").toArray());
         facade.continueDebug();       
         assertArrayEquals(new Object[]{"x","i"}, facade.getAllVariables("A").toArray());
         facade.continueDebug();       
         assertArrayEquals(new Object[]{"b","x","i"}, facade.getAllVariables("A").toArray());
    }
    
    @Test
    public void watchExpressionTest() throws DIbuggerLogicException{
    	DebugLogicFacade facade = new DebugLogicFacade();
        ProgramInput in = new ProgramInput(
                "void main() { \n"
                + "int i = 2 \n;"
                + "int x = 3+i; \n"
                + "boolean b = true; \n"
                + "while (x<80) { \n"
                + " i = i+2; \n"
                + " x = x +1; \n"
                + " } \n"
                + "}", new ArrayList<String>(), 0, "A");
        List<ProgramInput> l_in = new ArrayList<ProgramInput>();
        l_in.add(in);
        facade.setStepSize(0, 5);
        facade.createWatchExpression(0, "A.i + A.x");
        facade.createCondBreakpoint(0, "A.x == 2*A.i");
        facade.launchRun(l_in);
        facade.step(DebugControl.STEP_NORMAL);
        assertEquals("9", facade.getWEValue(0));
        System.out.println(facade.getCBValue(0));
    }
}
