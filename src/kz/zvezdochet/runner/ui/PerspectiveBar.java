package kz.zvezdochet.runner.ui;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.model.application.ui.basic.MTrimmedWindow;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

public class PerspectiveBar {
	
	@PostConstruct
	public void createGui(MTrimmedWindow w, final EPartService ps) {
//		Group g = new Group(null, SWT.NONE);
//		MPerspectiveStack st = (MPerspectiveStack)w.getChildren().get(0);
//		for (final MPerspective p : st.getChildren()) {
//			Button b = new Button(g, SWT.RADIO);
//			b.setText(p.getLabel());
//			b.addSelectionListener(new SelectionListener() {
//				@Override
//				public void widgetSelected(SelectionEvent e) {
//					ps.switchPerspective(p);
//				}
//				@Override
//				public void widgetDefaultSelected(SelectionEvent e) {
//				}
//			});
//		}
	}
}