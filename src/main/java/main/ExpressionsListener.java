// Generated from Expressions.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionsParser}.
 */
public interface ExpressionsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code StringExpr}
	 * labeled alternative in {@link ExpressionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(ExpressionsParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringExpr}
	 * labeled alternative in {@link ExpressionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(ExpressionsParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalWordExpr}
	 * labeled alternative in {@link ExpressionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalWordExpr(ExpressionsParser.LogicalWordExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalWordExpr}
	 * labeled alternative in {@link ExpressionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalWordExpr(ExpressionsParser.LogicalWordExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link ExpressionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpr(ExpressionsParser.NumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberExpr}
	 * labeled alternative in {@link ExpressionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpr(ExpressionsParser.NumberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link ExpressionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpr(ExpressionsParser.ComparisonExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpr}
	 * labeled alternative in {@link ExpressionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpr(ExpressionsParser.ComparisonExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarExpr}
	 * labeled alternative in {@link ExpressionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr(ExpressionsParser.VarExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarExpr}
	 * labeled alternative in {@link ExpressionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr(ExpressionsParser.VarExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link ExpressionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(ExpressionsParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link ExpressionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(ExpressionsParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalSymbolExpr}
	 * labeled alternative in {@link ExpressionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalSymbolExpr(ExpressionsParser.LogicalSymbolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalSymbolExpr}
	 * labeled alternative in {@link ExpressionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalSymbolExpr(ExpressionsParser.LogicalSymbolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanExpr}
	 * labeled alternative in {@link ExpressionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpr(ExpressionsParser.BooleanExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanExpr}
	 * labeled alternative in {@link ExpressionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpr(ExpressionsParser.BooleanExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathExpr}
	 * labeled alternative in {@link ExpressionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpr(ExpressionsParser.MathExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathExpr}
	 * labeled alternative in {@link ExpressionsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpr(ExpressionsParser.MathExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionsParser#placeholder}.
	 * @param ctx the parse tree
	 */
	void enterPlaceholder(ExpressionsParser.PlaceholderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionsParser#placeholder}.
	 * @param ctx the parse tree
	 */
	void exitPlaceholder(ExpressionsParser.PlaceholderContext ctx);
}