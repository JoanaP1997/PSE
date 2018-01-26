// Generated from Wlang.g4 by ANTLR 4.7
package dibugger.debuglogic.antlrparser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.runtime.MismatchedTokenException;
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
		COMMENT=32, LINE_COMMENT=33, TYPE=34, BOOLEANLITERAL=35, INTLITERAL=36, 
		FLOATLITERAL=37, CHARLITERAL=38, NULLLITERAL=39, LONGLITERAL=40, DOUBLELITERAL=41, 
		ASSIGN=42, ID=43, REL_ID=44;
	public static final int
		RULE_webppterm = 0, RULE_program = 1, RULE_routineHead = 2, RULE_mainHead = 3, 
		RULE_arglist = 4, RULE_argument = 5, RULE_filledArglist = 6, RULE_filledArgument = 7, 
		RULE_routine = 8, RULE_mainRoutine = 9, RULE_statements = 10, RULE_statement = 11, 
		RULE_funcCall = 12, RULE_block = 13, RULE_assignment = 14, RULE_arrayDeclaration = 15, 
		RULE_arrayDeclareAssign = 16, RULE_arrayElementAssign = 17, RULE_dims = 18, 
		RULE_callingAssign = 19, RULE_pureAssign = 20, RULE_declareAssign = 21, 
		RULE_declaration = 22, RULE_returnState = 23, RULE_ifState = 24, RULE_ifelseState = 25, 
		RULE_whileState = 26, RULE_condition = 27, RULE_comparison = 28, RULE_term = 29, 
		RULE_arrayAccess = 30;
	public static final String[] ruleNames = {
		"webppterm", "program", "routineHead", "mainHead", "arglist", "argument", 
		"filledArglist", "filledArgument", "routine", "mainRoutine", "statements", 
		"statement", "funcCall", "block", "assignment", "arrayDeclaration", "arrayDeclareAssign", 
		"arrayElementAssign", "dims", "callingAssign", "pureAssign", "declareAssign", 
		"declaration", "returnState", "ifState", "ifelseState", "whileState", 
		"condition", "comparison", "term", "arrayAccess"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'void'", "'main'", "','", "';'", "'{'", "'}'", "'['", 
		"']'", "'};'", "'return'", "'if'", "'else'", "'while'", "'!'", "'&&'", 
		"'||'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'-'", "'/'", "'*'", 
		"'+'", "'%'", null, null, null, null, null, null, null, null, null, "'null'", 
		null, null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "COMPOPERATOR", "WS", "COMMENT", "LINE_COMMENT", 
		"TYPE", "BOOLEANLITERAL", "INTLITERAL", "FLOATLITERAL", "CHARLITERAL", 
		"NULLLITERAL", "LONGLITERAL", "DOUBLELITERAL", "ASSIGN", "ID", "REL_ID"
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
		enterRule(_localctx, 0, RULE_webppterm);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				condition(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
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

	public static class ProgramContext extends ParserRuleContext {
		public MainRoutineContext mainRoutine() {
			return getRuleContext(MainRoutineContext.class,0);
		}
		public List<RoutineContext> routine() {
			return getRuleContexts(RoutineContext.class);
		}
		public RoutineContext routine(int i) {
			return getRuleContext(RoutineContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(66);
					routine();
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(72);
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
		enterRule(_localctx, 4, RULE_routineHead);
		int _la;
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				_localctx = new FunctionHeadContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				((FunctionHeadContext)_localctx).returntype = match(TYPE);
				setState(75);
				((FunctionHeadContext)_localctx).id = match(ID);
				setState(76);
				match(T__0);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(77);
					((FunctionHeadContext)_localctx).args = arglist();
					}
				}

				setState(80);
				match(T__1);
				}
				break;
			case T__2:
				_localctx = new ProcedureHeadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(T__2);
				setState(82);
				((ProcedureHeadContext)_localctx).id = match(ID);
				setState(83);
				match(T__0);
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(84);
					((ProcedureHeadContext)_localctx).args = arglist();
					}
				}

				setState(87);
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
		enterRule(_localctx, 6, RULE_mainHead);
		int _la;
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				_localctx = new MainFunctionHeadContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				((MainFunctionHeadContext)_localctx).returntype = match(TYPE);
				setState(91);
				match(T__3);
				setState(92);
				match(T__0);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(93);
					((MainFunctionHeadContext)_localctx).args = arglist();
					}
				}

				setState(96);
				match(T__1);
				}
				break;
			case T__2:
				_localctx = new MainProcedureHeadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(T__2);
				setState(98);
				match(T__3);
				setState(99);
				match(T__0);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(100);
					((MainProcedureHeadContext)_localctx).args = arglist();
					}
				}

				setState(103);
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
		enterRule(_localctx, 8, RULE_arglist);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				argument();
				setState(107);
				match(T__4);
				setState(108);
				arglist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
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
		enterRule(_localctx, 10, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			((ArgumentContext)_localctx).type = match(TYPE);
			setState(114);
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
		enterRule(_localctx, 12, RULE_filledArglist);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				filledArgument();
				setState(117);
				match(T__4);
				setState(118);
				filledArglist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
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
		enterRule(_localctx, 14, RULE_filledArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
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
		enterRule(_localctx, 16, RULE_routine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			routineHead();
			setState(126);
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
		enterRule(_localctx, 18, RULE_mainRoutine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			mainHead();
			setState(129);
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statements);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				statement();
				setState(132);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
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
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				ifState();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				ifelseState();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				whileState();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(141);
				arrayDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(142);
				arrayDeclareAssign();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(143);
				arrayElementAssign();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(144);
				declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(145);
				funcCall();
				setState(146);
				match(T__5);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(148);
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
		enterRule(_localctx, 24, RULE_funcCall);
		int _la;
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				((FuncCallContext)_localctx).functionname = match(ID);
				setState(152);
				match(T__0);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__24) | (1L << BOOLEANLITERAL) | (1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << CHARLITERAL) | (1L << LONGLITERAL) | (1L << DOUBLELITERAL) | (1L << ID) | (1L << REL_ID))) != 0)) {
					{
					setState(153);
					((FuncCallContext)_localctx).args = filledArglist();
					}
				}

				setState(156);
				match(T__1);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				((FuncCallContext)_localctx).functionname = match(T__3);
				setState(158);
				match(T__0);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__24) | (1L << BOOLEANLITERAL) | (1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << CHARLITERAL) | (1L << LONGLITERAL) | (1L << DOUBLELITERAL) | (1L << ID) | (1L << REL_ID))) != 0)) {
					{
					setState(159);
					((FuncCallContext)_localctx).args = filledArglist();
					}
				}

				setState(162);
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
		enterRule(_localctx, 26, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__6);
			setState(166);
			statements();
			setState(167);
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
		public CallingAssignContext callingAssign() {
			return getRuleContext(CallingAssignContext.class,0);
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
		enterRule(_localctx, 28, RULE_assignment);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				declareAssign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				pureAssign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				callingAssign();
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
		public TermContext thirdIndex;
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
		enterRule(_localctx, 30, RULE_arrayDeclaration);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new ArrayDeclarationOneDimContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				((ArrayDeclarationOneDimContext)_localctx).type = match(TYPE);
				setState(175);
				match(T__8);
				setState(176);
				((ArrayDeclarationOneDimContext)_localctx).index = term(0);
				setState(177);
				match(T__9);
				setState(178);
				((ArrayDeclarationOneDimContext)_localctx).id = match(ID);
				setState(179);
				match(T__5);
				}
				break;
			case 2:
				_localctx = new ArrayDeclarationTwoDimContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				((ArrayDeclarationTwoDimContext)_localctx).type = match(TYPE);
				setState(182);
				match(T__8);
				setState(183);
				((ArrayDeclarationTwoDimContext)_localctx).firstIndex = term(0);
				setState(184);
				match(T__9);
				setState(185);
				match(T__8);
				setState(186);
				((ArrayDeclarationTwoDimContext)_localctx).secondIndex = term(0);
				setState(187);
				match(T__9);
				setState(188);
				((ArrayDeclarationTwoDimContext)_localctx).id = match(ID);
				setState(189);
				match(T__5);
				}
				break;
			case 3:
				_localctx = new ArrayDeclarationThreeDimContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				((ArrayDeclarationThreeDimContext)_localctx).type = match(TYPE);
				setState(192);
				match(T__8);
				setState(193);
				((ArrayDeclarationThreeDimContext)_localctx).firstIndex = term(0);
				setState(194);
				match(T__9);
				setState(195);
				match(T__8);
				setState(196);
				((ArrayDeclarationThreeDimContext)_localctx).secondIndex = term(0);
				setState(197);
				match(T__9);
				setState(198);
				match(T__8);
				setState(199);
				((ArrayDeclarationThreeDimContext)_localctx).thirdIndex = term(0);
				setState(200);
				match(T__9);
				setState(201);
				((ArrayDeclarationThreeDimContext)_localctx).id = match(ID);
				setState(202);
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
		enterRule(_localctx, 32, RULE_arrayDeclareAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			((ArrayDeclareAssignContext)_localctx).type = match(TYPE);
			setState(207);
			dims();
			setState(208);
			((ArrayDeclareAssignContext)_localctx).id = match(ID);
			setState(209);
			match(ASSIGN);
			setState(210);
			match(T__6);
			setState(211);
			filledArglist();
			setState(212);
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
		public TermContext secondIndex;
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
		enterRule(_localctx, 34, RULE_arrayElementAssign);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new ArrayElementAssignOneDimContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				((ArrayElementAssignOneDimContext)_localctx).id = match(ID);
				setState(215);
				match(T__8);
				setState(216);
				((ArrayElementAssignOneDimContext)_localctx).index = term(0);
				setState(217);
				match(T__9);
				setState(218);
				match(ASSIGN);
				setState(219);
				((ArrayElementAssignOneDimContext)_localctx).value = term(0);
				setState(220);
				match(T__5);
				}
				break;
			case 2:
				_localctx = new ArrayElementAssignTwoDimContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				((ArrayElementAssignTwoDimContext)_localctx).id = match(ID);
				setState(223);
				match(T__8);
				setState(224);
				((ArrayElementAssignTwoDimContext)_localctx).firstIndex = term(0);
				setState(225);
				match(T__9);
				setState(226);
				match(T__8);
				setState(227);
				((ArrayElementAssignTwoDimContext)_localctx).secondIndex = term(0);
				setState(228);
				match(T__9);
				setState(229);
				match(ASSIGN);
				setState(230);
				((ArrayElementAssignTwoDimContext)_localctx).value = term(0);
				setState(231);
				match(T__5);
				}
				break;
			case 3:
				_localctx = new ArrayElementAssignThreeDimContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				((ArrayElementAssignThreeDimContext)_localctx).id = match(ID);
				setState(234);
				match(T__8);
				setState(235);
				((ArrayElementAssignThreeDimContext)_localctx).firstIndex = term(0);
				setState(236);
				match(T__9);
				setState(237);
				match(T__8);
				setState(238);
				((ArrayElementAssignThreeDimContext)_localctx).secondIndex = term(0);
				setState(239);
				match(T__9);
				setState(240);
				match(T__8);
				setState(241);
				((ArrayElementAssignThreeDimContext)_localctx).thirdIndex = term(0);
				setState(242);
				match(T__9);
				setState(243);
				match(ASSIGN);
				setState(244);
				((ArrayElementAssignThreeDimContext)_localctx).value = term(0);
				setState(245);
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
		enterRule(_localctx, 36, RULE_dims);
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new OneDimsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(T__8);
				setState(250);
				term(0);
				setState(251);
				match(T__9);
				}
				break;
			case 2:
				_localctx = new TwoDimsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(T__8);
				setState(254);
				term(0);
				setState(255);
				match(T__9);
				setState(256);
				match(T__8);
				setState(257);
				term(0);
				setState(258);
				match(T__9);
				}
				break;
			case 3:
				_localctx = new ThreeDimsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				match(T__8);
				setState(261);
				term(0);
				setState(262);
				match(T__9);
				setState(263);
				match(T__8);
				setState(264);
				term(0);
				setState(265);
				match(T__9);
				setState(266);
				match(T__8);
				setState(267);
				term(0);
				setState(268);
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

	public static class CallingAssignContext extends ParserRuleContext {
		public Token id;
		public FuncCallContext value;
		public TerminalNode ASSIGN() { return getToken(WlangParser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(WlangParser.ID, 0); }
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public CallingAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callingAssign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitCallingAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallingAssignContext callingAssign() throws RecognitionException {
		CallingAssignContext _localctx = new CallingAssignContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_callingAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			((CallingAssignContext)_localctx).id = match(ID);
			setState(273);
			match(ASSIGN);
			setState(274);
			((CallingAssignContext)_localctx).value = funcCall();
			setState(275);
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
			setState(277);
			((PureAssignContext)_localctx).id = match(ID);
			setState(278);
			match(ASSIGN);
			setState(279);
			((PureAssignContext)_localctx).value = term(0);
			setState(280);
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
			setState(282);
			((DeclareAssignContext)_localctx).type = match(TYPE);
			setState(283);
			((DeclareAssignContext)_localctx).id = match(ID);
			setState(284);
			match(ASSIGN);
			setState(285);
			((DeclareAssignContext)_localctx).value = term(0);
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
			setState(288);
			((DeclarationContext)_localctx).type = match(TYPE);
			setState(289);
			((DeclarationContext)_localctx).id = match(ID);
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
			setState(292);
			match(T__11);
			setState(293);
			((ReturnStateContext)_localctx).returnvalue = term(0);
			setState(294);
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
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new IfWithBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(T__12);
				setState(297);
				match(T__0);
				setState(298);
				condition(0);
				setState(299);
				match(T__1);
				setState(300);
				((IfWithBlockContext)_localctx).content = block();
				}
				break;
			case 2:
				_localctx = new IfWithSingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				match(T__12);
				setState(303);
				match(T__0);
				setState(304);
				condition(0);
				setState(305);
				match(T__1);
				setState(306);
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
	public static class IfWithSingleElseWithSingleContext extends IfelseStateContext {
		public StatementContext ifcontent;
		public StatementContext elsecontent;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfWithSingleElseWithSingleContext(IfelseStateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitIfWithSingleElseWithSingle(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfWithSingleElseWithBlockContext extends IfelseStateContext {
		public StatementContext ifcontent;
		public BlockContext elsecontent;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfWithSingleElseWithBlockContext(IfelseStateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitIfWithSingleElseWithBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfWithBlockElseWithSingleContext extends IfelseStateContext {
		public BlockContext ifcontent;
		public StatementContext elsecontent;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfWithBlockElseWithSingleContext(IfelseStateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitIfWithBlockElseWithSingle(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfWithBlockElseWithBlockContext extends IfelseStateContext {
		public BlockContext ifcontent;
		public BlockContext elsecontent;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfWithBlockElseWithBlockContext(IfelseStateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitIfWithBlockElseWithBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfelseStateContext ifelseState() throws RecognitionException {
		IfelseStateContext _localctx = new IfelseStateContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ifelseState);
		try {
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new IfWithBlockElseWithBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				match(T__12);
				setState(311);
				match(T__0);
				setState(312);
				condition(0);
				setState(313);
				match(T__1);
				setState(314);
				((IfWithBlockElseWithBlockContext)_localctx).ifcontent = block();
				setState(315);
				match(T__13);
				setState(316);
				((IfWithBlockElseWithBlockContext)_localctx).elsecontent = block();
				}
				break;
			case 2:
				_localctx = new IfWithBlockElseWithSingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				match(T__12);
				setState(319);
				match(T__0);
				setState(320);
				condition(0);
				setState(321);
				match(T__1);
				setState(322);
				((IfWithBlockElseWithSingleContext)_localctx).ifcontent = block();
				setState(323);
				match(T__13);
				setState(324);
				((IfWithBlockElseWithSingleContext)_localctx).elsecontent = statement();
				}
				break;
			case 3:
				_localctx = new IfWithSingleElseWithBlockContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
				match(T__12);
				setState(327);
				match(T__0);
				setState(328);
				condition(0);
				setState(329);
				match(T__1);
				setState(330);
				((IfWithSingleElseWithBlockContext)_localctx).ifcontent = statement();
				setState(331);
				match(T__13);
				setState(332);
				((IfWithSingleElseWithBlockContext)_localctx).elsecontent = block();
				}
				break;
			case 4:
				_localctx = new IfWithSingleElseWithSingleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(334);
				match(T__12);
				setState(335);
				match(T__0);
				setState(336);
				condition(0);
				setState(337);
				match(T__1);
				setState(338);
				((IfWithSingleElseWithSingleContext)_localctx).ifcontent = statement();
				setState(339);
				match(T__13);
				setState(340);
				((IfWithSingleElseWithSingleContext)_localctx).elsecontent = statement();
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
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new WhileWithBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				match(T__14);
				setState(345);
				match(T__0);
				setState(346);
				condition(0);
				setState(347);
				match(T__1);
				setState(348);
				((WhileWithBlockContext)_localctx).content = block();
				}
				break;
			case 2:
				_localctx = new WhileWithSingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				match(T__14);
				setState(351);
				match(T__0);
				setState(352);
				condition(0);
				setState(353);
				match(T__1);
				setState(354);
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
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				_localctx = new IdConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(359);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new ConstantConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(360);
				match(BOOLEANLITERAL);
				}
				break;
			case 3:
				{
				_localctx = new NotConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(361);
				match(T__15);
				setState(362);
				((NotConditionContext)_localctx).inner = condition(7);
				}
				break;
			case 4:
				{
				_localctx = new RelIdConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(363);
				match(REL_ID);
				}
				break;
			case 5:
				{
				_localctx = new ArrayAccessConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(364);
				arrayAccess();
				}
				break;
			case 6:
				{
				_localctx = new ComparisonConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(365);
				comparison();
				}
				break;
			case 7:
				{
				_localctx = new BracketConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(366);
				match(T__0);
				setState(367);
				((BracketConditionContext)_localctx).inner = condition(0);
				setState(368);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(380);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(378);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new AndConditionContext(new ConditionContext(_parentctx, _parentState));
						((AndConditionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(372);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(373);
						match(T__16);
						setState(374);
						((AndConditionContext)_localctx).right = condition(3);
						}
						break;
					case 2:
						{
						_localctx = new OrConditionContext(new ConditionContext(_parentctx, _parentState));
						((OrConditionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(375);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(376);
						match(T__17);
						setState(377);
						((OrConditionContext)_localctx).right = condition(2);
						}
						break;
					}
					} 
				}
				setState(382);
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
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new LessCompContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(383);
				((LessCompContext)_localctx).left = term(0);
				setState(384);
				match(T__18);
				setState(385);
				((LessCompContext)_localctx).right = term(0);
				}
				break;
			case 2:
				_localctx = new LessEqualCompContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				((LessEqualCompContext)_localctx).left = term(0);
				setState(388);
				match(T__19);
				setState(389);
				((LessEqualCompContext)_localctx).right = term(0);
				}
				break;
			case 3:
				_localctx = new MoreCompContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(391);
				((MoreCompContext)_localctx).left = term(0);
				setState(392);
				match(T__20);
				setState(393);
				((MoreCompContext)_localctx).right = term(0);
				}
				break;
			case 4:
				_localctx = new MoreEqualCompContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(395);
				((MoreEqualCompContext)_localctx).left = term(0);
				setState(396);
				match(T__21);
				setState(397);
				((MoreEqualCompContext)_localctx).right = term(0);
				}
				break;
			case 5:
				_localctx = new EqualCompContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(399);
				((EqualCompContext)_localctx).left = term(0);
				setState(400);
				match(T__22);
				setState(401);
				((EqualCompContext)_localctx).right = term(0);
				}
				break;
			case 6:
				_localctx = new NotEqualCompContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(403);
				((NotEqualCompContext)_localctx).left = term(0);
				setState(404);
				match(T__23);
				setState(405);
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
	public static class BooleanLiteralContext extends TermContext {
		public TerminalNode BOOLEANLITERAL() { return getToken(WlangParser.BOOLEANLITERAL, 0); }
		public BooleanLiteralContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitBooleanLiteral(this);
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
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				_localctx = new NegativeTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(410);
				match(T__24);
				setState(411);
				((NegativeTermContext)_localctx).inner = term(16);
				}
				break;
			case 2:
				{
				_localctx = new BracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(412);
				match(T__0);
				setState(413);
				((BracketsContext)_localctx).inner = term(0);
				setState(414);
				match(T__1);
				}
				break;
			case 3:
				{
				_localctx = new FloatLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(416);
				match(FLOATLITERAL);
				}
				break;
			case 4:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(417);
				match(INTLITERAL);
				}
				break;
			case 5:
				{
				_localctx = new LongLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(418);
				match(LONGLITERAL);
				}
				break;
			case 6:
				{
				_localctx = new DoubleLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(419);
				match(DOUBLELITERAL);
				}
				break;
			case 7:
				{
				_localctx = new BooleanLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(420);
				match(BOOLEANLITERAL);
				}
				break;
			case 8:
				{
				_localctx = new CharLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(421);
				match(CHARLITERAL);
				}
				break;
			case 9:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(422);
				match(ID);
				}
				break;
			case 10:
				{
				_localctx = new RelIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(423);
				match(REL_ID);
				}
				break;
			case 11:
				{
				_localctx = new ArrayAccessInTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(424);
				arrayAccess();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(444);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(442);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new DivisionContext(new TermContext(_parentctx, _parentState));
						((DivisionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(427);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(428);
						match(T__25);
						setState(429);
						((DivisionContext)_localctx).right = term(16);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationContext(new TermContext(_parentctx, _parentState));
						((MultiplicationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(430);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(431);
						match(T__26);
						setState(432);
						((MultiplicationContext)_localctx).right = term(15);
						}
						break;
					case 3:
						{
						_localctx = new SubtractionContext(new TermContext(_parentctx, _parentState));
						((SubtractionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(433);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(434);
						match(T__24);
						setState(435);
						((SubtractionContext)_localctx).right = term(14);
						}
						break;
					case 4:
						{
						_localctx = new AdditionContext(new TermContext(_parentctx, _parentState));
						((AdditionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(436);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(437);
						match(T__27);
						setState(438);
						((AdditionContext)_localctx).right = term(13);
						}
						break;
					case 5:
						{
						_localctx = new ModuloContext(new TermContext(_parentctx, _parentState));
						((ModuloContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(439);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(440);
						match(T__28);
						setState(441);
						((ModuloContext)_localctx).right = term(12);
						}
						break;
					}
					} 
				}
				setState(446);
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
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new OneDimArrayAccessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				((OneDimArrayAccessContext)_localctx).id = match(ID);
				setState(448);
				match(T__8);
				setState(449);
				((OneDimArrayAccessContext)_localctx).index = term(0);
				setState(450);
				match(T__9);
				}
				break;
			case 2:
				_localctx = new TwoDimArrayAccessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				((TwoDimArrayAccessContext)_localctx).id = match(ID);
				setState(453);
				match(T__8);
				setState(454);
				((TwoDimArrayAccessContext)_localctx).firstIndex = term(0);
				setState(455);
				match(T__9);
				setState(456);
				match(T__8);
				setState(457);
				((TwoDimArrayAccessContext)_localctx).secondIndex = term(0);
				setState(458);
				match(T__9);
				}
				break;
			case 3:
				_localctx = new ThreeDimArrayAccessContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(460);
				((ThreeDimArrayAccessContext)_localctx).id = match(ID);
				setState(461);
				match(T__8);
				setState(462);
				((ThreeDimArrayAccessContext)_localctx).firstIndex = term(0);
				setState(463);
				match(T__9);
				setState(464);
				match(T__8);
				setState(465);
				((ThreeDimArrayAccessContext)_localctx).secondIndex = term(0);
				setState(466);
				match(T__9);
				setState(467);
				match(T__8);
				setState(468);
				((ThreeDimArrayAccessContext)_localctx).thirdIndex = term(0);
				setState(469);
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
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u01dc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\5\2C\n\2\3\3\7\3F\n\3\f\3\16\3I\13\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4"+
		"Q\n\4\3\4\3\4\3\4\3\4\3\4\5\4X\n\4\3\4\5\4[\n\4\3\5\3\5\3\5\3\5\5\5a\n"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5h\n\5\3\5\5\5k\n\5\3\6\3\6\3\6\3\6\3\6\5\6r"+
		"\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b|\n\b\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u008a\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u0098\n\r\3\16\3\16\3\16\5\16\u009d\n\16\3\16\3"+
		"\16\3\16\3\16\5\16\u00a3\n\16\3\16\5\16\u00a6\n\16\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\5\20\u00af\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00cf\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00fa\n\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0111\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u0137\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0159\n\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0167\n\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0175"+
		"\n\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u017d\n\35\f\35\16\35\u0180\13"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u019a\n\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u01ac\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u01bd\n\37\f\37\16\37\u01c0\13\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \5 \u01da\n \3 \2\48<!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668:<>\2\2\2\u01fe\2B\3\2\2\2\4G\3\2\2\2\6Z\3\2\2\2\bj\3"+
		"\2\2\2\nq\3\2\2\2\fs\3\2\2\2\16{\3\2\2\2\20}\3\2\2\2\22\177\3\2\2\2\24"+
		"\u0082\3\2\2\2\26\u0089\3\2\2\2\30\u0097\3\2\2\2\32\u00a5\3\2\2\2\34\u00a7"+
		"\3\2\2\2\36\u00ae\3\2\2\2 \u00ce\3\2\2\2\"\u00d0\3\2\2\2$\u00f9\3\2\2"+
		"\2&\u0110\3\2\2\2(\u0112\3\2\2\2*\u0117\3\2\2\2,\u011c\3\2\2\2.\u0122"+
		"\3\2\2\2\60\u0126\3\2\2\2\62\u0136\3\2\2\2\64\u0158\3\2\2\2\66\u0166\3"+
		"\2\2\28\u0174\3\2\2\2:\u0199\3\2\2\2<\u01ab\3\2\2\2>\u01d9\3\2\2\2@C\5"+
		"8\35\2AC\5<\37\2B@\3\2\2\2BA\3\2\2\2C\3\3\2\2\2DF\5\22\n\2ED\3\2\2\2F"+
		"I\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\5\24\13\2K\5\3\2\2"+
		"\2LM\7$\2\2MN\7-\2\2NP\7\3\2\2OQ\5\n\6\2PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2"+
		"R[\7\4\2\2ST\7\5\2\2TU\7-\2\2UW\7\3\2\2VX\5\n\6\2WV\3\2\2\2WX\3\2\2\2"+
		"XY\3\2\2\2Y[\7\4\2\2ZL\3\2\2\2ZS\3\2\2\2[\7\3\2\2\2\\]\7$\2\2]^\7\6\2"+
		"\2^`\7\3\2\2_a\5\n\6\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bk\7\4\2\2cd\7\5\2"+
		"\2de\7\6\2\2eg\7\3\2\2fh\5\n\6\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2ik\7\4\2"+
		"\2j\\\3\2\2\2jc\3\2\2\2k\t\3\2\2\2lm\5\f\7\2mn\7\7\2\2no\5\n\6\2or\3\2"+
		"\2\2pr\5\f\7\2ql\3\2\2\2qp\3\2\2\2r\13\3\2\2\2st\7$\2\2tu\7-\2\2u\r\3"+
		"\2\2\2vw\5\20\t\2wx\7\7\2\2xy\5\16\b\2y|\3\2\2\2z|\5\20\t\2{v\3\2\2\2"+
		"{z\3\2\2\2|\17\3\2\2\2}~\5<\37\2~\21\3\2\2\2\177\u0080\5\6\4\2\u0080\u0081"+
		"\5\34\17\2\u0081\23\3\2\2\2\u0082\u0083\5\b\5\2\u0083\u0084\5\34\17\2"+
		"\u0084\25\3\2\2\2\u0085\u0086\5\30\r\2\u0086\u0087\5\26\f\2\u0087\u008a"+
		"\3\2\2\2\u0088\u008a\5\30\r\2\u0089\u0085\3\2\2\2\u0089\u0088\3\2\2\2"+
		"\u008a\27\3\2\2\2\u008b\u0098\5\62\32\2\u008c\u0098\5\64\33\2\u008d\u0098"+
		"\5\66\34\2\u008e\u0098\5\36\20\2\u008f\u0098\5 \21\2\u0090\u0098\5\"\22"+
		"\2\u0091\u0098\5$\23\2\u0092\u0098\5.\30\2\u0093\u0094\5\32\16\2\u0094"+
		"\u0095\7\b\2\2\u0095\u0098\3\2\2\2\u0096\u0098\5\60\31\2\u0097\u008b\3"+
		"\2\2\2\u0097\u008c\3\2\2\2\u0097\u008d\3\2\2\2\u0097\u008e\3\2\2\2\u0097"+
		"\u008f\3\2\2\2\u0097\u0090\3\2\2\2\u0097\u0091\3\2\2\2\u0097\u0092\3\2"+
		"\2\2\u0097\u0093\3\2\2\2\u0097\u0096\3\2\2\2\u0098\31\3\2\2\2\u0099\u009a"+
		"\7-\2\2\u009a\u009c\7\3\2\2\u009b\u009d\5\16\b\2\u009c\u009b\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a6\7\4\2\2\u009f\u00a0\7\6"+
		"\2\2\u00a0\u00a2\7\3\2\2\u00a1\u00a3\5\16\b\2\u00a2\u00a1\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\7\4\2\2\u00a5\u0099\3\2"+
		"\2\2\u00a5\u009f\3\2\2\2\u00a6\33\3\2\2\2\u00a7\u00a8\7\t\2\2\u00a8\u00a9"+
		"\5\26\f\2\u00a9\u00aa\7\n\2\2\u00aa\35\3\2\2\2\u00ab\u00af\5,\27\2\u00ac"+
		"\u00af\5*\26\2\u00ad\u00af\5(\25\2\u00ae\u00ab\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00ae\u00ad\3\2\2\2\u00af\37\3\2\2\2\u00b0\u00b1\7$\2\2\u00b1\u00b2"+
		"\7\13\2\2\u00b2\u00b3\5<\37\2\u00b3\u00b4\7\f\2\2\u00b4\u00b5\7-\2\2\u00b5"+
		"\u00b6\7\b\2\2\u00b6\u00cf\3\2\2\2\u00b7\u00b8\7$\2\2\u00b8\u00b9\7\13"+
		"\2\2\u00b9\u00ba\5<\37\2\u00ba\u00bb\7\f\2\2\u00bb\u00bc\7\13\2\2\u00bc"+
		"\u00bd\5<\37\2\u00bd\u00be\7\f\2\2\u00be\u00bf\7-\2\2\u00bf\u00c0\7\b"+
		"\2\2\u00c0\u00cf\3\2\2\2\u00c1\u00c2\7$\2\2\u00c2\u00c3\7\13\2\2\u00c3"+
		"\u00c4\5<\37\2\u00c4\u00c5\7\f\2\2\u00c5\u00c6\7\13\2\2\u00c6\u00c7\5"+
		"<\37\2\u00c7\u00c8\7\f\2\2\u00c8\u00c9\7\13\2\2\u00c9\u00ca\5<\37\2\u00ca"+
		"\u00cb\7\f\2\2\u00cb\u00cc\7-\2\2\u00cc\u00cd\7\b\2\2\u00cd\u00cf\3\2"+
		"\2\2\u00ce\u00b0\3\2\2\2\u00ce\u00b7\3\2\2\2\u00ce\u00c1\3\2\2\2\u00cf"+
		"!\3\2\2\2\u00d0\u00d1\7$\2\2\u00d1\u00d2\5&\24\2\u00d2\u00d3\7-\2\2\u00d3"+
		"\u00d4\7,\2\2\u00d4\u00d5\7\t\2\2\u00d5\u00d6\5\16\b\2\u00d6\u00d7\7\r"+
		"\2\2\u00d7#\3\2\2\2\u00d8\u00d9\7-\2\2\u00d9\u00da\7\13\2\2\u00da\u00db"+
		"\5<\37\2\u00db\u00dc\7\f\2\2\u00dc\u00dd\7,\2\2\u00dd\u00de\5<\37\2\u00de"+
		"\u00df\7\b\2\2\u00df\u00fa\3\2\2\2\u00e0\u00e1\7-\2\2\u00e1\u00e2\7\13"+
		"\2\2\u00e2\u00e3\5<\37\2\u00e3\u00e4\7\f\2\2\u00e4\u00e5\7\13\2\2\u00e5"+
		"\u00e6\5<\37\2\u00e6\u00e7\7\f\2\2\u00e7\u00e8\7,\2\2\u00e8\u00e9\5<\37"+
		"\2\u00e9\u00ea\7\b\2\2\u00ea\u00fa\3\2\2\2\u00eb\u00ec\7-\2\2\u00ec\u00ed"+
		"\7\13\2\2\u00ed\u00ee\5<\37\2\u00ee\u00ef\7\f\2\2\u00ef\u00f0\7\13\2\2"+
		"\u00f0\u00f1\5<\37\2\u00f1\u00f2\7\f\2\2\u00f2\u00f3\7\13\2\2\u00f3\u00f4"+
		"\5<\37\2\u00f4\u00f5\7\f\2\2\u00f5\u00f6\7,\2\2\u00f6\u00f7\5<\37\2\u00f7"+
		"\u00f8\7\b\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00d8\3\2\2\2\u00f9\u00e0\3\2"+
		"\2\2\u00f9\u00eb\3\2\2\2\u00fa%\3\2\2\2\u00fb\u00fc\7\13\2\2\u00fc\u00fd"+
		"\5<\37\2\u00fd\u00fe\7\f\2\2\u00fe\u0111\3\2\2\2\u00ff\u0100\7\13\2\2"+
		"\u0100\u0101\5<\37\2\u0101\u0102\7\f\2\2\u0102\u0103\7\13\2\2\u0103\u0104"+
		"\5<\37\2\u0104\u0105\7\f\2\2\u0105\u0111\3\2\2\2\u0106\u0107\7\13\2\2"+
		"\u0107\u0108\5<\37\2\u0108\u0109\7\f\2\2\u0109\u010a\7\13\2\2\u010a\u010b"+
		"\5<\37\2\u010b\u010c\7\f\2\2\u010c\u010d\7\13\2\2\u010d\u010e\5<\37\2"+
		"\u010e\u010f\7\f\2\2\u010f\u0111\3\2\2\2\u0110\u00fb\3\2\2\2\u0110\u00ff"+
		"\3\2\2\2\u0110\u0106\3\2\2\2\u0111\'\3\2\2\2\u0112\u0113\7-\2\2\u0113"+
		"\u0114\7,\2\2\u0114\u0115\5\32\16\2\u0115\u0116\7\b\2\2\u0116)\3\2\2\2"+
		"\u0117\u0118\7-\2\2\u0118\u0119\7,\2\2\u0119\u011a\5<\37\2\u011a\u011b"+
		"\7\b\2\2\u011b+\3\2\2\2\u011c\u011d\7$\2\2\u011d\u011e\7-\2\2\u011e\u011f"+
		"\7,\2\2\u011f\u0120\5<\37\2\u0120\u0121\7\b\2\2\u0121-\3\2\2\2\u0122\u0123"+
		"\7$\2\2\u0123\u0124\7-\2\2\u0124\u0125\7\b\2\2\u0125/\3\2\2\2\u0126\u0127"+
		"\7\16\2\2\u0127\u0128\5<\37\2\u0128\u0129\7\b\2\2\u0129\61\3\2\2\2\u012a"+
		"\u012b\7\17\2\2\u012b\u012c\7\3\2\2\u012c\u012d\58\35\2\u012d\u012e\7"+
		"\4\2\2\u012e\u012f\5\34\17\2\u012f\u0137\3\2\2\2\u0130\u0131\7\17\2\2"+
		"\u0131\u0132\7\3\2\2\u0132\u0133\58\35\2\u0133\u0134\7\4\2\2\u0134\u0135"+
		"\5\30\r\2\u0135\u0137\3\2\2\2\u0136\u012a\3\2\2\2\u0136\u0130\3\2\2\2"+
		"\u0137\63\3\2\2\2\u0138\u0139\7\17\2\2\u0139\u013a\7\3\2\2\u013a\u013b"+
		"\58\35\2\u013b\u013c\7\4\2\2\u013c\u013d\5\34\17\2\u013d\u013e\7\20\2"+
		"\2\u013e\u013f\5\34\17\2\u013f\u0159\3\2\2\2\u0140\u0141\7\17\2\2\u0141"+
		"\u0142\7\3\2\2\u0142\u0143\58\35\2\u0143\u0144\7\4\2\2\u0144\u0145\5\34"+
		"\17\2\u0145\u0146\7\20\2\2\u0146\u0147\5\30\r\2\u0147\u0159\3\2\2\2\u0148"+
		"\u0149\7\17\2\2\u0149\u014a\7\3\2\2\u014a\u014b\58\35\2\u014b\u014c\7"+
		"\4\2\2\u014c\u014d\5\30\r\2\u014d\u014e\7\20\2\2\u014e\u014f\5\34\17\2"+
		"\u014f\u0159\3\2\2\2\u0150\u0151\7\17\2\2\u0151\u0152\7\3\2\2\u0152\u0153"+
		"\58\35\2\u0153\u0154\7\4\2\2\u0154\u0155\5\30\r\2\u0155\u0156\7\20\2\2"+
		"\u0156\u0157\5\30\r\2\u0157\u0159\3\2\2\2\u0158\u0138\3\2\2\2\u0158\u0140"+
		"\3\2\2\2\u0158\u0148\3\2\2\2\u0158\u0150\3\2\2\2\u0159\65\3\2\2\2\u015a"+
		"\u015b\7\21\2\2\u015b\u015c\7\3\2\2\u015c\u015d\58\35\2\u015d\u015e\7"+
		"\4\2\2\u015e\u015f\5\34\17\2\u015f\u0167\3\2\2\2\u0160\u0161\7\21\2\2"+
		"\u0161\u0162\7\3\2\2\u0162\u0163\58\35\2\u0163\u0164\7\4\2\2\u0164\u0165"+
		"\5\30\r\2\u0165\u0167\3\2\2\2\u0166\u015a\3\2\2\2\u0166\u0160\3\2\2\2"+
		"\u0167\67\3\2\2\2\u0168\u0169\b\35\1\2\u0169\u0175\7-\2\2\u016a\u0175"+
		"\7%\2\2\u016b\u016c\7\22\2\2\u016c\u0175\58\35\t\u016d\u0175\7.\2\2\u016e"+
		"\u0175\5> \2\u016f\u0175\5:\36\2\u0170\u0171\7\3\2\2\u0171\u0172\58\35"+
		"\2\u0172\u0173\7\4\2\2\u0173\u0175\3\2\2\2\u0174\u0168\3\2\2\2\u0174\u016a"+
		"\3\2\2\2\u0174\u016b\3\2\2\2\u0174\u016d\3\2\2\2\u0174\u016e\3\2\2\2\u0174"+
		"\u016f\3\2\2\2\u0174\u0170\3\2\2\2\u0175\u017e\3\2\2\2\u0176\u0177\f\4"+
		"\2\2\u0177\u0178\7\23\2\2\u0178\u017d\58\35\5\u0179\u017a\f\3\2\2\u017a"+
		"\u017b\7\24\2\2\u017b\u017d\58\35\4\u017c\u0176\3\2\2\2\u017c\u0179\3"+
		"\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"9\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0182\5<\37\2\u0182\u0183\7\25\2\2"+
		"\u0183\u0184\5<\37\2\u0184\u019a\3\2\2\2\u0185\u0186\5<\37\2\u0186\u0187"+
		"\7\26\2\2\u0187\u0188\5<\37\2\u0188\u019a\3\2\2\2\u0189\u018a\5<\37\2"+
		"\u018a\u018b\7\27\2\2\u018b\u018c\5<\37\2\u018c\u019a\3\2\2\2\u018d\u018e"+
		"\5<\37\2\u018e\u018f\7\30\2\2\u018f\u0190\5<\37\2\u0190\u019a\3\2\2\2"+
		"\u0191\u0192\5<\37\2\u0192\u0193\7\31\2\2\u0193\u0194\5<\37\2\u0194\u019a"+
		"\3\2\2\2\u0195\u0196\5<\37\2\u0196\u0197\7\32\2\2\u0197\u0198\5<\37\2"+
		"\u0198\u019a\3\2\2\2\u0199\u0181\3\2\2\2\u0199\u0185\3\2\2\2\u0199\u0189"+
		"\3\2\2\2\u0199\u018d\3\2\2\2\u0199\u0191\3\2\2\2\u0199\u0195\3\2\2\2\u019a"+
		";\3\2\2\2\u019b\u019c\b\37\1\2\u019c\u019d\7\33\2\2\u019d\u01ac\5<\37"+
		"\22\u019e\u019f\7\3\2\2\u019f\u01a0\5<\37\2\u01a0\u01a1\7\4\2\2\u01a1"+
		"\u01ac\3\2\2\2\u01a2\u01ac\7\'\2\2\u01a3\u01ac\7&\2\2\u01a4\u01ac\7*\2"+
		"\2\u01a5\u01ac\7+\2\2\u01a6\u01ac\7%\2\2\u01a7\u01ac\7(\2\2\u01a8\u01ac"+
		"\7-\2\2\u01a9\u01ac\7.\2\2\u01aa\u01ac\5> \2\u01ab\u019b\3\2\2\2\u01ab"+
		"\u019e\3\2\2\2\u01ab\u01a2\3\2\2\2\u01ab\u01a3\3\2\2\2\u01ab\u01a4\3\2"+
		"\2\2\u01ab\u01a5\3\2\2\2\u01ab\u01a6\3\2\2\2\u01ab\u01a7\3\2\2\2\u01ab"+
		"\u01a8\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01aa\3\2\2\2\u01ac\u01be\3\2"+
		"\2\2\u01ad\u01ae\f\21\2\2\u01ae\u01af\7\34\2\2\u01af\u01bd\5<\37\22\u01b0"+
		"\u01b1\f\20\2\2\u01b1\u01b2\7\35\2\2\u01b2\u01bd\5<\37\21\u01b3\u01b4"+
		"\f\17\2\2\u01b4\u01b5\7\33\2\2\u01b5\u01bd\5<\37\20\u01b6\u01b7\f\16\2"+
		"\2\u01b7\u01b8\7\36\2\2\u01b8\u01bd\5<\37\17\u01b9\u01ba\f\r\2\2\u01ba"+
		"\u01bb\7\37\2\2\u01bb\u01bd\5<\37\16\u01bc\u01ad\3\2\2\2\u01bc\u01b0\3"+
		"\2\2\2\u01bc\u01b3\3\2\2\2\u01bc\u01b6\3\2\2\2\u01bc\u01b9\3\2\2\2\u01bd"+
		"\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf=\3\2\2\2"+
		"\u01c0\u01be\3\2\2\2\u01c1\u01c2\7-\2\2\u01c2\u01c3\7\13\2\2\u01c3\u01c4"+
		"\5<\37\2\u01c4\u01c5\7\f\2\2\u01c5\u01da\3\2\2\2\u01c6\u01c7\7-\2\2\u01c7"+
		"\u01c8\7\13\2\2\u01c8\u01c9\5<\37\2\u01c9\u01ca\7\f\2\2\u01ca\u01cb\7"+
		"\13\2\2\u01cb\u01cc\5<\37\2\u01cc\u01cd\7\f\2\2\u01cd\u01da\3\2\2\2\u01ce"+
		"\u01cf\7-\2\2\u01cf\u01d0\7\13\2\2\u01d0\u01d1\5<\37\2\u01d1\u01d2\7\f"+
		"\2\2\u01d2\u01d3\7\13\2\2\u01d3\u01d4\5<\37\2\u01d4\u01d5\7\f\2\2\u01d5"+
		"\u01d6\7\13\2\2\u01d6\u01d7\5<\37\2\u01d7\u01d8\7\f\2\2\u01d8\u01da\3"+
		"\2\2\2\u01d9\u01c1\3\2\2\2\u01d9\u01c6\3\2\2\2\u01d9\u01ce\3\2\2\2\u01da"+
		"?\3\2\2\2 BGPWZ`gjq{\u0089\u0097\u009c\u00a2\u00a5\u00ae\u00ce\u00f9\u0110"+
		"\u0136\u0158\u0166\u0174\u017c\u017e\u0199\u01ab\u01bc\u01be\u01d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}