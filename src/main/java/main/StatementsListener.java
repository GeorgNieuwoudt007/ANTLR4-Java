// Generated from Statements.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StatementsParser}.
 */
public interface StatementsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StatementsParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(StatementsParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementsParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(StatementsParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDeclAssign}
	 * labeled alternative in {@link StatementsParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclAssign(StatementsParser.VarDeclAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDeclAssign}
	 * labeled alternative in {@link StatementsParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclAssign(StatementsParser.VarDeclAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDeclNoAssign}
	 * labeled alternative in {@link StatementsParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclNoAssign(StatementsParser.VarDeclNoAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDeclNoAssign}
	 * labeled alternative in {@link StatementsParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclNoAssign(StatementsParser.VarDeclNoAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link StatementsParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(StatementsParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementsParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(StatementsParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link StatementsParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(StatementsParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementsParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(StatementsParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StatementsParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(StatementsParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementsParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(StatementsParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StatementsParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(StatementsParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementsParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(StatementsParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StatementsParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(StatementsParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementsParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(StatementsParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StatementsParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(StatementsParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementsParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(StatementsParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringExpr}
	 * labeled alternative in {@link StatementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(StatementsParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringExpr}
	 * labeled alternative in {@link StatementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(StatementsParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalWordExpr}
	 * labeled alternative in {@link StatementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalWordExpr(StatementsParser.LogicalWordExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalWordExpr}
	 * labeled alternative in {@link StatementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalWordExpr(StatementsParser.LogicalWordExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link StatementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpr(StatementsParser.NumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link StatementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpr(StatementsParser.NumberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link StatementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpr(StatementsParser.ComparisonExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link StatementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpr(StatementsParser.ComparisonExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarExpr}
	 * labeled alternative in {@link StatementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr(StatementsParser.VarExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarExpr}
	 * labeled alternative in {@link StatementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr(StatementsParser.VarExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link StatementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(StatementsParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link StatementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(StatementsParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalSymbolExpr}
	 * labeled alternative in {@link StatementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalSymbolExpr(StatementsParser.LogicalSymbolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalSymbolExpr}
	 * labeled alternative in {@link StatementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalSymbolExpr(StatementsParser.LogicalSymbolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanExpr}
	 * labeled alternative in {@link StatementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpr(StatementsParser.BooleanExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanExpr}
	 * labeled alternative in {@link StatementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpr(StatementsParser.BooleanExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathExpr}
	 * labeled alternative in {@link StatementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpr(StatementsParser.MathExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExpr}
	 * labeled alternative in {@link StatementsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpr(StatementsParser.MathExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link StatementsParser#placeholder}.
	 * @param ctx the parse tree
	 */
	void enterPlaceholder(StatementsParser.PlaceholderContext ctx);
	/**
	 * Exit a parse tree produced by {@link StatementsParser#placeholder}.
	 * @param ctx the parse tree
	 */
	void exitPlaceholder(StatementsParser.PlaceholderContext ctx);
}