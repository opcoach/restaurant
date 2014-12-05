package com.opcoach.restaurant.tables.sirius.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.diagram.impl.DNodeImpl;
import org.eclipse.swt.SWT;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import com.opcoach.restaurant.MTable;

public class BookCommandHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
		if (currentSelection instanceof IStructuredSelection) {
			IStructuredSelection currStrSel = (IStructuredSelection) currentSelection;
			if (currentSelection.isEmpty()) {
				MessageDialog.open(MessageDialog.INFORMATION, PlatformUI
						.getWorkbench().getActiveWorkbenchWindow().getShell(),
						"Booking", "Please select a table first!", SWT.NONE);
				return null;
			}
			if (currStrSel.size() != 1
					|| !(currStrSel.getFirstElement() instanceof EditPart)
					|| !(((EditPart) currStrSel.getFirstElement()).getModel() instanceof View)
					|| !(((View)((EditPart) currStrSel.getFirstElement()).getModel()).getElement() instanceof DNodeImpl)					
					|| !(((DNodeImpl)((View)((EditPart) currStrSel.getFirstElement()).getModel()).getElement()).getTarget() instanceof MTable)
			) {
				MessageDialog.open(MessageDialog.INFORMATION, PlatformUI
						.getWorkbench().getActiveWorkbenchWindow().getShell(),
						"Booking", "Please select ONE table!", SWT.NONE);
				return null;
			}
			
			MTable table = (MTable) (((DNodeImpl)((View)((EditPart) currStrSel.getFirstElement()).getModel()).getElement()).getTarget());

			MessageDialog.open(MessageDialog.INFORMATION, PlatformUI
					.getWorkbench().getActiveWorkbenchWindow().getShell(),
					"Booking",
					"Not yet implemented, however I know you wanted to add a booking for table number " + table.getNumber(),
					SWT.NONE);
		}
		return null;
	}
}
