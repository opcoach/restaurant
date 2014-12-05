package com.opcoach.restaurant.menu.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.opcoach.restaurant.menu.xtext.services.MenuDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMenuDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'breakfast'", "'dinner'", "'lunch'", "'supper'", "'dessert'", "'gram'", "'milliliters'", "'bottles'", "'items'", "'VeryHot'", "'Hot'", "'Normal'", "'Mild'", "'Group'", "'{'", "'}'", "'category'", "'recipes'", "','", "'Recipe'", "'price'", "'amount'", "'amountType'", "'ingredients'", "'.'", "'-'", "'Ingredient'", "'spiciness'"
    };
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
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalMenuDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMenuDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMenuDslParser.tokenNames; }
    public String getGrammarFileName() { return "../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g"; }


     
     	private MenuDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MenuDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleGroup"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:60:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:61:1: ( ruleGroup EOF )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:62:1: ruleGroup EOF
            {
             before(grammarAccess.getGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_entryRuleGroup61);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroup68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:69:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:73:2: ( ( ( rule__Group__Group__0 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:74:1: ( ( rule__Group__Group__0 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:74:1: ( ( rule__Group__Group__0 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:75:1: ( rule__Group__Group__0 )
            {
             before(grammarAccess.getGroupAccess().getGroup()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:76:1: ( rule__Group__Group__0 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:76:2: rule__Group__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__0_in_ruleGroup94);
            rule__Group__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleEString"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:88:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:89:1: ( ruleEString EOF )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:90:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString121);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:97:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:101:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:102:1: ( ( rule__EString__Alternatives ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:102:1: ( ( rule__EString__Alternatives ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:103:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:104:1: ( rule__EString__Alternatives )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:104:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString154);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleRecipe"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:116:1: entryRuleRecipe : ruleRecipe EOF ;
    public final void entryRuleRecipe() throws RecognitionException {
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:117:1: ( ruleRecipe EOF )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:118:1: ruleRecipe EOF
            {
             before(grammarAccess.getRecipeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRecipe_in_entryRuleRecipe181);
            ruleRecipe();

            state._fsp--;

             after(grammarAccess.getRecipeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRecipe188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRecipe"


    // $ANTLR start "ruleRecipe"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:125:1: ruleRecipe : ( ( rule__Recipe__Group__0 ) ) ;
    public final void ruleRecipe() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:129:2: ( ( ( rule__Recipe__Group__0 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:130:1: ( ( rule__Recipe__Group__0 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:130:1: ( ( rule__Recipe__Group__0 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:131:1: ( rule__Recipe__Group__0 )
            {
             before(grammarAccess.getRecipeAccess().getGroup()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:132:1: ( rule__Recipe__Group__0 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:132:2: rule__Recipe__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__0_in_ruleRecipe214);
            rule__Recipe__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecipe"


    // $ANTLR start "entryRuleEBigDecimal"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:144:1: entryRuleEBigDecimal : ruleEBigDecimal EOF ;
    public final void entryRuleEBigDecimal() throws RecognitionException {
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:145:1: ( ruleEBigDecimal EOF )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:146:1: ruleEBigDecimal EOF
            {
             before(grammarAccess.getEBigDecimalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBigDecimal_in_entryRuleEBigDecimal241);
            ruleEBigDecimal();

            state._fsp--;

             after(grammarAccess.getEBigDecimalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBigDecimal248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBigDecimal"


    // $ANTLR start "ruleEBigDecimal"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:153:1: ruleEBigDecimal : ( ( rule__EBigDecimal__Group__0 ) ) ;
    public final void ruleEBigDecimal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:157:2: ( ( ( rule__EBigDecimal__Group__0 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:158:1: ( ( rule__EBigDecimal__Group__0 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:158:1: ( ( rule__EBigDecimal__Group__0 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:159:1: ( rule__EBigDecimal__Group__0 )
            {
             before(grammarAccess.getEBigDecimalAccess().getGroup()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:160:1: ( rule__EBigDecimal__Group__0 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:160:2: rule__EBigDecimal__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBigDecimal__Group__0_in_ruleEBigDecimal274);
            rule__EBigDecimal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEBigDecimalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBigDecimal"


    // $ANTLR start "entryRuleEInt"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:172:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:173:1: ( ruleEInt EOF )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:174:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt301);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:181:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:185:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:186:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:186:1: ( ( rule__EInt__Group__0 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:187:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:188:1: ( rule__EInt__Group__0 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:188:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt334);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleIngredient"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:200:1: entryRuleIngredient : ruleIngredient EOF ;
    public final void entryRuleIngredient() throws RecognitionException {
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:201:1: ( ruleIngredient EOF )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:202:1: ruleIngredient EOF
            {
             before(grammarAccess.getIngredientRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIngredient_in_entryRuleIngredient361);
            ruleIngredient();

            state._fsp--;

             after(grammarAccess.getIngredientRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIngredient368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIngredient"


    // $ANTLR start "ruleIngredient"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:209:1: ruleIngredient : ( ( rule__Ingredient__Group__0 ) ) ;
    public final void ruleIngredient() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:213:2: ( ( ( rule__Ingredient__Group__0 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:214:1: ( ( rule__Ingredient__Group__0 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:214:1: ( ( rule__Ingredient__Group__0 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:215:1: ( rule__Ingredient__Group__0 )
            {
             before(grammarAccess.getIngredientAccess().getGroup()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:216:1: ( rule__Ingredient__Group__0 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:216:2: rule__Ingredient__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__0_in_ruleIngredient394);
            rule__Ingredient__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIngredient"


    // $ANTLR start "ruleCategory"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:229:1: ruleCategory : ( ( rule__Category__Alternatives ) ) ;
    public final void ruleCategory() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:233:1: ( ( ( rule__Category__Alternatives ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:234:1: ( ( rule__Category__Alternatives ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:234:1: ( ( rule__Category__Alternatives ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:235:1: ( rule__Category__Alternatives )
            {
             before(grammarAccess.getCategoryAccess().getAlternatives()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:236:1: ( rule__Category__Alternatives )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:236:2: rule__Category__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Category__Alternatives_in_ruleCategory431);
            rule__Category__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCategoryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCategory"


    // $ANTLR start "ruleAmountType"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:248:1: ruleAmountType : ( ( rule__AmountType__Alternatives ) ) ;
    public final void ruleAmountType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:252:1: ( ( ( rule__AmountType__Alternatives ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:253:1: ( ( rule__AmountType__Alternatives ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:253:1: ( ( rule__AmountType__Alternatives ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:254:1: ( rule__AmountType__Alternatives )
            {
             before(grammarAccess.getAmountTypeAccess().getAlternatives()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:255:1: ( rule__AmountType__Alternatives )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:255:2: rule__AmountType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AmountType__Alternatives_in_ruleAmountType467);
            rule__AmountType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAmountTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAmountType"


    // $ANTLR start "ruleSpiciness"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:267:1: ruleSpiciness : ( ( rule__Spiciness__Alternatives ) ) ;
    public final void ruleSpiciness() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:271:1: ( ( ( rule__Spiciness__Alternatives ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:272:1: ( ( rule__Spiciness__Alternatives ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:272:1: ( ( rule__Spiciness__Alternatives ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:273:1: ( rule__Spiciness__Alternatives )
            {
             before(grammarAccess.getSpicinessAccess().getAlternatives()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:274:1: ( rule__Spiciness__Alternatives )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:274:2: rule__Spiciness__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Spiciness__Alternatives_in_ruleSpiciness503);
            rule__Spiciness__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSpicinessAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpiciness"


    // $ANTLR start "rule__EString__Alternatives"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:285:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:289:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:290:1: ( RULE_STRING )
                    {
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:290:1: ( RULE_STRING )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:291:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives538); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:296:6: ( RULE_ID )
                    {
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:296:6: ( RULE_ID )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:297:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives555); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Category__Alternatives"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:307:1: rule__Category__Alternatives : ( ( ( 'breakfast' ) ) | ( ( 'dinner' ) ) | ( ( 'lunch' ) ) | ( ( 'supper' ) ) | ( ( 'dessert' ) ) );
    public final void rule__Category__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:311:1: ( ( ( 'breakfast' ) ) | ( ( 'dinner' ) ) | ( ( 'lunch' ) ) | ( ( 'supper' ) ) | ( ( 'dessert' ) ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:312:1: ( ( 'breakfast' ) )
                    {
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:312:1: ( ( 'breakfast' ) )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:313:1: ( 'breakfast' )
                    {
                     before(grammarAccess.getCategoryAccess().getBreakfastEnumLiteralDeclaration_0()); 
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:314:1: ( 'breakfast' )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:314:3: 'breakfast'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__Category__Alternatives588); 

                    }

                     after(grammarAccess.getCategoryAccess().getBreakfastEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:319:6: ( ( 'dinner' ) )
                    {
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:319:6: ( ( 'dinner' ) )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:320:1: ( 'dinner' )
                    {
                     before(grammarAccess.getCategoryAccess().getDinnerEnumLiteralDeclaration_1()); 
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:321:1: ( 'dinner' )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:321:3: 'dinner'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__Category__Alternatives609); 

                    }

                     after(grammarAccess.getCategoryAccess().getDinnerEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:326:6: ( ( 'lunch' ) )
                    {
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:326:6: ( ( 'lunch' ) )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:327:1: ( 'lunch' )
                    {
                     before(grammarAccess.getCategoryAccess().getLunchEnumLiteralDeclaration_2()); 
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:328:1: ( 'lunch' )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:328:3: 'lunch'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__Category__Alternatives630); 

                    }

                     after(grammarAccess.getCategoryAccess().getLunchEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:333:6: ( ( 'supper' ) )
                    {
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:333:6: ( ( 'supper' ) )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:334:1: ( 'supper' )
                    {
                     before(grammarAccess.getCategoryAccess().getSupperEnumLiteralDeclaration_3()); 
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:335:1: ( 'supper' )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:335:3: 'supper'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__Category__Alternatives651); 

                    }

                     after(grammarAccess.getCategoryAccess().getSupperEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:340:6: ( ( 'dessert' ) )
                    {
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:340:6: ( ( 'dessert' ) )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:341:1: ( 'dessert' )
                    {
                     before(grammarAccess.getCategoryAccess().getDessertEnumLiteralDeclaration_4()); 
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:342:1: ( 'dessert' )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:342:3: 'dessert'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__Category__Alternatives672); 

                    }

                     after(grammarAccess.getCategoryAccess().getDessertEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Category__Alternatives"


    // $ANTLR start "rule__AmountType__Alternatives"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:352:1: rule__AmountType__Alternatives : ( ( ( 'gram' ) ) | ( ( 'milliliters' ) ) | ( ( 'bottles' ) ) | ( ( 'items' ) ) );
    public final void rule__AmountType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:356:1: ( ( ( 'gram' ) ) | ( ( 'milliliters' ) ) | ( ( 'bottles' ) ) | ( ( 'items' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 19:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:357:1: ( ( 'gram' ) )
                    {
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:357:1: ( ( 'gram' ) )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:358:1: ( 'gram' )
                    {
                     before(grammarAccess.getAmountTypeAccess().getGramEnumLiteralDeclaration_0()); 
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:359:1: ( 'gram' )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:359:3: 'gram'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__AmountType__Alternatives708); 

                    }

                     after(grammarAccess.getAmountTypeAccess().getGramEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:364:6: ( ( 'milliliters' ) )
                    {
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:364:6: ( ( 'milliliters' ) )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:365:1: ( 'milliliters' )
                    {
                     before(grammarAccess.getAmountTypeAccess().getMillilitersEnumLiteralDeclaration_1()); 
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:366:1: ( 'milliliters' )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:366:3: 'milliliters'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__AmountType__Alternatives729); 

                    }

                     after(grammarAccess.getAmountTypeAccess().getMillilitersEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:371:6: ( ( 'bottles' ) )
                    {
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:371:6: ( ( 'bottles' ) )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:372:1: ( 'bottles' )
                    {
                     before(grammarAccess.getAmountTypeAccess().getBottlesEnumLiteralDeclaration_2()); 
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:373:1: ( 'bottles' )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:373:3: 'bottles'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__AmountType__Alternatives750); 

                    }

                     after(grammarAccess.getAmountTypeAccess().getBottlesEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:378:6: ( ( 'items' ) )
                    {
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:378:6: ( ( 'items' ) )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:379:1: ( 'items' )
                    {
                     before(grammarAccess.getAmountTypeAccess().getItemsEnumLiteralDeclaration_3()); 
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:380:1: ( 'items' )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:380:3: 'items'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__AmountType__Alternatives771); 

                    }

                     after(grammarAccess.getAmountTypeAccess().getItemsEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AmountType__Alternatives"


    // $ANTLR start "rule__Spiciness__Alternatives"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:390:1: rule__Spiciness__Alternatives : ( ( ( 'VeryHot' ) ) | ( ( 'Hot' ) ) | ( ( 'Normal' ) ) | ( ( 'Mild' ) ) );
    public final void rule__Spiciness__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:394:1: ( ( ( 'VeryHot' ) ) | ( ( 'Hot' ) ) | ( ( 'Normal' ) ) | ( ( 'Mild' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt4=1;
                }
                break;
            case 21:
                {
                alt4=2;
                }
                break;
            case 22:
                {
                alt4=3;
                }
                break;
            case 23:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:395:1: ( ( 'VeryHot' ) )
                    {
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:395:1: ( ( 'VeryHot' ) )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:396:1: ( 'VeryHot' )
                    {
                     before(grammarAccess.getSpicinessAccess().getVeryHotEnumLiteralDeclaration_0()); 
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:397:1: ( 'VeryHot' )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:397:3: 'VeryHot'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__Spiciness__Alternatives807); 

                    }

                     after(grammarAccess.getSpicinessAccess().getVeryHotEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:402:6: ( ( 'Hot' ) )
                    {
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:402:6: ( ( 'Hot' ) )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:403:1: ( 'Hot' )
                    {
                     before(grammarAccess.getSpicinessAccess().getHotEnumLiteralDeclaration_1()); 
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:404:1: ( 'Hot' )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:404:3: 'Hot'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__Spiciness__Alternatives828); 

                    }

                     after(grammarAccess.getSpicinessAccess().getHotEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:409:6: ( ( 'Normal' ) )
                    {
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:409:6: ( ( 'Normal' ) )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:410:1: ( 'Normal' )
                    {
                     before(grammarAccess.getSpicinessAccess().getNormalEnumLiteralDeclaration_2()); 
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:411:1: ( 'Normal' )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:411:3: 'Normal'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__Spiciness__Alternatives849); 

                    }

                     after(grammarAccess.getSpicinessAccess().getNormalEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:416:6: ( ( 'Mild' ) )
                    {
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:416:6: ( ( 'Mild' ) )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:417:1: ( 'Mild' )
                    {
                     before(grammarAccess.getSpicinessAccess().getMildEnumLiteralDeclaration_3()); 
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:418:1: ( 'Mild' )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:418:3: 'Mild'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__Spiciness__Alternatives870); 

                    }

                     after(grammarAccess.getSpicinessAccess().getMildEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Spiciness__Alternatives"


    // $ANTLR start "rule__Group__Group__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:430:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:434:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:435:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__0903);
            rule__Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__1_in_rule__Group__Group__0906);
            rule__Group__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__0"


    // $ANTLR start "rule__Group__Group__0__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:442:1: rule__Group__Group__0__Impl : ( () ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:446:1: ( ( () ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:447:1: ( () )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:447:1: ( () )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:448:1: ()
            {
             before(grammarAccess.getGroupAccess().getGroupAction_0()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:449:1: ()
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:451:1: 
            {
            }

             after(grammarAccess.getGroupAccess().getGroupAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__0__Impl"


    // $ANTLR start "rule__Group__Group__1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:461:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:465:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:466:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__1964);
            rule__Group__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__2_in_rule__Group__Group__1967);
            rule__Group__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__1"


    // $ANTLR start "rule__Group__Group__1__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:473:1: rule__Group__Group__1__Impl : ( 'Group' ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:477:1: ( ( 'Group' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:478:1: ( 'Group' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:478:1: ( 'Group' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:479:1: 'Group'
            {
             before(grammarAccess.getGroupAccess().getGroupKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Group__Group__1__Impl995); 
             after(grammarAccess.getGroupAccess().getGroupKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__1__Impl"


    // $ANTLR start "rule__Group__Group__2"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:492:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:496:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:497:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__21026);
            rule__Group__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__3_in_rule__Group__Group__21029);
            rule__Group__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__2"


    // $ANTLR start "rule__Group__Group__2__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:504:1: rule__Group__Group__2__Impl : ( ( rule__Group__NameAssignment_2 ) ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:508:1: ( ( ( rule__Group__NameAssignment_2 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:509:1: ( ( rule__Group__NameAssignment_2 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:509:1: ( ( rule__Group__NameAssignment_2 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:510:1: ( rule__Group__NameAssignment_2 )
            {
             before(grammarAccess.getGroupAccess().getNameAssignment_2()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:511:1: ( rule__Group__NameAssignment_2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:511:2: rule__Group__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__NameAssignment_2_in_rule__Group__Group__2__Impl1056);
            rule__Group__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__2__Impl"


    // $ANTLR start "rule__Group__Group__3"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:521:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:525:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:526:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__31086);
            rule__Group__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__4_in_rule__Group__Group__31089);
            rule__Group__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__3"


    // $ANTLR start "rule__Group__Group__3__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:533:1: rule__Group__Group__3__Impl : ( '{' ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:537:1: ( ( '{' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:538:1: ( '{' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:538:1: ( '{' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:539:1: '{'
            {
             before(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Group__Group__3__Impl1117); 
             after(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__3__Impl"


    // $ANTLR start "rule__Group__Group__4"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:552:1: rule__Group__Group__4 : rule__Group__Group__4__Impl rule__Group__Group__5 ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:556:1: ( rule__Group__Group__4__Impl rule__Group__Group__5 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:557:2: rule__Group__Group__4__Impl rule__Group__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__41148);
            rule__Group__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__5_in_rule__Group__Group__41151);
            rule__Group__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__4"


    // $ANTLR start "rule__Group__Group__4__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:564:1: rule__Group__Group__4__Impl : ( ( rule__Group__Group_4__0 )? ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:568:1: ( ( ( rule__Group__Group_4__0 )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:569:1: ( ( rule__Group__Group_4__0 )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:569:1: ( ( rule__Group__Group_4__0 )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:570:1: ( rule__Group__Group_4__0 )?
            {
             before(grammarAccess.getGroupAccess().getGroup_4()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:571:1: ( rule__Group__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:571:2: rule__Group__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4__0_in_rule__Group__Group__4__Impl1178);
                    rule__Group__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__4__Impl"


    // $ANTLR start "rule__Group__Group__5"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:581:1: rule__Group__Group__5 : rule__Group__Group__5__Impl rule__Group__Group__6 ;
    public final void rule__Group__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:585:1: ( rule__Group__Group__5__Impl rule__Group__Group__6 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:586:2: rule__Group__Group__5__Impl rule__Group__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__5__Impl_in_rule__Group__Group__51209);
            rule__Group__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__6_in_rule__Group__Group__51212);
            rule__Group__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__5"


    // $ANTLR start "rule__Group__Group__5__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:593:1: rule__Group__Group__5__Impl : ( ( rule__Group__Group_5__0 )? ) ;
    public final void rule__Group__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:597:1: ( ( ( rule__Group__Group_5__0 )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:598:1: ( ( rule__Group__Group_5__0 )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:598:1: ( ( rule__Group__Group_5__0 )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:599:1: ( rule__Group__Group_5__0 )?
            {
             before(grammarAccess.getGroupAccess().getGroup_5()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:600:1: ( rule__Group__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==28) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:600:2: rule__Group__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Group__Group_5__0_in_rule__Group__Group__5__Impl1239);
                    rule__Group__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__5__Impl"


    // $ANTLR start "rule__Group__Group__6"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:610:1: rule__Group__Group__6 : rule__Group__Group__6__Impl ;
    public final void rule__Group__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:614:1: ( rule__Group__Group__6__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:615:2: rule__Group__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__6__Impl_in_rule__Group__Group__61270);
            rule__Group__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__6"


    // $ANTLR start "rule__Group__Group__6__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:621:1: rule__Group__Group__6__Impl : ( '}' ) ;
    public final void rule__Group__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:625:1: ( ( '}' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:626:1: ( '}' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:626:1: ( '}' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:627:1: '}'
            {
             before(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_6()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Group__Group__6__Impl1298); 
             after(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group__6__Impl"


    // $ANTLR start "rule__Group__Group_4__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:654:1: rule__Group__Group_4__0 : rule__Group__Group_4__0__Impl rule__Group__Group_4__1 ;
    public final void rule__Group__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:658:1: ( rule__Group__Group_4__0__Impl rule__Group__Group_4__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:659:2: rule__Group__Group_4__0__Impl rule__Group__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4__0__Impl_in_rule__Group__Group_4__01343);
            rule__Group__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4__1_in_rule__Group__Group_4__01346);
            rule__Group__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_4__0"


    // $ANTLR start "rule__Group__Group_4__0__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:666:1: rule__Group__Group_4__0__Impl : ( 'category' ) ;
    public final void rule__Group__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:670:1: ( ( 'category' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:671:1: ( 'category' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:671:1: ( 'category' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:672:1: 'category'
            {
             before(grammarAccess.getGroupAccess().getCategoryKeyword_4_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Group__Group_4__0__Impl1374); 
             after(grammarAccess.getGroupAccess().getCategoryKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_4__0__Impl"


    // $ANTLR start "rule__Group__Group_4__1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:685:1: rule__Group__Group_4__1 : rule__Group__Group_4__1__Impl ;
    public final void rule__Group__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:689:1: ( rule__Group__Group_4__1__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:690:2: rule__Group__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4__1__Impl_in_rule__Group__Group_4__11405);
            rule__Group__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_4__1"


    // $ANTLR start "rule__Group__Group_4__1__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:696:1: rule__Group__Group_4__1__Impl : ( ( rule__Group__CategoryAssignment_4_1 ) ) ;
    public final void rule__Group__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:700:1: ( ( ( rule__Group__CategoryAssignment_4_1 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:701:1: ( ( rule__Group__CategoryAssignment_4_1 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:701:1: ( ( rule__Group__CategoryAssignment_4_1 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:702:1: ( rule__Group__CategoryAssignment_4_1 )
            {
             before(grammarAccess.getGroupAccess().getCategoryAssignment_4_1()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:703:1: ( rule__Group__CategoryAssignment_4_1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:703:2: rule__Group__CategoryAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__CategoryAssignment_4_1_in_rule__Group__Group_4__1__Impl1432);
            rule__Group__CategoryAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getCategoryAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_4__1__Impl"


    // $ANTLR start "rule__Group__Group_5__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:717:1: rule__Group__Group_5__0 : rule__Group__Group_5__0__Impl rule__Group__Group_5__1 ;
    public final void rule__Group__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:721:1: ( rule__Group__Group_5__0__Impl rule__Group__Group_5__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:722:2: rule__Group__Group_5__0__Impl rule__Group__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_5__0__Impl_in_rule__Group__Group_5__01466);
            rule__Group__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_5__1_in_rule__Group__Group_5__01469);
            rule__Group__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_5__0"


    // $ANTLR start "rule__Group__Group_5__0__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:729:1: rule__Group__Group_5__0__Impl : ( 'recipes' ) ;
    public final void rule__Group__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:733:1: ( ( 'recipes' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:734:1: ( 'recipes' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:734:1: ( 'recipes' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:735:1: 'recipes'
            {
             before(grammarAccess.getGroupAccess().getRecipesKeyword_5_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Group__Group_5__0__Impl1497); 
             after(grammarAccess.getGroupAccess().getRecipesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_5__0__Impl"


    // $ANTLR start "rule__Group__Group_5__1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:748:1: rule__Group__Group_5__1 : rule__Group__Group_5__1__Impl rule__Group__Group_5__2 ;
    public final void rule__Group__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:752:1: ( rule__Group__Group_5__1__Impl rule__Group__Group_5__2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:753:2: rule__Group__Group_5__1__Impl rule__Group__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_5__1__Impl_in_rule__Group__Group_5__11528);
            rule__Group__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_5__2_in_rule__Group__Group_5__11531);
            rule__Group__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_5__1"


    // $ANTLR start "rule__Group__Group_5__1__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:760:1: rule__Group__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Group__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:764:1: ( ( '{' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:765:1: ( '{' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:765:1: ( '{' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:766:1: '{'
            {
             before(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Group__Group_5__1__Impl1559); 
             after(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_5__1__Impl"


    // $ANTLR start "rule__Group__Group_5__2"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:779:1: rule__Group__Group_5__2 : rule__Group__Group_5__2__Impl rule__Group__Group_5__3 ;
    public final void rule__Group__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:783:1: ( rule__Group__Group_5__2__Impl rule__Group__Group_5__3 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:784:2: rule__Group__Group_5__2__Impl rule__Group__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_5__2__Impl_in_rule__Group__Group_5__21590);
            rule__Group__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_5__3_in_rule__Group__Group_5__21593);
            rule__Group__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_5__2"


    // $ANTLR start "rule__Group__Group_5__2__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:791:1: rule__Group__Group_5__2__Impl : ( ( rule__Group__RecipesAssignment_5_2 ) ) ;
    public final void rule__Group__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:795:1: ( ( ( rule__Group__RecipesAssignment_5_2 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:796:1: ( ( rule__Group__RecipesAssignment_5_2 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:796:1: ( ( rule__Group__RecipesAssignment_5_2 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:797:1: ( rule__Group__RecipesAssignment_5_2 )
            {
             before(grammarAccess.getGroupAccess().getRecipesAssignment_5_2()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:798:1: ( rule__Group__RecipesAssignment_5_2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:798:2: rule__Group__RecipesAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__RecipesAssignment_5_2_in_rule__Group__Group_5__2__Impl1620);
            rule__Group__RecipesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getRecipesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_5__2__Impl"


    // $ANTLR start "rule__Group__Group_5__3"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:808:1: rule__Group__Group_5__3 : rule__Group__Group_5__3__Impl rule__Group__Group_5__4 ;
    public final void rule__Group__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:812:1: ( rule__Group__Group_5__3__Impl rule__Group__Group_5__4 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:813:2: rule__Group__Group_5__3__Impl rule__Group__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_5__3__Impl_in_rule__Group__Group_5__31650);
            rule__Group__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_5__4_in_rule__Group__Group_5__31653);
            rule__Group__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_5__3"


    // $ANTLR start "rule__Group__Group_5__3__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:820:1: rule__Group__Group_5__3__Impl : ( ( rule__Group__Group_5_3__0 )* ) ;
    public final void rule__Group__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:824:1: ( ( ( rule__Group__Group_5_3__0 )* ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:825:1: ( ( rule__Group__Group_5_3__0 )* )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:825:1: ( ( rule__Group__Group_5_3__0 )* )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:826:1: ( rule__Group__Group_5_3__0 )*
            {
             before(grammarAccess.getGroupAccess().getGroup_5_3()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:827:1: ( rule__Group__Group_5_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==29) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:827:2: rule__Group__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Group__Group_5_3__0_in_rule__Group__Group_5__3__Impl1680);
            	    rule__Group__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getGroupAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_5__3__Impl"


    // $ANTLR start "rule__Group__Group_5__4"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:837:1: rule__Group__Group_5__4 : rule__Group__Group_5__4__Impl ;
    public final void rule__Group__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:841:1: ( rule__Group__Group_5__4__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:842:2: rule__Group__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_5__4__Impl_in_rule__Group__Group_5__41711);
            rule__Group__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_5__4"


    // $ANTLR start "rule__Group__Group_5__4__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:848:1: rule__Group__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Group__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:852:1: ( ( '}' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:853:1: ( '}' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:853:1: ( '}' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:854:1: '}'
            {
             before(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Group__Group_5__4__Impl1739); 
             after(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_5__4__Impl"


    // $ANTLR start "rule__Group__Group_5_3__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:877:1: rule__Group__Group_5_3__0 : rule__Group__Group_5_3__0__Impl rule__Group__Group_5_3__1 ;
    public final void rule__Group__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:881:1: ( rule__Group__Group_5_3__0__Impl rule__Group__Group_5_3__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:882:2: rule__Group__Group_5_3__0__Impl rule__Group__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_5_3__0__Impl_in_rule__Group__Group_5_3__01780);
            rule__Group__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_5_3__1_in_rule__Group__Group_5_3__01783);
            rule__Group__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_5_3__0"


    // $ANTLR start "rule__Group__Group_5_3__0__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:889:1: rule__Group__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Group__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:893:1: ( ( ',' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:894:1: ( ',' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:894:1: ( ',' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:895:1: ','
            {
             before(grammarAccess.getGroupAccess().getCommaKeyword_5_3_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Group__Group_5_3__0__Impl1811); 
             after(grammarAccess.getGroupAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_5_3__0__Impl"


    // $ANTLR start "rule__Group__Group_5_3__1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:908:1: rule__Group__Group_5_3__1 : rule__Group__Group_5_3__1__Impl ;
    public final void rule__Group__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:912:1: ( rule__Group__Group_5_3__1__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:913:2: rule__Group__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_5_3__1__Impl_in_rule__Group__Group_5_3__11842);
            rule__Group__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_5_3__1"


    // $ANTLR start "rule__Group__Group_5_3__1__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:919:1: rule__Group__Group_5_3__1__Impl : ( ( rule__Group__RecipesAssignment_5_3_1 ) ) ;
    public final void rule__Group__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:923:1: ( ( ( rule__Group__RecipesAssignment_5_3_1 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:924:1: ( ( rule__Group__RecipesAssignment_5_3_1 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:924:1: ( ( rule__Group__RecipesAssignment_5_3_1 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:925:1: ( rule__Group__RecipesAssignment_5_3_1 )
            {
             before(grammarAccess.getGroupAccess().getRecipesAssignment_5_3_1()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:926:1: ( rule__Group__RecipesAssignment_5_3_1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:926:2: rule__Group__RecipesAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__RecipesAssignment_5_3_1_in_rule__Group__Group_5_3__1__Impl1869);
            rule__Group__RecipesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getRecipesAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__Group_5_3__1__Impl"


    // $ANTLR start "rule__Recipe__Group__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:940:1: rule__Recipe__Group__0 : rule__Recipe__Group__0__Impl rule__Recipe__Group__1 ;
    public final void rule__Recipe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:944:1: ( rule__Recipe__Group__0__Impl rule__Recipe__Group__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:945:2: rule__Recipe__Group__0__Impl rule__Recipe__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__0__Impl_in_rule__Recipe__Group__01903);
            rule__Recipe__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__1_in_rule__Recipe__Group__01906);
            rule__Recipe__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__0"


    // $ANTLR start "rule__Recipe__Group__0__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:952:1: rule__Recipe__Group__0__Impl : ( () ) ;
    public final void rule__Recipe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:956:1: ( ( () ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:957:1: ( () )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:957:1: ( () )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:958:1: ()
            {
             before(grammarAccess.getRecipeAccess().getRecipeAction_0()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:959:1: ()
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:961:1: 
            {
            }

             after(grammarAccess.getRecipeAccess().getRecipeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__0__Impl"


    // $ANTLR start "rule__Recipe__Group__1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:971:1: rule__Recipe__Group__1 : rule__Recipe__Group__1__Impl rule__Recipe__Group__2 ;
    public final void rule__Recipe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:975:1: ( rule__Recipe__Group__1__Impl rule__Recipe__Group__2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:976:2: rule__Recipe__Group__1__Impl rule__Recipe__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__1__Impl_in_rule__Recipe__Group__11964);
            rule__Recipe__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__2_in_rule__Recipe__Group__11967);
            rule__Recipe__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__1"


    // $ANTLR start "rule__Recipe__Group__1__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:983:1: rule__Recipe__Group__1__Impl : ( 'Recipe' ) ;
    public final void rule__Recipe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:987:1: ( ( 'Recipe' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:988:1: ( 'Recipe' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:988:1: ( 'Recipe' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:989:1: 'Recipe'
            {
             before(grammarAccess.getRecipeAccess().getRecipeKeyword_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Recipe__Group__1__Impl1995); 
             after(grammarAccess.getRecipeAccess().getRecipeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__1__Impl"


    // $ANTLR start "rule__Recipe__Group__2"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1002:1: rule__Recipe__Group__2 : rule__Recipe__Group__2__Impl rule__Recipe__Group__3 ;
    public final void rule__Recipe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1006:1: ( rule__Recipe__Group__2__Impl rule__Recipe__Group__3 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1007:2: rule__Recipe__Group__2__Impl rule__Recipe__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__2__Impl_in_rule__Recipe__Group__22026);
            rule__Recipe__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__3_in_rule__Recipe__Group__22029);
            rule__Recipe__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__2"


    // $ANTLR start "rule__Recipe__Group__2__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1014:1: rule__Recipe__Group__2__Impl : ( ( rule__Recipe__NameAssignment_2 ) ) ;
    public final void rule__Recipe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1018:1: ( ( ( rule__Recipe__NameAssignment_2 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1019:1: ( ( rule__Recipe__NameAssignment_2 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1019:1: ( ( rule__Recipe__NameAssignment_2 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1020:1: ( rule__Recipe__NameAssignment_2 )
            {
             before(grammarAccess.getRecipeAccess().getNameAssignment_2()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1021:1: ( rule__Recipe__NameAssignment_2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1021:2: rule__Recipe__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__NameAssignment_2_in_rule__Recipe__Group__2__Impl2056);
            rule__Recipe__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__2__Impl"


    // $ANTLR start "rule__Recipe__Group__3"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1031:1: rule__Recipe__Group__3 : rule__Recipe__Group__3__Impl rule__Recipe__Group__4 ;
    public final void rule__Recipe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1035:1: ( rule__Recipe__Group__3__Impl rule__Recipe__Group__4 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1036:2: rule__Recipe__Group__3__Impl rule__Recipe__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__3__Impl_in_rule__Recipe__Group__32086);
            rule__Recipe__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__4_in_rule__Recipe__Group__32089);
            rule__Recipe__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__3"


    // $ANTLR start "rule__Recipe__Group__3__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1043:1: rule__Recipe__Group__3__Impl : ( '{' ) ;
    public final void rule__Recipe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1047:1: ( ( '{' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1048:1: ( '{' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1048:1: ( '{' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1049:1: '{'
            {
             before(grammarAccess.getRecipeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Recipe__Group__3__Impl2117); 
             after(grammarAccess.getRecipeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__3__Impl"


    // $ANTLR start "rule__Recipe__Group__4"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1062:1: rule__Recipe__Group__4 : rule__Recipe__Group__4__Impl rule__Recipe__Group__5 ;
    public final void rule__Recipe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1066:1: ( rule__Recipe__Group__4__Impl rule__Recipe__Group__5 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1067:2: rule__Recipe__Group__4__Impl rule__Recipe__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__4__Impl_in_rule__Recipe__Group__42148);
            rule__Recipe__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__5_in_rule__Recipe__Group__42151);
            rule__Recipe__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__4"


    // $ANTLR start "rule__Recipe__Group__4__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1074:1: rule__Recipe__Group__4__Impl : ( ( rule__Recipe__Group_4__0 )? ) ;
    public final void rule__Recipe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1078:1: ( ( ( rule__Recipe__Group_4__0 )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1079:1: ( ( rule__Recipe__Group_4__0 )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1079:1: ( ( rule__Recipe__Group_4__0 )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1080:1: ( rule__Recipe__Group_4__0 )?
            {
             before(grammarAccess.getRecipeAccess().getGroup_4()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1081:1: ( rule__Recipe__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1081:2: rule__Recipe__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_4__0_in_rule__Recipe__Group__4__Impl2178);
                    rule__Recipe__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecipeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__4__Impl"


    // $ANTLR start "rule__Recipe__Group__5"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1091:1: rule__Recipe__Group__5 : rule__Recipe__Group__5__Impl rule__Recipe__Group__6 ;
    public final void rule__Recipe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1095:1: ( rule__Recipe__Group__5__Impl rule__Recipe__Group__6 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1096:2: rule__Recipe__Group__5__Impl rule__Recipe__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__5__Impl_in_rule__Recipe__Group__52209);
            rule__Recipe__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__6_in_rule__Recipe__Group__52212);
            rule__Recipe__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__5"


    // $ANTLR start "rule__Recipe__Group__5__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1103:1: rule__Recipe__Group__5__Impl : ( ( rule__Recipe__Group_5__0 )? ) ;
    public final void rule__Recipe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1107:1: ( ( ( rule__Recipe__Group_5__0 )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1108:1: ( ( rule__Recipe__Group_5__0 )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1108:1: ( ( rule__Recipe__Group_5__0 )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1109:1: ( rule__Recipe__Group_5__0 )?
            {
             before(grammarAccess.getRecipeAccess().getGroup_5()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1110:1: ( rule__Recipe__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==32) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1110:2: rule__Recipe__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_5__0_in_rule__Recipe__Group__5__Impl2239);
                    rule__Recipe__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecipeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__5__Impl"


    // $ANTLR start "rule__Recipe__Group__6"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1120:1: rule__Recipe__Group__6 : rule__Recipe__Group__6__Impl rule__Recipe__Group__7 ;
    public final void rule__Recipe__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1124:1: ( rule__Recipe__Group__6__Impl rule__Recipe__Group__7 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1125:2: rule__Recipe__Group__6__Impl rule__Recipe__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__6__Impl_in_rule__Recipe__Group__62270);
            rule__Recipe__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__7_in_rule__Recipe__Group__62273);
            rule__Recipe__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__6"


    // $ANTLR start "rule__Recipe__Group__6__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1132:1: rule__Recipe__Group__6__Impl : ( ( rule__Recipe__Group_6__0 )? ) ;
    public final void rule__Recipe__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1136:1: ( ( ( rule__Recipe__Group_6__0 )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1137:1: ( ( rule__Recipe__Group_6__0 )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1137:1: ( ( rule__Recipe__Group_6__0 )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1138:1: ( rule__Recipe__Group_6__0 )?
            {
             before(grammarAccess.getRecipeAccess().getGroup_6()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1139:1: ( rule__Recipe__Group_6__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==33) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1139:2: rule__Recipe__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_6__0_in_rule__Recipe__Group__6__Impl2300);
                    rule__Recipe__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecipeAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__6__Impl"


    // $ANTLR start "rule__Recipe__Group__7"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1149:1: rule__Recipe__Group__7 : rule__Recipe__Group__7__Impl rule__Recipe__Group__8 ;
    public final void rule__Recipe__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1153:1: ( rule__Recipe__Group__7__Impl rule__Recipe__Group__8 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1154:2: rule__Recipe__Group__7__Impl rule__Recipe__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__7__Impl_in_rule__Recipe__Group__72331);
            rule__Recipe__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__8_in_rule__Recipe__Group__72334);
            rule__Recipe__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__7"


    // $ANTLR start "rule__Recipe__Group__7__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1161:1: rule__Recipe__Group__7__Impl : ( ( rule__Recipe__Group_7__0 )? ) ;
    public final void rule__Recipe__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1165:1: ( ( ( rule__Recipe__Group_7__0 )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1166:1: ( ( rule__Recipe__Group_7__0 )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1166:1: ( ( rule__Recipe__Group_7__0 )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1167:1: ( rule__Recipe__Group_7__0 )?
            {
             before(grammarAccess.getRecipeAccess().getGroup_7()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1168:1: ( rule__Recipe__Group_7__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1168:2: rule__Recipe__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_7__0_in_rule__Recipe__Group__7__Impl2361);
                    rule__Recipe__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecipeAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__7__Impl"


    // $ANTLR start "rule__Recipe__Group__8"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1178:1: rule__Recipe__Group__8 : rule__Recipe__Group__8__Impl ;
    public final void rule__Recipe__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1182:1: ( rule__Recipe__Group__8__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1183:2: rule__Recipe__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__8__Impl_in_rule__Recipe__Group__82392);
            rule__Recipe__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__8"


    // $ANTLR start "rule__Recipe__Group__8__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1189:1: rule__Recipe__Group__8__Impl : ( '}' ) ;
    public final void rule__Recipe__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1193:1: ( ( '}' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1194:1: ( '}' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1194:1: ( '}' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1195:1: '}'
            {
             before(grammarAccess.getRecipeAccess().getRightCurlyBracketKeyword_8()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Recipe__Group__8__Impl2420); 
             after(grammarAccess.getRecipeAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group__8__Impl"


    // $ANTLR start "rule__Recipe__Group_4__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1226:1: rule__Recipe__Group_4__0 : rule__Recipe__Group_4__0__Impl rule__Recipe__Group_4__1 ;
    public final void rule__Recipe__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1230:1: ( rule__Recipe__Group_4__0__Impl rule__Recipe__Group_4__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1231:2: rule__Recipe__Group_4__0__Impl rule__Recipe__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_4__0__Impl_in_rule__Recipe__Group_4__02469);
            rule__Recipe__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_4__1_in_rule__Recipe__Group_4__02472);
            rule__Recipe__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_4__0"


    // $ANTLR start "rule__Recipe__Group_4__0__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1238:1: rule__Recipe__Group_4__0__Impl : ( 'price' ) ;
    public final void rule__Recipe__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1242:1: ( ( 'price' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1243:1: ( 'price' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1243:1: ( 'price' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1244:1: 'price'
            {
             before(grammarAccess.getRecipeAccess().getPriceKeyword_4_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Recipe__Group_4__0__Impl2500); 
             after(grammarAccess.getRecipeAccess().getPriceKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_4__0__Impl"


    // $ANTLR start "rule__Recipe__Group_4__1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1257:1: rule__Recipe__Group_4__1 : rule__Recipe__Group_4__1__Impl ;
    public final void rule__Recipe__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1261:1: ( rule__Recipe__Group_4__1__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1262:2: rule__Recipe__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_4__1__Impl_in_rule__Recipe__Group_4__12531);
            rule__Recipe__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_4__1"


    // $ANTLR start "rule__Recipe__Group_4__1__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1268:1: rule__Recipe__Group_4__1__Impl : ( ( rule__Recipe__PriceAssignment_4_1 ) ) ;
    public final void rule__Recipe__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1272:1: ( ( ( rule__Recipe__PriceAssignment_4_1 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1273:1: ( ( rule__Recipe__PriceAssignment_4_1 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1273:1: ( ( rule__Recipe__PriceAssignment_4_1 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1274:1: ( rule__Recipe__PriceAssignment_4_1 )
            {
             before(grammarAccess.getRecipeAccess().getPriceAssignment_4_1()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1275:1: ( rule__Recipe__PriceAssignment_4_1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1275:2: rule__Recipe__PriceAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__PriceAssignment_4_1_in_rule__Recipe__Group_4__1__Impl2558);
            rule__Recipe__PriceAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getPriceAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_4__1__Impl"


    // $ANTLR start "rule__Recipe__Group_5__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1289:1: rule__Recipe__Group_5__0 : rule__Recipe__Group_5__0__Impl rule__Recipe__Group_5__1 ;
    public final void rule__Recipe__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1293:1: ( rule__Recipe__Group_5__0__Impl rule__Recipe__Group_5__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1294:2: rule__Recipe__Group_5__0__Impl rule__Recipe__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_5__0__Impl_in_rule__Recipe__Group_5__02592);
            rule__Recipe__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_5__1_in_rule__Recipe__Group_5__02595);
            rule__Recipe__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_5__0"


    // $ANTLR start "rule__Recipe__Group_5__0__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1301:1: rule__Recipe__Group_5__0__Impl : ( 'amount' ) ;
    public final void rule__Recipe__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1305:1: ( ( 'amount' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1306:1: ( 'amount' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1306:1: ( 'amount' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1307:1: 'amount'
            {
             before(grammarAccess.getRecipeAccess().getAmountKeyword_5_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Recipe__Group_5__0__Impl2623); 
             after(grammarAccess.getRecipeAccess().getAmountKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_5__0__Impl"


    // $ANTLR start "rule__Recipe__Group_5__1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1320:1: rule__Recipe__Group_5__1 : rule__Recipe__Group_5__1__Impl ;
    public final void rule__Recipe__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1324:1: ( rule__Recipe__Group_5__1__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1325:2: rule__Recipe__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_5__1__Impl_in_rule__Recipe__Group_5__12654);
            rule__Recipe__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_5__1"


    // $ANTLR start "rule__Recipe__Group_5__1__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1331:1: rule__Recipe__Group_5__1__Impl : ( ( rule__Recipe__AmountAssignment_5_1 ) ) ;
    public final void rule__Recipe__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1335:1: ( ( ( rule__Recipe__AmountAssignment_5_1 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1336:1: ( ( rule__Recipe__AmountAssignment_5_1 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1336:1: ( ( rule__Recipe__AmountAssignment_5_1 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1337:1: ( rule__Recipe__AmountAssignment_5_1 )
            {
             before(grammarAccess.getRecipeAccess().getAmountAssignment_5_1()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1338:1: ( rule__Recipe__AmountAssignment_5_1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1338:2: rule__Recipe__AmountAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__AmountAssignment_5_1_in_rule__Recipe__Group_5__1__Impl2681);
            rule__Recipe__AmountAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getAmountAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_5__1__Impl"


    // $ANTLR start "rule__Recipe__Group_6__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1352:1: rule__Recipe__Group_6__0 : rule__Recipe__Group_6__0__Impl rule__Recipe__Group_6__1 ;
    public final void rule__Recipe__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1356:1: ( rule__Recipe__Group_6__0__Impl rule__Recipe__Group_6__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1357:2: rule__Recipe__Group_6__0__Impl rule__Recipe__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_6__0__Impl_in_rule__Recipe__Group_6__02715);
            rule__Recipe__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_6__1_in_rule__Recipe__Group_6__02718);
            rule__Recipe__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_6__0"


    // $ANTLR start "rule__Recipe__Group_6__0__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1364:1: rule__Recipe__Group_6__0__Impl : ( 'amountType' ) ;
    public final void rule__Recipe__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1368:1: ( ( 'amountType' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1369:1: ( 'amountType' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1369:1: ( 'amountType' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1370:1: 'amountType'
            {
             before(grammarAccess.getRecipeAccess().getAmountTypeKeyword_6_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Recipe__Group_6__0__Impl2746); 
             after(grammarAccess.getRecipeAccess().getAmountTypeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_6__0__Impl"


    // $ANTLR start "rule__Recipe__Group_6__1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1383:1: rule__Recipe__Group_6__1 : rule__Recipe__Group_6__1__Impl ;
    public final void rule__Recipe__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1387:1: ( rule__Recipe__Group_6__1__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1388:2: rule__Recipe__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_6__1__Impl_in_rule__Recipe__Group_6__12777);
            rule__Recipe__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_6__1"


    // $ANTLR start "rule__Recipe__Group_6__1__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1394:1: rule__Recipe__Group_6__1__Impl : ( ( rule__Recipe__AmountTypeAssignment_6_1 ) ) ;
    public final void rule__Recipe__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1398:1: ( ( ( rule__Recipe__AmountTypeAssignment_6_1 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1399:1: ( ( rule__Recipe__AmountTypeAssignment_6_1 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1399:1: ( ( rule__Recipe__AmountTypeAssignment_6_1 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1400:1: ( rule__Recipe__AmountTypeAssignment_6_1 )
            {
             before(grammarAccess.getRecipeAccess().getAmountTypeAssignment_6_1()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1401:1: ( rule__Recipe__AmountTypeAssignment_6_1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1401:2: rule__Recipe__AmountTypeAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__AmountTypeAssignment_6_1_in_rule__Recipe__Group_6__1__Impl2804);
            rule__Recipe__AmountTypeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getAmountTypeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_6__1__Impl"


    // $ANTLR start "rule__Recipe__Group_7__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1415:1: rule__Recipe__Group_7__0 : rule__Recipe__Group_7__0__Impl rule__Recipe__Group_7__1 ;
    public final void rule__Recipe__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1419:1: ( rule__Recipe__Group_7__0__Impl rule__Recipe__Group_7__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1420:2: rule__Recipe__Group_7__0__Impl rule__Recipe__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_7__0__Impl_in_rule__Recipe__Group_7__02838);
            rule__Recipe__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_7__1_in_rule__Recipe__Group_7__02841);
            rule__Recipe__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_7__0"


    // $ANTLR start "rule__Recipe__Group_7__0__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1427:1: rule__Recipe__Group_7__0__Impl : ( 'ingredients' ) ;
    public final void rule__Recipe__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1431:1: ( ( 'ingredients' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1432:1: ( 'ingredients' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1432:1: ( 'ingredients' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1433:1: 'ingredients'
            {
             before(grammarAccess.getRecipeAccess().getIngredientsKeyword_7_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Recipe__Group_7__0__Impl2869); 
             after(grammarAccess.getRecipeAccess().getIngredientsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_7__0__Impl"


    // $ANTLR start "rule__Recipe__Group_7__1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1446:1: rule__Recipe__Group_7__1 : rule__Recipe__Group_7__1__Impl rule__Recipe__Group_7__2 ;
    public final void rule__Recipe__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1450:1: ( rule__Recipe__Group_7__1__Impl rule__Recipe__Group_7__2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1451:2: rule__Recipe__Group_7__1__Impl rule__Recipe__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_7__1__Impl_in_rule__Recipe__Group_7__12900);
            rule__Recipe__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_7__2_in_rule__Recipe__Group_7__12903);
            rule__Recipe__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_7__1"


    // $ANTLR start "rule__Recipe__Group_7__1__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1458:1: rule__Recipe__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Recipe__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1462:1: ( ( '{' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1463:1: ( '{' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1463:1: ( '{' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1464:1: '{'
            {
             before(grammarAccess.getRecipeAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Recipe__Group_7__1__Impl2931); 
             after(grammarAccess.getRecipeAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_7__1__Impl"


    // $ANTLR start "rule__Recipe__Group_7__2"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1477:1: rule__Recipe__Group_7__2 : rule__Recipe__Group_7__2__Impl rule__Recipe__Group_7__3 ;
    public final void rule__Recipe__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1481:1: ( rule__Recipe__Group_7__2__Impl rule__Recipe__Group_7__3 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1482:2: rule__Recipe__Group_7__2__Impl rule__Recipe__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_7__2__Impl_in_rule__Recipe__Group_7__22962);
            rule__Recipe__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_7__3_in_rule__Recipe__Group_7__22965);
            rule__Recipe__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_7__2"


    // $ANTLR start "rule__Recipe__Group_7__2__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1489:1: rule__Recipe__Group_7__2__Impl : ( ( rule__Recipe__IngredientsAssignment_7_2 ) ) ;
    public final void rule__Recipe__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1493:1: ( ( ( rule__Recipe__IngredientsAssignment_7_2 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1494:1: ( ( rule__Recipe__IngredientsAssignment_7_2 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1494:1: ( ( rule__Recipe__IngredientsAssignment_7_2 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1495:1: ( rule__Recipe__IngredientsAssignment_7_2 )
            {
             before(grammarAccess.getRecipeAccess().getIngredientsAssignment_7_2()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1496:1: ( rule__Recipe__IngredientsAssignment_7_2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1496:2: rule__Recipe__IngredientsAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__IngredientsAssignment_7_2_in_rule__Recipe__Group_7__2__Impl2992);
            rule__Recipe__IngredientsAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getIngredientsAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_7__2__Impl"


    // $ANTLR start "rule__Recipe__Group_7__3"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1506:1: rule__Recipe__Group_7__3 : rule__Recipe__Group_7__3__Impl rule__Recipe__Group_7__4 ;
    public final void rule__Recipe__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1510:1: ( rule__Recipe__Group_7__3__Impl rule__Recipe__Group_7__4 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1511:2: rule__Recipe__Group_7__3__Impl rule__Recipe__Group_7__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_7__3__Impl_in_rule__Recipe__Group_7__33022);
            rule__Recipe__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_7__4_in_rule__Recipe__Group_7__33025);
            rule__Recipe__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_7__3"


    // $ANTLR start "rule__Recipe__Group_7__3__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1518:1: rule__Recipe__Group_7__3__Impl : ( ( rule__Recipe__Group_7_3__0 )* ) ;
    public final void rule__Recipe__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1522:1: ( ( ( rule__Recipe__Group_7_3__0 )* ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1523:1: ( ( rule__Recipe__Group_7_3__0 )* )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1523:1: ( ( rule__Recipe__Group_7_3__0 )* )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1524:1: ( rule__Recipe__Group_7_3__0 )*
            {
             before(grammarAccess.getRecipeAccess().getGroup_7_3()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1525:1: ( rule__Recipe__Group_7_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1525:2: rule__Recipe__Group_7_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_7_3__0_in_rule__Recipe__Group_7__3__Impl3052);
            	    rule__Recipe__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getRecipeAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_7__3__Impl"


    // $ANTLR start "rule__Recipe__Group_7__4"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1535:1: rule__Recipe__Group_7__4 : rule__Recipe__Group_7__4__Impl ;
    public final void rule__Recipe__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1539:1: ( rule__Recipe__Group_7__4__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1540:2: rule__Recipe__Group_7__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_7__4__Impl_in_rule__Recipe__Group_7__43083);
            rule__Recipe__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_7__4"


    // $ANTLR start "rule__Recipe__Group_7__4__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1546:1: rule__Recipe__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Recipe__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1550:1: ( ( '}' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1551:1: ( '}' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1551:1: ( '}' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1552:1: '}'
            {
             before(grammarAccess.getRecipeAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Recipe__Group_7__4__Impl3111); 
             after(grammarAccess.getRecipeAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_7__4__Impl"


    // $ANTLR start "rule__Recipe__Group_7_3__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1575:1: rule__Recipe__Group_7_3__0 : rule__Recipe__Group_7_3__0__Impl rule__Recipe__Group_7_3__1 ;
    public final void rule__Recipe__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1579:1: ( rule__Recipe__Group_7_3__0__Impl rule__Recipe__Group_7_3__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1580:2: rule__Recipe__Group_7_3__0__Impl rule__Recipe__Group_7_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_7_3__0__Impl_in_rule__Recipe__Group_7_3__03152);
            rule__Recipe__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_7_3__1_in_rule__Recipe__Group_7_3__03155);
            rule__Recipe__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_7_3__0"


    // $ANTLR start "rule__Recipe__Group_7_3__0__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1587:1: rule__Recipe__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Recipe__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1591:1: ( ( ',' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1592:1: ( ',' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1592:1: ( ',' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1593:1: ','
            {
             before(grammarAccess.getRecipeAccess().getCommaKeyword_7_3_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Recipe__Group_7_3__0__Impl3183); 
             after(grammarAccess.getRecipeAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_7_3__0__Impl"


    // $ANTLR start "rule__Recipe__Group_7_3__1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1606:1: rule__Recipe__Group_7_3__1 : rule__Recipe__Group_7_3__1__Impl ;
    public final void rule__Recipe__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1610:1: ( rule__Recipe__Group_7_3__1__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1611:2: rule__Recipe__Group_7_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_7_3__1__Impl_in_rule__Recipe__Group_7_3__13214);
            rule__Recipe__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_7_3__1"


    // $ANTLR start "rule__Recipe__Group_7_3__1__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1617:1: rule__Recipe__Group_7_3__1__Impl : ( ( rule__Recipe__IngredientsAssignment_7_3_1 ) ) ;
    public final void rule__Recipe__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1621:1: ( ( ( rule__Recipe__IngredientsAssignment_7_3_1 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1622:1: ( ( rule__Recipe__IngredientsAssignment_7_3_1 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1622:1: ( ( rule__Recipe__IngredientsAssignment_7_3_1 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1623:1: ( rule__Recipe__IngredientsAssignment_7_3_1 )
            {
             before(grammarAccess.getRecipeAccess().getIngredientsAssignment_7_3_1()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1624:1: ( rule__Recipe__IngredientsAssignment_7_3_1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1624:2: rule__Recipe__IngredientsAssignment_7_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__IngredientsAssignment_7_3_1_in_rule__Recipe__Group_7_3__1__Impl3241);
            rule__Recipe__IngredientsAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getIngredientsAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__Group_7_3__1__Impl"


    // $ANTLR start "rule__EBigDecimal__Group__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1638:1: rule__EBigDecimal__Group__0 : rule__EBigDecimal__Group__0__Impl rule__EBigDecimal__Group__1 ;
    public final void rule__EBigDecimal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1642:1: ( rule__EBigDecimal__Group__0__Impl rule__EBigDecimal__Group__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1643:2: rule__EBigDecimal__Group__0__Impl rule__EBigDecimal__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBigDecimal__Group__0__Impl_in_rule__EBigDecimal__Group__03275);
            rule__EBigDecimal__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EBigDecimal__Group__1_in_rule__EBigDecimal__Group__03278);
            rule__EBigDecimal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBigDecimal__Group__0"


    // $ANTLR start "rule__EBigDecimal__Group__0__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1650:1: rule__EBigDecimal__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EBigDecimal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1654:1: ( ( ( RULE_INT )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1655:1: ( ( RULE_INT )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1655:1: ( ( RULE_INT )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1656:1: ( RULE_INT )?
            {
             before(grammarAccess.getEBigDecimalAccess().getINTTerminalRuleCall_0()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1657:1: ( RULE_INT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1657:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EBigDecimal__Group__0__Impl3306); 

                    }
                    break;

            }

             after(grammarAccess.getEBigDecimalAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBigDecimal__Group__0__Impl"


    // $ANTLR start "rule__EBigDecimal__Group__1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1667:1: rule__EBigDecimal__Group__1 : rule__EBigDecimal__Group__1__Impl rule__EBigDecimal__Group__2 ;
    public final void rule__EBigDecimal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1671:1: ( rule__EBigDecimal__Group__1__Impl rule__EBigDecimal__Group__2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1672:2: rule__EBigDecimal__Group__1__Impl rule__EBigDecimal__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBigDecimal__Group__1__Impl_in_rule__EBigDecimal__Group__13337);
            rule__EBigDecimal__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EBigDecimal__Group__2_in_rule__EBigDecimal__Group__13340);
            rule__EBigDecimal__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBigDecimal__Group__1"


    // $ANTLR start "rule__EBigDecimal__Group__1__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1679:1: rule__EBigDecimal__Group__1__Impl : ( '.' ) ;
    public final void rule__EBigDecimal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1683:1: ( ( '.' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1684:1: ( '.' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1684:1: ( '.' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1685:1: '.'
            {
             before(grammarAccess.getEBigDecimalAccess().getFullStopKeyword_1()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__EBigDecimal__Group__1__Impl3368); 
             after(grammarAccess.getEBigDecimalAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBigDecimal__Group__1__Impl"


    // $ANTLR start "rule__EBigDecimal__Group__2"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1698:1: rule__EBigDecimal__Group__2 : rule__EBigDecimal__Group__2__Impl ;
    public final void rule__EBigDecimal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1702:1: ( rule__EBigDecimal__Group__2__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1703:2: rule__EBigDecimal__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBigDecimal__Group__2__Impl_in_rule__EBigDecimal__Group__23399);
            rule__EBigDecimal__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBigDecimal__Group__2"


    // $ANTLR start "rule__EBigDecimal__Group__2__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1709:1: rule__EBigDecimal__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__EBigDecimal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1713:1: ( ( RULE_INT ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1714:1: ( RULE_INT )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1714:1: ( RULE_INT )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1715:1: RULE_INT
            {
             before(grammarAccess.getEBigDecimalAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EBigDecimal__Group__2__Impl3426); 
             after(grammarAccess.getEBigDecimalAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBigDecimal__Group__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1732:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1736:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1737:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__03461);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__03464);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1744:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1748:1: ( ( ( '-' )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1749:1: ( ( '-' )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1749:1: ( ( '-' )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1750:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1751:1: ( '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==36) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1752:2: '-'
                    {
                    match(input,36,FollowSets000.FOLLOW_36_in_rule__EInt__Group__0__Impl3493); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1763:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1767:1: ( rule__EInt__Group__1__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1768:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__13526);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1774:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1778:1: ( ( RULE_INT ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1779:1: ( RULE_INT )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1779:1: ( RULE_INT )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1780:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl3553); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Ingredient__Group__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1795:1: rule__Ingredient__Group__0 : rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1 ;
    public final void rule__Ingredient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1799:1: ( rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1800:2: rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__0__Impl_in_rule__Ingredient__Group__03586);
            rule__Ingredient__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__1_in_rule__Ingredient__Group__03589);
            rule__Ingredient__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__0"


    // $ANTLR start "rule__Ingredient__Group__0__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1807:1: rule__Ingredient__Group__0__Impl : ( () ) ;
    public final void rule__Ingredient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1811:1: ( ( () ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1812:1: ( () )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1812:1: ( () )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1813:1: ()
            {
             before(grammarAccess.getIngredientAccess().getIngredientAction_0()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1814:1: ()
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1816:1: 
            {
            }

             after(grammarAccess.getIngredientAccess().getIngredientAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__0__Impl"


    // $ANTLR start "rule__Ingredient__Group__1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1826:1: rule__Ingredient__Group__1 : rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2 ;
    public final void rule__Ingredient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1830:1: ( rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1831:2: rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__1__Impl_in_rule__Ingredient__Group__13647);
            rule__Ingredient__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__2_in_rule__Ingredient__Group__13650);
            rule__Ingredient__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__1"


    // $ANTLR start "rule__Ingredient__Group__1__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1838:1: rule__Ingredient__Group__1__Impl : ( 'Ingredient' ) ;
    public final void rule__Ingredient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1842:1: ( ( 'Ingredient' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1843:1: ( 'Ingredient' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1843:1: ( 'Ingredient' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1844:1: 'Ingredient'
            {
             before(grammarAccess.getIngredientAccess().getIngredientKeyword_1()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Ingredient__Group__1__Impl3678); 
             after(grammarAccess.getIngredientAccess().getIngredientKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__1__Impl"


    // $ANTLR start "rule__Ingredient__Group__2"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1857:1: rule__Ingredient__Group__2 : rule__Ingredient__Group__2__Impl rule__Ingredient__Group__3 ;
    public final void rule__Ingredient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1861:1: ( rule__Ingredient__Group__2__Impl rule__Ingredient__Group__3 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1862:2: rule__Ingredient__Group__2__Impl rule__Ingredient__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__2__Impl_in_rule__Ingredient__Group__23709);
            rule__Ingredient__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__3_in_rule__Ingredient__Group__23712);
            rule__Ingredient__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__2"


    // $ANTLR start "rule__Ingredient__Group__2__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1869:1: rule__Ingredient__Group__2__Impl : ( ( rule__Ingredient__NameAssignment_2 ) ) ;
    public final void rule__Ingredient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1873:1: ( ( ( rule__Ingredient__NameAssignment_2 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1874:1: ( ( rule__Ingredient__NameAssignment_2 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1874:1: ( ( rule__Ingredient__NameAssignment_2 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1875:1: ( rule__Ingredient__NameAssignment_2 )
            {
             before(grammarAccess.getIngredientAccess().getNameAssignment_2()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1876:1: ( rule__Ingredient__NameAssignment_2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1876:2: rule__Ingredient__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__NameAssignment_2_in_rule__Ingredient__Group__2__Impl3739);
            rule__Ingredient__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__2__Impl"


    // $ANTLR start "rule__Ingredient__Group__3"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1886:1: rule__Ingredient__Group__3 : rule__Ingredient__Group__3__Impl rule__Ingredient__Group__4 ;
    public final void rule__Ingredient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1890:1: ( rule__Ingredient__Group__3__Impl rule__Ingredient__Group__4 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1891:2: rule__Ingredient__Group__3__Impl rule__Ingredient__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__3__Impl_in_rule__Ingredient__Group__33769);
            rule__Ingredient__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__4_in_rule__Ingredient__Group__33772);
            rule__Ingredient__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__3"


    // $ANTLR start "rule__Ingredient__Group__3__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1898:1: rule__Ingredient__Group__3__Impl : ( '{' ) ;
    public final void rule__Ingredient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1902:1: ( ( '{' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1903:1: ( '{' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1903:1: ( '{' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1904:1: '{'
            {
             before(grammarAccess.getIngredientAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Ingredient__Group__3__Impl3800); 
             after(grammarAccess.getIngredientAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__3__Impl"


    // $ANTLR start "rule__Ingredient__Group__4"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1917:1: rule__Ingredient__Group__4 : rule__Ingredient__Group__4__Impl rule__Ingredient__Group__5 ;
    public final void rule__Ingredient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1921:1: ( rule__Ingredient__Group__4__Impl rule__Ingredient__Group__5 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1922:2: rule__Ingredient__Group__4__Impl rule__Ingredient__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__4__Impl_in_rule__Ingredient__Group__43831);
            rule__Ingredient__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__5_in_rule__Ingredient__Group__43834);
            rule__Ingredient__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__4"


    // $ANTLR start "rule__Ingredient__Group__4__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1929:1: rule__Ingredient__Group__4__Impl : ( ( rule__Ingredient__Group_4__0 )? ) ;
    public final void rule__Ingredient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1933:1: ( ( ( rule__Ingredient__Group_4__0 )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1934:1: ( ( rule__Ingredient__Group_4__0 )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1934:1: ( ( rule__Ingredient__Group_4__0 )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1935:1: ( rule__Ingredient__Group_4__0 )?
            {
             before(grammarAccess.getIngredientAccess().getGroup_4()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1936:1: ( rule__Ingredient__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==38) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1936:2: rule__Ingredient__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group_4__0_in_rule__Ingredient__Group__4__Impl3861);
                    rule__Ingredient__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIngredientAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__4__Impl"


    // $ANTLR start "rule__Ingredient__Group__5"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1946:1: rule__Ingredient__Group__5 : rule__Ingredient__Group__5__Impl ;
    public final void rule__Ingredient__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1950:1: ( rule__Ingredient__Group__5__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1951:2: rule__Ingredient__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__5__Impl_in_rule__Ingredient__Group__53892);
            rule__Ingredient__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__5"


    // $ANTLR start "rule__Ingredient__Group__5__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1957:1: rule__Ingredient__Group__5__Impl : ( '}' ) ;
    public final void rule__Ingredient__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1961:1: ( ( '}' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1962:1: ( '}' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1962:1: ( '}' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1963:1: '}'
            {
             before(grammarAccess.getIngredientAccess().getRightCurlyBracketKeyword_5()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Ingredient__Group__5__Impl3920); 
             after(grammarAccess.getIngredientAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group__5__Impl"


    // $ANTLR start "rule__Ingredient__Group_4__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1988:1: rule__Ingredient__Group_4__0 : rule__Ingredient__Group_4__0__Impl rule__Ingredient__Group_4__1 ;
    public final void rule__Ingredient__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1992:1: ( rule__Ingredient__Group_4__0__Impl rule__Ingredient__Group_4__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1993:2: rule__Ingredient__Group_4__0__Impl rule__Ingredient__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group_4__0__Impl_in_rule__Ingredient__Group_4__03963);
            rule__Ingredient__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group_4__1_in_rule__Ingredient__Group_4__03966);
            rule__Ingredient__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_4__0"


    // $ANTLR start "rule__Ingredient__Group_4__0__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2000:1: rule__Ingredient__Group_4__0__Impl : ( 'spiciness' ) ;
    public final void rule__Ingredient__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2004:1: ( ( 'spiciness' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2005:1: ( 'spiciness' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2005:1: ( 'spiciness' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2006:1: 'spiciness'
            {
             before(grammarAccess.getIngredientAccess().getSpicinessKeyword_4_0()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__Ingredient__Group_4__0__Impl3994); 
             after(grammarAccess.getIngredientAccess().getSpicinessKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_4__0__Impl"


    // $ANTLR start "rule__Ingredient__Group_4__1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2019:1: rule__Ingredient__Group_4__1 : rule__Ingredient__Group_4__1__Impl ;
    public final void rule__Ingredient__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2023:1: ( rule__Ingredient__Group_4__1__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2024:2: rule__Ingredient__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group_4__1__Impl_in_rule__Ingredient__Group_4__14025);
            rule__Ingredient__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_4__1"


    // $ANTLR start "rule__Ingredient__Group_4__1__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2030:1: rule__Ingredient__Group_4__1__Impl : ( ( rule__Ingredient__SpicinessAssignment_4_1 ) ) ;
    public final void rule__Ingredient__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2034:1: ( ( ( rule__Ingredient__SpicinessAssignment_4_1 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2035:1: ( ( rule__Ingredient__SpicinessAssignment_4_1 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2035:1: ( ( rule__Ingredient__SpicinessAssignment_4_1 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2036:1: ( rule__Ingredient__SpicinessAssignment_4_1 )
            {
             before(grammarAccess.getIngredientAccess().getSpicinessAssignment_4_1()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2037:1: ( rule__Ingredient__SpicinessAssignment_4_1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2037:2: rule__Ingredient__SpicinessAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__SpicinessAssignment_4_1_in_rule__Ingredient__Group_4__1__Impl4052);
            rule__Ingredient__SpicinessAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getIngredientAccess().getSpicinessAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__Group_4__1__Impl"


    // $ANTLR start "rule__Group__NameAssignment_2"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2052:1: rule__Group__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Group__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2056:1: ( ( ruleEString ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2057:1: ( ruleEString )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2057:1: ( ruleEString )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2058:1: ruleEString
            {
             before(grammarAccess.getGroupAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Group__NameAssignment_24091);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__NameAssignment_2"


    // $ANTLR start "rule__Group__CategoryAssignment_4_1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2067:1: rule__Group__CategoryAssignment_4_1 : ( ruleCategory ) ;
    public final void rule__Group__CategoryAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2071:1: ( ( ruleCategory ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2072:1: ( ruleCategory )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2072:1: ( ruleCategory )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2073:1: ruleCategory
            {
             before(grammarAccess.getGroupAccess().getCategoryCategoryEnumRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCategory_in_rule__Group__CategoryAssignment_4_14122);
            ruleCategory();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getCategoryCategoryEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__CategoryAssignment_4_1"


    // $ANTLR start "rule__Group__RecipesAssignment_5_2"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2082:1: rule__Group__RecipesAssignment_5_2 : ( ruleRecipe ) ;
    public final void rule__Group__RecipesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2086:1: ( ( ruleRecipe ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2087:1: ( ruleRecipe )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2087:1: ( ruleRecipe )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2088:1: ruleRecipe
            {
             before(grammarAccess.getGroupAccess().getRecipesRecipeParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRecipe_in_rule__Group__RecipesAssignment_5_24153);
            ruleRecipe();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getRecipesRecipeParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__RecipesAssignment_5_2"


    // $ANTLR start "rule__Group__RecipesAssignment_5_3_1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2097:1: rule__Group__RecipesAssignment_5_3_1 : ( ruleRecipe ) ;
    public final void rule__Group__RecipesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2101:1: ( ( ruleRecipe ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2102:1: ( ruleRecipe )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2102:1: ( ruleRecipe )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2103:1: ruleRecipe
            {
             before(grammarAccess.getGroupAccess().getRecipesRecipeParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRecipe_in_rule__Group__RecipesAssignment_5_3_14184);
            ruleRecipe();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getRecipesRecipeParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Group__RecipesAssignment_5_3_1"


    // $ANTLR start "rule__Recipe__NameAssignment_2"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2112:1: rule__Recipe__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Recipe__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2116:1: ( ( ruleEString ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2117:1: ( ruleEString )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2117:1: ( ruleEString )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2118:1: ruleEString
            {
             before(grammarAccess.getRecipeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Recipe__NameAssignment_24215);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__NameAssignment_2"


    // $ANTLR start "rule__Recipe__PriceAssignment_4_1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2127:1: rule__Recipe__PriceAssignment_4_1 : ( ruleEBigDecimal ) ;
    public final void rule__Recipe__PriceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2131:1: ( ( ruleEBigDecimal ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2132:1: ( ruleEBigDecimal )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2132:1: ( ruleEBigDecimal )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2133:1: ruleEBigDecimal
            {
             before(grammarAccess.getRecipeAccess().getPriceEBigDecimalParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBigDecimal_in_rule__Recipe__PriceAssignment_4_14246);
            ruleEBigDecimal();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getPriceEBigDecimalParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__PriceAssignment_4_1"


    // $ANTLR start "rule__Recipe__AmountAssignment_5_1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2142:1: rule__Recipe__AmountAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Recipe__AmountAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2146:1: ( ( ruleEInt ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2147:1: ( ruleEInt )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2147:1: ( ruleEInt )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2148:1: ruleEInt
            {
             before(grammarAccess.getRecipeAccess().getAmountEIntParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Recipe__AmountAssignment_5_14277);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getAmountEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__AmountAssignment_5_1"


    // $ANTLR start "rule__Recipe__AmountTypeAssignment_6_1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2157:1: rule__Recipe__AmountTypeAssignment_6_1 : ( ruleAmountType ) ;
    public final void rule__Recipe__AmountTypeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2161:1: ( ( ruleAmountType ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2162:1: ( ruleAmountType )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2162:1: ( ruleAmountType )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2163:1: ruleAmountType
            {
             before(grammarAccess.getRecipeAccess().getAmountTypeAmountTypeEnumRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAmountType_in_rule__Recipe__AmountTypeAssignment_6_14308);
            ruleAmountType();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getAmountTypeAmountTypeEnumRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__AmountTypeAssignment_6_1"


    // $ANTLR start "rule__Recipe__IngredientsAssignment_7_2"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2172:1: rule__Recipe__IngredientsAssignment_7_2 : ( ruleIngredient ) ;
    public final void rule__Recipe__IngredientsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2176:1: ( ( ruleIngredient ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2177:1: ( ruleIngredient )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2177:1: ( ruleIngredient )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2178:1: ruleIngredient
            {
             before(grammarAccess.getRecipeAccess().getIngredientsIngredientParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIngredient_in_rule__Recipe__IngredientsAssignment_7_24339);
            ruleIngredient();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getIngredientsIngredientParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__IngredientsAssignment_7_2"


    // $ANTLR start "rule__Recipe__IngredientsAssignment_7_3_1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2187:1: rule__Recipe__IngredientsAssignment_7_3_1 : ( ruleIngredient ) ;
    public final void rule__Recipe__IngredientsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2191:1: ( ( ruleIngredient ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2192:1: ( ruleIngredient )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2192:1: ( ruleIngredient )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2193:1: ruleIngredient
            {
             before(grammarAccess.getRecipeAccess().getIngredientsIngredientParserRuleCall_7_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIngredient_in_rule__Recipe__IngredientsAssignment_7_3_14370);
            ruleIngredient();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getIngredientsIngredientParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recipe__IngredientsAssignment_7_3_1"


    // $ANTLR start "rule__Ingredient__NameAssignment_2"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2202:1: rule__Ingredient__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Ingredient__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2206:1: ( ( ruleEString ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2207:1: ( ruleEString )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2207:1: ( ruleEString )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2208:1: ruleEString
            {
             before(grammarAccess.getIngredientAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ingredient__NameAssignment_24401);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIngredientAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__NameAssignment_2"


    // $ANTLR start "rule__Ingredient__SpicinessAssignment_4_1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2217:1: rule__Ingredient__SpicinessAssignment_4_1 : ( ruleSpiciness ) ;
    public final void rule__Ingredient__SpicinessAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2221:1: ( ( ruleSpiciness ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2222:1: ( ruleSpiciness )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2222:1: ( ruleSpiciness )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2223:1: ruleSpiciness
            {
             before(grammarAccess.getIngredientAccess().getSpicinessSpicinessEnumRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSpiciness_in_rule__Ingredient__SpicinessAssignment_4_14432);
            ruleSpiciness();

            state._fsp--;

             after(grammarAccess.getIngredientAccess().getSpicinessSpicinessEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ingredient__SpicinessAssignment_4_1"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroup68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__0_in_ruleGroup94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecipe_in_entryRuleRecipe181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRecipe188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group__0_in_ruleRecipe214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBigDecimal_in_entryRuleEBigDecimal241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBigDecimal248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBigDecimal__Group__0_in_ruleEBigDecimal274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIngredient_in_entryRuleIngredient361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIngredient368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__0_in_ruleIngredient394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Category__Alternatives_in_ruleCategory431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AmountType__Alternatives_in_ruleAmountType467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Spiciness__Alternatives_in_ruleSpiciness503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Category__Alternatives588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Category__Alternatives609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Category__Alternatives630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Category__Alternatives651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Category__Alternatives672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__AmountType__Alternatives708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__AmountType__Alternatives729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__AmountType__Alternatives750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__AmountType__Alternatives771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Spiciness__Alternatives807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Spiciness__Alternatives828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Spiciness__Alternatives849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Spiciness__Alternatives870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__0903 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Group__Group__1_in_rule__Group__Group__0906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__1964 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Group__Group__2_in_rule__Group__Group__1967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Group__Group__1__Impl995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__21026 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Group__Group__3_in_rule__Group__Group__21029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__NameAssignment_2_in_rule__Group__Group__2__Impl1056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__31086 = new BitSet(new long[]{0x000000001C000000L});
        public static final BitSet FOLLOW_rule__Group__Group__4_in_rule__Group__Group__31089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Group__Group__3__Impl1117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__41148 = new BitSet(new long[]{0x000000001C000000L});
        public static final BitSet FOLLOW_rule__Group__Group__5_in_rule__Group__Group__41151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_4__0_in_rule__Group__Group__4__Impl1178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__5__Impl_in_rule__Group__Group__51209 = new BitSet(new long[]{0x000000001C000000L});
        public static final BitSet FOLLOW_rule__Group__Group__6_in_rule__Group__Group__51212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_5__0_in_rule__Group__Group__5__Impl1239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__6__Impl_in_rule__Group__Group__61270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Group__Group__6__Impl1298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_4__0__Impl_in_rule__Group__Group_4__01343 = new BitSet(new long[]{0x000000000000F800L});
        public static final BitSet FOLLOW_rule__Group__Group_4__1_in_rule__Group__Group_4__01346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Group__Group_4__0__Impl1374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_4__1__Impl_in_rule__Group__Group_4__11405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__CategoryAssignment_4_1_in_rule__Group__Group_4__1__Impl1432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_5__0__Impl_in_rule__Group__Group_5__01466 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Group__Group_5__1_in_rule__Group__Group_5__01469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Group__Group_5__0__Impl1497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_5__1__Impl_in_rule__Group__Group_5__11528 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Group__Group_5__2_in_rule__Group__Group_5__11531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Group__Group_5__1__Impl1559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_5__2__Impl_in_rule__Group__Group_5__21590 = new BitSet(new long[]{0x0000000024000000L});
        public static final BitSet FOLLOW_rule__Group__Group_5__3_in_rule__Group__Group_5__21593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__RecipesAssignment_5_2_in_rule__Group__Group_5__2__Impl1620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_5__3__Impl_in_rule__Group__Group_5__31650 = new BitSet(new long[]{0x0000000024000000L});
        public static final BitSet FOLLOW_rule__Group__Group_5__4_in_rule__Group__Group_5__31653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_5_3__0_in_rule__Group__Group_5__3__Impl1680 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_rule__Group__Group_5__4__Impl_in_rule__Group__Group_5__41711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Group__Group_5__4__Impl1739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_5_3__0__Impl_in_rule__Group__Group_5_3__01780 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Group__Group_5_3__1_in_rule__Group__Group_5_3__01783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Group__Group_5_3__0__Impl1811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_5_3__1__Impl_in_rule__Group__Group_5_3__11842 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__RecipesAssignment_5_3_1_in_rule__Group__Group_5_3__1__Impl1869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group__0__Impl_in_rule__Recipe__Group__01903 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Recipe__Group__1_in_rule__Recipe__Group__01906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group__1__Impl_in_rule__Recipe__Group__11964 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Recipe__Group__2_in_rule__Recipe__Group__11967 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Recipe__Group__1__Impl1995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group__2__Impl_in_rule__Recipe__Group__22026 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Recipe__Group__3_in_rule__Recipe__Group__22029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__NameAssignment_2_in_rule__Recipe__Group__2__Impl2056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group__3__Impl_in_rule__Recipe__Group__32086 = new BitSet(new long[]{0x0000000784000000L});
        public static final BitSet FOLLOW_rule__Recipe__Group__4_in_rule__Recipe__Group__32089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Recipe__Group__3__Impl2117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group__4__Impl_in_rule__Recipe__Group__42148 = new BitSet(new long[]{0x0000000784000000L});
        public static final BitSet FOLLOW_rule__Recipe__Group__5_in_rule__Recipe__Group__42151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_4__0_in_rule__Recipe__Group__4__Impl2178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group__5__Impl_in_rule__Recipe__Group__52209 = new BitSet(new long[]{0x0000000784000000L});
        public static final BitSet FOLLOW_rule__Recipe__Group__6_in_rule__Recipe__Group__52212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_5__0_in_rule__Recipe__Group__5__Impl2239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group__6__Impl_in_rule__Recipe__Group__62270 = new BitSet(new long[]{0x0000000784000000L});
        public static final BitSet FOLLOW_rule__Recipe__Group__7_in_rule__Recipe__Group__62273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_6__0_in_rule__Recipe__Group__6__Impl2300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group__7__Impl_in_rule__Recipe__Group__72331 = new BitSet(new long[]{0x0000000784000000L});
        public static final BitSet FOLLOW_rule__Recipe__Group__8_in_rule__Recipe__Group__72334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_7__0_in_rule__Recipe__Group__7__Impl2361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group__8__Impl_in_rule__Recipe__Group__82392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Recipe__Group__8__Impl2420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_4__0__Impl_in_rule__Recipe__Group_4__02469 = new BitSet(new long[]{0x0000000800000040L});
        public static final BitSet FOLLOW_rule__Recipe__Group_4__1_in_rule__Recipe__Group_4__02472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Recipe__Group_4__0__Impl2500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_4__1__Impl_in_rule__Recipe__Group_4__12531 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__PriceAssignment_4_1_in_rule__Recipe__Group_4__1__Impl2558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_5__0__Impl_in_rule__Recipe__Group_5__02592 = new BitSet(new long[]{0x0000001000000040L});
        public static final BitSet FOLLOW_rule__Recipe__Group_5__1_in_rule__Recipe__Group_5__02595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Recipe__Group_5__0__Impl2623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_5__1__Impl_in_rule__Recipe__Group_5__12654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__AmountAssignment_5_1_in_rule__Recipe__Group_5__1__Impl2681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_6__0__Impl_in_rule__Recipe__Group_6__02715 = new BitSet(new long[]{0x00000000000F0000L});
        public static final BitSet FOLLOW_rule__Recipe__Group_6__1_in_rule__Recipe__Group_6__02718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Recipe__Group_6__0__Impl2746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_6__1__Impl_in_rule__Recipe__Group_6__12777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__AmountTypeAssignment_6_1_in_rule__Recipe__Group_6__1__Impl2804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_7__0__Impl_in_rule__Recipe__Group_7__02838 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Recipe__Group_7__1_in_rule__Recipe__Group_7__02841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Recipe__Group_7__0__Impl2869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_7__1__Impl_in_rule__Recipe__Group_7__12900 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__Recipe__Group_7__2_in_rule__Recipe__Group_7__12903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Recipe__Group_7__1__Impl2931 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_7__2__Impl_in_rule__Recipe__Group_7__22962 = new BitSet(new long[]{0x0000000024000000L});
        public static final BitSet FOLLOW_rule__Recipe__Group_7__3_in_rule__Recipe__Group_7__22965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__IngredientsAssignment_7_2_in_rule__Recipe__Group_7__2__Impl2992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_7__3__Impl_in_rule__Recipe__Group_7__33022 = new BitSet(new long[]{0x0000000024000000L});
        public static final BitSet FOLLOW_rule__Recipe__Group_7__4_in_rule__Recipe__Group_7__33025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_7_3__0_in_rule__Recipe__Group_7__3__Impl3052 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_7__4__Impl_in_rule__Recipe__Group_7__43083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Recipe__Group_7__4__Impl3111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_7_3__0__Impl_in_rule__Recipe__Group_7_3__03152 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__Recipe__Group_7_3__1_in_rule__Recipe__Group_7_3__03155 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Recipe__Group_7_3__0__Impl3183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_7_3__1__Impl_in_rule__Recipe__Group_7_3__13214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__IngredientsAssignment_7_3_1_in_rule__Recipe__Group_7_3__1__Impl3241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBigDecimal__Group__0__Impl_in_rule__EBigDecimal__Group__03275 = new BitSet(new long[]{0x0000000800000040L});
        public static final BitSet FOLLOW_rule__EBigDecimal__Group__1_in_rule__EBigDecimal__Group__03278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EBigDecimal__Group__0__Impl3306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBigDecimal__Group__1__Impl_in_rule__EBigDecimal__Group__13337 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EBigDecimal__Group__2_in_rule__EBigDecimal__Group__13340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__EBigDecimal__Group__1__Impl3368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBigDecimal__Group__2__Impl_in_rule__EBigDecimal__Group__23399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EBigDecimal__Group__2__Impl3426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__03461 = new BitSet(new long[]{0x0000001000000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__03464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__EInt__Group__0__Impl3493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__13526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl3553 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__0__Impl_in_rule__Ingredient__Group__03586 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__1_in_rule__Ingredient__Group__03589 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__1__Impl_in_rule__Ingredient__Group__13647 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__2_in_rule__Ingredient__Group__13650 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Ingredient__Group__1__Impl3678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__2__Impl_in_rule__Ingredient__Group__23709 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__3_in_rule__Ingredient__Group__23712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__NameAssignment_2_in_rule__Ingredient__Group__2__Impl3739 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__3__Impl_in_rule__Ingredient__Group__33769 = new BitSet(new long[]{0x0000004004000000L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__4_in_rule__Ingredient__Group__33772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Ingredient__Group__3__Impl3800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__4__Impl_in_rule__Ingredient__Group__43831 = new BitSet(new long[]{0x0000004004000000L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__5_in_rule__Ingredient__Group__43834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__Group_4__0_in_rule__Ingredient__Group__4__Impl3861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__5__Impl_in_rule__Ingredient__Group__53892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Ingredient__Group__5__Impl3920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__Group_4__0__Impl_in_rule__Ingredient__Group_4__03963 = new BitSet(new long[]{0x0000000000F00000L});
        public static final BitSet FOLLOW_rule__Ingredient__Group_4__1_in_rule__Ingredient__Group_4__03966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__Ingredient__Group_4__0__Impl3994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__Group_4__1__Impl_in_rule__Ingredient__Group_4__14025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__SpicinessAssignment_4_1_in_rule__Ingredient__Group_4__1__Impl4052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Group__NameAssignment_24091 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCategory_in_rule__Group__CategoryAssignment_4_14122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecipe_in_rule__Group__RecipesAssignment_5_24153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecipe_in_rule__Group__RecipesAssignment_5_3_14184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Recipe__NameAssignment_24215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBigDecimal_in_rule__Recipe__PriceAssignment_4_14246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Recipe__AmountAssignment_5_14277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAmountType_in_rule__Recipe__AmountTypeAssignment_6_14308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIngredient_in_rule__Recipe__IngredientsAssignment_7_24339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIngredient_in_rule__Recipe__IngredientsAssignment_7_3_14370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ingredient__NameAssignment_24401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSpiciness_in_rule__Ingredient__SpicinessAssignment_4_14432 = new BitSet(new long[]{0x0000000000000002L});
    }


}