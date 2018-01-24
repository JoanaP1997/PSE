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
		RULE_pureAssign = 19, RULE_declareAssign = 20, RULE_declaration = 21, 
		RULE_returnState = 22, RULE_ifState = 23, RULE_ifelseState = 24, RULE_whileState = 25, 
		RULE_condition = 26, RULE_comparison = 27, RULE_term = 28, RULE_arrayAccess = 29;
	public static final String[] ruleNames = {
		"webppterm", "program", "routineHead", "mainHead", "arglist", "argument", 
		"filledArglist", "filledArgument", "routine", "mainRoutine", "statements", 
		"statement", "funcCall", "block", "assignment", "arrayDeclaration", "arrayDeclareAssign", 
		"arrayElementAssign", "dims", "pureAssign", "declareAssign", "declaration", 
		"returnState", "ifState", "ifelseState", "whileState", "condition", "comparison", 
		"term", "arrayAccess"
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
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				condition(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
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
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(64);
					routine();
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(70);
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
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				_localctx = new FunctionHeadContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				((FunctionHeadContext)_localctx).returntype = match(TYPE);
				setState(73);
				((FunctionHeadContext)_localctx).id = match(ID);
				setState(74);
				match(T__0);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(75);
					((FunctionHeadContext)_localctx).args = arglist();
					}
				}

				setState(78);
				match(T__1);
				}
				break;
			case T__2:
				_localctx = new ProcedureHeadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(T__2);
				setState(80);
				((ProcedureHeadContext)_localctx).id = match(ID);
				setState(81);
				match(T__0);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(82);
					((ProcedureHeadContext)_localctx).args = arglist();
					}
				}

				setState(85);
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
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				_localctx = new MainFunctionHeadContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				((MainFunctionHeadContext)_localctx).returntype = match(TYPE);
				setState(89);
				match(T__3);
				setState(90);
				match(T__0);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(91);
					((MainFunctionHeadContext)_localctx).args = arglist();
					}
				}

				setState(94);
				match(T__1);
				}
				break;
			case T__2:
				_localctx = new MainProcedureHeadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(T__2);
				setState(96);
				match(T__3);
				setState(97);
				match(T__0);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE) {
					{
					setState(98);
					((MainProcedureHeadContext)_localctx).args = arglist();
					}
				}

				setState(101);
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
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				argument();
				setState(105);
				match(T__4);
				setState(106);
				arglist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
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
			setState(111);
			((ArgumentContext)_localctx).type = match(TYPE);
			setState(112);
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
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				filledArgument();
				setState(115);
				match(T__4);
				setState(116);
				filledArglist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
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
			setState(121);
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
			setState(123);
			routineHead();
			setState(124);
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
			setState(126);
			mainHead();
			setState(127);
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
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				statement();
				setState(130);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
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
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				ifState();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				ifelseState();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				whileState();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				arrayDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(140);
				arrayDeclareAssign();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(141);
				arrayElementAssign();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(142);
				declaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(143);
				funcCall();
				setState(144);
				match(T__5);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(146);
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
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				((FuncCallContext)_localctx).functionname = match(ID);
				setState(150);
				match(T__0);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__24) | (1L << BOOLEANLITERAL) | (1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << CHARLITERAL) | (1L << LONGLITERAL) | (1L << DOUBLELITERAL) | (1L << ID) | (1L << REL_ID))) != 0)) {
					{
					setState(151);
					((FuncCallContext)_localctx).args = filledArglist();
					}
				}

				setState(154);
				match(T__1);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				((FuncCallContext)_localctx).functionname = match(T__3);
				setState(156);
				match(T__0);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__24) | (1L << BOOLEANLITERAL) | (1L << INTLITERAL) | (1L << FLOATLITERAL) | (1L << CHARLITERAL) | (1L << LONGLITERAL) | (1L << DOUBLELITERAL) | (1L << ID) | (1L << REL_ID))) != 0)) {
					{
					setState(157);
					((FuncCallContext)_localctx).args = filledArglist();
					}
				}

				setState(160);
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
			setState(163);
			match(T__6);
			setState(164);
			statements();
			setState(165);
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
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				declareAssign();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
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
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new ArrayDeclarationOneDimContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				((ArrayDeclarationOneDimContext)_localctx).type = match(TYPE);
				setState(172);
				match(T__8);
				setState(173);
				((ArrayDeclarationOneDimContext)_localctx).index = term(0);
				setState(174);
				match(T__9);
				setState(175);
				((ArrayDeclarationOneDimContext)_localctx).id = match(ID);
				setState(176);
				match(T__5);
				}
				break;
			case 2:
				_localctx = new ArrayDeclarationTwoDimContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				((ArrayDeclarationTwoDimContext)_localctx).type = match(TYPE);
				setState(179);
				match(T__8);
				setState(180);
				((ArrayDeclarationTwoDimContext)_localctx).firstIndex = term(0);
				setState(181);
				match(T__9);
				setState(182);
				match(T__8);
				setState(183);
				((ArrayDeclarationTwoDimContext)_localctx).secondIndex = term(0);
				setState(184);
				match(T__9);
				setState(185);
				((ArrayDeclarationTwoDimContext)_localctx).id = match(ID);
				setState(186);
				match(T__5);
				}
				break;
			case 3:
				_localctx = new ArrayDeclarationThreeDimContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				((ArrayDeclarationThreeDimContext)_localctx).type = match(TYPE);
				setState(189);
				match(T__8);
				setState(190);
				((ArrayDeclarationThreeDimContext)_localctx).firstIndex = term(0);
				setState(191);
				match(T__9);
				setState(192);
				match(T__8);
				setState(193);
				((ArrayDeclarationThreeDimContext)_localctx).secondIndex = term(0);
				setState(194);
				match(T__9);
				setState(195);
				match(T__8);
				setState(196);
				((ArrayDeclarationThreeDimContext)_localctx).thirdIndex = term(0);
				setState(197);
				match(T__9);
				setState(198);
				((ArrayDeclarationThreeDimContext)_localctx).id = match(ID);
				setState(199);
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
			setState(203);
			((ArrayDeclareAssignContext)_localctx).type = match(TYPE);
			setState(204);
			dims();
			setState(205);
			((ArrayDeclareAssignContext)_localctx).id = match(ID);
			setState(206);
			match(ASSIGN);
			setState(207);
			match(T__6);
			setState(208);
			filledArglist();
			setState(209);
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
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new ArrayElementAssignOneDimContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				((ArrayElementAssignOneDimContext)_localctx).id = match(ID);
				setState(212);
				match(T__8);
				setState(213);
				((ArrayElementAssignOneDimContext)_localctx).index = term(0);
				setState(214);
				match(T__9);
				setState(215);
				match(ASSIGN);
				setState(216);
				((ArrayElementAssignOneDimContext)_localctx).value = term(0);
				setState(217);
				match(T__5);
				}
				break;
			case 2:
				_localctx = new ArrayElementAssignTwoDimContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				((ArrayElementAssignTwoDimContext)_localctx).id = match(ID);
				setState(220);
				match(T__8);
				setState(221);
				((ArrayElementAssignTwoDimContext)_localctx).firstIndex = term(0);
				setState(222);
				match(T__9);
				setState(223);
				match(T__8);
				setState(224);
				((ArrayElementAssignTwoDimContext)_localctx).secondIndex = term(0);
				setState(225);
				match(T__9);
				setState(226);
				match(ASSIGN);
				setState(227);
				((ArrayElementAssignTwoDimContext)_localctx).value = term(0);
				setState(228);
				match(T__5);
				}
				break;
			case 3:
				_localctx = new ArrayElementAssignThreeDimContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				((ArrayElementAssignThreeDimContext)_localctx).id = match(ID);
				setState(231);
				match(T__8);
				setState(232);
				((ArrayElementAssignThreeDimContext)_localctx).firstIndex = term(0);
				setState(233);
				match(T__9);
				setState(234);
				match(T__8);
				setState(235);
				((ArrayElementAssignThreeDimContext)_localctx).secondIndex = term(0);
				setState(236);
				match(T__9);
				setState(237);
				match(T__8);
				setState(238);
				((ArrayElementAssignThreeDimContext)_localctx).thirdIndex = term(0);
				setState(239);
				match(T__9);
				setState(240);
				match(ASSIGN);
				setState(241);
				((ArrayElementAssignThreeDimContext)_localctx).value = term(0);
				setState(242);
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
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new OneDimsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(T__8);
				setState(247);
				term(0);
				setState(248);
				match(T__9);
				}
				break;
			case 2:
				_localctx = new TwoDimsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(T__8);
				setState(251);
				term(0);
				setState(252);
				match(T__9);
				setState(253);
				match(T__8);
				setState(254);
				term(0);
				setState(255);
				match(T__9);
				}
				break;
			case 3:
				_localctx = new ThreeDimsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				match(T__8);
				setState(258);
				term(0);
				setState(259);
				match(T__9);
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
			setState(269);
			((PureAssignContext)_localctx).id = match(ID);
			setState(270);
			match(ASSIGN);
			setState(271);
			((PureAssignContext)_localctx).value = term(0);
			setState(272);
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
			setState(274);
			((DeclareAssignContext)_localctx).type = match(TYPE);
			setState(275);
			((DeclareAssignContext)_localctx).id = match(ID);
			setState(276);
			match(ASSIGN);
			setState(277);
			((DeclareAssignContext)_localctx).value = term(0);
			setState(278);
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
			setState(280);
			((DeclarationContext)_localctx).type = match(TYPE);
			setState(281);
			((DeclarationContext)_localctx).id = match(ID);
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
			setState(284);
			match(T__11);
			setState(285);
			((ReturnStateContext)_localctx).returnvalue = term(0);
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
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new IfWithBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(T__12);
				setState(289);
				match(T__0);
				setState(290);
				condition(0);
				setState(291);
				match(T__1);
				setState(292);
				((IfWithBlockContext)_localctx).content = block();
				}
				break;
			case 2:
				_localctx = new IfWithSingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match(T__12);
				setState(295);
				match(T__0);
				setState(296);
				condition(0);
				setState(297);
				match(T__1);
				setState(298);
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
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new IfElseWithBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				((IfElseWithBlockContext)_localctx).ifPart = ifState();
				setState(303);
				match(T__13);
				setState(304);
				((IfElseWithBlockContext)_localctx).content = block();
				}
				break;
			case 2:
				_localctx = new IfElseWithSingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				((IfElseWithSingleContext)_localctx).ifPart = ifState();
				setState(307);
				match(T__13);
				setState(308);
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
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new WhileWithBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				match(T__14);
				setState(313);
				match(T__0);
				setState(314);
				condition(0);
				setState(315);
				match(T__1);
				setState(316);
				((WhileWithBlockContext)_localctx).content = block();
				}
				break;
			case 2:
				_localctx = new WhileWithSingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				match(T__14);
				setState(319);
				match(T__0);
				setState(320);
				condition(0);
				setState(321);
				match(T__1);
				setState(322);
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				_localctx = new IdConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(327);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new ConstantConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(328);
				match(BOOLEANLITERAL);
				}
				break;
			case 3:
				{
				_localctx = new NotConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(329);
				match(T__15);
				setState(330);
				((NotConditionContext)_localctx).inner = condition(7);
				}
				break;
			case 4:
				{
				_localctx = new RelIdConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(331);
				match(REL_ID);
				}
				break;
			case 5:
				{
				_localctx = new ArrayAccessConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(332);
				arrayAccess();
				}
				break;
			case 6:
				{
				_localctx = new ComparisonConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(333);
				comparison();
				}
				break;
			case 7:
				{
				_localctx = new BracketConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(334);
				match(T__0);
				setState(335);
				((BracketConditionContext)_localctx).inner = condition(0);
				setState(336);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(346);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new AndConditionContext(new ConditionContext(_parentctx, _parentState));
						((AndConditionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(340);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(341);
						match(T__16);
						setState(342);
						((AndConditionContext)_localctx).right = condition(3);
						}
						break;
					case 2:
						{
						_localctx = new OrConditionContext(new ConditionContext(_parentctx, _parentState));
						((OrConditionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(343);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(344);
						match(T__17);
						setState(345);
						((OrConditionContext)_localctx).right = condition(2);
						}
						break;
					}
					} 
				}
				setState(350);
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
		enterRule(_localctx, 54, RULE_comparison);
		try {
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new LessCompContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				((LessCompContext)_localctx).left = term(0);
				setState(352);
				match(T__18);
				setState(353);
				((LessCompContext)_localctx).right = term(0);
				}
				break;
			case 2:
				_localctx = new LessEqualCompContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				((LessEqualCompContext)_localctx).left = term(0);
				setState(356);
				match(T__19);
				setState(357);
				((LessEqualCompContext)_localctx).right = term(0);
				}
				break;
			case 3:
				_localctx = new MoreCompContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				((MoreCompContext)_localctx).left = term(0);
				setState(360);
				match(T__20);
				setState(361);
				((MoreCompContext)_localctx).right = term(0);
				}
				break;
			case 4:
				_localctx = new MoreEqualCompContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(363);
				((MoreEqualCompContext)_localctx).left = term(0);
				setState(364);
				match(T__21);
				setState(365);
				((MoreEqualCompContext)_localctx).right = term(0);
				}
				break;
			case 5:
				_localctx = new EqualCompContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(367);
				((EqualCompContext)_localctx).left = term(0);
				setState(368);
				match(T__22);
				setState(369);
				((EqualCompContext)_localctx).right = term(0);
				}
				break;
			case 6:
				_localctx = new NotEqualCompContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(371);
				((NotEqualCompContext)_localctx).left = term(0);
				setState(372);
				match(T__23);
				setState(373);
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
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				_localctx = new NegativeTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(378);
				match(T__24);
				setState(379);
				((NegativeTermContext)_localctx).inner = term(17);
				}
				break;
			case 2:
				{
				_localctx = new BracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(380);
				match(T__0);
				setState(381);
				((BracketsContext)_localctx).inner = term(0);
				setState(382);
				match(T__1);
				}
				break;
			case 3:
				{
				_localctx = new FloatLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(384);
				match(FLOATLITERAL);
				}
				break;
			case 4:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(385);
				match(INTLITERAL);
				}
				break;
			case 5:
				{
				_localctx = new LongLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(386);
				match(LONGLITERAL);
				}
				break;
			case 6:
				{
				_localctx = new DoubleLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(387);
				match(DOUBLELITERAL);
				}
				break;
			case 7:
				{
				_localctx = new BooleanLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(388);
				match(BOOLEANLITERAL);
				}
				break;
			case 8:
				{
				_localctx = new CharLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(389);
				match(CHARLITERAL);
				}
				break;
			case 9:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(390);
				match(ID);
				}
				break;
			case 10:
				{
				_localctx = new RelIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(391);
				match(REL_ID);
				}
				break;
			case 11:
				{
				_localctx = new FunctionCallInTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(392);
				funcCall();
				}
				break;
			case 12:
				{
				_localctx = new ArrayAccessInTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(393);
				arrayAccess();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(413);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(411);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new DivisionContext(new TermContext(_parentctx, _parentState));
						((DivisionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(396);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(397);
						match(T__25);
						setState(398);
						((DivisionContext)_localctx).right = term(17);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationContext(new TermContext(_parentctx, _parentState));
						((MultiplicationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(399);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(400);
						match(T__26);
						setState(401);
						((MultiplicationContext)_localctx).right = term(16);
						}
						break;
					case 3:
						{
						_localctx = new SubtractionContext(new TermContext(_parentctx, _parentState));
						((SubtractionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(402);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(403);
						match(T__24);
						setState(404);
						((SubtractionContext)_localctx).right = term(15);
						}
						break;
					case 4:
						{
						_localctx = new AdditionContext(new TermContext(_parentctx, _parentState));
						((AdditionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(405);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(406);
						match(T__27);
						setState(407);
						((AdditionContext)_localctx).right = term(14);
						}
						break;
					case 5:
						{
						_localctx = new ModuloContext(new TermContext(_parentctx, _parentState));
						((ModuloContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(408);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(409);
						match(T__28);
						setState(410);
						((ModuloContext)_localctx).right = term(13);
						}
						break;
					}
					} 
				}
				setState(415);
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
		enterRule(_localctx, 58, RULE_arrayAccess);
		try {
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new OneDimArrayAccessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				((OneDimArrayAccessContext)_localctx).id = match(ID);
				setState(417);
				match(T__8);
				setState(418);
				((OneDimArrayAccessContext)_localctx).index = term(0);
				setState(419);
				match(T__9);
				}
				break;
			case 2:
				_localctx = new TwoDimArrayAccessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				((TwoDimArrayAccessContext)_localctx).id = match(ID);
				setState(422);
				match(T__8);
				setState(423);
				((TwoDimArrayAccessContext)_localctx).firstIndex = term(0);
				setState(424);
				match(T__9);
				setState(425);
				match(T__8);
				setState(426);
				((TwoDimArrayAccessContext)_localctx).secondIndex = term(0);
				setState(427);
				match(T__9);
				}
				break;
			case 3:
				_localctx = new ThreeDimArrayAccessContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(429);
				((ThreeDimArrayAccessContext)_localctx).id = match(ID);
				setState(430);
				match(T__8);
				setState(431);
				((ThreeDimArrayAccessContext)_localctx).firstIndex = term(0);
				setState(432);
				match(T__9);
				setState(433);
				match(T__8);
				setState(434);
				((ThreeDimArrayAccessContext)_localctx).secondIndex = term(0);
				setState(435);
				match(T__9);
				setState(436);
				match(T__8);
				setState(437);
				((ThreeDimArrayAccessContext)_localctx).thirdIndex = term(0);
				setState(438);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u01bd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\5"+
		"\2A\n\2\3\3\7\3D\n\3\f\3\16\3G\13\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4O\n\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4V\n\4\3\4\5\4Y\n\4\3\5\3\5\3\5\3\5\5\5_\n\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5f\n\5\3\5\5\5i\n\5\3\6\3\6\3\6\3\6\3\6\5\6p\n\6\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bz\n\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\5\f\u0088\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u0096\n\r\3\16\3\16\3\16\5\16\u009b\n\16\3\16\3\16"+
		"\3\16\3\16\5\16\u00a1\n\16\3\16\5\16\u00a4\n\16\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\5\20\u00ac\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00cc\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f7\n\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u010e\n\24\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u012f\n\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0139\n\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0147\n\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0155\n\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\7\34\u015d\n\34\f\34\16\34\u0160\13\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u017a\n\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\5\36\u018d\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\7\36\u019e\n\36\f\36\16\36\u01a1\13\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01bb\n\37\3\37\2\4"+
		"\66: \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2"+
		"\2\2\u01de\2@\3\2\2\2\4E\3\2\2\2\6X\3\2\2\2\bh\3\2\2\2\no\3\2\2\2\fq\3"+
		"\2\2\2\16y\3\2\2\2\20{\3\2\2\2\22}\3\2\2\2\24\u0080\3\2\2\2\26\u0087\3"+
		"\2\2\2\30\u0095\3\2\2\2\32\u00a3\3\2\2\2\34\u00a5\3\2\2\2\36\u00ab\3\2"+
		"\2\2 \u00cb\3\2\2\2\"\u00cd\3\2\2\2$\u00f6\3\2\2\2&\u010d\3\2\2\2(\u010f"+
		"\3\2\2\2*\u0114\3\2\2\2,\u011a\3\2\2\2.\u011e\3\2\2\2\60\u012e\3\2\2\2"+
		"\62\u0138\3\2\2\2\64\u0146\3\2\2\2\66\u0154\3\2\2\28\u0179\3\2\2\2:\u018c"+
		"\3\2\2\2<\u01ba\3\2\2\2>A\5\66\34\2?A\5:\36\2@>\3\2\2\2@?\3\2\2\2A\3\3"+
		"\2\2\2BD\5\22\n\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE"+
		"\3\2\2\2HI\5\24\13\2I\5\3\2\2\2JK\7$\2\2KL\7-\2\2LN\7\3\2\2MO\5\n\6\2"+
		"NM\3\2\2\2NO\3\2\2\2OP\3\2\2\2PY\7\4\2\2QR\7\5\2\2RS\7-\2\2SU\7\3\2\2"+
		"TV\5\n\6\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WY\7\4\2\2XJ\3\2\2\2XQ\3\2\2\2"+
		"Y\7\3\2\2\2Z[\7$\2\2[\\\7\6\2\2\\^\7\3\2\2]_\5\n\6\2^]\3\2\2\2^_\3\2\2"+
		"\2_`\3\2\2\2`i\7\4\2\2ab\7\5\2\2bc\7\6\2\2ce\7\3\2\2df\5\n\6\2ed\3\2\2"+
		"\2ef\3\2\2\2fg\3\2\2\2gi\7\4\2\2hZ\3\2\2\2ha\3\2\2\2i\t\3\2\2\2jk\5\f"+
		"\7\2kl\7\7\2\2lm\5\n\6\2mp\3\2\2\2np\5\f\7\2oj\3\2\2\2on\3\2\2\2p\13\3"+
		"\2\2\2qr\7$\2\2rs\7-\2\2s\r\3\2\2\2tu\5\20\t\2uv\7\7\2\2vw\5\16\b\2wz"+
		"\3\2\2\2xz\5\20\t\2yt\3\2\2\2yx\3\2\2\2z\17\3\2\2\2{|\5:\36\2|\21\3\2"+
		"\2\2}~\5\6\4\2~\177\5\34\17\2\177\23\3\2\2\2\u0080\u0081\5\b\5\2\u0081"+
		"\u0082\5\34\17\2\u0082\25\3\2\2\2\u0083\u0084\5\30\r\2\u0084\u0085\5\26"+
		"\f\2\u0085\u0088\3\2\2\2\u0086\u0088\5\30\r\2\u0087\u0083\3\2\2\2\u0087"+
		"\u0086\3\2\2\2\u0088\27\3\2\2\2\u0089\u0096\5\60\31\2\u008a\u0096\5\62"+
		"\32\2\u008b\u0096\5\64\33\2\u008c\u0096\5\36\20\2\u008d\u0096\5 \21\2"+
		"\u008e\u0096\5\"\22\2\u008f\u0096\5$\23\2\u0090\u0096\5,\27\2\u0091\u0092"+
		"\5\32\16\2\u0092\u0093\7\b\2\2\u0093\u0096\3\2\2\2\u0094\u0096\5.\30\2"+
		"\u0095\u0089\3\2\2\2\u0095\u008a\3\2\2\2\u0095\u008b\3\2\2\2\u0095\u008c"+
		"\3\2\2\2\u0095\u008d\3\2\2\2\u0095\u008e\3\2\2\2\u0095\u008f\3\2\2\2\u0095"+
		"\u0090\3\2\2\2\u0095\u0091\3\2\2\2\u0095\u0094\3\2\2\2\u0096\31\3\2\2"+
		"\2\u0097\u0098\7-\2\2\u0098\u009a\7\3\2\2\u0099\u009b\5\16\b\2\u009a\u0099"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00a4\7\4\2\2\u009d"+
		"\u009e\7\6\2\2\u009e\u00a0\7\3\2\2\u009f\u00a1\5\16\b\2\u00a0\u009f\3"+
		"\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\7\4\2\2\u00a3"+
		"\u0097\3\2\2\2\u00a3\u009d\3\2\2\2\u00a4\33\3\2\2\2\u00a5\u00a6\7\t\2"+
		"\2\u00a6\u00a7\5\26\f\2\u00a7\u00a8\7\n\2\2\u00a8\35\3\2\2\2\u00a9\u00ac"+
		"\5*\26\2\u00aa\u00ac\5(\25\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"\37\3\2\2\2\u00ad\u00ae\7$\2\2\u00ae\u00af\7\13\2\2\u00af\u00b0\5:\36"+
		"\2\u00b0\u00b1\7\f\2\2\u00b1\u00b2\7-\2\2\u00b2\u00b3\7\b\2\2\u00b3\u00cc"+
		"\3\2\2\2\u00b4\u00b5\7$\2\2\u00b5\u00b6\7\13\2\2\u00b6\u00b7\5:\36\2\u00b7"+
		"\u00b8\7\f\2\2\u00b8\u00b9\7\13\2\2\u00b9\u00ba\5:\36\2\u00ba\u00bb\7"+
		"\f\2\2\u00bb\u00bc\7-\2\2\u00bc\u00bd\7\b\2\2\u00bd\u00cc\3\2\2\2\u00be"+
		"\u00bf\7$\2\2\u00bf\u00c0\7\13\2\2\u00c0\u00c1\5:\36\2\u00c1\u00c2\7\f"+
		"\2\2\u00c2\u00c3\7\13\2\2\u00c3\u00c4\5:\36\2\u00c4\u00c5\7\f\2\2\u00c5"+
		"\u00c6\7\13\2\2\u00c6\u00c7\5:\36\2\u00c7\u00c8\7\f\2\2\u00c8\u00c9\7"+
		"-\2\2\u00c9\u00ca\7\b\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00ad\3\2\2\2\u00cb"+
		"\u00b4\3\2\2\2\u00cb\u00be\3\2\2\2\u00cc!\3\2\2\2\u00cd\u00ce\7$\2\2\u00ce"+
		"\u00cf\5&\24\2\u00cf\u00d0\7-\2\2\u00d0\u00d1\7,\2\2\u00d1\u00d2\7\t\2"+
		"\2\u00d2\u00d3\5\16\b\2\u00d3\u00d4\7\r\2\2\u00d4#\3\2\2\2\u00d5\u00d6"+
		"\7-\2\2\u00d6\u00d7\7\13\2\2\u00d7\u00d8\5:\36\2\u00d8\u00d9\7\f\2\2\u00d9"+
		"\u00da\7,\2\2\u00da\u00db\5:\36\2\u00db\u00dc\7\b\2\2\u00dc\u00f7\3\2"+
		"\2\2\u00dd\u00de\7-\2\2\u00de\u00df\7\13\2\2\u00df\u00e0\5:\36\2\u00e0"+
		"\u00e1\7\f\2\2\u00e1\u00e2\7\13\2\2\u00e2\u00e3\5:\36\2\u00e3\u00e4\7"+
		"\f\2\2\u00e4\u00e5\7,\2\2\u00e5\u00e6\5:\36\2\u00e6\u00e7\7\b\2\2\u00e7"+
		"\u00f7\3\2\2\2\u00e8\u00e9\7-\2\2\u00e9\u00ea\7\13\2\2\u00ea\u00eb\5:"+
		"\36\2\u00eb\u00ec\7\f\2\2\u00ec\u00ed\7\13\2\2\u00ed\u00ee\5:\36\2\u00ee"+
		"\u00ef\7\f\2\2\u00ef\u00f0\7\13\2\2\u00f0\u00f1\5:\36\2\u00f1\u00f2\7"+
		"\f\2\2\u00f2\u00f3\7,\2\2\u00f3\u00f4\5:\36\2\u00f4\u00f5\7\b\2\2\u00f5"+
		"\u00f7\3\2\2\2\u00f6\u00d5\3\2\2\2\u00f6\u00dd\3\2\2\2\u00f6\u00e8\3\2"+
		"\2\2\u00f7%\3\2\2\2\u00f8\u00f9\7\13\2\2\u00f9\u00fa\5:\36\2\u00fa\u00fb"+
		"\7\f\2\2\u00fb\u010e\3\2\2\2\u00fc\u00fd\7\13\2\2\u00fd\u00fe\5:\36\2"+
		"\u00fe\u00ff\7\f\2\2\u00ff\u0100\7\13\2\2\u0100\u0101\5:\36\2\u0101\u0102"+
		"\7\f\2\2\u0102\u010e\3\2\2\2\u0103\u0104\7\13\2\2\u0104\u0105\5:\36\2"+
		"\u0105\u0106\7\f\2\2\u0106\u0107\7\13\2\2\u0107\u0108\5:\36\2\u0108\u0109"+
		"\7\f\2\2\u0109\u010a\7\13\2\2\u010a\u010b\5:\36\2\u010b\u010c\7\f\2\2"+
		"\u010c\u010e\3\2\2\2\u010d\u00f8\3\2\2\2\u010d\u00fc\3\2\2\2\u010d\u0103"+
		"\3\2\2\2\u010e\'\3\2\2\2\u010f\u0110\7-\2\2\u0110\u0111\7,\2\2\u0111\u0112"+
		"\5:\36\2\u0112\u0113\7\b\2\2\u0113)\3\2\2\2\u0114\u0115\7$\2\2\u0115\u0116"+
		"\7-\2\2\u0116\u0117\7,\2\2\u0117\u0118\5:\36\2\u0118\u0119\7\b\2\2\u0119"+
		"+\3\2\2\2\u011a\u011b\7$\2\2\u011b\u011c\7-\2\2\u011c\u011d\7\b\2\2\u011d"+
		"-\3\2\2\2\u011e\u011f\7\16\2\2\u011f\u0120\5:\36\2\u0120\u0121\7\b\2\2"+
		"\u0121/\3\2\2\2\u0122\u0123\7\17\2\2\u0123\u0124\7\3\2\2\u0124\u0125\5"+
		"\66\34\2\u0125\u0126\7\4\2\2\u0126\u0127\5\34\17\2\u0127\u012f\3\2\2\2"+
		"\u0128\u0129\7\17\2\2\u0129\u012a\7\3\2\2\u012a\u012b\5\66\34\2\u012b"+
		"\u012c\7\4\2\2\u012c\u012d\5\30\r\2\u012d\u012f\3\2\2\2\u012e\u0122\3"+
		"\2\2\2\u012e\u0128\3\2\2\2\u012f\61\3\2\2\2\u0130\u0131\5\60\31\2\u0131"+
		"\u0132\7\20\2\2\u0132\u0133\5\34\17\2\u0133\u0139\3\2\2\2\u0134\u0135"+
		"\5\60\31\2\u0135\u0136\7\20\2\2\u0136\u0137\5\30\r\2\u0137\u0139\3\2\2"+
		"\2\u0138\u0130\3\2\2\2\u0138\u0134\3\2\2\2\u0139\63\3\2\2\2\u013a\u013b"+
		"\7\21\2\2\u013b\u013c\7\3\2\2\u013c\u013d\5\66\34\2\u013d\u013e\7\4\2"+
		"\2\u013e\u013f\5\34\17\2\u013f\u0147\3\2\2\2\u0140\u0141\7\21\2\2\u0141"+
		"\u0142\7\3\2\2\u0142\u0143\5\66\34\2\u0143\u0144\7\4\2\2\u0144\u0145\5"+
		"\30\r\2\u0145\u0147\3\2\2\2\u0146\u013a\3\2\2\2\u0146\u0140\3\2\2\2\u0147"+
		"\65\3\2\2\2\u0148\u0149\b\34\1\2\u0149\u0155\7-\2\2\u014a\u0155\7%\2\2"+
		"\u014b\u014c\7\22\2\2\u014c\u0155\5\66\34\t\u014d\u0155\7.\2\2\u014e\u0155"+
		"\5<\37\2\u014f\u0155\58\35\2\u0150\u0151\7\3\2\2\u0151\u0152\5\66\34\2"+
		"\u0152\u0153\7\4\2\2\u0153\u0155\3\2\2\2\u0154\u0148\3\2\2\2\u0154\u014a"+
		"\3\2\2\2\u0154\u014b\3\2\2\2\u0154\u014d\3\2\2\2\u0154\u014e\3\2\2\2\u0154"+
		"\u014f\3\2\2\2\u0154\u0150\3\2\2\2\u0155\u015e\3\2\2\2\u0156\u0157\f\4"+
		"\2\2\u0157\u0158\7\23\2\2\u0158\u015d\5\66\34\5\u0159\u015a\f\3\2\2\u015a"+
		"\u015b\7\24\2\2\u015b\u015d\5\66\34\4\u015c\u0156\3\2\2\2\u015c\u0159"+
		"\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\67\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0162\5:\36\2\u0162\u0163\7\25\2"+
		"\2\u0163\u0164\5:\36\2\u0164\u017a\3\2\2\2\u0165\u0166\5:\36\2\u0166\u0167"+
		"\7\26\2\2\u0167\u0168\5:\36\2\u0168\u017a\3\2\2\2\u0169\u016a\5:\36\2"+
		"\u016a\u016b\7\27\2\2\u016b\u016c\5:\36\2\u016c\u017a\3\2\2\2\u016d\u016e"+
		"\5:\36\2\u016e\u016f\7\30\2\2\u016f\u0170\5:\36\2\u0170\u017a\3\2\2\2"+
		"\u0171\u0172\5:\36\2\u0172\u0173\7\31\2\2\u0173\u0174\5:\36\2\u0174\u017a"+
		"\3\2\2\2\u0175\u0176\5:\36\2\u0176\u0177\7\32\2\2\u0177\u0178\5:\36\2"+
		"\u0178\u017a\3\2\2\2\u0179\u0161\3\2\2\2\u0179\u0165\3\2\2\2\u0179\u0169"+
		"\3\2\2\2\u0179\u016d\3\2\2\2\u0179\u0171\3\2\2\2\u0179\u0175\3\2\2\2\u017a"+
		"9\3\2\2\2\u017b\u017c\b\36\1\2\u017c\u017d\7\33\2\2\u017d\u018d\5:\36"+
		"\23\u017e\u017f\7\3\2\2\u017f\u0180\5:\36\2\u0180\u0181\7\4\2\2\u0181"+
		"\u018d\3\2\2\2\u0182\u018d\7\'\2\2\u0183\u018d\7&\2\2\u0184\u018d\7*\2"+
		"\2\u0185\u018d\7+\2\2\u0186\u018d\7%\2\2\u0187\u018d\7(\2\2\u0188\u018d"+
		"\7-\2\2\u0189\u018d\7.\2\2\u018a\u018d\5\32\16\2\u018b\u018d\5<\37\2\u018c"+
		"\u017b\3\2\2\2\u018c\u017e\3\2\2\2\u018c\u0182\3\2\2\2\u018c\u0183\3\2"+
		"\2\2\u018c\u0184\3\2\2\2\u018c\u0185\3\2\2\2\u018c\u0186\3\2\2\2\u018c"+
		"\u0187\3\2\2\2\u018c\u0188\3\2\2\2\u018c\u0189\3\2\2\2\u018c\u018a\3\2"+
		"\2\2\u018c\u018b\3\2\2\2\u018d\u019f\3\2\2\2\u018e\u018f\f\22\2\2\u018f"+
		"\u0190\7\34\2\2\u0190\u019e\5:\36\23\u0191\u0192\f\21\2\2\u0192\u0193"+
		"\7\35\2\2\u0193\u019e\5:\36\22\u0194\u0195\f\20\2\2\u0195\u0196\7\33\2"+
		"\2\u0196\u019e\5:\36\21\u0197\u0198\f\17\2\2\u0198\u0199\7\36\2\2\u0199"+
		"\u019e\5:\36\20\u019a\u019b\f\16\2\2\u019b\u019c\7\37\2\2\u019c\u019e"+
		"\5:\36\17\u019d\u018e\3\2\2\2\u019d\u0191\3\2\2\2\u019d\u0194\3\2\2\2"+
		"\u019d\u0197\3\2\2\2\u019d\u019a\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d"+
		"\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0;\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2"+
		"\u01a3\7-\2\2\u01a3\u01a4\7\13\2\2\u01a4\u01a5\5:\36\2\u01a5\u01a6\7\f"+
		"\2\2\u01a6\u01bb\3\2\2\2\u01a7\u01a8\7-\2\2\u01a8\u01a9\7\13\2\2\u01a9"+
		"\u01aa\5:\36\2\u01aa\u01ab\7\f\2\2\u01ab\u01ac\7\13\2\2\u01ac\u01ad\5"+
		":\36\2\u01ad\u01ae\7\f\2\2\u01ae\u01bb\3\2\2\2\u01af\u01b0\7-\2\2\u01b0"+
		"\u01b1\7\13\2\2\u01b1\u01b2\5:\36\2\u01b2\u01b3\7\f\2\2\u01b3\u01b4\7"+
		"\13\2\2\u01b4\u01b5\5:\36\2\u01b5\u01b6\7\f\2\2\u01b6\u01b7\7\13\2\2\u01b7"+
		"\u01b8\5:\36\2\u01b8\u01b9\7\f\2\2\u01b9\u01bb\3\2\2\2\u01ba\u01a2\3\2"+
		"\2\2\u01ba\u01a7\3\2\2\2\u01ba\u01af\3\2\2\2\u01bb=\3\2\2\2 @ENUX^eho"+
		"y\u0087\u0095\u009a\u00a0\u00a3\u00ab\u00cb\u00f6\u010d\u012e\u0138\u0146"+
		"\u0154\u015c\u015e\u0179\u018c\u019d\u019f\u01ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}