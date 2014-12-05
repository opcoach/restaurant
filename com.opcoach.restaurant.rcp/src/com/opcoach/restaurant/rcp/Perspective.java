package com.opcoach.restaurant.rcp;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import com.opcoach.restaurant.rcp.views.MenuView;
import com.opcoach.restaurant.rcp.views.RestaurantView;

public class Perspective implements IPerspectiveFactory {

	/**
	 * The perspective identifier.
	 */
	public static final String PERSPECTIVE_ID
			= "com.opcoach.restaurant.rcp.perspective.id"; //$NON-NLS-1$

	/** The left area ratio. */
	private static final float LEFT_RATIO = 0.20f;
	private static final float BOTTOM_RATIO = 0.65f;
	
	public void createInitialLayout(IPageLayout layout) {
		
        final String editorArea = layout.getEditorArea();

        final IFolderLayout left = layout.createFolder("left", IPageLayout.LEFT, LEFT_RATIO, editorArea); //$NON-NLS-1$
        left.addView(RestaurantView.VIEW_ID);
        left.addView(IPageLayout.ID_PROJECT_EXPLORER);

		// BOTTOM: Problems
		final IFolderLayout bottom = layout.createFolder("bottom", IPageLayout.BOTTOM, BOTTOM_RATIO, // $NON-NLS-1$
				editorArea);
		bottom.addView(MenuView.VIEW_ID);
		bottom.addView(IPageLayout.ID_PROBLEM_VIEW);
	}
}
