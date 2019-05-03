package ch.heigvd.gen;

public class Player {
    final private Board board;
    final private Cup cup;
    final private String name;
    final private Piece piece;

    private int cash;

    public Player(Board board, Cup cup, String name, String piece, int cash) {
        this.board = board;
        this.cup = cup;
        this.name = name;

        this.piece = new Piece(piece);
        this.piece.setLocation(board.getSquares().get(0));

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
        if (cash < 0)
            throw new IllegalArgumentException("negativeCash");
        this.cash += cash;
    }

    public void reduceCash(int cash) {
        if (cash < 0)
            throw new IllegalArgumentException("negativeCash");
        this.cash -= cash;
    }

    public void setLocation(Square s) {
        this.piece.setLocation(s);
    }

    public void takeTurn() {
        cup.roll();
        int cupTot = cup.getTotal();

        System.out.format("%s rolled the die, and got a total of %d.\n", name, cupTot);

        piece.setLocation(board.getSquare(piece.getLocation(), cupTot));
        System.out.format("%s landed on \"%s\"\n", name, piece.getLocation().getName());

        piece.getLocation().landedOn(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Player))
            return false;
        Player p = (Player) obj;
        return piece.equals(p.getPiece()) && name.equals(p.getName()) && cash == p.getNetWorth();
    }
}
