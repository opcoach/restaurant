package com.opcoach.restaurant.rcp.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public final class RestaurantPerspective implements IPerspectiveFactory {

	/**
	 * The perspective identifier.
	 */
	public static final String PERSPECTIVE_ID
			= "com.opcoach.restaurant.perspective.id"; //$NON-NLS-1$
	
	/** The left area ratio. */
	private static final float LEFT_RATIO = 0.20f;
	
	/** The bottom area ratio. */
	private static final float BOTTOM_RATIO = 0.20f;
	
	@Override
	public void createInitialLayout(final IPageLayout layout) {
        final String editorArea = layout.getEditorArea();

        final IFolderLayout left = layout.createFolder("left", IPageLayout.LEFT, LEFT_RATIO, editorArea); //$NON-NLS-1$
        //left.addView("<navigator view id>");
        left.addView(IPageLayout.ID_PROJECT_EXPLORER);

		// BOTTOM: Problems
		IFolderLayout bottom = layout.createFolder("bottom", IPageLayout.BOTTOM, BOTTOM_RATIO, // $NON-NLS-1$
				editorArea);
		//bottom.addView("<menu view>");
		bottom.addView(IPageLayout.ID_PROBLEM_VIEW);
	}

}
