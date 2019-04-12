package ch.heigvd.gen;

public class MonopolyGame {
    final private int N = 50;
    final private Board board;
    final private Die[] die;
    final private Player[] players;

    private int roundCnt;

    public MonopolyGame(Board board, Die[] die, Player[] players) {
        this.board = board;
        this.die = die;
        this.players = players;
    }

    public Board getBoard() {
        return board;
    }

    public Die[] getDie() {
        return die;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void playGame() {
        while (roundCnt < N) {
            playRound();
        }
    }

    private void playRound() {
        System.out.format("Turn %02d\n", roundCnt + 1);
        for (Player player : players)
            player.takeTurn();

        ++roundCnt;
    }

    public static void main(String[] args) {
        Board board = new Board();
        Die[] die = {new Die(), new Die()};
        Piece[] pieces = {new Piece("Iron"), new Piece("Horseshoe")};
        Player[] players = {new Player(board, die, "Pierre", pieces[0]), new Player(board, die, "Filipe", pieces[1])};
        MonopolyGame monopolyGame = new MonopolyGame(board, die, players);

        monopolyGame.playGame();
    }
}
