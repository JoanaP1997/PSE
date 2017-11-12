// Generated from Wlang.g4 by ANTLR 4.7
package basic;
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
		T__17=18, COMPOPERATOR=19, WS=20, COMMENT=21, LINE_COMMENT=22, TYPE=23, 
		ID=24, INTLITERAL=25, FLOATLITERAL=26, CHARLITERAL=27, BOOLEANLITERAL=28, 
		ASSIGN=29;
	public static final int
		RULE_r = 0, RULE_routineHead = 1, RULE_arglist = 2, RULE_argument = 3, 
		RULE_routine = 4, RULE_statements = 5, RULE_statement = 6, RULE_block = 7, 
		RULE_assignment = 8, RULE_pureAssign = 9, RULE_declareAssign = 10, RULE_declaration = 11, 
		RULE_ifState = 12, RULE_ifelseState = 13, RULE_whileState = 14, RULE_condition = 15, 
		RULE_comparison = 16, RULE_term = 17;
	public static final String[] ruleNames = {
		"r", "routineHead", "arglist", "argument", "routine", "statements", "statement", 
		"block", "assignment", "pureAssign", "declareAssign", "declaration", "ifState", 
		"ifelseState", "whileState", "condition", "comparison", "term"
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
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
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
			setState(36);
			statements();
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
		enterRule(_localctx, 2, RULE_routineHead);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				_localctx = new FunctionHeadContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				((FunctionHeadContext)_localctx).returntype = match(TYPE);
				setState(39);
				((FunctionHeadContext)_localctx).id = match(ID);
				setState(40);
				match(T__0);
				setState(41);
				((FunctionHeadContext)_localctx).args = arglist();
				setState(42);
				match(T__1);
				}
				break;
			case T__2:
				_localctx = new ProcedureHeadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(T__2);
				setState(45);
				((ProcedureHeadContext)_localctx).id = match(ID);
				setState(46);
				match(T__0);
				setState(47);
				((ProcedureHeadContext)_localctx).args = arglist();
				setState(48);
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
		enterRule(_localctx, 4, RULE_arglist);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				argument();
				setState(53);
				match(T__3);
				setState(54);
				arglist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
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
		enterRule(_localctx, 6, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			((ArgumentContext)_localctx).type = match(TYPE);
			setState(60);
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
		enterRule(_localctx, 8, RULE_routine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			routineHead();
			setState(63);
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
		enterRule(_localctx, 10, RULE_statements);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new CompStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				statement();
				setState(66);
				statements();
				}
				break;
			case 2:
				_localctx = new SingleStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
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
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
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
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				ifState();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				ifelseState();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				whileState();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				declaration();
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
		enterRule(_localctx, 14, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__4);
			setState(79);
			statements();
			setState(80);
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
		enterRule(_localctx, 16, RULE_assignment);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				declareAssign();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
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
		enterRule(_localctx, 18, RULE_pureAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			((PureAssignContext)_localctx).id = match(ID);
			setState(87);
			match(ASSIGN);
			setState(88);
			((PureAssignContext)_localctx).value = term(0);
			setState(89);
			match(T__6);
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
		enterRule(_localctx, 20, RULE_declareAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			((DeclareAssignContext)_localctx).type = match(TYPE);
			setState(92);
			((DeclareAssignContext)_localctx).id = match(ID);
			setState(93);
			match(ASSIGN);
			setState(94);
			((DeclareAssignContext)_localctx).value = term(0);
			setState(95);
			match(T__6);
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
		enterRule(_localctx, 22, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			((DeclarationContext)_localctx).type = match(TYPE);
			setState(98);
			((DeclarationContext)_localctx).id = match(ID);
			setState(99);
			match(T__6);
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
		enterRule(_localctx, 24, RULE_ifState);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(T__7);
				setState(102);
				match(T__0);
				setState(103);
				condition();
				setState(104);
				match(T__1);
				setState(105);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(T__7);
				setState(108);
				match(T__0);
				setState(109);
				condition();
				setState(110);
				match(T__1);
				setState(111);
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
		enterRule(_localctx, 26, RULE_ifelseState);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				ifState();
				setState(116);
				match(T__8);
				setState(117);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				ifState();
				setState(120);
				match(T__8);
				setState(121);
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
		enterRule(_localctx, 28, RULE_whileState);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(T__9);
				setState(126);
				match(T__0);
				setState(127);
				condition();
				setState(128);
				match(T__1);
				setState(129);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(T__9);
				setState(132);
				match(T__0);
				setState(133);
				condition();
				setState(134);
				match(T__1);
				setState(135);
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
	public static class IdConditionContext extends ConditionContext {
		public TerminalNode ID() { return getToken(WlangParser.ID, 0); }
		public IdConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitIdCondition(this);
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
	public static class PureConditionContext extends ConditionContext {
		public TerminalNode BOOLEANLITERAL() { return getToken(WlangParser.BOOLEANLITERAL, 0); }
		public PureConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitPureCondition(this);
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
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condition);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new IdConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ComparisonConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				comparison();
				}
				break;
			case 3:
				_localctx = new PureConditionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				match(BOOLEANLITERAL);
				}
				break;
			case 4:
				_localctx = new OrConditionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				match(T__0);
				setState(143);
				condition();
				setState(144);
				match(T__1);
				setState(145);
				match(T__10);
				setState(146);
				match(T__0);
				setState(147);
				condition();
				setState(148);
				match(T__1);
				}
				break;
			case 5:
				_localctx = new AndConditionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(150);
				match(T__0);
				setState(151);
				condition();
				setState(152);
				match(T__1);
				setState(153);
				match(T__11);
				setState(154);
				match(T__0);
				setState(155);
				condition();
				setState(156);
				match(T__1);
				}
				break;
			case 6:
				_localctx = new NotConditionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(158);
				match(T__12);
				setState(159);
				condition();
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

	public static class ComparisonContext extends ParserRuleContext {
		public TermContext left;
		public Token comperator;
		public TermContext right;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode COMPOPERATOR() { return getToken(WlangParser.COMPOPERATOR, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			((ComparisonContext)_localctx).left = term(0);
			setState(163);
			((ComparisonContext)_localctx).comperator = match(COMPOPERATOR);
			setState(164);
			((ComparisonContext)_localctx).right = term(0);
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
	public static class CharLiteralContext extends TermContext {
		public TerminalNode CHARLITERAL() { return getToken(WlangParser.CHARLITERAL, 0); }
		public CharLiteralContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitCharLiteral(this);
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
	public static class IDContext extends TermContext {
		public TerminalNode ID() { return getToken(WlangParser.ID, 0); }
		public IDContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WlangVisitor ) return ((WlangVisitor<? extends T>)visitor).visitID(this);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				_localctx = new BracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(167);
				match(T__0);
				setState(168);
				term(0);
				setState(169);
				match(T__1);
				}
				break;
			case FLOATLITERAL:
				{
				_localctx = new FloatLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				match(FLOATLITERAL);
				}
				break;
			case INTLITERAL:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(INTLITERAL);
				}
				break;
			case ID:
				{
				_localctx = new IDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				match(ID);
				}
				break;
			case CHARLITERAL:
				{
				_localctx = new CharLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(CHARLITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(192);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new DivisionContext(new TermContext(_parentctx, _parentState));
						((DivisionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(177);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(178);
						match(T__13);
						setState(179);
						((DivisionContext)_localctx).right = term(11);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationContext(new TermContext(_parentctx, _parentState));
						((MultiplicationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(180);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(181);
						match(T__14);
						setState(182);
						((MultiplicationContext)_localctx).right = term(10);
						}
						break;
					case 3:
						{
						_localctx = new SubtractionContext(new TermContext(_parentctx, _parentState));
						((SubtractionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(183);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(184);
						match(T__15);
						setState(185);
						((SubtractionContext)_localctx).right = term(9);
						}
						break;
					case 4:
						{
						_localctx = new AdditionContext(new TermContext(_parentctx, _parentState));
						((AdditionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(186);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(187);
						match(T__16);
						setState(188);
						((AdditionContext)_localctx).right = term(8);
						}
						break;
					case 5:
						{
						_localctx = new ModuloContext(new TermContext(_parentctx, _parentState));
						((ModuloContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(189);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(190);
						match(T__17);
						setState(191);
						((ModuloContext)_localctx).right = term(7);
						}
						break;
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00c8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"\65\n\3\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\5\7H\n\7\3\b\3\b\3\b\3\b\3\b\5\bO\n\b\3\t\3\t\3\t\3\t\3\n\3\n\5"+
		"\nW\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16t\n"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17~\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u008c\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u00a3\n\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00b2\n\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00c3\n\23"+
		"\f\23\16\23\u00c6\13\23\3\23\2\3$\24\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$\2\2\2\u00ce\2&\3\2\2\2\4\64\3\2\2\2\6;\3\2\2\2\b=\3\2\2\2\n"+
		"@\3\2\2\2\fG\3\2\2\2\16N\3\2\2\2\20P\3\2\2\2\22V\3\2\2\2\24X\3\2\2\2\26"+
		"]\3\2\2\2\30c\3\2\2\2\32s\3\2\2\2\34}\3\2\2\2\36\u008b\3\2\2\2 \u00a2"+
		"\3\2\2\2\"\u00a4\3\2\2\2$\u00b1\3\2\2\2&\'\5\f\7\2\'\3\3\2\2\2()\7\31"+
		"\2\2)*\7\32\2\2*+\7\3\2\2+,\5\6\4\2,-\7\4\2\2-\65\3\2\2\2./\7\5\2\2/\60"+
		"\7\32\2\2\60\61\7\3\2\2\61\62\5\6\4\2\62\63\7\4\2\2\63\65\3\2\2\2\64("+
		"\3\2\2\2\64.\3\2\2\2\65\5\3\2\2\2\66\67\5\b\5\2\678\7\6\2\289\5\6\4\2"+
		"9<\3\2\2\2:<\5\b\5\2;\66\3\2\2\2;:\3\2\2\2<\7\3\2\2\2=>\7\31\2\2>?\7\32"+
		"\2\2?\t\3\2\2\2@A\5\4\3\2AB\5\20\t\2B\13\3\2\2\2CD\5\16\b\2DE\5\f\7\2"+
		"EH\3\2\2\2FH\5\16\b\2GC\3\2\2\2GF\3\2\2\2H\r\3\2\2\2IO\5\32\16\2JO\5\34"+
		"\17\2KO\5\36\20\2LO\5\22\n\2MO\5\30\r\2NI\3\2\2\2NJ\3\2\2\2NK\3\2\2\2"+
		"NL\3\2\2\2NM\3\2\2\2O\17\3\2\2\2PQ\7\7\2\2QR\5\f\7\2RS\7\b\2\2S\21\3\2"+
		"\2\2TW\5\26\f\2UW\5\24\13\2VT\3\2\2\2VU\3\2\2\2W\23\3\2\2\2XY\7\32\2\2"+
		"YZ\7\37\2\2Z[\5$\23\2[\\\7\t\2\2\\\25\3\2\2\2]^\7\31\2\2^_\7\32\2\2_`"+
		"\7\37\2\2`a\5$\23\2ab\7\t\2\2b\27\3\2\2\2cd\7\31\2\2de\7\32\2\2ef\7\t"+
		"\2\2f\31\3\2\2\2gh\7\n\2\2hi\7\3\2\2ij\5 \21\2jk\7\4\2\2kl\5\20\t\2lt"+
		"\3\2\2\2mn\7\n\2\2no\7\3\2\2op\5 \21\2pq\7\4\2\2qr\5\16\b\2rt\3\2\2\2"+
		"sg\3\2\2\2sm\3\2\2\2t\33\3\2\2\2uv\5\32\16\2vw\7\13\2\2wx\5\20\t\2x~\3"+
		"\2\2\2yz\5\32\16\2z{\7\13\2\2{|\5\16\b\2|~\3\2\2\2}u\3\2\2\2}y\3\2\2\2"+
		"~\35\3\2\2\2\177\u0080\7\f\2\2\u0080\u0081\7\3\2\2\u0081\u0082\5 \21\2"+
		"\u0082\u0083\7\4\2\2\u0083\u0084\5\20\t\2\u0084\u008c\3\2\2\2\u0085\u0086"+
		"\7\f\2\2\u0086\u0087\7\3\2\2\u0087\u0088\5 \21\2\u0088\u0089\7\4\2\2\u0089"+
		"\u008a\5\16\b\2\u008a\u008c\3\2\2\2\u008b\177\3\2\2\2\u008b\u0085\3\2"+
		"\2\2\u008c\37\3\2\2\2\u008d\u00a3\7\32\2\2\u008e\u00a3\5\"\22\2\u008f"+
		"\u00a3\7\36\2\2\u0090\u0091\7\3\2\2\u0091\u0092\5 \21\2\u0092\u0093\7"+
		"\4\2\2\u0093\u0094\7\r\2\2\u0094\u0095\7\3\2\2\u0095\u0096\5 \21\2\u0096"+
		"\u0097\7\4\2\2\u0097\u00a3\3\2\2\2\u0098\u0099\7\3\2\2\u0099\u009a\5 "+
		"\21\2\u009a\u009b\7\4\2\2\u009b\u009c\7\16\2\2\u009c\u009d\7\3\2\2\u009d"+
		"\u009e\5 \21\2\u009e\u009f\7\4\2\2\u009f\u00a3\3\2\2\2\u00a0\u00a1\7\17"+
		"\2\2\u00a1\u00a3\5 \21\2\u00a2\u008d\3\2\2\2\u00a2\u008e\3\2\2\2\u00a2"+
		"\u008f\3\2\2\2\u00a2\u0090\3\2\2\2\u00a2\u0098\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a3!\3\2\2\2\u00a4\u00a5\5$\23\2\u00a5\u00a6\7\25\2\2\u00a6\u00a7"+
		"\5$\23\2\u00a7#\3\2\2\2\u00a8\u00a9\b\23\1\2\u00a9\u00aa\7\3\2\2\u00aa"+
		"\u00ab\5$\23\2\u00ab\u00ac\7\4\2\2\u00ac\u00b2\3\2\2\2\u00ad\u00b2\7\34"+
		"\2\2\u00ae\u00b2\7\33\2\2\u00af\u00b2\7\32\2\2\u00b0\u00b2\7\35\2\2\u00b1"+
		"\u00a8\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2"+
		"\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00c4\3\2\2\2\u00b3\u00b4\f\f\2\2\u00b4"+
		"\u00b5\7\20\2\2\u00b5\u00c3\5$\23\r\u00b6\u00b7\f\13\2\2\u00b7\u00b8\7"+
		"\21\2\2\u00b8\u00c3\5$\23\f\u00b9\u00ba\f\n\2\2\u00ba\u00bb\7\22\2\2\u00bb"+
		"\u00c3\5$\23\13\u00bc\u00bd\f\t\2\2\u00bd\u00be\7\23\2\2\u00be\u00c3\5"+
		"$\23\n\u00bf\u00c0\f\b\2\2\u00c0\u00c1\7\24\2\2\u00c1\u00c3\5$\23\t\u00c2"+
		"\u00b3\3\2\2\2\u00c2\u00b6\3\2\2\2\u00c2\u00b9\3\2\2\2\u00c2\u00bc\3\2"+
		"\2\2\u00c2\u00bf\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5%\3\2\2\2\u00c6\u00c4\3\2\2\2\16\64;GNVs}\u008b\u00a2"+
		"\u00b1\u00c2\u00c4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}