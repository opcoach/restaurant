package com.opcoach.restaurant.rcp.handlers;

import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import com.opcoach.menu.MMenu;
import com.opcoach.menu.MMenuFactory;
import com.opcoach.restaurant.MRestaurant;
import com.opcoach.restaurant.rcp.Activator;
import com.opcoach.restaurant.rcp.views.RestaurantView;

public final class AddMenuHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final MMenu menu = MMenuFactory.eINSTANCE.createMenu();
		final Resource res = Activator.getDefault().getResource();
		final MRestaurant restaurant = (MRestaurant) res.getContents().get(0);
		restaurant.getMenus().add(menu);
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
