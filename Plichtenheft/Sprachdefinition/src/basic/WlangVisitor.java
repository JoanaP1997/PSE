// Generated from Wlang.g4 by ANTLR 4.7
package basic;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WlangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WlangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link WlangParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(WlangParser.RContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionHead}
	 * labeled alternative in {@link WlangParser#routineHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionHead(WlangParser.FunctionHeadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ProcedureHead}
	 * labeled alternative in {@link WlangParser#routineHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureHead(WlangParser.ProcedureHeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link WlangParser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(WlangParser.ArglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link WlangParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(WlangParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link WlangParser#routine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine(WlangParser.RoutineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompStatement}
	 * labeled alternative in {@link WlangParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompStatement(WlangParser.CompStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleStatement}
	 * labeled alternative in {@link WlangParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStatement(WlangParser.SingleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WlangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(WlangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WlangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(WlangParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link WlangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(WlangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link WlangParser#pureAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPureAssign(WlangParser.PureAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link WlangParser#declareAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareAssign(WlangParser.DeclareAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link WlangParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(WlangParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link WlangParser#ifState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfState(WlangParser.IfStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link WlangParser#ifelseState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfelseState(WlangParser.IfelseStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link WlangParser#whileState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileState(WlangParser.WhileStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdCondition}
	 * labeled alternative in {@link WlangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdCondition(WlangParser.IdConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonCondition}
	 * labeled alternative in {@link WlangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonCondition(WlangParser.ComparisonConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PureCondition}
	 * labeled alternative in {@link WlangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPureCondition(WlangParser.PureConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrCondition}
	 * labeled alternative in {@link WlangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrCondition(WlangParser.OrConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndCondition}
	 * labeled alternative in {@link WlangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndCondition(WlangParser.AndConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotCondition}
	 * labeled alternative in {@link WlangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotCondition(WlangParser.NotConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WlangParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(WlangParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link WlangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(WlangParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link WlangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(WlangParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link WlangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(WlangParser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Brackets}
	 * labeled alternative in {@link WlangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackets(WlangParser.BracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharLiteral}
	 * labeled alternative in {@link WlangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharLiteral(WlangParser.CharLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatLiteral}
	 * labeled alternative in {@link WlangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(WlangParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link WlangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulo(WlangParser.ModuloContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link WlangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(WlangParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link WlangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(WlangParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ID}
	 * labeled alternative in {@link WlangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitID(WlangParser.IDContext ctx);
}