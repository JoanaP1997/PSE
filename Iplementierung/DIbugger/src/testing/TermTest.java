package testing;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dibugger.DebugLogic.Interpreter.AdditionTerm;
import dibugger.DebugLogic.Interpreter.BooleanValue;
import dibugger.DebugLogic.Interpreter.ConstantTerm;
import dibugger.DebugLogic.Interpreter.DivisionTerm;
import dibugger.DebugLogic.Interpreter.IntValue;
import dibugger.DebugLogic.Interpreter.ModuloTerm;
import dibugger.DebugLogic.Interpreter.MultiplicationTerm;
import dibugger.DebugLogic.Interpreter.NotCondition;
import dibugger.DebugLogic.Interpreter.Scope;
import dibugger.DebugLogic.Interpreter.SubtractionTerm;
import dibugger.DebugLogic.Interpreter.Term;
import dibugger.DebugLogic.Interpreter.TraceState;
/**
 * 
 * @author wagner
 *
 */
public class TermTest {
    Term constantA, constantB, constantTrue, constantFalse;
    Scope currentScope;
    @Before
    public void init() {
	constantA = new ConstantTerm(new IntValue(5));
	currentScope = new Scope();
	constantB = new ConstantTerm(new IntValue(7));
	constantTrue = new ConstantTerm(new BooleanValue(true));
	constantFalse = new ConstantTerm(new BooleanValue(false));
    }    
    @Test
    public void constantTermsTest() {
	//Constant Term
	assert(constantA.evaluate(currentScope).toString().equals("5"));
	assert(constantB.evaluate(currentScope).toString().equals("7"));
	assert(constantFalse.evaluate(currentScope).toString().equals("false"));
	assert(constantTrue.evaluate(currentScope).toString().equals("true"));
    }
    @Test
    public void multiplicationTermsTest(){

	//Multiply
	Term mult = new MultiplicationTerm(constantA, constantB);
	assert(mult.evaluate(currentScope).toString().equals("35"));
    }
    @Test
    public void divisionTermsTest(){
	//Div
		Term div = new DivisionTerm(constantA, constantB);
		//System.out.println(div.evaluate(currentScope).toString());
		assert(div.evaluate(currentScope).toString().equals("0"));
    }
    @Test
    public void additionTermsTest(){
	
		Term add = new AdditionTerm(constantA, constantB);
		//System.out.println(div.evaluate(currentScope).toString());
		assert(add.evaluate(currentScope).toString().equals("12"));
    }
    @Test
    public void subtractionTermsTest(){
	
		Term sub = new SubtractionTerm(constantA, constantB);
		//System.out.println(div.evaluate(currentScope).toString());
		assert(sub.evaluate(currentScope).toString().equals("-2"));
    }
    @Test
    public void moduloTermsTest(){
	
		Term mod = new ModuloTerm(constantB, constantA);
		//System.out.println(mod.evaluate(currentScope).toString());
		assert(mod.evaluate(currentScope).toString().equals("2"));
    }
    ////////////////////////////////Boolean Terms/////////////////////////////
    @Test
    public void NotConditionTermsTest(){
	
		Term notA = new NotCondition(constantFalse);
		Term notB = new NotCondition(constantTrue);
		//System.out.println(mod.evaluate(currentScope).toString());
		assert(notA.evaluate(currentScope).toString().equals("true"));
		assert(notB.evaluate(currentScope).toString().equals("false"));
    }
    

}
