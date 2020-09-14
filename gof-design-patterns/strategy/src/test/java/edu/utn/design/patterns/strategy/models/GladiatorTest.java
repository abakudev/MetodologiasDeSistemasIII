package edu.utn.design.patterns.strategy.models;

import edu.utn.design.patterns.strategy.HowToAttackWithBow;
import edu.utn.design.patterns.strategy.HowToNotDefend;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GladiatorTest {

    private Gladiator gladiator;

    @Test
    void testNoArgsConstructor(){
        gladiator = new Gladiator();
        assertNotNull(gladiator);
    }

    @Test
    void testAllArgsConstructor(){
        gladiator = new Gladiator("Spartacus", new HowToAttackWithBow(), new HowToNotDefend(), "Iron Armor");
        assertNotNull(gladiator);
    }
}