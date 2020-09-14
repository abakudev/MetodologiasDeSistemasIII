package edu.utn.design.patterns.strategy.models;

import edu.utn.design.patterns.strategy.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CharacterTest {

    @Mock
    private HowToAttackStrategy attackStrategy;

    @Mock
    private HowToDefendStrategy defendStrategy;

    @InjectMocks
    private Character character;

    @Test
    @DisplayName(value = "Test Attack Ok")
    void testAttackOk(){
        doNothing().when(attackStrategy).attack();
        character.attack();
        verify(attackStrategy).attack();
        verifyNoMoreInteractions(attackStrategy);
    }

    @Test
    @DisplayName(value = "Test Defend Ok")
    void testDefendOk(){
        doNothing().when(defendStrategy).defend();
        character.defend();
        verify(defendStrategy).defend();
        verifyNoMoreInteractions(defendStrategy);
    }

    @Test
    @DisplayName(value = "Test Move Ok")
    void testMoveOk(){
        character.move(DirectionOfMovement.SOUTH, 3);
        assertNotNull(DirectionOfMovement.SOUTH);
    }

    @Test
    @DisplayName(value = "Test Move Ok 2nd condition")
    void testMoveOk2(){
        character.move(DirectionOfMovement.NORTH, 7);
        assertNotNull(DirectionOfMovement.SOUTH);
    }
}