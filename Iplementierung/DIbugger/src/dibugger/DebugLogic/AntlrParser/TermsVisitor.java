// Generated from Terms.g4 by ANTLR 4.7
package dibugger.DebugLogic.AntlrParser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TermsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TermsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TermsParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(TermsParser.RContext ctx);
	/**
	 * Visit a parse tree produced by {@link TermsParser#generalTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneralTerm(TermsParser.GeneralTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonCondition}
	 * labeled alternative in {@link TermsParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonCondition(TermsParser.ComparisonConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAccessCondition}
	 * labeled alternative in {@link TermsParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessCondition(TermsParser.ArrayAccessConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BracketCondition}
	 * labeled alternative in {@link TermsParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketCondition(TermsParser.BracketConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdCondition}
	 * labeled alternative in {@link TermsParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdCondition(TermsParser.IdConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstantCondition}
	 * labeled alternative in {@link TermsParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantCondition(TermsParser.ConstantConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotCondition}
	 * labeled alternative in {@link TermsParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotCondition(TermsParser.NotConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrCondition}
	 * labeled alternative in {@link TermsParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrCondition(TermsParser.OrConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndCondition}
	 * labeled alternative in {@link TermsParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndCondition(TermsParser.AndConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessComp}
	 * labeled alternative in {@link TermsParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessComp(TermsParser.LessCompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessEqualComp}
	 * labeled alternative in {@link TermsParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessEqualComp(TermsParser.LessEqualCompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MoreComp}
	 * labeled alternative in {@link TermsParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreComp(TermsParser.MoreCompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MoreEqualComp}
	 * labeled alternative in {@link TermsParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreEqualComp(TermsParser.MoreEqualCompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualComp}
	 * labeled alternative in {@link TermsParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualComp(TermsParser.EqualCompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotEqualComp}
	 * labeled alternative in {@link TermsParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualComp(TermsParser.NotEqualCompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link TermsParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(TermsParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link TermsParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(TermsParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharLiteral}
	 * labeled alternative in {@link TermsParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharLiteral(TermsParser.CharLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LongLiteral}
	 * labeled alternative in {@link TermsParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongLiteral(TermsParser.LongLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatLiteral}
	 * labeled alternative in {@link TermsParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(TermsParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Modulo}
	 * labeled alternative in {@link TermsParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulo(TermsParser.ModuloContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link TermsParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(TermsParser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Brackets}
	 * labeled alternative in {@link TermsParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackets(TermsParser.BracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link TermsParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteral(TermsParser.IntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link TermsParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(TermsParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleLiteral}
	 * labeled alternative in {@link TermsParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLiteral(TermsParser.DoubleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ID}
	 * labeled alternative in {@link TermsParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitID(TermsParser.IDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAccessInTerm}
	 * labeled alternative in {@link TermsParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessInTerm(TermsParser.ArrayAccessInTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegativeTerm}
	 * labeled alternative in {@link TermsParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegativeTerm(TermsParser.NegativeTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OneDimArrayAccess}
	 * labeled alternative in {@link TermsParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneDimArrayAccess(TermsParser.OneDimArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TwoDimArrayAccess}
	 * labeled alternative in {@link TermsParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoDimArrayAccess(TermsParser.TwoDimArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThreeDimArrayAccess}
	 * labeled alternative in {@link TermsParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThreeDimArrayAccess(TermsParser.ThreeDimArrayAccessContext ctx);
}