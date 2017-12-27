// Generated from Terms.g4 by ANTLR 4.7
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
public class TermsParser extends Parser {
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
	public static final int
		RULE_r = 0, RULE_generalTerm = 1, RULE_condition = 2, RULE_comparison = 3, 
		RULE_term = 4, RULE_arrayAccess = 5;
	public static final String[] ruleNames = {
		"r", "generalTerm", "condition", "comparison", "term", "arrayAccess"
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

	@Override
	public String getGrammarFileName() { return "Terms.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TermsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RContext extends ParserRuleContext {
		public GeneralTermContext generalTerm() {
			return getRuleContext(GeneralTermContext.class,0);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermsVisitor ) return ((TermsVisitor<? extends T>)visitor).visitR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			generalTerm();
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

	public static class GeneralTermContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public GeneralTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalTerm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermsVisitor ) return ((TermsVisitor<? extends T>)visitor).visitGeneralTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneralTermContext generalTerm() throws RecognitionException {
		GeneralTermContext _localctx = new GeneralTermContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_generalTerm);
		try {
			setState(16);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				condition(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(15);
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
			if ( visitor instanceof TermsVisitor ) return ((TermsVisitor<? extends T>)visitor).visitComparisonCondition(this);
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
			if ( visitor instanceof TermsVisitor ) return ((TermsVisitor<? extends T>)visitor).visitArrayAccessCondition(this);
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
			if ( visitor instanceof TermsVisitor ) return ((TermsVisitor<? extends T>)visitor).visitBracketCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdConditionContext extends ConditionContext {
		public TerminalNode ID() { return getToken(TermsParser.ID, 0); }
		public IdConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermsVisitor ) return ((TermsVisitor<? extends T>)visitor).visitIdCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantConditionContext extends ConditionContext {
		public TerminalNode BOOLEANLITERAL() { return getToken(TermsParser.BOOLEANLITERAL, 0); }
		public ConstantConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermsVisitor ) return ((TermsVisitor<? extends T>)visitor).visitConstantCondition(this);
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
			if ( visitor instanceof TermsVisitor ) return ((TermsVisitor<? extends T>)visitor).visitNotCondition(this);
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
			if ( visitor instanceof TermsVisitor ) return ((TermsVisitor<? extends T>)visitor).visitOrCondition(this);
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
			if ( visitor instanceof TermsVisitor ) return ((TermsVisitor<? extends T>)visitor).visitAndCondition(this);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				_localctx = new IdConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(19);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new ArrayAccessConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(20);
				arrayAccess();
				}
				break;
			case 3:
				{
				_localctx = new ComparisonConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(21);
				comparison();
				}
				break;
			case 4:
				{
				_localctx = new ConstantConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(22);
				match(BOOLEANLITERAL);
				}
				break;
			case 5:
				{
				_localctx = new BracketConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(23);
				match(T__0);
				setState(24);
				condition(0);
				setState(25);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new NotConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(27);
				match(T__4);
				setState(28);
				condition(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(37);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new AndConditionContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(31);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(32);
						match(T__2);
						setState(33);
						condition(4);
						}
						break;
					case 2:
						{
						_localctx = new OrConditionContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(34);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(35);
						match(T__3);
						setState(36);
						condition(3);
						}
						break;
					}
					} 
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
			if ( visitor instanceof TermsVisitor ) return ((TermsVisitor<? extends T>)visitor).visitMoreComp(this);
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
			if ( visitor instanceof TermsVisitor ) return ((TermsVisitor<? extends T>)visitor).visitLessEqualComp(this);
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
			if ( visitor instanceof TermsVisitor ) return ((TermsVisitor<? extends T>)visitor).visitEqualComp(this);
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
			if ( visitor instanceof TermsVisitor ) return ((TermsVisitor<? extends T>)visitor).visitMoreEqualComp(this);
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
			if ( visitor instanceof TermsVisitor ) return ((TermsVisitor<? extends T>)visitor).visitLessComp(this);
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
			if ( visitor instanceof TermsVisitor ) return ((TermsVisitor<? extends T>)visitor).visitNotEqualComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comparison);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new LessCompContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				((LessCompContext)_localctx).left = term(0);
				setState(43);
				match(T__5);
				setState(44);
				((LessCompContext)_localctx).right = term(0);
				}
				break;
			case 2:
				_localctx = new LessEqualCompContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				((LessEqualCompContext)_localctx).left = term(0);
				setState(47);
				match(T__6);
				setState(48);
				((LessEqualCompContext)_localctx).right = term(0);
				}
				break;
			case 3:
				_localctx = new MoreCompContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				((MoreCompContext)_localctx).left = term(0);
				setState(51);
				match(T__7);
				setState(52);
				((MoreCompContext)_localctx).right = term(0);
				}
				break;
			case 4:
				_localctx = new MoreEqualCompContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				((MoreEqualCompContext)_localctx).left = term(0);
				setState(55);
				match(T__8);
				setState(56);
				((MoreEqualCompContext)_localctx).right = term(0);
				}
				break;
			case 5:
				_localctx = new EqualCompContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				((EqualCompContext)_localctx).left = term(0);
				setState(59);
				match(T__9);
				setState(60);
				((EqualCompContext)_localctx).right = term(0);
				}
				break;
			case 6:
				_localctx = new NotEqualCompContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(62);
				((NotEqualCompContext)_localctx).left = term(0);
				setState(63);
				match(T__10);
				setState(64);
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
			if ( visitor instanceof TermsVisitor ) return ((TermsVisitor<? extends T>)visitor).visitMultiplication(this);
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
			if ( visitor instanceof TermsVisitor ) return ((TermsVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharLiteralContext extends TermContext {
		public TerminalNode CHARLITERAL() { return getToken(TermsParser.CHARLITERAL, 0); }
		public CharLiteralContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermsVisitor ) return ((TermsVisitor<? extends T>)visitor).visitCharLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LongLiteralContext extends TermContext {
		public TerminalNode LONGLITERAL() { return getToken(TermsParser.LONGLITERAL, 0); }
		public LongLiteralContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermsVisitor ) return ((TermsVisitor<? extends T>)visitor).visitLongLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatLiteralContext extends TermContext {
		public TerminalNode FLOATLITERAL() { return getToken(TermsParser.FLOATLITERAL, 0); }
		public FloatLiteralContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermsVisitor ) return ((TermsVisitor<? extends T>)visitor).visitFloatLiteral(this);
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
			if ( visitor instanceof TermsVisitor ) return ((TermsVisitor<? extends T>)visitor).visitModulo(this);
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
			if ( visitor instanceof TermsVisitor ) return ((TermsVisitor<? extends T>)visitor).visitSubtraction(this);
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
			if ( visitor instanceof TermsVisitor ) return ((TermsVisitor<? extends T>)visitor).visitBrackets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntLiteralContext extends TermContext {
		public TerminalNode INTLITERAL() { return getToken(TermsParser.INTLITERAL, 0); }
		public IntLiteralContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermsVisitor ) return ((TermsVisitor<? extends T>)visitor).visitIntLiteral(this);
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
			if ( visitor instanceof TermsVisitor ) return ((TermsVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends TermContext {
		public TerminalNode DOUBLELITERAL() { return getToken(TermsParser.DOUBLELITERAL, 0); }
		public DoubleLiteralContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermsVisitor ) return ((TermsVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IDContext extends TermContext {
		public TerminalNode ID() { return getToken(TermsParser.ID, 0); }
		public IDContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermsVisitor ) return ((TermsVisitor<? extends T>)visitor).visitID(this);
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
			if ( visitor instanceof TermsVisitor ) return ((TermsVisitor<? extends T>)visitor).visitArrayAccessInTerm(this);
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
			if ( visitor instanceof TermsVisitor ) return ((TermsVisitor<? extends T>)visitor).visitNegativeTerm(this);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new NegativeTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(69);
				match(T__11);
				setState(70);
				((NegativeTermContext)_localctx).inner = term(14);
				}
				break;
			case 2:
				{
				_localctx = new BracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				match(T__0);
				setState(72);
				((BracketsContext)_localctx).inner = term(0);
				setState(73);
				match(T__1);
				}
				break;
			case 3:
				{
				_localctx = new FloatLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				match(FLOATLITERAL);
				}
				break;
			case 4:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				match(INTLITERAL);
				}
				break;
			case 5:
				{
				_localctx = new LongLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				match(LONGLITERAL);
				}
				break;
			case 6:
				{
				_localctx = new DoubleLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78);
				match(DOUBLELITERAL);
				}
				break;
			case 7:
				{
				_localctx = new IDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				match(ID);
				}
				break;
			case 8:
				{
				_localctx = new CharLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				match(CHARLITERAL);
				}
				break;
			case 9:
				{
				_localctx = new ArrayAccessInTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				arrayAccess();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(99);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new DivisionContext(new TermContext(_parentctx, _parentState));
						((DivisionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(84);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(85);
						match(T__12);
						setState(86);
						((DivisionContext)_localctx).right = term(14);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationContext(new TermContext(_parentctx, _parentState));
						((MultiplicationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(87);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(88);
						match(T__13);
						setState(89);
						((MultiplicationContext)_localctx).right = term(13);
						}
						break;
					case 3:
						{
						_localctx = new SubtractionContext(new TermContext(_parentctx, _parentState));
						((SubtractionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(90);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(91);
						match(T__11);
						setState(92);
						((SubtractionContext)_localctx).right = term(12);
						}
						break;
					case 4:
						{
						_localctx = new AdditionContext(new TermContext(_parentctx, _parentState));
						((AdditionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(93);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(94);
						match(T__14);
						setState(95);
						((AdditionContext)_localctx).right = term(11);
						}
						break;
					case 5:
						{
						_localctx = new ModuloContext(new TermContext(_parentctx, _parentState));
						((ModuloContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(96);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(97);
						match(T__15);
						setState(98);
						((ModuloContext)_localctx).right = term(10);
						}
						break;
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		public TerminalNode ID() { return getToken(TermsParser.ID, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TwoDimArrayAccessContext(ArrayAccessContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermsVisitor ) return ((TermsVisitor<? extends T>)visitor).visitTwoDimArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThreeDimArrayAccessContext extends ArrayAccessContext {
		public Token id;
		public TermContext firstIndex;
		public TermContext secondtIndex;
		public TermContext thirdIndex;
		public TerminalNode ID() { return getToken(TermsParser.ID, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ThreeDimArrayAccessContext(ArrayAccessContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermsVisitor ) return ((TermsVisitor<? extends T>)visitor).visitThreeDimArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OneDimArrayAccessContext extends ArrayAccessContext {
		public Token id;
		public TermContext index;
		public TerminalNode ID() { return getToken(TermsParser.ID, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public OneDimArrayAccessContext(ArrayAccessContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TermsVisitor ) return ((TermsVisitor<? extends T>)visitor).visitOneDimArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arrayAccess);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new OneDimArrayAccessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				((OneDimArrayAccessContext)_localctx).id = match(ID);
				setState(105);
				match(T__16);
				setState(106);
				((OneDimArrayAccessContext)_localctx).index = term(0);
				setState(107);
				match(T__17);
				}
				break;
			case 2:
				_localctx = new TwoDimArrayAccessContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				((TwoDimArrayAccessContext)_localctx).id = match(ID);
				setState(110);
				match(T__16);
				setState(111);
				((TwoDimArrayAccessContext)_localctx).firstIndex = term(0);
				setState(112);
				match(T__17);
				setState(113);
				match(T__16);
				setState(114);
				((TwoDimArrayAccessContext)_localctx).secondIndex = term(0);
				setState(115);
				match(T__17);
				}
				break;
			case 3:
				_localctx = new ThreeDimArrayAccessContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				((ThreeDimArrayAccessContext)_localctx).id = match(ID);
				setState(118);
				match(T__16);
				setState(119);
				((ThreeDimArrayAccessContext)_localctx).firstIndex = term(0);
				setState(120);
				match(T__17);
				setState(121);
				match(T__16);
				setState(122);
				((ThreeDimArrayAccessContext)_localctx).secondtIndex = term(0);
				setState(123);
				match(T__17);
				setState(124);
				match(T__16);
				setState(125);
				((ThreeDimArrayAccessContext)_localctx).thirdIndex = term(0);
				setState(126);
				match(T__17);
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
		case 2:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		case 4:
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
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u0085\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\5\3\23\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4 \n\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\7\4(\n\4\f\4\16\4+\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5E\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6U\n\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6f\n\6\f\6\16\6i"+
		"\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0083\n\7\3\7\2\4\6\n\b\2\4\6\b\n"+
		"\f\2\2\2\u009a\2\16\3\2\2\2\4\22\3\2\2\2\6\37\3\2\2\2\bD\3\2\2\2\nT\3"+
		"\2\2\2\f\u0082\3\2\2\2\16\17\5\4\3\2\17\3\3\2\2\2\20\23\5\6\4\2\21\23"+
		"\5\n\6\2\22\20\3\2\2\2\22\21\3\2\2\2\23\5\3\2\2\2\24\25\b\4\1\2\25 \7"+
		"\32\2\2\26 \5\f\7\2\27 \5\b\5\2\30 \7\36\2\2\31\32\7\3\2\2\32\33\5\6\4"+
		"\2\33\34\7\4\2\2\34 \3\2\2\2\35\36\7\7\2\2\36 \5\6\4\3\37\24\3\2\2\2\37"+
		"\26\3\2\2\2\37\27\3\2\2\2\37\30\3\2\2\2\37\31\3\2\2\2\37\35\3\2\2\2 )"+
		"\3\2\2\2!\"\f\5\2\2\"#\7\5\2\2#(\5\6\4\6$%\f\4\2\2%&\7\6\2\2&(\5\6\4\5"+
		"\'!\3\2\2\2\'$\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\7\3\2\2\2+)\3\2"+
		"\2\2,-\5\n\6\2-.\7\b\2\2./\5\n\6\2/E\3\2\2\2\60\61\5\n\6\2\61\62\7\t\2"+
		"\2\62\63\5\n\6\2\63E\3\2\2\2\64\65\5\n\6\2\65\66\7\n\2\2\66\67\5\n\6\2"+
		"\67E\3\2\2\289\5\n\6\29:\7\13\2\2:;\5\n\6\2;E\3\2\2\2<=\5\n\6\2=>\7\f"+
		"\2\2>?\5\n\6\2?E\3\2\2\2@A\5\n\6\2AB\7\r\2\2BC\5\n\6\2CE\3\2\2\2D,\3\2"+
		"\2\2D\60\3\2\2\2D\64\3\2\2\2D8\3\2\2\2D<\3\2\2\2D@\3\2\2\2E\t\3\2\2\2"+
		"FG\b\6\1\2GH\7\16\2\2HU\5\n\6\20IJ\7\3\2\2JK\5\n\6\2KL\7\4\2\2LU\3\2\2"+
		"\2MU\7\34\2\2NU\7\33\2\2OU\7 \2\2PU\7!\2\2QU\7\32\2\2RU\7\35\2\2SU\5\f"+
		"\7\2TF\3\2\2\2TI\3\2\2\2TM\3\2\2\2TN\3\2\2\2TO\3\2\2\2TP\3\2\2\2TQ\3\2"+
		"\2\2TR\3\2\2\2TS\3\2\2\2Ug\3\2\2\2VW\f\17\2\2WX\7\17\2\2Xf\5\n\6\20YZ"+
		"\f\16\2\2Z[\7\20\2\2[f\5\n\6\17\\]\f\r\2\2]^\7\16\2\2^f\5\n\6\16_`\f\f"+
		"\2\2`a\7\21\2\2af\5\n\6\rbc\f\13\2\2cd\7\22\2\2df\5\n\6\feV\3\2\2\2eY"+
		"\3\2\2\2e\\\3\2\2\2e_\3\2\2\2eb\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2"+
		"h\13\3\2\2\2ig\3\2\2\2jk\7\32\2\2kl\7\23\2\2lm\5\n\6\2mn\7\24\2\2n\u0083"+
		"\3\2\2\2op\7\32\2\2pq\7\23\2\2qr\5\n\6\2rs\7\24\2\2st\7\23\2\2tu\5\n\6"+
		"\2uv\7\24\2\2v\u0083\3\2\2\2wx\7\32\2\2xy\7\23\2\2yz\5\n\6\2z{\7\24\2"+
		"\2{|\7\23\2\2|}\5\n\6\2}~\7\24\2\2~\177\7\23\2\2\177\u0080\5\n\6\2\u0080"+
		"\u0081\7\24\2\2\u0081\u0083\3\2\2\2\u0082j\3\2\2\2\u0082o\3\2\2\2\u0082"+
		"w\3\2\2\2\u0083\r\3\2\2\2\13\22\37\')DTeg\u0082";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}