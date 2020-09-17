package edu.utn.design.patterns.factory;

import edu.utn.design.patterns.DesktopForm;
import edu.utn.design.patterns.JavaForm;
import edu.utn.design.patterns.JspForm;
import edu.utn.design.patterns.WebForm;

public class JavaFactory implements AbstractFactoryForm {

    public DesktopForm createDesktopForm() {
        return new JavaForm();
    }

    public WebForm createWebForm() {
        return new JspForm();
    }
}
