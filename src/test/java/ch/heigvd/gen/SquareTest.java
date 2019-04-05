package ch.heigvd.gen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    String name = "test";

    Square s;

    @BeforeEach
    void setUp() {
        s = new Square(name);
    }

    @Test
    void getName() {
        assertEquals(name, s.getName());
    }
}