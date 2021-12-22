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
		CHINESE=26, JUDIAN=27, WENTI=28, JINZHAN=29, ID=30, INT=31, FLOAT=32, 
		DOTINTEGER=33, DOTID=34;
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
			"JUDIAN", "WENTI", "JINZHAN", "ID", "INT", "FLOAT", "DEC_DIGIT", "ID_LETTER", 
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "DOTINTEGER", 
			"DOTID"
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
			"JUDIAN", "WENTI", "JINZHAN", "ID", "INT", "FLOAT", "DOTINTEGER", "DOTID"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u0188\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\3\2\6\2\u0082\n\2\r\2\16\2\u0083\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\6\3\u008d\n\3\r\3\16\3\u008e\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\7\4\u009a\n\4\f\4\16\4\u009d\13\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\5\5\u00a8\n\5\3\5\7\5\u00ab\n\5\f\5\16\5\u00ae\13\5\3\5\5\5\u00b1\n\5"+
		"\3\5\3\5\5\5\u00b5\n\5\3\5\3\5\3\5\3\5\5\5\u00bb\n\5\3\5\3\5\5\5\u00bf"+
		"\n\5\5\5\u00c1\n\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\5\13\u00d3\n\13\3\f\3\f\3\f\5\f\u00d8\n\f\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\6\37\u0115\n\37\r\37\16\37\u0116\3 \5 \u011a\n \3 \6 \u011d\n \r \16"+
		" \u011e\3!\5!\u0122\n!\3!\6!\u0125\n!\r!\16!\u0126\3!\3!\6!\u012b\n!\r"+
		"!\16!\u012c\3!\5!\u0130\n!\3!\3!\6!\u0134\n!\r!\16!\u0135\5!\u0138\n!"+
		"\3\"\3\"\3#\3#\5#\u013e\n#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3"+
		"*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63"+
		"\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3"+
		"<\3=\3=\3>\3>\3>\7>\u0177\n>\f>\16>\u017a\13>\5>\u017c\n>\3>\3>\3?\3?"+
		"\7?\u0182\n?\f?\16?\u0185\13?\3?\3?\4\u008e\u009b\2@\4\3\6\4\b\5\n\6\f"+
		"\7\16\b\20\t\22\n\24\13\26\f\30\r\32\16\34\17\36\20 \21\"\22$\23&\24("+
		"\25*\26,\27.\30\60\31\62\32\64\33\66\348\35:\36<\37> @!B\"D\2F\2H\2J\2"+
		"L\2N\2P\2R\2T\2V\2X\2Z\2\\\2^\2`\2b\2d\2f\2h\2j\2l\2n\2p\2r\2t\2v\2x\2"+
		"z\2|#~$\4\2\3&\5\2\13\f\17\17\"\"\4\2\f\f\17\17\4\2<<\uff1c\uff1c\4\2"+
		"..\uff0e\uff0e\4\2==\uff1d\uff1d\3\2\62;\4\2C\\c|\4\2CCcc\4\2DDdd\4\2"+
		"EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4"+
		"\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVv"+
		"v\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\3\2\63;\5\2C\\aac"+
		"|\6\2\62;C\\aac|\2\u0190\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2"+
		"\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26"+
		"\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2"+
		"\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2"+
		"\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2"+
		"\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2\3|\3\2\2\2"+
		"\3~\3\2\2\2\4\u0081\3\2\2\2\6\u0087\3\2\2\2\b\u0095\3\2\2\2\n\u00c0\3"+
		"\2\2\2\f\u00c4\3\2\2\2\16\u00c6\3\2\2\2\20\u00c8\3\2\2\2\22\u00ca\3\2"+
		"\2\2\24\u00cc\3\2\2\2\26\u00d2\3\2\2\2\30\u00d7\3\2\2\2\32\u00d9\3\2\2"+
		"\2\34\u00dd\3\2\2\2\36\u00df\3\2\2\2 \u00e1\3\2\2\2\"\u00e3\3\2\2\2$\u00e5"+
		"\3\2\2\2&\u00e7\3\2\2\2(\u00e9\3\2\2\2*\u00eb\3\2\2\2,\u00ed\3\2\2\2."+
		"\u00f3\3\2\2\2\60\u00f5\3\2\2\2\62\u00f7\3\2\2\2\64\u00f9\3\2\2\2\66\u00fb"+
		"\3\2\2\28\u00fd\3\2\2\2:\u0100\3\2\2\2<\u0103\3\2\2\2>\u0114\3\2\2\2@"+
		"\u0119\3\2\2\2B\u0137\3\2\2\2D\u0139\3\2\2\2F\u013d\3\2\2\2H\u013f\3\2"+
		"\2\2J\u0141\3\2\2\2L\u0143\3\2\2\2N\u0145\3\2\2\2P\u0147\3\2\2\2R\u0149"+
		"\3\2\2\2T\u014b\3\2\2\2V\u014d\3\2\2\2X\u014f\3\2\2\2Z\u0151\3\2\2\2\\"+
		"\u0153\3\2\2\2^\u0155\3\2\2\2`\u0157\3\2\2\2b\u0159\3\2\2\2d\u015b\3\2"+
		"\2\2f\u015d\3\2\2\2h\u015f\3\2\2\2j\u0161\3\2\2\2l\u0163\3\2\2\2n\u0165"+
		"\3\2\2\2p\u0167\3\2\2\2r\u0169\3\2\2\2t\u016b\3\2\2\2v\u016d\3\2\2\2x"+
		"\u016f\3\2\2\2z\u0171\3\2\2\2|\u017b\3\2\2\2~\u017f\3\2\2\2\u0080\u0082"+
		"\t\2\2\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\b\2\2\2\u0086\5\3\2\2\2"+
		"\u0087\u0088\7\61\2\2\u0088\u0089\7,\2\2\u0089\u008a\7#\2\2\u008a\u008c"+
		"\3\2\2\2\u008b\u008d\13\2\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2"+
		"\u008e\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091"+
		"\7,\2\2\u0091\u0092\7\61\2\2\u0092\u0093\3\2\2\2\u0093\u0094\b\3\3\2\u0094"+
		"\7\3\2\2\2\u0095\u0096\7\61\2\2\u0096\u0097\7,\2\2\u0097\u009b\3\2\2\2"+
		"\u0098\u009a\13\2\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e"+
		"\u009f\7,\2\2\u009f\u00a0\7\61\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\b\4"+
		"\2\2\u00a2\t\3\2\2\2\u00a3\u00a4\7/\2\2\u00a4\u00a5\7/\2\2\u00a5\u00a8"+
		"\7\"\2\2\u00a6\u00a8\7%\2\2\u00a7\u00a3\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8"+
		"\u00ac\3\2\2\2\u00a9\u00ab\n\3\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2"+
		"\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b4\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00af\u00b1\7\17\2\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3"+
		"\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b5\7\f\2\2\u00b3\u00b5\7\2\2\3\u00b4"+
		"\u00b0\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00c1\3\2\2\2\u00b6\u00b7\7/"+
		"\2\2\u00b7\u00b8\7/\2\2\u00b8\u00be\3\2\2\2\u00b9\u00bb\7\17\2\2\u00ba"+
		"\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bf\7\f"+
		"\2\2\u00bd\u00bf\7\2\2\3\u00be\u00ba\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\u00c1\3\2\2\2\u00c0\u00a7\3\2\2\2\u00c0\u00b6\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c3\b\5\2\2\u00c3\13\3\2\2\2\u00c4\u00c5\7/\2\2\u00c5\r\3"+
		"\2\2\2\u00c6\u00c7\7,\2\2\u00c7\17\3\2\2\2\u00c8\u00c9\t\4\2\2\u00c9\21"+
		"\3\2\2\2\u00ca\u00cb\7?\2\2\u00cb\23\3\2\2\2\u00cc\u00cd\7#\2\2\u00cd"+
		"\u00ce\7?\2\2\u00ce\25\3\2\2\2\u00cf\u00d0\7~\2\2\u00d0\u00d3\7~\2\2\u00d1"+
		"\u00d3\7~\2\2\u00d2\u00cf\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\27\3\2\2\2"+
		"\u00d4\u00d5\7(\2\2\u00d5\u00d8\7(\2\2\u00d6\u00d8\7(\2\2\u00d7\u00d4"+
		"\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\31\3\2\2\2\u00d9\u00da\7\60\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00dc\b\r\4\2\u00dc\33\3\2\2\2\u00dd\u00de\7]\2\2"+
		"\u00de\35\3\2\2\2\u00df\u00e0\7_\2\2\u00e0\37\3\2\2\2\u00e1\u00e2\7*\2"+
		"\2\u00e2!\3\2\2\2\u00e3\u00e4\7+\2\2\u00e4#\3\2\2\2\u00e5\u00e6\t\5\2"+
		"\2\u00e6%\3\2\2\2\u00e7\u00e8\t\6\2\2\u00e8\'\3\2\2\2\u00e9\u00ea\7\u3004"+
		"\2\2\u00ea)\3\2\2\2\u00eb\u00ec\7@\2\2\u00ec+\3\2\2\2\u00ed\u00ee\5H$"+
		"\2\u00ee\u00ef\5R)\2\u00ef\u00f0\5n\67\2\u00f0\u00f1\5P(\2\u00f1\u00f2"+
		"\5j\65\2\u00f2-\3\2\2\2\u00f3\u00f4\7)\2\2\u00f4/\3\2\2\2\u00f5\u00f6"+
		"\7$\2\2\u00f6\61\3\2\2\2\u00f7\u00f8\7b\2\2\u00f8\63\3\2\2\2\u00f9\u00fa"+
		"\7a\2\2\u00fa\65\3\2\2\2\u00fb\u00fc\4\u4e02\u9fa7\2\u00fc\67\3\2\2\2"+
		"\u00fd\u00fe\7\u5c42\2\2\u00fe\u00ff\7\u70bb\2\2\u00ff9\3\2\2\2\u0100"+
		"\u0101\7\u95f0\2\2\u0101\u0102\7\u989a\2\2\u0102;\3\2\2\2\u0103\u0104"+
		"\7\u8fdd\2\2\u0104\u0105\7\u5c57\2\2\u0105=\3\2\2\2\u0106\u0115\5\66\33"+
		"\2\u0107\u0115\5F#\2\u0108\u0115\5\32\r\2\u0109\u0115\5\f\6\2\u010a\u0115"+
		"\5\64\32\2\u010b\u0115\5@ \2\u010c\u0115\5B!\2\u010d\u0115\5\62\31\2\u010e"+
		"\u0115\5\60\30\2\u010f\u0115\5.\27\2\u0110\u0115\5\20\b\2\u0111\u0115"+
		"\5\26\13\2\u0112\u0115\5\30\f\2\u0113\u0115\5$\22\2\u0114\u0106\3\2\2"+
		"\2\u0114\u0107\3\2\2\2\u0114\u0108\3\2\2\2\u0114\u0109\3\2\2\2\u0114\u010a"+
		"\3\2\2\2\u0114\u010b\3\2\2\2\u0114\u010c\3\2\2\2\u0114\u010d\3\2\2\2\u0114"+
		"\u010e\3\2\2\2\u0114\u010f\3\2\2\2\u0114\u0110\3\2\2\2\u0114\u0111\3\2"+
		"\2\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117?\3\2\2\2\u0118\u011a\5\f\6\2"+
		"\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u011d"+
		"\5D\"\2\u011c\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011fA\3\2\2\2\u0120\u0122\5\f\6\2\u0121\u0120\3\2\2\2"+
		"\u0121\u0122\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u0125\5D\"\2\u0124\u0123"+
		"\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u012a\5\32\r\2\u0129\u012b\5D\"\2\u012a\u0129\3\2"+
		"\2\2\u012b\u012c\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u0138\3\2\2\2\u012e\u0130\5\f\6\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2"+
		"\2\2\u0130\u0131\3\2\2\2\u0131\u0133\5\32\r\2\u0132\u0134\5D\"\2\u0133"+
		"\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2"+
		"\2\2\u0136\u0138\3\2\2\2\u0137\u0121\3\2\2\2\u0137\u012f\3\2\2\2\u0138"+
		"C\3\2\2\2\u0139\u013a\t\7\2\2\u013aE\3\2\2\2\u013b\u013e\t\b\2\2\u013c"+
		"\u013e\5\64\32\2\u013d\u013b\3\2\2\2\u013d\u013c\3\2\2\2\u013eG\3\2\2"+
		"\2\u013f\u0140\t\t\2\2\u0140I\3\2\2\2\u0141\u0142\t\n\2\2\u0142K\3\2\2"+
		"\2\u0143\u0144\t\13\2\2\u0144M\3\2\2\2\u0145\u0146\t\f\2\2\u0146O\3\2"+
		"\2\2\u0147\u0148\t\r\2\2\u0148Q\3\2\2\2\u0149\u014a\t\16\2\2\u014aS\3"+
		"\2\2\2\u014b\u014c\t\17\2\2\u014cU\3\2\2\2\u014d\u014e\t\20\2\2\u014e"+
		"W\3\2\2\2\u014f\u0150\t\21\2\2\u0150Y\3\2\2\2\u0151\u0152\t\22\2\2\u0152"+
		"[\3\2\2\2\u0153\u0154\t\23\2\2\u0154]\3\2\2\2\u0155\u0156\t\24\2\2\u0156"+
		"_\3\2\2\2\u0157\u0158\t\25\2\2\u0158a\3\2\2\2\u0159\u015a\t\26\2\2\u015a"+
		"c\3\2\2\2\u015b\u015c\t\27\2\2\u015ce\3\2\2\2\u015d\u015e\t\30\2\2\u015e"+
		"g\3\2\2\2\u015f\u0160\t\31\2\2\u0160i\3\2\2\2\u0161\u0162\t\32\2\2\u0162"+
		"k\3\2\2\2\u0163\u0164\t\33\2\2\u0164m\3\2\2\2\u0165\u0166\t\34\2\2\u0166"+
		"o\3\2\2\2\u0167\u0168\t\35\2\2\u0168q\3\2\2\2\u0169\u016a\t\36\2\2\u016a"+
		"s\3\2\2\2\u016b\u016c\t\37\2\2\u016cu\3\2\2\2\u016d\u016e\t \2\2\u016e"+
		"w\3\2\2\2\u016f\u0170\t!\2\2\u0170y\3\2\2\2\u0171\u0172\t\"\2\2\u0172"+
		"{\3\2\2\2\u0173\u017c\7\62\2\2\u0174\u0178\t#\2\2\u0175\u0177\t\7\2\2"+
		"\u0176\u0175\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179"+
		"\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u0173\3\2\2\2\u017b"+
		"\u0174\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\b>\5\2\u017e}\3\2\2\2\u017f"+
		"\u0183\t$\2\2\u0180\u0182\t%\2\2\u0181\u0180\3\2\2\2\u0182\u0185\3\2\2"+
		"\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u0183"+
		"\3\2\2\2\u0186\u0187\b?\5\2\u0187\177\3\2\2\2\36\2\3\u0083\u008e\u009b"+
		"\u00a7\u00ac\u00b0\u00b4\u00ba\u00be\u00c0\u00d2\u00d7\u0114\u0116\u0119"+
		"\u011e\u0121\u0126\u012c\u012f\u0135\u0137\u013d\u0178\u017b\u0183\6\2"+
		"\3\2\2\4\2\4\3\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}