package com.opcoach.restaurant.menu.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMenuDslLexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators

    public InternalMenuDslLexer() {;} 
    public InternalMenuDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMenuDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:11:7: ( 'breakfast' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:11:9: 'breakfast'
            {
            match("breakfast"); 


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
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:12:7: ( 'dinner' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:12:9: 'dinner'
            {
            match("dinner"); 


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
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:13:7: ( 'lunch' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:13:9: 'lunch'
            {
            match("lunch"); 


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
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:14:7: ( 'supper' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:14:9: 'supper'
            {
            match("supper"); 


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
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:15:7: ( 'dessert' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:15:9: 'dessert'
            {
            match("dessert"); 


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
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:16:7: ( 'gram' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:16:9: 'gram'
            {
            match("gram"); 


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
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:17:7: ( 'milliliters' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:17:9: 'milliliters'
            {
            match("milliliters"); 


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
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:18:7: ( 'bottles' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:18:9: 'bottles'
            {
            match("bottles"); 


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
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:19:7: ( 'items' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:19:9: 'items'
            {
            match("items"); 


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
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:20:7: ( 'VeryHot' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:20:9: 'VeryHot'
            {
            match("VeryHot"); 


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
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:21:7: ( 'Hot' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:21:9: 'Hot'
            {
            match("Hot"); 


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
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:22:7: ( 'Normal' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:22:9: 'Normal'
            {
            match("Normal"); 


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
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:23:7: ( 'Mild' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:23:9: 'Mild'
            {
            match("Mild"); 


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
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:24:7: ( 'Menu' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:24:9: 'Menu'
            {
            match("Menu"); 


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
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:25:7: ( ',' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:25:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:26:7: ( 'Group' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:26:9: 'Group'
            {
            match("Group"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:27:7: ( 'Recipe' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:27:9: 'Recipe'
            {
            match("Recipe"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:28:7: ( 'price' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:28:9: 'price'
            {
            match("price"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:29:7: ( 'ingredients' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:29:9: 'ingredients'
            {
            match("ingredients"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:30:7: ( '.' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:30:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:31:7: ( '-' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:31:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:32:7: ( 'Ingredient' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:32:9: 'Ingredient'
            {
            match("Ingredient"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1942:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1942:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1942:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1942:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1942:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:
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
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1944:10: ( ( '0' .. '9' )+ )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1944:12: ( '0' .. '9' )+
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1944:12: ( '0' .. '9' )+
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
            	    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1944:13: '0' .. '9'
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
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1946:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1946:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1946:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1946:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1946:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1946:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1946:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1946:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1946:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1946:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1946:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
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

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1948:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1948:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1948:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1948:52: .
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
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1950:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1950:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1950:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1950:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1950:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1950:41: ( '\\r' )? '\\n'
                    {
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1950:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1950:41: '\\r'
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

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1952:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1952:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1952:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1954:16: ( . )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1954:18: .
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
        // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=29;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1:142: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 24 :
                // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1:150: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 25 :
                // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1:159: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 26 :
                // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1:171: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 27 :
                // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1:187: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 28 :
                // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1:203: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 29 :
                // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1:211: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\13\35\1\uffff\3\35\2\uffff\1\35\1\32\2\uffff\3\32\2\uffff"+
        "\2\35\1\uffff\15\35\1\uffff\3\35\2\uffff\1\35\5\uffff\13\35\1\125"+
        "\15\35\1\143\4\35\1\uffff\1\35\1\151\1\152\10\35\1\163\1\35\1\uffff"+
        "\1\35\1\166\3\35\2\uffff\1\172\1\35\1\174\3\35\1\u0080\1\35\1\uffff"+
        "\1\u0082\1\35\1\uffff\2\35\1\u0086\1\uffff\1\u0087\1\uffff\2\35"+
        "\1\u008a\1\uffff\1\u008b\1\uffff\2\35\1\u008e\2\uffff\2\35\2\uffff"+
        "\2\35\1\uffff\1\35\1\u0094\3\35\1\uffff\2\35\1\u009a\1\u009b\1\u009c"+
        "\3\uffff";
    static final String DFA12_eofS =
        "\u009d\uffff";
    static final String DFA12_minS =
        "\1\0\1\157\1\145\2\165\1\162\1\151\1\156\1\145\2\157\1\145\1\uffff"+
        "\1\162\1\145\1\162\2\uffff\1\156\1\101\2\uffff\2\0\1\52\2\uffff"+
        "\1\145\1\164\1\uffff\1\156\1\163\1\156\1\160\1\141\1\154\1\145\1"+
        "\147\1\162\1\164\1\162\1\154\1\156\1\uffff\1\157\1\143\1\151\2\uffff"+
        "\1\147\5\uffff\1\141\1\164\1\156\1\163\1\143\1\160\1\155\1\154\1"+
        "\155\1\162\1\171\1\60\1\155\1\144\2\165\1\151\1\143\1\162\1\153"+
        "\1\154\2\145\1\150\1\145\1\60\1\151\1\163\1\145\1\110\1\uffff\1"+
        "\141\2\60\2\160\2\145\1\146\1\145\2\162\1\60\1\162\1\uffff\1\154"+
        "\1\60\1\144\1\157\1\154\2\uffff\1\60\1\145\1\60\1\144\1\141\1\163"+
        "\1\60\1\164\1\uffff\1\60\1\151\1\uffff\1\151\1\164\1\60\1\uffff"+
        "\1\60\1\uffff\1\151\1\163\1\60\1\uffff\1\60\1\uffff\1\164\1\145"+
        "\1\60\2\uffff\1\145\1\164\2\uffff\1\145\1\156\1\uffff\1\156\1\60"+
        "\1\162\2\164\1\uffff\2\163\3\60\3\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\162\1\151\2\165\1\162\1\151\1\164\1\145\2\157\1\151"+
        "\1\uffff\1\162\1\145\1\162\2\uffff\1\156\1\172\2\uffff\2\uffff\1"+
        "\57\2\uffff\1\145\1\164\1\uffff\1\156\1\163\1\156\1\160\1\141\1"+
        "\154\1\145\1\147\1\162\1\164\1\162\1\154\1\156\1\uffff\1\157\1\143"+
        "\1\151\2\uffff\1\147\5\uffff\1\141\1\164\1\156\1\163\1\143\1\160"+
        "\1\155\1\154\1\155\1\162\1\171\1\172\1\155\1\144\2\165\1\151\1\143"+
        "\1\162\1\153\1\154\2\145\1\150\1\145\1\172\1\151\1\163\1\145\1\110"+
        "\1\uffff\1\141\2\172\2\160\2\145\1\146\1\145\2\162\1\172\1\162\1"+
        "\uffff\1\154\1\172\1\144\1\157\1\154\2\uffff\1\172\1\145\1\172\1"+
        "\144\1\141\1\163\1\172\1\164\1\uffff\1\172\1\151\1\uffff\1\151\1"+
        "\164\1\172\1\uffff\1\172\1\uffff\1\151\1\163\1\172\1\uffff\1\172"+
        "\1\uffff\1\164\1\145\1\172\2\uffff\1\145\1\164\2\uffff\1\145\1\156"+
        "\1\uffff\1\156\1\172\1\162\2\164\1\uffff\2\163\3\172\3\uffff";
    static final String DFA12_acceptS =
        "\14\uffff\1\17\3\uffff\1\24\1\25\2\uffff\1\27\1\30\3\uffff\1\34"+
        "\1\35\2\uffff\1\27\15\uffff\1\17\3\uffff\1\24\1\25\1\uffff\1\30"+
        "\1\31\1\32\1\33\1\34\36\uffff\1\13\15\uffff\1\6\5\uffff\1\15\1\16"+
        "\10\uffff\1\3\2\uffff\1\11\3\uffff\1\20\1\uffff\1\22\3\uffff\1\2"+
        "\1\uffff\1\4\3\uffff\1\14\1\21\2\uffff\1\10\1\5\2\uffff\1\12\5\uffff"+
        "\1\1\5\uffff\1\26\1\7\1\23";
    static final String DFA12_specialS =
        "\1\1\25\uffff\1\2\1\0\u0085\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\32\2\31\2\32\1\31\22\32\1\31\1\32\1\26\4\32\1\27\4\32\1"+
            "\14\1\21\1\20\1\30\12\25\7\32\6\24\1\15\1\11\1\22\3\24\1\13"+
            "\1\12\3\24\1\16\3\24\1\10\4\24\3\32\1\23\1\24\1\32\1\24\1\1"+
            "\1\24\1\2\2\24\1\5\1\24\1\7\2\24\1\3\1\6\2\24\1\17\2\24\1\4"+
            "\7\24\uff85\32",
            "\1\34\2\uffff\1\33",
            "\1\37\3\uffff\1\36",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\45\5\uffff\1\44",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\52\3\uffff\1\51",
            "",
            "\1\54",
            "\1\55",
            "\1\56",
            "",
            "",
            "\1\61",
            "\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "\0\63",
            "\0\63",
            "\1\64\4\uffff\1\65",
            "",
            "",
            "\1\67",
            "\1\70",
            "",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "",
            "",
            "\1\111",
            "",
            "",
            "",
            "",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "",
            "\1\150",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\164",
            "",
            "\1\165",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\167",
            "\1\170",
            "\1\171",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\173",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\175",
            "\1\176",
            "\1\177",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0081",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0083",
            "",
            "\1\u0084",
            "\1\u0085",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\1\u0088",
            "\1\u0089",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\1\u008c",
            "\1\u008d",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "\1\u008f",
            "\1\u0090",
            "",
            "",
            "\1\u0091",
            "\1\u0092",
            "",
            "\1\u0093",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "",
            "\1\u0098",
            "\1\u0099",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    static class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_23 = input.LA(1);

                        s = -1;
                        if ( ((LA12_23>='\u0000' && LA12_23<='\uFFFF')) ) {s = 51;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='b') ) {s = 1;}

                        else if ( (LA12_0=='d') ) {s = 2;}

                        else if ( (LA12_0=='l') ) {s = 3;}

                        else if ( (LA12_0=='s') ) {s = 4;}

                        else if ( (LA12_0=='g') ) {s = 5;}

                        else if ( (LA12_0=='m') ) {s = 6;}

                        else if ( (LA12_0=='i') ) {s = 7;}

                        else if ( (LA12_0=='V') ) {s = 8;}

                        else if ( (LA12_0=='H') ) {s = 9;}

                        else if ( (LA12_0=='N') ) {s = 10;}

                        else if ( (LA12_0=='M') ) {s = 11;}

                        else if ( (LA12_0==',') ) {s = 12;}

                        else if ( (LA12_0=='G') ) {s = 13;}

                        else if ( (LA12_0=='R') ) {s = 14;}

                        else if ( (LA12_0=='p') ) {s = 15;}

                        else if ( (LA12_0=='.') ) {s = 16;}

                        else if ( (LA12_0=='-') ) {s = 17;}

                        else if ( (LA12_0=='I') ) {s = 18;}

                        else if ( (LA12_0=='^') ) {s = 19;}

                        else if ( ((LA12_0>='A' && LA12_0<='F')||(LA12_0>='J' && LA12_0<='L')||(LA12_0>='O' && LA12_0<='Q')||(LA12_0>='S' && LA12_0<='U')||(LA12_0>='W' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='a'||LA12_0=='c'||(LA12_0>='e' && LA12_0<='f')||LA12_0=='h'||(LA12_0>='j' && LA12_0<='k')||(LA12_0>='n' && LA12_0<='o')||(LA12_0>='q' && LA12_0<='r')||(LA12_0>='t' && LA12_0<='z')) ) {s = 20;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 21;}

                        else if ( (LA12_0=='\"') ) {s = 22;}

                        else if ( (LA12_0=='\'') ) {s = 23;}

                        else if ( (LA12_0=='/') ) {s = 24;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 25;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||(LA12_0>='{' && LA12_0<='\uFFFF')) ) {s = 26;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_22 = input.LA(1);

                        s = -1;
                        if ( ((LA12_22>='\u0000' && LA12_22<='\uFFFF')) ) {s = 51;}

                        else s = 26;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}