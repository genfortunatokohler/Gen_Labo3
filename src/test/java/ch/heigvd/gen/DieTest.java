package ch.heigvd.gen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DieTest {
    Die d;

    @BeforeEach
    void setUp() {
        d = new Die();
    }

    @Test
    void getFaceValueWithoutRoll() {
        assertEquals(0, d.getFaceValue());
    }

    @RepeatedTest(100)
    void getFaceValueWithRoll() {
        d.roll();
        assertTrue(d.getFaceValue() > 0 && d.getFaceValue() <= 6);
    }

}