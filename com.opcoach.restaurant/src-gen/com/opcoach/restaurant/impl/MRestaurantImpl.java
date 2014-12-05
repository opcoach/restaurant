/**
 */
package com.opcoach.restaurant.impl;

import com.opcoach.menu.MMenu;

import com.opcoach.restaurant.MBooking;
import com.opcoach.restaurant.MCustomer;
import com.opcoach.restaurant.MRestaurant;
import com.opcoach.restaurant.MRestaurantPackage;
import com.opcoach.restaurant.MTable;
import com.opcoach.restaurant.MWaiter;

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
 * An implementation of the model object '<em><b>Restaurant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.opcoach.restaurant.impl.MRestaurantImpl#getMenus <em>Menus</em>}</li>
 *   <li>{@link com.opcoach.restaurant.impl.MRestaurantImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link com.opcoach.restaurant.impl.MRestaurantImpl#getWaiters <em>Waiters</em>}</li>
 *   <li>{@link com.opcoach.restaurant.impl.MRestaurantImpl#getBookings <em>Bookings</em>}</li>
 *   <li>{@link com.opcoach.restaurant.impl.MRestaurantImpl#getCustomers <em>Customers</em>}</li>
 *   <li>{@link com.opcoach.restaurant.impl.MRestaurantImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MRestaurantImpl extends MinimalEObjectImpl.Container implements MRestaurant {
	/**
	 * The cached value of the '{@link #getMenus() <em>Menus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenus()
	 * @generated
	 * @ordered
	 */
	protected EList<MMenu> menus;

	/**
	 * The cached value of the '{@link #getTables() <em>Tables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTables()
	 * @generated
	 * @ordered
	 */
	protected EList<MTable> tables;

	/**
	 * The cached value of the '{@link #getWaiters() <em>Waiters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaiters()
	 * @generated
	 * @ordered
	 */
	protected EList<MWaiter> waiters;

	/**
	 * The cached value of the '{@link #getBookings() <em>Bookings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookings()
	 * @generated
	 * @ordered
	 */
	protected EList<MBooking> bookings;

	/**
	 * The cached value of the '{@link #getCustomers() <em>Customers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomers()
	 * @generated
	 * @ordered
	 */
	protected EList<MCustomer> customers;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MRestaurantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MRestaurantPackage.Literals.RESTAURANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MMenu> getMenus() {
		if (menus == null) {
			menus = new EObjectContainmentEList<MMenu>(MMenu.class, this, MRestaurantPackage.RESTAURANT__MENUS);
		}
		return menus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MTable> getTables() {
		if (tables == null) {
			tables = new EObjectContainmentEList<MTable>(MTable.class, this, MRestaurantPackage.RESTAURANT__TABLES);
		}
		return tables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MWaiter> getWaiters() {
		if (waiters == null) {
			waiters = new EObjectContainmentEList<MWaiter>(MWaiter.class, this, MRestaurantPackage.RESTAURANT__WAITERS);
		}
		return waiters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MBooking> getBookings() {
		if (bookings == null) {
			bookings = new EObjectContainmentEList<MBooking>(MBooking.class, this, MRestaurantPackage.RESTAURANT__BOOKINGS);
		}
		return bookings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MCustomer> getCustomers() {
		if (customers == null) {
			customers = new EObjectContainmentEList<MCustomer>(MCustomer.class, this, MRestaurantPackage.RESTAURANT__CUSTOMERS);
		}
		return customers;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MRestaurantPackage.RESTAURANT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MRestaurantPackage.RESTAURANT__MENUS:
				return ((InternalEList<?>)getMenus()).basicRemove(otherEnd, msgs);
			case MRestaurantPackage.RESTAURANT__TABLES:
				return ((InternalEList<?>)getTables()).basicRemove(otherEnd, msgs);
			case MRestaurantPackage.RESTAURANT__WAITERS:
				return ((InternalEList<?>)getWaiters()).basicRemove(otherEnd, msgs);
			case MRestaurantPackage.RESTAURANT__BOOKINGS:
				return ((InternalEList<?>)getBookings()).basicRemove(otherEnd, msgs);
			case MRestaurantPackage.RESTAURANT__CUSTOMERS:
				return ((InternalEList<?>)getCustomers()).basicRemove(otherEnd, msgs);
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
			case MRestaurantPackage.RESTAURANT__MENUS:
				return getMenus();
			case MRestaurantPackage.RESTAURANT__TABLES:
				return getTables();
			case MRestaurantPackage.RESTAURANT__WAITERS:
				return getWaiters();
			case MRestaurantPackage.RESTAURANT__BOOKINGS:
				return getBookings();
			case MRestaurantPackage.RESTAURANT__CUSTOMERS:
				return getCustomers();
			case MRestaurantPackage.RESTAURANT__NAME:
				return getName();
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
			case MRestaurantPackage.RESTAURANT__MENUS:
				getMenus().clear();
				getMenus().addAll((Collection<? extends MMenu>)newValue);
				return;
			case MRestaurantPackage.RESTAURANT__TABLES:
				getTables().clear();
				getTables().addAll((Collection<? extends MTable>)newValue);
				return;
			case MRestaurantPackage.RESTAURANT__WAITERS:
				getWaiters().clear();
				getWaiters().addAll((Collection<? extends MWaiter>)newValue);
				return;
			case MRestaurantPackage.RESTAURANT__BOOKINGS:
				getBookings().clear();
				getBookings().addAll((Collection<? extends MBooking>)newValue);
				return;
			case MRestaurantPackage.RESTAURANT__CUSTOMERS:
				getCustomers().clear();
				getCustomers().addAll((Collection<? extends MCustomer>)newValue);
				return;
			case MRestaurantPackage.RESTAURANT__NAME:
				setName((String)newValue);
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
			case MRestaurantPackage.RESTAURANT__MENUS:
				getMenus().clear();
				return;
			case MRestaurantPackage.RESTAURANT__TABLES:
				getTables().clear();
				return;
			case MRestaurantPackage.RESTAURANT__WAITERS:
				getWaiters().clear();
				return;
			case MRestaurantPackage.RESTAURANT__BOOKINGS:
				getBookings().clear();
				return;
			case MRestaurantPackage.RESTAURANT__CUSTOMERS:
				getCustomers().clear();
				return;
			case MRestaurantPackage.RESTAURANT__NAME:
				setName(NAME_EDEFAULT);
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
			case MRestaurantPackage.RESTAURANT__MENUS:
				return menus != null && !menus.isEmpty();
			case MRestaurantPackage.RESTAURANT__TABLES:
				return tables != null && !tables.isEmpty();
			case MRestaurantPackage.RESTAURANT__WAITERS:
				return waiters != null && !waiters.isEmpty();
			case MRestaurantPackage.RESTAURANT__BOOKINGS:
				return bookings != null && !bookings.isEmpty();
			case MRestaurantPackage.RESTAURANT__CUSTOMERS:
				return customers != null && !customers.isEmpty();
			case MRestaurantPackage.RESTAURANT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(')');
		return result.toString();
	}

} //MRestaurantImpl
