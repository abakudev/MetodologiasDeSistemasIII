package edu.utn.design.patterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JspForm implements WebForm {

    private static final Logger LOGGER = LoggerFactory.getLogger(JspForm.class);

    public void show() {
        LOGGER.info("This is show method from JspForm!");
    }

    public void timeout() {
        LOGGER.info("This is timeout method from JspForm!");
    }
}
