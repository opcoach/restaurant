import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import com.opcoach.htmlgenerator.htmlGenerator;
import com.opcoach.menu.MMenu;


public class HtmlMenuGeneratorHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		htmlGenerator generator = new htmlGenerator(); 
		
		ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
		if(currentSelection instanceof IStructuredSelection)
		{
			IStructuredSelection isel = (IStructuredSelection) currentSelection;
			generator.generateCodeForMenu((MMenu)isel.getFirstElement());
		}
		return null;
	}

}
