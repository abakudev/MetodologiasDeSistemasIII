package edu.utn.design.patterns.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HowToNotAttack implements HowToAttackStrategy {

    private static final Logger LOGGER = LoggerFactory.getLogger(HowToNotAttack.class);

    @Override
    public void attack() {
        LOGGER.info("You can't attack!");
    }
}
