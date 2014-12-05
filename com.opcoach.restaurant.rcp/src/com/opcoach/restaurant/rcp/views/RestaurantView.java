package com.opcoach.restaurant.rcp.views;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.part.ViewPart;

import com.opcoach.restaurant.rcp.Activator;
import com.opcoach.restaurant.rcp.views.viewers.RestaurantTreeViewer;

public final class RestaurantView extends ViewPart {

	public static final String VIEW_ID = "com.opcoach.restaurant.rcp.view.tree";
	
	private RestaurantTreeViewer viewer;
	
	public RestaurantView() {
		
	}

	@Override
	public void createPartControl(final Composite parent) {
		viewer = new RestaurantTreeViewer(parent);
		final Resource res = Activator.getDefault().getResource();
		viewer.setInput(res.getContents().get(0));
		
		MenuManager menuMgr = new MenuManager();
		Menu menu = menuMgr.createContextMenu(getViewer().getControl());
		getViewer().getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, getViewer());
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	public RestaurantTreeViewer getViewer() {
		return viewer;
	}

}
