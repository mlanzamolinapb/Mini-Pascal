// Generated from java-escape by ANTLR 4.11.1
package Parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, PROCEDURE=8, FUNCTION=9, 
		SEMICOLON=10, VALUE=11, PUNTOS=12, FOR=13, TO=14, DO=15, IF=16, ELSEIF=17, 
		ELSE=18, LLAVE_ABR=19, LLAVE_CIERRA=20, ASIGNACION=21, EQUALS=22, NOTEQUALS=23, 
		GREATER=24, LESS=25, GREATEREQ=26, LESSEQ=27, NOT=28, AND=29, OR=30, THEN=31, 
		WHILE=32, REPEAT=33, UNTIL=34, INTEGER=35, NUM=36, TYPESTRING=37, STRING=38, 
		CHAR=39, Whitespace=40, COMMENT=41, TRUE=42, FALSE=43, ARRAY=44, COMILLA=45, 
		ID=46, PAR_ABRE=47, PAR_CIERRA=48, PLUS=49, MINUS=50, TIMES=51, DIV=52;
	public static final int
		RULE_prule = 0, RULE_program = 1, RULE_initVars = 2, RULE_var = 3, RULE_assign_statement = 4, 
		RULE_expression = 5, RULE_type = 6, RULE_array_declaration = 7, RULE_begin = 8, 
		RULE_end = 9, RULE_writeln_statement = 10, RULE_readln_statement = 11, 
		RULE_decl = 12, RULE_procedure = 13, RULE_for = 14, RULE_parametros = 15, 
		RULE_function = 16, RULE_while = 17, RULE_repeat = 18, RULE_statement = 19, 
		RULE_if_stmt = 20, RULE_bool_comparison = 21, RULE_bool_expr = 22, RULE_bool_term = 23, 
		RULE_bool_factor = 24, RULE_bool_literal = 25, RULE_segundo = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"prule", "program", "initVars", "var", "assign_statement", "expression", 
			"type", "array_declaration", "begin", "end", "writeln_statement", "readln_statement", 
			"decl", "procedure", "for", "parametros", "function", "while", "repeat", 
			"statement", "if_stmt", "bool_comparison", "bool_expr", "bool_term", 
			"bool_factor", "bool_literal", "segundo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "'.'", "'Var'", "'begin'", "'end'", "'writeln'", "'readln'", 
			"'procedure'", "'function'", "';'", "'Value'", "':'", "'for'", "'to'", 
			"'do'", "'if'", "'else if'", "'else'", "'['", "']'", "':='", "'=='", 
			"'<>'", "'>'", "'<'", "'>='", "'<='", "'!'", "'&&'", "'||'", "'then'", 
			"'while'", "'repeat'", "'until'", null, "'INTEGER'", "'STRING'", null, 
			null, null, null, "'true'", "'false'", "'array'", "','", null, "'('", 
			"')'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "PROCEDURE", "FUNCTION", 
			"SEMICOLON", "VALUE", "PUNTOS", "FOR", "TO", "DO", "IF", "ELSEIF", "ELSE", 
			"LLAVE_ABR", "LLAVE_CIERRA", "ASIGNACION", "EQUALS", "NOTEQUALS", "GREATER", 
			"LESS", "GREATEREQ", "LESSEQ", "NOT", "AND", "OR", "THEN", "WHILE", "REPEAT", 
			"UNTIL", "INTEGER", "NUM", "TYPESTRING", "STRING", "CHAR", "Whitespace", 
			"COMMENT", "TRUE", "FALSE", "ARRAY", "COMILLA", "ID", "PAR_ABRE", "PAR_CIERRA", 
			"PLUS", "MINUS", "TIMES", "DIV"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PruleContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(GramaticaParser.SEMICOLON, 0); }
		public InitVarsContext initVars() {
			return getRuleContext(InitVarsContext.class,0);
		}
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public PruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPrule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPrule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitPrule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PruleContext prule() throws RecognitionException {
		PruleContext _localctx = new PruleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__0);
			setState(55);
			match(ID);
			setState(56);
			match(SEMICOLON);
			setState(57);
			initVars();
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(58);
				program();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(64);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public BeginContext begin() {
			return getRuleContext(BeginContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			begin();
			setState(67);
			statement();
			setState(68);
			end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitVarsContext extends ParserRuleContext {
		public List<Assign_statementContext> assign_statement() {
			return getRuleContexts(Assign_statementContext.class);
		}
		public Assign_statementContext assign_statement(int i) {
			return getRuleContext(Assign_statementContext.class,i);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public InitVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterInitVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitInitVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitInitVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitVarsContext initVars() throws RecognitionException {
		InitVarsContext _localctx = new InitVarsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_initVars);
		int _la;
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(70);
					assign_statement();
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				var();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode PUNTOS() { return getToken(GramaticaParser.PUNTOS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(GramaticaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GramaticaParser.SEMICOLON, i);
		}
		public TerminalNode STRING() { return getToken(GramaticaParser.STRING, 0); }
		public TerminalNode LLAVE_ABR() { return getToken(GramaticaParser.LLAVE_ABR, 0); }
		public TerminalNode INTEGER() { return getToken(GramaticaParser.INTEGER, 0); }
		public TerminalNode LLAVE_CIERRA() { return getToken(GramaticaParser.LLAVE_CIERRA, 0); }
		public BeginContext begin() {
			return getRuleContext(BeginContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var);
		int _la;
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(T__2);
				setState(80);
				match(ID);
				setState(81);
				match(PUNTOS);
				setState(82);
				type();
				setState(83);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(ID);
				setState(86);
				match(PUNTOS);
				setState(87);
				match(STRING);
				setState(88);
				match(LLAVE_ABR);
				setState(89);
				match(INTEGER);
				setState(90);
				match(LLAVE_CIERRA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				begin();
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(92);
					decl();
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(98);
				end();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				match(ID);
				setState(101);
				match(PUNTOS);
				setState(102);
				type();
				setState(103);
				match(SEMICOLON);
				notifyErrorListeners("Falta palabra Var");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				match(T__2);
				setState(107);
				match(ID);
				setState(108);
				match(PUNTOS);
				setState(109);
				type();
				setState(110);
				match(SEMICOLON);
				setState(111);
				match(SEMICOLON);
				notifyErrorListeners("Error de Comillas");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(114);
				match(T__2);
				setState(115);
				match(ID);
				setState(116);
				match(PUNTOS);
				setState(117);
				match(SEMICOLON);
				notifyErrorListeners("Especifique el tipo");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(119);
				match(T__2);
				setState(120);
				match(ID);
				setState(121);
				type();
				setState(122);
				match(SEMICOLON);
				notifyErrorListeners("No se encontraron los puntos");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_statementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode ASIGNACION() { return getToken(GramaticaParser.ASIGNACION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GramaticaParser.SEMICOLON, 0); }
		public Assign_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAssign_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAssign_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitAssign_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_statementContext assign_statement() throws RecognitionException {
		Assign_statementContext _localctx = new Assign_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assign_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(ID);
			setState(128);
			match(ASIGNACION);
			setState(129);
			expression(0);
			setState(130);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(GramaticaParser.INTEGER, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode STRING() { return getToken(GramaticaParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(GramaticaParser.CHAR, 0); }
		public TerminalNode PAR_ABRE() { return getToken(GramaticaParser.PAR_ABRE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PAR_CIERRA() { return getToken(GramaticaParser.PAR_CIERRA, 0); }
		public TerminalNode PLUS() { return getToken(GramaticaParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GramaticaParser.MINUS, 0); }
		public TerminalNode TIMES() { return getToken(GramaticaParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(GramaticaParser.DIV, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(133);
				bool_literal();
				}
				break;
			case 3:
				{
				setState(134);
				match(INTEGER);
				}
				break;
			case 4:
				{
				setState(135);
				match(ID);
				}
				break;
			case 5:
				{
				setState(136);
				match(STRING);
				}
				break;
			case 6:
				{
				setState(137);
				match(CHAR);
				}
				break;
			case 7:
				{
				setState(138);
				match(PAR_ABRE);
				setState(139);
				expression(0);
				setState(140);
				match(PAR_CIERRA);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(156);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(144);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(145);
						match(PLUS);
						setState(146);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(147);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(148);
						match(MINUS);
						setState(149);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(150);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(151);
						match(TIMES);
						setState(152);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(153);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(154);
						match(DIV);
						setState(155);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(GramaticaParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(GramaticaParser.STRING, 0); }
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(GramaticaParser.CHAR, 0); }
		public TerminalNode NUM() { return getToken(GramaticaParser.NUM, 0); }
		public TerminalNode TYPESTRING() { return getToken(GramaticaParser.TYPESTRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				setState(161);
				match(INTEGER);
				}
				break;
			case STRING:
				{
				setState(162);
				match(STRING);
				}
				break;
			case TRUE:
			case FALSE:
				{
				setState(163);
				bool_literal();
				}
				break;
			case CHAR:
				{
				setState(164);
				match(CHAR);
				}
				break;
			case NUM:
				{
				setState(165);
				match(NUM);
				}
				break;
			case TYPESTRING:
				{
				setState(166);
				match(TYPESTRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Array_declarationContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(GramaticaParser.ARRAY, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode LLAVE_ABR() { return getToken(GramaticaParser.LLAVE_ABR, 0); }
		public TerminalNode INTEGER() { return getToken(GramaticaParser.INTEGER, 0); }
		public TerminalNode LLAVE_CIERRA() { return getToken(GramaticaParser.LLAVE_CIERRA, 0); }
		public TerminalNode SEMICOLON() { return getToken(GramaticaParser.SEMICOLON, 0); }
		public Array_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterArray_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitArray_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitArray_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_declarationContext array_declaration() throws RecognitionException {
		Array_declarationContext _localctx = new Array_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_array_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(ARRAY);
			setState(170);
			match(ID);
			setState(171);
			match(LLAVE_ABR);
			setState(172);
			match(INTEGER);
			setState(173);
			match(LLAVE_CIERRA);
			setState(174);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BeginContext extends ParserRuleContext {
		public BeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterBegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitBegin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitBegin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeginContext begin() throws RecognitionException {
		BeginContext _localctx = new BeginContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_begin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EndContext extends ParserRuleContext {
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Writeln_statementContext extends ParserRuleContext {
		public TerminalNode PAR_ABRE() { return getToken(GramaticaParser.PAR_ABRE, 0); }
		public TerminalNode PAR_CIERRA() { return getToken(GramaticaParser.PAR_CIERRA, 0); }
		public TerminalNode SEMICOLON() { return getToken(GramaticaParser.SEMICOLON, 0); }
		public TerminalNode STRING() { return getToken(GramaticaParser.STRING, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public Writeln_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeln_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterWriteln_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitWriteln_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitWriteln_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Writeln_statementContext writeln_statement() throws RecognitionException {
		Writeln_statementContext _localctx = new Writeln_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_writeln_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__5);
			setState(181);
			match(PAR_ABRE);
			setState(182);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(183);
			match(PAR_CIERRA);
			setState(184);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Readln_statementContext extends ParserRuleContext {
		public TerminalNode PAR_ABRE() { return getToken(GramaticaParser.PAR_ABRE, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode PAR_CIERRA() { return getToken(GramaticaParser.PAR_CIERRA, 0); }
		public TerminalNode SEMICOLON() { return getToken(GramaticaParser.SEMICOLON, 0); }
		public Readln_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readln_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterReadln_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitReadln_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitReadln_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Readln_statementContext readln_statement() throws RecognitionException {
		Readln_statementContext _localctx = new Readln_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_readln_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__6);
			setState(187);
			match(PAR_ABRE);
			setState(188);
			match(ID);
			setState(189);
			match(PAR_CIERRA);
			setState(190);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public TerminalNode ASIGNACION() { return getToken(GramaticaParser.ASIGNACION, 0); }
		public TerminalNode INTEGER() { return getToken(GramaticaParser.INTEGER, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(GramaticaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GramaticaParser.SEMICOLON, i);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_decl);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(ID);
				setState(193);
				match(ASIGNACION);
				setState(194);
				match(INTEGER);
				setState(195);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(ID);
				setState(197);
				match(ASIGNACION);
				setState(198);
				match(ID);
				setState(199);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(ID);
				setState(201);
				match(ASIGNACION);
				setState(202);
				match(INTEGER);
				setState(203);
				match(SEMICOLON);
				setState(204);
				match(SEMICOLON);
				notifyErrorListeners("Error de Comillas");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(206);
				match(ID);
				setState(207);
				match(INTEGER);
				setState(208);
				match(SEMICOLON);
				notifyErrorListeners("Falta Token Asignacion");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProcedureContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(GramaticaParser.PROCEDURE, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode PAR_ABRE() { return getToken(GramaticaParser.PAR_ABRE, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode PAR_CIERRA() { return getToken(GramaticaParser.PAR_CIERRA, 0); }
		public BeginContext begin() {
			return getRuleContext(BeginContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GramaticaParser.SEMICOLON, 0); }
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitProcedure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_procedure);
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(PROCEDURE);
				setState(213);
				match(ID);
				setState(214);
				match(PAR_ABRE);
				setState(215);
				parametros();
				setState(216);
				match(PAR_CIERRA);
				setState(217);
				begin();
				setState(218);
				statement();
				setState(219);
				end();
				setState(220);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(PROCEDURE);
				setState(223);
				match(ID);
				setState(224);
				match(SEMICOLON);
				setState(225);
				begin();
				setState(226);
				statement();
				setState(227);
				end();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				match(PROCEDURE);
				setState(230);
				match(ID);
				setState(231);
				parametros();
				notifyErrorListeners("Falto comillas");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GramaticaParser.FOR, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(GramaticaParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(GramaticaParser.INTEGER, i);
		}
		public TerminalNode TO() { return getToken(GramaticaParser.TO, 0); }
		public TerminalNode DO() { return getToken(GramaticaParser.DO, 0); }
		public BeginContext begin() {
			return getRuleContext(BeginContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GramaticaParser.SEMICOLON, 0); }
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_for);
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(FOR);
				setState(237);
				match(INTEGER);
				setState(238);
				match(TO);
				setState(239);
				match(INTEGER);
				setState(240);
				match(DO);
				setState(241);
				begin();
				setState(242);
				statement();
				setState(243);
				end();
				setState(244);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(FOR);
				setState(247);
				match(ID);
				setState(248);
				match(TO);
				setState(249);
				match(ID);
				setState(250);
				match(DO);
				setState(251);
				begin();
				setState(252);
				statement();
				setState(253);
				end();
				setState(254);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				match(FOR);
				setState(257);
				match(TO);
				setState(258);
				match(ID);
				setState(259);
				match(DO);
				setState(260);
				begin();
				setState(261);
				statement();
				setState(262);
				end();
				setState(263);
				match(SEMICOLON);
				notifyErrorListeners("Falto valor");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(266);
				match(FOR);
				setState(267);
				match(ID);
				setState(268);
				match(TO);
				setState(269);
				match(DO);
				setState(270);
				begin();
				setState(271);
				statement();
				setState(272);
				end();
				setState(273);
				match(SEMICOLON);
				notifyErrorListeners("Falto valor");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(276);
				match(FOR);
				setState(277);
				match(ID);
				setState(278);
				match(ID);
				setState(279);
				match(DO);
				setState(280);
				begin();
				setState(281);
				statement();
				setState(282);
				end();
				setState(283);
				match(SEMICOLON);
				notifyErrorListeners("Falto palabra reservada");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(286);
				match(FOR);
				setState(287);
				match(ID);
				setState(288);
				match(TO);
				setState(289);
				match(ID);
				setState(290);
				begin();
				setState(291);
				statement();
				setState(292);
				end();
				setState(293);
				match(SEMICOLON);
				notifyErrorListeners("Falto palabra reservada");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(296);
				match(FOR);
				setState(297);
				match(ID);
				setState(298);
				match(TO);
				setState(299);
				match(ID);
				setState(300);
				statement();
				setState(301);
				end();
				setState(302);
				match(SEMICOLON);
				notifyErrorListeners("Falto Begin");
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(305);
				match(FOR);
				setState(306);
				match(ID);
				setState(307);
				match(TO);
				setState(308);
				match(ID);
				setState(309);
				begin();
				setState(310);
				statement();
				setState(311);
				match(SEMICOLON);
				notifyErrorListeners("Falto End");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode PUNTOS() { return getToken(GramaticaParser.PUNTOS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode COMILLA() { return getToken(GramaticaParser.COMILLA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parametros);
		try {
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				match(ID);
				setState(317);
				match(PUNTOS);
				setState(318);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				match(COMILLA);
				setState(320);
				match(ID);
				setState(321);
				match(PUNTOS);
				setState(322);
				type();
				setState(323);
				parametros();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
				match(ID);
				setState(326);
				type();
				notifyErrorListeners("Falto :");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(329);
				match(ID);
				setState(330);
				match(PUNTOS);
				notifyErrorListeners("Especificar Tipo");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(GramaticaParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode PAR_ABRE() { return getToken(GramaticaParser.PAR_ABRE, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode PAR_CIERRA() { return getToken(GramaticaParser.PAR_CIERRA, 0); }
		public TerminalNode PUNTOS() { return getToken(GramaticaParser.PUNTOS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BeginContext begin() {
			return getRuleContext(BeginContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GramaticaParser.SEMICOLON, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(FUNCTION);
			setState(335);
			match(ID);
			setState(336);
			match(PAR_ABRE);
			setState(337);
			parametros();
			setState(338);
			match(PAR_CIERRA);
			setState(339);
			match(PUNTOS);
			setState(340);
			type();
			setState(341);
			begin();
			setState(342);
			statement();
			setState(343);
			end();
			setState(344);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GramaticaParser.WHILE, 0); }
		public TerminalNode PAR_ABRE() { return getToken(GramaticaParser.PAR_ABRE, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(GramaticaParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(GramaticaParser.INTEGER, i);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode PAR_CIERRA() { return getToken(GramaticaParser.PAR_CIERRA, 0); }
		public TerminalNode DO() { return getToken(GramaticaParser.DO, 0); }
		public BeginContext begin() {
			return getRuleContext(BeginContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GramaticaParser.SEMICOLON, 0); }
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_while);
		try {
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				match(WHILE);
				setState(347);
				match(PAR_ABRE);
				setState(348);
				match(INTEGER);
				setState(349);
				bool_expr(0);
				setState(350);
				match(INTEGER);
				setState(351);
				match(PAR_CIERRA);
				setState(352);
				match(DO);
				setState(353);
				begin();
				setState(354);
				statement();
				setState(355);
				end();
				setState(356);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				match(WHILE);
				setState(359);
				match(PAR_ABRE);
				setState(360);
				match(ID);
				setState(361);
				bool_expr(0);
				setState(362);
				match(ID);
				setState(363);
				match(PAR_CIERRA);
				setState(364);
				match(DO);
				setState(365);
				begin();
				setState(366);
				statement();
				setState(367);
				end();
				setState(368);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RepeatContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(GramaticaParser.REPEAT, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(GramaticaParser.UNTIL, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(GramaticaParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(GramaticaParser.INTEGER, i);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GramaticaParser.SEMICOLON, 0); }
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public RepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_repeat);
		try {
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				match(REPEAT);
				setState(373);
				statement();
				setState(374);
				match(UNTIL);
				setState(375);
				match(INTEGER);
				setState(376);
				bool_expr(0);
				setState(377);
				match(INTEGER);
				setState(378);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				match(REPEAT);
				setState(381);
				statement();
				setState(382);
				match(UNTIL);
				setState(383);
				match(ID);
				setState(384);
				bool_expr(0);
				setState(385);
				match(ID);
				setState(386);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public List<Assign_statementContext> assign_statement() {
			return getRuleContexts(Assign_statementContext.class);
		}
		public Assign_statementContext assign_statement(int i) {
			return getRuleContext(Assign_statementContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ForContext> for_() {
			return getRuleContexts(ForContext.class);
		}
		public ForContext for_(int i) {
			return getRuleContext(ForContext.class,i);
		}
		public List<Writeln_statementContext> writeln_statement() {
			return getRuleContexts(Writeln_statementContext.class);
		}
		public Writeln_statementContext writeln_statement(int i) {
			return getRuleContext(Writeln_statementContext.class,i);
		}
		public List<Readln_statementContext> readln_statement() {
			return getRuleContexts(Readln_statementContext.class);
		}
		public Readln_statementContext readln_statement(int i) {
			return getRuleContext(Readln_statementContext.class,i);
		}
		public List<Array_declarationContext> array_declaration() {
			return getRuleContexts(Array_declarationContext.class);
		}
		public Array_declarationContext array_declaration(int i) {
			return getRuleContext(Array_declarationContext.class,i);
		}
		public List<If_stmtContext> if_stmt() {
			return getRuleContexts(If_stmtContext.class);
		}
		public If_stmtContext if_stmt(int i) {
			return getRuleContext(If_stmtContext.class,i);
		}
		public List<WhileContext> while_() {
			return getRuleContexts(WhileContext.class);
		}
		public WhileContext while_(int i) {
			return getRuleContext(WhileContext.class,i);
		}
		public List<RepeatContext> repeat() {
			return getRuleContexts(RepeatContext.class);
		}
		public RepeatContext repeat(int i) {
			return getRuleContext(RepeatContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_statement);
		try {
			int _alt;
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				assign_statement();
				setState(391);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(393);
						assign_statement();
						}
						} 
					}
					setState(398);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(399);
						for_();
						}
						} 
					}
					setState(404);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(405);
						writeln_statement();
						}
						} 
					}
					setState(410);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(411);
				writeln_statement();
				setState(412);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(414);
				readln_statement();
				setState(415);
				statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(420);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(417);
						readln_statement();
						}
						} 
					}
					setState(422);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(426);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(423);
						array_declaration();
						}
						} 
					}
					setState(428);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(429);
				array_declaration();
				setState(430);
				statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(432);
				if_stmt();
				setState(433);
				statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(435);
						if_stmt();
						}
						} 
					}
					setState(440);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(444);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(441);
						for_();
						}
						} 
					}
					setState(446);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(450);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(447);
						while_();
						}
						} 
					}
					setState(452);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(456);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(453);
						repeat();
						}
						} 
					}
					setState(458);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GramaticaParser.IF, 0); }
		public List<TerminalNode> PAR_ABRE() { return getTokens(GramaticaParser.PAR_ABRE); }
		public TerminalNode PAR_ABRE(int i) {
			return getToken(GramaticaParser.PAR_ABRE, i);
		}
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public List<TerminalNode> PAR_CIERRA() { return getTokens(GramaticaParser.PAR_CIERRA); }
		public TerminalNode PAR_CIERRA(int i) {
			return getToken(GramaticaParser.PAR_CIERRA, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(GramaticaParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(GramaticaParser.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(GramaticaParser.ELSE, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_if_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(IF);
			setState(462);
			match(PAR_ABRE);
			setState(463);
			bool_expr(0);
			setState(464);
			match(PAR_CIERRA);
			setState(465);
			statement();
			setState(474);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(466);
					match(ELSEIF);
					setState(467);
					match(PAR_ABRE);
					setState(468);
					bool_expr(0);
					setState(469);
					match(PAR_CIERRA);
					setState(470);
					statement();
					}
					} 
				}
				setState(476);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(477);
				match(ELSE);
				setState(478);
				statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_comparisonContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(GramaticaParser.EQUALS, 0); }
		public TerminalNode NOTEQUALS() { return getToken(GramaticaParser.NOTEQUALS, 0); }
		public TerminalNode GREATER() { return getToken(GramaticaParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(GramaticaParser.LESS, 0); }
		public TerminalNode GREATEREQ() { return getToken(GramaticaParser.GREATEREQ, 0); }
		public TerminalNode LESSEQ() { return getToken(GramaticaParser.LESSEQ, 0); }
		public Bool_comparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterBool_comparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitBool_comparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitBool_comparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_comparisonContext bool_comparison() throws RecognitionException {
		Bool_comparisonContext _localctx = new Bool_comparisonContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_bool_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			expression(0);
			setState(482);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 264241152L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(483);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_exprContext extends ParserRuleContext {
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode OR() { return getToken(GramaticaParser.OR, 0); }
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitBool_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitBool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		return bool_expr(0);
	}

	private Bool_exprContext bool_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, _parentState);
		Bool_exprContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_bool_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(486);
			bool_term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(493);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
					setState(488);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(489);
					match(OR);
					setState(490);
					bool_term(0);
					}
					} 
				}
				setState(495);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_termContext extends ParserRuleContext {
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public TerminalNode AND() { return getToken(GramaticaParser.AND, 0); }
		public Bool_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterBool_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitBool_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitBool_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_termContext bool_term() throws RecognitionException {
		return bool_term(0);
	}

	private Bool_termContext bool_term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_termContext _localctx = new Bool_termContext(_ctx, _parentState);
		Bool_termContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_bool_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(497);
			bool_factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(504);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_termContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_term);
					setState(499);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(500);
					match(AND);
					setState(501);
					bool_factor();
					}
					} 
				}
				setState(506);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_factorContext extends ParserRuleContext {
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public TerminalNode PAR_ABRE() { return getToken(GramaticaParser.PAR_ABRE, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode PAR_CIERRA() { return getToken(GramaticaParser.PAR_CIERRA, 0); }
		public TerminalNode NOT() { return getToken(GramaticaParser.NOT, 0); }
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Bool_comparisonContext bool_comparison() {
			return getRuleContext(Bool_comparisonContext.class,0);
		}
		public Bool_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterBool_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitBool_factor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitBool_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_factorContext bool_factor() throws RecognitionException {
		Bool_factorContext _localctx = new Bool_factorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_bool_factor);
		try {
			setState(515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				bool_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				match(PAR_ABRE);
				setState(509);
				bool_expr(0);
				setState(510);
				match(PAR_CIERRA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(512);
				match(NOT);
				setState(513);
				bool_factor();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(514);
				bool_comparison();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bool_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(GramaticaParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(GramaticaParser.FALSE, 0); }
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterBool_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitBool_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitBool_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SegundoContext extends ParserRuleContext {
		public SegundoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segundo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSegundo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSegundo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitSegundo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SegundoContext segundo() throws RecognitionException {
		SegundoContext _localctx = new SegundoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_segundo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 22:
			return bool_expr_sempred((Bool_exprContext)_localctx, predIndex);
		case 23:
			return bool_term_sempred((Bool_termContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bool_expr_sempred(Bool_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean bool_term_sempred(Bool_termContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00014\u020a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000<\b\u0000\n\u0000\f\u0000"+
		"?\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0005\u0002H\b\u0002\n\u0002\f\u0002K\t\u0002"+
		"\u0001\u0002\u0003\u0002N\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"^\b\u0003\n\u0003\f\u0003a\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003~\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u008f\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u009d\b\u0005\n\u0005\f\u0005\u00a0\t\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00a8\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00d3\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u00eb\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u013b\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u014d\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u0173\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0185\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u018b\b\u0013\n\u0013\f\u0013\u018e\t\u0013\u0001\u0013\u0005\u0013\u0191"+
		"\b\u0013\n\u0013\f\u0013\u0194\t\u0013\u0001\u0013\u0005\u0013\u0197\b"+
		"\u0013\n\u0013\f\u0013\u019a\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u01a3\b\u0013"+
		"\n\u0013\f\u0013\u01a6\t\u0013\u0001\u0013\u0005\u0013\u01a9\b\u0013\n"+
		"\u0013\f\u0013\u01ac\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u01b5\b\u0013\n"+
		"\u0013\f\u0013\u01b8\t\u0013\u0001\u0013\u0005\u0013\u01bb\b\u0013\n\u0013"+
		"\f\u0013\u01be\t\u0013\u0001\u0013\u0005\u0013\u01c1\b\u0013\n\u0013\f"+
		"\u0013\u01c4\t\u0013\u0001\u0013\u0005\u0013\u01c7\b\u0013\n\u0013\f\u0013"+
		"\u01ca\t\u0013\u0003\u0013\u01cc\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u01d9\b\u0014\n\u0014\f\u0014"+
		"\u01dc\t\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01e0\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u01ec\b\u0016\n"+
		"\u0016\f\u0016\u01ef\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u01f7\b\u0017\n\u0017\f\u0017"+
		"\u01fa\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0204\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0000\u0003\n,.\u001b"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.024\u0000\u0003\u0002\u0000&&..\u0001\u0000\u0016"+
		"\u001b\u0001\u0000*+\u0235\u00006\u0001\u0000\u0000\u0000\u0002B\u0001"+
		"\u0000\u0000\u0000\u0004M\u0001\u0000\u0000\u0000\u0006}\u0001\u0000\u0000"+
		"\u0000\b\u007f\u0001\u0000\u0000\u0000\n\u008e\u0001\u0000\u0000\u0000"+
		"\f\u00a7\u0001\u0000\u0000\u0000\u000e\u00a9\u0001\u0000\u0000\u0000\u0010"+
		"\u00b0\u0001\u0000\u0000\u0000\u0012\u00b2\u0001\u0000\u0000\u0000\u0014"+
		"\u00b4\u0001\u0000\u0000\u0000\u0016\u00ba\u0001\u0000\u0000\u0000\u0018"+
		"\u00d2\u0001\u0000\u0000\u0000\u001a\u00ea\u0001\u0000\u0000\u0000\u001c"+
		"\u013a\u0001\u0000\u0000\u0000\u001e\u014c\u0001\u0000\u0000\u0000 \u014e"+
		"\u0001\u0000\u0000\u0000\"\u0172\u0001\u0000\u0000\u0000$\u0184\u0001"+
		"\u0000\u0000\u0000&\u01cb\u0001\u0000\u0000\u0000(\u01cd\u0001\u0000\u0000"+
		"\u0000*\u01e1\u0001\u0000\u0000\u0000,\u01e5\u0001\u0000\u0000\u0000."+
		"\u01f0\u0001\u0000\u0000\u00000\u0203\u0001\u0000\u0000\u00002\u0205\u0001"+
		"\u0000\u0000\u00004\u0207\u0001\u0000\u0000\u000067\u0005\u0001\u0000"+
		"\u000078\u0005.\u0000\u000089\u0005\n\u0000\u00009=\u0003\u0004\u0002"+
		"\u0000:<\u0003\u0002\u0001\u0000;:\u0001\u0000\u0000\u0000<?\u0001\u0000"+
		"\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>@\u0001"+
		"\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@A\u0005\u0002\u0000\u0000"+
		"A\u0001\u0001\u0000\u0000\u0000BC\u0003\u0010\b\u0000CD\u0003&\u0013\u0000"+
		"DE\u0003\u0012\t\u0000E\u0003\u0001\u0000\u0000\u0000FH\u0003\b\u0004"+
		"\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000"+
		"\u0000\u0000IJ\u0001\u0000\u0000\u0000JN\u0001\u0000\u0000\u0000KI\u0001"+
		"\u0000\u0000\u0000LN\u0003\u0006\u0003\u0000MI\u0001\u0000\u0000\u0000"+
		"ML\u0001\u0000\u0000\u0000N\u0005\u0001\u0000\u0000\u0000OP\u0005\u0003"+
		"\u0000\u0000PQ\u0005.\u0000\u0000QR\u0005\f\u0000\u0000RS\u0003\f\u0006"+
		"\u0000ST\u0005\n\u0000\u0000T~\u0001\u0000\u0000\u0000UV\u0005.\u0000"+
		"\u0000VW\u0005\f\u0000\u0000WX\u0005&\u0000\u0000XY\u0005\u0013\u0000"+
		"\u0000YZ\u0005#\u0000\u0000Z~\u0005\u0014\u0000\u0000[_\u0003\u0010\b"+
		"\u0000\\^\u0003\u0018\f\u0000]\\\u0001\u0000\u0000\u0000^a\u0001\u0000"+
		"\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0001"+
		"\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000bc\u0003\u0012\t\u0000c~\u0001"+
		"\u0000\u0000\u0000de\u0005.\u0000\u0000ef\u0005\f\u0000\u0000fg\u0003"+
		"\f\u0006\u0000gh\u0005\n\u0000\u0000hi\u0006\u0003\uffff\uffff\u0000i"+
		"~\u0001\u0000\u0000\u0000jk\u0005\u0003\u0000\u0000kl\u0005.\u0000\u0000"+
		"lm\u0005\f\u0000\u0000mn\u0003\f\u0006\u0000no\u0005\n\u0000\u0000op\u0005"+
		"\n\u0000\u0000pq\u0006\u0003\uffff\uffff\u0000q~\u0001\u0000\u0000\u0000"+
		"rs\u0005\u0003\u0000\u0000st\u0005.\u0000\u0000tu\u0005\f\u0000\u0000"+
		"uv\u0005\n\u0000\u0000v~\u0006\u0003\uffff\uffff\u0000wx\u0005\u0003\u0000"+
		"\u0000xy\u0005.\u0000\u0000yz\u0003\f\u0006\u0000z{\u0005\n\u0000\u0000"+
		"{|\u0006\u0003\uffff\uffff\u0000|~\u0001\u0000\u0000\u0000}O\u0001\u0000"+
		"\u0000\u0000}U\u0001\u0000\u0000\u0000}[\u0001\u0000\u0000\u0000}d\u0001"+
		"\u0000\u0000\u0000}j\u0001\u0000\u0000\u0000}r\u0001\u0000\u0000\u0000"+
		"}w\u0001\u0000\u0000\u0000~\u0007\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0005.\u0000\u0000\u0080\u0081\u0005\u0015\u0000\u0000\u0081\u0082\u0003"+
		"\n\u0005\u0000\u0082\u0083\u0005\n\u0000\u0000\u0083\t\u0001\u0000\u0000"+
		"\u0000\u0084\u008f\u0006\u0005\uffff\uffff\u0000\u0085\u008f\u00032\u0019"+
		"\u0000\u0086\u008f\u0005#\u0000\u0000\u0087\u008f\u0005.\u0000\u0000\u0088"+
		"\u008f\u0005&\u0000\u0000\u0089\u008f\u0005\'\u0000\u0000\u008a\u008b"+
		"\u0005/\u0000\u0000\u008b\u008c\u0003\n\u0005\u0000\u008c\u008d\u0005"+
		"0\u0000\u0000\u008d\u008f\u0001\u0000\u0000\u0000\u008e\u0084\u0001\u0000"+
		"\u0000\u0000\u008e\u0085\u0001\u0000\u0000\u0000\u008e\u0086\u0001\u0000"+
		"\u0000\u0000\u008e\u0087\u0001\u0000\u0000\u0000\u008e\u0088\u0001\u0000"+
		"\u0000\u0000\u008e\u0089\u0001\u0000\u0000\u0000\u008e\u008a\u0001\u0000"+
		"\u0000\u0000\u008f\u009e\u0001\u0000\u0000\u0000\u0090\u0091\n\u0005\u0000"+
		"\u0000\u0091\u0092\u00051\u0000\u0000\u0092\u009d\u0003\n\u0005\u0006"+
		"\u0093\u0094\n\u0004\u0000\u0000\u0094\u0095\u00052\u0000\u0000\u0095"+
		"\u009d\u0003\n\u0005\u0005\u0096\u0097\n\u0003\u0000\u0000\u0097\u0098"+
		"\u00053\u0000\u0000\u0098\u009d\u0003\n\u0005\u0004\u0099\u009a\n\u0002"+
		"\u0000\u0000\u009a\u009b\u00054\u0000\u0000\u009b\u009d\u0003\n\u0005"+
		"\u0003\u009c\u0090\u0001\u0000\u0000\u0000\u009c\u0093\u0001\u0000\u0000"+
		"\u0000\u009c\u0096\u0001\u0000\u0000\u0000\u009c\u0099\u0001\u0000\u0000"+
		"\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u000b\u0001\u0000\u0000"+
		"\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u00a8\u0005#\u0000\u0000"+
		"\u00a2\u00a8\u0005&\u0000\u0000\u00a3\u00a8\u00032\u0019\u0000\u00a4\u00a8"+
		"\u0005\'\u0000\u0000\u00a5\u00a8\u0005$\u0000\u0000\u00a6\u00a8\u0005"+
		"%\u0000\u0000\u00a7\u00a1\u0001\u0000\u0000\u0000\u00a7\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a3\u0001\u0000\u0000\u0000\u00a7\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a8\r\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005,\u0000"+
		"\u0000\u00aa\u00ab\u0005.\u0000\u0000\u00ab\u00ac\u0005\u0013\u0000\u0000"+
		"\u00ac\u00ad\u0005#\u0000\u0000\u00ad\u00ae\u0005\u0014\u0000\u0000\u00ae"+
		"\u00af\u0005\n\u0000\u0000\u00af\u000f\u0001\u0000\u0000\u0000\u00b0\u00b1"+
		"\u0005\u0004\u0000\u0000\u00b1\u0011\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0005\u0005\u0000\u0000\u00b3\u0013\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0005\u0006\u0000\u0000\u00b5\u00b6\u0005/\u0000\u0000\u00b6\u00b7\u0007"+
		"\u0000\u0000\u0000\u00b7\u00b8\u00050\u0000\u0000\u00b8\u00b9\u0005\n"+
		"\u0000\u0000\u00b9\u0015\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\u0007"+
		"\u0000\u0000\u00bb\u00bc\u0005/\u0000\u0000\u00bc\u00bd\u0005.\u0000\u0000"+
		"\u00bd\u00be\u00050\u0000\u0000\u00be\u00bf\u0005\n\u0000\u0000\u00bf"+
		"\u0017\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005.\u0000\u0000\u00c1\u00c2"+
		"\u0005\u0015\u0000\u0000\u00c2\u00c3\u0005#\u0000\u0000\u00c3\u00d3\u0005"+
		"\n\u0000\u0000\u00c4\u00c5\u0005.\u0000\u0000\u00c5\u00c6\u0005\u0015"+
		"\u0000\u0000\u00c6\u00c7\u0005.\u0000\u0000\u00c7\u00d3\u0005\n\u0000"+
		"\u0000\u00c8\u00c9\u0005.\u0000\u0000\u00c9\u00ca\u0005\u0015\u0000\u0000"+
		"\u00ca\u00cb\u0005#\u0000\u0000\u00cb\u00cc\u0005\n\u0000\u0000\u00cc"+
		"\u00cd\u0005\n\u0000\u0000\u00cd\u00d3\u0006\f\uffff\uffff\u0000\u00ce"+
		"\u00cf\u0005.\u0000\u0000\u00cf\u00d0\u0005#\u0000\u0000\u00d0\u00d1\u0005"+
		"\n\u0000\u0000\u00d1\u00d3\u0006\f\uffff\uffff\u0000\u00d2\u00c0\u0001"+
		"\u0000\u0000\u0000\u00d2\u00c4\u0001\u0000\u0000\u0000\u00d2\u00c8\u0001"+
		"\u0000\u0000\u0000\u00d2\u00ce\u0001\u0000\u0000\u0000\u00d3\u0019\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0005\b\u0000\u0000\u00d5\u00d6\u0005."+
		"\u0000\u0000\u00d6\u00d7\u0005/\u0000\u0000\u00d7\u00d8\u0003\u001e\u000f"+
		"\u0000\u00d8\u00d9\u00050\u0000\u0000\u00d9\u00da\u0003\u0010\b\u0000"+
		"\u00da\u00db\u0003&\u0013\u0000\u00db\u00dc\u0003\u0012\t\u0000\u00dc"+
		"\u00dd\u0005\u0002\u0000\u0000\u00dd\u00eb\u0001\u0000\u0000\u0000\u00de"+
		"\u00df\u0005\b\u0000\u0000\u00df\u00e0\u0005.\u0000\u0000\u00e0\u00e1"+
		"\u0005\n\u0000\u0000\u00e1\u00e2\u0003\u0010\b\u0000\u00e2\u00e3\u0003"+
		"&\u0013\u0000\u00e3\u00e4\u0003\u0012\t\u0000\u00e4\u00eb\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\u0005\b\u0000\u0000\u00e6\u00e7\u0005.\u0000"+
		"\u0000\u00e7\u00e8\u0003\u001e\u000f\u0000\u00e8\u00e9\u0006\r\uffff\uffff"+
		"\u0000\u00e9\u00eb\u0001\u0000\u0000\u0000\u00ea\u00d4\u0001\u0000\u0000"+
		"\u0000\u00ea\u00de\u0001\u0000\u0000\u0000\u00ea\u00e5\u0001\u0000\u0000"+
		"\u0000\u00eb\u001b\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005\r\u0000\u0000"+
		"\u00ed\u00ee\u0005#\u0000\u0000\u00ee\u00ef\u0005\u000e\u0000\u0000\u00ef"+
		"\u00f0\u0005#\u0000\u0000\u00f0\u00f1\u0005\u000f\u0000\u0000\u00f1\u00f2"+
		"\u0003\u0010\b\u0000\u00f2\u00f3\u0003&\u0013\u0000\u00f3\u00f4\u0003"+
		"\u0012\t\u0000\u00f4\u00f5\u0005\n\u0000\u0000\u00f5\u013b\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0005\r\u0000\u0000\u00f7\u00f8\u0005.\u0000"+
		"\u0000\u00f8\u00f9\u0005\u000e\u0000\u0000\u00f9\u00fa\u0005.\u0000\u0000"+
		"\u00fa\u00fb\u0005\u000f\u0000\u0000\u00fb\u00fc\u0003\u0010\b\u0000\u00fc"+
		"\u00fd\u0003&\u0013\u0000\u00fd\u00fe\u0003\u0012\t\u0000\u00fe\u00ff"+
		"\u0005\n\u0000\u0000\u00ff\u013b\u0001\u0000\u0000\u0000\u0100\u0101\u0005"+
		"\r\u0000\u0000\u0101\u0102\u0005\u000e\u0000\u0000\u0102\u0103\u0005."+
		"\u0000\u0000\u0103\u0104\u0005\u000f\u0000\u0000\u0104\u0105\u0003\u0010"+
		"\b\u0000\u0105\u0106\u0003&\u0013\u0000\u0106\u0107\u0003\u0012\t\u0000"+
		"\u0107\u0108\u0005\n\u0000\u0000\u0108\u0109\u0006\u000e\uffff\uffff\u0000"+
		"\u0109\u013b\u0001\u0000\u0000\u0000\u010a\u010b\u0005\r\u0000\u0000\u010b"+
		"\u010c\u0005.\u0000\u0000\u010c\u010d\u0005\u000e\u0000\u0000\u010d\u010e"+
		"\u0005\u000f\u0000\u0000\u010e\u010f\u0003\u0010\b\u0000\u010f\u0110\u0003"+
		"&\u0013\u0000\u0110\u0111\u0003\u0012\t\u0000\u0111\u0112\u0005\n\u0000"+
		"\u0000\u0112\u0113\u0006\u000e\uffff\uffff\u0000\u0113\u013b\u0001\u0000"+
		"\u0000\u0000\u0114\u0115\u0005\r\u0000\u0000\u0115\u0116\u0005.\u0000"+
		"\u0000\u0116\u0117\u0005.\u0000\u0000\u0117\u0118\u0005\u000f\u0000\u0000"+
		"\u0118\u0119\u0003\u0010\b\u0000\u0119\u011a\u0003&\u0013\u0000\u011a"+
		"\u011b\u0003\u0012\t\u0000\u011b\u011c\u0005\n\u0000\u0000\u011c\u011d"+
		"\u0006\u000e\uffff\uffff\u0000\u011d\u013b\u0001\u0000\u0000\u0000\u011e"+
		"\u011f\u0005\r\u0000\u0000\u011f\u0120\u0005.\u0000\u0000\u0120\u0121"+
		"\u0005\u000e\u0000\u0000\u0121\u0122\u0005.\u0000\u0000\u0122\u0123\u0003"+
		"\u0010\b\u0000\u0123\u0124\u0003&\u0013\u0000\u0124\u0125\u0003\u0012"+
		"\t\u0000\u0125\u0126\u0005\n\u0000\u0000\u0126\u0127\u0006\u000e\uffff"+
		"\uffff\u0000\u0127\u013b\u0001\u0000\u0000\u0000\u0128\u0129\u0005\r\u0000"+
		"\u0000\u0129\u012a\u0005.\u0000\u0000\u012a\u012b\u0005\u000e\u0000\u0000"+
		"\u012b\u012c\u0005.\u0000\u0000\u012c\u012d\u0003&\u0013\u0000\u012d\u012e"+
		"\u0003\u0012\t\u0000\u012e\u012f\u0005\n\u0000\u0000\u012f\u0130\u0006"+
		"\u000e\uffff\uffff\u0000\u0130\u013b\u0001\u0000\u0000\u0000\u0131\u0132"+
		"\u0005\r\u0000\u0000\u0132\u0133\u0005.\u0000\u0000\u0133\u0134\u0005"+
		"\u000e\u0000\u0000\u0134\u0135\u0005.\u0000\u0000\u0135\u0136\u0003\u0010"+
		"\b\u0000\u0136\u0137\u0003&\u0013\u0000\u0137\u0138\u0005\n\u0000\u0000"+
		"\u0138\u0139\u0006\u000e\uffff\uffff\u0000\u0139\u013b\u0001\u0000\u0000"+
		"\u0000\u013a\u00ec\u0001\u0000\u0000\u0000\u013a\u00f6\u0001\u0000\u0000"+
		"\u0000\u013a\u0100\u0001\u0000\u0000\u0000\u013a\u010a\u0001\u0000\u0000"+
		"\u0000\u013a\u0114\u0001\u0000\u0000\u0000\u013a\u011e\u0001\u0000\u0000"+
		"\u0000\u013a\u0128\u0001\u0000\u0000\u0000\u013a\u0131\u0001\u0000\u0000"+
		"\u0000\u013b\u001d\u0001\u0000\u0000\u0000\u013c\u013d\u0005.\u0000\u0000"+
		"\u013d\u013e\u0005\f\u0000\u0000\u013e\u014d\u0003\f\u0006\u0000\u013f"+
		"\u0140\u0005-\u0000\u0000\u0140\u0141\u0005.\u0000\u0000\u0141\u0142\u0005"+
		"\f\u0000\u0000\u0142\u0143\u0003\f\u0006\u0000\u0143\u0144\u0003\u001e"+
		"\u000f\u0000\u0144\u014d\u0001\u0000\u0000\u0000\u0145\u0146\u0005.\u0000"+
		"\u0000\u0146\u0147\u0003\f\u0006\u0000\u0147\u0148\u0006\u000f\uffff\uffff"+
		"\u0000\u0148\u014d\u0001\u0000\u0000\u0000\u0149\u014a\u0005.\u0000\u0000"+
		"\u014a\u014b\u0005\f\u0000\u0000\u014b\u014d\u0006\u000f\uffff\uffff\u0000"+
		"\u014c\u013c\u0001\u0000\u0000\u0000\u014c\u013f\u0001\u0000\u0000\u0000"+
		"\u014c\u0145\u0001\u0000\u0000\u0000\u014c\u0149\u0001\u0000\u0000\u0000"+
		"\u014d\u001f\u0001\u0000\u0000\u0000\u014e\u014f\u0005\t\u0000\u0000\u014f"+
		"\u0150\u0005.\u0000\u0000\u0150\u0151\u0005/\u0000\u0000\u0151\u0152\u0003"+
		"\u001e\u000f\u0000\u0152\u0153\u00050\u0000\u0000\u0153\u0154\u0005\f"+
		"\u0000\u0000\u0154\u0155\u0003\f\u0006\u0000\u0155\u0156\u0003\u0010\b"+
		"\u0000\u0156\u0157\u0003&\u0013\u0000\u0157\u0158\u0003\u0012\t\u0000"+
		"\u0158\u0159\u0005\n\u0000\u0000\u0159!\u0001\u0000\u0000\u0000\u015a"+
		"\u015b\u0005 \u0000\u0000\u015b\u015c\u0005/\u0000\u0000\u015c\u015d\u0005"+
		"#\u0000\u0000\u015d\u015e\u0003,\u0016\u0000\u015e\u015f\u0005#\u0000"+
		"\u0000\u015f\u0160\u00050\u0000\u0000\u0160\u0161\u0005\u000f\u0000\u0000"+
		"\u0161\u0162\u0003\u0010\b\u0000\u0162\u0163\u0003&\u0013\u0000\u0163"+
		"\u0164\u0003\u0012\t\u0000\u0164\u0165\u0005\n\u0000\u0000\u0165\u0173"+
		"\u0001\u0000\u0000\u0000\u0166\u0167\u0005 \u0000\u0000\u0167\u0168\u0005"+
		"/\u0000\u0000\u0168\u0169\u0005.\u0000\u0000\u0169\u016a\u0003,\u0016"+
		"\u0000\u016a\u016b\u0005.\u0000\u0000\u016b\u016c\u00050\u0000\u0000\u016c"+
		"\u016d\u0005\u000f\u0000\u0000\u016d\u016e\u0003\u0010\b\u0000\u016e\u016f"+
		"\u0003&\u0013\u0000\u016f\u0170\u0003\u0012\t\u0000\u0170\u0171\u0005"+
		"\n\u0000\u0000\u0171\u0173\u0001\u0000\u0000\u0000\u0172\u015a\u0001\u0000"+
		"\u0000\u0000\u0172\u0166\u0001\u0000\u0000\u0000\u0173#\u0001\u0000\u0000"+
		"\u0000\u0174\u0175\u0005!\u0000\u0000\u0175\u0176\u0003&\u0013\u0000\u0176"+
		"\u0177\u0005\"\u0000\u0000\u0177\u0178\u0005#\u0000\u0000\u0178\u0179"+
		"\u0003,\u0016\u0000\u0179\u017a\u0005#\u0000\u0000\u017a\u017b\u0005\n"+
		"\u0000\u0000\u017b\u0185\u0001\u0000\u0000\u0000\u017c\u017d\u0005!\u0000"+
		"\u0000\u017d\u017e\u0003&\u0013\u0000\u017e\u017f\u0005\"\u0000\u0000"+
		"\u017f\u0180\u0005.\u0000\u0000\u0180\u0181\u0003,\u0016\u0000\u0181\u0182"+
		"\u0005.\u0000\u0000\u0182\u0183\u0005\n\u0000\u0000\u0183\u0185\u0001"+
		"\u0000\u0000\u0000\u0184\u0174\u0001\u0000\u0000\u0000\u0184\u017c\u0001"+
		"\u0000\u0000\u0000\u0185%\u0001\u0000\u0000\u0000\u0186\u0187\u0003\b"+
		"\u0004\u0000\u0187\u0188\u0003&\u0013\u0000\u0188\u01cc\u0001\u0000\u0000"+
		"\u0000\u0189\u018b\u0003\b\u0004\u0000\u018a\u0189\u0001\u0000\u0000\u0000"+
		"\u018b\u018e\u0001\u0000\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000"+
		"\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u01cc\u0001\u0000\u0000\u0000"+
		"\u018e\u018c\u0001\u0000\u0000\u0000\u018f\u0191\u0003\u001c\u000e\u0000"+
		"\u0190\u018f\u0001\u0000\u0000\u0000\u0191\u0194\u0001\u0000\u0000\u0000"+
		"\u0192\u0190\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000"+
		"\u0193\u01cc\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000"+
		"\u0195\u0197\u0003\u0014\n\u0000\u0196\u0195\u0001\u0000\u0000\u0000\u0197"+
		"\u019a\u0001\u0000\u0000\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0198"+
		"\u0199\u0001\u0000\u0000\u0000\u0199\u01cc\u0001\u0000\u0000\u0000\u019a"+
		"\u0198\u0001\u0000\u0000\u0000\u019b\u019c\u0003\u0014\n\u0000\u019c\u019d"+
		"\u0003&\u0013\u0000\u019d\u01cc\u0001\u0000\u0000\u0000\u019e\u019f\u0003"+
		"\u0016\u000b\u0000\u019f\u01a0\u0003&\u0013\u0000\u01a0\u01cc\u0001\u0000"+
		"\u0000\u0000\u01a1\u01a3\u0003\u0016\u000b\u0000\u01a2\u01a1\u0001\u0000"+
		"\u0000\u0000\u01a3\u01a6\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01cc\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a7\u01a9\u0003\u000e"+
		"\u0007\u0000\u01a8\u01a7\u0001\u0000\u0000\u0000\u01a9\u01ac\u0001\u0000"+
		"\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000"+
		"\u0000\u0000\u01ab\u01cc\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000"+
		"\u0000\u0000\u01ad\u01ae\u0003\u000e\u0007\u0000\u01ae\u01af\u0003&\u0013"+
		"\u0000\u01af\u01cc\u0001\u0000\u0000\u0000\u01b0\u01b1\u0003(\u0014\u0000"+
		"\u01b1\u01b2\u0003&\u0013\u0000\u01b2\u01cc\u0001\u0000\u0000\u0000\u01b3"+
		"\u01b5\u0003(\u0014\u0000\u01b4\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b8"+
		"\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b6\u01b7"+
		"\u0001\u0000\u0000\u0000\u01b7\u01cc\u0001\u0000\u0000\u0000\u01b8\u01b6"+
		"\u0001\u0000\u0000\u0000\u01b9\u01bb\u0003\u001c\u000e\u0000\u01ba\u01b9"+
		"\u0001\u0000\u0000\u0000\u01bb\u01be\u0001\u0000\u0000\u0000\u01bc\u01ba"+
		"\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd\u01cc"+
		"\u0001\u0000\u0000\u0000\u01be\u01bc\u0001\u0000\u0000\u0000\u01bf\u01c1"+
		"\u0003\"\u0011\u0000\u01c0\u01bf\u0001\u0000\u0000\u0000\u01c1\u01c4\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001"+
		"\u0000\u0000\u0000\u01c3\u01cc\u0001\u0000\u0000\u0000\u01c4\u01c2\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c7\u0003$\u0012\u0000\u01c6\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c7\u01ca\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001\u0000"+
		"\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01cc\u0001\u0000"+
		"\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01cb\u0186\u0001\u0000"+
		"\u0000\u0000\u01cb\u018c\u0001\u0000\u0000\u0000\u01cb\u0192\u0001\u0000"+
		"\u0000\u0000\u01cb\u0198\u0001\u0000\u0000\u0000\u01cb\u019b\u0001\u0000"+
		"\u0000\u0000\u01cb\u019e\u0001\u0000\u0000\u0000\u01cb\u01a4\u0001\u0000"+
		"\u0000\u0000\u01cb\u01aa\u0001\u0000\u0000\u0000\u01cb\u01ad\u0001\u0000"+
		"\u0000\u0000\u01cb\u01b0\u0001\u0000\u0000\u0000\u01cb\u01b6\u0001\u0000"+
		"\u0000\u0000\u01cb\u01bc\u0001\u0000\u0000\u0000\u01cb\u01c2\u0001\u0000"+
		"\u0000\u0000\u01cb\u01c8\u0001\u0000\u0000\u0000\u01cc\'\u0001\u0000\u0000"+
		"\u0000\u01cd\u01ce\u0005\u0010\u0000\u0000\u01ce\u01cf\u0005/\u0000\u0000"+
		"\u01cf\u01d0\u0003,\u0016\u0000\u01d0\u01d1\u00050\u0000\u0000\u01d1\u01da"+
		"\u0003&\u0013\u0000\u01d2\u01d3\u0005\u0011\u0000\u0000\u01d3\u01d4\u0005"+
		"/\u0000\u0000\u01d4\u01d5\u0003,\u0016\u0000\u01d5\u01d6\u00050\u0000"+
		"\u0000\u01d6\u01d7\u0003&\u0013\u0000\u01d7\u01d9\u0001\u0000\u0000\u0000"+
		"\u01d8\u01d2\u0001\u0000\u0000\u0000\u01d9\u01dc\u0001\u0000\u0000\u0000"+
		"\u01da\u01d8\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000"+
		"\u01db\u01df\u0001\u0000\u0000\u0000\u01dc\u01da\u0001\u0000\u0000\u0000"+
		"\u01dd\u01de\u0005\u0012\u0000\u0000\u01de\u01e0\u0003&\u0013\u0000\u01df"+
		"\u01dd\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0"+
		")\u0001\u0000\u0000\u0000\u01e1\u01e2\u0003\n\u0005\u0000\u01e2\u01e3"+
		"\u0007\u0001\u0000\u0000\u01e3\u01e4\u0003\n\u0005\u0000\u01e4+\u0001"+
		"\u0000\u0000\u0000\u01e5\u01e6\u0006\u0016\uffff\uffff\u0000\u01e6\u01e7"+
		"\u0003.\u0017\u0000\u01e7\u01ed\u0001\u0000\u0000\u0000\u01e8\u01e9\n"+
		"\u0001\u0000\u0000\u01e9\u01ea\u0005\u001e\u0000\u0000\u01ea\u01ec\u0003"+
		".\u0017\u0000\u01eb\u01e8\u0001\u0000\u0000\u0000\u01ec\u01ef\u0001\u0000"+
		"\u0000\u0000\u01ed\u01eb\u0001\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000"+
		"\u0000\u0000\u01ee-\u0001\u0000\u0000\u0000\u01ef\u01ed\u0001\u0000\u0000"+
		"\u0000\u01f0\u01f1\u0006\u0017\uffff\uffff\u0000\u01f1\u01f2\u00030\u0018"+
		"\u0000\u01f2\u01f8\u0001\u0000\u0000\u0000\u01f3\u01f4\n\u0001\u0000\u0000"+
		"\u01f4\u01f5\u0005\u001d\u0000\u0000\u01f5\u01f7\u00030\u0018\u0000\u01f6"+
		"\u01f3\u0001\u0000\u0000\u0000\u01f7\u01fa\u0001\u0000\u0000\u0000\u01f8"+
		"\u01f6\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9"+
		"/\u0001\u0000\u0000\u0000\u01fa\u01f8\u0001\u0000\u0000\u0000\u01fb\u0204"+
		"\u00032\u0019\u0000\u01fc\u01fd\u0005/\u0000\u0000\u01fd\u01fe\u0003,"+
		"\u0016\u0000\u01fe\u01ff\u00050\u0000\u0000\u01ff\u0204\u0001\u0000\u0000"+
		"\u0000\u0200\u0201\u0005\u001c\u0000\u0000\u0201\u0204\u00030\u0018\u0000"+
		"\u0202\u0204\u0003*\u0015\u0000\u0203\u01fb\u0001\u0000\u0000\u0000\u0203"+
		"\u01fc\u0001\u0000\u0000\u0000\u0203\u0200\u0001\u0000\u0000\u0000\u0203"+
		"\u0202\u0001\u0000\u0000\u0000\u02041\u0001\u0000\u0000\u0000\u0205\u0206"+
		"\u0007\u0002\u0000\u0000\u02063\u0001\u0000\u0000\u0000\u0207\u0208\u0001"+
		"\u0000\u0000\u0000\u02085\u0001\u0000\u0000\u0000\u001e=IM_}\u008e\u009c"+
		"\u009e\u00a7\u00d2\u00ea\u013a\u014c\u0172\u0184\u018c\u0192\u0198\u01a4"+
		"\u01aa\u01b6\u01bc\u01c2\u01c8\u01cb\u01da\u01df\u01ed\u01f8\u0203";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}