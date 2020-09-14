package edu.utn.design.patterns.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HowToNotDefend implements HowToDefendStrategy {

    private static final Logger LOGGER = LoggerFactory.getLogger(HowToNotDefend.class);

    @Override
    public void defend() {
        LOGGER.info("You can't defend yourself!");
    }
}
