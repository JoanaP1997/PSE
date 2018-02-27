package test.debuglogic.interpreter;

import static org.junit.Assert.*;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;



import dibugger.debuglogic.antlrparser.WlangLexer;
import dibugger.debuglogic.antlrparser.WlangParser;
import dibugger.debuglogic.interpreter.AdditionTerm;
import dibugger.debuglogic.interpreter.Assignment;
import dibugger.debuglogic.interpreter.BinaryArithmeticTerm;
import dibugger.debuglogic.interpreter.Command;
import dibugger.debuglogic.interpreter.CommandGenerationVisitor;
import dibugger.debuglogic.interpreter.ConstantTerm;
import dibugger.debuglogic.interpreter.Declaration;
import dibugger.debuglogic.interpreter.DeclarationAssignment;
import dibugger.debuglogic.interpreter.DivisionTerm;
import dibugger.debuglogic.interpreter.IfCommand;
import dibugger.debuglogic.interpreter.ModuloTerm;
import dibugger.debuglogic.interpreter.MultiplicationTerm;
import dibugger.debuglogic.interpreter.ReturnCommand;
import dibugger.debuglogic.interpreter.RoutineCommand;
import dibugger.debuglogic.interpreter.SubtractionTerm;
import dibugger.debuglogic.interpreter.Term;
import dibugger.debuglogic.interpreter.TermGenerationVisitor;
import dibugger.debuglogic.interpreter.VariableTerm;
import dibugger.debuglogic.interpreter.WhileCommand;

public class TermGenerationVisitorTest {

    @Test
    public void test_Addition_constant_constant() {
        String text = "3 +5";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof AdditionTerm);
        assertTrue (((BinaryArithmeticTerm) root).getLeftChild() instanceof ConstantTerm);
        assertTrue (((BinaryArithmeticTerm) root).getRightChild() instanceof ConstantTerm);
        
        text = "3 +5.3";
        input = CharStreams.fromString(text);
        lexer = new WlangLexer(input);
        tokens = new CommonTokenStream(lexer);
        parser = new WlangParser(tokens);
        tree = parser.wecbterm();
        visitor = new TermGenerationVisitor();
        root = visitor.visit(tree);
        assertTrue (root instanceof AdditionTerm);
        assertTrue (((BinaryArithmeticTerm) root).getLeftChild() instanceof ConstantTerm);
        assertTrue (((BinaryArithmeticTerm) root).getRightChild() instanceof ConstantTerm);
        
    }
    @Test
    public void test_Addition_variable_constant() {
        String text = "var +5012";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof AdditionTerm);
        assertTrue (((BinaryArithmeticTerm) root).getLeftChild() instanceof VariableTerm);
        assertTrue (((BinaryArithmeticTerm) root).getRightChild() instanceof ConstantTerm);
    }
    @Test
    public void test_Addition_constant_variable() {
        String text = "3.21f +varia";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof AdditionTerm);
        assertTrue (((BinaryArithmeticTerm) root).getLeftChild() instanceof ConstantTerm);
        assertTrue (((BinaryArithmeticTerm) root).getRightChild() instanceof VariableTerm);
    } @Test
    public void test_Addition_variable_variable() {
        String text = "var +d";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof AdditionTerm);
        assertTrue (((BinaryArithmeticTerm) root).getLeftChild() instanceof VariableTerm);
        assertTrue (((BinaryArithmeticTerm) root).getRightChild() instanceof VariableTerm);
    }
    //multiplication
    @Test
    public void test_Multiplication_constant_constant() {
        String text = "3 *5";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof MultiplicationTerm);
        assertTrue (((BinaryArithmeticTerm) root).getLeftChild() instanceof ConstantTerm);
        assertTrue (((BinaryArithmeticTerm) root).getRightChild() instanceof ConstantTerm);
        
        text = "3 *5.3";
        input = CharStreams.fromString(text);
        lexer = new WlangLexer(input);
        tokens = new CommonTokenStream(lexer);
        parser = new WlangParser(tokens);
        tree = parser.wecbterm();
        visitor = new TermGenerationVisitor();
        root = visitor.visit(tree);
        assertTrue (root instanceof MultiplicationTerm);
        assertTrue (((BinaryArithmeticTerm) root).getLeftChild() instanceof ConstantTerm);
        assertTrue (((BinaryArithmeticTerm) root).getRightChild() instanceof ConstantTerm);
        
    }
    @Test
    public void test_Multiplication_variable_constant() {
        String text = "var *5012";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof MultiplicationTerm);
        assertTrue (((BinaryArithmeticTerm) root).getLeftChild() instanceof VariableTerm);
        assertTrue (((BinaryArithmeticTerm) root).getRightChild() instanceof ConstantTerm);
    }
    @Test
    public void test_Multiplication_constant_variable() {
        String text = "3.21f *varia";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof MultiplicationTerm);
        assertTrue (((BinaryArithmeticTerm) root).getLeftChild() instanceof ConstantTerm);
        assertTrue (((BinaryArithmeticTerm) root).getRightChild() instanceof VariableTerm);
    } @Test
    public void test_Multiplication_variable_variable() {
        String text = "var *d";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof MultiplicationTerm);
        assertTrue (((BinaryArithmeticTerm) root).getLeftChild() instanceof VariableTerm);
        assertTrue (((BinaryArithmeticTerm) root).getRightChild() instanceof VariableTerm);
    }
    //Division
    @Test
    public void test_Division_constant_constant() {
        String text = "3 /5";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof DivisionTerm);
        assertTrue (((BinaryArithmeticTerm) root).getLeftChild() instanceof ConstantTerm);
        assertTrue (((BinaryArithmeticTerm) root).getRightChild() instanceof ConstantTerm);
        
        text = "3 /5.3";
        input = CharStreams.fromString(text);
        lexer = new WlangLexer(input);
        tokens = new CommonTokenStream(lexer);
        parser = new WlangParser(tokens);
        tree = parser.wecbterm();
        visitor = new TermGenerationVisitor();
        root = visitor.visit(tree);
        assertTrue (root instanceof DivisionTerm);
        assertTrue (((BinaryArithmeticTerm) root).getLeftChild() instanceof ConstantTerm);
        assertTrue (((BinaryArithmeticTerm) root).getRightChild() instanceof ConstantTerm);
        
    }
    @Test
    public void test_Division_variable_constant() {
        String text = "var /5012";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof DivisionTerm);
        assertTrue (((BinaryArithmeticTerm) root).getLeftChild() instanceof VariableTerm);
        assertTrue (((BinaryArithmeticTerm) root).getRightChild() instanceof ConstantTerm);
    }
    @Test
    public void test_Division_constant_variable() {
        String text = "3.21f /varia";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof DivisionTerm);
        assertTrue (((BinaryArithmeticTerm) root).getLeftChild() instanceof ConstantTerm);
        assertTrue (((BinaryArithmeticTerm) root).getRightChild() instanceof VariableTerm);
    } @Test
    public void test_Division_variable_variable() {
        String text = "var /d";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof DivisionTerm);
        assertTrue (((BinaryArithmeticTerm) root).getLeftChild() instanceof VariableTerm);
        assertTrue (((BinaryArithmeticTerm) root).getRightChild() instanceof VariableTerm);
    }
    //subtraction
    @Test
    public void test_Subtraction_constant_constant() {
        String text = "3 -5";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof SubtractionTerm);
        assertTrue (((BinaryArithmeticTerm) root).getLeftChild() instanceof ConstantTerm);
        assertTrue (((BinaryArithmeticTerm) root).getRightChild() instanceof ConstantTerm);
        
        text = "3 -5.3";
        input = CharStreams.fromString(text);
        lexer = new WlangLexer(input);
        tokens = new CommonTokenStream(lexer);
        parser = new WlangParser(tokens);
        tree = parser.wecbterm();
        visitor = new TermGenerationVisitor();
        root = visitor.visit(tree);
        assertTrue (root instanceof SubtractionTerm);
        assertTrue (((BinaryArithmeticTerm) root).getLeftChild() instanceof ConstantTerm);
        assertTrue (((BinaryArithmeticTerm) root).getRightChild() instanceof ConstantTerm);
        
    }
    @Test
    public void test_Subtraction_variable_constant() {
        String text = "var -5012";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof SubtractionTerm);
        assertTrue (((BinaryArithmeticTerm) root).getLeftChild() instanceof VariableTerm);
        assertTrue (((BinaryArithmeticTerm) root).getRightChild() instanceof ConstantTerm);
    }
    @Test
    public void test_Subtraction_constant_variable() {
        String text = "3.21f -varia";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof SubtractionTerm);
        assertTrue (((BinaryArithmeticTerm) root).getLeftChild() instanceof ConstantTerm);
        assertTrue (((BinaryArithmeticTerm) root).getRightChild() instanceof VariableTerm);
    } @Test
    public void test_Subtraction_variable_variable() {
        String text = "var -d";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof SubtractionTerm);
        assertTrue (((BinaryArithmeticTerm) root).getLeftChild() instanceof VariableTerm);
        assertTrue (((BinaryArithmeticTerm) root).getRightChild() instanceof VariableTerm);
    }
    
  //modulo
    @Test
    public void test_Modulo_constant_constant() {
        String text = "3 %5";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof ModuloTerm);
        assertTrue (((BinaryArithmeticTerm) root).getLeftChild() instanceof ConstantTerm);
        assertTrue (((BinaryArithmeticTerm) root).getRightChild() instanceof ConstantTerm);
        
        text = "3 %5.3";
        input = CharStreams.fromString(text);
        lexer = new WlangLexer(input);
        tokens = new CommonTokenStream(lexer);
        parser = new WlangParser(tokens);
        tree = parser.wecbterm();
        visitor = new TermGenerationVisitor();
        root = visitor.visit(tree);
        assertTrue (root instanceof ModuloTerm);
        assertTrue (((BinaryArithmeticTerm) root).getLeftChild() instanceof ConstantTerm);
        assertTrue (((BinaryArithmeticTerm) root).getRightChild() instanceof ConstantTerm);
        
    }
    @Test
    public void test_Modulo_variable_constant() {
        String text = "var %5012";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof ModuloTerm);
        assertTrue (((BinaryArithmeticTerm) root).getLeftChild() instanceof VariableTerm);
        assertTrue (((BinaryArithmeticTerm) root).getRightChild() instanceof ConstantTerm);
    }
    @Test
    public void test_Modulo_constant_variable() {
        String text = "3.21f %varia";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof ModuloTerm);
        assertTrue (((BinaryArithmeticTerm) root).getLeftChild() instanceof ConstantTerm);
        assertTrue (((BinaryArithmeticTerm) root).getRightChild() instanceof VariableTerm);
    } @Test
    public void test_Modulo_variable_variable() {
        String text = "var %d";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof ModuloTerm);
        assertTrue (((BinaryArithmeticTerm) root).getLeftChild() instanceof VariableTerm);
        assertTrue (((BinaryArithmeticTerm) root).getRightChild() instanceof VariableTerm);
    }
}
