package snomed.visualization.dsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVisualizationDslLexer extends Lexer {
    public static final int RULE_CLOSING_CURLY_BRACKET=7;
    public static final int RULE_ID=12;
    public static final int RULE_COLON=4;
    public static final int RULE_STRING=17;
    public static final int RULE_PIPE=10;
    public static final int RULE_OPENING_CURLY_BRACKET=6;
    public static final int RULE_ANY_OTHER=18;
    public static final int RULE_EQUAL_SIGN=9;
    public static final int RULE_TERM=13;
    public static final int RULE_INT=16;
    public static final int RULE_PLUS_SIGN=5;
    public static final int RULE_COMMA=8;
    public static final int RULE_WS=11;
    public static final int RULE_SL_COMMENT=15;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=14;

    // delegates
    // delegators

    public InternalVisualizationDslLexer() {;} 
    public InternalVisualizationDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalVisualizationDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g"; }

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1293:9: ( '1' .. '9' ( '0' .. '9' )* )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1293:11: '1' .. '9' ( '0' .. '9' )*
            {
            matchRange('1','9'); 
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1293:20: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1293:21: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_TERM"
    public final void mRULE_TERM() throws RecognitionException {
        try {
            int _type = RULE_TERM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1295:11: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | ' ' )* )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1295:13: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | ' ' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1295:33: ( 'a' .. 'z' | 'A' .. 'Z' | ' ' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==' '||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:
            	    {
            	    if ( input.LA(1)==' '||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TERM"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1297:9: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1297:11: ( ' ' | '\\t' | '\\n' | '\\r' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1299:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1299:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1299:24: ( options {greedy=false; } : . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='*') ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1=='/') ) {
                        alt3=2;
                    }
                    else if ( ((LA3_1>='\u0000' && LA3_1<='.')||(LA3_1>='0' && LA3_1<='\uFFFF')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='\u0000' && LA3_0<=')')||(LA3_0>='+' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1299:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1301:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1301:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1301:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1301:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1301:40: ( ( '\\r' )? '\\n' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1301:41: ( '\\r' )? '\\n'
                    {
                    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1301:41: ( '\\r' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='\r') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1301:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_PIPE"
    public final void mRULE_PIPE() throws RecognitionException {
        try {
            int _type = RULE_PIPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1303:11: ( '|' )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1303:13: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PIPE"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1305:12: ( ':' )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1305:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_OPENING_CURLY_BRACKET"
    public final void mRULE_OPENING_CURLY_BRACKET() throws RecognitionException {
        try {
            int _type = RULE_OPENING_CURLY_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1307:28: ( '{' )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1307:30: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OPENING_CURLY_BRACKET"

    // $ANTLR start "RULE_CLOSING_CURLY_BRACKET"
    public final void mRULE_CLOSING_CURLY_BRACKET() throws RecognitionException {
        try {
            int _type = RULE_CLOSING_CURLY_BRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1309:28: ( '}' )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1309:30: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CLOSING_CURLY_BRACKET"

    // $ANTLR start "RULE_EQUAL_SIGN"
    public final void mRULE_EQUAL_SIGN() throws RecognitionException {
        try {
            int _type = RULE_EQUAL_SIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1311:17: ( '=' )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1311:19: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUAL_SIGN"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1313:12: ( ',' )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1313:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_PLUS_SIGN"
    public final void mRULE_PLUS_SIGN() throws RecognitionException {
        try {
            int _type = RULE_PLUS_SIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1315:16: ( '+' )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1315:18: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS_SIGN"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1317:10: ( ( '0' .. '9' )+ )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1317:12: ( '0' .. '9' )+
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1317:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1317:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1319:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1319:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1319:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1319:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1319:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1319:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1319:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1319:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1319:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1319:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1319:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1321:16: ( . )
            // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1321:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1:8: ( RULE_ID | RULE_TERM | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_PIPE | RULE_COLON | RULE_OPENING_CURLY_BRACKET | RULE_CLOSING_CURLY_BRACKET | RULE_EQUAL_SIGN | RULE_COMMA | RULE_PLUS_SIGN | RULE_INT | RULE_STRING | RULE_ANY_OTHER )
        int alt11=15;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1:10: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 2 :
                // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1:18: RULE_TERM
                {
                mRULE_TERM(); 

                }
                break;
            case 3 :
                // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1:28: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 4 :
                // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1:36: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 5 :
                // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1:52: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 6 :
                // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1:68: RULE_PIPE
                {
                mRULE_PIPE(); 

                }
                break;
            case 7 :
                // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1:78: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 8 :
                // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1:89: RULE_OPENING_CURLY_BRACKET
                {
                mRULE_OPENING_CURLY_BRACKET(); 

                }
                break;
            case 9 :
                // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1:116: RULE_CLOSING_CURLY_BRACKET
                {
                mRULE_CLOSING_CURLY_BRACKET(); 

                }
                break;
            case 10 :
                // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1:143: RULE_EQUAL_SIGN
                {
                mRULE_EQUAL_SIGN(); 

                }
                break;
            case 11 :
                // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1:159: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 12 :
                // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1:170: RULE_PLUS_SIGN
                {
                mRULE_PLUS_SIGN(); 

                }
                break;
            case 13 :
                // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1:185: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 14 :
                // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1:194: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 15 :
                // ../snomed.visualization.dsl.ui/src-gen/snomed/visualization/dsl/ui/contentassist/antlr/internal/InternalVisualizationDsl.g:1:206: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\1\20\2\uffff\1\17\10\uffff\2\17\2\uffff\1\20\15\uffff";
    static final String DFA11_eofS =
        "\37\uffff";
    static final String DFA11_minS =
        "\1\0\1\60\2\uffff\1\52\10\uffff\2\0\2\uffff\1\60\15\uffff";
    static final String DFA11_maxS =
        "\1\uffff\1\71\2\uffff\1\57\10\uffff\2\uffff\2\uffff\1\71\15\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\1\3\1\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
        "\2\uffff\1\17\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12"+
        "\1\13\1\14\1\15\1\16";
    static final String DFA11_specialS =
        "\1\0\14\uffff\1\2\1\1\20\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\17\2\3\2\17\1\3\22\17\1\3\1\17\1\15\4\17\1\16\3\17\1\13"+
            "\1\12\2\17\1\4\1\14\11\1\1\6\2\17\1\11\3\17\32\2\6\17\32\2\1"+
            "\7\1\5\1\10\uff82\17",
            "\12\21",
            "",
            "",
            "\1\24\4\uffff\1\25",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\0\36",
            "\0\36",
            "",
            "",
            "\12\21",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_ID | RULE_TERM | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_PIPE | RULE_COLON | RULE_OPENING_CURLY_BRACKET | RULE_CLOSING_CURLY_BRACKET | RULE_EQUAL_SIGN | RULE_COMMA | RULE_PLUS_SIGN | RULE_INT | RULE_STRING | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_0 = input.LA(1);

                        s = -1;
                        if ( ((LA11_0>='1' && LA11_0<='9')) ) {s = 1;}

                        else if ( ((LA11_0>='A' && LA11_0<='Z')||(LA11_0>='a' && LA11_0<='z')) ) {s = 2;}

                        else if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {s = 3;}

                        else if ( (LA11_0=='/') ) {s = 4;}

                        else if ( (LA11_0=='|') ) {s = 5;}

                        else if ( (LA11_0==':') ) {s = 6;}

                        else if ( (LA11_0=='{') ) {s = 7;}

                        else if ( (LA11_0=='}') ) {s = 8;}

                        else if ( (LA11_0=='=') ) {s = 9;}

                        else if ( (LA11_0==',') ) {s = 10;}

                        else if ( (LA11_0=='+') ) {s = 11;}

                        else if ( (LA11_0=='0') ) {s = 12;}

                        else if ( (LA11_0=='\"') ) {s = 13;}

                        else if ( (LA11_0=='\'') ) {s = 14;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||LA11_0=='!'||(LA11_0>='#' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='*')||(LA11_0>='-' && LA11_0<='.')||(LA11_0>=';' && LA11_0<='<')||(LA11_0>='>' && LA11_0<='@')||(LA11_0>='[' && LA11_0<='`')||(LA11_0>='~' && LA11_0<='\uFFFF')) ) {s = 15;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_14 = input.LA(1);

                        s = -1;
                        if ( ((LA11_14>='\u0000' && LA11_14<='\uFFFF')) ) {s = 30;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_13 = input.LA(1);

                        s = -1;
                        if ( ((LA11_13>='\u0000' && LA11_13<='\uFFFF')) ) {s = 30;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}