// Generated from C:/Users/Gabriel Alvarado/Desktop/Mini-Pascal/src\Gramatica.g4 by ANTLR 4.12.0
package Parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#prule}.
	 * @param ctx the parse tree
	 */
	void enterPrule(GramaticaParser.PruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#prule}.
	 * @param ctx the parse tree
	 */
	void exitPrule(GramaticaParser.PruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GramaticaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GramaticaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#initVars}.
	 * @param ctx the parse tree
	 */
	void enterInitVars(GramaticaParser.InitVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#initVars}.
	 * @param ctx the parse tree
	 */
	void exitInitVars(GramaticaParser.InitVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(GramaticaParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(GramaticaParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_statement(GramaticaParser.Assign_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_statement(GramaticaParser.Assign_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GramaticaParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GramaticaParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GramaticaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GramaticaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#array_declaration}.
	 * @param ctx the parse tree
	 */
	void enterArray_declaration(GramaticaParser.Array_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#array_declaration}.
	 * @param ctx the parse tree
	 */
	void exitArray_declaration(GramaticaParser.Array_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#begin}.
	 * @param ctx the parse tree
	 */
	void enterBegin(GramaticaParser.BeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#begin}.
	 * @param ctx the parse tree
	 */
	void exitBegin(GramaticaParser.BeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(GramaticaParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(GramaticaParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#writeln_statement}.
	 * @param ctx the parse tree
	 */
	void enterWriteln_statement(GramaticaParser.Writeln_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#writeln_statement}.
	 * @param ctx the parse tree
	 */
	void exitWriteln_statement(GramaticaParser.Writeln_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#readln_statement}.
	 * @param ctx the parse tree
	 */
	void enterReadln_statement(GramaticaParser.Readln_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#readln_statement}.
	 * @param ctx the parse tree
	 */
	void exitReadln_statement(GramaticaParser.Readln_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(GramaticaParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(GramaticaParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(GramaticaParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(GramaticaParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(GramaticaParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(GramaticaParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(GramaticaParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(GramaticaParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(GramaticaParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(GramaticaParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(GramaticaParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(GramaticaParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#repeat}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(GramaticaParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#repeat}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(GramaticaParser.RepeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GramaticaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GramaticaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(GramaticaParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(GramaticaParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#bool_comparison}.
	 * @param ctx the parse tree
	 */
	void enterBool_comparison(GramaticaParser.Bool_comparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#bool_comparison}.
	 * @param ctx the parse tree
	 */
	void exitBool_comparison(GramaticaParser.Bool_comparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(GramaticaParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(GramaticaParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#bool_term}.
	 * @param ctx the parse tree
	 */
	void enterBool_term(GramaticaParser.Bool_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#bool_term}.
	 * @param ctx the parse tree
	 */
	void exitBool_term(GramaticaParser.Bool_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#bool_factor}.
	 * @param ctx the parse tree
	 */
	void enterBool_factor(GramaticaParser.Bool_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#bool_factor}.
	 * @param ctx the parse tree
	 */
	void exitBool_factor(GramaticaParser.Bool_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(GramaticaParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(GramaticaParser.Bool_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#segundo}.
	 * @param ctx the parse tree
	 */
	void enterSegundo(GramaticaParser.SegundoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#segundo}.
	 * @param ctx the parse tree
	 */
	void exitSegundo(GramaticaParser.SegundoContext ctx);
}