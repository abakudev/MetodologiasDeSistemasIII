package edu.utn.design.patterns.factory;

import edu.utn.design.patterns.AspForm;
import edu.utn.design.patterns.DesktopForm;
import edu.utn.design.patterns.WebForm;
import edu.utn.design.patterns.WinForm;

public class NetFactory implements AbstractFactoryForm {

    public DesktopForm createDesktopForm() {
        return new WinForm();
    }

    public WebForm createWebForm() {
        return new AspForm();
    }
}
