// $ANTLR 3.5.1 /home/dcnorris/Documents/DroolsRule.g 2016-12-12 16:26:54
package com.stackleader.drools.netbeans.grammar;

import org.antlr.runtime.*;

@SuppressWarnings("all")
public class DroolsRuleLexer extends Lexer {

    public static final int EOF = -1;
    public static final int BINDING = 4;
    public static final int CHAR = 5;
    public static final int COLON = 6;
    public static final int DECLARE = 7;
    public static final int DIALECT = 8;
    public static final int END = 9;
    public static final int ESC_SEQ = 10;
    public static final int EXPONENT = 11;
    public static final int EXTENDS = 12;
    public static final int FLOAT = 13;
    public static final int FQN = 14;
    public static final int GLOBAL = 15;
    public static final int HEX_DIGIT = 16;
    public static final int ID = 17;
    public static final int IMPORT = 18;
    public static final int INT = 19;
    public static final int KEYWORD = 20;
    public static final int META = 21;
    public static final int METHOD = 22;
    public static final int MULTILINE_COMMENT = 23;
    public static final int OCTAL_ESC = 24;
    public static final int OPERATOR = 25;
    public static final int PACKAGE = 26;
    public static final int PRIMITIVE = 27;
    public static final int RULE = 28;
    public static final int SALIENCE = 29;
    public static final int SEMICOLON = 30;
    public static final int SEPARATOR = 31;
    public static final int SINGLELINE_COMMENT = 32;
    public static final int STRING = 33;
    public static final int THEN = 34;
    public static final int UNICODE_ESC = 35;
    public static final int WHEN = 36;
    public static final int WS = 37;

    @Override
    public void emitErrorMessage(String msg) {
    }

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[]{};
    }

    public DroolsRuleLexer() {
    }

    public DroolsRuleLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }

    public DroolsRuleLexer(CharStream input, RecognizerSharedState state) {
        super(input, state);
    }

    @Override
    public String getGrammarFileName() {
        return "/home/dcnorris/Documents/DroolsRule.g";
    }

    // $ANTLR start "DECLARE"
    public final void mDECLARE() throws RecognitionException {
        try {
            int _type = DECLARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/dcnorris/Documents/DroolsRule.g:102:2: ( 'declare' )
            // /home/dcnorris/Documents/DroolsRule.g:102:4: 'declare'
            {
                match("declare");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "DECLARE"

    // $ANTLR start "DIALECT"
    public final void mDIALECT() throws RecognitionException {
        try {
            int _type = DIALECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/dcnorris/Documents/DroolsRule.g:106:2: ( 'dialect' )
            // /home/dcnorris/Documents/DroolsRule.g:106:4: 'dialect'
            {
                match("dialect");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "DIALECT"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/dcnorris/Documents/DroolsRule.g:110:2: ( 'end' )
            // /home/dcnorris/Documents/DroolsRule.g:110:5: 'end'
            {
                match("end");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "EXTENDS"
    public final void mEXTENDS() throws RecognitionException {
        try {
            int _type = EXTENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/dcnorris/Documents/DroolsRule.g:114:2: ( 'extends' )
            // /home/dcnorris/Documents/DroolsRule.g:114:4: 'extends'
            {
                match("extends");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "EXTENDS"

    // $ANTLR start "GLOBAL"
    public final void mGLOBAL() throws RecognitionException {
        try {
            int _type = GLOBAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/dcnorris/Documents/DroolsRule.g:118:2: ( 'global' )
            // /home/dcnorris/Documents/DroolsRule.g:118:4: 'global'
            {
                match("global");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "GLOBAL"

    // $ANTLR start "IMPORT"
    public final void mIMPORT() throws RecognitionException {
        try {
            int _type = IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/dcnorris/Documents/DroolsRule.g:122:2: ( 'import' )
            // /home/dcnorris/Documents/DroolsRule.g:122:4: 'import'
            {
                match("import");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "IMPORT"

    // $ANTLR start "PACKAGE"
    public final void mPACKAGE() throws RecognitionException {
        try {
            int _type = PACKAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/dcnorris/Documents/DroolsRule.g:126:2: ( 'package' )
            // /home/dcnorris/Documents/DroolsRule.g:126:5: 'package'
            {
                match("package");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "PACKAGE"

    // $ANTLR start "RULE"
    public final void mRULE() throws RecognitionException {
        try {
            int _type = RULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/dcnorris/Documents/DroolsRule.g:130:2: ( 'rule' )
            // /home/dcnorris/Documents/DroolsRule.g:130:4: 'rule'
            {
                match("rule");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "RULE"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/dcnorris/Documents/DroolsRule.g:134:2: ( 'then' )
            // /home/dcnorris/Documents/DroolsRule.g:134:4: 'then'
            {
                match("then");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "WHEN"
    public final void mWHEN() throws RecognitionException {
        try {
            int _type = WHEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/dcnorris/Documents/DroolsRule.g:138:2: ( 'when' )
            // /home/dcnorris/Documents/DroolsRule.g:138:4: 'when'
            {
                match("when");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "WHEN"

    // $ANTLR start "SALIENCE"
    public final void mSALIENCE() throws RecognitionException {
        try {
            int _type = SALIENCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/dcnorris/Documents/DroolsRule.g:142:2: ( 'salience' )
            // /home/dcnorris/Documents/DroolsRule.g:142:4: 'salience'
            {
                match("salience");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "SALIENCE"

    // $ANTLR start "PRIMITIVE"
    public final void mPRIMITIVE() throws RecognitionException {
        try {
            int _type = PRIMITIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/dcnorris/Documents/DroolsRule.g:146:2: ( 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' | 'boolean' | 'char' )
            int alt1 = 8;
            switch (input.LA(1)) {
                case 'b': {
                    int LA1_1 = input.LA(2);
                    if ((LA1_1 == 'y')) {
                        alt1 = 1;
                    } else if ((LA1_1 == 'o')) {
                        alt1 = 7;
                    } else {
                        int nvaeMark = input.mark();
                        try {
                            input.consume();
                            NoViableAltException nvae
                                    = new NoViableAltException("", 1, 1, input);
                            throw nvae;
                        } finally {
                            input.rewind(nvaeMark);
                        }
                    }

                }
                break;
                case 's': {
                    alt1 = 2;
                }
                break;
                case 'i': {
                    alt1 = 3;
                }
                break;
                case 'l': {
                    alt1 = 4;
                }
                break;
                case 'f': {
                    alt1 = 5;
                }
                break;
                case 'd': {
                    alt1 = 6;
                }
                break;
                case 'c': {
                    alt1 = 8;
                }
                break;
                default:
                    NoViableAltException nvae
                            = new NoViableAltException("", 1, 0, input);
                    throw nvae;
            }
            switch (alt1) {
                case 1: // /home/dcnorris/Documents/DroolsRule.g:146:4: 'byte'
                {
                    match("byte");

                }
                break;
                case 2: // /home/dcnorris/Documents/DroolsRule.g:146:13: 'short'
                {
                    match("short");

                }
                break;
                case 3: // /home/dcnorris/Documents/DroolsRule.g:146:23: 'int'
                {
                    match("int");

                }
                break;
                case 4: // /home/dcnorris/Documents/DroolsRule.g:146:31: 'long'
                {
                    match("long");

                }
                break;
                case 5: // /home/dcnorris/Documents/DroolsRule.g:146:40: 'float'
                {
                    match("float");

                }
                break;
                case 6: // /home/dcnorris/Documents/DroolsRule.g:146:50: 'double'
                {
                    match("double");

                }
                break;
                case 7: // /home/dcnorris/Documents/DroolsRule.g:146:61: 'boolean'
                {
                    match("boolean");

                }
                break;
                case 8: // /home/dcnorris/Documents/DroolsRule.g:146:73: 'char'
                {
                    match("char");

                }
                break;

            }
            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "PRIMITIVE"

    // $ANTLR start "METHOD"
    public final void mMETHOD() throws RecognitionException {
        try {
            int _type = METHOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/dcnorris/Documents/DroolsRule.g:149:9: ( 'forall' | 'eval' | 'modify' | 'insert' | 'update' )
            int alt2 = 5;
            switch (input.LA(1)) {
                case 'f': {
                    alt2 = 1;
                }
                break;
                case 'e': {
                    alt2 = 2;
                }
                break;
                case 'm': {
                    alt2 = 3;
                }
                break;
                case 'i': {
                    alt2 = 4;
                }
                break;
                case 'u': {
                    alt2 = 5;
                }
                break;
                default:
                    NoViableAltException nvae
                            = new NoViableAltException("", 2, 0, input);
                    throw nvae;
            }
            switch (alt2) {
                case 1: // /home/dcnorris/Documents/DroolsRule.g:149:11: 'forall'
                {
                    match("forall");

                }
                break;
                case 2: // /home/dcnorris/Documents/DroolsRule.g:149:22: 'eval'
                {
                    match("eval");

                }
                break;
                case 3: // /home/dcnorris/Documents/DroolsRule.g:149:29: 'modify'
                {
                    match("modify");

                }
                break;
                case 4: // /home/dcnorris/Documents/DroolsRule.g:149:38: 'insert'
                {
                    match("insert");

                }
                break;
                case 5: // /home/dcnorris/Documents/DroolsRule.g:149:47: 'update'
                {
                    match("update");

                }
                break;

            }
            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "METHOD"

    // $ANTLR start "KEYWORD"
    public final void mKEYWORD() throws RecognitionException {
        try {
            int _type = KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/dcnorris/Documents/DroolsRule.g:152:2: ( 'and' | 'from' | 'or' | 'no-loop' | 'duration' | 'auto-focus' | 'not' | 'matches' | 'contains' | 'agenda-group' | 'lock-on-active' | 'uleflow-group' | 'enabled' | 'date-expires' | 'date-effective' | 'activation-group' | DECLARE | DIALECT | END | EXTENDS | GLOBAL | IMPORT | PACKAGE | RULE | THEN | WHEN | PRIMITIVE | SALIENCE | 'new' | 'return' | 'if' | 'else' | 'do' | 'while' | 'for' | 'try' | 'catch' | 'finally' | 'break' | 'continue' | 'date' | 'effective' | 'expires' | 'lock' | 'on' | 'active' | 'no' | 'loop' | 'auto' | 'focus' | 'activation' | 'group' | 'agenda' | 'ruleflow' | 'timer' | 'calendars' | 'refract' | 'direct' | 'attributes' | 'template' | 'query' | 'function' | 'excludes' | 'soundslike' | 'memberof' | 'in' | 'exists' | 'over' | 'entry' | 'point' | 'accumulate' | 'acc' | 'collect' | 'action' | 'reverse' | 'result' | 'init' | 'instanceof' | 'super' | 'final' | 'default' | 'switch' | 'synchronized' | 'throw' | 'assert' | 'static' | 'public' | 'protected' | 'private' | 'abstract' | 'native' | 'transient' | 'volatile' | 'strictfp' | 'throws' | 'interface' | 'enum' | 'implements' | 'type' | 'window' | 'trait' )
            int alt3 = 101;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1: // /home/dcnorris/Documents/DroolsRule.g:152:4: 'and'
                {
                    match("and");

                }
                break;
                case 2: // /home/dcnorris/Documents/DroolsRule.g:152:12: 'from'
                {
                    match("from");

                }
                break;
                case 3: // /home/dcnorris/Documents/DroolsRule.g:152:21: 'or'
                {
                    match("or");

                }
                break;
                case 4: // /home/dcnorris/Documents/DroolsRule.g:152:28: 'no-loop'
                {
                    match("no-loop");

                }
                break;
                case 5: // /home/dcnorris/Documents/DroolsRule.g:152:40: 'duration'
                {
                    match("duration");

                }
                break;
                case 6: // /home/dcnorris/Documents/DroolsRule.g:152:53: 'auto-focus'
                {
                    match("auto-focus");

                }
                break;
                case 7: // /home/dcnorris/Documents/DroolsRule.g:152:68: 'not'
                {
                    match("not");

                }
                break;
                case 8: // /home/dcnorris/Documents/DroolsRule.g:152:76: 'matches'
                {
                    match("matches");

                }
                break;
                case 9: // /home/dcnorris/Documents/DroolsRule.g:152:88: 'contains'
                {
                    match("contains");

                }
                break;
                case 10: // /home/dcnorris/Documents/DroolsRule.g:152:101: 'agenda-group'
                {
                    match("agenda-group");

                }
                break;
                case 11: // /home/dcnorris/Documents/DroolsRule.g:153:3: 'lock-on-active'
                {
                    match("lock-on-active");

                }
                break;
                case 12: // /home/dcnorris/Documents/DroolsRule.g:153:22: 'uleflow-group'
                {
                    match("uleflow-group");

                }
                break;
                case 13: // /home/dcnorris/Documents/DroolsRule.g:153:40: 'enabled'
                {
                    match("enabled");

                }
                break;
                case 14: // /home/dcnorris/Documents/DroolsRule.g:153:52: 'date-expires'
                {
                    match("date-expires");

                }
                break;
                case 15: // /home/dcnorris/Documents/DroolsRule.g:153:69: 'date-effective'
                {
                    match("date-effective");

                }
                break;
                case 16: // /home/dcnorris/Documents/DroolsRule.g:153:88: 'activation-group'
                {
                    match("activation-group");

                }
                break;
                case 17: // /home/dcnorris/Documents/DroolsRule.g:154:3: DECLARE
                {
                    mDECLARE();

                }
                break;
                case 18: // /home/dcnorris/Documents/DroolsRule.g:154:13: DIALECT
                {
                    mDIALECT();

                }
                break;
                case 19: // /home/dcnorris/Documents/DroolsRule.g:154:23: END
                {
                    mEND();

                }
                break;
                case 20: // /home/dcnorris/Documents/DroolsRule.g:154:29: EXTENDS
                {
                    mEXTENDS();

                }
                break;
                case 21: // /home/dcnorris/Documents/DroolsRule.g:154:39: GLOBAL
                {
                    mGLOBAL();

                }
                break;
                case 22: // /home/dcnorris/Documents/DroolsRule.g:154:48: IMPORT
                {
                    mIMPORT();

                }
                break;
                case 23: // /home/dcnorris/Documents/DroolsRule.g:154:57: PACKAGE
                {
                    mPACKAGE();

                }
                break;
                case 24: // /home/dcnorris/Documents/DroolsRule.g:154:67: RULE
                {
                    mRULE();

                }
                break;
                case 25: // /home/dcnorris/Documents/DroolsRule.g:154:74: THEN
                {
                    mTHEN();

                }
                break;
                case 26: // /home/dcnorris/Documents/DroolsRule.g:154:81: WHEN
                {
                    mWHEN();

                }
                break;
                case 27: // /home/dcnorris/Documents/DroolsRule.g:154:88: PRIMITIVE
                {
                    mPRIMITIVE();

                }
                break;
                case 28: // /home/dcnorris/Documents/DroolsRule.g:154:100: SALIENCE
                {
                    mSALIENCE();

                }
                break;
                case 29: // /home/dcnorris/Documents/DroolsRule.g:156:3: 'new'
                {
                    match("new");

                }
                break;
                case 30: // /home/dcnorris/Documents/DroolsRule.g:156:11: 'return'
                {
                    match("return");

                }
                break;
                case 31: // /home/dcnorris/Documents/DroolsRule.g:156:22: 'if'
                {
                    match("if");

                }
                break;
                case 32: // /home/dcnorris/Documents/DroolsRule.g:156:29: 'else'
                {
                    match("else");

                }
                break;
                case 33: // /home/dcnorris/Documents/DroolsRule.g:156:38: 'do'
                {
                    match("do");

                }
                break;
                case 34: // /home/dcnorris/Documents/DroolsRule.g:156:45: 'while'
                {
                    match("while");

                }
                break;
                case 35: // /home/dcnorris/Documents/DroolsRule.g:156:55: 'for'
                {
                    match("for");

                }
                break;
                case 36: // /home/dcnorris/Documents/DroolsRule.g:156:63: 'try'
                {
                    match("try");

                }
                break;
                case 37: // /home/dcnorris/Documents/DroolsRule.g:156:71: 'catch'
                {
                    match("catch");

                }
                break;
                case 38: // /home/dcnorris/Documents/DroolsRule.g:156:81: 'finally'
                {
                    match("finally");

                }
                break;
                case 39: // /home/dcnorris/Documents/DroolsRule.g:156:93: 'break'
                {
                    match("break");

                }
                break;
                case 40: // /home/dcnorris/Documents/DroolsRule.g:156:103: 'continue'
                {
                    match("continue");

                }
                break;
                case 41: // /home/dcnorris/Documents/DroolsRule.g:157:3: 'date'
                {
                    match("date");

                }
                break;
                case 42: // /home/dcnorris/Documents/DroolsRule.g:157:12: 'effective'
                {
                    match("effective");

                }
                break;
                case 43: // /home/dcnorris/Documents/DroolsRule.g:157:26: 'expires'
                {
                    match("expires");

                }
                break;
                case 44: // /home/dcnorris/Documents/DroolsRule.g:157:38: 'lock'
                {
                    match("lock");

                }
                break;
                case 45: // /home/dcnorris/Documents/DroolsRule.g:157:47: 'on'
                {
                    match("on");

                }
                break;
                case 46: // /home/dcnorris/Documents/DroolsRule.g:157:54: 'active'
                {
                    match("active");

                }
                break;
                case 47: // /home/dcnorris/Documents/DroolsRule.g:157:65: 'no'
                {
                    match("no");

                }
                break;
                case 48: // /home/dcnorris/Documents/DroolsRule.g:157:72: 'loop'
                {
                    match("loop");

                }
                break;
                case 49: // /home/dcnorris/Documents/DroolsRule.g:157:81: 'auto'
                {
                    match("auto");

                }
                break;
                case 50: // /home/dcnorris/Documents/DroolsRule.g:157:90: 'focus'
                {
                    match("focus");

                }
                break;
                case 51: // /home/dcnorris/Documents/DroolsRule.g:157:100: 'activation'
                {
                    match("activation");

                }
                break;
                case 52: // /home/dcnorris/Documents/DroolsRule.g:158:3: 'group'
                {
                    match("group");

                }
                break;
                case 53: // /home/dcnorris/Documents/DroolsRule.g:158:13: 'agenda'
                {
                    match("agenda");

                }
                break;
                case 54: // /home/dcnorris/Documents/DroolsRule.g:158:24: 'ruleflow'
                {
                    match("ruleflow");

                }
                break;
                case 55: // /home/dcnorris/Documents/DroolsRule.g:158:37: 'timer'
                {
                    match("timer");

                }
                break;
                case 56: // /home/dcnorris/Documents/DroolsRule.g:158:47: 'calendars'
                {
                    match("calendars");

                }
                break;
                case 57: // /home/dcnorris/Documents/DroolsRule.g:158:61: 'refract'
                {
                    match("refract");

                }
                break;
                case 58: // /home/dcnorris/Documents/DroolsRule.g:158:73: 'direct'
                {
                    match("direct");

                }
                break;
                case 59: // /home/dcnorris/Documents/DroolsRule.g:159:3: 'attributes'
                {
                    match("attributes");

                }
                break;
                case 60: // /home/dcnorris/Documents/DroolsRule.g:159:18: 'template'
                {
                    match("template");

                }
                break;
                case 61: // /home/dcnorris/Documents/DroolsRule.g:159:30: 'query'
                {
                    match("query");

                }
                break;
                case 62: // /home/dcnorris/Documents/DroolsRule.g:159:42: 'function'
                {
                    match("function");

                }
                break;
                case 63: // /home/dcnorris/Documents/DroolsRule.g:159:54: 'excludes'
                {
                    match("excludes");

                }
                break;
                case 64: // /home/dcnorris/Documents/DroolsRule.g:159:67: 'soundslike'
                {
                    match("soundslike");

                }
                break;
                case 65: // /home/dcnorris/Documents/DroolsRule.g:159:82: 'memberof'
                {
                    match("memberof");

                }
                break;
                case 66: // /home/dcnorris/Documents/DroolsRule.g:160:5: 'in'
                {
                    match("in");

                }
                break;
                case 67: // /home/dcnorris/Documents/DroolsRule.g:160:12: 'exists'
                {
                    match("exists");

                }
                break;
                case 68: // /home/dcnorris/Documents/DroolsRule.g:160:23: 'over'
                {
                    match("over");

                }
                break;
                case 69: // /home/dcnorris/Documents/DroolsRule.g:160:31: 'entry'
                {
                    match("entry");

                }
                break;
                case 70: // /home/dcnorris/Documents/DroolsRule.g:160:41: 'point'
                {
                    match("point");

                }
                break;
                case 71: // /home/dcnorris/Documents/DroolsRule.g:160:51: 'accumulate'
                {
                    match("accumulate");

                }
                break;
                case 72: // /home/dcnorris/Documents/DroolsRule.g:160:66: 'acc'
                {
                    match("acc");

                }
                break;
                case 73: // /home/dcnorris/Documents/DroolsRule.g:160:74: 'collect'
                {
                    match("collect");

                }
                break;
                case 74: // /home/dcnorris/Documents/DroolsRule.g:160:86: 'action'
                {
                    match("action");

                }
                break;
                case 75: // /home/dcnorris/Documents/DroolsRule.g:160:97: 'reverse'
                {
                    match("reverse");

                }
                break;
                case 76: // /home/dcnorris/Documents/DroolsRule.g:160:109: 'result'
                {
                    match("result");

                }
                break;
                case 77: // /home/dcnorris/Documents/DroolsRule.g:161:5: 'init'
                {
                    match("init");

                }
                break;
                case 78: // /home/dcnorris/Documents/DroolsRule.g:161:14: 'instanceof'
                {
                    match("instanceof");

                }
                break;
                case 79: // /home/dcnorris/Documents/DroolsRule.g:161:29: 'super'
                {
                    match("super");

                }
                break;
                case 80: // /home/dcnorris/Documents/DroolsRule.g:161:39: 'final'
                {
                    match("final");

                }
                break;
                case 81: // /home/dcnorris/Documents/DroolsRule.g:161:49: 'default'
                {
                    match("default");

                }
                break;
                case 82: // /home/dcnorris/Documents/DroolsRule.g:161:61: 'switch'
                {
                    match("switch");

                }
                break;
                case 83: // /home/dcnorris/Documents/DroolsRule.g:161:72: 'synchronized'
                {
                    match("synchronized");

                }
                break;
                case 84: // /home/dcnorris/Documents/DroolsRule.g:161:89: 'throw'
                {
                    match("throw");

                }
                break;
                case 85: // /home/dcnorris/Documents/DroolsRule.g:162:5: 'assert'
                {
                    match("assert");

                }
                break;
                case 86: // /home/dcnorris/Documents/DroolsRule.g:162:16: 'static'
                {
                    match("static");

                }
                break;
                case 87: // /home/dcnorris/Documents/DroolsRule.g:162:27: 'public'
                {
                    match("public");

                }
                break;
                case 88: // /home/dcnorris/Documents/DroolsRule.g:162:38: 'protected'
                {
                    match("protected");

                }
                break;
                case 89: // /home/dcnorris/Documents/DroolsRule.g:162:52: 'private'
                {
                    match("private");

                }
                break;
                case 90: // /home/dcnorris/Documents/DroolsRule.g:162:64: 'abstract'
                {
                    match("abstract");

                }
                break;
                case 91: // /home/dcnorris/Documents/DroolsRule.g:162:77: 'native'
                {
                    match("native");

                }
                break;
                case 92: // /home/dcnorris/Documents/DroolsRule.g:162:88: 'transient'
                {
                    match("transient");

                }
                break;
                case 93: // /home/dcnorris/Documents/DroolsRule.g:162:102: 'volatile'
                {
                    match("volatile");

                }
                break;
                case 94: // /home/dcnorris/Documents/DroolsRule.g:162:115: 'strictfp'
                {
                    match("strictfp");

                }
                break;
                case 95: // /home/dcnorris/Documents/DroolsRule.g:162:128: 'throws'
                {
                    match("throws");

                }
                break;
                case 96: // /home/dcnorris/Documents/DroolsRule.g:163:5: 'interface'
                {
                    match("interface");

                }
                break;
                case 97: // /home/dcnorris/Documents/DroolsRule.g:163:19: 'enum'
                {
                    match("enum");

                }
                break;
                case 98: // /home/dcnorris/Documents/DroolsRule.g:163:28: 'implements'
                {
                    match("implements");

                }
                break;
                case 99: // /home/dcnorris/Documents/DroolsRule.g:163:44: 'type'
                {
                    match("type");

                }
                break;
                case 100: // /home/dcnorris/Documents/DroolsRule.g:163:53: 'window'
                {
                    match("window");

                }
                break;
                case 101: // /home/dcnorris/Documents/DroolsRule.g:163:64: 'trait'
                {
                    match("trait");

                }
                break;

            }
            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "KEYWORD"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/dcnorris/Documents/DroolsRule.g:167:2: ( ';' )
            // /home/dcnorris/Documents/DroolsRule.g:167:4: ';'
            {
                match(';');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/dcnorris/Documents/DroolsRule.g:171:2: ( ':' )
            // /home/dcnorris/Documents/DroolsRule.g:171:4: ':'
            {
                match(':');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "SEPARATOR"
    public final void mSEPARATOR() throws RecognitionException {
        try {
            int _type = SEPARATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/dcnorris/Documents/DroolsRule.g:175:2: ( '.' | '(' | ')' | '[' | ']' | ',' | COLON | SEMICOLON )
            // /home/dcnorris/Documents/DroolsRule.g:
            {
                if ((input.LA(1) >= '(' && input.LA(1) <= ')') || input.LA(1) == ',' || input.LA(1) == '.' || (input.LA(1) >= ':' && input.LA(1) <= ';') || input.LA(1) == '[' || input.LA(1) == ']') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "SEPARATOR"

    // $ANTLR start "OPERATOR"
    public final void mOPERATOR() throws RecognitionException {
        try {
            int _type = OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/dcnorris/Documents/DroolsRule.g:179:2: ( '==' | '!=' | '>' | '<' | '>=' | '<=' | '+' | '-' | '/' | '*' | '%' | '|' | '&' | '||' | '&&' | '!' | ':' | '=' )
            int alt4 = 18;
            switch (input.LA(1)) {
                case '=': {
                    int LA4_1 = input.LA(2);
                    if ((LA4_1 == '=')) {
                        alt4 = 1;
                    } else {
                        alt4 = 18;
                    }

                }
                break;
                case '!': {
                    int LA4_2 = input.LA(2);
                    if ((LA4_2 == '=')) {
                        alt4 = 2;
                    } else {
                        alt4 = 16;
                    }

                }
                break;
                case '>': {
                    int LA4_3 = input.LA(2);
                    if ((LA4_3 == '=')) {
                        alt4 = 5;
                    } else {
                        alt4 = 3;
                    }

                }
                break;
                case '<': {
                    int LA4_4 = input.LA(2);
                    if ((LA4_4 == '=')) {
                        alt4 = 6;
                    } else {
                        alt4 = 4;
                    }

                }
                break;
                case '+': {
                    alt4 = 7;
                }
                break;
                case '-': {
                    alt4 = 8;
                }
                break;
                case '/': {
                    alt4 = 9;
                }
                break;
                case '*': {
                    alt4 = 10;
                }
                break;
                case '%': {
                    alt4 = 11;
                }
                break;
                case '|': {
                    int LA4_10 = input.LA(2);
                    if ((LA4_10 == '|')) {
                        alt4 = 14;
                    } else {
                        alt4 = 12;
                    }

                }
                break;
                case '&': {
                    int LA4_11 = input.LA(2);
                    if ((LA4_11 == '&')) {
                        alt4 = 15;
                    } else {
                        alt4 = 13;
                    }

                }
                break;
                case ':': {
                    alt4 = 17;
                }
                break;
                default:
                    NoViableAltException nvae
                            = new NoViableAltException("", 4, 0, input);
                    throw nvae;
            }
            switch (alt4) {
                case 1: // /home/dcnorris/Documents/DroolsRule.g:179:4: '=='
                {
                    match("==");

                }
                break;
                case 2: // /home/dcnorris/Documents/DroolsRule.g:179:11: '!='
                {
                    match("!=");

                }
                break;
                case 3: // /home/dcnorris/Documents/DroolsRule.g:179:18: '>'
                {
                    match('>');
                }
                break;
                case 4: // /home/dcnorris/Documents/DroolsRule.g:179:24: '<'
                {
                    match('<');
                }
                break;
                case 5: // /home/dcnorris/Documents/DroolsRule.g:179:30: '>='
                {
                    match(">=");

                }
                break;
                case 6: // /home/dcnorris/Documents/DroolsRule.g:179:37: '<='
                {
                    match("<=");

                }
                break;
                case 7: // /home/dcnorris/Documents/DroolsRule.g:179:44: '+'
                {
                    match('+');
                }
                break;
                case 8: // /home/dcnorris/Documents/DroolsRule.g:179:50: '-'
                {
                    match('-');
                }
                break;
                case 9: // /home/dcnorris/Documents/DroolsRule.g:179:56: '/'
                {
                    match('/');
                }
                break;
                case 10: // /home/dcnorris/Documents/DroolsRule.g:179:62: '*'
                {
                    match('*');
                }
                break;
                case 11: // /home/dcnorris/Documents/DroolsRule.g:179:68: '%'
                {
                    match('%');
                }
                break;
                case 12: // /home/dcnorris/Documents/DroolsRule.g:179:74: '|'
                {
                    match('|');
                }
                break;
                case 13: // /home/dcnorris/Documents/DroolsRule.g:179:80: '&'
                {
                    match('&');
                }
                break;
                case 14: // /home/dcnorris/Documents/DroolsRule.g:179:86: '||'
                {
                    match("||");

                }
                break;
                case 15: // /home/dcnorris/Documents/DroolsRule.g:179:93: '&&'
                {
                    match("&&");

                }
                break;
                case 16: // /home/dcnorris/Documents/DroolsRule.g:179:100: '!'
                {
                    match('!');
                }
                break;
                case 17: // /home/dcnorris/Documents/DroolsRule.g:179:106: ':'
                {
                    match(':');
                }
                break;
                case 18: // /home/dcnorris/Documents/DroolsRule.g:179:112: '='
                {
                    match('=');
                }
                break;

            }
            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "OPERATOR"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/dcnorris/Documents/DroolsRule.g:182:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/dcnorris/Documents/DroolsRule.g:182:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
                if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z') || input.LA(1) == '_' || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
                // /home/dcnorris/Documents/DroolsRule.g:182:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
                loop5:
                while (true) {
                    int alt5 = 2;
                    int LA5_0 = input.LA(1);
                    if (((LA5_0 >= '0' && LA5_0 <= '9') || (LA5_0 >= 'A' && LA5_0 <= 'Z') || LA5_0 == '_' || (LA5_0 >= 'a' && LA5_0 <= 'z'))) {
                        alt5 = 1;
                    }

                    switch (alt5) {
                        case 1: // /home/dcnorris/Documents/DroolsRule.g:
                        {
                            if ((input.LA(1) >= '0' && input.LA(1) <= '9') || (input.LA(1) >= 'A' && input.LA(1) <= 'Z') || input.LA(1) == '_' || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
                                input.consume();
                            } else {
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                recover(mse);
                                throw mse;
                            }
                        }
                        break;

                        default:
                            break loop5;
                    }
                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "META"
    public final void mMETA() throws RecognitionException {
        try {
            int _type = META;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/dcnorris/Documents/DroolsRule.g:186:5: ( '@' ID )
            // /home/dcnorris/Documents/DroolsRule.g:186:9: '@' ID
            {
                match('@');
                mID();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "META"

    // $ANTLR start "BINDING"
    public final void mBINDING() throws RecognitionException {
        try {
            int _type = BINDING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/dcnorris/Documents/DroolsRule.g:190:2: ( '$' ID )
            // /home/dcnorris/Documents/DroolsRule.g:190:4: '$' ID
            {
                match('$');
                mID();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "BINDING"

    // $ANTLR start "FQN"
    public final void mFQN() throws RecognitionException {
        try {
            int _type = FQN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/dcnorris/Documents/DroolsRule.g:193:5: ( ID ( '.' ID )* )
            // /home/dcnorris/Documents/DroolsRule.g:193:7: ID ( '.' ID )*
            {
                mID();

                // /home/dcnorris/Documents/DroolsRule.g:193:10: ( '.' ID )*
                loop6:
                while (true) {
                    int alt6 = 2;
                    int LA6_0 = input.LA(1);
                    if ((LA6_0 == '.')) {
                        alt6 = 1;
                    }

                    switch (alt6) {
                        case 1: // /home/dcnorris/Documents/DroolsRule.g:193:11: '.' ID
                        {
                            match('.');
                            mID();

                        }
                        break;

                        default:
                            break loop6;
                    }
                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "FQN"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/dcnorris/Documents/DroolsRule.g:196:5: ( ( '0' .. '9' )+ )
            // /home/dcnorris/Documents/DroolsRule.g:196:7: ( '0' .. '9' )+
            {
                // /home/dcnorris/Documents/DroolsRule.g:196:7: ( '0' .. '9' )+
                int cnt7 = 0;
                loop7:
                while (true) {
                    int alt7 = 2;
                    int LA7_0 = input.LA(1);
                    if (((LA7_0 >= '0' && LA7_0 <= '9'))) {
                        alt7 = 1;
                    }

                    switch (alt7) {
                        case 1: // /home/dcnorris/Documents/DroolsRule.g:
                        {
                            if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
                                input.consume();
                            } else {
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                recover(mse);
                                throw mse;
                            }
                        }
                        break;

                        default:
                            if (cnt7 >= 1) {
                                break loop7;
                            }
                            EarlyExitException eee = new EarlyExitException(7, input);
                            throw eee;
                    }
                    cnt7++;
                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/dcnorris/Documents/DroolsRule.g:200:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
            int alt14 = 3;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1: // /home/dcnorris/Documents/DroolsRule.g:200:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                {
                    // /home/dcnorris/Documents/DroolsRule.g:200:9: ( '0' .. '9' )+
                    int cnt8 = 0;
                    loop8:
                    while (true) {
                        int alt8 = 2;
                        int LA8_0 = input.LA(1);
                        if (((LA8_0 >= '0' && LA8_0 <= '9'))) {
                            alt8 = 1;
                        }

                        switch (alt8) {
                            case 1: // /home/dcnorris/Documents/DroolsRule.g:
                            {
                                if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
                                    input.consume();
                                } else {
                                    MismatchedSetException mse = new MismatchedSetException(null, input);
                                    recover(mse);
                                    throw mse;
                                }
                            }
                            break;

                            default:
                                if (cnt8 >= 1) {
                                    break loop8;
                                }
                                EarlyExitException eee = new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    }

                    match('.');
                    // /home/dcnorris/Documents/DroolsRule.g:200:25: ( '0' .. '9' )*
                    loop9:
                    while (true) {
                        int alt9 = 2;
                        int LA9_0 = input.LA(1);
                        if (((LA9_0 >= '0' && LA9_0 <= '9'))) {
                            alt9 = 1;
                        }

                        switch (alt9) {
                            case 1: // /home/dcnorris/Documents/DroolsRule.g:
                            {
                                if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
                                    input.consume();
                                } else {
                                    MismatchedSetException mse = new MismatchedSetException(null, input);
                                    recover(mse);
                                    throw mse;
                                }
                            }
                            break;

                            default:
                                break loop9;
                        }
                    }

                    // /home/dcnorris/Documents/DroolsRule.g:200:37: ( EXPONENT )?
                    int alt10 = 2;
                    int LA10_0 = input.LA(1);
                    if ((LA10_0 == 'E' || LA10_0 == 'e')) {
                        alt10 = 1;
                    }
                    switch (alt10) {
                        case 1: // /home/dcnorris/Documents/DroolsRule.g:200:37: EXPONENT
                        {
                            mEXPONENT();

                        }
                        break;

                    }

                }
                break;
                case 2: // /home/dcnorris/Documents/DroolsRule.g:201:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                {
                    match('.');
                    // /home/dcnorris/Documents/DroolsRule.g:201:13: ( '0' .. '9' )+
                    int cnt11 = 0;
                    loop11:
                    while (true) {
                        int alt11 = 2;
                        int LA11_0 = input.LA(1);
                        if (((LA11_0 >= '0' && LA11_0 <= '9'))) {
                            alt11 = 1;
                        }

                        switch (alt11) {
                            case 1: // /home/dcnorris/Documents/DroolsRule.g:
                            {
                                if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
                                    input.consume();
                                } else {
                                    MismatchedSetException mse = new MismatchedSetException(null, input);
                                    recover(mse);
                                    throw mse;
                                }
                            }
                            break;

                            default:
                                if (cnt11 >= 1) {
                                    break loop11;
                                }
                                EarlyExitException eee = new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    }

                    // /home/dcnorris/Documents/DroolsRule.g:201:25: ( EXPONENT )?
                    int alt12 = 2;
                    int LA12_0 = input.LA(1);
                    if ((LA12_0 == 'E' || LA12_0 == 'e')) {
                        alt12 = 1;
                    }
                    switch (alt12) {
                        case 1: // /home/dcnorris/Documents/DroolsRule.g:201:25: EXPONENT
                        {
                            mEXPONENT();

                        }
                        break;

                    }

                }
                break;
                case 3: // /home/dcnorris/Documents/DroolsRule.g:202:9: ( '0' .. '9' )+ EXPONENT
                {
                    // /home/dcnorris/Documents/DroolsRule.g:202:9: ( '0' .. '9' )+
                    int cnt13 = 0;
                    loop13:
                    while (true) {
                        int alt13 = 2;
                        int LA13_0 = input.LA(1);
                        if (((LA13_0 >= '0' && LA13_0 <= '9'))) {
                            alt13 = 1;
                        }

                        switch (alt13) {
                            case 1: // /home/dcnorris/Documents/DroolsRule.g:
                            {
                                if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
                                    input.consume();
                                } else {
                                    MismatchedSetException mse = new MismatchedSetException(null, input);
                                    recover(mse);
                                    throw mse;
                                }
                            }
                            break;

                            default:
                                if (cnt13 >= 1) {
                                    break loop13;
                                }
                                EarlyExitException eee = new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    }

                    mEXPONENT();

                }
                break;

            }
            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "SINGLELINE_COMMENT"
    public final void mSINGLELINE_COMMENT() throws RecognitionException {
        try {
            int _type = SINGLELINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/dcnorris/Documents/DroolsRule.g:206:2: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // /home/dcnorris/Documents/DroolsRule.g:206:4: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
                match("//");

                // /home/dcnorris/Documents/DroolsRule.g:206:9: (~ ( '\\n' | '\\r' ) )*
                loop15:
                while (true) {
                    int alt15 = 2;
                    int LA15_0 = input.LA(1);
                    if (((LA15_0 >= '\u0000' && LA15_0 <= '\t') || (LA15_0 >= '\u000B' && LA15_0 <= '\f') || (LA15_0 >= '\u000E' && LA15_0 <= '\uFFFF'))) {
                        alt15 = 1;
                    }

                    switch (alt15) {
                        case 1: // /home/dcnorris/Documents/DroolsRule.g:
                        {
                            if ((input.LA(1) >= '\u0000' && input.LA(1) <= '\t') || (input.LA(1) >= '\u000B' && input.LA(1) <= '\f') || (input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF')) {
                                input.consume();
                            } else {
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                recover(mse);
                                throw mse;
                            }
                        }
                        break;

                        default:
                            break loop15;
                    }
                }

                // /home/dcnorris/Documents/DroolsRule.g:206:23: ( '\\r' )?
                int alt16 = 2;
                int LA16_0 = input.LA(1);
                if ((LA16_0 == '\r')) {
                    alt16 = 1;
                }
                switch (alt16) {
                    case 1: // /home/dcnorris/Documents/DroolsRule.g:206:23: '\\r'
                    {
                        match('\r');
                    }
                    break;

                }

                match('\n');
                _channel = HIDDEN;
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "SINGLELINE_COMMENT"

    // $ANTLR start "MULTILINE_COMMENT"
    public final void mMULTILINE_COMMENT() throws RecognitionException {
        try {
            int _type = MULTILINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/dcnorris/Documents/DroolsRule.g:210:2: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // /home/dcnorris/Documents/DroolsRule.g:210:4: '/*' ( options {greedy=false; } : . )* '*/'
            {
                match("/*");

                // /home/dcnorris/Documents/DroolsRule.g:210:9: ( options {greedy=false; } : . )*
                loop17:
                while (true) {
                    int alt17 = 2;
                    int LA17_0 = input.LA(1);
                    if ((LA17_0 == '*')) {
                        int LA17_1 = input.LA(2);
                        if ((LA17_1 == '/')) {
                            alt17 = 2;
                        } else if (((LA17_1 >= '\u0000' && LA17_1 <= '.') || (LA17_1 >= '0' && LA17_1 <= '\uFFFF'))) {
                            alt17 = 1;
                        }

                    } else if (((LA17_0 >= '\u0000' && LA17_0 <= ')') || (LA17_0 >= '+' && LA17_0 <= '\uFFFF'))) {
                        alt17 = 1;
                    }

                    switch (alt17) {
                        case 1: // /home/dcnorris/Documents/DroolsRule.g:210:37: .
                        {
                            matchAny();
                        }
                        break;

                        default:
                            break loop17;
                    }
                }

                match("*/");

                _channel = HIDDEN;
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "MULTILINE_COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/dcnorris/Documents/DroolsRule.g:213:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/dcnorris/Documents/DroolsRule.g:213:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
                if ((input.LA(1) >= '\t' && input.LA(1) <= '\n') || input.LA(1) == '\r' || input.LA(1) == ' ') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
                _channel = HIDDEN;
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/dcnorris/Documents/DroolsRule.g:221:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
            // /home/dcnorris/Documents/DroolsRule.g:221:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
            {
                match('\"');
                // /home/dcnorris/Documents/DroolsRule.g:221:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
                loop18:
                while (true) {
                    int alt18 = 3;
                    int LA18_0 = input.LA(1);
                    if ((LA18_0 == '\\')) {
                        alt18 = 1;
                    } else if (((LA18_0 >= '\u0000' && LA18_0 <= '!') || (LA18_0 >= '#' && LA18_0 <= '[') || (LA18_0 >= ']' && LA18_0 <= '\uFFFF'))) {
                        alt18 = 2;
                    }

                    switch (alt18) {
                        case 1: // /home/dcnorris/Documents/DroolsRule.g:221:14: ESC_SEQ
                        {
                            mESC_SEQ();

                        }
                        break;
                        case 2: // /home/dcnorris/Documents/DroolsRule.g:221:24: ~ ( '\\\\' | '\"' )
                        {
                            if ((input.LA(1) >= '\u0000' && input.LA(1) <= '!') || (input.LA(1) >= '#' && input.LA(1) <= '[') || (input.LA(1) >= ']' && input.LA(1) <= '\uFFFF')) {
                                input.consume();
                            } else {
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                recover(mse);
                                throw mse;
                            }
                        }
                        break;

                        default:
                            break loop18;
                    }
                }

                match('\"');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/dcnorris/Documents/DroolsRule.g:224:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
            // /home/dcnorris/Documents/DroolsRule.g:224:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
            {
                match('\'');
                // /home/dcnorris/Documents/DroolsRule.g:224:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
                int alt19 = 2;
                int LA19_0 = input.LA(1);
                if ((LA19_0 == '\\')) {
                    alt19 = 1;
                } else if (((LA19_0 >= '\u0000' && LA19_0 <= '&') || (LA19_0 >= '(' && LA19_0 <= '[') || (LA19_0 >= ']' && LA19_0 <= '\uFFFF'))) {
                    alt19 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 19, 0, input);
                    throw nvae;
                }

                switch (alt19) {
                    case 1: // /home/dcnorris/Documents/DroolsRule.g:224:15: ESC_SEQ
                    {
                        mESC_SEQ();

                    }
                    break;
                    case 2: // /home/dcnorris/Documents/DroolsRule.g:224:25: ~ ( '\\'' | '\\\\' )
                    {
                        if ((input.LA(1) >= '\u0000' && input.LA(1) <= '&') || (input.LA(1) >= '(' && input.LA(1) <= '[') || (input.LA(1) >= ']' && input.LA(1) <= '\uFFFF')) {
                            input.consume();
                        } else {
                            MismatchedSetException mse = new MismatchedSetException(null, input);
                            recover(mse);
                            throw mse;
                        }
                    }
                    break;

                }

                match('\'');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // /home/dcnorris/Documents/DroolsRule.g:229:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // /home/dcnorris/Documents/DroolsRule.g:229:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
                if (input.LA(1) == 'E' || input.LA(1) == 'e') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
                // /home/dcnorris/Documents/DroolsRule.g:229:22: ( '+' | '-' )?
                int alt20 = 2;
                int LA20_0 = input.LA(1);
                if ((LA20_0 == '+' || LA20_0 == '-')) {
                    alt20 = 1;
                }
                switch (alt20) {
                    case 1: // /home/dcnorris/Documents/DroolsRule.g:
                    {
                        if (input.LA(1) == '+' || input.LA(1) == '-') {
                            input.consume();
                        } else {
                            MismatchedSetException mse = new MismatchedSetException(null, input);
                            recover(mse);
                            throw mse;
                        }
                    }
                    break;

                }

                // /home/dcnorris/Documents/DroolsRule.g:229:33: ( '0' .. '9' )+
                int cnt21 = 0;
                loop21:
                while (true) {
                    int alt21 = 2;
                    int LA21_0 = input.LA(1);
                    if (((LA21_0 >= '0' && LA21_0 <= '9'))) {
                        alt21 = 1;
                    }

                    switch (alt21) {
                        case 1: // /home/dcnorris/Documents/DroolsRule.g:
                        {
                            if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
                                input.consume();
                            } else {
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                recover(mse);
                                throw mse;
                            }
                        }
                        break;

                        default:
                            if (cnt21 >= 1) {
                                break loop21;
                            }
                            EarlyExitException eee = new EarlyExitException(21, input);
                            throw eee;
                    }
                    cnt21++;
                }

            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // /home/dcnorris/Documents/DroolsRule.g:232:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /home/dcnorris/Documents/DroolsRule.g:
            {
                if ((input.LA(1) >= '0' && input.LA(1) <= '9') || (input.LA(1) >= 'A' && input.LA(1) <= 'F') || (input.LA(1) >= 'a' && input.LA(1) <= 'f')) {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /home/dcnorris/Documents/DroolsRule.g:236:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt22 = 3;
            int LA22_0 = input.LA(1);
            if ((LA22_0 == '\\')) {
                switch (input.LA(2)) {
                    case '\"':
                    case '\'':
                    case '\\':
                    case 'b':
                    case 'f':
                    case 'n':
                    case 'r':
                    case 't': {
                        alt22 = 1;
                    }
                    break;
                    case 'u': {
                        alt22 = 2;
                    }
                    break;
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7': {
                        alt22 = 3;
                    }
                    break;
                    default:
                        int nvaeMark = input.mark();
                        try {
                            input.consume();
                            NoViableAltException nvae
                                    = new NoViableAltException("", 22, 1, input);
                            throw nvae;
                        } finally {
                            input.rewind(nvaeMark);
                        }
                }
            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 22, 0, input);
                throw nvae;
            }

            switch (alt22) {
                case 1: // /home/dcnorris/Documents/DroolsRule.g:236:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                {
                    match('\\');
                    if (input.LA(1) == '\"' || input.LA(1) == '\'' || input.LA(1) == '\\' || input.LA(1) == 'b' || input.LA(1) == 'f' || input.LA(1) == 'n' || input.LA(1) == 'r' || input.LA(1) == 't') {
                        input.consume();
                    } else {
                        MismatchedSetException mse = new MismatchedSetException(null, input);
                        recover(mse);
                        throw mse;
                    }
                }
                break;
                case 2: // /home/dcnorris/Documents/DroolsRule.g:237:9: UNICODE_ESC
                {
                    mUNICODE_ESC();

                }
                break;
                case 3: // /home/dcnorris/Documents/DroolsRule.g:238:9: OCTAL_ESC
                {
                    mOCTAL_ESC();

                }
                break;

            }
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // /home/dcnorris/Documents/DroolsRule.g:243:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt23 = 3;
            int LA23_0 = input.LA(1);
            if ((LA23_0 == '\\')) {
                int LA23_1 = input.LA(2);
                if (((LA23_1 >= '0' && LA23_1 <= '3'))) {
                    int LA23_2 = input.LA(3);
                    if (((LA23_2 >= '0' && LA23_2 <= '7'))) {
                        int LA23_4 = input.LA(4);
                        if (((LA23_4 >= '0' && LA23_4 <= '7'))) {
                            alt23 = 1;
                        } else {
                            alt23 = 2;
                        }

                    } else {
                        alt23 = 3;
                    }

                } else if (((LA23_1 >= '4' && LA23_1 <= '7'))) {
                    int LA23_3 = input.LA(3);
                    if (((LA23_3 >= '0' && LA23_3 <= '7'))) {
                        alt23 = 2;
                    } else {
                        alt23 = 3;
                    }

                } else {
                    int nvaeMark = input.mark();
                    try {
                        input.consume();
                        NoViableAltException nvae
                                = new NoViableAltException("", 23, 1, input);
                        throw nvae;
                    } finally {
                        input.rewind(nvaeMark);
                    }
                }

            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 23, 0, input);
                throw nvae;
            }

            switch (alt23) {
                case 1: // /home/dcnorris/Documents/DroolsRule.g:243:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                {
                    match('\\');
                    if ((input.LA(1) >= '0' && input.LA(1) <= '3')) {
                        input.consume();
                    } else {
                        MismatchedSetException mse = new MismatchedSetException(null, input);
                        recover(mse);
                        throw mse;
                    }
                    if ((input.LA(1) >= '0' && input.LA(1) <= '7')) {
                        input.consume();
                    } else {
                        MismatchedSetException mse = new MismatchedSetException(null, input);
                        recover(mse);
                        throw mse;
                    }
                    if ((input.LA(1) >= '0' && input.LA(1) <= '7')) {
                        input.consume();
                    } else {
                        MismatchedSetException mse = new MismatchedSetException(null, input);
                        recover(mse);
                        throw mse;
                    }
                }
                break;
                case 2: // /home/dcnorris/Documents/DroolsRule.g:244:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                {
                    match('\\');
                    if ((input.LA(1) >= '0' && input.LA(1) <= '7')) {
                        input.consume();
                    } else {
                        MismatchedSetException mse = new MismatchedSetException(null, input);
                        recover(mse);
                        throw mse;
                    }
                    if ((input.LA(1) >= '0' && input.LA(1) <= '7')) {
                        input.consume();
                    } else {
                        MismatchedSetException mse = new MismatchedSetException(null, input);
                        recover(mse);
                        throw mse;
                    }
                }
                break;
                case 3: // /home/dcnorris/Documents/DroolsRule.g:245:9: '\\\\' ( '0' .. '7' )
                {
                    match('\\');
                    if ((input.LA(1) >= '0' && input.LA(1) <= '7')) {
                        input.consume();
                    } else {
                        MismatchedSetException mse = new MismatchedSetException(null, input);
                        recover(mse);
                        throw mse;
                    }
                }
                break;

            }
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            // /home/dcnorris/Documents/DroolsRule.g:250:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /home/dcnorris/Documents/DroolsRule.g:250:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
                match('\\');
                match('u');
                mHEX_DIGIT();

                mHEX_DIGIT();

                mHEX_DIGIT();

                mHEX_DIGIT();

            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_ESC"

    @Override
    public void mTokens() throws RecognitionException {
        // /home/dcnorris/Documents/DroolsRule.g:1:8: ( DECLARE | DIALECT | END | EXTENDS | GLOBAL | IMPORT | PACKAGE | RULE | THEN | WHEN | SALIENCE | PRIMITIVE | METHOD | KEYWORD | SEMICOLON | COLON | SEPARATOR | OPERATOR | ID | META | BINDING | FQN | INT | FLOAT | SINGLELINE_COMMENT | MULTILINE_COMMENT | WS | STRING | CHAR )
        int alt24 = 29;
        alt24 = dfa24.predict(input);
        switch (alt24) {
            case 1: // /home/dcnorris/Documents/DroolsRule.g:1:10: DECLARE
            {
                mDECLARE();

            }
            break;
            case 2: // /home/dcnorris/Documents/DroolsRule.g:1:18: DIALECT
            {
                mDIALECT();

            }
            break;
            case 3: // /home/dcnorris/Documents/DroolsRule.g:1:26: END
            {
                mEND();

            }
            break;
            case 4: // /home/dcnorris/Documents/DroolsRule.g:1:30: EXTENDS
            {
                mEXTENDS();

            }
            break;
            case 5: // /home/dcnorris/Documents/DroolsRule.g:1:38: GLOBAL
            {
                mGLOBAL();

            }
            break;
            case 6: // /home/dcnorris/Documents/DroolsRule.g:1:45: IMPORT
            {
                mIMPORT();

            }
            break;
            case 7: // /home/dcnorris/Documents/DroolsRule.g:1:52: PACKAGE
            {
                mPACKAGE();

            }
            break;
            case 8: // /home/dcnorris/Documents/DroolsRule.g:1:60: RULE
            {
                mRULE();

            }
            break;
            case 9: // /home/dcnorris/Documents/DroolsRule.g:1:65: THEN
            {
                mTHEN();

            }
            break;
            case 10: // /home/dcnorris/Documents/DroolsRule.g:1:70: WHEN
            {
                mWHEN();

            }
            break;
            case 11: // /home/dcnorris/Documents/DroolsRule.g:1:75: SALIENCE
            {
                mSALIENCE();

            }
            break;
            case 12: // /home/dcnorris/Documents/DroolsRule.g:1:84: PRIMITIVE
            {
                mPRIMITIVE();

            }
            break;
            case 13: // /home/dcnorris/Documents/DroolsRule.g:1:94: METHOD
            {
                mMETHOD();

            }
            break;
            case 14: // /home/dcnorris/Documents/DroolsRule.g:1:101: KEYWORD
            {
                mKEYWORD();

            }
            break;
            case 15: // /home/dcnorris/Documents/DroolsRule.g:1:109: SEMICOLON
            {
                mSEMICOLON();

            }
            break;
            case 16: // /home/dcnorris/Documents/DroolsRule.g:1:119: COLON
            {
                mCOLON();

            }
            break;
            case 17: // /home/dcnorris/Documents/DroolsRule.g:1:125: SEPARATOR
            {
                mSEPARATOR();

            }
            break;
            case 18: // /home/dcnorris/Documents/DroolsRule.g:1:135: OPERATOR
            {
                mOPERATOR();

            }
            break;
            case 19: // /home/dcnorris/Documents/DroolsRule.g:1:144: ID
            {
                mID();

            }
            break;
            case 20: // /home/dcnorris/Documents/DroolsRule.g:1:147: META
            {
                mMETA();

            }
            break;
            case 21: // /home/dcnorris/Documents/DroolsRule.g:1:152: BINDING
            {
                mBINDING();

            }
            break;
            case 22: // /home/dcnorris/Documents/DroolsRule.g:1:160: FQN
            {
                mFQN();

            }
            break;
            case 23: // /home/dcnorris/Documents/DroolsRule.g:1:164: INT
            {
                mINT();

            }
            break;
            case 24: // /home/dcnorris/Documents/DroolsRule.g:1:168: FLOAT
            {
                mFLOAT();

            }
            break;
            case 25: // /home/dcnorris/Documents/DroolsRule.g:1:174: SINGLELINE_COMMENT
            {
                mSINGLELINE_COMMENT();

            }
            break;
            case 26: // /home/dcnorris/Documents/DroolsRule.g:1:193: MULTILINE_COMMENT
            {
                mMULTILINE_COMMENT();

            }
            break;
            case 27: // /home/dcnorris/Documents/DroolsRule.g:1:211: WS
            {
                mWS();

            }
            break;
            case 28: // /home/dcnorris/Documents/DroolsRule.g:1:214: STRING
            {
                mSTRING();

            }
            break;
            case 29: // /home/dcnorris/Documents/DroolsRule.g:1:221: CHAR
            {
                mCHAR();

            }
            break;

        }
    }

    protected DFA3 dfa3 = new DFA3(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA3_eotS
            = "\44\uffff\1\127\6\uffff\1\135\14\uffff\1\160\30\uffff\1\u0084\33\uffff"
            + "\1\35\22\uffff\1\u0091\5\uffff\1\u0097\1\uffff\1\u009b\3\uffff\1\u009d"
            + "\10\uffff\1\u00a3\10\uffff\1\u00a6\1\u00a8\16\uffff\1\u00b0\2\uffff";
    static final String DFA3_eofS
            = "\u00b1\uffff";
    static final String DFA3_minS
            = "\1\141\1\142\1\151\1\156\4\141\1\157\1\uffff\1\146\1\154\1\146\1\141\2"
            + "\145\1\150\1\157\1\141\3\uffff\1\164\1\145\1\143\5\uffff\1\143\1\156\4"
            + "\uffff\1\55\3\uffff\1\164\1\143\1\141\1\165\2\uffff\2\154\1\143\1\141"
            + "\1\143\4\uffff\1\160\1\151\4\uffff\1\151\1\154\1\146\1\145\1\141\3\uffff"
            + "\1\145\7\uffff\1\141\1\157\1\156\1\151\1\165\2\uffff\1\141\3\uffff\1\145"
            + "\5\uffff\1\164\3\uffff\1\153\11\uffff\1\154\1\145\5\uffff\1\145\5\uffff"
            + "\1\157\1\uffff\1\151\4\uffff\1\55\1\144\1\157\2\uffff\1\154\1\55\1\141"
            + "\1\55\3\uffff\1\146\1\167\4\uffff\2\141\1\uffff\1\154\1\145\7\uffff\1"
            + "\163\1\55\1\164\3\uffff\1\146\4\uffff\1\151\2\uffff\1\157\1\156\1\55\2"
            + "\uffff";
    static final String DFA3_maxS
            = "\1\167\2\165\1\166\1\157\1\165\1\145\2\157\1\uffff\1\170\1\162\1\156\2"
            + "\165\1\171\1\151\2\171\3\uffff\1\164\1\145\1\164\5\uffff\1\162\1\156\4"
            + "\uffff\1\164\3\uffff\1\164\1\146\1\162\1\165\2\uffff\1\156\1\164\1\157"
            + "\1\165\1\164\4\uffff\1\160\1\164\4\uffff\1\157\1\154\1\166\1\162\1\171"
            + "\3\uffff\1\151\7\uffff\1\162\1\157\1\156\1\151\1\165\2\uffff\1\141\3\uffff"
            + "\1\145\5\uffff\1\164\3\uffff\1\153\11\uffff\1\157\1\145\5\uffff\1\145"
            + "\5\uffff\1\157\1\uffff\1\156\4\uffff\1\55\1\144\1\166\2\uffff\1\154\1"
            + "\55\1\151\1\55\3\uffff\1\146\1\167\4\uffff\1\141\1\145\1\uffff\1\154\1"
            + "\145\7\uffff\1\163\1\55\1\164\3\uffff\1\170\4\uffff\1\151\2\uffff\1\157"
            + "\1\156\1\55\2\uffff";
    static final String DFA3_acceptS
            = "\11\uffff\1\14\11\uffff\1\75\1\135\1\1\3\uffff\1\73\1\125\1\132\1\2\1"
            + "\33\2\uffff\1\76\1\3\1\55\1\104\1\uffff\1\35\1\133\1\5\4\uffff\1\10\1"
            + "\101\5\uffff\1\40\1\52\1\25\1\64\2\uffff\1\37\1\27\1\106\1\127\5\uffff"
            + "\1\67\1\74\1\143\1\uffff\1\144\1\47\1\34\1\100\1\117\1\122\1\123\5\uffff"
            + "\1\43\1\62\1\uffff\1\4\1\7\1\57\1\uffff\1\21\1\121\1\22\1\72\1\41\1\uffff"
            + "\1\111\1\45\1\70\1\uffff\1\60\1\15\1\23\1\105\1\141\1\24\1\53\1\77\1\103"
            + "\2\uffff\1\115\1\116\1\102\1\130\1\131\1\uffff\1\36\1\71\1\113\1\114\1"
            + "\31\1\uffff\1\44\1\uffff\1\32\1\42\1\126\1\136\3\uffff\1\107\1\110\4\uffff"
            + "\1\26\1\142\1\140\2\uffff\1\134\1\145\1\6\1\61\2\uffff\1\112\2\uffff\1"
            + "\51\1\11\1\50\1\13\1\54\1\66\1\30\3\uffff\1\56\1\46\1\120\1\uffff\1\137"
            + "\1\124\1\12\1\65\1\uffff\1\16\1\17\3\uffff\1\20\1\63";
    static final String DFA3_specialS
            = "\u00b1\uffff}>";
    static final String[] DFA3_transitionS = {
        "\1\1\1\21\1\7\1\5\1\12\1\2\1\13\1\uffff\1\14\2\uffff\1\10\1\6\1\4\1\3"
        + "\1\15\1\23\1\16\1\22\1\17\1\11\1\24\1\20",
        "\1\33\1\30\3\uffff\1\27\6\uffff\1\25\4\uffff\1\32\1\31\1\26",
        "\1\37\2\uffff\1\35\2\uffff\1\36\2\uffff\1\34\2\uffff\1\40",
        "\1\42\3\uffff\1\41\3\uffff\1\43",
        "\1\46\3\uffff\1\45\11\uffff\1\44",
        "\1\50\3\uffff\1\51\3\uffff\1\52\5\uffff\1\53\5\uffff\1\47",
        "\1\54\3\uffff\1\55",
        "\1\57\6\uffff\1\35\6\uffff\1\56",
        "\1\60",
        "",
        "\1\64\5\uffff\1\63\1\uffff\1\61\11\uffff\1\62",
        "\1\65\5\uffff\1\66",
        "\1\71\6\uffff\1\67\1\70",
        "\1\72\15\uffff\1\73\2\uffff\1\75\2\uffff\1\74",
        "\1\77\17\uffff\1\76",
        "\1\103\2\uffff\1\100\1\102\10\uffff\1\101\6\uffff\1\104",
        "\1\105\1\106",
        "\1\35\2\uffff\1\107\6\uffff\1\35",
        "\1\110\6\uffff\1\35\6\uffff\1\111\4\uffff\1\115\1\112\1\uffff\1\113"
        + "\1\uffff\1\114",
        "",
        "",
        "",
        "\1\116",
        "\1\117",
        "\1\121\20\uffff\1\120",
        "",
        "",
        "",
        "",
        "",
        "\1\123\16\uffff\1\122",
        "\1\124",
        "",
        "",
        "",
        "",
        "\1\125\106\uffff\1\126",
        "",
        "",
        "",
        "\1\130",
        "\1\131\2\uffff\1\132",
        "\1\133\20\uffff\1\134",
        "\1\35",
        "",
        "",
        "\1\137\1\uffff\1\136",
        "\1\141\7\uffff\1\140",
        "\1\142\12\uffff\1\35\1\143",
        "\1\144\2\uffff\1\145\17\uffff\1\146\1\147",
        "\1\152\5\uffff\1\153\6\uffff\1\151\3\uffff\1\150",
        "",
        "",
        "",
        "",
        "\1\154",
        "\1\156\11\uffff\1\157\1\155",
        "",
        "",
        "",
        "",
        "\1\162\5\uffff\1\161",
        "\1\163",
        "\1\165\14\uffff\1\167\1\164\1\uffff\1\166",
        "\1\170\14\uffff\1\171",
        "\1\173\27\uffff\1\172",
        "",
        "",
        "",
        "\1\174\3\uffff\1\175",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "\1\176\20\uffff\1\177",
        "\1\u0080",
        "\1\u0081",
        "\1\u0082",
        "\1\u0083",
        "",
        "",
        "\1\u0085",
        "",
        "",
        "",
        "\1\u0086",
        "",
        "",
        "",
        "",
        "",
        "\1\u0087",
        "",
        "",
        "",
        "\1\u0088",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "\1\u008a\2\uffff\1\u0089",
        "\1\u008b",
        "",
        "",
        "",
        "",
        "",
        "\1\u008c",
        "",
        "",
        "",
        "",
        "",
        "\1\u008d",
        "",
        "\1\u008f\4\uffff\1\u008e",
        "",
        "",
        "",
        "",
        "\1\u0090",
        "\1\u0092",
        "\1\u0094\6\uffff\1\u0093",
        "",
        "",
        "\1\u0095",
        "\1\u0096",
        "\1\u0098\7\uffff\1\u0099",
        "\1\u009a",
        "",
        "",
        "",
        "\1\u009c",
        "\1\u009e",
        "",
        "",
        "",
        "",
        "\1\u009f",
        "\1\u00a0\3\uffff\1\u00a1",
        "",
        "\1\u00a2",
        "\1\u00a4",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "\1\u00a5",
        "\1\u00a7",
        "\1\u00a9",
        "",
        "",
        "",
        "\1\u00ab\21\uffff\1\u00aa",
        "",
        "",
        "",
        "",
        "\1\u00ac",
        "",
        "",
        "\1\u00ad",
        "\1\u00ae",
        "\1\u00af",
        "",
        ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    protected class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }

        @Override
        public String getDescription() {
            return "151:1: KEYWORD : ( 'and' | 'from' | 'or' | 'no-loop' | 'duration' | 'auto-focus' | 'not' | 'matches' | 'contains' | 'agenda-group' | 'lock-on-active' | 'uleflow-group' | 'enabled' | 'date-expires' | 'date-effective' | 'activation-group' | DECLARE | DIALECT | END | EXTENDS | GLOBAL | IMPORT | PACKAGE | RULE | THEN | WHEN | PRIMITIVE | SALIENCE | 'new' | 'return' | 'if' | 'else' | 'do' | 'while' | 'for' | 'try' | 'catch' | 'finally' | 'break' | 'continue' | 'date' | 'effective' | 'expires' | 'lock' | 'on' | 'active' | 'no' | 'loop' | 'auto' | 'focus' | 'activation' | 'group' | 'agenda' | 'ruleflow' | 'timer' | 'calendars' | 'refract' | 'direct' | 'attributes' | 'template' | 'query' | 'function' | 'excludes' | 'soundslike' | 'memberof' | 'in' | 'exists' | 'over' | 'entry' | 'point' | 'accumulate' | 'acc' | 'collect' | 'action' | 'reverse' | 'result' | 'init' | 'instanceof' | 'super' | 'final' | 'default' | 'switch' | 'synchronized' | 'throw' | 'assert' | 'static' | 'public' | 'protected' | 'private' | 'abstract' | 'native' | 'transient' | 'volatile' | 'strictfp' | 'throws' | 'interface' | 'enum' | 'implements' | 'type' | 'window' | 'trait' );";
        }
    }

    static final String DFA14_eotS
            = "\5\uffff";
    static final String DFA14_eofS
            = "\5\uffff";
    static final String DFA14_minS
            = "\2\56\3\uffff";
    static final String DFA14_maxS
            = "\1\71\1\145\3\uffff";
    static final String DFA14_acceptS
            = "\2\uffff\1\2\1\1\1\3";
    static final String DFA14_specialS
            = "\5\uffff}>";
    static final String[] DFA14_transitionS = {
        "\1\2\1\uffff\12\1",
        "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
        "",
        "",
        ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    protected class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }

        @Override
        public String getDescription() {
            return "199:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
        }
    }

    static final String DFA24_eotS
            = "\1\uffff\24\50\2\uffff\1\36\1\uffff\1\30\1\50\2\uffff\1\155\4\uffff\2"
            + "\50\1\163\3\50\2\uffff\10\50\2\163\54\50\2\163\1\50\1\163\4\50\6\uffff"
            + "\5\50\1\uffff\2\50\1\u00ce\15\50\1\u00de\16\50\1\163\26\50\1\163\16\50"
            + "\1\163\3\50\1\163\4\50\2\163\11\50\1\163\1\uffff\2\50\1\163\4\50\1\u012b"
            + "\1\163\6\50\1\uffff\2\50\1\163\5\50\1\u013a\4\50\1\u013f\5\50\1\163\1"
            + "\u0145\12\50\1\u00de\2\50\1\u00de\2\163\3\50\1\163\2\50\1\u00de\11\50"
            + "\1\163\6\50\1\163\12\50\1\163\4\50\1\uffff\2\50\1\163\6\50\1\163\4\50"
            + "\1\uffff\4\50\1\uffff\1\163\1\50\2\163\1\50\1\uffff\1\163\2\50\1\u00de"
            + "\1\50\1\163\5\50\1\163\1\u00de\1\50\2\163\4\50\1\163\16\50\1\163\4\50"
            + "\1\163\1\u00de\5\50\1\163\1\50\1\u01b0\1\u01b1\2\50\1\u012b\2\50\1\163"
            + "\3\50\1\163\2\50\2\163\2\50\1\163\2\50\1\163\1\50\1\163\2\50\1\u012b\6"
            + "\50\1\u012b\2\50\1\u012b\1\50\1\163\1\50\2\163\2\50\1\163\1\50\1\163\1"
            + "\50\1\u01d0\1\163\1\u01d1\1\50\1\163\1\u01d3\1\163\2\50\2\uffff\3\50\1"
            + "\u01d9\1\50\1\163\1\50\2\163\6\50\1\u00de\1\163\3\50\1\163\1\50\1\163"
            + "\7\50\2\uffff\1\163\1\uffff\1\163\4\50\1\uffff\1\50\1\163\1\50\1\163\1"
            + "\u01f2\2\50\4\163\1\50\1\163\3\50\3\163\1\50\1\163\1\50\2\163\1\uffff"
            + "\2\50\1\163\3\50\3\163\1\50\3\163\1\50\1\163";
    static final String DFA24_eofS
            = "\u0202\uffff";
    static final String DFA24_minS
            = "\1\11\24\56\2\uffff\1\60\1\uffff\1\52\1\56\2\uffff\1\56\4\uffff\6\56\2"
            + "\uffff\76\56\6\uffff\5\56\1\uffff\132\56\1\uffff\17\56\1\uffff\114\56"
            + "\1\uffff\16\56\1\uffff\4\56\1\uffff\5\56\1\uffff\152\56\2\uffff\30\56"
            + "\1\55\5\56\2\uffff\1\56\1\uffff\5\56\1\uffff\30\56\1\uffff\17\56";
    static final String DFA24_maxS
            = "\1\174\24\172\2\uffff\1\71\1\uffff\1\57\1\172\2\uffff\1\145\4\uffff\6"
            + "\172\2\uffff\76\172\6\uffff\5\172\1\uffff\132\172\1\uffff\17\172\1\uffff"
            + "\114\172\1\uffff\16\172\1\uffff\4\172\1\uffff\5\172\1\uffff\152\172\2"
            + "\uffff\36\172\2\uffff\1\172\1\uffff\5\172\1\uffff\30\172\1\uffff\17\172";
    static final String DFA24_acceptS
            = "\25\uffff\1\17\1\20\1\uffff\1\22\2\uffff\1\24\1\25\1\uffff\1\21\1\33\1"
            + "\34\1\35\6\uffff\1\23\1\26\76\uffff\1\17\1\20\1\30\1\31\1\32\1\27\5\uffff"
            + "\1\16\132\uffff\1\3\17\uffff\1\14\114\uffff\1\15\16\uffff\1\10\4\uffff"
            + "\1\11\5\uffff\1\12\152\uffff\1\5\1\6\36\uffff\1\1\1\2\1\uffff\1\4\5\uffff"
            + "\1\7\30\uffff\1\13\17\uffff";
    static final String DFA24_specialS
            = "\u0202\uffff}>";
    static final String[] DFA24_transitionS = {
        "\2\37\2\uffff\1\37\22\uffff\1\37\1\30\1\40\1\uffff\1\34\2\30\1\41\2\36"
        + "\2\30\1\36\1\30\1\27\1\31\12\35\1\26\1\25\3\30\1\uffff\1\33\32\32\1\36"
        + "\1\uffff\1\36\1\uffff\1\32\1\uffff\1\20\1\12\1\15\1\1\1\2\1\14\1\3\1"
        + "\32\1\4\2\32\1\13\1\16\1\22\1\21\1\5\1\23\1\6\1\11\1\7\1\17\1\24\1\10"
        + "\3\32\1\uffff\1\30",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\46\3\47\1\42"
        + "\3\47\1\43\5\47\1\44\5\47\1\45\5\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\5\47\1\56\5\47"
        + "\1\55\1\47\1\52\7\47\1\54\1\47\1\53\2\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\57\5"
        + "\47\1\60\10\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\5\47\1\63\6\47"
        + "\1\61\1\62\14\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\64\15\47\1"
        + "\65\2\47\1\67\2\47\1\66\5\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\71\17"
        + "\47\1\70\5\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\75\2\47"
        + "\1\72\1\74\10\47\1\73\6\47\1\76\1\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\7\47\1\77\1\100"
        + "\21\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\101\6\47\1"
        + "\102\6\47\1\103\4\47\1\107\1\104\1\47\1\105\1\47\1\106\1\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\111\2"
        + "\47\1\112\6\47\1\110\1\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\113\13"
        + "\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\117\2"
        + "\47\1\114\2\47\1\115\2\47\1\116\2\47\1\120\5\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\123\6\47\1"
        + "\121\6\47\1\122\13\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\125\3\47\1"
        + "\126\11\47\1\124\13\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\130\3"
        + "\47\1\127\12\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\47\1\137\1"
        + "\134\3\47\1\133\6\47\1\131\4\47\1\136\1\135\1\132\5\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\141\3"
        + "\47\1\140\3\47\1\142\4\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\145\3\47\1"
        + "\144\11\47\1\143\13\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24\47\1\146\5"
        + "\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\147\13"
        + "\47",
        "",
        "",
        "\12\152",
        "",
        "\1\154\4\uffff\1\153",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "",
        "",
        "\1\152\1\uffff\12\35\13\uffff\1\152\37\uffff\1\152",
        "",
        "",
        "",
        "",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\156\2"
        + "\47\1\157\24\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\160\20\47\1"
        + "\161\10\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24\47\1\162\5"
        + "\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\164\10"
        + "\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\165\6"
        + "\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "",
        "",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\167\2\47\1"
        + "\166\17\47\1\170\1\171\5\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\174\5"
        + "\47\1\175\6\47\1\173\3\47\1\172\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\176\31\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\177\7"
        + "\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\5\47\1\u0080"
        + "\24\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u0081"
        + "\13\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u0082"
        + "\13\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\17\47\1\u0083"
        + "\12\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u0086"
        + "\11\47\1\u0085\1\u0084\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u0087"
        + "\27\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u0088"
        + "\21\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\47\1\u0089"
        + "\30\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u008b"
        + "\5\47\1\u008a\13\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u008c"
        + "\16\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\5\47\1\u008e"
        + "\14\47\1\u0090\1\u008d\1\47\1\u008f\4\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u0091"
        + "\14\47\1\u0092\10\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u0094\27\47"
        + "\1\u0093\1\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\14\47\1\u0095"
        + "\15\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\14\47\1\u0096"
        + "\15\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\17\47\1\u0097"
        + "\12\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u0098"
        + "\3\47\1\u0099\21\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u009a"
        + "\14\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u009b"
        + "\16\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u009c"
        + "\13\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24\47\1\u009d"
        + "\5\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\17\47\1\u009e"
        + "\12\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u009f"
        + "\21\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u00a0"
        + "\14\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u00a1\20\47"
        + "\1\u00a2\10\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u00a3"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u00a4"
        + "\13\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00a5"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u00a7"
        + "\12\47\1\u00a6\1\u00a8\13\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u00a9"
        + "\13\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u00ab"
        + "\16\47\1\u00aa\10\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u00ac"
        + "\13\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u00ad"
        + "\14\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u00ae"
        + "\14\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u00af\31\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u00b1"
        + "\1\47\1\u00b0\14\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u00b3"
        + "\7\47\1\u00b2\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47\1\u00b4"
        + "\26\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u00b5"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\14\47\1\u00b6"
        + "\15\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47\1\u00b7"
        + "\26\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00b8"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47\1\u00b9"
        + "\26\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u00ba"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00bb"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u00bd"
        + "\20\47\1\u00bc\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u00be"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u00bf"
        + "\7\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u00c0"
        + "\7\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00c1"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u00c2"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\26\47\1\u00c3"
        + "\3\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u00c4"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00c5"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u00c6"
        + "\16\47",
        "",
        "",
        "",
        "",
        "",
        "",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u00c7"
        + "\16\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u00c8\31\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u00c9"
        + "\16\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00ca"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\47\1\u00cb"
        + "\30\47",
        "",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u00cc\31\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00cd"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\47\1\u00cf"
        + "\30\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u00d0"
        + "\10\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\14\47\1\u00d1"
        + "\15\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00d2"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u00d3"
        + "\21\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u00d4"
        + "\16\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u00d5"
        + "\7\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u00d6"
        + "\16\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00d7"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00d8"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\47\1\u00d9"
        + "\30\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24\47\1\u00da"
        + "\5\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u00dc"
        + "\2\47\1\u00db\13\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00dd"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00df"
        + "\16\47\1\u00e0\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u00e1"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\12\47\1\u00e2"
        + "\17\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u00e3"
        + "\14\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u00e4"
        + "\16\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u00e5"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\25\47\1\u00e6"
        + "\4\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00e7"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24\47\1\u00e8"
        + "\5\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u00e9"
        + "\10\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00ea"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24\47\1\u00eb"
        + "\5\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u00ec"
        + "\14\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u00ed"
        + "\13\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u00ef"
        + "\4\47\1\u00ee\14\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00f0"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\17\47\1\u00f1"
        + "\12\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00f2"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u00f3"
        + "\14\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u00f4"
        + "\16\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47\1\u00f5"
        + "\26\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u00f6"
        + "\21\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u00f7"
        + "\10\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u00f8"
        + "\14\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00f9"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u00fa"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u00fb"
        + "\27\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u00fc"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u00fd"
        + "\21\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u00fe"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u00ff"
        + "\16\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u0100\31\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\6\47\1\u0101"
        + "\23\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\12\47\1\u0102"
        + "\17\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\17\47\1\u0103"
        + "\12\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u0104\31\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u0105\31\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24\47\1\u0106"
        + "\5\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\14\47\1\u0107"
        + "\15\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u0108\31\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u0109"
        + "\27\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u010a"
        + "\10\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u010b"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u010c"
        + "\16\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u010d"
        + "\27\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u010e"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u010f"
        + "\21\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u0110"
        + "\27\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\47\1\u0111"
        + "\30\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u0112\31\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\5\47\1\u0113"
        + "\24\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u0114"
        + "\13\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u0115"
        + "\14\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u0116"
        + "\21\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24\47\1\u0117"
        + "\5\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u0118"
        + "\10\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u0119"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u011a"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u011b"
        + "\10\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u011c"
        + "\21\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u011d"
        + "\10\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u011e\31\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u011f\31\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24\47\1\u0120"
        + "\5\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u0121"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u0122"
        + "\27\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u0123"
        + "\16\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u0124"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u0125"
        + "\16\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\30\47\1\u0126"
        + "\1\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u0127"
        + "\14\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u0128"
        + "\10\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24\47\1\u0129"
        + "\5\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u012a"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u012c"
        + "\27\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u012d\31\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\17\47\1\u012e"
        + "\12\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u012f"
        + "\10\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u0130"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u0131"
        + "\10\47",
        "",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u0132"
        + "\10\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u0133\31\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u0134\31\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u0135"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u0136"
        + "\21\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u0137"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u0138\31\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\5\47\1\u0139"
        + "\24\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u013b"
        + "\10\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u013c\31\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u013d"
        + "\10\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u013e"
        + "\16\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\26\47\1\u0140"
        + "\3\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u0141"
        + "\7\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u0142"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u0143"
        + "\10\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u0144"
        + "\16\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u0146"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u0147"
        + "\13\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u0148"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u0149"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47\1\u014a"
        + "\26\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u014b"
        + "\10\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u014c"
        + "\27\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\7\47\1\u014d"
        + "\22\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u014e"
        + "\21\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u014f"
        + "\27\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u0150"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\12\47\1\u0151"
        + "\17\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u0152"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u0153"
        + "\16\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u0154"
        + "\7\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u0155"
        + "\16\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u0156"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u0157\7\47"
        + "\1\u0158\21\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u0159"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\7\47\1\u015a"
        + "\22\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u015b"
        + "\14\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\5\47\1\u015c"
        + "\24\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\7\47\1\u015d"
        + "\22\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u015e"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u015f"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u0160"
        + "\16\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47\1\u0161"
        + "\26\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u0163"
        + "\6\47\1\u0162\4\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\14\47\1\u0164"
        + "\15\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u0165"
        + "\21\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u0166"
        + "\10\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u0167"
        + "\10\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\25\47\1\u0168"
        + "\4\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\30\47\1\u0169"
        + "\1\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u016a"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u016b"
        + "\10\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u016c"
        + "\16\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u016d"
        + "\27\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u016e"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u016f"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u0170"
        + "\21\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u0171"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47\1\u0172"
        + "\26\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u0173"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47\1\u0174"
        + "\26\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u0175"
        + "\7\47",
        "",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u0176"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u0177"
        + "\16\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u0178"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\14\47\1\u0179"
        + "\15\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\5\47\1\u017a"
        + "\24\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u017b"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u017c"
        + "\14\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\6\47\1\u017d"
        + "\23\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u017e"
        + "\27\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u017f"
        + "\27\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u0180"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u0181"
        + "\16\47",
        "",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u0182"
        + "\14\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u0183"
        + "\27\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u0184"
        + "\7\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u0185"
        + "\6\47",
        "",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u0186"
        + "\7\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u0187"
        + "\21\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u0188\31\47",
        "",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\26\47\1\u0189"
        + "\3\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u018a"
        + "\14\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u018b"
        + "\7\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\7\47\1\u018c"
        + "\22\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u018d"
        + "\10\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u018e"
        + "\27\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u018f"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u0190\31\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u0191"
        + "\16\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u0192"
        + "\16\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u0193"
        + "\21\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u0194"
        + "\21\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u0195"
        + "\14\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u0196"
        + "\27\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47\1\u0197"
        + "\26\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\30\47\1\u0198"
        + "\1\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u0199"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u019a"
        + "\10\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u019b"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u019c"
        + "\13\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u019d\31\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u019e\3\47"
        + "\1\u019f\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u01a0"
        + "\14\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24\47\1\u01a1"
        + "\5\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\47\1\u01a2"
        + "\30\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u01a3"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u01a4\31\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u01a5"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u01a6"
        + "\21\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u01a7"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u01a8"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u01a9"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u01aa"
        + "\13\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47\1\u01ab"
        + "\26\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u01ac"
        + "\7\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u01ad"
        + "\7\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u01ae"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u01af"
        + "\21\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u01b2"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u01b3\31\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u01b4"
        + "\27\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u01b5"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u01b6"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u01b7"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u01b8"
        + "\13\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u01b9"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u01ba"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u01bb"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u01bc"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u01bd"
        + "\27\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u01be"
        + "\16\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u01bf"
        + "\13\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\5\47\1\u01c0"
        + "\24\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u01c1"
        + "\14\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\30\47\1\u01c2"
        + "\1\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u01c3"
        + "\13\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u01c4"
        + "\14\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24\47\1\u01c5"
        + "\5\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u01c6"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u01c7\31\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u01c8"
        + "\7\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u01c9"
        + "\13\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\26\47\1\u01ca"
        + "\3\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u01cb"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u01cc"
        + "\16\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\24\47\1\u01cd"
        + "\5\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u01ce"
        + "\27\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\13\47\1\u01cf"
        + "\16\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u01d2"
        + "\14\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u01d4"
        + "\7\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\25\47\1\u01d5"
        + "\4\47",
        "",
        "",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u01d6"
        + "\14\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\2\47\1\u01d7"
        + "\27\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u01d8"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u01da"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\26\47\1\u01db"
        + "\3\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u01dc"
        + "\14\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u01dd"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u01de"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u01df"
        + "\21\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u01e0"
        + "\14\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\17\47\1\u01e1"
        + "\12\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u01e2"
        + "\14\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u01e3"
        + "\7\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u01e4"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\21\47\1\u01e5"
        + "\10\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\5\47\1\u01e6"
        + "\24\47",
        "\1\163\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u01e7"
        + "\21\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\1\u01e8\31\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u01e9"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u01ea"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u01eb"
        + "\25\47",
        "",
        "",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u01ec"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u01ed"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u01ee"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u01ef"
        + "\13\47",
        "",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47\1\u01f0"
        + "\26\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u01f1"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\12\47\1\u01f3"
        + "\17\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\10\47\1\u01f4"
        + "\21\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u01f5"
        + "\7\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\16\47\1\u01f6"
        + "\13\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\23\47\1\u01f7"
        + "\6\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u01f8"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u01f9"
        + "\7\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\5\47\1\u01fa"
        + "\24\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u01fb"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\31\47\1\u01fc",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\15\47\1\u01fd"
        + "\14\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u01fe"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\22\47\1\u01ff"
        + "\7\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\4\47\1\u0200"
        + "\25\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\3\47\1\u0201"
        + "\26\47",
        "\1\51\1\uffff\12\47\7\uffff\32\47\4\uffff\1\47\1\uffff\32\47"
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    protected class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }

        @Override
        public String getDescription() {
            return "1:1: Tokens : ( DECLARE | DIALECT | END | EXTENDS | GLOBAL | IMPORT | PACKAGE | RULE | THEN | WHEN | SALIENCE | PRIMITIVE | METHOD | KEYWORD | SEMICOLON | COLON | SEPARATOR | OPERATOR | ID | META | BINDING | FQN | INT | FLOAT | SINGLELINE_COMMENT | MULTILINE_COMMENT | WS | STRING | CHAR );";
        }
    }

}
