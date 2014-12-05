package com.opcoach.restaurant.menu.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.opcoach.restaurant.menu.xtext.services.MenuDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMenuDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Menu'", "'{'", "'groups'", "','", "'}'", "'Group'", "'category'", "'recipes'", "'Recipe'", "'price'", "'amount'", "'amountType'", "'ingredients'", "'.'", "'-'", "'Ingredient'", "'spiciness'", "'breakfast'", "'dinner'", "'lunch'", "'supper'", "'dessert'", "'gram'", "'milliliters'", "'bottles'", "'items'", "'VeryHot'", "'Hot'", "'Normal'", "'Mild'"
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
    public String getGrammarFileName() { return "../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g"; }



     	private MenuDslGrammarAccess grammarAccess;
     	
        public InternalMenuDslParser(TokenStream input, MenuDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Menu";	
       	}
       	
       	@Override
       	protected MenuDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMenu"
    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:68:1: entryRuleMenu returns [EObject current=null] : iv_ruleMenu= ruleMenu EOF ;
    public final EObject entryRuleMenu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMenu = null;


        try {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:69:2: (iv_ruleMenu= ruleMenu EOF )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:70:2: iv_ruleMenu= ruleMenu EOF
            {
             newCompositeNode(grammarAccess.getMenuRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMenu_in_entryRuleMenu75);
            iv_ruleMenu=ruleMenu();

            state._fsp--;

             current =iv_ruleMenu; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMenu85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMenu"


    // $ANTLR start "ruleMenu"
    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:77:1: ruleMenu returns [EObject current=null] : ( () otherlv_1= 'Menu' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'groups' otherlv_5= '{' ( (lv_groups_6_0= ruleGroup ) ) (otherlv_7= ',' ( (lv_groups_8_0= ruleGroup ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleMenu() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_groups_6_0 = null;

        EObject lv_groups_8_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:80:28: ( ( () otherlv_1= 'Menu' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'groups' otherlv_5= '{' ( (lv_groups_6_0= ruleGroup ) ) (otherlv_7= ',' ( (lv_groups_8_0= ruleGroup ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:81:1: ( () otherlv_1= 'Menu' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'groups' otherlv_5= '{' ( (lv_groups_6_0= ruleGroup ) ) (otherlv_7= ',' ( (lv_groups_8_0= ruleGroup ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:81:1: ( () otherlv_1= 'Menu' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'groups' otherlv_5= '{' ( (lv_groups_6_0= ruleGroup ) ) (otherlv_7= ',' ( (lv_groups_8_0= ruleGroup ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:81:2: () otherlv_1= 'Menu' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'groups' otherlv_5= '{' ( (lv_groups_6_0= ruleGroup ) ) (otherlv_7= ',' ( (lv_groups_8_0= ruleGroup ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:81:2: ()
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getMenuAccess().getMenuAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleMenu131); 

                	newLeafNode(otherlv_1, grammarAccess.getMenuAccess().getMenuKeyword_1());
                
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:91:1: ( (lv_name_2_0= ruleEString ) )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:92:1: (lv_name_2_0= ruleEString )
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:92:1: (lv_name_2_0= ruleEString )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:93:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getMenuAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMenu152);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMenuRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMenu164); 

                	newLeafNode(otherlv_3, grammarAccess.getMenuAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:113:1: (otherlv_4= 'groups' otherlv_5= '{' ( (lv_groups_6_0= ruleGroup ) ) (otherlv_7= ',' ( (lv_groups_8_0= ruleGroup ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:113:3: otherlv_4= 'groups' otherlv_5= '{' ( (lv_groups_6_0= ruleGroup ) ) (otherlv_7= ',' ( (lv_groups_8_0= ruleGroup ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMenu177); 

                        	newLeafNode(otherlv_4, grammarAccess.getMenuAccess().getGroupsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMenu189); 

                        	newLeafNode(otherlv_5, grammarAccess.getMenuAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:121:1: ( (lv_groups_6_0= ruleGroup ) )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:122:1: (lv_groups_6_0= ruleGroup )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:122:1: (lv_groups_6_0= ruleGroup )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:123:3: lv_groups_6_0= ruleGroup
                    {
                     
                    	        newCompositeNode(grammarAccess.getMenuAccess().getGroupsGroupParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleMenu210);
                    lv_groups_6_0=ruleGroup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMenuRule());
                    	        }
                           		add(
                           			current, 
                           			"groups",
                            		lv_groups_6_0, 
                            		"Group");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:139:2: (otherlv_7= ',' ( (lv_groups_8_0= ruleGroup ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:139:4: otherlv_7= ',' ( (lv_groups_8_0= ruleGroup ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMenu223); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getMenuAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:143:1: ( (lv_groups_8_0= ruleGroup ) )
                    	    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:144:1: (lv_groups_8_0= ruleGroup )
                    	    {
                    	    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:144:1: (lv_groups_8_0= ruleGroup )
                    	    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:145:3: lv_groups_8_0= ruleGroup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMenuAccess().getGroupsGroupParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleMenu244);
                    	    lv_groups_8_0=ruleGroup();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMenuRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"groups",
                    	            		lv_groups_8_0, 
                    	            		"Group");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMenu258); 

                        	newLeafNode(otherlv_9, grammarAccess.getMenuAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMenu272); 

                	newLeafNode(otherlv_10, grammarAccess.getMenuAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMenu"


    // $ANTLR start "entryRuleEString"
    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:177:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:178:2: (iv_ruleEString= ruleEString EOF )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:179:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString309);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString320); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:186:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:189:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:190:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:190:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:190:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString360); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:198:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString386); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleGroup"
    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:213:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:214:2: (iv_ruleGroup= ruleGroup EOF )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:215:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_entryRuleGroup431);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroup441); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:222:1: ruleGroup returns [EObject current=null] : ( () otherlv_1= 'Group' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'category' ( (lv_category_5_0= ruleCategory ) ) )? (otherlv_6= 'recipes' otherlv_7= '{' ( (lv_recipes_8_0= ruleRecipe ) ) (otherlv_9= ',' ( (lv_recipes_10_0= ruleRecipe ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_category_5_0 = null;

        EObject lv_recipes_8_0 = null;

        EObject lv_recipes_10_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:225:28: ( ( () otherlv_1= 'Group' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'category' ( (lv_category_5_0= ruleCategory ) ) )? (otherlv_6= 'recipes' otherlv_7= '{' ( (lv_recipes_8_0= ruleRecipe ) ) (otherlv_9= ',' ( (lv_recipes_10_0= ruleRecipe ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:226:1: ( () otherlv_1= 'Group' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'category' ( (lv_category_5_0= ruleCategory ) ) )? (otherlv_6= 'recipes' otherlv_7= '{' ( (lv_recipes_8_0= ruleRecipe ) ) (otherlv_9= ',' ( (lv_recipes_10_0= ruleRecipe ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:226:1: ( () otherlv_1= 'Group' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'category' ( (lv_category_5_0= ruleCategory ) ) )? (otherlv_6= 'recipes' otherlv_7= '{' ( (lv_recipes_8_0= ruleRecipe ) ) (otherlv_9= ',' ( (lv_recipes_10_0= ruleRecipe ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:226:2: () otherlv_1= 'Group' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'category' ( (lv_category_5_0= ruleCategory ) ) )? (otherlv_6= 'recipes' otherlv_7= '{' ( (lv_recipes_8_0= ruleRecipe ) ) (otherlv_9= ',' ( (lv_recipes_10_0= ruleRecipe ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:226:2: ()
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:227:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getGroupAccess().getGroupAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleGroup487); 

                	newLeafNode(otherlv_1, grammarAccess.getGroupAccess().getGroupKeyword_1());
                
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:236:1: ( (lv_name_2_0= ruleEString ) )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:237:1: (lv_name_2_0= ruleEString )
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:237:1: (lv_name_2_0= ruleEString )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:238:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGroupAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGroup508);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGroupRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGroup520); 

                	newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:258:1: (otherlv_4= 'category' ( (lv_category_5_0= ruleCategory ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:258:3: otherlv_4= 'category' ( (lv_category_5_0= ruleCategory ) )
                    {
                    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleGroup533); 

                        	newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getCategoryKeyword_4_0());
                        
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:262:1: ( (lv_category_5_0= ruleCategory ) )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:263:1: (lv_category_5_0= ruleCategory )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:263:1: (lv_category_5_0= ruleCategory )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:264:3: lv_category_5_0= ruleCategory
                    {
                     
                    	        newCompositeNode(grammarAccess.getGroupAccess().getCategoryCategoryEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCategory_in_ruleGroup554);
                    lv_category_5_0=ruleCategory();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGroupRule());
                    	        }
                           		set(
                           			current, 
                           			"category",
                            		lv_category_5_0, 
                            		"Category");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:280:4: (otherlv_6= 'recipes' otherlv_7= '{' ( (lv_recipes_8_0= ruleRecipe ) ) (otherlv_9= ',' ( (lv_recipes_10_0= ruleRecipe ) ) )* otherlv_11= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:280:6: otherlv_6= 'recipes' otherlv_7= '{' ( (lv_recipes_8_0= ruleRecipe ) ) (otherlv_9= ',' ( (lv_recipes_10_0= ruleRecipe ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleGroup569); 

                        	newLeafNode(otherlv_6, grammarAccess.getGroupAccess().getRecipesKeyword_5_0());
                        
                    otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGroup581); 

                        	newLeafNode(otherlv_7, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:288:1: ( (lv_recipes_8_0= ruleRecipe ) )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:289:1: (lv_recipes_8_0= ruleRecipe )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:289:1: (lv_recipes_8_0= ruleRecipe )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:290:3: lv_recipes_8_0= ruleRecipe
                    {
                     
                    	        newCompositeNode(grammarAccess.getGroupAccess().getRecipesRecipeParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRecipe_in_ruleGroup602);
                    lv_recipes_8_0=ruleRecipe();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGroupRule());
                    	        }
                           		add(
                           			current, 
                           			"recipes",
                            		lv_recipes_8_0, 
                            		"Recipe");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:306:2: (otherlv_9= ',' ( (lv_recipes_10_0= ruleRecipe ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:306:4: otherlv_9= ',' ( (lv_recipes_10_0= ruleRecipe ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleGroup615); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getGroupAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:310:1: ( (lv_recipes_10_0= ruleRecipe ) )
                    	    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:311:1: (lv_recipes_10_0= ruleRecipe )
                    	    {
                    	    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:311:1: (lv_recipes_10_0= ruleRecipe )
                    	    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:312:3: lv_recipes_10_0= ruleRecipe
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGroupAccess().getRecipesRecipeParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRecipe_in_ruleGroup636);
                    	    lv_recipes_10_0=ruleRecipe();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getGroupRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"recipes",
                    	            		lv_recipes_10_0, 
                    	            		"Recipe");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleGroup650); 

                        	newLeafNode(otherlv_11, grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleGroup664); 

                	newLeafNode(otherlv_12, grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleRecipe"
    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:344:1: entryRuleRecipe returns [EObject current=null] : iv_ruleRecipe= ruleRecipe EOF ;
    public final EObject entryRuleRecipe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecipe = null;


        try {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:345:2: (iv_ruleRecipe= ruleRecipe EOF )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:346:2: iv_ruleRecipe= ruleRecipe EOF
            {
             newCompositeNode(grammarAccess.getRecipeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRecipe_in_entryRuleRecipe700);
            iv_ruleRecipe=ruleRecipe();

            state._fsp--;

             current =iv_ruleRecipe; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRecipe710); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecipe"


    // $ANTLR start "ruleRecipe"
    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:353:1: ruleRecipe returns [EObject current=null] : ( () otherlv_1= 'Recipe' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'price' ( (lv_price_5_0= ruleEBigDecimal ) ) )? (otherlv_6= 'amount' ( (lv_amount_7_0= ruleEInt ) ) )? (otherlv_8= 'amountType' ( (lv_amountType_9_0= ruleAmountType ) ) )? (otherlv_10= 'ingredients' otherlv_11= '{' ( (lv_ingredients_12_0= ruleIngredient ) ) (otherlv_13= ',' ( (lv_ingredients_14_0= ruleIngredient ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleRecipe() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_price_5_0 = null;

        AntlrDatatypeRuleToken lv_amount_7_0 = null;

        Enumerator lv_amountType_9_0 = null;

        EObject lv_ingredients_12_0 = null;

        EObject lv_ingredients_14_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:356:28: ( ( () otherlv_1= 'Recipe' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'price' ( (lv_price_5_0= ruleEBigDecimal ) ) )? (otherlv_6= 'amount' ( (lv_amount_7_0= ruleEInt ) ) )? (otherlv_8= 'amountType' ( (lv_amountType_9_0= ruleAmountType ) ) )? (otherlv_10= 'ingredients' otherlv_11= '{' ( (lv_ingredients_12_0= ruleIngredient ) ) (otherlv_13= ',' ( (lv_ingredients_14_0= ruleIngredient ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:357:1: ( () otherlv_1= 'Recipe' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'price' ( (lv_price_5_0= ruleEBigDecimal ) ) )? (otherlv_6= 'amount' ( (lv_amount_7_0= ruleEInt ) ) )? (otherlv_8= 'amountType' ( (lv_amountType_9_0= ruleAmountType ) ) )? (otherlv_10= 'ingredients' otherlv_11= '{' ( (lv_ingredients_12_0= ruleIngredient ) ) (otherlv_13= ',' ( (lv_ingredients_14_0= ruleIngredient ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:357:1: ( () otherlv_1= 'Recipe' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'price' ( (lv_price_5_0= ruleEBigDecimal ) ) )? (otherlv_6= 'amount' ( (lv_amount_7_0= ruleEInt ) ) )? (otherlv_8= 'amountType' ( (lv_amountType_9_0= ruleAmountType ) ) )? (otherlv_10= 'ingredients' otherlv_11= '{' ( (lv_ingredients_12_0= ruleIngredient ) ) (otherlv_13= ',' ( (lv_ingredients_14_0= ruleIngredient ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:357:2: () otherlv_1= 'Recipe' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'price' ( (lv_price_5_0= ruleEBigDecimal ) ) )? (otherlv_6= 'amount' ( (lv_amount_7_0= ruleEInt ) ) )? (otherlv_8= 'amountType' ( (lv_amountType_9_0= ruleAmountType ) ) )? (otherlv_10= 'ingredients' otherlv_11= '{' ( (lv_ingredients_12_0= ruleIngredient ) ) (otherlv_13= ',' ( (lv_ingredients_14_0= ruleIngredient ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:357:2: ()
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:358:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRecipeAccess().getRecipeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRecipe756); 

                	newLeafNode(otherlv_1, grammarAccess.getRecipeAccess().getRecipeKeyword_1());
                
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:367:1: ( (lv_name_2_0= ruleEString ) )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:368:1: (lv_name_2_0= ruleEString )
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:368:1: (lv_name_2_0= ruleEString )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:369:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRecipeAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRecipe777);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRecipeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRecipe789); 

                	newLeafNode(otherlv_3, grammarAccess.getRecipeAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:389:1: (otherlv_4= 'price' ( (lv_price_5_0= ruleEBigDecimal ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:389:3: otherlv_4= 'price' ( (lv_price_5_0= ruleEBigDecimal ) )
                    {
                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleRecipe802); 

                        	newLeafNode(otherlv_4, grammarAccess.getRecipeAccess().getPriceKeyword_4_0());
                        
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:393:1: ( (lv_price_5_0= ruleEBigDecimal ) )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:394:1: (lv_price_5_0= ruleEBigDecimal )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:394:1: (lv_price_5_0= ruleEBigDecimal )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:395:3: lv_price_5_0= ruleEBigDecimal
                    {
                     
                    	        newCompositeNode(grammarAccess.getRecipeAccess().getPriceEBigDecimalParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBigDecimal_in_ruleRecipe823);
                    lv_price_5_0=ruleEBigDecimal();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRecipeRule());
                    	        }
                           		set(
                           			current, 
                           			"price",
                            		lv_price_5_0, 
                            		"EBigDecimal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:411:4: (otherlv_6= 'amount' ( (lv_amount_7_0= ruleEInt ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:411:6: otherlv_6= 'amount' ( (lv_amount_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleRecipe838); 

                        	newLeafNode(otherlv_6, grammarAccess.getRecipeAccess().getAmountKeyword_5_0());
                        
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:415:1: ( (lv_amount_7_0= ruleEInt ) )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:416:1: (lv_amount_7_0= ruleEInt )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:416:1: (lv_amount_7_0= ruleEInt )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:417:3: lv_amount_7_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRecipeAccess().getAmountEIntParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRecipe859);
                    lv_amount_7_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRecipeRule());
                    	        }
                           		set(
                           			current, 
                           			"amount",
                            		lv_amount_7_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:433:4: (otherlv_8= 'amountType' ( (lv_amountType_9_0= ruleAmountType ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:433:6: otherlv_8= 'amountType' ( (lv_amountType_9_0= ruleAmountType ) )
                    {
                    otherlv_8=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleRecipe874); 

                        	newLeafNode(otherlv_8, grammarAccess.getRecipeAccess().getAmountTypeKeyword_6_0());
                        
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:437:1: ( (lv_amountType_9_0= ruleAmountType ) )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:438:1: (lv_amountType_9_0= ruleAmountType )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:438:1: (lv_amountType_9_0= ruleAmountType )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:439:3: lv_amountType_9_0= ruleAmountType
                    {
                     
                    	        newCompositeNode(grammarAccess.getRecipeAccess().getAmountTypeAmountTypeEnumRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAmountType_in_ruleRecipe895);
                    lv_amountType_9_0=ruleAmountType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRecipeRule());
                    	        }
                           		set(
                           			current, 
                           			"amountType",
                            		lv_amountType_9_0, 
                            		"AmountType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:455:4: (otherlv_10= 'ingredients' otherlv_11= '{' ( (lv_ingredients_12_0= ruleIngredient ) ) (otherlv_13= ',' ( (lv_ingredients_14_0= ruleIngredient ) ) )* otherlv_15= '}' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:455:6: otherlv_10= 'ingredients' otherlv_11= '{' ( (lv_ingredients_12_0= ruleIngredient ) ) (otherlv_13= ',' ( (lv_ingredients_14_0= ruleIngredient ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleRecipe910); 

                        	newLeafNode(otherlv_10, grammarAccess.getRecipeAccess().getIngredientsKeyword_7_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRecipe922); 

                        	newLeafNode(otherlv_11, grammarAccess.getRecipeAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:463:1: ( (lv_ingredients_12_0= ruleIngredient ) )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:464:1: (lv_ingredients_12_0= ruleIngredient )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:464:1: (lv_ingredients_12_0= ruleIngredient )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:465:3: lv_ingredients_12_0= ruleIngredient
                    {
                     
                    	        newCompositeNode(grammarAccess.getRecipeAccess().getIngredientsIngredientParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleIngredient_in_ruleRecipe943);
                    lv_ingredients_12_0=ruleIngredient();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRecipeRule());
                    	        }
                           		add(
                           			current, 
                           			"ingredients",
                            		lv_ingredients_12_0, 
                            		"Ingredient");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:481:2: (otherlv_13= ',' ( (lv_ingredients_14_0= ruleIngredient ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:481:4: otherlv_13= ',' ( (lv_ingredients_14_0= ruleIngredient ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRecipe956); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getRecipeAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:485:1: ( (lv_ingredients_14_0= ruleIngredient ) )
                    	    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:486:1: (lv_ingredients_14_0= ruleIngredient )
                    	    {
                    	    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:486:1: (lv_ingredients_14_0= ruleIngredient )
                    	    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:487:3: lv_ingredients_14_0= ruleIngredient
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRecipeAccess().getIngredientsIngredientParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleIngredient_in_ruleRecipe977);
                    	    lv_ingredients_14_0=ruleIngredient();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRecipeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"ingredients",
                    	            		lv_ingredients_14_0, 
                    	            		"Ingredient");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRecipe991); 

                        	newLeafNode(otherlv_15, grammarAccess.getRecipeAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRecipe1005); 

                	newLeafNode(otherlv_16, grammarAccess.getRecipeAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecipe"


    // $ANTLR start "entryRuleEBigDecimal"
    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:519:1: entryRuleEBigDecimal returns [String current=null] : iv_ruleEBigDecimal= ruleEBigDecimal EOF ;
    public final String entryRuleEBigDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBigDecimal = null;


        try {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:520:2: (iv_ruleEBigDecimal= ruleEBigDecimal EOF )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:521:2: iv_ruleEBigDecimal= ruleEBigDecimal EOF
            {
             newCompositeNode(grammarAccess.getEBigDecimalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBigDecimal_in_entryRuleEBigDecimal1042);
            iv_ruleEBigDecimal=ruleEBigDecimal();

            state._fsp--;

             current =iv_ruleEBigDecimal.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBigDecimal1053); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBigDecimal"


    // $ANTLR start "ruleEBigDecimal"
    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:528:1: ruleEBigDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEBigDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:531:28: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:532:1: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:532:1: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:532:2: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:532:2: (this_INT_0= RULE_INT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:532:7: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEBigDecimal1094); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getEBigDecimalAccess().getINTTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleEBigDecimal1114); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEBigDecimalAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEBigDecimal1129); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getEBigDecimalAccess().getINTTerminalRuleCall_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBigDecimal"


    // $ANTLR start "entryRuleEInt"
    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:560:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:561:2: (iv_ruleEInt= ruleEInt EOF )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:562:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1175);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1186); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:569:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:572:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:573:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:573:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:573:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:573:2: (kw= '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:574:2: kw= '-'
                    {
                    kw=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEInt1225); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt1242); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleIngredient"
    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:594:1: entryRuleIngredient returns [EObject current=null] : iv_ruleIngredient= ruleIngredient EOF ;
    public final EObject entryRuleIngredient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngredient = null;


        try {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:595:2: (iv_ruleIngredient= ruleIngredient EOF )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:596:2: iv_ruleIngredient= ruleIngredient EOF
            {
             newCompositeNode(grammarAccess.getIngredientRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIngredient_in_entryRuleIngredient1287);
            iv_ruleIngredient=ruleIngredient();

            state._fsp--;

             current =iv_ruleIngredient; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIngredient1297); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIngredient"


    // $ANTLR start "ruleIngredient"
    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:603:1: ruleIngredient returns [EObject current=null] : ( () otherlv_1= 'Ingredient' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'spiciness' ( (lv_spiciness_5_0= ruleSpiciness ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleIngredient() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_spiciness_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:606:28: ( ( () otherlv_1= 'Ingredient' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'spiciness' ( (lv_spiciness_5_0= ruleSpiciness ) ) )? otherlv_6= '}' ) )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:607:1: ( () otherlv_1= 'Ingredient' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'spiciness' ( (lv_spiciness_5_0= ruleSpiciness ) ) )? otherlv_6= '}' )
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:607:1: ( () otherlv_1= 'Ingredient' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'spiciness' ( (lv_spiciness_5_0= ruleSpiciness ) ) )? otherlv_6= '}' )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:607:2: () otherlv_1= 'Ingredient' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'spiciness' ( (lv_spiciness_5_0= ruleSpiciness ) ) )? otherlv_6= '}'
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:607:2: ()
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:608:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIngredientAccess().getIngredientAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleIngredient1343); 

                	newLeafNode(otherlv_1, grammarAccess.getIngredientAccess().getIngredientKeyword_1());
                
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:617:1: ( (lv_name_2_0= ruleEString ) )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:618:1: (lv_name_2_0= ruleEString )
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:618:1: (lv_name_2_0= ruleEString )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:619:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getIngredientAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIngredient1364);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIngredientRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleIngredient1376); 

                	newLeafNode(otherlv_3, grammarAccess.getIngredientAccess().getLeftCurlyBracketKeyword_3());
                
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:639:1: (otherlv_4= 'spiciness' ( (lv_spiciness_5_0= ruleSpiciness ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:639:3: otherlv_4= 'spiciness' ( (lv_spiciness_5_0= ruleSpiciness ) )
                    {
                    otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleIngredient1389); 

                        	newLeafNode(otherlv_4, grammarAccess.getIngredientAccess().getSpicinessKeyword_4_0());
                        
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:643:1: ( (lv_spiciness_5_0= ruleSpiciness ) )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:644:1: (lv_spiciness_5_0= ruleSpiciness )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:644:1: (lv_spiciness_5_0= ruleSpiciness )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:645:3: lv_spiciness_5_0= ruleSpiciness
                    {
                     
                    	        newCompositeNode(grammarAccess.getIngredientAccess().getSpicinessSpicinessEnumRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSpiciness_in_ruleIngredient1410);
                    lv_spiciness_5_0=ruleSpiciness();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIngredientRule());
                    	        }
                           		set(
                           			current, 
                           			"spiciness",
                            		lv_spiciness_5_0, 
                            		"Spiciness");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleIngredient1424); 

                	newLeafNode(otherlv_6, grammarAccess.getIngredientAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIngredient"


    // $ANTLR start "ruleCategory"
    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:673:1: ruleCategory returns [Enumerator current=null] : ( (enumLiteral_0= 'breakfast' ) | (enumLiteral_1= 'dinner' ) | (enumLiteral_2= 'lunch' ) | (enumLiteral_3= 'supper' ) | (enumLiteral_4= 'dessert' ) ) ;
    public final Enumerator ruleCategory() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:675:28: ( ( (enumLiteral_0= 'breakfast' ) | (enumLiteral_1= 'dinner' ) | (enumLiteral_2= 'lunch' ) | (enumLiteral_3= 'supper' ) | (enumLiteral_4= 'dessert' ) ) )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:676:1: ( (enumLiteral_0= 'breakfast' ) | (enumLiteral_1= 'dinner' ) | (enumLiteral_2= 'lunch' ) | (enumLiteral_3= 'supper' ) | (enumLiteral_4= 'dessert' ) )
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:676:1: ( (enumLiteral_0= 'breakfast' ) | (enumLiteral_1= 'dinner' ) | (enumLiteral_2= 'lunch' ) | (enumLiteral_3= 'supper' ) | (enumLiteral_4= 'dessert' ) )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt15=1;
                }
                break;
            case 29:
                {
                alt15=2;
                }
                break;
            case 30:
                {
                alt15=3;
                }
                break;
            case 31:
                {
                alt15=4;
                }
                break;
            case 32:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:676:2: (enumLiteral_0= 'breakfast' )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:676:2: (enumLiteral_0= 'breakfast' )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:676:4: enumLiteral_0= 'breakfast'
                    {
                    enumLiteral_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleCategory1474); 

                            current = grammarAccess.getCategoryAccess().getBreakfastEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCategoryAccess().getBreakfastEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:682:6: (enumLiteral_1= 'dinner' )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:682:6: (enumLiteral_1= 'dinner' )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:682:8: enumLiteral_1= 'dinner'
                    {
                    enumLiteral_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleCategory1491); 

                            current = grammarAccess.getCategoryAccess().getDinnerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCategoryAccess().getDinnerEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:688:6: (enumLiteral_2= 'lunch' )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:688:6: (enumLiteral_2= 'lunch' )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:688:8: enumLiteral_2= 'lunch'
                    {
                    enumLiteral_2=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCategory1508); 

                            current = grammarAccess.getCategoryAccess().getLunchEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCategoryAccess().getLunchEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:694:6: (enumLiteral_3= 'supper' )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:694:6: (enumLiteral_3= 'supper' )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:694:8: enumLiteral_3= 'supper'
                    {
                    enumLiteral_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCategory1525); 

                            current = grammarAccess.getCategoryAccess().getSupperEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getCategoryAccess().getSupperEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:700:6: (enumLiteral_4= 'dessert' )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:700:6: (enumLiteral_4= 'dessert' )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:700:8: enumLiteral_4= 'dessert'
                    {
                    enumLiteral_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleCategory1542); 

                            current = grammarAccess.getCategoryAccess().getDessertEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getCategoryAccess().getDessertEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCategory"


    // $ANTLR start "ruleAmountType"
    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:710:1: ruleAmountType returns [Enumerator current=null] : ( (enumLiteral_0= 'gram' ) | (enumLiteral_1= 'milliliters' ) | (enumLiteral_2= 'bottles' ) | (enumLiteral_3= 'items' ) ) ;
    public final Enumerator ruleAmountType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:712:28: ( ( (enumLiteral_0= 'gram' ) | (enumLiteral_1= 'milliliters' ) | (enumLiteral_2= 'bottles' ) | (enumLiteral_3= 'items' ) ) )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:713:1: ( (enumLiteral_0= 'gram' ) | (enumLiteral_1= 'milliliters' ) | (enumLiteral_2= 'bottles' ) | (enumLiteral_3= 'items' ) )
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:713:1: ( (enumLiteral_0= 'gram' ) | (enumLiteral_1= 'milliliters' ) | (enumLiteral_2= 'bottles' ) | (enumLiteral_3= 'items' ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt16=1;
                }
                break;
            case 34:
                {
                alt16=2;
                }
                break;
            case 35:
                {
                alt16=3;
                }
                break;
            case 36:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:713:2: (enumLiteral_0= 'gram' )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:713:2: (enumLiteral_0= 'gram' )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:713:4: enumLiteral_0= 'gram'
                    {
                    enumLiteral_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAmountType1587); 

                            current = grammarAccess.getAmountTypeAccess().getGramEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAmountTypeAccess().getGramEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:719:6: (enumLiteral_1= 'milliliters' )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:719:6: (enumLiteral_1= 'milliliters' )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:719:8: enumLiteral_1= 'milliliters'
                    {
                    enumLiteral_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleAmountType1604); 

                            current = grammarAccess.getAmountTypeAccess().getMillilitersEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAmountTypeAccess().getMillilitersEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:725:6: (enumLiteral_2= 'bottles' )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:725:6: (enumLiteral_2= 'bottles' )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:725:8: enumLiteral_2= 'bottles'
                    {
                    enumLiteral_2=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleAmountType1621); 

                            current = grammarAccess.getAmountTypeAccess().getBottlesEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAmountTypeAccess().getBottlesEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:731:6: (enumLiteral_3= 'items' )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:731:6: (enumLiteral_3= 'items' )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:731:8: enumLiteral_3= 'items'
                    {
                    enumLiteral_3=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleAmountType1638); 

                            current = grammarAccess.getAmountTypeAccess().getItemsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getAmountTypeAccess().getItemsEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAmountType"


    // $ANTLR start "ruleSpiciness"
    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:741:1: ruleSpiciness returns [Enumerator current=null] : ( (enumLiteral_0= 'VeryHot' ) | (enumLiteral_1= 'Hot' ) | (enumLiteral_2= 'Normal' ) | (enumLiteral_3= 'Mild' ) ) ;
    public final Enumerator ruleSpiciness() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:743:28: ( ( (enumLiteral_0= 'VeryHot' ) | (enumLiteral_1= 'Hot' ) | (enumLiteral_2= 'Normal' ) | (enumLiteral_3= 'Mild' ) ) )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:744:1: ( (enumLiteral_0= 'VeryHot' ) | (enumLiteral_1= 'Hot' ) | (enumLiteral_2= 'Normal' ) | (enumLiteral_3= 'Mild' ) )
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:744:1: ( (enumLiteral_0= 'VeryHot' ) | (enumLiteral_1= 'Hot' ) | (enumLiteral_2= 'Normal' ) | (enumLiteral_3= 'Mild' ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt17=1;
                }
                break;
            case 38:
                {
                alt17=2;
                }
                break;
            case 39:
                {
                alt17=3;
                }
                break;
            case 40:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:744:2: (enumLiteral_0= 'VeryHot' )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:744:2: (enumLiteral_0= 'VeryHot' )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:744:4: enumLiteral_0= 'VeryHot'
                    {
                    enumLiteral_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleSpiciness1683); 

                            current = grammarAccess.getSpicinessAccess().getVeryHotEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSpicinessAccess().getVeryHotEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:750:6: (enumLiteral_1= 'Hot' )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:750:6: (enumLiteral_1= 'Hot' )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:750:8: enumLiteral_1= 'Hot'
                    {
                    enumLiteral_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleSpiciness1700); 

                            current = grammarAccess.getSpicinessAccess().getHotEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSpicinessAccess().getHotEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:756:6: (enumLiteral_2= 'Normal' )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:756:6: (enumLiteral_2= 'Normal' )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:756:8: enumLiteral_2= 'Normal'
                    {
                    enumLiteral_2=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleSpiciness1717); 

                            current = grammarAccess.getSpicinessAccess().getNormalEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getSpicinessAccess().getNormalEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:762:6: (enumLiteral_3= 'Mild' )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:762:6: (enumLiteral_3= 'Mild' )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:762:8: enumLiteral_3= 'Mild'
                    {
                    enumLiteral_3=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleSpiciness1734); 

                            current = grammarAccess.getSpicinessAccess().getMildEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getSpicinessAccess().getMildEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpiciness"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleMenu_in_entryRuleMenu75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMenu85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleMenu131 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMenu152 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMenu164 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_13_in_ruleMenu177 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMenu189 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleMenu210 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleMenu223 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleMenu244 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleMenu258 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMenu272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString309 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup431 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroup441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleGroup487 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGroup508 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleGroup520 = new BitSet(new long[]{0x0000000000068000L});
        public static final BitSet FOLLOW_17_in_ruleGroup533 = new BitSet(new long[]{0x00000001F0000000L});
        public static final BitSet FOLLOW_ruleCategory_in_ruleGroup554 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_18_in_ruleGroup569 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleGroup581 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleRecipe_in_ruleGroup602 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleGroup615 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleRecipe_in_ruleGroup636 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleGroup650 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleGroup664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecipe_in_entryRuleRecipe700 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRecipe710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleRecipe756 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRecipe777 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRecipe789 = new BitSet(new long[]{0x0000000000F08000L});
        public static final BitSet FOLLOW_20_in_ruleRecipe802 = new BitSet(new long[]{0x0000000001000040L});
        public static final BitSet FOLLOW_ruleEBigDecimal_in_ruleRecipe823 = new BitSet(new long[]{0x0000000000E08000L});
        public static final BitSet FOLLOW_21_in_ruleRecipe838 = new BitSet(new long[]{0x0000000002000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRecipe859 = new BitSet(new long[]{0x0000000000C08000L});
        public static final BitSet FOLLOW_22_in_ruleRecipe874 = new BitSet(new long[]{0x0000001E00000000L});
        public static final BitSet FOLLOW_ruleAmountType_in_ruleRecipe895 = new BitSet(new long[]{0x0000000000808000L});
        public static final BitSet FOLLOW_23_in_ruleRecipe910 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRecipe922 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleIngredient_in_ruleRecipe943 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleRecipe956 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_ruleIngredient_in_ruleRecipe977 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleRecipe991 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleRecipe1005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBigDecimal_in_entryRuleEBigDecimal1042 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBigDecimal1053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEBigDecimal1094 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleEBigDecimal1114 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEBigDecimal1129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1175 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleEInt1225 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIngredient_in_entryRuleIngredient1287 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIngredient1297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleIngredient1343 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIngredient1364 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleIngredient1376 = new BitSet(new long[]{0x0000000008008000L});
        public static final BitSet FOLLOW_27_in_ruleIngredient1389 = new BitSet(new long[]{0x000001E000000000L});
        public static final BitSet FOLLOW_ruleSpiciness_in_ruleIngredient1410 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleIngredient1424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleCategory1474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleCategory1491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleCategory1508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleCategory1525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleCategory1542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleAmountType1587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleAmountType1604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleAmountType1621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleAmountType1638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleSpiciness1683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleSpiciness1700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleSpiciness1717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleSpiciness1734 = new BitSet(new long[]{0x0000000000000002L});
    }


}