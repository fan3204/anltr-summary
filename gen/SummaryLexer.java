// Generated from /home/x3148/xxxx/src/anltr-summary/g4/SummaryLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SummaryLexer extends Lexer {
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
		ESQLCOMMENT=2, ERRORCHANNEL=3;
	public static final int
		AFTER_DOT=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN", "ESQLCOMMENT", "ERRORCHANNEL"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "AFTER_DOT"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SPACE", "SPEC_ESSQL_COMMENT", "COMMENT_INPUT", "LINE_COMMENT", "MINUS", 
			"STAR", "COLON", "EQ", "NE", "BOOLOR", "BOOLAND", "DOT", "LBRACKET", 
			"RBRACKET", "LPAREN", "RPAREN", "COMMA", "SEMI", "FULLSTOP", "GT", "AFTER", 
			"SINGLE_QUOTE", "DOUBLE_QUOTE", "REVERSE_QUOTE", "UNDERLINE", "CHINESE", 
			"JUDIAN", "ZUJIAN", "FENLEI", "ZHUANGTAI", "WENTI", "DANHAO", "JINZHAN", 
			"ALL_CONTENT", "INT", "FLOAT", "DEC_DIGIT", "ID_LETTER", "A", "B", "C", 
			"D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", 
			"R", "S", "T", "U", "V", "W", "X", "Y", "Z", "DOTINTEGER", "DOTID"
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


	public SummaryLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SummaryLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u019c\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\6\2\u008a\n\2\r\2\16\2\u008b"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\6\3\u0095\n\3\r\3\16\3\u0096\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\7\4\u00a2\n\4\f\4\16\4\u00a5\13\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u00b0\n\5\3\5\7\5\u00b3\n\5\f\5\16\5\u00b6"+
		"\13\5\3\5\5\5\u00b9\n\5\3\5\3\5\5\5\u00bd\n\5\3\5\3\5\3\5\3\5\5\5\u00c3"+
		"\n\5\3\5\3\5\5\5\u00c7\n\5\5\5\u00c9\n\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\5\13\u00db\n\13\3\f\3\f\3\f\5\f"+
		"\u00e0\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\6#\u0129\n#\r#\16#\u012a\3$\5$\u012e"+
		"\n$\3$\6$\u0131\n$\r$\16$\u0132\3%\5%\u0136\n%\3%\6%\u0139\n%\r%\16%\u013a"+
		"\3%\3%\6%\u013f\n%\r%\16%\u0140\3%\5%\u0144\n%\3%\3%\6%\u0148\n%\r%\16"+
		"%\u0149\5%\u014c\n%\3&\3&\3\'\3\'\5\'\u0152\n\'\3(\3(\3)\3)\3*\3*\3+\3"+
		"+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64"+
		"\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3"+
		"=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3B\7B\u018b\nB\fB\16B\u018e\13B\5B\u0190"+
		"\nB\3B\3B\3C\3C\7C\u0196\nC\fC\16C\u0199\13C\3C\3C\4\u0096\u00a3\2D\4"+
		"\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f\30\r\32\16\34\17\36\20 \21"+
		"\"\22$\23&\24(\25*\26,\27.\30\60\31\62\32\64\33\66\348\35:\36<\37> @!"+
		"B\"D#F$H%J&L\2N\2P\2R\2T\2V\2X\2Z\2\\\2^\2`\2b\2d\2f\2h\2j\2l\2n\2p\2"+
		"r\2t\2v\2x\2z\2|\2~\2\u0080\2\u0082\2\u0084\'\u0086(\4\2\3&\5\2\13\f\17"+
		"\17\"\"\4\2\f\f\17\17\4\2<<\uff1c\uff1c\4\2..\uff0e\uff0e\4\2==\uff1d"+
		"\uff1d\3\2\62;\4\2C\\c|\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HH"+
		"hh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2"+
		"QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4"+
		"\2ZZzz\4\2[[{{\4\2\\\\||\3\2\63;\5\2C\\aac|\6\2\62;C\\aac|\2\u01a4\2\4"+
		"\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2"+
		"\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32"+
		"\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2"+
		"&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62"+
		"\3\2\2\2\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2"+
		">\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\2J\3"+
		"\2\2\2\3\u0084\3\2\2\2\3\u0086\3\2\2\2\4\u0089\3\2\2\2\6\u008f\3\2\2\2"+
		"\b\u009d\3\2\2\2\n\u00c8\3\2\2\2\f\u00cc\3\2\2\2\16\u00ce\3\2\2\2\20\u00d0"+
		"\3\2\2\2\22\u00d2\3\2\2\2\24\u00d4\3\2\2\2\26\u00da\3\2\2\2\30\u00df\3"+
		"\2\2\2\32\u00e1\3\2\2\2\34\u00e5\3\2\2\2\36\u00e7\3\2\2\2 \u00e9\3\2\2"+
		"\2\"\u00eb\3\2\2\2$\u00ed\3\2\2\2&\u00ef\3\2\2\2(\u00f1\3\2\2\2*\u00f3"+
		"\3\2\2\2,\u00f5\3\2\2\2.\u00fb\3\2\2\2\60\u00fd\3\2\2\2\62\u00ff\3\2\2"+
		"\2\64\u0101\3\2\2\2\66\u0103\3\2\2\28\u0105\3\2\2\2:\u0108\3\2\2\2<\u010b"+
		"\3\2\2\2>\u010e\3\2\2\2@\u0111\3\2\2\2B\u0114\3\2\2\2D\u0117\3\2\2\2F"+
		"\u0128\3\2\2\2H\u012d\3\2\2\2J\u014b\3\2\2\2L\u014d\3\2\2\2N\u0151\3\2"+
		"\2\2P\u0153\3\2\2\2R\u0155\3\2\2\2T\u0157\3\2\2\2V\u0159\3\2\2\2X\u015b"+
		"\3\2\2\2Z\u015d\3\2\2\2\\\u015f\3\2\2\2^\u0161\3\2\2\2`\u0163\3\2\2\2"+
		"b\u0165\3\2\2\2d\u0167\3\2\2\2f\u0169\3\2\2\2h\u016b\3\2\2\2j\u016d\3"+
		"\2\2\2l\u016f\3\2\2\2n\u0171\3\2\2\2p\u0173\3\2\2\2r\u0175\3\2\2\2t\u0177"+
		"\3\2\2\2v\u0179\3\2\2\2x\u017b\3\2\2\2z\u017d\3\2\2\2|\u017f\3\2\2\2~"+
		"\u0181\3\2\2\2\u0080\u0183\3\2\2\2\u0082\u0185\3\2\2\2\u0084\u018f\3\2"+
		"\2\2\u0086\u0193\3\2\2\2\u0088\u008a\t\2\2\2\u0089\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u008e\b\2\2\2\u008e\5\3\2\2\2\u008f\u0090\7\61\2\2\u0090\u0091"+
		"\7,\2\2\u0091\u0092\7#\2\2\u0092\u0094\3\2\2\2\u0093\u0095\13\2\2\2\u0094"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7,\2\2\u0099\u009a\7\61\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009c\b\3\3\2\u009c\7\3\2\2\2\u009d\u009e\7\61\2"+
		"\2\u009e\u009f\7,\2\2\u009f\u00a3\3\2\2\2\u00a0\u00a2\13\2\2\2\u00a1\u00a0"+
		"\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7,\2\2\u00a7\u00a8\7\61"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\b\4\2\2\u00aa\t\3\2\2\2\u00ab\u00ac"+
		"\7/\2\2\u00ac\u00ad\7/\2\2\u00ad\u00b0\7\"\2\2\u00ae\u00b0\7%\2\2\u00af"+
		"\u00ab\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b4\3\2\2\2\u00b1\u00b3\n\3"+
		"\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00bc\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b9\7\17"+
		"\2\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bd\7\f\2\2\u00bb\u00bd\7\2\2\3\u00bc\u00b8\3\2\2\2\u00bc\u00bb\3\2"+
		"\2\2\u00bd\u00c9\3\2\2\2\u00be\u00bf\7/\2\2\u00bf\u00c0\7/\2\2\u00c0\u00c6"+
		"\3\2\2\2\u00c1\u00c3\7\17\2\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2"+
		"\u00c3\u00c4\3\2\2\2\u00c4\u00c7\7\f\2\2\u00c5\u00c7\7\2\2\3\u00c6\u00c2"+
		"\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00af\3\2\2\2\u00c8"+
		"\u00be\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\b\5\2\2\u00cb\13\3\2\2"+
		"\2\u00cc\u00cd\7/\2\2\u00cd\r\3\2\2\2\u00ce\u00cf\7,\2\2\u00cf\17\3\2"+
		"\2\2\u00d0\u00d1\t\4\2\2\u00d1\21\3\2\2\2\u00d2\u00d3\7?\2\2\u00d3\23"+
		"\3\2\2\2\u00d4\u00d5\7#\2\2\u00d5\u00d6\7?\2\2\u00d6\25\3\2\2\2\u00d7"+
		"\u00d8\7~\2\2\u00d8\u00db\7~\2\2\u00d9\u00db\7~\2\2\u00da\u00d7\3\2\2"+
		"\2\u00da\u00d9\3\2\2\2\u00db\27\3\2\2\2\u00dc\u00dd\7(\2\2\u00dd\u00e0"+
		"\7(\2\2\u00de\u00e0\7(\2\2\u00df\u00dc\3\2\2\2\u00df\u00de\3\2\2\2\u00e0"+
		"\31\3\2\2\2\u00e1\u00e2\7\60\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\b\r\4"+
		"\2\u00e4\33\3\2\2\2\u00e5\u00e6\7]\2\2\u00e6\35\3\2\2\2\u00e7\u00e8\7"+
		"_\2\2\u00e8\37\3\2\2\2\u00e9\u00ea\7*\2\2\u00ea!\3\2\2\2\u00eb\u00ec\7"+
		"+\2\2\u00ec#\3\2\2\2\u00ed\u00ee\t\5\2\2\u00ee%\3\2\2\2\u00ef\u00f0\t"+
		"\6\2\2\u00f0\'\3\2\2\2\u00f1\u00f2\7\u3004\2\2\u00f2)\3\2\2\2\u00f3\u00f4"+
		"\7@\2\2\u00f4+\3\2\2\2\u00f5\u00f6\5P(\2\u00f6\u00f7\5Z-\2\u00f7\u00f8"+
		"\5v;\2\u00f8\u00f9\5X,\2\u00f9\u00fa\5r9\2\u00fa-\3\2\2\2\u00fb\u00fc"+
		"\7)\2\2\u00fc/\3\2\2\2\u00fd\u00fe\7$\2\2\u00fe\61\3\2\2\2\u00ff\u0100"+
		"\7b\2\2\u0100\63\3\2\2\2\u0101\u0102\7a\2\2\u0102\65\3\2\2\2\u0103\u0104"+
		"\4\u4e02\u9fa7\2\u0104\67\3\2\2\2\u0105\u0106\7\u5c42\2\2\u0106\u0107"+
		"\7\u70bb\2\2\u01079\3\2\2\2\u0108\u0109\7\u7ec6\2\2\u0109\u010a\7\u4ef8"+
		"\2\2\u010a;\3\2\2\2\u010b\u010c\7\u5208\2\2\u010c\u010d\7\u7c7d\2\2\u010d"+
		"=\3\2\2\2\u010e\u010f\7\u72b8\2\2\u010f\u0110\7\u6003\2\2\u0110?\3\2\2"+
		"\2\u0111\u0112\7\u95f0\2\2\u0112\u0113\7\u989a\2\2\u0113A\3\2\2\2\u0114"+
		"\u0115\7\u5357\2\2\u0115\u0116\7\u53f9\2\2\u0116C\3\2\2\2\u0117\u0118"+
		"\7\u8fdd\2\2\u0118\u0119\7\u5c57\2\2\u0119E\3\2\2\2\u011a\u0129\5\66\33"+
		"\2\u011b\u0129\5N\'\2\u011c\u0129\5\32\r\2\u011d\u0129\5\f\6\2\u011e\u0129"+
		"\5\64\32\2\u011f\u0129\5H$\2\u0120\u0129\5J%\2\u0121\u0129\5\62\31\2\u0122"+
		"\u0129\5\60\30\2\u0123\u0129\5.\27\2\u0124\u0129\5\20\b\2\u0125\u0129"+
		"\5\26\13\2\u0126\u0129\5\30\f\2\u0127\u0129\5$\22\2\u0128\u011a\3\2\2"+
		"\2\u0128\u011b\3\2\2\2\u0128\u011c\3\2\2\2\u0128\u011d\3\2\2\2\u0128\u011e"+
		"\3\2\2\2\u0128\u011f\3\2\2\2\u0128\u0120\3\2\2\2\u0128\u0121\3\2\2\2\u0128"+
		"\u0122\3\2\2\2\u0128\u0123\3\2\2\2\u0128\u0124\3\2\2\2\u0128\u0125\3\2"+
		"\2\2\u0128\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012bG\3\2\2\2\u012c\u012e\5\f\6\2"+
		"\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u0131"+
		"\5L&\2\u0130\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133I\3\2\2\2\u0134\u0136\5\f\6\2\u0135\u0134\3\2\2\2"+
		"\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0139\5L&\2\u0138\u0137"+
		"\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013e\5\32\r\2\u013d\u013f\5L&\2\u013e\u013d\3\2"+
		"\2\2\u013f\u0140\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u014c\3\2\2\2\u0142\u0144\5\f\6\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2"+
		"\2\2\u0144\u0145\3\2\2\2\u0145\u0147\5\32\r\2\u0146\u0148\5L&\2\u0147"+
		"\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2"+
		"\2\2\u014a\u014c\3\2\2\2\u014b\u0135\3\2\2\2\u014b\u0143\3\2\2\2\u014c"+
		"K\3\2\2\2\u014d\u014e\t\7\2\2\u014eM\3\2\2\2\u014f\u0152\t\b\2\2\u0150"+
		"\u0152\5\64\32\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0152O\3\2\2"+
		"\2\u0153\u0154\t\t\2\2\u0154Q\3\2\2\2\u0155\u0156\t\n\2\2\u0156S\3\2\2"+
		"\2\u0157\u0158\t\13\2\2\u0158U\3\2\2\2\u0159\u015a\t\f\2\2\u015aW\3\2"+
		"\2\2\u015b\u015c\t\r\2\2\u015cY\3\2\2\2\u015d\u015e\t\16\2\2\u015e[\3"+
		"\2\2\2\u015f\u0160\t\17\2\2\u0160]\3\2\2\2\u0161\u0162\t\20\2\2\u0162"+
		"_\3\2\2\2\u0163\u0164\t\21\2\2\u0164a\3\2\2\2\u0165\u0166\t\22\2\2\u0166"+
		"c\3\2\2\2\u0167\u0168\t\23\2\2\u0168e\3\2\2\2\u0169\u016a\t\24\2\2\u016a"+
		"g\3\2\2\2\u016b\u016c\t\25\2\2\u016ci\3\2\2\2\u016d\u016e\t\26\2\2\u016e"+
		"k\3\2\2\2\u016f\u0170\t\27\2\2\u0170m\3\2\2\2\u0171\u0172\t\30\2\2\u0172"+
		"o\3\2\2\2\u0173\u0174\t\31\2\2\u0174q\3\2\2\2\u0175\u0176\t\32\2\2\u0176"+
		"s\3\2\2\2\u0177\u0178\t\33\2\2\u0178u\3\2\2\2\u0179\u017a\t\34\2\2\u017a"+
		"w\3\2\2\2\u017b\u017c\t\35\2\2\u017cy\3\2\2\2\u017d\u017e\t\36\2\2\u017e"+
		"{\3\2\2\2\u017f\u0180\t\37\2\2\u0180}\3\2\2\2\u0181\u0182\t \2\2\u0182"+
		"\177\3\2\2\2\u0183\u0184\t!\2\2\u0184\u0081\3\2\2\2\u0185\u0186\t\"\2"+
		"\2\u0186\u0083\3\2\2\2\u0187\u0190\7\62\2\2\u0188\u018c\t#\2\2\u0189\u018b"+
		"\t\7\2\2\u018a\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0187\3\2"+
		"\2\2\u018f\u0188\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\bB\5\2\u0192"+
		"\u0085\3\2\2\2\u0193\u0197\t$\2\2\u0194\u0196\t%\2\2\u0195\u0194\3\2\2"+
		"\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a"+
		"\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019b\bC\5\2\u019b\u0087\3\2\2\2\36"+
		"\2\3\u008b\u0096\u00a3\u00af\u00b4\u00b8\u00bc\u00c2\u00c6\u00c8\u00da"+
		"\u00df\u0128\u012a\u012d\u0132\u0135\u013a\u0140\u0143\u0149\u014b\u0151"+
		"\u018c\u018f\u0197\6\2\3\2\2\4\2\4\3\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}