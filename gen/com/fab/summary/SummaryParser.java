// Generated from /home/x3148/xxxx/src/anltr-summary/g4/SummaryParser.g4 by ANTLR 4.9.2
package com.fab.summary;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SummaryParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, SPEC_ESSQL_COMMENT=2, COMMENT_INPUT=3, LINE_COMMENT=4, MINUS=5, 
		STAR=6, COLON=7, EQ=8, NE=9, BOOLOR=10, BOOLAND=11, DOT=12, LBRACKET=13, 
		RBRACKET=14, LPAREN=15, RPAREN=16, COMMA=17, SEMI=18, FULLSTOP=19, GT=20, 
		AFTER=21, SINGLE_QUOTE=22, DOUBLE_QUOTE=23, REVERSE_QUOTE=24, UNDERLINE=25, 
		CHINESE=26, JUDIAN=27, ZUJIAN=28, FENLEI=29, ZHUANGTAI=30, WENTI=31, DANHAO=32, 
		JINZHAN=33, ALL_CONTENT=34, INT=35, FLOAT=36, DOTINTEGER=37, DOTID=38;
	public static final int
		RULE_other = 0, RULE_point = 1, RULE_module = 2, RULE_type = 3, RULE_status = 4, 
		RULE_issue = 5, RULE_jira = 6, RULE_expression = 7, RULE_expressions = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"other", "point", "module", "type", "status", "issue", "jira", "expression", 
			"expressions"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'-'", "'*'", null, "'='", "'!='", null, 
			null, "'.'", "'['", "']'", "'('", "')'", null, null, "'\u3002'", "'>'", 
			null, "'''", "'\"'", "'`'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACE", "SPEC_ESSQL_COMMENT", "COMMENT_INPUT", "LINE_COMMENT", 
			"MINUS", "STAR", "COLON", "EQ", "NE", "BOOLOR", "BOOLAND", "DOT", "LBRACKET", 
			"RBRACKET", "LPAREN", "RPAREN", "COMMA", "SEMI", "FULLSTOP", "GT", "AFTER", 
			"SINGLE_QUOTE", "DOUBLE_QUOTE", "REVERSE_QUOTE", "UNDERLINE", "CHINESE", 
			"JUDIAN", "ZUJIAN", "FENLEI", "ZHUANGTAI", "WENTI", "DANHAO", "JINZHAN", 
			"ALL_CONTENT", "INT", "FLOAT", "DOTINTEGER", "DOTID"
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
	public String getGrammarFileName() { return "SummaryParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SummaryParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class OtherContext extends ParserRuleContext {
		public TerminalNode ALL_CONTENT() { return getToken(SummaryParser.ALL_CONTENT, 0); }
		public OtherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SummaryParserListener ) ((SummaryParserListener)listener).enterOther(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SummaryParserListener ) ((SummaryParserListener)listener).exitOther(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SummaryParserVisitor ) return ((SummaryParserVisitor<? extends T>)visitor).visitOther(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherContext other() throws RecognitionException {
		OtherContext _localctx = new OtherContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_other);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(ALL_CONTENT);
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

	public static class PointContext extends ParserRuleContext {
		public Token leftExpr;
		public Token operator;
		public Token rightExpr;
		public TerminalNode JUDIAN() { return getToken(SummaryParser.JUDIAN, 0); }
		public TerminalNode EQ() { return getToken(SummaryParser.EQ, 0); }
		public TerminalNode ALL_CONTENT() { return getToken(SummaryParser.ALL_CONTENT, 0); }
		public PointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_point; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SummaryParserListener ) ((SummaryParserListener)listener).enterPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SummaryParserListener ) ((SummaryParserListener)listener).exitPoint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SummaryParserVisitor ) return ((SummaryParserVisitor<? extends T>)visitor).visitPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointContext point() throws RecognitionException {
		PointContext _localctx = new PointContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_point);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			((PointContext)_localctx).leftExpr = match(JUDIAN);
			setState(21);
			((PointContext)_localctx).operator = match(EQ);
			setState(22);
			((PointContext)_localctx).rightExpr = match(ALL_CONTENT);
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

	public static class ModuleContext extends ParserRuleContext {
		public Token leftExpr;
		public Token operator;
		public Token rightExpr;
		public TerminalNode ZUJIAN() { return getToken(SummaryParser.ZUJIAN, 0); }
		public TerminalNode EQ() { return getToken(SummaryParser.EQ, 0); }
		public TerminalNode ALL_CONTENT() { return getToken(SummaryParser.ALL_CONTENT, 0); }
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SummaryParserListener ) ((SummaryParserListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SummaryParserListener ) ((SummaryParserListener)listener).exitModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SummaryParserVisitor ) return ((SummaryParserVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_module);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			((ModuleContext)_localctx).leftExpr = match(ZUJIAN);
			setState(25);
			((ModuleContext)_localctx).operator = match(EQ);
			setState(26);
			((ModuleContext)_localctx).rightExpr = match(ALL_CONTENT);
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

	public static class TypeContext extends ParserRuleContext {
		public Token leftExpr;
		public Token operator;
		public Token rightExpr;
		public TerminalNode FENLEI() { return getToken(SummaryParser.FENLEI, 0); }
		public TerminalNode EQ() { return getToken(SummaryParser.EQ, 0); }
		public TerminalNode ALL_CONTENT() { return getToken(SummaryParser.ALL_CONTENT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SummaryParserListener ) ((SummaryParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SummaryParserListener ) ((SummaryParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SummaryParserVisitor ) return ((SummaryParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			((TypeContext)_localctx).leftExpr = match(FENLEI);
			setState(29);
			((TypeContext)_localctx).operator = match(EQ);
			setState(30);
			((TypeContext)_localctx).rightExpr = match(ALL_CONTENT);
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

	public static class StatusContext extends ParserRuleContext {
		public Token leftExpr;
		public Token operator;
		public Token rightExpr;
		public TerminalNode ZHUANGTAI() { return getToken(SummaryParser.ZHUANGTAI, 0); }
		public TerminalNode EQ() { return getToken(SummaryParser.EQ, 0); }
		public TerminalNode ALL_CONTENT() { return getToken(SummaryParser.ALL_CONTENT, 0); }
		public StatusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_status; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SummaryParserListener ) ((SummaryParserListener)listener).enterStatus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SummaryParserListener ) ((SummaryParserListener)listener).exitStatus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SummaryParserVisitor ) return ((SummaryParserVisitor<? extends T>)visitor).visitStatus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatusContext status() throws RecognitionException {
		StatusContext _localctx = new StatusContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_status);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			((StatusContext)_localctx).leftExpr = match(ZHUANGTAI);
			setState(33);
			((StatusContext)_localctx).operator = match(EQ);
			setState(34);
			((StatusContext)_localctx).rightExpr = match(ALL_CONTENT);
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

	public static class IssueContext extends ParserRuleContext {
		public Token leftExpr;
		public Token operator;
		public Token rightExpr;
		public TerminalNode WENTI() { return getToken(SummaryParser.WENTI, 0); }
		public TerminalNode EQ() { return getToken(SummaryParser.EQ, 0); }
		public TerminalNode ALL_CONTENT() { return getToken(SummaryParser.ALL_CONTENT, 0); }
		public IssueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_issue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SummaryParserListener ) ((SummaryParserListener)listener).enterIssue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SummaryParserListener ) ((SummaryParserListener)listener).exitIssue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SummaryParserVisitor ) return ((SummaryParserVisitor<? extends T>)visitor).visitIssue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IssueContext issue() throws RecognitionException {
		IssueContext _localctx = new IssueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_issue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			((IssueContext)_localctx).leftExpr = match(WENTI);
			setState(37);
			((IssueContext)_localctx).operator = match(EQ);
			setState(38);
			((IssueContext)_localctx).rightExpr = match(ALL_CONTENT);
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

	public static class JiraContext extends ParserRuleContext {
		public Token leftExpr;
		public Token operator;
		public Token rightExpr;
		public TerminalNode DANHAO() { return getToken(SummaryParser.DANHAO, 0); }
		public TerminalNode EQ() { return getToken(SummaryParser.EQ, 0); }
		public TerminalNode ALL_CONTENT() { return getToken(SummaryParser.ALL_CONTENT, 0); }
		public JiraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jira; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SummaryParserListener ) ((SummaryParserListener)listener).enterJira(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SummaryParserListener ) ((SummaryParserListener)listener).exitJira(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SummaryParserVisitor ) return ((SummaryParserVisitor<? extends T>)visitor).visitJira(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JiraContext jira() throws RecognitionException {
		JiraContext _localctx = new JiraContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_jira);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			((JiraContext)_localctx).leftExpr = match(DANHAO);
			setState(41);
			((JiraContext)_localctx).operator = match(EQ);
			setState(42);
			((JiraContext)_localctx).rightExpr = match(ALL_CONTENT);
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

	public static class ExpressionContext extends ParserRuleContext {
		public PointContext point() {
			return getRuleContext(PointContext.class,0);
		}
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public StatusContext status() {
			return getRuleContext(StatusContext.class,0);
		}
		public IssueContext issue() {
			return getRuleContext(IssueContext.class,0);
		}
		public JiraContext jira() {
			return getRuleContext(JiraContext.class,0);
		}
		public OtherContext other() {
			return getRuleContext(OtherContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SummaryParserListener ) ((SummaryParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SummaryParserListener ) ((SummaryParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SummaryParserVisitor ) return ((SummaryParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JUDIAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				point();
				}
				break;
			case ZUJIAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				module();
				}
				break;
			case FENLEI:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				type();
				}
				break;
			case ZHUANGTAI:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				status();
				}
				break;
			case WENTI:
				enterOuterAlt(_localctx, 5);
				{
				setState(48);
				issue();
				}
				break;
			case DANHAO:
				enterOuterAlt(_localctx, 6);
				{
				setState(49);
				jira();
				}
				break;
			case ALL_CONTENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(50);
				other();
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

	public static class ExpressionsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(SummaryParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(SummaryParser.SEMI, i);
		}
		public List<TerminalNode> FULLSTOP() { return getTokens(SummaryParser.FULLSTOP); }
		public TerminalNode FULLSTOP(int i) {
			return getToken(SummaryParser.FULLSTOP, i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SummaryParserListener ) ((SummaryParserListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SummaryParserListener ) ((SummaryParserListener)listener).exitExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SummaryParserVisitor ) return ((SummaryParserVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(53);
				expression();
				setState(54);
				_la = _input.LA(1);
				if ( !(_la==SEMI || _la==FULLSTOP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JUDIAN) | (1L << ZUJIAN) | (1L << FENLEI) | (1L << ZHUANGTAI) | (1L << WENTI) | (1L << DANHAO) | (1L << ALL_CONTENT))) != 0) );
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(?\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\66\n\t\3\n\3\n\3"+
		"\n\6\n;\n\n\r\n\16\n<\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\3\3\2\24\25\2"+
		"<\2\24\3\2\2\2\4\26\3\2\2\2\6\32\3\2\2\2\b\36\3\2\2\2\n\"\3\2\2\2\f&\3"+
		"\2\2\2\16*\3\2\2\2\20\65\3\2\2\2\22:\3\2\2\2\24\25\7$\2\2\25\3\3\2\2\2"+
		"\26\27\7\35\2\2\27\30\7\n\2\2\30\31\7$\2\2\31\5\3\2\2\2\32\33\7\36\2\2"+
		"\33\34\7\n\2\2\34\35\7$\2\2\35\7\3\2\2\2\36\37\7\37\2\2\37 \7\n\2\2 !"+
		"\7$\2\2!\t\3\2\2\2\"#\7 \2\2#$\7\n\2\2$%\7$\2\2%\13\3\2\2\2&\'\7!\2\2"+
		"\'(\7\n\2\2()\7$\2\2)\r\3\2\2\2*+\7\"\2\2+,\7\n\2\2,-\7$\2\2-\17\3\2\2"+
		"\2.\66\5\4\3\2/\66\5\6\4\2\60\66\5\b\5\2\61\66\5\n\6\2\62\66\5\f\7\2\63"+
		"\66\5\16\b\2\64\66\5\2\2\2\65.\3\2\2\2\65/\3\2\2\2\65\60\3\2\2\2\65\61"+
		"\3\2\2\2\65\62\3\2\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66\21\3\2\2\2\678\5"+
		"\20\t\289\t\2\2\29;\3\2\2\2:\67\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2"+
		"=\23\3\2\2\2\4\65<";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}