package test.debuglogic.interpreter.commands;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.interpreter.ConstantTerm;
import dibugger.debuglogic.interpreter.GenerationController;
import dibugger.debuglogic.interpreter.IntValue;
import dibugger.debuglogic.interpreter.ReturnCommand;
import dibugger.debuglogic.interpreter.Scope;
import dibugger.debuglogic.interpreter.TraceState;
import dibugger.debuglogic.interpreter.TraceStatePosition;

public class ReturnCommandTest {

    @Test
    public void test_ReturnCommand_valid() throws DIbuggerLogicException {
        GenerationController gc = new GenerationController(1000, 1000);
        Scope s = new Scope();
        ReturnCommand returnCommand = new ReturnCommand(gc, 5, new ConstantTerm(new IntValue(5)));
        gc.pushScope(s);
        List<TraceState> traceStateList = returnCommand.run();
        // assertEquals(gc.getReturnValue(), new IntValue(5).getValue());
        assertEquals(gc.getCurrentScope().isRoutineFinished(), true);
    }
    
    
}
