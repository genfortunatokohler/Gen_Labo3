package ch.heigvd.gen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PieceTest {
    String pName = "pName";
    String lName = "lName";
    Square l;
    Piece p;

    @BeforeEach
    void setUp() {
        l = new Square(lName);
        p = new Piece(pName);
    }

    @Test
    void getName() {
        assertEquals(pName, p.getName());
    }

    @Test
    void location() {
        assertEquals(null, p.getLocation());

        p.setLocation(l);
        assertEquals(l, p.getLocation());
    }
}