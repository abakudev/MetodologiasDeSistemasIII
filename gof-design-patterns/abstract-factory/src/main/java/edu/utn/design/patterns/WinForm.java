package edu.utn.design.patterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WinForm implements DesktopForm {

    private static final Logger LOGGER = LoggerFactory.getLogger(WinForm.class);

    public void show() {
        LOGGER.info("This is show method from WinForm!");
    }

    public void isModal() {
        LOGGER.info("This is isModal method from WinForm!");
    }
}
