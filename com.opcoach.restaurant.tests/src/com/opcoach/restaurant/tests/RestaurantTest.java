/**
 */
package com.opcoach.restaurant.tests;

import com.opcoach.restaurant.MRestaurant;
import com.opcoach.restaurant.MRestaurantFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Restaurant</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestaurantTest extends TestCase {

	/**
	 * The fixture for this Restaurant test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MRestaurant fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RestaurantTest.class);
	}

	/**
	 * Constructs a new Restaurant test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestaurantTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Restaurant test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MRestaurant fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Restaurant test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MRestaurant getFixture() {
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
		setFixture(MRestaurantFactory.eINSTANCE.createRestaurant());
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

} //RestaurantTest
