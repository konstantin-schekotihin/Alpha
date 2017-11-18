// Generated from C:/projects/Alpha/src/main/antlr/at/ac/tuwien/kr/alpha/antlr\ASPCore2.g4 by ANTLR 4.7
package at.ac.tuwien.kr.alpha.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ASPCore2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ANONYMOUS_VARIABLE=1, DOT=2, COMMA=3, QUERY_MARK=4, COLON=5, SEMICOLON=6, 
		OR=7, NAF=8, CONS=9, WCONS=10, PLUS=11, MINUS=12, TIMES=13, DIV=14, AT=15, 
		SHARP=16, AMPERSAND=17, PAREN_OPEN=18, PAREN_CLOSE=19, SQUARE_OPEN=20, 
		SQUARE_CLOSE=21, CURLY_OPEN=22, CURLY_CLOSE=23, EQUAL=24, UNEQUAL=25, 
		LESS=26, GREATER=27, LESS_OR_EQ=28, GREATER_OR_EQ=29, AGGREGATE_COUNT=30, 
		AGGREGATE_MAX=31, AGGREGATE_MIN=32, AGGREGATE_SUM=33, PREDICATE_HEURISTIC=34, 
		ID=35, VARIABLE=36, NUMBER=37, STRING=38, COMMENT=39, MULTI_LINE_COMMEN=40, 
		BLANK=41;
	public static final int
		RULE_program = 0, RULE_statements = 1, RULE_query = 2, RULE_statement = 3, 
		RULE_head = 4, RULE_body = 5, RULE_disjunction = 6, RULE_choice = 7, RULE_choice_elements = 8, 
		RULE_choice_element = 9, RULE_heuristic = 10, RULE_aggregate = 11, RULE_aggregate_elements = 12, 
		RULE_aggregate_element = 13, RULE_aggregate_function = 14, RULE_weight_at_level = 15, 
		RULE_naf_literals = 16, RULE_naf_literal = 17, RULE_classical_literal = 18, 
		RULE_builtin_atom = 19, RULE_binop = 20, RULE_terms = 21, RULE_term = 22, 
		RULE_arithop = 23, RULE_interval = 24, RULE_external_atom = 25, RULE_gringo_sharp = 26, 
		RULE_basic_terms = 27, RULE_basic_term = 28, RULE_ground_term = 29, RULE_variable_term = 30, 
		RULE_answer_set = 31, RULE_answer_sets = 32;
	public static final String[] ruleNames = {
		"program", "statements", "query", "statement", "head", "body", "disjunction", 
		"choice", "choice_elements", "choice_element", "heuristic", "aggregate", 
		"aggregate_elements", "aggregate_element", "aggregate_function", "weight_at_level", 
		"naf_literals", "naf_literal", "classical_literal", "builtin_atom", "binop", 
		"terms", "term", "arithop", "interval", "external_atom", "gringo_sharp", 
		"basic_terms", "basic_term", "ground_term", "variable_term", "answer_set", 
		"answer_sets"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'_'", "'.'", "','", "'?'", "':'", "';'", "'|'", "'not'", "':-'", 
		"':~'", "'+'", "'-'", "'*'", "'/'", "'@'", "'#'", "'&'", "'('", "')'", 
		"'['", "']'", "'{'", "'}'", "'='", null, "'<'", "'>'", "'<='", "'>='", 
		"'#count'", "'#max'", "'#min'", "'#sum'", "'_h'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ANONYMOUS_VARIABLE", "DOT", "COMMA", "QUERY_MARK", "COLON", "SEMICOLON", 
		"OR", "NAF", "CONS", "WCONS", "PLUS", "MINUS", "TIMES", "DIV", "AT", "SHARP", 
		"AMPERSAND", "PAREN_OPEN", "PAREN_CLOSE", "SQUARE_OPEN", "SQUARE_CLOSE", 
		"CURLY_OPEN", "CURLY_CLOSE", "EQUAL", "UNEQUAL", "LESS", "GREATER", "LESS_OR_EQ", 
		"GREATER_OR_EQ", "AGGREGATE_COUNT", "AGGREGATE_MAX", "AGGREGATE_MIN", 
		"AGGREGATE_SUM", "PREDICATE_HEURISTIC", "ID", "VARIABLE", "NUMBER", "STRING", 
		"COMMENT", "MULTI_LINE_COMMEN", "BLANK"
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
	public String getGrammarFileName() { return "ASPCore2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ASPCore2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(66);
				statements();
				}
				break;
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS || _la==ID) {
				{
				setState(69);
				query();
				}
			}

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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(72);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(75); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class QueryContext extends ParserRuleContext {
		public Classical_literalContext classical_literal() {
			return getRuleContext(Classical_literalContext.class,0);
		}
		public TerminalNode QUERY_MARK() { return getToken(ASPCore2Parser.QUERY_MARK, 0); }
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			classical_literal();
			setState(78);
			match(QUERY_MARK);
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
		public boolean hr = false;
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
			this.hr = ctx.hr;
		}
	}
	public static class Statement_factContext extends StatementContext {
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ASPCore2Parser.DOT, 0); }
		public Statement_factContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterStatement_fact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitStatement_fact(this);
		}
	}
	public static class Statement_gringoSharpContext extends StatementContext {
		public Gringo_sharpContext gringo_sharp() {
			return getRuleContext(Gringo_sharpContext.class,0);
		}
		public Statement_gringoSharpContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterStatement_gringoSharp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitStatement_gringoSharp(this);
		}
	}
	public static class Statement_ruleContext extends StatementContext {
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public TerminalNode CONS() { return getToken(ASPCore2Parser.CONS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ASPCore2Parser.DOT, 0); }
		public Statement_ruleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterStatement_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitStatement_rule(this);
		}
	}
	public static class Statement_weightConstraintContext extends StatementContext {
		public TerminalNode WCONS() { return getToken(ASPCore2Parser.WCONS, 0); }
		public TerminalNode DOT() { return getToken(ASPCore2Parser.DOT, 0); }
		public TerminalNode SQUARE_OPEN() { return getToken(ASPCore2Parser.SQUARE_OPEN, 0); }
		public Weight_at_levelContext weight_at_level() {
			return getRuleContext(Weight_at_levelContext.class,0);
		}
		public TerminalNode SQUARE_CLOSE() { return getToken(ASPCore2Parser.SQUARE_CLOSE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Statement_weightConstraintContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterStatement_weightConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitStatement_weightConstraint(this);
		}
	}
	public static class Statement_constraintContext extends StatementContext {
		public TerminalNode CONS() { return getToken(ASPCore2Parser.CONS, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ASPCore2Parser.DOT, 0); }
		public Statement_constraintContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterStatement_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitStatement_constraint(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new Statement_factContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				head();
				setState(81);
				match(DOT);
				}
				break;
			case 2:
				_localctx = new Statement_constraintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(CONS);
				setState(84);
				body();
				setState(85);
				match(DOT);
				}
				break;
			case 3:
				_localctx = new Statement_ruleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				head();
				setState(88);
				match(CONS);
				setState(89);
				body();
				setState(90);
				match(DOT);
				}
				break;
			case 4:
				_localctx = new Statement_weightConstraintContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				match(WCONS);
				setState(94);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(93);
					body();
					}
					break;
				}
				setState(96);
				match(DOT);
				setState(97);
				match(SQUARE_OPEN);
				setState(98);
				weight_at_level();
				setState(99);
				match(SQUARE_CLOSE);
				}
				break;
			case 5:
				_localctx = new Statement_gringoSharpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				gringo_sharp();
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

	public static class HeadContext extends ParserRuleContext {
		public DisjunctionContext disjunction() {
			return getRuleContext(DisjunctionContext.class,0);
		}
		public ChoiceContext choice() {
			return getRuleContext(ChoiceContext.class,0);
		}
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitHead(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_head);
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				disjunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				choice();
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

	public static class BodyContext extends ParserRuleContext {
		public Naf_literalContext naf_literal() {
			return getRuleContext(Naf_literalContext.class,0);
		}
		public AggregateContext aggregate() {
			return getRuleContext(AggregateContext.class,0);
		}
		public HeuristicContext heuristic() {
			return getRuleContext(HeuristicContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ASPCore2Parser.COMMA, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode NAF() { return getToken(ASPCore2Parser.NAF, 0); }
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(108);
				naf_literal();
				}
				break;
			case 2:
				{
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAF) {
					{
					setState(109);
					match(NAF);
					}
				}

				setState(112);
				aggregate();
				}
				break;
			case 3:
				{
				setState(113);
				heuristic();
				}
				break;
			}
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(116);
				match(COMMA);
				setState(117);
				body();
				}
			}

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

	public static class DisjunctionContext extends ParserRuleContext {
		public Classical_literalContext classical_literal() {
			return getRuleContext(Classical_literalContext.class,0);
		}
		public TerminalNode OR() { return getToken(ASPCore2Parser.OR, 0); }
		public DisjunctionContext disjunction() {
			return getRuleContext(DisjunctionContext.class,0);
		}
		public DisjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterDisjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitDisjunction(this);
		}
	}

	public final DisjunctionContext disjunction() throws RecognitionException {
		DisjunctionContext _localctx = new DisjunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_disjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			classical_literal();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(121);
				match(OR);
				setState(122);
				disjunction();
				}
			}

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

	public static class ChoiceContext extends ParserRuleContext {
		public TermContext lt;
		public BinopContext lop;
		public BinopContext uop;
		public TermContext ut;
		public TerminalNode CURLY_OPEN() { return getToken(ASPCore2Parser.CURLY_OPEN, 0); }
		public TerminalNode CURLY_CLOSE() { return getToken(ASPCore2Parser.CURLY_CLOSE, 0); }
		public Choice_elementsContext choice_elements() {
			return getRuleContext(Choice_elementsContext.class,0);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<BinopContext> binop() {
			return getRuleContexts(BinopContext.class);
		}
		public BinopContext binop(int i) {
			return getRuleContext(BinopContext.class,i);
		}
		public ChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitChoice(this);
		}
	}

	public final ChoiceContext choice() throws RecognitionException {
		ChoiceContext _localctx = new ChoiceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_choice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << MINUS) | (1L << PAREN_OPEN) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				setState(125);
				((ChoiceContext)_localctx).lt = term(0);
				setState(126);
				((ChoiceContext)_localctx).lop = binop();
				}
			}

			setState(130);
			match(CURLY_OPEN);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS || _la==ID) {
				{
				setState(131);
				choice_elements();
				}
			}

			setState(134);
			match(CURLY_CLOSE);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << UNEQUAL) | (1L << LESS) | (1L << GREATER) | (1L << LESS_OR_EQ) | (1L << GREATER_OR_EQ))) != 0)) {
				{
				setState(135);
				((ChoiceContext)_localctx).uop = binop();
				setState(136);
				((ChoiceContext)_localctx).ut = term(0);
				}
			}

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

	public static class Choice_elementsContext extends ParserRuleContext {
		public Choice_elementContext choice_element() {
			return getRuleContext(Choice_elementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ASPCore2Parser.SEMICOLON, 0); }
		public Choice_elementsContext choice_elements() {
			return getRuleContext(Choice_elementsContext.class,0);
		}
		public Choice_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choice_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterChoice_elements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitChoice_elements(this);
		}
	}

	public final Choice_elementsContext choice_elements() throws RecognitionException {
		Choice_elementsContext _localctx = new Choice_elementsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_choice_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			choice_element();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(141);
				match(SEMICOLON);
				setState(142);
				choice_elements();
				}
			}

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

	public static class Choice_elementContext extends ParserRuleContext {
		public Classical_literalContext classical_literal() {
			return getRuleContext(Classical_literalContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ASPCore2Parser.COLON, 0); }
		public Naf_literalsContext naf_literals() {
			return getRuleContext(Naf_literalsContext.class,0);
		}
		public Choice_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choice_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterChoice_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitChoice_element(this);
		}
	}

	public final Choice_elementContext choice_element() throws RecognitionException {
		Choice_elementContext _localctx = new Choice_elementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_choice_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			classical_literal();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(146);
				match(COLON);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << NAF) | (1L << MINUS) | (1L << AMPERSAND) | (1L << PAREN_OPEN) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING))) != 0)) {
					{
					setState(147);
					naf_literals();
					}
				}

				}
			}

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

	public static class HeuristicContext extends ParserRuleContext {
		public TerminalNode PREDICATE_HEURISTIC() { return getToken(ASPCore2Parser.PREDICATE_HEURISTIC, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(ASPCore2Parser.PAREN_OPEN, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(ASPCore2Parser.PAREN_CLOSE, 0); }
		public HeuristicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heuristic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterHeuristic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitHeuristic(this);
		}
	}

	public final HeuristicContext heuristic() throws RecognitionException {
		HeuristicContext _localctx = new HeuristicContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_heuristic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			if (!(!((StatementContext)getInvokingContext(3)).hr)) throw new FailedPredicateException(this, "!$statement::hr");
			setState(153);
			match(PREDICATE_HEURISTIC);
			setState(154);
			match(PAREN_OPEN);
			setState(155);
			terms();
			setState(156);
			match(PAREN_CLOSE);
			((StatementContext)getInvokingContext(3)).hr = true;
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

	public static class AggregateContext extends ParserRuleContext {
		public Aggregate_functionContext aggregate_function() {
			return getRuleContext(Aggregate_functionContext.class,0);
		}
		public TerminalNode CURLY_OPEN() { return getToken(ASPCore2Parser.CURLY_OPEN, 0); }
		public Aggregate_elementsContext aggregate_elements() {
			return getRuleContext(Aggregate_elementsContext.class,0);
		}
		public TerminalNode CURLY_CLOSE() { return getToken(ASPCore2Parser.CURLY_CLOSE, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<BinopContext> binop() {
			return getRuleContexts(BinopContext.class);
		}
		public BinopContext binop(int i) {
			return getRuleContext(BinopContext.class,i);
		}
		public AggregateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterAggregate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitAggregate(this);
		}
	}

	public final AggregateContext aggregate() throws RecognitionException {
		AggregateContext _localctx = new AggregateContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_aggregate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << MINUS) | (1L << PAREN_OPEN) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				setState(159);
				term(0);
				setState(160);
				binop();
				}
			}

			setState(164);
			aggregate_function();
			setState(165);
			match(CURLY_OPEN);
			setState(166);
			aggregate_elements();
			setState(167);
			match(CURLY_CLOSE);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << UNEQUAL) | (1L << LESS) | (1L << GREATER) | (1L << LESS_OR_EQ) | (1L << GREATER_OR_EQ))) != 0)) {
				{
				setState(168);
				binop();
				setState(169);
				term(0);
				}
			}

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

	public static class Aggregate_elementsContext extends ParserRuleContext {
		public Aggregate_elementContext aggregate_element() {
			return getRuleContext(Aggregate_elementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ASPCore2Parser.SEMICOLON, 0); }
		public Aggregate_elementsContext aggregate_elements() {
			return getRuleContext(Aggregate_elementsContext.class,0);
		}
		public Aggregate_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterAggregate_elements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitAggregate_elements(this);
		}
	}

	public final Aggregate_elementsContext aggregate_elements() throws RecognitionException {
		Aggregate_elementsContext _localctx = new Aggregate_elementsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_aggregate_elements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			aggregate_element();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(174);
				match(SEMICOLON);
				setState(175);
				aggregate_elements();
				}
			}

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

	public static class Aggregate_elementContext extends ParserRuleContext {
		public Basic_termsContext basic_terms() {
			return getRuleContext(Basic_termsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ASPCore2Parser.COLON, 0); }
		public Naf_literalsContext naf_literals() {
			return getRuleContext(Naf_literalsContext.class,0);
		}
		public Aggregate_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterAggregate_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitAggregate_element(this);
		}
	}

	public final Aggregate_elementContext aggregate_element() throws RecognitionException {
		Aggregate_elementContext _localctx = new Aggregate_elementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_aggregate_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << MINUS) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				setState(178);
				basic_terms();
				}
			}

			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(181);
				match(COLON);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << NAF) | (1L << MINUS) | (1L << AMPERSAND) | (1L << PAREN_OPEN) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING))) != 0)) {
					{
					setState(182);
					naf_literals();
					}
				}

				}
			}

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

	public static class Aggregate_functionContext extends ParserRuleContext {
		public TerminalNode AGGREGATE_COUNT() { return getToken(ASPCore2Parser.AGGREGATE_COUNT, 0); }
		public TerminalNode AGGREGATE_MAX() { return getToken(ASPCore2Parser.AGGREGATE_MAX, 0); }
		public TerminalNode AGGREGATE_MIN() { return getToken(ASPCore2Parser.AGGREGATE_MIN, 0); }
		public TerminalNode AGGREGATE_SUM() { return getToken(ASPCore2Parser.AGGREGATE_SUM, 0); }
		public Aggregate_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterAggregate_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitAggregate_function(this);
		}
	}

	public final Aggregate_functionContext aggregate_function() throws RecognitionException {
		Aggregate_functionContext _localctx = new Aggregate_functionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_aggregate_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AGGREGATE_COUNT) | (1L << AGGREGATE_MAX) | (1L << AGGREGATE_MIN) | (1L << AGGREGATE_SUM))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Weight_at_levelContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode AT() { return getToken(ASPCore2Parser.AT, 0); }
		public TerminalNode COMMA() { return getToken(ASPCore2Parser.COMMA, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public Weight_at_levelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weight_at_level; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterWeight_at_level(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitWeight_at_level(this);
		}
	}

	public final Weight_at_levelContext weight_at_level() throws RecognitionException {
		Weight_at_levelContext _localctx = new Weight_at_levelContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_weight_at_level);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			term(0);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(190);
				match(AT);
				setState(191);
				term(0);
				}
			}

			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(194);
				match(COMMA);
				setState(195);
				terms();
				}
			}

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

	public static class Naf_literalsContext extends ParserRuleContext {
		public Naf_literalContext naf_literal() {
			return getRuleContext(Naf_literalContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ASPCore2Parser.COMMA, 0); }
		public Naf_literalsContext naf_literals() {
			return getRuleContext(Naf_literalsContext.class,0);
		}
		public Naf_literalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_naf_literals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterNaf_literals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitNaf_literals(this);
		}
	}

	public final Naf_literalsContext naf_literals() throws RecognitionException {
		Naf_literalsContext _localctx = new Naf_literalsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_naf_literals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			naf_literal();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(199);
				match(COMMA);
				setState(200);
				naf_literals();
				}
			}

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

	public static class Naf_literalContext extends ParserRuleContext {
		public External_atomContext external_atom() {
			return getRuleContext(External_atomContext.class,0);
		}
		public Classical_literalContext classical_literal() {
			return getRuleContext(Classical_literalContext.class,0);
		}
		public Builtin_atomContext builtin_atom() {
			return getRuleContext(Builtin_atomContext.class,0);
		}
		public TerminalNode NAF() { return getToken(ASPCore2Parser.NAF, 0); }
		public Naf_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_naf_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterNaf_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitNaf_literal(this);
		}
	}

	public final Naf_literalContext naf_literal() throws RecognitionException {
		Naf_literalContext _localctx = new Naf_literalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_naf_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAF) {
				{
				setState(203);
				match(NAF);
				}
			}

			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(206);
				external_atom();
				}
				break;
			case 2:
				{
				setState(207);
				classical_literal();
				}
				break;
			case 3:
				{
				setState(208);
				builtin_atom();
				}
				break;
			}
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

	public static class Classical_literalContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ASPCore2Parser.ID, 0); }
		public TerminalNode MINUS() { return getToken(ASPCore2Parser.MINUS, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(ASPCore2Parser.PAREN_OPEN, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(ASPCore2Parser.PAREN_CLOSE, 0); }
		public Classical_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classical_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterClassical_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitClassical_literal(this);
		}
	}

	public final Classical_literalContext classical_literal() throws RecognitionException {
		Classical_literalContext _localctx = new Classical_literalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_classical_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(211);
				match(MINUS);
				}
			}

			setState(214);
			match(ID);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAREN_OPEN) {
				{
				setState(215);
				match(PAREN_OPEN);
				setState(216);
				terms();
				setState(217);
				match(PAREN_CLOSE);
				}
			}

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

	public static class Builtin_atomContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public Builtin_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtin_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterBuiltin_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitBuiltin_atom(this);
		}
	}

	public final Builtin_atomContext builtin_atom() throws RecognitionException {
		Builtin_atomContext _localctx = new Builtin_atomContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_builtin_atom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			term(0);
			setState(222);
			binop();
			setState(223);
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

	public static class BinopContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(ASPCore2Parser.EQUAL, 0); }
		public TerminalNode UNEQUAL() { return getToken(ASPCore2Parser.UNEQUAL, 0); }
		public TerminalNode LESS() { return getToken(ASPCore2Parser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(ASPCore2Parser.GREATER, 0); }
		public TerminalNode LESS_OR_EQ() { return getToken(ASPCore2Parser.LESS_OR_EQ, 0); }
		public TerminalNode GREATER_OR_EQ() { return getToken(ASPCore2Parser.GREATER_OR_EQ, 0); }
		public BinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitBinop(this);
		}
	}

	public final BinopContext binop() throws RecognitionException {
		BinopContext _localctx = new BinopContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_binop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << UNEQUAL) | (1L << LESS) | (1L << GREATER) | (1L << LESS_OR_EQ) | (1L << GREATER_OR_EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class TermsContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ASPCore2Parser.COMMA, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public TermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterTerms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitTerms(this);
		}
	}

	public final TermsContext terms() throws RecognitionException {
		TermsContext _localctx = new TermsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_terms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			term(0);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(228);
				match(COMMA);
				setState(229);
				terms();
				}
			}

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
	public static class Term_numberContext extends TermContext {
		public TerminalNode NUMBER() { return getToken(ASPCore2Parser.NUMBER, 0); }
		public Term_numberContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterTerm_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitTerm_number(this);
		}
	}
	public static class Term_anonymousVariableContext extends TermContext {
		public TerminalNode ANONYMOUS_VARIABLE() { return getToken(ASPCore2Parser.ANONYMOUS_VARIABLE, 0); }
		public Term_anonymousVariableContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterTerm_anonymousVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitTerm_anonymousVariable(this);
		}
	}
	public static class Term_variableContext extends TermContext {
		public TerminalNode VARIABLE() { return getToken(ASPCore2Parser.VARIABLE, 0); }
		public Term_variableContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterTerm_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitTerm_variable(this);
		}
	}
	public static class Term_minusTermContext extends TermContext {
		public TerminalNode MINUS() { return getToken(ASPCore2Parser.MINUS, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Term_minusTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterTerm_minusTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitTerm_minusTerm(this);
		}
	}
	public static class Term_binopTermContext extends TermContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ArithopContext arithop() {
			return getRuleContext(ArithopContext.class,0);
		}
		public Term_binopTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterTerm_binopTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitTerm_binopTerm(this);
		}
	}
	public static class Term_constContext extends TermContext {
		public TerminalNode ID() { return getToken(ASPCore2Parser.ID, 0); }
		public Term_constContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterTerm_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitTerm_const(this);
		}
	}
	public static class Term_funcContext extends TermContext {
		public TerminalNode ID() { return getToken(ASPCore2Parser.ID, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(ASPCore2Parser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(ASPCore2Parser.PAREN_CLOSE, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public Term_funcContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterTerm_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitTerm_func(this);
		}
	}
	public static class Term_stringContext extends TermContext {
		public TerminalNode STRING() { return getToken(ASPCore2Parser.STRING, 0); }
		public Term_stringContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterTerm_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitTerm_string(this);
		}
	}
	public static class Term_parenthesisedTermContext extends TermContext {
		public TerminalNode PAREN_OPEN() { return getToken(ASPCore2Parser.PAREN_OPEN, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(ASPCore2Parser.PAREN_CLOSE, 0); }
		public Term_parenthesisedTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterTerm_parenthesisedTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitTerm_parenthesisedTerm(this);
		}
	}
	public static class Term_intervalContext extends TermContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public Term_intervalContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterTerm_interval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitTerm_interval(this);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				_localctx = new Term_constContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(233);
				match(ID);
				}
				break;
			case 2:
				{
				_localctx = new Term_funcContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(234);
				match(ID);
				{
				setState(235);
				match(PAREN_OPEN);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << MINUS) | (1L << PAREN_OPEN) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING))) != 0)) {
					{
					setState(236);
					terms();
					}
				}

				setState(239);
				match(PAREN_CLOSE);
				}
				}
				break;
			case 3:
				{
				_localctx = new Term_numberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(240);
				match(NUMBER);
				}
				break;
			case 4:
				{
				_localctx = new Term_stringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(241);
				match(STRING);
				}
				break;
			case 5:
				{
				_localctx = new Term_variableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(242);
				match(VARIABLE);
				}
				break;
			case 6:
				{
				_localctx = new Term_anonymousVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243);
				match(ANONYMOUS_VARIABLE);
				}
				break;
			case 7:
				{
				_localctx = new Term_parenthesisedTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(244);
				match(PAREN_OPEN);
				setState(245);
				term(0);
				setState(246);
				match(PAREN_CLOSE);
				}
				break;
			case 8:
				{
				_localctx = new Term_minusTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(248);
				match(MINUS);
				setState(249);
				term(3);
				}
				break;
			case 9:
				{
				_localctx = new Term_intervalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(250);
				interval();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Term_binopTermContext(new TermContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(253);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(254);
					arithop();
					setState(255);
					term(3);
					}
					} 
				}
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class ArithopContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(ASPCore2Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ASPCore2Parser.MINUS, 0); }
		public TerminalNode TIMES() { return getToken(ASPCore2Parser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(ASPCore2Parser.DIV, 0); }
		public ArithopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterArithop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitArithop(this);
		}
	}

	public final ArithopContext arithop() throws RecognitionException {
		ArithopContext _localctx = new ArithopContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arithop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIV))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class IntervalContext extends ParserRuleContext {
		public Token lower;
		public Token upper;
		public List<TerminalNode> DOT() { return getTokens(ASPCore2Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ASPCore2Parser.DOT, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ASPCore2Parser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ASPCore2Parser.NUMBER, i);
		}
		public List<TerminalNode> VARIABLE() { return getTokens(ASPCore2Parser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(ASPCore2Parser.VARIABLE, i);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitInterval(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			((IntervalContext)_localctx).lower = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==VARIABLE || _la==NUMBER) ) {
				((IntervalContext)_localctx).lower = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(265);
			match(DOT);
			setState(266);
			match(DOT);
			setState(267);
			((IntervalContext)_localctx).upper = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==VARIABLE || _la==NUMBER) ) {
				((IntervalContext)_localctx).upper = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class External_atomContext extends ParserRuleContext {
		public TermsContext input;
		public TermsContext output;
		public TerminalNode AMPERSAND() { return getToken(ASPCore2Parser.AMPERSAND, 0); }
		public TerminalNode ID() { return getToken(ASPCore2Parser.ID, 0); }
		public TerminalNode MINUS() { return getToken(ASPCore2Parser.MINUS, 0); }
		public TerminalNode SQUARE_OPEN() { return getToken(ASPCore2Parser.SQUARE_OPEN, 0); }
		public TerminalNode SQUARE_CLOSE() { return getToken(ASPCore2Parser.SQUARE_CLOSE, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(ASPCore2Parser.PAREN_OPEN, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(ASPCore2Parser.PAREN_CLOSE, 0); }
		public List<TermsContext> terms() {
			return getRuleContexts(TermsContext.class);
		}
		public TermsContext terms(int i) {
			return getRuleContext(TermsContext.class,i);
		}
		public External_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterExternal_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitExternal_atom(this);
		}
	}

	public final External_atomContext external_atom() throws RecognitionException {
		External_atomContext _localctx = new External_atomContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_external_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(269);
				match(MINUS);
				}
			}

			setState(272);
			match(AMPERSAND);
			setState(273);
			match(ID);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SQUARE_OPEN) {
				{
				setState(274);
				match(SQUARE_OPEN);
				setState(275);
				((External_atomContext)_localctx).input = terms();
				setState(276);
				match(SQUARE_CLOSE);
				}
			}

			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAREN_OPEN) {
				{
				setState(280);
				match(PAREN_OPEN);
				setState(281);
				((External_atomContext)_localctx).output = terms();
				setState(282);
				match(PAREN_CLOSE);
				}
			}

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

	public static class Gringo_sharpContext extends ParserRuleContext {
		public TerminalNode SHARP() { return getToken(ASPCore2Parser.SHARP, 0); }
		public List<TerminalNode> DOT() { return getTokens(ASPCore2Parser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ASPCore2Parser.DOT, i);
		}
		public Gringo_sharpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gringo_sharp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterGringo_sharp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitGringo_sharp(this);
		}
	}

	public final Gringo_sharpContext gringo_sharp() throws RecognitionException {
		Gringo_sharpContext _localctx = new Gringo_sharpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_gringo_sharp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(SHARP);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANONYMOUS_VARIABLE) | (1L << COMMA) | (1L << QUERY_MARK) | (1L << COLON) | (1L << SEMICOLON) | (1L << OR) | (1L << NAF) | (1L << CONS) | (1L << WCONS) | (1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIV) | (1L << AT) | (1L << SHARP) | (1L << AMPERSAND) | (1L << PAREN_OPEN) | (1L << PAREN_CLOSE) | (1L << SQUARE_OPEN) | (1L << SQUARE_CLOSE) | (1L << CURLY_OPEN) | (1L << CURLY_CLOSE) | (1L << EQUAL) | (1L << UNEQUAL) | (1L << LESS) | (1L << GREATER) | (1L << LESS_OR_EQ) | (1L << GREATER_OR_EQ) | (1L << AGGREGATE_COUNT) | (1L << AGGREGATE_MAX) | (1L << AGGREGATE_MIN) | (1L << AGGREGATE_SUM) | (1L << PREDICATE_HEURISTIC) | (1L << ID) | (1L << VARIABLE) | (1L << NUMBER) | (1L << STRING) | (1L << COMMENT) | (1L << MULTI_LINE_COMMEN) | (1L << BLANK))) != 0)) {
				{
				{
				setState(287);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==DOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
			match(DOT);
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

	public static class Basic_termsContext extends ParserRuleContext {
		public Basic_termContext basic_term() {
			return getRuleContext(Basic_termContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ASPCore2Parser.COMMA, 0); }
		public Basic_termsContext basic_terms() {
			return getRuleContext(Basic_termsContext.class,0);
		}
		public Basic_termsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterBasic_terms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitBasic_terms(this);
		}
	}

	public final Basic_termsContext basic_terms() throws RecognitionException {
		Basic_termsContext _localctx = new Basic_termsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_basic_terms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			basic_term();
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(296);
				match(COMMA);
				setState(297);
				basic_terms();
				}
			}

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

	public static class Basic_termContext extends ParserRuleContext {
		public Ground_termContext ground_term() {
			return getRuleContext(Ground_termContext.class,0);
		}
		public Variable_termContext variable_term() {
			return getRuleContext(Variable_termContext.class,0);
		}
		public Basic_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterBasic_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitBasic_term(this);
		}
	}

	public final Basic_termContext basic_term() throws RecognitionException {
		Basic_termContext _localctx = new Basic_termContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_basic_term);
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case ID:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				ground_term();
				}
				break;
			case ANONYMOUS_VARIABLE:
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				variable_term();
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

	public static class Ground_termContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ASPCore2Parser.ID, 0); }
		public TerminalNode STRING() { return getToken(ASPCore2Parser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(ASPCore2Parser.NUMBER, 0); }
		public TerminalNode MINUS() { return getToken(ASPCore2Parser.MINUS, 0); }
		public Ground_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ground_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterGround_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitGround_term(this);
		}
	}

	public final Ground_termContext ground_term() throws RecognitionException {
		Ground_termContext _localctx = new Ground_termContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ground_term);
		int _la;
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				match(ID);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(STRING);
				}
				break;
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(306);
					match(MINUS);
					}
				}

				setState(309);
				match(NUMBER);
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

	public static class Variable_termContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(ASPCore2Parser.VARIABLE, 0); }
		public TerminalNode ANONYMOUS_VARIABLE() { return getToken(ASPCore2Parser.ANONYMOUS_VARIABLE, 0); }
		public Variable_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterVariable_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitVariable_term(this);
		}
	}

	public final Variable_termContext variable_term() throws RecognitionException {
		Variable_termContext _localctx = new Variable_termContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_variable_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_la = _input.LA(1);
			if ( !(_la==ANONYMOUS_VARIABLE || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Answer_setContext extends ParserRuleContext {
		public TerminalNode CURLY_OPEN() { return getToken(ASPCore2Parser.CURLY_OPEN, 0); }
		public TerminalNode CURLY_CLOSE() { return getToken(ASPCore2Parser.CURLY_CLOSE, 0); }
		public List<Classical_literalContext> classical_literal() {
			return getRuleContexts(Classical_literalContext.class);
		}
		public Classical_literalContext classical_literal(int i) {
			return getRuleContext(Classical_literalContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ASPCore2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ASPCore2Parser.COMMA, i);
		}
		public Answer_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answer_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterAnswer_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitAnswer_set(this);
		}
	}

	public final Answer_setContext answer_set() throws RecognitionException {
		Answer_setContext _localctx = new Answer_setContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_answer_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(CURLY_OPEN);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS || _la==ID) {
				{
				setState(315);
				classical_literal();
				}
			}

			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(318);
				match(COMMA);
				setState(319);
				classical_literal();
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
			match(CURLY_CLOSE);
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

	public static class Answer_setsContext extends ParserRuleContext {
		public List<Answer_setContext> answer_set() {
			return getRuleContexts(Answer_setContext.class);
		}
		public Answer_setContext answer_set(int i) {
			return getRuleContext(Answer_setContext.class,i);
		}
		public Answer_setsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answer_sets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).enterAnswer_sets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASPCore2Listener ) ((ASPCore2Listener)listener).exitAnswer_sets(this);
		}
	}

	public final Answer_setsContext answer_sets() throws RecognitionException {
		Answer_setsContext _localctx = new Answer_setsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_answer_sets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CURLY_OPEN) {
				{
				{
				setState(327);
				answer_set();
				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		case 10:
			return heuristic_sempred((HeuristicContext)_localctx, predIndex);
		case 22:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean heuristic_sempred(HeuristicContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return !((StatementContext)getInvokingContext(3)).hr;
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0150\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\5\2F\n\2\3\2\5\2I\n\2\3\3\6\3L\n\3\r\3\16\3M\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5a\n\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5i\n\5\3\6\3\6\5\6m\n\6\3\7\3\7\5\7q\n\7\3\7"+
		"\3\7\5\7u\n\7\3\7\3\7\5\7y\n\7\3\b\3\b\3\b\5\b~\n\b\3\t\3\t\3\t\5\t\u0083"+
		"\n\t\3\t\3\t\5\t\u0087\n\t\3\t\3\t\3\t\3\t\5\t\u008d\n\t\3\n\3\n\3\n\5"+
		"\n\u0092\n\n\3\13\3\13\3\13\5\13\u0097\n\13\5\13\u0099\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00a5\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00ae\n\r\3\16\3\16\3\16\5\16\u00b3\n\16\3\17\5\17\u00b6\n\17\3"+
		"\17\3\17\5\17\u00ba\n\17\5\17\u00bc\n\17\3\20\3\20\3\21\3\21\3\21\5\21"+
		"\u00c3\n\21\3\21\3\21\5\21\u00c7\n\21\3\22\3\22\3\22\5\22\u00cc\n\22\3"+
		"\23\5\23\u00cf\n\23\3\23\3\23\3\23\5\23\u00d4\n\23\3\24\5\24\u00d7\n\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u00de\n\24\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\27\5\27\u00e9\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u00f0\n"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00fe"+
		"\n\30\3\30\3\30\3\30\3\30\7\30\u0104\n\30\f\30\16\30\u0107\13\30\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\33\5\33\u0111\n\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u0119\n\33\3\33\3\33\3\33\3\33\5\33\u011f\n\33\3\34\3"+
		"\34\7\34\u0123\n\34\f\34\16\34\u0126\13\34\3\34\3\34\3\35\3\35\3\35\5"+
		"\35\u012d\n\35\3\36\3\36\5\36\u0131\n\36\3\37\3\37\3\37\5\37\u0136\n\37"+
		"\3\37\5\37\u0139\n\37\3 \3 \3!\3!\5!\u013f\n!\3!\3!\7!\u0143\n!\f!\16"+
		"!\u0146\13!\3!\3!\3\"\7\"\u014b\n\"\f\"\16\"\u014e\13\"\3\"\2\3.#\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\b\3\2"+
		" #\3\2\32\37\3\2\r\20\3\2&\'\3\2\4\4\4\2\3\3&&\2\u0167\2E\3\2\2\2\4K\3"+
		"\2\2\2\6O\3\2\2\2\bh\3\2\2\2\nl\3\2\2\2\ft\3\2\2\2\16z\3\2\2\2\20\u0082"+
		"\3\2\2\2\22\u008e\3\2\2\2\24\u0093\3\2\2\2\26\u009a\3\2\2\2\30\u00a4\3"+
		"\2\2\2\32\u00af\3\2\2\2\34\u00b5\3\2\2\2\36\u00bd\3\2\2\2 \u00bf\3\2\2"+
		"\2\"\u00c8\3\2\2\2$\u00ce\3\2\2\2&\u00d6\3\2\2\2(\u00df\3\2\2\2*\u00e3"+
		"\3\2\2\2,\u00e5\3\2\2\2.\u00fd\3\2\2\2\60\u0108\3\2\2\2\62\u010a\3\2\2"+
		"\2\64\u0110\3\2\2\2\66\u0120\3\2\2\28\u0129\3\2\2\2:\u0130\3\2\2\2<\u0138"+
		"\3\2\2\2>\u013a\3\2\2\2@\u013c\3\2\2\2B\u014c\3\2\2\2DF\5\4\3\2ED\3\2"+
		"\2\2EF\3\2\2\2FH\3\2\2\2GI\5\6\4\2HG\3\2\2\2HI\3\2\2\2I\3\3\2\2\2JL\5"+
		"\b\5\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\5\3\2\2\2OP\5&\24\2PQ"+
		"\7\6\2\2Q\7\3\2\2\2RS\5\n\6\2ST\7\4\2\2Ti\3\2\2\2UV\7\13\2\2VW\5\f\7\2"+
		"WX\7\4\2\2Xi\3\2\2\2YZ\5\n\6\2Z[\7\13\2\2[\\\5\f\7\2\\]\7\4\2\2]i\3\2"+
		"\2\2^`\7\f\2\2_a\5\f\7\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7\4\2\2cd\7\26"+
		"\2\2de\5 \21\2ef\7\27\2\2fi\3\2\2\2gi\5\66\34\2hR\3\2\2\2hU\3\2\2\2hY"+
		"\3\2\2\2h^\3\2\2\2hg\3\2\2\2i\t\3\2\2\2jm\5\16\b\2km\5\20\t\2lj\3\2\2"+
		"\2lk\3\2\2\2m\13\3\2\2\2nu\5$\23\2oq\7\n\2\2po\3\2\2\2pq\3\2\2\2qr\3\2"+
		"\2\2ru\5\30\r\2su\5\26\f\2tn\3\2\2\2tp\3\2\2\2ts\3\2\2\2ux\3\2\2\2vw\7"+
		"\5\2\2wy\5\f\7\2xv\3\2\2\2xy\3\2\2\2y\r\3\2\2\2z}\5&\24\2{|\7\t\2\2|~"+
		"\5\16\b\2}{\3\2\2\2}~\3\2\2\2~\17\3\2\2\2\177\u0080\5.\30\2\u0080\u0081"+
		"\5*\26\2\u0081\u0083\3\2\2\2\u0082\177\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0086\7\30\2\2\u0085\u0087\5\22\n\2\u0086\u0085\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008c\7\31\2\2\u0089"+
		"\u008a\5*\26\2\u008a\u008b\5.\30\2\u008b\u008d\3\2\2\2\u008c\u0089\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\21\3\2\2\2\u008e\u0091\5\24\13\2\u008f"+
		"\u0090\7\b\2\2\u0090\u0092\5\22\n\2\u0091\u008f\3\2\2\2\u0091\u0092\3"+
		"\2\2\2\u0092\23\3\2\2\2\u0093\u0098\5&\24\2\u0094\u0096\7\7\2\2\u0095"+
		"\u0097\5\"\22\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3"+
		"\2\2\2\u0098\u0094\3\2\2\2\u0098\u0099\3\2\2\2\u0099\25\3\2\2\2\u009a"+
		"\u009b\6\f\2\3\u009b\u009c\7$\2\2\u009c\u009d\7\24\2\2\u009d\u009e\5,"+
		"\27\2\u009e\u009f\7\25\2\2\u009f\u00a0\b\f\1\2\u00a0\27\3\2\2\2\u00a1"+
		"\u00a2\5.\30\2\u00a2\u00a3\5*\26\2\u00a3\u00a5\3\2\2\2\u00a4\u00a1\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\5\36\20\2\u00a7"+
		"\u00a8\7\30\2\2\u00a8\u00a9\5\32\16\2\u00a9\u00ad\7\31\2\2\u00aa\u00ab"+
		"\5*\26\2\u00ab\u00ac\5.\30\2\u00ac\u00ae\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\31\3\2\2\2\u00af\u00b2\5\34\17\2\u00b0\u00b1\7\b"+
		"\2\2\u00b1\u00b3\5\32\16\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\33\3\2\2\2\u00b4\u00b6\58\35\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2"+
		"\2\u00b6\u00bb\3\2\2\2\u00b7\u00b9\7\7\2\2\u00b8\u00ba\5\"\22\2\u00b9"+
		"\u00b8\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b7\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\35\3\2\2\2\u00bd\u00be\t\2\2\2\u00be\37"+
		"\3\2\2\2\u00bf\u00c2\5.\30\2\u00c0\u00c1\7\21\2\2\u00c1\u00c3\5.\30\2"+
		"\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c5"+
		"\7\5\2\2\u00c5\u00c7\5,\27\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"!\3\2\2\2\u00c8\u00cb\5$\23\2\u00c9\u00ca\7\5\2\2\u00ca\u00cc\5\"\22\2"+
		"\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc#\3\2\2\2\u00cd\u00cf\7"+
		"\n\2\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d3\3\2\2\2\u00d0"+
		"\u00d4\5\64\33\2\u00d1\u00d4\5&\24\2\u00d2\u00d4\5(\25\2\u00d3\u00d0\3"+
		"\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4%\3\2\2\2\u00d5\u00d7"+
		"\7\16\2\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2"+
		"\u00d8\u00dd\7%\2\2\u00d9\u00da\7\24\2\2\u00da\u00db\5,\27\2\u00db\u00dc"+
		"\7\25\2\2\u00dc\u00de\3\2\2\2\u00dd\u00d9\3\2\2\2\u00dd\u00de\3\2\2\2"+
		"\u00de\'\3\2\2\2\u00df\u00e0\5.\30\2\u00e0\u00e1\5*\26\2\u00e1\u00e2\5"+
		".\30\2\u00e2)\3\2\2\2\u00e3\u00e4\t\3\2\2\u00e4+\3\2\2\2\u00e5\u00e8\5"+
		".\30\2\u00e6\u00e7\7\5\2\2\u00e7\u00e9\5,\27\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9-\3\2\2\2\u00ea\u00eb\b\30\1\2\u00eb\u00fe\7%\2\2"+
		"\u00ec\u00ed\7%\2\2\u00ed\u00ef\7\24\2\2\u00ee\u00f0\5,\27\2\u00ef\u00ee"+
		"\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00fe\7\25\2\2"+
		"\u00f2\u00fe\7\'\2\2\u00f3\u00fe\7(\2\2\u00f4\u00fe\7&\2\2\u00f5\u00fe"+
		"\7\3\2\2\u00f6\u00f7\7\24\2\2\u00f7\u00f8\5.\30\2\u00f8\u00f9\7\25\2\2"+
		"\u00f9\u00fe\3\2\2\2\u00fa\u00fb\7\16\2\2\u00fb\u00fe\5.\30\5\u00fc\u00fe"+
		"\5\62\32\2\u00fd\u00ea\3\2\2\2\u00fd\u00ec\3\2\2\2\u00fd\u00f2\3\2\2\2"+
		"\u00fd\u00f3\3\2\2\2\u00fd\u00f4\3\2\2\2\u00fd\u00f5\3\2\2\2\u00fd\u00f6"+
		"\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0105\3\2\2\2\u00ff"+
		"\u0100\f\4\2\2\u0100\u0101\5\60\31\2\u0101\u0102\5.\30\5\u0102\u0104\3"+
		"\2\2\2\u0103\u00ff\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106/\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\t\4\2\2"+
		"\u0109\61\3\2\2\2\u010a\u010b\t\5\2\2\u010b\u010c\7\4\2\2\u010c\u010d"+
		"\7\4\2\2\u010d\u010e\t\5\2\2\u010e\63\3\2\2\2\u010f\u0111\7\16\2\2\u0110"+
		"\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\7\23"+
		"\2\2\u0113\u0118\7%\2\2\u0114\u0115\7\26\2\2\u0115\u0116\5,\27\2\u0116"+
		"\u0117\7\27\2\2\u0117\u0119\3\2\2\2\u0118\u0114\3\2\2\2\u0118\u0119\3"+
		"\2\2\2\u0119\u011e\3\2\2\2\u011a\u011b\7\24\2\2\u011b\u011c\5,\27\2\u011c"+
		"\u011d\7\25\2\2\u011d\u011f\3\2\2\2\u011e\u011a\3\2\2\2\u011e\u011f\3"+
		"\2\2\2\u011f\65\3\2\2\2\u0120\u0124\7\22\2\2\u0121\u0123\n\6\2\2\u0122"+
		"\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2"+
		"\2\2\u0125\u0127\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\7\4\2\2\u0128"+
		"\67\3\2\2\2\u0129\u012c\5:\36\2\u012a\u012b\7\5\2\2\u012b\u012d\58\35"+
		"\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d9\3\2\2\2\u012e\u0131"+
		"\5<\37\2\u012f\u0131\5> \2\u0130\u012e\3\2\2\2\u0130\u012f\3\2\2\2\u0131"+
		";\3\2\2\2\u0132\u0139\7%\2\2\u0133\u0139\7(\2\2\u0134\u0136\7\16\2\2\u0135"+
		"\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\7\'"+
		"\2\2\u0138\u0132\3\2\2\2\u0138\u0133\3\2\2\2\u0138\u0135\3\2\2\2\u0139"+
		"=\3\2\2\2\u013a\u013b\t\7\2\2\u013b?\3\2\2\2\u013c\u013e\7\30\2\2\u013d"+
		"\u013f\5&\24\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0144\3\2"+
		"\2\2\u0140\u0141\7\5\2\2\u0141\u0143\5&\24\2\u0142\u0140\3\2\2\2\u0143"+
		"\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147\3\2"+
		"\2\2\u0146\u0144\3\2\2\2\u0147\u0148\7\31\2\2\u0148A\3\2\2\2\u0149\u014b"+
		"\5@!\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014dC\3\2\2\2\u014e\u014c\3\2\2\2.EHM`hlptx}\u0082\u0086"+
		"\u008c\u0091\u0096\u0098\u00a4\u00ad\u00b2\u00b5\u00b9\u00bb\u00c2\u00c6"+
		"\u00cb\u00ce\u00d3\u00d6\u00dd\u00e8\u00ef\u00fd\u0105\u0110\u0118\u011e"+
		"\u0124\u012c\u0130\u0135\u0138\u013e\u0144\u014c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}