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
import dibugger.debuglogic.interpreter.AndCondition;
import dibugger.debuglogic.interpreter.Assignment;
import dibugger.debuglogic.interpreter.BinaryArithmeticTerm;
import dibugger.debuglogic.interpreter.BinaryCondition;
import dibugger.debuglogic.interpreter.Command;
import dibugger.debuglogic.interpreter.CommandGenerationVisitor;
import dibugger.debuglogic.interpreter.Comparison;
import dibugger.debuglogic.interpreter.ConstantTerm;
import dibugger.debuglogic.interpreter.Declaration;
import dibugger.debuglogic.interpreter.DeclarationAssignment;
import dibugger.debuglogic.interpreter.DivisionTerm;
import dibugger.debuglogic.interpreter.EqualComparison;
import dibugger.debuglogic.interpreter.IfCommand;
import dibugger.debuglogic.interpreter.LessComparison;
import dibugger.debuglogic.interpreter.LessEqualComparison;
import dibugger.debuglogic.interpreter.ModuloTerm;
import dibugger.debuglogic.interpreter.MoreComparison;
import dibugger.debuglogic.interpreter.MoreEqualComparison;
import dibugger.debuglogic.interpreter.MultiplicationTerm;
import dibugger.debuglogic.interpreter.NotCondition;
import dibugger.debuglogic.interpreter.NotEqualComparison;
import dibugger.debuglogic.interpreter.OrCondition;
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
    /////////////////////////////////////////////////////////////////////////Conditions and Comparisons///////////////////////////////////////////////////////////////77
    @Test
    public void test_MoreComparison_constant_constant() {
        String text = "2.1 > 3.4f";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof MoreComparison);
        assertTrue (((Comparison) root).getLeftChild() instanceof ConstantTerm);
        assertTrue (((Comparison) root).getRightChild() instanceof ConstantTerm);
    }
    @Test
    public void test_MoreComparison_variable_constant() {
        String text = "a > 3.4f";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof MoreComparison);
        assertTrue (((Comparison) root).getLeftChild() instanceof VariableTerm);
        assertTrue (((Comparison) root).getRightChild() instanceof ConstantTerm);
    }
    @Test
    public void test_MoreComparison_constant_variable() {
        String text = "2.3f > b";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof MoreComparison);
        assertTrue (((Comparison) root).getLeftChild() instanceof ConstantTerm);
        assertTrue (((Comparison) root).getRightChild() instanceof VariableTerm);
    }
    @Test
    public void test_MoreComparison_variable_variable() {
        String text = "c > b";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof MoreComparison);
        assertTrue (((Comparison) root).getLeftChild() instanceof VariableTerm);
        assertTrue (((Comparison) root).getRightChild() instanceof VariableTerm);
    }
    ///moreEqual
    @Test
    public void test_MoreEqualComparison_constant_constant() {
        String text = "2.1 >= 3.4f";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof MoreEqualComparison);
        assertTrue (((Comparison) root).getLeftChild() instanceof ConstantTerm);
        assertTrue (((Comparison) root).getRightChild() instanceof ConstantTerm);
    }
    @Test
    public void test_MoreEqualComparison_variable_constant() {
        String text = "a >= 3.4f";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof MoreEqualComparison);
        assertTrue (((Comparison) root).getLeftChild() instanceof VariableTerm);
        assertTrue (((Comparison) root).getRightChild() instanceof ConstantTerm);
    }
    @Test
    public void test_MoreEqualComparison_constant_variable() {
        String text = "2.3f >= b";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof MoreEqualComparison);
        assertTrue (((Comparison) root).getLeftChild() instanceof ConstantTerm);
        assertTrue (((Comparison) root).getRightChild() instanceof VariableTerm);
    }
    @Test
    public void test_MoreEqualComparison_variable_variable() {
        String text = "c >= b";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof MoreEqualComparison);
        assertTrue (((Comparison) root).getLeftChild() instanceof VariableTerm);
        assertTrue (((Comparison) root).getRightChild() instanceof VariableTerm);
    }
    //less
    @Test
    public void test_LessComparison_constant_constant() {
        String text = "2.1 < 3.4f";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof LessComparison);
        assertTrue (((Comparison) root).getLeftChild() instanceof ConstantTerm);
        assertTrue (((Comparison) root).getRightChild() instanceof ConstantTerm);
    }
    @Test
    public void test_LessComparison_variable_constant() {
        String text = "a < 3.4f";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof LessComparison);
        assertTrue (((Comparison) root).getLeftChild() instanceof VariableTerm);
        assertTrue (((Comparison) root).getRightChild() instanceof ConstantTerm);
    }
    @Test
    public void test_LessComparison_constant_variable() {
        String text = "2.3f < b";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof LessComparison);
        assertTrue (((Comparison) root).getLeftChild() instanceof ConstantTerm);
        assertTrue (((Comparison) root).getRightChild() instanceof VariableTerm);
    }
    @Test
    public void test_LessComparison_variable_variable() {
        String text = "c < b";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof LessComparison);
        assertTrue (((Comparison) root).getLeftChild() instanceof VariableTerm);
        assertTrue (((Comparison) root).getRightChild() instanceof VariableTerm);
    }
    //lessequal
    @Test
    public void test_LessEqualComparison_constant_constant() {
        String text = "2.1 <= 3.4f";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof LessEqualComparison);
        assertTrue (((Comparison) root).getLeftChild() instanceof ConstantTerm);
        assertTrue (((Comparison) root).getRightChild() instanceof ConstantTerm);
    }
    @Test
    public void test_LessEqualComparison_variable_constant() {
        String text = "a <= 3.4f";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof LessEqualComparison);
        assertTrue (((Comparison) root).getLeftChild() instanceof VariableTerm);
        assertTrue (((Comparison) root).getRightChild() instanceof ConstantTerm);
    }
    @Test
    public void test_LessEqualComparison_constant_variable() {
        String text = "2.3f <= b";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof LessEqualComparison);
        assertTrue (((Comparison) root).getLeftChild() instanceof ConstantTerm);
        assertTrue (((Comparison) root).getRightChild() instanceof VariableTerm);
    }
    @Test
    public void test_LessEqualComparison_variable_variable() {
        String text = "c <= b";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof LessEqualComparison);
        assertTrue (((Comparison) root).getLeftChild() instanceof VariableTerm);
        assertTrue (((Comparison) root).getRightChild() instanceof VariableTerm);
    }
  //equal
    @Test
    public void test_EqualComparison_constant_constant() {
        String text = "2.1 == 3.4f";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof EqualComparison);
        assertTrue (((Comparison) root).getLeftChild() instanceof ConstantTerm);
        assertTrue (((Comparison) root).getRightChild() instanceof ConstantTerm);
    }
    @Test
    public void test_EqualComparison_variable_constant() {
        String text = "a == 3.4f";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof EqualComparison);
        assertTrue (((Comparison) root).getLeftChild() instanceof VariableTerm);
        assertTrue (((Comparison) root).getRightChild() instanceof ConstantTerm);
    }
    @Test
    public void test_EqualComparison_constant_variable() {
        String text = "2.3f == b";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof EqualComparison);
        assertTrue (((Comparison) root).getLeftChild() instanceof ConstantTerm);
        assertTrue (((Comparison) root).getRightChild() instanceof VariableTerm);
    }
    @Test
    public void test_EqualComparison_variable_variable() {
        String text = "c == b";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof EqualComparison);
        assertTrue (((Comparison) root).getLeftChild() instanceof VariableTerm);
        assertTrue (((Comparison) root).getRightChild() instanceof VariableTerm);
    }
  //notNotEqual
    @Test
    public void test_NotEqualComparison_constant_constant() {
        String text = "2.1 != 3.4f";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof NotEqualComparison);
        assertTrue (((Comparison) root).getLeftChild() instanceof ConstantTerm);
        assertTrue (((Comparison) root).getRightChild() instanceof ConstantTerm);
    }
    @Test
    public void test_NotEqualComparison_variable_constant() {
        String text = "a != 3.4f";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof NotEqualComparison);
        assertTrue (((Comparison) root).getLeftChild() instanceof VariableTerm);
        assertTrue (((Comparison) root).getRightChild() instanceof ConstantTerm);
    }
    @Test
    public void test_NotEqualComparison_constant_variable() {
        String text = "2.3f != b";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof NotEqualComparison);
        assertTrue (((Comparison) root).getLeftChild() instanceof ConstantTerm);
        assertTrue (((Comparison) root).getRightChild() instanceof VariableTerm);
    }
    @Test
    public void test_NotEqualComparison_variable_variable() {
        String text = "c != b";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof NotEqualComparison);
        assertTrue (((Comparison) root).getLeftChild() instanceof VariableTerm);
        assertTrue (((Comparison) root).getRightChild() instanceof VariableTerm);
    }
    //AND
    @Test
    public void test_AndCondition_constant_constant() {
        String text = "false && false";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof AndCondition);
        assertTrue (((BinaryCondition) root).getLeftChild() instanceof ConstantTerm);
        assertTrue (((BinaryCondition) root).getRightChild() instanceof ConstantTerm);
    }
    @Test
    public void test_AndCondition_variable_constant() {
        String text = "a && true";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof AndCondition);
        assertTrue (((BinaryCondition) root).getLeftChild() instanceof VariableTerm);
        assertTrue (((BinaryCondition) root).getRightChild() instanceof ConstantTerm);
    }
    @Test
    public void test_AndCondition_constant_variable() {
        String text = "true && b";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof AndCondition);
        assertTrue (((BinaryCondition) root).getLeftChild() instanceof ConstantTerm);
        assertTrue (((BinaryCondition) root).getRightChild() instanceof VariableTerm);
    }
    @Test
    public void test_AndCondition_variable_variable() {
        String text = "c && b";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof AndCondition);
        assertTrue (((BinaryCondition) root).getLeftChild() instanceof VariableTerm);
        assertTrue (((BinaryCondition) root).getRightChild() instanceof VariableTerm);
    }
  //Or
    @Test
    public void test_OrCondition_constant_constant() {
        String text = "false || false";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof OrCondition);
        assertTrue (((BinaryCondition) root).getLeftChild() instanceof ConstantTerm);
        assertTrue (((BinaryCondition) root).getRightChild() instanceof ConstantTerm);
    }
    @Test
    public void test_OrCondition_variable_constant() {
        String text = "a || true";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof OrCondition);
        assertTrue (((BinaryCondition) root).getLeftChild() instanceof VariableTerm);
        assertTrue (((BinaryCondition) root).getRightChild() instanceof ConstantTerm);
    }
    @Test
    public void test_OrCondition_constant_variable() {
        String text = "true || b";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof OrCondition);
        assertTrue (((BinaryCondition) root).getLeftChild() instanceof ConstantTerm);
        assertTrue (((BinaryCondition) root).getRightChild() instanceof VariableTerm);
    }
    @Test
    public void test_OrCondition_variable_variable() {
        String text = "c || b";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof OrCondition);
        assertTrue (((BinaryCondition) root).getLeftChild() instanceof VariableTerm);
        assertTrue (((BinaryCondition) root).getRightChild() instanceof VariableTerm);
    }
    
    //Not
    //Or
    @Test
    public void test_NotCondition_constant() {
        String text = "!false";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof NotCondition);
        assertTrue (((NotCondition) root).getChild() instanceof ConstantTerm);
    }
    @Test
    public void test_NotCondition_variable() {
        String text = "!b";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof NotCondition);
        assertTrue (((NotCondition) root).getChild() instanceof VariableTerm);
    }
    //Combined terms
    @Test
    public void test_combinedComplicatedTerm() {
        String text = "(!b)&&(a<'c'+c)";
        CharStream input = CharStreams.fromString(text);
        WlangLexer lexer = new WlangLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        WlangParser parser = new WlangParser(tokens);
        ParseTree tree = parser.wecbterm();
        TermGenerationVisitor visitor = new TermGenerationVisitor();
        Term root = visitor.visit(tree);
        assertTrue (root instanceof AndCondition);
        assertTrue (((BinaryCondition) root).getLeftChild() instanceof NotCondition);
        assertTrue (((BinaryCondition) root).getRightChild() instanceof LessComparison);
        assertTrue (((NotCondition) ((BinaryCondition) root).getLeftChild()).getChild() instanceof VariableTerm);
        assertTrue (((Comparison) ((BinaryCondition) root).getRightChild()).getLeftChild() instanceof VariableTerm);
        assertTrue (((Comparison) ((BinaryCondition) root).getRightChild()).getRightChild() instanceof AdditionTerm);
        assertTrue (((BinaryArithmeticTerm) ((Comparison) ((BinaryCondition) root).getRightChild()).getRightChild()).getRightChild() instanceof VariableTerm);
        assertTrue (((BinaryArithmeticTerm) ((Comparison) ((BinaryCondition) root).getRightChild()).getRightChild()).getLeftChild() instanceof ConstantTerm);
        
    }
}

