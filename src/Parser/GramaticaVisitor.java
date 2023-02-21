// Generated from java-escape by ANTLR 4.11.1
package Parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#prule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrule(GramaticaParser.PruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GramaticaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#initVars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitVars(GramaticaParser.InitVarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(GramaticaParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GramaticaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(GramaticaParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin(GramaticaParser.BeginContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(GramaticaParser.EndContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(GramaticaParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(GramaticaParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(GramaticaParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GramaticaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(GramaticaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(GramaticaParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(GramaticaParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#segundo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegundo(GramaticaParser.SegundoContext ctx);
}