package kz.zvezdochet.runner.ui;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.model.application.ui.advanced.MPerspective;
import org.eclipse.e4.ui.model.application.ui.advanced.MPerspectiveStack;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.basic.MWindowElement;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

public class PerspectiveTabs
{
    private MPerspectiveStack   mStack;
    private TabFolder           mFolder;
    
    @PostConstruct
    public void createUI(Composite parent, MWindow window, EModelService service)
    {        
        mFolder = new TabFolder(parent, SWT.TOP);        
        findStack(window);
        if (mStack == null)
            return;
        updateTabs();        
        mFolder.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e)
            {
                doTabClick();
            }
        });
    }
    
    private void updateTabs()
    {
        for (MPerspective perspective : mStack.getChildren())
        {
            TabItem ti = new TabItem(mFolder, SWT.NULL);
            ti.setText(perspective.getLabel());
            ti.setData("perspective", perspective);
        }
    }
    
    private void doTabClick()
    {
        TabItem ti = mFolder.getSelection()[0];
        MPerspective perspective = (MPerspective)ti.getData("perspective");
        mStack.setSelectedElement(perspective);
    }
    
    private void findStack(MWindow window)
    {
        for (MWindowElement elem : window.getChildren())
            if (elem instanceof MPerspectiveStack)
            {
                mStack = (MPerspectiveStack)elem;
                return;
            }
    }
}
