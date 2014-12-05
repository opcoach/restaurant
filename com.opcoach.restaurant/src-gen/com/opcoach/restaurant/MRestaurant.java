/**
 */
package com.opcoach.restaurant;

import com.opcoach.menu.MMenu;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restaurant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.opcoach.restaurant.MRestaurant#getMenus <em>Menus</em>}</li>
 *   <li>{@link com.opcoach.restaurant.MRestaurant#getTables <em>Tables</em>}</li>
 *   <li>{@link com.opcoach.restaurant.MRestaurant#getWaiters <em>Waiters</em>}</li>
 *   <li>{@link com.opcoach.restaurant.MRestaurant#getBookings <em>Bookings</em>}</li>
 *   <li>{@link com.opcoach.restaurant.MRestaurant#getCustomers <em>Customers</em>}</li>
 *   <li>{@link com.opcoach.restaurant.MRestaurant#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.opcoach.restaurant.MRestaurantPackage#getRestaurant()
 * @model
 * @generated
 */
public interface MRestaurant extends EObject {
	/**
	 * Returns the value of the '<em><b>Menus</b></em>' containment reference list.
	 * The list contents are of type {@link com.opcoach.menu.MMenu}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menus</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menus</em>' containment reference list.
	 * @see com.opcoach.restaurant.MRestaurantPackage#getRestaurant_Menus()
	 * @model containment="true"
	 * @generated
	 */
	EList<MMenu> getMenus();

	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
	 * The list contents are of type {@link com.opcoach.restaurant.MTable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see com.opcoach.restaurant.MRestaurantPackage#getRestaurant_Tables()
	 * @model containment="true"
	 * @generated
	 */
	EList<MTable> getTables();

	/**
	 * Returns the value of the '<em><b>Waiters</b></em>' containment reference list.
	 * The list contents are of type {@link com.opcoach.restaurant.MWaiter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Waiters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waiters</em>' containment reference list.
	 * @see com.opcoach.restaurant.MRestaurantPackage#getRestaurant_Waiters()
	 * @model containment="true"
	 * @generated
	 */
	EList<MWaiter> getWaiters();

	/**
	 * Returns the value of the '<em><b>Bookings</b></em>' containment reference list.
	 * The list contents are of type {@link com.opcoach.restaurant.MBooking}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bookings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookings</em>' containment reference list.
	 * @see com.opcoach.restaurant.MRestaurantPackage#getRestaurant_Bookings()
	 * @model containment="true"
	 * @generated
	 */
	EList<MBooking> getBookings();

	/**
	 * Returns the value of the '<em><b>Customers</b></em>' containment reference list.
	 * The list contents are of type {@link com.opcoach.restaurant.MCustomer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customers</em>' containment reference list.
	 * @see com.opcoach.restaurant.MRestaurantPackage#getRestaurant_Customers()
	 * @model containment="true"
	 * @generated
	 */
	EList<MCustomer> getCustomers();

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
	 * @see com.opcoach.restaurant.MRestaurantPackage#getRestaurant_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.opcoach.restaurant.MRestaurant#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // MRestaurant
