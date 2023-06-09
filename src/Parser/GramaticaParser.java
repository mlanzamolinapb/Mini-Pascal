// Generated from C:/Users/Gabriel Alvarado/Desktop/Mini-Pascal/src\Gramatica.g4 by ANTLR 4.12.0
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
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
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
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(T__2);
				setState(84);
				match(ID);
				setState(85);
				match(PUNTOS);
				setState(86);
				type();
				setState(87);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(ID);
				setState(90);
				match(PUNTOS);
				setState(91);
				match(STRING);
				setState(92);
				match(LLAVE_ABR);
				setState(93);
				match(INTEGER);
				setState(94);
				match(LLAVE_CIERRA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				match(T__2);
				setState(96);
				match(ID);
				setState(97);
				match(PUNTOS);
				setState(98);
				type();
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMILLA) {
					{
					{
					setState(99);
					match(COMILLA);
					setState(100);
					match(ID);
					setState(101);
					match(PUNTOS);
					setState(102);
					type();
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(108);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				match(T__2);
				setState(111);
				match(ID);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMILLA) {
					{
					{
					setState(112);
					match(COMILLA);
					setState(113);
					match(ID);
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				match(PUNTOS);
				setState(120);
				type();
				setState(121);
				match(SEMICOLON);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(122);
					decl();
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				match(ID);
				setState(129);
				match(PUNTOS);
				setState(130);
				type();
				setState(131);
				match(SEMICOLON);
				notifyErrorListeners("Falta palabra Var");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(134);
				match(T__2);
				setState(135);
				match(ID);
				setState(136);
				match(PUNTOS);
				setState(137);
				type();
				setState(138);
				match(SEMICOLON);
				setState(139);
				match(SEMICOLON);
				notifyErrorListeners("Error de Comillas");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(142);
				match(T__2);
				setState(143);
				match(ID);
				setState(144);
				match(PUNTOS);
				setState(145);
				match(SEMICOLON);
				notifyErrorListeners("Especifique el tipo");
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(147);
				match(T__2);
				setState(148);
				match(ID);
				setState(149);
				type();
				setState(150);
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
			setState(155);
			match(ID);
			setState(156);
			match(ASIGNACION);
			setState(157);
			expression(0);
			setState(158);
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
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(161);
				bool_literal();
				}
				break;
			case 3:
				{
				setState(162);
				match(INTEGER);
				}
				break;
			case 4:
				{
				setState(163);
				match(ID);
				}
				break;
			case 5:
				{
				setState(164);
				match(STRING);
				}
				break;
			case 6:
				{
				setState(165);
				match(CHAR);
				}
				break;
			case 7:
				{
				setState(166);
				match(PAR_ABRE);
				setState(167);
				expression(0);
				setState(168);
				match(PAR_CIERRA);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(184);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(172);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(173);
						match(PLUS);
						setState(174);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(175);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(176);
						match(MINUS);
						setState(177);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(178);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(179);
						match(TIMES);
						setState(180);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(181);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(182);
						match(DIV);
						setState(183);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				setState(189);
				match(INTEGER);
				}
				break;
			case STRING:
				{
				setState(190);
				match(STRING);
				}
				break;
			case TRUE:
			case FALSE:
				{
				setState(191);
				bool_literal();
				}
				break;
			case CHAR:
				{
				setState(192);
				match(CHAR);
				}
				break;
			case NUM:
				{
				setState(193);
				match(NUM);
				}
				break;
			case TYPESTRING:
				{
				setState(194);
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
			setState(197);
			match(ARRAY);
			setState(198);
			match(ID);
			setState(199);
			match(LLAVE_ABR);
			setState(200);
			match(INTEGER);
			setState(201);
			match(LLAVE_CIERRA);
			setState(202);
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
			setState(204);
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
			setState(206);
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
			setState(208);
			match(T__5);
			setState(209);
			match(PAR_ABRE);
			setState(210);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(211);
			match(PAR_CIERRA);
			setState(212);
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
			setState(214);
			match(T__6);
			setState(215);
			match(PAR_ABRE);
			setState(216);
			match(ID);
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
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(ID);
				setState(221);
				match(ASIGNACION);
				setState(222);
				match(INTEGER);
				setState(223);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(ID);
				setState(225);
				match(ASIGNACION);
				setState(226);
				match(ID);
				setState(227);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				match(ID);
				setState(229);
				match(ASIGNACION);
				setState(230);
				match(INTEGER);
				setState(231);
				match(SEMICOLON);
				setState(232);
				match(SEMICOLON);
				notifyErrorListeners("Error de Comillas");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				match(ID);
				setState(235);
				match(ASIGNACION);
				setState(236);
				match(INTEGER);
				notifyErrorListeners("Error de Comillas");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(238);
				match(ID);
				setState(239);
				match(INTEGER);
				setState(240);
				match(SEMICOLON);
				notifyErrorListeners("Falta Token Asignacion");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(242);
				match(ID);
				setState(243);
				match(ASIGNACION);
				setState(244);
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
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(PROCEDURE);
				setState(249);
				match(ID);
				setState(250);
				match(PAR_ABRE);
				setState(251);
				parametros();
				setState(252);
				match(PAR_CIERRA);
				setState(253);
				begin();
				setState(254);
				statement();
				setState(255);
				end();
				setState(256);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(PROCEDURE);
				setState(259);
				match(ID);
				setState(260);
				match(SEMICOLON);
				setState(261);
				begin();
				setState(262);
				statement();
				setState(263);
				end();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				match(PROCEDURE);
				setState(266);
				match(PAR_ABRE);
				setState(267);
				parametros();
				setState(268);
				match(PAR_CIERRA);
				setState(269);
				begin();
				setState(270);
				statement();
				setState(271);
				end();
				notifyErrorListeners("Falto ID");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				match(PROCEDURE);
				setState(275);
				match(SEMICOLON);
				setState(276);
				begin();
				setState(277);
				statement();
				setState(278);
				end();
				notifyErrorListeners("Falto ID");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(281);
				match(PROCEDURE);
				setState(282);
				match(ID);
				setState(283);
				parametros();
				notifyErrorListeners("Falto comillas");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(286);
				match(PROCEDURE);
				setState(287);
				match(ID);
				setState(288);
				parametros();
				setState(289);
				match(PAR_CIERRA);
				setState(290);
				begin();
				setState(291);
				statement();
				setState(292);
				end();
				notifyErrorListeners("Falto Parentesis");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(295);
				match(PROCEDURE);
				setState(296);
				match(ID);
				setState(297);
				match(PAR_ABRE);
				setState(298);
				parametros();
				setState(299);
				begin();
				setState(300);
				statement();
				setState(301);
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
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				match(FOR);
				setState(307);
				match(INTEGER);
				setState(308);
				match(TO);
				setState(309);
				match(INTEGER);
				setState(310);
				match(DO);
				setState(311);
				begin();
				setState(312);
				statement();
				setState(313);
				end();
				setState(314);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				match(FOR);
				setState(317);
				match(ID);
				setState(318);
				match(TO);
				setState(319);
				match(ID);
				setState(320);
				match(DO);
				setState(321);
				begin();
				setState(322);
				statement();
				setState(323);
				end();
				setState(324);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
				match(FOR);
				setState(327);
				match(TO);
				setState(328);
				match(ID);
				setState(329);
				match(DO);
				setState(330);
				begin();
				setState(331);
				statement();
				setState(332);
				end();
				setState(333);
				match(SEMICOLON);
				notifyErrorListeners("Falto valor");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(336);
				match(FOR);
				setState(337);
				match(ID);
				setState(338);
				match(TO);
				setState(339);
				match(DO);
				setState(340);
				begin();
				setState(341);
				statement();
				setState(342);
				end();
				setState(343);
				match(SEMICOLON);
				notifyErrorListeners("Falto valor");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(346);
				match(FOR);
				setState(347);
				match(ID);
				setState(348);
				match(ID);
				setState(349);
				match(DO);
				setState(350);
				begin();
				setState(351);
				statement();
				setState(352);
				end();
				setState(353);
				match(SEMICOLON);
				notifyErrorListeners("Falto palabra reservada");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(356);
				match(FOR);
				setState(357);
				match(ID);
				setState(358);
				match(TO);
				setState(359);
				match(ID);
				setState(360);
				begin();
				setState(361);
				statement();
				setState(362);
				end();
				setState(363);
				match(SEMICOLON);
				notifyErrorListeners("Falto palabra reservada");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(366);
				match(FOR);
				setState(367);
				match(ID);
				setState(368);
				match(TO);
				setState(369);
				match(ID);
				setState(370);
				statement();
				setState(371);
				end();
				setState(372);
				match(SEMICOLON);
				notifyErrorListeners("Falto Begin");
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(375);
				match(FOR);
				setState(376);
				match(ID);
				setState(377);
				match(TO);
				setState(378);
				match(ID);
				setState(379);
				statement();
				setState(380);
				end();
				notifyErrorListeners("Falto Semicolon");
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(383);
				match(FOR);
				setState(384);
				match(ID);
				setState(385);
				match(TO);
				setState(386);
				match(ID);
				setState(387);
				begin();
				setState(388);
				statement();
				setState(389);
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
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				match(ID);
				setState(395);
				match(PUNTOS);
				setState(396);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				match(COMILLA);
				setState(398);
				match(ID);
				setState(399);
				match(PUNTOS);
				setState(400);
				type();
				setState(401);
				parametros();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(403);
				match(ID);
				setState(404);
				type();
				notifyErrorListeners("Falto :");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(407);
				match(ID);
				setState(408);
				match(PUNTOS);
				notifyErrorListeners("Falta Tipo");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(410);
				match(COMILLA);
				setState(411);
				match(PUNTOS);
				setState(412);
				type();
				setState(413);
				parametros();
				notifyErrorListeners("Falta identificador");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(416);
				match(COMILLA);
				setState(417);
				match(ID);
				setState(418);
				type();
				setState(419);
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
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				match(FUNCTION);
				setState(425);
				match(ID);
				setState(426);
				match(PAR_ABRE);
				setState(427);
				parametros();
				setState(428);
				match(PAR_CIERRA);
				setState(429);
				match(PUNTOS);
				setState(430);
				type();
				setState(431);
				begin();
				setState(432);
				statement();
				setState(433);
				end();
				setState(434);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				match(FUNCTION);
				setState(437);
				match(PAR_ABRE);
				setState(438);
				parametros();
				setState(439);
				match(PAR_CIERRA);
				setState(440);
				match(PUNTOS);
				setState(441);
				type();
				setState(442);
				begin();
				setState(443);
				statement();
				setState(444);
				end();
				setState(445);
				match(SEMICOLON);
				notifyErrorListeners("Falta Identificador");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(448);
				match(FUNCTION);
				setState(449);
				match(ID);
				setState(450);
				parametros();
				setState(451);
				match(PAR_CIERRA);
				setState(452);
				match(PUNTOS);
				setState(453);
				type();
				setState(454);
				begin();
				setState(455);
				statement();
				setState(456);
				end();
				setState(457);
				match(SEMICOLON);
				notifyErrorListeners("Falta Parentesis");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(460);
				match(FUNCTION);
				setState(461);
				match(ID);
				setState(462);
				match(PAR_ABRE);
				setState(463);
				parametros();
				setState(464);
				match(PUNTOS);
				setState(465);
				type();
				setState(466);
				begin();
				setState(467);
				statement();
				setState(468);
				end();
				setState(469);
				match(SEMICOLON);
				notifyErrorListeners("Falta Parentesis");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(472);
				match(FUNCTION);
				setState(473);
				match(ID);
				setState(474);
				match(PAR_ABRE);
				setState(475);
				parametros();
				setState(476);
				match(PAR_CIERRA);
				setState(477);
				type();
				setState(478);
				begin();
				setState(479);
				statement();
				setState(480);
				end();
				setState(481);
				match(SEMICOLON);
				notifyErrorListeners("Falta Puntos");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(484);
				match(FUNCTION);
				setState(485);
				match(ID);
				setState(486);
				match(PAR_ABRE);
				setState(487);
				parametros();
				setState(488);
				match(PAR_CIERRA);
				setState(489);
				match(PUNTOS);
				setState(490);
				type();
				setState(491);
				begin();
				setState(492);
				statement();
				setState(493);
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
			setState(607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(498);
				match(WHILE);
				setState(499);
				match(PAR_ABRE);
				setState(500);
				match(INTEGER);
				setState(501);
				bool_expr(0);
				setState(502);
				match(INTEGER);
				setState(503);
				match(PAR_CIERRA);
				setState(504);
				match(DO);
				setState(505);
				begin();
				setState(506);
				statement();
				setState(507);
				end();
				setState(508);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(510);
				match(WHILE);
				setState(511);
				match(PAR_ABRE);
				setState(512);
				match(ID);
				setState(513);
				bool_expr(0);
				setState(514);
				match(ID);
				setState(515);
				match(PAR_CIERRA);
				setState(516);
				match(DO);
				setState(517);
				begin();
				setState(518);
				statement();
				setState(519);
				end();
				setState(520);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(522);
				match(WHILE);
				setState(523);
				match(PAR_ABRE);
				setState(524);
				bool_expr(0);
				setState(525);
				match(ID);
				setState(526);
				match(PAR_CIERRA);
				setState(527);
				match(DO);
				setState(528);
				begin();
				setState(529);
				statement();
				setState(530);
				end();
				setState(531);
				match(SEMICOLON);
				notifyErrorListeners("Falta Identificador");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(534);
				match(WHILE);
				setState(535);
				match(PAR_ABRE);
				setState(536);
				match(ID);
				setState(537);
				bool_expr(0);
				setState(538);
				match(PAR_CIERRA);
				setState(539);
				match(DO);
				setState(540);
				begin();
				setState(541);
				statement();
				setState(542);
				end();
				setState(543);
				match(SEMICOLON);
				notifyErrorListeners("Falta Identificador");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(546);
				match(WHILE);
				setState(547);
				match(PAR_ABRE);
				setState(548);
				match(ID);
				setState(549);
				bool_expr(0);
				setState(550);
				match(ID);
				setState(551);
				match(PAR_CIERRA);
				setState(552);
				match(DO);
				setState(553);
				begin();
				setState(554);
				statement();
				setState(555);
				end();
				setState(556);
				match(SEMICOLON);
				notifyErrorListeners("Falta Identificador");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(559);
				match(WHILE);
				setState(560);
				match(ID);
				setState(561);
				bool_expr(0);
				setState(562);
				match(ID);
				setState(563);
				match(PAR_CIERRA);
				setState(564);
				match(DO);
				setState(565);
				begin();
				setState(566);
				statement();
				setState(567);
				end();
				setState(568);
				match(SEMICOLON);
				notifyErrorListeners("Falta Parentesis");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(571);
				match(WHILE);
				setState(572);
				match(PAR_ABRE);
				setState(573);
				match(ID);
				setState(574);
				bool_expr(0);
				setState(575);
				match(ID);
				setState(576);
				match(DO);
				setState(577);
				begin();
				setState(578);
				statement();
				setState(579);
				end();
				setState(580);
				match(SEMICOLON);
				notifyErrorListeners("Falta Parentesis");
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(583);
				match(WHILE);
				setState(584);
				match(PAR_ABRE);
				setState(585);
				match(ID);
				setState(586);
				bool_expr(0);
				setState(587);
				match(ID);
				setState(588);
				match(PAR_CIERRA);
				setState(589);
				begin();
				setState(590);
				statement();
				setState(591);
				end();
				setState(592);
				match(SEMICOLON);
				notifyErrorListeners("Falta Enunciado DO");
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(595);
				match(WHILE);
				setState(596);
				match(PAR_ABRE);
				setState(597);
				match(ID);
				setState(598);
				bool_expr(0);
				setState(599);
				match(ID);
				setState(600);
				match(PAR_CIERRA);
				setState(601);
				match(DO);
				setState(602);
				begin();
				setState(603);
				statement();
				setState(604);
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
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(609);
				match(REPEAT);
				setState(610);
				statement();
				setState(611);
				match(UNTIL);
				setState(612);
				match(INTEGER);
				setState(613);
				bool_expr(0);
				setState(614);
				match(INTEGER);
				setState(615);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(617);
				match(REPEAT);
				setState(618);
				statement();
				setState(619);
				match(UNTIL);
				setState(620);
				match(ID);
				setState(621);
				bool_expr(0);
				setState(622);
				match(ID);
				setState(623);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(625);
				match(REPEAT);
				setState(626);
				statement();
				setState(627);
				match(UNTIL);
				setState(628);
				match(ID);
				setState(629);
				bool_expr(0);
				setState(630);
				match(ID);
				setState(631);
				match(SEMICOLON);
				notifyErrorListeners("Falta Semicolon");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(634);
				match(REPEAT);
				setState(635);
				statement();
				setState(636);
				match(ID);
				setState(637);
				bool_expr(0);
				setState(638);
				match(ID);
				setState(639);
				match(SEMICOLON);
				notifyErrorListeners("Falta Unitl");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(642);
				match(REPEAT);
				setState(643);
				statement();
				setState(644);
				match(UNTIL);
				setState(645);
				bool_expr(0);
				setState(646);
				match(ID);
				setState(647);
				match(SEMICOLON);
				notifyErrorListeners("Falta Identificador");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(650);
				match(REPEAT);
				setState(651);
				statement();
				setState(652);
				match(UNTIL);
				setState(653);
				match(ID);
				setState(654);
				bool_expr(0);
				setState(655);
				match(SEMICOLON);
				notifyErrorListeners("Falta Identificador");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(658);
				match(REPEAT);
				setState(659);
				statement();
				setState(660);
				match(UNTIL);
				setState(661);
				match(ID);
				setState(662);
				bool_expr(0);
				setState(663);
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
			setState(746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(668);
				assign_statement();
				setState(669);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(671);
						assign_statement();
						}
						} 
					}
					setState(676);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(680);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(677);
						for_();
						}
						} 
					}
					setState(682);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(686);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(683);
						writeln_statement();
						}
						} 
					}
					setState(688);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(689);
				writeln_statement();
				setState(690);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(692);
				readln_statement();
				setState(693);
				statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(698);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(695);
						readln_statement();
						}
						} 
					}
					setState(700);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(704);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(701);
						array_declaration();
						}
						} 
					}
					setState(706);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(707);
				array_declaration();
				setState(708);
				statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(710);
				if_stmt();
				setState(711);
				statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(716);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(713);
						if_stmt();
						}
						} 
					}
					setState(718);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(719);
				for_();
				setState(720);
				statement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(725);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(722);
						for_();
						}
						} 
					}
					setState(727);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(728);
				while_();
				setState(729);
				statement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(734);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(731);
						while_();
						}
						} 
					}
					setState(736);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(737);
				repeat();
				setState(738);
				statement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(743);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(740);
						repeat();
						}
						} 
					}
					setState(745);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
			setState(748);
			match(IF);
			setState(749);
			match(PAR_ABRE);
			setState(750);
			bool_expr(0);
			setState(751);
			match(PAR_CIERRA);
			setState(752);
			statement();
			setState(761);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(753);
					match(ELSEIF);
					setState(754);
					match(PAR_ABRE);
					setState(755);
					bool_expr(0);
					setState(756);
					match(PAR_CIERRA);
					setState(757);
					statement();
					}
					} 
				}
				setState(763);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(766);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(764);
				match(ELSE);
				setState(765);
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
			setState(768);
			expression(0);
			setState(769);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 264241152L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(770);
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
			setState(773);
			bool_term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(780);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
					setState(775);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(776);
					match(OR);
					setState(777);
					bool_term(0);
					}
					} 
				}
				setState(782);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
			setState(784);
			bool_factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(791);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_termContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_term);
					setState(786);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(787);
					match(AND);
					setState(788);
					bool_factor();
					}
					} 
				}
				setState(793);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
			setState(802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(794);
				bool_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(795);
				match(PAR_ABRE);
				setState(796);
				bool_expr(0);
				setState(797);
				match(PAR_CIERRA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(799);
				match(NOT);
				setState(800);
				bool_factor();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(801);
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
			setState(804);
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
		"\u0004\u00014\u0329\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0005\u0002L\b\u0002\n\u0002\f\u0002O\t\u0002\u0001\u0002\u0003\u0002"+
		"R\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003h\b\u0003\n\u0003\f\u0003"+
		"k\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003s\b\u0003\n\u0003\f\u0003v\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003|\b\u0003\n\u0003\f\u0003"+
		"\u007f\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u009a\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00ab\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00b9\b\u0005\n\u0005"+
		"\f\u0005\u00bc\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00c4\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00f7"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u0131\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
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
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0189\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u01a7\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
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
		"\u0001\u0010\u0003\u0010\u01f1\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0260\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u029b\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u02a1\b\u0013\n\u0013"+
		"\f\u0013\u02a4\t\u0013\u0001\u0013\u0005\u0013\u02a7\b\u0013\n\u0013\f"+
		"\u0013\u02aa\t\u0013\u0001\u0013\u0005\u0013\u02ad\b\u0013\n\u0013\f\u0013"+
		"\u02b0\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u02b9\b\u0013\n\u0013\f\u0013\u02bc"+
		"\t\u0013\u0001\u0013\u0005\u0013\u02bf\b\u0013\n\u0013\f\u0013\u02c2\t"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u02cb\b\u0013\n\u0013\f\u0013\u02ce\t\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u02d4\b\u0013"+
		"\n\u0013\f\u0013\u02d7\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u02dd\b\u0013\n\u0013\f\u0013\u02e0\t\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u02e6\b\u0013\n\u0013"+
		"\f\u0013\u02e9\t\u0013\u0003\u0013\u02eb\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u02f8\b\u0014\n\u0014"+
		"\f\u0014\u02fb\t\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u02ff\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u030b\b\u0016"+
		"\n\u0016\f\u0016\u030e\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0316\b\u0017\n\u0017\f\u0017"+
		"\u0319\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0323\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0000\u0003\n,.\u001b"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.024\u0000\u0003\u0002\u0000&&..\u0001\u0000\u0016"+
		"\u001b\u0001\u0000*+\u0376\u00006\u0001\u0000\u0000\u0000\u0002H\u0001"+
		"\u0000\u0000\u0000\u0004Q\u0001\u0000\u0000\u0000\u0006\u0099\u0001\u0000"+
		"\u0000\u0000\b\u009b\u0001\u0000\u0000\u0000\n\u00aa\u0001\u0000\u0000"+
		"\u0000\f\u00c3\u0001\u0000\u0000\u0000\u000e\u00c5\u0001\u0000\u0000\u0000"+
		"\u0010\u00cc\u0001\u0000\u0000\u0000\u0012\u00ce\u0001\u0000\u0000\u0000"+
		"\u0014\u00d0\u0001\u0000\u0000\u0000\u0016\u00d6\u0001\u0000\u0000\u0000"+
		"\u0018\u00f6\u0001\u0000\u0000\u0000\u001a\u0130\u0001\u0000\u0000\u0000"+
		"\u001c\u0188\u0001\u0000\u0000\u0000\u001e\u01a6\u0001\u0000\u0000\u0000"+
		" \u01f0\u0001\u0000\u0000\u0000\"\u025f\u0001\u0000\u0000\u0000$\u029a"+
		"\u0001\u0000\u0000\u0000&\u02ea\u0001\u0000\u0000\u0000(\u02ec\u0001\u0000"+
		"\u0000\u0000*\u0300\u0001\u0000\u0000\u0000,\u0304\u0001\u0000\u0000\u0000"+
		".\u030f\u0001\u0000\u0000\u00000\u0322\u0001\u0000\u0000\u00002\u0324"+
		"\u0001\u0000\u0000\u00004\u0326\u0001\u0000\u0000\u000067\u0005\u0001"+
		"\u0000\u000078\u0005.\u0000\u000089\u0005\n\u0000\u00009=\u0003\u0004"+
		"\u0002\u0000:<\u0003\u0002\u0001\u0000;:\u0001\u0000\u0000\u0000<?\u0001"+
		"\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000"+
		">@\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@A\u0005\u0002\u0000"+
		"\u0000A\u0001\u0001\u0000\u0000\u0000BC\u0003\u0010\b\u0000CD\u0003&\u0013"+
		"\u0000DE\u0003\u0012\t\u0000EI\u0001\u0000\u0000\u0000FI\u0003 \u0010"+
		"\u0000GI\u0003\u001a\r\u0000HB\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000"+
		"\u0000HG\u0001\u0000\u0000\u0000I\u0003\u0001\u0000\u0000\u0000JL\u0003"+
		"\b\u0004\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NR\u0001\u0000\u0000\u0000"+
		"OM\u0001\u0000\u0000\u0000PR\u0003\u0006\u0003\u0000QM\u0001\u0000\u0000"+
		"\u0000QP\u0001\u0000\u0000\u0000R\u0005\u0001\u0000\u0000\u0000ST\u0005"+
		"\u0003\u0000\u0000TU\u0005.\u0000\u0000UV\u0005\f\u0000\u0000VW\u0003"+
		"\f\u0006\u0000WX\u0005\n\u0000\u0000X\u009a\u0001\u0000\u0000\u0000YZ"+
		"\u0005.\u0000\u0000Z[\u0005\f\u0000\u0000[\\\u0005&\u0000\u0000\\]\u0005"+
		"\u0013\u0000\u0000]^\u0005#\u0000\u0000^\u009a\u0005\u0014\u0000\u0000"+
		"_`\u0005\u0003\u0000\u0000`a\u0005.\u0000\u0000ab\u0005\f\u0000\u0000"+
		"bi\u0003\f\u0006\u0000cd\u0005-\u0000\u0000de\u0005.\u0000\u0000ef\u0005"+
		"\f\u0000\u0000fh\u0003\f\u0006\u0000gc\u0001\u0000\u0000\u0000hk\u0001"+
		"\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"jl\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000lm\u0005\n\u0000\u0000"+
		"m\u009a\u0001\u0000\u0000\u0000no\u0005\u0003\u0000\u0000ot\u0005.\u0000"+
		"\u0000pq\u0005-\u0000\u0000qs\u0005.\u0000\u0000rp\u0001\u0000\u0000\u0000"+
		"sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000uw\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000wx\u0005\f\u0000"+
		"\u0000xy\u0003\f\u0006\u0000y}\u0005\n\u0000\u0000z|\u0003\u0018\f\u0000"+
		"{z\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000"+
		"\u0000\u0000}~\u0001\u0000\u0000\u0000~\u009a\u0001\u0000\u0000\u0000"+
		"\u007f}\u0001\u0000\u0000\u0000\u0080\u0081\u0005.\u0000\u0000\u0081\u0082"+
		"\u0005\f\u0000\u0000\u0082\u0083\u0003\f\u0006\u0000\u0083\u0084\u0005"+
		"\n\u0000\u0000\u0084\u0085\u0006\u0003\uffff\uffff\u0000\u0085\u009a\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0005\u0003\u0000\u0000\u0087\u0088\u0005"+
		".\u0000\u0000\u0088\u0089\u0005\f\u0000\u0000\u0089\u008a\u0003\f\u0006"+
		"\u0000\u008a\u008b\u0005\n\u0000\u0000\u008b\u008c\u0005\n\u0000\u0000"+
		"\u008c\u008d\u0006\u0003\uffff\uffff\u0000\u008d\u009a\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0005\u0003\u0000\u0000\u008f\u0090\u0005.\u0000\u0000"+
		"\u0090\u0091\u0005\f\u0000\u0000\u0091\u0092\u0005\n\u0000\u0000\u0092"+
		"\u009a\u0006\u0003\uffff\uffff\u0000\u0093\u0094\u0005\u0003\u0000\u0000"+
		"\u0094\u0095\u0005.\u0000\u0000\u0095\u0096\u0003\f\u0006\u0000\u0096"+
		"\u0097\u0005\n\u0000\u0000\u0097\u0098\u0006\u0003\uffff\uffff\u0000\u0098"+
		"\u009a\u0001\u0000\u0000\u0000\u0099S\u0001\u0000\u0000\u0000\u0099Y\u0001"+
		"\u0000\u0000\u0000\u0099_\u0001\u0000\u0000\u0000\u0099n\u0001\u0000\u0000"+
		"\u0000\u0099\u0080\u0001\u0000\u0000\u0000\u0099\u0086\u0001\u0000\u0000"+
		"\u0000\u0099\u008e\u0001\u0000\u0000\u0000\u0099\u0093\u0001\u0000\u0000"+
		"\u0000\u009a\u0007\u0001\u0000\u0000\u0000\u009b\u009c\u0005.\u0000\u0000"+
		"\u009c\u009d\u0005\u0015\u0000\u0000\u009d\u009e\u0003\n\u0005\u0000\u009e"+
		"\u009f\u0005\n\u0000\u0000\u009f\t\u0001\u0000\u0000\u0000\u00a0\u00ab"+
		"\u0006\u0005\uffff\uffff\u0000\u00a1\u00ab\u00032\u0019\u0000\u00a2\u00ab"+
		"\u0005#\u0000\u0000\u00a3\u00ab\u0005.\u0000\u0000\u00a4\u00ab\u0005&"+
		"\u0000\u0000\u00a5\u00ab\u0005\'\u0000\u0000\u00a6\u00a7\u0005/\u0000"+
		"\u0000\u00a7\u00a8\u0003\n\u0005\u0000\u00a8\u00a9\u00050\u0000\u0000"+
		"\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a0\u0001\u0000\u0000\u0000"+
		"\u00aa\u00a1\u0001\u0000\u0000\u0000\u00aa\u00a2\u0001\u0000\u0000\u0000"+
		"\u00aa\u00a3\u0001\u0000\u0000\u0000\u00aa\u00a4\u0001\u0000\u0000\u0000"+
		"\u00aa\u00a5\u0001\u0000\u0000\u0000\u00aa\u00a6\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ba\u0001\u0000\u0000\u0000\u00ac\u00ad\n\u0005\u0000\u0000\u00ad"+
		"\u00ae\u00051\u0000\u0000\u00ae\u00b9\u0003\n\u0005\u0006\u00af\u00b0"+
		"\n\u0004\u0000\u0000\u00b0\u00b1\u00052\u0000\u0000\u00b1\u00b9\u0003"+
		"\n\u0005\u0005\u00b2\u00b3\n\u0003\u0000\u0000\u00b3\u00b4\u00053\u0000"+
		"\u0000\u00b4\u00b9\u0003\n\u0005\u0004\u00b5\u00b6\n\u0002\u0000\u0000"+
		"\u00b6\u00b7\u00054\u0000\u0000\u00b7\u00b9\u0003\n\u0005\u0003\u00b8"+
		"\u00ac\u0001\u0000\u0000\u0000\u00b8\u00af\u0001\u0000\u0000\u0000\u00b8"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b8\u00b5\u0001\u0000\u0000\u0000\u00b9"+
		"\u00bc\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0001\u0000\u0000\u0000\u00bb\u000b\u0001\u0000\u0000\u0000\u00bc"+
		"\u00ba\u0001\u0000\u0000\u0000\u00bd\u00c4\u0005#\u0000\u0000\u00be\u00c4"+
		"\u0005&\u0000\u0000\u00bf\u00c4\u00032\u0019\u0000\u00c0\u00c4\u0005\'"+
		"\u0000\u0000\u00c1\u00c4\u0005$\u0000\u0000\u00c2\u00c4\u0005%\u0000\u0000"+
		"\u00c3\u00bd\u0001\u0000\u0000\u0000\u00c3\u00be\u0001\u0000\u0000\u0000"+
		"\u00c3\u00bf\u0001\u0000\u0000\u0000\u00c3\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c4\r\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005,\u0000\u0000\u00c6"+
		"\u00c7\u0005.\u0000\u0000\u00c7\u00c8\u0005\u0013\u0000\u0000\u00c8\u00c9"+
		"\u0005#\u0000\u0000\u00c9\u00ca\u0005\u0014\u0000\u0000\u00ca\u00cb\u0005"+
		"\n\u0000\u0000\u00cb\u000f\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\u0004"+
		"\u0000\u0000\u00cd\u0011\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\u0005"+
		"\u0000\u0000\u00cf\u0013\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\u0006"+
		"\u0000\u0000\u00d1\u00d2\u0005/\u0000\u0000\u00d2\u00d3\u0007\u0000\u0000"+
		"\u0000\u00d3\u00d4\u00050\u0000\u0000\u00d4\u00d5\u0005\n\u0000\u0000"+
		"\u00d5\u0015\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\u0007\u0000\u0000"+
		"\u00d7\u00d8\u0005/\u0000\u0000\u00d8\u00d9\u0005.\u0000\u0000\u00d9\u00da"+
		"\u00050\u0000\u0000\u00da\u00db\u0005\n\u0000\u0000\u00db\u0017\u0001"+
		"\u0000\u0000\u0000\u00dc\u00dd\u0005.\u0000\u0000\u00dd\u00de\u0005\u0015"+
		"\u0000\u0000\u00de\u00df\u0005#\u0000\u0000\u00df\u00f7\u0005\n\u0000"+
		"\u0000\u00e0\u00e1\u0005.\u0000\u0000\u00e1\u00e2\u0005\u0015\u0000\u0000"+
		"\u00e2\u00e3\u0005.\u0000\u0000\u00e3\u00f7\u0005\n\u0000\u0000\u00e4"+
		"\u00e5\u0005.\u0000\u0000\u00e5\u00e6\u0005\u0015\u0000\u0000\u00e6\u00e7"+
		"\u0005#\u0000\u0000\u00e7\u00e8\u0005\n\u0000\u0000\u00e8\u00e9\u0005"+
		"\n\u0000\u0000\u00e9\u00f7\u0006\f\uffff\uffff\u0000\u00ea\u00eb\u0005"+
		".\u0000\u0000\u00eb\u00ec\u0005\u0015\u0000\u0000\u00ec\u00ed\u0005#\u0000"+
		"\u0000\u00ed\u00f7\u0006\f\uffff\uffff\u0000\u00ee\u00ef\u0005.\u0000"+
		"\u0000\u00ef\u00f0\u0005#\u0000\u0000\u00f0\u00f1\u0005\n\u0000\u0000"+
		"\u00f1\u00f7\u0006\f\uffff\uffff\u0000\u00f2\u00f3\u0005.\u0000\u0000"+
		"\u00f3\u00f4\u0005\u0015\u0000\u0000\u00f4\u00f5\u0005\n\u0000\u0000\u00f5"+
		"\u00f7\u0006\f\uffff\uffff\u0000\u00f6\u00dc\u0001\u0000\u0000\u0000\u00f6"+
		"\u00e0\u0001\u0000\u0000\u0000\u00f6\u00e4\u0001\u0000\u0000\u0000\u00f6"+
		"\u00ea\u0001\u0000\u0000\u0000\u00f6\u00ee\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f7\u0019\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f9\u0005\b\u0000\u0000\u00f9\u00fa\u0005.\u0000\u0000\u00fa\u00fb"+
		"\u0005/\u0000\u0000\u00fb\u00fc\u0003\u001e\u000f\u0000\u00fc\u00fd\u0005"+
		"0\u0000\u0000\u00fd\u00fe\u0003\u0010\b\u0000\u00fe\u00ff\u0003&\u0013"+
		"\u0000\u00ff\u0100\u0003\u0012\t\u0000\u0100\u0101\u0005\u0002\u0000\u0000"+
		"\u0101\u0131\u0001\u0000\u0000\u0000\u0102\u0103\u0005\b\u0000\u0000\u0103"+
		"\u0104\u0005.\u0000\u0000\u0104\u0105\u0005\n\u0000\u0000\u0105\u0106"+
		"\u0003\u0010\b\u0000\u0106\u0107\u0003&\u0013\u0000\u0107\u0108\u0003"+
		"\u0012\t\u0000\u0108\u0131\u0001\u0000\u0000\u0000\u0109\u010a\u0005\b"+
		"\u0000\u0000\u010a\u010b\u0005/\u0000\u0000\u010b\u010c\u0003\u001e\u000f"+
		"\u0000\u010c\u010d\u00050\u0000\u0000\u010d\u010e\u0003\u0010\b\u0000"+
		"\u010e\u010f\u0003&\u0013\u0000\u010f\u0110\u0003\u0012\t\u0000\u0110"+
		"\u0111\u0006\r\uffff\uffff\u0000\u0111\u0131\u0001\u0000\u0000\u0000\u0112"+
		"\u0113\u0005\b\u0000\u0000\u0113\u0114\u0005\n\u0000\u0000\u0114\u0115"+
		"\u0003\u0010\b\u0000\u0115\u0116\u0003&\u0013\u0000\u0116\u0117\u0003"+
		"\u0012\t\u0000\u0117\u0118\u0006\r\uffff\uffff\u0000\u0118\u0131\u0001"+
		"\u0000\u0000\u0000\u0119\u011a\u0005\b\u0000\u0000\u011a\u011b\u0005."+
		"\u0000\u0000\u011b\u011c\u0003\u001e\u000f\u0000\u011c\u011d\u0006\r\uffff"+
		"\uffff\u0000\u011d\u0131\u0001\u0000\u0000\u0000\u011e\u011f\u0005\b\u0000"+
		"\u0000\u011f\u0120\u0005.\u0000\u0000\u0120\u0121\u0003\u001e\u000f\u0000"+
		"\u0121\u0122\u00050\u0000\u0000\u0122\u0123\u0003\u0010\b\u0000\u0123"+
		"\u0124\u0003&\u0013\u0000\u0124\u0125\u0003\u0012\t\u0000\u0125\u0126"+
		"\u0006\r\uffff\uffff\u0000\u0126\u0131\u0001\u0000\u0000\u0000\u0127\u0128"+
		"\u0005\b\u0000\u0000\u0128\u0129\u0005.\u0000\u0000\u0129\u012a\u0005"+
		"/\u0000\u0000\u012a\u012b\u0003\u001e\u000f\u0000\u012b\u012c\u0003\u0010"+
		"\b\u0000\u012c\u012d\u0003&\u0013\u0000\u012d\u012e\u0003\u0012\t\u0000"+
		"\u012e\u012f\u0006\r\uffff\uffff\u0000\u012f\u0131\u0001\u0000\u0000\u0000"+
		"\u0130\u00f8\u0001\u0000\u0000\u0000\u0130\u0102\u0001\u0000\u0000\u0000"+
		"\u0130\u0109\u0001\u0000\u0000\u0000\u0130\u0112\u0001\u0000\u0000\u0000"+
		"\u0130\u0119\u0001\u0000\u0000\u0000\u0130\u011e\u0001\u0000\u0000\u0000"+
		"\u0130\u0127\u0001\u0000\u0000\u0000\u0131\u001b\u0001\u0000\u0000\u0000"+
		"\u0132\u0133\u0005\r\u0000\u0000\u0133\u0134\u0005#\u0000\u0000\u0134"+
		"\u0135\u0005\u000e\u0000\u0000\u0135\u0136\u0005#\u0000\u0000\u0136\u0137"+
		"\u0005\u000f\u0000\u0000\u0137\u0138\u0003\u0010\b\u0000\u0138\u0139\u0003"+
		"&\u0013\u0000\u0139\u013a\u0003\u0012\t\u0000\u013a\u013b\u0005\n\u0000"+
		"\u0000\u013b\u0189\u0001\u0000\u0000\u0000\u013c\u013d\u0005\r\u0000\u0000"+
		"\u013d\u013e\u0005.\u0000\u0000\u013e\u013f\u0005\u000e\u0000\u0000\u013f"+
		"\u0140\u0005.\u0000\u0000\u0140\u0141\u0005\u000f\u0000\u0000\u0141\u0142"+
		"\u0003\u0010\b\u0000\u0142\u0143\u0003&\u0013\u0000\u0143\u0144\u0003"+
		"\u0012\t\u0000\u0144\u0145\u0005\n\u0000\u0000\u0145\u0189\u0001\u0000"+
		"\u0000\u0000\u0146\u0147\u0005\r\u0000\u0000\u0147\u0148\u0005\u000e\u0000"+
		"\u0000\u0148\u0149\u0005.\u0000\u0000\u0149\u014a\u0005\u000f\u0000\u0000"+
		"\u014a\u014b\u0003\u0010\b\u0000\u014b\u014c\u0003&\u0013\u0000\u014c"+
		"\u014d\u0003\u0012\t\u0000\u014d\u014e\u0005\n\u0000\u0000\u014e\u014f"+
		"\u0006\u000e\uffff\uffff\u0000\u014f\u0189\u0001\u0000\u0000\u0000\u0150"+
		"\u0151\u0005\r\u0000\u0000\u0151\u0152\u0005.\u0000\u0000\u0152\u0153"+
		"\u0005\u000e\u0000\u0000\u0153\u0154\u0005\u000f\u0000\u0000\u0154\u0155"+
		"\u0003\u0010\b\u0000\u0155\u0156\u0003&\u0013\u0000\u0156\u0157\u0003"+
		"\u0012\t\u0000\u0157\u0158\u0005\n\u0000\u0000\u0158\u0159\u0006\u000e"+
		"\uffff\uffff\u0000\u0159\u0189\u0001\u0000\u0000\u0000\u015a\u015b\u0005"+
		"\r\u0000\u0000\u015b\u015c\u0005.\u0000\u0000\u015c\u015d\u0005.\u0000"+
		"\u0000\u015d\u015e\u0005\u000f\u0000\u0000\u015e\u015f\u0003\u0010\b\u0000"+
		"\u015f\u0160\u0003&\u0013\u0000\u0160\u0161\u0003\u0012\t\u0000\u0161"+
		"\u0162\u0005\n\u0000\u0000\u0162\u0163\u0006\u000e\uffff\uffff\u0000\u0163"+
		"\u0189\u0001\u0000\u0000\u0000\u0164\u0165\u0005\r\u0000\u0000\u0165\u0166"+
		"\u0005.\u0000\u0000\u0166\u0167\u0005\u000e\u0000\u0000\u0167\u0168\u0005"+
		".\u0000\u0000\u0168\u0169\u0003\u0010\b\u0000\u0169\u016a\u0003&\u0013"+
		"\u0000\u016a\u016b\u0003\u0012\t\u0000\u016b\u016c\u0005\n\u0000\u0000"+
		"\u016c\u016d\u0006\u000e\uffff\uffff\u0000\u016d\u0189\u0001\u0000\u0000"+
		"\u0000\u016e\u016f\u0005\r\u0000\u0000\u016f\u0170\u0005.\u0000\u0000"+
		"\u0170\u0171\u0005\u000e\u0000\u0000\u0171\u0172\u0005.\u0000\u0000\u0172"+
		"\u0173\u0003&\u0013\u0000\u0173\u0174\u0003\u0012\t\u0000\u0174\u0175"+
		"\u0005\n\u0000\u0000\u0175\u0176\u0006\u000e\uffff\uffff\u0000\u0176\u0189"+
		"\u0001\u0000\u0000\u0000\u0177\u0178\u0005\r\u0000\u0000\u0178\u0179\u0005"+
		".\u0000\u0000\u0179\u017a\u0005\u000e\u0000\u0000\u017a\u017b\u0005.\u0000"+
		"\u0000\u017b\u017c\u0003&\u0013\u0000\u017c\u017d\u0003\u0012\t\u0000"+
		"\u017d\u017e\u0006\u000e\uffff\uffff\u0000\u017e\u0189\u0001\u0000\u0000"+
		"\u0000\u017f\u0180\u0005\r\u0000\u0000\u0180\u0181\u0005.\u0000\u0000"+
		"\u0181\u0182\u0005\u000e\u0000\u0000\u0182\u0183\u0005.\u0000\u0000\u0183"+
		"\u0184\u0003\u0010\b\u0000\u0184\u0185\u0003&\u0013\u0000\u0185\u0186"+
		"\u0005\n\u0000\u0000\u0186\u0187\u0006\u000e\uffff\uffff\u0000\u0187\u0189"+
		"\u0001\u0000\u0000\u0000\u0188\u0132\u0001\u0000\u0000\u0000\u0188\u013c"+
		"\u0001\u0000\u0000\u0000\u0188\u0146\u0001\u0000\u0000\u0000\u0188\u0150"+
		"\u0001\u0000\u0000\u0000\u0188\u015a\u0001\u0000\u0000\u0000\u0188\u0164"+
		"\u0001\u0000\u0000\u0000\u0188\u016e\u0001\u0000\u0000\u0000\u0188\u0177"+
		"\u0001\u0000\u0000\u0000\u0188\u017f\u0001\u0000\u0000\u0000\u0189\u001d"+
		"\u0001\u0000\u0000\u0000\u018a\u018b\u0005.\u0000\u0000\u018b\u018c\u0005"+
		"\f\u0000\u0000\u018c\u01a7\u0003\f\u0006\u0000\u018d\u018e\u0005-\u0000"+
		"\u0000\u018e\u018f\u0005.\u0000\u0000\u018f\u0190\u0005\f\u0000\u0000"+
		"\u0190\u0191\u0003\f\u0006\u0000\u0191\u0192\u0003\u001e\u000f\u0000\u0192"+
		"\u01a7\u0001\u0000\u0000\u0000\u0193\u0194\u0005.\u0000\u0000\u0194\u0195"+
		"\u0003\f\u0006\u0000\u0195\u0196\u0006\u000f\uffff\uffff\u0000\u0196\u01a7"+
		"\u0001\u0000\u0000\u0000\u0197\u0198\u0005.\u0000\u0000\u0198\u0199\u0005"+
		"\f\u0000\u0000\u0199\u01a7\u0006\u000f\uffff\uffff\u0000\u019a\u019b\u0005"+
		"-\u0000\u0000\u019b\u019c\u0005\f\u0000\u0000\u019c\u019d\u0003\f\u0006"+
		"\u0000\u019d\u019e\u0003\u001e\u000f\u0000\u019e\u019f\u0006\u000f\uffff"+
		"\uffff\u0000\u019f\u01a7\u0001\u0000\u0000\u0000\u01a0\u01a1\u0005-\u0000"+
		"\u0000\u01a1\u01a2\u0005.\u0000\u0000\u01a2\u01a3\u0003\f\u0006\u0000"+
		"\u01a3\u01a4\u0003\u001e\u000f\u0000\u01a4\u01a5\u0006\u000f\uffff\uffff"+
		"\u0000\u01a5\u01a7\u0001\u0000\u0000\u0000\u01a6\u018a\u0001\u0000\u0000"+
		"\u0000\u01a6\u018d\u0001\u0000\u0000\u0000\u01a6\u0193\u0001\u0000\u0000"+
		"\u0000\u01a6\u0197\u0001\u0000\u0000\u0000\u01a6\u019a\u0001\u0000\u0000"+
		"\u0000\u01a6\u01a0\u0001\u0000\u0000\u0000\u01a7\u001f\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a9\u0005\t\u0000\u0000\u01a9\u01aa\u0005.\u0000\u0000"+
		"\u01aa\u01ab\u0005/\u0000\u0000\u01ab\u01ac\u0003\u001e\u000f\u0000\u01ac"+
		"\u01ad\u00050\u0000\u0000\u01ad\u01ae\u0005\f\u0000\u0000\u01ae\u01af"+
		"\u0003\f\u0006\u0000\u01af\u01b0\u0003\u0010\b\u0000\u01b0\u01b1\u0003"+
		"&\u0013\u0000\u01b1\u01b2\u0003\u0012\t\u0000\u01b2\u01b3\u0005\n\u0000"+
		"\u0000\u01b3\u01f1\u0001\u0000\u0000\u0000\u01b4\u01b5\u0005\t\u0000\u0000"+
		"\u01b5\u01b6\u0005/\u0000\u0000\u01b6\u01b7\u0003\u001e\u000f\u0000\u01b7"+
		"\u01b8\u00050\u0000\u0000\u01b8\u01b9\u0005\f\u0000\u0000\u01b9\u01ba"+
		"\u0003\f\u0006\u0000\u01ba\u01bb\u0003\u0010\b\u0000\u01bb\u01bc\u0003"+
		"&\u0013\u0000\u01bc\u01bd\u0003\u0012\t\u0000\u01bd\u01be\u0005\n\u0000"+
		"\u0000\u01be\u01bf\u0006\u0010\uffff\uffff\u0000\u01bf\u01f1\u0001\u0000"+
		"\u0000\u0000\u01c0\u01c1\u0005\t\u0000\u0000\u01c1\u01c2\u0005.\u0000"+
		"\u0000\u01c2\u01c3\u0003\u001e\u000f\u0000\u01c3\u01c4\u00050\u0000\u0000"+
		"\u01c4\u01c5\u0005\f\u0000\u0000\u01c5\u01c6\u0003\f\u0006\u0000\u01c6"+
		"\u01c7\u0003\u0010\b\u0000\u01c7\u01c8\u0003&\u0013\u0000\u01c8\u01c9"+
		"\u0003\u0012\t\u0000\u01c9\u01ca\u0005\n\u0000\u0000\u01ca\u01cb\u0006"+
		"\u0010\uffff\uffff\u0000\u01cb\u01f1\u0001\u0000\u0000\u0000\u01cc\u01cd"+
		"\u0005\t\u0000\u0000\u01cd\u01ce\u0005.\u0000\u0000\u01ce\u01cf\u0005"+
		"/\u0000\u0000\u01cf\u01d0\u0003\u001e\u000f\u0000\u01d0\u01d1\u0005\f"+
		"\u0000\u0000\u01d1\u01d2\u0003\f\u0006\u0000\u01d2\u01d3\u0003\u0010\b"+
		"\u0000\u01d3\u01d4\u0003&\u0013\u0000\u01d4\u01d5\u0003\u0012\t\u0000"+
		"\u01d5\u01d6\u0005\n\u0000\u0000\u01d6\u01d7\u0006\u0010\uffff\uffff\u0000"+
		"\u01d7\u01f1\u0001\u0000\u0000\u0000\u01d8\u01d9\u0005\t\u0000\u0000\u01d9"+
		"\u01da\u0005.\u0000\u0000\u01da\u01db\u0005/\u0000\u0000\u01db\u01dc\u0003"+
		"\u001e\u000f\u0000\u01dc\u01dd\u00050\u0000\u0000\u01dd\u01de\u0003\f"+
		"\u0006\u0000\u01de\u01df\u0003\u0010\b\u0000\u01df\u01e0\u0003&\u0013"+
		"\u0000\u01e0\u01e1\u0003\u0012\t\u0000\u01e1\u01e2\u0005\n\u0000\u0000"+
		"\u01e2\u01e3\u0006\u0010\uffff\uffff\u0000\u01e3\u01f1\u0001\u0000\u0000"+
		"\u0000\u01e4\u01e5\u0005\t\u0000\u0000\u01e5\u01e6\u0005.\u0000\u0000"+
		"\u01e6\u01e7\u0005/\u0000\u0000\u01e7\u01e8\u0003\u001e\u000f\u0000\u01e8"+
		"\u01e9\u00050\u0000\u0000\u01e9\u01ea\u0005\f\u0000\u0000\u01ea\u01eb"+
		"\u0003\f\u0006\u0000\u01eb\u01ec\u0003\u0010\b\u0000\u01ec\u01ed\u0003"+
		"&\u0013\u0000\u01ed\u01ee\u0003\u0012\t\u0000\u01ee\u01ef\u0006\u0010"+
		"\uffff\uffff\u0000\u01ef\u01f1\u0001\u0000\u0000\u0000\u01f0\u01a8\u0001"+
		"\u0000\u0000\u0000\u01f0\u01b4\u0001\u0000\u0000\u0000\u01f0\u01c0\u0001"+
		"\u0000\u0000\u0000\u01f0\u01cc\u0001\u0000\u0000\u0000\u01f0\u01d8\u0001"+
		"\u0000\u0000\u0000\u01f0\u01e4\u0001\u0000\u0000\u0000\u01f1!\u0001\u0000"+
		"\u0000\u0000\u01f2\u01f3\u0005 \u0000\u0000\u01f3\u01f4\u0005/\u0000\u0000"+
		"\u01f4\u01f5\u0005#\u0000\u0000\u01f5\u01f6\u0003,\u0016\u0000\u01f6\u01f7"+
		"\u0005#\u0000\u0000\u01f7\u01f8\u00050\u0000\u0000\u01f8\u01f9\u0005\u000f"+
		"\u0000\u0000\u01f9\u01fa\u0003\u0010\b\u0000\u01fa\u01fb\u0003&\u0013"+
		"\u0000\u01fb\u01fc\u0003\u0012\t\u0000\u01fc\u01fd\u0005\n\u0000\u0000"+
		"\u01fd\u0260\u0001\u0000\u0000\u0000\u01fe\u01ff\u0005 \u0000\u0000\u01ff"+
		"\u0200\u0005/\u0000\u0000\u0200\u0201\u0005.\u0000\u0000\u0201\u0202\u0003"+
		",\u0016\u0000\u0202\u0203\u0005.\u0000\u0000\u0203\u0204\u00050\u0000"+
		"\u0000\u0204\u0205\u0005\u000f\u0000\u0000\u0205\u0206\u0003\u0010\b\u0000"+
		"\u0206\u0207\u0003&\u0013\u0000\u0207\u0208\u0003\u0012\t\u0000\u0208"+
		"\u0209\u0005\n\u0000\u0000\u0209\u0260\u0001\u0000\u0000\u0000\u020a\u020b"+
		"\u0005 \u0000\u0000\u020b\u020c\u0005/\u0000\u0000\u020c\u020d\u0003,"+
		"\u0016\u0000\u020d\u020e\u0005.\u0000\u0000\u020e\u020f\u00050\u0000\u0000"+
		"\u020f\u0210\u0005\u000f\u0000\u0000\u0210\u0211\u0003\u0010\b\u0000\u0211"+
		"\u0212\u0003&\u0013\u0000\u0212\u0213\u0003\u0012\t\u0000\u0213\u0214"+
		"\u0005\n\u0000\u0000\u0214\u0215\u0006\u0011\uffff\uffff\u0000\u0215\u0260"+
		"\u0001\u0000\u0000\u0000\u0216\u0217\u0005 \u0000\u0000\u0217\u0218\u0005"+
		"/\u0000\u0000\u0218\u0219\u0005.\u0000\u0000\u0219\u021a\u0003,\u0016"+
		"\u0000\u021a\u021b\u00050\u0000\u0000\u021b\u021c\u0005\u000f\u0000\u0000"+
		"\u021c\u021d\u0003\u0010\b\u0000\u021d\u021e\u0003&\u0013\u0000\u021e"+
		"\u021f\u0003\u0012\t\u0000\u021f\u0220\u0005\n\u0000\u0000\u0220\u0221"+
		"\u0006\u0011\uffff\uffff\u0000\u0221\u0260\u0001\u0000\u0000\u0000\u0222"+
		"\u0223\u0005 \u0000\u0000\u0223\u0224\u0005/\u0000\u0000\u0224\u0225\u0005"+
		".\u0000\u0000\u0225\u0226\u0003,\u0016\u0000\u0226\u0227\u0005.\u0000"+
		"\u0000\u0227\u0228\u00050\u0000\u0000\u0228\u0229\u0005\u000f\u0000\u0000"+
		"\u0229\u022a\u0003\u0010\b\u0000\u022a\u022b\u0003&\u0013\u0000\u022b"+
		"\u022c\u0003\u0012\t\u0000\u022c\u022d\u0005\n\u0000\u0000\u022d\u022e"+
		"\u0006\u0011\uffff\uffff\u0000\u022e\u0260\u0001\u0000\u0000\u0000\u022f"+
		"\u0230\u0005 \u0000\u0000\u0230\u0231\u0005.\u0000\u0000\u0231\u0232\u0003"+
		",\u0016\u0000\u0232\u0233\u0005.\u0000\u0000\u0233\u0234\u00050\u0000"+
		"\u0000\u0234\u0235\u0005\u000f\u0000\u0000\u0235\u0236\u0003\u0010\b\u0000"+
		"\u0236\u0237\u0003&\u0013\u0000\u0237\u0238\u0003\u0012\t\u0000\u0238"+
		"\u0239\u0005\n\u0000\u0000\u0239\u023a\u0006\u0011\uffff\uffff\u0000\u023a"+
		"\u0260\u0001\u0000\u0000\u0000\u023b\u023c\u0005 \u0000\u0000\u023c\u023d"+
		"\u0005/\u0000\u0000\u023d\u023e\u0005.\u0000\u0000\u023e\u023f\u0003,"+
		"\u0016\u0000\u023f\u0240\u0005.\u0000\u0000\u0240\u0241\u0005\u000f\u0000"+
		"\u0000\u0241\u0242\u0003\u0010\b\u0000\u0242\u0243\u0003&\u0013\u0000"+
		"\u0243\u0244\u0003\u0012\t\u0000\u0244\u0245\u0005\n\u0000\u0000\u0245"+
		"\u0246\u0006\u0011\uffff\uffff\u0000\u0246\u0260\u0001\u0000\u0000\u0000"+
		"\u0247\u0248\u0005 \u0000\u0000\u0248\u0249\u0005/\u0000\u0000\u0249\u024a"+
		"\u0005.\u0000\u0000\u024a\u024b\u0003,\u0016\u0000\u024b\u024c\u0005."+
		"\u0000\u0000\u024c\u024d\u00050\u0000\u0000\u024d\u024e\u0003\u0010\b"+
		"\u0000\u024e\u024f\u0003&\u0013\u0000\u024f\u0250\u0003\u0012\t\u0000"+
		"\u0250\u0251\u0005\n\u0000\u0000\u0251\u0252\u0006\u0011\uffff\uffff\u0000"+
		"\u0252\u0260\u0001\u0000\u0000\u0000\u0253\u0254\u0005 \u0000\u0000\u0254"+
		"\u0255\u0005/\u0000\u0000\u0255\u0256\u0005.\u0000\u0000\u0256\u0257\u0003"+
		",\u0016\u0000\u0257\u0258\u0005.\u0000\u0000\u0258\u0259\u00050\u0000"+
		"\u0000\u0259\u025a\u0005\u000f\u0000\u0000\u025a\u025b\u0003\u0010\b\u0000"+
		"\u025b\u025c\u0003&\u0013\u0000\u025c\u025d\u0003\u0012\t\u0000\u025d"+
		"\u025e\u0006\u0011\uffff\uffff\u0000\u025e\u0260\u0001\u0000\u0000\u0000"+
		"\u025f\u01f2\u0001\u0000\u0000\u0000\u025f\u01fe\u0001\u0000\u0000\u0000"+
		"\u025f\u020a\u0001\u0000\u0000\u0000\u025f\u0216\u0001\u0000\u0000\u0000"+
		"\u025f\u0222\u0001\u0000\u0000\u0000\u025f\u022f\u0001\u0000\u0000\u0000"+
		"\u025f\u023b\u0001\u0000\u0000\u0000\u025f\u0247\u0001\u0000\u0000\u0000"+
		"\u025f\u0253\u0001\u0000\u0000\u0000\u0260#\u0001\u0000\u0000\u0000\u0261"+
		"\u0262\u0005!\u0000\u0000\u0262\u0263\u0003&\u0013\u0000\u0263\u0264\u0005"+
		"\"\u0000\u0000\u0264\u0265\u0005#\u0000\u0000\u0265\u0266\u0003,\u0016"+
		"\u0000\u0266\u0267\u0005#\u0000\u0000\u0267\u0268\u0005\n\u0000\u0000"+
		"\u0268\u029b\u0001\u0000\u0000\u0000\u0269\u026a\u0005!\u0000\u0000\u026a"+
		"\u026b\u0003&\u0013\u0000\u026b\u026c\u0005\"\u0000\u0000\u026c\u026d"+
		"\u0005.\u0000\u0000\u026d\u026e\u0003,\u0016\u0000\u026e\u026f\u0005."+
		"\u0000\u0000\u026f\u0270\u0005\n\u0000\u0000\u0270\u029b\u0001\u0000\u0000"+
		"\u0000\u0271\u0272\u0005!\u0000\u0000\u0272\u0273\u0003&\u0013\u0000\u0273"+
		"\u0274\u0005\"\u0000\u0000\u0274\u0275\u0005.\u0000\u0000\u0275\u0276"+
		"\u0003,\u0016\u0000\u0276\u0277\u0005.\u0000\u0000\u0277\u0278\u0005\n"+
		"\u0000\u0000\u0278\u0279\u0006\u0012\uffff\uffff\u0000\u0279\u029b\u0001"+
		"\u0000\u0000\u0000\u027a\u027b\u0005!\u0000\u0000\u027b\u027c\u0003&\u0013"+
		"\u0000\u027c\u027d\u0005.\u0000\u0000\u027d\u027e\u0003,\u0016\u0000\u027e"+
		"\u027f\u0005.\u0000\u0000\u027f\u0280\u0005\n\u0000\u0000\u0280\u0281"+
		"\u0006\u0012\uffff\uffff\u0000\u0281\u029b\u0001\u0000\u0000\u0000\u0282"+
		"\u0283\u0005!\u0000\u0000\u0283\u0284\u0003&\u0013\u0000\u0284\u0285\u0005"+
		"\"\u0000\u0000\u0285\u0286\u0003,\u0016\u0000\u0286\u0287\u0005.\u0000"+
		"\u0000\u0287\u0288\u0005\n\u0000\u0000\u0288\u0289\u0006\u0012\uffff\uffff"+
		"\u0000\u0289\u029b\u0001\u0000\u0000\u0000\u028a\u028b\u0005!\u0000\u0000"+
		"\u028b\u028c\u0003&\u0013\u0000\u028c\u028d\u0005\"\u0000\u0000\u028d"+
		"\u028e\u0005.\u0000\u0000\u028e\u028f\u0003,\u0016\u0000\u028f\u0290\u0005"+
		"\n\u0000\u0000\u0290\u0291\u0006\u0012\uffff\uffff\u0000\u0291\u029b\u0001"+
		"\u0000\u0000\u0000\u0292\u0293\u0005!\u0000\u0000\u0293\u0294\u0003&\u0013"+
		"\u0000\u0294\u0295\u0005\"\u0000\u0000\u0295\u0296\u0005.\u0000\u0000"+
		"\u0296\u0297\u0003,\u0016\u0000\u0297\u0298\u0005.\u0000\u0000\u0298\u0299"+
		"\u0006\u0012\uffff\uffff\u0000\u0299\u029b\u0001\u0000\u0000\u0000\u029a"+
		"\u0261\u0001\u0000\u0000\u0000\u029a\u0269\u0001\u0000\u0000\u0000\u029a"+
		"\u0271\u0001\u0000\u0000\u0000\u029a\u027a\u0001\u0000\u0000\u0000\u029a"+
		"\u0282\u0001\u0000\u0000\u0000\u029a\u028a\u0001\u0000\u0000\u0000\u029a"+
		"\u0292\u0001\u0000\u0000\u0000\u029b%\u0001\u0000\u0000\u0000\u029c\u029d"+
		"\u0003\b\u0004\u0000\u029d\u029e\u0003&\u0013\u0000\u029e\u02eb\u0001"+
		"\u0000\u0000\u0000\u029f\u02a1\u0003\b\u0004\u0000\u02a0\u029f\u0001\u0000"+
		"\u0000\u0000\u02a1\u02a4\u0001\u0000\u0000\u0000\u02a2\u02a0\u0001\u0000"+
		"\u0000\u0000\u02a2\u02a3\u0001\u0000\u0000\u0000\u02a3\u02eb\u0001\u0000"+
		"\u0000\u0000\u02a4\u02a2\u0001\u0000\u0000\u0000\u02a5\u02a7\u0003\u001c"+
		"\u000e\u0000\u02a6\u02a5\u0001\u0000\u0000\u0000\u02a7\u02aa\u0001\u0000"+
		"\u0000\u0000\u02a8\u02a6\u0001\u0000\u0000\u0000\u02a8\u02a9\u0001\u0000"+
		"\u0000\u0000\u02a9\u02eb\u0001\u0000\u0000\u0000\u02aa\u02a8\u0001\u0000"+
		"\u0000\u0000\u02ab\u02ad\u0003\u0014\n\u0000\u02ac\u02ab\u0001\u0000\u0000"+
		"\u0000\u02ad\u02b0\u0001\u0000\u0000\u0000\u02ae\u02ac\u0001\u0000\u0000"+
		"\u0000\u02ae\u02af\u0001\u0000\u0000\u0000\u02af\u02eb\u0001\u0000\u0000"+
		"\u0000\u02b0\u02ae\u0001\u0000\u0000\u0000\u02b1\u02b2\u0003\u0014\n\u0000"+
		"\u02b2\u02b3\u0003&\u0013\u0000\u02b3\u02eb\u0001\u0000\u0000\u0000\u02b4"+
		"\u02b5\u0003\u0016\u000b\u0000\u02b5\u02b6\u0003&\u0013\u0000\u02b6\u02eb"+
		"\u0001\u0000\u0000\u0000\u02b7\u02b9\u0003\u0016\u000b\u0000\u02b8\u02b7"+
		"\u0001\u0000\u0000\u0000\u02b9\u02bc\u0001\u0000\u0000\u0000\u02ba\u02b8"+
		"\u0001\u0000\u0000\u0000\u02ba\u02bb\u0001\u0000\u0000\u0000\u02bb\u02eb"+
		"\u0001\u0000\u0000\u0000\u02bc\u02ba\u0001\u0000\u0000\u0000\u02bd\u02bf"+
		"\u0003\u000e\u0007\u0000\u02be\u02bd\u0001\u0000\u0000\u0000\u02bf\u02c2"+
		"\u0001\u0000\u0000\u0000\u02c0\u02be\u0001\u0000\u0000\u0000\u02c0\u02c1"+
		"\u0001\u0000\u0000\u0000\u02c1\u02eb\u0001\u0000\u0000\u0000\u02c2\u02c0"+
		"\u0001\u0000\u0000\u0000\u02c3\u02c4\u0003\u000e\u0007\u0000\u02c4\u02c5"+
		"\u0003&\u0013\u0000\u02c5\u02eb\u0001\u0000\u0000\u0000\u02c6\u02c7\u0003"+
		"(\u0014\u0000\u02c7\u02c8\u0003&\u0013\u0000\u02c8\u02eb\u0001\u0000\u0000"+
		"\u0000\u02c9\u02cb\u0003(\u0014\u0000\u02ca\u02c9\u0001\u0000\u0000\u0000"+
		"\u02cb\u02ce\u0001\u0000\u0000\u0000\u02cc\u02ca\u0001\u0000\u0000\u0000"+
		"\u02cc\u02cd\u0001\u0000\u0000\u0000\u02cd\u02eb\u0001\u0000\u0000\u0000"+
		"\u02ce\u02cc\u0001\u0000\u0000\u0000\u02cf\u02d0\u0003\u001c\u000e\u0000"+
		"\u02d0\u02d1\u0003&\u0013\u0000\u02d1\u02eb\u0001\u0000\u0000\u0000\u02d2"+
		"\u02d4\u0003\u001c\u000e\u0000\u02d3\u02d2\u0001\u0000\u0000\u0000\u02d4"+
		"\u02d7\u0001\u0000\u0000\u0000\u02d5\u02d3\u0001\u0000\u0000\u0000\u02d5"+
		"\u02d6\u0001\u0000\u0000\u0000\u02d6\u02eb\u0001\u0000\u0000\u0000\u02d7"+
		"\u02d5\u0001\u0000\u0000\u0000\u02d8\u02d9\u0003\"\u0011\u0000\u02d9\u02da"+
		"\u0003&\u0013\u0000\u02da\u02eb\u0001\u0000\u0000\u0000\u02db\u02dd\u0003"+
		"\"\u0011\u0000\u02dc\u02db\u0001\u0000\u0000\u0000\u02dd\u02e0\u0001\u0000"+
		"\u0000\u0000\u02de\u02dc\u0001\u0000\u0000\u0000\u02de\u02df\u0001\u0000"+
		"\u0000\u0000\u02df\u02eb\u0001\u0000\u0000\u0000\u02e0\u02de\u0001\u0000"+
		"\u0000\u0000\u02e1\u02e2\u0003$\u0012\u0000\u02e2\u02e3\u0003&\u0013\u0000"+
		"\u02e3\u02eb\u0001\u0000\u0000\u0000\u02e4\u02e6\u0003$\u0012\u0000\u02e5"+
		"\u02e4\u0001\u0000\u0000\u0000\u02e6\u02e9\u0001\u0000\u0000\u0000\u02e7"+
		"\u02e5\u0001\u0000\u0000\u0000\u02e7\u02e8\u0001\u0000\u0000\u0000\u02e8"+
		"\u02eb\u0001\u0000\u0000\u0000\u02e9\u02e7\u0001\u0000\u0000\u0000\u02ea"+
		"\u029c\u0001\u0000\u0000\u0000\u02ea\u02a2\u0001\u0000\u0000\u0000\u02ea"+
		"\u02a8\u0001\u0000\u0000\u0000\u02ea\u02ae\u0001\u0000\u0000\u0000\u02ea"+
		"\u02b1\u0001\u0000\u0000\u0000\u02ea\u02b4\u0001\u0000\u0000\u0000\u02ea"+
		"\u02ba\u0001\u0000\u0000\u0000\u02ea\u02c0\u0001\u0000\u0000\u0000\u02ea"+
		"\u02c3\u0001\u0000\u0000\u0000\u02ea\u02c6\u0001\u0000\u0000\u0000\u02ea"+
		"\u02cc\u0001\u0000\u0000\u0000\u02ea\u02cf\u0001\u0000\u0000\u0000\u02ea"+
		"\u02d5\u0001\u0000\u0000\u0000\u02ea\u02d8\u0001\u0000\u0000\u0000\u02ea"+
		"\u02de\u0001\u0000\u0000\u0000\u02ea\u02e1\u0001\u0000\u0000\u0000\u02ea"+
		"\u02e7\u0001\u0000\u0000\u0000\u02eb\'\u0001\u0000\u0000\u0000\u02ec\u02ed"+
		"\u0005\u0010\u0000\u0000\u02ed\u02ee\u0005/\u0000\u0000\u02ee\u02ef\u0003"+
		",\u0016\u0000\u02ef\u02f0\u00050\u0000\u0000\u02f0\u02f9\u0003&\u0013"+
		"\u0000\u02f1\u02f2\u0005\u0011\u0000\u0000\u02f2\u02f3\u0005/\u0000\u0000"+
		"\u02f3\u02f4\u0003,\u0016\u0000\u02f4\u02f5\u00050\u0000\u0000\u02f5\u02f6"+
		"\u0003&\u0013\u0000\u02f6\u02f8\u0001\u0000\u0000\u0000\u02f7\u02f1\u0001"+
		"\u0000\u0000\u0000\u02f8\u02fb\u0001\u0000\u0000\u0000\u02f9\u02f7\u0001"+
		"\u0000\u0000\u0000\u02f9\u02fa\u0001\u0000\u0000\u0000\u02fa\u02fe\u0001"+
		"\u0000\u0000\u0000\u02fb\u02f9\u0001\u0000\u0000\u0000\u02fc\u02fd\u0005"+
		"\u0012\u0000\u0000\u02fd\u02ff\u0003&\u0013\u0000\u02fe\u02fc\u0001\u0000"+
		"\u0000\u0000\u02fe\u02ff\u0001\u0000\u0000\u0000\u02ff)\u0001\u0000\u0000"+
		"\u0000\u0300\u0301\u0003\n\u0005\u0000\u0301\u0302\u0007\u0001\u0000\u0000"+
		"\u0302\u0303\u0003\n\u0005\u0000\u0303+\u0001\u0000\u0000\u0000\u0304"+
		"\u0305\u0006\u0016\uffff\uffff\u0000\u0305\u0306\u0003.\u0017\u0000\u0306"+
		"\u030c\u0001\u0000\u0000\u0000\u0307\u0308\n\u0001\u0000\u0000\u0308\u0309"+
		"\u0005\u001e\u0000\u0000\u0309\u030b\u0003.\u0017\u0000\u030a\u0307\u0001"+
		"\u0000\u0000\u0000\u030b\u030e\u0001\u0000\u0000\u0000\u030c\u030a\u0001"+
		"\u0000\u0000\u0000\u030c\u030d\u0001\u0000\u0000\u0000\u030d-\u0001\u0000"+
		"\u0000\u0000\u030e\u030c\u0001\u0000\u0000\u0000\u030f\u0310\u0006\u0017"+
		"\uffff\uffff\u0000\u0310\u0311\u00030\u0018\u0000\u0311\u0317\u0001\u0000"+
		"\u0000\u0000\u0312\u0313\n\u0001\u0000\u0000\u0313\u0314\u0005\u001d\u0000"+
		"\u0000\u0314\u0316\u00030\u0018\u0000\u0315\u0312\u0001\u0000\u0000\u0000"+
		"\u0316\u0319\u0001\u0000\u0000\u0000\u0317\u0315\u0001\u0000\u0000\u0000"+
		"\u0317\u0318\u0001\u0000\u0000\u0000\u0318/\u0001\u0000\u0000\u0000\u0319"+
		"\u0317\u0001\u0000\u0000\u0000\u031a\u0323\u00032\u0019\u0000\u031b\u031c"+
		"\u0005/\u0000\u0000\u031c\u031d\u0003,\u0016\u0000\u031d\u031e\u00050"+
		"\u0000\u0000\u031e\u0323\u0001\u0000\u0000\u0000\u031f\u0320\u0005\u001c"+
		"\u0000\u0000\u0320\u0323\u00030\u0018\u0000\u0321\u0323\u0003*\u0015\u0000"+
		"\u0322\u031a\u0001\u0000\u0000\u0000\u0322\u031b\u0001\u0000\u0000\u0000"+
		"\u0322\u031f\u0001\u0000\u0000\u0000\u0322\u0321\u0001\u0000\u0000\u0000"+
		"\u03231\u0001\u0000\u0000\u0000\u0324\u0325\u0007\u0002\u0000\u0000\u0325"+
		"3\u0001\u0000\u0000\u0000\u0326\u0327\u0001\u0000\u0000\u0000\u03275\u0001"+
		"\u0000\u0000\u0000\"=HMQit}\u0099\u00aa\u00b8\u00ba\u00c3\u00f6\u0130"+
		"\u0188\u01a6\u01f0\u025f\u029a\u02a2\u02a8\u02ae\u02ba\u02c0\u02cc\u02d5"+
		"\u02de\u02e7\u02ea\u02f9\u02fe\u030c\u0317\u0322";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}