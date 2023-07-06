// Generated from BigInt.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class BigIntLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, ID=11, NUMBER=12, WS=13, COMMENT=14, ERROR=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "ID", "NUMBER", "WS", "COMMENT", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'show'", "'->'", "'+'", "'-'", "'*'", "'div'", "'mod'", 
			"'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "ID", 
			"NUMBER", "WS", "COMMENT", "ERROR"
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


	public BigIntLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BigInt.g4"; }

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
		"\u0004\u0000\u000f]\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n>\b\n\n\n\f\nA\t\n\u0001"+
		"\u000b\u0001\u000b\u0005\u000bE\b\u000b\n\u000b\f\u000bH\t\u000b\u0001"+
		"\f\u0004\fK\b\f\u000b\f\f\fL\u0001\f\u0001\f\u0001\r\u0001\r\u0005\rS"+
		"\b\r\n\r\f\rV\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001T\u0000\u000f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f"+
		"\u0019\r\u001b\u000e\u001d\u000f\u0001\u0000\u0004\u0002\u0000AZaz\u0003"+
		"\u000009AZaz\u0001\u000009\u0003\u0000\t\n\r\r  `\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0001\u001f\u0001\u0000\u0000\u0000\u0003!\u0001\u0000\u0000\u0000\u0005"+
		"&\u0001\u0000\u0000\u0000\u0007)\u0001\u0000\u0000\u0000\t+\u0001\u0000"+
		"\u0000\u0000\u000b-\u0001\u0000\u0000\u0000\r/\u0001\u0000\u0000\u0000"+
		"\u000f3\u0001\u0000\u0000\u0000\u00117\u0001\u0000\u0000\u0000\u00139"+
		"\u0001\u0000\u0000\u0000\u0015;\u0001\u0000\u0000\u0000\u0017B\u0001\u0000"+
		"\u0000\u0000\u0019J\u0001\u0000\u0000\u0000\u001bP\u0001\u0000\u0000\u0000"+
		"\u001d[\u0001\u0000\u0000\u0000\u001f \u0005;\u0000\u0000 \u0002\u0001"+
		"\u0000\u0000\u0000!\"\u0005s\u0000\u0000\"#\u0005h\u0000\u0000#$\u0005"+
		"o\u0000\u0000$%\u0005w\u0000\u0000%\u0004\u0001\u0000\u0000\u0000&\'\u0005"+
		"-\u0000\u0000\'(\u0005>\u0000\u0000(\u0006\u0001\u0000\u0000\u0000)*\u0005"+
		"+\u0000\u0000*\b\u0001\u0000\u0000\u0000+,\u0005-\u0000\u0000,\n\u0001"+
		"\u0000\u0000\u0000-.\u0005*\u0000\u0000.\f\u0001\u0000\u0000\u0000/0\u0005"+
		"d\u0000\u000001\u0005i\u0000\u000012\u0005v\u0000\u00002\u000e\u0001\u0000"+
		"\u0000\u000034\u0005m\u0000\u000045\u0005o\u0000\u000056\u0005d\u0000"+
		"\u00006\u0010\u0001\u0000\u0000\u000078\u0005(\u0000\u00008\u0012\u0001"+
		"\u0000\u0000\u00009:\u0005)\u0000\u0000:\u0014\u0001\u0000\u0000\u0000"+
		";?\u0007\u0000\u0000\u0000<>\u0007\u0001\u0000\u0000=<\u0001\u0000\u0000"+
		"\u0000>A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000"+
		"\u0000\u0000@\u0016\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"+
		"BF\u0007\u0002\u0000\u0000CE\u0007\u0002\u0000\u0000DC\u0001\u0000\u0000"+
		"\u0000EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000"+
		"\u0000\u0000G\u0018\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000"+
		"IK\u0007\u0003\u0000\u0000JI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0001\u0000"+
		"\u0000\u0000NO\u0006\f\u0000\u0000O\u001a\u0001\u0000\u0000\u0000PT\u0005"+
		"#\u0000\u0000QS\t\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000SV\u0001"+
		"\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000"+
		"UW\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000WX\u0005\n\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000YZ\u0006\r\u0000\u0000Z\u001c\u0001\u0000\u0000"+
		"\u0000[\\\t\u0000\u0000\u0000\\\u001e\u0001\u0000\u0000\u0000\u0005\u0000"+
		"?FLT\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}