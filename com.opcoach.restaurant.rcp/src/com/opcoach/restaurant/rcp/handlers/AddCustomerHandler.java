package com.opcoach.restaurant.rcp.handlers;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;

import com.opcoach.restaurant.MCustomer;
import com.opcoach.restaurant.MRestaurantFactory;
import com.opcoach.restaurant.rcp.Activator;


public final class AddCustomerHandler extends AbstractHandler implements
		IHandler {

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final MCustomer customer = MRestaurantFactory.eINSTANCE.createCustomer();
		customer.setName("<name>");
		Activator.getDefault().getRestaurant().getCustomers().add(customer);
		return null;
	}

}
