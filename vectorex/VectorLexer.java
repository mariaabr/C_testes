// Generated from Vector.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class VectorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ID=10, ESCALAR=11, VECTOR=12, WS=13, COMMENT=14, ERROR=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"ID", "ESCALAR", "VECTOR", "WS", "COMMENT", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'show'", "'->'", "'+'", "'-'", "'*'", "'.'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "ID", "ESCALAR", 
			"VECTOR", "WS", "COMMENT", "ERROR"
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


	public VectorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Vector.g4"; }

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
		"\u0004\u0000\u000fn\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0005\t8\b\t\n\t\f"+
		"\t;\t\t\u0001\n\u0001\n\u0005\n?\b\n\n\n\f\nB\t\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\nG\b\n\n\n\f\nJ\t\n\u0003\nL\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000bR\b\u000b\n\u000b\f\u000bU\t\u000b\u0003"+
		"\u000bW\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0004\f\\\b\f\u000b\f"+
		"\f\f]\u0001\f\u0001\f\u0001\r\u0001\r\u0005\rd\b\r\n\r\f\rg\t\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001e\u0000\u000f"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u0001\u0000\u0004\u0001\u0000az\u0002\u000009az\u0001\u0000"+
		"09\u0003\u0000\t\n\r\r  u\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000"+
		"\u0000\u0000\u0003!\u0001\u0000\u0000\u0000\u0005&\u0001\u0000\u0000\u0000"+
		"\u0007)\u0001\u0000\u0000\u0000\t+\u0001\u0000\u0000\u0000\u000b-\u0001"+
		"\u0000\u0000\u0000\r/\u0001\u0000\u0000\u0000\u000f1\u0001\u0000\u0000"+
		"\u0000\u00113\u0001\u0000\u0000\u0000\u00135\u0001\u0000\u0000\u0000\u0015"+
		"<\u0001\u0000\u0000\u0000\u0017M\u0001\u0000\u0000\u0000\u0019[\u0001"+
		"\u0000\u0000\u0000\u001ba\u0001\u0000\u0000\u0000\u001dl\u0001\u0000\u0000"+
		"\u0000\u001f \u0005;\u0000\u0000 \u0002\u0001\u0000\u0000\u0000!\"\u0005"+
		"s\u0000\u0000\"#\u0005h\u0000\u0000#$\u0005o\u0000\u0000$%\u0005w\u0000"+
		"\u0000%\u0004\u0001\u0000\u0000\u0000&\'\u0005-\u0000\u0000\'(\u0005>"+
		"\u0000\u0000(\u0006\u0001\u0000\u0000\u0000)*\u0005+\u0000\u0000*\b\u0001"+
		"\u0000\u0000\u0000+,\u0005-\u0000\u0000,\n\u0001\u0000\u0000\u0000-.\u0005"+
		"*\u0000\u0000.\f\u0001\u0000\u0000\u0000/0\u0005.\u0000\u00000\u000e\u0001"+
		"\u0000\u0000\u000012\u0005(\u0000\u00002\u0010\u0001\u0000\u0000\u0000"+
		"34\u0005)\u0000\u00004\u0012\u0001\u0000\u0000\u000059\u0007\u0000\u0000"+
		"\u000068\u0007\u0001\u0000\u000076\u0001\u0000\u0000\u00008;\u0001\u0000"+
		"\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:\u0014"+
		"\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000<@\u0007\u0002\u0000"+
		"\u0000=?\u0007\u0002\u0000\u0000>=\u0001\u0000\u0000\u0000?B\u0001\u0000"+
		"\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AK\u0001"+
		"\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000CD\u0005.\u0000\u0000DH\u0007"+
		"\u0002\u0000\u0000EG\u0007\u0002\u0000\u0000FE\u0001\u0000\u0000\u0000"+
		"GJ\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000"+
		"\u0000IL\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000KC\u0001\u0000"+
		"\u0000\u0000KL\u0001\u0000\u0000\u0000L\u0016\u0001\u0000\u0000\u0000"+
		"MV\u0005[\u0000\u0000NS\u0003\u0015\n\u0000OP\u0005,\u0000\u0000PR\u0003"+
		"\u0015\n\u0000QO\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000"+
		"US\u0001\u0000\u0000\u0000VN\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000"+
		"\u0000WX\u0001\u0000\u0000\u0000XY\u0005]\u0000\u0000Y\u0018\u0001\u0000"+
		"\u0000\u0000Z\\\u0007\u0003\u0000\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000"+
		"^_\u0001\u0000\u0000\u0000_`\u0006\f\u0000\u0000`\u001a\u0001\u0000\u0000"+
		"\u0000ae\u0005#\u0000\u0000bd\t\u0000\u0000\u0000cb\u0001\u0000\u0000"+
		"\u0000dg\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000ec\u0001\u0000"+
		"\u0000\u0000fh\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000hi\u0005"+
		"\n\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0006\r\u0000\u0000k\u001c"+
		"\u0001\u0000\u0000\u0000lm\t\u0000\u0000\u0000m\u001e\u0001\u0000\u0000"+
		"\u0000\t\u00009@HKSV]e\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}