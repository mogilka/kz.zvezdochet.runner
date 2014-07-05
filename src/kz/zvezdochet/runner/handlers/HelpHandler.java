package kz.zvezdochet.runner.handlers;

import org.eclipse.e4.core.di.annotations.Execute;

public class HelpHandler {
	@Execute
	public void execute() {
		System.out.println("Called");
	}
}
