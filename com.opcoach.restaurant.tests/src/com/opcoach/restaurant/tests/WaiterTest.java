/**
 */
package com.opcoach.restaurant.tests;

import com.opcoach.restaurant.MRestaurantFactory;
import com.opcoach.restaurant.MWaiter;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Waiter</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WaiterTest extends TestCase {

	/**
	 * The fixture for this Waiter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MWaiter fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WaiterTest.class);
	}

	/**
	 * Constructs a new Waiter test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaiterTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Waiter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MWaiter fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Waiter test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MWaiter getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MRestaurantFactory.eINSTANCE.createWaiter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //WaiterTest
