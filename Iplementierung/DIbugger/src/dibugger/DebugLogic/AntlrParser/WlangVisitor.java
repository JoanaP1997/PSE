// Generated from Wlang.g4 by ANTLR 4.7
package dibugger.DebugLogic.AntlrParser;
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
	 * Visit a parse tree produced by {@link WlangParser#programm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramm(WlangParser.ProgrammContext ctx);
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
	 * Visit a parse tree produced by the {@code MainFunctionHead}
	 * labeled alternative in {@link WlangParser#mainHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFunctionHead(WlangParser.MainFunctionHeadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MainProcedureHead}
	 * labeled alternative in {@link WlangParser#mainHead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainProcedureHead(WlangParser.MainProcedureHeadContext ctx);
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
	 * Visit a parse tree produced by {@link WlangParser#filledArglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilledArglist(WlangParser.FilledArglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link WlangParser#filledArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilledArgument(WlangParser.FilledArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link WlangParser#routine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine(WlangParser.RoutineContext ctx);
	/**
	 * Visit a parse tree produced by {@link WlangParser#mainRoutine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainRoutine(WlangParser.MainRoutineContext ctx);
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
	 * Visit a parse tree produced by {@link WlangParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(WlangParser.FuncCallContext ctx);
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
	 * Visit a parse tree produced by the {@code arrayDeclarationOneDim}
	 * labeled alternative in {@link WlangParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclarationOneDim(WlangParser.ArrayDeclarationOneDimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayDeclarationTwoDim}
	 * labeled alternative in {@link WlangParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclarationTwoDim(WlangParser.ArrayDeclarationTwoDimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayDeclarationThreeDim}
	 * labeled alternative in {@link WlangParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclarationThreeDim(WlangParser.ArrayDeclarationThreeDimContext ctx);
	/**
	 * Visit a parse tree produced by {@link WlangParser#arrayDeclareAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclareAssign(WlangParser.ArrayDeclareAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayElementAssignOneDim}
	 * labeled alternative in {@link WlangParser#arrayElementAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElementAssignOneDim(WlangParser.ArrayElementAssignOneDimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayElementAssignTwoDim}
	 * labeled alternative in {@link WlangParser#arrayElementAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElementAssignTwoDim(WlangParser.ArrayElementAssignTwoDimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayElementAssignThreeDim}
	 * labeled alternative in {@link WlangParser#arrayElementAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElementAssignThreeDim(WlangParser.ArrayElementAssignThreeDimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code oneDims}
	 * labeled alternative in {@link WlangParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneDims(WlangParser.OneDimsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code twoDims}
	 * labeled alternative in {@link WlangParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoDims(WlangParser.TwoDimsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code threeDims}
	 * labeled alternative in {@link WlangParser#dims}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThreeDims(WlangParser.ThreeDimsContext ctx);
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
	 * Visit a parse tree produced by {@link WlangParser#returnState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnState(WlangParser.ReturnStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifWithBlock}
	 * labeled alternative in {@link WlangParser#ifState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfWithBlock(WlangParser.IfWithBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifWithSingle}
	 * labeled alternative in {@link WlangParser#ifState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfWithSingle(WlangParser.IfWithSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElseWithBlock}
	 * labeled alternative in {@link WlangParser#ifelseState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseWithBlock(WlangParser.IfElseWithBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElseWithSingle}
	 * labeled alternative in {@link WlangParser#ifelseState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseWithSingle(WlangParser.IfElseWithSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileWithBlock}
	 * labeled alternative in {@link WlangParser#whileState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileWithBlock(WlangParser.WhileWithBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileWithSingle}
	 * labeled alternative in {@link WlangParser#whileState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileWithSingle(WlangParser.WhileWithSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonCondition}
	 * labeled alternative in {@link WlangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonCondition(WlangParser.ComparisonConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAccessCondition}
	 * labeled alternative in {@link WlangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessCondition(WlangParser.ArrayAccessConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BracketCondition}
	 * labeled alternative in {@link WlangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketCondition(WlangParser.BracketConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdCondition}
	 * labeled alternative in {@link WlangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdCondition(WlangParser.IdConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstantCondition}
	 * labeled alternative in {@link WlangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantCondition(WlangParser.ConstantConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotCondition}
	 * labeled alternative in {@link WlangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotCondition(WlangParser.NotConditionContext ctx);
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
	 * Visit a parse tree produced by the {@code LessComp}
	 * labeled alternative in {@link WlangParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessComp(WlangParser.LessCompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessEqualComp}
	 * labeled alternative in {@link WlangParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessEqualComp(WlangParser.LessEqualCompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MoreComp}
	 * labeled alternative in {@link WlangParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreComp(WlangParser.MoreCompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MoreEqualComp}
	 * labeled alternative in {@link WlangParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoreEqualComp(WlangParser.MoreEqualCompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualComp}
	 * labeled alternative in {@link WlangParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualComp(WlangParser.EqualCompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotEqualComp}
	 * labeled alternative in {@link WlangParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualComp(WlangParser.NotEqualCompContext ctx);
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
	 * Visit a parse tree produced by the {@code FunctionCallInTerm}
	 * labeled alternative in {@link WlangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallInTerm(WlangParser.FunctionCallInTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharLiteral}
	 * labeled alternative in {@link WlangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharLiteral(WlangParser.CharLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LongLiteral}
	 * labeled alternative in {@link WlangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongLiteral(WlangParser.LongLiteralContext ctx);
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
	 * Visit a parse tree produced by the {@code DoubleLiteral}
	 * labeled alternative in {@link WlangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLiteral(WlangParser.DoubleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ID}
	 * labeled alternative in {@link WlangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitID(WlangParser.IDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAccessInTerm}
	 * labeled alternative in {@link WlangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessInTerm(WlangParser.ArrayAccessInTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegativeTerm}
	 * labeled alternative in {@link WlangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegativeTerm(WlangParser.NegativeTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OneDimArrayAccess}
	 * labeled alternative in {@link WlangParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneDimArrayAccess(WlangParser.OneDimArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TwoDimArrayAccess}
	 * labeled alternative in {@link WlangParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoDimArrayAccess(WlangParser.TwoDimArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThreeDimArrayAccess}
	 * labeled alternative in {@link WlangParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThreeDimArrayAccess(WlangParser.ThreeDimArrayAccessContext ctx);
}