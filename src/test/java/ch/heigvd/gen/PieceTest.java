package ch.heigvd.gen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PieceTest {
    String name = "name";
    Piece p;

    @BeforeEach
    void setUp() {
        p = new Piece(name);
    }

    @Test
    void getName() {
        assertEquals(p.getName(), name);
    }
}