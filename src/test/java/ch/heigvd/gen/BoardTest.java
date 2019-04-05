package ch.heigvd.gen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    String name = "test";
    Board b;

    @BeforeEach
    void setUp() {
        b = new Board(name);
    }

    @Test
    void getName() {
        assertEquals(name, b.getName());
    }
}