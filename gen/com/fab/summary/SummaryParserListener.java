// Generated from /home/x3148/xxxx/src/anltr-summary/g4/SummaryParser.g4 by ANTLR 4.9.2
package com.fab.summary;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SummaryParser}.
 */
public interface SummaryParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SummaryParser#other}.
	 * @param ctx the parse tree
	 */
	void enterOther(SummaryParser.OtherContext ctx);
	/**
	 * Exit a parse tree produced by {@link SummaryParser#other}.
	 * @param ctx the parse tree
	 */
	void exitOther(SummaryParser.OtherContext ctx);
	/**
	 * Enter a parse tree produced by {@link SummaryParser#point}.
	 * @param ctx the parse tree
	 */
	void enterPoint(SummaryParser.PointContext ctx);
	/**
	 * Exit a parse tree produced by {@link SummaryParser#point}.
	 * @param ctx the parse tree
	 */
	void exitPoint(SummaryParser.PointContext ctx);
	/**
	 * Enter a parse tree produced by {@link SummaryParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(SummaryParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SummaryParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(SummaryParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SummaryParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SummaryParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SummaryParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SummaryParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SummaryParser#status}.
	 * @param ctx the parse tree
	 */
	void enterStatus(SummaryParser.StatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link SummaryParser#status}.
	 * @param ctx the parse tree
	 */
	void exitStatus(SummaryParser.StatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link SummaryParser#issue}.
	 * @param ctx the parse tree
	 */
	void enterIssue(SummaryParser.IssueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SummaryParser#issue}.
	 * @param ctx the parse tree
	 */
	void exitIssue(SummaryParser.IssueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SummaryParser#jira}.
	 * @param ctx the parse tree
	 */
	void enterJira(SummaryParser.JiraContext ctx);
	/**
	 * Exit a parse tree produced by {@link SummaryParser#jira}.
	 * @param ctx the parse tree
	 */
	void exitJira(SummaryParser.JiraContext ctx);
	/**
	 * Enter a parse tree produced by {@link SummaryParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SummaryParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SummaryParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SummaryParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SummaryParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(SummaryParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SummaryParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(SummaryParser.ExpressionsContext ctx);
}