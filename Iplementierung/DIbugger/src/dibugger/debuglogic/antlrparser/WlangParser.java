// Generated from Wlang.g4 by ANTLR 4.7
package dibugger.debuglogic.antlrparser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class WlangParser extends Parser {
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
    public static final int RULE_inputparameter = 0, RULE_wecbterm = 1, RULE_program = 2, RULE_routineHead = 3,
            RULE_mainHead = 4, RULE_arglist = 5, RULE_argument = 6, RULE_filledArglist = 7, RULE_filledArgument = 8,
            RULE_routine = 9, RULE_mainRoutine = 10, RULE_statements = 11, RULE_statement = 12, RULE_funcCall = 13,
            RULE_block = 14, RULE_assignment = 15, RULE_arrayDeclaration = 16, RULE_arrayDeclareAssign = 17,
            RULE_arrayElementAssign = 18, RULE_dims = 19, RULE_callingAssign = 20, RULE_pureAssign = 21,
            RULE_declareAssign = 22, RULE_declaration = 23, RULE_returnState = 24, RULE_ifState = 25,
            RULE_ifelseState = 26, RULE_whileState = 27, RULE_condition = 28, RULE_comparison = 29, RULE_term = 30,
            RULE_arrayAccess = 31, RULE_relArrayAccess = 32;
    public static final String[] ruleNames = { "inputparameter", "wecbterm", "program", "routineHead", "mainHead",
            "arglist", "argument", "filledArglist", "filledArgument", "routine", "mainRoutine", "statements",
            "statement", "funcCall", "block", "assignment", "arrayDeclaration", "arrayDeclareAssign",
            "arrayElementAssign", "dims", "callingAssign", "pureAssign", "declareAssign", "declaration", "returnState",
            "ifState", "ifelseState", "whileState", "condition", "comparison", "term", "arrayAccess",
            "relArrayAccess" };

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
    public ATN getATN() {
        return _ATN;
    }

    public WlangParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class InputparameterContext extends ParserRuleContext {
        public InputparameterContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_inputparameter;
        }

        public InputparameterContext() {
        }

        public void copyFrom(InputparameterContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class InputparameterNoArrayContext extends InputparameterContext {
        public TermContext term() {
            return getRuleContext(TermContext.class, 0);
        }

        public InputparameterNoArrayContext(InputparameterContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitInputparameterNoArray(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class InputparameterArrayContext extends InputparameterContext {
        public FilledArglistContext filledArglist() {
            return getRuleContext(FilledArglistContext.class, 0);
        }

        public InputparameterArrayContext(InputparameterContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitInputparameterArray(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final InputparameterContext inputparameter() throws RecognitionException {
        InputparameterContext _localctx = new InputparameterContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_inputparameter);
        try {
            setState(71);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__2:
                case T__24:
                case BOOLEANLITERAL:
                case INTLITERAL:
                case FLOATLITERAL:
                case CHARLITERAL:
                case LONGLITERAL:
                case DOUBLELITERAL:
                case ID:
                case REL_ID:
                    _localctx = new InputparameterNoArrayContext(_localctx);
                    enterOuterAlt(_localctx, 1); {
                    setState(66);
                    term(0);
                }
                    break;
                case T__0:
                    _localctx = new InputparameterArrayContext(_localctx);
                    enterOuterAlt(_localctx, 2); {
                    setState(67);
                    match(T__0);
                    setState(68);
                    filledArglist();
                    setState(69);
                    match(T__1);
                }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class WecbtermContext extends ParserRuleContext {
        public ConditionContext condition() {
            return getRuleContext(ConditionContext.class, 0);
        }

        public TermContext term() {
            return getRuleContext(TermContext.class, 0);
        }

        public WecbtermContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_wecbterm;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitWecbterm(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final WecbtermContext wecbterm() throws RecognitionException {
        WecbtermContext _localctx = new WecbtermContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_wecbterm);
        try {
            setState(75);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1); {
                    setState(73);
                    condition(0);
                }
                    break;
                case 2:
                    enterOuterAlt(_localctx, 2); {
                    setState(74);
                    term(0);
                }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ProgramContext extends ParserRuleContext {
        public MainRoutineContext mainRoutine() {
            return getRuleContext(MainRoutineContext.class, 0);
        }

        public List<RoutineContext> routine() {
            return getRuleContexts(RoutineContext.class);
        }

        public RoutineContext routine(int i) {
            return getRuleContext(RoutineContext.class, i);
        }

        public ProgramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_program;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitProgram(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final ProgramContext program() throws RecognitionException {
        ProgramContext _localctx = new ProgramContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_program);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(80);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(77);
                                routine();
                            }
                        }
                    }
                    setState(82);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 2, _ctx);
                }
                setState(83);
                mainRoutine();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class RoutineHeadContext extends ParserRuleContext {
        public RoutineHeadContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_routineHead;
        }

        public RoutineHeadContext() {
        }

        public void copyFrom(RoutineHeadContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class ProcedureHeadContext extends RoutineHeadContext {
        public Token id;
        public ArglistContext args;

        public TerminalNode ID() {
            return getToken(WlangParser.ID, 0);
        }

        public ArglistContext arglist() {
            return getRuleContext(ArglistContext.class, 0);
        }

        public ProcedureHeadContext(RoutineHeadContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitProcedureHead(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class FunctionHeadContext extends RoutineHeadContext {
        public Token returntype;
        public Token id;
        public ArglistContext args;

        public TerminalNode TYPE() {
            return getToken(WlangParser.TYPE, 0);
        }

        public TerminalNode ID() {
            return getToken(WlangParser.ID, 0);
        }

        public ArglistContext arglist() {
            return getRuleContext(ArglistContext.class, 0);
        }

        public FunctionHeadContext(RoutineHeadContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitFunctionHead(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final RoutineHeadContext routineHead() throws RecognitionException {
        RoutineHeadContext _localctx = new RoutineHeadContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_routineHead);
        int _la;
        try {
            setState(99);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case TYPE:
                    _localctx = new FunctionHeadContext(_localctx);
                    enterOuterAlt(_localctx, 1); {
                    setState(85);
                    ((FunctionHeadContext) _localctx).returntype = match(TYPE);
                    setState(86);
                    ((FunctionHeadContext) _localctx).id = match(ID);
                    setState(87);
                    match(T__2);
                    setState(89);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == TYPE) {
                        {
                            setState(88);
                            ((FunctionHeadContext) _localctx).args = arglist();
                        }
                    }

                    setState(91);
                    match(T__3);
                }
                    break;
                case T__4:
                    _localctx = new ProcedureHeadContext(_localctx);
                    enterOuterAlt(_localctx, 2); {
                    setState(92);
                    match(T__4);
                    setState(93);
                    ((ProcedureHeadContext) _localctx).id = match(ID);
                    setState(94);
                    match(T__2);
                    setState(96);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == TYPE) {
                        {
                            setState(95);
                            ((ProcedureHeadContext) _localctx).args = arglist();
                        }
                    }

                    setState(98);
                    match(T__3);
                }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MainHeadContext extends ParserRuleContext {
        public MainHeadContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_mainHead;
        }

        public MainHeadContext() {
        }

        public void copyFrom(MainHeadContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class MainProcedureHeadContext extends MainHeadContext {
        public ArglistContext args;

        public ArglistContext arglist() {
            return getRuleContext(ArglistContext.class, 0);
        }

        public MainProcedureHeadContext(MainHeadContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitMainProcedureHead(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class MainFunctionHeadContext extends MainHeadContext {
        public Token returntype;
        public ArglistContext args;

        public TerminalNode TYPE() {
            return getToken(WlangParser.TYPE, 0);
        }

        public ArglistContext arglist() {
            return getRuleContext(ArglistContext.class, 0);
        }

        public MainFunctionHeadContext(MainHeadContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitMainFunctionHead(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final MainHeadContext mainHead() throws RecognitionException {
        MainHeadContext _localctx = new MainHeadContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_mainHead);
        int _la;
        try {
            setState(115);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case TYPE:
                    _localctx = new MainFunctionHeadContext(_localctx);
                    enterOuterAlt(_localctx, 1); {
                    setState(101);
                    ((MainFunctionHeadContext) _localctx).returntype = match(TYPE);
                    setState(102);
                    match(T__5);
                    setState(103);
                    match(T__2);
                    setState(105);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == TYPE) {
                        {
                            setState(104);
                            ((MainFunctionHeadContext) _localctx).args = arglist();
                        }
                    }

                    setState(107);
                    match(T__3);
                }
                    break;
                case T__4:
                    _localctx = new MainProcedureHeadContext(_localctx);
                    enterOuterAlt(_localctx, 2); {
                    setState(108);
                    match(T__4);
                    setState(109);
                    match(T__5);
                    setState(110);
                    match(T__2);
                    setState(112);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == TYPE) {
                        {
                            setState(111);
                            ((MainProcedureHeadContext) _localctx).args = arglist();
                        }
                    }

                    setState(114);
                    match(T__3);
                }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ArglistContext extends ParserRuleContext {
        public ArgumentContext argument() {
            return getRuleContext(ArgumentContext.class, 0);
        }

        public ArglistContext arglist() {
            return getRuleContext(ArglistContext.class, 0);
        }

        public ArglistContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arglist;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitArglist(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final ArglistContext arglist() throws RecognitionException {
        ArglistContext _localctx = new ArglistContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_arglist);
        try {
            setState(122);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 9, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1); {
                    setState(117);
                    argument();
                    setState(118);
                    match(T__6);
                    setState(119);
                    arglist();
                }
                    break;
                case 2:
                    enterOuterAlt(_localctx, 2); {
                    setState(121);
                    argument();
                }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ArgumentContext extends ParserRuleContext {
        public Token type;
        public Token id;

        public TerminalNode TYPE() {
            return getToken(WlangParser.TYPE, 0);
        }

        public TerminalNode ID() {
            return getToken(WlangParser.ID, 0);
        }

        public ArgumentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_argument;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitArgument(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final ArgumentContext argument() throws RecognitionException {
        ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_argument);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(124);
                ((ArgumentContext) _localctx).type = match(TYPE);
                setState(125);
                ((ArgumentContext) _localctx).id = match(ID);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FilledArglistContext extends ParserRuleContext {
        public FilledArgumentContext filledArgument() {
            return getRuleContext(FilledArgumentContext.class, 0);
        }

        public FilledArglistContext filledArglist() {
            return getRuleContext(FilledArglistContext.class, 0);
        }

        public FilledArglistContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_filledArglist;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitFilledArglist(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final FilledArglistContext filledArglist() throws RecognitionException {
        FilledArglistContext _localctx = new FilledArglistContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_filledArglist);
        try {
            setState(132);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 10, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1); {
                    setState(127);
                    filledArgument();
                    setState(128);
                    match(T__6);
                    setState(129);
                    filledArglist();
                }
                    break;
                case 2:
                    enterOuterAlt(_localctx, 2); {
                    setState(131);
                    filledArgument();
                }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FilledArgumentContext extends ParserRuleContext {
        public TermContext term() {
            return getRuleContext(TermContext.class, 0);
        }

        public FilledArgumentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_filledArgument;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitFilledArgument(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final FilledArgumentContext filledArgument() throws RecognitionException {
        FilledArgumentContext _localctx = new FilledArgumentContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_filledArgument);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(134);
                term(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class RoutineContext extends ParserRuleContext {
        public RoutineHeadContext routineHead() {
            return getRuleContext(RoutineHeadContext.class, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public RoutineContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_routine;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitRoutine(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final RoutineContext routine() throws RecognitionException {
        RoutineContext _localctx = new RoutineContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_routine);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(136);
                routineHead();
                setState(137);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MainRoutineContext extends ParserRuleContext {
        public MainHeadContext mainHead() {
            return getRuleContext(MainHeadContext.class, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public MainRoutineContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_mainRoutine;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitMainRoutine(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final MainRoutineContext mainRoutine() throws RecognitionException {
        MainRoutineContext _localctx = new MainRoutineContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_mainRoutine);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(139);
                mainHead();
                setState(140);
                block();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class StatementsContext extends ParserRuleContext {
        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public StatementsContext statements() {
            return getRuleContext(StatementsContext.class, 0);
        }

        public StatementsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statements;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitStatements(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final StatementsContext statements() throws RecognitionException {
        StatementsContext _localctx = new StatementsContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_statements);
        try {
            setState(146);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1); {
                    setState(142);
                    statement();
                    setState(143);
                    statements();
                }
                    break;
                case 2:
                    enterOuterAlt(_localctx, 2); {
                    setState(145);
                    statement();
                }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class StatementContext extends ParserRuleContext {
        public IfStateContext ifState() {
            return getRuleContext(IfStateContext.class, 0);
        }

        public IfelseStateContext ifelseState() {
            return getRuleContext(IfelseStateContext.class, 0);
        }

        public WhileStateContext whileState() {
            return getRuleContext(WhileStateContext.class, 0);
        }

        public AssignmentContext assignment() {
            return getRuleContext(AssignmentContext.class, 0);
        }

        public ArrayDeclarationContext arrayDeclaration() {
            return getRuleContext(ArrayDeclarationContext.class, 0);
        }

        public ArrayDeclareAssignContext arrayDeclareAssign() {
            return getRuleContext(ArrayDeclareAssignContext.class, 0);
        }

        public ArrayElementAssignContext arrayElementAssign() {
            return getRuleContext(ArrayElementAssignContext.class, 0);
        }

        public DeclarationContext declaration() {
            return getRuleContext(DeclarationContext.class, 0);
        }

        public FuncCallContext funcCall() {
            return getRuleContext(FuncCallContext.class, 0);
        }

        public ReturnStateContext returnState() {
            return getRuleContext(ReturnStateContext.class, 0);
        }

        public StatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statement;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitStatement(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_statement);
        try {
            setState(160);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1); {
                    setState(148);
                    ifState();
                }
                    break;
                case 2:
                    enterOuterAlt(_localctx, 2); {
                    setState(149);
                    ifelseState();
                }
                    break;
                case 3:
                    enterOuterAlt(_localctx, 3); {
                    setState(150);
                    whileState();
                }
                    break;
                case 4:
                    enterOuterAlt(_localctx, 4); {
                    setState(151);
                    assignment();
                }
                    break;
                case 5:
                    enterOuterAlt(_localctx, 5); {
                    setState(152);
                    arrayDeclaration();
                }
                    break;
                case 6:
                    enterOuterAlt(_localctx, 6); {
                    setState(153);
                    arrayDeclareAssign();
                }
                    break;
                case 7:
                    enterOuterAlt(_localctx, 7); {
                    setState(154);
                    arrayElementAssign();
                }
                    break;
                case 8:
                    enterOuterAlt(_localctx, 8); {
                    setState(155);
                    declaration();
                }
                    break;
                case 9:
                    enterOuterAlt(_localctx, 9); {
                    setState(156);
                    funcCall();
                    setState(157);
                    match(T__7);
                }
                    break;
                case 10:
                    enterOuterAlt(_localctx, 10); {
                    setState(159);
                    returnState();
                }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FuncCallContext extends ParserRuleContext {
        public Token functionname;
        public FilledArglistContext args;

        public TerminalNode ID() {
            return getToken(WlangParser.ID, 0);
        }

        public FilledArglistContext filledArglist() {
            return getRuleContext(FilledArglistContext.class, 0);
        }

        public FuncCallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_funcCall;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitFuncCall(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final FuncCallContext funcCall() throws RecognitionException {
        FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_funcCall);
        int _la;
        try {
            setState(174);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ID:
                    enterOuterAlt(_localctx, 1); {
                    setState(162);
                    ((FuncCallContext) _localctx).functionname = match(ID);
                    setState(163);
                    match(T__2);
                    setState(165);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__24) | (1L << BOOLEANLITERAL)
                            | (1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << CHARLITERAL) | (1L << LONGLITERAL)
                            | (1L << DOUBLELITERAL) | (1L << ID) | (1L << REL_ID))) != 0)) {
                        {
                            setState(164);
                            ((FuncCallContext) _localctx).args = filledArglist();
                        }
                    }

                    setState(167);
                    match(T__3);
                }
                    break;
                case T__5:
                    enterOuterAlt(_localctx, 2); {
                    setState(168);
                    ((FuncCallContext) _localctx).functionname = match(T__5);
                    setState(169);
                    match(T__2);
                    setState(171);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__24) | (1L << BOOLEANLITERAL)
                            | (1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << CHARLITERAL) | (1L << LONGLITERAL)
                            | (1L << DOUBLELITERAL) | (1L << ID) | (1L << REL_ID))) != 0)) {
                        {
                            setState(170);
                            ((FuncCallContext) _localctx).args = filledArglist();
                        }
                    }

                    setState(173);
                    match(T__3);
                }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class BlockContext extends ParserRuleContext {
        public StatementsContext statements() {
            return getRuleContext(StatementsContext.class, 0);
        }

        public BlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_block;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitBlock(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final BlockContext block() throws RecognitionException {
        BlockContext _localctx = new BlockContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_block);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(176);
                match(T__0);
                setState(177);
                statements();
                setState(178);
                match(T__1);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AssignmentContext extends ParserRuleContext {
        public DeclareAssignContext declareAssign() {
            return getRuleContext(DeclareAssignContext.class, 0);
        }

        public PureAssignContext pureAssign() {
            return getRuleContext(PureAssignContext.class, 0);
        }

        public CallingAssignContext callingAssign() {
            return getRuleContext(CallingAssignContext.class, 0);
        }

        public AssignmentContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_assignment;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitAssignment(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final AssignmentContext assignment() throws RecognitionException {
        AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_assignment);
        try {
            setState(183);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 16, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1); {
                    setState(180);
                    declareAssign();
                }
                    break;
                case 2:
                    enterOuterAlt(_localctx, 2); {
                    setState(181);
                    pureAssign();
                }
                    break;
                case 3:
                    enterOuterAlt(_localctx, 3); {
                    setState(182);
                    callingAssign();
                }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ArrayDeclarationContext extends ParserRuleContext {
        public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arrayDeclaration;
        }

        public ArrayDeclarationContext() {
        }

        public void copyFrom(ArrayDeclarationContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class ArrayDeclarationTwoDimContext extends ArrayDeclarationContext {
        public Token type;
        public TermContext firstIndex;
        public TermContext secondIndex;
        public Token id;

        public TerminalNode TYPE() {
            return getToken(WlangParser.TYPE, 0);
        }

        public List<TermContext> term() {
            return getRuleContexts(TermContext.class);
        }

        public TermContext term(int i) {
            return getRuleContext(TermContext.class, i);
        }

        public TerminalNode ID() {
            return getToken(WlangParser.ID, 0);
        }

        public ArrayDeclarationTwoDimContext(ArrayDeclarationContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitArrayDeclarationTwoDim(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class ArrayDeclarationOneDimContext extends ArrayDeclarationContext {
        public Token type;
        public TermContext index;
        public Token id;

        public TerminalNode TYPE() {
            return getToken(WlangParser.TYPE, 0);
        }

        public TermContext term() {
            return getRuleContext(TermContext.class, 0);
        }

        public TerminalNode ID() {
            return getToken(WlangParser.ID, 0);
        }

        public ArrayDeclarationOneDimContext(ArrayDeclarationContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitArrayDeclarationOneDim(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class ArrayDeclarationThreeDimContext extends ArrayDeclarationContext {
        public Token type;
        public TermContext firstIndex;
        public TermContext secondIndex;
        public TermContext thirdIndex;
        public Token id;

        public TerminalNode TYPE() {
            return getToken(WlangParser.TYPE, 0);
        }

        public List<TermContext> term() {
            return getRuleContexts(TermContext.class);
        }

        public TermContext term(int i) {
            return getRuleContext(TermContext.class, i);
        }

        public TerminalNode ID() {
            return getToken(WlangParser.ID, 0);
        }

        public ArrayDeclarationThreeDimContext(ArrayDeclarationContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitArrayDeclarationThreeDim(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
        ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_arrayDeclaration);
        try {
            setState(215);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
                case 1:
                    _localctx = new ArrayDeclarationOneDimContext(_localctx);
                    enterOuterAlt(_localctx, 1); {
                    setState(185);
                    ((ArrayDeclarationOneDimContext) _localctx).type = match(TYPE);
                    setState(186);
                    match(T__8);
                    setState(187);
                    ((ArrayDeclarationOneDimContext) _localctx).index = term(0);
                    setState(188);
                    match(T__9);
                    setState(189);
                    ((ArrayDeclarationOneDimContext) _localctx).id = match(ID);
                    setState(190);
                    match(T__7);
                }
                    break;
                case 2:
                    _localctx = new ArrayDeclarationTwoDimContext(_localctx);
                    enterOuterAlt(_localctx, 2); {
                    setState(192);
                    ((ArrayDeclarationTwoDimContext) _localctx).type = match(TYPE);
                    setState(193);
                    match(T__8);
                    setState(194);
                    ((ArrayDeclarationTwoDimContext) _localctx).firstIndex = term(0);
                    setState(195);
                    match(T__9);
                    setState(196);
                    match(T__8);
                    setState(197);
                    ((ArrayDeclarationTwoDimContext) _localctx).secondIndex = term(0);
                    setState(198);
                    match(T__9);
                    setState(199);
                    ((ArrayDeclarationTwoDimContext) _localctx).id = match(ID);
                    setState(200);
                    match(T__7);
                }
                    break;
                case 3:
                    _localctx = new ArrayDeclarationThreeDimContext(_localctx);
                    enterOuterAlt(_localctx, 3); {
                    setState(202);
                    ((ArrayDeclarationThreeDimContext) _localctx).type = match(TYPE);
                    setState(203);
                    match(T__8);
                    setState(204);
                    ((ArrayDeclarationThreeDimContext) _localctx).firstIndex = term(0);
                    setState(205);
                    match(T__9);
                    setState(206);
                    match(T__8);
                    setState(207);
                    ((ArrayDeclarationThreeDimContext) _localctx).secondIndex = term(0);
                    setState(208);
                    match(T__9);
                    setState(209);
                    match(T__8);
                    setState(210);
                    ((ArrayDeclarationThreeDimContext) _localctx).thirdIndex = term(0);
                    setState(211);
                    match(T__9);
                    setState(212);
                    ((ArrayDeclarationThreeDimContext) _localctx).id = match(ID);
                    setState(213);
                    match(T__7);
                }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ArrayDeclareAssignContext extends ParserRuleContext {
        public Token type;
        public Token id;

        public TermContext term() {
            return getRuleContext(TermContext.class, 0);
        }

        public TerminalNode ASSIGN() {
            return getToken(WlangParser.ASSIGN, 0);
        }

        public FilledArglistContext filledArglist() {
            return getRuleContext(FilledArglistContext.class, 0);
        }

        public TerminalNode TYPE() {
            return getToken(WlangParser.TYPE, 0);
        }

        public TerminalNode ID() {
            return getToken(WlangParser.ID, 0);
        }

        public ArrayDeclareAssignContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arrayDeclareAssign;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitArrayDeclareAssign(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final ArrayDeclareAssignContext arrayDeclareAssign() throws RecognitionException {
        ArrayDeclareAssignContext _localctx = new ArrayDeclareAssignContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_arrayDeclareAssign);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(217);
                ((ArrayDeclareAssignContext) _localctx).type = match(TYPE);
                setState(218);
                match(T__8);
                setState(219);
                term(0);
                setState(220);
                match(T__9);
                setState(221);
                ((ArrayDeclareAssignContext) _localctx).id = match(ID);
                setState(222);
                match(ASSIGN);
                setState(223);
                match(T__0);
                setState(224);
                filledArglist();
                setState(225);
                match(T__10);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ArrayElementAssignContext extends ParserRuleContext {
        public ArrayElementAssignContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arrayElementAssign;
        }

        public ArrayElementAssignContext() {
        }

        public void copyFrom(ArrayElementAssignContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class ArrayElementAssignThreeDimContext extends ArrayElementAssignContext {
        public Token id;
        public TermContext firstIndex;
        public TermContext secondIndex;
        public TermContext thirdIndex;
        public TermContext value;

        public TerminalNode ASSIGN() {
            return getToken(WlangParser.ASSIGN, 0);
        }

        public TerminalNode ID() {
            return getToken(WlangParser.ID, 0);
        }

        public List<TermContext> term() {
            return getRuleContexts(TermContext.class);
        }

        public TermContext term(int i) {
            return getRuleContext(TermContext.class, i);
        }

        public ArrayElementAssignThreeDimContext(ArrayElementAssignContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitArrayElementAssignThreeDim(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class ArrayElementAssignTwoDimContext extends ArrayElementAssignContext {
        public Token id;
        public TermContext firstIndex;
        public TermContext secondIndex;
        public TermContext value;

        public TerminalNode ASSIGN() {
            return getToken(WlangParser.ASSIGN, 0);
        }

        public TerminalNode ID() {
            return getToken(WlangParser.ID, 0);
        }

        public List<TermContext> term() {
            return getRuleContexts(TermContext.class);
        }

        public TermContext term(int i) {
            return getRuleContext(TermContext.class, i);
        }

        public ArrayElementAssignTwoDimContext(ArrayElementAssignContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitArrayElementAssignTwoDim(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class ArrayElementAssignOneDimContext extends ArrayElementAssignContext {
        public Token id;
        public TermContext index;
        public TermContext value;

        public TerminalNode ASSIGN() {
            return getToken(WlangParser.ASSIGN, 0);
        }

        public TerminalNode ID() {
            return getToken(WlangParser.ID, 0);
        }

        public List<TermContext> term() {
            return getRuleContexts(TermContext.class);
        }

        public TermContext term(int i) {
            return getRuleContext(TermContext.class, i);
        }

        public ArrayElementAssignOneDimContext(ArrayElementAssignContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitArrayElementAssignOneDim(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final ArrayElementAssignContext arrayElementAssign() throws RecognitionException {
        ArrayElementAssignContext _localctx = new ArrayElementAssignContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_arrayElementAssign);
        try {
            setState(260);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 18, _ctx)) {
                case 1:
                    _localctx = new ArrayElementAssignOneDimContext(_localctx);
                    enterOuterAlt(_localctx, 1); {
                    setState(227);
                    ((ArrayElementAssignOneDimContext) _localctx).id = match(ID);
                    setState(228);
                    match(T__8);
                    setState(229);
                    ((ArrayElementAssignOneDimContext) _localctx).index = term(0);
                    setState(230);
                    match(T__9);
                    setState(231);
                    match(ASSIGN);
                    setState(232);
                    ((ArrayElementAssignOneDimContext) _localctx).value = term(0);
                    setState(233);
                    match(T__7);
                }
                    break;
                case 2:
                    _localctx = new ArrayElementAssignTwoDimContext(_localctx);
                    enterOuterAlt(_localctx, 2); {
                    setState(235);
                    ((ArrayElementAssignTwoDimContext) _localctx).id = match(ID);
                    setState(236);
                    match(T__8);
                    setState(237);
                    ((ArrayElementAssignTwoDimContext) _localctx).firstIndex = term(0);
                    setState(238);
                    match(T__9);
                    setState(239);
                    match(T__8);
                    setState(240);
                    ((ArrayElementAssignTwoDimContext) _localctx).secondIndex = term(0);
                    setState(241);
                    match(T__9);
                    setState(242);
                    match(ASSIGN);
                    setState(243);
                    ((ArrayElementAssignTwoDimContext) _localctx).value = term(0);
                    setState(244);
                    match(T__7);
                }
                    break;
                case 3:
                    _localctx = new ArrayElementAssignThreeDimContext(_localctx);
                    enterOuterAlt(_localctx, 3); {
                    setState(246);
                    ((ArrayElementAssignThreeDimContext) _localctx).id = match(ID);
                    setState(247);
                    match(T__8);
                    setState(248);
                    ((ArrayElementAssignThreeDimContext) _localctx).firstIndex = term(0);
                    setState(249);
                    match(T__9);
                    setState(250);
                    match(T__8);
                    setState(251);
                    ((ArrayElementAssignThreeDimContext) _localctx).secondIndex = term(0);
                    setState(252);
                    match(T__9);
                    setState(253);
                    match(T__8);
                    setState(254);
                    ((ArrayElementAssignThreeDimContext) _localctx).thirdIndex = term(0);
                    setState(255);
                    match(T__9);
                    setState(256);
                    match(ASSIGN);
                    setState(257);
                    ((ArrayElementAssignThreeDimContext) _localctx).value = term(0);
                    setState(258);
                    match(T__7);
                }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DimsContext extends ParserRuleContext {
        public DimsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_dims;
        }

        public DimsContext() {
        }

        public void copyFrom(DimsContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class ThreeDimsContext extends DimsContext {
        public List<TermContext> term() {
            return getRuleContexts(TermContext.class);
        }

        public TermContext term(int i) {
            return getRuleContext(TermContext.class, i);
        }

        public ThreeDimsContext(DimsContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitThreeDims(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class TwoDimsContext extends DimsContext {
        public List<TermContext> term() {
            return getRuleContexts(TermContext.class);
        }

        public TermContext term(int i) {
            return getRuleContext(TermContext.class, i);
        }

        public TwoDimsContext(DimsContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitTwoDims(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class OneDimsContext extends DimsContext {
        public TermContext term() {
            return getRuleContext(TermContext.class, 0);
        }

        public OneDimsContext(DimsContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitOneDims(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final DimsContext dims() throws RecognitionException {
        DimsContext _localctx = new DimsContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_dims);
        try {
            setState(283);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
                case 1:
                    _localctx = new OneDimsContext(_localctx);
                    enterOuterAlt(_localctx, 1); {
                    setState(262);
                    match(T__8);
                    setState(263);
                    term(0);
                    setState(264);
                    match(T__9);
                }
                    break;
                case 2:
                    _localctx = new TwoDimsContext(_localctx);
                    enterOuterAlt(_localctx, 2); {
                    setState(266);
                    match(T__8);
                    setState(267);
                    term(0);
                    setState(268);
                    match(T__9);
                    setState(269);
                    match(T__8);
                    setState(270);
                    term(0);
                    setState(271);
                    match(T__9);
                }
                    break;
                case 3:
                    _localctx = new ThreeDimsContext(_localctx);
                    enterOuterAlt(_localctx, 3); {
                    setState(273);
                    match(T__8);
                    setState(274);
                    term(0);
                    setState(275);
                    match(T__9);
                    setState(276);
                    match(T__8);
                    setState(277);
                    term(0);
                    setState(278);
                    match(T__9);
                    setState(279);
                    match(T__8);
                    setState(280);
                    term(0);
                    setState(281);
                    match(T__9);
                }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class CallingAssignContext extends ParserRuleContext {
        public Token id;
        public FuncCallContext value;

        public TerminalNode ASSIGN() {
            return getToken(WlangParser.ASSIGN, 0);
        }

        public TerminalNode ID() {
            return getToken(WlangParser.ID, 0);
        }

        public FuncCallContext funcCall() {
            return getRuleContext(FuncCallContext.class, 0);
        }

        public CallingAssignContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_callingAssign;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitCallingAssign(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final CallingAssignContext callingAssign() throws RecognitionException {
        CallingAssignContext _localctx = new CallingAssignContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_callingAssign);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(285);
                ((CallingAssignContext) _localctx).id = match(ID);
                setState(286);
                match(ASSIGN);
                setState(287);
                ((CallingAssignContext) _localctx).value = funcCall();
                setState(288);
                match(T__7);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class PureAssignContext extends ParserRuleContext {
        public Token id;
        public TermContext value;

        public TerminalNode ASSIGN() {
            return getToken(WlangParser.ASSIGN, 0);
        }

        public TerminalNode ID() {
            return getToken(WlangParser.ID, 0);
        }

        public TermContext term() {
            return getRuleContext(TermContext.class, 0);
        }

        public PureAssignContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_pureAssign;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitPureAssign(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final PureAssignContext pureAssign() throws RecognitionException {
        PureAssignContext _localctx = new PureAssignContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_pureAssign);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(290);
                ((PureAssignContext) _localctx).id = match(ID);
                setState(291);
                match(ASSIGN);
                setState(292);
                ((PureAssignContext) _localctx).value = term(0);
                setState(293);
                match(T__7);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DeclareAssignContext extends ParserRuleContext {
        public Token type;
        public Token id;
        public TermContext value;

        public TerminalNode ASSIGN() {
            return getToken(WlangParser.ASSIGN, 0);
        }

        public TerminalNode TYPE() {
            return getToken(WlangParser.TYPE, 0);
        }

        public TerminalNode ID() {
            return getToken(WlangParser.ID, 0);
        }

        public TermContext term() {
            return getRuleContext(TermContext.class, 0);
        }

        public DeclareAssignContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_declareAssign;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitDeclareAssign(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final DeclareAssignContext declareAssign() throws RecognitionException {
        DeclareAssignContext _localctx = new DeclareAssignContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_declareAssign);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(295);
                ((DeclareAssignContext) _localctx).type = match(TYPE);
                setState(296);
                ((DeclareAssignContext) _localctx).id = match(ID);
                setState(297);
                match(ASSIGN);
                setState(298);
                ((DeclareAssignContext) _localctx).value = term(0);
                setState(299);
                match(T__7);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class DeclarationContext extends ParserRuleContext {
        public Token type;
        public Token id;

        public TerminalNode TYPE() {
            return getToken(WlangParser.TYPE, 0);
        }

        public TerminalNode ID() {
            return getToken(WlangParser.ID, 0);
        }

        public DeclarationContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_declaration;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitDeclaration(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final DeclarationContext declaration() throws RecognitionException {
        DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_declaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(301);
                ((DeclarationContext) _localctx).type = match(TYPE);
                setState(302);
                ((DeclarationContext) _localctx).id = match(ID);
                setState(303);
                match(T__7);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ReturnStateContext extends ParserRuleContext {
        public TermContext returnvalue;

        public TermContext term() {
            return getRuleContext(TermContext.class, 0);
        }

        public ReturnStateContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_returnState;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitReturnState(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final ReturnStateContext returnState() throws RecognitionException {
        ReturnStateContext _localctx = new ReturnStateContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_returnState);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(305);
                match(T__11);
                setState(306);
                ((ReturnStateContext) _localctx).returnvalue = term(0);
                setState(307);
                match(T__7);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class IfStateContext extends ParserRuleContext {
        public IfStateContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ifState;
        }

        public IfStateContext() {
        }

        public void copyFrom(IfStateContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class IfWithBlockContext extends IfStateContext {
        public BlockContext content;

        public ConditionContext condition() {
            return getRuleContext(ConditionContext.class, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public IfWithBlockContext(IfStateContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitIfWithBlock(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class IfWithSingleContext extends IfStateContext {
        public StatementContext content;

        public ConditionContext condition() {
            return getRuleContext(ConditionContext.class, 0);
        }

        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public IfWithSingleContext(IfStateContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitIfWithSingle(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final IfStateContext ifState() throws RecognitionException {
        IfStateContext _localctx = new IfStateContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_ifState);
        try {
            setState(321);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 20, _ctx)) {
                case 1:
                    _localctx = new IfWithBlockContext(_localctx);
                    enterOuterAlt(_localctx, 1); {
                    setState(309);
                    match(T__12);
                    setState(310);
                    match(T__2);
                    setState(311);
                    condition(0);
                    setState(312);
                    match(T__3);
                    setState(313);
                    ((IfWithBlockContext) _localctx).content = block();
                }
                    break;
                case 2:
                    _localctx = new IfWithSingleContext(_localctx);
                    enterOuterAlt(_localctx, 2); {
                    setState(315);
                    match(T__12);
                    setState(316);
                    match(T__2);
                    setState(317);
                    condition(0);
                    setState(318);
                    match(T__3);
                    setState(319);
                    ((IfWithSingleContext) _localctx).content = statement();
                }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class IfelseStateContext extends ParserRuleContext {
        public IfelseStateContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ifelseState;
        }

        public IfelseStateContext() {
        }

        public void copyFrom(IfelseStateContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class IfWithSingleElseWithSingleContext extends IfelseStateContext {
        public StatementContext ifcontent;
        public StatementContext elsecontent;

        public ConditionContext condition() {
            return getRuleContext(ConditionContext.class, 0);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        public IfWithSingleElseWithSingleContext(IfelseStateContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitIfWithSingleElseWithSingle(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class IfWithSingleElseWithBlockContext extends IfelseStateContext {
        public StatementContext ifcontent;
        public BlockContext elsecontent;

        public ConditionContext condition() {
            return getRuleContext(ConditionContext.class, 0);
        }

        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public IfWithSingleElseWithBlockContext(IfelseStateContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitIfWithSingleElseWithBlock(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class IfWithBlockElseWithSingleContext extends IfelseStateContext {
        public BlockContext ifcontent;
        public StatementContext elsecontent;

        public ConditionContext condition() {
            return getRuleContext(ConditionContext.class, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public IfWithBlockElseWithSingleContext(IfelseStateContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitIfWithBlockElseWithSingle(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class IfWithBlockElseWithBlockContext extends IfelseStateContext {
        public BlockContext ifcontent;
        public BlockContext elsecontent;

        public ConditionContext condition() {
            return getRuleContext(ConditionContext.class, 0);
        }

        public List<BlockContext> block() {
            return getRuleContexts(BlockContext.class);
        }

        public BlockContext block(int i) {
            return getRuleContext(BlockContext.class, i);
        }

        public IfWithBlockElseWithBlockContext(IfelseStateContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitIfWithBlockElseWithBlock(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final IfelseStateContext ifelseState() throws RecognitionException {
        IfelseStateContext _localctx = new IfelseStateContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_ifelseState);
        try {
            setState(355);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 21, _ctx)) {
                case 1:
                    _localctx = new IfWithBlockElseWithBlockContext(_localctx);
                    enterOuterAlt(_localctx, 1); {
                    setState(323);
                    match(T__12);
                    setState(324);
                    match(T__2);
                    setState(325);
                    condition(0);
                    setState(326);
                    match(T__3);
                    setState(327);
                    ((IfWithBlockElseWithBlockContext) _localctx).ifcontent = block();
                    setState(328);
                    match(T__13);
                    setState(329);
                    ((IfWithBlockElseWithBlockContext) _localctx).elsecontent = block();
                }
                    break;
                case 2:
                    _localctx = new IfWithBlockElseWithSingleContext(_localctx);
                    enterOuterAlt(_localctx, 2); {
                    setState(331);
                    match(T__12);
                    setState(332);
                    match(T__2);
                    setState(333);
                    condition(0);
                    setState(334);
                    match(T__3);
                    setState(335);
                    ((IfWithBlockElseWithSingleContext) _localctx).ifcontent = block();
                    setState(336);
                    match(T__13);
                    setState(337);
                    ((IfWithBlockElseWithSingleContext) _localctx).elsecontent = statement();
                }
                    break;
                case 3:
                    _localctx = new IfWithSingleElseWithBlockContext(_localctx);
                    enterOuterAlt(_localctx, 3); {
                    setState(339);
                    match(T__12);
                    setState(340);
                    match(T__2);
                    setState(341);
                    condition(0);
                    setState(342);
                    match(T__3);
                    setState(343);
                    ((IfWithSingleElseWithBlockContext) _localctx).ifcontent = statement();
                    setState(344);
                    match(T__13);
                    setState(345);
                    ((IfWithSingleElseWithBlockContext) _localctx).elsecontent = block();
                }
                    break;
                case 4:
                    _localctx = new IfWithSingleElseWithSingleContext(_localctx);
                    enterOuterAlt(_localctx, 4); {
                    setState(347);
                    match(T__12);
                    setState(348);
                    match(T__2);
                    setState(349);
                    condition(0);
                    setState(350);
                    match(T__3);
                    setState(351);
                    ((IfWithSingleElseWithSingleContext) _localctx).ifcontent = statement();
                    setState(352);
                    match(T__13);
                    setState(353);
                    ((IfWithSingleElseWithSingleContext) _localctx).elsecontent = statement();
                }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class WhileStateContext extends ParserRuleContext {
        public WhileStateContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_whileState;
        }

        public WhileStateContext() {
        }

        public void copyFrom(WhileStateContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class WhileWithBlockContext extends WhileStateContext {
        public BlockContext content;

        public ConditionContext condition() {
            return getRuleContext(ConditionContext.class, 0);
        }

        public BlockContext block() {
            return getRuleContext(BlockContext.class, 0);
        }

        public WhileWithBlockContext(WhileStateContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitWhileWithBlock(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class WhileWithSingleContext extends WhileStateContext {
        public StatementContext content;

        public ConditionContext condition() {
            return getRuleContext(ConditionContext.class, 0);
        }

        public StatementContext statement() {
            return getRuleContext(StatementContext.class, 0);
        }

        public WhileWithSingleContext(WhileStateContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitWhileWithSingle(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final WhileStateContext whileState() throws RecognitionException {
        WhileStateContext _localctx = new WhileStateContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_whileState);
        try {
            setState(369);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 22, _ctx)) {
                case 1:
                    _localctx = new WhileWithBlockContext(_localctx);
                    enterOuterAlt(_localctx, 1); {
                    setState(357);
                    match(T__14);
                    setState(358);
                    match(T__2);
                    setState(359);
                    condition(0);
                    setState(360);
                    match(T__3);
                    setState(361);
                    ((WhileWithBlockContext) _localctx).content = block();
                }
                    break;
                case 2:
                    _localctx = new WhileWithSingleContext(_localctx);
                    enterOuterAlt(_localctx, 2); {
                    setState(363);
                    match(T__14);
                    setState(364);
                    match(T__2);
                    setState(365);
                    condition(0);
                    setState(366);
                    match(T__3);
                    setState(367);
                    ((WhileWithSingleContext) _localctx).content = statement();
                }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ConditionContext extends ParserRuleContext {
        public ConditionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_condition;
        }

        public ConditionContext() {
        }

        public void copyFrom(ConditionContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class ComparisonConditionContext extends ConditionContext {
        public ComparisonContext comparison() {
            return getRuleContext(ComparisonContext.class, 0);
        }

        public ComparisonConditionContext(ConditionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitComparisonCondition(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class ArrayAccessConditionContext extends ConditionContext {
        public ArrayAccessContext arrayAccess() {
            return getRuleContext(ArrayAccessContext.class, 0);
        }

        public ArrayAccessConditionContext(ConditionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitArrayAccessCondition(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class BracketConditionContext extends ConditionContext {
        public ConditionContext inner;

        public ConditionContext condition() {
            return getRuleContext(ConditionContext.class, 0);
        }

        public BracketConditionContext(ConditionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitBracketCondition(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class IdConditionContext extends ConditionContext {
        public TerminalNode ID() {
            return getToken(WlangParser.ID, 0);
        }

        public IdConditionContext(ConditionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitIdCondition(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class ConstantConditionContext extends ConditionContext {
        public TerminalNode BOOLEANLITERAL() {
            return getToken(WlangParser.BOOLEANLITERAL, 0);
        }

        public ConstantConditionContext(ConditionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitConstantCondition(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class NotConditionContext extends ConditionContext {
        public ConditionContext inner;

        public ConditionContext condition() {
            return getRuleContext(ConditionContext.class, 0);
        }

        public NotConditionContext(ConditionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitNotCondition(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class RelIdConditionContext extends ConditionContext {
        public TerminalNode REL_ID() {
            return getToken(WlangParser.REL_ID, 0);
        }

        public RelIdConditionContext(ConditionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitRelIdCondition(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class OrConditionContext extends ConditionContext {
        public ConditionContext left;
        public ConditionContext right;

        public List<ConditionContext> condition() {
            return getRuleContexts(ConditionContext.class);
        }

        public ConditionContext condition(int i) {
            return getRuleContext(ConditionContext.class, i);
        }

        public OrConditionContext(ConditionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitOrCondition(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class AndConditionContext extends ConditionContext {
        public ConditionContext left;
        public ConditionContext right;

        public List<ConditionContext> condition() {
            return getRuleContexts(ConditionContext.class);
        }

        public ConditionContext condition(int i) {
            return getRuleContext(ConditionContext.class, i);
        }

        public AndConditionContext(ConditionContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitAndCondition(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final ConditionContext condition() throws RecognitionException {
        return condition(0);
    }

    private ConditionContext condition(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
        ConditionContext _prevctx = _localctx;
        int _startState = 56;
        enterRecursionRule(_localctx, 56, RULE_condition, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(383);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 23, _ctx)) {
                    case 1: {
                        _localctx = new IdConditionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(372);
                        match(ID);
                    }
                        break;
                    case 2: {
                        _localctx = new ConstantConditionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(373);
                        match(BOOLEANLITERAL);
                    }
                        break;
                    case 3: {
                        _localctx = new NotConditionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(374);
                        match(T__15);
                        setState(375);
                        ((NotConditionContext) _localctx).inner = condition(7);
                    }
                        break;
                    case 4: {
                        _localctx = new RelIdConditionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(376);
                        match(REL_ID);
                    }
                        break;
                    case 5: {
                        _localctx = new ArrayAccessConditionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(377);
                        arrayAccess();
                    }
                        break;
                    case 6: {
                        _localctx = new ComparisonConditionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(378);
                        comparison();
                    }
                        break;
                    case 7: {
                        _localctx = new BracketConditionContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(379);
                        match(T__2);
                        setState(380);
                        ((BracketConditionContext) _localctx).inner = condition(0);
                        setState(381);
                        match(T__3);
                    }
                        break;
                }
                _ctx.stop = _input.LT(-1);
                setState(393);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 25, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null)
                            triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(391);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 24, _ctx)) {
                                case 1: {
                                    _localctx = new AndConditionContext(new ConditionContext(_parentctx, _parentState));
                                    ((AndConditionContext) _localctx).left = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_condition);
                                    setState(385);
                                    if (!(precpred(_ctx, 2)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                    setState(386);
                                    match(T__16);
                                    setState(387);
                                    ((AndConditionContext) _localctx).right = condition(3);
                                }
                                    break;
                                case 2: {
                                    _localctx = new OrConditionContext(new ConditionContext(_parentctx, _parentState));
                                    ((OrConditionContext) _localctx).left = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_condition);
                                    setState(388);
                                    if (!(precpred(_ctx, 1)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                    setState(389);
                                    match(T__17);
                                    setState(390);
                                    ((OrConditionContext) _localctx).right = condition(2);
                                }
                                    break;
                            }
                        }
                    }
                    setState(395);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 25, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class ComparisonContext extends ParserRuleContext {
        public ComparisonContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_comparison;
        }

        public ComparisonContext() {
        }

        public void copyFrom(ComparisonContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class MoreCompContext extends ComparisonContext {
        public TermContext left;
        public TermContext right;

        public List<TermContext> term() {
            return getRuleContexts(TermContext.class);
        }

        public TermContext term(int i) {
            return getRuleContext(TermContext.class, i);
        }

        public MoreCompContext(ComparisonContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitMoreComp(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class LessEqualCompContext extends ComparisonContext {
        public TermContext left;
        public TermContext right;

        public List<TermContext> term() {
            return getRuleContexts(TermContext.class);
        }

        public TermContext term(int i) {
            return getRuleContext(TermContext.class, i);
        }

        public LessEqualCompContext(ComparisonContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitLessEqualComp(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class EqualCompContext extends ComparisonContext {
        public TermContext left;
        public TermContext right;

        public List<TermContext> term() {
            return getRuleContexts(TermContext.class);
        }

        public TermContext term(int i) {
            return getRuleContext(TermContext.class, i);
        }

        public EqualCompContext(ComparisonContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitEqualComp(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class MoreEqualCompContext extends ComparisonContext {
        public TermContext left;
        public TermContext right;

        public List<TermContext> term() {
            return getRuleContexts(TermContext.class);
        }

        public TermContext term(int i) {
            return getRuleContext(TermContext.class, i);
        }

        public MoreEqualCompContext(ComparisonContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitMoreEqualComp(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class LessCompContext extends ComparisonContext {
        public TermContext left;
        public TermContext right;

        public List<TermContext> term() {
            return getRuleContexts(TermContext.class);
        }

        public TermContext term(int i) {
            return getRuleContext(TermContext.class, i);
        }

        public LessCompContext(ComparisonContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitLessComp(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class NotEqualCompContext extends ComparisonContext {
        public TermContext left;
        public TermContext right;

        public List<TermContext> term() {
            return getRuleContexts(TermContext.class);
        }

        public TermContext term(int i) {
            return getRuleContext(TermContext.class, i);
        }

        public NotEqualCompContext(ComparisonContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitNotEqualComp(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final ComparisonContext comparison() throws RecognitionException {
        ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_comparison);
        try {
            setState(420);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 26, _ctx)) {
                case 1:
                    _localctx = new LessCompContext(_localctx);
                    enterOuterAlt(_localctx, 1); {
                    setState(396);
                    ((LessCompContext) _localctx).left = term(0);
                    setState(397);
                    match(T__18);
                    setState(398);
                    ((LessCompContext) _localctx).right = term(0);
                }
                    break;
                case 2:
                    _localctx = new LessEqualCompContext(_localctx);
                    enterOuterAlt(_localctx, 2); {
                    setState(400);
                    ((LessEqualCompContext) _localctx).left = term(0);
                    setState(401);
                    match(T__19);
                    setState(402);
                    ((LessEqualCompContext) _localctx).right = term(0);
                }
                    break;
                case 3:
                    _localctx = new MoreCompContext(_localctx);
                    enterOuterAlt(_localctx, 3); {
                    setState(404);
                    ((MoreCompContext) _localctx).left = term(0);
                    setState(405);
                    match(T__20);
                    setState(406);
                    ((MoreCompContext) _localctx).right = term(0);
                }
                    break;
                case 4:
                    _localctx = new MoreEqualCompContext(_localctx);
                    enterOuterAlt(_localctx, 4); {
                    setState(408);
                    ((MoreEqualCompContext) _localctx).left = term(0);
                    setState(409);
                    match(T__21);
                    setState(410);
                    ((MoreEqualCompContext) _localctx).right = term(0);
                }
                    break;
                case 5:
                    _localctx = new EqualCompContext(_localctx);
                    enterOuterAlt(_localctx, 5); {
                    setState(412);
                    ((EqualCompContext) _localctx).left = term(0);
                    setState(413);
                    match(T__22);
                    setState(414);
                    ((EqualCompContext) _localctx).right = term(0);
                }
                    break;
                case 6:
                    _localctx = new NotEqualCompContext(_localctx);
                    enterOuterAlt(_localctx, 6); {
                    setState(416);
                    ((NotEqualCompContext) _localctx).left = term(0);
                    setState(417);
                    match(T__23);
                    setState(418);
                    ((NotEqualCompContext) _localctx).right = term(0);
                }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class TermContext extends ParserRuleContext {
        public TermContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_term;
        }

        public TermContext() {
        }

        public void copyFrom(TermContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class MultiplicationContext extends TermContext {
        public TermContext left;
        public TermContext right;

        public List<TermContext> term() {
            return getRuleContexts(TermContext.class);
        }

        public TermContext term(int i) {
            return getRuleContext(TermContext.class, i);
        }

        public MultiplicationContext(TermContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitMultiplication(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class AdditionContext extends TermContext {
        public TermContext left;
        public TermContext right;

        public List<TermContext> term() {
            return getRuleContexts(TermContext.class);
        }

        public TermContext term(int i) {
            return getRuleContext(TermContext.class, i);
        }

        public AdditionContext(TermContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitAddition(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class CharLiteralContext extends TermContext {
        public TerminalNode CHARLITERAL() {
            return getToken(WlangParser.CHARLITERAL, 0);
        }

        public CharLiteralContext(TermContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitCharLiteral(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class LongLiteralContext extends TermContext {
        public TerminalNode LONGLITERAL() {
            return getToken(WlangParser.LONGLITERAL, 0);
        }

        public LongLiteralContext(TermContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitLongLiteral(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class FloatLiteralContext extends TermContext {
        public TerminalNode FLOATLITERAL() {
            return getToken(WlangParser.FLOATLITERAL, 0);
        }

        public FloatLiteralContext(TermContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitFloatLiteral(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class BooleanLiteralContext extends TermContext {
        public TerminalNode BOOLEANLITERAL() {
            return getToken(WlangParser.BOOLEANLITERAL, 0);
        }

        public BooleanLiteralContext(TermContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitBooleanLiteral(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class ModuloContext extends TermContext {
        public TermContext left;
        public TermContext right;

        public List<TermContext> term() {
            return getRuleContexts(TermContext.class);
        }

        public TermContext term(int i) {
            return getRuleContext(TermContext.class, i);
        }

        public ModuloContext(TermContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitModulo(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class RelIdContext extends TermContext {
        public TerminalNode REL_ID() {
            return getToken(WlangParser.REL_ID, 0);
        }

        public RelIdContext(TermContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitRelId(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class SubtractionContext extends TermContext {
        public TermContext left;
        public TermContext right;

        public List<TermContext> term() {
            return getRuleContexts(TermContext.class);
        }

        public TermContext term(int i) {
            return getRuleContext(TermContext.class, i);
        }

        public SubtractionContext(TermContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitSubtraction(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class BracketsContext extends TermContext {
        public TermContext inner;

        public TermContext term() {
            return getRuleContext(TermContext.class, 0);
        }

        public BracketsContext(TermContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitBrackets(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class IntLiteralContext extends TermContext {
        public TerminalNode INTLITERAL() {
            return getToken(WlangParser.INTLITERAL, 0);
        }

        public IntLiteralContext(TermContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitIntLiteral(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class DivisionContext extends TermContext {
        public TermContext left;
        public TermContext right;

        public List<TermContext> term() {
            return getRuleContexts(TermContext.class);
        }

        public TermContext term(int i) {
            return getRuleContext(TermContext.class, i);
        }

        public DivisionContext(TermContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitDivision(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class DoubleLiteralContext extends TermContext {
        public TerminalNode DOUBLELITERAL() {
            return getToken(WlangParser.DOUBLELITERAL, 0);
        }

        public DoubleLiteralContext(TermContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitDoubleLiteral(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class IdContext extends TermContext {
        public TerminalNode ID() {
            return getToken(WlangParser.ID, 0);
        }

        public IdContext(TermContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitId(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class ArrayAccessInTermContext extends TermContext {
        public ArrayAccessContext arrayAccess() {
            return getRuleContext(ArrayAccessContext.class, 0);
        }

        public ArrayAccessInTermContext(TermContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitArrayAccessInTerm(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class RelArrayAccessInTermContext extends TermContext {
        public RelArrayAccessContext relArrayAccess() {
            return getRuleContext(RelArrayAccessContext.class, 0);
        }

        public RelArrayAccessInTermContext(TermContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitRelArrayAccessInTerm(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class NegativeTermContext extends TermContext {
        public TermContext inner;

        public TermContext term() {
            return getRuleContext(TermContext.class, 0);
        }

        public NegativeTermContext(TermContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitNegativeTerm(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final TermContext term() throws RecognitionException {
        return term(0);
    }

    private TermContext term(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        TermContext _localctx = new TermContext(_ctx, _parentState);
        TermContext _prevctx = _localctx;
        int _startState = 60;
        enterRecursionRule(_localctx, 60, RULE_term, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(439);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 27, _ctx)) {
                    case 1: {
                        _localctx = new NegativeTermContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(423);
                        match(T__24);
                        setState(424);
                        ((NegativeTermContext) _localctx).inner = term(17);
                    }
                        break;
                    case 2: {
                        _localctx = new BracketsContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(425);
                        match(T__2);
                        setState(426);
                        ((BracketsContext) _localctx).inner = term(0);
                        setState(427);
                        match(T__3);
                    }
                        break;
                    case 3: {
                        _localctx = new ArrayAccessInTermContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(429);
                        arrayAccess();
                    }
                        break;
                    case 4: {
                        _localctx = new RelArrayAccessInTermContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(430);
                        relArrayAccess();
                    }
                        break;
                    case 5: {
                        _localctx = new FloatLiteralContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(431);
                        match(FLOATLITERAL);
                    }
                        break;
                    case 6: {
                        _localctx = new IntLiteralContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(432);
                        match(INTLITERAL);
                    }
                        break;
                    case 7: {
                        _localctx = new LongLiteralContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(433);
                        match(LONGLITERAL);
                    }
                        break;
                    case 8: {
                        _localctx = new DoubleLiteralContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(434);
                        match(DOUBLELITERAL);
                    }
                        break;
                    case 9: {
                        _localctx = new BooleanLiteralContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(435);
                        match(BOOLEANLITERAL);
                    }
                        break;
                    case 10: {
                        _localctx = new CharLiteralContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(436);
                        match(CHARLITERAL);
                    }
                        break;
                    case 11: {
                        _localctx = new IdContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(437);
                        match(ID);
                    }
                        break;
                    case 12: {
                        _localctx = new RelIdContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(438);
                        match(REL_ID);
                    }
                        break;
                }
                _ctx.stop = _input.LT(-1);
                setState(458);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 29, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null)
                            triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(456);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 28, _ctx)) {
                                case 1: {
                                    _localctx = new DivisionContext(new TermContext(_parentctx, _parentState));
                                    ((DivisionContext) _localctx).left = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_term);
                                    setState(441);
                                    if (!(precpred(_ctx, 16)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                                    setState(442);
                                    match(T__25);
                                    setState(443);
                                    ((DivisionContext) _localctx).right = term(17);
                                }
                                    break;
                                case 2: {
                                    _localctx = new MultiplicationContext(new TermContext(_parentctx, _parentState));
                                    ((MultiplicationContext) _localctx).left = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_term);
                                    setState(444);
                                    if (!(precpred(_ctx, 15)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 15)");
                                    setState(445);
                                    match(T__26);
                                    setState(446);
                                    ((MultiplicationContext) _localctx).right = term(16);
                                }
                                    break;
                                case 3: {
                                    _localctx = new SubtractionContext(new TermContext(_parentctx, _parentState));
                                    ((SubtractionContext) _localctx).left = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_term);
                                    setState(447);
                                    if (!(precpred(_ctx, 14)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 14)");
                                    setState(448);
                                    match(T__24);
                                    setState(449);
                                    ((SubtractionContext) _localctx).right = term(15);
                                }
                                    break;
                                case 4: {
                                    _localctx = new AdditionContext(new TermContext(_parentctx, _parentState));
                                    ((AdditionContext) _localctx).left = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_term);
                                    setState(450);
                                    if (!(precpred(_ctx, 13)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 13)");
                                    setState(451);
                                    match(T__27);
                                    setState(452);
                                    ((AdditionContext) _localctx).right = term(14);
                                }
                                    break;
                                case 5: {
                                    _localctx = new ModuloContext(new TermContext(_parentctx, _parentState));
                                    ((ModuloContext) _localctx).left = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_term);
                                    setState(453);
                                    if (!(precpred(_ctx, 12)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                                    setState(454);
                                    match(T__28);
                                    setState(455);
                                    ((ModuloContext) _localctx).right = term(13);
                                }
                                    break;
                            }
                        }
                    }
                    setState(460);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 29, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class ArrayAccessContext extends ParserRuleContext {
        public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_arrayAccess;
        }

        public ArrayAccessContext() {
        }

        public void copyFrom(ArrayAccessContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class TwoDimArrayAccessContext extends ArrayAccessContext {
        public Token id;
        public TermContext firstIndex;
        public TermContext secondIndex;

        public TerminalNode ID() {
            return getToken(WlangParser.ID, 0);
        }

        public List<TermContext> term() {
            return getRuleContexts(TermContext.class);
        }

        public TermContext term(int i) {
            return getRuleContext(TermContext.class, i);
        }

        public TwoDimArrayAccessContext(ArrayAccessContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitTwoDimArrayAccess(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class ThreeDimArrayAccessContext extends ArrayAccessContext {
        public Token id;
        public TermContext firstIndex;
        public TermContext secondIndex;
        public TermContext thirdIndex;

        public TerminalNode ID() {
            return getToken(WlangParser.ID, 0);
        }

        public List<TermContext> term() {
            return getRuleContexts(TermContext.class);
        }

        public TermContext term(int i) {
            return getRuleContext(TermContext.class, i);
        }

        public ThreeDimArrayAccessContext(ArrayAccessContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitThreeDimArrayAccess(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class OneDimArrayAccessContext extends ArrayAccessContext {
        public Token id;
        public TermContext index;

        public TerminalNode ID() {
            return getToken(WlangParser.ID, 0);
        }

        public TermContext term() {
            return getRuleContext(TermContext.class, 0);
        }

        public OneDimArrayAccessContext(ArrayAccessContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitOneDimArrayAccess(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final ArrayAccessContext arrayAccess() throws RecognitionException {
        ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_arrayAccess);
        try {
            setState(485);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 30, _ctx)) {
                case 1:
                    _localctx = new OneDimArrayAccessContext(_localctx);
                    enterOuterAlt(_localctx, 1); {
                    setState(461);
                    ((OneDimArrayAccessContext) _localctx).id = match(ID);
                    setState(462);
                    match(T__8);
                    setState(463);
                    ((OneDimArrayAccessContext) _localctx).index = term(0);
                    setState(464);
                    match(T__9);
                }
                    break;
                case 2:
                    _localctx = new TwoDimArrayAccessContext(_localctx);
                    enterOuterAlt(_localctx, 2); {
                    setState(466);
                    ((TwoDimArrayAccessContext) _localctx).id = match(ID);
                    setState(467);
                    match(T__8);
                    setState(468);
                    ((TwoDimArrayAccessContext) _localctx).firstIndex = term(0);
                    setState(469);
                    match(T__9);
                    setState(470);
                    match(T__8);
                    setState(471);
                    ((TwoDimArrayAccessContext) _localctx).secondIndex = term(0);
                    setState(472);
                    match(T__9);
                }
                    break;
                case 3:
                    _localctx = new ThreeDimArrayAccessContext(_localctx);
                    enterOuterAlt(_localctx, 3); {
                    setState(474);
                    ((ThreeDimArrayAccessContext) _localctx).id = match(ID);
                    setState(475);
                    match(T__8);
                    setState(476);
                    ((ThreeDimArrayAccessContext) _localctx).firstIndex = term(0);
                    setState(477);
                    match(T__9);
                    setState(478);
                    match(T__8);
                    setState(479);
                    ((ThreeDimArrayAccessContext) _localctx).secondIndex = term(0);
                    setState(480);
                    match(T__9);
                    setState(481);
                    match(T__8);
                    setState(482);
                    ((ThreeDimArrayAccessContext) _localctx).thirdIndex = term(0);
                    setState(483);
                    match(T__9);
                }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class RelArrayAccessContext extends ParserRuleContext {
        public RelArrayAccessContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_relArrayAccess;
        }

        public RelArrayAccessContext() {
        }

        public void copyFrom(RelArrayAccessContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class OneDimArrayAccessRelContext extends RelArrayAccessContext {
        public Token id;
        public TermContext index;

        public TerminalNode REL_ID() {
            return getToken(WlangParser.REL_ID, 0);
        }

        public TermContext term() {
            return getRuleContext(TermContext.class, 0);
        }

        public OneDimArrayAccessRelContext(RelArrayAccessContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitOneDimArrayAccessRel(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class ThreeDimArrayAccessRelContext extends RelArrayAccessContext {
        public Token id;
        public TermContext firstIndex;
        public TermContext secondIndex;
        public TermContext thirdIndex;

        public TerminalNode REL_ID() {
            return getToken(WlangParser.REL_ID, 0);
        }

        public List<TermContext> term() {
            return getRuleContexts(TermContext.class);
        }

        public TermContext term(int i) {
            return getRuleContext(TermContext.class, i);
        }

        public ThreeDimArrayAccessRelContext(RelArrayAccessContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitThreeDimArrayAccessRel(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public static class TwoDimArrayAccessRelContext extends RelArrayAccessContext {
        public Token id;
        public TermContext firstIndex;
        public TermContext secondIndex;

        public TerminalNode REL_ID() {
            return getToken(WlangParser.REL_ID, 0);
        }

        public List<TermContext> term() {
            return getRuleContexts(TermContext.class);
        }

        public TermContext term(int i) {
            return getRuleContext(TermContext.class, i);
        }

        public TwoDimArrayAccessRelContext(RelArrayAccessContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WlangVisitor)
                return ((WlangVisitor<? extends T>) visitor).visitTwoDimArrayAccessRel(this);
            else
                return visitor.visitChildren(this);
        }
    }

    public final RelArrayAccessContext relArrayAccess() throws RecognitionException {
        RelArrayAccessContext _localctx = new RelArrayAccessContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_relArrayAccess);
        try {
            setState(511);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 31, _ctx)) {
                case 1:
                    _localctx = new OneDimArrayAccessRelContext(_localctx);
                    enterOuterAlt(_localctx, 1); {
                    setState(487);
                    ((OneDimArrayAccessRelContext) _localctx).id = match(REL_ID);
                    setState(488);
                    match(T__8);
                    setState(489);
                    ((OneDimArrayAccessRelContext) _localctx).index = term(0);
                    setState(490);
                    match(T__9);
                }
                    break;
                case 2:
                    _localctx = new TwoDimArrayAccessRelContext(_localctx);
                    enterOuterAlt(_localctx, 2); {
                    setState(492);
                    ((TwoDimArrayAccessRelContext) _localctx).id = match(REL_ID);
                    setState(493);
                    match(T__8);
                    setState(494);
                    ((TwoDimArrayAccessRelContext) _localctx).firstIndex = term(0);
                    setState(495);
                    match(T__9);
                    setState(496);
                    match(T__8);
                    setState(497);
                    ((TwoDimArrayAccessRelContext) _localctx).secondIndex = term(0);
                    setState(498);
                    match(T__9);
                }
                    break;
                case 3:
                    _localctx = new ThreeDimArrayAccessRelContext(_localctx);
                    enterOuterAlt(_localctx, 3); {
                    setState(500);
                    ((ThreeDimArrayAccessRelContext) _localctx).id = match(REL_ID);
                    setState(501);
                    match(T__8);
                    setState(502);
                    ((ThreeDimArrayAccessRelContext) _localctx).firstIndex = term(0);
                    setState(503);
                    match(T__9);
                    setState(504);
                    match(T__8);
                    setState(505);
                    ((ThreeDimArrayAccessRelContext) _localctx).secondIndex = term(0);
                    setState(506);
                    match(T__9);
                    setState(507);
                    match(T__8);
                    setState(508);
                    ((ThreeDimArrayAccessRelContext) _localctx).thirdIndex = term(0);
                    setState(509);
                    match(T__9);
                }
                    break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 28:
                return condition_sempred((ConditionContext) _localctx, predIndex);
            case 30:
                return term_sempred((TermContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 2);
            case 1:
                return precpred(_ctx, 1);
        }
        return true;
    }

    private boolean term_sempred(TermContext _localctx, int predIndex) {
        switch (predIndex) {
            case 2:
                return precpred(_ctx, 16);
            case 3:
                return precpred(_ctx, 15);
            case 4:
                return precpred(_ctx, 14);
            case 5:
                return precpred(_ctx, 13);
            case 6:
                return precpred(_ctx, 12);
        }
        return true;
    }

    public static final String _serializedATN = "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0204\4\2\t\2\4"
            + "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"
            + "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
            + "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"
            + "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"
            + "\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\2\5\2J\n\2\3\3\3\3\5\3N\n\3\3\4\7\4Q\n\4"
            + "\f\4\16\4T\13\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\\\n\5\3\5\3\5\3\5\3\5\3\5"
            + "\5\5c\n\5\3\5\5\5f\n\5\3\6\3\6\3\6\3\6\5\6l\n\6\3\6\3\6\3\6\3\6\3\6\5"
            + "\6s\n\6\3\6\5\6v\n\6\3\7\3\7\3\7\3\7\3\7\5\7}\n\7\3\b\3\b\3\b\3\t\3\t"
            + "\3\t\3\t\3\t\5\t\u0087\n\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r"
            + "\3\r\3\r\5\r\u0095\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"
            + "\16\3\16\3\16\5\16\u00a3\n\16\3\17\3\17\3\17\5\17\u00a8\n\17\3\17\3\17"
            + "\3\17\3\17\5\17\u00ae\n\17\3\17\5\17\u00b1\n\17\3\20\3\20\3\20\3\20\3"
            + "\21\3\21\3\21\5\21\u00ba\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"
            + "\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"
            + "\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00da\n\22\3\23\3\23\3\23"
            + "\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"
            + "\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"
            + "\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0107"
            + "\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"
            + "\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u011e\n\25\3\26\3\26\3\26"
            + "\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31"
            + "\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"
            + "\3\33\3\33\3\33\3\33\3\33\5\33\u0144\n\33\3\34\3\34\3\34\3\34\3\34\3\34"
            + "\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"
            + "\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0166"
            + "\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"
            + "\u0174\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"
            + "\5\36\u0182\n\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u018a\n\36\f\36\16"
            + "\36\u018d\13\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"
            + "\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37"
            + "\u01a7\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u01ba"
            + "\n \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u01cb\n \f \16 \u01ce"
            + "\13 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"
            + "!\3!\3!\5!\u01e8\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"
            + "\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0202\n\"\3\"\2\4:"
            + ">#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2"
            + "\2\2\u0228\2I\3\2\2\2\4M\3\2\2\2\6R\3\2\2\2\be\3\2\2\2\nu\3\2\2\2\f|\3"
            + "\2\2\2\16~\3\2\2\2\20\u0086\3\2\2\2\22\u0088\3\2\2\2\24\u008a\3\2\2\2"
            + "\26\u008d\3\2\2\2\30\u0094\3\2\2\2\32\u00a2\3\2\2\2\34\u00b0\3\2\2\2\36"
            + "\u00b2\3\2\2\2 \u00b9\3\2\2\2\"\u00d9\3\2\2\2$\u00db\3\2\2\2&\u0106\3"
            + "\2\2\2(\u011d\3\2\2\2*\u011f\3\2\2\2,\u0124\3\2\2\2.\u0129\3\2\2\2\60"
            + "\u012f\3\2\2\2\62\u0133\3\2\2\2\64\u0143\3\2\2\2\66\u0165\3\2\2\28\u0173"
            + "\3\2\2\2:\u0181\3\2\2\2<\u01a6\3\2\2\2>\u01b9\3\2\2\2@\u01e7\3\2\2\2B"
            + "\u0201\3\2\2\2DJ\5> \2EF\7\3\2\2FG\5\20\t\2GH\7\4\2\2HJ\3\2\2\2ID\3\2"
            + "\2\2IE\3\2\2\2J\3\3\2\2\2KN\5:\36\2LN\5> \2MK\3\2\2\2ML\3\2\2\2N\5\3\2"
            + "\2\2OQ\5\24\13\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3"
            + "\2\2\2UV\5\26\f\2V\7\3\2\2\2WX\7$\2\2XY\7-\2\2Y[\7\5\2\2Z\\\5\f\7\2[Z"
            + "\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]f\7\6\2\2^_\7\7\2\2_`\7-\2\2`b\7\5\2\2"
            + "ac\5\f\7\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2df\7\6\2\2eW\3\2\2\2e^\3\2\2\2"
            + "f\t\3\2\2\2gh\7$\2\2hi\7\b\2\2ik\7\5\2\2jl\5\f\7\2kj\3\2\2\2kl\3\2\2\2"
            + "lm\3\2\2\2mv\7\6\2\2no\7\7\2\2op\7\b\2\2pr\7\5\2\2qs\5\f\7\2rq\3\2\2\2"
            + "rs\3\2\2\2st\3\2\2\2tv\7\6\2\2ug\3\2\2\2un\3\2\2\2v\13\3\2\2\2wx\5\16"
            + "\b\2xy\7\t\2\2yz\5\f\7\2z}\3\2\2\2{}\5\16\b\2|w\3\2\2\2|{\3\2\2\2}\r\3"
            + "\2\2\2~\177\7$\2\2\177\u0080\7-\2\2\u0080\17\3\2\2\2\u0081\u0082\5\22"
            + "\n\2\u0082\u0083\7\t\2\2\u0083\u0084\5\20\t\2\u0084\u0087\3\2\2\2\u0085"
            + "\u0087\5\22\n\2\u0086\u0081\3\2\2\2\u0086\u0085\3\2\2\2\u0087\21\3\2\2"
            + "\2\u0088\u0089\5> \2\u0089\23\3\2\2\2\u008a\u008b\5\b\5\2\u008b\u008c"
            + "\5\36\20\2\u008c\25\3\2\2\2\u008d\u008e\5\n\6\2\u008e\u008f\5\36\20\2"
            + "\u008f\27\3\2\2\2\u0090\u0091\5\32\16\2\u0091\u0092\5\30\r\2\u0092\u0095"
            + "\3\2\2\2\u0093\u0095\5\32\16\2\u0094\u0090\3\2\2\2\u0094\u0093\3\2\2\2"
            + "\u0095\31\3\2\2\2\u0096\u00a3\5\64\33\2\u0097\u00a3\5\66\34\2\u0098\u00a3"
            + "\58\35\2\u0099\u00a3\5 \21\2\u009a\u00a3\5\"\22\2\u009b\u00a3\5$\23\2"
            + "\u009c\u00a3\5&\24\2\u009d\u00a3\5\60\31\2\u009e\u009f\5\34\17\2\u009f"
            + "\u00a0\7\n\2\2\u00a0\u00a3\3\2\2\2\u00a1\u00a3\5\62\32\2\u00a2\u0096\3"
            + "\2\2\2\u00a2\u0097\3\2\2\2\u00a2\u0098\3\2\2\2\u00a2\u0099\3\2\2\2\u00a2"
            + "\u009a\3\2\2\2\u00a2\u009b\3\2\2\2\u00a2\u009c\3\2\2\2\u00a2\u009d\3\2"
            + "\2\2\u00a2\u009e\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\33\3\2\2\2\u00a4\u00a5"
            + "\7-\2\2\u00a5\u00a7\7\5\2\2\u00a6\u00a8\5\20\t\2\u00a7\u00a6\3\2\2\2\u00a7"
            + "\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00b1\7\6\2\2\u00aa\u00ab\7\b"
            + "\2\2\u00ab\u00ad\7\5\2\2\u00ac\u00ae\5\20\t\2\u00ad\u00ac\3\2\2\2\u00ad"
            + "\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\7\6\2\2\u00b0\u00a4\3\2"
            + "\2\2\u00b0\u00aa\3\2\2\2\u00b1\35\3\2\2\2\u00b2\u00b3\7\3\2\2\u00b3\u00b4"
            + "\5\30\r\2\u00b4\u00b5\7\4\2\2\u00b5\37\3\2\2\2\u00b6\u00ba\5.\30\2\u00b7"
            + "\u00ba\5,\27\2\u00b8\u00ba\5*\26\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7\3\2"
            + "\2\2\u00b9\u00b8\3\2\2\2\u00ba!\3\2\2\2\u00bb\u00bc\7$\2\2\u00bc\u00bd"
            + "\7\13\2\2\u00bd\u00be\5> \2\u00be\u00bf\7\f\2\2\u00bf\u00c0\7-\2\2\u00c0"
            + "\u00c1\7\n\2\2\u00c1\u00da\3\2\2\2\u00c2\u00c3\7$\2\2\u00c3\u00c4\7\13"
            + "\2\2\u00c4\u00c5\5> \2\u00c5\u00c6\7\f\2\2\u00c6\u00c7\7\13\2\2\u00c7"
            + "\u00c8\5> \2\u00c8\u00c9\7\f\2\2\u00c9\u00ca\7-\2\2\u00ca\u00cb\7\n\2"
            + "\2\u00cb\u00da\3\2\2\2\u00cc\u00cd\7$\2\2\u00cd\u00ce\7\13\2\2\u00ce\u00cf"
            + "\5> \2\u00cf\u00d0\7\f\2\2\u00d0\u00d1\7\13\2\2\u00d1\u00d2\5> \2\u00d2"
            + "\u00d3\7\f\2\2\u00d3\u00d4\7\13\2\2\u00d4\u00d5\5> \2\u00d5\u00d6\7\f"
            + "\2\2\u00d6\u00d7\7-\2\2\u00d7\u00d8\7\n\2\2\u00d8\u00da\3\2\2\2\u00d9"
            + "\u00bb\3\2\2\2\u00d9\u00c2\3\2\2\2\u00d9\u00cc\3\2\2\2\u00da#\3\2\2\2"
            + "\u00db\u00dc\7$\2\2\u00dc\u00dd\7\13\2\2\u00dd\u00de\5> \2\u00de\u00df"
            + "\7\f\2\2\u00df\u00e0\7-\2\2\u00e0\u00e1\7,\2\2\u00e1\u00e2\7\3\2\2\u00e2"
            + "\u00e3\5\20\t\2\u00e3\u00e4\7\r\2\2\u00e4%\3\2\2\2\u00e5\u00e6\7-\2\2"
            + "\u00e6\u00e7\7\13\2\2\u00e7\u00e8\5> \2\u00e8\u00e9\7\f\2\2\u00e9\u00ea"
            + "\7,\2\2\u00ea\u00eb\5> \2\u00eb\u00ec\7\n\2\2\u00ec\u0107\3\2\2\2\u00ed"
            + "\u00ee\7-\2\2\u00ee\u00ef\7\13\2\2\u00ef\u00f0\5> \2\u00f0\u00f1\7\f\2"
            + "\2\u00f1\u00f2\7\13\2\2\u00f2\u00f3\5> \2\u00f3\u00f4\7\f\2\2\u00f4\u00f5"
            + "\7,\2\2\u00f5\u00f6\5> \2\u00f6\u00f7\7\n\2\2\u00f7\u0107\3\2\2\2\u00f8"
            + "\u00f9\7-\2\2\u00f9\u00fa\7\13\2\2\u00fa\u00fb\5> \2\u00fb\u00fc\7\f\2"
            + "\2\u00fc\u00fd\7\13\2\2\u00fd\u00fe\5> \2\u00fe\u00ff\7\f\2\2\u00ff\u0100"
            + "\7\13\2\2\u0100\u0101\5> \2\u0101\u0102\7\f\2\2\u0102\u0103\7,\2\2\u0103"
            + "\u0104\5> \2\u0104\u0105\7\n\2\2\u0105\u0107\3\2\2\2\u0106\u00e5\3\2\2"
            + "\2\u0106\u00ed\3\2\2\2\u0106\u00f8\3\2\2\2\u0107\'\3\2\2\2\u0108\u0109"
            + "\7\13\2\2\u0109\u010a\5> \2\u010a\u010b\7\f\2\2\u010b\u011e\3\2\2\2\u010c"
            + "\u010d\7\13\2\2\u010d\u010e\5> \2\u010e\u010f\7\f\2\2\u010f\u0110\7\13"
            + "\2\2\u0110\u0111\5> \2\u0111\u0112\7\f\2\2\u0112\u011e\3\2\2\2\u0113\u0114"
            + "\7\13\2\2\u0114\u0115\5> \2\u0115\u0116\7\f\2\2\u0116\u0117\7\13\2\2\u0117"
            + "\u0118\5> \2\u0118\u0119\7\f\2\2\u0119\u011a\7\13\2\2\u011a\u011b\5> "
            + "\2\u011b\u011c\7\f\2\2\u011c\u011e\3\2\2\2\u011d\u0108\3\2\2\2\u011d\u010c"
            + "\3\2\2\2\u011d\u0113\3\2\2\2\u011e)\3\2\2\2\u011f\u0120\7-\2\2\u0120\u0121"
            + "\7,\2\2\u0121\u0122\5\34\17\2\u0122\u0123\7\n\2\2\u0123+\3\2\2\2\u0124"
            + "\u0125\7-\2\2\u0125\u0126\7,\2\2\u0126\u0127\5> \2\u0127\u0128\7\n\2\2"
            + "\u0128-\3\2\2\2\u0129\u012a\7$\2\2\u012a\u012b\7-\2\2\u012b\u012c\7,\2"
            + "\2\u012c\u012d\5> \2\u012d\u012e\7\n\2\2\u012e/\3\2\2\2\u012f\u0130\7"
            + "$\2\2\u0130\u0131\7-\2\2\u0131\u0132\7\n\2\2\u0132\61\3\2\2\2\u0133\u0134"
            + "\7\16\2\2\u0134\u0135\5> \2\u0135\u0136\7\n\2\2\u0136\63\3\2\2\2\u0137"
            + "\u0138\7\17\2\2\u0138\u0139\7\5\2\2\u0139\u013a\5:\36\2\u013a\u013b\7"
            + "\6\2\2\u013b\u013c\5\36\20\2\u013c\u0144\3\2\2\2\u013d\u013e\7\17\2\2"
            + "\u013e\u013f\7\5\2\2\u013f\u0140\5:\36\2\u0140\u0141\7\6\2\2\u0141\u0142"
            + "\5\32\16\2\u0142\u0144\3\2\2\2\u0143\u0137\3\2\2\2\u0143\u013d\3\2\2\2"
            + "\u0144\65\3\2\2\2\u0145\u0146\7\17\2\2\u0146\u0147\7\5\2\2\u0147\u0148"
            + "\5:\36\2\u0148\u0149\7\6\2\2\u0149\u014a\5\36\20\2\u014a\u014b\7\20\2"
            + "\2\u014b\u014c\5\36\20\2\u014c\u0166\3\2\2\2\u014d\u014e\7\17\2\2\u014e"
            + "\u014f\7\5\2\2\u014f\u0150\5:\36\2\u0150\u0151\7\6\2\2\u0151\u0152\5\36"
            + "\20\2\u0152\u0153\7\20\2\2\u0153\u0154\5\32\16\2\u0154\u0166\3\2\2\2\u0155"
            + "\u0156\7\17\2\2\u0156\u0157\7\5\2\2\u0157\u0158\5:\36\2\u0158\u0159\7"
            + "\6\2\2\u0159\u015a\5\32\16\2\u015a\u015b\7\20\2\2\u015b\u015c\5\36\20"
            + "\2\u015c\u0166\3\2\2\2\u015d\u015e\7\17\2\2\u015e\u015f\7\5\2\2\u015f"
            + "\u0160\5:\36\2\u0160\u0161\7\6\2\2\u0161\u0162\5\32\16\2\u0162\u0163\7"
            + "\20\2\2\u0163\u0164\5\32\16\2\u0164\u0166\3\2\2\2\u0165\u0145\3\2\2\2"
            + "\u0165\u014d\3\2\2\2\u0165\u0155\3\2\2\2\u0165\u015d\3\2\2\2\u0166\67"
            + "\3\2\2\2\u0167\u0168\7\21\2\2\u0168\u0169\7\5\2\2\u0169\u016a\5:\36\2"
            + "\u016a\u016b\7\6\2\2\u016b\u016c\5\36\20\2\u016c\u0174\3\2\2\2\u016d\u016e"
            + "\7\21\2\2\u016e\u016f\7\5\2\2\u016f\u0170\5:\36\2\u0170\u0171\7\6\2\2"
            + "\u0171\u0172\5\32\16\2\u0172\u0174\3\2\2\2\u0173\u0167\3\2\2\2\u0173\u016d"
            + "\3\2\2\2\u01749\3\2\2\2\u0175\u0176\b\36\1\2\u0176\u0182\7-\2\2\u0177"
            + "\u0182\7%\2\2\u0178\u0179\7\22\2\2\u0179\u0182\5:\36\t\u017a\u0182\7."
            + "\2\2\u017b\u0182\5@!\2\u017c\u0182\5<\37\2\u017d\u017e\7\5\2\2\u017e\u017f"
            + "\5:\36\2\u017f\u0180\7\6\2\2\u0180\u0182\3\2\2\2\u0181\u0175\3\2\2\2\u0181"
            + "\u0177\3\2\2\2\u0181\u0178\3\2\2\2\u0181\u017a\3\2\2\2\u0181\u017b\3\2"
            + "\2\2\u0181\u017c\3\2\2\2\u0181\u017d\3\2\2\2\u0182\u018b\3\2\2\2\u0183"
            + "\u0184\f\4\2\2\u0184\u0185\7\23\2\2\u0185\u018a\5:\36\5\u0186\u0187\f"
            + "\3\2\2\u0187\u0188\7\24\2\2\u0188\u018a\5:\36\4\u0189\u0183\3\2\2\2\u0189"
            + "\u0186\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2"
            + "\2\2\u018c;\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f\5> \2\u018f\u0190"
            + "\7\25\2\2\u0190\u0191\5> \2\u0191\u01a7\3\2\2\2\u0192\u0193\5> \2\u0193"
            + "\u0194\7\26\2\2\u0194\u0195\5> \2\u0195\u01a7\3\2\2\2\u0196\u0197\5> "
            + "\2\u0197\u0198\7\27\2\2\u0198\u0199\5> \2\u0199\u01a7\3\2\2\2\u019a\u019b"
            + "\5> \2\u019b\u019c\7\30\2\2\u019c\u019d\5> \2\u019d\u01a7\3\2\2\2\u019e"
            + "\u019f\5> \2\u019f\u01a0\7\31\2\2\u01a0\u01a1\5> \2\u01a1\u01a7\3\2\2"
            + "\2\u01a2\u01a3\5> \2\u01a3\u01a4\7\32\2\2\u01a4\u01a5\5> \2\u01a5\u01a7"
            + "\3\2\2\2\u01a6\u018e\3\2\2\2\u01a6\u0192\3\2\2\2\u01a6\u0196\3\2\2\2\u01a6"
            + "\u019a\3\2\2\2\u01a6\u019e\3\2\2\2\u01a6\u01a2\3\2\2\2\u01a7=\3\2\2\2"
            + "\u01a8\u01a9\b \1\2\u01a9\u01aa\7\33\2\2\u01aa\u01ba\5> \23\u01ab\u01ac"
            + "\7\5\2\2\u01ac\u01ad\5> \2\u01ad\u01ae\7\6\2\2\u01ae\u01ba\3\2\2\2\u01af"
            + "\u01ba\5@!\2\u01b0\u01ba\5B\"\2\u01b1\u01ba\7\'\2\2\u01b2\u01ba\7&\2\2"
            + "\u01b3\u01ba\7*\2\2\u01b4\u01ba\7+\2\2\u01b5\u01ba\7%\2\2\u01b6\u01ba"
            + "\7(\2\2\u01b7\u01ba\7-\2\2\u01b8\u01ba\7.\2\2\u01b9\u01a8\3\2\2\2\u01b9"
            + "\u01ab\3\2\2\2\u01b9\u01af\3\2\2\2\u01b9\u01b0\3\2\2\2\u01b9\u01b1\3\2"
            + "\2\2\u01b9\u01b2\3\2\2\2\u01b9\u01b3\3\2\2\2\u01b9\u01b4\3\2\2\2\u01b9"
            + "\u01b5\3\2\2\2\u01b9\u01b6\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01b8\3\2"
            + "\2\2\u01ba\u01cc\3\2\2\2\u01bb\u01bc\f\22\2\2\u01bc\u01bd\7\34\2\2\u01bd"
            + "\u01cb\5> \23\u01be\u01bf\f\21\2\2\u01bf\u01c0\7\35\2\2\u01c0\u01cb\5"
            + "> \22\u01c1\u01c2\f\20\2\2\u01c2\u01c3\7\33\2\2\u01c3\u01cb\5> \21\u01c4"
            + "\u01c5\f\17\2\2\u01c5\u01c6\7\36\2\2\u01c6\u01cb\5> \20\u01c7\u01c8\f"
            + "\16\2\2\u01c8\u01c9\7\37\2\2\u01c9\u01cb\5> \17\u01ca\u01bb\3\2\2\2\u01ca"
            + "\u01be\3\2\2\2\u01ca\u01c1\3\2\2\2\u01ca\u01c4\3\2\2\2\u01ca\u01c7\3\2"
            + "\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd"
            + "?\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d0\7-\2\2\u01d0\u01d1\7\13\2\2"
            + "\u01d1\u01d2\5> \2\u01d2\u01d3\7\f\2\2\u01d3\u01e8\3\2\2\2\u01d4\u01d5"
            + "\7-\2\2\u01d5\u01d6\7\13\2\2\u01d6\u01d7\5> \2\u01d7\u01d8\7\f\2\2\u01d8"
            + "\u01d9\7\13\2\2\u01d9\u01da\5> \2\u01da\u01db\7\f\2\2\u01db\u01e8\3\2"
            + "\2\2\u01dc\u01dd\7-\2\2\u01dd\u01de\7\13\2\2\u01de\u01df\5> \2\u01df\u01e0"
            + "\7\f\2\2\u01e0\u01e1\7\13\2\2\u01e1\u01e2\5> \2\u01e2\u01e3\7\f\2\2\u01e3"
            + "\u01e4\7\13\2\2\u01e4\u01e5\5> \2\u01e5\u01e6\7\f\2\2\u01e6\u01e8\3\2"
            + "\2\2\u01e7\u01cf\3\2\2\2\u01e7\u01d4\3\2\2\2\u01e7\u01dc\3\2\2\2\u01e8"
            + "A\3\2\2\2\u01e9\u01ea\7.\2\2\u01ea\u01eb\7\13\2\2\u01eb\u01ec\5> \2\u01ec"
            + "\u01ed\7\f\2\2\u01ed\u0202\3\2\2\2\u01ee\u01ef\7.\2\2\u01ef\u01f0\7\13"
            + "\2\2\u01f0\u01f1\5> \2\u01f1\u01f2\7\f\2\2\u01f2\u01f3\7\13\2\2\u01f3"
            + "\u01f4\5> \2\u01f4\u01f5\7\f\2\2\u01f5\u0202\3\2\2\2\u01f6\u01f7\7.\2"
            + "\2\u01f7\u01f8\7\13\2\2\u01f8\u01f9\5> \2\u01f9\u01fa\7\f\2\2\u01fa\u01fb"
            + "\7\13\2\2\u01fb\u01fc\5> \2\u01fc\u01fd\7\f\2\2\u01fd\u01fe\7\13\2\2\u01fe"
            + "\u01ff\5> \2\u01ff\u0200\7\f\2\2\u0200\u0202\3\2\2\2\u0201\u01e9\3\2\2"
            + "\2\u0201\u01ee\3\2\2\2\u0201\u01f6\3\2\2\2\u0202C\3\2\2\2\"IMR[bekru|"
            + "\u0086\u0094\u00a2\u00a7\u00ad\u00b0\u00b9\u00d9\u0106\u011d\u0143\u0165"
            + "\u0173\u0181\u0189\u018b\u01a6\u01b9\u01ca\u01cc\u01e7\u0201";
    public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}