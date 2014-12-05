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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'breakfast'", "'dinner'", "'lunch'", "'supper'", "'dessert'", "'gram'", "'milliliters'", "'bottles'", "'items'", "'VeryHot'", "'Hot'", "'Normal'", "'Mild'", "'Menu'", "','", "'Group'", "'Recipe'", "'price'", "'ingredients'", "'.'", "'-'", "'Ingredient'"
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




    // $ANTLR start "entryRuleMenu"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:60:1: entryRuleMenu : ruleMenu EOF ;
    public final void entryRuleMenu() throws RecognitionException {
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:61:1: ( ruleMenu EOF )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:62:1: ruleMenu EOF
            {
             before(grammarAccess.getMenuRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMenu_in_entryRuleMenu61);
            ruleMenu();

            state._fsp--;

             after(grammarAccess.getMenuRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMenu68); 

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
    // $ANTLR end "entryRuleMenu"


    // $ANTLR start "ruleMenu"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:69:1: ruleMenu : ( ( rule__Menu__Group__0 ) ) ;
    public final void ruleMenu() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:73:2: ( ( ( rule__Menu__Group__0 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:74:1: ( ( rule__Menu__Group__0 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:74:1: ( ( rule__Menu__Group__0 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:75:1: ( rule__Menu__Group__0 )
            {
             before(grammarAccess.getMenuAccess().getGroup()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:76:1: ( rule__Menu__Group__0 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:76:2: rule__Menu__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Menu__Group__0_in_ruleMenu94);
            rule__Menu__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getGroup()); 

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
    // $ANTLR end "ruleMenu"


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


    // $ANTLR start "entryRuleGroup"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:116:1: entryRuleGroup : ruleGroup EOF ;
    public final void entryRuleGroup() throws RecognitionException {
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:117:1: ( ruleGroup EOF )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:118:1: ruleGroup EOF
            {
             before(grammarAccess.getGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_entryRuleGroup181);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getGroupRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroup188); 

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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:125:1: ruleGroup : ( ( rule__Group__Group__0 ) ) ;
    public final void ruleGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:129:2: ( ( ( rule__Group__Group__0 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:130:1: ( ( rule__Group__Group__0 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:130:1: ( ( rule__Group__Group__0 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:131:1: ( rule__Group__Group__0 )
            {
             before(grammarAccess.getGroupAccess().getGroup()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:132:1: ( rule__Group__Group__0 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:132:2: rule__Group__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__0_in_ruleGroup214);
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


    // $ANTLR start "entryRuleRecipe"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:144:1: entryRuleRecipe : ruleRecipe EOF ;
    public final void entryRuleRecipe() throws RecognitionException {
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:145:1: ( ruleRecipe EOF )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:146:1: ruleRecipe EOF
            {
             before(grammarAccess.getRecipeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRecipe_in_entryRuleRecipe241);
            ruleRecipe();

            state._fsp--;

             after(grammarAccess.getRecipeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRecipe248); 

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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:153:1: ruleRecipe : ( ( rule__Recipe__Group__0 ) ) ;
    public final void ruleRecipe() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:157:2: ( ( ( rule__Recipe__Group__0 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:158:1: ( ( rule__Recipe__Group__0 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:158:1: ( ( rule__Recipe__Group__0 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:159:1: ( rule__Recipe__Group__0 )
            {
             before(grammarAccess.getRecipeAccess().getGroup()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:160:1: ( rule__Recipe__Group__0 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:160:2: rule__Recipe__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__0_in_ruleRecipe274);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:172:1: entryRuleEBigDecimal : ruleEBigDecimal EOF ;
    public final void entryRuleEBigDecimal() throws RecognitionException {
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:173:1: ( ruleEBigDecimal EOF )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:174:1: ruleEBigDecimal EOF
            {
             before(grammarAccess.getEBigDecimalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBigDecimal_in_entryRuleEBigDecimal301);
            ruleEBigDecimal();

            state._fsp--;

             after(grammarAccess.getEBigDecimalRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBigDecimal308); 

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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:181:1: ruleEBigDecimal : ( ( rule__EBigDecimal__Group__0 ) ) ;
    public final void ruleEBigDecimal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:185:2: ( ( ( rule__EBigDecimal__Group__0 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:186:1: ( ( rule__EBigDecimal__Group__0 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:186:1: ( ( rule__EBigDecimal__Group__0 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:187:1: ( rule__EBigDecimal__Group__0 )
            {
             before(grammarAccess.getEBigDecimalAccess().getGroup()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:188:1: ( rule__EBigDecimal__Group__0 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:188:2: rule__EBigDecimal__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBigDecimal__Group__0_in_ruleEBigDecimal334);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:200:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:201:1: ( ruleEInt EOF )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:202:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt361);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt368); 

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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:209:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:213:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:214:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:214:1: ( ( rule__EInt__Group__0 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:215:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:216:1: ( rule__EInt__Group__0 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:216:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt394);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:228:1: entryRuleIngredient : ruleIngredient EOF ;
    public final void entryRuleIngredient() throws RecognitionException {
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:229:1: ( ruleIngredient EOF )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:230:1: ruleIngredient EOF
            {
             before(grammarAccess.getIngredientRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIngredient_in_entryRuleIngredient421);
            ruleIngredient();

            state._fsp--;

             after(grammarAccess.getIngredientRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIngredient428); 

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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:237:1: ruleIngredient : ( ( rule__Ingredient__Group__0 ) ) ;
    public final void ruleIngredient() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:241:2: ( ( ( rule__Ingredient__Group__0 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:242:1: ( ( rule__Ingredient__Group__0 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:242:1: ( ( rule__Ingredient__Group__0 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:243:1: ( rule__Ingredient__Group__0 )
            {
             before(grammarAccess.getIngredientAccess().getGroup()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:244:1: ( rule__Ingredient__Group__0 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:244:2: rule__Ingredient__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__0_in_ruleIngredient454);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:257:1: ruleCategory : ( ( rule__Category__Alternatives ) ) ;
    public final void ruleCategory() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:261:1: ( ( ( rule__Category__Alternatives ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:262:1: ( ( rule__Category__Alternatives ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:262:1: ( ( rule__Category__Alternatives ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:263:1: ( rule__Category__Alternatives )
            {
             before(grammarAccess.getCategoryAccess().getAlternatives()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:264:1: ( rule__Category__Alternatives )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:264:2: rule__Category__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Category__Alternatives_in_ruleCategory491);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:276:1: ruleAmountType : ( ( rule__AmountType__Alternatives ) ) ;
    public final void ruleAmountType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:280:1: ( ( ( rule__AmountType__Alternatives ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:281:1: ( ( rule__AmountType__Alternatives ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:281:1: ( ( rule__AmountType__Alternatives ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:282:1: ( rule__AmountType__Alternatives )
            {
             before(grammarAccess.getAmountTypeAccess().getAlternatives()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:283:1: ( rule__AmountType__Alternatives )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:283:2: rule__AmountType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AmountType__Alternatives_in_ruleAmountType527);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:295:1: ruleSpiciness : ( ( rule__Spiciness__Alternatives ) ) ;
    public final void ruleSpiciness() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:299:1: ( ( ( rule__Spiciness__Alternatives ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:300:1: ( ( rule__Spiciness__Alternatives ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:300:1: ( ( rule__Spiciness__Alternatives ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:301:1: ( rule__Spiciness__Alternatives )
            {
             before(grammarAccess.getSpicinessAccess().getAlternatives()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:302:1: ( rule__Spiciness__Alternatives )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:302:2: rule__Spiciness__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Spiciness__Alternatives_in_ruleSpiciness563);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:313:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:317:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:318:1: ( RULE_STRING )
                    {
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:318:1: ( RULE_STRING )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:319:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives598); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:324:6: ( RULE_ID )
                    {
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:324:6: ( RULE_ID )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:325:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives615); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:335:1: rule__Category__Alternatives : ( ( ( 'breakfast' ) ) | ( ( 'dinner' ) ) | ( ( 'lunch' ) ) | ( ( 'supper' ) ) | ( ( 'dessert' ) ) );
    public final void rule__Category__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:339:1: ( ( ( 'breakfast' ) ) | ( ( 'dinner' ) ) | ( ( 'lunch' ) ) | ( ( 'supper' ) ) | ( ( 'dessert' ) ) )
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
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:340:1: ( ( 'breakfast' ) )
                    {
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:340:1: ( ( 'breakfast' ) )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:341:1: ( 'breakfast' )
                    {
                     before(grammarAccess.getCategoryAccess().getBreakfastEnumLiteralDeclaration_0()); 
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:342:1: ( 'breakfast' )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:342:3: 'breakfast'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__Category__Alternatives648); 

                    }

                     after(grammarAccess.getCategoryAccess().getBreakfastEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:347:6: ( ( 'dinner' ) )
                    {
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:347:6: ( ( 'dinner' ) )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:348:1: ( 'dinner' )
                    {
                     before(grammarAccess.getCategoryAccess().getDinnerEnumLiteralDeclaration_1()); 
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:349:1: ( 'dinner' )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:349:3: 'dinner'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__Category__Alternatives669); 

                    }

                     after(grammarAccess.getCategoryAccess().getDinnerEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:354:6: ( ( 'lunch' ) )
                    {
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:354:6: ( ( 'lunch' ) )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:355:1: ( 'lunch' )
                    {
                     before(grammarAccess.getCategoryAccess().getLunchEnumLiteralDeclaration_2()); 
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:356:1: ( 'lunch' )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:356:3: 'lunch'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__Category__Alternatives690); 

                    }

                     after(grammarAccess.getCategoryAccess().getLunchEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:361:6: ( ( 'supper' ) )
                    {
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:361:6: ( ( 'supper' ) )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:362:1: ( 'supper' )
                    {
                     before(grammarAccess.getCategoryAccess().getSupperEnumLiteralDeclaration_3()); 
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:363:1: ( 'supper' )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:363:3: 'supper'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__Category__Alternatives711); 

                    }

                     after(grammarAccess.getCategoryAccess().getSupperEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:368:6: ( ( 'dessert' ) )
                    {
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:368:6: ( ( 'dessert' ) )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:369:1: ( 'dessert' )
                    {
                     before(grammarAccess.getCategoryAccess().getDessertEnumLiteralDeclaration_4()); 
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:370:1: ( 'dessert' )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:370:3: 'dessert'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__Category__Alternatives732); 

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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:380:1: rule__AmountType__Alternatives : ( ( ( 'gram' ) ) | ( ( 'milliliters' ) ) | ( ( 'bottles' ) ) | ( ( 'items' ) ) );
    public final void rule__AmountType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:384:1: ( ( ( 'gram' ) ) | ( ( 'milliliters' ) ) | ( ( 'bottles' ) ) | ( ( 'items' ) ) )
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
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:385:1: ( ( 'gram' ) )
                    {
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:385:1: ( ( 'gram' ) )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:386:1: ( 'gram' )
                    {
                     before(grammarAccess.getAmountTypeAccess().getGramEnumLiteralDeclaration_0()); 
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:387:1: ( 'gram' )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:387:3: 'gram'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__AmountType__Alternatives768); 

                    }

                     after(grammarAccess.getAmountTypeAccess().getGramEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:392:6: ( ( 'milliliters' ) )
                    {
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:392:6: ( ( 'milliliters' ) )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:393:1: ( 'milliliters' )
                    {
                     before(grammarAccess.getAmountTypeAccess().getMillilitersEnumLiteralDeclaration_1()); 
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:394:1: ( 'milliliters' )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:394:3: 'milliliters'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__AmountType__Alternatives789); 

                    }

                     after(grammarAccess.getAmountTypeAccess().getMillilitersEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:399:6: ( ( 'bottles' ) )
                    {
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:399:6: ( ( 'bottles' ) )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:400:1: ( 'bottles' )
                    {
                     before(grammarAccess.getAmountTypeAccess().getBottlesEnumLiteralDeclaration_2()); 
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:401:1: ( 'bottles' )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:401:3: 'bottles'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__AmountType__Alternatives810); 

                    }

                     after(grammarAccess.getAmountTypeAccess().getBottlesEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:406:6: ( ( 'items' ) )
                    {
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:406:6: ( ( 'items' ) )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:407:1: ( 'items' )
                    {
                     before(grammarAccess.getAmountTypeAccess().getItemsEnumLiteralDeclaration_3()); 
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:408:1: ( 'items' )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:408:3: 'items'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__AmountType__Alternatives831); 

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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:418:1: rule__Spiciness__Alternatives : ( ( ( 'VeryHot' ) ) | ( ( 'Hot' ) ) | ( ( 'Normal' ) ) | ( ( 'Mild' ) ) );
    public final void rule__Spiciness__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:422:1: ( ( ( 'VeryHot' ) ) | ( ( 'Hot' ) ) | ( ( 'Normal' ) ) | ( ( 'Mild' ) ) )
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
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:423:1: ( ( 'VeryHot' ) )
                    {
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:423:1: ( ( 'VeryHot' ) )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:424:1: ( 'VeryHot' )
                    {
                     before(grammarAccess.getSpicinessAccess().getVeryHotEnumLiteralDeclaration_0()); 
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:425:1: ( 'VeryHot' )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:425:3: 'VeryHot'
                    {
                    match(input,20,FollowSets000.FOLLOW_20_in_rule__Spiciness__Alternatives867); 

                    }

                     after(grammarAccess.getSpicinessAccess().getVeryHotEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:430:6: ( ( 'Hot' ) )
                    {
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:430:6: ( ( 'Hot' ) )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:431:1: ( 'Hot' )
                    {
                     before(grammarAccess.getSpicinessAccess().getHotEnumLiteralDeclaration_1()); 
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:432:1: ( 'Hot' )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:432:3: 'Hot'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__Spiciness__Alternatives888); 

                    }

                     after(grammarAccess.getSpicinessAccess().getHotEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:437:6: ( ( 'Normal' ) )
                    {
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:437:6: ( ( 'Normal' ) )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:438:1: ( 'Normal' )
                    {
                     before(grammarAccess.getSpicinessAccess().getNormalEnumLiteralDeclaration_2()); 
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:439:1: ( 'Normal' )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:439:3: 'Normal'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__Spiciness__Alternatives909); 

                    }

                     after(grammarAccess.getSpicinessAccess().getNormalEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:444:6: ( ( 'Mild' ) )
                    {
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:444:6: ( ( 'Mild' ) )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:445:1: ( 'Mild' )
                    {
                     before(grammarAccess.getSpicinessAccess().getMildEnumLiteralDeclaration_3()); 
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:446:1: ( 'Mild' )
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:446:3: 'Mild'
                    {
                    match(input,23,FollowSets000.FOLLOW_23_in_rule__Spiciness__Alternatives930); 

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


    // $ANTLR start "rule__Menu__Group__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:458:1: rule__Menu__Group__0 : rule__Menu__Group__0__Impl rule__Menu__Group__1 ;
    public final void rule__Menu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:462:1: ( rule__Menu__Group__0__Impl rule__Menu__Group__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:463:2: rule__Menu__Group__0__Impl rule__Menu__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Menu__Group__0__Impl_in_rule__Menu__Group__0963);
            rule__Menu__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Menu__Group__1_in_rule__Menu__Group__0966);
            rule__Menu__Group__1();

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
    // $ANTLR end "rule__Menu__Group__0"


    // $ANTLR start "rule__Menu__Group__0__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:470:1: rule__Menu__Group__0__Impl : ( () ) ;
    public final void rule__Menu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:474:1: ( ( () ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:475:1: ( () )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:475:1: ( () )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:476:1: ()
            {
             before(grammarAccess.getMenuAccess().getMenuAction_0()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:477:1: ()
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:479:1: 
            {
            }

             after(grammarAccess.getMenuAccess().getMenuAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__0__Impl"


    // $ANTLR start "rule__Menu__Group__1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:489:1: rule__Menu__Group__1 : rule__Menu__Group__1__Impl rule__Menu__Group__2 ;
    public final void rule__Menu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:493:1: ( rule__Menu__Group__1__Impl rule__Menu__Group__2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:494:2: rule__Menu__Group__1__Impl rule__Menu__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Menu__Group__1__Impl_in_rule__Menu__Group__11024);
            rule__Menu__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Menu__Group__2_in_rule__Menu__Group__11027);
            rule__Menu__Group__2();

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
    // $ANTLR end "rule__Menu__Group__1"


    // $ANTLR start "rule__Menu__Group__1__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:501:1: rule__Menu__Group__1__Impl : ( 'Menu' ) ;
    public final void rule__Menu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:505:1: ( ( 'Menu' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:506:1: ( 'Menu' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:506:1: ( 'Menu' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:507:1: 'Menu'
            {
             before(grammarAccess.getMenuAccess().getMenuKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Menu__Group__1__Impl1055); 
             after(grammarAccess.getMenuAccess().getMenuKeyword_1()); 

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
    // $ANTLR end "rule__Menu__Group__1__Impl"


    // $ANTLR start "rule__Menu__Group__2"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:520:1: rule__Menu__Group__2 : rule__Menu__Group__2__Impl rule__Menu__Group__3 ;
    public final void rule__Menu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:524:1: ( rule__Menu__Group__2__Impl rule__Menu__Group__3 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:525:2: rule__Menu__Group__2__Impl rule__Menu__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Menu__Group__2__Impl_in_rule__Menu__Group__21086);
            rule__Menu__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Menu__Group__3_in_rule__Menu__Group__21089);
            rule__Menu__Group__3();

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
    // $ANTLR end "rule__Menu__Group__2"


    // $ANTLR start "rule__Menu__Group__2__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:532:1: rule__Menu__Group__2__Impl : ( ( rule__Menu__NameAssignment_2 ) ) ;
    public final void rule__Menu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:536:1: ( ( ( rule__Menu__NameAssignment_2 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:537:1: ( ( rule__Menu__NameAssignment_2 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:537:1: ( ( rule__Menu__NameAssignment_2 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:538:1: ( rule__Menu__NameAssignment_2 )
            {
             before(grammarAccess.getMenuAccess().getNameAssignment_2()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:539:1: ( rule__Menu__NameAssignment_2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:539:2: rule__Menu__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Menu__NameAssignment_2_in_rule__Menu__Group__2__Impl1116);
            rule__Menu__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Menu__Group__2__Impl"


    // $ANTLR start "rule__Menu__Group__3"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:549:1: rule__Menu__Group__3 : rule__Menu__Group__3__Impl ;
    public final void rule__Menu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:553:1: ( rule__Menu__Group__3__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:554:2: rule__Menu__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Menu__Group__3__Impl_in_rule__Menu__Group__31146);
            rule__Menu__Group__3__Impl();

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
    // $ANTLR end "rule__Menu__Group__3"


    // $ANTLR start "rule__Menu__Group__3__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:560:1: rule__Menu__Group__3__Impl : ( ( rule__Menu__Group_3__0 )? ) ;
    public final void rule__Menu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:564:1: ( ( ( rule__Menu__Group_3__0 )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:565:1: ( ( rule__Menu__Group_3__0 )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:565:1: ( ( rule__Menu__Group_3__0 )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:566:1: ( rule__Menu__Group_3__0 )?
            {
             before(grammarAccess.getMenuAccess().getGroup_3()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:567:1: ( rule__Menu__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:567:2: rule__Menu__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Menu__Group_3__0_in_rule__Menu__Group__3__Impl1173);
                    rule__Menu__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMenuAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Menu__Group__3__Impl"


    // $ANTLR start "rule__Menu__Group_3__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:585:1: rule__Menu__Group_3__0 : rule__Menu__Group_3__0__Impl rule__Menu__Group_3__1 ;
    public final void rule__Menu__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:589:1: ( rule__Menu__Group_3__0__Impl rule__Menu__Group_3__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:590:2: rule__Menu__Group_3__0__Impl rule__Menu__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Menu__Group_3__0__Impl_in_rule__Menu__Group_3__01212);
            rule__Menu__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Menu__Group_3__1_in_rule__Menu__Group_3__01215);
            rule__Menu__Group_3__1();

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
    // $ANTLR end "rule__Menu__Group_3__0"


    // $ANTLR start "rule__Menu__Group_3__0__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:597:1: rule__Menu__Group_3__0__Impl : ( ( rule__Menu__GroupsAssignment_3_0 ) ) ;
    public final void rule__Menu__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:601:1: ( ( ( rule__Menu__GroupsAssignment_3_0 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:602:1: ( ( rule__Menu__GroupsAssignment_3_0 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:602:1: ( ( rule__Menu__GroupsAssignment_3_0 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:603:1: ( rule__Menu__GroupsAssignment_3_0 )
            {
             before(grammarAccess.getMenuAccess().getGroupsAssignment_3_0()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:604:1: ( rule__Menu__GroupsAssignment_3_0 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:604:2: rule__Menu__GroupsAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Menu__GroupsAssignment_3_0_in_rule__Menu__Group_3__0__Impl1242);
            rule__Menu__GroupsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getGroupsAssignment_3_0()); 

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
    // $ANTLR end "rule__Menu__Group_3__0__Impl"


    // $ANTLR start "rule__Menu__Group_3__1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:614:1: rule__Menu__Group_3__1 : rule__Menu__Group_3__1__Impl ;
    public final void rule__Menu__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:618:1: ( rule__Menu__Group_3__1__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:619:2: rule__Menu__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Menu__Group_3__1__Impl_in_rule__Menu__Group_3__11272);
            rule__Menu__Group_3__1__Impl();

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
    // $ANTLR end "rule__Menu__Group_3__1"


    // $ANTLR start "rule__Menu__Group_3__1__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:625:1: rule__Menu__Group_3__1__Impl : ( ( rule__Menu__Group_3_1__0 )* ) ;
    public final void rule__Menu__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:629:1: ( ( ( rule__Menu__Group_3_1__0 )* ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:630:1: ( ( rule__Menu__Group_3_1__0 )* )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:630:1: ( ( rule__Menu__Group_3_1__0 )* )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:631:1: ( rule__Menu__Group_3_1__0 )*
            {
             before(grammarAccess.getMenuAccess().getGroup_3_1()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:632:1: ( rule__Menu__Group_3_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:632:2: rule__Menu__Group_3_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Menu__Group_3_1__0_in_rule__Menu__Group_3__1__Impl1299);
            	    rule__Menu__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getMenuAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__Menu__Group_3__1__Impl"


    // $ANTLR start "rule__Menu__Group_3_1__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:646:1: rule__Menu__Group_3_1__0 : rule__Menu__Group_3_1__0__Impl rule__Menu__Group_3_1__1 ;
    public final void rule__Menu__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:650:1: ( rule__Menu__Group_3_1__0__Impl rule__Menu__Group_3_1__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:651:2: rule__Menu__Group_3_1__0__Impl rule__Menu__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Menu__Group_3_1__0__Impl_in_rule__Menu__Group_3_1__01334);
            rule__Menu__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Menu__Group_3_1__1_in_rule__Menu__Group_3_1__01337);
            rule__Menu__Group_3_1__1();

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
    // $ANTLR end "rule__Menu__Group_3_1__0"


    // $ANTLR start "rule__Menu__Group_3_1__0__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:658:1: rule__Menu__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Menu__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:662:1: ( ( ',' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:663:1: ( ',' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:663:1: ( ',' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:664:1: ','
            {
             before(grammarAccess.getMenuAccess().getCommaKeyword_3_1_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Menu__Group_3_1__0__Impl1365); 
             after(grammarAccess.getMenuAccess().getCommaKeyword_3_1_0()); 

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
    // $ANTLR end "rule__Menu__Group_3_1__0__Impl"


    // $ANTLR start "rule__Menu__Group_3_1__1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:677:1: rule__Menu__Group_3_1__1 : rule__Menu__Group_3_1__1__Impl ;
    public final void rule__Menu__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:681:1: ( rule__Menu__Group_3_1__1__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:682:2: rule__Menu__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Menu__Group_3_1__1__Impl_in_rule__Menu__Group_3_1__11396);
            rule__Menu__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__Menu__Group_3_1__1"


    // $ANTLR start "rule__Menu__Group_3_1__1__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:688:1: rule__Menu__Group_3_1__1__Impl : ( ( rule__Menu__GroupsAssignment_3_1_1 ) ) ;
    public final void rule__Menu__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:692:1: ( ( ( rule__Menu__GroupsAssignment_3_1_1 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:693:1: ( ( rule__Menu__GroupsAssignment_3_1_1 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:693:1: ( ( rule__Menu__GroupsAssignment_3_1_1 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:694:1: ( rule__Menu__GroupsAssignment_3_1_1 )
            {
             before(grammarAccess.getMenuAccess().getGroupsAssignment_3_1_1()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:695:1: ( rule__Menu__GroupsAssignment_3_1_1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:695:2: rule__Menu__GroupsAssignment_3_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Menu__GroupsAssignment_3_1_1_in_rule__Menu__Group_3_1__1__Impl1423);
            rule__Menu__GroupsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getGroupsAssignment_3_1_1()); 

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
    // $ANTLR end "rule__Menu__Group_3_1__1__Impl"


    // $ANTLR start "rule__Group__Group__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:709:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:713:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:714:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__01457);
            rule__Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__1_in_rule__Group__Group__01460);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:721:1: rule__Group__Group__0__Impl : ( () ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:725:1: ( ( () ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:726:1: ( () )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:726:1: ( () )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:727:1: ()
            {
             before(grammarAccess.getGroupAccess().getGroupAction_0()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:728:1: ()
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:730:1: 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:740:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:744:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:745:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__11518);
            rule__Group__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__2_in_rule__Group__Group__11521);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:752:1: rule__Group__Group__1__Impl : ( 'Group' ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:756:1: ( ( 'Group' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:757:1: ( 'Group' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:757:1: ( 'Group' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:758:1: 'Group'
            {
             before(grammarAccess.getGroupAccess().getGroupKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Group__Group__1__Impl1549); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:771:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:775:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:776:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__21580);
            rule__Group__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__3_in_rule__Group__Group__21583);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:783:1: rule__Group__Group__2__Impl : ( ( rule__Group__NameAssignment_2 ) ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:787:1: ( ( ( rule__Group__NameAssignment_2 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:788:1: ( ( rule__Group__NameAssignment_2 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:788:1: ( ( rule__Group__NameAssignment_2 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:789:1: ( rule__Group__NameAssignment_2 )
            {
             before(grammarAccess.getGroupAccess().getNameAssignment_2()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:790:1: ( rule__Group__NameAssignment_2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:790:2: rule__Group__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__NameAssignment_2_in_rule__Group__Group__2__Impl1610);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:800:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:804:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:805:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__31640);
            rule__Group__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__4_in_rule__Group__Group__31643);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:812:1: rule__Group__Group__3__Impl : ( ( rule__Group__CategoryAssignment_3 )? ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:816:1: ( ( ( rule__Group__CategoryAssignment_3 )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:817:1: ( ( rule__Group__CategoryAssignment_3 )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:817:1: ( ( rule__Group__CategoryAssignment_3 )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:818:1: ( rule__Group__CategoryAssignment_3 )?
            {
             before(grammarAccess.getGroupAccess().getCategoryAssignment_3()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:819:1: ( rule__Group__CategoryAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=11 && LA7_0<=15)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:819:2: rule__Group__CategoryAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Group__CategoryAssignment_3_in_rule__Group__Group__3__Impl1670);
                    rule__Group__CategoryAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGroupAccess().getCategoryAssignment_3()); 

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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:829:1: rule__Group__Group__4 : rule__Group__Group__4__Impl ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:833:1: ( rule__Group__Group__4__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:834:2: rule__Group__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__41701);
            rule__Group__Group__4__Impl();

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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:840:1: rule__Group__Group__4__Impl : ( ( rule__Group__Group_4__0 )? ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:844:1: ( ( ( rule__Group__Group_4__0 )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:845:1: ( ( rule__Group__Group_4__0 )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:845:1: ( ( rule__Group__Group_4__0 )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:846:1: ( rule__Group__Group_4__0 )?
            {
             before(grammarAccess.getGroupAccess().getGroup_4()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:847:1: ( rule__Group__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:847:2: rule__Group__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4__0_in_rule__Group__Group__4__Impl1728);
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


    // $ANTLR start "rule__Group__Group_4__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:867:1: rule__Group__Group_4__0 : rule__Group__Group_4__0__Impl rule__Group__Group_4__1 ;
    public final void rule__Group__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:871:1: ( rule__Group__Group_4__0__Impl rule__Group__Group_4__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:872:2: rule__Group__Group_4__0__Impl rule__Group__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4__0__Impl_in_rule__Group__Group_4__01769);
            rule__Group__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4__1_in_rule__Group__Group_4__01772);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:879:1: rule__Group__Group_4__0__Impl : ( ( rule__Group__RecipesAssignment_4_0 ) ) ;
    public final void rule__Group__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:883:1: ( ( ( rule__Group__RecipesAssignment_4_0 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:884:1: ( ( rule__Group__RecipesAssignment_4_0 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:884:1: ( ( rule__Group__RecipesAssignment_4_0 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:885:1: ( rule__Group__RecipesAssignment_4_0 )
            {
             before(grammarAccess.getGroupAccess().getRecipesAssignment_4_0()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:886:1: ( rule__Group__RecipesAssignment_4_0 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:886:2: rule__Group__RecipesAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__RecipesAssignment_4_0_in_rule__Group__Group_4__0__Impl1799);
            rule__Group__RecipesAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getRecipesAssignment_4_0()); 

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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:896:1: rule__Group__Group_4__1 : rule__Group__Group_4__1__Impl ;
    public final void rule__Group__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:900:1: ( rule__Group__Group_4__1__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:901:2: rule__Group__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4__1__Impl_in_rule__Group__Group_4__11829);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:907:1: rule__Group__Group_4__1__Impl : ( ( rule__Group__Group_4_1__0 )* ) ;
    public final void rule__Group__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:911:1: ( ( ( rule__Group__Group_4_1__0 )* ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:912:1: ( ( rule__Group__Group_4_1__0 )* )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:912:1: ( ( rule__Group__Group_4_1__0 )* )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:913:1: ( rule__Group__Group_4_1__0 )*
            {
             before(grammarAccess.getGroupAccess().getGroup_4_1()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:914:1: ( rule__Group__Group_4_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    int LA9_2 = input.LA(2);

                    if ( (LA9_2==27) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:914:2: rule__Group__Group_4_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4_1__0_in_rule__Group__Group_4__1__Impl1856);
            	    rule__Group__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getGroupAccess().getGroup_4_1()); 

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


    // $ANTLR start "rule__Group__Group_4_1__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:928:1: rule__Group__Group_4_1__0 : rule__Group__Group_4_1__0__Impl rule__Group__Group_4_1__1 ;
    public final void rule__Group__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:932:1: ( rule__Group__Group_4_1__0__Impl rule__Group__Group_4_1__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:933:2: rule__Group__Group_4_1__0__Impl rule__Group__Group_4_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4_1__0__Impl_in_rule__Group__Group_4_1__01891);
            rule__Group__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4_1__1_in_rule__Group__Group_4_1__01894);
            rule__Group__Group_4_1__1();

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
    // $ANTLR end "rule__Group__Group_4_1__0"


    // $ANTLR start "rule__Group__Group_4_1__0__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:940:1: rule__Group__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Group__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:944:1: ( ( ',' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:945:1: ( ',' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:945:1: ( ',' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:946:1: ','
            {
             before(grammarAccess.getGroupAccess().getCommaKeyword_4_1_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Group__Group_4_1__0__Impl1922); 
             after(grammarAccess.getGroupAccess().getCommaKeyword_4_1_0()); 

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
    // $ANTLR end "rule__Group__Group_4_1__0__Impl"


    // $ANTLR start "rule__Group__Group_4_1__1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:959:1: rule__Group__Group_4_1__1 : rule__Group__Group_4_1__1__Impl ;
    public final void rule__Group__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:963:1: ( rule__Group__Group_4_1__1__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:964:2: rule__Group__Group_4_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4_1__1__Impl_in_rule__Group__Group_4_1__11953);
            rule__Group__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__Group__Group_4_1__1"


    // $ANTLR start "rule__Group__Group_4_1__1__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:970:1: rule__Group__Group_4_1__1__Impl : ( ( rule__Group__RecipesAssignment_4_1_1 ) ) ;
    public final void rule__Group__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:974:1: ( ( ( rule__Group__RecipesAssignment_4_1_1 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:975:1: ( ( rule__Group__RecipesAssignment_4_1_1 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:975:1: ( ( rule__Group__RecipesAssignment_4_1_1 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:976:1: ( rule__Group__RecipesAssignment_4_1_1 )
            {
             before(grammarAccess.getGroupAccess().getRecipesAssignment_4_1_1()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:977:1: ( rule__Group__RecipesAssignment_4_1_1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:977:2: rule__Group__RecipesAssignment_4_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__RecipesAssignment_4_1_1_in_rule__Group__Group_4_1__1__Impl1980);
            rule__Group__RecipesAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupAccess().getRecipesAssignment_4_1_1()); 

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
    // $ANTLR end "rule__Group__Group_4_1__1__Impl"


    // $ANTLR start "rule__Recipe__Group__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:991:1: rule__Recipe__Group__0 : rule__Recipe__Group__0__Impl rule__Recipe__Group__1 ;
    public final void rule__Recipe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:995:1: ( rule__Recipe__Group__0__Impl rule__Recipe__Group__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:996:2: rule__Recipe__Group__0__Impl rule__Recipe__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__0__Impl_in_rule__Recipe__Group__02014);
            rule__Recipe__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__1_in_rule__Recipe__Group__02017);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1003:1: rule__Recipe__Group__0__Impl : ( () ) ;
    public final void rule__Recipe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1007:1: ( ( () ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1008:1: ( () )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1008:1: ( () )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1009:1: ()
            {
             before(grammarAccess.getRecipeAccess().getRecipeAction_0()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1010:1: ()
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1012:1: 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1022:1: rule__Recipe__Group__1 : rule__Recipe__Group__1__Impl rule__Recipe__Group__2 ;
    public final void rule__Recipe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1026:1: ( rule__Recipe__Group__1__Impl rule__Recipe__Group__2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1027:2: rule__Recipe__Group__1__Impl rule__Recipe__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__1__Impl_in_rule__Recipe__Group__12075);
            rule__Recipe__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__2_in_rule__Recipe__Group__12078);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1034:1: rule__Recipe__Group__1__Impl : ( 'Recipe' ) ;
    public final void rule__Recipe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1038:1: ( ( 'Recipe' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1039:1: ( 'Recipe' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1039:1: ( 'Recipe' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1040:1: 'Recipe'
            {
             before(grammarAccess.getRecipeAccess().getRecipeKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Recipe__Group__1__Impl2106); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1053:1: rule__Recipe__Group__2 : rule__Recipe__Group__2__Impl rule__Recipe__Group__3 ;
    public final void rule__Recipe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1057:1: ( rule__Recipe__Group__2__Impl rule__Recipe__Group__3 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1058:2: rule__Recipe__Group__2__Impl rule__Recipe__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__2__Impl_in_rule__Recipe__Group__22137);
            rule__Recipe__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__3_in_rule__Recipe__Group__22140);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1065:1: rule__Recipe__Group__2__Impl : ( ( rule__Recipe__NameAssignment_2 ) ) ;
    public final void rule__Recipe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1069:1: ( ( ( rule__Recipe__NameAssignment_2 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1070:1: ( ( rule__Recipe__NameAssignment_2 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1070:1: ( ( rule__Recipe__NameAssignment_2 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1071:1: ( rule__Recipe__NameAssignment_2 )
            {
             before(grammarAccess.getRecipeAccess().getNameAssignment_2()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1072:1: ( rule__Recipe__NameAssignment_2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1072:2: rule__Recipe__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__NameAssignment_2_in_rule__Recipe__Group__2__Impl2167);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1082:1: rule__Recipe__Group__3 : rule__Recipe__Group__3__Impl rule__Recipe__Group__4 ;
    public final void rule__Recipe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1086:1: ( rule__Recipe__Group__3__Impl rule__Recipe__Group__4 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1087:2: rule__Recipe__Group__3__Impl rule__Recipe__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__3__Impl_in_rule__Recipe__Group__32197);
            rule__Recipe__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__4_in_rule__Recipe__Group__32200);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1094:1: rule__Recipe__Group__3__Impl : ( ( rule__Recipe__Group_3__0 )? ) ;
    public final void rule__Recipe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1098:1: ( ( ( rule__Recipe__Group_3__0 )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1099:1: ( ( rule__Recipe__Group_3__0 )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1099:1: ( ( rule__Recipe__Group_3__0 )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1100:1: ( rule__Recipe__Group_3__0 )?
            {
             before(grammarAccess.getRecipeAccess().getGroup_3()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1101:1: ( rule__Recipe__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1101:2: rule__Recipe__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_3__0_in_rule__Recipe__Group__3__Impl2227);
                    rule__Recipe__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecipeAccess().getGroup_3()); 

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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1111:1: rule__Recipe__Group__4 : rule__Recipe__Group__4__Impl rule__Recipe__Group__5 ;
    public final void rule__Recipe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1115:1: ( rule__Recipe__Group__4__Impl rule__Recipe__Group__5 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1116:2: rule__Recipe__Group__4__Impl rule__Recipe__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__4__Impl_in_rule__Recipe__Group__42258);
            rule__Recipe__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__5_in_rule__Recipe__Group__42261);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1123:1: rule__Recipe__Group__4__Impl : ( ( rule__Recipe__AmountAssignment_4 )? ) ;
    public final void rule__Recipe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1127:1: ( ( ( rule__Recipe__AmountAssignment_4 )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1128:1: ( ( rule__Recipe__AmountAssignment_4 )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1128:1: ( ( rule__Recipe__AmountAssignment_4 )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1129:1: ( rule__Recipe__AmountAssignment_4 )?
            {
             before(grammarAccess.getRecipeAccess().getAmountAssignment_4()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1130:1: ( rule__Recipe__AmountAssignment_4 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT||LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1130:2: rule__Recipe__AmountAssignment_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Recipe__AmountAssignment_4_in_rule__Recipe__Group__4__Impl2288);
                    rule__Recipe__AmountAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecipeAccess().getAmountAssignment_4()); 

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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1140:1: rule__Recipe__Group__5 : rule__Recipe__Group__5__Impl rule__Recipe__Group__6 ;
    public final void rule__Recipe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1144:1: ( rule__Recipe__Group__5__Impl rule__Recipe__Group__6 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1145:2: rule__Recipe__Group__5__Impl rule__Recipe__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__5__Impl_in_rule__Recipe__Group__52319);
            rule__Recipe__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__6_in_rule__Recipe__Group__52322);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1152:1: rule__Recipe__Group__5__Impl : ( ( rule__Recipe__AmountTypeAssignment_5 )? ) ;
    public final void rule__Recipe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1156:1: ( ( ( rule__Recipe__AmountTypeAssignment_5 )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1157:1: ( ( rule__Recipe__AmountTypeAssignment_5 )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1157:1: ( ( rule__Recipe__AmountTypeAssignment_5 )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1158:1: ( rule__Recipe__AmountTypeAssignment_5 )?
            {
             before(grammarAccess.getRecipeAccess().getAmountTypeAssignment_5()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1159:1: ( rule__Recipe__AmountTypeAssignment_5 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=16 && LA12_0<=19)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1159:2: rule__Recipe__AmountTypeAssignment_5
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Recipe__AmountTypeAssignment_5_in_rule__Recipe__Group__5__Impl2349);
                    rule__Recipe__AmountTypeAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecipeAccess().getAmountTypeAssignment_5()); 

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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1169:1: rule__Recipe__Group__6 : rule__Recipe__Group__6__Impl ;
    public final void rule__Recipe__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1173:1: ( rule__Recipe__Group__6__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1174:2: rule__Recipe__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__6__Impl_in_rule__Recipe__Group__62380);
            rule__Recipe__Group__6__Impl();

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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1180:1: rule__Recipe__Group__6__Impl : ( ( rule__Recipe__Group_6__0 )? ) ;
    public final void rule__Recipe__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1184:1: ( ( ( rule__Recipe__Group_6__0 )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1185:1: ( ( rule__Recipe__Group_6__0 )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1185:1: ( ( rule__Recipe__Group_6__0 )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1186:1: ( rule__Recipe__Group_6__0 )?
            {
             before(grammarAccess.getRecipeAccess().getGroup_6()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1187:1: ( rule__Recipe__Group_6__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1187:2: rule__Recipe__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_6__0_in_rule__Recipe__Group__6__Impl2407);
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


    // $ANTLR start "rule__Recipe__Group_3__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1211:1: rule__Recipe__Group_3__0 : rule__Recipe__Group_3__0__Impl rule__Recipe__Group_3__1 ;
    public final void rule__Recipe__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1215:1: ( rule__Recipe__Group_3__0__Impl rule__Recipe__Group_3__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1216:2: rule__Recipe__Group_3__0__Impl rule__Recipe__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_3__0__Impl_in_rule__Recipe__Group_3__02452);
            rule__Recipe__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_3__1_in_rule__Recipe__Group_3__02455);
            rule__Recipe__Group_3__1();

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
    // $ANTLR end "rule__Recipe__Group_3__0"


    // $ANTLR start "rule__Recipe__Group_3__0__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1223:1: rule__Recipe__Group_3__0__Impl : ( 'price' ) ;
    public final void rule__Recipe__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1227:1: ( ( 'price' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1228:1: ( 'price' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1228:1: ( 'price' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1229:1: 'price'
            {
             before(grammarAccess.getRecipeAccess().getPriceKeyword_3_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Recipe__Group_3__0__Impl2483); 
             after(grammarAccess.getRecipeAccess().getPriceKeyword_3_0()); 

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
    // $ANTLR end "rule__Recipe__Group_3__0__Impl"


    // $ANTLR start "rule__Recipe__Group_3__1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1242:1: rule__Recipe__Group_3__1 : rule__Recipe__Group_3__1__Impl ;
    public final void rule__Recipe__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1246:1: ( rule__Recipe__Group_3__1__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1247:2: rule__Recipe__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_3__1__Impl_in_rule__Recipe__Group_3__12514);
            rule__Recipe__Group_3__1__Impl();

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
    // $ANTLR end "rule__Recipe__Group_3__1"


    // $ANTLR start "rule__Recipe__Group_3__1__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1253:1: rule__Recipe__Group_3__1__Impl : ( ( rule__Recipe__PriceAssignment_3_1 ) ) ;
    public final void rule__Recipe__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1257:1: ( ( ( rule__Recipe__PriceAssignment_3_1 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1258:1: ( ( rule__Recipe__PriceAssignment_3_1 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1258:1: ( ( rule__Recipe__PriceAssignment_3_1 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1259:1: ( rule__Recipe__PriceAssignment_3_1 )
            {
             before(grammarAccess.getRecipeAccess().getPriceAssignment_3_1()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1260:1: ( rule__Recipe__PriceAssignment_3_1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1260:2: rule__Recipe__PriceAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__PriceAssignment_3_1_in_rule__Recipe__Group_3__1__Impl2541);
            rule__Recipe__PriceAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getPriceAssignment_3_1()); 

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
    // $ANTLR end "rule__Recipe__Group_3__1__Impl"


    // $ANTLR start "rule__Recipe__Group_6__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1274:1: rule__Recipe__Group_6__0 : rule__Recipe__Group_6__0__Impl rule__Recipe__Group_6__1 ;
    public final void rule__Recipe__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1278:1: ( rule__Recipe__Group_6__0__Impl rule__Recipe__Group_6__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1279:2: rule__Recipe__Group_6__0__Impl rule__Recipe__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_6__0__Impl_in_rule__Recipe__Group_6__02575);
            rule__Recipe__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_6__1_in_rule__Recipe__Group_6__02578);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1286:1: rule__Recipe__Group_6__0__Impl : ( 'ingredients' ) ;
    public final void rule__Recipe__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1290:1: ( ( 'ingredients' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1291:1: ( 'ingredients' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1291:1: ( 'ingredients' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1292:1: 'ingredients'
            {
             before(grammarAccess.getRecipeAccess().getIngredientsKeyword_6_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Recipe__Group_6__0__Impl2606); 
             after(grammarAccess.getRecipeAccess().getIngredientsKeyword_6_0()); 

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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1305:1: rule__Recipe__Group_6__1 : rule__Recipe__Group_6__1__Impl rule__Recipe__Group_6__2 ;
    public final void rule__Recipe__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1309:1: ( rule__Recipe__Group_6__1__Impl rule__Recipe__Group_6__2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1310:2: rule__Recipe__Group_6__1__Impl rule__Recipe__Group_6__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_6__1__Impl_in_rule__Recipe__Group_6__12637);
            rule__Recipe__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_6__2_in_rule__Recipe__Group_6__12640);
            rule__Recipe__Group_6__2();

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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1317:1: rule__Recipe__Group_6__1__Impl : ( ( rule__Recipe__IngredientsAssignment_6_1 ) ) ;
    public final void rule__Recipe__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1321:1: ( ( ( rule__Recipe__IngredientsAssignment_6_1 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1322:1: ( ( rule__Recipe__IngredientsAssignment_6_1 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1322:1: ( ( rule__Recipe__IngredientsAssignment_6_1 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1323:1: ( rule__Recipe__IngredientsAssignment_6_1 )
            {
             before(grammarAccess.getRecipeAccess().getIngredientsAssignment_6_1()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1324:1: ( rule__Recipe__IngredientsAssignment_6_1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1324:2: rule__Recipe__IngredientsAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__IngredientsAssignment_6_1_in_rule__Recipe__Group_6__1__Impl2667);
            rule__Recipe__IngredientsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getIngredientsAssignment_6_1()); 

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


    // $ANTLR start "rule__Recipe__Group_6__2"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1334:1: rule__Recipe__Group_6__2 : rule__Recipe__Group_6__2__Impl ;
    public final void rule__Recipe__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1338:1: ( rule__Recipe__Group_6__2__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1339:2: rule__Recipe__Group_6__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_6__2__Impl_in_rule__Recipe__Group_6__22697);
            rule__Recipe__Group_6__2__Impl();

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
    // $ANTLR end "rule__Recipe__Group_6__2"


    // $ANTLR start "rule__Recipe__Group_6__2__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1345:1: rule__Recipe__Group_6__2__Impl : ( ( rule__Recipe__Group_6_2__0 )* ) ;
    public final void rule__Recipe__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1349:1: ( ( ( rule__Recipe__Group_6_2__0 )* ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1350:1: ( ( rule__Recipe__Group_6_2__0 )* )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1350:1: ( ( rule__Recipe__Group_6_2__0 )* )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1351:1: ( rule__Recipe__Group_6_2__0 )*
            {
             before(grammarAccess.getRecipeAccess().getGroup_6_2()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1352:1: ( rule__Recipe__Group_6_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    int LA14_2 = input.LA(2);

                    if ( (LA14_2==32) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1352:2: rule__Recipe__Group_6_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_6_2__0_in_rule__Recipe__Group_6__2__Impl2724);
            	    rule__Recipe__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getRecipeAccess().getGroup_6_2()); 

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
    // $ANTLR end "rule__Recipe__Group_6__2__Impl"


    // $ANTLR start "rule__Recipe__Group_6_2__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1368:1: rule__Recipe__Group_6_2__0 : rule__Recipe__Group_6_2__0__Impl rule__Recipe__Group_6_2__1 ;
    public final void rule__Recipe__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1372:1: ( rule__Recipe__Group_6_2__0__Impl rule__Recipe__Group_6_2__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1373:2: rule__Recipe__Group_6_2__0__Impl rule__Recipe__Group_6_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_6_2__0__Impl_in_rule__Recipe__Group_6_2__02761);
            rule__Recipe__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_6_2__1_in_rule__Recipe__Group_6_2__02764);
            rule__Recipe__Group_6_2__1();

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
    // $ANTLR end "rule__Recipe__Group_6_2__0"


    // $ANTLR start "rule__Recipe__Group_6_2__0__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1380:1: rule__Recipe__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__Recipe__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1384:1: ( ( ',' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1385:1: ( ',' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1385:1: ( ',' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1386:1: ','
            {
             before(grammarAccess.getRecipeAccess().getCommaKeyword_6_2_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Recipe__Group_6_2__0__Impl2792); 
             after(grammarAccess.getRecipeAccess().getCommaKeyword_6_2_0()); 

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
    // $ANTLR end "rule__Recipe__Group_6_2__0__Impl"


    // $ANTLR start "rule__Recipe__Group_6_2__1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1399:1: rule__Recipe__Group_6_2__1 : rule__Recipe__Group_6_2__1__Impl ;
    public final void rule__Recipe__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1403:1: ( rule__Recipe__Group_6_2__1__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1404:2: rule__Recipe__Group_6_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_6_2__1__Impl_in_rule__Recipe__Group_6_2__12823);
            rule__Recipe__Group_6_2__1__Impl();

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
    // $ANTLR end "rule__Recipe__Group_6_2__1"


    // $ANTLR start "rule__Recipe__Group_6_2__1__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1410:1: rule__Recipe__Group_6_2__1__Impl : ( ( rule__Recipe__IngredientsAssignment_6_2_1 ) ) ;
    public final void rule__Recipe__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1414:1: ( ( ( rule__Recipe__IngredientsAssignment_6_2_1 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1415:1: ( ( rule__Recipe__IngredientsAssignment_6_2_1 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1415:1: ( ( rule__Recipe__IngredientsAssignment_6_2_1 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1416:1: ( rule__Recipe__IngredientsAssignment_6_2_1 )
            {
             before(grammarAccess.getRecipeAccess().getIngredientsAssignment_6_2_1()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1417:1: ( rule__Recipe__IngredientsAssignment_6_2_1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1417:2: rule__Recipe__IngredientsAssignment_6_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__IngredientsAssignment_6_2_1_in_rule__Recipe__Group_6_2__1__Impl2850);
            rule__Recipe__IngredientsAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getIngredientsAssignment_6_2_1()); 

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
    // $ANTLR end "rule__Recipe__Group_6_2__1__Impl"


    // $ANTLR start "rule__EBigDecimal__Group__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1431:1: rule__EBigDecimal__Group__0 : rule__EBigDecimal__Group__0__Impl rule__EBigDecimal__Group__1 ;
    public final void rule__EBigDecimal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1435:1: ( rule__EBigDecimal__Group__0__Impl rule__EBigDecimal__Group__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1436:2: rule__EBigDecimal__Group__0__Impl rule__EBigDecimal__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBigDecimal__Group__0__Impl_in_rule__EBigDecimal__Group__02884);
            rule__EBigDecimal__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EBigDecimal__Group__1_in_rule__EBigDecimal__Group__02887);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1443:1: rule__EBigDecimal__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EBigDecimal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1447:1: ( ( ( RULE_INT )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1448:1: ( ( RULE_INT )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1448:1: ( ( RULE_INT )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1449:1: ( RULE_INT )?
            {
             before(grammarAccess.getEBigDecimalAccess().getINTTerminalRuleCall_0()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1450:1: ( RULE_INT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1450:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EBigDecimal__Group__0__Impl2915); 

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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1460:1: rule__EBigDecimal__Group__1 : rule__EBigDecimal__Group__1__Impl rule__EBigDecimal__Group__2 ;
    public final void rule__EBigDecimal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1464:1: ( rule__EBigDecimal__Group__1__Impl rule__EBigDecimal__Group__2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1465:2: rule__EBigDecimal__Group__1__Impl rule__EBigDecimal__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBigDecimal__Group__1__Impl_in_rule__EBigDecimal__Group__12946);
            rule__EBigDecimal__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EBigDecimal__Group__2_in_rule__EBigDecimal__Group__12949);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1472:1: rule__EBigDecimal__Group__1__Impl : ( '.' ) ;
    public final void rule__EBigDecimal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1476:1: ( ( '.' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1477:1: ( '.' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1477:1: ( '.' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1478:1: '.'
            {
             before(grammarAccess.getEBigDecimalAccess().getFullStopKeyword_1()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__EBigDecimal__Group__1__Impl2977); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1491:1: rule__EBigDecimal__Group__2 : rule__EBigDecimal__Group__2__Impl ;
    public final void rule__EBigDecimal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1495:1: ( rule__EBigDecimal__Group__2__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1496:2: rule__EBigDecimal__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBigDecimal__Group__2__Impl_in_rule__EBigDecimal__Group__23008);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1502:1: rule__EBigDecimal__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__EBigDecimal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1506:1: ( ( RULE_INT ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1507:1: ( RULE_INT )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1507:1: ( RULE_INT )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1508:1: RULE_INT
            {
             before(grammarAccess.getEBigDecimalAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EBigDecimal__Group__2__Impl3035); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1525:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1529:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1530:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__03070);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__03073);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1537:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1541:1: ( ( ( '-' )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1542:1: ( ( '-' )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1542:1: ( ( '-' )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1543:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1544:1: ( '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1545:2: '-'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__EInt__Group__0__Impl3102); 

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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1556:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1560:1: ( rule__EInt__Group__1__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1561:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__13135);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1567:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1571:1: ( ( RULE_INT ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1572:1: ( RULE_INT )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1572:1: ( RULE_INT )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1573:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl3162); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1588:1: rule__Ingredient__Group__0 : rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1 ;
    public final void rule__Ingredient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1592:1: ( rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1593:2: rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__0__Impl_in_rule__Ingredient__Group__03195);
            rule__Ingredient__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__1_in_rule__Ingredient__Group__03198);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1600:1: rule__Ingredient__Group__0__Impl : ( () ) ;
    public final void rule__Ingredient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1604:1: ( ( () ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1605:1: ( () )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1605:1: ( () )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1606:1: ()
            {
             before(grammarAccess.getIngredientAccess().getIngredientAction_0()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1607:1: ()
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1609:1: 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1619:1: rule__Ingredient__Group__1 : rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2 ;
    public final void rule__Ingredient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1623:1: ( rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1624:2: rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__1__Impl_in_rule__Ingredient__Group__13256);
            rule__Ingredient__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__2_in_rule__Ingredient__Group__13259);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1631:1: rule__Ingredient__Group__1__Impl : ( 'Ingredient' ) ;
    public final void rule__Ingredient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1635:1: ( ( 'Ingredient' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1636:1: ( 'Ingredient' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1636:1: ( 'Ingredient' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1637:1: 'Ingredient'
            {
             before(grammarAccess.getIngredientAccess().getIngredientKeyword_1()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Ingredient__Group__1__Impl3287); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1650:1: rule__Ingredient__Group__2 : rule__Ingredient__Group__2__Impl rule__Ingredient__Group__3 ;
    public final void rule__Ingredient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1654:1: ( rule__Ingredient__Group__2__Impl rule__Ingredient__Group__3 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1655:2: rule__Ingredient__Group__2__Impl rule__Ingredient__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__2__Impl_in_rule__Ingredient__Group__23318);
            rule__Ingredient__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__3_in_rule__Ingredient__Group__23321);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1662:1: rule__Ingredient__Group__2__Impl : ( ( rule__Ingredient__NameAssignment_2 ) ) ;
    public final void rule__Ingredient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1666:1: ( ( ( rule__Ingredient__NameAssignment_2 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1667:1: ( ( rule__Ingredient__NameAssignment_2 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1667:1: ( ( rule__Ingredient__NameAssignment_2 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1668:1: ( rule__Ingredient__NameAssignment_2 )
            {
             before(grammarAccess.getIngredientAccess().getNameAssignment_2()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1669:1: ( rule__Ingredient__NameAssignment_2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1669:2: rule__Ingredient__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__NameAssignment_2_in_rule__Ingredient__Group__2__Impl3348);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1679:1: rule__Ingredient__Group__3 : rule__Ingredient__Group__3__Impl ;
    public final void rule__Ingredient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1683:1: ( rule__Ingredient__Group__3__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1684:2: rule__Ingredient__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__3__Impl_in_rule__Ingredient__Group__33378);
            rule__Ingredient__Group__3__Impl();

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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1690:1: rule__Ingredient__Group__3__Impl : ( ( rule__Ingredient__SpicinessAssignment_3 )? ) ;
    public final void rule__Ingredient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1694:1: ( ( ( rule__Ingredient__SpicinessAssignment_3 )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1695:1: ( ( rule__Ingredient__SpicinessAssignment_3 )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1695:1: ( ( rule__Ingredient__SpicinessAssignment_3 )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1696:1: ( rule__Ingredient__SpicinessAssignment_3 )?
            {
             before(grammarAccess.getIngredientAccess().getSpicinessAssignment_3()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1697:1: ( rule__Ingredient__SpicinessAssignment_3 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=20 && LA17_0<=23)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1697:2: rule__Ingredient__SpicinessAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Ingredient__SpicinessAssignment_3_in_rule__Ingredient__Group__3__Impl3405);
                    rule__Ingredient__SpicinessAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIngredientAccess().getSpicinessAssignment_3()); 

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


    // $ANTLR start "rule__Menu__NameAssignment_2"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1716:1: rule__Menu__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Menu__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1720:1: ( ( ruleEString ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1721:1: ( ruleEString )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1721:1: ( ruleEString )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1722:1: ruleEString
            {
             before(grammarAccess.getMenuAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Menu__NameAssignment_23449);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMenuAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Menu__NameAssignment_2"


    // $ANTLR start "rule__Menu__GroupsAssignment_3_0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1731:1: rule__Menu__GroupsAssignment_3_0 : ( ruleGroup ) ;
    public final void rule__Menu__GroupsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1735:1: ( ( ruleGroup ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1736:1: ( ruleGroup )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1736:1: ( ruleGroup )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1737:1: ruleGroup
            {
             before(grammarAccess.getMenuAccess().getGroupsGroupParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_rule__Menu__GroupsAssignment_3_03480);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getMenuAccess().getGroupsGroupParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__Menu__GroupsAssignment_3_0"


    // $ANTLR start "rule__Menu__GroupsAssignment_3_1_1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1746:1: rule__Menu__GroupsAssignment_3_1_1 : ( ruleGroup ) ;
    public final void rule__Menu__GroupsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1750:1: ( ( ruleGroup ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1751:1: ( ruleGroup )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1751:1: ( ruleGroup )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1752:1: ruleGroup
            {
             before(grammarAccess.getMenuAccess().getGroupsGroupParserRuleCall_3_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_rule__Menu__GroupsAssignment_3_1_13511);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getMenuAccess().getGroupsGroupParserRuleCall_3_1_1_0()); 

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
    // $ANTLR end "rule__Menu__GroupsAssignment_3_1_1"


    // $ANTLR start "rule__Group__NameAssignment_2"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1761:1: rule__Group__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Group__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1765:1: ( ( ruleEString ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1766:1: ( ruleEString )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1766:1: ( ruleEString )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1767:1: ruleEString
            {
             before(grammarAccess.getGroupAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Group__NameAssignment_23542);
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


    // $ANTLR start "rule__Group__CategoryAssignment_3"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1776:1: rule__Group__CategoryAssignment_3 : ( ruleCategory ) ;
    public final void rule__Group__CategoryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1780:1: ( ( ruleCategory ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1781:1: ( ruleCategory )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1781:1: ( ruleCategory )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1782:1: ruleCategory
            {
             before(grammarAccess.getGroupAccess().getCategoryCategoryEnumRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCategory_in_rule__Group__CategoryAssignment_33573);
            ruleCategory();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getCategoryCategoryEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__Group__CategoryAssignment_3"


    // $ANTLR start "rule__Group__RecipesAssignment_4_0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1791:1: rule__Group__RecipesAssignment_4_0 : ( ruleRecipe ) ;
    public final void rule__Group__RecipesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1795:1: ( ( ruleRecipe ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1796:1: ( ruleRecipe )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1796:1: ( ruleRecipe )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1797:1: ruleRecipe
            {
             before(grammarAccess.getGroupAccess().getRecipesRecipeParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRecipe_in_rule__Group__RecipesAssignment_4_03604);
            ruleRecipe();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getRecipesRecipeParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__Group__RecipesAssignment_4_0"


    // $ANTLR start "rule__Group__RecipesAssignment_4_1_1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1806:1: rule__Group__RecipesAssignment_4_1_1 : ( ruleRecipe ) ;
    public final void rule__Group__RecipesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1810:1: ( ( ruleRecipe ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1811:1: ( ruleRecipe )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1811:1: ( ruleRecipe )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1812:1: ruleRecipe
            {
             before(grammarAccess.getGroupAccess().getRecipesRecipeParserRuleCall_4_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRecipe_in_rule__Group__RecipesAssignment_4_1_13635);
            ruleRecipe();

            state._fsp--;

             after(grammarAccess.getGroupAccess().getRecipesRecipeParserRuleCall_4_1_1_0()); 

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
    // $ANTLR end "rule__Group__RecipesAssignment_4_1_1"


    // $ANTLR start "rule__Recipe__NameAssignment_2"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1821:1: rule__Recipe__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Recipe__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1825:1: ( ( ruleEString ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1826:1: ( ruleEString )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1826:1: ( ruleEString )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1827:1: ruleEString
            {
             before(grammarAccess.getRecipeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Recipe__NameAssignment_23666);
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


    // $ANTLR start "rule__Recipe__PriceAssignment_3_1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1836:1: rule__Recipe__PriceAssignment_3_1 : ( ruleEBigDecimal ) ;
    public final void rule__Recipe__PriceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1840:1: ( ( ruleEBigDecimal ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1841:1: ( ruleEBigDecimal )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1841:1: ( ruleEBigDecimal )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1842:1: ruleEBigDecimal
            {
             before(grammarAccess.getRecipeAccess().getPriceEBigDecimalParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBigDecimal_in_rule__Recipe__PriceAssignment_3_13697);
            ruleEBigDecimal();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getPriceEBigDecimalParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Recipe__PriceAssignment_3_1"


    // $ANTLR start "rule__Recipe__AmountAssignment_4"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1851:1: rule__Recipe__AmountAssignment_4 : ( ruleEInt ) ;
    public final void rule__Recipe__AmountAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1855:1: ( ( ruleEInt ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1856:1: ( ruleEInt )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1856:1: ( ruleEInt )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1857:1: ruleEInt
            {
             before(grammarAccess.getRecipeAccess().getAmountEIntParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Recipe__AmountAssignment_43728);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getAmountEIntParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Recipe__AmountAssignment_4"


    // $ANTLR start "rule__Recipe__AmountTypeAssignment_5"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1866:1: rule__Recipe__AmountTypeAssignment_5 : ( ruleAmountType ) ;
    public final void rule__Recipe__AmountTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1870:1: ( ( ruleAmountType ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1871:1: ( ruleAmountType )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1871:1: ( ruleAmountType )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1872:1: ruleAmountType
            {
             before(grammarAccess.getRecipeAccess().getAmountTypeAmountTypeEnumRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAmountType_in_rule__Recipe__AmountTypeAssignment_53759);
            ruleAmountType();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getAmountTypeAmountTypeEnumRuleCall_5_0()); 

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
    // $ANTLR end "rule__Recipe__AmountTypeAssignment_5"


    // $ANTLR start "rule__Recipe__IngredientsAssignment_6_1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1881:1: rule__Recipe__IngredientsAssignment_6_1 : ( ruleIngredient ) ;
    public final void rule__Recipe__IngredientsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1885:1: ( ( ruleIngredient ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1886:1: ( ruleIngredient )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1886:1: ( ruleIngredient )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1887:1: ruleIngredient
            {
             before(grammarAccess.getRecipeAccess().getIngredientsIngredientParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIngredient_in_rule__Recipe__IngredientsAssignment_6_13790);
            ruleIngredient();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getIngredientsIngredientParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Recipe__IngredientsAssignment_6_1"


    // $ANTLR start "rule__Recipe__IngredientsAssignment_6_2_1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1896:1: rule__Recipe__IngredientsAssignment_6_2_1 : ( ruleIngredient ) ;
    public final void rule__Recipe__IngredientsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1900:1: ( ( ruleIngredient ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1901:1: ( ruleIngredient )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1901:1: ( ruleIngredient )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1902:1: ruleIngredient
            {
             before(grammarAccess.getRecipeAccess().getIngredientsIngredientParserRuleCall_6_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIngredient_in_rule__Recipe__IngredientsAssignment_6_2_13821);
            ruleIngredient();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getIngredientsIngredientParserRuleCall_6_2_1_0()); 

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
    // $ANTLR end "rule__Recipe__IngredientsAssignment_6_2_1"


    // $ANTLR start "rule__Ingredient__NameAssignment_2"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1911:1: rule__Ingredient__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Ingredient__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1915:1: ( ( ruleEString ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1916:1: ( ruleEString )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1916:1: ( ruleEString )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1917:1: ruleEString
            {
             before(grammarAccess.getIngredientAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ingredient__NameAssignment_23852);
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


    // $ANTLR start "rule__Ingredient__SpicinessAssignment_3"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1926:1: rule__Ingredient__SpicinessAssignment_3 : ( ruleSpiciness ) ;
    public final void rule__Ingredient__SpicinessAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1930:1: ( ( ruleSpiciness ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1931:1: ( ruleSpiciness )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1931:1: ( ruleSpiciness )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1932:1: ruleSpiciness
            {
             before(grammarAccess.getIngredientAccess().getSpicinessSpicinessEnumRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSpiciness_in_rule__Ingredient__SpicinessAssignment_33883);
            ruleSpiciness();

            state._fsp--;

             after(grammarAccess.getIngredientAccess().getSpicinessSpicinessEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__Ingredient__SpicinessAssignment_3"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleMenu_in_entryRuleMenu61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMenu68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Menu__Group__0_in_ruleMenu94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroup188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__0_in_ruleGroup214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecipe_in_entryRuleRecipe241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRecipe248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group__0_in_ruleRecipe274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBigDecimal_in_entryRuleEBigDecimal301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBigDecimal308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBigDecimal__Group__0_in_ruleEBigDecimal334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIngredient_in_entryRuleIngredient421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIngredient428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__0_in_ruleIngredient454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Category__Alternatives_in_ruleCategory491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AmountType__Alternatives_in_ruleAmountType527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Spiciness__Alternatives_in_ruleSpiciness563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Category__Alternatives648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Category__Alternatives669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Category__Alternatives690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Category__Alternatives711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Category__Alternatives732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__AmountType__Alternatives768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__AmountType__Alternatives789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__AmountType__Alternatives810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__AmountType__Alternatives831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Spiciness__Alternatives867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Spiciness__Alternatives888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Spiciness__Alternatives909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Spiciness__Alternatives930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Menu__Group__0__Impl_in_rule__Menu__Group__0963 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Menu__Group__1_in_rule__Menu__Group__0966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Menu__Group__1__Impl_in_rule__Menu__Group__11024 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Menu__Group__2_in_rule__Menu__Group__11027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Menu__Group__1__Impl1055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Menu__Group__2__Impl_in_rule__Menu__Group__21086 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Menu__Group__3_in_rule__Menu__Group__21089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Menu__NameAssignment_2_in_rule__Menu__Group__2__Impl1116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Menu__Group__3__Impl_in_rule__Menu__Group__31146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Menu__Group_3__0_in_rule__Menu__Group__3__Impl1173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Menu__Group_3__0__Impl_in_rule__Menu__Group_3__01212 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Menu__Group_3__1_in_rule__Menu__Group_3__01215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Menu__GroupsAssignment_3_0_in_rule__Menu__Group_3__0__Impl1242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Menu__Group_3__1__Impl_in_rule__Menu__Group_3__11272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Menu__Group_3_1__0_in_rule__Menu__Group_3__1__Impl1299 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__Menu__Group_3_1__0__Impl_in_rule__Menu__Group_3_1__01334 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Menu__Group_3_1__1_in_rule__Menu__Group_3_1__01337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Menu__Group_3_1__0__Impl1365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Menu__Group_3_1__1__Impl_in_rule__Menu__Group_3_1__11396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Menu__GroupsAssignment_3_1_1_in_rule__Menu__Group_3_1__1__Impl1423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__01457 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Group__Group__1_in_rule__Group__Group__01460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__11518 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Group__Group__2_in_rule__Group__Group__11521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Group__Group__1__Impl1549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__21580 = new BitSet(new long[]{0x000000000800F800L});
        public static final BitSet FOLLOW_rule__Group__Group__3_in_rule__Group__Group__21583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__NameAssignment_2_in_rule__Group__Group__2__Impl1610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__31640 = new BitSet(new long[]{0x000000000800F800L});
        public static final BitSet FOLLOW_rule__Group__Group__4_in_rule__Group__Group__31643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__CategoryAssignment_3_in_rule__Group__Group__3__Impl1670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__41701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_4__0_in_rule__Group__Group__4__Impl1728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_4__0__Impl_in_rule__Group__Group_4__01769 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Group__Group_4__1_in_rule__Group__Group_4__01772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__RecipesAssignment_4_0_in_rule__Group__Group_4__0__Impl1799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_4__1__Impl_in_rule__Group__Group_4__11829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_4_1__0_in_rule__Group__Group_4__1__Impl1856 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__Group__Group_4_1__0__Impl_in_rule__Group__Group_4_1__01891 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Group__Group_4_1__1_in_rule__Group__Group_4_1__01894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Group__Group_4_1__0__Impl1922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_4_1__1__Impl_in_rule__Group__Group_4_1__11953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__RecipesAssignment_4_1_1_in_rule__Group__Group_4_1__1__Impl1980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group__0__Impl_in_rule__Recipe__Group__02014 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Recipe__Group__1_in_rule__Recipe__Group__02017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group__1__Impl_in_rule__Recipe__Group__12075 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Recipe__Group__2_in_rule__Recipe__Group__12078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Recipe__Group__1__Impl2106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group__2__Impl_in_rule__Recipe__Group__22137 = new BitSet(new long[]{0x00000000B00F0040L});
        public static final BitSet FOLLOW_rule__Recipe__Group__3_in_rule__Recipe__Group__22140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__NameAssignment_2_in_rule__Recipe__Group__2__Impl2167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group__3__Impl_in_rule__Recipe__Group__32197 = new BitSet(new long[]{0x00000000B00F0040L});
        public static final BitSet FOLLOW_rule__Recipe__Group__4_in_rule__Recipe__Group__32200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_3__0_in_rule__Recipe__Group__3__Impl2227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group__4__Impl_in_rule__Recipe__Group__42258 = new BitSet(new long[]{0x00000000B00F0040L});
        public static final BitSet FOLLOW_rule__Recipe__Group__5_in_rule__Recipe__Group__42261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__AmountAssignment_4_in_rule__Recipe__Group__4__Impl2288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group__5__Impl_in_rule__Recipe__Group__52319 = new BitSet(new long[]{0x00000000B00F0040L});
        public static final BitSet FOLLOW_rule__Recipe__Group__6_in_rule__Recipe__Group__52322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__AmountTypeAssignment_5_in_rule__Recipe__Group__5__Impl2349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group__6__Impl_in_rule__Recipe__Group__62380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_6__0_in_rule__Recipe__Group__6__Impl2407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_3__0__Impl_in_rule__Recipe__Group_3__02452 = new BitSet(new long[]{0x0000000040000040L});
        public static final BitSet FOLLOW_rule__Recipe__Group_3__1_in_rule__Recipe__Group_3__02455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Recipe__Group_3__0__Impl2483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_3__1__Impl_in_rule__Recipe__Group_3__12514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__PriceAssignment_3_1_in_rule__Recipe__Group_3__1__Impl2541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_6__0__Impl_in_rule__Recipe__Group_6__02575 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Recipe__Group_6__1_in_rule__Recipe__Group_6__02578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Recipe__Group_6__0__Impl2606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_6__1__Impl_in_rule__Recipe__Group_6__12637 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Recipe__Group_6__2_in_rule__Recipe__Group_6__12640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__IngredientsAssignment_6_1_in_rule__Recipe__Group_6__1__Impl2667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_6__2__Impl_in_rule__Recipe__Group_6__22697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_6_2__0_in_rule__Recipe__Group_6__2__Impl2724 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_6_2__0__Impl_in_rule__Recipe__Group_6_2__02761 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Recipe__Group_6_2__1_in_rule__Recipe__Group_6_2__02764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Recipe__Group_6_2__0__Impl2792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_6_2__1__Impl_in_rule__Recipe__Group_6_2__12823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__IngredientsAssignment_6_2_1_in_rule__Recipe__Group_6_2__1__Impl2850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBigDecimal__Group__0__Impl_in_rule__EBigDecimal__Group__02884 = new BitSet(new long[]{0x0000000040000040L});
        public static final BitSet FOLLOW_rule__EBigDecimal__Group__1_in_rule__EBigDecimal__Group__02887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EBigDecimal__Group__0__Impl2915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBigDecimal__Group__1__Impl_in_rule__EBigDecimal__Group__12946 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EBigDecimal__Group__2_in_rule__EBigDecimal__Group__12949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__EBigDecimal__Group__1__Impl2977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBigDecimal__Group__2__Impl_in_rule__EBigDecimal__Group__23008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EBigDecimal__Group__2__Impl3035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__03070 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__03073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__EInt__Group__0__Impl3102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__13135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl3162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__0__Impl_in_rule__Ingredient__Group__03195 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__1_in_rule__Ingredient__Group__03198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__1__Impl_in_rule__Ingredient__Group__13256 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__2_in_rule__Ingredient__Group__13259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Ingredient__Group__1__Impl3287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__2__Impl_in_rule__Ingredient__Group__23318 = new BitSet(new long[]{0x0000000000F00000L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__3_in_rule__Ingredient__Group__23321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__NameAssignment_2_in_rule__Ingredient__Group__2__Impl3348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__3__Impl_in_rule__Ingredient__Group__33378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__SpicinessAssignment_3_in_rule__Ingredient__Group__3__Impl3405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Menu__NameAssignment_23449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_rule__Menu__GroupsAssignment_3_03480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_rule__Menu__GroupsAssignment_3_1_13511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Group__NameAssignment_23542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCategory_in_rule__Group__CategoryAssignment_33573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecipe_in_rule__Group__RecipesAssignment_4_03604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecipe_in_rule__Group__RecipesAssignment_4_1_13635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Recipe__NameAssignment_23666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBigDecimal_in_rule__Recipe__PriceAssignment_3_13697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Recipe__AmountAssignment_43728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAmountType_in_rule__Recipe__AmountTypeAssignment_53759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIngredient_in_rule__Recipe__IngredientsAssignment_6_13790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIngredient_in_rule__Recipe__IngredientsAssignment_6_2_13821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ingredient__NameAssignment_23852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSpiciness_in_rule__Ingredient__SpicinessAssignment_33883 = new BitSet(new long[]{0x0000000000000002L});
    }


}