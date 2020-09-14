package edu.utn.design.patterns.strategy;

import edu.utn.design.patterns.strategy.models.DirectionOfMovement;
import edu.utn.design.patterns.strategy.models.Gladiator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        /* Test: Crear un Gladiador que posea una espada para atacar y defender, avance 3 casillas al Sur
        y allí encuentra un Hacha solo para Atacar que reemplazará a la Espada. */

        HowToAttackStrategy attackStrategy = new HowToAttackWithSword();
        HowToDefendStrategy defendStrategy = new HowToDefendWithSword();

        Gladiator gladiator = new Gladiator("Máximo Décimo Meridio", attackStrategy, defendStrategy, "Iron Armor");

        LOGGER.info("Created Gladiator");

        gladiator.attack();
        gladiator.defend();
        gladiator.move(DirectionOfMovement.SOUTH, 3);

        LOGGER.info("Gladiator replaced the weapon");

        gladiator.attack();
        gladiator.defend();

    }
}
