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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'breakfast'", "'dinner'", "'lunch'", "'supper'", "'dessert'", "'gram'", "'milliliters'", "'bottles'", "'items'", "'VeryHot'", "'Hot'", "'Normal'", "'Mild'", "'Menu'", "'{'", "'}'", "'groups'", "','", "'Group'", "'category'", "'recipes'", "'Recipe'", "'price'", "'amount'", "'amountType'", "'ingredients'", "'.'", "'-'", "'Ingredient'", "'spiciness'"
    };
    public static final int RULE_ID=5;
    public static final int T__40=40;
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
    public static final int T__39=39;
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:549:1: rule__Menu__Group__3 : rule__Menu__Group__3__Impl rule__Menu__Group__4 ;
    public final void rule__Menu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:553:1: ( rule__Menu__Group__3__Impl rule__Menu__Group__4 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:554:2: rule__Menu__Group__3__Impl rule__Menu__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Menu__Group__3__Impl_in_rule__Menu__Group__31146);
            rule__Menu__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Menu__Group__4_in_rule__Menu__Group__31149);
            rule__Menu__Group__4();

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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:561:1: rule__Menu__Group__3__Impl : ( '{' ) ;
    public final void rule__Menu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:565:1: ( ( '{' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:566:1: ( '{' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:566:1: ( '{' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:567:1: '{'
            {
             before(grammarAccess.getMenuAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Menu__Group__3__Impl1177); 
             after(grammarAccess.getMenuAccess().getLeftCurlyBracketKeyword_3()); 

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


    // $ANTLR start "rule__Menu__Group__4"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:580:1: rule__Menu__Group__4 : rule__Menu__Group__4__Impl rule__Menu__Group__5 ;
    public final void rule__Menu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:584:1: ( rule__Menu__Group__4__Impl rule__Menu__Group__5 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:585:2: rule__Menu__Group__4__Impl rule__Menu__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Menu__Group__4__Impl_in_rule__Menu__Group__41208);
            rule__Menu__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Menu__Group__5_in_rule__Menu__Group__41211);
            rule__Menu__Group__5();

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
    // $ANTLR end "rule__Menu__Group__4"


    // $ANTLR start "rule__Menu__Group__4__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:592:1: rule__Menu__Group__4__Impl : ( ( rule__Menu__Group_4__0 )? ) ;
    public final void rule__Menu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:596:1: ( ( ( rule__Menu__Group_4__0 )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:597:1: ( ( rule__Menu__Group_4__0 )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:597:1: ( ( rule__Menu__Group_4__0 )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:598:1: ( rule__Menu__Group_4__0 )?
            {
             before(grammarAccess.getMenuAccess().getGroup_4()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:599:1: ( rule__Menu__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:599:2: rule__Menu__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Menu__Group_4__0_in_rule__Menu__Group__4__Impl1238);
                    rule__Menu__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMenuAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Menu__Group__4__Impl"


    // $ANTLR start "rule__Menu__Group__5"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:609:1: rule__Menu__Group__5 : rule__Menu__Group__5__Impl ;
    public final void rule__Menu__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:613:1: ( rule__Menu__Group__5__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:614:2: rule__Menu__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Menu__Group__5__Impl_in_rule__Menu__Group__51269);
            rule__Menu__Group__5__Impl();

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
    // $ANTLR end "rule__Menu__Group__5"


    // $ANTLR start "rule__Menu__Group__5__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:620:1: rule__Menu__Group__5__Impl : ( '}' ) ;
    public final void rule__Menu__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:624:1: ( ( '}' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:625:1: ( '}' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:625:1: ( '}' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:626:1: '}'
            {
             before(grammarAccess.getMenuAccess().getRightCurlyBracketKeyword_5()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Menu__Group__5__Impl1297); 
             after(grammarAccess.getMenuAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Menu__Group__5__Impl"


    // $ANTLR start "rule__Menu__Group_4__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:651:1: rule__Menu__Group_4__0 : rule__Menu__Group_4__0__Impl rule__Menu__Group_4__1 ;
    public final void rule__Menu__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:655:1: ( rule__Menu__Group_4__0__Impl rule__Menu__Group_4__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:656:2: rule__Menu__Group_4__0__Impl rule__Menu__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Menu__Group_4__0__Impl_in_rule__Menu__Group_4__01340);
            rule__Menu__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Menu__Group_4__1_in_rule__Menu__Group_4__01343);
            rule__Menu__Group_4__1();

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
    // $ANTLR end "rule__Menu__Group_4__0"


    // $ANTLR start "rule__Menu__Group_4__0__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:663:1: rule__Menu__Group_4__0__Impl : ( 'groups' ) ;
    public final void rule__Menu__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:667:1: ( ( 'groups' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:668:1: ( 'groups' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:668:1: ( 'groups' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:669:1: 'groups'
            {
             before(grammarAccess.getMenuAccess().getGroupsKeyword_4_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__Menu__Group_4__0__Impl1371); 
             after(grammarAccess.getMenuAccess().getGroupsKeyword_4_0()); 

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
    // $ANTLR end "rule__Menu__Group_4__0__Impl"


    // $ANTLR start "rule__Menu__Group_4__1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:682:1: rule__Menu__Group_4__1 : rule__Menu__Group_4__1__Impl rule__Menu__Group_4__2 ;
    public final void rule__Menu__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:686:1: ( rule__Menu__Group_4__1__Impl rule__Menu__Group_4__2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:687:2: rule__Menu__Group_4__1__Impl rule__Menu__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Menu__Group_4__1__Impl_in_rule__Menu__Group_4__11402);
            rule__Menu__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Menu__Group_4__2_in_rule__Menu__Group_4__11405);
            rule__Menu__Group_4__2();

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
    // $ANTLR end "rule__Menu__Group_4__1"


    // $ANTLR start "rule__Menu__Group_4__1__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:694:1: rule__Menu__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Menu__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:698:1: ( ( '{' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:699:1: ( '{' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:699:1: ( '{' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:700:1: '{'
            {
             before(grammarAccess.getMenuAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Menu__Group_4__1__Impl1433); 
             after(grammarAccess.getMenuAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__Menu__Group_4__1__Impl"


    // $ANTLR start "rule__Menu__Group_4__2"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:713:1: rule__Menu__Group_4__2 : rule__Menu__Group_4__2__Impl rule__Menu__Group_4__3 ;
    public final void rule__Menu__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:717:1: ( rule__Menu__Group_4__2__Impl rule__Menu__Group_4__3 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:718:2: rule__Menu__Group_4__2__Impl rule__Menu__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Menu__Group_4__2__Impl_in_rule__Menu__Group_4__21464);
            rule__Menu__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Menu__Group_4__3_in_rule__Menu__Group_4__21467);
            rule__Menu__Group_4__3();

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
    // $ANTLR end "rule__Menu__Group_4__2"


    // $ANTLR start "rule__Menu__Group_4__2__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:725:1: rule__Menu__Group_4__2__Impl : ( ( rule__Menu__GroupsAssignment_4_2 ) ) ;
    public final void rule__Menu__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:729:1: ( ( ( rule__Menu__GroupsAssignment_4_2 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:730:1: ( ( rule__Menu__GroupsAssignment_4_2 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:730:1: ( ( rule__Menu__GroupsAssignment_4_2 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:731:1: ( rule__Menu__GroupsAssignment_4_2 )
            {
             before(grammarAccess.getMenuAccess().getGroupsAssignment_4_2()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:732:1: ( rule__Menu__GroupsAssignment_4_2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:732:2: rule__Menu__GroupsAssignment_4_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Menu__GroupsAssignment_4_2_in_rule__Menu__Group_4__2__Impl1494);
            rule__Menu__GroupsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getGroupsAssignment_4_2()); 

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
    // $ANTLR end "rule__Menu__Group_4__2__Impl"


    // $ANTLR start "rule__Menu__Group_4__3"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:742:1: rule__Menu__Group_4__3 : rule__Menu__Group_4__3__Impl rule__Menu__Group_4__4 ;
    public final void rule__Menu__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:746:1: ( rule__Menu__Group_4__3__Impl rule__Menu__Group_4__4 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:747:2: rule__Menu__Group_4__3__Impl rule__Menu__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Menu__Group_4__3__Impl_in_rule__Menu__Group_4__31524);
            rule__Menu__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Menu__Group_4__4_in_rule__Menu__Group_4__31527);
            rule__Menu__Group_4__4();

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
    // $ANTLR end "rule__Menu__Group_4__3"


    // $ANTLR start "rule__Menu__Group_4__3__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:754:1: rule__Menu__Group_4__3__Impl : ( ( rule__Menu__Group_4_3__0 )* ) ;
    public final void rule__Menu__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:758:1: ( ( ( rule__Menu__Group_4_3__0 )* ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:759:1: ( ( rule__Menu__Group_4_3__0 )* )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:759:1: ( ( rule__Menu__Group_4_3__0 )* )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:760:1: ( rule__Menu__Group_4_3__0 )*
            {
             before(grammarAccess.getMenuAccess().getGroup_4_3()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:761:1: ( rule__Menu__Group_4_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:761:2: rule__Menu__Group_4_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Menu__Group_4_3__0_in_rule__Menu__Group_4__3__Impl1554);
            	    rule__Menu__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getMenuAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Menu__Group_4__3__Impl"


    // $ANTLR start "rule__Menu__Group_4__4"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:771:1: rule__Menu__Group_4__4 : rule__Menu__Group_4__4__Impl ;
    public final void rule__Menu__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:775:1: ( rule__Menu__Group_4__4__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:776:2: rule__Menu__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Menu__Group_4__4__Impl_in_rule__Menu__Group_4__41585);
            rule__Menu__Group_4__4__Impl();

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
    // $ANTLR end "rule__Menu__Group_4__4"


    // $ANTLR start "rule__Menu__Group_4__4__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:782:1: rule__Menu__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Menu__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:786:1: ( ( '}' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:787:1: ( '}' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:787:1: ( '}' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:788:1: '}'
            {
             before(grammarAccess.getMenuAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Menu__Group_4__4__Impl1613); 
             after(grammarAccess.getMenuAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Menu__Group_4__4__Impl"


    // $ANTLR start "rule__Menu__Group_4_3__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:811:1: rule__Menu__Group_4_3__0 : rule__Menu__Group_4_3__0__Impl rule__Menu__Group_4_3__1 ;
    public final void rule__Menu__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:815:1: ( rule__Menu__Group_4_3__0__Impl rule__Menu__Group_4_3__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:816:2: rule__Menu__Group_4_3__0__Impl rule__Menu__Group_4_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Menu__Group_4_3__0__Impl_in_rule__Menu__Group_4_3__01654);
            rule__Menu__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Menu__Group_4_3__1_in_rule__Menu__Group_4_3__01657);
            rule__Menu__Group_4_3__1();

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
    // $ANTLR end "rule__Menu__Group_4_3__0"


    // $ANTLR start "rule__Menu__Group_4_3__0__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:823:1: rule__Menu__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Menu__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:827:1: ( ( ',' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:828:1: ( ',' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:828:1: ( ',' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:829:1: ','
            {
             before(grammarAccess.getMenuAccess().getCommaKeyword_4_3_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Menu__Group_4_3__0__Impl1685); 
             after(grammarAccess.getMenuAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Menu__Group_4_3__0__Impl"


    // $ANTLR start "rule__Menu__Group_4_3__1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:842:1: rule__Menu__Group_4_3__1 : rule__Menu__Group_4_3__1__Impl ;
    public final void rule__Menu__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:846:1: ( rule__Menu__Group_4_3__1__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:847:2: rule__Menu__Group_4_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Menu__Group_4_3__1__Impl_in_rule__Menu__Group_4_3__11716);
            rule__Menu__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Menu__Group_4_3__1"


    // $ANTLR start "rule__Menu__Group_4_3__1__Impl"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:853:1: rule__Menu__Group_4_3__1__Impl : ( ( rule__Menu__GroupsAssignment_4_3_1 ) ) ;
    public final void rule__Menu__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:857:1: ( ( ( rule__Menu__GroupsAssignment_4_3_1 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:858:1: ( ( rule__Menu__GroupsAssignment_4_3_1 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:858:1: ( ( rule__Menu__GroupsAssignment_4_3_1 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:859:1: ( rule__Menu__GroupsAssignment_4_3_1 )
            {
             before(grammarAccess.getMenuAccess().getGroupsAssignment_4_3_1()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:860:1: ( rule__Menu__GroupsAssignment_4_3_1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:860:2: rule__Menu__GroupsAssignment_4_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Menu__GroupsAssignment_4_3_1_in_rule__Menu__Group_4_3__1__Impl1743);
            rule__Menu__GroupsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getGroupsAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Menu__Group_4_3__1__Impl"


    // $ANTLR start "rule__Group__Group__0"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:874:1: rule__Group__Group__0 : rule__Group__Group__0__Impl rule__Group__Group__1 ;
    public final void rule__Group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:878:1: ( rule__Group__Group__0__Impl rule__Group__Group__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:879:2: rule__Group__Group__0__Impl rule__Group__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__01777);
            rule__Group__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__1_in_rule__Group__Group__01780);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:886:1: rule__Group__Group__0__Impl : ( () ) ;
    public final void rule__Group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:890:1: ( ( () ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:891:1: ( () )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:891:1: ( () )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:892:1: ()
            {
             before(grammarAccess.getGroupAccess().getGroupAction_0()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:893:1: ()
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:895:1: 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:905:1: rule__Group__Group__1 : rule__Group__Group__1__Impl rule__Group__Group__2 ;
    public final void rule__Group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:909:1: ( rule__Group__Group__1__Impl rule__Group__Group__2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:910:2: rule__Group__Group__1__Impl rule__Group__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__11838);
            rule__Group__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__2_in_rule__Group__Group__11841);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:917:1: rule__Group__Group__1__Impl : ( 'Group' ) ;
    public final void rule__Group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:921:1: ( ( 'Group' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:922:1: ( 'Group' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:922:1: ( 'Group' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:923:1: 'Group'
            {
             before(grammarAccess.getGroupAccess().getGroupKeyword_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Group__Group__1__Impl1869); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:936:1: rule__Group__Group__2 : rule__Group__Group__2__Impl rule__Group__Group__3 ;
    public final void rule__Group__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:940:1: ( rule__Group__Group__2__Impl rule__Group__Group__3 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:941:2: rule__Group__Group__2__Impl rule__Group__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__21900);
            rule__Group__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__3_in_rule__Group__Group__21903);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:948:1: rule__Group__Group__2__Impl : ( ( rule__Group__NameAssignment_2 ) ) ;
    public final void rule__Group__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:952:1: ( ( ( rule__Group__NameAssignment_2 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:953:1: ( ( rule__Group__NameAssignment_2 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:953:1: ( ( rule__Group__NameAssignment_2 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:954:1: ( rule__Group__NameAssignment_2 )
            {
             before(grammarAccess.getGroupAccess().getNameAssignment_2()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:955:1: ( rule__Group__NameAssignment_2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:955:2: rule__Group__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__NameAssignment_2_in_rule__Group__Group__2__Impl1930);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:965:1: rule__Group__Group__3 : rule__Group__Group__3__Impl rule__Group__Group__4 ;
    public final void rule__Group__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:969:1: ( rule__Group__Group__3__Impl rule__Group__Group__4 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:970:2: rule__Group__Group__3__Impl rule__Group__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__31960);
            rule__Group__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__4_in_rule__Group__Group__31963);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:977:1: rule__Group__Group__3__Impl : ( '{' ) ;
    public final void rule__Group__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:981:1: ( ( '{' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:982:1: ( '{' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:982:1: ( '{' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:983:1: '{'
            {
             before(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Group__Group__3__Impl1991); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:996:1: rule__Group__Group__4 : rule__Group__Group__4__Impl rule__Group__Group__5 ;
    public final void rule__Group__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1000:1: ( rule__Group__Group__4__Impl rule__Group__Group__5 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1001:2: rule__Group__Group__4__Impl rule__Group__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__42022);
            rule__Group__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__5_in_rule__Group__Group__42025);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1008:1: rule__Group__Group__4__Impl : ( ( rule__Group__Group_4__0 )? ) ;
    public final void rule__Group__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1012:1: ( ( ( rule__Group__Group_4__0 )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1013:1: ( ( rule__Group__Group_4__0 )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1013:1: ( ( rule__Group__Group_4__0 )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1014:1: ( rule__Group__Group_4__0 )?
            {
             before(grammarAccess.getGroupAccess().getGroup_4()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1015:1: ( rule__Group__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1015:2: rule__Group__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4__0_in_rule__Group__Group__4__Impl2052);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1025:1: rule__Group__Group__5 : rule__Group__Group__5__Impl rule__Group__Group__6 ;
    public final void rule__Group__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1029:1: ( rule__Group__Group__5__Impl rule__Group__Group__6 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1030:2: rule__Group__Group__5__Impl rule__Group__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__5__Impl_in_rule__Group__Group__52083);
            rule__Group__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__6_in_rule__Group__Group__52086);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1037:1: rule__Group__Group__5__Impl : ( ( rule__Group__Group_5__0 )? ) ;
    public final void rule__Group__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1041:1: ( ( ( rule__Group__Group_5__0 )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1042:1: ( ( rule__Group__Group_5__0 )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1042:1: ( ( rule__Group__Group_5__0 )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1043:1: ( rule__Group__Group_5__0 )?
            {
             before(grammarAccess.getGroupAccess().getGroup_5()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1044:1: ( rule__Group__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1044:2: rule__Group__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Group__Group_5__0_in_rule__Group__Group__5__Impl2113);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1054:1: rule__Group__Group__6 : rule__Group__Group__6__Impl ;
    public final void rule__Group__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1058:1: ( rule__Group__Group__6__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1059:2: rule__Group__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group__6__Impl_in_rule__Group__Group__62144);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1065:1: rule__Group__Group__6__Impl : ( '}' ) ;
    public final void rule__Group__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1069:1: ( ( '}' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1070:1: ( '}' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1070:1: ( '}' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1071:1: '}'
            {
             before(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_6()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Group__Group__6__Impl2172); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1098:1: rule__Group__Group_4__0 : rule__Group__Group_4__0__Impl rule__Group__Group_4__1 ;
    public final void rule__Group__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1102:1: ( rule__Group__Group_4__0__Impl rule__Group__Group_4__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1103:2: rule__Group__Group_4__0__Impl rule__Group__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4__0__Impl_in_rule__Group__Group_4__02217);
            rule__Group__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4__1_in_rule__Group__Group_4__02220);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1110:1: rule__Group__Group_4__0__Impl : ( 'category' ) ;
    public final void rule__Group__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1114:1: ( ( 'category' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1115:1: ( 'category' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1115:1: ( 'category' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1116:1: 'category'
            {
             before(grammarAccess.getGroupAccess().getCategoryKeyword_4_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Group__Group_4__0__Impl2248); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1129:1: rule__Group__Group_4__1 : rule__Group__Group_4__1__Impl ;
    public final void rule__Group__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1133:1: ( rule__Group__Group_4__1__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1134:2: rule__Group__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_4__1__Impl_in_rule__Group__Group_4__12279);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1140:1: rule__Group__Group_4__1__Impl : ( ( rule__Group__CategoryAssignment_4_1 ) ) ;
    public final void rule__Group__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1144:1: ( ( ( rule__Group__CategoryAssignment_4_1 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1145:1: ( ( rule__Group__CategoryAssignment_4_1 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1145:1: ( ( rule__Group__CategoryAssignment_4_1 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1146:1: ( rule__Group__CategoryAssignment_4_1 )
            {
             before(grammarAccess.getGroupAccess().getCategoryAssignment_4_1()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1147:1: ( rule__Group__CategoryAssignment_4_1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1147:2: rule__Group__CategoryAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__CategoryAssignment_4_1_in_rule__Group__Group_4__1__Impl2306);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1161:1: rule__Group__Group_5__0 : rule__Group__Group_5__0__Impl rule__Group__Group_5__1 ;
    public final void rule__Group__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1165:1: ( rule__Group__Group_5__0__Impl rule__Group__Group_5__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1166:2: rule__Group__Group_5__0__Impl rule__Group__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_5__0__Impl_in_rule__Group__Group_5__02340);
            rule__Group__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_5__1_in_rule__Group__Group_5__02343);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1173:1: rule__Group__Group_5__0__Impl : ( 'recipes' ) ;
    public final void rule__Group__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1177:1: ( ( 'recipes' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1178:1: ( 'recipes' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1178:1: ( 'recipes' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1179:1: 'recipes'
            {
             before(grammarAccess.getGroupAccess().getRecipesKeyword_5_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Group__Group_5__0__Impl2371); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1192:1: rule__Group__Group_5__1 : rule__Group__Group_5__1__Impl rule__Group__Group_5__2 ;
    public final void rule__Group__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1196:1: ( rule__Group__Group_5__1__Impl rule__Group__Group_5__2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1197:2: rule__Group__Group_5__1__Impl rule__Group__Group_5__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_5__1__Impl_in_rule__Group__Group_5__12402);
            rule__Group__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_5__2_in_rule__Group__Group_5__12405);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1204:1: rule__Group__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Group__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1208:1: ( ( '{' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1209:1: ( '{' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1209:1: ( '{' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1210:1: '{'
            {
             before(grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Group__Group_5__1__Impl2433); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1223:1: rule__Group__Group_5__2 : rule__Group__Group_5__2__Impl rule__Group__Group_5__3 ;
    public final void rule__Group__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1227:1: ( rule__Group__Group_5__2__Impl rule__Group__Group_5__3 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1228:2: rule__Group__Group_5__2__Impl rule__Group__Group_5__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_5__2__Impl_in_rule__Group__Group_5__22464);
            rule__Group__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_5__3_in_rule__Group__Group_5__22467);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1235:1: rule__Group__Group_5__2__Impl : ( ( rule__Group__RecipesAssignment_5_2 ) ) ;
    public final void rule__Group__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1239:1: ( ( ( rule__Group__RecipesAssignment_5_2 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1240:1: ( ( rule__Group__RecipesAssignment_5_2 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1240:1: ( ( rule__Group__RecipesAssignment_5_2 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1241:1: ( rule__Group__RecipesAssignment_5_2 )
            {
             before(grammarAccess.getGroupAccess().getRecipesAssignment_5_2()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1242:1: ( rule__Group__RecipesAssignment_5_2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1242:2: rule__Group__RecipesAssignment_5_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__RecipesAssignment_5_2_in_rule__Group__Group_5__2__Impl2494);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1252:1: rule__Group__Group_5__3 : rule__Group__Group_5__3__Impl rule__Group__Group_5__4 ;
    public final void rule__Group__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1256:1: ( rule__Group__Group_5__3__Impl rule__Group__Group_5__4 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1257:2: rule__Group__Group_5__3__Impl rule__Group__Group_5__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_5__3__Impl_in_rule__Group__Group_5__32524);
            rule__Group__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_5__4_in_rule__Group__Group_5__32527);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1264:1: rule__Group__Group_5__3__Impl : ( ( rule__Group__Group_5_3__0 )* ) ;
    public final void rule__Group__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1268:1: ( ( ( rule__Group__Group_5_3__0 )* ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1269:1: ( ( rule__Group__Group_5_3__0 )* )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1269:1: ( ( rule__Group__Group_5_3__0 )* )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1270:1: ( rule__Group__Group_5_3__0 )*
            {
             before(grammarAccess.getGroupAccess().getGroup_5_3()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1271:1: ( rule__Group__Group_5_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1271:2: rule__Group__Group_5_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Group__Group_5_3__0_in_rule__Group__Group_5__3__Impl2554);
            	    rule__Group__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1281:1: rule__Group__Group_5__4 : rule__Group__Group_5__4__Impl ;
    public final void rule__Group__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1285:1: ( rule__Group__Group_5__4__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1286:2: rule__Group__Group_5__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_5__4__Impl_in_rule__Group__Group_5__42585);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1292:1: rule__Group__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Group__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1296:1: ( ( '}' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1297:1: ( '}' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1297:1: ( '}' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1298:1: '}'
            {
             before(grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Group__Group_5__4__Impl2613); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1321:1: rule__Group__Group_5_3__0 : rule__Group__Group_5_3__0__Impl rule__Group__Group_5_3__1 ;
    public final void rule__Group__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1325:1: ( rule__Group__Group_5_3__0__Impl rule__Group__Group_5_3__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1326:2: rule__Group__Group_5_3__0__Impl rule__Group__Group_5_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_5_3__0__Impl_in_rule__Group__Group_5_3__02654);
            rule__Group__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_5_3__1_in_rule__Group__Group_5_3__02657);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1333:1: rule__Group__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Group__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1337:1: ( ( ',' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1338:1: ( ',' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1338:1: ( ',' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1339:1: ','
            {
             before(grammarAccess.getGroupAccess().getCommaKeyword_5_3_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Group__Group_5_3__0__Impl2685); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1352:1: rule__Group__Group_5_3__1 : rule__Group__Group_5_3__1__Impl ;
    public final void rule__Group__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1356:1: ( rule__Group__Group_5_3__1__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1357:2: rule__Group__Group_5_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__Group_5_3__1__Impl_in_rule__Group__Group_5_3__12716);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1363:1: rule__Group__Group_5_3__1__Impl : ( ( rule__Group__RecipesAssignment_5_3_1 ) ) ;
    public final void rule__Group__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1367:1: ( ( ( rule__Group__RecipesAssignment_5_3_1 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1368:1: ( ( rule__Group__RecipesAssignment_5_3_1 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1368:1: ( ( rule__Group__RecipesAssignment_5_3_1 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1369:1: ( rule__Group__RecipesAssignment_5_3_1 )
            {
             before(grammarAccess.getGroupAccess().getRecipesAssignment_5_3_1()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1370:1: ( rule__Group__RecipesAssignment_5_3_1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1370:2: rule__Group__RecipesAssignment_5_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Group__RecipesAssignment_5_3_1_in_rule__Group__Group_5_3__1__Impl2743);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1384:1: rule__Recipe__Group__0 : rule__Recipe__Group__0__Impl rule__Recipe__Group__1 ;
    public final void rule__Recipe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1388:1: ( rule__Recipe__Group__0__Impl rule__Recipe__Group__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1389:2: rule__Recipe__Group__0__Impl rule__Recipe__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__0__Impl_in_rule__Recipe__Group__02777);
            rule__Recipe__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__1_in_rule__Recipe__Group__02780);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1396:1: rule__Recipe__Group__0__Impl : ( () ) ;
    public final void rule__Recipe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1400:1: ( ( () ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1401:1: ( () )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1401:1: ( () )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1402:1: ()
            {
             before(grammarAccess.getRecipeAccess().getRecipeAction_0()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1403:1: ()
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1405:1: 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1415:1: rule__Recipe__Group__1 : rule__Recipe__Group__1__Impl rule__Recipe__Group__2 ;
    public final void rule__Recipe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1419:1: ( rule__Recipe__Group__1__Impl rule__Recipe__Group__2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1420:2: rule__Recipe__Group__1__Impl rule__Recipe__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__1__Impl_in_rule__Recipe__Group__12838);
            rule__Recipe__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__2_in_rule__Recipe__Group__12841);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1427:1: rule__Recipe__Group__1__Impl : ( 'Recipe' ) ;
    public final void rule__Recipe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1431:1: ( ( 'Recipe' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1432:1: ( 'Recipe' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1432:1: ( 'Recipe' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1433:1: 'Recipe'
            {
             before(grammarAccess.getRecipeAccess().getRecipeKeyword_1()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Recipe__Group__1__Impl2869); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1446:1: rule__Recipe__Group__2 : rule__Recipe__Group__2__Impl rule__Recipe__Group__3 ;
    public final void rule__Recipe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1450:1: ( rule__Recipe__Group__2__Impl rule__Recipe__Group__3 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1451:2: rule__Recipe__Group__2__Impl rule__Recipe__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__2__Impl_in_rule__Recipe__Group__22900);
            rule__Recipe__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__3_in_rule__Recipe__Group__22903);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1458:1: rule__Recipe__Group__2__Impl : ( ( rule__Recipe__NameAssignment_2 ) ) ;
    public final void rule__Recipe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1462:1: ( ( ( rule__Recipe__NameAssignment_2 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1463:1: ( ( rule__Recipe__NameAssignment_2 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1463:1: ( ( rule__Recipe__NameAssignment_2 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1464:1: ( rule__Recipe__NameAssignment_2 )
            {
             before(grammarAccess.getRecipeAccess().getNameAssignment_2()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1465:1: ( rule__Recipe__NameAssignment_2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1465:2: rule__Recipe__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__NameAssignment_2_in_rule__Recipe__Group__2__Impl2930);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1475:1: rule__Recipe__Group__3 : rule__Recipe__Group__3__Impl rule__Recipe__Group__4 ;
    public final void rule__Recipe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1479:1: ( rule__Recipe__Group__3__Impl rule__Recipe__Group__4 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1480:2: rule__Recipe__Group__3__Impl rule__Recipe__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__3__Impl_in_rule__Recipe__Group__32960);
            rule__Recipe__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__4_in_rule__Recipe__Group__32963);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1487:1: rule__Recipe__Group__3__Impl : ( '{' ) ;
    public final void rule__Recipe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1491:1: ( ( '{' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1492:1: ( '{' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1492:1: ( '{' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1493:1: '{'
            {
             before(grammarAccess.getRecipeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Recipe__Group__3__Impl2991); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1506:1: rule__Recipe__Group__4 : rule__Recipe__Group__4__Impl rule__Recipe__Group__5 ;
    public final void rule__Recipe__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1510:1: ( rule__Recipe__Group__4__Impl rule__Recipe__Group__5 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1511:2: rule__Recipe__Group__4__Impl rule__Recipe__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__4__Impl_in_rule__Recipe__Group__43022);
            rule__Recipe__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__5_in_rule__Recipe__Group__43025);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1518:1: rule__Recipe__Group__4__Impl : ( ( rule__Recipe__Group_4__0 )? ) ;
    public final void rule__Recipe__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1522:1: ( ( ( rule__Recipe__Group_4__0 )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1523:1: ( ( rule__Recipe__Group_4__0 )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1523:1: ( ( rule__Recipe__Group_4__0 )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1524:1: ( rule__Recipe__Group_4__0 )?
            {
             before(grammarAccess.getRecipeAccess().getGroup_4()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1525:1: ( rule__Recipe__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==33) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1525:2: rule__Recipe__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_4__0_in_rule__Recipe__Group__4__Impl3052);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1535:1: rule__Recipe__Group__5 : rule__Recipe__Group__5__Impl rule__Recipe__Group__6 ;
    public final void rule__Recipe__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1539:1: ( rule__Recipe__Group__5__Impl rule__Recipe__Group__6 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1540:2: rule__Recipe__Group__5__Impl rule__Recipe__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__5__Impl_in_rule__Recipe__Group__53083);
            rule__Recipe__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__6_in_rule__Recipe__Group__53086);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1547:1: rule__Recipe__Group__5__Impl : ( ( rule__Recipe__Group_5__0 )? ) ;
    public final void rule__Recipe__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1551:1: ( ( ( rule__Recipe__Group_5__0 )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1552:1: ( ( rule__Recipe__Group_5__0 )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1552:1: ( ( rule__Recipe__Group_5__0 )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1553:1: ( rule__Recipe__Group_5__0 )?
            {
             before(grammarAccess.getRecipeAccess().getGroup_5()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1554:1: ( rule__Recipe__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1554:2: rule__Recipe__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_5__0_in_rule__Recipe__Group__5__Impl3113);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1564:1: rule__Recipe__Group__6 : rule__Recipe__Group__6__Impl rule__Recipe__Group__7 ;
    public final void rule__Recipe__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1568:1: ( rule__Recipe__Group__6__Impl rule__Recipe__Group__7 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1569:2: rule__Recipe__Group__6__Impl rule__Recipe__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__6__Impl_in_rule__Recipe__Group__63144);
            rule__Recipe__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__7_in_rule__Recipe__Group__63147);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1576:1: rule__Recipe__Group__6__Impl : ( ( rule__Recipe__Group_6__0 )? ) ;
    public final void rule__Recipe__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1580:1: ( ( ( rule__Recipe__Group_6__0 )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1581:1: ( ( rule__Recipe__Group_6__0 )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1581:1: ( ( rule__Recipe__Group_6__0 )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1582:1: ( rule__Recipe__Group_6__0 )?
            {
             before(grammarAccess.getRecipeAccess().getGroup_6()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1583:1: ( rule__Recipe__Group_6__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1583:2: rule__Recipe__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_6__0_in_rule__Recipe__Group__6__Impl3174);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1593:1: rule__Recipe__Group__7 : rule__Recipe__Group__7__Impl rule__Recipe__Group__8 ;
    public final void rule__Recipe__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1597:1: ( rule__Recipe__Group__7__Impl rule__Recipe__Group__8 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1598:2: rule__Recipe__Group__7__Impl rule__Recipe__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__7__Impl_in_rule__Recipe__Group__73205);
            rule__Recipe__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__8_in_rule__Recipe__Group__73208);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1605:1: rule__Recipe__Group__7__Impl : ( ( rule__Recipe__Group_7__0 )? ) ;
    public final void rule__Recipe__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1609:1: ( ( ( rule__Recipe__Group_7__0 )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1610:1: ( ( rule__Recipe__Group_7__0 )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1610:1: ( ( rule__Recipe__Group_7__0 )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1611:1: ( rule__Recipe__Group_7__0 )?
            {
             before(grammarAccess.getRecipeAccess().getGroup_7()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1612:1: ( rule__Recipe__Group_7__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==36) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1612:2: rule__Recipe__Group_7__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_7__0_in_rule__Recipe__Group__7__Impl3235);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1622:1: rule__Recipe__Group__8 : rule__Recipe__Group__8__Impl ;
    public final void rule__Recipe__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1626:1: ( rule__Recipe__Group__8__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1627:2: rule__Recipe__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group__8__Impl_in_rule__Recipe__Group__83266);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1633:1: rule__Recipe__Group__8__Impl : ( '}' ) ;
    public final void rule__Recipe__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1637:1: ( ( '}' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1638:1: ( '}' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1638:1: ( '}' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1639:1: '}'
            {
             before(grammarAccess.getRecipeAccess().getRightCurlyBracketKeyword_8()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Recipe__Group__8__Impl3294); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1670:1: rule__Recipe__Group_4__0 : rule__Recipe__Group_4__0__Impl rule__Recipe__Group_4__1 ;
    public final void rule__Recipe__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1674:1: ( rule__Recipe__Group_4__0__Impl rule__Recipe__Group_4__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1675:2: rule__Recipe__Group_4__0__Impl rule__Recipe__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_4__0__Impl_in_rule__Recipe__Group_4__03343);
            rule__Recipe__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_4__1_in_rule__Recipe__Group_4__03346);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1682:1: rule__Recipe__Group_4__0__Impl : ( 'price' ) ;
    public final void rule__Recipe__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1686:1: ( ( 'price' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1687:1: ( 'price' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1687:1: ( 'price' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1688:1: 'price'
            {
             before(grammarAccess.getRecipeAccess().getPriceKeyword_4_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Recipe__Group_4__0__Impl3374); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1701:1: rule__Recipe__Group_4__1 : rule__Recipe__Group_4__1__Impl ;
    public final void rule__Recipe__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1705:1: ( rule__Recipe__Group_4__1__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1706:2: rule__Recipe__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_4__1__Impl_in_rule__Recipe__Group_4__13405);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1712:1: rule__Recipe__Group_4__1__Impl : ( ( rule__Recipe__PriceAssignment_4_1 ) ) ;
    public final void rule__Recipe__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1716:1: ( ( ( rule__Recipe__PriceAssignment_4_1 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1717:1: ( ( rule__Recipe__PriceAssignment_4_1 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1717:1: ( ( rule__Recipe__PriceAssignment_4_1 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1718:1: ( rule__Recipe__PriceAssignment_4_1 )
            {
             before(grammarAccess.getRecipeAccess().getPriceAssignment_4_1()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1719:1: ( rule__Recipe__PriceAssignment_4_1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1719:2: rule__Recipe__PriceAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__PriceAssignment_4_1_in_rule__Recipe__Group_4__1__Impl3432);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1733:1: rule__Recipe__Group_5__0 : rule__Recipe__Group_5__0__Impl rule__Recipe__Group_5__1 ;
    public final void rule__Recipe__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1737:1: ( rule__Recipe__Group_5__0__Impl rule__Recipe__Group_5__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1738:2: rule__Recipe__Group_5__0__Impl rule__Recipe__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_5__0__Impl_in_rule__Recipe__Group_5__03466);
            rule__Recipe__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_5__1_in_rule__Recipe__Group_5__03469);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1745:1: rule__Recipe__Group_5__0__Impl : ( 'amount' ) ;
    public final void rule__Recipe__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1749:1: ( ( 'amount' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1750:1: ( 'amount' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1750:1: ( 'amount' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1751:1: 'amount'
            {
             before(grammarAccess.getRecipeAccess().getAmountKeyword_5_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Recipe__Group_5__0__Impl3497); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1764:1: rule__Recipe__Group_5__1 : rule__Recipe__Group_5__1__Impl ;
    public final void rule__Recipe__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1768:1: ( rule__Recipe__Group_5__1__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1769:2: rule__Recipe__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_5__1__Impl_in_rule__Recipe__Group_5__13528);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1775:1: rule__Recipe__Group_5__1__Impl : ( ( rule__Recipe__AmountAssignment_5_1 ) ) ;
    public final void rule__Recipe__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1779:1: ( ( ( rule__Recipe__AmountAssignment_5_1 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1780:1: ( ( rule__Recipe__AmountAssignment_5_1 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1780:1: ( ( rule__Recipe__AmountAssignment_5_1 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1781:1: ( rule__Recipe__AmountAssignment_5_1 )
            {
             before(grammarAccess.getRecipeAccess().getAmountAssignment_5_1()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1782:1: ( rule__Recipe__AmountAssignment_5_1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1782:2: rule__Recipe__AmountAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__AmountAssignment_5_1_in_rule__Recipe__Group_5__1__Impl3555);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1796:1: rule__Recipe__Group_6__0 : rule__Recipe__Group_6__0__Impl rule__Recipe__Group_6__1 ;
    public final void rule__Recipe__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1800:1: ( rule__Recipe__Group_6__0__Impl rule__Recipe__Group_6__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1801:2: rule__Recipe__Group_6__0__Impl rule__Recipe__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_6__0__Impl_in_rule__Recipe__Group_6__03589);
            rule__Recipe__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_6__1_in_rule__Recipe__Group_6__03592);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1808:1: rule__Recipe__Group_6__0__Impl : ( 'amountType' ) ;
    public final void rule__Recipe__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1812:1: ( ( 'amountType' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1813:1: ( 'amountType' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1813:1: ( 'amountType' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1814:1: 'amountType'
            {
             before(grammarAccess.getRecipeAccess().getAmountTypeKeyword_6_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Recipe__Group_6__0__Impl3620); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1827:1: rule__Recipe__Group_6__1 : rule__Recipe__Group_6__1__Impl ;
    public final void rule__Recipe__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1831:1: ( rule__Recipe__Group_6__1__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1832:2: rule__Recipe__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_6__1__Impl_in_rule__Recipe__Group_6__13651);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1838:1: rule__Recipe__Group_6__1__Impl : ( ( rule__Recipe__AmountTypeAssignment_6_1 ) ) ;
    public final void rule__Recipe__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1842:1: ( ( ( rule__Recipe__AmountTypeAssignment_6_1 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1843:1: ( ( rule__Recipe__AmountTypeAssignment_6_1 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1843:1: ( ( rule__Recipe__AmountTypeAssignment_6_1 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1844:1: ( rule__Recipe__AmountTypeAssignment_6_1 )
            {
             before(grammarAccess.getRecipeAccess().getAmountTypeAssignment_6_1()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1845:1: ( rule__Recipe__AmountTypeAssignment_6_1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1845:2: rule__Recipe__AmountTypeAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__AmountTypeAssignment_6_1_in_rule__Recipe__Group_6__1__Impl3678);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1859:1: rule__Recipe__Group_7__0 : rule__Recipe__Group_7__0__Impl rule__Recipe__Group_7__1 ;
    public final void rule__Recipe__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1863:1: ( rule__Recipe__Group_7__0__Impl rule__Recipe__Group_7__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1864:2: rule__Recipe__Group_7__0__Impl rule__Recipe__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_7__0__Impl_in_rule__Recipe__Group_7__03712);
            rule__Recipe__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_7__1_in_rule__Recipe__Group_7__03715);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1871:1: rule__Recipe__Group_7__0__Impl : ( 'ingredients' ) ;
    public final void rule__Recipe__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1875:1: ( ( 'ingredients' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1876:1: ( 'ingredients' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1876:1: ( 'ingredients' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1877:1: 'ingredients'
            {
             before(grammarAccess.getRecipeAccess().getIngredientsKeyword_7_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Recipe__Group_7__0__Impl3743); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1890:1: rule__Recipe__Group_7__1 : rule__Recipe__Group_7__1__Impl rule__Recipe__Group_7__2 ;
    public final void rule__Recipe__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1894:1: ( rule__Recipe__Group_7__1__Impl rule__Recipe__Group_7__2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1895:2: rule__Recipe__Group_7__1__Impl rule__Recipe__Group_7__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_7__1__Impl_in_rule__Recipe__Group_7__13774);
            rule__Recipe__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_7__2_in_rule__Recipe__Group_7__13777);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1902:1: rule__Recipe__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Recipe__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1906:1: ( ( '{' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1907:1: ( '{' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1907:1: ( '{' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1908:1: '{'
            {
             before(grammarAccess.getRecipeAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Recipe__Group_7__1__Impl3805); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1921:1: rule__Recipe__Group_7__2 : rule__Recipe__Group_7__2__Impl rule__Recipe__Group_7__3 ;
    public final void rule__Recipe__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1925:1: ( rule__Recipe__Group_7__2__Impl rule__Recipe__Group_7__3 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1926:2: rule__Recipe__Group_7__2__Impl rule__Recipe__Group_7__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_7__2__Impl_in_rule__Recipe__Group_7__23836);
            rule__Recipe__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_7__3_in_rule__Recipe__Group_7__23839);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1933:1: rule__Recipe__Group_7__2__Impl : ( ( rule__Recipe__IngredientsAssignment_7_2 ) ) ;
    public final void rule__Recipe__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1937:1: ( ( ( rule__Recipe__IngredientsAssignment_7_2 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1938:1: ( ( rule__Recipe__IngredientsAssignment_7_2 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1938:1: ( ( rule__Recipe__IngredientsAssignment_7_2 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1939:1: ( rule__Recipe__IngredientsAssignment_7_2 )
            {
             before(grammarAccess.getRecipeAccess().getIngredientsAssignment_7_2()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1940:1: ( rule__Recipe__IngredientsAssignment_7_2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1940:2: rule__Recipe__IngredientsAssignment_7_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__IngredientsAssignment_7_2_in_rule__Recipe__Group_7__2__Impl3866);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1950:1: rule__Recipe__Group_7__3 : rule__Recipe__Group_7__3__Impl rule__Recipe__Group_7__4 ;
    public final void rule__Recipe__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1954:1: ( rule__Recipe__Group_7__3__Impl rule__Recipe__Group_7__4 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1955:2: rule__Recipe__Group_7__3__Impl rule__Recipe__Group_7__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_7__3__Impl_in_rule__Recipe__Group_7__33896);
            rule__Recipe__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_7__4_in_rule__Recipe__Group_7__33899);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1962:1: rule__Recipe__Group_7__3__Impl : ( ( rule__Recipe__Group_7_3__0 )* ) ;
    public final void rule__Recipe__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1966:1: ( ( ( rule__Recipe__Group_7_3__0 )* ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1967:1: ( ( rule__Recipe__Group_7_3__0 )* )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1967:1: ( ( rule__Recipe__Group_7_3__0 )* )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1968:1: ( rule__Recipe__Group_7_3__0 )*
            {
             before(grammarAccess.getRecipeAccess().getGroup_7_3()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1969:1: ( rule__Recipe__Group_7_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1969:2: rule__Recipe__Group_7_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_7_3__0_in_rule__Recipe__Group_7__3__Impl3926);
            	    rule__Recipe__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1979:1: rule__Recipe__Group_7__4 : rule__Recipe__Group_7__4__Impl ;
    public final void rule__Recipe__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1983:1: ( rule__Recipe__Group_7__4__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1984:2: rule__Recipe__Group_7__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_7__4__Impl_in_rule__Recipe__Group_7__43957);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1990:1: rule__Recipe__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Recipe__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1994:1: ( ( '}' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1995:1: ( '}' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1995:1: ( '}' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:1996:1: '}'
            {
             before(grammarAccess.getRecipeAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Recipe__Group_7__4__Impl3985); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2019:1: rule__Recipe__Group_7_3__0 : rule__Recipe__Group_7_3__0__Impl rule__Recipe__Group_7_3__1 ;
    public final void rule__Recipe__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2023:1: ( rule__Recipe__Group_7_3__0__Impl rule__Recipe__Group_7_3__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2024:2: rule__Recipe__Group_7_3__0__Impl rule__Recipe__Group_7_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_7_3__0__Impl_in_rule__Recipe__Group_7_3__04026);
            rule__Recipe__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_7_3__1_in_rule__Recipe__Group_7_3__04029);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2031:1: rule__Recipe__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Recipe__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2035:1: ( ( ',' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2036:1: ( ',' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2036:1: ( ',' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2037:1: ','
            {
             before(grammarAccess.getRecipeAccess().getCommaKeyword_7_3_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Recipe__Group_7_3__0__Impl4057); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2050:1: rule__Recipe__Group_7_3__1 : rule__Recipe__Group_7_3__1__Impl ;
    public final void rule__Recipe__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2054:1: ( rule__Recipe__Group_7_3__1__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2055:2: rule__Recipe__Group_7_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__Group_7_3__1__Impl_in_rule__Recipe__Group_7_3__14088);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2061:1: rule__Recipe__Group_7_3__1__Impl : ( ( rule__Recipe__IngredientsAssignment_7_3_1 ) ) ;
    public final void rule__Recipe__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2065:1: ( ( ( rule__Recipe__IngredientsAssignment_7_3_1 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2066:1: ( ( rule__Recipe__IngredientsAssignment_7_3_1 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2066:1: ( ( rule__Recipe__IngredientsAssignment_7_3_1 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2067:1: ( rule__Recipe__IngredientsAssignment_7_3_1 )
            {
             before(grammarAccess.getRecipeAccess().getIngredientsAssignment_7_3_1()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2068:1: ( rule__Recipe__IngredientsAssignment_7_3_1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2068:2: rule__Recipe__IngredientsAssignment_7_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Recipe__IngredientsAssignment_7_3_1_in_rule__Recipe__Group_7_3__1__Impl4115);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2082:1: rule__EBigDecimal__Group__0 : rule__EBigDecimal__Group__0__Impl rule__EBigDecimal__Group__1 ;
    public final void rule__EBigDecimal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2086:1: ( rule__EBigDecimal__Group__0__Impl rule__EBigDecimal__Group__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2087:2: rule__EBigDecimal__Group__0__Impl rule__EBigDecimal__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBigDecimal__Group__0__Impl_in_rule__EBigDecimal__Group__04149);
            rule__EBigDecimal__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EBigDecimal__Group__1_in_rule__EBigDecimal__Group__04152);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2094:1: rule__EBigDecimal__Group__0__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EBigDecimal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2098:1: ( ( ( RULE_INT )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2099:1: ( ( RULE_INT )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2099:1: ( ( RULE_INT )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2100:1: ( RULE_INT )?
            {
             before(grammarAccess.getEBigDecimalAccess().getINTTerminalRuleCall_0()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2101:1: ( RULE_INT )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2101:3: RULE_INT
                    {
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EBigDecimal__Group__0__Impl4180); 

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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2111:1: rule__EBigDecimal__Group__1 : rule__EBigDecimal__Group__1__Impl rule__EBigDecimal__Group__2 ;
    public final void rule__EBigDecimal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2115:1: ( rule__EBigDecimal__Group__1__Impl rule__EBigDecimal__Group__2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2116:2: rule__EBigDecimal__Group__1__Impl rule__EBigDecimal__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBigDecimal__Group__1__Impl_in_rule__EBigDecimal__Group__14211);
            rule__EBigDecimal__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EBigDecimal__Group__2_in_rule__EBigDecimal__Group__14214);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2123:1: rule__EBigDecimal__Group__1__Impl : ( '.' ) ;
    public final void rule__EBigDecimal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2127:1: ( ( '.' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2128:1: ( '.' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2128:1: ( '.' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2129:1: '.'
            {
             before(grammarAccess.getEBigDecimalAccess().getFullStopKeyword_1()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__EBigDecimal__Group__1__Impl4242); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2142:1: rule__EBigDecimal__Group__2 : rule__EBigDecimal__Group__2__Impl ;
    public final void rule__EBigDecimal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2146:1: ( rule__EBigDecimal__Group__2__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2147:2: rule__EBigDecimal__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EBigDecimal__Group__2__Impl_in_rule__EBigDecimal__Group__24273);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2153:1: rule__EBigDecimal__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__EBigDecimal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2157:1: ( ( RULE_INT ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2158:1: ( RULE_INT )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2158:1: ( RULE_INT )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2159:1: RULE_INT
            {
             before(grammarAccess.getEBigDecimalAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EBigDecimal__Group__2__Impl4300); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2176:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2180:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2181:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__04335);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__04338);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2188:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2192:1: ( ( ( '-' )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2193:1: ( ( '-' )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2193:1: ( ( '-' )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2194:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2195:1: ( '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==38) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2196:2: '-'
                    {
                    match(input,38,FollowSets000.FOLLOW_38_in_rule__EInt__Group__0__Impl4367); 

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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2207:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2211:1: ( rule__EInt__Group__1__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2212:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__14400);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2218:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2222:1: ( ( RULE_INT ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2223:1: ( RULE_INT )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2223:1: ( RULE_INT )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2224:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl4427); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2239:1: rule__Ingredient__Group__0 : rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1 ;
    public final void rule__Ingredient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2243:1: ( rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2244:2: rule__Ingredient__Group__0__Impl rule__Ingredient__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__0__Impl_in_rule__Ingredient__Group__04460);
            rule__Ingredient__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__1_in_rule__Ingredient__Group__04463);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2251:1: rule__Ingredient__Group__0__Impl : ( () ) ;
    public final void rule__Ingredient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2255:1: ( ( () ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2256:1: ( () )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2256:1: ( () )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2257:1: ()
            {
             before(grammarAccess.getIngredientAccess().getIngredientAction_0()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2258:1: ()
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2260:1: 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2270:1: rule__Ingredient__Group__1 : rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2 ;
    public final void rule__Ingredient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2274:1: ( rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2275:2: rule__Ingredient__Group__1__Impl rule__Ingredient__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__1__Impl_in_rule__Ingredient__Group__14521);
            rule__Ingredient__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__2_in_rule__Ingredient__Group__14524);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2282:1: rule__Ingredient__Group__1__Impl : ( 'Ingredient' ) ;
    public final void rule__Ingredient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2286:1: ( ( 'Ingredient' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2287:1: ( 'Ingredient' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2287:1: ( 'Ingredient' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2288:1: 'Ingredient'
            {
             before(grammarAccess.getIngredientAccess().getIngredientKeyword_1()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__Ingredient__Group__1__Impl4552); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2301:1: rule__Ingredient__Group__2 : rule__Ingredient__Group__2__Impl rule__Ingredient__Group__3 ;
    public final void rule__Ingredient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2305:1: ( rule__Ingredient__Group__2__Impl rule__Ingredient__Group__3 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2306:2: rule__Ingredient__Group__2__Impl rule__Ingredient__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__2__Impl_in_rule__Ingredient__Group__24583);
            rule__Ingredient__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__3_in_rule__Ingredient__Group__24586);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2313:1: rule__Ingredient__Group__2__Impl : ( ( rule__Ingredient__NameAssignment_2 ) ) ;
    public final void rule__Ingredient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2317:1: ( ( ( rule__Ingredient__NameAssignment_2 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2318:1: ( ( rule__Ingredient__NameAssignment_2 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2318:1: ( ( rule__Ingredient__NameAssignment_2 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2319:1: ( rule__Ingredient__NameAssignment_2 )
            {
             before(grammarAccess.getIngredientAccess().getNameAssignment_2()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2320:1: ( rule__Ingredient__NameAssignment_2 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2320:2: rule__Ingredient__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__NameAssignment_2_in_rule__Ingredient__Group__2__Impl4613);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2330:1: rule__Ingredient__Group__3 : rule__Ingredient__Group__3__Impl rule__Ingredient__Group__4 ;
    public final void rule__Ingredient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2334:1: ( rule__Ingredient__Group__3__Impl rule__Ingredient__Group__4 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2335:2: rule__Ingredient__Group__3__Impl rule__Ingredient__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__3__Impl_in_rule__Ingredient__Group__34643);
            rule__Ingredient__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__4_in_rule__Ingredient__Group__34646);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2342:1: rule__Ingredient__Group__3__Impl : ( '{' ) ;
    public final void rule__Ingredient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2346:1: ( ( '{' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2347:1: ( '{' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2347:1: ( '{' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2348:1: '{'
            {
             before(grammarAccess.getIngredientAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Ingredient__Group__3__Impl4674); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2361:1: rule__Ingredient__Group__4 : rule__Ingredient__Group__4__Impl rule__Ingredient__Group__5 ;
    public final void rule__Ingredient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2365:1: ( rule__Ingredient__Group__4__Impl rule__Ingredient__Group__5 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2366:2: rule__Ingredient__Group__4__Impl rule__Ingredient__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__4__Impl_in_rule__Ingredient__Group__44705);
            rule__Ingredient__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__5_in_rule__Ingredient__Group__44708);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2373:1: rule__Ingredient__Group__4__Impl : ( ( rule__Ingredient__Group_4__0 )? ) ;
    public final void rule__Ingredient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2377:1: ( ( ( rule__Ingredient__Group_4__0 )? ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2378:1: ( ( rule__Ingredient__Group_4__0 )? )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2378:1: ( ( rule__Ingredient__Group_4__0 )? )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2379:1: ( rule__Ingredient__Group_4__0 )?
            {
             before(grammarAccess.getIngredientAccess().getGroup_4()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2380:1: ( rule__Ingredient__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==40) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2380:2: rule__Ingredient__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group_4__0_in_rule__Ingredient__Group__4__Impl4735);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2390:1: rule__Ingredient__Group__5 : rule__Ingredient__Group__5__Impl ;
    public final void rule__Ingredient__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2394:1: ( rule__Ingredient__Group__5__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2395:2: rule__Ingredient__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group__5__Impl_in_rule__Ingredient__Group__54766);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2401:1: rule__Ingredient__Group__5__Impl : ( '}' ) ;
    public final void rule__Ingredient__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2405:1: ( ( '}' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2406:1: ( '}' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2406:1: ( '}' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2407:1: '}'
            {
             before(grammarAccess.getIngredientAccess().getRightCurlyBracketKeyword_5()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Ingredient__Group__5__Impl4794); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2432:1: rule__Ingredient__Group_4__0 : rule__Ingredient__Group_4__0__Impl rule__Ingredient__Group_4__1 ;
    public final void rule__Ingredient__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2436:1: ( rule__Ingredient__Group_4__0__Impl rule__Ingredient__Group_4__1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2437:2: rule__Ingredient__Group_4__0__Impl rule__Ingredient__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group_4__0__Impl_in_rule__Ingredient__Group_4__04837);
            rule__Ingredient__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group_4__1_in_rule__Ingredient__Group_4__04840);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2444:1: rule__Ingredient__Group_4__0__Impl : ( 'spiciness' ) ;
    public final void rule__Ingredient__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2448:1: ( ( 'spiciness' ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2449:1: ( 'spiciness' )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2449:1: ( 'spiciness' )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2450:1: 'spiciness'
            {
             before(grammarAccess.getIngredientAccess().getSpicinessKeyword_4_0()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__Ingredient__Group_4__0__Impl4868); 
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2463:1: rule__Ingredient__Group_4__1 : rule__Ingredient__Group_4__1__Impl ;
    public final void rule__Ingredient__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2467:1: ( rule__Ingredient__Group_4__1__Impl )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2468:2: rule__Ingredient__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__Group_4__1__Impl_in_rule__Ingredient__Group_4__14899);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2474:1: rule__Ingredient__Group_4__1__Impl : ( ( rule__Ingredient__SpicinessAssignment_4_1 ) ) ;
    public final void rule__Ingredient__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2478:1: ( ( ( rule__Ingredient__SpicinessAssignment_4_1 ) ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2479:1: ( ( rule__Ingredient__SpicinessAssignment_4_1 ) )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2479:1: ( ( rule__Ingredient__SpicinessAssignment_4_1 ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2480:1: ( rule__Ingredient__SpicinessAssignment_4_1 )
            {
             before(grammarAccess.getIngredientAccess().getSpicinessAssignment_4_1()); 
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2481:1: ( rule__Ingredient__SpicinessAssignment_4_1 )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2481:2: rule__Ingredient__SpicinessAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Ingredient__SpicinessAssignment_4_1_in_rule__Ingredient__Group_4__1__Impl4926);
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


    // $ANTLR start "rule__Menu__NameAssignment_2"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2496:1: rule__Menu__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Menu__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2500:1: ( ( ruleEString ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2501:1: ( ruleEString )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2501:1: ( ruleEString )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2502:1: ruleEString
            {
             before(grammarAccess.getMenuAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Menu__NameAssignment_24965);
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


    // $ANTLR start "rule__Menu__GroupsAssignment_4_2"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2511:1: rule__Menu__GroupsAssignment_4_2 : ( ruleGroup ) ;
    public final void rule__Menu__GroupsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2515:1: ( ( ruleGroup ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2516:1: ( ruleGroup )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2516:1: ( ruleGroup )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2517:1: ruleGroup
            {
             before(grammarAccess.getMenuAccess().getGroupsGroupParserRuleCall_4_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_rule__Menu__GroupsAssignment_4_24996);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getMenuAccess().getGroupsGroupParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Menu__GroupsAssignment_4_2"


    // $ANTLR start "rule__Menu__GroupsAssignment_4_3_1"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2526:1: rule__Menu__GroupsAssignment_4_3_1 : ( ruleGroup ) ;
    public final void rule__Menu__GroupsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2530:1: ( ( ruleGroup ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2531:1: ( ruleGroup )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2531:1: ( ruleGroup )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2532:1: ruleGroup
            {
             before(grammarAccess.getMenuAccess().getGroupsGroupParserRuleCall_4_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_rule__Menu__GroupsAssignment_4_3_15027);
            ruleGroup();

            state._fsp--;

             after(grammarAccess.getMenuAccess().getGroupsGroupParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Menu__GroupsAssignment_4_3_1"


    // $ANTLR start "rule__Group__NameAssignment_2"
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2541:1: rule__Group__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Group__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2545:1: ( ( ruleEString ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2546:1: ( ruleEString )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2546:1: ( ruleEString )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2547:1: ruleEString
            {
             before(grammarAccess.getGroupAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Group__NameAssignment_25058);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2556:1: rule__Group__CategoryAssignment_4_1 : ( ruleCategory ) ;
    public final void rule__Group__CategoryAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2560:1: ( ( ruleCategory ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2561:1: ( ruleCategory )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2561:1: ( ruleCategory )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2562:1: ruleCategory
            {
             before(grammarAccess.getGroupAccess().getCategoryCategoryEnumRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleCategory_in_rule__Group__CategoryAssignment_4_15089);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2571:1: rule__Group__RecipesAssignment_5_2 : ( ruleRecipe ) ;
    public final void rule__Group__RecipesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2575:1: ( ( ruleRecipe ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2576:1: ( ruleRecipe )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2576:1: ( ruleRecipe )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2577:1: ruleRecipe
            {
             before(grammarAccess.getGroupAccess().getRecipesRecipeParserRuleCall_5_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRecipe_in_rule__Group__RecipesAssignment_5_25120);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2586:1: rule__Group__RecipesAssignment_5_3_1 : ( ruleRecipe ) ;
    public final void rule__Group__RecipesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2590:1: ( ( ruleRecipe ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2591:1: ( ruleRecipe )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2591:1: ( ruleRecipe )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2592:1: ruleRecipe
            {
             before(grammarAccess.getGroupAccess().getRecipesRecipeParserRuleCall_5_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleRecipe_in_rule__Group__RecipesAssignment_5_3_15151);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2601:1: rule__Recipe__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Recipe__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2605:1: ( ( ruleEString ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2606:1: ( ruleEString )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2606:1: ( ruleEString )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2607:1: ruleEString
            {
             before(grammarAccess.getRecipeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Recipe__NameAssignment_25182);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2616:1: rule__Recipe__PriceAssignment_4_1 : ( ruleEBigDecimal ) ;
    public final void rule__Recipe__PriceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2620:1: ( ( ruleEBigDecimal ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2621:1: ( ruleEBigDecimal )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2621:1: ( ruleEBigDecimal )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2622:1: ruleEBigDecimal
            {
             before(grammarAccess.getRecipeAccess().getPriceEBigDecimalParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBigDecimal_in_rule__Recipe__PriceAssignment_4_15213);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2631:1: rule__Recipe__AmountAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__Recipe__AmountAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2635:1: ( ( ruleEInt ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2636:1: ( ruleEInt )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2636:1: ( ruleEInt )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2637:1: ruleEInt
            {
             before(grammarAccess.getRecipeAccess().getAmountEIntParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Recipe__AmountAssignment_5_15244);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2646:1: rule__Recipe__AmountTypeAssignment_6_1 : ( ruleAmountType ) ;
    public final void rule__Recipe__AmountTypeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2650:1: ( ( ruleAmountType ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2651:1: ( ruleAmountType )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2651:1: ( ruleAmountType )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2652:1: ruleAmountType
            {
             before(grammarAccess.getRecipeAccess().getAmountTypeAmountTypeEnumRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAmountType_in_rule__Recipe__AmountTypeAssignment_6_15275);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2661:1: rule__Recipe__IngredientsAssignment_7_2 : ( ruleIngredient ) ;
    public final void rule__Recipe__IngredientsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2665:1: ( ( ruleIngredient ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2666:1: ( ruleIngredient )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2666:1: ( ruleIngredient )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2667:1: ruleIngredient
            {
             before(grammarAccess.getRecipeAccess().getIngredientsIngredientParserRuleCall_7_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIngredient_in_rule__Recipe__IngredientsAssignment_7_25306);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2676:1: rule__Recipe__IngredientsAssignment_7_3_1 : ( ruleIngredient ) ;
    public final void rule__Recipe__IngredientsAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2680:1: ( ( ruleIngredient ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2681:1: ( ruleIngredient )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2681:1: ( ruleIngredient )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2682:1: ruleIngredient
            {
             before(grammarAccess.getRecipeAccess().getIngredientsIngredientParserRuleCall_7_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleIngredient_in_rule__Recipe__IngredientsAssignment_7_3_15337);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2691:1: rule__Ingredient__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Ingredient__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2695:1: ( ( ruleEString ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2696:1: ( ruleEString )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2696:1: ( ruleEString )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2697:1: ruleEString
            {
             before(grammarAccess.getIngredientAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Ingredient__NameAssignment_25368);
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
    // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2706:1: rule__Ingredient__SpicinessAssignment_4_1 : ( ruleSpiciness ) ;
    public final void rule__Ingredient__SpicinessAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2710:1: ( ( ruleSpiciness ) )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2711:1: ( ruleSpiciness )
            {
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2711:1: ( ruleSpiciness )
            // ../com.opcoach.restaurant.menu.xtext.ui/src-gen/com/opcoach/restaurant/menu/xtext/ui/contentassist/antlr/internal/InternalMenuDsl.g:2712:1: ruleSpiciness
            {
             before(grammarAccess.getIngredientAccess().getSpicinessSpicinessEnumRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSpiciness_in_rule__Ingredient__SpicinessAssignment_4_15399);
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
        public static final BitSet FOLLOW_rule__Menu__Group__3__Impl_in_rule__Menu__Group__31146 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_rule__Menu__Group__4_in_rule__Menu__Group__31149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Menu__Group__3__Impl1177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Menu__Group__4__Impl_in_rule__Menu__Group__41208 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_rule__Menu__Group__5_in_rule__Menu__Group__41211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Menu__Group_4__0_in_rule__Menu__Group__4__Impl1238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Menu__Group__5__Impl_in_rule__Menu__Group__51269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Menu__Group__5__Impl1297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Menu__Group_4__0__Impl_in_rule__Menu__Group_4__01340 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Menu__Group_4__1_in_rule__Menu__Group_4__01343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Menu__Group_4__0__Impl1371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Menu__Group_4__1__Impl_in_rule__Menu__Group_4__11402 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Menu__Group_4__2_in_rule__Menu__Group_4__11405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Menu__Group_4__1__Impl1433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Menu__Group_4__2__Impl_in_rule__Menu__Group_4__21464 = new BitSet(new long[]{0x0000000014000000L});
        public static final BitSet FOLLOW_rule__Menu__Group_4__3_in_rule__Menu__Group_4__21467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Menu__GroupsAssignment_4_2_in_rule__Menu__Group_4__2__Impl1494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Menu__Group_4__3__Impl_in_rule__Menu__Group_4__31524 = new BitSet(new long[]{0x0000000014000000L});
        public static final BitSet FOLLOW_rule__Menu__Group_4__4_in_rule__Menu__Group_4__31527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Menu__Group_4_3__0_in_rule__Menu__Group_4__3__Impl1554 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_rule__Menu__Group_4__4__Impl_in_rule__Menu__Group_4__41585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Menu__Group_4__4__Impl1613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Menu__Group_4_3__0__Impl_in_rule__Menu__Group_4_3__01654 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Menu__Group_4_3__1_in_rule__Menu__Group_4_3__01657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Menu__Group_4_3__0__Impl1685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Menu__Group_4_3__1__Impl_in_rule__Menu__Group_4_3__11716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Menu__GroupsAssignment_4_3_1_in_rule__Menu__Group_4_3__1__Impl1743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__0__Impl_in_rule__Group__Group__01777 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Group__Group__1_in_rule__Group__Group__01780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__1__Impl_in_rule__Group__Group__11838 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Group__Group__2_in_rule__Group__Group__11841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Group__Group__1__Impl1869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__2__Impl_in_rule__Group__Group__21900 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Group__Group__3_in_rule__Group__Group__21903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__NameAssignment_2_in_rule__Group__Group__2__Impl1930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__3__Impl_in_rule__Group__Group__31960 = new BitSet(new long[]{0x00000000C4000000L});
        public static final BitSet FOLLOW_rule__Group__Group__4_in_rule__Group__Group__31963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Group__Group__3__Impl1991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__4__Impl_in_rule__Group__Group__42022 = new BitSet(new long[]{0x00000000C4000000L});
        public static final BitSet FOLLOW_rule__Group__Group__5_in_rule__Group__Group__42025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_4__0_in_rule__Group__Group__4__Impl2052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__5__Impl_in_rule__Group__Group__52083 = new BitSet(new long[]{0x00000000C4000000L});
        public static final BitSet FOLLOW_rule__Group__Group__6_in_rule__Group__Group__52086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_5__0_in_rule__Group__Group__5__Impl2113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group__6__Impl_in_rule__Group__Group__62144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Group__Group__6__Impl2172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_4__0__Impl_in_rule__Group__Group_4__02217 = new BitSet(new long[]{0x000000000000F800L});
        public static final BitSet FOLLOW_rule__Group__Group_4__1_in_rule__Group__Group_4__02220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Group__Group_4__0__Impl2248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_4__1__Impl_in_rule__Group__Group_4__12279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__CategoryAssignment_4_1_in_rule__Group__Group_4__1__Impl2306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_5__0__Impl_in_rule__Group__Group_5__02340 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Group__Group_5__1_in_rule__Group__Group_5__02343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Group__Group_5__0__Impl2371 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_5__1__Impl_in_rule__Group__Group_5__12402 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Group__Group_5__2_in_rule__Group__Group_5__12405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Group__Group_5__1__Impl2433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_5__2__Impl_in_rule__Group__Group_5__22464 = new BitSet(new long[]{0x0000000014000000L});
        public static final BitSet FOLLOW_rule__Group__Group_5__3_in_rule__Group__Group_5__22467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__RecipesAssignment_5_2_in_rule__Group__Group_5__2__Impl2494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_5__3__Impl_in_rule__Group__Group_5__32524 = new BitSet(new long[]{0x0000000014000000L});
        public static final BitSet FOLLOW_rule__Group__Group_5__4_in_rule__Group__Group_5__32527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_5_3__0_in_rule__Group__Group_5__3__Impl2554 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_rule__Group__Group_5__4__Impl_in_rule__Group__Group_5__42585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Group__Group_5__4__Impl2613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_5_3__0__Impl_in_rule__Group__Group_5_3__02654 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Group__Group_5_3__1_in_rule__Group__Group_5_3__02657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Group__Group_5_3__0__Impl2685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__Group_5_3__1__Impl_in_rule__Group__Group_5_3__12716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Group__RecipesAssignment_5_3_1_in_rule__Group__Group_5_3__1__Impl2743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group__0__Impl_in_rule__Recipe__Group__02777 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Recipe__Group__1_in_rule__Recipe__Group__02780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group__1__Impl_in_rule__Recipe__Group__12838 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Recipe__Group__2_in_rule__Recipe__Group__12841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Recipe__Group__1__Impl2869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group__2__Impl_in_rule__Recipe__Group__22900 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Recipe__Group__3_in_rule__Recipe__Group__22903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__NameAssignment_2_in_rule__Recipe__Group__2__Impl2930 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group__3__Impl_in_rule__Recipe__Group__32960 = new BitSet(new long[]{0x0000001E04000000L});
        public static final BitSet FOLLOW_rule__Recipe__Group__4_in_rule__Recipe__Group__32963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Recipe__Group__3__Impl2991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group__4__Impl_in_rule__Recipe__Group__43022 = new BitSet(new long[]{0x0000001E04000000L});
        public static final BitSet FOLLOW_rule__Recipe__Group__5_in_rule__Recipe__Group__43025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_4__0_in_rule__Recipe__Group__4__Impl3052 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group__5__Impl_in_rule__Recipe__Group__53083 = new BitSet(new long[]{0x0000001E04000000L});
        public static final BitSet FOLLOW_rule__Recipe__Group__6_in_rule__Recipe__Group__53086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_5__0_in_rule__Recipe__Group__5__Impl3113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group__6__Impl_in_rule__Recipe__Group__63144 = new BitSet(new long[]{0x0000001E04000000L});
        public static final BitSet FOLLOW_rule__Recipe__Group__7_in_rule__Recipe__Group__63147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_6__0_in_rule__Recipe__Group__6__Impl3174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group__7__Impl_in_rule__Recipe__Group__73205 = new BitSet(new long[]{0x0000001E04000000L});
        public static final BitSet FOLLOW_rule__Recipe__Group__8_in_rule__Recipe__Group__73208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_7__0_in_rule__Recipe__Group__7__Impl3235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group__8__Impl_in_rule__Recipe__Group__83266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Recipe__Group__8__Impl3294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_4__0__Impl_in_rule__Recipe__Group_4__03343 = new BitSet(new long[]{0x0000002000000040L});
        public static final BitSet FOLLOW_rule__Recipe__Group_4__1_in_rule__Recipe__Group_4__03346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Recipe__Group_4__0__Impl3374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_4__1__Impl_in_rule__Recipe__Group_4__13405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__PriceAssignment_4_1_in_rule__Recipe__Group_4__1__Impl3432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_5__0__Impl_in_rule__Recipe__Group_5__03466 = new BitSet(new long[]{0x0000004000000040L});
        public static final BitSet FOLLOW_rule__Recipe__Group_5__1_in_rule__Recipe__Group_5__03469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Recipe__Group_5__0__Impl3497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_5__1__Impl_in_rule__Recipe__Group_5__13528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__AmountAssignment_5_1_in_rule__Recipe__Group_5__1__Impl3555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_6__0__Impl_in_rule__Recipe__Group_6__03589 = new BitSet(new long[]{0x00000000000F0000L});
        public static final BitSet FOLLOW_rule__Recipe__Group_6__1_in_rule__Recipe__Group_6__03592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Recipe__Group_6__0__Impl3620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_6__1__Impl_in_rule__Recipe__Group_6__13651 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__AmountTypeAssignment_6_1_in_rule__Recipe__Group_6__1__Impl3678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_7__0__Impl_in_rule__Recipe__Group_7__03712 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Recipe__Group_7__1_in_rule__Recipe__Group_7__03715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Recipe__Group_7__0__Impl3743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_7__1__Impl_in_rule__Recipe__Group_7__13774 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__Recipe__Group_7__2_in_rule__Recipe__Group_7__13777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Recipe__Group_7__1__Impl3805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_7__2__Impl_in_rule__Recipe__Group_7__23836 = new BitSet(new long[]{0x0000000014000000L});
        public static final BitSet FOLLOW_rule__Recipe__Group_7__3_in_rule__Recipe__Group_7__23839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__IngredientsAssignment_7_2_in_rule__Recipe__Group_7__2__Impl3866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_7__3__Impl_in_rule__Recipe__Group_7__33896 = new BitSet(new long[]{0x0000000014000000L});
        public static final BitSet FOLLOW_rule__Recipe__Group_7__4_in_rule__Recipe__Group_7__33899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_7_3__0_in_rule__Recipe__Group_7__3__Impl3926 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_7__4__Impl_in_rule__Recipe__Group_7__43957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Recipe__Group_7__4__Impl3985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_7_3__0__Impl_in_rule__Recipe__Group_7_3__04026 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__Recipe__Group_7_3__1_in_rule__Recipe__Group_7_3__04029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Recipe__Group_7_3__0__Impl4057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__Group_7_3__1__Impl_in_rule__Recipe__Group_7_3__14088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Recipe__IngredientsAssignment_7_3_1_in_rule__Recipe__Group_7_3__1__Impl4115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBigDecimal__Group__0__Impl_in_rule__EBigDecimal__Group__04149 = new BitSet(new long[]{0x0000002000000040L});
        public static final BitSet FOLLOW_rule__EBigDecimal__Group__1_in_rule__EBigDecimal__Group__04152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EBigDecimal__Group__0__Impl4180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBigDecimal__Group__1__Impl_in_rule__EBigDecimal__Group__14211 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__EBigDecimal__Group__2_in_rule__EBigDecimal__Group__14214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__EBigDecimal__Group__1__Impl4242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EBigDecimal__Group__2__Impl_in_rule__EBigDecimal__Group__24273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EBigDecimal__Group__2__Impl4300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__04335 = new BitSet(new long[]{0x0000004000000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__04338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__EInt__Group__0__Impl4367 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__14400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl4427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__0__Impl_in_rule__Ingredient__Group__04460 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__1_in_rule__Ingredient__Group__04463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__1__Impl_in_rule__Ingredient__Group__14521 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__2_in_rule__Ingredient__Group__14524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__Ingredient__Group__1__Impl4552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__2__Impl_in_rule__Ingredient__Group__24583 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__3_in_rule__Ingredient__Group__24586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__NameAssignment_2_in_rule__Ingredient__Group__2__Impl4613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__3__Impl_in_rule__Ingredient__Group__34643 = new BitSet(new long[]{0x0000010004000000L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__4_in_rule__Ingredient__Group__34646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Ingredient__Group__3__Impl4674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__4__Impl_in_rule__Ingredient__Group__44705 = new BitSet(new long[]{0x0000010004000000L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__5_in_rule__Ingredient__Group__44708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__Group_4__0_in_rule__Ingredient__Group__4__Impl4735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__Group__5__Impl_in_rule__Ingredient__Group__54766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Ingredient__Group__5__Impl4794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__Group_4__0__Impl_in_rule__Ingredient__Group_4__04837 = new BitSet(new long[]{0x0000000000F00000L});
        public static final BitSet FOLLOW_rule__Ingredient__Group_4__1_in_rule__Ingredient__Group_4__04840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__Ingredient__Group_4__0__Impl4868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__Group_4__1__Impl_in_rule__Ingredient__Group_4__14899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Ingredient__SpicinessAssignment_4_1_in_rule__Ingredient__Group_4__1__Impl4926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Menu__NameAssignment_24965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_rule__Menu__GroupsAssignment_4_24996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_rule__Menu__GroupsAssignment_4_3_15027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Group__NameAssignment_25058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCategory_in_rule__Group__CategoryAssignment_4_15089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecipe_in_rule__Group__RecipesAssignment_5_25120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecipe_in_rule__Group__RecipesAssignment_5_3_15151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Recipe__NameAssignment_25182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBigDecimal_in_rule__Recipe__PriceAssignment_4_15213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Recipe__AmountAssignment_5_15244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAmountType_in_rule__Recipe__AmountTypeAssignment_6_15275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIngredient_in_rule__Recipe__IngredientsAssignment_7_25306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIngredient_in_rule__Recipe__IngredientsAssignment_7_3_15337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Ingredient__NameAssignment_25368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSpiciness_in_rule__Ingredient__SpicinessAssignment_4_15399 = new BitSet(new long[]{0x0000000000000002L});
    }


}