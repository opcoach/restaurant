/**
 */
package menu.impl;

import menu.MIngredient;
import menu.MMenuPackage;
import menu.Spiciness;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ingredient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link menu.impl.MIngredientImpl#getName <em>Name</em>}</li>
 *   <li>{@link menu.impl.MIngredientImpl#getSpiciness <em>Spiciness</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MIngredientImpl extends MinimalEObjectImpl.Container implements MIngredient {
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
	 * The default value of the '{@link #getSpiciness() <em>Spiciness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpiciness()
	 * @generated
	 * @ordered
	 */
	protected static final Spiciness SPICINESS_EDEFAULT = Spiciness.VERY_HOT;

	/**
	 * The cached value of the '{@link #getSpiciness() <em>Spiciness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpiciness()
	 * @generated
	 * @ordered
	 */
	protected Spiciness spiciness = SPICINESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MIngredientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MMenuPackage.Literals.INGREDIENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MMenuPackage.INGREDIENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Spiciness getSpiciness() {
		return spiciness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpiciness(Spiciness newSpiciness) {
		Spiciness oldSpiciness = spiciness;
		spiciness = newSpiciness == null ? SPICINESS_EDEFAULT : newSpiciness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MMenuPackage.INGREDIENT__SPICINESS, oldSpiciness, spiciness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MMenuPackage.INGREDIENT__NAME:
				return getName();
			case MMenuPackage.INGREDIENT__SPICINESS:
				return getSpiciness();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MMenuPackage.INGREDIENT__NAME:
				setName((String)newValue);
				return;
			case MMenuPackage.INGREDIENT__SPICINESS:
				setSpiciness((Spiciness)newValue);
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
			case MMenuPackage.INGREDIENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MMenuPackage.INGREDIENT__SPICINESS:
				setSpiciness(SPICINESS_EDEFAULT);
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
			case MMenuPackage.INGREDIENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MMenuPackage.INGREDIENT__SPICINESS:
				return spiciness != SPICINESS_EDEFAULT;
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
		result.append(", spiciness: ");
		result.append(spiciness);
		result.append(')');
		return result.toString();
	}

} //MIngredientImpl
