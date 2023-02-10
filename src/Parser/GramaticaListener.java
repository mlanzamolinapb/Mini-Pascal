// Generated from java-escape by ANTLR 4.11.1
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
	 * Enter a parse tree produced by {@link GramaticaParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(GramaticaParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(GramaticaParser.ArrayContext ctx);
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
	 * Enter a parse tree produced by {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(GramaticaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(GramaticaParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(GramaticaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(GramaticaParser.FactorContext ctx);
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