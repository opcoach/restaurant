/**
 */
package com.opcoach.menu.impl;

import com.opcoach.menu.AmountType;
import com.opcoach.menu.MIngredient;
import com.opcoach.menu.MMenuPackage;
import com.opcoach.menu.MRecipe;

import java.math.BigDecimal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.menu.impl.MRecipeImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.opcoach.menu.impl.MRecipeImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link com.opcoach.menu.impl.MRecipeImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link com.opcoach.menu.impl.MRecipeImpl#getAmountType <em>Amount Type</em>}</li>
 *   <li>{@link com.opcoach.menu.impl.MRecipeImpl#getIngredients <em>Ingredients</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MRecipeImpl extends MinimalEObjectImpl.Container implements MRecipe {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal PRICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final int AMOUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected int amount = AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmountType() <em>Amount Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountType()
	 * @generated
	 * @ordered
	 */
	protected static final AmountType AMOUNT_TYPE_EDEFAULT = AmountType.GRAM;

	/**
	 * The cached value of the '{@link #getAmountType() <em>Amount Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountType()
	 * @generated
	 * @ordered
	 */
	protected AmountType amountType = AMOUNT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIngredients() <em>Ingredients</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngredients()
	 * @generated
	 * @ordered
	 */
	protected EList<MIngredient> ingredients;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MRecipeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MMenuPackage.Literals.RECIPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MMenuPackage.RECIPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(BigDecimal newPrice) {
		BigDecimal oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MMenuPackage.RECIPE__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(int newAmount) {
		int oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MMenuPackage.RECIPE__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmountType getAmountType() {
		return amountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountType(AmountType newAmountType) {
		AmountType oldAmountType = amountType;
		amountType = newAmountType == null ? AMOUNT_TYPE_EDEFAULT : newAmountType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MMenuPackage.RECIPE__AMOUNT_TYPE, oldAmountType, amountType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MIngredient> getIngredients() {
		if (ingredients == null) {
			ingredients = new EObjectContainmentEList<MIngredient>(MIngredient.class, this, MMenuPackage.RECIPE__INGREDIENTS);
		}
		return ingredients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MMenuPackage.RECIPE__INGREDIENTS:
				return ((InternalEList<?>)getIngredients()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MMenuPackage.RECIPE__NAME:
				return getName();
			case MMenuPackage.RECIPE__PRICE:
				return getPrice();
			case MMenuPackage.RECIPE__AMOUNT:
				return getAmount();
			case MMenuPackage.RECIPE__AMOUNT_TYPE:
				return getAmountType();
			case MMenuPackage.RECIPE__INGREDIENTS:
				return getIngredients();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MMenuPackage.RECIPE__NAME:
				setName((String)newValue);
				return;
			case MMenuPackage.RECIPE__PRICE:
				setPrice((BigDecimal)newValue);
				return;
			case MMenuPackage.RECIPE__AMOUNT:
				setAmount((Integer)newValue);
				return;
			case MMenuPackage.RECIPE__AMOUNT_TYPE:
				setAmountType((AmountType)newValue);
				return;
			case MMenuPackage.RECIPE__INGREDIENTS:
				getIngredients().clear();
				getIngredients().addAll((Collection<? extends MIngredient>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MMenuPackage.RECIPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MMenuPackage.RECIPE__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case MMenuPackage.RECIPE__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case MMenuPackage.RECIPE__AMOUNT_TYPE:
				setAmountType(AMOUNT_TYPE_EDEFAULT);
				return;
			case MMenuPackage.RECIPE__INGREDIENTS:
				getIngredients().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MMenuPackage.RECIPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MMenuPackage.RECIPE__PRICE:
				return PRICE_EDEFAULT == null ? price != null : !PRICE_EDEFAULT.equals(price);
			case MMenuPackage.RECIPE__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
			case MMenuPackage.RECIPE__AMOUNT_TYPE:
				return amountType != AMOUNT_TYPE_EDEFAULT;
			case MMenuPackage.RECIPE__INGREDIENTS:
				return ingredients != null && !ingredients.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", price: ");
		result.append(price);
		result.append(", amount: ");
		result.append(amount);
		result.append(", amountType: ");
		result.append(amountType);
		result.append(')');
		return result.toString();
	}

} //MRecipeImpl
