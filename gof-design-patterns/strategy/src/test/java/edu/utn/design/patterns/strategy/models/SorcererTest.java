package edu.utn.design.patterns.strategy.models;

import edu.utn.design.patterns.strategy.HowToAttackWithBow;
import edu.utn.design.patterns.strategy.HowToNotDefend;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SorcererTest {
    private Sorcerer sorcerer;

    @Test
    void testNoArgsConstructor(){
        sorcerer = new Sorcerer();
        assertNotNull(sorcerer);
    }

    @Test
    void testAllArgsConstructor(){
        sorcerer = new Sorcerer("Merlin", new HowToAttackWithBow(), new HowToNotDefend(), 550);
        assertNotNull(sorcerer);
    }
}