package com.opcoach.restaurant.menu.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.opcoach.menu.MGroup;
import com.opcoach.menu.MIngredient;
import com.opcoach.menu.MMenu;
import com.opcoach.menu.MMenuPackage;
import com.opcoach.menu.MRecipe;
import com.opcoach.restaurant.menu.xtext.services.MenuDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public abstract class AbstractMenuDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MenuDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MMenuPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MMenuPackage.GROUP:
				if(context == grammarAccess.getGroupRule()) {
					sequence_Group(context, (MGroup) semanticObject); 
					return; 
				}
				else break;
			case MMenuPackage.INGREDIENT:
				if(context == grammarAccess.getIngredientRule()) {
					sequence_Ingredient(context, (MIngredient) semanticObject); 
					return; 
				}
				else break;
			case MMenuPackage.MENU:
				if(context == grammarAccess.getMenuRule()) {
					sequence_Menu(context, (MMenu) semanticObject); 
					return; 
				}
				else break;
			case MMenuPackage.RECIPE:
				if(context == grammarAccess.getRecipeRule()) {
					sequence_Recipe(context, (MRecipe) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=EString category=Category? (recipes+=Recipe recipes+=Recipe*)?)
	 */
	protected void sequence_Group(EObject context, MGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString spiciness=Spiciness?)
	 */
	protected void sequence_Ingredient(EObject context, MIngredient semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (groups+=Group groups+=Group*)?)
	 */
	protected void sequence_Menu(EObject context, MMenu semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString price=EBigDecimal? amount=EInt? amountType=AmountType? (ingredients+=Ingredient ingredients+=Ingredient*)?)
	 */
	protected void sequence_Recipe(EObject context, MRecipe semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
