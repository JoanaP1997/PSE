package test.debuglogic.interpreter.commands;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.exceptions.MissingReturnCallException;
import dibugger.debuglogic.interpreter.BooleanValue;
import dibugger.debuglogic.interpreter.CharValue;
import dibugger.debuglogic.interpreter.ConstantTerm;
import dibugger.debuglogic.interpreter.GenerationController;
import dibugger.debuglogic.interpreter.IntValue;
import dibugger.debuglogic.interpreter.LongValue;
import dibugger.debuglogic.interpreter.RoutineCommand;
import dibugger.debuglogic.interpreter.Scope;
import dibugger.debuglogic.interpreter.Term;
import dibugger.debuglogic.interpreter.Type;

public class RoutineCommandTest {

    @Test(expected=MissingReturnCallException.class)
    public void test_RoutineCommand_valid() throws DIbuggerLogicException {
        GenerationController gc = new GenerationController(1000, 1000);
        Scope s = new Scope();
        gc.pushScope(s);
        ArrayList<String> identifiers = new ArrayList<String>();
        identifiers.add("a");
        identifiers.add("b");
        identifiers.add("c");
        identifiers.add("?");
        ArrayList<Type> expectedTypes = new ArrayList<Type>();
        expectedTypes.add(Type.BOOLEAN);
        expectedTypes.add(Type.CHAR);
        expectedTypes.add(Type.INT);
        expectedTypes.add(Type.LONG);
        RoutineCommand cmd = new RoutineCommand(gc, "amIRight", 4, identifiers, expectedTypes, Type.BOOLEAN);
        ArrayList<Term> args = new ArrayList<Term>();
        args.add(new ConstantTerm(new BooleanValue(false)));
        args.add(new ConstantTerm(new CharValue('x')));
        args.add(new ConstantTerm(new IntValue(66)));
        args.add(new ConstantTerm(new LongValue(12345)));
        cmd.setArgs(args);
        gc.setReturnValue(new BooleanValue(false));
        cmd.run();
    }

    @Test(expected=MissingReturnCallException.class)
    public void test_RoutineCommand_missingReturnCall() throws DIbuggerLogicException {
        GenerationController gc = new GenerationController(1000, 1000);
        Scope s = new Scope();
        gc.pushScope(s);
        ArrayList<String> identifiers = new ArrayList<String>();
        identifiers.add("a");
        identifiers.add("b");
        identifiers.add("c");
        identifiers.add("?");
        ArrayList<Type> expectedTypes = new ArrayList<Type>();
        expectedTypes.add(Type.BOOLEAN);
        expectedTypes.add(Type.CHAR);
        expectedTypes.add(Type.INT);
        expectedTypes.add(Type.LONG);
        RoutineCommand cmd = new RoutineCommand(gc, "amIRight", 4, identifiers, expectedTypes, Type.BOOLEAN);
        ArrayList<Term> args = new ArrayList<Term>();
        args.add(new ConstantTerm(new BooleanValue(false)));
        args.add(new ConstantTerm(new CharValue('x')));
        args.add(new ConstantTerm(new IntValue(66)));
        args.add(new ConstantTerm(new LongValue(12345)));
        cmd.setArgs(args);
        cmd.run();
    }
}
