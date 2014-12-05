package com.opcoach.restaurant.rcp;

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
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.opcoach.restaurant.MRestaurant;
import com.opcoach.restaurant.MRestaurantFactory;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "com.opcoach.restaurant.rcp"; //$NON-NLS-1$
	
	public static final String FILE_NAME = "Sample.restaurant";

	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
	
	public MRestaurant getRestaurant() {
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
		return (MRestaurant) res.getContents().get(0);
	}
	
}
