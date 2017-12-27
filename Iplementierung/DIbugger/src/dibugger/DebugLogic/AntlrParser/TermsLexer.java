// Generated from Terms.g4 by ANTLR 4.7
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
public class TermsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, COMPOPERATOR=19, WS=20, COMMENT=21, LINE_COMMENT=22, TYPE=23, 
		ID=24, INTLITERAL=25, FLOATLITERAL=26, CHARLITERAL=27, BOOLEANLITERAL=28, 
		NULLLITERAL=29, LONGLITERAL=30, DOUBLELITERAL=31, ASSIGN=32;
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
		"INTLITERAL", "FLOATLITERAL", "CHARLITERAL", "BOOLEANLITERAL", "NULLLITERAL", 
		"LONGLITERAL", "DOUBLELITERAL", "ASSIGN"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'&&'", "'||'", "'!'", "'<'", "'<='", "'>'", "'>='", 
		"'=='", "'!='", "'-'", "'/'", "'*'", "'+'", "'%'", "'['", "']'", null, 
		null, null, null, null, null, null, null, null, null, "'null'", null, 
		null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "COMPOPERATOR", "WS", "COMMENT", 
		"LINE_COMMENT", "TYPE", "ID", "INTLITERAL", "FLOATLITERAL", "CHARLITERAL", 
		"BOOLEANLITERAL", "NULLLITERAL", "LONGLITERAL", "DOUBLELITERAL", "ASSIGN"
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


	public TermsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Terms.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u0100\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\5\24u\n\24\3\25\6\25x\n\25\r\25\16\25y\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\7\26\u0082\n\26\f\26\16\26\u0085\13\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\7\27\u0090\n\27\f\27\16\27\u0093\13\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00aa\n\30\3\31\3\31\3\31\6\31"+
		"\u00af\n\31\r\31\16\31\u00b0\3\32\3\32\7\32\u00b5\n\32\f\32\16\32\u00b8"+
		"\13\32\3\32\5\32\u00bb\n\32\3\33\3\33\7\33\u00bf\n\33\f\33\16\33\u00c2"+
		"\13\33\3\33\3\33\6\33\u00c6\n\33\r\33\16\33\u00c7\3\33\5\33\u00cb\n\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u00dc\n\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\7\37\u00e5\n"+
		"\37\f\37\16\37\u00e8\13\37\3\37\5\37\u00eb\n\37\3\37\3\37\3 \3 \7 \u00f1"+
		"\n \f \16 \u00f4\13 \3 \3 \6 \u00f8\n \r \16 \u00f9\3 \5 \u00fd\n \3!"+
		"\3!\3\u0083\2\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"\3\2\n\4\2>>@@\5\2\13\f\17\17\"\"\4\2\f\f\17\17"+
		"\3\2C\\\4\2C\\c|\3\2\63;\3\2\62;\6\2\f\f\17\17))^^\2\u0114\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5E\3\2\2\2\7G\3\2\2\2\tJ\3\2\2\2"+
		"\13M\3\2\2\2\rO\3\2\2\2\17Q\3\2\2\2\21T\3\2\2\2\23V\3\2\2\2\25Y\3\2\2"+
		"\2\27\\\3\2\2\2\31_\3\2\2\2\33a\3\2\2\2\35c\3\2\2\2\37e\3\2\2\2!g\3\2"+
		"\2\2#i\3\2\2\2%k\3\2\2\2\'t\3\2\2\2)w\3\2\2\2+}\3\2\2\2-\u008b\3\2\2\2"+
		"/\u00a9\3\2\2\2\61\u00ab\3\2\2\2\63\u00ba\3\2\2\2\65\u00ca\3\2\2\2\67"+
		"\u00ce\3\2\2\29\u00db\3\2\2\2;\u00dd\3\2\2\2=\u00ea\3\2\2\2?\u00fc\3\2"+
		"\2\2A\u00fe\3\2\2\2CD\7*\2\2D\4\3\2\2\2EF\7+\2\2F\6\3\2\2\2GH\7(\2\2H"+
		"I\7(\2\2I\b\3\2\2\2JK\7~\2\2KL\7~\2\2L\n\3\2\2\2MN\7#\2\2N\f\3\2\2\2O"+
		"P\7>\2\2P\16\3\2\2\2QR\7>\2\2RS\7?\2\2S\20\3\2\2\2TU\7@\2\2U\22\3\2\2"+
		"\2VW\7@\2\2WX\7?\2\2X\24\3\2\2\2YZ\7?\2\2Z[\7?\2\2[\26\3\2\2\2\\]\7#\2"+
		"\2]^\7?\2\2^\30\3\2\2\2_`\7/\2\2`\32\3\2\2\2ab\7\61\2\2b\34\3\2\2\2cd"+
		"\7,\2\2d\36\3\2\2\2ef\7-\2\2f \3\2\2\2gh\7\'\2\2h\"\3\2\2\2ij\7]\2\2j"+
		"$\3\2\2\2kl\7_\2\2l&\3\2\2\2mu\t\2\2\2no\7>\2\2ou\7?\2\2pq\7@\2\2qu\7"+
		"?\2\2rs\7?\2\2su\7?\2\2tm\3\2\2\2tn\3\2\2\2tp\3\2\2\2tr\3\2\2\2u(\3\2"+
		"\2\2vx\t\3\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\b\25"+
		"\2\2|*\3\2\2\2}~\7\61\2\2~\177\7,\2\2\177\u0083\3\2\2\2\u0080\u0082\13"+
		"\2\2\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0084\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7,"+
		"\2\2\u0087\u0088\7\61\2\2\u0088\u0089\3\2\2\2\u0089\u008a\b\26\2\2\u008a"+
		",\3\2\2\2\u008b\u008c\7\61\2\2\u008c\u008d\7\61\2\2\u008d\u0091\3\2\2"+
		"\2\u008e\u0090\n\4\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094"+
		"\u0095\b\27\2\2\u0095.\3\2\2\2\u0096\u0097\7h\2\2\u0097\u0098\7n\2\2\u0098"+
		"\u0099\7q\2\2\u0099\u009a\7c\2\2\u009a\u00aa\7v\2\2\u009b\u009c\7k\2\2"+
		"\u009c\u009d\7p\2\2\u009d\u00aa\7v\2\2\u009e\u009f\7e\2\2\u009f\u00a0"+
		"\7j\2\2\u00a0\u00a1\7c\2\2\u00a1\u00aa\7t\2\2\u00a2\u00a3\7d\2\2\u00a3"+
		"\u00a4\7q\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7\7g\2\2"+
		"\u00a7\u00a8\7c\2\2\u00a8\u00aa\7p\2\2\u00a9\u0096\3\2\2\2\u00a9\u009b"+
		"\3\2\2\2\u00a9\u009e\3\2\2\2\u00a9\u00a2\3\2\2\2\u00aa\60\3\2\2\2\u00ab"+
		"\u00ac\t\5\2\2\u00ac\u00ae\7\60\2\2\u00ad\u00af\t\6\2\2\u00ae\u00ad\3"+
		"\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\62\3\2\2\2\u00b2\u00b6\t\7\2\2\u00b3\u00b5\t\b\2\2\u00b4\u00b3\3\2\2"+
		"\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00bb"+
		"\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bb\7\62\2\2\u00ba\u00b2\3\2\2\2"+
		"\u00ba\u00b9\3\2\2\2\u00bb\64\3\2\2\2\u00bc\u00c0\t\7\2\2\u00bd\u00bf"+
		"\t\b\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c5\7\60"+
		"\2\2\u00c4\u00c6\t\b\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00cb\7\62"+
		"\2\2\u00ca\u00bc\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00cd\7h\2\2\u00cd\66\3\2\2\2\u00ce\u00cf\7)\2\2\u00cf\u00d0\n\t\2\2"+
		"\u00d0\u00d1\7)\2\2\u00d18\3\2\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7t\2"+
		"\2\u00d4\u00d5\7w\2\2\u00d5\u00dc\7g\2\2\u00d6\u00d7\7h\2\2\u00d7\u00d8"+
		"\7c\2\2\u00d8\u00d9\7n\2\2\u00d9\u00da\7u\2\2\u00da\u00dc\7g\2\2\u00db"+
		"\u00d2\3\2\2\2\u00db\u00d6\3\2\2\2\u00dc:\3\2\2\2\u00dd\u00de\7p\2\2\u00de"+
		"\u00df\7w\2\2\u00df\u00e0\7n\2\2\u00e0\u00e1\7n\2\2\u00e1<\3\2\2\2\u00e2"+
		"\u00e6\t\7\2\2\u00e3\u00e5\t\b\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2"+
		"\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00eb\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e9\u00eb\7\62\2\2\u00ea\u00e2\3\2\2\2\u00ea\u00e9\3"+
		"\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\7N\2\2\u00ed>\3\2\2\2\u00ee\u00f2"+
		"\t\7\2\2\u00ef\u00f1\t\b\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2\3\2"+
		"\2\2\u00f5\u00f7\7\60\2\2\u00f6\u00f8\t\b\2\2\u00f7\u00f6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fd\3\2"+
		"\2\2\u00fb\u00fd\7\62\2\2\u00fc\u00ee\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd"+
		"@\3\2\2\2\u00fe\u00ff\7?\2\2\u00ffB\3\2\2\2\25\2ty\u0083\u0091\u00a9\u00ae"+
		"\u00b0\u00b6\u00ba\u00c0\u00c7\u00ca\u00db\u00e6\u00ea\u00f2\u00f9\u00fc"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}