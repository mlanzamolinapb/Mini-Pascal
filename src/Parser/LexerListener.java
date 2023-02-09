// Generated from java-escape by ANTLR 4.11.1
package Parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LexerParser}.
 */
public interface LexerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LexerParser#prule}.
	 * @param ctx the parse tree
	 */
	void enterPrule(LexerParser.PruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#prule}.
	 * @param ctx the parse tree
	 */
	void exitPrule(LexerParser.PruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexerParser#segundo}.
	 * @param ctx the parse tree
	 */
	void enterSegundo(LexerParser.SegundoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexerParser#segundo}.
	 * @param ctx the parse tree
	 */
	void exitSegundo(LexerParser.SegundoContext ctx);
}