package kz.zvezdochet.runner;

import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * Страница настроек приложения
 * @author Natalie Didenko
 * @link https://www.eclipse.org/articles/Article-Field-Editors/field_editors.html
 */
public class WorkbenchPreferencePage extends PreferencePage implements IWorkbenchPreferencePage {

	public WorkbenchPreferencePage() {
		// TODO Auto-generated constructor stub
	}

	public WorkbenchPreferencePage(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public WorkbenchPreferencePage(String title, ImageDescriptor image) {
		super(title, image);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(IWorkbench workbench) {
		// second parameter is typically the plug-in id
//        setPreferenceStore(new ScopedPreferenceStore(InstanceScope.INSTANCE, "com.vogella.preferences.page"));
        setDescription("A demonstration of a preference page implementation");
	}

	@Override
	protected Control createContents(Composite parent) {
		Composite top = new Composite(parent, SWT.LEFT);

		// Sets the layout data for the top composite's 
		// place in its parent's layout.
		top.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		// Sets the layout for the top composite's 
		// children to populate.
		top.setLayout(new GridLayout());
				
		cacheDirEditor = new StringFieldEditor(CACHE_DIR_PATH, "Директория для кэша", top);
		cacheDirEditor.setPreferenceStore(getPreferenceStore());
		cacheDirEditor.load();
		return top;
	}

	private StringFieldEditor cacheDirEditor;

	@Override
	protected void performDefaults() {
		cacheDirEditor.loadDefault();
		super.performDefaults();
	}

	@Override
	public boolean performOk() {
		cacheDirEditor.store();
		return super.performOk();
	}

	public static String CACHE_DIR_PATH = "cache_dir_path";
}
