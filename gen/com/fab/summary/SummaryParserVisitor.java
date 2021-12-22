// Generated from /home/x3148/xxxx/src/anltr-summary/g4/SummaryParser.g4 by ANTLR 4.9.2
package com.fab.summary;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SummaryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SummaryParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SummaryParser#other}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther(SummaryParser.OtherContext ctx);
	/**
	 * Visit a parse tree produced by {@link SummaryParser#point}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoint(SummaryParser.PointContext ctx);
	/**
	 * Visit a parse tree produced by {@link SummaryParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(SummaryParser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SummaryParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SummaryParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SummaryParser#status}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatus(SummaryParser.StatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link SummaryParser#issue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIssue(SummaryParser.IssueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SummaryParser#jira}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJira(SummaryParser.JiraContext ctx);
	/**
	 * Visit a parse tree produced by {@link SummaryParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SummaryParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SummaryParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(SummaryParser.ExpressionsContext ctx);
}