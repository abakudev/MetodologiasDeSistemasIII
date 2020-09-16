package edu.utn.design.patterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Excel implements Document {

    private static final Logger LOGGER = LoggerFactory.getLogger(Excel.class);

    @Override
    public void open() {
        LOGGER.info("Excel Document is Open!");
    }

    @Override
    public void close() {
        LOGGER.info("Excel Document is Closed!");
    }

    @Override
    public void save() {
        LOGGER.info("Excel Document was saved successfully!");
    }
}
