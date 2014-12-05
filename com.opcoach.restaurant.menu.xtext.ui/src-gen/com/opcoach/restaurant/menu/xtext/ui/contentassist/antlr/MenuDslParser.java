/*
* generated by Xtext
*/
package com.opcoach.restaurant.menu.xtext.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.opcoach.restaurant.menu.xtext.services.MenuDslGrammarAccess;

public class MenuDslParser extends AbstractContentAssistParser {
	
	@Inject
	private MenuDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.opcoach.restaurant.menu.xtext.ui.contentassist.antlr.internal.InternalMenuDslParser createParser() {
		com.opcoach.restaurant.menu.xtext.ui.contentassist.antlr.internal.InternalMenuDslParser result = new com.opcoach.restaurant.menu.xtext.ui.contentassist.antlr.internal.InternalMenuDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getCategoryAccess().getAlternatives(), "rule__Category__Alternatives");
					put(grammarAccess.getAmountTypeAccess().getAlternatives(), "rule__AmountType__Alternatives");
					put(grammarAccess.getSpicinessAccess().getAlternatives(), "rule__Spiciness__Alternatives");
					put(grammarAccess.getMenuAccess().getGroup(), "rule__Menu__Group__0");
					put(grammarAccess.getMenuAccess().getGroup_3(), "rule__Menu__Group_3__0");
					put(grammarAccess.getGroupAccess().getGroup(), "rule__Group__Group__0");
					put(grammarAccess.getGroupAccess().getGroup_4(), "rule__Group__Group_4__0");
					put(grammarAccess.getGroupAccess().getGroup_4_1(), "rule__Group__Group_4_1__0");
					put(grammarAccess.getRecipeAccess().getGroup(), "rule__Recipe__Group__0");
					put(grammarAccess.getRecipeAccess().getGroup_3(), "rule__Recipe__Group_3__0");
					put(grammarAccess.getRecipeAccess().getGroup_4(), "rule__Recipe__Group_4__0");
					put(grammarAccess.getRecipeAccess().getGroup_5(), "rule__Recipe__Group_5__0");
					put(grammarAccess.getRecipeAccess().getGroup_5_1(), "rule__Recipe__Group_5_1__0");
					put(grammarAccess.getEBigDecimalAccess().getGroup(), "rule__EBigDecimal__Group__0");
					put(grammarAccess.getEBigDecimalAccess().getGroup_1(), "rule__EBigDecimal__Group_1__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getIngredientAccess().getGroup(), "rule__Ingredient__Group__0");
					put(grammarAccess.getMenuAccess().getNameAssignment_2(), "rule__Menu__NameAssignment_2");
					put(grammarAccess.getMenuAccess().getGroupsAssignment_3_0(), "rule__Menu__GroupsAssignment_3_0");
					put(grammarAccess.getMenuAccess().getGroupsAssignment_3_1(), "rule__Menu__GroupsAssignment_3_1");
					put(grammarAccess.getGroupAccess().getNameAssignment_2(), "rule__Group__NameAssignment_2");
					put(grammarAccess.getGroupAccess().getCategoryAssignment_3(), "rule__Group__CategoryAssignment_3");
					put(grammarAccess.getGroupAccess().getRecipesAssignment_4_0(), "rule__Group__RecipesAssignment_4_0");
					put(grammarAccess.getGroupAccess().getRecipesAssignment_4_1_1(), "rule__Group__RecipesAssignment_4_1_1");
					put(grammarAccess.getRecipeAccess().getNameAssignment_2(), "rule__Recipe__NameAssignment_2");
					put(grammarAccess.getRecipeAccess().getPriceAssignment_3_1(), "rule__Recipe__PriceAssignment_3_1");
					put(grammarAccess.getRecipeAccess().getAmountAssignment_4_0(), "rule__Recipe__AmountAssignment_4_0");
					put(grammarAccess.getRecipeAccess().getAmountTypeAssignment_4_1(), "rule__Recipe__AmountTypeAssignment_4_1");
					put(grammarAccess.getRecipeAccess().getIngredientsAssignment_5_0(), "rule__Recipe__IngredientsAssignment_5_0");
					put(grammarAccess.getRecipeAccess().getIngredientsAssignment_5_1_1(), "rule__Recipe__IngredientsAssignment_5_1_1");
					put(grammarAccess.getIngredientAccess().getNameAssignment_2(), "rule__Ingredient__NameAssignment_2");
					put(grammarAccess.getIngredientAccess().getSpicinessAssignment_3(), "rule__Ingredient__SpicinessAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.opcoach.restaurant.menu.xtext.ui.contentassist.antlr.internal.InternalMenuDslParser typedParser = (com.opcoach.restaurant.menu.xtext.ui.contentassist.antlr.internal.InternalMenuDslParser) parser;
			typedParser.entryRuleMenu();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public MenuDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MenuDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
