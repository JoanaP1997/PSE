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
		COMMENT=32, LINE_COMMENT=33, TYPE=34, ID=35, INTLITERAL=36, FLOATLITERAL=37, 
		CHARLITERAL=38, BOOLEANLITERAL=39, NULLLITERAL=40, LONGLITERAL=41, DOUBLELITERAL=42, 
		ASSIGN=43;
	public static final int
		RULE_r = 0, RULE_programm = 1, RULE_routineHead = 2, RULE_mainHead = 3, 
		RULE_arglist = 4, RULE_argument = 5, RULE_filledArglist = 6, RULE_filledArgument = 7, 
		RULE_routine = 8, RULE_mainRoutine = 9, RULE_statements = 10, RULE_statement = 11, 
		RULE_funcCall = 12, RULE_block = 13, RULE_assignment = 14, RULE_arrayDeclaration = 15, 
		RULE_arrayDeclareAssign = 16, RULE_arrayElementAssign = 17, RULE_dims = 18, 
		RULE_pureAssign = 19, RULE_declareAssign = 20, RULE_declaration = 21, 
		RULE_returnState = 22, RULE_ifState = 23, RULE_ifelseState = 24, RULE_whileState = 25, 
		RULE_condition = 26, RULE_comparison = 27, RULE_term = 28, RULE_arrayAccess = 29;
	public static final String[] ruleNames = {
		"r", "programm", "routineHead", "mainHead", "arglist", "argument", "filledArglist", 
		"filledArgument", "routine", "mainRoutine", "statements", "statement", 
		"funcCall", "block", "assignment", "arrayDeclaration", "arrayDeclareAssign", 
		"arrayElementAssign", "dims", "pureAssign", "declareAssign", "declaration", 
		"returnState", "ifState", "ifelseState", "whileState", "condition", "comparison", 
		"term", "arrayAccess"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'void'", "'main'", "','", "';'", "'{'", "'}'", "'['", 
		"']'", "'};'", "'return'", "'if'", "'else'", "'while'", "'&&'", "'||'", 
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
			setState(60);
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
		enterRule(_localctx, 2, RULE_programm);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(62);
					routine();
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(68);
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
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				_localctx = new FunctionHeadContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				((FunctionHeadContext)_localctx).returntype = match(TYPE);
				setState(71);
				((FunctionHeadContext)_localctx).id = match(ID);
				setState(72);
				match(T__0);
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(73);
					((FunctionHeadContext)_localctx).args = arglist();
					}
				}

				setState(76);
				match(T__1);
				}
				break;
			case T__2:
				_localctx = new ProcedureHeadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(T__2);
				setState(78);
				((ProcedureHeadContext)_localctx).id = match(ID);
				setState(79);
				match(T__0);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(80);
					((ProcedureHeadContext)_localctx).args = arglist();
					}
				}

				setState(83);
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
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				_localctx = new MainFunctionHeadContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				((MainFunctionHeadContext)_localctx).returntype = match(TYPE);
				setState(87);
				match(T__3);
				setState(88);
				match(T__0);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(89);
					((MainFunctionHeadContext)_localctx).args = arglist();
					}
				}

				setState(92);
				match(T__1);
				}
				break;
			case T__2:
				_localctx = new MainProcedureHeadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(T__2);
				setState(94);
				match(T__3);
				setState(95);
				match(T__0);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(96);
					((MainProcedureHeadContext)_localctx).args = arglist();
					}
				}

				setState(99);
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
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				argument();
				setState(103);
				match(T__4);
				setState(104);
				arglist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
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
			setState(109);
			((ArgumentContext)_localctx).type = match(TYPE);
			setState(110);
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
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				filledArgument();
				setState(113);
				match(T__4);
				setState(114);
				filledArglist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
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
			setState(119);
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
			setState(121);
			routineHead();
			setState(122);
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
			setState(124);
			mainHead();
			setState(125);
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
		enterRule(_localctx, 20, RULE_statements);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new CompStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				statement();
				setState(128);
				statements();
				}
				break;
			case 2:
				_localctx = new SingleStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
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
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				ifState();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				ifelseState();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				whileState();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(137);
				arrayDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				arrayDeclareAssign();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(139);
				arrayElementAssign();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(140);
				declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(141);
				funcCall();
				setState(142);
				match(T__5);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(144);
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
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				((FuncCallContext)_localctx).functionname = match(ID);
				setState(148);
				match(T__0);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__24) | (1L << ID) | (1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << CHARLITERAL) | (1L << LONGLITERAL) | (1L << DOUBLELITERAL))) != 0)) {
					{
					setState(149);
					((FuncCallContext)_localctx).args = filledArglist();
					}
				}

				setState(152);
				match(T__1);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				((FuncCallContext)_localctx).functionname = match(T__3);
				setState(154);
				match(T__0);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__24) | (1L << ID) | (1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << CHARLITERAL) | (1L << LONGLITERAL) | (1L << DOUBLELITERAL))) != 0)) {
					{
					setState(155);
					((FuncCallContext)_localctx).args = filledArglist();
					}
				}

				setState(158);
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
			setState(161);
			match(T__6);
			setState(162);
			statements();
			setState(163);
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
		enterRule(_localctx, 28, RULE_assignment);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				declareAssign();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
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
		enterRule(_localctx, 30, RULE_arrayDeclaration);
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new ArrayDeclarationOneDimContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				((ArrayDeclarationOneDimContext)_localctx).type = match(TYPE);
				setState(170);
				match(T__8);
				setState(171);
				((ArrayDeclarationOneDimContext)_localctx).index = term(0);
				setState(172);
				match(T__9);
				setState(173);
				((ArrayDeclarationOneDimContext)_localctx).id = match(ID);
				setState(174);
				match(T__5);
				}
				break;
			case 2:
				_localctx = new ArrayDeclarationTwoDimContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				((ArrayDeclarationTwoDimContext)_localctx).type = match(TYPE);
				setState(177);
				match(T__8);
				setState(178);
				((ArrayDeclarationTwoDimContext)_localctx).firstIndex = term(0);
				setState(179);
				match(T__9);
				setState(180);
				match(T__8);
				setState(181);
				((ArrayDeclarationTwoDimContext)_localctx).secondIndex = term(0);
				setState(182);
				match(T__9);
				setState(183);
				((ArrayDeclarationTwoDimContext)_localctx).id = match(ID);
				setState(184);
				match(T__5);
				}
				break;
			case 3:
				_localctx = new ArrayDeclarationThreeDimContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				((ArrayDeclarationThreeDimContext)_localctx).type = match(TYPE);
				setState(187);
				match(T__8);
				setState(188);
				((ArrayDeclarationThreeDimContext)_localctx).firstIndex = term(0);
				setState(189);
				match(T__9);
				setState(190);
				match(T__8);
				setState(191);
				((ArrayDeclarationThreeDimContext)_localctx).secondIndex = term(0);
				setState(192);
				match(T__9);
				setState(193);
				match(T__8);
				setState(194);
				((ArrayDeclarationThreeDimContext)_localctx).index = term(0);
				setState(195);
				match(T__9);
				setState(196);
				((ArrayDeclarationThreeDimContext)_localctx).id = match(ID);
				setState(197);
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
			setState(201);
			((ArrayDeclareAssignContext)_localctx).type = match(TYPE);
			setState(202);
			dims();
			setState(203);
			((ArrayDeclareAssignContext)_localctx).id = match(ID);
			setState(204);
			match(ASSIGN);
			setState(205);
			match(T__6);
			setState(206);
			filledArglist();
			setState(207);
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
		enterRule(_localctx, 34, RULE_arrayElementAssign);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new ArrayElementAssignOneDimContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				((ArrayElementAssignOneDimContext)_localctx).id = match(ID);
				setState(210);
				match(T__8);
				setState(211);
				((ArrayElementAssignOneDimContext)_localctx).index = term(0);
				setState(212);
				match(T__9);
				setState(213);
				match(ASSIGN);
				setState(214);
				((ArrayElementAssignOneDimContext)_localctx).value = term(0);
				setState(215);
				match(T__5);
				}
				break;
			case 2:
				_localctx = new ArrayElementAssignTwoDimContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				((ArrayElementAssignTwoDimContext)_localctx).id = match(ID);
				setState(218);
				match(T__8);
				setState(219);
				((ArrayElementAssignTwoDimContext)_localctx).firstIndex = term(0);
				setState(220);
				match(T__9);
				setState(221);
				match(T__8);
				setState(222);
				((ArrayElementAssignTwoDimContext)_localctx).secondIndex = term(0);
				setState(223);
				match(T__9);
				setState(224);
				match(ASSIGN);
				setState(225);
				((ArrayElementAssignTwoDimContext)_localctx).value = term(0);
				setState(226);
				match(T__5);
				}
				break;
			case 3:
				_localctx = new ArrayElementAssignThreeDimContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				((ArrayElementAssignThreeDimContext)_localctx).id = match(ID);
				setState(229);
				match(T__8);
				setState(230);
				((ArrayElementAssignThreeDimContext)_localctx).firstIndex = term(0);
				setState(231);
				match(T__9);
				setState(232);
				match(T__8);
				setState(233);
				((ArrayElementAssignThreeDimContext)_localctx).secondtIndex = term(0);
				setState(234);
				match(T__9);
				setState(235);
				match(T__8);
				setState(236);
				((ArrayElementAssignThreeDimContext)_localctx).thirdIndex = term(0);
				setState(237);
				match(T__9);
				setState(238);
				match(ASSIGN);
				setState(239);
				((ArrayElementAssignThreeDimContext)_localctx).value = term(0);
				setState(240);
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
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new OneDimsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(T__8);
				setState(245);
				term(0);
				setState(246);
				match(T__9);
				}
				break;
			case 2:
				_localctx = new TwoDimsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(T__8);
				setState(249);
				term(0);
				setState(250);
				match(T__9);
				setState(251);
				match(T__8);
				setState(252);
				term(0);
				setState(253);
				match(T__9);
				}
				break;
			case 3:
				_localctx = new ThreeDimsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				match(T__8);
				setState(256);
				term(0);
				setState(257);
				match(T__9);
				setState(258);
				match(T__8);
				setState(259);
				term(0);
				setState(260);
				match(T__9);
				setState(261);
				match(T__8);
				setState(262);
				term(0);
				setState(263);
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
		enterRule(_localctx, 38, RULE_pureAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			((PureAssignContext)_localctx).id = match(ID);
			setState(268);
			match(ASSIGN);
			setState(269);
			((PureAssignContext)_localctx).value = term(0);
			setState(270);
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
		enterRule(_localctx, 40, RULE_declareAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			((DeclareAssignContext)_localctx).type = match(TYPE);
			setState(273);
			((DeclareAssignContext)_localctx).id = match(ID);
			setState(274);
			match(ASSIGN);
			setState(275);
			((DeclareAssignContext)_localctx).value = term(0);
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
		enterRule(_localctx, 42, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			((DeclarationContext)_localctx).type = match(TYPE);
			setState(279);
			((DeclarationContext)_localctx).id = match(ID);
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
		enterRule(_localctx, 44, RULE_returnState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(T__11);
			setState(283);
			((ReturnStateContext)_localctx).returnvalue = term(0);
			setState(284);
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
		enterRule(_localctx, 46, RULE_ifState);
		try {
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new IfWithBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(T__12);
				setState(287);
				match(T__0);
				setState(288);
				condition(0);
				setState(289);
				match(T__1);
				setState(290);
				((IfWithBlockContext)_localctx).content = block();
				}
				break;
			case 2:
				_localctx = new IfWithSingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
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
		enterRule(_localctx, 48, RULE_ifelseState);
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new IfElseWithBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				((IfElseWithBlockContext)_localctx).ifPart = ifState();
				setState(301);
				match(T__13);
				setState(302);
				((IfElseWithBlockContext)_localctx).content = block();
				}
				break;
			case 2:
				_localctx = new IfElseWithSingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				((IfElseWithSingleContext)_localctx).ifPart = ifState();
				setState(305);
				match(T__13);
				setState(306);
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
		enterRule(_localctx, 50, RULE_whileState);
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new WhileWithBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				match(T__14);
				setState(311);
				match(T__0);
				setState(312);
				condition(0);
				setState(313);
				match(T__1);
				setState(314);
				((WhileWithBlockContext)_localctx).content = block();
				}
				break;
			case 2:
				_localctx = new WhileWithSingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new IdConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(325);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new ArrayAccessConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(326);
				arrayAccess();
				}
				break;
			case 3:
				{
				_localctx = new ComparisonConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(327);
				comparison();
				}
				break;
			case 4:
				{
				_localctx = new ConstantConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(328);
				match(BOOLEANLITERAL);
				}
				break;
			case 5:
				{
				_localctx = new BracketConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(329);
				match(T__0);
				setState(330);
				((BracketConditionContext)_localctx).inner = condition(0);
				setState(331);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new NotConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(333);
				match(T__17);
				setState(334);
				((NotConditionContext)_localctx).inner = condition(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(343);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new AndConditionContext(new ConditionContext(_parentctx, _parentState));
						((AndConditionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(337);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(338);
						match(T__15);
						setState(339);
						((AndConditionContext)_localctx).right = condition(4);
						}
						break;
					case 2:
						{
						_localctx = new OrConditionContext(new ConditionContext(_parentctx, _parentState));
						((OrConditionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(340);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(341);
						match(T__16);
						setState(342);
						((OrConditionContext)_localctx).right = condition(3);
						}
						break;
					}
					} 
				}
				setState(347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		enterRule(_localctx, 54, RULE_comparison);
		try {
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new LessCompContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				((LessCompContext)_localctx).left = term(0);
				setState(349);
				match(T__18);
				setState(350);
				((LessCompContext)_localctx).right = term(0);
				}
				break;
			case 2:
				_localctx = new LessEqualCompContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				((LessEqualCompContext)_localctx).left = term(0);
				setState(353);
				match(T__19);
				setState(354);
				((LessEqualCompContext)_localctx).right = term(0);
				}
				break;
			case 3:
				_localctx = new MoreCompContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(356);
				((MoreCompContext)_localctx).left = term(0);
				setState(357);
				match(T__20);
				setState(358);
				((MoreCompContext)_localctx).right = term(0);
				}
				break;
			case 4:
				_localctx = new MoreEqualCompContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(360);
				((MoreEqualCompContext)_localctx).left = term(0);
				setState(361);
				match(T__21);
				setState(362);
				((MoreEqualCompContext)_localctx).right = term(0);
				}
				break;
			case 5:
				_localctx = new EqualCompContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(364);
				((EqualCompContext)_localctx).left = term(0);
				setState(365);
				match(T__22);
				setState(366);
				((EqualCompContext)_localctx).right = term(0);
				}
				break;
			case 6:
				_localctx = new NotEqualCompContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(368);
				((NotEqualCompContext)_localctx).left = term(0);
				setState(369);
				match(T__23);
				setState(370);
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
	public static class IDContext extends TermContext {
		public TerminalNode ID() { return getToken(WlangParser.ID, 0); }
		public IDContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitID(this);
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
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				_localctx = new NegativeTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(375);
				match(T__24);
				setState(376);
				((NegativeTermContext)_localctx).inner = term(15);
				}
				break;
			case 2:
				{
				_localctx = new BracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(377);
				match(T__0);
				setState(378);
				((BracketsContext)_localctx).inner = term(0);
				setState(379);
				match(T__1);
				}
				break;
			case 3:
				{
				_localctx = new FloatLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(381);
				match(FLOATLITERAL);
				}
				break;
			case 4:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(382);
				match(INTLITERAL);
				}
				break;
			case 5:
				{
				_localctx = new LongLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(383);
				match(LONGLITERAL);
				}
				break;
			case 6:
				{
				_localctx = new DoubleLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(384);
				match(DOUBLELITERAL);
				}
				break;
			case 7:
				{
				_localctx = new IDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(385);
				match(ID);
				}
				break;
			case 8:
				{
				_localctx = new CharLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(386);
				match(CHARLITERAL);
				}
				break;
			case 9:
				{
				_localctx = new FunctionCallInTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(387);
				funcCall();
				}
				break;
			case 10:
				{
				_localctx = new ArrayAccessInTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(388);
				arrayAccess();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(408);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(406);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new DivisionContext(new TermContext(_parentctx, _parentState));
						((DivisionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(391);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(392);
						match(T__25);
						setState(393);
						((DivisionContext)_localctx).right = term(15);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationContext(new TermContext(_parentctx, _parentState));
						((MultiplicationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(394);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(395);
						match(T__26);
						setState(396);
						((MultiplicationContext)_localctx).right = term(14);
						}
						break;
					case 3:
						{
						_localctx = new SubtractionContext(new TermContext(_parentctx, _parentState));
						((SubtractionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(397);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(398);
						match(T__24);
						setState(399);
						((SubtractionContext)_localctx).right = term(13);
						}
						break;
					case 4:
						{
						_localctx = new AdditionContext(new TermContext(_parentctx, _parentState));
						((AdditionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(400);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(401);
						match(T__27);
						setState(402);
						((AdditionContext)_localctx).right = term(12);
						}
						break;
					case 5:
						{
						_localctx = new ModuloContext(new TermContext(_parentctx, _parentState));
						((ModuloContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(403);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(404);
						match(T__28);
						setState(405);
						((ModuloContext)_localctx).right = term(11);
						}
						break;
					}
					} 
				}
				setState(410);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		public TermContext secondtIndex;
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
		enterRule(_localctx, 58, RULE_arrayAccess);
		try {
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new OneDimArrayAccessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				((OneDimArrayAccessContext)_localctx).id = match(ID);
				setState(412);
				match(T__8);
				setState(413);
				((OneDimArrayAccessContext)_localctx).index = term(0);
				setState(414);
				match(T__9);
				}
				break;
			case 2:
				_localctx = new TwoDimArrayAccessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				((TwoDimArrayAccessContext)_localctx).id = match(ID);
				setState(417);
				match(T__8);
				setState(418);
				((TwoDimArrayAccessContext)_localctx).firstIndex = term(0);
				setState(419);
				match(T__9);
				setState(420);
				match(T__8);
				setState(421);
				((TwoDimArrayAccessContext)_localctx).secondIndex = term(0);
				setState(422);
				match(T__9);
				}
				break;
			case 3:
				_localctx = new ThreeDimArrayAccessContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
				((ThreeDimArrayAccessContext)_localctx).id = match(ID);
				setState(425);
				match(T__8);
				setState(426);
				((ThreeDimArrayAccessContext)_localctx).firstIndex = term(0);
				setState(427);
				match(T__9);
				setState(428);
				match(T__8);
				setState(429);
				((ThreeDimArrayAccessContext)_localctx).secondtIndex = term(0);
				setState(430);
				match(T__9);
				setState(431);
				match(T__8);
				setState(432);
				((ThreeDimArrayAccessContext)_localctx).thirdIndex = term(0);
				setState(433);
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
		case 26:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		case 28:
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
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u01b8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\3\7\3B\n\3\f\3\16\3E\13\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4M\n\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4T\n\4\3\4\5\4W\n\4\3\5\3\5\3\5\3\5\5\5]\n\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5d\n\5\3\5\5\5g\n\5\3\6\3\6\3\6\3\6\3\6\5\6n\n\6\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\5\bx\n\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\5\f\u0086\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\r\u0094\n\r\3\16\3\16\3\16\5\16\u0099\n\16\3\16\3\16\3\16\3\16"+
		"\5\16\u009f\n\16\3\16\5\16\u00a2\n\16\3\17\3\17\3\17\3\17\3\20\3\20\5"+
		"\20\u00aa\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u00ca\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f5\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u010c\n\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u012d\n\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0137\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0145\n\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0152\n\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\7\34\u015a\n\34\f\34\16\34\u015d\13\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0177\n\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0188\n\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\7\36\u0199\n\36\f\36\16\36\u019c\13\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u01b6\n\37\3\37\2\4\66: \2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\2\2\u01d5\2>\3\2\2\2\4C\3"+
		"\2\2\2\6V\3\2\2\2\bf\3\2\2\2\nm\3\2\2\2\fo\3\2\2\2\16w\3\2\2\2\20y\3\2"+
		"\2\2\22{\3\2\2\2\24~\3\2\2\2\26\u0085\3\2\2\2\30\u0093\3\2\2\2\32\u00a1"+
		"\3\2\2\2\34\u00a3\3\2\2\2\36\u00a9\3\2\2\2 \u00c9\3\2\2\2\"\u00cb\3\2"+
		"\2\2$\u00f4\3\2\2\2&\u010b\3\2\2\2(\u010d\3\2\2\2*\u0112\3\2\2\2,\u0118"+
		"\3\2\2\2.\u011c\3\2\2\2\60\u012c\3\2\2\2\62\u0136\3\2\2\2\64\u0144\3\2"+
		"\2\2\66\u0151\3\2\2\28\u0176\3\2\2\2:\u0187\3\2\2\2<\u01b5\3\2\2\2>?\5"+
		"\4\3\2?\3\3\2\2\2@B\5\22\n\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D"+
		"F\3\2\2\2EC\3\2\2\2FG\5\24\13\2G\5\3\2\2\2HI\7$\2\2IJ\7%\2\2JL\7\3\2\2"+
		"KM\5\n\6\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2NW\7\4\2\2OP\7\5\2\2PQ\7%\2\2"+
		"QS\7\3\2\2RT\5\n\6\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UW\7\4\2\2VH\3\2\2\2"+
		"VO\3\2\2\2W\7\3\2\2\2XY\7$\2\2YZ\7\6\2\2Z\\\7\3\2\2[]\5\n\6\2\\[\3\2\2"+
		"\2\\]\3\2\2\2]^\3\2\2\2^g\7\4\2\2_`\7\5\2\2`a\7\6\2\2ac\7\3\2\2bd\5\n"+
		"\6\2cb\3\2\2\2cd\3\2\2\2de\3\2\2\2eg\7\4\2\2fX\3\2\2\2f_\3\2\2\2g\t\3"+
		"\2\2\2hi\5\f\7\2ij\7\7\2\2jk\5\n\6\2kn\3\2\2\2ln\5\f\7\2mh\3\2\2\2ml\3"+
		"\2\2\2n\13\3\2\2\2op\7$\2\2pq\7%\2\2q\r\3\2\2\2rs\5\20\t\2st\7\7\2\2t"+
		"u\5\16\b\2ux\3\2\2\2vx\5\20\t\2wr\3\2\2\2wv\3\2\2\2x\17\3\2\2\2yz\5:\36"+
		"\2z\21\3\2\2\2{|\5\6\4\2|}\5\34\17\2}\23\3\2\2\2~\177\5\b\5\2\177\u0080"+
		"\5\34\17\2\u0080\25\3\2\2\2\u0081\u0082\5\30\r\2\u0082\u0083\5\26\f\2"+
		"\u0083\u0086\3\2\2\2\u0084\u0086\5\30\r\2\u0085\u0081\3\2\2\2\u0085\u0084"+
		"\3\2\2\2\u0086\27\3\2\2\2\u0087\u0094\5\60\31\2\u0088\u0094\5\62\32\2"+
		"\u0089\u0094\5\64\33\2\u008a\u0094\5\36\20\2\u008b\u0094\5 \21\2\u008c"+
		"\u0094\5\"\22\2\u008d\u0094\5$\23\2\u008e\u0094\5,\27\2\u008f\u0090\5"+
		"\32\16\2\u0090\u0091\7\b\2\2\u0091\u0094\3\2\2\2\u0092\u0094\5.\30\2\u0093"+
		"\u0087\3\2\2\2\u0093\u0088\3\2\2\2\u0093\u0089\3\2\2\2\u0093\u008a\3\2"+
		"\2\2\u0093\u008b\3\2\2\2\u0093\u008c\3\2\2\2\u0093\u008d\3\2\2\2\u0093"+
		"\u008e\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0092\3\2\2\2\u0094\31\3\2\2"+
		"\2\u0095\u0096\7%\2\2\u0096\u0098\7\3\2\2\u0097\u0099\5\16\b\2\u0098\u0097"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u00a2\7\4\2\2\u009b"+
		"\u009c\7\6\2\2\u009c\u009e\7\3\2\2\u009d\u009f\5\16\b\2\u009e\u009d\3"+
		"\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\7\4\2\2\u00a1"+
		"\u0095\3\2\2\2\u00a1\u009b\3\2\2\2\u00a2\33\3\2\2\2\u00a3\u00a4\7\t\2"+
		"\2\u00a4\u00a5\5\26\f\2\u00a5\u00a6\7\n\2\2\u00a6\35\3\2\2\2\u00a7\u00aa"+
		"\5*\26\2\u00a8\u00aa\5(\25\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"\37\3\2\2\2\u00ab\u00ac\7$\2\2\u00ac\u00ad\7\13\2\2\u00ad\u00ae\5:\36"+
		"\2\u00ae\u00af\7\f\2\2\u00af\u00b0\7%\2\2\u00b0\u00b1\7\b\2\2\u00b1\u00ca"+
		"\3\2\2\2\u00b2\u00b3\7$\2\2\u00b3\u00b4\7\13\2\2\u00b4\u00b5\5:\36\2\u00b5"+
		"\u00b6\7\f\2\2\u00b6\u00b7\7\13\2\2\u00b7\u00b8\5:\36\2\u00b8\u00b9\7"+
		"\f\2\2\u00b9\u00ba\7%\2\2\u00ba\u00bb\7\b\2\2\u00bb\u00ca\3\2\2\2\u00bc"+
		"\u00bd\7$\2\2\u00bd\u00be\7\13\2\2\u00be\u00bf\5:\36\2\u00bf\u00c0\7\f"+
		"\2\2\u00c0\u00c1\7\13\2\2\u00c1\u00c2\5:\36\2\u00c2\u00c3\7\f\2\2\u00c3"+
		"\u00c4\7\13\2\2\u00c4\u00c5\5:\36\2\u00c5\u00c6\7\f\2\2\u00c6\u00c7\7"+
		"%\2\2\u00c7\u00c8\7\b\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00ab\3\2\2\2\u00c9"+
		"\u00b2\3\2\2\2\u00c9\u00bc\3\2\2\2\u00ca!\3\2\2\2\u00cb\u00cc\7$\2\2\u00cc"+
		"\u00cd\5&\24\2\u00cd\u00ce\7%\2\2\u00ce\u00cf\7-\2\2\u00cf\u00d0\7\t\2"+
		"\2\u00d0\u00d1\5\16\b\2\u00d1\u00d2\7\r\2\2\u00d2#\3\2\2\2\u00d3\u00d4"+
		"\7%\2\2\u00d4\u00d5\7\13\2\2\u00d5\u00d6\5:\36\2\u00d6\u00d7\7\f\2\2\u00d7"+
		"\u00d8\7-\2\2\u00d8\u00d9\5:\36\2\u00d9\u00da\7\b\2\2\u00da\u00f5\3\2"+
		"\2\2\u00db\u00dc\7%\2\2\u00dc\u00dd\7\13\2\2\u00dd\u00de\5:\36\2\u00de"+
		"\u00df\7\f\2\2\u00df\u00e0\7\13\2\2\u00e0\u00e1\5:\36\2\u00e1\u00e2\7"+
		"\f\2\2\u00e2\u00e3\7-\2\2\u00e3\u00e4\5:\36\2\u00e4\u00e5\7\b\2\2\u00e5"+
		"\u00f5\3\2\2\2\u00e6\u00e7\7%\2\2\u00e7\u00e8\7\13\2\2\u00e8\u00e9\5:"+
		"\36\2\u00e9\u00ea\7\f\2\2\u00ea\u00eb\7\13\2\2\u00eb\u00ec\5:\36\2\u00ec"+
		"\u00ed\7\f\2\2\u00ed\u00ee\7\13\2\2\u00ee\u00ef\5:\36\2\u00ef\u00f0\7"+
		"\f\2\2\u00f0\u00f1\7-\2\2\u00f1\u00f2\5:\36\2\u00f2\u00f3\7\b\2\2\u00f3"+
		"\u00f5\3\2\2\2\u00f4\u00d3\3\2\2\2\u00f4\u00db\3\2\2\2\u00f4\u00e6\3\2"+
		"\2\2\u00f5%\3\2\2\2\u00f6\u00f7\7\13\2\2\u00f7\u00f8\5:\36\2\u00f8\u00f9"+
		"\7\f\2\2\u00f9\u010c\3\2\2\2\u00fa\u00fb\7\13\2\2\u00fb\u00fc\5:\36\2"+
		"\u00fc\u00fd\7\f\2\2\u00fd\u00fe\7\13\2\2\u00fe\u00ff\5:\36\2\u00ff\u0100"+
		"\7\f\2\2\u0100\u010c\3\2\2\2\u0101\u0102\7\13\2\2\u0102\u0103\5:\36\2"+
		"\u0103\u0104\7\f\2\2\u0104\u0105\7\13\2\2\u0105\u0106\5:\36\2\u0106\u0107"+
		"\7\f\2\2\u0107\u0108\7\13\2\2\u0108\u0109\5:\36\2\u0109\u010a\7\f\2\2"+
		"\u010a\u010c\3\2\2\2\u010b\u00f6\3\2\2\2\u010b\u00fa\3\2\2\2\u010b\u0101"+
		"\3\2\2\2\u010c\'\3\2\2\2\u010d\u010e\7%\2\2\u010e\u010f\7-\2\2\u010f\u0110"+
		"\5:\36\2\u0110\u0111\7\b\2\2\u0111)\3\2\2\2\u0112\u0113\7$\2\2\u0113\u0114"+
		"\7%\2\2\u0114\u0115\7-\2\2\u0115\u0116\5:\36\2\u0116\u0117\7\b\2\2\u0117"+
		"+\3\2\2\2\u0118\u0119\7$\2\2\u0119\u011a\7%\2\2\u011a\u011b\7\b\2\2\u011b"+
		"-\3\2\2\2\u011c\u011d\7\16\2\2\u011d\u011e\5:\36\2\u011e\u011f\7\b\2\2"+
		"\u011f/\3\2\2\2\u0120\u0121\7\17\2\2\u0121\u0122\7\3\2\2\u0122\u0123\5"+
		"\66\34\2\u0123\u0124\7\4\2\2\u0124\u0125\5\34\17\2\u0125\u012d\3\2\2\2"+
		"\u0126\u0127\7\17\2\2\u0127\u0128\7\3\2\2\u0128\u0129\5\66\34\2\u0129"+
		"\u012a\7\4\2\2\u012a\u012b\5\30\r\2\u012b\u012d\3\2\2\2\u012c\u0120\3"+
		"\2\2\2\u012c\u0126\3\2\2\2\u012d\61\3\2\2\2\u012e\u012f\5\60\31\2\u012f"+
		"\u0130\7\20\2\2\u0130\u0131\5\34\17\2\u0131\u0137\3\2\2\2\u0132\u0133"+
		"\5\60\31\2\u0133\u0134\7\20\2\2\u0134\u0135\5\30\r\2\u0135\u0137\3\2\2"+
		"\2\u0136\u012e\3\2\2\2\u0136\u0132\3\2\2\2\u0137\63\3\2\2\2\u0138\u0139"+
		"\7\21\2\2\u0139\u013a\7\3\2\2\u013a\u013b\5\66\34\2\u013b\u013c\7\4\2"+
		"\2\u013c\u013d\5\34\17\2\u013d\u0145\3\2\2\2\u013e\u013f\7\21\2\2\u013f"+
		"\u0140\7\3\2\2\u0140\u0141\5\66\34\2\u0141\u0142\7\4\2\2\u0142\u0143\5"+
		"\30\r\2\u0143\u0145\3\2\2\2\u0144\u0138\3\2\2\2\u0144\u013e\3\2\2\2\u0145"+
		"\65\3\2\2\2\u0146\u0147\b\34\1\2\u0147\u0152\7%\2\2\u0148\u0152\5<\37"+
		"\2\u0149\u0152\58\35\2\u014a\u0152\7)\2\2\u014b\u014c\7\3\2\2\u014c\u014d"+
		"\5\66\34\2\u014d\u014e\7\4\2\2\u014e\u0152\3\2\2\2\u014f\u0150\7\24\2"+
		"\2\u0150\u0152\5\66\34\3\u0151\u0146\3\2\2\2\u0151\u0148\3\2\2\2\u0151"+
		"\u0149\3\2\2\2\u0151\u014a\3\2\2\2\u0151\u014b\3\2\2\2\u0151\u014f\3\2"+
		"\2\2\u0152\u015b\3\2\2\2\u0153\u0154\f\5\2\2\u0154\u0155\7\22\2\2\u0155"+
		"\u015a\5\66\34\6\u0156\u0157\f\4\2\2\u0157\u0158\7\23\2\2\u0158\u015a"+
		"\5\66\34\5\u0159\u0153\3\2\2\2\u0159\u0156\3\2\2\2\u015a\u015d\3\2\2\2"+
		"\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\67\3\2\2\2\u015d\u015b"+
		"\3\2\2\2\u015e\u015f\5:\36\2\u015f\u0160\7\25\2\2\u0160\u0161\5:\36\2"+
		"\u0161\u0177\3\2\2\2\u0162\u0163\5:\36\2\u0163\u0164\7\26\2\2\u0164\u0165"+
		"\5:\36\2\u0165\u0177\3\2\2\2\u0166\u0167\5:\36\2\u0167\u0168\7\27\2\2"+
		"\u0168\u0169\5:\36\2\u0169\u0177\3\2\2\2\u016a\u016b\5:\36\2\u016b\u016c"+
		"\7\30\2\2\u016c\u016d\5:\36\2\u016d\u0177\3\2\2\2\u016e\u016f\5:\36\2"+
		"\u016f\u0170\7\31\2\2\u0170\u0171\5:\36\2\u0171\u0177\3\2\2\2\u0172\u0173"+
		"\5:\36\2\u0173\u0174\7\32\2\2\u0174\u0175\5:\36\2\u0175\u0177\3\2\2\2"+
		"\u0176\u015e\3\2\2\2\u0176\u0162\3\2\2\2\u0176\u0166\3\2\2\2\u0176\u016a"+
		"\3\2\2\2\u0176\u016e\3\2\2\2\u0176\u0172\3\2\2\2\u01779\3\2\2\2\u0178"+
		"\u0179\b\36\1\2\u0179\u017a\7\33\2\2\u017a\u0188\5:\36\21\u017b\u017c"+
		"\7\3\2\2\u017c\u017d\5:\36\2\u017d\u017e\7\4\2\2\u017e\u0188\3\2\2\2\u017f"+
		"\u0188\7\'\2\2\u0180\u0188\7&\2\2\u0181\u0188\7+\2\2\u0182\u0188\7,\2"+
		"\2\u0183\u0188\7%\2\2\u0184\u0188\7(\2\2\u0185\u0188\5\32\16\2\u0186\u0188"+
		"\5<\37\2\u0187\u0178\3\2\2\2\u0187\u017b\3\2\2\2\u0187\u017f\3\2\2\2\u0187"+
		"\u0180\3\2\2\2\u0187\u0181\3\2\2\2\u0187\u0182\3\2\2\2\u0187\u0183\3\2"+
		"\2\2\u0187\u0184\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0186\3\2\2\2\u0188"+
		"\u019a\3\2\2\2\u0189\u018a\f\20\2\2\u018a\u018b\7\34\2\2\u018b\u0199\5"+
		":\36\21\u018c\u018d\f\17\2\2\u018d\u018e\7\35\2\2\u018e\u0199\5:\36\20"+
		"\u018f\u0190\f\16\2\2\u0190\u0191\7\33\2\2\u0191\u0199\5:\36\17\u0192"+
		"\u0193\f\r\2\2\u0193\u0194\7\36\2\2\u0194\u0199\5:\36\16\u0195\u0196\f"+
		"\f\2\2\u0196\u0197\7\37\2\2\u0197\u0199\5:\36\r\u0198\u0189\3\2\2\2\u0198"+
		"\u018c\3\2\2\2\u0198\u018f\3\2\2\2\u0198\u0192\3\2\2\2\u0198\u0195\3\2"+
		"\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		";\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019e\7%\2\2\u019e\u019f\7\13\2\2"+
		"\u019f\u01a0\5:\36\2\u01a0\u01a1\7\f\2\2\u01a1\u01b6\3\2\2\2\u01a2\u01a3"+
		"\7%\2\2\u01a3\u01a4\7\13\2\2\u01a4\u01a5\5:\36\2\u01a5\u01a6\7\f\2\2\u01a6"+
		"\u01a7\7\13\2\2\u01a7\u01a8\5:\36\2\u01a8\u01a9\7\f\2\2\u01a9\u01b6\3"+
		"\2\2\2\u01aa\u01ab\7%\2\2\u01ab\u01ac\7\13\2\2\u01ac\u01ad\5:\36\2\u01ad"+
		"\u01ae\7\f\2\2\u01ae\u01af\7\13\2\2\u01af\u01b0\5:\36\2\u01b0\u01b1\7"+
		"\f\2\2\u01b1\u01b2\7\13\2\2\u01b2\u01b3\5:\36\2\u01b3\u01b4\7\f\2\2\u01b4"+
		"\u01b6\3\2\2\2\u01b5\u019d\3\2\2\2\u01b5\u01a2\3\2\2\2\u01b5\u01aa\3\2"+
		"\2\2\u01b6=\3\2\2\2\37CLSV\\cfmw\u0085\u0093\u0098\u009e\u00a1\u00a9\u00c9"+
		"\u00f4\u010b\u012c\u0136\u0144\u0151\u0159\u015b\u0176\u0187\u0198\u019a"+
		"\u01b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}