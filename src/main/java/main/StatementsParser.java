// Generated from Statements.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class StatementsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, BOOLEAN=8, NUMBER=9, 
		STRING=10, ID=11, AND=12, OR=13, LOGICAL_AND=14, LOGICAL_OR=15, ASSIGN=16, 
		PLUS=17, MINUS=18, MULT=19, DIV=20, LPAREN=21, RPAREN=22, LBRACE=23, RBRACE=24, 
		SEMI=25, LT=26, GT=27, EQ=28, NEQ=29, LTE=30, GTE=31, WS=32, COMMENT=33, 
		MULTILINE_COMMENT=34;
	public static final int
		RULE_statement = 0, RULE_varDeclaration = 1, RULE_assignment = 2, RULE_ifStatement = 3, 
		RULE_whileStatement = 4, RULE_forStatement = 5, RULE_printStatement = 6, 
		RULE_block = 7, RULE_expression = 8, RULE_placeholder = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"statement", "varDeclaration", "assignment", "ifStatement", "whileStatement", 
			"forStatement", "printStatement", "block", "expression", "placeholder"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "'if'", "'else'", "'while'", "'for'", "'|'", "'print'", 
			null, null, null, null, "'and'", "'or'", "'&&'", "'||'", "'='", "'+'", 
			"'-'", "'*'", "'/'", "'('", "')'", "'{'", "'}'", "';'", "'<'", "'>'", 
			"'=='", "'!='", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "BOOLEAN", "NUMBER", 
			"STRING", "ID", "AND", "OR", "LOGICAL_AND", "LOGICAL_OR", "ASSIGN", "PLUS", 
			"MINUS", "MULT", "DIV", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMI", 
			"LT", "GT", "EQ", "NEQ", "LTE", "GTE", "WS", "COMMENT", "MULTILINE_COMMENT"
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
	public String getGrammarFileName() { return "Statements.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StatementsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		try {
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				varDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(22);
				expression(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(23);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(24);
				whileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(25);
				forStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(26);
				block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(27);
				printStatement();
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
	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
	 
		public VarDeclarationContext() { }
		public void copyFrom(VarDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclAssignContext extends VarDeclarationContext {
		public TerminalNode ID() { return getToken(StatementsParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(StatementsParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(StatementsParser.SEMI, 0); }
		public VarDeclAssignContext(VarDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).enterVarDeclAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).exitVarDeclAssign(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclNoAssignContext extends VarDeclarationContext {
		public TerminalNode ID() { return getToken(StatementsParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(StatementsParser.SEMI, 0); }
		public VarDeclNoAssignContext(VarDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).enterVarDeclNoAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).exitVarDeclNoAssign(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varDeclaration);
		try {
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new VarDeclAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(T__0);
				setState(31);
				match(ID);
				setState(32);
				match(ASSIGN);
				setState(33);
				expression(0);
				setState(34);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new VarDeclNoAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(T__0);
				setState(37);
				match(ID);
				setState(38);
				match(SEMI);
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StatementsParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(StatementsParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(StatementsParser.SEMI, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(ID);
				setState(42);
				match(ASSIGN);
				setState(43);
				expression(0);
				setState(44);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				match(ID);
				setState(47);
				match(SEMI);
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
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(StatementsParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(StatementsParser.RPAREN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__1);
			setState(51);
			match(LPAREN);
			setState(52);
			expression(0);
			setState(53);
			match(RPAREN);
			setState(54);
			block();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(55);
				match(T__2);
				setState(56);
				block();
				}
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
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(StatementsParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(StatementsParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__3);
			setState(60);
			match(LPAREN);
			setState(61);
			expression(0);
			setState(62);
			match(RPAREN);
			setState(63);
			block();
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
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(StatementsParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(StatementsParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__4);
			setState(66);
			match(LPAREN);
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(67);
				varDeclaration();
				}
				break;
			case ID:
				{
				setState(68);
				assignment();
				}
				break;
			case T__5:
				{
				setState(69);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2100992L) != 0)) {
				{
				setState(72);
				expression(0);
				}
			}

			setState(75);
			match(T__5);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2100992L) != 0)) {
				{
				setState(76);
				expression(0);
				}
			}

			setState(79);
			match(RPAREN);
			setState(80);
			block();
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
	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(StatementsParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(StatementsParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(StatementsParser.SEMI, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).exitPrintStatement(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__6);
			setState(83);
			match(LPAREN);
			setState(84);
			expression(0);
			setState(85);
			match(RPAREN);
			setState(86);
			match(SEMI);
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(StatementsParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(StatementsParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(LBRACE);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 10489782L) != 0)) {
				{
				{
				setState(89);
				statement();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			match(RBRACE);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringExprContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(StatementsParser.STRING, 0); }
		public StringExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).enterStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).exitStringExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalWordExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(StatementsParser.AND, 0); }
		public TerminalNode OR() { return getToken(StatementsParser.OR, 0); }
		public LogicalWordExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).enterLogicalWordExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).exitLogicalWordExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberExprContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(StatementsParser.NUMBER, 0); }
		public NumberExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).enterNumberExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).exitNumberExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(StatementsParser.LT, 0); }
		public TerminalNode GT() { return getToken(StatementsParser.GT, 0); }
		public TerminalNode EQ() { return getToken(StatementsParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(StatementsParser.NEQ, 0); }
		public TerminalNode LTE() { return getToken(StatementsParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(StatementsParser.GTE, 0); }
		public ComparisonExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).enterComparisonExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).exitComparisonExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarExprContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(StatementsParser.ID, 0); }
		public VarExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).enterVarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).exitVarExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExprContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(StatementsParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(StatementsParser.RPAREN, 0); }
		public ParenExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).exitParenExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalSymbolExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LOGICAL_AND() { return getToken(StatementsParser.LOGICAL_AND, 0); }
		public TerminalNode LOGICAL_OR() { return getToken(StatementsParser.LOGICAL_OR, 0); }
		public LogicalSymbolExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).enterLogicalSymbolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).exitLogicalSymbolExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanExprContext extends ExpressionContext {
		public TerminalNode BOOLEAN() { return getToken(StatementsParser.BOOLEAN, 0); }
		public BooleanExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).enterBooleanExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).exitBooleanExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MathExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(StatementsParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(StatementsParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(StatementsParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(StatementsParser.DIV, 0); }
		public MathExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).enterMathExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).exitMathExpr(this);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(98);
				match(LPAREN);
				setState(99);
				expression(0);
				setState(100);
				match(RPAREN);
				}
				break;
			case ID:
				{
				_localctx = new VarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102);
				match(ID);
				}
				break;
			case STRING:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				match(STRING);
				}
				break;
			case NUMBER:
				{
				_localctx = new NumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				match(NUMBER);
				}
				break;
			case BOOLEAN:
				{
				_localctx = new BooleanExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(120);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new MathExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(108);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(109);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1966080L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(110);
						expression(10);
						}
						break;
					case 2:
						{
						_localctx = new ComparisonExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(111);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(112);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4227858432L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(113);
						expression(9);
						}
						break;
					case 3:
						{
						_localctx = new LogicalWordExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(114);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(115);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(116);
						expression(8);
						}
						break;
					case 4:
						{
						_localctx = new LogicalSymbolExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(117);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(118);
						_la = _input.LA(1);
						if ( !(_la==LOGICAL_AND || _la==LOGICAL_OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(119);
						expression(7);
						}
						break;
					}
					} 
				}
				setState(124);
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
	public static class PlaceholderContext extends ParserRuleContext {
		public PlaceholderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_placeholder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).enterPlaceholder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StatementsListener ) ((StatementsListener)listener).exitPlaceholder(this);
		}
	}

	public final PlaceholderContext placeholder() throws RecognitionException {
		PlaceholderContext _localctx = new PlaceholderContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_placeholder);
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
		case 8:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\"\u0080\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u001d\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001(\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u00021\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003:\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005G\b\u0005"+
		"\u0001\u0005\u0003\u0005J\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"N\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0005\u0007[\b\u0007\n\u0007\f\u0007^\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\bk\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\by\b\b\n\b\f\b|\t\b\u0001"+
		"\t\u0001\t\u0001\t\u0000\u0001\u0010\n\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0000\u0004\u0001\u0000\u0011\u0014\u0001\u0000\u001a\u001f"+
		"\u0001\u0000\f\r\u0001\u0000\u000e\u000f\u008c\u0000\u001c\u0001\u0000"+
		"\u0000\u0000\u0002\'\u0001\u0000\u0000\u0000\u00040\u0001\u0000\u0000"+
		"\u0000\u00062\u0001\u0000\u0000\u0000\b;\u0001\u0000\u0000\u0000\nA\u0001"+
		"\u0000\u0000\u0000\fR\u0001\u0000\u0000\u0000\u000eX\u0001\u0000\u0000"+
		"\u0000\u0010j\u0001\u0000\u0000\u0000\u0012}\u0001\u0000\u0000\u0000\u0014"+
		"\u001d\u0003\u0002\u0001\u0000\u0015\u001d\u0003\u0004\u0002\u0000\u0016"+
		"\u001d\u0003\u0010\b\u0000\u0017\u001d\u0003\u0006\u0003\u0000\u0018\u001d"+
		"\u0003\b\u0004\u0000\u0019\u001d\u0003\n\u0005\u0000\u001a\u001d\u0003"+
		"\u000e\u0007\u0000\u001b\u001d\u0003\f\u0006\u0000\u001c\u0014\u0001\u0000"+
		"\u0000\u0000\u001c\u0015\u0001\u0000\u0000\u0000\u001c\u0016\u0001\u0000"+
		"\u0000\u0000\u001c\u0017\u0001\u0000\u0000\u0000\u001c\u0018\u0001\u0000"+
		"\u0000\u0000\u001c\u0019\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000"+
		"\u0000\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001d\u0001\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u0005\u0001\u0000\u0000\u001f \u0005\u000b\u0000"+
		"\u0000 !\u0005\u0010\u0000\u0000!\"\u0003\u0010\b\u0000\"#\u0005\u0019"+
		"\u0000\u0000#(\u0001\u0000\u0000\u0000$%\u0005\u0001\u0000\u0000%&\u0005"+
		"\u000b\u0000\u0000&(\u0005\u0019\u0000\u0000\'\u001e\u0001\u0000\u0000"+
		"\u0000\'$\u0001\u0000\u0000\u0000(\u0003\u0001\u0000\u0000\u0000)*\u0005"+
		"\u000b\u0000\u0000*+\u0005\u0010\u0000\u0000+,\u0003\u0010\b\u0000,-\u0005"+
		"\u0019\u0000\u0000-1\u0001\u0000\u0000\u0000./\u0005\u000b\u0000\u0000"+
		"/1\u0005\u0019\u0000\u00000)\u0001\u0000\u0000\u00000.\u0001\u0000\u0000"+
		"\u00001\u0005\u0001\u0000\u0000\u000023\u0005\u0002\u0000\u000034\u0005"+
		"\u0015\u0000\u000045\u0003\u0010\b\u000056\u0005\u0016\u0000\u000069\u0003"+
		"\u000e\u0007\u000078\u0005\u0003\u0000\u00008:\u0003\u000e\u0007\u0000"+
		"97\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:\u0007\u0001\u0000"+
		"\u0000\u0000;<\u0005\u0004\u0000\u0000<=\u0005\u0015\u0000\u0000=>\u0003"+
		"\u0010\b\u0000>?\u0005\u0016\u0000\u0000?@\u0003\u000e\u0007\u0000@\t"+
		"\u0001\u0000\u0000\u0000AB\u0005\u0005\u0000\u0000BF\u0005\u0015\u0000"+
		"\u0000CG\u0003\u0002\u0001\u0000DG\u0003\u0004\u0002\u0000EG\u0005\u0006"+
		"\u0000\u0000FC\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FE\u0001"+
		"\u0000\u0000\u0000GI\u0001\u0000\u0000\u0000HJ\u0003\u0010\b\u0000IH\u0001"+
		"\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000"+
		"KM\u0005\u0006\u0000\u0000LN\u0003\u0010\b\u0000ML\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0005\u0016\u0000"+
		"\u0000PQ\u0003\u000e\u0007\u0000Q\u000b\u0001\u0000\u0000\u0000RS\u0005"+
		"\u0007\u0000\u0000ST\u0005\u0015\u0000\u0000TU\u0003\u0010\b\u0000UV\u0005"+
		"\u0016\u0000\u0000VW\u0005\u0019\u0000\u0000W\r\u0001\u0000\u0000\u0000"+
		"X\\\u0005\u0017\u0000\u0000Y[\u0003\u0000\u0000\u0000ZY\u0001\u0000\u0000"+
		"\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000"+
		"\u0000\u0000]_\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000_`\u0005"+
		"\u0018\u0000\u0000`\u000f\u0001\u0000\u0000\u0000ab\u0006\b\uffff\uffff"+
		"\u0000bc\u0005\u0015\u0000\u0000cd\u0003\u0010\b\u0000de\u0005\u0016\u0000"+
		"\u0000ek\u0001\u0000\u0000\u0000fk\u0005\u000b\u0000\u0000gk\u0005\n\u0000"+
		"\u0000hk\u0005\t\u0000\u0000ik\u0005\b\u0000\u0000ja\u0001\u0000\u0000"+
		"\u0000jf\u0001\u0000\u0000\u0000jg\u0001\u0000\u0000\u0000jh\u0001\u0000"+
		"\u0000\u0000ji\u0001\u0000\u0000\u0000kz\u0001\u0000\u0000\u0000lm\n\t"+
		"\u0000\u0000mn\u0007\u0000\u0000\u0000ny\u0003\u0010\b\nop\n\b\u0000\u0000"+
		"pq\u0007\u0001\u0000\u0000qy\u0003\u0010\b\trs\n\u0007\u0000\u0000st\u0007"+
		"\u0002\u0000\u0000ty\u0003\u0010\b\buv\n\u0006\u0000\u0000vw\u0007\u0003"+
		"\u0000\u0000wy\u0003\u0010\b\u0007xl\u0001\u0000\u0000\u0000xo\u0001\u0000"+
		"\u0000\u0000xr\u0001\u0000\u0000\u0000xu\u0001\u0000\u0000\u0000y|\u0001"+
		"\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{\u0011\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}~\u0001\u0000"+
		"\u0000\u0000~\u0013\u0001\u0000\u0000\u0000\u000b\u001c\'09FIM\\jxz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}