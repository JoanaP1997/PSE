// Generated from Wlang.g4 by ANTLR 4.7
package basic;
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
		T__17=18, COMPOPERATOR=19, WS=20, COMMENT=21, LINE_COMMENT=22, TYPE=23, 
		ID=24, INTLITERAL=25, FLOATLITERAL=26, CHARLITERAL=27, BOOLEANLITERAL=28, 
		ASSIGN=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "COMPOPERATOR", "WS", "COMMENT", "LINE_COMMENT", "TYPE", "ID", 
		"INTLITERAL", "FLOATLITERAL", "CHARLITERAL", "BOOLEANLITERAL", "ASSIGN"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'void'", "','", "'{'", "'}'", "';'", "'if'", "'else'", 
		"'while'", "'||'", "'&&'", "'!'", "'/'", "'*'", "'-'", "'+'", "'%'", null, 
		null, null, null, null, null, null, null, null, null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "COMPOPERATOR", "WS", "COMMENT", 
		"LINE_COMMENT", "TYPE", "ID", "INTLITERAL", "FLOATLITERAL", "CHARLITERAL", 
		"BOOLEANLITERAL", "ASSIGN"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00dc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24v\n\24\3\25\6\25y\n\25\r\25\16\25z\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\7\26\u0083\n\26\f\26\16\26\u0086\13\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u0091\n\27\f\27\16\27\u0094"+
		"\13\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00ab\n\30\3\31\6\31\u00ae"+
		"\n\31\r\31\16\31\u00af\3\32\3\32\7\32\u00b4\n\32\f\32\16\32\u00b7\13\32"+
		"\3\32\5\32\u00ba\n\32\3\33\3\33\7\33\u00be\n\33\f\33\16\33\u00c1\13\33"+
		"\3\33\3\33\6\33\u00c5\n\33\r\33\16\33\u00c6\3\33\5\33\u00ca\n\33\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00d9"+
		"\n\35\3\36\3\36\3\u0084\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37\3\2\t\4\2>>@@\5\2\13\f\17\17\"\"\4\2\f\f"+
		"\17\17\4\2C\\c|\3\2\63;\3\2\62;\6\2\f\f\17\17))^^\2\u00eb\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2"+
		"\2\2\5?\3\2\2\2\7A\3\2\2\2\tF\3\2\2\2\13H\3\2\2\2\rJ\3\2\2\2\17L\3\2\2"+
		"\2\21N\3\2\2\2\23Q\3\2\2\2\25V\3\2\2\2\27\\\3\2\2\2\31_\3\2\2\2\33b\3"+
		"\2\2\2\35d\3\2\2\2\37f\3\2\2\2!h\3\2\2\2#j\3\2\2\2%l\3\2\2\2\'u\3\2\2"+
		"\2)x\3\2\2\2+~\3\2\2\2-\u008c\3\2\2\2/\u00aa\3\2\2\2\61\u00ad\3\2\2\2"+
		"\63\u00b9\3\2\2\2\65\u00c9\3\2\2\2\67\u00cb\3\2\2\29\u00d8\3\2\2\2;\u00da"+
		"\3\2\2\2=>\7*\2\2>\4\3\2\2\2?@\7+\2\2@\6\3\2\2\2AB\7x\2\2BC\7q\2\2CD\7"+
		"k\2\2DE\7f\2\2E\b\3\2\2\2FG\7.\2\2G\n\3\2\2\2HI\7}\2\2I\f\3\2\2\2JK\7"+
		"\177\2\2K\16\3\2\2\2LM\7=\2\2M\20\3\2\2\2NO\7k\2\2OP\7h\2\2P\22\3\2\2"+
		"\2QR\7g\2\2RS\7n\2\2ST\7u\2\2TU\7g\2\2U\24\3\2\2\2VW\7y\2\2WX\7j\2\2X"+
		"Y\7k\2\2YZ\7n\2\2Z[\7g\2\2[\26\3\2\2\2\\]\7~\2\2]^\7~\2\2^\30\3\2\2\2"+
		"_`\7(\2\2`a\7(\2\2a\32\3\2\2\2bc\7#\2\2c\34\3\2\2\2de\7\61\2\2e\36\3\2"+
		"\2\2fg\7,\2\2g \3\2\2\2hi\7/\2\2i\"\3\2\2\2jk\7-\2\2k$\3\2\2\2lm\7\'\2"+
		"\2m&\3\2\2\2nv\t\2\2\2op\7>\2\2pv\7?\2\2qr\7@\2\2rv\7?\2\2st\7?\2\2tv"+
		"\7?\2\2un\3\2\2\2uo\3\2\2\2uq\3\2\2\2us\3\2\2\2v(\3\2\2\2wy\t\3\2\2xw"+
		"\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\b\25\2\2}*\3\2\2\2"+
		"~\177\7\61\2\2\177\u0080\7,\2\2\u0080\u0084\3\2\2\2\u0081\u0083\13\2\2"+
		"\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0085\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7,\2\2\u0088"+
		"\u0089\7\61\2\2\u0089\u008a\3\2\2\2\u008a\u008b\b\26\2\2\u008b,\3\2\2"+
		"\2\u008c\u008d\7\61\2\2\u008d\u008e\7\61\2\2\u008e\u0092\3\2\2\2\u008f"+
		"\u0091\n\4\2\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095"+
		"\u0096\b\27\2\2\u0096.\3\2\2\2\u0097\u0098\7h\2\2\u0098\u0099\7n\2\2\u0099"+
		"\u009a\7q\2\2\u009a\u009b\7c\2\2\u009b\u00ab\7v\2\2\u009c\u009d\7k\2\2"+
		"\u009d\u009e\7p\2\2\u009e\u00ab\7v\2\2\u009f\u00a0\7e\2\2\u00a0\u00a1"+
		"\7j\2\2\u00a1\u00a2\7c\2\2\u00a2\u00ab\7t\2\2\u00a3\u00a4\7d\2\2\u00a4"+
		"\u00a5\7q\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8\7g\2\2"+
		"\u00a8\u00a9\7c\2\2\u00a9\u00ab\7p\2\2\u00aa\u0097\3\2\2\2\u00aa\u009c"+
		"\3\2\2\2\u00aa\u009f\3\2\2\2\u00aa\u00a3\3\2\2\2\u00ab\60\3\2\2\2\u00ac"+
		"\u00ae\t\5\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\62\3\2\2\2\u00b1\u00b5\t\6\2\2\u00b2\u00b4"+
		"\t\7\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00ba\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00ba\7\62"+
		"\2\2\u00b9\u00b1\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\64\3\2\2\2\u00bb\u00bf"+
		"\t\6\2\2\u00bc\u00be\t\7\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c2\u00c4\13\2\2\2\u00c3\u00c5\t\7\2\2\u00c4\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00ca\3\2"+
		"\2\2\u00c8\u00ca\7\62\2\2\u00c9\u00bb\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"\66\3\2\2\2\u00cb\u00cc\7)\2\2\u00cc\u00cd\n\b\2\2\u00cd\u00ce\7)\2\2"+
		"\u00ce8\3\2\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7w\2"+
		"\2\u00d2\u00d9\7g\2\2\u00d3\u00d4\7h\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6"+
		"\7n\2\2\u00d6\u00d7\7u\2\2\u00d7\u00d9\7g\2\2\u00d8\u00cf\3\2\2\2\u00d8"+
		"\u00d3\3\2\2\2\u00d9:\3\2\2\2\u00da\u00db\7?\2\2\u00db<\3\2\2\2\20\2u"+
		"z\u0084\u0092\u00aa\u00ad\u00af\u00b5\u00b9\u00bf\u00c6\u00c9\u00d8\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}