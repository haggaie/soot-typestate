package soot.typestate.automata.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalAutomataLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int Tokens=25;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=6;
    public static final int RULE_INT=5;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int RULE_WS=9;
    public static final int T15=15;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
    public InternalAutomataLexer() {;} 
    public InternalAutomataLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:10:5: ( 'package' )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:10:7: 'package'
            {
            match("package"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:11:5: ( ';' )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:11:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:12:5: ( 'automaton' )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:12:7: 'automaton'
            {
            match("automaton"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:13:5: ( '{' )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:13:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:14:5: ( 'initial' )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:14:7: 'initial'
            {
            match("initial"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:15:5: ( '=' )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:15:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:16:5: ( 'error' )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:16:7: 'error'
            {
            match("error"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:17:5: ( '}' )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:17:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:18:5: ( 'state' )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:18:7: 'state'
            {
            match("state"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:19:5: ( '->' )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:19:7: '->'
            {
            match("->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:20:5: ( '(' )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:20:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:21:5: ( ',' )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:21:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:22:5: ( ')' )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:22:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:23:5: ( '.' )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:23:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:788:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:788:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:788:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:788:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:788:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:790:10: ( ( '0' .. '9' )+ )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:790:12: ( '0' .. '9' )+
            {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:790:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:790:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:792:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:792:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:792:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("792:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:792:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:792:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:792:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:792:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:792:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:792:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:792:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:792:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:794:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:794:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:794:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:794:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:796:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:796:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:796:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:796:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:796:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:796:41: ( '\\r' )? '\\n'
                    {
                    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:796:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:796:41: '\\r'
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:798:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:798:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:798:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:800:16: ( . )
            // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:800:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=21;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='p') ) {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='a') ) {
                int LA12_23 = input.LA(3);

                if ( (LA12_23=='c') ) {
                    int LA12_43 = input.LA(4);

                    if ( (LA12_43=='k') ) {
                        int LA12_48 = input.LA(5);

                        if ( (LA12_48=='a') ) {
                            int LA12_53 = input.LA(6);

                            if ( (LA12_53=='g') ) {
                                int LA12_58 = input.LA(7);

                                if ( (LA12_58=='e') ) {
                                    int LA12_63 = input.LA(8);

                                    if ( ((LA12_63>='0' && LA12_63<='9')||(LA12_63>='A' && LA12_63<='Z')||LA12_63=='_'||(LA12_63>='a' && LA12_63<='z')) ) {
                                        alt12=15;
                                    }
                                    else {
                                        alt12=1;}
                                }
                                else {
                                    alt12=15;}
                            }
                            else {
                                alt12=15;}
                        }
                        else {
                            alt12=15;}
                    }
                    else {
                        alt12=15;}
                }
                else {
                    alt12=15;}
            }
            else {
                alt12=15;}
        }
        else if ( (LA12_0==';') ) {
            alt12=2;
        }
        else if ( (LA12_0=='a') ) {
            int LA12_3 = input.LA(2);

            if ( (LA12_3=='u') ) {
                int LA12_26 = input.LA(3);

                if ( (LA12_26=='t') ) {
                    int LA12_44 = input.LA(4);

                    if ( (LA12_44=='o') ) {
                        int LA12_49 = input.LA(5);

                        if ( (LA12_49=='m') ) {
                            int LA12_54 = input.LA(6);

                            if ( (LA12_54=='a') ) {
                                int LA12_59 = input.LA(7);

                                if ( (LA12_59=='t') ) {
                                    int LA12_64 = input.LA(8);

                                    if ( (LA12_64=='o') ) {
                                        int LA12_67 = input.LA(9);

                                        if ( (LA12_67=='n') ) {
                                            int LA12_69 = input.LA(10);

                                            if ( ((LA12_69>='0' && LA12_69<='9')||(LA12_69>='A' && LA12_69<='Z')||LA12_69=='_'||(LA12_69>='a' && LA12_69<='z')) ) {
                                                alt12=15;
                                            }
                                            else {
                                                alt12=3;}
                                        }
                                        else {
                                            alt12=15;}
                                    }
                                    else {
                                        alt12=15;}
                                }
                                else {
                                    alt12=15;}
                            }
                            else {
                                alt12=15;}
                        }
                        else {
                            alt12=15;}
                    }
                    else {
                        alt12=15;}
                }
                else {
                    alt12=15;}
            }
            else {
                alt12=15;}
        }
        else if ( (LA12_0=='{') ) {
            alt12=4;
        }
        else if ( (LA12_0=='i') ) {
            int LA12_5 = input.LA(2);

            if ( (LA12_5=='n') ) {
                int LA12_28 = input.LA(3);

                if ( (LA12_28=='i') ) {
                    int LA12_45 = input.LA(4);

                    if ( (LA12_45=='t') ) {
                        int LA12_50 = input.LA(5);

                        if ( (LA12_50=='i') ) {
                            int LA12_55 = input.LA(6);

                            if ( (LA12_55=='a') ) {
                                int LA12_60 = input.LA(7);

                                if ( (LA12_60=='l') ) {
                                    int LA12_65 = input.LA(8);

                                    if ( ((LA12_65>='0' && LA12_65<='9')||(LA12_65>='A' && LA12_65<='Z')||LA12_65=='_'||(LA12_65>='a' && LA12_65<='z')) ) {
                                        alt12=15;
                                    }
                                    else {
                                        alt12=5;}
                                }
                                else {
                                    alt12=15;}
                            }
                            else {
                                alt12=15;}
                        }
                        else {
                            alt12=15;}
                    }
                    else {
                        alt12=15;}
                }
                else {
                    alt12=15;}
            }
            else {
                alt12=15;}
        }
        else if ( (LA12_0=='=') ) {
            alt12=6;
        }
        else if ( (LA12_0=='e') ) {
            int LA12_7 = input.LA(2);

            if ( (LA12_7=='r') ) {
                int LA12_30 = input.LA(3);

                if ( (LA12_30=='r') ) {
                    int LA12_46 = input.LA(4);

                    if ( (LA12_46=='o') ) {
                        int LA12_51 = input.LA(5);

                        if ( (LA12_51=='r') ) {
                            int LA12_56 = input.LA(6);

                            if ( ((LA12_56>='0' && LA12_56<='9')||(LA12_56>='A' && LA12_56<='Z')||LA12_56=='_'||(LA12_56>='a' && LA12_56<='z')) ) {
                                alt12=15;
                            }
                            else {
                                alt12=7;}
                        }
                        else {
                            alt12=15;}
                    }
                    else {
                        alt12=15;}
                }
                else {
                    alt12=15;}
            }
            else {
                alt12=15;}
        }
        else if ( (LA12_0=='}') ) {
            alt12=8;
        }
        else if ( (LA12_0=='s') ) {
            int LA12_9 = input.LA(2);

            if ( (LA12_9=='t') ) {
                int LA12_32 = input.LA(3);

                if ( (LA12_32=='a') ) {
                    int LA12_47 = input.LA(4);

                    if ( (LA12_47=='t') ) {
                        int LA12_52 = input.LA(5);

                        if ( (LA12_52=='e') ) {
                            int LA12_57 = input.LA(6);

                            if ( ((LA12_57>='0' && LA12_57<='9')||(LA12_57>='A' && LA12_57<='Z')||LA12_57=='_'||(LA12_57>='a' && LA12_57<='z')) ) {
                                alt12=15;
                            }
                            else {
                                alt12=9;}
                        }
                        else {
                            alt12=15;}
                    }
                    else {
                        alt12=15;}
                }
                else {
                    alt12=15;}
            }
            else {
                alt12=15;}
        }
        else if ( (LA12_0=='-') ) {
            int LA12_10 = input.LA(2);

            if ( (LA12_10=='>') ) {
                alt12=10;
            }
            else {
                alt12=21;}
        }
        else if ( (LA12_0=='(') ) {
            alt12=11;
        }
        else if ( (LA12_0==',') ) {
            alt12=12;
        }
        else if ( (LA12_0==')') ) {
            alt12=13;
        }
        else if ( (LA12_0=='.') ) {
            alt12=14;
        }
        else if ( (LA12_0=='^') ) {
            int LA12_15 = input.LA(2);

            if ( ((LA12_15>='A' && LA12_15<='Z')||LA12_15=='_'||(LA12_15>='a' && LA12_15<='z')) ) {
                alt12=15;
            }
            else {
                alt12=21;}
        }
        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='b' && LA12_0<='d')||(LA12_0>='f' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='o')||(LA12_0>='q' && LA12_0<='r')||(LA12_0>='t' && LA12_0<='z')) ) {
            alt12=15;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=16;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_18 = input.LA(2);

            if ( ((LA12_18>='\u0000' && LA12_18<='\uFFFE')) ) {
                alt12=17;
            }
            else {
                alt12=21;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_19 = input.LA(2);

            if ( ((LA12_19>='\u0000' && LA12_19<='\uFFFE')) ) {
                alt12=17;
            }
            else {
                alt12=21;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt12=19;
                }
                break;
            case '*':
                {
                alt12=18;
                }
                break;
            default:
                alt12=21;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=20;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||LA12_0==':'||LA12_0=='<'||(LA12_0>='>' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12=21;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:1:66: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 16 :
                // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:1:74: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 17 :
                // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:1:83: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 18 :
                // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:1:95: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 19 :
                // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:1:111: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 20 :
                // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:1:127: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 21 :
                // ../soot.typestate.automata/src-gen/soot/typestate/automata/parser/antlr/internal/InternalAutomata.g:1:135: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}