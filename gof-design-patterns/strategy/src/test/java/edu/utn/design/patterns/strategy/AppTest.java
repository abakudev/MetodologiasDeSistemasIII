package edu.utn.design.patterns.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
class AppTest{

    @Test
    void shouldExecuteWithoutException() {
        assertDoesNotThrow(() -> App.main(new String[]{}));
    }

    @Test
    void testApp(){
        App app = new App();
        assertNotNull(app);
    }
}
