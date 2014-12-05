/**
 */
package menu;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Amount Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see menu.MMenuPackage#getAmountType()
 * @model
 * @generated
 */
public enum AmountType implements Enumerator {
	/**
	 * The '<em><b>Gram</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAM_VALUE
	 * @generated
	 * @ordered
	 */
	GRAM(0, "gram", "gram"),

	/**
	 * The '<em><b>Milliliters</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILLILITERS_VALUE
	 * @generated
	 * @ordered
	 */
	MILLILITERS(1, "milliliters", "milliliters"),

	/**
	 * The '<em><b>Bottles</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTTLES_VALUE
	 * @generated
	 * @ordered
	 */
	BOTTLES(2, "bottles", "bottles"),

	/**
	 * The '<em><b>Items</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITEMS_VALUE
	 * @generated
	 * @ordered
	 */
	ITEMS(3, "items", "items");

	/**
	 * The '<em><b>Gram</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gram</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRAM
	 * @model name="gram"
	 * @generated
	 * @ordered
	 */
	public static final int GRAM_VALUE = 0;

	/**
	 * The '<em><b>Milliliters</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Milliliters</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MILLILITERS
	 * @model name="milliliters"
	 * @generated
	 * @ordered
	 */
	public static final int MILLILITERS_VALUE = 1;

	/**
	 * The '<em><b>Bottles</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bottles</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOTTLES
	 * @model name="bottles"
	 * @generated
	 * @ordered
	 */
	public static final int BOTTLES_VALUE = 2;

	/**
	 * The '<em><b>Items</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Items</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ITEMS
	 * @model name="items"
	 * @generated
	 * @ordered
	 */
	public static final int ITEMS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Amount Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AmountType[] VALUES_ARRAY =
		new AmountType[] {
			GRAM,
			MILLILITERS,
			BOTTLES,
			ITEMS,
		};

	/**
	 * A public read-only list of all the '<em><b>Amount Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AmountType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Amount Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AmountType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AmountType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Amount Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AmountType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AmountType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Amount Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AmountType get(int value) {
		switch (value) {
			case GRAM_VALUE: return GRAM;
			case MILLILITERS_VALUE: return MILLILITERS;
			case BOTTLES_VALUE: return BOTTLES;
			case ITEMS_VALUE: return ITEMS;
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
	private AmountType(int value, String name, String literal) {
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
	
} //AmountType
