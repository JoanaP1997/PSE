package test.debuglogic.interpreter;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Before;
import org.junit.Test;

import dibugger.debuglogic.antlrparser.WlangLexer;
import dibugger.debuglogic.antlrparser.WlangParser;
import dibugger.debuglogic.exceptions.DIbuggerLogicException;
import dibugger.debuglogic.interpreter.Scope;
import dibugger.debuglogic.interpreter.ScopeTuple;
import dibugger.debuglogic.interpreter.Term;
import dibugger.debuglogic.interpreter.TermGenerationVisitor;
import dibugger.debuglogic.interpreter.TraceState;
import dibugger.debuglogic.interpreter.TraceStatePosition;
import dibugger.debuglogic.interpreter.WatchExpression;

public class WatchExpressionTest {
    WatchExpression we;

    @Test
    public void constantTest() throws DIbuggerLogicException {
        ///
        List<TraceState> states = new ArrayList<TraceState>();
        states.add(new TraceState(TraceStatePosition.NOTSPECIAL, 1, new Scope()));
        List<ScopeTuple> scopes = new ArrayList<ScopeTuple>();
        scopes.add(new ScopeTuple(0, 100));
        we = new WatchExpression("3-2", scopes);
        assert (we.evaluate(states).equals("1"));
        we.change("(4%2)+3", scopes);
        assert (we.evaluate(states).equals("3"));
        assert (we.evaluate(states).equals("3"));
    }

    @Test
    public void constantBooleanTest() throws DIbuggerLogicException {
        List<TraceState> states = new ArrayList<TraceState>();
        states.add(new TraceState(TraceStatePosition.NOTSPECIAL, 1, new Scope()));
        List<ScopeTuple> scopes = new ArrayList<ScopeTuple>();
        scopes.add(new ScopeTuple(0, 100));
        we = new WatchExpression("a", scopes);
        we.change("true||false", scopes);
        assert (we.evaluate(states).equals("true"));
        we.change("!!true", scopes);
        assert (we.evaluate(states).equals("true"));
        we.change("(5+3)*2 == 5+3*2", scopes);
        assert (we.evaluate(states).equals("false"));
        we.change("(5+3)*2!=16", scopes);
        assert (we.evaluate(states).equals("false"));
        we.change("3<1+3", scopes);
        assert (we.evaluate(states).equals("true"));
    }
}
