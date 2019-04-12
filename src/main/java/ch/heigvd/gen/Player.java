package ch.heigvd.gen;

public class Player {
    final private Board board;
    final private Die[] die;
    final private String name;
    final private Piece piece;

    private int cash;

    public Player(Board board, Die[] die, String name, Piece piece, int cash) {
        this.board = board;
        this.die = die;
        this.name = name;

        this.piece = piece;
        piece.setLocation(board.getSquares().get(0));

        this.cash = cash;
    }

    public String getName() {
        return name;
    }

    public Piece getPiece() {
        return piece;
    }

    public int getNetWorth() {
        return cash;
    }

    public void addCash(int cash) {
        this.cash += cash;
    }

    public void reduceCash(int cash) {
        this.cash -= cash;
    }

    public void setLocation(Square s) {
        this.piece.setLocation(s);
    }

    public void takeTurn() {
        int fvTot = 0;

        for (Die dice : die) {
            dice.roll();
            fvTot += dice.getFaceValue();
        }

        System.out.format("%s rolled the die, and got a total of %d.\n", name, fvTot);

        piece.setLocation(board.getSquare(piece.getLocation(), fvTot));
        System.out.format("%s landed on \"%s\"\n", name, piece.getLocation().getName());
    }
}
