package test.debuglogic.interpreter;

import static org.junit.Assert.*;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import dibugger.debuglogic.antlrparser.WlangLexer;
import dibugger.debuglogic.antlrparser.WlangParser;
import dibugger.debuglogic.interpreter.Assignment;
import dibugger.debuglogic.interpreter.Command;
import dibugger.debuglogic.interpreter.CommandGenerationVisitor;
import dibugger.debuglogic.interpreter.Declaration;
import dibugger.debuglogic.interpreter.DeclarationAssignment;
import dibugger.debuglogic.interpreter.IfCommand;
import dibugger.debuglogic.interpreter.ReturnCommand;
import dibugger.debuglogic.interpreter.RoutineCommand;
import dibugger.debuglogic.interpreter.TermGenerationVisitor;
import dibugger.debuglogic.interpreter.WhileCommand;

public class CommandGenerationVisitorTest {

  @Test
  public void structureIfTest() {
    String code = "int main() { \n" + "int i; \n" + "i=2; \n" + "char c = 't'; \n" + "if(i<c) \n " + "i=3; \n"
        + "return i; \n" + "}";
    CharStream input = CharStreams.fromString(code);
    WlangLexer lexer = new WlangLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    WlangParser parser = new WlangParser(tokens);
    ParseTree tree = parser.r();
    CommandGenerationVisitor visitor = new CommandGenerationVisitor(null);
    Command root = visitor.visit(tree);

    assert (root instanceof RoutineCommand);
    assert (((RoutineCommand) root).getChild(0) instanceof Declaration);
    assert (((RoutineCommand) root).getChild(1) instanceof Assignment);
    assert (((RoutineCommand) root).getChild(2) instanceof DeclarationAssignment);
    assert (((RoutineCommand) root).getChild(3) instanceof IfCommand);
    assert (((IfCommand) ((RoutineCommand) root).getChild(3)).getChild(0) instanceof Assignment);
    assert (((RoutineCommand) root).getChild(4) instanceof ReturnCommand);
  }

  @Test
  public void structureWhileTest() {
    String code = "void main(int x) { \n" + "int i = x+1; \n" + "while(i<100+x) { \n" + "x=2; \n" + "i=i+2; \n" + "} \n"
        + "return x; \n" + "}";
    CharStream input = CharStreams.fromString(code);
    WlangLexer lexer = new WlangLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    WlangParser parser = new WlangParser(tokens);
    ParseTree tree = parser.r();
    CommandGenerationVisitor visitor = new CommandGenerationVisitor(null);
    Command root = visitor.visit(tree);
    assert (root instanceof RoutineCommand);
    assert (((RoutineCommand) root).getChild(0) instanceof DeclarationAssignment);
    assert (((RoutineCommand) root).getChild(1) instanceof WhileCommand);
    assert (((RoutineCommand) root).getChild(2) instanceof ReturnCommand);
    assert (((WhileCommand) ((RoutineCommand) root).getChild(1)).getChild(0) instanceof Assignment);
    assert (((WhileCommand) ((RoutineCommand) root).getChild(1)).getChild(1) instanceof Assignment);

  }

}
