package com.opcoach.restaurant.rcp.views.viewers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import com.opcoach.menu.MMenu;
import com.opcoach.restaurant.MBooking;
import com.opcoach.restaurant.MCustomer;
import com.opcoach.restaurant.MRestaurant;
import com.opcoach.restaurant.MTable;
import com.opcoach.restaurant.MWaiter;
import com.opcoach.restaurant.viewmodeleditor.editor.EObjectEditorInput;

public final class RestaurantTreeViewer extends TreeViewer {

	public static final String FORM_EDITOR_ID = "com.opcoach.restaurant.viewmodeleditor.editor.eObjectEditorPart";
	public static final String MENU_DSL_EDITOR_ID = "com.opcoach.restaurant.menu.xtext.MenuDsl";
	public static final String DEFAULT_MODEL_EDITOR_ID = "com.opcoach.restaurant.presentation.RestaurantEditorID";
	
	public RestaurantTreeViewer(final Composite parent) {
		super(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		setAutoExpandLevel(ALL_LEVELS);
		
		final ComposedAdapterFactory composedAdapterFactory = 
				   new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		
		setContentProvider(new AdapterFactoryContentProvider(composedAdapterFactory));
		setLabelProvider(new AdapterFactoryLabelProvider(composedAdapterFactory));
		
		addDoubleClickListener(createDoubleClickListener());
	}

	private IDoubleClickListener createDoubleClickListener() {
		return new IDoubleClickListener() {
			
			@Override
			public void doubleClick(final DoubleClickEvent event) {
				
				final IStructuredSelection selection = (IStructuredSelection) event.getSelection();
				final Object sel = selection.getFirstElement();
				if (sel == null || !(sel instanceof EObject)) {
					return;
				}
				
				final String editorID = getEditorID(sel);
				if (editorID == null) {
					return;
				}
				final IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try {
					page.openEditor(new EObjectEditorInput((EObject) sel), editorID, true);
				} catch (PartInitException exc) {
					exc.printStackTrace();
				}				
				
			}
		};
	}
	
	private String getEditorID(final Object obj) {
		if (obj instanceof MCustomer || obj instanceof MBooking) {
			return FORM_EDITOR_ID;
		}
		if (obj instanceof MMenu) {
			return MENU_DSL_EDITOR_ID;
		}
		if (obj instanceof MWaiter || obj instanceof MTable || obj instanceof MRestaurant) {
			return DEFAULT_MODEL_EDITOR_ID;
		}
		return null;
	}
	
}
