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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Menu'", "','", "'Group'", "'Recipe'", "'price'", "'ingredients'", "'.'", "'-'", "'Ingredient'", "'breakfast'", "'dinner'", "'lunch'", "'supper'", "'dessert'", "'gram'", "'milliliters'", "'bottles'", "'items'", "'VeryHot'", "'Hot'", "'Normal'", "'Mild'"
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
    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:77:1: ruleMenu returns [EObject current=null] : ( () otherlv_1= 'Menu' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_groups_3_0= ruleGroup ) ) (otherlv_4= ',' ( (lv_groups_5_0= ruleGroup ) ) )* )? ) ;
    public final EObject ruleMenu() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_groups_3_0 = null;

        EObject lv_groups_5_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:80:28: ( ( () otherlv_1= 'Menu' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_groups_3_0= ruleGroup ) ) (otherlv_4= ',' ( (lv_groups_5_0= ruleGroup ) ) )* )? ) )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:81:1: ( () otherlv_1= 'Menu' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_groups_3_0= ruleGroup ) ) (otherlv_4= ',' ( (lv_groups_5_0= ruleGroup ) ) )* )? )
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:81:1: ( () otherlv_1= 'Menu' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_groups_3_0= ruleGroup ) ) (otherlv_4= ',' ( (lv_groups_5_0= ruleGroup ) ) )* )? )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:81:2: () otherlv_1= 'Menu' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_groups_3_0= ruleGroup ) ) (otherlv_4= ',' ( (lv_groups_5_0= ruleGroup ) ) )* )?
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

            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:109:2: ( ( (lv_groups_3_0= ruleGroup ) ) (otherlv_4= ',' ( (lv_groups_5_0= ruleGroup ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:109:3: ( (lv_groups_3_0= ruleGroup ) ) (otherlv_4= ',' ( (lv_groups_5_0= ruleGroup ) ) )*
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:109:3: ( (lv_groups_3_0= ruleGroup ) )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:110:1: (lv_groups_3_0= ruleGroup )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:110:1: (lv_groups_3_0= ruleGroup )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:111:3: lv_groups_3_0= ruleGroup
                    {
                     
                    	        newCompositeNode(grammarAccess.getMenuAccess().getGroupsGroupParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleMenu174);
                    lv_groups_3_0=ruleGroup();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMenuRule());
                    	        }
                           		add(
                           			current, 
                           			"groups",
                            		lv_groups_3_0, 
                            		"Group");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:127:2: (otherlv_4= ',' ( (lv_groups_5_0= ruleGroup ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==12) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:127:4: otherlv_4= ',' ( (lv_groups_5_0= ruleGroup ) )
                    	    {
                    	    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMenu187); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getMenuAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:131:1: ( (lv_groups_5_0= ruleGroup ) )
                    	    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:132:1: (lv_groups_5_0= ruleGroup )
                    	    {
                    	    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:132:1: (lv_groups_5_0= ruleGroup )
                    	    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:133:3: lv_groups_5_0= ruleGroup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMenuAccess().getGroupsGroupParserRuleCall_3_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleGroup_in_ruleMenu208);
                    	    lv_groups_5_0=ruleGroup();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMenuRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"groups",
                    	            		lv_groups_5_0, 
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


                    }
                    break;

            }


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
    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:157:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:158:2: (iv_ruleEString= ruleEString EOF )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:159:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString249);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString260); 

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
    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:166:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:169:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:170:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:170:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:170:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString300); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:178:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString326); 

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
    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:193:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:194:2: (iv_ruleGroup= ruleGroup EOF )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:195:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGroup_in_entryRuleGroup371);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGroup381); 

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
    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:202:1: ruleGroup returns [EObject current=null] : ( () otherlv_1= 'Group' ( (lv_name_2_0= ruleEString ) ) ( (lv_category_3_0= ruleCategory ) )? ( ( (lv_recipes_4_0= ruleRecipe ) ) (otherlv_5= ',' ( (lv_recipes_6_0= ruleRecipe ) ) )* )? ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_category_3_0 = null;

        EObject lv_recipes_4_0 = null;

        EObject lv_recipes_6_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:205:28: ( ( () otherlv_1= 'Group' ( (lv_name_2_0= ruleEString ) ) ( (lv_category_3_0= ruleCategory ) )? ( ( (lv_recipes_4_0= ruleRecipe ) ) (otherlv_5= ',' ( (lv_recipes_6_0= ruleRecipe ) ) )* )? ) )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:206:1: ( () otherlv_1= 'Group' ( (lv_name_2_0= ruleEString ) ) ( (lv_category_3_0= ruleCategory ) )? ( ( (lv_recipes_4_0= ruleRecipe ) ) (otherlv_5= ',' ( (lv_recipes_6_0= ruleRecipe ) ) )* )? )
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:206:1: ( () otherlv_1= 'Group' ( (lv_name_2_0= ruleEString ) ) ( (lv_category_3_0= ruleCategory ) )? ( ( (lv_recipes_4_0= ruleRecipe ) ) (otherlv_5= ',' ( (lv_recipes_6_0= ruleRecipe ) ) )* )? )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:206:2: () otherlv_1= 'Group' ( (lv_name_2_0= ruleEString ) ) ( (lv_category_3_0= ruleCategory ) )? ( ( (lv_recipes_4_0= ruleRecipe ) ) (otherlv_5= ',' ( (lv_recipes_6_0= ruleRecipe ) ) )* )?
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:206:2: ()
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:207:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getGroupAccess().getGroupAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleGroup427); 

                	newLeafNode(otherlv_1, grammarAccess.getGroupAccess().getGroupKeyword_1());
                
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:216:1: ( (lv_name_2_0= ruleEString ) )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:217:1: (lv_name_2_0= ruleEString )
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:217:1: (lv_name_2_0= ruleEString )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:218:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGroupAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGroup448);
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

            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:234:2: ( (lv_category_3_0= ruleCategory ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=20 && LA4_0<=24)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:235:1: (lv_category_3_0= ruleCategory )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:235:1: (lv_category_3_0= ruleCategory )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:236:3: lv_category_3_0= ruleCategory
                    {
                     
                    	        newCompositeNode(grammarAccess.getGroupAccess().getCategoryCategoryEnumRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCategory_in_ruleGroup469);
                    lv_category_3_0=ruleCategory();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGroupRule());
                    	        }
                           		set(
                           			current, 
                           			"category",
                            		lv_category_3_0, 
                            		"Category");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:252:3: ( ( (lv_recipes_4_0= ruleRecipe ) ) (otherlv_5= ',' ( (lv_recipes_6_0= ruleRecipe ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:252:4: ( (lv_recipes_4_0= ruleRecipe ) ) (otherlv_5= ',' ( (lv_recipes_6_0= ruleRecipe ) ) )*
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:252:4: ( (lv_recipes_4_0= ruleRecipe ) )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:253:1: (lv_recipes_4_0= ruleRecipe )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:253:1: (lv_recipes_4_0= ruleRecipe )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:254:3: lv_recipes_4_0= ruleRecipe
                    {
                     
                    	        newCompositeNode(grammarAccess.getGroupAccess().getRecipesRecipeParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRecipe_in_ruleGroup492);
                    lv_recipes_4_0=ruleRecipe();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGroupRule());
                    	        }
                           		add(
                           			current, 
                           			"recipes",
                            		lv_recipes_4_0, 
                            		"Recipe");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:270:2: (otherlv_5= ',' ( (lv_recipes_6_0= ruleRecipe ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==12) ) {
                            int LA5_1 = input.LA(2);

                            if ( (LA5_1==14) ) {
                                alt5=1;
                            }


                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:270:4: otherlv_5= ',' ( (lv_recipes_6_0= ruleRecipe ) )
                    	    {
                    	    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGroup505); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:274:1: ( (lv_recipes_6_0= ruleRecipe ) )
                    	    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:275:1: (lv_recipes_6_0= ruleRecipe )
                    	    {
                    	    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:275:1: (lv_recipes_6_0= ruleRecipe )
                    	    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:276:3: lv_recipes_6_0= ruleRecipe
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGroupAccess().getRecipesRecipeParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRecipe_in_ruleGroup526);
                    	    lv_recipes_6_0=ruleRecipe();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getGroupRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"recipes",
                    	            		lv_recipes_6_0, 
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


                    }
                    break;

            }


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
    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:300:1: entryRuleRecipe returns [EObject current=null] : iv_ruleRecipe= ruleRecipe EOF ;
    public final EObject entryRuleRecipe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecipe = null;


        try {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:301:2: (iv_ruleRecipe= ruleRecipe EOF )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:302:2: iv_ruleRecipe= ruleRecipe EOF
            {
             newCompositeNode(grammarAccess.getRecipeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRecipe_in_entryRuleRecipe566);
            iv_ruleRecipe=ruleRecipe();

            state._fsp--;

             current =iv_ruleRecipe; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRecipe576); 

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
    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:309:1: ruleRecipe returns [EObject current=null] : ( () otherlv_1= 'Recipe' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEBigDecimal ) ) )? ( (lv_amount_5_0= ruleEInt ) )? ( (lv_amountType_6_0= ruleAmountType ) )? (otherlv_7= 'ingredients' ( (lv_ingredients_8_0= ruleIngredient ) ) (otherlv_9= ',' ( (lv_ingredients_10_0= ruleIngredient ) ) )* )? ) ;
    public final EObject ruleRecipe() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_price_4_0 = null;

        AntlrDatatypeRuleToken lv_amount_5_0 = null;

        Enumerator lv_amountType_6_0 = null;

        EObject lv_ingredients_8_0 = null;

        EObject lv_ingredients_10_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:312:28: ( ( () otherlv_1= 'Recipe' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEBigDecimal ) ) )? ( (lv_amount_5_0= ruleEInt ) )? ( (lv_amountType_6_0= ruleAmountType ) )? (otherlv_7= 'ingredients' ( (lv_ingredients_8_0= ruleIngredient ) ) (otherlv_9= ',' ( (lv_ingredients_10_0= ruleIngredient ) ) )* )? ) )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:313:1: ( () otherlv_1= 'Recipe' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEBigDecimal ) ) )? ( (lv_amount_5_0= ruleEInt ) )? ( (lv_amountType_6_0= ruleAmountType ) )? (otherlv_7= 'ingredients' ( (lv_ingredients_8_0= ruleIngredient ) ) (otherlv_9= ',' ( (lv_ingredients_10_0= ruleIngredient ) ) )* )? )
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:313:1: ( () otherlv_1= 'Recipe' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEBigDecimal ) ) )? ( (lv_amount_5_0= ruleEInt ) )? ( (lv_amountType_6_0= ruleAmountType ) )? (otherlv_7= 'ingredients' ( (lv_ingredients_8_0= ruleIngredient ) ) (otherlv_9= ',' ( (lv_ingredients_10_0= ruleIngredient ) ) )* )? )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:313:2: () otherlv_1= 'Recipe' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'price' ( (lv_price_4_0= ruleEBigDecimal ) ) )? ( (lv_amount_5_0= ruleEInt ) )? ( (lv_amountType_6_0= ruleAmountType ) )? (otherlv_7= 'ingredients' ( (lv_ingredients_8_0= ruleIngredient ) ) (otherlv_9= ',' ( (lv_ingredients_10_0= ruleIngredient ) ) )* )?
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:313:2: ()
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:314:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRecipeAccess().getRecipeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRecipe622); 

                	newLeafNode(otherlv_1, grammarAccess.getRecipeAccess().getRecipeKeyword_1());
                
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:323:1: ( (lv_name_2_0= ruleEString ) )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:324:1: (lv_name_2_0= ruleEString )
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:324:1: (lv_name_2_0= ruleEString )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:325:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRecipeAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRecipe643);
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

            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:341:2: (otherlv_3= 'price' ( (lv_price_4_0= ruleEBigDecimal ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:341:4: otherlv_3= 'price' ( (lv_price_4_0= ruleEBigDecimal ) )
                    {
                    otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRecipe656); 

                        	newLeafNode(otherlv_3, grammarAccess.getRecipeAccess().getPriceKeyword_3_0());
                        
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:345:1: ( (lv_price_4_0= ruleEBigDecimal ) )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:346:1: (lv_price_4_0= ruleEBigDecimal )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:346:1: (lv_price_4_0= ruleEBigDecimal )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:347:3: lv_price_4_0= ruleEBigDecimal
                    {
                     
                    	        newCompositeNode(grammarAccess.getRecipeAccess().getPriceEBigDecimalParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBigDecimal_in_ruleRecipe677);
                    lv_price_4_0=ruleEBigDecimal();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRecipeRule());
                    	        }
                           		set(
                           			current, 
                           			"price",
                            		lv_price_4_0, 
                            		"EBigDecimal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:363:4: ( (lv_amount_5_0= ruleEInt ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT||LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:364:1: (lv_amount_5_0= ruleEInt )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:364:1: (lv_amount_5_0= ruleEInt )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:365:3: lv_amount_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getRecipeAccess().getAmountEIntParserRuleCall_4_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRecipe700);
                    lv_amount_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRecipeRule());
                    	        }
                           		set(
                           			current, 
                           			"amount",
                            		lv_amount_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:381:3: ( (lv_amountType_6_0= ruleAmountType ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=25 && LA9_0<=28)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:382:1: (lv_amountType_6_0= ruleAmountType )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:382:1: (lv_amountType_6_0= ruleAmountType )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:383:3: lv_amountType_6_0= ruleAmountType
                    {
                     
                    	        newCompositeNode(grammarAccess.getRecipeAccess().getAmountTypeAmountTypeEnumRuleCall_5_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAmountType_in_ruleRecipe722);
                    lv_amountType_6_0=ruleAmountType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRecipeRule());
                    	        }
                           		set(
                           			current, 
                           			"amountType",
                            		lv_amountType_6_0, 
                            		"AmountType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:399:3: (otherlv_7= 'ingredients' ( (lv_ingredients_8_0= ruleIngredient ) ) (otherlv_9= ',' ( (lv_ingredients_10_0= ruleIngredient ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:399:5: otherlv_7= 'ingredients' ( (lv_ingredients_8_0= ruleIngredient ) ) (otherlv_9= ',' ( (lv_ingredients_10_0= ruleIngredient ) ) )*
                    {
                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRecipe736); 

                        	newLeafNode(otherlv_7, grammarAccess.getRecipeAccess().getIngredientsKeyword_6_0());
                        
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:403:1: ( (lv_ingredients_8_0= ruleIngredient ) )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:404:1: (lv_ingredients_8_0= ruleIngredient )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:404:1: (lv_ingredients_8_0= ruleIngredient )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:405:3: lv_ingredients_8_0= ruleIngredient
                    {
                     
                    	        newCompositeNode(grammarAccess.getRecipeAccess().getIngredientsIngredientParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleIngredient_in_ruleRecipe757);
                    lv_ingredients_8_0=ruleIngredient();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRecipeRule());
                    	        }
                           		add(
                           			current, 
                           			"ingredients",
                            		lv_ingredients_8_0, 
                            		"Ingredient");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:421:2: (otherlv_9= ',' ( (lv_ingredients_10_0= ruleIngredient ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==12) ) {
                            int LA10_1 = input.LA(2);

                            if ( (LA10_1==19) ) {
                                alt10=1;
                            }


                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:421:4: otherlv_9= ',' ( (lv_ingredients_10_0= ruleIngredient ) )
                    	    {
                    	    otherlv_9=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRecipe770); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getRecipeAccess().getCommaKeyword_6_2_0());
                    	        
                    	    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:425:1: ( (lv_ingredients_10_0= ruleIngredient ) )
                    	    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:426:1: (lv_ingredients_10_0= ruleIngredient )
                    	    {
                    	    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:426:1: (lv_ingredients_10_0= ruleIngredient )
                    	    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:427:3: lv_ingredients_10_0= ruleIngredient
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRecipeAccess().getIngredientsIngredientParserRuleCall_6_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleIngredient_in_ruleRecipe791);
                    	    lv_ingredients_10_0=ruleIngredient();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRecipeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"ingredients",
                    	            		lv_ingredients_10_0, 
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


                    }
                    break;

            }


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
    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:451:1: entryRuleEBigDecimal returns [String current=null] : iv_ruleEBigDecimal= ruleEBigDecimal EOF ;
    public final String entryRuleEBigDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBigDecimal = null;


        try {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:452:2: (iv_ruleEBigDecimal= ruleEBigDecimal EOF )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:453:2: iv_ruleEBigDecimal= ruleEBigDecimal EOF
            {
             newCompositeNode(grammarAccess.getEBigDecimalRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBigDecimal_in_entryRuleEBigDecimal832);
            iv_ruleEBigDecimal=ruleEBigDecimal();

            state._fsp--;

             current =iv_ruleEBigDecimal.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBigDecimal843); 

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
    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:460:1: ruleEBigDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEBigDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:463:28: ( ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT ) )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:464:1: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:464:1: ( (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:464:2: (this_INT_0= RULE_INT )? kw= '.' this_INT_2= RULE_INT
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:464:2: (this_INT_0= RULE_INT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:464:7: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEBigDecimal884); 

                    		current.merge(this_INT_0);
                        
                     
                        newLeafNode(this_INT_0, grammarAccess.getEBigDecimalAccess().getINTTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEBigDecimal904); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEBigDecimalAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEBigDecimal919); 

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
    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:492:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:493:2: (iv_ruleEInt= ruleEInt EOF )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:494:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt965);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt976); 

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
    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:501:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:504:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:505:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:505:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:505:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:505:2: (kw= '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:506:2: kw= '-'
                    {
                    kw=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEInt1015); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt1032); 

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
    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:526:1: entryRuleIngredient returns [EObject current=null] : iv_ruleIngredient= ruleIngredient EOF ;
    public final EObject entryRuleIngredient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIngredient = null;


        try {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:527:2: (iv_ruleIngredient= ruleIngredient EOF )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:528:2: iv_ruleIngredient= ruleIngredient EOF
            {
             newCompositeNode(grammarAccess.getIngredientRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIngredient_in_entryRuleIngredient1077);
            iv_ruleIngredient=ruleIngredient();

            state._fsp--;

             current =iv_ruleIngredient; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIngredient1087); 

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
    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:535:1: ruleIngredient returns [EObject current=null] : ( () otherlv_1= 'Ingredient' ( (lv_name_2_0= ruleEString ) ) ( (lv_spiciness_3_0= ruleSpiciness ) )? ) ;
    public final EObject ruleIngredient() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_spiciness_3_0 = null;


         enterRule(); 
            
        try {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:538:28: ( ( () otherlv_1= 'Ingredient' ( (lv_name_2_0= ruleEString ) ) ( (lv_spiciness_3_0= ruleSpiciness ) )? ) )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:539:1: ( () otherlv_1= 'Ingredient' ( (lv_name_2_0= ruleEString ) ) ( (lv_spiciness_3_0= ruleSpiciness ) )? )
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:539:1: ( () otherlv_1= 'Ingredient' ( (lv_name_2_0= ruleEString ) ) ( (lv_spiciness_3_0= ruleSpiciness ) )? )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:539:2: () otherlv_1= 'Ingredient' ( (lv_name_2_0= ruleEString ) ) ( (lv_spiciness_3_0= ruleSpiciness ) )?
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:539:2: ()
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:540:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIngredientAccess().getIngredientAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleIngredient1133); 

                	newLeafNode(otherlv_1, grammarAccess.getIngredientAccess().getIngredientKeyword_1());
                
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:549:1: ( (lv_name_2_0= ruleEString ) )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:550:1: (lv_name_2_0= ruleEString )
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:550:1: (lv_name_2_0= ruleEString )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:551:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getIngredientAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleIngredient1154);
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

            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:567:2: ( (lv_spiciness_3_0= ruleSpiciness ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=29 && LA14_0<=32)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:568:1: (lv_spiciness_3_0= ruleSpiciness )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:568:1: (lv_spiciness_3_0= ruleSpiciness )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:569:3: lv_spiciness_3_0= ruleSpiciness
                    {
                     
                    	        newCompositeNode(grammarAccess.getIngredientAccess().getSpicinessSpicinessEnumRuleCall_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSpiciness_in_ruleIngredient1175);
                    lv_spiciness_3_0=ruleSpiciness();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIngredientRule());
                    	        }
                           		set(
                           			current, 
                           			"spiciness",
                            		lv_spiciness_3_0, 
                            		"Spiciness");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


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
    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:593:1: ruleCategory returns [Enumerator current=null] : ( (enumLiteral_0= 'breakfast' ) | (enumLiteral_1= 'dinner' ) | (enumLiteral_2= 'lunch' ) | (enumLiteral_3= 'supper' ) | (enumLiteral_4= 'dessert' ) ) ;
    public final Enumerator ruleCategory() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:595:28: ( ( (enumLiteral_0= 'breakfast' ) | (enumLiteral_1= 'dinner' ) | (enumLiteral_2= 'lunch' ) | (enumLiteral_3= 'supper' ) | (enumLiteral_4= 'dessert' ) ) )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:596:1: ( (enumLiteral_0= 'breakfast' ) | (enumLiteral_1= 'dinner' ) | (enumLiteral_2= 'lunch' ) | (enumLiteral_3= 'supper' ) | (enumLiteral_4= 'dessert' ) )
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:596:1: ( (enumLiteral_0= 'breakfast' ) | (enumLiteral_1= 'dinner' ) | (enumLiteral_2= 'lunch' ) | (enumLiteral_3= 'supper' ) | (enumLiteral_4= 'dessert' ) )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt15=1;
                }
                break;
            case 21:
                {
                alt15=2;
                }
                break;
            case 22:
                {
                alt15=3;
                }
                break;
            case 23:
                {
                alt15=4;
                }
                break;
            case 24:
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
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:596:2: (enumLiteral_0= 'breakfast' )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:596:2: (enumLiteral_0= 'breakfast' )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:596:4: enumLiteral_0= 'breakfast'
                    {
                    enumLiteral_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleCategory1226); 

                            current = grammarAccess.getCategoryAccess().getBreakfastEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCategoryAccess().getBreakfastEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:602:6: (enumLiteral_1= 'dinner' )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:602:6: (enumLiteral_1= 'dinner' )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:602:8: enumLiteral_1= 'dinner'
                    {
                    enumLiteral_1=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleCategory1243); 

                            current = grammarAccess.getCategoryAccess().getDinnerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCategoryAccess().getDinnerEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:608:6: (enumLiteral_2= 'lunch' )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:608:6: (enumLiteral_2= 'lunch' )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:608:8: enumLiteral_2= 'lunch'
                    {
                    enumLiteral_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCategory1260); 

                            current = grammarAccess.getCategoryAccess().getLunchEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCategoryAccess().getLunchEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:614:6: (enumLiteral_3= 'supper' )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:614:6: (enumLiteral_3= 'supper' )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:614:8: enumLiteral_3= 'supper'
                    {
                    enumLiteral_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCategory1277); 

                            current = grammarAccess.getCategoryAccess().getSupperEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getCategoryAccess().getSupperEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:620:6: (enumLiteral_4= 'dessert' )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:620:6: (enumLiteral_4= 'dessert' )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:620:8: enumLiteral_4= 'dessert'
                    {
                    enumLiteral_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCategory1294); 

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
    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:630:1: ruleAmountType returns [Enumerator current=null] : ( (enumLiteral_0= 'gram' ) | (enumLiteral_1= 'milliliters' ) | (enumLiteral_2= 'bottles' ) | (enumLiteral_3= 'items' ) ) ;
    public final Enumerator ruleAmountType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:632:28: ( ( (enumLiteral_0= 'gram' ) | (enumLiteral_1= 'milliliters' ) | (enumLiteral_2= 'bottles' ) | (enumLiteral_3= 'items' ) ) )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:633:1: ( (enumLiteral_0= 'gram' ) | (enumLiteral_1= 'milliliters' ) | (enumLiteral_2= 'bottles' ) | (enumLiteral_3= 'items' ) )
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:633:1: ( (enumLiteral_0= 'gram' ) | (enumLiteral_1= 'milliliters' ) | (enumLiteral_2= 'bottles' ) | (enumLiteral_3= 'items' ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt16=1;
                }
                break;
            case 26:
                {
                alt16=2;
                }
                break;
            case 27:
                {
                alt16=3;
                }
                break;
            case 28:
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
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:633:2: (enumLiteral_0= 'gram' )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:633:2: (enumLiteral_0= 'gram' )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:633:4: enumLiteral_0= 'gram'
                    {
                    enumLiteral_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleAmountType1339); 

                            current = grammarAccess.getAmountTypeAccess().getGramEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getAmountTypeAccess().getGramEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:639:6: (enumLiteral_1= 'milliliters' )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:639:6: (enumLiteral_1= 'milliliters' )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:639:8: enumLiteral_1= 'milliliters'
                    {
                    enumLiteral_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleAmountType1356); 

                            current = grammarAccess.getAmountTypeAccess().getMillilitersEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getAmountTypeAccess().getMillilitersEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:645:6: (enumLiteral_2= 'bottles' )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:645:6: (enumLiteral_2= 'bottles' )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:645:8: enumLiteral_2= 'bottles'
                    {
                    enumLiteral_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAmountType1373); 

                            current = grammarAccess.getAmountTypeAccess().getBottlesEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getAmountTypeAccess().getBottlesEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:651:6: (enumLiteral_3= 'items' )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:651:6: (enumLiteral_3= 'items' )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:651:8: enumLiteral_3= 'items'
                    {
                    enumLiteral_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAmountType1390); 

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
    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:661:1: ruleSpiciness returns [Enumerator current=null] : ( (enumLiteral_0= 'VeryHot' ) | (enumLiteral_1= 'Hot' ) | (enumLiteral_2= 'Normal' ) | (enumLiteral_3= 'Mild' ) ) ;
    public final Enumerator ruleSpiciness() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:663:28: ( ( (enumLiteral_0= 'VeryHot' ) | (enumLiteral_1= 'Hot' ) | (enumLiteral_2= 'Normal' ) | (enumLiteral_3= 'Mild' ) ) )
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:664:1: ( (enumLiteral_0= 'VeryHot' ) | (enumLiteral_1= 'Hot' ) | (enumLiteral_2= 'Normal' ) | (enumLiteral_3= 'Mild' ) )
            {
            // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:664:1: ( (enumLiteral_0= 'VeryHot' ) | (enumLiteral_1= 'Hot' ) | (enumLiteral_2= 'Normal' ) | (enumLiteral_3= 'Mild' ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt17=1;
                }
                break;
            case 30:
                {
                alt17=2;
                }
                break;
            case 31:
                {
                alt17=3;
                }
                break;
            case 32:
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
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:664:2: (enumLiteral_0= 'VeryHot' )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:664:2: (enumLiteral_0= 'VeryHot' )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:664:4: enumLiteral_0= 'VeryHot'
                    {
                    enumLiteral_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleSpiciness1435); 

                            current = grammarAccess.getSpicinessAccess().getVeryHotEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getSpicinessAccess().getVeryHotEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:670:6: (enumLiteral_1= 'Hot' )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:670:6: (enumLiteral_1= 'Hot' )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:670:8: enumLiteral_1= 'Hot'
                    {
                    enumLiteral_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleSpiciness1452); 

                            current = grammarAccess.getSpicinessAccess().getHotEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getSpicinessAccess().getHotEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:676:6: (enumLiteral_2= 'Normal' )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:676:6: (enumLiteral_2= 'Normal' )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:676:8: enumLiteral_2= 'Normal'
                    {
                    enumLiteral_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleSpiciness1469); 

                            current = grammarAccess.getSpicinessAccess().getNormalEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getSpicinessAccess().getNormalEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:682:6: (enumLiteral_3= 'Mild' )
                    {
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:682:6: (enumLiteral_3= 'Mild' )
                    // ../com.opcoach.restaurant.menu.xtext/src-gen/com/opcoach/restaurant/menu/xtext/parser/antlr/internal/InternalMenuDsl.g:682:8: enumLiteral_3= 'Mild'
                    {
                    enumLiteral_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleSpiciness1486); 

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
        public static final BitSet FOLLOW_ruleEString_in_ruleMenu152 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleMenu174 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleMenu187 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_ruleGroup_in_ruleMenu208 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString249 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup371 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGroup381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleGroup427 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGroup448 = new BitSet(new long[]{0x0000000001F04002L});
        public static final BitSet FOLLOW_ruleCategory_in_ruleGroup469 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_ruleRecipe_in_ruleGroup492 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleGroup505 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_ruleRecipe_in_ruleGroup526 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_ruleRecipe_in_entryRuleRecipe566 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRecipe576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleRecipe622 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRecipe643 = new BitSet(new long[]{0x000000001E058042L});
        public static final BitSet FOLLOW_15_in_ruleRecipe656 = new BitSet(new long[]{0x0000000000020040L});
        public static final BitSet FOLLOW_ruleEBigDecimal_in_ruleRecipe677 = new BitSet(new long[]{0x000000001E050042L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRecipe700 = new BitSet(new long[]{0x000000001E010002L});
        public static final BitSet FOLLOW_ruleAmountType_in_ruleRecipe722 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleRecipe736 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleIngredient_in_ruleRecipe757 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_12_in_ruleRecipe770 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_ruleIngredient_in_ruleRecipe791 = new BitSet(new long[]{0x0000000000001002L});
        public static final BitSet FOLLOW_ruleEBigDecimal_in_entryRuleEBigDecimal832 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBigDecimal843 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEBigDecimal884 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleEBigDecimal904 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEBigDecimal919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt965 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleEInt1015 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIngredient_in_entryRuleIngredient1077 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIngredient1087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleIngredient1133 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleIngredient1154 = new BitSet(new long[]{0x00000001E0000002L});
        public static final BitSet FOLLOW_ruleSpiciness_in_ruleIngredient1175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleCategory1226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleCategory1243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleCategory1260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleCategory1277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleCategory1294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleAmountType1339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleAmountType1356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleAmountType1373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleAmountType1390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleSpiciness1435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleSpiciness1452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleSpiciness1469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleSpiciness1486 = new BitSet(new long[]{0x0000000000000002L});
    }


}