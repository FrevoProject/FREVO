package helper;

// $ANTLR 3.1.1 CMinus.g 2017-02-16 17:04:53

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CMinusLexer extends Lexer {
    public static final int INT=5;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int ID=4;
    public static final int WS=6;
    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int T__7=7;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public CMinusLexer() {;} 
    public CMinusLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CMinusLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "CMinus.g"; }

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CMinus.g:3:6: ( ';' )
            // CMinus.g:3:8: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CMinus.g:4:6: ( '(' )
            // CMinus.g:4:8: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CMinus.g:5:6: ( ',' )
            // CMinus.g:5:8: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CMinus.g:6:7: ( ')' )
            // CMinus.g:6:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CMinus.g:7:7: ( 'int' )
            // CMinus.g:7:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CMinus.g:8:7: ( 'char' )
            // CMinus.g:8:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CMinus.g:9:7: ( '{' )
            // CMinus.g:9:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CMinus.g:10:7: ( '}' )
            // CMinus.g:10:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CMinus.g:11:7: ( 'for' )
            // CMinus.g:11:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CMinus.g:12:7: ( '=' )
            // CMinus.g:12:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CMinus.g:13:7: ( '[' )
            // CMinus.g:13:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CMinus.g:14:7: ( ']' )
            // CMinus.g:14:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CMinus.g:15:7: ( '==' )
            // CMinus.g:15:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CMinus.g:16:7: ( '<' )
            // CMinus.g:16:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CMinus.g:17:7: ( '<=' )
            // CMinus.g:17:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CMinus.g:18:7: ( '>=' )
            // CMinus.g:18:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CMinus.g:19:7: ( '>' )
            // CMinus.g:19:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CMinus.g:20:7: ( '!=' )
            // CMinus.g:20:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CMinus.g:21:7: ( '+' )
            // CMinus.g:21:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CMinus.g:155:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // CMinus.g:155:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // CMinus.g:155:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // CMinus.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CMinus.g:158:5: ( ( '0' .. '9' )+ )
            // CMinus.g:158:7: ( '0' .. '9' )+
            {
            // CMinus.g:158:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // CMinus.g:158:8: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // CMinus.g:161:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // CMinus.g:161:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // CMinus.g:161:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\t' && LA3_0<='\n')||LA3_0=='\r'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // CMinus.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            _channel=99;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // CMinus.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | ID | INT | WS )
        int alt4=22;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // CMinus.g:1:10: T__7
                {
                mT__7(); 

                }
                break;
            case 2 :
                // CMinus.g:1:15: T__8
                {
                mT__8(); 

                }
                break;
            case 3 :
                // CMinus.g:1:20: T__9
                {
                mT__9(); 

                }
                break;
            case 4 :
                // CMinus.g:1:25: T__10
                {
                mT__10(); 

                }
                break;
            case 5 :
                // CMinus.g:1:31: T__11
                {
                mT__11(); 

                }
                break;
            case 6 :
                // CMinus.g:1:37: T__12
                {
                mT__12(); 

                }
                break;
            case 7 :
                // CMinus.g:1:43: T__13
                {
                mT__13(); 

                }
                break;
            case 8 :
                // CMinus.g:1:49: T__14
                {
                mT__14(); 

                }
                break;
            case 9 :
                // CMinus.g:1:55: T__15
                {
                mT__15(); 

                }
                break;
            case 10 :
                // CMinus.g:1:61: T__16
                {
                mT__16(); 

                }
                break;
            case 11 :
                // CMinus.g:1:67: T__17
                {
                mT__17(); 

                }
                break;
            case 12 :
                // CMinus.g:1:73: T__18
                {
                mT__18(); 

                }
                break;
            case 13 :
                // CMinus.g:1:79: T__19
                {
                mT__19(); 

                }
                break;
            case 14 :
                // CMinus.g:1:85: T__20
                {
                mT__20(); 

                }
                break;
            case 15 :
                // CMinus.g:1:91: T__21
                {
                mT__21(); 

                }
                break;
            case 16 :
                // CMinus.g:1:97: T__22
                {
                mT__22(); 

                }
                break;
            case 17 :
                // CMinus.g:1:103: T__23
                {
                mT__23(); 

                }
                break;
            case 18 :
                // CMinus.g:1:109: T__24
                {
                mT__24(); 

                }
                break;
            case 19 :
                // CMinus.g:1:115: T__25
                {
                mT__25(); 

                }
                break;
            case 20 :
                // CMinus.g:1:121: ID
                {
                mID(); 

                }
                break;
            case 21 :
                // CMinus.g:1:124: INT
                {
                mINT(); 

                }
                break;
            case 22 :
                // CMinus.g:1:128: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\5\uffff\2\21\2\uffff\1\21\1\30\2\uffff\1\32\1\34\5\uffff\3\21"+
        "\6\uffff\1\40\1\21\1\42\1\uffff\1\43\2\uffff";
    static final String DFA4_eofS =
        "\44\uffff";
    static final String DFA4_minS =
        "\1\11\4\uffff\1\156\1\150\2\uffff\1\157\1\75\2\uffff\2\75\5\uffff"+
        "\1\164\1\141\1\162\6\uffff\1\60\1\162\1\60\1\uffff\1\60\2\uffff";
    static final String DFA4_maxS =
        "\1\175\4\uffff\1\156\1\150\2\uffff\1\157\1\75\2\uffff\2\75\5\uffff"+
        "\1\164\1\141\1\162\6\uffff\1\172\1\162\1\172\1\uffff\1\172\2\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\2\uffff\1\7\1\10\2\uffff\1\13\1\14\2\uffff"+
        "\1\22\1\23\1\24\1\25\1\26\3\uffff\1\15\1\12\1\17\1\16\1\20\1\21"+
        "\3\uffff\1\5\1\uffff\1\11\1\6";
    static final String DFA4_specialS =
        "\44\uffff}>";
    static final String[] DFA4_transitionS = {
            "\2\23\2\uffff\1\23\22\uffff\1\23\1\17\6\uffff\1\2\1\4\1\uffff"+
            "\1\20\1\3\3\uffff\12\22\1\uffff\1\1\1\15\1\12\1\16\2\uffff\32"+
            "\21\1\13\1\uffff\1\14\1\uffff\1\21\1\uffff\2\21\1\6\2\21\1\11"+
            "\2\21\1\5\21\21\1\7\1\uffff\1\10",
            "",
            "",
            "",
            "",
            "\1\24",
            "\1\25",
            "",
            "",
            "\1\26",
            "\1\27",
            "",
            "",
            "\1\31",
            "\1\33",
            "",
            "",
            "",
            "",
            "",
            "\1\35",
            "\1\36",
            "\1\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\41",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | ID | INT | WS );";
        }
    }
 

}