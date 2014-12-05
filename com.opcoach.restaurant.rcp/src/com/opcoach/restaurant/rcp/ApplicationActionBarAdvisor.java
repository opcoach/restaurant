package com.opcoach.restaurant.rcp;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.IAction;
import org.eclipse.ui.actions.ActionFactory;

public class ApplicationActionBarAdvisor extends ActionBarAdvisor {
	private IAction preferencesAction;
	private IAction saveAction;
	private IAction quitAction;
	private IAction copyAction;
	private IAction cutAction;
	private IAction pasteAction;

    public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
        super(configurer);
    }

    protected void makeActions(IWorkbenchWindow window) {
    	{
    		preferencesAction = ActionFactory.PREFERENCES.create(window);
    		register(preferencesAction);
    	}
    	{
    		saveAction = ActionFactory.SAVE.create(window);
    		register(saveAction);
    	}
    	{
    		quitAction = ActionFactory.QUIT.create(window);
    		register(quitAction);
    	}
    	{
    		copyAction = ActionFactory.COPY.create(window);
    		register(copyAction);
    	}
    	{
    		cutAction = ActionFactory.CUT.create(window);
    		register(cutAction);
    	}
    	{
    		pasteAction = ActionFactory.PASTE.create(window);
    		register(pasteAction);
    	}
    }

    protected void fillMenuBar(IMenuManager menuBar) {
    	
    	MenuManager menuManager = new MenuManager("New MenuManager");
    	menuManager.setMenuText("File");
    	menuBar.add(menuManager);
    	menuManager.add(saveAction);
    	menuManager.add(quitAction);
    	
    	MenuManager menuManager_1 = new MenuManager("New MenuManager");
    	menuManager_1.setMenuText("Edit");
    	menuBar.add(menuManager_1);
    	menuManager_1.add(copyAction);
    	menuManager_1.add(cutAction);
    	menuManager_1.add(pasteAction);
    	
    	MenuManager menuManager_2 = new MenuManager("New MenuManager");
    	menuManager_2.setMenuText("Window");
    	menuBar.add(menuManager_2);
    	menuManager_2.add(preferencesAction);
    }
    
}
