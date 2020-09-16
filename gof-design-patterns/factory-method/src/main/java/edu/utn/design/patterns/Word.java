package edu.utn.design.patterns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Word implements Document{

    private static final Logger LOGGER = LoggerFactory.getLogger(Word.class);

    @Override
    public void open() {
        LOGGER.info("Word Document is Open!");
    }

    @Override
    public void close() {
        LOGGER.info("Word Document is Closed!");
    }

    @Override
    public void save() {
        LOGGER.info("Word Document was saved successfully!");
    }
}
