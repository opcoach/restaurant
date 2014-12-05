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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'breakfast'", "'dinner'", "'lunch'", "'supper'", "'dessert'", "'gram'", "'milliliters'", "'bottles'", "'items'", "'VeryHot'", "'Hot'", "'Normal'", "'Mild'", "'Menu'", "'Group'", "','", "'Recipe'", "'Price'", "'.'", "'-'", "'Ingredient'"
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

            if ( (LA5_0==25) ) {
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:625:1: rule__Menu__Group_3__1__Impl : ( ( rule__Menu__GroupsAssignment_3_1 )* ) ;
    public final void rule__Menu__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:629:1: ( ( ( rule__Menu__GroupsAssignment_3_1 )* ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:630:1: ( ( rule__Menu__GroupsAssignment_3_1 )* )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:630:1: ( ( rule__Menu__GroupsAssignment_3_1 )* )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:631:1: ( rule__Menu__GroupsAssignment_3_1 )*
            {
             before(grammarAccess.getMenuAccess().getGroupsAssignment_3_1()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:632:1: ( rule__Menu__GroupsAssignment_3_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:632:2: rule__Menu__GroupsAssignment_3_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Menu__GroupsAssignment_3_1_in_rule__Menu__Group_3__1__Impl1299);
            	    rule__Menu__GroupsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getMenuAccess().getGroupsAssignment_3_1()); 

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


    // $ANTLR start "rule__Group__Group__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:646:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:650:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:651:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__01334);
            rule__Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__1_in_rule__Group__Group__01337);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:658:1: rule__Group__Group__0__Impl : ( () ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:662:1: ( ( () ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:663:1: ( () )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:663:1: ( () )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:664:1: ()
            {
             before(grammarAccess.getGroupAccess().getGroupAction_0()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:665:1: ()
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:667:1: 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:677:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:681:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:682:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__11395);
            rule__Group__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__2_in_rule__Group__Group__11398);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:689:1: rule__Group__Group__1__Impl : ( 'Group' ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:693:1: ( ( 'Group' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:694:1: ( 'Group' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:694:1: ( 'Group' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:695:1: 'Group'
            {
             before(grammarAccess.getGroupAccess().getGroupKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Group__Group__1__Impl1426); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:708:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:712:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:713:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__21457);
            rule__Group__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__3_in_rule__Group__Group__21460);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:720:1: rule__Group__Group__2__Impl : ( ( rule__Group__NameAssignment_2 ) ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:724:1: ( ( ( rule__Group__NameAssignment_2 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:725:1: ( ( rule__Group__NameAssignment_2 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:725:1: ( ( rule__Group__NameAssignment_2 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:726:1: ( rule__Group__NameAssignment_2 )
            {
             before(grammarAccess.getGroupAccess().getNameAssignment_2()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:727:1: ( rule__Group__NameAssignment_2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:727:2: rule__Group__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__NameAssignment_2_in_rule__Group__Group__2__Impl1487);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:737:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:741:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:742:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__31517);
            rule__Group__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__4_in_rule__Group__Group__31520);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:749:1: rule__Group__Group__3__Impl : ( ( rule__Group__CategoryAssignment_3 )? ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:753:1: ( ( ( rule__Group__CategoryAssignment_3 )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:754:1: ( ( rule__Group__CategoryAssignment_3 )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:754:1: ( ( rule__Group__CategoryAssignment_3 )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:755:1: ( rule__Group__CategoryAssignment_3 )?
            {
             before(grammarAccess.getGroupAccess().getCategoryAssignment_3()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:756:1: ( rule__Group__CategoryAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=11 && LA7_0<=15)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:756:2: rule__Group__CategoryAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Group__CategoryAssignment_3_in_rule__Group__Group__3__Impl1547);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:766:1: rule__Group__Group__4 : rule__Group__Group__4__Impl ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:770:1: ( rule__Group__Group__4__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:771:2: rule__Group__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__41578);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:777:1: rule__Group__Group__4__Impl : ( ( rule__Group__Group_4__0 )? ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:781:1: ( ( ( rule__Group__Group_4__0 )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:782:1: ( ( rule__Group__Group_4__0 )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:782:1: ( ( rule__Group__Group_4__0 )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:783:1: ( rule__Group__Group_4__0 )?
            {
             before(grammarAccess.getGroupAccess().getGroup_4()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:784:1: ( rule__Group__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:784:2: rule__Group__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4__0_in_rule__Group__Group__4__Impl1605);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:804:1: rule__Group__Group_4__0 : rule__Group__Group_4__0__Impl rule__Group__Group_4__1 ;
    public final void rule__Group__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:808:1: ( rule__Group__Group_4__0__Impl rule__Group__Group_4__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:809:2: rule__Group__Group_4__0__Impl rule__Group__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4__0__Impl_in_rule__Group__Group_4__01646);
            rule__Group__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4__1_in_rule__Group__Group_4__01649);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:816:1: rule__Group__Group_4__0__Impl : ( ( rule__Group__RecipesAssignment_4_0 ) ) ;
    public final void rule__Group__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:820:1: ( ( ( rule__Group__RecipesAssignment_4_0 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:821:1: ( ( rule__Group__RecipesAssignment_4_0 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:821:1: ( ( rule__Group__RecipesAssignment_4_0 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:822:1: ( rule__Group__RecipesAssignment_4_0 )
            {
             before(grammarAccess.getGroupAccess().getRecipesAssignment_4_0()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:823:1: ( rule__Group__RecipesAssignment_4_0 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:823:2: rule__Group__RecipesAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__RecipesAssignment_4_0_in_rule__Group__Group_4__0__Impl1676);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:833:1: rule__Group__Group_4__1 : rule__Group__Group_4__1__Impl ;
    public final void rule__Group__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:837:1: ( rule__Group__Group_4__1__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:838:2: rule__Group__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4__1__Impl_in_rule__Group__Group_4__11706);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:844:1: rule__Group__Group_4__1__Impl : ( ( rule__Group__Group_4_1__0 )* ) ;
    public final void rule__Group__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:848:1: ( ( ( rule__Group__Group_4_1__0 )* ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:849:1: ( ( rule__Group__Group_4_1__0 )* )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:849:1: ( ( rule__Group__Group_4_1__0 )* )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:850:1: ( rule__Group__Group_4_1__0 )*
            {
             before(grammarAccess.getGroupAccess().getGroup_4_1()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:851:1: ( rule__Group__Group_4_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:851:2: rule__Group__Group_4_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4_1__0_in_rule__Group__Group_4__1__Impl1733);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:865:1: rule__Group__Group_4_1__0 : rule__Group__Group_4_1__0__Impl rule__Group__Group_4_1__1 ;
    public final void rule__Group__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:869:1: ( rule__Group__Group_4_1__0__Impl rule__Group__Group_4_1__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:870:2: rule__Group__Group_4_1__0__Impl rule__Group__Group_4_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4_1__0__Impl_in_rule__Group__Group_4_1__01768);
            rule__Group__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4_1__1_in_rule__Group__Group_4_1__01771);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:877:1: rule__Group__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Group__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:881:1: ( ( ',' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:882:1: ( ',' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:882:1: ( ',' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:883:1: ','
            {
             before(grammarAccess.getGroupAccess().getCommaKeyword_4_1_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Group__Group_4_1__0__Impl1799); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:896:1: rule__Group__Group_4_1__1 : rule__Group__Group_4_1__1__Impl ;
    public final void rule__Group__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:900:1: ( rule__Group__Group_4_1__1__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:901:2: rule__Group__Group_4_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4_1__1__Impl_in_rule__Group__Group_4_1__11830);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:907:1: rule__Group__Group_4_1__1__Impl : ( ( rule__Group__RecipesAssignment_4_1_1 ) ) ;
    public final void rule__Group__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:911:1: ( ( ( rule__Group__RecipesAssignment_4_1_1 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:912:1: ( ( rule__Group__RecipesAssignment_4_1_1 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:912:1: ( ( rule__Group__RecipesAssignment_4_1_1 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:913:1: ( rule__Group__RecipesAssignment_4_1_1 )
            {
             before(grammarAccess.getGroupAccess().getRecipesAssignment_4_1_1()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:914:1: ( rule__Group__RecipesAssignment_4_1_1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:914:2: rule__Group__RecipesAssignment_4_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__RecipesAssignment_4_1_1_in_rule__Group__Group_4_1__1__Impl1857);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:928:1: rule__Recipe__Group__0 : rule__Recipe__Group__0__Impl rule__Recipe__Group__1 ;
    public final void rule__Recipe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:932:1: ( rule__Recipe__Group__0__Impl rule__Recipe__Group__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:933:2: rule__Recipe__Group__0__Impl rule__Recipe__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__0__Impl_in_rule__Recipe__Group__01891);
            rule__Recipe__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__1_in_rule__Recipe__Group__01894);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:940:1: rule__Recipe__Group__0__Impl : ( () ) ;
    public final void rule__Recipe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:944:1: ( ( () ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:945:1: ( () )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:945:1: ( () )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:946:1: ()
            {
             before(grammarAccess.getRecipeAccess().getRecipeAction_0()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:947:1: ()
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:949:1: 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:959:1: rule__Recipe__Group__1 : rule__Recipe__Group__1__Impl rule__Recipe__Group__2 ;
    public final void rule__Recipe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:963:1: ( rule__Recipe__Group__1__Impl rule__Recipe__Group__2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:964:2: rule__Recipe__Group__1__Impl rule__Recipe__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__1__Impl_in_rule__Recipe__Group__11952);
            rule__Recipe__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__2_in_rule__Recipe__Group__11955);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:971:1: rule__Recipe__Group__1__Impl : ( 'Recipe' ) ;
    public final void rule__Recipe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:975:1: ( ( 'Recipe' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:976:1: ( 'Recipe' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:976:1: ( 'Recipe' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:977:1: 'Recipe'
            {
             before(grammarAccess.getRecipeAccess().getRecipeKeyword_1()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Recipe__Group__1__Impl1983); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:990:1: rule__Recipe__Group__2 : rule__Recipe__Group__2__Impl rule__Recipe__Group__3 ;
    public final void rule__Recipe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:994:1: ( rule__Recipe__Group__2__Impl rule__Recipe__Group__3 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:995:2: rule__Recipe__Group__2__Impl rule__Recipe__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__2__Impl_in_rule__Recipe__Group__22014);
            rule__Recipe__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__3_in_rule__Recipe__Group__22017);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1002:1: rule__Recipe__Group__2__Impl : ( ( rule__Recipe__NameAssignment_2 ) ) ;
    public final void rule__Recipe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1006:1: ( ( ( rule__Recipe__NameAssignment_2 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1007:1: ( ( rule__Recipe__NameAssignment_2 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1007:1: ( ( rule__Recipe__NameAssignment_2 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1008:1: ( rule__Recipe__NameAssignment_2 )
            {
             before(grammarAccess.getRecipeAccess().getNameAssignment_2()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1009:1: ( rule__Recipe__NameAssignment_2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1009:2: rule__Recipe__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__NameAssignment_2_in_rule__Recipe__Group__2__Impl2044);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1019:1: rule__Recipe__Group__3 : rule__Recipe__Group__3__Impl rule__Recipe__Group__4 ;
    public final void rule__Recipe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1023:1: ( rule__Recipe__Group__3__Impl rule__Recipe__Group__4 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1024:2: rule__Recipe__Group__3__Impl rule__Recipe__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__3__Impl_in_rule__Recipe__Group__32074);
            rule__Recipe__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__4_in_rule__Recipe__Group__32077);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1031:1: rule__Recipe__Group__3__Impl : ( ( rule__Recipe__Group_3__0 )? ) ;
    public final void rule__Recipe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1035:1: ( ( ( rule__Recipe__Group_3__0 )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1036:1: ( ( rule__Recipe__Group_3__0 )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1036:1: ( ( rule__Recipe__Group_3__0 )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1037:1: ( rule__Recipe__Group_3__0 )?
            {
             before(grammarAccess.getRecipeAccess().getGroup_3()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1038:1: ( rule__Recipe__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1038:2: rule__Recipe__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_3__0_in_rule__Recipe__Group__3__Impl2104);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1048:1: rule__Recipe__Group__4 : rule__Recipe__Group__4__Impl rule__Recipe__Group__5 ;
    public final void rule__Recipe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1052:1: ( rule__Recipe__Group__4__Impl rule__Recipe__Group__5 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1053:2: rule__Recipe__Group__4__Impl rule__Recipe__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__4__Impl_in_rule__Recipe__Group__42135);
            rule__Recipe__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__5_in_rule__Recipe__Group__42138);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1060:1: rule__Recipe__Group__4__Impl : ( ( rule__Recipe__Group_4__0 )? ) ;
    public final void rule__Recipe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1064:1: ( ( ( rule__Recipe__Group_4__0 )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1065:1: ( ( rule__Recipe__Group_4__0 )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1065:1: ( ( rule__Recipe__Group_4__0 )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1066:1: ( rule__Recipe__Group_4__0 )?
            {
             before(grammarAccess.getRecipeAccess().getGroup_4()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1067:1: ( rule__Recipe__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT||LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1067:2: rule__Recipe__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_4__0_in_rule__Recipe__Group__4__Impl2165);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1077:1: rule__Recipe__Group__5 : rule__Recipe__Group__5__Impl ;
    public final void rule__Recipe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1081:1: ( rule__Recipe__Group__5__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1082:2: rule__Recipe__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__5__Impl_in_rule__Recipe__Group__52196);
            rule__Recipe__Group__5__Impl();

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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1088:1: rule__Recipe__Group__5__Impl : ( ( rule__Recipe__Group_5__0 )? ) ;
    public final void rule__Recipe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1092:1: ( ( ( rule__Recipe__Group_5__0 )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1093:1: ( ( rule__Recipe__Group_5__0 )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1093:1: ( ( rule__Recipe__Group_5__0 )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1094:1: ( rule__Recipe__Group_5__0 )?
            {
             before(grammarAccess.getRecipeAccess().getGroup_5()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1095:1: ( rule__Recipe__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1095:2: rule__Recipe__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_5__0_in_rule__Recipe__Group__5__Impl2223);
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


    // $ANTLR start "rule__Recipe__Group_3__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1117:1: rule__Recipe__Group_3__0 : rule__Recipe__Group_3__0__Impl rule__Recipe__Group_3__1 ;
    public final void rule__Recipe__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1121:1: ( rule__Recipe__Group_3__0__Impl rule__Recipe__Group_3__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1122:2: rule__Recipe__Group_3__0__Impl rule__Recipe__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_3__0__Impl_in_rule__Recipe__Group_3__02266);
            rule__Recipe__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_3__1_in_rule__Recipe__Group_3__02269);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1129:1: rule__Recipe__Group_3__0__Impl : ( 'Price' ) ;
    public final void rule__Recipe__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1133:1: ( ( 'Price' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1134:1: ( 'Price' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1134:1: ( 'Price' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1135:1: 'Price'
            {
             before(grammarAccess.getRecipeAccess().getPriceKeyword_3_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Recipe__Group_3__0__Impl2297); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1148:1: rule__Recipe__Group_3__1 : rule__Recipe__Group_3__1__Impl ;
    public final void rule__Recipe__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1152:1: ( rule__Recipe__Group_3__1__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1153:2: rule__Recipe__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_3__1__Impl_in_rule__Recipe__Group_3__12328);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1159:1: rule__Recipe__Group_3__1__Impl : ( ( rule__Recipe__PriceAssignment_3_1 ) ) ;
    public final void rule__Recipe__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1163:1: ( ( ( rule__Recipe__PriceAssignment_3_1 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1164:1: ( ( rule__Recipe__PriceAssignment_3_1 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1164:1: ( ( rule__Recipe__PriceAssignment_3_1 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1165:1: ( rule__Recipe__PriceAssignment_3_1 )
            {
             before(grammarAccess.getRecipeAccess().getPriceAssignment_3_1()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1166:1: ( rule__Recipe__PriceAssignment_3_1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1166:2: rule__Recipe__PriceAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__PriceAssignment_3_1_in_rule__Recipe__Group_3__1__Impl2355);
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


    // $ANTLR start "rule__Recipe__Group_4__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1180:1: rule__Recipe__Group_4__0 : rule__Recipe__Group_4__0__Impl rule__Recipe__Group_4__1 ;
    public final void rule__Recipe__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1184:1: ( rule__Recipe__Group_4__0__Impl rule__Recipe__Group_4__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1185:2: rule__Recipe__Group_4__0__Impl rule__Recipe__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_4__0__Impl_in_rule__Recipe__Group_4__02389);
            rule__Recipe__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_4__1_in_rule__Recipe__Group_4__02392);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1192:1: rule__Recipe__Group_4__0__Impl : ( ( rule__Recipe__AmountAssignment_4_0 ) ) ;
    public final void rule__Recipe__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1196:1: ( ( ( rule__Recipe__AmountAssignment_4_0 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1197:1: ( ( rule__Recipe__AmountAssignment_4_0 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1197:1: ( ( rule__Recipe__AmountAssignment_4_0 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1198:1: ( rule__Recipe__AmountAssignment_4_0 )
            {
             before(grammarAccess.getRecipeAccess().getAmountAssignment_4_0()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1199:1: ( rule__Recipe__AmountAssignment_4_0 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1199:2: rule__Recipe__AmountAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__AmountAssignment_4_0_in_rule__Recipe__Group_4__0__Impl2419);
            rule__Recipe__AmountAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getAmountAssignment_4_0()); 

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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1209:1: rule__Recipe__Group_4__1 : rule__Recipe__Group_4__1__Impl ;
    public final void rule__Recipe__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1213:1: ( rule__Recipe__Group_4__1__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1214:2: rule__Recipe__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_4__1__Impl_in_rule__Recipe__Group_4__12449);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1220:1: rule__Recipe__Group_4__1__Impl : ( ( rule__Recipe__AmountTypeAssignment_4_1 ) ) ;
    public final void rule__Recipe__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1224:1: ( ( ( rule__Recipe__AmountTypeAssignment_4_1 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1225:1: ( ( rule__Recipe__AmountTypeAssignment_4_1 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1225:1: ( ( rule__Recipe__AmountTypeAssignment_4_1 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1226:1: ( rule__Recipe__AmountTypeAssignment_4_1 )
            {
             before(grammarAccess.getRecipeAccess().getAmountTypeAssignment_4_1()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1227:1: ( rule__Recipe__AmountTypeAssignment_4_1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1227:2: rule__Recipe__AmountTypeAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__AmountTypeAssignment_4_1_in_rule__Recipe__Group_4__1__Impl2476);
            rule__Recipe__AmountTypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getAmountTypeAssignment_4_1()); 

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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1241:1: rule__Recipe__Group_5__0 : rule__Recipe__Group_5__0__Impl rule__Recipe__Group_5__1 ;
    public final void rule__Recipe__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1245:1: ( rule__Recipe__Group_5__0__Impl rule__Recipe__Group_5__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1246:2: rule__Recipe__Group_5__0__Impl rule__Recipe__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_5__0__Impl_in_rule__Recipe__Group_5__02510);
            rule__Recipe__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_5__1_in_rule__Recipe__Group_5__02513);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1253:1: rule__Recipe__Group_5__0__Impl : ( ( rule__Recipe__IngredientsAssignment_5_0 ) ) ;
    public final void rule__Recipe__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1257:1: ( ( ( rule__Recipe__IngredientsAssignment_5_0 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1258:1: ( ( rule__Recipe__IngredientsAssignment_5_0 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1258:1: ( ( rule__Recipe__IngredientsAssignment_5_0 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1259:1: ( rule__Recipe__IngredientsAssignment_5_0 )
            {
             before(grammarAccess.getRecipeAccess().getIngredientsAssignment_5_0()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1260:1: ( rule__Recipe__IngredientsAssignment_5_0 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1260:2: rule__Recipe__IngredientsAssignment_5_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__IngredientsAssignment_5_0_in_rule__Recipe__Group_5__0__Impl2540);
            rule__Recipe__IngredientsAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getIngredientsAssignment_5_0()); 

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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1270:1: rule__Recipe__Group_5__1 : rule__Recipe__Group_5__1__Impl ;
    public final void rule__Recipe__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1274:1: ( rule__Recipe__Group_5__1__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1275:2: rule__Recipe__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_5__1__Impl_in_rule__Recipe__Group_5__12570);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1281:1: rule__Recipe__Group_5__1__Impl : ( ( rule__Recipe__Group_5_1__0 )* ) ;
    public final void rule__Recipe__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1285:1: ( ( ( rule__Recipe__Group_5_1__0 )* ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1286:1: ( ( rule__Recipe__Group_5_1__0 )* )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1286:1: ( ( rule__Recipe__Group_5_1__0 )* )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1287:1: ( rule__Recipe__Group_5_1__0 )*
            {
             before(grammarAccess.getRecipeAccess().getGroup_5_1()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1288:1: ( rule__Recipe__Group_5_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    int LA13_2 = input.LA(2);

                    if ( (LA13_2==31) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1288:2: rule__Recipe__Group_5_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_5_1__0_in_rule__Recipe__Group_5__1__Impl2597);
            	    rule__Recipe__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getRecipeAccess().getGroup_5_1()); 

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


    // $ANTLR start "rule__Recipe__Group_5_1__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1302:1: rule__Recipe__Group_5_1__0 : rule__Recipe__Group_5_1__0__Impl rule__Recipe__Group_5_1__1 ;
    public final void rule__Recipe__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1306:1: ( rule__Recipe__Group_5_1__0__Impl rule__Recipe__Group_5_1__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1307:2: rule__Recipe__Group_5_1__0__Impl rule__Recipe__Group_5_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_5_1__0__Impl_in_rule__Recipe__Group_5_1__02632);
            rule__Recipe__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_5_1__1_in_rule__Recipe__Group_5_1__02635);
            rule__Recipe__Group_5_1__1();

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
    // $ANTLR end "rule__Recipe__Group_5_1__0"


    // $ANTLR start "rule__Recipe__Group_5_1__0__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1314:1: rule__Recipe__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__Recipe__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1318:1: ( ( ',' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1319:1: ( ',' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1319:1: ( ',' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1320:1: ','
            {
             before(grammarAccess.getRecipeAccess().getCommaKeyword_5_1_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Recipe__Group_5_1__0__Impl2663); 
             after(grammarAccess.getRecipeAccess().getCommaKeyword_5_1_0()); 

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
    // $ANTLR end "rule__Recipe__Group_5_1__0__Impl"


    // $ANTLR start "rule__Recipe__Group_5_1__1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1333:1: rule__Recipe__Group_5_1__1 : rule__Recipe__Group_5_1__1__Impl ;
    public final void rule__Recipe__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1337:1: ( rule__Recipe__Group_5_1__1__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1338:2: rule__Recipe__Group_5_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_5_1__1__Impl_in_rule__Recipe__Group_5_1__12694);
            rule__Recipe__Group_5_1__1__Impl();

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
    // $ANTLR end "rule__Recipe__Group_5_1__1"


    // $ANTLR start "rule__Recipe__Group_5_1__1__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1344:1: rule__Recipe__Group_5_1__1__Impl : ( ( rule__Recipe__IngredientsAssignment_5_1_1 ) ) ;
    public final void rule__Recipe__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1348:1: ( ( ( rule__Recipe__IngredientsAssignment_5_1_1 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1349:1: ( ( rule__Recipe__IngredientsAssignment_5_1_1 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1349:1: ( ( rule__Recipe__IngredientsAssignment_5_1_1 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1350:1: ( rule__Recipe__IngredientsAssignment_5_1_1 )
            {
             before(grammarAccess.getRecipeAccess().getIngredientsAssignment_5_1_1()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1351:1: ( rule__Recipe__IngredientsAssignment_5_1_1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1351:2: rule__Recipe__IngredientsAssignment_5_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__IngredientsAssignment_5_1_1_in_rule__Recipe__Group_5_1__1__Impl2721);
            rule__Recipe__IngredientsAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRecipeAccess().getIngredientsAssignment_5_1_1()); 

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
    // $ANTLR end "rule__Recipe__Group_5_1__1__Impl"


    // $ANTLR start "rule__EBigDecimal__Group__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1365:1: rule__EBigDecimal__Group__0 : rule__EBigDecimal__Group__0__Impl rule__EBigDecimal__Group__1 ;
    public final void rule__EBigDecimal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1369:1: ( rule__EBigDecimal__Group__0__Impl rule__EBigDecimal__Group__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1370:2: rule__EBigDecimal__Group__0__Impl rule__EBigDecimal__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBigDecimal__Group__0__Impl_in_rule__EBigDecimal__Group__02755);
            rule__EBigDecimal__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EBigDecimal__Group__1_in_rule__EBigDecimal__Group__02758);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1377:1: rule__EBigDecimal__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__EBigDecimal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1381:1: ( ( RULE_INT ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1382:1: ( RULE_INT )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1382:1: ( RULE_INT )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1383:1: RULE_INT
            {
             before(grammarAccess.getEBigDecimalAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EBigDecimal__Group__0__Impl2785); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1394:1: rule__EBigDecimal__Group__1 : rule__EBigDecimal__Group__1__Impl ;
    public final void rule__EBigDecimal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1398:1: ( rule__EBigDecimal__Group__1__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1399:2: rule__EBigDecimal__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBigDecimal__Group__1__Impl_in_rule__EBigDecimal__Group__12814);
            rule__EBigDecimal__Group__1__Impl();

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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1405:1: rule__EBigDecimal__Group__1__Impl : ( ( rule__EBigDecimal__Group_1__0 )? ) ;
    public final void rule__EBigDecimal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1409:1: ( ( ( rule__EBigDecimal__Group_1__0 )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1410:1: ( ( rule__EBigDecimal__Group_1__0 )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1410:1: ( ( rule__EBigDecimal__Group_1__0 )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1411:1: ( rule__EBigDecimal__Group_1__0 )?
            {
             before(grammarAccess.getEBigDecimalAccess().getGroup_1()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1412:1: ( rule__EBigDecimal__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1412:2: rule__EBigDecimal__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__EBigDecimal__Group_1__0_in_rule__EBigDecimal__Group__1__Impl2841);
                    rule__EBigDecimal__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEBigDecimalAccess().getGroup_1()); 

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


    // $ANTLR start "rule__EBigDecimal__Group_1__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1426:1: rule__EBigDecimal__Group_1__0 : rule__EBigDecimal__Group_1__0__Impl rule__EBigDecimal__Group_1__1 ;
    public final void rule__EBigDecimal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1430:1: ( rule__EBigDecimal__Group_1__0__Impl rule__EBigDecimal__Group_1__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1431:2: rule__EBigDecimal__Group_1__0__Impl rule__EBigDecimal__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBigDecimal__Group_1__0__Impl_in_rule__EBigDecimal__Group_1__02876);
            rule__EBigDecimal__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EBigDecimal__Group_1__1_in_rule__EBigDecimal__Group_1__02879);
            rule__EBigDecimal__Group_1__1();

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
    // $ANTLR end "rule__EBigDecimal__Group_1__0"


    // $ANTLR start "rule__EBigDecimal__Group_1__0__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1438:1: rule__EBigDecimal__Group_1__0__Impl : ( '.' ) ;
    public final void rule__EBigDecimal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1442:1: ( ( '.' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1443:1: ( '.' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1443:1: ( '.' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1444:1: '.'
            {
             before(grammarAccess.getEBigDecimalAccess().getFullStopKeyword_1_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__EBigDecimal__Group_1__0__Impl2907); 
             after(grammarAccess.getEBigDecimalAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__EBigDecimal__Group_1__0__Impl"


    // $ANTLR start "rule__EBigDecimal__Group_1__1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1457:1: rule__EBigDecimal__Group_1__1 : rule__EBigDecimal__Group_1__1__Impl ;
    public final void rule__EBigDecimal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1461:1: ( rule__EBigDecimal__Group_1__1__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1462:2: rule__EBigDecimal__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBigDecimal__Group_1__1__Impl_in_rule__EBigDecimal__Group_1__12938);
            rule__EBigDecimal__Group_1__1__Impl();

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
    // $ANTLR end "rule__EBigDecimal__Group_1__1"


    // $ANTLR start "rule__EBigDecimal__Group_1__1__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1468:1: rule__EBigDecimal__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__EBigDecimal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1472:1: ( ( RULE_INT ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1473:1: ( RULE_INT )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1473:1: ( RULE_INT )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1474:1: RULE_INT
            {
             before(grammarAccess.getEBigDecimalAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EBigDecimal__Group_1__1__Impl2965); 
             after(grammarAccess.getEBigDecimalAccess().getINTTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__EBigDecimal__Group_1__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1489:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1493:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1494:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__02998);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__03001);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1501:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1505:1: ( ( ( '-' )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1506:1: ( ( '-' )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1506:1: ( ( '-' )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1507:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1508:1: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1509:2: '-'
                    {
                    match(input,30,FollowSets000.FOLLOW_30_in_rule__EInt__Group__0__Impl3030); 

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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1520:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1524:1: ( rule__EInt__Group__1__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1525:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__13063);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1531:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1535:1: ( ( RULE_INT ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1536:1: ( RULE_INT )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1536:1: ( RULE_INT )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1537:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl3090); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1552:1: rule__Ingredient__Group__0 : rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1 ;
    public final void rule__Ingredient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1556:1: ( rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1557:2: rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__0__Impl_in_rule__Ingredient__Group__03123);
            rule__Ingredient__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__1_in_rule__Ingredient__Group__03126);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1564:1: rule__Ingredient__Group__0__Impl : ( () ) ;
    public final void rule__Ingredient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1568:1: ( ( () ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1569:1: ( () )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1569:1: ( () )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1570:1: ()
            {
             before(grammarAccess.getIngredientAccess().getIngredientAction_0()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1571:1: ()
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1573:1: 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1583:1: rule__Ingredient__Group__1 : rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2 ;
    public final void rule__Ingredient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1587:1: ( rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1588:2: rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__1__Impl_in_rule__Ingredient__Group__13184);
            rule__Ingredient__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__2_in_rule__Ingredient__Group__13187);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1595:1: rule__Ingredient__Group__1__Impl : ( 'Ingredient' ) ;
    public final void rule__Ingredient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1599:1: ( ( 'Ingredient' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1600:1: ( 'Ingredient' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1600:1: ( 'Ingredient' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1601:1: 'Ingredient'
            {
             before(grammarAccess.getIngredientAccess().getIngredientKeyword_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Ingredient__Group__1__Impl3215); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1614:1: rule__Ingredient__Group__2 : rule__Ingredient__Group__2__Impl rule__Ingredient__Group__3 ;
    public final void rule__Ingredient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1618:1: ( rule__Ingredient__Group__2__Impl rule__Ingredient__Group__3 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1619:2: rule__Ingredient__Group__2__Impl rule__Ingredient__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__2__Impl_in_rule__Ingredient__Group__23246);
            rule__Ingredient__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__3_in_rule__Ingredient__Group__23249);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1626:1: rule__Ingredient__Group__2__Impl : ( ( rule__Ingredient__NameAssignment_2 ) ) ;
    public final void rule__Ingredient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1630:1: ( ( ( rule__Ingredient__NameAssignment_2 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1631:1: ( ( rule__Ingredient__NameAssignment_2 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1631:1: ( ( rule__Ingredient__NameAssignment_2 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1632:1: ( rule__Ingredient__NameAssignment_2 )
            {
             before(grammarAccess.getIngredientAccess().getNameAssignment_2()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1633:1: ( rule__Ingredient__NameAssignment_2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1633:2: rule__Ingredient__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__NameAssignment_2_in_rule__Ingredient__Group__2__Impl3276);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1643:1: rule__Ingredient__Group__3 : rule__Ingredient__Group__3__Impl ;
    public final void rule__Ingredient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1647:1: ( rule__Ingredient__Group__3__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1648:2: rule__Ingredient__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__3__Impl_in_rule__Ingredient__Group__33306);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1654:1: rule__Ingredient__Group__3__Impl : ( ( rule__Ingredient__SpicinessAssignment_3 )? ) ;
    public final void rule__Ingredient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1658:1: ( ( ( rule__Ingredient__SpicinessAssignment_3 )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1659:1: ( ( rule__Ingredient__SpicinessAssignment_3 )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1659:1: ( ( rule__Ingredient__SpicinessAssignment_3 )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1660:1: ( rule__Ingredient__SpicinessAssignment_3 )?
            {
             before(grammarAccess.getIngredientAccess().getSpicinessAssignment_3()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1661:1: ( rule__Ingredient__SpicinessAssignment_3 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=20 && LA16_0<=23)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1661:2: rule__Ingredient__SpicinessAssignment_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Ingredient__SpicinessAssignment_3_in_rule__Ingredient__Group__3__Impl3333);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1680:1: rule__Menu__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Menu__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1684:1: ( ( ruleEString ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1685:1: ( ruleEString )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1685:1: ( ruleEString )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1686:1: ruleEString
            {
             before(grammarAccess.getMenuAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Menu__NameAssignment_23377);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1695:1: rule__Menu__GroupsAssignment_3_0 : ( ruleGroup ) ;
    public final void rule__Menu__GroupsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1699:1: ( ( ruleGroup ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1700:1: ( ruleGroup )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1700:1: ( ruleGroup )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1701:1: ruleGroup
            {
             before(grammarAccess.getMenuAccess().getGroupsGroupParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_rule__Menu__GroupsAssignment_3_03408);
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


    // $ANTLR start "rule__Menu__GroupsAssignment_3_1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1710:1: rule__Menu__GroupsAssignment_3_1 : ( ruleGroup ) ;
    public final void rule__Menu__GroupsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1714:1: ( ( ruleGroup ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1715:1: ( ruleGroup )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1715:1: ( ruleGroup )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1716:1: ruleGroup
            {
             before(grammarAccess.getMenuAccess().getGroupsGroupParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_rule__Menu__GroupsAssignment_3_13439);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getMenuAccess().getGroupsGroupParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Menu__GroupsAssignment_3_1"


    // $ANTLR start "rule__Group__NameAssignment_2"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1725:1: rule__Group__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Group__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1729:1: ( ( ruleEString ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1730:1: ( ruleEString )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1730:1: ( ruleEString )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1731:1: ruleEString
            {
             before(grammarAccess.getGroupAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Group__NameAssignment_23470);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1740:1: rule__Group__CategoryAssignment_3 : ( ruleCategory ) ;
    public final void rule__Group__CategoryAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1744:1: ( ( ruleCategory ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1745:1: ( ruleCategory )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1745:1: ( ruleCategory )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1746:1: ruleCategory
            {
             before(grammarAccess.getGroupAccess().getCategoryCategoryEnumRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCategory_in_rule__Group__CategoryAssignment_33501);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1755:1: rule__Group__RecipesAssignment_4_0 : ( ruleRecipe ) ;
    public final void rule__Group__RecipesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1759:1: ( ( ruleRecipe ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1760:1: ( ruleRecipe )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1760:1: ( ruleRecipe )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1761:1: ruleRecipe
            {
             before(grammarAccess.getGroupAccess().getRecipesRecipeParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRecipe_in_rule__Group__RecipesAssignment_4_03532);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1770:1: rule__Group__RecipesAssignment_4_1_1 : ( ruleRecipe ) ;
    public final void rule__Group__RecipesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1774:1: ( ( ruleRecipe ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1775:1: ( ruleRecipe )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1775:1: ( ruleRecipe )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1776:1: ruleRecipe
            {
             before(grammarAccess.getGroupAccess().getRecipesRecipeParserRuleCall_4_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRecipe_in_rule__Group__RecipesAssignment_4_1_13563);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1785:1: rule__Recipe__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Recipe__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1789:1: ( ( ruleEString ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1790:1: ( ruleEString )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1790:1: ( ruleEString )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1791:1: ruleEString
            {
             before(grammarAccess.getRecipeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Recipe__NameAssignment_23594);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1800:1: rule__Recipe__PriceAssignment_3_1 : ( ruleEBigDecimal ) ;
    public final void rule__Recipe__PriceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1804:1: ( ( ruleEBigDecimal ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1805:1: ( ruleEBigDecimal )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1805:1: ( ruleEBigDecimal )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1806:1: ruleEBigDecimal
            {
             before(grammarAccess.getRecipeAccess().getPriceEBigDecimalParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBigDecimal_in_rule__Recipe__PriceAssignment_3_13625);
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


    // $ANTLR start "rule__Recipe__AmountAssignment_4_0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1815:1: rule__Recipe__AmountAssignment_4_0 : ( ruleEInt ) ;
    public final void rule__Recipe__AmountAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1819:1: ( ( ruleEInt ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1820:1: ( ruleEInt )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1820:1: ( ruleEInt )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1821:1: ruleEInt
            {
             before(grammarAccess.getRecipeAccess().getAmountEIntParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Recipe__AmountAssignment_4_03656);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getAmountEIntParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__Recipe__AmountAssignment_4_0"


    // $ANTLR start "rule__Recipe__AmountTypeAssignment_4_1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1830:1: rule__Recipe__AmountTypeAssignment_4_1 : ( ruleAmountType ) ;
    public final void rule__Recipe__AmountTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1834:1: ( ( ruleAmountType ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1835:1: ( ruleAmountType )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1835:1: ( ruleAmountType )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1836:1: ruleAmountType
            {
             before(grammarAccess.getRecipeAccess().getAmountTypeAmountTypeEnumRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAmountType_in_rule__Recipe__AmountTypeAssignment_4_13687);
            ruleAmountType();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getAmountTypeAmountTypeEnumRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Recipe__AmountTypeAssignment_4_1"


    // $ANTLR start "rule__Recipe__IngredientsAssignment_5_0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1845:1: rule__Recipe__IngredientsAssignment_5_0 : ( ruleIngredient ) ;
    public final void rule__Recipe__IngredientsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1849:1: ( ( ruleIngredient ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1850:1: ( ruleIngredient )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1850:1: ( ruleIngredient )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1851:1: ruleIngredient
            {
             before(grammarAccess.getRecipeAccess().getIngredientsIngredientParserRuleCall_5_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIngredient_in_rule__Recipe__IngredientsAssignment_5_03718);
            ruleIngredient();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getIngredientsIngredientParserRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__Recipe__IngredientsAssignment_5_0"


    // $ANTLR start "rule__Recipe__IngredientsAssignment_5_1_1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1860:1: rule__Recipe__IngredientsAssignment_5_1_1 : ( ruleIngredient ) ;
    public final void rule__Recipe__IngredientsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1864:1: ( ( ruleIngredient ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1865:1: ( ruleIngredient )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1865:1: ( ruleIngredient )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1866:1: ruleIngredient
            {
             before(grammarAccess.getRecipeAccess().getIngredientsIngredientParserRuleCall_5_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIngredient_in_rule__Recipe__IngredientsAssignment_5_1_13749);
            ruleIngredient();

            state._fsp--;

             after(grammarAccess.getRecipeAccess().getIngredientsIngredientParserRuleCall_5_1_1_0()); 

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
    // $ANTLR end "rule__Recipe__IngredientsAssignment_5_1_1"


    // $ANTLR start "rule__Ingredient__NameAssignment_2"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1875:1: rule__Ingredient__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Ingredient__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1879:1: ( ( ruleEString ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1880:1: ( ruleEString )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1880:1: ( ruleEString )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1881:1: ruleEString
            {
             before(grammarAccess.getIngredientAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ingredient__NameAssignment_23780);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1890:1: rule__Ingredient__SpicinessAssignment_3 : ( ruleSpiciness ) ;
    public final void rule__Ingredient__SpicinessAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1894:1: ( ( ruleSpiciness ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1895:1: ( ruleSpiciness )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1895:1: ( ruleSpiciness )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1896:1: ruleSpiciness
            {
             before(grammarAccess.getIngredientAccess().getSpicinessSpicinessEnumRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSpiciness_in_rule__Ingredient__SpicinessAssignment_33811);
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
        public static final BitSet FOLLOW_rule__Menu__Group__2__Impl_in_rule__Menu__Group__21086 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Menu__Group__3_in_rule__Menu__Group__21089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Menu__NameAssignment_2_in_rule__Menu__Group__2__Impl1116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Menu__Group__3__Impl_in_rule__Menu__Group__31146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Menu__Group_3__0_in_rule__Menu__Group__3__Impl1173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Menu__Group_3__0__Impl_in_rule__Menu__Group_3__01212 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Menu__Group_3__1_in_rule__Menu__Group_3__01215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Menu__GroupsAssignment_3_0_in_rule__Menu__Group_3__0__Impl1242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Menu__Group_3__1__Impl_in_rule__Menu__Group_3__11272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Menu__GroupsAssignment_3_1_in_rule__Menu__Group_3__1__Impl1299 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__01334 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Group__Group__1_in_rule__Group__Group__01337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__11395 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Group__Group__2_in_rule__Group__Group__11398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Group__Group__1__Impl1426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__21457 = new BitSet(new long[]{0x000000000800F800L});
        public static final BitSet FOLLOW_rule__Group__Group__3_in_rule__Group__Group__21460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__NameAssignment_2_in_rule__Group__Group__2__Impl1487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__31517 = new BitSet(new long[]{0x000000000800F800L});
        public static final BitSet FOLLOW_rule__Group__Group__4_in_rule__Group__Group__31520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__CategoryAssignment_3_in_rule__Group__Group__3__Impl1547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__41578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_4__0_in_rule__Group__Group__4__Impl1605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_4__0__Impl_in_rule__Group__Group_4__01646 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Group__Group_4__1_in_rule__Group__Group_4__01649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__RecipesAssignment_4_0_in_rule__Group__Group_4__0__Impl1676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_4__1__Impl_in_rule__Group__Group_4__11706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_4_1__0_in_rule__Group__Group_4__1__Impl1733 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__Group__Group_4_1__0__Impl_in_rule__Group__Group_4_1__01768 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Group__Group_4_1__1_in_rule__Group__Group_4_1__01771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Group__Group_4_1__0__Impl1799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_4_1__1__Impl_in_rule__Group__Group_4_1__11830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__RecipesAssignment_4_1_1_in_rule__Group__Group_4_1__1__Impl1857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group__0__Impl_in_rule__Recipe__Group__01891 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__Recipe__Group__1_in_rule__Recipe__Group__01894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group__1__Impl_in_rule__Recipe__Group__11952 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Recipe__Group__2_in_rule__Recipe__Group__11955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Recipe__Group__1__Impl1983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group__2__Impl_in_rule__Recipe__Group__22014 = new BitSet(new long[]{0x00000000D0000040L});
        public static final BitSet FOLLOW_rule__Recipe__Group__3_in_rule__Recipe__Group__22017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__NameAssignment_2_in_rule__Recipe__Group__2__Impl2044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group__3__Impl_in_rule__Recipe__Group__32074 = new BitSet(new long[]{0x00000000D0000040L});
        public static final BitSet FOLLOW_rule__Recipe__Group__4_in_rule__Recipe__Group__32077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_3__0_in_rule__Recipe__Group__3__Impl2104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group__4__Impl_in_rule__Recipe__Group__42135 = new BitSet(new long[]{0x00000000D0000040L});
        public static final BitSet FOLLOW_rule__Recipe__Group__5_in_rule__Recipe__Group__42138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_4__0_in_rule__Recipe__Group__4__Impl2165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group__5__Impl_in_rule__Recipe__Group__52196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_5__0_in_rule__Recipe__Group__5__Impl2223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_3__0__Impl_in_rule__Recipe__Group_3__02266 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Recipe__Group_3__1_in_rule__Recipe__Group_3__02269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Recipe__Group_3__0__Impl2297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_3__1__Impl_in_rule__Recipe__Group_3__12328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__PriceAssignment_3_1_in_rule__Recipe__Group_3__1__Impl2355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_4__0__Impl_in_rule__Recipe__Group_4__02389 = new BitSet(new long[]{0x00000000000F0000L});
        public static final BitSet FOLLOW_rule__Recipe__Group_4__1_in_rule__Recipe__Group_4__02392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__AmountAssignment_4_0_in_rule__Recipe__Group_4__0__Impl2419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_4__1__Impl_in_rule__Recipe__Group_4__12449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__AmountTypeAssignment_4_1_in_rule__Recipe__Group_4__1__Impl2476 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_5__0__Impl_in_rule__Recipe__Group_5__02510 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Recipe__Group_5__1_in_rule__Recipe__Group_5__02513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__IngredientsAssignment_5_0_in_rule__Recipe__Group_5__0__Impl2540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_5__1__Impl_in_rule__Recipe__Group_5__12570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_5_1__0_in_rule__Recipe__Group_5__1__Impl2597 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_5_1__0__Impl_in_rule__Recipe__Group_5_1__02632 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Recipe__Group_5_1__1_in_rule__Recipe__Group_5_1__02635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Recipe__Group_5_1__0__Impl2663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_5_1__1__Impl_in_rule__Recipe__Group_5_1__12694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__IngredientsAssignment_5_1_1_in_rule__Recipe__Group_5_1__1__Impl2721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBigDecimal__Group__0__Impl_in_rule__EBigDecimal__Group__02755 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__EBigDecimal__Group__1_in_rule__EBigDecimal__Group__02758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EBigDecimal__Group__0__Impl2785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBigDecimal__Group__1__Impl_in_rule__EBigDecimal__Group__12814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBigDecimal__Group_1__0_in_rule__EBigDecimal__Group__1__Impl2841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBigDecimal__Group_1__0__Impl_in_rule__EBigDecimal__Group_1__02876 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EBigDecimal__Group_1__1_in_rule__EBigDecimal__Group_1__02879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__EBigDecimal__Group_1__0__Impl2907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBigDecimal__Group_1__1__Impl_in_rule__EBigDecimal__Group_1__12938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EBigDecimal__Group_1__1__Impl2965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__02998 = new BitSet(new long[]{0x0000000040000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__03001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__EInt__Group__0__Impl3030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__13063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl3090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__0__Impl_in_rule__Ingredient__Group__03123 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__1_in_rule__Ingredient__Group__03126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__1__Impl_in_rule__Ingredient__Group__13184 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__2_in_rule__Ingredient__Group__13187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Ingredient__Group__1__Impl3215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__2__Impl_in_rule__Ingredient__Group__23246 = new BitSet(new long[]{0x0000000000F00000L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__3_in_rule__Ingredient__Group__23249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__NameAssignment_2_in_rule__Ingredient__Group__2__Impl3276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__3__Impl_in_rule__Ingredient__Group__33306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__SpicinessAssignment_3_in_rule__Ingredient__Group__3__Impl3333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Menu__NameAssignment_23377 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_rule__Menu__GroupsAssignment_3_03408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_rule__Menu__GroupsAssignment_3_13439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Group__NameAssignment_23470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCategory_in_rule__Group__CategoryAssignment_33501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecipe_in_rule__Group__RecipesAssignment_4_03532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecipe_in_rule__Group__RecipesAssignment_4_1_13563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Recipe__NameAssignment_23594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBigDecimal_in_rule__Recipe__PriceAssignment_3_13625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Recipe__AmountAssignment_4_03656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAmountType_in_rule__Recipe__AmountTypeAssignment_4_13687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIngredient_in_rule__Recipe__IngredientsAssignment_5_03718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIngredient_in_rule__Recipe__IngredientsAssignment_5_1_13749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ingredient__NameAssignment_23780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSpiciness_in_rule__Ingredient__SpicinessAssignment_33811 = new BitSet(new long[]{0x0000000000000002L});
    }


}