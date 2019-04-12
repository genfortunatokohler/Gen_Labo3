package ch.heigvd.gen;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    static String name = "test";

    static Square s;

    @BeforeAll
    static void setUp() {
        s = new RegularSquare(name);
    }

    @Test
    void getName() {
        assertEquals(name, s.getName());
    }
}