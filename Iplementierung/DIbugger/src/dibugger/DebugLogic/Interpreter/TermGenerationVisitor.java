package dibugger.DebugLogic.Interpreter;

import dibugger.DebugLogic.AntlrParser.WlangBaseVisitor;
import dibugger.DebugLogic.AntlrParser.WlangParser.AdditionContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.AndConditionContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.ArrayAccessConditionContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.ArrayAccessInTermContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.BracketConditionContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.BracketsContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.CharLiteralContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.ComparisonConditionContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.ConstantConditionContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.DivisionContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.DoubleLiteralContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.EqualCompContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.FloatLiteralContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.IdConditionContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.IdContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.IntLiteralContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.LessCompContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.LessEqualCompContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.LongLiteralContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.ModuloContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.MoreCompContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.MoreEqualCompContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.MultiplicationContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.NegativeTermContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.NotConditionContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.NotEqualCompContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.OneDimArrayAccessContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.OrConditionContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.RelIdConditionContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.RelIdContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.SubtractionContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.ThreeDimArrayAccessContext;
import dibugger.DebugLogic.AntlrParser.WlangParser.TwoDimArrayAccessContext;



/**
 * 
 * @author wagner
 *
 */

public class TermGenerationVisitor extends WlangBaseVisitor<Term> {
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
	//Boolean Terms
	@Override
	public Term visitAndCondition(AndConditionContext ctx) {
	        Term leftTerm, rightTerm;
		leftTerm = this.visit(ctx.left);
		rightTerm = this.visit(ctx.right);
		return new AndCondition(leftTerm, rightTerm);
	}
	@Override
	public Term visitOrCondition(OrConditionContext ctx) {
	    Term leftTerm, rightTerm;
		leftTerm = this.visit(ctx.left);
		rightTerm = this.visit(ctx.right);
		return new OrCondition(leftTerm, rightTerm);
	}
	@Override
	public Term visitNotCondition(NotConditionContext ctx) {
	    Term innerTerm;
	    innerTerm = this.visit(ctx.inner);
	    return new NotCondition(innerTerm);
	}
	@Override
	public Term visitBracketCondition(BracketConditionContext ctx) {
	    return this.visit(ctx.inner);
	}
	@Override
	public Term visitComparisonCondition(ComparisonConditionContext ctx) {
	    return this.visitChildren(ctx);
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
	//Array Access
	@Override
	public Term visitBrackets(BracketsContext ctx) {
		return this.visit(ctx.inner);
	}
	@Override
	public Term visitArrayAccessCondition(ArrayAccessConditionContext ctx) {
	    return this.visitChildren(ctx);
	}
	
	@Override
	public Term visitArrayAccessInTerm(ArrayAccessInTermContext ctx) {
	    return this.visitChildren(ctx);
	}
	@Override
	public Term visitOneDimArrayAccess(OneDimArrayAccessContext ctx) {
	    String id = ctx.id.getText();
	    Term index = this.visit(ctx.index);
	    return new ArrayAccessRelationalTerm(id, index);
	}
	@Override
	public Term visitTwoDimArrayAccess(TwoDimArrayAccessContext ctx) {
	    String id = ctx.id.getText();
	    Term firstIndex = this.visit(ctx.firstIndex);
	    Term secondIndex = this.visit(ctx.secondIndex);
	    return new ArrayAccessRelationalTerm(id, firstIndex, secondIndex);
	}
	@Override
	public Term visitThreeDimArrayAccess(ThreeDimArrayAccessContext ctx) {
	    String id = ctx.id.getText();
	    Term firstIndex = this.visit(ctx.firstIndex);
	    Term secondIndex = this.visit(ctx.secondIndex);
	    Term thirdIndex = this.visit(ctx.thirdIndex);
	    return new ArrayAccessRelationalTerm(id, firstIndex, secondIndex, thirdIndex);
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
	public Term visitDoubleLiteral(DoubleLiteralContext ctx) {
	    	return new ConstantTerm(new DoubleValue(Double.parseDouble(ctx.getText())));
	}
	@Override
	public Term visitLongLiteral(LongLiteralContext ctx) {
	    	return new ConstantTerm(new LongValue(Long.parseLong(ctx.getText())));
	}
	@Override
	public Term visitCharLiteral(CharLiteralContext ctx) {
	    	return new ConstantTerm(new CharValue(ctx.getText().charAt(0)));
	}
	//IDs and Constants
	@Override
	public Term visitId(IdContext ctx) {
	    return new VariableTerm(ctx.getText());
	}
	@Override
	public Term visitRelId(RelIdContext ctx) {
	    return new VariableRelationalTerm(ctx.getText());
	}
	@Override
	public Term visitConstantCondition(ConstantConditionContext ctx) {
	    	return new ConstantTerm(new BooleanValue(Boolean.parseBoolean(ctx.getText())));
	}
	@Override
	public Term visitIdCondition(IdConditionContext ctx) {
	    return new VariableTerm(ctx.getText());
	}
	@Override
	public Term visitRelIdCondition(RelIdConditionContext ctx) {
	    return new VariableRelationalTerm(ctx.getText());
	}
	
}
