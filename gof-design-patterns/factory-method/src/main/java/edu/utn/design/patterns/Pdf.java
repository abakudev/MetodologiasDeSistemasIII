package edu.utn.design.patterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pdf implements Document {

    private static final Logger LOGGER = LoggerFactory.getLogger(Pdf.class);

    @Override
    public void open() {
        LOGGER.info("Pdf Document is Open!");
    }

    @Override
    public void close() {
        LOGGER.info("Pdf Document is Closed!");
    }

    @Override
    public void save() {
        LOGGER.info("Pdf Document was saved successfully!");
    }
}
