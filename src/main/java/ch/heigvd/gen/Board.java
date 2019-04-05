package ch.heigvd.gen;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Board {
    private static final int squareCount = 40;
    private final ArrayList<Square> squares;

    public Board() {
        this(IntStream.range(0, 40).mapToObj(Integer::toString).collect(Collectors.toList()));
    }

    public Board(List<String> labels) {
        if (labels != null && labels.size() != squareCount)
            throw new IllegalArgumentException();

        squares = new ArrayList<>(squareCount);

        for (int i = 0; i < squareCount; i++) {
            squares.add(new Square(labels.get(i)));
        }

    }

    public ArrayList<Square> getSquares() {
        return squares;
    }
}

