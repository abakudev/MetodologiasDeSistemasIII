package edu.utn.design.patterns.factory;

import edu.utn.design.patterns.DesktopForm;
import edu.utn.design.patterns.WebForm;

public interface AbstractFactoryForm {

    DesktopForm createDesktopForm();

    WebForm createWebForm();
}
