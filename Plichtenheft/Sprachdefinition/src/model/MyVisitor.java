package model;

import org.antlr.v4.runtime.tree.ParseTree;

import basic.WlangBaseVisitor;
import basic.WlangParser.AdditionContext;
import basic.WlangParser.AssignmentContext;
import basic.WlangParser.CharLiteralContext;
import basic.WlangParser.CompStatementContext;
import basic.WlangParser.DeclarationContext;
import basic.WlangParser.DeclareAssignContext;
import basic.WlangParser.FloatLiteralContext;
import basic.WlangParser.IDContext;
import basic.WlangParser.IntLiteralContext;
import basic.WlangParser.PureAssignContext;
import basic.WlangParser.SingleStatementContext;
import basic.WlangParser.StatementContext;

public class MyVisitor extends WlangBaseVisitor<String> {
	@Override
	public String visitSingleStatement(SingleStatementContext ctx) {
		return visitChildren(ctx);
	}
	@Override
	public String visitCompStatement(CompStatementContext ctx) {
		return visitChildren(ctx);
	}
	@Override
	public String visitStatement(StatementContext ctx) {
		return visitChildren(ctx);
	}
	@Override
	public String visitDeclaration(DeclarationContext ctx) {
		return "Deklaration von "+ctx.id.getText() +" als " + ctx.type.getText();
	}
	@Override
	public String visitAssignment(AssignmentContext ctx) {
		return visitChildren(ctx);
	}
	@Override
	public String visitPureAssign(PureAssignContext ctx) {
		return "Die Variable " + ctx.id.getText() + " wird auf " + visitChildren(ctx) + " gesetzt";
	}
	@Override
	public String visitAddition(AdditionContext ctx) {
		return visit(ctx.left) +"+"+ visit(ctx.right);
	}
	@Override
	public String visitIntLiteral(IntLiteralContext ctx) {
		return ctx.getText();
	}
	@Override
	public String visitID(IDContext ctx) {
		return ctx.getText();
	}
	@Override
	public String visitFloatLiteral(FloatLiteralContext ctx) {
		return ctx.getText();
	}
	@Override
	public String visitCharLiteral(CharLiteralContext ctx) {
		return ctx.getText();
	}
	@Override
	public String visitDeclareAssign(DeclareAssignContext ctx) {
		return "Deklaration von "+ctx.id.getText() +" als " + ctx.type.getText() + " und setzen auf " + visit(ctx.value);
	}
	@Override
	protected String aggregateResult(String aggregate, String nextResult) {
		if (aggregate == null) {
			return nextResult;
		}
		if (nextResult ==  null) {
			return aggregate;
		}
		return aggregate +"\n"+ nextResult;
	}
}