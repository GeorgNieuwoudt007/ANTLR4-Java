// Generated from Expressions.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ExpressionsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN=1, NUMBER=2, STRING=3, ID=4, AND=5, OR=6, LOGICAL_AND=7, LOGICAL_OR=8, 
		ASSIGN=9, PLUS=10, MINUS=11, MULT=12, DIV=13, LPAREN=14, RPAREN=15, LBRACE=16, 
		RBRACE=17, SEMI=18, LT=19, GT=20, EQ=21, NEQ=22, LTE=23, GTE=24, WS=25, 
		COMMENT=26, MULTILINE_COMMENT=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BOOLEAN", "NUMBER", "STRING", "ID", "AND", "OR", "LOGICAL_AND", "LOGICAL_OR", 
			"ASSIGN", "PLUS", "MINUS", "MULT", "DIV", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "SEMI", "LT", "GT", "EQ", "NEQ", "LTE", "GTE", "WS", "COMMENT", 
			"MULTILINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'and'", "'or'", "'&&'", "'||'", "'='", 
			"'+'", "'-'", "'*'", "'/'", "'('", "')'", "'{'", "'}'", "';'", "'<'", 
			"'>'", "'=='", "'!='", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOLEAN", "NUMBER", "STRING", "ID", "AND", "OR", "LOGICAL_AND", 
			"LOGICAL_OR", "ASSIGN", "PLUS", "MINUS", "MULT", "DIV", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "SEMI", "LT", "GT", "EQ", "NEQ", "LTE", "GTE", "WS", 
			"COMMENT", "MULTILINE_COMMENT"
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


	public ExpressionsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expressions.g4"; }

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
		"\u0004\u0000\u001b\u00ac\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"=\b\u0000\u0001\u0001\u0004\u0001@\b\u0001\u000b\u0001\f\u0001A\u0001"+
		"\u0001\u0001\u0001\u0004\u0001F\b\u0001\u000b\u0001\f\u0001G\u0003\u0001"+
		"J\b\u0001\u0001\u0002\u0001\u0002\u0005\u0002N\b\u0002\n\u0002\f\u0002"+
		"Q\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0005\u0003"+
		"W\b\u0003\n\u0003\f\u0003Z\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0004\u0018\u008e\b\u0018\u000b\u0018\f\u0018"+
		"\u008f\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u0098\b\u0019\n\u0019\f\u0019\u009b\t\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a"+
		"\u00a3\b\u001a\n\u001a\f\u001a\u00a6\t\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0002O\u00a4\u0000\u001b\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a"+
		"5\u001b\u0001\u0000\u0005\u0001\u000009\u0003\u0000AZ__az\u0004\u0000"+
		"09AZ__az\u0003\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u00b4\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005"+
		"\u0001\u0000\u0000\u0000\u0001<\u0001\u0000\u0000\u0000\u0003?\u0001\u0000"+
		"\u0000\u0000\u0005K\u0001\u0000\u0000\u0000\u0007T\u0001\u0000\u0000\u0000"+
		"\t[\u0001\u0000\u0000\u0000\u000b_\u0001\u0000\u0000\u0000\rb\u0001\u0000"+
		"\u0000\u0000\u000fe\u0001\u0000\u0000\u0000\u0011h\u0001\u0000\u0000\u0000"+
		"\u0013j\u0001\u0000\u0000\u0000\u0015l\u0001\u0000\u0000\u0000\u0017n"+
		"\u0001\u0000\u0000\u0000\u0019p\u0001\u0000\u0000\u0000\u001br\u0001\u0000"+
		"\u0000\u0000\u001dt\u0001\u0000\u0000\u0000\u001fv\u0001\u0000\u0000\u0000"+
		"!x\u0001\u0000\u0000\u0000#z\u0001\u0000\u0000\u0000%|\u0001\u0000\u0000"+
		"\u0000\'~\u0001\u0000\u0000\u0000)\u0080\u0001\u0000\u0000\u0000+\u0083"+
		"\u0001\u0000\u0000\u0000-\u0086\u0001\u0000\u0000\u0000/\u0089\u0001\u0000"+
		"\u0000\u00001\u008d\u0001\u0000\u0000\u00003\u0093\u0001\u0000\u0000\u0000"+
		"5\u009e\u0001\u0000\u0000\u000078\u0005y\u0000\u000089\u0005e\u0000\u0000"+
		"9=\u0005s\u0000\u0000:;\u0005n\u0000\u0000;=\u0005o\u0000\u0000<7\u0001"+
		"\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=\u0002\u0001\u0000\u0000"+
		"\u0000>@\u0007\u0000\u0000\u0000?>\u0001\u0000\u0000\u0000@A\u0001\u0000"+
		"\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BI\u0001"+
		"\u0000\u0000\u0000CE\u0005.\u0000\u0000DF\u0007\u0000\u0000\u0000ED\u0001"+
		"\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000IC\u0001\u0000\u0000"+
		"\u0000IJ\u0001\u0000\u0000\u0000J\u0004\u0001\u0000\u0000\u0000KO\u0005"+
		"\"\u0000\u0000LN\t\u0000\u0000\u0000ML\u0001\u0000\u0000\u0000NQ\u0001"+
		"\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000"+
		"PR\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000RS\u0005\"\u0000\u0000"+
		"S\u0006\u0001\u0000\u0000\u0000TX\u0007\u0001\u0000\u0000UW\u0007\u0002"+
		"\u0000\u0000VU\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001"+
		"\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y\b\u0001\u0000\u0000\u0000"+
		"ZX\u0001\u0000\u0000\u0000[\\\u0005a\u0000\u0000\\]\u0005n\u0000\u0000"+
		"]^\u0005d\u0000\u0000^\n\u0001\u0000\u0000\u0000_`\u0005o\u0000\u0000"+
		"`a\u0005r\u0000\u0000a\f\u0001\u0000\u0000\u0000bc\u0005&\u0000\u0000"+
		"cd\u0005&\u0000\u0000d\u000e\u0001\u0000\u0000\u0000ef\u0005|\u0000\u0000"+
		"fg\u0005|\u0000\u0000g\u0010\u0001\u0000\u0000\u0000hi\u0005=\u0000\u0000"+
		"i\u0012\u0001\u0000\u0000\u0000jk\u0005+\u0000\u0000k\u0014\u0001\u0000"+
		"\u0000\u0000lm\u0005-\u0000\u0000m\u0016\u0001\u0000\u0000\u0000no\u0005"+
		"*\u0000\u0000o\u0018\u0001\u0000\u0000\u0000pq\u0005/\u0000\u0000q\u001a"+
		"\u0001\u0000\u0000\u0000rs\u0005(\u0000\u0000s\u001c\u0001\u0000\u0000"+
		"\u0000tu\u0005)\u0000\u0000u\u001e\u0001\u0000\u0000\u0000vw\u0005{\u0000"+
		"\u0000w \u0001\u0000\u0000\u0000xy\u0005}\u0000\u0000y\"\u0001\u0000\u0000"+
		"\u0000z{\u0005;\u0000\u0000{$\u0001\u0000\u0000\u0000|}\u0005<\u0000\u0000"+
		"}&\u0001\u0000\u0000\u0000~\u007f\u0005>\u0000\u0000\u007f(\u0001\u0000"+
		"\u0000\u0000\u0080\u0081\u0005=\u0000\u0000\u0081\u0082\u0005=\u0000\u0000"+
		"\u0082*\u0001\u0000\u0000\u0000\u0083\u0084\u0005!\u0000\u0000\u0084\u0085"+
		"\u0005=\u0000\u0000\u0085,\u0001\u0000\u0000\u0000\u0086\u0087\u0005<"+
		"\u0000\u0000\u0087\u0088\u0005=\u0000\u0000\u0088.\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0005>\u0000\u0000\u008a\u008b\u0005=\u0000\u0000\u008b0"+
		"\u0001\u0000\u0000\u0000\u008c\u008e\u0007\u0003\u0000\u0000\u008d\u008c"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u008d"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0006\u0018\u0000\u0000\u00922\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0005/\u0000\u0000\u0094\u0095\u0005/\u0000"+
		"\u0000\u0095\u0099\u0001\u0000\u0000\u0000\u0096\u0098\b\u0004\u0000\u0000"+
		"\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000"+
		"\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000"+
		"\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0006\u0019\u0000\u0000\u009d4\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0005/\u0000\u0000\u009f\u00a0\u0005*\u0000\u0000\u00a0\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a3\t\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005*\u0000"+
		"\u0000\u00a8\u00a9\u0005/\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ab\u0006\u001a\u0000\u0000\u00ab6\u0001\u0000\u0000\u0000\n"+
		"\u0000<AGIOX\u008f\u0099\u00a4\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}