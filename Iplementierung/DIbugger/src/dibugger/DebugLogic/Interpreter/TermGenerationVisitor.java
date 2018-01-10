package dibugger.DebugLogic.Interpreter;

import dibugger.DebugLogic.AntlrParser.TermsBaseVisitor;
import dibugger.DebugLogic.AntlrParser.TermsParser.AdditionContext;
import dibugger.DebugLogic.AntlrParser.TermsParser.AndConditionContext;
import dibugger.DebugLogic.AntlrParser.TermsParser.ArrayAccessConditionContext;
import dibugger.DebugLogic.AntlrParser.TermsParser.ArrayAccessInTermContext;
import dibugger.DebugLogic.AntlrParser.TermsParser.BracketConditionContext;
import dibugger.DebugLogic.AntlrParser.TermsParser.BracketsContext;
import dibugger.DebugLogic.AntlrParser.TermsParser.ComparisonConditionContext;
import dibugger.DebugLogic.AntlrParser.TermsParser.DivisionContext;
import dibugger.DebugLogic.AntlrParser.TermsParser.EqualCompContext;
import dibugger.DebugLogic.AntlrParser.TermsParser.FloatLiteralContext;
import dibugger.DebugLogic.AntlrParser.TermsParser.IDContext;
import dibugger.DebugLogic.AntlrParser.TermsParser.IntLiteralContext;
import dibugger.DebugLogic.AntlrParser.TermsParser.LessCompContext;
import dibugger.DebugLogic.AntlrParser.TermsParser.LessEqualCompContext;
import dibugger.DebugLogic.AntlrParser.TermsParser.ModuloContext;
import dibugger.DebugLogic.AntlrParser.TermsParser.MoreCompContext;
import dibugger.DebugLogic.AntlrParser.TermsParser.MoreEqualCompContext;
import dibugger.DebugLogic.AntlrParser.TermsParser.MultiplicationContext;
import dibugger.DebugLogic.AntlrParser.TermsParser.NegativeTermContext;
import dibugger.DebugLogic.AntlrParser.TermsParser.NotConditionContext;
import dibugger.DebugLogic.AntlrParser.TermsParser.NotEqualCompContext;
import dibugger.DebugLogic.AntlrParser.TermsParser.OrConditionContext;
import dibugger.DebugLogic.AntlrParser.TermsParser.SubtractionContext;

/**
 * 
 * @author wagner
 *
 */

public class TermGenerationVisitor extends TermsBaseVisitor<Term> {
	//Arithmetic
    	@Override
	public Term visitAddition(AdditionContext ctx) {
		Term leftTerm, rightTerm;
		leftTerm = this.visit(ctx.left);
		rightTerm = this.visit(ctx.right);
		return new AdditionTerm(leftTerm, rightTerm);
	}
	@Override
	public Term visitMultiplication(MultiplicationContext ctx) {
		Term leftTerm, rightTerm;
		leftTerm = this.visit(ctx.left);
		rightTerm = this.visit(ctx.right);
		return new MultiplicationTerm(leftTerm, rightTerm);
	}
	@Override
	public Term visitDivision(DivisionContext ctx) {
		Term leftTerm, rightTerm;
		leftTerm = this.visit(ctx.left);
		rightTerm = this.visit(ctx.right);
		return new DivisionTerm(leftTerm, rightTerm);
	}
	@Override
	public Term visitSubtraction(SubtractionContext ctx) {
		Term leftTerm, rightTerm;
		leftTerm = this.visit(ctx.left);
		rightTerm = this.visit(ctx.right);
		return new SubtractionTerm(leftTerm, rightTerm);
	}
	@Override
	public Term visitModulo(ModuloContext ctx) {
		Term leftTerm, rightTerm;
		leftTerm = this.visit(ctx.left);
		rightTerm = this.visit(ctx.right);
		return new ModuloTerm(leftTerm, rightTerm);
	}
	@Override
	public Term visitNegativeTerm(NegativeTermContext ctx) {
	    Term innerTerm;
	    innerTerm = this.visit(ctx.inner);
	    return new NegativeTerm(innerTerm);
	}
	//Logic
	@Override
	public Term visitAndCondition(AndConditionContext ctx) {
	// TODO Auto-generated method stub
	return super.visitAndCondition(ctx);
	}
	@Override
	public Term visitOrCondition(OrConditionContext ctx) {
	// TODO Auto-generated method stub
	return super.visitOrCondition(ctx);
	}
	@Override
	public Term visitNotCondition(NotConditionContext ctx) {
	    Term innerTerm;
	    innerTerm = this.visit(ctx.getChild(0));
	    return new NotCondition(innerTerm);
	}
	@Override
	public Term visitBracketCondition(BracketConditionContext ctx) {
	    return this.visit(ctx.getChild(0));
	}
	@Override
	public Term visitComparisonCondition(ComparisonConditionContext ctx) {
	    return this.visit(ctx.getChild(0));
	}
	//Comparison
	@Override
	public Term visitEqualComp(EqualCompContext ctx) {
	    Term leftOp, rightOp;
	    leftOp = this.visit(ctx.left);
	    rightOp = this.visit(ctx.right);
	    return new EqualComparison(leftOp,rightOp);
	}
	@Override
	public Term visitLessComp(LessCompContext ctx) {
	    Term leftOp, rightOp;
	    leftOp = this.visit(ctx.left);
	    rightOp = this.visit(ctx.right);
	    return new LessComparison(leftOp,rightOp);
	}
	@Override
	public Term visitLessEqualComp(LessEqualCompContext ctx) {
	    Term leftOp, rightOp;
	    leftOp = this.visit(ctx.left);
	    rightOp = this.visit(ctx.right);
	    return new LessEqualComparison(leftOp,rightOp);
	}
	@Override
	public Term visitMoreComp(MoreCompContext ctx) {
	    Term leftOp, rightOp;
	    leftOp = this.visit(ctx.left);
	    rightOp = this.visit(ctx.right);
	    return new MoreComparison(leftOp,rightOp);
	}
	@Override
	public Term visitMoreEqualComp(MoreEqualCompContext ctx) {
	    Term leftOp, rightOp;
	    leftOp = this.visit(ctx.left);
	    rightOp = this.visit(ctx.right);
	    return new MoreEqualComparison(leftOp,rightOp);
	}
	@Override
	public Term visitNotEqualComp(NotEqualCompContext ctx) {
	    Term leftOp, rightOp;
	    leftOp = this.visit(ctx.left);
	    rightOp = this.visit(ctx.right);
	    return new NotEqualComparison(leftOp,rightOp);
	}
	//General
	@Override
	public Term visitBrackets(BracketsContext ctx) {
		return this.visit(ctx.inner);
	}
	
	@Override
	public Term visitArrayAccessCondition(ArrayAccessConditionContext ctx) {
	// TODO Auto-generated method stub
	return super.visitArrayAccessCondition(ctx);
	}
	
	@Override
	public Term visitArrayAccessInTerm(ArrayAccessInTermContext ctx) {
		return new VariableRelationalTerm(ctx.getText());
	}
	//Literals
	@Override
	public Term visitIntLiteral(IntLiteralContext ctx) {
		return new ConstantTerm(new IntValue(Integer.parseInt(ctx.getText())));
	}
	@Override
	public Term visitFloatLiteral(FloatLiteralContext ctx) {
		return new ConstantTerm(new FloatValue((Float.parseFloat(ctx.getText()))));
	}
	
	@Override
	public Term visitID(IDContext ctx) {
		return new VariableRelationalTerm(ctx.getText());
	}
	
}
