package edu.utn.design.patterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AspForm implements WebForm {

    private static final Logger LOGGER = LoggerFactory.getLogger(AspForm.class);

    public void show() {
        LOGGER.info("This is show method from AspForm!");
    }

    public void timeout() {
        LOGGER.info("This is timeout method from AspForm!");
    }
}
