// Generated from ComplexNumber.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ComplexNumberLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, ID=11, NUMBER=12, COMPLEX=13, STRING=14, WS=15, COMMENT=16, ERROR=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "ID", "NUMBER", "COMPLEX", "STRING", "WS", "COMMENT", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'output'", "'=>'", "'+'", "'-'", "'*'", "':'", "'('", "')'", 
			"'input'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "ID", 
			"NUMBER", "COMPLEX", "STRING", "WS", "COMMENT", "ERROR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public ComplexNumberLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ComplexNumber.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0011y\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0005\nD\b\n\n\n\f\nG\t\n\u0001\u000b\u0001"+
		"\u000b\u0005\u000bK\b\u000b\n\u000b\f\u000bN\t\u000b\u0001\f\u0003\fQ"+
		"\b\f\u0001\f\u0003\fT\b\f\u0001\f\u0003\fW\b\f\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0005\r]\b\r\n\r\f\r`\t\r\u0001\r\u0001\r\u0001\u000e\u0004\u000e"+
		"e\b\u000e\u000b\u000e\f\u000ef\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000fo\b\u000f\n\u000f\f\u000fr\t"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0002^p\u0000\u0011\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011\u0001\u0000\u0005"+
		"\u0004\u0000AHJZahjz\u0003\u000009AZaz\u0001\u000009\u0002\u0000++--\u0003"+
		"\u0000\t\n\r\r  \u0080\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0001#\u0001\u0000\u0000\u0000"+
		"\u0003%\u0001\u0000\u0000\u0000\u0005,\u0001\u0000\u0000\u0000\u0007/"+
		"\u0001\u0000\u0000\u0000\t1\u0001\u0000\u0000\u0000\u000b3\u0001\u0000"+
		"\u0000\u0000\r5\u0001\u0000\u0000\u0000\u000f7\u0001\u0000\u0000\u0000"+
		"\u00119\u0001\u0000\u0000\u0000\u0013;\u0001\u0000\u0000\u0000\u0015A"+
		"\u0001\u0000\u0000\u0000\u0017H\u0001\u0000\u0000\u0000\u0019P\u0001\u0000"+
		"\u0000\u0000\u001bZ\u0001\u0000\u0000\u0000\u001dd\u0001\u0000\u0000\u0000"+
		"\u001fj\u0001\u0000\u0000\u0000!w\u0001\u0000\u0000\u0000#$\u0005;\u0000"+
		"\u0000$\u0002\u0001\u0000\u0000\u0000%&\u0005o\u0000\u0000&\'\u0005u\u0000"+
		"\u0000\'(\u0005t\u0000\u0000()\u0005p\u0000\u0000)*\u0005u\u0000\u0000"+
		"*+\u0005t\u0000\u0000+\u0004\u0001\u0000\u0000\u0000,-\u0005=\u0000\u0000"+
		"-.\u0005>\u0000\u0000.\u0006\u0001\u0000\u0000\u0000/0\u0005+\u0000\u0000"+
		"0\b\u0001\u0000\u0000\u000012\u0005-\u0000\u00002\n\u0001\u0000\u0000"+
		"\u000034\u0005*\u0000\u00004\f\u0001\u0000\u0000\u000056\u0005:\u0000"+
		"\u00006\u000e\u0001\u0000\u0000\u000078\u0005(\u0000\u00008\u0010\u0001"+
		"\u0000\u0000\u00009:\u0005)\u0000\u0000:\u0012\u0001\u0000\u0000\u0000"+
		";<\u0005i\u0000\u0000<=\u0005n\u0000\u0000=>\u0005p\u0000\u0000>?\u0005"+
		"u\u0000\u0000?@\u0005t\u0000\u0000@\u0014\u0001\u0000\u0000\u0000AE\u0007"+
		"\u0000\u0000\u0000BD\u0007\u0001\u0000\u0000CB\u0001\u0000\u0000\u0000"+
		"DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000F\u0016\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HL\u0007"+
		"\u0002\u0000\u0000IK\u0007\u0002\u0000\u0000JI\u0001\u0000\u0000\u0000"+
		"KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000"+
		"\u0000M\u0018\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OQ\u0003"+
		"\u0017\u000b\u0000PO\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000"+
		"QS\u0001\u0000\u0000\u0000RT\u0007\u0003\u0000\u0000SR\u0001\u0000\u0000"+
		"\u0000ST\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000UW\u0003\u0017"+
		"\u000b\u0000VU\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WX\u0001"+
		"\u0000\u0000\u0000XY\u0005i\u0000\u0000Y\u001a\u0001\u0000\u0000\u0000"+
		"Z^\u0005\"\u0000\u0000[]\t\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000"+
		"]`\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000"+
		"\u0000_a\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000ab\u0005\"\u0000"+
		"\u0000b\u001c\u0001\u0000\u0000\u0000ce\u0007\u0004\u0000\u0000dc\u0001"+
		"\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000"+
		"fg\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0006\u000e\u0000"+
		"\u0000i\u001e\u0001\u0000\u0000\u0000jk\u0005#\u0000\u0000kl\u0005#\u0000"+
		"\u0000lp\u0001\u0000\u0000\u0000mo\t\u0000\u0000\u0000nm\u0001\u0000\u0000"+
		"\u0000or\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000pn\u0001\u0000"+
		"\u0000\u0000qs\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000st\u0005"+
		"\n\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0006\u000f\u0000\u0000v \u0001"+
		"\u0000\u0000\u0000wx\t\u0000\u0000\u0000x\"\u0001\u0000\u0000\u0000\t"+
		"\u0000ELPSV^fp\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}