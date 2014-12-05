/**
 */
package menu;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Dish Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see menu.MMenuPackage#getDishType()
 * @model
 * @generated
 */
public enum DishType implements Enumerator {
	/**
	 * The '<em><b>Pork</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORK_VALUE
	 * @generated
	 * @ordered
	 */
	PORK(0, "pork", "pork"),

	/**
	 * The '<em><b>Poultry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POULTRY_VALUE
	 * @generated
	 * @ordered
	 */
	POULTRY(1, "poultry", "poultry"),

	/**
	 * The '<em><b>Beef</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEEF_VALUE
	 * @generated
	 * @ordered
	 */
	BEEF(2, "beef", "beef"),

	/**
	 * The '<em><b>Fish</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FISH_VALUE
	 * @generated
	 * @ordered
	 */
	FISH(3, "fish", "fish"),

	/**
	 * The '<em><b>Salad</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SALAD_VALUE
	 * @generated
	 * @ordered
	 */
	SALAD(4, "salad", "salad");

	/**
	 * The '<em><b>Pork</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pork</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PORK
	 * @model name="pork"
	 * @generated
	 * @ordered
	 */
	public static final int PORK_VALUE = 0;

	/**
	 * The '<em><b>Poultry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Poultry</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POULTRY
	 * @model name="poultry"
	 * @generated
	 * @ordered
	 */
	public static final int POULTRY_VALUE = 1;

	/**
	 * The '<em><b>Beef</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Beef</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEEF
	 * @model name="beef"
	 * @generated
	 * @ordered
	 */
	public static final int BEEF_VALUE = 2;

	/**
	 * The '<em><b>Fish</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fish</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FISH
	 * @model name="fish"
	 * @generated
	 * @ordered
	 */
	public static final int FISH_VALUE = 3;

	/**
	 * The '<em><b>Salad</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Salad</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SALAD
	 * @model name="salad"
	 * @generated
	 * @ordered
	 */
	public static final int SALAD_VALUE = 4;

	/**
	 * An array of all the '<em><b>Dish Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DishType[] VALUES_ARRAY =
		new DishType[] {
			PORK,
			POULTRY,
			BEEF,
			FISH,
			SALAD,
		};

	/**
	 * A public read-only list of all the '<em><b>Dish Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DishType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Dish Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DishType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DishType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dish Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DishType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DishType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dish Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DishType get(int value) {
		switch (value) {
			case PORK_VALUE: return PORK;
			case POULTRY_VALUE: return POULTRY;
			case BEEF_VALUE: return BEEF;
			case FISH_VALUE: return FISH;
			case SALAD_VALUE: return SALAD;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DishType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DishType
