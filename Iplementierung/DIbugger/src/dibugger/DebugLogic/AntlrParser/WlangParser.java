// Generated from Wlang.g4 by ANTLR 4.7
package dibugger.DebugLogic.AntlrParser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WlangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, COMPOPERATOR=30, WS=31, 
		COMMENT=32, LINE_COMMENT=33, TYPE=34, ID=35, REL_ID=36, INTLITERAL=37, 
		FLOATLITERAL=38, CHARLITERAL=39, BOOLEANLITERAL=40, NULLLITERAL=41, LONGLITERAL=42, 
		DOUBLELITERAL=43, ASSIGN=44;
	public static final int
		RULE_r = 0, RULE_webppterm = 1, RULE_programm = 2, RULE_routineHead = 3, 
		RULE_mainHead = 4, RULE_arglist = 5, RULE_argument = 6, RULE_filledArglist = 7, 
		RULE_filledArgument = 8, RULE_routine = 9, RULE_mainRoutine = 10, RULE_statements = 11, 
		RULE_statement = 12, RULE_funcCall = 13, RULE_block = 14, RULE_assignment = 15, 
		RULE_arrayDeclaration = 16, RULE_arrayDeclareAssign = 17, RULE_arrayElementAssign = 18, 
		RULE_dims = 19, RULE_pureAssign = 20, RULE_declareAssign = 21, RULE_declaration = 22, 
		RULE_returnState = 23, RULE_ifState = 24, RULE_ifelseState = 25, RULE_whileState = 26, 
		RULE_condition = 27, RULE_comparison = 28, RULE_term = 29, RULE_arrayAccess = 30;
	public static final String[] ruleNames = {
		"r", "webppterm", "programm", "routineHead", "mainHead", "arglist", "argument", 
		"filledArglist", "filledArgument", "routine", "mainRoutine", "statements", 
		"statement", "funcCall", "block", "assignment", "arrayDeclaration", "arrayDeclareAssign", 
		"arrayElementAssign", "dims", "pureAssign", "declareAssign", "declaration", 
		"returnState", "ifState", "ifelseState", "whileState", "condition", "comparison", 
		"term", "arrayAccess"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'void'", "'main'", "','", "';'", "'{'", "'}'", "'['", 
		"']'", "'};'", "'return'", "'if'", "'else'", "'while'", "'&&'", "'||'", 
		"'!'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'-'", "'/'", "'*'", 
		"'+'", "'%'", null, null, null, null, null, null, null, null, null, null, 
		null, "'null'", null, null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "COMPOPERATOR", "WS", "COMMENT", "LINE_COMMENT", 
		"TYPE", "ID", "REL_ID", "INTLITERAL", "FLOATLITERAL", "CHARLITERAL", "BOOLEANLITERAL", 
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

	@Override
	public String getGrammarFileName() { return "Wlang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WlangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RContext extends ParserRuleContext {
		public ProgrammContext programm() {
			return getRuleContext(ProgrammContext.class,0);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			programm();
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

	public static class WebpptermContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public WebpptermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_webppterm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitWebppterm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WebpptermContext webppterm() throws RecognitionException {
		WebpptermContext _localctx = new WebpptermContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_webppterm);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				condition(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				term(0);
				}
				break;
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

	public static class ProgrammContext extends ParserRuleContext {
		public MainRoutineContext mainRoutine() {
			return getRuleContext(MainRoutineContext.class,0);
		}
		public List<RoutineContext> routine() {
			return getRuleContexts(RoutineContext.class);
		}
		public RoutineContext routine(int i) {
			return getRuleContext(RoutineContext.class,i);
		}
		public ProgrammContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitProgramm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrammContext programm() throws RecognitionException {
		ProgrammContext _localctx = new ProgrammContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_programm);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(68);
					routine();
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(74);
			mainRoutine();
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

	public static class RoutineHeadContext extends ParserRuleContext {
		public RoutineHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routineHead; }
	 
		public RoutineHeadContext() { }
		public void copyFrom(RoutineHeadContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProcedureHeadContext extends RoutineHeadContext {
		public Token id;
		public ArglistContext args;
		public TerminalNode ID() { return getToken(WlangParser.ID, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public ProcedureHeadContext(RoutineHeadContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitProcedureHead(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionHeadContext extends RoutineHeadContext {
		public Token returntype;
		public Token id;
		public ArglistContext args;
		public TerminalNode TYPE() { return getToken(WlangParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(WlangParser.ID, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public FunctionHeadContext(RoutineHeadContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitFunctionHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutineHeadContext routineHead() throws RecognitionException {
		RoutineHeadContext _localctx = new RoutineHeadContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_routineHead);
		int _la;
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				_localctx = new FunctionHeadContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				((FunctionHeadContext)_localctx).returntype = match(TYPE);
				setState(77);
				((FunctionHeadContext)_localctx).id = match(ID);
				setState(78);
				match(T__0);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(79);
					((FunctionHeadContext)_localctx).args = arglist();
					}
				}

				setState(82);
				match(T__1);
				}
				break;
			case T__2:
				_localctx = new ProcedureHeadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(T__2);
				setState(84);
				((ProcedureHeadContext)_localctx).id = match(ID);
				setState(85);
				match(T__0);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(86);
					((ProcedureHeadContext)_localctx).args = arglist();
					}
				}

				setState(89);
				match(T__1);
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

	public static class MainHeadContext extends ParserRuleContext {
		public MainHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainHead; }
	 
		public MainHeadContext() { }
		public void copyFrom(MainHeadContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MainProcedureHeadContext extends MainHeadContext {
		public ArglistContext args;
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public MainProcedureHeadContext(MainHeadContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitMainProcedureHead(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MainFunctionHeadContext extends MainHeadContext {
		public Token returntype;
		public ArglistContext args;
		public TerminalNode TYPE() { return getToken(WlangParser.TYPE, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public MainFunctionHeadContext(MainHeadContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitMainFunctionHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainHeadContext mainHead() throws RecognitionException {
		MainHeadContext _localctx = new MainHeadContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mainHead);
		int _la;
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				_localctx = new MainFunctionHeadContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				((MainFunctionHeadContext)_localctx).returntype = match(TYPE);
				setState(93);
				match(T__3);
				setState(94);
				match(T__0);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(95);
					((MainFunctionHeadContext)_localctx).args = arglist();
					}
				}

				setState(98);
				match(T__1);
				}
				break;
			case T__2:
				_localctx = new MainProcedureHeadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(T__2);
				setState(100);
				match(T__3);
				setState(101);
				match(T__0);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(102);
					((MainProcedureHeadContext)_localctx).args = arglist();
					}
				}

				setState(105);
				match(T__1);
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

	public static class ArglistContext extends ParserRuleContext {
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitArglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arglist);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				argument();
				setState(109);
				match(T__4);
				setState(110);
				arglist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				argument();
				}
				break;
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

	public static class ArgumentContext extends ParserRuleContext {
		public Token type;
		public Token id;
		public TerminalNode TYPE() { return getToken(WlangParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(WlangParser.ID, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			((ArgumentContext)_localctx).type = match(TYPE);
			setState(116);
			((ArgumentContext)_localctx).id = match(ID);
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

	public static class FilledArglistContext extends ParserRuleContext {
		public FilledArgumentContext filledArgument() {
			return getRuleContext(FilledArgumentContext.class,0);
		}
		public FilledArglistContext filledArglist() {
			return getRuleContext(FilledArglistContext.class,0);
		}
		public FilledArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filledArglist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitFilledArglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilledArglistContext filledArglist() throws RecognitionException {
		FilledArglistContext _localctx = new FilledArglistContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_filledArglist);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				filledArgument();
				setState(119);
				match(T__4);
				setState(120);
				filledArglist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				filledArgument();
				}
				break;
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

	public static class FilledArgumentContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public FilledArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filledArgument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitFilledArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilledArgumentContext filledArgument() throws RecognitionException {
		FilledArgumentContext _localctx = new FilledArgumentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_filledArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			term(0);
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

	public static class RoutineContext extends ParserRuleContext {
		public RoutineHeadContext routineHead() {
			return getRuleContext(RoutineHeadContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public RoutineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routine; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitRoutine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutineContext routine() throws RecognitionException {
		RoutineContext _localctx = new RoutineContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_routine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			routineHead();
			setState(128);
			block();
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

	public static class MainRoutineContext extends ParserRuleContext {
		public MainHeadContext mainHead() {
			return getRuleContext(MainHeadContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainRoutineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainRoutine; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitMainRoutine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainRoutineContext mainRoutine() throws RecognitionException {
		MainRoutineContext _localctx = new MainRoutineContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mainRoutine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			mainHead();
			setState(131);
			block();
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

	public static class StatementsContext extends ParserRuleContext {
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	 
		public StatementsContext() { }
		public void copyFrom(StatementsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleStatementContext extends StatementsContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SingleStatementContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompStatementContext extends StatementsContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public CompStatementContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitCompStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statements);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new CompStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				statement();
				setState(134);
				statements();
				}
				break;
			case 2:
				_localctx = new SingleStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				statement();
				}
				break;
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

	public static class StatementContext extends ParserRuleContext {
		public IfStateContext ifState() {
			return getRuleContext(IfStateContext.class,0);
		}
		public IfelseStateContext ifelseState() {
			return getRuleContext(IfelseStateContext.class,0);
		}
		public WhileStateContext whileState() {
			return getRuleContext(WhileStateContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public ArrayDeclareAssignContext arrayDeclareAssign() {
			return getRuleContext(ArrayDeclareAssignContext.class,0);
		}
		public ArrayElementAssignContext arrayElementAssign() {
			return getRuleContext(ArrayElementAssignContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public ReturnStateContext returnState() {
			return getRuleContext(ReturnStateContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				ifState();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				ifelseState();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				whileState();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				arrayDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(144);
				arrayDeclareAssign();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(145);
				arrayElementAssign();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(146);
				declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(147);
				funcCall();
				setState(148);
				match(T__5);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(150);
				returnState();
				}
				break;
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

	public static class FuncCallContext extends ParserRuleContext {
		public Token functionname;
		public FilledArglistContext args;
		public TerminalNode ID() { return getToken(WlangParser.ID, 0); }
		public FilledArglistContext filledArglist() {
			return getRuleContext(FilledArglistContext.class,0);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funcCall);
		int _la;
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				((FuncCallContext)_localctx).functionname = match(ID);
				setState(154);
				match(T__0);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__24) | (1L << ID) | (1L << REL_ID) | (1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << CHARLITERAL) | (1L << LONGLITERAL) | (1L << DOUBLELITERAL))) != 0)) {
					{
					setState(155);
					((FuncCallContext)_localctx).args = filledArglist();
					}
				}

				setState(158);
				match(T__1);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				((FuncCallContext)_localctx).functionname = match(T__3);
				setState(160);
				match(T__0);
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__24) | (1L << ID) | (1L << REL_ID) | (1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << CHARLITERAL) | (1L << LONGLITERAL) | (1L << DOUBLELITERAL))) != 0)) {
					{
					setState(161);
					((FuncCallContext)_localctx).args = filledArglist();
					}
				}

				setState(164);
				match(T__1);
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

	public static class BlockContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(T__6);
			setState(168);
			statements();
			setState(169);
			match(T__7);
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

	public static class AssignmentContext extends ParserRuleContext {
		public DeclareAssignContext declareAssign() {
			return getRuleContext(DeclareAssignContext.class,0);
		}
		public PureAssignContext pureAssign() {
			return getRuleContext(PureAssignContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				declareAssign();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				pureAssign();
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

	public static class ArrayDeclarationContext extends ParserRuleContext {
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
	 
		public ArrayDeclarationContext() { }
		public void copyFrom(ArrayDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayDeclarationTwoDimContext extends ArrayDeclarationContext {
		public Token type;
		public TermContext firstIndex;
		public TermContext secondIndex;
		public Token id;
		public TerminalNode TYPE() { return getToken(WlangParser.TYPE, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode ID() { return getToken(WlangParser.ID, 0); }
		public ArrayDeclarationTwoDimContext(ArrayDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitArrayDeclarationTwoDim(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayDeclarationOneDimContext extends ArrayDeclarationContext {
		public Token type;
		public TermContext index;
		public Token id;
		public TerminalNode TYPE() { return getToken(WlangParser.TYPE, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode ID() { return getToken(WlangParser.ID, 0); }
		public ArrayDeclarationOneDimContext(ArrayDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitArrayDeclarationOneDim(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayDeclarationThreeDimContext extends ArrayDeclarationContext {
		public Token type;
		public TermContext firstIndex;
		public TermContext secondIndex;
		public TermContext index;
		public Token id;
		public TerminalNode TYPE() { return getToken(WlangParser.TYPE, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode ID() { return getToken(WlangParser.ID, 0); }
		public ArrayDeclarationThreeDimContext(ArrayDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitArrayDeclarationThreeDim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arrayDeclaration);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new ArrayDeclarationOneDimContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				((ArrayDeclarationOneDimContext)_localctx).type = match(TYPE);
				setState(176);
				match(T__8);
				setState(177);
				((ArrayDeclarationOneDimContext)_localctx).index = term(0);
				setState(178);
				match(T__9);
				setState(179);
				((ArrayDeclarationOneDimContext)_localctx).id = match(ID);
				setState(180);
				match(T__5);
				}
				break;
			case 2:
				_localctx = new ArrayDeclarationTwoDimContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				((ArrayDeclarationTwoDimContext)_localctx).type = match(TYPE);
				setState(183);
				match(T__8);
				setState(184);
				((ArrayDeclarationTwoDimContext)_localctx).firstIndex = term(0);
				setState(185);
				match(T__9);
				setState(186);
				match(T__8);
				setState(187);
				((ArrayDeclarationTwoDimContext)_localctx).secondIndex = term(0);
				setState(188);
				match(T__9);
				setState(189);
				((ArrayDeclarationTwoDimContext)_localctx).id = match(ID);
				setState(190);
				match(T__5);
				}
				break;
			case 3:
				_localctx = new ArrayDeclarationThreeDimContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				((ArrayDeclarationThreeDimContext)_localctx).type = match(TYPE);
				setState(193);
				match(T__8);
				setState(194);
				((ArrayDeclarationThreeDimContext)_localctx).firstIndex = term(0);
				setState(195);
				match(T__9);
				setState(196);
				match(T__8);
				setState(197);
				((ArrayDeclarationThreeDimContext)_localctx).secondIndex = term(0);
				setState(198);
				match(T__9);
				setState(199);
				match(T__8);
				setState(200);
				((ArrayDeclarationThreeDimContext)_localctx).index = term(0);
				setState(201);
				match(T__9);
				setState(202);
				((ArrayDeclarationThreeDimContext)_localctx).id = match(ID);
				setState(203);
				match(T__5);
				}
				break;
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

	public static class ArrayDeclareAssignContext extends ParserRuleContext {
		public Token type;
		public Token id;
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(WlangParser.ASSIGN, 0); }
		public FilledArglistContext filledArglist() {
			return getRuleContext(FilledArglistContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(WlangParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(WlangParser.ID, 0); }
		public ArrayDeclareAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclareAssign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitArrayDeclareAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclareAssignContext arrayDeclareAssign() throws RecognitionException {
		ArrayDeclareAssignContext _localctx = new ArrayDeclareAssignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrayDeclareAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			((ArrayDeclareAssignContext)_localctx).type = match(TYPE);
			setState(208);
			dims();
			setState(209);
			((ArrayDeclareAssignContext)_localctx).id = match(ID);
			setState(210);
			match(ASSIGN);
			setState(211);
			match(T__6);
			setState(212);
			filledArglist();
			setState(213);
			match(T__10);
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

	public static class ArrayElementAssignContext extends ParserRuleContext {
		public ArrayElementAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElementAssign; }
	 
		public ArrayElementAssignContext() { }
		public void copyFrom(ArrayElementAssignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayElementAssignThreeDimContext extends ArrayElementAssignContext {
		public Token id;
		public TermContext firstIndex;
		public TermContext secondtIndex;
		public TermContext thirdIndex;
		public TermContext value;
		public TerminalNode ASSIGN() { return getToken(WlangParser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(WlangParser.ID, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ArrayElementAssignThreeDimContext(ArrayElementAssignContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitArrayElementAssignThreeDim(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayElementAssignTwoDimContext extends ArrayElementAssignContext {
		public Token id;
		public TermContext firstIndex;
		public TermContext secondIndex;
		public TermContext value;
		public TerminalNode ASSIGN() { return getToken(WlangParser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(WlangParser.ID, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ArrayElementAssignTwoDimContext(ArrayElementAssignContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitArrayElementAssignTwoDim(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayElementAssignOneDimContext extends ArrayElementAssignContext {
		public Token id;
		public TermContext index;
		public TermContext value;
		public TerminalNode ASSIGN() { return getToken(WlangParser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(WlangParser.ID, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ArrayElementAssignOneDimContext(ArrayElementAssignContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitArrayElementAssignOneDim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementAssignContext arrayElementAssign() throws RecognitionException {
		ArrayElementAssignContext _localctx = new ArrayElementAssignContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arrayElementAssign);
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new ArrayElementAssignOneDimContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				((ArrayElementAssignOneDimContext)_localctx).id = match(ID);
				setState(216);
				match(T__8);
				setState(217);
				((ArrayElementAssignOneDimContext)_localctx).index = term(0);
				setState(218);
				match(T__9);
				setState(219);
				match(ASSIGN);
				setState(220);
				((ArrayElementAssignOneDimContext)_localctx).value = term(0);
				setState(221);
				match(T__5);
				}
				break;
			case 2:
				_localctx = new ArrayElementAssignTwoDimContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				((ArrayElementAssignTwoDimContext)_localctx).id = match(ID);
				setState(224);
				match(T__8);
				setState(225);
				((ArrayElementAssignTwoDimContext)_localctx).firstIndex = term(0);
				setState(226);
				match(T__9);
				setState(227);
				match(T__8);
				setState(228);
				((ArrayElementAssignTwoDimContext)_localctx).secondIndex = term(0);
				setState(229);
				match(T__9);
				setState(230);
				match(ASSIGN);
				setState(231);
				((ArrayElementAssignTwoDimContext)_localctx).value = term(0);
				setState(232);
				match(T__5);
				}
				break;
			case 3:
				_localctx = new ArrayElementAssignThreeDimContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				((ArrayElementAssignThreeDimContext)_localctx).id = match(ID);
				setState(235);
				match(T__8);
				setState(236);
				((ArrayElementAssignThreeDimContext)_localctx).firstIndex = term(0);
				setState(237);
				match(T__9);
				setState(238);
				match(T__8);
				setState(239);
				((ArrayElementAssignThreeDimContext)_localctx).secondtIndex = term(0);
				setState(240);
				match(T__9);
				setState(241);
				match(T__8);
				setState(242);
				((ArrayElementAssignThreeDimContext)_localctx).thirdIndex = term(0);
				setState(243);
				match(T__9);
				setState(244);
				match(ASSIGN);
				setState(245);
				((ArrayElementAssignThreeDimContext)_localctx).value = term(0);
				setState(246);
				match(T__5);
				}
				break;
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

	public static class DimsContext extends ParserRuleContext {
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
	 
		public DimsContext() { }
		public void copyFrom(DimsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ThreeDimsContext extends DimsContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ThreeDimsContext(DimsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitThreeDims(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TwoDimsContext extends DimsContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TwoDimsContext(DimsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitTwoDims(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OneDimsContext extends DimsContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public OneDimsContext(DimsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitOneDims(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_dims);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new OneDimsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(T__8);
				setState(251);
				term(0);
				setState(252);
				match(T__9);
				}
				break;
			case 2:
				_localctx = new TwoDimsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(T__8);
				setState(255);
				term(0);
				setState(256);
				match(T__9);
				setState(257);
				match(T__8);
				setState(258);
				term(0);
				setState(259);
				match(T__9);
				}
				break;
			case 3:
				_localctx = new ThreeDimsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				match(T__8);
				setState(262);
				term(0);
				setState(263);
				match(T__9);
				setState(264);
				match(T__8);
				setState(265);
				term(0);
				setState(266);
				match(T__9);
				setState(267);
				match(T__8);
				setState(268);
				term(0);
				setState(269);
				match(T__9);
				}
				break;
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

	public static class PureAssignContext extends ParserRuleContext {
		public Token id;
		public TermContext value;
		public TerminalNode ASSIGN() { return getToken(WlangParser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(WlangParser.ID, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public PureAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pureAssign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitPureAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PureAssignContext pureAssign() throws RecognitionException {
		PureAssignContext _localctx = new PureAssignContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_pureAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			((PureAssignContext)_localctx).id = match(ID);
			setState(274);
			match(ASSIGN);
			setState(275);
			((PureAssignContext)_localctx).value = term(0);
			setState(276);
			match(T__5);
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

	public static class DeclareAssignContext extends ParserRuleContext {
		public Token type;
		public Token id;
		public TermContext value;
		public TerminalNode ASSIGN() { return getToken(WlangParser.ASSIGN, 0); }
		public TerminalNode TYPE() { return getToken(WlangParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(WlangParser.ID, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public DeclareAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareAssign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitDeclareAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareAssignContext declareAssign() throws RecognitionException {
		DeclareAssignContext _localctx = new DeclareAssignContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_declareAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			((DeclareAssignContext)_localctx).type = match(TYPE);
			setState(279);
			((DeclareAssignContext)_localctx).id = match(ID);
			setState(280);
			match(ASSIGN);
			setState(281);
			((DeclareAssignContext)_localctx).value = term(0);
			setState(282);
			match(T__5);
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

	public static class DeclarationContext extends ParserRuleContext {
		public Token type;
		public Token id;
		public TerminalNode TYPE() { return getToken(WlangParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(WlangParser.ID, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			((DeclarationContext)_localctx).type = match(TYPE);
			setState(285);
			((DeclarationContext)_localctx).id = match(ID);
			setState(286);
			match(T__5);
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

	public static class ReturnStateContext extends ParserRuleContext {
		public TermContext returnvalue;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ReturnStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnState; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitReturnState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStateContext returnState() throws RecognitionException {
		ReturnStateContext _localctx = new ReturnStateContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_returnState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(T__11);
			setState(289);
			((ReturnStateContext)_localctx).returnvalue = term(0);
			setState(290);
			match(T__5);
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

	public static class IfStateContext extends ParserRuleContext {
		public IfStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifState; }
	 
		public IfStateContext() { }
		public void copyFrom(IfStateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfWithBlockContext extends IfStateContext {
		public BlockContext content;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfWithBlockContext(IfStateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitIfWithBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfWithSingleContext extends IfStateContext {
		public StatementContext content;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfWithSingleContext(IfStateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitIfWithSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStateContext ifState() throws RecognitionException {
		IfStateContext _localctx = new IfStateContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ifState);
		try {
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new IfWithBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(T__12);
				setState(293);
				match(T__0);
				setState(294);
				condition(0);
				setState(295);
				match(T__1);
				setState(296);
				((IfWithBlockContext)_localctx).content = block();
				}
				break;
			case 2:
				_localctx = new IfWithSingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				match(T__12);
				setState(299);
				match(T__0);
				setState(300);
				condition(0);
				setState(301);
				match(T__1);
				setState(302);
				((IfWithSingleContext)_localctx).content = statement();
				}
				break;
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

	public static class IfelseStateContext extends ParserRuleContext {
		public IfelseStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelseState; }
	 
		public IfelseStateContext() { }
		public void copyFrom(IfelseStateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfElseWithBlockContext extends IfelseStateContext {
		public IfStateContext ifPart;
		public BlockContext content;
		public IfStateContext ifState() {
			return getRuleContext(IfStateContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfElseWithBlockContext(IfelseStateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitIfElseWithBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseWithSingleContext extends IfelseStateContext {
		public IfStateContext ifPart;
		public StatementContext content;
		public IfStateContext ifState() {
			return getRuleContext(IfStateContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfElseWithSingleContext(IfelseStateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitIfElseWithSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfelseStateContext ifelseState() throws RecognitionException {
		IfelseStateContext _localctx = new IfelseStateContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ifelseState);
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new IfElseWithBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				((IfElseWithBlockContext)_localctx).ifPart = ifState();
				setState(307);
				match(T__13);
				setState(308);
				((IfElseWithBlockContext)_localctx).content = block();
				}
				break;
			case 2:
				_localctx = new IfElseWithSingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				((IfElseWithSingleContext)_localctx).ifPart = ifState();
				setState(311);
				match(T__13);
				setState(312);
				((IfElseWithSingleContext)_localctx).content = statement();
				}
				break;
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

	public static class WhileStateContext extends ParserRuleContext {
		public WhileStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileState; }
	 
		public WhileStateContext() { }
		public void copyFrom(WhileStateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileWithBlockContext extends WhileStateContext {
		public BlockContext content;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileWithBlockContext(WhileStateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitWhileWithBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileWithSingleContext extends WhileStateContext {
		public StatementContext content;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileWithSingleContext(WhileStateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitWhileWithSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStateContext whileState() throws RecognitionException {
		WhileStateContext _localctx = new WhileStateContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_whileState);
		try {
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new WhileWithBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				match(T__14);
				setState(317);
				match(T__0);
				setState(318);
				condition(0);
				setState(319);
				match(T__1);
				setState(320);
				((WhileWithBlockContext)_localctx).content = block();
				}
				break;
			case 2:
				_localctx = new WhileWithSingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(T__14);
				setState(323);
				match(T__0);
				setState(324);
				condition(0);
				setState(325);
				match(T__1);
				setState(326);
				((WhileWithSingleContext)_localctx).content = statement();
				}
				break;
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComparisonConditionContext extends ConditionContext {
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ComparisonConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitComparisonCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAccessConditionContext extends ConditionContext {
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public ArrayAccessConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitArrayAccessCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketConditionContext extends ConditionContext {
		public ConditionContext inner;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BracketConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitBracketCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdConditionContext extends ConditionContext {
		public TerminalNode ID() { return getToken(WlangParser.ID, 0); }
		public IdConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitIdCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantConditionContext extends ConditionContext {
		public TerminalNode BOOLEANLITERAL() { return getToken(WlangParser.BOOLEANLITERAL, 0); }
		public ConstantConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitConstantCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotConditionContext extends ConditionContext {
		public ConditionContext inner;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public NotConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitNotCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelIdConditionContext extends ConditionContext {
		public TerminalNode REL_ID() { return getToken(WlangParser.REL_ID, 0); }
		public RelIdConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitRelIdCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrConditionContext extends ConditionContext {
		public ConditionContext left;
		public ConditionContext right;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public OrConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitOrCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndConditionContext extends ConditionContext {
		public ConditionContext left;
		public ConditionContext right;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public AndConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitAndCondition(this);
			else return visitor.visitChildren(this);
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
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				_localctx = new IdConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(331);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new RelIdConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(332);
				match(REL_ID);
				}
				break;
			case 3:
				{
				_localctx = new ArrayAccessConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(333);
				arrayAccess();
				}
				break;
			case 4:
				{
				_localctx = new ComparisonConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(334);
				comparison();
				}
				break;
			case 5:
				{
				_localctx = new ConstantConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(335);
				match(BOOLEANLITERAL);
				}
				break;
			case 6:
				{
				_localctx = new BracketConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(336);
				match(T__0);
				setState(337);
				((BracketConditionContext)_localctx).inner = condition(0);
				setState(338);
				match(T__1);
				}
				break;
			case 7:
				{
				_localctx = new NotConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(340);
				match(T__17);
				setState(341);
				((NotConditionContext)_localctx).inner = condition(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(352);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(350);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new AndConditionContext(new ConditionContext(_parentctx, _parentState));
						((AndConditionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(344);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(345);
						match(T__15);
						setState(346);
						((AndConditionContext)_localctx).right = condition(4);
						}
						break;
					case 2:
						{
						_localctx = new OrConditionContext(new ConditionContext(_parentctx, _parentState));
						((OrConditionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(347);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(348);
						match(T__16);
						setState(349);
						((OrConditionContext)_localctx).right = condition(3);
						}
						break;
					}
					} 
				}
				setState(354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ComparisonContext extends ParserRuleContext {
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	 
		public ComparisonContext() { }
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
			return getRuleContext(TermContext.class,i);
		}
		public MoreCompContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitMoreComp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessEqualCompContext extends ComparisonContext {
		public TermContext left;
		public TermContext right;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public LessEqualCompContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitLessEqualComp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualCompContext extends ComparisonContext {
		public TermContext left;
		public TermContext right;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public EqualCompContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitEqualComp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MoreEqualCompContext extends ComparisonContext {
		public TermContext left;
		public TermContext right;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public MoreEqualCompContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitMoreEqualComp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessCompContext extends ComparisonContext {
		public TermContext left;
		public TermContext right;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public LessCompContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitLessComp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotEqualCompContext extends ComparisonContext {
		public TermContext left;
		public TermContext right;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public NotEqualCompContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitNotEqualComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_comparison);
		try {
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new LessCompContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				((LessCompContext)_localctx).left = term(0);
				setState(356);
				match(T__18);
				setState(357);
				((LessCompContext)_localctx).right = term(0);
				}
				break;
			case 2:
				_localctx = new LessEqualCompContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				((LessEqualCompContext)_localctx).left = term(0);
				setState(360);
				match(T__19);
				setState(361);
				((LessEqualCompContext)_localctx).right = term(0);
				}
				break;
			case 3:
				_localctx = new MoreCompContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(363);
				((MoreCompContext)_localctx).left = term(0);
				setState(364);
				match(T__20);
				setState(365);
				((MoreCompContext)_localctx).right = term(0);
				}
				break;
			case 4:
				_localctx = new MoreEqualCompContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(367);
				((MoreEqualCompContext)_localctx).left = term(0);
				setState(368);
				match(T__21);
				setState(369);
				((MoreEqualCompContext)_localctx).right = term(0);
				}
				break;
			case 5:
				_localctx = new EqualCompContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(371);
				((EqualCompContext)_localctx).left = term(0);
				setState(372);
				match(T__22);
				setState(373);
				((EqualCompContext)_localctx).right = term(0);
				}
				break;
			case 6:
				_localctx = new NotEqualCompContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(375);
				((NotEqualCompContext)_localctx).left = term(0);
				setState(376);
				match(T__23);
				setState(377);
				((NotEqualCompContext)_localctx).right = term(0);
				}
				break;
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
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
			return getRuleContext(TermContext.class,i);
		}
		public MultiplicationContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionContext extends TermContext {
		public TermContext left;
		public TermContext right;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public AdditionContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallInTermContext extends TermContext {
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public FunctionCallInTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitFunctionCallInTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharLiteralContext extends TermContext {
		public TerminalNode CHARLITERAL() { return getToken(WlangParser.CHARLITERAL, 0); }
		public CharLiteralContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitCharLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LongLiteralContext extends TermContext {
		public TerminalNode LONGLITERAL() { return getToken(WlangParser.LONGLITERAL, 0); }
		public LongLiteralContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitLongLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatLiteralContext extends TermContext {
		public TerminalNode FLOATLITERAL() { return getToken(WlangParser.FLOATLITERAL, 0); }
		public FloatLiteralContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModuloContext extends TermContext {
		public TermContext left;
		public TermContext right;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ModuloContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitModulo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelIdContext extends TermContext {
		public TerminalNode REL_ID() { return getToken(WlangParser.REL_ID, 0); }
		public RelIdContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitRelId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtractionContext extends TermContext {
		public TermContext left;
		public TermContext right;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public SubtractionContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketsContext extends TermContext {
		public TermContext inner;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public BracketsContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitBrackets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntLiteralContext extends TermContext {
		public TerminalNode INTLITERAL() { return getToken(WlangParser.INTLITERAL, 0); }
		public IntLiteralContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionContext extends TermContext {
		public TermContext left;
		public TermContext right;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public DivisionContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends TermContext {
		public TerminalNode DOUBLELITERAL() { return getToken(WlangParser.DOUBLELITERAL, 0); }
		public DoubleLiteralContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends TermContext {
		public TerminalNode ID() { return getToken(WlangParser.ID, 0); }
		public IdContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAccessInTermContext extends TermContext {
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public ArrayAccessInTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitArrayAccessInTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegativeTermContext extends TermContext {
		public TermContext inner;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public NegativeTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitNegativeTerm(this);
			else return visitor.visitChildren(this);
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
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				_localctx = new NegativeTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(382);
				match(T__24);
				setState(383);
				((NegativeTermContext)_localctx).inner = term(16);
				}
				break;
			case 2:
				{
				_localctx = new BracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(384);
				match(T__0);
				setState(385);
				((BracketsContext)_localctx).inner = term(0);
				setState(386);
				match(T__1);
				}
				break;
			case 3:
				{
				_localctx = new FloatLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(388);
				match(FLOATLITERAL);
				}
				break;
			case 4:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(389);
				match(INTLITERAL);
				}
				break;
			case 5:
				{
				_localctx = new LongLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(390);
				match(LONGLITERAL);
				}
				break;
			case 6:
				{
				_localctx = new DoubleLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(391);
				match(DOUBLELITERAL);
				}
				break;
			case 7:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(392);
				match(ID);
				}
				break;
			case 8:
				{
				_localctx = new RelIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(393);
				match(REL_ID);
				}
				break;
			case 9:
				{
				_localctx = new CharLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(394);
				match(CHARLITERAL);
				}
				break;
			case 10:
				{
				_localctx = new FunctionCallInTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(395);
				funcCall();
				}
				break;
			case 11:
				{
				_localctx = new ArrayAccessInTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(396);
				arrayAccess();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(414);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new DivisionContext(new TermContext(_parentctx, _parentState));
						((DivisionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(399);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(400);
						match(T__25);
						setState(401);
						((DivisionContext)_localctx).right = term(16);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationContext(new TermContext(_parentctx, _parentState));
						((MultiplicationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(402);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(403);
						match(T__26);
						setState(404);
						((MultiplicationContext)_localctx).right = term(15);
						}
						break;
					case 3:
						{
						_localctx = new SubtractionContext(new TermContext(_parentctx, _parentState));
						((SubtractionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(405);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(406);
						match(T__24);
						setState(407);
						((SubtractionContext)_localctx).right = term(14);
						}
						break;
					case 4:
						{
						_localctx = new AdditionContext(new TermContext(_parentctx, _parentState));
						((AdditionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(408);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(409);
						match(T__27);
						setState(410);
						((AdditionContext)_localctx).right = term(13);
						}
						break;
					case 5:
						{
						_localctx = new ModuloContext(new TermContext(_parentctx, _parentState));
						((ModuloContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(411);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(412);
						match(T__28);
						setState(413);
						((ModuloContext)_localctx).right = term(12);
						}
						break;
					}
					} 
				}
				setState(418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArrayAccessContext extends ParserRuleContext {
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
	 
		public ArrayAccessContext() { }
		public void copyFrom(ArrayAccessContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TwoDimArrayAccessContext extends ArrayAccessContext {
		public Token id;
		public TermContext firstIndex;
		public TermContext secondIndex;
		public TerminalNode ID() { return getToken(WlangParser.ID, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TwoDimArrayAccessContext(ArrayAccessContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitTwoDimArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThreeDimArrayAccessContext extends ArrayAccessContext {
		public Token id;
		public TermContext firstIndex;
		public TermContext secondIndex;
		public TermContext thirdIndex;
		public TerminalNode ID() { return getToken(WlangParser.ID, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ThreeDimArrayAccessContext(ArrayAccessContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitThreeDimArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OneDimArrayAccessContext extends ArrayAccessContext {
		public Token id;
		public TermContext index;
		public TerminalNode ID() { return getToken(WlangParser.ID, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public OneDimArrayAccessContext(ArrayAccessContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitOneDimArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_arrayAccess);
		try {
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new OneDimArrayAccessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				((OneDimArrayAccessContext)_localctx).id = match(ID);
				setState(420);
				match(T__8);
				setState(421);
				((OneDimArrayAccessContext)_localctx).index = term(0);
				setState(422);
				match(T__9);
				}
				break;
			case 2:
				_localctx = new TwoDimArrayAccessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				((TwoDimArrayAccessContext)_localctx).id = match(ID);
				setState(425);
				match(T__8);
				setState(426);
				((TwoDimArrayAccessContext)_localctx).firstIndex = term(0);
				setState(427);
				match(T__9);
				setState(428);
				match(T__8);
				setState(429);
				((TwoDimArrayAccessContext)_localctx).secondIndex = term(0);
				setState(430);
				match(T__9);
				}
				break;
			case 3:
				_localctx = new ThreeDimArrayAccessContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
				((ThreeDimArrayAccessContext)_localctx).id = match(ID);
				setState(433);
				match(T__8);
				setState(434);
				((ThreeDimArrayAccessContext)_localctx).firstIndex = term(0);
				setState(435);
				match(T__9);
				setState(436);
				match(T__8);
				setState(437);
				((ThreeDimArrayAccessContext)_localctx).secondIndex = term(0);
				setState(438);
				match(T__9);
				setState(439);
				match(T__8);
				setState(440);
				((ThreeDimArrayAccessContext)_localctx).thirdIndex = term(0);
				setState(441);
				match(T__9);
				}
				break;
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 27:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		case 29:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u01c0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\5\3E\n\3\3\4\7\4H\n\4\f\4\16\4K\13\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\5\5S\n\5\3\5\3\5\3\5\3\5\3\5\5\5Z\n\5\3\5\5\5]\n\5\3\6\3\6\3\6\3"+
		"\6\5\6c\n\6\3\6\3\6\3\6\3\6\3\6\5\6j\n\6\3\6\5\6m\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\5\7t\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t~\n\t\3\n\3\n\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u008c\n\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u009a\n\16\3\17\3\17\3\17"+
		"\5\17\u009f\n\17\3\17\3\17\3\17\3\17\5\17\u00a5\n\17\3\17\5\17\u00a8\n"+
		"\17\3\20\3\20\3\20\3\20\3\21\3\21\5\21\u00b0\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d0"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u00fb\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0112\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\5\32\u0133\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u013d\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u014b\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u0159\n\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0161\n\35\f"+
		"\35\16\35\u0164\13\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u017e\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\5\37\u0190\n\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u01a1\n\37\f\37\16"+
		"\37\u01a4\13\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \5 \u01be\n \3 \2\48<!\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>\2\2\2\u01df\2@\3\2\2\2\4D\3\2\2\2\6"+
		"I\3\2\2\2\b\\\3\2\2\2\nl\3\2\2\2\fs\3\2\2\2\16u\3\2\2\2\20}\3\2\2\2\22"+
		"\177\3\2\2\2\24\u0081\3\2\2\2\26\u0084\3\2\2\2\30\u008b\3\2\2\2\32\u0099"+
		"\3\2\2\2\34\u00a7\3\2\2\2\36\u00a9\3\2\2\2 \u00af\3\2\2\2\"\u00cf\3\2"+
		"\2\2$\u00d1\3\2\2\2&\u00fa\3\2\2\2(\u0111\3\2\2\2*\u0113\3\2\2\2,\u0118"+
		"\3\2\2\2.\u011e\3\2\2\2\60\u0122\3\2\2\2\62\u0132\3\2\2\2\64\u013c\3\2"+
		"\2\2\66\u014a\3\2\2\28\u0158\3\2\2\2:\u017d\3\2\2\2<\u018f\3\2\2\2>\u01bd"+
		"\3\2\2\2@A\5\6\4\2A\3\3\2\2\2BE\58\35\2CE\5<\37\2DB\3\2\2\2DC\3\2\2\2"+
		"E\5\3\2\2\2FH\5\24\13\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2"+
		"\2\2KI\3\2\2\2LM\5\26\f\2M\7\3\2\2\2NO\7$\2\2OP\7%\2\2PR\7\3\2\2QS\5\f"+
		"\7\2RQ\3\2\2\2RS\3\2\2\2ST\3\2\2\2T]\7\4\2\2UV\7\5\2\2VW\7%\2\2WY\7\3"+
		"\2\2XZ\5\f\7\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[]\7\4\2\2\\N\3\2\2\2\\U\3"+
		"\2\2\2]\t\3\2\2\2^_\7$\2\2_`\7\6\2\2`b\7\3\2\2ac\5\f\7\2ba\3\2\2\2bc\3"+
		"\2\2\2cd\3\2\2\2dm\7\4\2\2ef\7\5\2\2fg\7\6\2\2gi\7\3\2\2hj\5\f\7\2ih\3"+
		"\2\2\2ij\3\2\2\2jk\3\2\2\2km\7\4\2\2l^\3\2\2\2le\3\2\2\2m\13\3\2\2\2n"+
		"o\5\16\b\2op\7\7\2\2pq\5\f\7\2qt\3\2\2\2rt\5\16\b\2sn\3\2\2\2sr\3\2\2"+
		"\2t\r\3\2\2\2uv\7$\2\2vw\7%\2\2w\17\3\2\2\2xy\5\22\n\2yz\7\7\2\2z{\5\20"+
		"\t\2{~\3\2\2\2|~\5\22\n\2}x\3\2\2\2}|\3\2\2\2~\21\3\2\2\2\177\u0080\5"+
		"<\37\2\u0080\23\3\2\2\2\u0081\u0082\5\b\5\2\u0082\u0083\5\36\20\2\u0083"+
		"\25\3\2\2\2\u0084\u0085\5\n\6\2\u0085\u0086\5\36\20\2\u0086\27\3\2\2\2"+
		"\u0087\u0088\5\32\16\2\u0088\u0089\5\30\r\2\u0089\u008c\3\2\2\2\u008a"+
		"\u008c\5\32\16\2\u008b\u0087\3\2\2\2\u008b\u008a\3\2\2\2\u008c\31\3\2"+
		"\2\2\u008d\u009a\5\62\32\2\u008e\u009a\5\64\33\2\u008f\u009a\5\66\34\2"+
		"\u0090\u009a\5 \21\2\u0091\u009a\5\"\22\2\u0092\u009a\5$\23\2\u0093\u009a"+
		"\5&\24\2\u0094\u009a\5.\30\2\u0095\u0096\5\34\17\2\u0096\u0097\7\b\2\2"+
		"\u0097\u009a\3\2\2\2\u0098\u009a\5\60\31\2\u0099\u008d\3\2\2\2\u0099\u008e"+
		"\3\2\2\2\u0099\u008f\3\2\2\2\u0099\u0090\3\2\2\2\u0099\u0091\3\2\2\2\u0099"+
		"\u0092\3\2\2\2\u0099\u0093\3\2\2\2\u0099\u0094\3\2\2\2\u0099\u0095\3\2"+
		"\2\2\u0099\u0098\3\2\2\2\u009a\33\3\2\2\2\u009b\u009c\7%\2\2\u009c\u009e"+
		"\7\3\2\2\u009d\u009f\5\20\t\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2"+
		"\u009f\u00a0\3\2\2\2\u00a0\u00a8\7\4\2\2\u00a1\u00a2\7\6\2\2\u00a2\u00a4"+
		"\7\3\2\2\u00a3\u00a5\5\20\t\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2"+
		"\u00a5\u00a6\3\2\2\2\u00a6\u00a8\7\4\2\2\u00a7\u009b\3\2\2\2\u00a7\u00a1"+
		"\3\2\2\2\u00a8\35\3\2\2\2\u00a9\u00aa\7\t\2\2\u00aa\u00ab\5\30\r\2\u00ab"+
		"\u00ac\7\n\2\2\u00ac\37\3\2\2\2\u00ad\u00b0\5,\27\2\u00ae\u00b0\5*\26"+
		"\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0!\3\2\2\2\u00b1\u00b2"+
		"\7$\2\2\u00b2\u00b3\7\13\2\2\u00b3\u00b4\5<\37\2\u00b4\u00b5\7\f\2\2\u00b5"+
		"\u00b6\7%\2\2\u00b6\u00b7\7\b\2\2\u00b7\u00d0\3\2\2\2\u00b8\u00b9\7$\2"+
		"\2\u00b9\u00ba\7\13\2\2\u00ba\u00bb\5<\37\2\u00bb\u00bc\7\f\2\2\u00bc"+
		"\u00bd\7\13\2\2\u00bd\u00be\5<\37\2\u00be\u00bf\7\f\2\2\u00bf\u00c0\7"+
		"%\2\2\u00c0\u00c1\7\b\2\2\u00c1\u00d0\3\2\2\2\u00c2\u00c3\7$\2\2\u00c3"+
		"\u00c4\7\13\2\2\u00c4\u00c5\5<\37\2\u00c5\u00c6\7\f\2\2\u00c6\u00c7\7"+
		"\13\2\2\u00c7\u00c8\5<\37\2\u00c8\u00c9\7\f\2\2\u00c9\u00ca\7\13\2\2\u00ca"+
		"\u00cb\5<\37\2\u00cb\u00cc\7\f\2\2\u00cc\u00cd\7%\2\2\u00cd\u00ce\7\b"+
		"\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00b1\3\2\2\2\u00cf\u00b8\3\2\2\2\u00cf"+
		"\u00c2\3\2\2\2\u00d0#\3\2\2\2\u00d1\u00d2\7$\2\2\u00d2\u00d3\5(\25\2\u00d3"+
		"\u00d4\7%\2\2\u00d4\u00d5\7.\2\2\u00d5\u00d6\7\t\2\2\u00d6\u00d7\5\20"+
		"\t\2\u00d7\u00d8\7\r\2\2\u00d8%\3\2\2\2\u00d9\u00da\7%\2\2\u00da\u00db"+
		"\7\13\2\2\u00db\u00dc\5<\37\2\u00dc\u00dd\7\f\2\2\u00dd\u00de\7.\2\2\u00de"+
		"\u00df\5<\37\2\u00df\u00e0\7\b\2\2\u00e0\u00fb\3\2\2\2\u00e1\u00e2\7%"+
		"\2\2\u00e2\u00e3\7\13\2\2\u00e3\u00e4\5<\37\2\u00e4\u00e5\7\f\2\2\u00e5"+
		"\u00e6\7\13\2\2\u00e6\u00e7\5<\37\2\u00e7\u00e8\7\f\2\2\u00e8\u00e9\7"+
		".\2\2\u00e9\u00ea\5<\37\2\u00ea\u00eb\7\b\2\2\u00eb\u00fb\3\2\2\2\u00ec"+
		"\u00ed\7%\2\2\u00ed\u00ee\7\13\2\2\u00ee\u00ef\5<\37\2\u00ef\u00f0\7\f"+
		"\2\2\u00f0\u00f1\7\13\2\2\u00f1\u00f2\5<\37\2\u00f2\u00f3\7\f\2\2\u00f3"+
		"\u00f4\7\13\2\2\u00f4\u00f5\5<\37\2\u00f5\u00f6\7\f\2\2\u00f6\u00f7\7"+
		".\2\2\u00f7\u00f8\5<\37\2\u00f8\u00f9\7\b\2\2\u00f9\u00fb\3\2\2\2\u00fa"+
		"\u00d9\3\2\2\2\u00fa\u00e1\3\2\2\2\u00fa\u00ec\3\2\2\2\u00fb\'\3\2\2\2"+
		"\u00fc\u00fd\7\13\2\2\u00fd\u00fe\5<\37\2\u00fe\u00ff\7\f\2\2\u00ff\u0112"+
		"\3\2\2\2\u0100\u0101\7\13\2\2\u0101\u0102\5<\37\2\u0102\u0103\7\f\2\2"+
		"\u0103\u0104\7\13\2\2\u0104\u0105\5<\37\2\u0105\u0106\7\f\2\2\u0106\u0112"+
		"\3\2\2\2\u0107\u0108\7\13\2\2\u0108\u0109\5<\37\2\u0109\u010a\7\f\2\2"+
		"\u010a\u010b\7\13\2\2\u010b\u010c\5<\37\2\u010c\u010d\7\f\2\2\u010d\u010e"+
		"\7\13\2\2\u010e\u010f\5<\37\2\u010f\u0110\7\f\2\2\u0110\u0112\3\2\2\2"+
		"\u0111\u00fc\3\2\2\2\u0111\u0100\3\2\2\2\u0111\u0107\3\2\2\2\u0112)\3"+
		"\2\2\2\u0113\u0114\7%\2\2\u0114\u0115\7.\2\2\u0115\u0116\5<\37\2\u0116"+
		"\u0117\7\b\2\2\u0117+\3\2\2\2\u0118\u0119\7$\2\2\u0119\u011a\7%\2\2\u011a"+
		"\u011b\7.\2\2\u011b\u011c\5<\37\2\u011c\u011d\7\b\2\2\u011d-\3\2\2\2\u011e"+
		"\u011f\7$\2\2\u011f\u0120\7%\2\2\u0120\u0121\7\b\2\2\u0121/\3\2\2\2\u0122"+
		"\u0123\7\16\2\2\u0123\u0124\5<\37\2\u0124\u0125\7\b\2\2\u0125\61\3\2\2"+
		"\2\u0126\u0127\7\17\2\2\u0127\u0128\7\3\2\2\u0128\u0129\58\35\2\u0129"+
		"\u012a\7\4\2\2\u012a\u012b\5\36\20\2\u012b\u0133\3\2\2\2\u012c\u012d\7"+
		"\17\2\2\u012d\u012e\7\3\2\2\u012e\u012f\58\35\2\u012f\u0130\7\4\2\2\u0130"+
		"\u0131\5\32\16\2\u0131\u0133\3\2\2\2\u0132\u0126\3\2\2\2\u0132\u012c\3"+
		"\2\2\2\u0133\63\3\2\2\2\u0134\u0135\5\62\32\2\u0135\u0136\7\20\2\2\u0136"+
		"\u0137\5\36\20\2\u0137\u013d\3\2\2\2\u0138\u0139\5\62\32\2\u0139\u013a"+
		"\7\20\2\2\u013a\u013b\5\32\16\2\u013b\u013d\3\2\2\2\u013c\u0134\3\2\2"+
		"\2\u013c\u0138\3\2\2\2\u013d\65\3\2\2\2\u013e\u013f\7\21\2\2\u013f\u0140"+
		"\7\3\2\2\u0140\u0141\58\35\2\u0141\u0142\7\4\2\2\u0142\u0143\5\36\20\2"+
		"\u0143\u014b\3\2\2\2\u0144\u0145\7\21\2\2\u0145\u0146\7\3\2\2\u0146\u0147"+
		"\58\35\2\u0147\u0148\7\4\2\2\u0148\u0149\5\32\16\2\u0149\u014b\3\2\2\2"+
		"\u014a\u013e\3\2\2\2\u014a\u0144\3\2\2\2\u014b\67\3\2\2\2\u014c\u014d"+
		"\b\35\1\2\u014d\u0159\7%\2\2\u014e\u0159\7&\2\2\u014f\u0159\5> \2\u0150"+
		"\u0159\5:\36\2\u0151\u0159\7*\2\2\u0152\u0153\7\3\2\2\u0153\u0154\58\35"+
		"\2\u0154\u0155\7\4\2\2\u0155\u0159\3\2\2\2\u0156\u0157\7\24\2\2\u0157"+
		"\u0159\58\35\3\u0158\u014c\3\2\2\2\u0158\u014e\3\2\2\2\u0158\u014f\3\2"+
		"\2\2\u0158\u0150\3\2\2\2\u0158\u0151\3\2\2\2\u0158\u0152\3\2\2\2\u0158"+
		"\u0156\3\2\2\2\u0159\u0162\3\2\2\2\u015a\u015b\f\5\2\2\u015b\u015c\7\22"+
		"\2\2\u015c\u0161\58\35\6\u015d\u015e\f\4\2\2\u015e\u015f\7\23\2\2\u015f"+
		"\u0161\58\35\5\u0160\u015a\3\2\2\2\u0160\u015d\3\2\2\2\u0161\u0164\3\2"+
		"\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u01639\3\2\2\2\u0164\u0162"+
		"\3\2\2\2\u0165\u0166\5<\37\2\u0166\u0167\7\25\2\2\u0167\u0168\5<\37\2"+
		"\u0168\u017e\3\2\2\2\u0169\u016a\5<\37\2\u016a\u016b\7\26\2\2\u016b\u016c"+
		"\5<\37\2\u016c\u017e\3\2\2\2\u016d\u016e\5<\37\2\u016e\u016f\7\27\2\2"+
		"\u016f\u0170\5<\37\2\u0170\u017e\3\2\2\2\u0171\u0172\5<\37\2\u0172\u0173"+
		"\7\30\2\2\u0173\u0174\5<\37\2\u0174\u017e\3\2\2\2\u0175\u0176\5<\37\2"+
		"\u0176\u0177\7\31\2\2\u0177\u0178\5<\37\2\u0178\u017e\3\2\2\2\u0179\u017a"+
		"\5<\37\2\u017a\u017b\7\32\2\2\u017b\u017c\5<\37\2\u017c\u017e\3\2\2\2"+
		"\u017d\u0165\3\2\2\2\u017d\u0169\3\2\2\2\u017d\u016d\3\2\2\2\u017d\u0171"+
		"\3\2\2\2\u017d\u0175\3\2\2\2\u017d\u0179\3\2\2\2\u017e;\3\2\2\2\u017f"+
		"\u0180\b\37\1\2\u0180\u0181\7\33\2\2\u0181\u0190\5<\37\22\u0182\u0183"+
		"\7\3\2\2\u0183\u0184\5<\37\2\u0184\u0185\7\4\2\2\u0185\u0190\3\2\2\2\u0186"+
		"\u0190\7(\2\2\u0187\u0190\7\'\2\2\u0188\u0190\7,\2\2\u0189\u0190\7-\2"+
		"\2\u018a\u0190\7%\2\2\u018b\u0190\7&\2\2\u018c\u0190\7)\2\2\u018d\u0190"+
		"\5\34\17\2\u018e\u0190\5> \2\u018f\u017f\3\2\2\2\u018f\u0182\3\2\2\2\u018f"+
		"\u0186\3\2\2\2\u018f\u0187\3\2\2\2\u018f\u0188\3\2\2\2\u018f\u0189\3\2"+
		"\2\2\u018f\u018a\3\2\2\2\u018f\u018b\3\2\2\2\u018f\u018c\3\2\2\2\u018f"+
		"\u018d\3\2\2\2\u018f\u018e\3\2\2\2\u0190\u01a2\3\2\2\2\u0191\u0192\f\21"+
		"\2\2\u0192\u0193\7\34\2\2\u0193\u01a1\5<\37\22\u0194\u0195\f\20\2\2\u0195"+
		"\u0196\7\35\2\2\u0196\u01a1\5<\37\21\u0197\u0198\f\17\2\2\u0198\u0199"+
		"\7\33\2\2\u0199\u01a1\5<\37\20\u019a\u019b\f\16\2\2\u019b\u019c\7\36\2"+
		"\2\u019c\u01a1\5<\37\17\u019d\u019e\f\r\2\2\u019e\u019f\7\37\2\2\u019f"+
		"\u01a1\5<\37\16\u01a0\u0191\3\2\2\2\u01a0\u0194\3\2\2\2\u01a0\u0197\3"+
		"\2\2\2\u01a0\u019a\3\2\2\2\u01a0\u019d\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2"+
		"\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3=\3\2\2\2\u01a4\u01a2\3\2\2\2"+
		"\u01a5\u01a6\7%\2\2\u01a6\u01a7\7\13\2\2\u01a7\u01a8\5<\37\2\u01a8\u01a9"+
		"\7\f\2\2\u01a9\u01be\3\2\2\2\u01aa\u01ab\7%\2\2\u01ab\u01ac\7\13\2\2\u01ac"+
		"\u01ad\5<\37\2\u01ad\u01ae\7\f\2\2\u01ae\u01af\7\13\2\2\u01af\u01b0\5"+
		"<\37\2\u01b0\u01b1\7\f\2\2\u01b1\u01be\3\2\2\2\u01b2\u01b3\7%\2\2\u01b3"+
		"\u01b4\7\13\2\2\u01b4\u01b5\5<\37\2\u01b5\u01b6\7\f\2\2\u01b6\u01b7\7"+
		"\13\2\2\u01b7\u01b8\5<\37\2\u01b8\u01b9\7\f\2\2\u01b9\u01ba\7\13\2\2\u01ba"+
		"\u01bb\5<\37\2\u01bb\u01bc\7\f\2\2\u01bc\u01be\3\2\2\2\u01bd\u01a5\3\2"+
		"\2\2\u01bd\u01aa\3\2\2\2\u01bd\u01b2\3\2\2\2\u01be?\3\2\2\2 DIRY\\bil"+
		"s}\u008b\u0099\u009e\u00a4\u00a7\u00af\u00cf\u00fa\u0111\u0132\u013c\u014a"+
		"\u0158\u0160\u0162\u017d\u018f\u01a0\u01a2\u01bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}