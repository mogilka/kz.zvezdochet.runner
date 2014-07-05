package kz.zvezdochet.runner.handlers;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.IWorkbench;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

public class ExitHandler {
	@Execute
	public void execute(IWorkbench workbench,
			@Named(IServiceConstants.ACTIVE_SHELL) Shell shell) {
		if (MessageDialog.openConfirm(shell, "Подтверждение",
				"Вы действительно хотите выйти?")) {
			workbench.close();
		}
	}

	// Default to true if not implemented
//	@CanExecute
//		public boolean canExecute() {
//		// TODO add some logic here
//		return true;
//	}
	
	/*
	 *   @Execute
public void execute(final Shell shell, EModelService service, 
  MWindow window) {
  IWindowCloseHandler handler = new IWindowCloseHandler() {
    @Override
    public boolean close(MWindow window) {
      return MessageDialog.openConfirm(shell, 
      "Close", 
      "You will loose data. Really close?");
    }
  };
window.getContext().set(IWindowCloseHandler.class, handler);
} 


@Execute
public void execute(MHandledItem item) {
  MCommand command = item.getCommand();
  // Prints out the commmand ID
  System.out.println(command.getElementId());
} 


@Execute
public void execute(IEclipseContext context) {
// put an example value in the context
  context.set("myactivePartId", 
  "com.example.e4.rcp.ui.parts.todooverview");
} 

	 */
}
