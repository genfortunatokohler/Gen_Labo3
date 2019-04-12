package ch.heigvd.gen;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    static int ptr;
    static Board b;

    @BeforeAll
    static void setUp() {
        ptr = 0;
        b = new Board();
    }

    @ParameterizedTest
    @ValueSource(strings = {"Go", "Square 1", "Square 2", "Square 3", "Square 4", "Square 5", "Square 6", "Square 7", "Square 8", "Square 9",
            "Square 10", "Square 11", "Square 12", "Square 13", "Square 14", "Square 15", "Square 16", "Square 17", "Square 18", "Square 19",
            "Square 20", "Square 21", "Square 22", "Square 23", "Square 24", "Square 25", "Square 26", "Square 27", "Square 28", "Square 29",
            "Square 30", "Square 31", "Square 32", "Square 33", "Square 34", "Square 35", "Square 36", "Square 37", "Square 38", "Square 39"})
    void isBoardOrderedProperly(String cellName) {
        assertEquals(cellName, b.getSquares().get(ptr++).getName());
    }

    @Test
    void getSquareLocationCorrect() {
        Square first = b.getSquares().get(0);
        assertEquals(b.getSquares().get(5), b.getSquare(first, 5));

    }

}
