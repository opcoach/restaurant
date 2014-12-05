package com.opcoach.restaurant.rcp.handlers;
import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import com.opcoach.restaurant.MCustomer;
import com.opcoach.restaurant.MRestaurant;
import com.opcoach.restaurant.MRestaurantFactory;
import com.opcoach.restaurant.rcp.Activator;
import com.opcoach.restaurant.rcp.views.RestaurantView;


public final class AddCustomerHandler extends AbstractHandler implements
		IHandler {

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final MCustomer customer = MRestaurantFactory.eINSTANCE.createCustomer();
		customer.setName("<name>");
		final Resource res = Activator.getDefault().getResource();
		final MRestaurant restaurant = (MRestaurant) res.getContents().get(0);
		restaurant.getCustomers().add(customer);
		try {
			res.save(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		final IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		final RestaurantView view = (RestaurantView) page.findView(RestaurantView.VIEW_ID);
		view.getViewer().setInput(restaurant);
		
		return null;
	}

}
