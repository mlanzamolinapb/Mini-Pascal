// Generated from C:/Users/Rodrigo/Documents/GitHub/Mini-Pascal/src\Gramatica.g4 by ANTLR 4.12.0
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
	 * Visit a parse tree produced by {@link GramaticaParser#assign_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_statement(GramaticaParser.Assign_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(GramaticaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GramaticaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#array_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_declaration(GramaticaParser.Array_declarationContext ctx);
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
	 * Visit a parse tree produced by {@link GramaticaParser#writeln_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteln_statement(GramaticaParser.Writeln_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#readln_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadln_statement(GramaticaParser.Readln_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(GramaticaParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(GramaticaParser.ProcedureContext ctx);
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
	 * Visit a parse tree produced by {@link GramaticaParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(GramaticaParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(GramaticaParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GramaticaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(GramaticaParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#bool_comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_comparison(GramaticaParser.Bool_comparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr(GramaticaParser.Bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#bool_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_term(GramaticaParser.Bool_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#bool_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_factor(GramaticaParser.Bool_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#bool_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_literal(GramaticaParser.Bool_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#segundo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegundo(GramaticaParser.SegundoContext ctx);
}