// Generated from E:/compil2/src\grammaire.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammaireLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, ENTIER=20, REAL=21, IDF=22, OPERATOR=23, AFFECT=24, 
		OP_COMP=25, PRM_NAME=26, MESSAGE=27, CTE=28, WHITESPACE=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "ENTIER", "REAL", "IDF", "OPERATOR", "AFFECT", "OP_COMP", 
		"PRM_NAME", "MESSAGE", "CTE", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'compil'", "'('", "')'", "'{'", "'start'", "'}'", "';'", "'intCompil'", 
		"'floatCompil'", "','", "'scancompil'", "'printcompil'", "'+'", "'-'", 
		"'*'", "'/'", "'if'", "'then'", "'else'", null, null, null, null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "ENTIER", "REAL", "IDF", 
		"OPERATOR", "AFFECT", "OP_COMP", "PRM_NAME", "MESSAGE", "CTE", "WHITESPACE"
	};
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


	public grammaireLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "grammaire.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00f0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\5\25\u009a\n\25\3\25\3\25\7\25\u009e\n\25"+
		"\f\25\16\25\u00a1\13\25\3\25\5\25\u00a4\n\25\3\26\3\26\5\26\u00a8\n\26"+
		"\3\26\3\26\7\26\u00ac\n\26\f\26\16\26\u00af\13\26\3\26\3\26\7\26\u00b3"+
		"\n\26\f\26\16\26\u00b6\13\26\5\26\u00b8\n\26\3\27\3\27\7\27\u00bc\n\27"+
		"\f\27\16\27\u00bf\13\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\5\32\u00ce\n\32\3\33\3\33\5\33\u00d2\n\33\3\33\7\33"+
		"\u00d5\n\33\f\33\16\33\u00d8\13\33\3\34\3\34\7\34\u00dc\n\34\f\34\16\34"+
		"\u00df\13\34\3\34\3\34\3\35\3\35\7\35\u00e5\n\35\f\35\16\35\u00e8\13\35"+
		"\3\35\5\35\u00eb\n\35\3\36\3\36\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37\3\2\16\4\2--//\3\2\63"+
		";\3\2\62;\4\2C\\c|\5\2\62;C\\c|\5\2,-//\61\61\4\2>>@@\3\2C\\\3\2aa\5\2"+
		"\"\"C\\c|\3\2$$\5\2\13\f\17\17\"\"\2\u0100\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5D\3\2\2\2"+
		"\7F\3\2\2\2\tH\3\2\2\2\13J\3\2\2\2\rP\3\2\2\2\17R\3\2\2\2\21T\3\2\2\2"+
		"\23^\3\2\2\2\25j\3\2\2\2\27l\3\2\2\2\31w\3\2\2\2\33\u0083\3\2\2\2\35\u0085"+
		"\3\2\2\2\37\u0087\3\2\2\2!\u0089\3\2\2\2#\u008b\3\2\2\2%\u008e\3\2\2\2"+
		"\'\u0093\3\2\2\2)\u0099\3\2\2\2+\u00b7\3\2\2\2-\u00b9\3\2\2\2/\u00c0\3"+
		"\2\2\2\61\u00c2\3\2\2\2\63\u00cd\3\2\2\2\65\u00cf\3\2\2\2\67\u00d9\3\2"+
		"\2\29\u00ea\3\2\2\2;\u00ec\3\2\2\2=>\7e\2\2>?\7q\2\2?@\7o\2\2@A\7r\2\2"+
		"AB\7k\2\2BC\7n\2\2C\4\3\2\2\2DE\7*\2\2E\6\3\2\2\2FG\7+\2\2G\b\3\2\2\2"+
		"HI\7}\2\2I\n\3\2\2\2JK\7u\2\2KL\7v\2\2LM\7c\2\2MN\7t\2\2NO\7v\2\2O\f\3"+
		"\2\2\2PQ\7\177\2\2Q\16\3\2\2\2RS\7=\2\2S\20\3\2\2\2TU\7k\2\2UV\7p\2\2"+
		"VW\7v\2\2WX\7E\2\2XY\7q\2\2YZ\7o\2\2Z[\7r\2\2[\\\7k\2\2\\]\7n\2\2]\22"+
		"\3\2\2\2^_\7h\2\2_`\7n\2\2`a\7q\2\2ab\7c\2\2bc\7v\2\2cd\7E\2\2de\7q\2"+
		"\2ef\7o\2\2fg\7r\2\2gh\7k\2\2hi\7n\2\2i\24\3\2\2\2jk\7.\2\2k\26\3\2\2"+
		"\2lm\7u\2\2mn\7e\2\2no\7c\2\2op\7p\2\2pq\7e\2\2qr\7q\2\2rs\7o\2\2st\7"+
		"r\2\2tu\7k\2\2uv\7n\2\2v\30\3\2\2\2wx\7r\2\2xy\7t\2\2yz\7k\2\2z{\7p\2"+
		"\2{|\7v\2\2|}\7e\2\2}~\7q\2\2~\177\7o\2\2\177\u0080\7r\2\2\u0080\u0081"+
		"\7k\2\2\u0081\u0082\7n\2\2\u0082\32\3\2\2\2\u0083\u0084\7-\2\2\u0084\34"+
		"\3\2\2\2\u0085\u0086\7/\2\2\u0086\36\3\2\2\2\u0087\u0088\7,\2\2\u0088"+
		" \3\2\2\2\u0089\u008a\7\61\2\2\u008a\"\3\2\2\2\u008b\u008c\7k\2\2\u008c"+
		"\u008d\7h\2\2\u008d$\3\2\2\2\u008e\u008f\7v\2\2\u008f\u0090\7j\2\2\u0090"+
		"\u0091\7g\2\2\u0091\u0092\7p\2\2\u0092&\3\2\2\2\u0093\u0094\7g\2\2\u0094"+
		"\u0095\7n\2\2\u0095\u0096\7u\2\2\u0096\u0097\7g\2\2\u0097(\3\2\2\2\u0098"+
		"\u009a\t\2\2\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u00a3\3\2"+
		"\2\2\u009b\u009f\t\3\2\2\u009c\u009e\t\4\2\2\u009d\u009c\3\2\2\2\u009e"+
		"\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a4\3\2"+
		"\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a4\7\62\2\2\u00a3\u009b\3\2\2\2\u00a3"+
		"\u00a2\3\2\2\2\u00a4*\3\2\2\2\u00a5\u00b8\7\62\2\2\u00a6\u00a8\t\2\2\2"+
		"\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ad"+
		"\t\3\2\2\u00aa\u00ac\t\4\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00b0\u00b4\7\60\2\2\u00b1\u00b3\t\4\2\2\u00b2\u00b1\3\2\2\2\u00b3"+
		"\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b8\3\2"+
		"\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00a5\3\2\2\2\u00b7\u00a7\3\2\2\2\u00b8"+
		",\3\2\2\2\u00b9\u00bd\t\5\2\2\u00ba\u00bc\t\6\2\2\u00bb\u00ba\3\2\2\2"+
		"\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be.\3"+
		"\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\t\7\2\2\u00c1\60\3\2\2\2\u00c2"+
		"\u00c3\7?\2\2\u00c3\62\3\2\2\2\u00c4\u00ce\t\b\2\2\u00c5\u00c6\7>\2\2"+
		"\u00c6\u00ce\7?\2\2\u00c7\u00c8\7@\2\2\u00c8\u00ce\7?\2\2\u00c9\u00ca"+
		"\7>\2\2\u00ca\u00ce\7@\2\2\u00cb\u00cc\7?\2\2\u00cc\u00ce\7?\2\2\u00cd"+
		"\u00c4\3\2\2\2\u00cd\u00c5\3\2\2\2\u00cd\u00c7\3\2\2\2\u00cd\u00c9\3\2"+
		"\2\2\u00cd\u00cb\3\2\2\2\u00ce\64\3\2\2\2\u00cf\u00d6\t\t\2\2\u00d0\u00d2"+
		"\t\n\2\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d5\t\13\2\2\u00d4\u00d1\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3"+
		"\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\66\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9"+
		"\u00dd\7$\2\2\u00da\u00dc\n\f\2\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2"+
		"\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00e0\u00e1\7$\2\2\u00e18\3\2\2\2\u00e2\u00e6\t\3\2\2\u00e3"+
		"\u00e5\t\4\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00eb\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9"+
		"\u00eb\7\62\2\2\u00ea\u00e2\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb:\3\2\2\2"+
		"\u00ec\u00ed\t\r\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\b\36\2\2\u00ef<\3"+
		"\2\2\2\21\2\u0099\u009f\u00a3\u00a7\u00ad\u00b4\u00b7\u00bd\u00cd\u00d1"+
		"\u00d6\u00dd\u00e6\u00ea\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}