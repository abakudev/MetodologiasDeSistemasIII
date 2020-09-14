package edu.utn.design.patterns.strategy.models;

import edu.utn.design.patterns.strategy.HowToAttackWithBow;
import edu.utn.design.patterns.strategy.HowToNotDefend;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArcherTest {

    private Archer archer;

    @Test
    void testNoArgsConstructor(){
        archer = new Archer();
        assertNotNull(archer);
    }

    @Test
    void testAllArgsConstructor(){
        archer = new Archer("Robin hood", new HowToAttackWithBow(), new HowToNotDefend(), 17);
        assertNotNull(archer);
    }
}