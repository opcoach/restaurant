/**
 */
package com.opcoach.menu;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.menu.MRecipe#getName <em>Name</em>}</li>
 *   <li>{@link com.opcoach.menu.MRecipe#getPrice <em>Price</em>}</li>
 *   <li>{@link com.opcoach.menu.MRecipe#getAmount <em>Amount</em>}</li>
 *   <li>{@link com.opcoach.menu.MRecipe#getAmountType <em>Amount Type</em>}</li>
 *   <li>{@link com.opcoach.menu.MRecipe#getIngredients <em>Ingredients</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.menu.MMenuPackage#getRecipe()
 * @model
 * @generated
 */
public interface MRecipe extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.opcoach.menu.MMenuPackage#getRecipe_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.opcoach.menu.MRecipe#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(BigDecimal)
	 * @see com.opcoach.menu.MMenuPackage#getRecipe_Price()
	 * @model
	 * @generated
	 */
	BigDecimal getPrice();

	/**
	 * Sets the value of the '{@link com.opcoach.menu.MRecipe#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(int)
	 * @see com.opcoach.menu.MMenuPackage#getRecipe_Amount()
	 * @model
	 * @generated
	 */
	int getAmount();

	/**
	 * Sets the value of the '{@link com.opcoach.menu.MRecipe#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(int value);

	/**
	 * Returns the value of the '<em><b>Amount Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.opcoach.menu.AmountType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Type</em>' attribute.
	 * @see com.opcoach.menu.AmountType
	 * @see #setAmountType(AmountType)
	 * @see com.opcoach.menu.MMenuPackage#getRecipe_AmountType()
	 * @model
	 * @generated
	 */
	AmountType getAmountType();

	/**
	 * Sets the value of the '{@link com.opcoach.menu.MRecipe#getAmountType <em>Amount Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Type</em>' attribute.
	 * @see com.opcoach.menu.AmountType
	 * @see #getAmountType()
	 * @generated
	 */
	void setAmountType(AmountType value);

	/**
	 * Returns the value of the '<em><b>Ingredients</b></em>' containment reference list.
	 * The list contents are of type {@link com.opcoach.menu.MIngredient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ingredients</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ingredients</em>' containment reference list.
	 * @see com.opcoach.menu.MMenuPackage#getRecipe_Ingredients()
	 * @model containment="true"
	 * @generated
	 */
	EList<MIngredient> getIngredients();

} // MRecipe
