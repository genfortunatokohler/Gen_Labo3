package ch.heigvd.gen;

public class Player {
    final private Board board;
    final private Die[] die;
    final private String name;
    final private Piece piece;

    public Player(Board board, Die[] die, String name, Piece piece) {
        this.board = board;
        this.die = die;
        this.name = name;

        this.piece = piece;
        piece.setLocation(board.getSquares().get(0));
    }

    public String getName() {
        return name;
    }

    public Piece getPiece() {
        return piece;
    }

    public void takeTurn() {
        int fvTot = 0;

        for(Die dice : die) {
            dice.roll();
            fvTot += dice.getFaceValue();
        }

        piece.setLocation(board.getSquare(piece.getLocation(), fvTot));
    }
}
