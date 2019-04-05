package ch.heigvd.gen;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    static Board b;

    @BeforeAll
    static void setUp() {
        b = new Board();
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
            10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
            20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
            30, 31, 32, 33, 34, 35, 36, 37, 38, 39})
    void isBoardOrderedProperly(int cellNumber) {
        assertEquals(Integer.toString(cellNumber), b.getSquares().get(cellNumber).getName());
    }

    @Test
    void getSquareLocationCorrect() {
        Square first = b.getSquares().get(0);
        assertEquals(b.getSquares().get(5), b.getSquare(first, 5));

    }

}