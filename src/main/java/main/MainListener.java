// Generated from Main.g4 by ANTLR 4.13.2

package main;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MainParser}.
 */
public interface MainListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MainParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MainParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MainParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MainParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MainParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDeclAssign}
	 * labeled alternative in {@link MainParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclAssign(MainParser.VarDeclAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDeclAssign}
	 * labeled alternative in {@link MainParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclAssign(MainParser.VarDeclAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDeclNoAssign}
	 * labeled alternative in {@link MainParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclNoAssign(MainParser.VarDeclNoAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDeclNoAssign}
	 * labeled alternative in {@link MainParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclNoAssign(MainParser.VarDeclNoAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MainParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MainParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MainParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MainParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MainParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MainParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(MainParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(MainParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(MainParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(MainParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MainParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MainParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringExpr}
	 * labeled alternative in {@link MainParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(MainParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringExpr}
	 * labeled alternative in {@link MainParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(MainParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalWordExpr}
	 * labeled alternative in {@link MainParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalWordExpr(MainParser.LogicalWordExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalWordExpr}
	 * labeled alternative in {@link MainParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalWordExpr(MainParser.LogicalWordExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link MainParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpr(MainParser.NumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link MainParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpr(MainParser.NumberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link MainParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpr(MainParser.ComparisonExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link MainParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpr(MainParser.ComparisonExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarExpr}
	 * labeled alternative in {@link MainParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr(MainParser.VarExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarExpr}
	 * labeled alternative in {@link MainParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr(MainParser.VarExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link MainParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(MainParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link MainParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(MainParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalSymbolExpr}
	 * labeled alternative in {@link MainParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalSymbolExpr(MainParser.LogicalSymbolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalSymbolExpr}
	 * labeled alternative in {@link MainParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalSymbolExpr(MainParser.LogicalSymbolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanExpr}
	 * labeled alternative in {@link MainParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpr(MainParser.BooleanExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanExpr}
	 * labeled alternative in {@link MainParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpr(MainParser.BooleanExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathExpr}
	 * labeled alternative in {@link MainParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpr(MainParser.MathExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExpr}
	 * labeled alternative in {@link MainParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpr(MainParser.MathExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MainParser#placeholder}.
	 * @param ctx the parse tree
	 */
	void enterPlaceholder(MainParser.PlaceholderContext ctx);
	/**
	 * Exit a parse tree produced by {@link MainParser#placeholder}.
	 * @param ctx the parse tree
	 */
	void exitPlaceholder(MainParser.PlaceholderContext ctx);
}