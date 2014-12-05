package com.opcoach.restaurant.rcp.views;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import com.opcoach.restaurant.MRestaurant;
import com.opcoach.restaurant.MRestaurantFactory;
import com.opcoach.restaurant.rcp.views.viewers.RestaurantTreeViewer;

public final class RestaurantView extends ViewPart {

	public static final String VIEW_ID = "com.opcoach.restaurant.rcp.view.tree";
	
	public static final String FILE_NAME = "Sample.restaurant";
	
	public RestaurantView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(final Composite parent) {
		
		final RestaurantTreeViewer viewer = new RestaurantTreeViewer(parent);
		
		final ResourceSet resSet = new ResourceSetImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("restaurant", new XMIResourceFactoryImpl());
		
		final IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		final IPath path = root.getRawLocation();
		final IPath fPath = path.append(FILE_NAME);
		final URI uri = URI.createFileURI(fPath.toPortableString());
		
		if (!new File(fPath.toOSString()).exists()) {
			final Resource res = resSet.createResource(uri);
			final MRestaurant restaurant = MRestaurantFactory.eINSTANCE.createRestaurant();
			restaurant.setName("U Józefa");
			res.getContents().add(restaurant);
			try {
				res.save(null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		final Resource res = resSet.getResource(uri, true);		
		viewer.setInput(res.getContents().get(0));
		
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
