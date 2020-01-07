// Generated from E:/compil2/src\grammaire.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammaireParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, ENTIER=20, REAL=21, IDF=22, OPERATOR=23, AFFECT=24, 
		OP_COMP=25, PRM_NAME=26, MESSAGE=27, CTE=28, WHITESPACE=29;
	public static final int
		RULE_prog = 0, RULE_declarations = 1, RULE_dec = 2, RULE_type = 3, RULE_list_idfdec = 4, 
		RULE_list_idfInst = 5, RULE_list_inst = 6, RULE_inst = 7, RULE_lecture = 8, 
		RULE_ecriture = 9, RULE_affich = 10, RULE_affect = 11, RULE_cte = 12, 
		RULE_exp_ar = 13, RULE_op1 = 14, RULE_a = 15, RULE_op2 = 16, RULE_b = 17, 
		RULE_operator = 18, RULE_cnd = 19, RULE_els = 20, RULE_cond = 21;
	public static final String[] ruleNames = {
		"prog", "declarations", "dec", "type", "list_idfdec", "list_idfInst", 
		"list_inst", "inst", "lecture", "ecriture", "affich", "affect", "cte", 
		"exp_ar", "op1", "a", "op2", "b", "operator", "cnd", "els", "cond"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'compil'", "'('", "')'", "'{'", "'start'", "'}'", "';'", "'intCompil'", 
		"'floatCompil'", "','", "'scancompil'", "'printcompil'", "'+'", "'-'", 
		"'*'", "'/'", "'if'", "'then'", "'else'", null, null, null, null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "ENTIER", "REAL", "IDF", 
		"OPERATOR", "AFFECT", "OP_COMP", "PRM_NAME", "MESSAGE", "CTE", "WHITESPACE"
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
	public String getGrammarFileName() { return "grammaire.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public grammaireParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode PRM_NAME() { return getToken(grammaireParser.PRM_NAME, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public List_instContext list_inst() {
			return getRuleContext(List_instContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__0);
			setState(45);
			match(PRM_NAME);
			setState(46);
			match(T__1);
			setState(47);
			match(T__2);
			setState(48);
			match(T__3);
			setState(49);
			declarations();
			setState(50);
			match(T__4);
			setState(51);
			list_inst();
			setState(52);
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

	public static class DeclarationsContext extends ParserRuleContext {
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).exitDeclarations(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				dec();
				setState(55);
				declarations();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				dec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class DecContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List_idfdecContext list_idfdec() {
			return getRuleContext(List_idfdecContext.class,0);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).exitDec(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			type();
			setState(62);
			list_idfdec();
			setState(63);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
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

	public static class List_idfdecContext extends ParserRuleContext {
		public TerminalNode IDF() { return getToken(grammaireParser.IDF, 0); }
		public List_idfdecContext list_idfdec() {
			return getRuleContext(List_idfdecContext.class,0);
		}
		public List_idfdecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_idfdec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).enterList_idfdec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).exitList_idfdec(this);
		}
	}

	public final List_idfdecContext list_idfdec() throws RecognitionException {
		List_idfdecContext _localctx = new List_idfdecContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_list_idfdec);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(IDF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(IDF);
				setState(69);
				match(T__9);
				setState(70);
				list_idfdec();
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

	public static class List_idfInstContext extends ParserRuleContext {
		public TerminalNode IDF() { return getToken(grammaireParser.IDF, 0); }
		public List_idfInstContext list_idfInst() {
			return getRuleContext(List_idfInstContext.class,0);
		}
		public List_idfInstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_idfInst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).enterList_idfInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).exitList_idfInst(this);
		}
	}

	public final List_idfInstContext list_idfInst() throws RecognitionException {
		List_idfInstContext _localctx = new List_idfInstContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_list_idfInst);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(IDF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(IDF);
				setState(75);
				match(T__9);
				setState(76);
				list_idfInst();
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

	public static class List_instContext extends ParserRuleContext {
		public InstContext inst() {
			return getRuleContext(InstContext.class,0);
		}
		public List_instContext list_inst() {
			return getRuleContext(List_instContext.class,0);
		}
		public List_instContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_inst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).enterList_inst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).exitList_inst(this);
		}
	}

	public final List_instContext list_inst() throws RecognitionException {
		List_instContext _localctx = new List_instContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_list_inst);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				inst();
				setState(80);
				list_inst();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				inst();
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

	public static class InstContext extends ParserRuleContext {
		public LectureContext lecture() {
			return getRuleContext(LectureContext.class,0);
		}
		public EcritureContext ecriture() {
			return getRuleContext(EcritureContext.class,0);
		}
		public AffectContext affect() {
			return getRuleContext(AffectContext.class,0);
		}
		public CndContext cnd() {
			return getRuleContext(CndContext.class,0);
		}
		public InstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).enterInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).exitInst(this);
		}
	}

	public final InstContext inst() throws RecognitionException {
		InstContext _localctx = new InstContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_inst);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				lecture();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				ecriture();
				}
				break;
			case IDF:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				affect();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				cnd();
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

	public static class LectureContext extends ParserRuleContext {
		public List_idfInstContext list_idfInst() {
			return getRuleContext(List_idfInstContext.class,0);
		}
		public LectureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lecture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).enterLecture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).exitLecture(this);
		}
	}

	public final LectureContext lecture() throws RecognitionException {
		LectureContext _localctx = new LectureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lecture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__10);
			setState(92);
			match(T__1);
			setState(93);
			list_idfInst();
			setState(94);
			match(T__2);
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

	public static class EcritureContext extends ParserRuleContext {
		public AffichContext affich() {
			return getRuleContext(AffichContext.class,0);
		}
		public EcritureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ecriture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).enterEcriture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).exitEcriture(this);
		}
	}

	public final EcritureContext ecriture() throws RecognitionException {
		EcritureContext _localctx = new EcritureContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ecriture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__11);
			setState(98);
			match(T__1);
			setState(99);
			affich();
			setState(100);
			match(T__2);
			setState(101);
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

	public static class AffichContext extends ParserRuleContext {
		public TerminalNode MESSAGE() { return getToken(grammaireParser.MESSAGE, 0); }
		public List_idfInstContext list_idfInst() {
			return getRuleContext(List_idfInstContext.class,0);
		}
		public AffichContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affich; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).enterAffich(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).exitAffich(this);
		}
	}

	public final AffichContext affich() throws RecognitionException {
		AffichContext _localctx = new AffichContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_affich);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MESSAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(MESSAGE);
				}
				break;
			case IDF:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				list_idfInst();
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

	public static class AffectContext extends ParserRuleContext {
		public TerminalNode IDF() { return getToken(grammaireParser.IDF, 0); }
		public TerminalNode AFFECT() { return getToken(grammaireParser.AFFECT, 0); }
		public Exp_arContext exp_ar() {
			return getRuleContext(Exp_arContext.class,0);
		}
		public AffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_affect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).enterAffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).exitAffect(this);
		}
	}

	public final AffectContext affect() throws RecognitionException {
		AffectContext _localctx = new AffectContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_affect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(IDF);
			setState(108);
			match(AFFECT);
			setState(109);
			exp_ar(0);
			setState(110);
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

	public static class CteContext extends ParserRuleContext {
		public TerminalNode ENTIER() { return getToken(grammaireParser.ENTIER, 0); }
		public TerminalNode REAL() { return getToken(grammaireParser.REAL, 0); }
		public CteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).enterCte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).exitCte(this);
		}
	}

	public final CteContext cte() throws RecognitionException {
		CteContext _localctx = new CteContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cte);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !(_la==ENTIER || _la==REAL) ) {
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

	public static class Exp_arContext extends ParserRuleContext {
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public Exp_arContext exp_ar() {
			return getRuleContext(Exp_arContext.class,0);
		}
		public Op1Context op1() {
			return getRuleContext(Op1Context.class,0);
		}
		public Exp_arContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_ar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).enterExp_ar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).exitExp_ar(this);
		}
	}

	public final Exp_arContext exp_ar() throws RecognitionException {
		return exp_ar(0);
	}

	private Exp_arContext exp_ar(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exp_arContext _localctx = new Exp_arContext(_ctx, _parentState);
		Exp_arContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_exp_ar, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(115);
			a(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp_arContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp_ar);
					setState(117);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(118);
					op1();
					setState(119);
					a(0);
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class Op1Context extends ParserRuleContext {
		public Op1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).enterOp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).exitOp1(this);
		}
	}

	public final Op1Context op1() throws RecognitionException {
		Op1Context _localctx = new Op1Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_op1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_la = _input.LA(1);
			if ( !(_la==T__12 || _la==T__13) ) {
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

	public static class AContext extends ParserRuleContext {
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public Op2Context op2() {
			return getRuleContext(Op2Context.class,0);
		}
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).enterA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).exitA(this);
		}
	}

	public final AContext a() throws RecognitionException {
		return a(0);
	}

	private AContext a(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AContext _localctx = new AContext(_ctx, _parentState);
		AContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_a, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(129);
			b();
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_a);
					setState(131);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(132);
					op2();
					setState(133);
					b();
					}
					} 
				}
				setState(139);
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

	public static class Op2Context extends ParserRuleContext {
		public Op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).enterOp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).exitOp2(this);
		}
	}

	public final Op2Context op2() throws RecognitionException {
		Op2Context _localctx = new Op2Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_op2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__15) ) {
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

	public static class BContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Exp_arContext exp_ar() {
			return getRuleContext(Exp_arContext.class,0);
		}
		public BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).enterB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).exitB(this);
		}
	}

	public final BContext b() throws RecognitionException {
		BContext _localctx = new BContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_b);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTIER:
			case REAL:
			case IDF:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				operator();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(T__1);
				setState(144);
				exp_ar(0);
				setState(145);
				match(T__2);
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode IDF() { return getToken(grammaireParser.IDF, 0); }
		public CteContext cte() {
			return getRuleContext(CteContext.class,0);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_operator);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDF:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(IDF);
				}
				break;
			case ENTIER:
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				cte();
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

	public static class CndContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List_instContext list_inst() {
			return getRuleContext(List_instContext.class,0);
		}
		public ElsContext els() {
			return getRuleContext(ElsContext.class,0);
		}
		public CndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).enterCnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).exitCnd(this);
		}
	}

	public final CndContext cnd() throws RecognitionException {
		CndContext _localctx = new CndContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__16);
			setState(154);
			match(T__1);
			setState(155);
			cond();
			setState(156);
			match(T__2);
			setState(157);
			match(T__17);
			setState(158);
			match(T__3);
			setState(159);
			list_inst();
			setState(160);
			match(T__5);
			setState(161);
			els();
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

	public static class ElsContext extends ParserRuleContext {
		public List_instContext list_inst() {
			return getRuleContext(List_instContext.class,0);
		}
		public ElsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_els; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).enterEls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).exitEls(this);
		}
	}

	public final ElsContext els() throws RecognitionException {
		ElsContext _localctx = new ElsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_els);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(T__18);
				setState(164);
				match(T__3);
				setState(165);
				list_inst();
				setState(166);
				match(T__5);
				}
				break;
			case T__5:
			case T__10:
			case T__11:
			case T__16:
			case IDF:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class CondContext extends ParserRuleContext {
		public List<Exp_arContext> exp_ar() {
			return getRuleContexts(Exp_arContext.class);
		}
		public Exp_arContext exp_ar(int i) {
			return getRuleContext(Exp_arContext.class,i);
		}
		public TerminalNode OP_COMP() { return getToken(grammaireParser.OP_COMP, 0); }
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammaireListener ) ((grammaireListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			exp_ar(0);
			setState(172);
			match(OP_COMP);
			setState(173);
			exp_ar(0);
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
		case 13:
			return exp_ar_sempred((Exp_arContext)_localctx, predIndex);
		case 15:
			return a_sempred((AContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_ar_sempred(Exp_arContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean a_sempred(AContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00b2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3>\n\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\5\6J\n\6\3\7\3\7\3\7\3\7\5\7P\n\7\3\b\3\b\3\b\3\b"+
		"\5\bV\n\b\3\t\3\t\3\t\3\t\5\t\\\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\5\fl\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17|\n\17\f\17\16\17\177\13\17\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u008a\n\21\f\21\16\21\u008d"+
		"\13\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u0096\n\23\3\24\3\24\5"+
		"\24\u009a\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u00ac\n\26\3\27\3\27\3\27\3\27\3\27\2\4"+
		"\34 \30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\6\3\2\n\13\3"+
		"\2\26\27\3\2\17\20\3\2\21\22\2\u00a9\2.\3\2\2\2\4=\3\2\2\2\6?\3\2\2\2"+
		"\bC\3\2\2\2\nI\3\2\2\2\fO\3\2\2\2\16U\3\2\2\2\20[\3\2\2\2\22]\3\2\2\2"+
		"\24c\3\2\2\2\26k\3\2\2\2\30m\3\2\2\2\32r\3\2\2\2\34t\3\2\2\2\36\u0080"+
		"\3\2\2\2 \u0082\3\2\2\2\"\u008e\3\2\2\2$\u0095\3\2\2\2&\u0099\3\2\2\2"+
		"(\u009b\3\2\2\2*\u00ab\3\2\2\2,\u00ad\3\2\2\2./\7\3\2\2/\60\7\34\2\2\60"+
		"\61\7\4\2\2\61\62\7\5\2\2\62\63\7\6\2\2\63\64\5\4\3\2\64\65\7\7\2\2\65"+
		"\66\5\16\b\2\66\67\7\b\2\2\67\3\3\2\2\289\5\6\4\29:\5\4\3\2:>\3\2\2\2"+
		";>\5\6\4\2<>\3\2\2\2=8\3\2\2\2=;\3\2\2\2=<\3\2\2\2>\5\3\2\2\2?@\5\b\5"+
		"\2@A\5\n\6\2AB\7\t\2\2B\7\3\2\2\2CD\t\2\2\2D\t\3\2\2\2EJ\7\30\2\2FG\7"+
		"\30\2\2GH\7\f\2\2HJ\5\n\6\2IE\3\2\2\2IF\3\2\2\2J\13\3\2\2\2KP\7\30\2\2"+
		"LM\7\30\2\2MN\7\f\2\2NP\5\f\7\2OK\3\2\2\2OL\3\2\2\2P\r\3\2\2\2QR\5\20"+
		"\t\2RS\5\16\b\2SV\3\2\2\2TV\5\20\t\2UQ\3\2\2\2UT\3\2\2\2V\17\3\2\2\2W"+
		"\\\5\22\n\2X\\\5\24\13\2Y\\\5\30\r\2Z\\\5(\25\2[W\3\2\2\2[X\3\2\2\2[Y"+
		"\3\2\2\2[Z\3\2\2\2\\\21\3\2\2\2]^\7\r\2\2^_\7\4\2\2_`\5\f\7\2`a\7\5\2"+
		"\2ab\7\t\2\2b\23\3\2\2\2cd\7\16\2\2de\7\4\2\2ef\5\26\f\2fg\7\5\2\2gh\7"+
		"\t\2\2h\25\3\2\2\2il\7\35\2\2jl\5\f\7\2ki\3\2\2\2kj\3\2\2\2l\27\3\2\2"+
		"\2mn\7\30\2\2no\7\32\2\2op\5\34\17\2pq\7\t\2\2q\31\3\2\2\2rs\t\3\2\2s"+
		"\33\3\2\2\2tu\b\17\1\2uv\5 \21\2v}\3\2\2\2wx\f\4\2\2xy\5\36\20\2yz\5 "+
		"\21\2z|\3\2\2\2{w\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\35\3\2\2\2"+
		"\177}\3\2\2\2\u0080\u0081\t\4\2\2\u0081\37\3\2\2\2\u0082\u0083\b\21\1"+
		"\2\u0083\u0084\5$\23\2\u0084\u008b\3\2\2\2\u0085\u0086\f\4\2\2\u0086\u0087"+
		"\5\"\22\2\u0087\u0088\5$\23\2\u0088\u008a\3\2\2\2\u0089\u0085\3\2\2\2"+
		"\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c!\3"+
		"\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\t\5\2\2\u008f#\3\2\2\2\u0090\u0096"+
		"\5&\24\2\u0091\u0092\7\4\2\2\u0092\u0093\5\34\17\2\u0093\u0094\7\5\2\2"+
		"\u0094\u0096\3\2\2\2\u0095\u0090\3\2\2\2\u0095\u0091\3\2\2\2\u0096%\3"+
		"\2\2\2\u0097\u009a\7\30\2\2\u0098\u009a\5\32\16\2\u0099\u0097\3\2\2\2"+
		"\u0099\u0098\3\2\2\2\u009a\'\3\2\2\2\u009b\u009c\7\23\2\2\u009c\u009d"+
		"\7\4\2\2\u009d\u009e\5,\27\2\u009e\u009f\7\5\2\2\u009f\u00a0\7\24\2\2"+
		"\u00a0\u00a1\7\6\2\2\u00a1\u00a2\5\16\b\2\u00a2\u00a3\7\b\2\2\u00a3\u00a4"+
		"\5*\26\2\u00a4)\3\2\2\2\u00a5\u00a6\7\25\2\2\u00a6\u00a7\7\6\2\2\u00a7"+
		"\u00a8\5\16\b\2\u00a8\u00a9\7\b\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00ac\3"+
		"\2\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac+\3\2\2\2\u00ad\u00ae"+
		"\5\34\17\2\u00ae\u00af\7\33\2\2\u00af\u00b0\5\34\17\2\u00b0-\3\2\2\2\r"+
		"=IOU[k}\u008b\u0095\u0099\u00ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}