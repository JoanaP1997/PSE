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
		public Token type;
		public Token id;
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(WlangParser.TYPE, 0); }
		public TerminalNode ID() { return getToken(WlangParser.ID, 0); }
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			((ArrayDeclarationContext)_localctx).type = match(TYPE);
			setState(170);
			dims();
			setState(171);
			((ArrayDeclarationContext)_localctx).id = match(ID);
			setState(172);
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
			setState(174);
			((ArrayDeclareAssignContext)_localctx).type = match(TYPE);
			setState(175);
			dims();
			setState(176);
			((ArrayDeclareAssignContext)_localctx).id = match(ID);
			setState(177);
			match(ASSIGN);
			setState(178);
			match(T__6);
			setState(179);
			filledArglist();
			setState(180);
			match(T__8);
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
		public TermContext value;
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(WlangParser.ASSIGN, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ArrayElementAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElementAssign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitArrayElementAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementAssignContext arrayElementAssign() throws RecognitionException {
		ArrayElementAssignContext _localctx = new ArrayElementAssignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_arrayElementAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			arrayAccess();
			setState(183);
			match(ASSIGN);
			setState(184);
			((ArrayElementAssignContext)_localctx).value = term(0);
			setState(185);
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
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new OneDimsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(T__9);
				setState(188);
				term(0);
				setState(189);
				match(T__10);
				}
				break;
			case 2:
				_localctx = new TwoDimsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(T__9);
				setState(192);
				term(0);
				setState(193);
				match(T__10);
				setState(194);
				match(T__9);
				setState(195);
				term(0);
				setState(196);
				match(T__10);
				}
				break;
			case 3:
				_localctx = new ThreeDimsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				match(T__9);
				setState(199);
				term(0);
				setState(200);
				match(T__10);
				setState(201);
				match(T__9);
				setState(202);
				term(0);
				setState(203);
				match(T__10);
				setState(204);
				match(T__9);
				setState(205);
				term(0);
				setState(206);
				match(T__10);
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
			setState(210);
			((PureAssignContext)_localctx).id = match(ID);
			setState(211);
			match(ASSIGN);
			setState(212);
			((PureAssignContext)_localctx).value = term(0);
			setState(213);
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
			setState(215);
			((DeclareAssignContext)_localctx).type = match(TYPE);
			setState(216);
			((DeclareAssignContext)_localctx).id = match(ID);
			setState(217);
			match(ASSIGN);
			setState(218);
			((DeclareAssignContext)_localctx).value = term(0);
			setState(219);
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
			setState(221);
			((DeclarationContext)_localctx).type = match(TYPE);
			setState(222);
			((DeclarationContext)_localctx).id = match(ID);
			setState(223);
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
			setState(225);
			match(T__11);
			setState(226);
			((ReturnStateContext)_localctx).returnvalue = term(0);
			setState(227);
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
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifState; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitIfState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStateContext ifState() throws RecognitionException {
		IfStateContext _localctx = new IfStateContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifState);
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(T__12);
				setState(230);
				match(T__0);
				setState(231);
				condition(0);
				setState(232);
				match(T__1);
				setState(233);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(T__12);
				setState(236);
				match(T__0);
				setState(237);
				condition(0);
				setState(238);
				match(T__1);
				setState(239);
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

	public static class IfelseStateContext extends ParserRuleContext {
		public IfStateContext ifState() {
			return getRuleContext(IfStateContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfelseStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelseState; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitIfelseState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfelseStateContext ifelseState() throws RecognitionException {
		IfelseStateContext _localctx = new IfelseStateContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ifelseState);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				ifState();
				setState(244);
				match(T__13);
				setState(245);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				ifState();
				setState(248);
				match(T__13);
				setState(249);
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

	public static class WhileStateContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileState; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitWhileState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStateContext whileState() throws RecognitionException {
		WhileStateContext _localctx = new WhileStateContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_whileState);
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(T__14);
				setState(254);
				match(T__0);
				setState(255);
				condition(0);
				setState(256);
				match(T__1);
				setState(257);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(T__14);
				setState(260);
				match(T__0);
				setState(261);
				condition(0);
				setState(262);
				match(T__1);
				setState(263);
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
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new IdConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(268);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new ArrayAccessConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(269);
				arrayAccess();
				}
				break;
			case 3:
				{
				_localctx = new ComparisonConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(270);
				comparison();
				}
				break;
			case 4:
				{
				_localctx = new ConstantConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(271);
				match(BOOLEANLITERAL);
				}
				break;
			case 5:
				{
				_localctx = new BracketConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(272);
				match(T__0);
				setState(273);
				condition(0);
				setState(274);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new NotConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(276);
				match(T__17);
				setState(277);
				condition(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(286);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new AndConditionContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(280);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(281);
						match(T__15);
						setState(282);
						condition(4);
						}
						break;
					case 2:
						{
						_localctx = new OrConditionContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(283);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(284);
						match(T__16);
						setState(285);
						condition(3);
						}
						break;
					}
					} 
				}
				setState(290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new LessCompContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				((LessCompContext)_localctx).left = term(0);
				setState(292);
				match(T__18);
				setState(293);
				((LessCompContext)_localctx).right = term(0);
				}
				break;
			case 2:
				_localctx = new LessEqualCompContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				((LessEqualCompContext)_localctx).left = term(0);
				setState(296);
				match(T__19);
				setState(297);
				((LessEqualCompContext)_localctx).right = term(0);
				}
				break;
			case 3:
				_localctx = new MoreCompContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				((MoreCompContext)_localctx).left = term(0);
				setState(300);
				match(T__20);
				setState(301);
				((MoreCompContext)_localctx).right = term(0);
				}
				break;
			case 4:
				_localctx = new MoreEqualCompContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(303);
				((MoreEqualCompContext)_localctx).left = term(0);
				setState(304);
				match(T__21);
				setState(305);
				((MoreEqualCompContext)_localctx).right = term(0);
				}
				break;
			case 5:
				_localctx = new EqualCompContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(307);
				((EqualCompContext)_localctx).left = term(0);
				setState(308);
				match(T__22);
				setState(309);
				((EqualCompContext)_localctx).right = term(0);
				}
				break;
			case 6:
				_localctx = new NotEqualCompContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(311);
				((NotEqualCompContext)_localctx).left = term(0);
				setState(312);
				match(T__23);
				setState(313);
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
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				_localctx = new NegativeTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(318);
				match(T__24);
				setState(319);
				((NegativeTermContext)_localctx).inner = term(15);
				}
				break;
			case 2:
				{
				_localctx = new BracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(320);
				match(T__0);
				setState(321);
				term(0);
				setState(322);
				match(T__1);
				}
				break;
			case 3:
				{
				_localctx = new FloatLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(324);
				match(FLOATLITERAL);
				}
				break;
			case 4:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(325);
				match(INTLITERAL);
				}
				break;
			case 5:
				{
				_localctx = new LongLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(326);
				match(LONGLITERAL);
				}
				break;
			case 6:
				{
				_localctx = new DoubleLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(327);
				match(DOUBLELITERAL);
				}
				break;
			case 7:
				{
				_localctx = new IDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(328);
				match(ID);
				}
				break;
			case 8:
				{
				_localctx = new CharLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(329);
				match(CHARLITERAL);
				}
				break;
			case 9:
				{
				_localctx = new FunctionCallInTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(330);
				funcCall();
				}
				break;
			case 10:
				{
				_localctx = new ArrayAccessInTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(331);
				arrayAccess();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(351);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(349);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new DivisionContext(new TermContext(_parentctx, _parentState));
						((DivisionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(334);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(335);
						match(T__25);
						setState(336);
						((DivisionContext)_localctx).right = term(15);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationContext(new TermContext(_parentctx, _parentState));
						((MultiplicationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(337);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(338);
						match(T__26);
						setState(339);
						((MultiplicationContext)_localctx).right = term(14);
						}
						break;
					case 3:
						{
						_localctx = new SubtractionContext(new TermContext(_parentctx, _parentState));
						((SubtractionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(340);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(341);
						match(T__24);
						setState(342);
						((SubtractionContext)_localctx).right = term(13);
						}
						break;
					case 4:
						{
						_localctx = new AdditionContext(new TermContext(_parentctx, _parentState));
						((AdditionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(343);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(344);
						match(T__27);
						setState(345);
						((AdditionContext)_localctx).right = term(12);
						}
						break;
					case 5:
						{
						_localctx = new ModuloContext(new TermContext(_parentctx, _parentState));
						((ModuloContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(346);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(347);
						match(T__28);
						setState(348);
						((ModuloContext)_localctx).right = term(11);
						}
						break;
					}
					} 
				}
				setState(353);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new OneDimArrayAccessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				((OneDimArrayAccessContext)_localctx).id = match(ID);
				setState(355);
				match(T__9);
				setState(356);
				((OneDimArrayAccessContext)_localctx).index = term(0);
				setState(357);
				match(T__10);
				}
				break;
			case 2:
				_localctx = new TwoDimArrayAccessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				((TwoDimArrayAccessContext)_localctx).id = match(ID);
				setState(360);
				match(T__9);
				setState(361);
				((TwoDimArrayAccessContext)_localctx).firstIndex = term(0);
				setState(362);
				match(T__10);
				setState(363);
				match(T__9);
				setState(364);
				((TwoDimArrayAccessContext)_localctx).secondIndex = term(0);
				setState(365);
				match(T__10);
				}
				break;
			case 3:
				_localctx = new ThreeDimArrayAccessContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				((ThreeDimArrayAccessContext)_localctx).id = match(ID);
				setState(368);
				match(T__9);
				setState(369);
				((ThreeDimArrayAccessContext)_localctx).firstIndex = term(0);
				setState(370);
				match(T__10);
				setState(371);
				match(T__9);
				setState(372);
				((ThreeDimArrayAccessContext)_localctx).secondtIndex = term(0);
				setState(373);
				match(T__10);
				setState(374);
				match(T__9);
				setState(375);
				((ThreeDimArrayAccessContext)_localctx).thirdIndex = term(0);
				setState(376);
				match(T__10);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u017f\4\2\t\2\4"+
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
		"\20\u00aa\n\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u00d3\n\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00f4\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u00fe\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u010c\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u0119\n\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34"+
		"\u0121\n\34\f\34\16\34\u0124\13\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u013e\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u014f\n\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0160\n\36"+
		"\f\36\16\36\u0163\13\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\5\37\u017d\n\37\3\37\2\4\66: \2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<\2\2\2\u0198\2>\3\2\2\2\4C\3\2\2\2\6V\3\2\2"+
		"\2\bf\3\2\2\2\nm\3\2\2\2\fo\3\2\2\2\16w\3\2\2\2\20y\3\2\2\2\22{\3\2\2"+
		"\2\24~\3\2\2\2\26\u0085\3\2\2\2\30\u0093\3\2\2\2\32\u00a1\3\2\2\2\34\u00a3"+
		"\3\2\2\2\36\u00a9\3\2\2\2 \u00ab\3\2\2\2\"\u00b0\3\2\2\2$\u00b8\3\2\2"+
		"\2&\u00d2\3\2\2\2(\u00d4\3\2\2\2*\u00d9\3\2\2\2,\u00df\3\2\2\2.\u00e3"+
		"\3\2\2\2\60\u00f3\3\2\2\2\62\u00fd\3\2\2\2\64\u010b\3\2\2\2\66\u0118\3"+
		"\2\2\28\u013d\3\2\2\2:\u014e\3\2\2\2<\u017c\3\2\2\2>?\5\4\3\2?\3\3\2\2"+
		"\2@B\5\22\n\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2"+
		"\2\2FG\5\24\13\2G\5\3\2\2\2HI\7$\2\2IJ\7%\2\2JL\7\3\2\2KM\5\n\6\2LK\3"+
		"\2\2\2LM\3\2\2\2MN\3\2\2\2NW\7\4\2\2OP\7\5\2\2PQ\7%\2\2QS\7\3\2\2RT\5"+
		"\n\6\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UW\7\4\2\2VH\3\2\2\2VO\3\2\2\2W\7"+
		"\3\2\2\2XY\7$\2\2YZ\7\6\2\2Z\\\7\3\2\2[]\5\n\6\2\\[\3\2\2\2\\]\3\2\2\2"+
		"]^\3\2\2\2^g\7\4\2\2_`\7\5\2\2`a\7\6\2\2ac\7\3\2\2bd\5\n\6\2cb\3\2\2\2"+
		"cd\3\2\2\2de\3\2\2\2eg\7\4\2\2fX\3\2\2\2f_\3\2\2\2g\t\3\2\2\2hi\5\f\7"+
		"\2ij\7\7\2\2jk\5\n\6\2kn\3\2\2\2ln\5\f\7\2mh\3\2\2\2ml\3\2\2\2n\13\3\2"+
		"\2\2op\7$\2\2pq\7%\2\2q\r\3\2\2\2rs\5\20\t\2st\7\7\2\2tu\5\16\b\2ux\3"+
		"\2\2\2vx\5\20\t\2wr\3\2\2\2wv\3\2\2\2x\17\3\2\2\2yz\5:\36\2z\21\3\2\2"+
		"\2{|\5\6\4\2|}\5\34\17\2}\23\3\2\2\2~\177\5\b\5\2\177\u0080\5\34\17\2"+
		"\u0080\25\3\2\2\2\u0081\u0082\5\30\r\2\u0082\u0083\5\26\f\2\u0083\u0086"+
		"\3\2\2\2\u0084\u0086\5\30\r\2\u0085\u0081\3\2\2\2\u0085\u0084\3\2\2\2"+
		"\u0086\27\3\2\2\2\u0087\u0094\5\60\31\2\u0088\u0094\5\62\32\2\u0089\u0094"+
		"\5\64\33\2\u008a\u0094\5\36\20\2\u008b\u0094\5 \21\2\u008c\u0094\5\"\22"+
		"\2\u008d\u0094\5$\23\2\u008e\u0094\5,\27\2\u008f\u0090\5\32\16\2\u0090"+
		"\u0091\7\b\2\2\u0091\u0094\3\2\2\2\u0092\u0094\5.\30\2\u0093\u0087\3\2"+
		"\2\2\u0093\u0088\3\2\2\2\u0093\u0089\3\2\2\2\u0093\u008a\3\2\2\2\u0093"+
		"\u008b\3\2\2\2\u0093\u008c\3\2\2\2\u0093\u008d\3\2\2\2\u0093\u008e\3\2"+
		"\2\2\u0093\u008f\3\2\2\2\u0093\u0092\3\2\2\2\u0094\31\3\2\2\2\u0095\u0096"+
		"\7%\2\2\u0096\u0098\7\3\2\2\u0097\u0099\5\16\b\2\u0098\u0097\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u00a2\7\4\2\2\u009b\u009c\7\6"+
		"\2\2\u009c\u009e\7\3\2\2\u009d\u009f\5\16\b\2\u009e\u009d\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\7\4\2\2\u00a1\u0095\3\2"+
		"\2\2\u00a1\u009b\3\2\2\2\u00a2\33\3\2\2\2\u00a3\u00a4\7\t\2\2\u00a4\u00a5"+
		"\5\26\f\2\u00a5\u00a6\7\n\2\2\u00a6\35\3\2\2\2\u00a7\u00aa\5*\26\2\u00a8"+
		"\u00aa\5(\25\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\37\3\2\2"+
		"\2\u00ab\u00ac\7$\2\2\u00ac\u00ad\5&\24\2\u00ad\u00ae\7%\2\2\u00ae\u00af"+
		"\7\b\2\2\u00af!\3\2\2\2\u00b0\u00b1\7$\2\2\u00b1\u00b2\5&\24\2\u00b2\u00b3"+
		"\7%\2\2\u00b3\u00b4\7-\2\2\u00b4\u00b5\7\t\2\2\u00b5\u00b6\5\16\b\2\u00b6"+
		"\u00b7\7\13\2\2\u00b7#\3\2\2\2\u00b8\u00b9\5<\37\2\u00b9\u00ba\7-\2\2"+
		"\u00ba\u00bb\5:\36\2\u00bb\u00bc\7\b\2\2\u00bc%\3\2\2\2\u00bd\u00be\7"+
		"\f\2\2\u00be\u00bf\5:\36\2\u00bf\u00c0\7\r\2\2\u00c0\u00d3\3\2\2\2\u00c1"+
		"\u00c2\7\f\2\2\u00c2\u00c3\5:\36\2\u00c3\u00c4\7\r\2\2\u00c4\u00c5\7\f"+
		"\2\2\u00c5\u00c6\5:\36\2\u00c6\u00c7\7\r\2\2\u00c7\u00d3\3\2\2\2\u00c8"+
		"\u00c9\7\f\2\2\u00c9\u00ca\5:\36\2\u00ca\u00cb\7\r\2\2\u00cb\u00cc\7\f"+
		"\2\2\u00cc\u00cd\5:\36\2\u00cd\u00ce\7\r\2\2\u00ce\u00cf\7\f\2\2\u00cf"+
		"\u00d0\5:\36\2\u00d0\u00d1\7\r\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00bd\3\2"+
		"\2\2\u00d2\u00c1\3\2\2\2\u00d2\u00c8\3\2\2\2\u00d3\'\3\2\2\2\u00d4\u00d5"+
		"\7%\2\2\u00d5\u00d6\7-\2\2\u00d6\u00d7\5:\36\2\u00d7\u00d8\7\b\2\2\u00d8"+
		")\3\2\2\2\u00d9\u00da\7$\2\2\u00da\u00db\7%\2\2\u00db\u00dc\7-\2\2\u00dc"+
		"\u00dd\5:\36\2\u00dd\u00de\7\b\2\2\u00de+\3\2\2\2\u00df\u00e0\7$\2\2\u00e0"+
		"\u00e1\7%\2\2\u00e1\u00e2\7\b\2\2\u00e2-\3\2\2\2\u00e3\u00e4\7\16\2\2"+
		"\u00e4\u00e5\5:\36\2\u00e5\u00e6\7\b\2\2\u00e6/\3\2\2\2\u00e7\u00e8\7"+
		"\17\2\2\u00e8\u00e9\7\3\2\2\u00e9\u00ea\5\66\34\2\u00ea\u00eb\7\4\2\2"+
		"\u00eb\u00ec\5\34\17\2\u00ec\u00f4\3\2\2\2\u00ed\u00ee\7\17\2\2\u00ee"+
		"\u00ef\7\3\2\2\u00ef\u00f0\5\66\34\2\u00f0\u00f1\7\4\2\2\u00f1\u00f2\5"+
		"\30\r\2\u00f2\u00f4\3\2\2\2\u00f3\u00e7\3\2\2\2\u00f3\u00ed\3\2\2\2\u00f4"+
		"\61\3\2\2\2\u00f5\u00f6\5\60\31\2\u00f6\u00f7\7\20\2\2\u00f7\u00f8\5\34"+
		"\17\2\u00f8\u00fe\3\2\2\2\u00f9\u00fa\5\60\31\2\u00fa\u00fb\7\20\2\2\u00fb"+
		"\u00fc\5\30\r\2\u00fc\u00fe\3\2\2\2\u00fd\u00f5\3\2\2\2\u00fd\u00f9\3"+
		"\2\2\2\u00fe\63\3\2\2\2\u00ff\u0100\7\21\2\2\u0100\u0101\7\3\2\2\u0101"+
		"\u0102\5\66\34\2\u0102\u0103\7\4\2\2\u0103\u0104\5\34\17\2\u0104\u010c"+
		"\3\2\2\2\u0105\u0106\7\21\2\2\u0106\u0107\7\3\2\2\u0107\u0108\5\66\34"+
		"\2\u0108\u0109\7\4\2\2\u0109\u010a\5\30\r\2\u010a\u010c\3\2\2\2\u010b"+
		"\u00ff\3\2\2\2\u010b\u0105\3\2\2\2\u010c\65\3\2\2\2\u010d\u010e\b\34\1"+
		"\2\u010e\u0119\7%\2\2\u010f\u0119\5<\37\2\u0110\u0119\58\35\2\u0111\u0119"+
		"\7)\2\2\u0112\u0113\7\3\2\2\u0113\u0114\5\66\34\2\u0114\u0115\7\4\2\2"+
		"\u0115\u0119\3\2\2\2\u0116\u0117\7\24\2\2\u0117\u0119\5\66\34\3\u0118"+
		"\u010d\3\2\2\2\u0118\u010f\3\2\2\2\u0118\u0110\3\2\2\2\u0118\u0111\3\2"+
		"\2\2\u0118\u0112\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u0122\3\2\2\2\u011a"+
		"\u011b\f\5\2\2\u011b\u011c\7\22\2\2\u011c\u0121\5\66\34\6\u011d\u011e"+
		"\f\4\2\2\u011e\u011f\7\23\2\2\u011f\u0121\5\66\34\5\u0120\u011a\3\2\2"+
		"\2\u0120\u011d\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123"+
		"\3\2\2\2\u0123\67\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\5:\36\2\u0126"+
		"\u0127\7\25\2\2\u0127\u0128\5:\36\2\u0128\u013e\3\2\2\2\u0129\u012a\5"+
		":\36\2\u012a\u012b\7\26\2\2\u012b\u012c\5:\36\2\u012c\u013e\3\2\2\2\u012d"+
		"\u012e\5:\36\2\u012e\u012f\7\27\2\2\u012f\u0130\5:\36\2\u0130\u013e\3"+
		"\2\2\2\u0131\u0132\5:\36\2\u0132\u0133\7\30\2\2\u0133\u0134\5:\36\2\u0134"+
		"\u013e\3\2\2\2\u0135\u0136\5:\36\2\u0136\u0137\7\31\2\2\u0137\u0138\5"+
		":\36\2\u0138\u013e\3\2\2\2\u0139\u013a\5:\36\2\u013a\u013b\7\32\2\2\u013b"+
		"\u013c\5:\36\2\u013c\u013e\3\2\2\2\u013d\u0125\3\2\2\2\u013d\u0129\3\2"+
		"\2\2\u013d\u012d\3\2\2\2\u013d\u0131\3\2\2\2\u013d\u0135\3\2\2\2\u013d"+
		"\u0139\3\2\2\2\u013e9\3\2\2\2\u013f\u0140\b\36\1\2\u0140\u0141\7\33\2"+
		"\2\u0141\u014f\5:\36\21\u0142\u0143\7\3\2\2\u0143\u0144\5:\36\2\u0144"+
		"\u0145\7\4\2\2\u0145\u014f\3\2\2\2\u0146\u014f\7\'\2\2\u0147\u014f\7&"+
		"\2\2\u0148\u014f\7+\2\2\u0149\u014f\7,\2\2\u014a\u014f\7%\2\2\u014b\u014f"+
		"\7(\2\2\u014c\u014f\5\32\16\2\u014d\u014f\5<\37\2\u014e\u013f\3\2\2\2"+
		"\u014e\u0142\3\2\2\2\u014e\u0146\3\2\2\2\u014e\u0147\3\2\2\2\u014e\u0148"+
		"\3\2\2\2\u014e\u0149\3\2\2\2\u014e\u014a\3\2\2\2\u014e\u014b\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f\u0161\3\2\2\2\u0150\u0151\f\20"+
		"\2\2\u0151\u0152\7\34\2\2\u0152\u0160\5:\36\21\u0153\u0154\f\17\2\2\u0154"+
		"\u0155\7\35\2\2\u0155\u0160\5:\36\20\u0156\u0157\f\16\2\2\u0157\u0158"+
		"\7\33\2\2\u0158\u0160\5:\36\17\u0159\u015a\f\r\2\2\u015a\u015b\7\36\2"+
		"\2\u015b\u0160\5:\36\16\u015c\u015d\f\f\2\2\u015d\u015e\7\37\2\2\u015e"+
		"\u0160\5:\36\r\u015f\u0150\3\2\2\2\u015f\u0153\3\2\2\2\u015f\u0156\3\2"+
		"\2\2\u015f\u0159\3\2\2\2\u015f\u015c\3\2\2\2\u0160\u0163\3\2\2\2\u0161"+
		"\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162;\3\2\2\2\u0163\u0161\3\2\2\2"+
		"\u0164\u0165\7%\2\2\u0165\u0166\7\f\2\2\u0166\u0167\5:\36\2\u0167\u0168"+
		"\7\r\2\2\u0168\u017d\3\2\2\2\u0169\u016a\7%\2\2\u016a\u016b\7\f\2\2\u016b"+
		"\u016c\5:\36\2\u016c\u016d\7\r\2\2\u016d\u016e\7\f\2\2\u016e\u016f\5:"+
		"\36\2\u016f\u0170\7\r\2\2\u0170\u017d\3\2\2\2\u0171\u0172\7%\2\2\u0172"+
		"\u0173\7\f\2\2\u0173\u0174\5:\36\2\u0174\u0175\7\r\2\2\u0175\u0176\7\f"+
		"\2\2\u0176\u0177\5:\36\2\u0177\u0178\7\r\2\2\u0178\u0179\7\f\2\2\u0179"+
		"\u017a\5:\36\2\u017a\u017b\7\r\2\2\u017b\u017d\3\2\2\2\u017c\u0164\3\2"+
		"\2\2\u017c\u0169\3\2\2\2\u017c\u0171\3\2\2\2\u017d=\3\2\2\2\35CLSV\\c"+
		"fmw\u0085\u0093\u0098\u009e\u00a1\u00a9\u00d2\u00f3\u00fd\u010b\u0118"+
		"\u0120\u0122\u013d\u014e\u015f\u0161\u017c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}