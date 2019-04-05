package ch.heigvd.gen;

import java.util.ArrayList;

public class Board {
    private static final int squareCount = 40;
    private final ArrayList<Square> squares;

    public Board() {
        squares = new ArrayList<>(squareCount);

        for (int i = 0; i < squareCount; i++) {
            squares.add(new Square(Integer.toString(i)));
        }

    }

    public ArrayList<Square> getSquares() {
        return squares;
    }
}

