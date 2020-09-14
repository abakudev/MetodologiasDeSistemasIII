package edu.utn.design.patterns.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HowToDefendWithSword implements HowToDefendStrategy{

    private static final Logger LOGGER = LoggerFactory.getLogger(HowToDefendWithSword.class);

    @Override
    public void defend() {
        LOGGER.info("You can defend yourself with your Sword!");
    }
}
