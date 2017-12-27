// Generated from Wlang.g4 by ANTLR 4.7
package dibugger.DebugLogic.AntlrParser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WlangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, COMPOPERATOR=30, WS=31, 
		COMMENT=32, LINE_COMMENT=33, TYPE=34, ID=35, INTLITERAL=36, FLOATLITERAL=37, 
		CHARLITERAL=38, BOOLEANLITERAL=39, NULLLITERAL=40, LONGLITERAL=41, DOUBLELITERAL=42, 
		ASSIGN=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "COMPOPERATOR", "WS", "COMMENT", "LINE_COMMENT", 
		"TYPE", "ID", "INTLITERAL", "FLOATLITERAL", "CHARLITERAL", "BOOLEANLITERAL", 
		"NULLLITERAL", "LONGLITERAL", "DOUBLELITERAL", "ASSIGN"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'void'", "'main'", "','", "';'", "'{'", "'}'", "'};'", 
		"'['", "']'", "'return'", "'if'", "'else'", "'while'", "'&&'", "'||'", 
		"'!'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'-'", "'/'", "'*'", 
		"'+'", "'%'", null, null, null, null, null, null, null, null, null, null, 
		"'null'", null, null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "COMPOPERATOR", "WS", "COMMENT", "LINE_COMMENT", 
		"TYPE", "ID", "INTLITERAL", "FLOATLITERAL", "CHARLITERAL", "BOOLEANLITERAL", 
		"NULLLITERAL", "LONGLITERAL", "DOUBLELITERAL", "ASSIGN"
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


	public WlangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Wlang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u014d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u00b7\n\37\3 \6 \u00ba\n \r \16 \u00bb\3 \3 \3!\3"+
		"!\3!\3!\7!\u00c4\n!\f!\16!\u00c7\13!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\7"+
		"\"\u00d2\n\"\f\"\16\"\u00d5\13\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u00f6\n"+
		"#\3$\6$\u00f9\n$\r$\16$\u00fa\3%\5%\u00fe\n%\3%\3%\7%\u0102\n%\f%\16%"+
		"\u0105\13%\3%\5%\u0108\n%\3&\3&\7&\u010c\n&\f&\16&\u010f\13&\3&\3&\6&"+
		"\u0113\n&\r&\16&\u0114\3&\5&\u0118\n&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\5(\u0129\n(\3)\3)\3)\3)\3)\3*\3*\7*\u0132\n*\f*\16*\u0135"+
		"\13*\3*\5*\u0138\n*\3*\3*\3+\3+\7+\u013e\n+\f+\16+\u0141\13+\3+\3+\6+"+
		"\u0145\n+\r+\16+\u0146\3+\5+\u014a\n+\3,\3,\3\u00c5\2-\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-\3\2\t\4\2>>@@\5\2\13\f\17\17\"\"\4\2\f\f\17\17\4\2C\\c"+
		"|\3\2\63;\3\2\62;\6\2\f\f\17\17))^^\2\u0165\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3"+
		"\2\2\2\5[\3\2\2\2\7]\3\2\2\2\tb\3\2\2\2\13g\3\2\2\2\ri\3\2\2\2\17k\3\2"+
		"\2\2\21m\3\2\2\2\23o\3\2\2\2\25r\3\2\2\2\27t\3\2\2\2\31v\3\2\2\2\33}\3"+
		"\2\2\2\35\u0080\3\2\2\2\37\u0085\3\2\2\2!\u008b\3\2\2\2#\u008e\3\2\2\2"+
		"%\u0091\3\2\2\2\'\u0093\3\2\2\2)\u0095\3\2\2\2+\u0098\3\2\2\2-\u009a\3"+
		"\2\2\2/\u009d\3\2\2\2\61\u00a0\3\2\2\2\63\u00a3\3\2\2\2\65\u00a5\3\2\2"+
		"\2\67\u00a7\3\2\2\29\u00a9\3\2\2\2;\u00ab\3\2\2\2=\u00b6\3\2\2\2?\u00b9"+
		"\3\2\2\2A\u00bf\3\2\2\2C\u00cd\3\2\2\2E\u00f5\3\2\2\2G\u00f8\3\2\2\2I"+
		"\u0107\3\2\2\2K\u0117\3\2\2\2M\u011b\3\2\2\2O\u0128\3\2\2\2Q\u012a\3\2"+
		"\2\2S\u0137\3\2\2\2U\u0149\3\2\2\2W\u014b\3\2\2\2YZ\7*\2\2Z\4\3\2\2\2"+
		"[\\\7+\2\2\\\6\3\2\2\2]^\7x\2\2^_\7q\2\2_`\7k\2\2`a\7f\2\2a\b\3\2\2\2"+
		"bc\7o\2\2cd\7c\2\2de\7k\2\2ef\7p\2\2f\n\3\2\2\2gh\7.\2\2h\f\3\2\2\2ij"+
		"\7=\2\2j\16\3\2\2\2kl\7}\2\2l\20\3\2\2\2mn\7\177\2\2n\22\3\2\2\2op\7\177"+
		"\2\2pq\7=\2\2q\24\3\2\2\2rs\7]\2\2s\26\3\2\2\2tu\7_\2\2u\30\3\2\2\2vw"+
		"\7t\2\2wx\7g\2\2xy\7v\2\2yz\7w\2\2z{\7t\2\2{|\7p\2\2|\32\3\2\2\2}~\7k"+
		"\2\2~\177\7h\2\2\177\34\3\2\2\2\u0080\u0081\7g\2\2\u0081\u0082\7n\2\2"+
		"\u0082\u0083\7u\2\2\u0083\u0084\7g\2\2\u0084\36\3\2\2\2\u0085\u0086\7"+
		"y\2\2\u0086\u0087\7j\2\2\u0087\u0088\7k\2\2\u0088\u0089\7n\2\2\u0089\u008a"+
		"\7g\2\2\u008a \3\2\2\2\u008b\u008c\7(\2\2\u008c\u008d\7(\2\2\u008d\"\3"+
		"\2\2\2\u008e\u008f\7~\2\2\u008f\u0090\7~\2\2\u0090$\3\2\2\2\u0091\u0092"+
		"\7#\2\2\u0092&\3\2\2\2\u0093\u0094\7>\2\2\u0094(\3\2\2\2\u0095\u0096\7"+
		">\2\2\u0096\u0097\7?\2\2\u0097*\3\2\2\2\u0098\u0099\7@\2\2\u0099,\3\2"+
		"\2\2\u009a\u009b\7@\2\2\u009b\u009c\7?\2\2\u009c.\3\2\2\2\u009d\u009e"+
		"\7?\2\2\u009e\u009f\7?\2\2\u009f\60\3\2\2\2\u00a0\u00a1\7#\2\2\u00a1\u00a2"+
		"\7?\2\2\u00a2\62\3\2\2\2\u00a3\u00a4\7/\2\2\u00a4\64\3\2\2\2\u00a5\u00a6"+
		"\7\61\2\2\u00a6\66\3\2\2\2\u00a7\u00a8\7,\2\2\u00a88\3\2\2\2\u00a9\u00aa"+
		"\7-\2\2\u00aa:\3\2\2\2\u00ab\u00ac\7\'\2\2\u00ac<\3\2\2\2\u00ad\u00b7"+
		"\t\2\2\2\u00ae\u00af\7>\2\2\u00af\u00b7\7?\2\2\u00b0\u00b1\7@\2\2\u00b1"+
		"\u00b7\7?\2\2\u00b2\u00b3\7?\2\2\u00b3\u00b7\7?\2\2\u00b4\u00b5\7#\2\2"+
		"\u00b5\u00b7\7?\2\2\u00b6\u00ad\3\2\2\2\u00b6\u00ae\3\2\2\2\u00b6\u00b0"+
		"\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7>\3\2\2\2\u00b8"+
		"\u00ba\t\3\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\b \2\2\u00be"+
		"@\3\2\2\2\u00bf\u00c0\7\61\2\2\u00c0\u00c1\7,\2\2\u00c1\u00c5\3\2\2\2"+
		"\u00c2\u00c4\13\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c6"+
		"\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8"+
		"\u00c9\7,\2\2\u00c9\u00ca\7\61\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\b!"+
		"\2\2\u00ccB\3\2\2\2\u00cd\u00ce\7\61\2\2\u00ce\u00cf\7\61\2\2\u00cf\u00d3"+
		"\3\2\2\2\u00d0\u00d2\n\4\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d6\u00d7\b\"\2\2\u00d7D\3\2\2\2\u00d8\u00d9\7h\2\2\u00d9\u00da"+
		"\7n\2\2\u00da\u00db\7q\2\2\u00db\u00dc\7c\2\2\u00dc\u00f6\7v\2\2\u00dd"+
		"\u00de\7k\2\2\u00de\u00df\7p\2\2\u00df\u00f6\7v\2\2\u00e0\u00e1\7e\2\2"+
		"\u00e1\u00e2\7j\2\2\u00e2\u00e3\7c\2\2\u00e3\u00f6\7t\2\2\u00e4\u00e5"+
		"\7d\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7n\2\2\u00e8"+
		"\u00e9\7g\2\2\u00e9\u00ea\7c\2\2\u00ea\u00f6\7p\2\2\u00eb\u00ec\7f\2\2"+
		"\u00ec\u00ed\7q\2\2\u00ed\u00ee\7w\2\2\u00ee\u00ef\7d\2\2\u00ef\u00f0"+
		"\7n\2\2\u00f0\u00f6\7g\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7q\2\2\u00f3"+
		"\u00f4\7p\2\2\u00f4\u00f6\7i\2\2\u00f5\u00d8\3\2\2\2\u00f5\u00dd\3\2\2"+
		"\2\u00f5\u00e0\3\2\2\2\u00f5\u00e4\3\2\2\2\u00f5\u00eb\3\2\2\2\u00f5\u00f1"+
		"\3\2\2\2\u00f6F\3\2\2\2\u00f7\u00f9\t\5\2\2\u00f8\u00f7\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fbH\3\2\2\2"+
		"\u00fc\u00fe\7/\2\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff"+
		"\3\2\2\2\u00ff\u0103\t\6\2\2\u0100\u0102\t\7\2\2\u0101\u0100\3\2\2\2\u0102"+
		"\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0108\3\2"+
		"\2\2\u0105\u0103\3\2\2\2\u0106\u0108\7\62\2\2\u0107\u00fd\3\2\2\2\u0107"+
		"\u0106\3\2\2\2\u0108J\3\2\2\2\u0109\u010d\t\6\2\2\u010a\u010c\t\7\2\2"+
		"\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0112\7\60\2\2"+
		"\u0111\u0113\t\7\2\2\u0112\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0112"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0118\7\62\2\2"+
		"\u0117\u0109\3\2\2\2\u0117\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a"+
		"\7h\2\2\u011aL\3\2\2\2\u011b\u011c\7)\2\2\u011c\u011d\n\b\2\2\u011d\u011e"+
		"\7)\2\2\u011eN\3\2\2\2\u011f\u0120\7v\2\2\u0120\u0121\7t\2\2\u0121\u0122"+
		"\7w\2\2\u0122\u0129\7g\2\2\u0123\u0124\7h\2\2\u0124\u0125\7c\2\2\u0125"+
		"\u0126\7n\2\2\u0126\u0127\7u\2\2\u0127\u0129\7g\2\2\u0128\u011f\3\2\2"+
		"\2\u0128\u0123\3\2\2\2\u0129P\3\2\2\2\u012a\u012b\7p\2\2\u012b\u012c\7"+
		"w\2\2\u012c\u012d\7n\2\2\u012d\u012e\7n\2\2\u012eR\3\2\2\2\u012f\u0133"+
		"\t\6\2\2\u0130\u0132\t\7\2\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0138\3\2\2\2\u0135\u0133\3\2"+
		"\2\2\u0136\u0138\7\62\2\2\u0137\u012f\3\2\2\2\u0137\u0136\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u013a\7N\2\2\u013aT\3\2\2\2\u013b\u013f\t\6\2\2\u013c"+
		"\u013e\t\7\2\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2"+
		"\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142"+
		"\u0144\7\60\2\2\u0143\u0145\t\7\2\2\u0144\u0143\3\2\2\2\u0145\u0146\3"+
		"\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u014a\3\2\2\2\u0148"+
		"\u014a\7\62\2\2\u0149\u013b\3\2\2\2\u0149\u0148\3\2\2\2\u014aV\3\2\2\2"+
		"\u014b\u014c\7?\2\2\u014cX\3\2\2\2\26\2\u00b6\u00bb\u00c5\u00d3\u00f5"+
		"\u00f8\u00fa\u00fd\u0103\u0107\u010d\u0114\u0117\u0128\u0133\u0137\u013f"+
		"\u0146\u0149\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}