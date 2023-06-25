// Generated from C:/Users/Rodrigo/Documents/GitHub/Mini-Pascal/src\Gramatica.g4 by ANTLR 4.12.0
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
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

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
	public String getGrammarFileName() { return "Gramatica.g4"; }

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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 784L) != 0)) {
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
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ProcedureContext procedure() {
			return getRuleContext(ProcedureContext.class,0);
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
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				begin();
				setState(67);
				statement();
				setState(68);
				end();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				function();
				}
				break;
			case PROCEDURE:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				procedure();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
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
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(74);
					assign_statement();
					}
					}
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				var();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2 || _la==ID) {
					{
					{
					setState(81);
					var();
					}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
	public static class VarContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GramaticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaParser.ID, i);
		}
		public List<TerminalNode> PUNTOS() { return getTokens(GramaticaParser.PUNTOS); }
		public TerminalNode PUNTOS(int i) {
			return getToken(GramaticaParser.PUNTOS, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(GramaticaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GramaticaParser.SEMICOLON, i);
		}
		public TerminalNode STRING() { return getToken(GramaticaParser.STRING, 0); }
		public TerminalNode LLAVE_ABR() { return getToken(GramaticaParser.LLAVE_ABR, 0); }
		public TerminalNode INTEGER() { return getToken(GramaticaParser.INTEGER, 0); }
		public TerminalNode LLAVE_CIERRA() { return getToken(GramaticaParser.LLAVE_CIERRA, 0); }
		public List<TerminalNode> COMILLA() { return getTokens(GramaticaParser.COMILLA); }
		public TerminalNode COMILLA(int i) {
			return getToken(GramaticaParser.COMILLA, i);
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
			int _alt;
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(T__2);
				setState(90);
				match(ID);
				setState(91);
				match(PUNTOS);
				setState(92);
				type();
				setState(93);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(ID);
				setState(96);
				match(PUNTOS);
				setState(97);
				match(STRING);
				setState(98);
				match(LLAVE_ABR);
				setState(99);
				match(INTEGER);
				setState(100);
				match(LLAVE_CIERRA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				match(T__2);
				setState(102);
				match(ID);
				setState(103);
				match(PUNTOS);
				setState(104);
				type();
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMILLA) {
					{
					{
					setState(105);
					match(COMILLA);
					setState(106);
					match(ID);
					setState(107);
					match(PUNTOS);
					setState(108);
					type();
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(114);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				match(T__2);
				setState(117);
				match(ID);
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMILLA) {
					{
					{
					setState(118);
					match(COMILLA);
					setState(119);
					match(ID);
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(125);
				match(PUNTOS);
				setState(126);
				type();
				setState(127);
				match(SEMICOLON);
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(128);
						decl();
						}
						} 
					}
					setState(133);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				match(ID);
				setState(135);
				match(PUNTOS);
				setState(136);
				type();
				setState(137);
				match(SEMICOLON);
				notifyErrorListeners("Falta palabra Var");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(140);
				match(T__2);
				setState(141);
				match(ID);
				setState(142);
				match(PUNTOS);
				setState(143);
				type();
				setState(144);
				match(SEMICOLON);
				setState(145);
				match(SEMICOLON);
				notifyErrorListeners("Error de Comillas");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(148);
				match(T__2);
				setState(149);
				match(ID);
				setState(150);
				match(PUNTOS);
				setState(151);
				match(SEMICOLON);
				notifyErrorListeners("Especifique el tipo");
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(153);
				match(T__2);
				setState(154);
				match(ID);
				setState(155);
				type();
				setState(156);
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
			setState(161);
			match(ID);
			setState(162);
			match(ASIGNACION);
			setState(163);
			expression(0);
			setState(164);
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
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(167);
				bool_literal();
				}
				break;
			case 3:
				{
				setState(168);
				match(INTEGER);
				}
				break;
			case 4:
				{
				setState(169);
				match(ID);
				}
				break;
			case 5:
				{
				setState(170);
				match(STRING);
				}
				break;
			case 6:
				{
				setState(171);
				match(CHAR);
				}
				break;
			case 7:
				{
				setState(172);
				match(PAR_ABRE);
				setState(173);
				expression(0);
				setState(174);
				match(PAR_CIERRA);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(190);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(178);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(179);
						match(PLUS);
						setState(180);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(181);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(182);
						match(MINUS);
						setState(183);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(184);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(185);
						match(TIMES);
						setState(186);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(187);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(188);
						match(DIV);
						setState(189);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				setState(195);
				match(INTEGER);
				}
				break;
			case STRING:
				{
				setState(196);
				match(STRING);
				}
				break;
			case TRUE:
			case FALSE:
				{
				setState(197);
				bool_literal();
				}
				break;
			case CHAR:
				{
				setState(198);
				match(CHAR);
				}
				break;
			case NUM:
				{
				setState(199);
				match(NUM);
				}
				break;
			case TYPESTRING:
				{
				setState(200);
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
			setState(203);
			match(ARRAY);
			setState(204);
			match(ID);
			setState(205);
			match(LLAVE_ABR);
			setState(206);
			match(INTEGER);
			setState(207);
			match(LLAVE_CIERRA);
			setState(208);
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
			setState(210);
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
			setState(212);
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
			setState(214);
			match(T__5);
			setState(215);
			match(PAR_ABRE);
			setState(216);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(217);
			match(PAR_CIERRA);
			setState(218);
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
			setState(220);
			match(T__6);
			setState(221);
			match(PAR_ABRE);
			setState(222);
			match(ID);
			setState(223);
			match(PAR_CIERRA);
			setState(224);
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
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(ID);
				setState(227);
				match(ASIGNACION);
				setState(228);
				match(INTEGER);
				setState(229);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(ID);
				setState(231);
				match(ASIGNACION);
				setState(232);
				match(ID);
				setState(233);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				match(ID);
				setState(235);
				match(ASIGNACION);
				setState(236);
				match(INTEGER);
				setState(237);
				match(SEMICOLON);
				setState(238);
				match(SEMICOLON);
				notifyErrorListeners("Error de Comillas");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				match(ID);
				setState(241);
				match(ASIGNACION);
				setState(242);
				match(INTEGER);
				notifyErrorListeners("Error de Comillas");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(244);
				match(ID);
				setState(245);
				match(INTEGER);
				setState(246);
				match(SEMICOLON);
				notifyErrorListeners("Falta Token Asignacion");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(248);
				match(ID);
				setState(249);
				match(ASIGNACION);
				setState(250);
				match(SEMICOLON);
				notifyErrorListeners("Falta valor a Asignacion");
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
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				match(PROCEDURE);
				setState(255);
				match(ID);
				setState(256);
				match(PAR_ABRE);
				setState(257);
				parametros();
				setState(258);
				match(PAR_CIERRA);
				setState(259);
				begin();
				setState(260);
				statement();
				setState(261);
				end();
				setState(262);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(PROCEDURE);
				setState(265);
				match(ID);
				setState(266);
				match(SEMICOLON);
				setState(267);
				begin();
				setState(268);
				statement();
				setState(269);
				end();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				match(PROCEDURE);
				setState(272);
				match(PAR_ABRE);
				setState(273);
				parametros();
				setState(274);
				match(PAR_CIERRA);
				setState(275);
				begin();
				setState(276);
				statement();
				setState(277);
				end();
				notifyErrorListeners("Falto ID");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(280);
				match(PROCEDURE);
				setState(281);
				match(SEMICOLON);
				setState(282);
				begin();
				setState(283);
				statement();
				setState(284);
				end();
				notifyErrorListeners("Falto ID");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(287);
				match(PROCEDURE);
				setState(288);
				match(ID);
				setState(289);
				parametros();
				notifyErrorListeners("Falto comillas");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(292);
				match(PROCEDURE);
				setState(293);
				match(ID);
				setState(294);
				parametros();
				setState(295);
				match(PAR_CIERRA);
				setState(296);
				begin();
				setState(297);
				statement();
				setState(298);
				end();
				notifyErrorListeners("Falto Parentesis");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(301);
				match(PROCEDURE);
				setState(302);
				match(ID);
				setState(303);
				match(PAR_ABRE);
				setState(304);
				parametros();
				setState(305);
				begin();
				setState(306);
				statement();
				setState(307);
				end();
				notifyErrorListeners("Falto Parentesis");
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
		public List<TerminalNode> ASIGNACION() { return getTokens(GramaticaParser.ASIGNACION); }
		public TerminalNode ASIGNACION(int i) {
			return getToken(GramaticaParser.ASIGNACION, i);
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
			setState(462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				match(FOR);
				setState(313);
				match(INTEGER);
				setState(314);
				match(TO);
				setState(315);
				match(INTEGER);
				setState(316);
				match(DO);
				setState(317);
				begin();
				setState(318);
				statement();
				setState(319);
				end();
				setState(320);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(FOR);
				setState(323);
				match(ID);
				setState(324);
				match(TO);
				setState(325);
				match(ID);
				setState(326);
				match(DO);
				setState(327);
				begin();
				setState(328);
				statement();
				setState(329);
				end();
				setState(330);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(332);
				match(FOR);
				setState(333);
				match(TO);
				setState(334);
				match(ID);
				setState(335);
				match(DO);
				setState(336);
				begin();
				setState(337);
				statement();
				setState(338);
				end();
				setState(339);
				match(SEMICOLON);
				notifyErrorListeners("Falto valor");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(342);
				match(FOR);
				setState(343);
				match(ID);
				setState(344);
				match(TO);
				setState(345);
				match(DO);
				setState(346);
				begin();
				setState(347);
				statement();
				setState(348);
				end();
				setState(349);
				match(SEMICOLON);
				notifyErrorListeners("Falto valor");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(352);
				match(FOR);
				setState(353);
				match(ID);
				setState(354);
				match(ID);
				setState(355);
				match(DO);
				setState(356);
				begin();
				setState(357);
				statement();
				setState(358);
				end();
				setState(359);
				match(SEMICOLON);
				notifyErrorListeners("Falto palabra reservada");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(362);
				match(FOR);
				setState(363);
				match(ID);
				setState(364);
				match(TO);
				setState(365);
				match(ID);
				setState(366);
				begin();
				setState(367);
				statement();
				setState(368);
				end();
				setState(369);
				match(SEMICOLON);
				notifyErrorListeners("Falto palabra reservada");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(372);
				match(FOR);
				setState(373);
				match(ID);
				setState(374);
				match(TO);
				setState(375);
				match(ID);
				setState(376);
				statement();
				setState(377);
				end();
				setState(378);
				match(SEMICOLON);
				notifyErrorListeners("Falto Begin");
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(381);
				match(FOR);
				setState(382);
				match(ID);
				setState(383);
				match(TO);
				setState(384);
				match(ID);
				setState(385);
				statement();
				setState(386);
				end();
				notifyErrorListeners("Falto Semicolon");
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(389);
				match(FOR);
				setState(390);
				match(ID);
				setState(391);
				match(TO);
				setState(392);
				match(ID);
				setState(393);
				begin();
				setState(394);
				statement();
				setState(395);
				match(SEMICOLON);
				notifyErrorListeners("Falto End");
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(398);
				match(FOR);
				setState(399);
				match(ID);
				setState(400);
				match(ASIGNACION);
				setState(401);
				match(INTEGER);
				setState(402);
				match(TO);
				setState(403);
				match(INTEGER);
				setState(404);
				match(DO);
				setState(405);
				begin();
				setState(406);
				statement();
				setState(407);
				end();
				setState(408);
				match(SEMICOLON);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(410);
				match(FOR);
				setState(411);
				match(ID);
				setState(412);
				match(ASIGNACION);
				setState(413);
				match(INTEGER);
				setState(414);
				match(TO);
				setState(415);
				match(ID);
				setState(416);
				match(DO);
				setState(417);
				begin();
				setState(418);
				statement();
				setState(419);
				end();
				setState(420);
				match(SEMICOLON);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(422);
				match(FOR);
				setState(423);
				match(ID);
				setState(424);
				match(ASIGNACION);
				setState(425);
				match(ID);
				setState(426);
				match(TO);
				setState(427);
				match(ID);
				setState(428);
				match(DO);
				setState(429);
				begin();
				setState(430);
				statement();
				setState(431);
				end();
				setState(432);
				match(SEMICOLON);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(434);
				match(FOR);
				setState(435);
				match(ID);
				setState(436);
				match(ASIGNACION);
				setState(437);
				match(ID);
				setState(438);
				match(TO);
				setState(439);
				match(ID);
				setState(440);
				match(ASIGNACION);
				setState(441);
				match(INTEGER);
				setState(442);
				match(DO);
				setState(443);
				begin();
				setState(444);
				statement();
				setState(445);
				end();
				setState(446);
				match(SEMICOLON);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(448);
				match(FOR);
				setState(449);
				match(ID);
				setState(450);
				match(ASIGNACION);
				setState(451);
				match(ID);
				setState(452);
				match(TO);
				setState(453);
				match(ID);
				setState(454);
				match(ASIGNACION);
				setState(455);
				match(ID);
				setState(456);
				match(DO);
				setState(457);
				begin();
				setState(458);
				statement();
				setState(459);
				end();
				setState(460);
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
	public static class ParametrosContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode PUNTOS() { return getToken(GramaticaParser.PUNTOS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> COMILLA() { return getTokens(GramaticaParser.COMILLA); }
		public TerminalNode COMILLA(int i) {
			return getToken(GramaticaParser.COMILLA, i);
		}
		public List<ParametrosContext> parametros() {
			return getRuleContexts(ParametrosContext.class);
		}
		public ParametrosContext parametros(int i) {
			return getRuleContext(ParametrosContext.class,i);
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
			int _alt;
			setState(493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				match(ID);
				setState(465);
				match(PUNTOS);
				setState(466);
				type();
				setState(471);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(467);
						match(COMILLA);
						setState(468);
						parametros();
						}
						} 
					}
					setState(473);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				match(ID);
				setState(475);
				type();
				notifyErrorListeners("Falto :");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				match(ID);
				setState(479);
				match(PUNTOS);
				notifyErrorListeners("Falta Tipo");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(481);
				match(COMILLA);
				setState(482);
				match(PUNTOS);
				setState(483);
				type();
				setState(484);
				parametros();
				notifyErrorListeners("Falta identificador");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(487);
				match(COMILLA);
				setState(488);
				match(ID);
				setState(489);
				type();
				setState(490);
				parametros();
				notifyErrorListeners("Falta puntos");
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
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				match(FUNCTION);
				setState(496);
				match(ID);
				setState(497);
				match(PAR_ABRE);
				setState(498);
				parametros();
				setState(499);
				match(PAR_CIERRA);
				setState(500);
				match(PUNTOS);
				setState(501);
				type();
				setState(502);
				begin();
				setState(503);
				statement();
				setState(504);
				end();
				setState(505);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				match(FUNCTION);
				setState(508);
				match(PAR_ABRE);
				setState(509);
				parametros();
				setState(510);
				match(PAR_CIERRA);
				setState(511);
				match(PUNTOS);
				setState(512);
				type();
				setState(513);
				begin();
				setState(514);
				statement();
				setState(515);
				end();
				setState(516);
				match(SEMICOLON);
				notifyErrorListeners("Falta Identificador");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(519);
				match(FUNCTION);
				setState(520);
				match(ID);
				setState(521);
				parametros();
				setState(522);
				match(PAR_CIERRA);
				setState(523);
				match(PUNTOS);
				setState(524);
				type();
				setState(525);
				begin();
				setState(526);
				statement();
				setState(527);
				end();
				setState(528);
				match(SEMICOLON);
				notifyErrorListeners("Falta Parentesis");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(531);
				match(FUNCTION);
				setState(532);
				match(ID);
				setState(533);
				match(PAR_ABRE);
				setState(534);
				parametros();
				setState(535);
				match(PUNTOS);
				setState(536);
				type();
				setState(537);
				begin();
				setState(538);
				statement();
				setState(539);
				end();
				setState(540);
				match(SEMICOLON);
				notifyErrorListeners("Falta Parentesis");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(543);
				match(FUNCTION);
				setState(544);
				match(ID);
				setState(545);
				match(PAR_ABRE);
				setState(546);
				parametros();
				setState(547);
				match(PAR_CIERRA);
				setState(548);
				type();
				setState(549);
				begin();
				setState(550);
				statement();
				setState(551);
				end();
				setState(552);
				match(SEMICOLON);
				notifyErrorListeners("Falta Puntos");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(555);
				match(FUNCTION);
				setState(556);
				match(ID);
				setState(557);
				match(PAR_ABRE);
				setState(558);
				parametros();
				setState(559);
				match(PAR_CIERRA);
				setState(560);
				match(PUNTOS);
				setState(561);
				type();
				setState(562);
				begin();
				setState(563);
				statement();
				setState(564);
				end();
				notifyErrorListeners("Falta Semicolon");
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
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GramaticaParser.WHILE, 0); }
		public TerminalNode PAR_ABRE() { return getToken(GramaticaParser.PAR_ABRE, 0); }
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
			setState(627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(569);
				match(WHILE);
				setState(570);
				match(PAR_ABRE);
				setState(571);
				bool_expr(0);
				setState(572);
				match(PAR_CIERRA);
				setState(573);
				match(DO);
				setState(574);
				begin();
				setState(575);
				statement();
				setState(576);
				end();
				setState(577);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				match(WHILE);
				setState(580);
				match(ID);
				setState(581);
				bool_expr(0);
				setState(582);
				match(ID);
				setState(583);
				match(PAR_CIERRA);
				setState(584);
				match(DO);
				setState(585);
				begin();
				setState(586);
				statement();
				setState(587);
				end();
				setState(588);
				match(SEMICOLON);
				notifyErrorListeners("Falta Parentesis");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(591);
				match(WHILE);
				setState(592);
				match(PAR_ABRE);
				setState(593);
				match(ID);
				setState(594);
				bool_expr(0);
				setState(595);
				match(ID);
				setState(596);
				match(DO);
				setState(597);
				begin();
				setState(598);
				statement();
				setState(599);
				end();
				setState(600);
				match(SEMICOLON);
				notifyErrorListeners("Falta Parentesis");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(603);
				match(WHILE);
				setState(604);
				match(PAR_ABRE);
				setState(605);
				match(ID);
				setState(606);
				bool_expr(0);
				setState(607);
				match(ID);
				setState(608);
				match(PAR_CIERRA);
				setState(609);
				begin();
				setState(610);
				statement();
				setState(611);
				end();
				setState(612);
				match(SEMICOLON);
				notifyErrorListeners("Falta Enunciado DO");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(615);
				match(WHILE);
				setState(616);
				match(PAR_ABRE);
				setState(617);
				match(ID);
				setState(618);
				bool_expr(0);
				setState(619);
				match(ID);
				setState(620);
				match(PAR_CIERRA);
				setState(621);
				match(DO);
				setState(622);
				begin();
				setState(623);
				statement();
				setState(624);
				end();
				notifyErrorListeners("Falta Semicolon");
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
			setState(686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				match(REPEAT);
				setState(630);
				statement();
				setState(631);
				match(UNTIL);
				setState(632);
				match(INTEGER);
				setState(633);
				bool_expr(0);
				setState(634);
				match(INTEGER);
				setState(635);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(637);
				match(REPEAT);
				setState(638);
				statement();
				setState(639);
				match(UNTIL);
				setState(640);
				match(ID);
				setState(641);
				bool_expr(0);
				setState(642);
				match(ID);
				setState(643);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(645);
				match(REPEAT);
				setState(646);
				statement();
				setState(647);
				match(UNTIL);
				setState(648);
				match(ID);
				setState(649);
				bool_expr(0);
				setState(650);
				match(ID);
				setState(651);
				match(SEMICOLON);
				notifyErrorListeners("Falta Semicolon");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(654);
				match(REPEAT);
				setState(655);
				statement();
				setState(656);
				match(ID);
				setState(657);
				bool_expr(0);
				setState(658);
				match(ID);
				setState(659);
				match(SEMICOLON);
				notifyErrorListeners("Falta Unitl");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(662);
				match(REPEAT);
				setState(663);
				statement();
				setState(664);
				match(UNTIL);
				setState(665);
				bool_expr(0);
				setState(666);
				match(ID);
				setState(667);
				match(SEMICOLON);
				notifyErrorListeners("Falta Identificador");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(670);
				match(REPEAT);
				setState(671);
				statement();
				setState(672);
				match(UNTIL);
				setState(673);
				match(ID);
				setState(674);
				bool_expr(0);
				setState(675);
				match(SEMICOLON);
				notifyErrorListeners("Falta Identificador");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(678);
				match(REPEAT);
				setState(679);
				statement();
				setState(680);
				match(UNTIL);
				setState(681);
				match(ID);
				setState(682);
				bool_expr(0);
				setState(683);
				match(ID);
				notifyErrorListeners("Falta Semicolon");
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
			setState(766);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(688);
				assign_statement();
				setState(689);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(694);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(691);
						assign_statement();
						}
						} 
					}
					setState(696);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(700);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(697);
						for_();
						}
						} 
					}
					setState(702);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(706);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(703);
						writeln_statement();
						}
						} 
					}
					setState(708);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(709);
				writeln_statement();
				setState(710);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(712);
				readln_statement();
				setState(713);
				statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(718);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(715);
						readln_statement();
						}
						} 
					}
					setState(720);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(724);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(721);
						array_declaration();
						}
						} 
					}
					setState(726);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(727);
				array_declaration();
				setState(728);
				statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(730);
				if_stmt();
				setState(731);
				statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(736);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(733);
						if_stmt();
						}
						} 
					}
					setState(738);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(739);
				for_();
				setState(740);
				statement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(745);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(742);
						for_();
						}
						} 
					}
					setState(747);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(748);
				while_();
				setState(749);
				statement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(754);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(751);
						while_();
						}
						} 
					}
					setState(756);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(757);
				repeat();
				setState(758);
				statement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(763);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(760);
						repeat();
						}
						} 
					}
					setState(765);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
			setState(768);
			match(IF);
			setState(769);
			match(PAR_ABRE);
			setState(770);
			bool_expr(0);
			setState(771);
			match(PAR_CIERRA);
			setState(772);
			statement();
			setState(781);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(773);
					match(ELSEIF);
					setState(774);
					match(PAR_ABRE);
					setState(775);
					bool_expr(0);
					setState(776);
					match(PAR_CIERRA);
					setState(777);
					statement();
					}
					} 
				}
				setState(783);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(786);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(784);
				match(ELSE);
				setState(785);
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
			setState(788);
			expression(0);
			setState(789);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 264241152L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(790);
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
			setState(793);
			bool_term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(800);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
					setState(795);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(796);
					match(OR);
					setState(797);
					bool_term(0);
					}
					} 
				}
				setState(802);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
			setState(804);
			bool_factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(811);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_termContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_term);
					setState(806);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(807);
					match(AND);
					setState(808);
					bool_factor();
					}
					} 
				}
				setState(813);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
			setState(822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(814);
				bool_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(815);
				match(PAR_ABRE);
				setState(816);
				bool_expr(0);
				setState(817);
				match(PAR_CIERRA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(819);
				match(NOT);
				setState(820);
				bool_factor();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(821);
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
			setState(824);
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
		"\u0004\u00014\u033d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001I\b\u0001\u0001\u0002"+
		"\u0005\u0002L\b\u0002\n\u0002\f\u0002O\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002S\b\u0002\n\u0002\f\u0002V\t\u0002\u0003\u0002X\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003n\b\u0003\n\u0003\f\u0003q\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003y\b\u0003\n\u0003\f\u0003|\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003\u0082\b\u0003\n\u0003\f\u0003\u0085\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u00a0\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u00b1\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u00bf\b\u0005\n\u0005\f\u0005\u00c2"+
		"\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00ca\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00fd\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u0137\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u01cf\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u01d6\b\u000f\n\u000f\f\u000f"+
		"\u01d9\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u01ee\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0238\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0274\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u02af\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u02b5\b\u0013\n\u0013"+
		"\f\u0013\u02b8\t\u0013\u0001\u0013\u0005\u0013\u02bb\b\u0013\n\u0013\f"+
		"\u0013\u02be\t\u0013\u0001\u0013\u0005\u0013\u02c1\b\u0013\n\u0013\f\u0013"+
		"\u02c4\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u02cd\b\u0013\n\u0013\f\u0013\u02d0"+
		"\t\u0013\u0001\u0013\u0005\u0013\u02d3\b\u0013\n\u0013\f\u0013\u02d6\t"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u02df\b\u0013\n\u0013\f\u0013\u02e2\t\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u02e8\b\u0013"+
		"\n\u0013\f\u0013\u02eb\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u02f1\b\u0013\n\u0013\f\u0013\u02f4\t\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u02fa\b\u0013\n\u0013"+
		"\f\u0013\u02fd\t\u0013\u0003\u0013\u02ff\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u030c\b\u0014\n\u0014"+
		"\f\u0014\u030f\t\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0313\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u031f\b\u0016"+
		"\n\u0016\f\u0016\u0322\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u032a\b\u0017\n\u0017\f\u0017"+
		"\u032d\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0337\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0000\u0003\n,.\u001b"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.024\u0000\u0003\u0002\u0000&&..\u0001\u0000\u0016"+
		"\u001b\u0001\u0000*+\u038d\u00006\u0001\u0000\u0000\u0000\u0002H\u0001"+
		"\u0000\u0000\u0000\u0004W\u0001\u0000\u0000\u0000\u0006\u009f\u0001\u0000"+
		"\u0000\u0000\b\u00a1\u0001\u0000\u0000\u0000\n\u00b0\u0001\u0000\u0000"+
		"\u0000\f\u00c9\u0001\u0000\u0000\u0000\u000e\u00cb\u0001\u0000\u0000\u0000"+
		"\u0010\u00d2\u0001\u0000\u0000\u0000\u0012\u00d4\u0001\u0000\u0000\u0000"+
		"\u0014\u00d6\u0001\u0000\u0000\u0000\u0016\u00dc\u0001\u0000\u0000\u0000"+
		"\u0018\u00fc\u0001\u0000\u0000\u0000\u001a\u0136\u0001\u0000\u0000\u0000"+
		"\u001c\u01ce\u0001\u0000\u0000\u0000\u001e\u01ed\u0001\u0000\u0000\u0000"+
		" \u0237\u0001\u0000\u0000\u0000\"\u0273\u0001\u0000\u0000\u0000$\u02ae"+
		"\u0001\u0000\u0000\u0000&\u02fe\u0001\u0000\u0000\u0000(\u0300\u0001\u0000"+
		"\u0000\u0000*\u0314\u0001\u0000\u0000\u0000,\u0318\u0001\u0000\u0000\u0000"+
		".\u0323\u0001\u0000\u0000\u00000\u0336\u0001\u0000\u0000\u00002\u0338"+
		"\u0001\u0000\u0000\u00004\u033a\u0001\u0000\u0000\u000067\u0005\u0001"+
		"\u0000\u000078\u0005.\u0000\u000089\u0005\n\u0000\u00009=\u0003\u0004"+
		"\u0002\u0000:<\u0003\u0002\u0001\u0000;:\u0001\u0000\u0000\u0000<?\u0001"+
		"\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000"+
		">@\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@A\u0005\u0002\u0000"+
		"\u0000A\u0001\u0001\u0000\u0000\u0000BC\u0003\u0010\b\u0000CD\u0003&\u0013"+
		"\u0000DE\u0003\u0012\t\u0000EI\u0001\u0000\u0000\u0000FI\u0003 \u0010"+
		"\u0000GI\u0003\u001a\r\u0000HB\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000"+
		"\u0000HG\u0001\u0000\u0000\u0000I\u0003\u0001\u0000\u0000\u0000JL\u0003"+
		"\b\u0004\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NX\u0001\u0000\u0000\u0000"+
		"OM\u0001\u0000\u0000\u0000PX\u0003\u0006\u0003\u0000QS\u0003\u0006\u0003"+
		"\u0000RQ\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000"+
		"\u0000\u0000TU\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001"+
		"\u0000\u0000\u0000WM\u0001\u0000\u0000\u0000WP\u0001\u0000\u0000\u0000"+
		"WT\u0001\u0000\u0000\u0000X\u0005\u0001\u0000\u0000\u0000YZ\u0005\u0003"+
		"\u0000\u0000Z[\u0005.\u0000\u0000[\\\u0005\f\u0000\u0000\\]\u0003\f\u0006"+
		"\u0000]^\u0005\n\u0000\u0000^\u00a0\u0001\u0000\u0000\u0000_`\u0005.\u0000"+
		"\u0000`a\u0005\f\u0000\u0000ab\u0005&\u0000\u0000bc\u0005\u0013\u0000"+
		"\u0000cd\u0005#\u0000\u0000d\u00a0\u0005\u0014\u0000\u0000ef\u0005\u0003"+
		"\u0000\u0000fg\u0005.\u0000\u0000gh\u0005\f\u0000\u0000ho\u0003\f\u0006"+
		"\u0000ij\u0005-\u0000\u0000jk\u0005.\u0000\u0000kl\u0005\f\u0000\u0000"+
		"ln\u0003\f\u0006\u0000mi\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pr\u0001\u0000\u0000"+
		"\u0000qo\u0001\u0000\u0000\u0000rs\u0005\n\u0000\u0000s\u00a0\u0001\u0000"+
		"\u0000\u0000tu\u0005\u0003\u0000\u0000uz\u0005.\u0000\u0000vw\u0005-\u0000"+
		"\u0000wy\u0005.\u0000\u0000xv\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000"+
		"\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{}\u0001\u0000"+
		"\u0000\u0000|z\u0001\u0000\u0000\u0000}~\u0005\f\u0000\u0000~\u007f\u0003"+
		"\f\u0006\u0000\u007f\u0083\u0005\n\u0000\u0000\u0080\u0082\u0003\u0018"+
		"\f\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000"+
		"\u0000\u0084\u00a0\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0005.\u0000\u0000\u0087\u0088\u0005\f\u0000\u0000"+
		"\u0088\u0089\u0003\f\u0006\u0000\u0089\u008a\u0005\n\u0000\u0000\u008a"+
		"\u008b\u0006\u0003\uffff\uffff\u0000\u008b\u00a0\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0005\u0003\u0000\u0000\u008d\u008e\u0005.\u0000\u0000\u008e"+
		"\u008f\u0005\f\u0000\u0000\u008f\u0090\u0003\f\u0006\u0000\u0090\u0091"+
		"\u0005\n\u0000\u0000\u0091\u0092\u0005\n\u0000\u0000\u0092\u0093\u0006"+
		"\u0003\uffff\uffff\u0000\u0093\u00a0\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0005\u0003\u0000\u0000\u0095\u0096\u0005.\u0000\u0000\u0096\u0097\u0005"+
		"\f\u0000\u0000\u0097\u0098\u0005\n\u0000\u0000\u0098\u00a0\u0006\u0003"+
		"\uffff\uffff\u0000\u0099\u009a\u0005\u0003\u0000\u0000\u009a\u009b\u0005"+
		".\u0000\u0000\u009b\u009c\u0003\f\u0006\u0000\u009c\u009d\u0005\n\u0000"+
		"\u0000\u009d\u009e\u0006\u0003\uffff\uffff\u0000\u009e\u00a0\u0001\u0000"+
		"\u0000\u0000\u009fY\u0001\u0000\u0000\u0000\u009f_\u0001\u0000\u0000\u0000"+
		"\u009fe\u0001\u0000\u0000\u0000\u009ft\u0001\u0000\u0000\u0000\u009f\u0086"+
		"\u0001\u0000\u0000\u0000\u009f\u008c\u0001\u0000\u0000\u0000\u009f\u0094"+
		"\u0001\u0000\u0000\u0000\u009f\u0099\u0001\u0000\u0000\u0000\u00a0\u0007"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005.\u0000\u0000\u00a2\u00a3\u0005"+
		"\u0015\u0000\u0000\u00a3\u00a4\u0003\n\u0005\u0000\u00a4\u00a5\u0005\n"+
		"\u0000\u0000\u00a5\t\u0001\u0000\u0000\u0000\u00a6\u00b1\u0006\u0005\uffff"+
		"\uffff\u0000\u00a7\u00b1\u00032\u0019\u0000\u00a8\u00b1\u0005#\u0000\u0000"+
		"\u00a9\u00b1\u0005.\u0000\u0000\u00aa\u00b1\u0005&\u0000\u0000\u00ab\u00b1"+
		"\u0005\'\u0000\u0000\u00ac\u00ad\u0005/\u0000\u0000\u00ad\u00ae\u0003"+
		"\n\u0005\u0000\u00ae\u00af\u00050\u0000\u0000\u00af\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b0\u00a6\u0001\u0000\u0000\u0000\u00b0\u00a7\u0001\u0000"+
		"\u0000\u0000\u00b0\u00a8\u0001\u0000\u0000\u0000\u00b0\u00a9\u0001\u0000"+
		"\u0000\u0000\u00b0\u00aa\u0001\u0000\u0000\u0000\u00b0\u00ab\u0001\u0000"+
		"\u0000\u0000\u00b0\u00ac\u0001\u0000\u0000\u0000\u00b1\u00c0\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\n\u0005\u0000\u0000\u00b3\u00b4\u00051\u0000"+
		"\u0000\u00b4\u00bf\u0003\n\u0005\u0006\u00b5\u00b6\n\u0004\u0000\u0000"+
		"\u00b6\u00b7\u00052\u0000\u0000\u00b7\u00bf\u0003\n\u0005\u0005\u00b8"+
		"\u00b9\n\u0003\u0000\u0000\u00b9\u00ba\u00053\u0000\u0000\u00ba\u00bf"+
		"\u0003\n\u0005\u0004\u00bb\u00bc\n\u0002\u0000\u0000\u00bc\u00bd\u0005"+
		"4\u0000\u0000\u00bd\u00bf\u0003\n\u0005\u0003\u00be\u00b2\u0001\u0000"+
		"\u0000\u0000\u00be\u00b5\u0001\u0000\u0000\u0000\u00be\u00b8\u0001\u0000"+
		"\u0000\u0000\u00be\u00bb\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c1\u000b\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c3\u00ca\u0005#\u0000\u0000\u00c4\u00ca\u0005&\u0000\u0000"+
		"\u00c5\u00ca\u00032\u0019\u0000\u00c6\u00ca\u0005\'\u0000\u0000\u00c7"+
		"\u00ca\u0005$\u0000\u0000\u00c8\u00ca\u0005%\u0000\u0000\u00c9\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c9\u00c4\u0001\u0000\u0000\u0000\u00c9\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c9\u00c6\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00ca\r\u0001\u0000"+
		"\u0000\u0000\u00cb\u00cc\u0005,\u0000\u0000\u00cc\u00cd\u0005.\u0000\u0000"+
		"\u00cd\u00ce\u0005\u0013\u0000\u0000\u00ce\u00cf\u0005#\u0000\u0000\u00cf"+
		"\u00d0\u0005\u0014\u0000\u0000\u00d0\u00d1\u0005\n\u0000\u0000\u00d1\u000f"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u0004\u0000\u0000\u00d3\u0011"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u0005\u0000\u0000\u00d5\u0013"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u0006\u0000\u0000\u00d7\u00d8"+
		"\u0005/\u0000\u0000\u00d8\u00d9\u0007\u0000\u0000\u0000\u00d9\u00da\u0005"+
		"0\u0000\u0000\u00da\u00db\u0005\n\u0000\u0000\u00db\u0015\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\u0005\u0007\u0000\u0000\u00dd\u00de\u0005/\u0000"+
		"\u0000\u00de\u00df\u0005.\u0000\u0000\u00df\u00e0\u00050\u0000\u0000\u00e0"+
		"\u00e1\u0005\n\u0000\u0000\u00e1\u0017\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\u0005.\u0000\u0000\u00e3\u00e4\u0005\u0015\u0000\u0000\u00e4\u00e5\u0005"+
		"#\u0000\u0000\u00e5\u00fd\u0005\n\u0000\u0000\u00e6\u00e7\u0005.\u0000"+
		"\u0000\u00e7\u00e8\u0005\u0015\u0000\u0000\u00e8\u00e9\u0005.\u0000\u0000"+
		"\u00e9\u00fd\u0005\n\u0000\u0000\u00ea\u00eb\u0005.\u0000\u0000\u00eb"+
		"\u00ec\u0005\u0015\u0000\u0000\u00ec\u00ed\u0005#\u0000\u0000\u00ed\u00ee"+
		"\u0005\n\u0000\u0000\u00ee\u00ef\u0005\n\u0000\u0000\u00ef\u00fd\u0006"+
		"\f\uffff\uffff\u0000\u00f0\u00f1\u0005.\u0000\u0000\u00f1\u00f2\u0005"+
		"\u0015\u0000\u0000\u00f2\u00f3\u0005#\u0000\u0000\u00f3\u00fd\u0006\f"+
		"\uffff\uffff\u0000\u00f4\u00f5\u0005.\u0000\u0000\u00f5\u00f6\u0005#\u0000"+
		"\u0000\u00f6\u00f7\u0005\n\u0000\u0000\u00f7\u00fd\u0006\f\uffff\uffff"+
		"\u0000\u00f8\u00f9\u0005.\u0000\u0000\u00f9\u00fa\u0005\u0015\u0000\u0000"+
		"\u00fa\u00fb\u0005\n\u0000\u0000\u00fb\u00fd\u0006\f\uffff\uffff\u0000"+
		"\u00fc\u00e2\u0001\u0000\u0000\u0000\u00fc\u00e6\u0001\u0000\u0000\u0000"+
		"\u00fc\u00ea\u0001\u0000\u0000\u0000\u00fc\u00f0\u0001\u0000\u0000\u0000"+
		"\u00fc\u00f4\u0001\u0000\u0000\u0000\u00fc\u00f8\u0001\u0000\u0000\u0000"+
		"\u00fd\u0019\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005\b\u0000\u0000\u00ff"+
		"\u0100\u0005.\u0000\u0000\u0100\u0101\u0005/\u0000\u0000\u0101\u0102\u0003"+
		"\u001e\u000f\u0000\u0102\u0103\u00050\u0000\u0000\u0103\u0104\u0003\u0010"+
		"\b\u0000\u0104\u0105\u0003&\u0013\u0000\u0105\u0106\u0003\u0012\t\u0000"+
		"\u0106\u0107\u0005\u0002\u0000\u0000\u0107\u0137\u0001\u0000\u0000\u0000"+
		"\u0108\u0109\u0005\b\u0000\u0000\u0109\u010a\u0005.\u0000\u0000\u010a"+
		"\u010b\u0005\n\u0000\u0000\u010b\u010c\u0003\u0010\b\u0000\u010c\u010d"+
		"\u0003&\u0013\u0000\u010d\u010e\u0003\u0012\t\u0000\u010e\u0137\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0005\b\u0000\u0000\u0110\u0111\u0005/"+
		"\u0000\u0000\u0111\u0112\u0003\u001e\u000f\u0000\u0112\u0113\u00050\u0000"+
		"\u0000\u0113\u0114\u0003\u0010\b\u0000\u0114\u0115\u0003&\u0013\u0000"+
		"\u0115\u0116\u0003\u0012\t\u0000\u0116\u0117\u0006\r\uffff\uffff\u0000"+
		"\u0117\u0137\u0001\u0000\u0000\u0000\u0118\u0119\u0005\b\u0000\u0000\u0119"+
		"\u011a\u0005\n\u0000\u0000\u011a\u011b\u0003\u0010\b\u0000\u011b\u011c"+
		"\u0003&\u0013\u0000\u011c\u011d\u0003\u0012\t\u0000\u011d\u011e\u0006"+
		"\r\uffff\uffff\u0000\u011e\u0137\u0001\u0000\u0000\u0000\u011f\u0120\u0005"+
		"\b\u0000\u0000\u0120\u0121\u0005.\u0000\u0000\u0121\u0122\u0003\u001e"+
		"\u000f\u0000\u0122\u0123\u0006\r\uffff\uffff\u0000\u0123\u0137\u0001\u0000"+
		"\u0000\u0000\u0124\u0125\u0005\b\u0000\u0000\u0125\u0126\u0005.\u0000"+
		"\u0000\u0126\u0127\u0003\u001e\u000f\u0000\u0127\u0128\u00050\u0000\u0000"+
		"\u0128\u0129\u0003\u0010\b\u0000\u0129\u012a\u0003&\u0013\u0000\u012a"+
		"\u012b\u0003\u0012\t\u0000\u012b\u012c\u0006\r\uffff\uffff\u0000\u012c"+
		"\u0137\u0001\u0000\u0000\u0000\u012d\u012e\u0005\b\u0000\u0000\u012e\u012f"+
		"\u0005.\u0000\u0000\u012f\u0130\u0005/\u0000\u0000\u0130\u0131\u0003\u001e"+
		"\u000f\u0000\u0131\u0132\u0003\u0010\b\u0000\u0132\u0133\u0003&\u0013"+
		"\u0000\u0133\u0134\u0003\u0012\t\u0000\u0134\u0135\u0006\r\uffff\uffff"+
		"\u0000\u0135\u0137\u0001\u0000\u0000\u0000\u0136\u00fe\u0001\u0000\u0000"+
		"\u0000\u0136\u0108\u0001\u0000\u0000\u0000\u0136\u010f\u0001\u0000\u0000"+
		"\u0000\u0136\u0118\u0001\u0000\u0000\u0000\u0136\u011f\u0001\u0000\u0000"+
		"\u0000\u0136\u0124\u0001\u0000\u0000\u0000\u0136\u012d\u0001\u0000\u0000"+
		"\u0000\u0137\u001b\u0001\u0000\u0000\u0000\u0138\u0139\u0005\r\u0000\u0000"+
		"\u0139\u013a\u0005#\u0000\u0000\u013a\u013b\u0005\u000e\u0000\u0000\u013b"+
		"\u013c\u0005#\u0000\u0000\u013c\u013d\u0005\u000f\u0000\u0000\u013d\u013e"+
		"\u0003\u0010\b\u0000\u013e\u013f\u0003&\u0013\u0000\u013f\u0140\u0003"+
		"\u0012\t\u0000\u0140\u0141\u0005\n\u0000\u0000\u0141\u01cf\u0001\u0000"+
		"\u0000\u0000\u0142\u0143\u0005\r\u0000\u0000\u0143\u0144\u0005.\u0000"+
		"\u0000\u0144\u0145\u0005\u000e\u0000\u0000\u0145\u0146\u0005.\u0000\u0000"+
		"\u0146\u0147\u0005\u000f\u0000\u0000\u0147\u0148\u0003\u0010\b\u0000\u0148"+
		"\u0149\u0003&\u0013\u0000\u0149\u014a\u0003\u0012\t\u0000\u014a\u014b"+
		"\u0005\n\u0000\u0000\u014b\u01cf\u0001\u0000\u0000\u0000\u014c\u014d\u0005"+
		"\r\u0000\u0000\u014d\u014e\u0005\u000e\u0000\u0000\u014e\u014f\u0005."+
		"\u0000\u0000\u014f\u0150\u0005\u000f\u0000\u0000\u0150\u0151\u0003\u0010"+
		"\b\u0000\u0151\u0152\u0003&\u0013\u0000\u0152\u0153\u0003\u0012\t\u0000"+
		"\u0153\u0154\u0005\n\u0000\u0000\u0154\u0155\u0006\u000e\uffff\uffff\u0000"+
		"\u0155\u01cf\u0001\u0000\u0000\u0000\u0156\u0157\u0005\r\u0000\u0000\u0157"+
		"\u0158\u0005.\u0000\u0000\u0158\u0159\u0005\u000e\u0000\u0000\u0159\u015a"+
		"\u0005\u000f\u0000\u0000\u015a\u015b\u0003\u0010\b\u0000\u015b\u015c\u0003"+
		"&\u0013\u0000\u015c\u015d\u0003\u0012\t\u0000\u015d\u015e\u0005\n\u0000"+
		"\u0000\u015e\u015f\u0006\u000e\uffff\uffff\u0000\u015f\u01cf\u0001\u0000"+
		"\u0000\u0000\u0160\u0161\u0005\r\u0000\u0000\u0161\u0162\u0005.\u0000"+
		"\u0000\u0162\u0163\u0005.\u0000\u0000\u0163\u0164\u0005\u000f\u0000\u0000"+
		"\u0164\u0165\u0003\u0010\b\u0000\u0165\u0166\u0003&\u0013\u0000\u0166"+
		"\u0167\u0003\u0012\t\u0000\u0167\u0168\u0005\n\u0000\u0000\u0168\u0169"+
		"\u0006\u000e\uffff\uffff\u0000\u0169\u01cf\u0001\u0000\u0000\u0000\u016a"+
		"\u016b\u0005\r\u0000\u0000\u016b\u016c\u0005.\u0000\u0000\u016c\u016d"+
		"\u0005\u000e\u0000\u0000\u016d\u016e\u0005.\u0000\u0000\u016e\u016f\u0003"+
		"\u0010\b\u0000\u016f\u0170\u0003&\u0013\u0000\u0170\u0171\u0003\u0012"+
		"\t\u0000\u0171\u0172\u0005\n\u0000\u0000\u0172\u0173\u0006\u000e\uffff"+
		"\uffff\u0000\u0173\u01cf\u0001\u0000\u0000\u0000\u0174\u0175\u0005\r\u0000"+
		"\u0000\u0175\u0176\u0005.\u0000\u0000\u0176\u0177\u0005\u000e\u0000\u0000"+
		"\u0177\u0178\u0005.\u0000\u0000\u0178\u0179\u0003&\u0013\u0000\u0179\u017a"+
		"\u0003\u0012\t\u0000\u017a\u017b\u0005\n\u0000\u0000\u017b\u017c\u0006"+
		"\u000e\uffff\uffff\u0000\u017c\u01cf\u0001\u0000\u0000\u0000\u017d\u017e"+
		"\u0005\r\u0000\u0000\u017e\u017f\u0005.\u0000\u0000\u017f\u0180\u0005"+
		"\u000e\u0000\u0000\u0180\u0181\u0005.\u0000\u0000\u0181\u0182\u0003&\u0013"+
		"\u0000\u0182\u0183\u0003\u0012\t\u0000\u0183\u0184\u0006\u000e\uffff\uffff"+
		"\u0000\u0184\u01cf\u0001\u0000\u0000\u0000\u0185\u0186\u0005\r\u0000\u0000"+
		"\u0186\u0187\u0005.\u0000\u0000\u0187\u0188\u0005\u000e\u0000\u0000\u0188"+
		"\u0189\u0005.\u0000\u0000\u0189\u018a\u0003\u0010\b\u0000\u018a\u018b"+
		"\u0003&\u0013\u0000\u018b\u018c\u0005\n\u0000\u0000\u018c\u018d\u0006"+
		"\u000e\uffff\uffff\u0000\u018d\u01cf\u0001\u0000\u0000\u0000\u018e\u018f"+
		"\u0005\r\u0000\u0000\u018f\u0190\u0005.\u0000\u0000\u0190\u0191\u0005"+
		"\u0015\u0000\u0000\u0191\u0192\u0005#\u0000\u0000\u0192\u0193\u0005\u000e"+
		"\u0000\u0000\u0193\u0194\u0005#\u0000\u0000\u0194\u0195\u0005\u000f\u0000"+
		"\u0000\u0195\u0196\u0003\u0010\b\u0000\u0196\u0197\u0003&\u0013\u0000"+
		"\u0197\u0198\u0003\u0012\t\u0000\u0198\u0199\u0005\n\u0000\u0000\u0199"+
		"\u01cf\u0001\u0000\u0000\u0000\u019a\u019b\u0005\r\u0000\u0000\u019b\u019c"+
		"\u0005.\u0000\u0000\u019c\u019d\u0005\u0015\u0000\u0000\u019d\u019e\u0005"+
		"#\u0000\u0000\u019e\u019f\u0005\u000e\u0000\u0000\u019f\u01a0\u0005.\u0000"+
		"\u0000\u01a0\u01a1\u0005\u000f\u0000\u0000\u01a1\u01a2\u0003\u0010\b\u0000"+
		"\u01a2\u01a3\u0003&\u0013\u0000\u01a3\u01a4\u0003\u0012\t\u0000\u01a4"+
		"\u01a5\u0005\n\u0000\u0000\u01a5\u01cf\u0001\u0000\u0000\u0000\u01a6\u01a7"+
		"\u0005\r\u0000\u0000\u01a7\u01a8\u0005.\u0000\u0000\u01a8\u01a9\u0005"+
		"\u0015\u0000\u0000\u01a9\u01aa\u0005.\u0000\u0000\u01aa\u01ab\u0005\u000e"+
		"\u0000\u0000\u01ab\u01ac\u0005.\u0000\u0000\u01ac\u01ad\u0005\u000f\u0000"+
		"\u0000\u01ad\u01ae\u0003\u0010\b\u0000\u01ae\u01af\u0003&\u0013\u0000"+
		"\u01af\u01b0\u0003\u0012\t\u0000\u01b0\u01b1\u0005\n\u0000\u0000\u01b1"+
		"\u01cf\u0001\u0000\u0000\u0000\u01b2\u01b3\u0005\r\u0000\u0000\u01b3\u01b4"+
		"\u0005.\u0000\u0000\u01b4\u01b5\u0005\u0015\u0000\u0000\u01b5\u01b6\u0005"+
		".\u0000\u0000\u01b6\u01b7\u0005\u000e\u0000\u0000\u01b7\u01b8\u0005.\u0000"+
		"\u0000\u01b8\u01b9\u0005\u0015\u0000\u0000\u01b9\u01ba\u0005#\u0000\u0000"+
		"\u01ba\u01bb\u0005\u000f\u0000\u0000\u01bb\u01bc\u0003\u0010\b\u0000\u01bc"+
		"\u01bd\u0003&\u0013\u0000\u01bd\u01be\u0003\u0012\t\u0000\u01be\u01bf"+
		"\u0005\n\u0000\u0000\u01bf\u01cf\u0001\u0000\u0000\u0000\u01c0\u01c1\u0005"+
		"\r\u0000\u0000\u01c1\u01c2\u0005.\u0000\u0000\u01c2\u01c3\u0005\u0015"+
		"\u0000\u0000\u01c3\u01c4\u0005.\u0000\u0000\u01c4\u01c5\u0005\u000e\u0000"+
		"\u0000\u01c5\u01c6\u0005.\u0000\u0000\u01c6\u01c7\u0005\u0015\u0000\u0000"+
		"\u01c7\u01c8\u0005.\u0000\u0000\u01c8\u01c9\u0005\u000f\u0000\u0000\u01c9"+
		"\u01ca\u0003\u0010\b\u0000\u01ca\u01cb\u0003&\u0013\u0000\u01cb\u01cc"+
		"\u0003\u0012\t\u0000\u01cc\u01cd\u0005\n\u0000\u0000\u01cd\u01cf\u0001"+
		"\u0000\u0000\u0000\u01ce\u0138\u0001\u0000\u0000\u0000\u01ce\u0142\u0001"+
		"\u0000\u0000\u0000\u01ce\u014c\u0001\u0000\u0000\u0000\u01ce\u0156\u0001"+
		"\u0000\u0000\u0000\u01ce\u0160\u0001\u0000\u0000\u0000\u01ce\u016a\u0001"+
		"\u0000\u0000\u0000\u01ce\u0174\u0001\u0000\u0000\u0000\u01ce\u017d\u0001"+
		"\u0000\u0000\u0000\u01ce\u0185\u0001\u0000\u0000\u0000\u01ce\u018e\u0001"+
		"\u0000\u0000\u0000\u01ce\u019a\u0001\u0000\u0000\u0000\u01ce\u01a6\u0001"+
		"\u0000\u0000\u0000\u01ce\u01b2\u0001\u0000\u0000\u0000\u01ce\u01c0\u0001"+
		"\u0000\u0000\u0000\u01cf\u001d\u0001\u0000\u0000\u0000\u01d0\u01d1\u0005"+
		".\u0000\u0000\u01d1\u01d2\u0005\f\u0000\u0000\u01d2\u01d7\u0003\f\u0006"+
		"\u0000\u01d3\u01d4\u0005-\u0000\u0000\u01d4\u01d6\u0003\u001e\u000f\u0000"+
		"\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d6\u01d9\u0001\u0000\u0000\u0000"+
		"\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000"+
		"\u01d8\u01ee\u0001\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000\u0000\u0000"+
		"\u01da\u01db\u0005.\u0000\u0000\u01db\u01dc\u0003\f\u0006\u0000\u01dc"+
		"\u01dd\u0006\u000f\uffff\uffff\u0000\u01dd\u01ee\u0001\u0000\u0000\u0000"+
		"\u01de\u01df\u0005.\u0000\u0000\u01df\u01e0\u0005\f\u0000\u0000\u01e0"+
		"\u01ee\u0006\u000f\uffff\uffff\u0000\u01e1\u01e2\u0005-\u0000\u0000\u01e2"+
		"\u01e3\u0005\f\u0000\u0000\u01e3\u01e4\u0003\f\u0006\u0000\u01e4\u01e5"+
		"\u0003\u001e\u000f\u0000\u01e5\u01e6\u0006\u000f\uffff\uffff\u0000\u01e6"+
		"\u01ee\u0001\u0000\u0000\u0000\u01e7\u01e8\u0005-\u0000\u0000\u01e8\u01e9"+
		"\u0005.\u0000\u0000\u01e9\u01ea\u0003\f\u0006\u0000\u01ea\u01eb\u0003"+
		"\u001e\u000f\u0000\u01eb\u01ec\u0006\u000f\uffff\uffff\u0000\u01ec\u01ee"+
		"\u0001\u0000\u0000\u0000\u01ed\u01d0\u0001\u0000\u0000\u0000\u01ed\u01da"+
		"\u0001\u0000\u0000\u0000\u01ed\u01de\u0001\u0000\u0000\u0000\u01ed\u01e1"+
		"\u0001\u0000\u0000\u0000\u01ed\u01e7\u0001\u0000\u0000\u0000\u01ee\u001f"+
		"\u0001\u0000\u0000\u0000\u01ef\u01f0\u0005\t\u0000\u0000\u01f0\u01f1\u0005"+
		".\u0000\u0000\u01f1\u01f2\u0005/\u0000\u0000\u01f2\u01f3\u0003\u001e\u000f"+
		"\u0000\u01f3\u01f4\u00050\u0000\u0000\u01f4\u01f5\u0005\f\u0000\u0000"+
		"\u01f5\u01f6\u0003\f\u0006\u0000\u01f6\u01f7\u0003\u0010\b\u0000\u01f7"+
		"\u01f8\u0003&\u0013\u0000\u01f8\u01f9\u0003\u0012\t\u0000\u01f9\u01fa"+
		"\u0005\n\u0000\u0000\u01fa\u0238\u0001\u0000\u0000\u0000\u01fb\u01fc\u0005"+
		"\t\u0000\u0000\u01fc\u01fd\u0005/\u0000\u0000\u01fd\u01fe\u0003\u001e"+
		"\u000f\u0000\u01fe\u01ff\u00050\u0000\u0000\u01ff\u0200\u0005\f\u0000"+
		"\u0000\u0200\u0201\u0003\f\u0006\u0000\u0201\u0202\u0003\u0010\b\u0000"+
		"\u0202\u0203\u0003&\u0013\u0000\u0203\u0204\u0003\u0012\t\u0000\u0204"+
		"\u0205\u0005\n\u0000\u0000\u0205\u0206\u0006\u0010\uffff\uffff\u0000\u0206"+
		"\u0238\u0001\u0000\u0000\u0000\u0207\u0208\u0005\t\u0000\u0000\u0208\u0209"+
		"\u0005.\u0000\u0000\u0209\u020a\u0003\u001e\u000f\u0000\u020a\u020b\u0005"+
		"0\u0000\u0000\u020b\u020c\u0005\f\u0000\u0000\u020c\u020d\u0003\f\u0006"+
		"\u0000\u020d\u020e\u0003\u0010\b\u0000\u020e\u020f\u0003&\u0013\u0000"+
		"\u020f\u0210\u0003\u0012\t\u0000\u0210\u0211\u0005\n\u0000\u0000\u0211"+
		"\u0212\u0006\u0010\uffff\uffff\u0000\u0212\u0238\u0001\u0000\u0000\u0000"+
		"\u0213\u0214\u0005\t\u0000\u0000\u0214\u0215\u0005.\u0000\u0000\u0215"+
		"\u0216\u0005/\u0000\u0000\u0216\u0217\u0003\u001e\u000f\u0000\u0217\u0218"+
		"\u0005\f\u0000\u0000\u0218\u0219\u0003\f\u0006\u0000\u0219\u021a\u0003"+
		"\u0010\b\u0000\u021a\u021b\u0003&\u0013\u0000\u021b\u021c\u0003\u0012"+
		"\t\u0000\u021c\u021d\u0005\n\u0000\u0000\u021d\u021e\u0006\u0010\uffff"+
		"\uffff\u0000\u021e\u0238\u0001\u0000\u0000\u0000\u021f\u0220\u0005\t\u0000"+
		"\u0000\u0220\u0221\u0005.\u0000\u0000\u0221\u0222\u0005/\u0000\u0000\u0222"+
		"\u0223\u0003\u001e\u000f\u0000\u0223\u0224\u00050\u0000\u0000\u0224\u0225"+
		"\u0003\f\u0006\u0000\u0225\u0226\u0003\u0010\b\u0000\u0226\u0227\u0003"+
		"&\u0013\u0000\u0227\u0228\u0003\u0012\t\u0000\u0228\u0229\u0005\n\u0000"+
		"\u0000\u0229\u022a\u0006\u0010\uffff\uffff\u0000\u022a\u0238\u0001\u0000"+
		"\u0000\u0000\u022b\u022c\u0005\t\u0000\u0000\u022c\u022d\u0005.\u0000"+
		"\u0000\u022d\u022e\u0005/\u0000\u0000\u022e\u022f\u0003\u001e\u000f\u0000"+
		"\u022f\u0230\u00050\u0000\u0000\u0230\u0231\u0005\f\u0000\u0000\u0231"+
		"\u0232\u0003\f\u0006\u0000\u0232\u0233\u0003\u0010\b\u0000\u0233\u0234"+
		"\u0003&\u0013\u0000\u0234\u0235\u0003\u0012\t\u0000\u0235\u0236\u0006"+
		"\u0010\uffff\uffff\u0000\u0236\u0238\u0001\u0000\u0000\u0000\u0237\u01ef"+
		"\u0001\u0000\u0000\u0000\u0237\u01fb\u0001\u0000\u0000\u0000\u0237\u0207"+
		"\u0001\u0000\u0000\u0000\u0237\u0213\u0001\u0000\u0000\u0000\u0237\u021f"+
		"\u0001\u0000\u0000\u0000\u0237\u022b\u0001\u0000\u0000\u0000\u0238!\u0001"+
		"\u0000\u0000\u0000\u0239\u023a\u0005 \u0000\u0000\u023a\u023b\u0005/\u0000"+
		"\u0000\u023b\u023c\u0003,\u0016\u0000\u023c\u023d\u00050\u0000\u0000\u023d"+
		"\u023e\u0005\u000f\u0000\u0000\u023e\u023f\u0003\u0010\b\u0000\u023f\u0240"+
		"\u0003&\u0013\u0000\u0240\u0241\u0003\u0012\t\u0000\u0241\u0242\u0005"+
		"\n\u0000\u0000\u0242\u0274\u0001\u0000\u0000\u0000\u0243\u0244\u0005 "+
		"\u0000\u0000\u0244\u0245\u0005.\u0000\u0000\u0245\u0246\u0003,\u0016\u0000"+
		"\u0246\u0247\u0005.\u0000\u0000\u0247\u0248\u00050\u0000\u0000\u0248\u0249"+
		"\u0005\u000f\u0000\u0000\u0249\u024a\u0003\u0010\b\u0000\u024a\u024b\u0003"+
		"&\u0013\u0000\u024b\u024c\u0003\u0012\t\u0000\u024c\u024d\u0005\n\u0000"+
		"\u0000\u024d\u024e\u0006\u0011\uffff\uffff\u0000\u024e\u0274\u0001\u0000"+
		"\u0000\u0000\u024f\u0250\u0005 \u0000\u0000\u0250\u0251\u0005/\u0000\u0000"+
		"\u0251\u0252\u0005.\u0000\u0000\u0252\u0253\u0003,\u0016\u0000\u0253\u0254"+
		"\u0005.\u0000\u0000\u0254\u0255\u0005\u000f\u0000\u0000\u0255\u0256\u0003"+
		"\u0010\b\u0000\u0256\u0257\u0003&\u0013\u0000\u0257\u0258\u0003\u0012"+
		"\t\u0000\u0258\u0259\u0005\n\u0000\u0000\u0259\u025a\u0006\u0011\uffff"+
		"\uffff\u0000\u025a\u0274\u0001\u0000\u0000\u0000\u025b\u025c\u0005 \u0000"+
		"\u0000\u025c\u025d\u0005/\u0000\u0000\u025d\u025e\u0005.\u0000\u0000\u025e"+
		"\u025f\u0003,\u0016\u0000\u025f\u0260\u0005.\u0000\u0000\u0260\u0261\u0005"+
		"0\u0000\u0000\u0261\u0262\u0003\u0010\b\u0000\u0262\u0263\u0003&\u0013"+
		"\u0000\u0263\u0264\u0003\u0012\t\u0000\u0264\u0265\u0005\n\u0000\u0000"+
		"\u0265\u0266\u0006\u0011\uffff\uffff\u0000\u0266\u0274\u0001\u0000\u0000"+
		"\u0000\u0267\u0268\u0005 \u0000\u0000\u0268\u0269\u0005/\u0000\u0000\u0269"+
		"\u026a\u0005.\u0000\u0000\u026a\u026b\u0003,\u0016\u0000\u026b\u026c\u0005"+
		".\u0000\u0000\u026c\u026d\u00050\u0000\u0000\u026d\u026e\u0005\u000f\u0000"+
		"\u0000\u026e\u026f\u0003\u0010\b\u0000\u026f\u0270\u0003&\u0013\u0000"+
		"\u0270\u0271\u0003\u0012\t\u0000\u0271\u0272\u0006\u0011\uffff\uffff\u0000"+
		"\u0272\u0274\u0001\u0000\u0000\u0000\u0273\u0239\u0001\u0000\u0000\u0000"+
		"\u0273\u0243\u0001\u0000\u0000\u0000\u0273\u024f\u0001\u0000\u0000\u0000"+
		"\u0273\u025b\u0001\u0000\u0000\u0000\u0273\u0267\u0001\u0000\u0000\u0000"+
		"\u0274#\u0001\u0000\u0000\u0000\u0275\u0276\u0005!\u0000\u0000\u0276\u0277"+
		"\u0003&\u0013\u0000\u0277\u0278\u0005\"\u0000\u0000\u0278\u0279\u0005"+
		"#\u0000\u0000\u0279\u027a\u0003,\u0016\u0000\u027a\u027b\u0005#\u0000"+
		"\u0000\u027b\u027c\u0005\n\u0000\u0000\u027c\u02af\u0001\u0000\u0000\u0000"+
		"\u027d\u027e\u0005!\u0000\u0000\u027e\u027f\u0003&\u0013\u0000\u027f\u0280"+
		"\u0005\"\u0000\u0000\u0280\u0281\u0005.\u0000\u0000\u0281\u0282\u0003"+
		",\u0016\u0000\u0282\u0283\u0005.\u0000\u0000\u0283\u0284\u0005\n\u0000"+
		"\u0000\u0284\u02af\u0001\u0000\u0000\u0000\u0285\u0286\u0005!\u0000\u0000"+
		"\u0286\u0287\u0003&\u0013\u0000\u0287\u0288\u0005\"\u0000\u0000\u0288"+
		"\u0289\u0005.\u0000\u0000\u0289\u028a\u0003,\u0016\u0000\u028a\u028b\u0005"+
		".\u0000\u0000\u028b\u028c\u0005\n\u0000\u0000\u028c\u028d\u0006\u0012"+
		"\uffff\uffff\u0000\u028d\u02af\u0001\u0000\u0000\u0000\u028e\u028f\u0005"+
		"!\u0000\u0000\u028f\u0290\u0003&\u0013\u0000\u0290\u0291\u0005.\u0000"+
		"\u0000\u0291\u0292\u0003,\u0016\u0000\u0292\u0293\u0005.\u0000\u0000\u0293"+
		"\u0294\u0005\n\u0000\u0000\u0294\u0295\u0006\u0012\uffff\uffff\u0000\u0295"+
		"\u02af\u0001\u0000\u0000\u0000\u0296\u0297\u0005!\u0000\u0000\u0297\u0298"+
		"\u0003&\u0013\u0000\u0298\u0299\u0005\"\u0000\u0000\u0299\u029a\u0003"+
		",\u0016\u0000\u029a\u029b\u0005.\u0000\u0000\u029b\u029c\u0005\n\u0000"+
		"\u0000\u029c\u029d\u0006\u0012\uffff\uffff\u0000\u029d\u02af\u0001\u0000"+
		"\u0000\u0000\u029e\u029f\u0005!\u0000\u0000\u029f\u02a0\u0003&\u0013\u0000"+
		"\u02a0\u02a1\u0005\"\u0000\u0000\u02a1\u02a2\u0005.\u0000\u0000\u02a2"+
		"\u02a3\u0003,\u0016\u0000\u02a3\u02a4\u0005\n\u0000\u0000\u02a4\u02a5"+
		"\u0006\u0012\uffff\uffff\u0000\u02a5\u02af\u0001\u0000\u0000\u0000\u02a6"+
		"\u02a7\u0005!\u0000\u0000\u02a7\u02a8\u0003&\u0013\u0000\u02a8\u02a9\u0005"+
		"\"\u0000\u0000\u02a9\u02aa\u0005.\u0000\u0000\u02aa\u02ab\u0003,\u0016"+
		"\u0000\u02ab\u02ac\u0005.\u0000\u0000\u02ac\u02ad\u0006\u0012\uffff\uffff"+
		"\u0000\u02ad\u02af\u0001\u0000\u0000\u0000\u02ae\u0275\u0001\u0000\u0000"+
		"\u0000\u02ae\u027d\u0001\u0000\u0000\u0000\u02ae\u0285\u0001\u0000\u0000"+
		"\u0000\u02ae\u028e\u0001\u0000\u0000\u0000\u02ae\u0296\u0001\u0000\u0000"+
		"\u0000\u02ae\u029e\u0001\u0000\u0000\u0000\u02ae\u02a6\u0001\u0000\u0000"+
		"\u0000\u02af%\u0001\u0000\u0000\u0000\u02b0\u02b1\u0003\b\u0004\u0000"+
		"\u02b1\u02b2\u0003&\u0013\u0000\u02b2\u02ff\u0001\u0000\u0000\u0000\u02b3"+
		"\u02b5\u0003\b\u0004\u0000\u02b4\u02b3\u0001\u0000\u0000\u0000\u02b5\u02b8"+
		"\u0001\u0000\u0000\u0000\u02b6\u02b4\u0001\u0000\u0000\u0000\u02b6\u02b7"+
		"\u0001\u0000\u0000\u0000\u02b7\u02ff\u0001\u0000\u0000\u0000\u02b8\u02b6"+
		"\u0001\u0000\u0000\u0000\u02b9\u02bb\u0003\u001c\u000e\u0000\u02ba\u02b9"+
		"\u0001\u0000\u0000\u0000\u02bb\u02be\u0001\u0000\u0000\u0000\u02bc\u02ba"+
		"\u0001\u0000\u0000\u0000\u02bc\u02bd\u0001\u0000\u0000\u0000\u02bd\u02ff"+
		"\u0001\u0000\u0000\u0000\u02be\u02bc\u0001\u0000\u0000\u0000\u02bf\u02c1"+
		"\u0003\u0014\n\u0000\u02c0\u02bf\u0001\u0000\u0000\u0000\u02c1\u02c4\u0001"+
		"\u0000\u0000\u0000\u02c2\u02c0\u0001\u0000\u0000\u0000\u02c2\u02c3\u0001"+
		"\u0000\u0000\u0000\u02c3\u02ff\u0001\u0000\u0000\u0000\u02c4\u02c2\u0001"+
		"\u0000\u0000\u0000\u02c5\u02c6\u0003\u0014\n\u0000\u02c6\u02c7\u0003&"+
		"\u0013\u0000\u02c7\u02ff\u0001\u0000\u0000\u0000\u02c8\u02c9\u0003\u0016"+
		"\u000b\u0000\u02c9\u02ca\u0003&\u0013\u0000\u02ca\u02ff\u0001\u0000\u0000"+
		"\u0000\u02cb\u02cd\u0003\u0016\u000b\u0000\u02cc\u02cb\u0001\u0000\u0000"+
		"\u0000\u02cd\u02d0\u0001\u0000\u0000\u0000\u02ce\u02cc\u0001\u0000\u0000"+
		"\u0000\u02ce\u02cf\u0001\u0000\u0000\u0000\u02cf\u02ff\u0001\u0000\u0000"+
		"\u0000\u02d0\u02ce\u0001\u0000\u0000\u0000\u02d1\u02d3\u0003\u000e\u0007"+
		"\u0000\u02d2\u02d1\u0001\u0000\u0000\u0000\u02d3\u02d6\u0001\u0000\u0000"+
		"\u0000\u02d4\u02d2\u0001\u0000\u0000\u0000\u02d4\u02d5\u0001\u0000\u0000"+
		"\u0000\u02d5\u02ff\u0001\u0000\u0000\u0000\u02d6\u02d4\u0001\u0000\u0000"+
		"\u0000\u02d7\u02d8\u0003\u000e\u0007\u0000\u02d8\u02d9\u0003&\u0013\u0000"+
		"\u02d9\u02ff\u0001\u0000\u0000\u0000\u02da\u02db\u0003(\u0014\u0000\u02db"+
		"\u02dc\u0003&\u0013\u0000\u02dc\u02ff\u0001\u0000\u0000\u0000\u02dd\u02df"+
		"\u0003(\u0014\u0000\u02de\u02dd\u0001\u0000\u0000\u0000\u02df\u02e2\u0001"+
		"\u0000\u0000\u0000\u02e0\u02de\u0001\u0000\u0000\u0000\u02e0\u02e1\u0001"+
		"\u0000\u0000\u0000\u02e1\u02ff\u0001\u0000\u0000\u0000\u02e2\u02e0\u0001"+
		"\u0000\u0000\u0000\u02e3\u02e4\u0003\u001c\u000e\u0000\u02e4\u02e5\u0003"+
		"&\u0013\u0000\u02e5\u02ff\u0001\u0000\u0000\u0000\u02e6\u02e8\u0003\u001c"+
		"\u000e\u0000\u02e7\u02e6\u0001\u0000\u0000\u0000\u02e8\u02eb\u0001\u0000"+
		"\u0000\u0000\u02e9\u02e7\u0001\u0000\u0000\u0000\u02e9\u02ea\u0001\u0000"+
		"\u0000\u0000\u02ea\u02ff\u0001\u0000\u0000\u0000\u02eb\u02e9\u0001\u0000"+
		"\u0000\u0000\u02ec\u02ed\u0003\"\u0011\u0000\u02ed\u02ee\u0003&\u0013"+
		"\u0000\u02ee\u02ff\u0001\u0000\u0000\u0000\u02ef\u02f1\u0003\"\u0011\u0000"+
		"\u02f0\u02ef\u0001\u0000\u0000\u0000\u02f1\u02f4\u0001\u0000\u0000\u0000"+
		"\u02f2\u02f0\u0001\u0000\u0000\u0000\u02f2\u02f3\u0001\u0000\u0000\u0000"+
		"\u02f3\u02ff\u0001\u0000\u0000\u0000\u02f4\u02f2\u0001\u0000\u0000\u0000"+
		"\u02f5\u02f6\u0003$\u0012\u0000\u02f6\u02f7\u0003&\u0013\u0000\u02f7\u02ff"+
		"\u0001\u0000\u0000\u0000\u02f8\u02fa\u0003$\u0012\u0000\u02f9\u02f8\u0001"+
		"\u0000\u0000\u0000\u02fa\u02fd\u0001\u0000\u0000\u0000\u02fb\u02f9\u0001"+
		"\u0000\u0000\u0000\u02fb\u02fc\u0001\u0000\u0000\u0000\u02fc\u02ff\u0001"+
		"\u0000\u0000\u0000\u02fd\u02fb\u0001\u0000\u0000\u0000\u02fe\u02b0\u0001"+
		"\u0000\u0000\u0000\u02fe\u02b6\u0001\u0000\u0000\u0000\u02fe\u02bc\u0001"+
		"\u0000\u0000\u0000\u02fe\u02c2\u0001\u0000\u0000\u0000\u02fe\u02c5\u0001"+
		"\u0000\u0000\u0000\u02fe\u02c8\u0001\u0000\u0000\u0000\u02fe\u02ce\u0001"+
		"\u0000\u0000\u0000\u02fe\u02d4\u0001\u0000\u0000\u0000\u02fe\u02d7\u0001"+
		"\u0000\u0000\u0000\u02fe\u02da\u0001\u0000\u0000\u0000\u02fe\u02e0\u0001"+
		"\u0000\u0000\u0000\u02fe\u02e3\u0001\u0000\u0000\u0000\u02fe\u02e9\u0001"+
		"\u0000\u0000\u0000\u02fe\u02ec\u0001\u0000\u0000\u0000\u02fe\u02f2\u0001"+
		"\u0000\u0000\u0000\u02fe\u02f5\u0001\u0000\u0000\u0000\u02fe\u02fb\u0001"+
		"\u0000\u0000\u0000\u02ff\'\u0001\u0000\u0000\u0000\u0300\u0301\u0005\u0010"+
		"\u0000\u0000\u0301\u0302\u0005/\u0000\u0000\u0302\u0303\u0003,\u0016\u0000"+
		"\u0303\u0304\u00050\u0000\u0000\u0304\u030d\u0003&\u0013\u0000\u0305\u0306"+
		"\u0005\u0011\u0000\u0000\u0306\u0307\u0005/\u0000\u0000\u0307\u0308\u0003"+
		",\u0016\u0000\u0308\u0309\u00050\u0000\u0000\u0309\u030a\u0003&\u0013"+
		"\u0000\u030a\u030c\u0001\u0000\u0000\u0000\u030b\u0305\u0001\u0000\u0000"+
		"\u0000\u030c\u030f\u0001\u0000\u0000\u0000\u030d\u030b\u0001\u0000\u0000"+
		"\u0000\u030d\u030e\u0001\u0000\u0000\u0000\u030e\u0312\u0001\u0000\u0000"+
		"\u0000\u030f\u030d\u0001\u0000\u0000\u0000\u0310\u0311\u0005\u0012\u0000"+
		"\u0000\u0311\u0313\u0003&\u0013\u0000\u0312\u0310\u0001\u0000\u0000\u0000"+
		"\u0312\u0313\u0001\u0000\u0000\u0000\u0313)\u0001\u0000\u0000\u0000\u0314"+
		"\u0315\u0003\n\u0005\u0000\u0315\u0316\u0007\u0001\u0000\u0000\u0316\u0317"+
		"\u0003\n\u0005\u0000\u0317+\u0001\u0000\u0000\u0000\u0318\u0319\u0006"+
		"\u0016\uffff\uffff\u0000\u0319\u031a\u0003.\u0017\u0000\u031a\u0320\u0001"+
		"\u0000\u0000\u0000\u031b\u031c\n\u0001\u0000\u0000\u031c\u031d\u0005\u001e"+
		"\u0000\u0000\u031d\u031f\u0003.\u0017\u0000\u031e\u031b\u0001\u0000\u0000"+
		"\u0000\u031f\u0322\u0001\u0000\u0000\u0000\u0320\u031e\u0001\u0000\u0000"+
		"\u0000\u0320\u0321\u0001\u0000\u0000\u0000\u0321-\u0001\u0000\u0000\u0000"+
		"\u0322\u0320\u0001\u0000\u0000\u0000\u0323\u0324\u0006\u0017\uffff\uffff"+
		"\u0000\u0324\u0325\u00030\u0018\u0000\u0325\u032b\u0001\u0000\u0000\u0000"+
		"\u0326\u0327\n\u0001\u0000\u0000\u0327\u0328\u0005\u001d\u0000\u0000\u0328"+
		"\u032a\u00030\u0018\u0000\u0329\u0326\u0001\u0000\u0000\u0000\u032a\u032d"+
		"\u0001\u0000\u0000\u0000\u032b\u0329\u0001\u0000\u0000\u0000\u032b\u032c"+
		"\u0001\u0000\u0000\u0000\u032c/\u0001\u0000\u0000\u0000\u032d\u032b\u0001"+
		"\u0000\u0000\u0000\u032e\u0337\u00032\u0019\u0000\u032f\u0330\u0005/\u0000"+
		"\u0000\u0330\u0331\u0003,\u0016\u0000\u0331\u0332\u00050\u0000\u0000\u0332"+
		"\u0337\u0001\u0000\u0000\u0000\u0333\u0334\u0005\u001c\u0000\u0000\u0334"+
		"\u0337\u00030\u0018\u0000\u0335\u0337\u0003*\u0015\u0000\u0336\u032e\u0001"+
		"\u0000\u0000\u0000\u0336\u032f\u0001\u0000\u0000\u0000\u0336\u0333\u0001"+
		"\u0000\u0000\u0000\u0336\u0335\u0001\u0000\u0000\u0000\u03371\u0001\u0000"+
		"\u0000\u0000\u0338\u0339\u0007\u0002\u0000\u0000\u03393\u0001\u0000\u0000"+
		"\u0000\u033a\u033b\u0001\u0000\u0000\u0000\u033b5\u0001\u0000\u0000\u0000"+
		"$=HMTWoz\u0083\u009f\u00b0\u00be\u00c0\u00c9\u00fc\u0136\u01ce\u01d7\u01ed"+
		"\u0237\u0273\u02ae\u02b6\u02bc\u02c2\u02ce\u02d4\u02e0\u02e9\u02f2\u02fb"+
		"\u02fe\u030d\u0312\u0320\u032b\u0336";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}