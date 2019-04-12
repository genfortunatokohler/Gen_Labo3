package ch.heigvd.gen;

import java.util.ArrayList;
public class Board {
    private static final int squareCount = 40;
    private final ArrayList<Square> squares;

    public Board() {
        ArrayList<Square> labels = new ArrayList<>();

        labels.add(new GoSquare());
        for (int i = 1; i < 40; ++i)
            labels.add(new RegularSquare(String.format("Square %d", i)));

        RegularSquare jail = new RegularSquare("Jail");

        labels.set(4, new IncomeTaxSquare());
        labels.set(10, jail);
        labels.set(30, new GoToJailSquare(jail));

        squares = labels;
    }

    public Board(ArrayList<Square> squares) {
        if (squares != null && squares.size() != squareCount)
            throw new IllegalArgumentException();

        this.squares = squares;

    }

    public ArrayList<Square> getSquares() {
        return squares;
    }

    public Square getSquare(Square oldLoc, int fvTot) {
        if (fvTot < 0)
            throw new IllegalArgumentException();

        return squares.get((squares.indexOf(oldLoc) + fvTot) % squareCount);
    }
}

