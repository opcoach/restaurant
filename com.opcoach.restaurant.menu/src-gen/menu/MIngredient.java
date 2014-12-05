/**
 */
package menu;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ingredient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link menu.MIngredient#getName <em>Name</em>}</li>
 *   <li>{@link menu.MIngredient#getSpiciness <em>Spiciness</em>}</li>
 * </ul>
 * </p>
 *
 * @see menu.MMenuPackage#getIngredient()
 * @model
 * @generated
 */
public interface MIngredient extends EObject {
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
	 * @see menu.MMenuPackage#getIngredient_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link menu.MIngredient#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Spiciness</b></em>' attribute.
	 * The literals are from the enumeration {@link menu.Spiciness}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spiciness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spiciness</em>' attribute.
	 * @see menu.Spiciness
	 * @see #setSpiciness(Spiciness)
	 * @see menu.MMenuPackage#getIngredient_Spiciness()
	 * @model
	 * @generated
	 */
	Spiciness getSpiciness();

	/**
	 * Sets the value of the '{@link menu.MIngredient#getSpiciness <em>Spiciness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spiciness</em>' attribute.
	 * @see menu.Spiciness
	 * @see #getSpiciness()
	 * @generated
	 */
	void setSpiciness(Spiciness value);

} // MIngredient
