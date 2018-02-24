package test.debuglogic.interpreter.commands;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.WrongTypeArgumentException;
import dibugger.debuglogic.interpreter.Assignment;
import dibugger.debuglogic.interpreter.BooleanValue;
import dibugger.debuglogic.interpreter.ConstantTerm;
import dibugger.debuglogic.interpreter.GenerationController;
import dibugger.debuglogic.interpreter.IfCommand;
import dibugger.debuglogic.interpreter.IfElseCommand;
import dibugger.debuglogic.interpreter.IntValue;
import dibugger.debuglogic.interpreter.Scope;
import dibugger.debuglogic.interpreter.TraceState;
import dibugger.debuglogic.interpreter.Type;
import dibugger.debuglogic.interpreter.VariableTerm;

public class IfElseCommandTest {


    @Test
    public void test_ifElseCommand_validCondition() throws DIbuggerLogicException {
        GenerationController gc = new GenerationController(1000, 1000);
        Scope s = new Scope();
        s.setTypeOf("val", Type.BOOLEAN);
        s.setValueOf("val", new BooleanValue(true));
        s.setTypeOf("result", Type.INT);
        s.setValueOf("result", new IntValue(0));
        gc.pushScope(s);
        //if(val) {result=1} else {result=2}
        IfElseCommand cmd = new IfElseCommand(gc, 1, new VariableTerm("val"));
        Assignment assignIfChild = new Assignment(gc, 0, "result", new ConstantTerm(new IntValue(1)));
        Assignment assignElseChild = new Assignment(gc, 0, "result", new ConstantTerm(new IntValue(2)));
        cmd.addIfChild(assignIfChild);
        cmd.addElseChild(assignElseChild);
        cmd.run();
        // result should be 1
        assertEquals(s.getValueOf("result").toString(),("1"));
    }

    @Test
    public void test_ifElseCommand_invalidCondition() throws DIbuggerLogicException {
        GenerationController gc = new GenerationController(1000, 1000);
        Scope s = new Scope();
        s.setTypeOf("val", Type.BOOLEAN);
        s.setValueOf("val", new BooleanValue(false));
        s.setTypeOf("result", Type.INT);
        s.setValueOf("result", new IntValue(0));
        gc.pushScope(s);
        //if(val) {result=1} else {result=2}
        IfCommand ifcmd = new IfCommand(gc, 1, new VariableTerm("val"));
        IfElseCommand cmd = new IfElseCommand(gc, 1, new VariableTerm("val"));
        Assignment assignIfChild = new Assignment(gc, 0, "result", new ConstantTerm(new IntValue(1)));
        Assignment assignElseChild = new Assignment(gc, 0, "result", new ConstantTerm(new IntValue(2)));
        cmd.addIfChild(assignIfChild);
        cmd.addElseChild(assignElseChild);
        List<TraceState> states = cmd.run();
        assertEquals(states.get(0).getValueOf("result").toString(), ("0"));
        // result should be 2
        assertEquals(s.getValueOf("result").toString(),("2"));
    }
    
    @Test(expected = WrongTypeArgumentException.class)
    public void s() throws DIbuggerLogicException {
        GenerationController gc = new GenerationController(1000, 1000);
        Scope s = new Scope();
        s.setTypeOf("val", Type.INT);
        s.setValueOf("val", new IntValue(1));
        s.setTypeOf("result", Type.INT);
        s.setValueOf("result", new IntValue(0));
        gc.pushScope(s);
        IfElseCommand cmd = new IfElseCommand(gc, 1, new VariableTerm("val"));
        Assignment assignIfChild = new Assignment(gc, 0, "result", new ConstantTerm(new IntValue(1)));
        Assignment assignElseChild = new Assignment(gc, 0, "result", new ConstantTerm(new IntValue(2)));
        cmd.addIfChild(assignIfChild);
        cmd.addElseChild(assignElseChild);
        cmd.run();
    }
    
}
