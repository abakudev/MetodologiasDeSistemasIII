package edu.utn.design.patterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JavaForm implements DesktopForm {

    private static final Logger LOGGER = LoggerFactory.getLogger(JavaForm.class);

    public void show() {
        LOGGER.info("This is show method from JavaForm!");
    }

    public void isModal() {
        LOGGER.info("This is isModal method from JavaForm!");
    }
}
