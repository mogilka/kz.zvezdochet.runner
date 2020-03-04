package kz.zvezdochet.runner;

/**
 * Инициализация настроек по умолнчаю
 * @author Natalie Didenko
 * @link https://www.vogella.com/tutorials/EclipsePreferences/article.html
 */
public class AbstractPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {

	public AbstractPreferenceInitializer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initializeDefaultPreferences() {
//		ScopedPreferenceStore scopedPreferenceStore = new ScopedPreferenceStore(InstanceScope.INSTANCE, "kz.zvezdochet.runner");
//        scopedPreferenceStore.setDefault(WorkbenchPreferencePage.CACHE_DIR_PATH, PlatformUtil.getPath(kz.zvezdochet.Activator.PLUGIN_ID, "/cache/").getPath());
	}
}
