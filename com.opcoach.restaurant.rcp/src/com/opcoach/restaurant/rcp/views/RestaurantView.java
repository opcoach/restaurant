package com.opcoach.restaurant.rcp.views;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import com.opcoach.restaurant.rcp.views.viewers.RestaurantTreeViewer;

public final class RestaurantView extends ViewPart {

	public static final String VIEW_ID = "com.opcoach.restaurant.rcp.view.tree";
	
	public RestaurantView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(final Composite parent) {
		
		final RestaurantTreeViewer viewer = new RestaurantTreeViewer(parent);
		
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
