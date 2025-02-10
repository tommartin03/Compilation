package parser;
 // Generated from plk.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class plkLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Pv=3, Op=4, WS=5, INT=6, Const=7, Type=8, ID=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "Pv", "Op", "WS", "INT", "Const", "Type", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "Pv", "Op", "WS", "INT", "Const", "Type", "ID"
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


	public plkLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "plk.g4"; }

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
		"\u0004\u0000\tM\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003(\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0004"+
		"\u0005/\b\u0005\u000b\u0005\f\u00050\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006<\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007E\b\u0007\u0001\b\u0001"+
		"\b\u0005\bI\b\b\n\b\f\bL\t\b\u0000\u0000\t\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0001\u0000"+
		"\u0005\u0002\u0000*+--\u0003\u0000\t\n\r\r  \u0001\u000009\u0002\u0000"+
		"AZaz\u0003\u000009AZazV\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0001\u0013\u0001\u0000"+
		"\u0000\u0000\u0003\u0015\u0001\u0000\u0000\u0000\u0005\u0017\u0001\u0000"+
		"\u0000\u0000\u0007\'\u0001\u0000\u0000\u0000\t)\u0001\u0000\u0000\u0000"+
		"\u000b.\u0001\u0000\u0000\u0000\r;\u0001\u0000\u0000\u0000\u000fD\u0001"+
		"\u0000\u0000\u0000\u0011F\u0001\u0000\u0000\u0000\u0013\u0014\u0005(\u0000"+
		"\u0000\u0014\u0002\u0001\u0000\u0000\u0000\u0015\u0016\u0005)\u0000\u0000"+
		"\u0016\u0004\u0001\u0000\u0000\u0000\u0017\u0018\u0005;\u0000\u0000\u0018"+
		"\u0006\u0001\u0000\u0000\u0000\u0019(\u0007\u0000\u0000\u0000\u001a\u001b"+
		"\u0005&\u0000\u0000\u001b(\u0005&\u0000\u0000\u001c\u001d\u0005|\u0000"+
		"\u0000\u001d(\u0005|\u0000\u0000\u001e\u001f\u0005=\u0000\u0000\u001f"+
		"(\u0005=\u0000\u0000 (\u0005<\u0000\u0000!\"\u0005n\u0000\u0000\"#\u0005"+
		"o\u0000\u0000#(\u0005t\u0000\u0000$%\u0005a\u0000\u0000%&\u0005b\u0000"+
		"\u0000&(\u0005s\u0000\u0000\'\u0019\u0001\u0000\u0000\u0000\'\u001a\u0001"+
		"\u0000\u0000\u0000\'\u001c\u0001\u0000\u0000\u0000\'\u001e\u0001\u0000"+
		"\u0000\u0000\' \u0001\u0000\u0000\u0000\'!\u0001\u0000\u0000\u0000\'$"+
		"\u0001\u0000\u0000\u0000(\b\u0001\u0000\u0000\u0000)*\u0007\u0001\u0000"+
		"\u0000*+\u0001\u0000\u0000\u0000+,\u0006\u0004\u0000\u0000,\n\u0001\u0000"+
		"\u0000\u0000-/\u0007\u0002\u0000\u0000.-\u0001\u0000\u0000\u0000/0\u0001"+
		"\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u0000"+
		"1\f\u0001\u0000\u0000\u000023\u0005t\u0000\u000034\u0005r\u0000\u0000"+
		"45\u0005u\u0000\u00005<\u0005e\u0000\u000067\u0005f\u0000\u000078\u0005"+
		"a\u0000\u000089\u0005l\u0000\u00009:\u0005s\u0000\u0000:<\u0005e\u0000"+
		"\u0000;2\u0001\u0000\u0000\u0000;6\u0001\u0000\u0000\u0000<\u000e\u0001"+
		"\u0000\u0000\u0000=>\u0005b\u0000\u0000>?\u0005o\u0000\u0000?@\u0005o"+
		"\u0000\u0000@E\u0005l\u0000\u0000AB\u0005i\u0000\u0000BC\u0005n\u0000"+
		"\u0000CE\u0005t\u0000\u0000D=\u0001\u0000\u0000\u0000DA\u0001\u0000\u0000"+
		"\u0000E\u0010\u0001\u0000\u0000\u0000FJ\u0007\u0003\u0000\u0000GI\u0007"+
		"\u0004\u0000\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000"+
		"JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000K\u0012\u0001\u0000"+
		"\u0000\u0000LJ\u0001\u0000\u0000\u0000\u0006\u0000\'0;DJ\u0001\u0006\u0000"+
		"\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}