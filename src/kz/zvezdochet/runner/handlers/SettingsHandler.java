package kz.zvezdochet.runner.handlers;

import org.eclipse.e4.core.di.annotations.Execute;

public class SettingsHandler {
	@Execute
	public void execute() {
		System.out.println("Called");
	}
}
