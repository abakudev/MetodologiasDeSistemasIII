package edu.utn.design.patterns.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HowToDefendWithShield implements HowToDefendStrategy{

    private static final Logger LOGGER = LoggerFactory.getLogger(HowToDefendWithShield.class);

    @Override
    public void defend() {
       LOGGER.info("You can defend yourself with your Shield!");
    }
}
