package com.opcoach.restaurant.viewmodeleditor.editor;

import java.io.IOException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTView;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

/**
 * This is a generic editor that manages the form view for a selected Eobject
 * received in the EObjectEditorInput
 */
public class EObjectEditorPart extends EditorPart
{

	public static final String ID = "com.opcoach.restaurant.viewmodeleditor.editor.eObjectEditorPart";
	private ECPSWTView ecpView;
	private boolean dirty = false;

	public EObjectEditorPart()
	{
		
	}

	@Override
	public void doSave(IProgressMonitor monitor)
	{
		System.out.println("doSave, dirty "+dirty);

		try {
			getEObject().eResource().save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		dirty = false;
	}

	@Override
	public void doSaveAs()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException
	{
		setSite(site);
		setInput(input);
	}

	@Override
	public boolean isDirty()
	{
		System.out.println("dirty "+dirty);
		return dirty;
	}

	@Override
	public boolean isSaveAsAllowed()
	{
		return true;
	}

	@Override
	public void createPartControl(Composite parent)
	{
		try
		{
			EObject obj = getEObject();

			Adapter adapter = new AdapterImpl() {
				public void notifyChanged(Notification notification) {
					System.out.println("Data model has changed!!!");
					dirty = true;
				}
			};

			obj.eAdapters().add(adapter);

			ComposedAdapterFactory composedAdapterFactory = new ComposedAdapterFactory(
					ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

			AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(composedAdapterFactory);
			setPartName(labelProvider.getText(obj));

			ecpView = ECPSWTViewRenderer.INSTANCE.render(parent, obj);

		}
		catch (ECPRendererException e)
		{
			Label label = new Label(parent, SWT.NONE);
			label.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
			label.setText("Editor is not available");
		}
	}

	private EObject getEObject() {
		return ((EObjectEditorInput) getEditorInput()).getEObject();
	}

	@Override
	public void setFocus()
	{

	}
}
