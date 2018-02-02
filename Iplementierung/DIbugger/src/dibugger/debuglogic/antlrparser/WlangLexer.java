// Generated from Wlang.g4 by ANTLR 4.7
package dibugger.debuglogic.antlrparser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class WlangLexer extends Lexer {
    static {
        RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
    public static final int T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17, T__17 = 18,
            T__18 = 19, T__19 = 20, T__20 = 21, T__21 = 22, T__22 = 23, T__23 = 24, T__24 = 25, T__25 = 26, T__26 = 27,
            T__27 = 28, T__28 = 29, COMPOPERATOR = 30, WS = 31, COMMENT = 32, LINE_COMMENT = 33, TYPE = 34,
            BOOLEANLITERAL = 35, INTLITERAL = 36, FLOATLITERAL = 37, CHARLITERAL = 38, NULLLITERAL = 39,
            LONGLITERAL = 40, DOUBLELITERAL = 41, ASSIGN = 42, ID = 43, REL_ID = 44;
    public static String[] channelNames = { "DEFAULT_TOKEN_CHANNEL", "HIDDEN" };

    public static String[] modeNames = { "DEFAULT_MODE" };

    public static final String[] ruleNames = { "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8",
            "T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", "T__17", "T__18", "T__19", "T__20",
            "T__21", "T__22", "T__23", "T__24", "T__25", "T__26", "T__27", "T__28", "COMPOPERATOR", "WS", "COMMENT",
            "LINE_COMMENT", "TYPE", "BOOLEANLITERAL", "INTLITERAL", "DIGITNONZERO", "DIGIT", "FLOATLITERAL",
            "CHARLITERAL", "NULLLITERAL", "LONGLITERAL", "DOUBLELITERAL", "ASSIGN", "ID", "REL_ID" };

    private static final String[] _LITERAL_NAMES = { null, "'{'", "'}'", "'('", "')'", "'void'", "'main'", "','", "';'",
            "'['", "']'", "'};'", "'return'", "'if'", "'else'", "'while'", "'!'", "'&&'", "'||'", "'<'", "'<='", "'>'",
            "'>='", "'=='", "'!='", "'-'", "'/'", "'*'", "'+'", "'%'", null, null, null, null, null, null, null, null,
            null, "'null'", null, null, "'='" };
    private static final String[] _SYMBOLIC_NAMES = { null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,
            null, "COMPOPERATOR", "WS", "COMMENT", "LINE_COMMENT", "TYPE", "BOOLEANLITERAL", "INTLITERAL",
            "FLOATLITERAL", "CHARLITERAL", "NULLLITERAL", "LONGLITERAL", "DOUBLELITERAL", "ASSIGN", "ID", "REL_ID" };
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
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName() {
        return "Wlang.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public static final String _serializedATN = "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u015f\b\1\4\2\t"
            + "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"
            + "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
            + "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"
            + "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"
            + "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"
            + ",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6"
            + "\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f"
            + "\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"
            + "\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3"
            + "\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3"
            + "\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3"
            + "\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u00bd\n\37\3 \6 \u00c0\n \r \16"
            + " \u00c1\3 \3 \3!\3!\3!\3!\7!\u00ca\n!\f!\16!\u00cd\13!\3!\3!\3!\3!\3!"
            + "\3\"\3\"\3\"\3\"\7\"\u00d8\n\"\f\"\16\"\u00db\13\"\3\"\3\"\3#\3#\3#\3"
            + "#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"
            + "#\3#\3#\5#\u00fc\n#\3#\3#\5#\u0100\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u010b"
            + "\n$\3%\3%\7%\u010f\n%\f%\16%\u0112\13%\3%\5%\u0115\n%\3&\3&\3\'\3\'\3"
            + "(\3(\7(\u011d\n(\f(\16(\u0120\13(\3(\3(\6(\u0124\n(\r(\16(\u0125\3(\5"
            + "(\u0129\n(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\7+\u0138\n+\f+\16+\u013b"
            + "\13+\3+\5+\u013e\n+\3+\3+\3,\3,\7,\u0144\n,\f,\16,\u0147\13,\3,\3,\6,"
            + "\u014b\n,\r,\16,\u014c\3,\5,\u0150\n,\3-\3-\3.\6.\u0155\n.\r.\16.\u0156"
            + "\3/\3/\3/\6/\u015c\n/\r/\16/\u015d\3\u00cb\2\60\3\3\5\4\7\5\t\6\13\7\r"
            + "\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"
            + ")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\2M\2"
            + "O\'Q(S)U*W+Y,[-].\3\2\n\4\2>>@@\5\2\13\f\17\17\"\"\4\2\f\f\17\17\3\2\63"
            + ";\3\2\62;\6\2\f\f\17\17))^^\4\2C\\c|\3\2C\\\2\u0176\2\3\3\2\2\2\2\5\3"
            + "\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"
            + "\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"
            + "\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"
            + "\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"
            + "\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"
            + "?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2O\3"
            + "\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"
            + "\2\2]\3\2\2\2\3_\3\2\2\2\5a\3\2\2\2\7c\3\2\2\2\te\3\2\2\2\13g\3\2\2\2"
            + "\rl\3\2\2\2\17q\3\2\2\2\21s\3\2\2\2\23u\3\2\2\2\25w\3\2\2\2\27y\3\2\2"
            + "\2\31|\3\2\2\2\33\u0083\3\2\2\2\35\u0086\3\2\2\2\37\u008b\3\2\2\2!\u0091"
            + "\3\2\2\2#\u0093\3\2\2\2%\u0096\3\2\2\2\'\u0099\3\2\2\2)\u009b\3\2\2\2"
            + "+\u009e\3\2\2\2-\u00a0\3\2\2\2/\u00a3\3\2\2\2\61\u00a6\3\2\2\2\63\u00a9"
            + "\3\2\2\2\65\u00ab\3\2\2\2\67\u00ad\3\2\2\29\u00af\3\2\2\2;\u00b1\3\2\2"
            + "\2=\u00bc\3\2\2\2?\u00bf\3\2\2\2A\u00c5\3\2\2\2C\u00d3\3\2\2\2E\u00fb"
            + "\3\2\2\2G\u010a\3\2\2\2I\u0114\3\2\2\2K\u0116\3\2\2\2M\u0118\3\2\2\2O"
            + "\u0128\3\2\2\2Q\u012c\3\2\2\2S\u0130\3\2\2\2U\u013d\3\2\2\2W\u014f\3\2"
            + "\2\2Y\u0151\3\2\2\2[\u0154\3\2\2\2]\u0158\3\2\2\2_`\7}\2\2`\4\3\2\2\2"
            + "ab\7\177\2\2b\6\3\2\2\2cd\7*\2\2d\b\3\2\2\2ef\7+\2\2f\n\3\2\2\2gh\7x\2"
            + "\2hi\7q\2\2ij\7k\2\2jk\7f\2\2k\f\3\2\2\2lm\7o\2\2mn\7c\2\2no\7k\2\2op"
            + "\7p\2\2p\16\3\2\2\2qr\7.\2\2r\20\3\2\2\2st\7=\2\2t\22\3\2\2\2uv\7]\2\2"
            + "v\24\3\2\2\2wx\7_\2\2x\26\3\2\2\2yz\7\177\2\2z{\7=\2\2{\30\3\2\2\2|}\7"
            + "t\2\2}~\7g\2\2~\177\7v\2\2\177\u0080\7w\2\2\u0080\u0081\7t\2\2\u0081\u0082"
            + "\7p\2\2\u0082\32\3\2\2\2\u0083\u0084\7k\2\2\u0084\u0085\7h\2\2\u0085\34"
            + "\3\2\2\2\u0086\u0087\7g\2\2\u0087\u0088\7n\2\2\u0088\u0089\7u\2\2\u0089"
            + "\u008a\7g\2\2\u008a\36\3\2\2\2\u008b\u008c\7y\2\2\u008c\u008d\7j\2\2\u008d"
            + "\u008e\7k\2\2\u008e\u008f\7n\2\2\u008f\u0090\7g\2\2\u0090 \3\2\2\2\u0091"
            + "\u0092\7#\2\2\u0092\"\3\2\2\2\u0093\u0094\7(\2\2\u0094\u0095\7(\2\2\u0095"
            + "$\3\2\2\2\u0096\u0097\7~\2\2\u0097\u0098\7~\2\2\u0098&\3\2\2\2\u0099\u009a"
            + "\7>\2\2\u009a(\3\2\2\2\u009b\u009c\7>\2\2\u009c\u009d\7?\2\2\u009d*\3"
            + "\2\2\2\u009e\u009f\7@\2\2\u009f,\3\2\2\2\u00a0\u00a1\7@\2\2\u00a1\u00a2"
            + "\7?\2\2\u00a2.\3\2\2\2\u00a3\u00a4\7?\2\2\u00a4\u00a5\7?\2\2\u00a5\60"
            + "\3\2\2\2\u00a6\u00a7\7#\2\2\u00a7\u00a8\7?\2\2\u00a8\62\3\2\2\2\u00a9"
            + "\u00aa\7/\2\2\u00aa\64\3\2\2\2\u00ab\u00ac\7\61\2\2\u00ac\66\3\2\2\2\u00ad"
            + "\u00ae\7,\2\2\u00ae8\3\2\2\2\u00af\u00b0\7-\2\2\u00b0:\3\2\2\2\u00b1\u00b2"
            + "\7\'\2\2\u00b2<\3\2\2\2\u00b3\u00bd\t\2\2\2\u00b4\u00b5\7>\2\2\u00b5\u00bd"
            + "\7?\2\2\u00b6\u00b7\7@\2\2\u00b7\u00bd\7?\2\2\u00b8\u00b9\7?\2\2\u00b9"
            + "\u00bd\7?\2\2\u00ba\u00bb\7#\2\2\u00bb\u00bd\7?\2\2\u00bc\u00b3\3\2\2"
            + "\2\u00bc\u00b4\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bc\u00ba"
            + "\3\2\2\2\u00bd>\3\2\2\2\u00be\u00c0\t\3\2\2\u00bf\u00be\3\2\2\2\u00c0"
            + "\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2"
            + "\2\2\u00c3\u00c4\b \2\2\u00c4@\3\2\2\2\u00c5\u00c6\7\61\2\2\u00c6\u00c7"
            + "\7,\2\2\u00c7\u00cb\3\2\2\2\u00c8\u00ca\13\2\2\2\u00c9\u00c8\3\2\2\2\u00ca"
            + "\u00cd\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00ce\3\2"
            + "\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\7,\2\2\u00cf\u00d0\7\61\2\2\u00d0"
            + "\u00d1\3\2\2\2\u00d1\u00d2\b!\2\2\u00d2B\3\2\2\2\u00d3\u00d4\7\61\2\2"
            + "\u00d4\u00d5\7\61\2\2\u00d5\u00d9\3\2\2\2\u00d6\u00d8\n\4\2\2\u00d7\u00d6"
            + "\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"
            + "\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\b\"\2\2\u00ddD\3\2\2\2"
            + "\u00de\u00df\7h\2\2\u00df\u00e0\7n\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e2"
            + "\7c\2\2\u00e2\u00fc\7v\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5\7p\2\2\u00e5"
            + "\u00fc\7v\2\2\u00e6\u00e7\7e\2\2\u00e7\u00e8\7j\2\2\u00e8\u00e9\7c\2\2"
            + "\u00e9\u00fc\7t\2\2\u00ea\u00eb\7d\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ed"
            + "\7q\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7c\2\2\u00f0"
            + "\u00fc\7p\2\2\u00f1\u00f2\7f\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7w\2\2"
            + "\u00f4\u00f5\7d\2\2\u00f5\u00f6\7n\2\2\u00f6\u00fc\7g\2\2\u00f7\u00f8"
            + "\7n\2\2\u00f8\u00f9\7q\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fc\7i\2\2\u00fb"
            + "\u00de\3\2\2\2\u00fb\u00e3\3\2\2\2\u00fb\u00e6\3\2\2\2\u00fb\u00ea\3\2"
            + "\2\2\u00fb\u00f1\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd"
            + "\u00fe\7]\2\2\u00fe\u0100\7_\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2"
            + "\2\u0100F\3\2\2\2\u0101\u0102\7v\2\2\u0102\u0103\7t\2\2\u0103\u0104\7"
            + "w\2\2\u0104\u010b\7g\2\2\u0105\u0106\7h\2\2\u0106\u0107\7c\2\2\u0107\u0108"
            + "\7n\2\2\u0108\u0109\7u\2\2\u0109\u010b\7g\2\2\u010a\u0101\3\2\2\2\u010a"
            + "\u0105\3\2\2\2\u010bH\3\2\2\2\u010c\u0110\5K&\2\u010d\u010f\5M\'\2\u010e"
            + "\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2"
            + "\2\2\u0111\u0115\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0115\7\62\2\2\u0114"
            + "\u010c\3\2\2\2\u0114\u0113\3\2\2\2\u0115J\3\2\2\2\u0116\u0117\4\63;\2"
            + "\u0117L\3\2\2\2\u0118\u0119\4\62;\2\u0119N\3\2\2\2\u011a\u011e\t\5\2\2"
            + "\u011b\u011d\t\6\2\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c"
            + "\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121"
            + "\u0123\7\60\2\2\u0122\u0124\t\6\2\2\u0123\u0122\3\2\2\2\u0124\u0125\3"
            + "\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0129\3\2\2\2\u0127"
            + "\u0129\7\62\2\2\u0128\u011a\3\2\2\2\u0128\u0127\3\2\2\2\u0129\u012a\3"
            + "\2\2\2\u012a\u012b\7h\2\2\u012bP\3\2\2\2\u012c\u012d\7)\2\2\u012d\u012e"
            + "\n\7\2\2\u012e\u012f\7)\2\2\u012fR\3\2\2\2\u0130\u0131\7p\2\2\u0131\u0132"
            + "\7w\2\2\u0132\u0133\7n\2\2\u0133\u0134\7n\2\2\u0134T\3\2\2\2\u0135\u0139"
            + "\t\5\2\2\u0136\u0138\t\6\2\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139"
            + "\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013e\3\2\2\2\u013b\u0139\3\2"
            + "\2\2\u013c\u013e\7\62\2\2\u013d\u0135\3\2\2\2\u013d\u013c\3\2\2\2\u013e"
            + "\u013f\3\2\2\2\u013f\u0140\7N\2\2\u0140V\3\2\2\2\u0141\u0145\t\5\2\2\u0142"
            + "\u0144\t\6\2\2\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2"
            + "\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148"
            + "\u014a\7\60\2\2\u0149\u014b\t\6\2\2\u014a\u0149\3\2\2\2\u014b\u014c\3"
            + "\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0150\3\2\2\2\u014e"
            + "\u0150\7\62\2\2\u014f\u0141\3\2\2\2\u014f\u014e\3\2\2\2\u0150X\3\2\2\2"
            + "\u0151\u0152\7?\2\2\u0152Z\3\2\2\2\u0153\u0155\t\b\2\2\u0154\u0153\3\2"
            + "\2\2\u0155\u0156\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157"
            + "\\\3\2\2\2\u0158\u0159\t\t\2\2\u0159\u015b\7\60\2\2\u015a\u015c\t\b\2"
            + "\2\u015b\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e"
            + "\3\2\2\2\u015e^\3\2\2\2\30\2\u00bc\u00c1\u00cb\u00d9\u00fb\u00ff\u010a"
            + "\u0110\u0114\u011e\u0125\u0128\u0139\u013d\u0145\u014c\u014f\u0154\u0156" + "\u015b\u015d\3\b\2\2";
    public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}