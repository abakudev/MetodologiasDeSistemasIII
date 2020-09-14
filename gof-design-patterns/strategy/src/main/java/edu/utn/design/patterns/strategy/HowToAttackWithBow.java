package edu.utn.design.patterns.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HowToAttackWithBow implements HowToAttackStrategy{

    private static final Logger LOGGER = LoggerFactory.getLogger(HowToAttackWithBow.class);

    @Override
    public void attack() {
        LOGGER.info("You can attack with your Bow!");
    }
}
