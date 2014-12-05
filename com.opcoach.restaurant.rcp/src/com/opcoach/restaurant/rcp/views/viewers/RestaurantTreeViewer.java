package com.opcoach.restaurant.rcp.views.viewers;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public final class RestaurantTreeViewer extends TreeViewer {

	public RestaurantTreeViewer(final Composite parent) {
		super(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		setAutoExpandLevel(ALL_LEVELS);
		
		final ComposedAdapterFactory composedAdapterFactory = 
				   new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		
		setContentProvider(new AdapterFactoryContentProvider(composedAdapterFactory));
		setLabelProvider(new AdapterFactoryLabelProvider(composedAdapterFactory));
	}

}
