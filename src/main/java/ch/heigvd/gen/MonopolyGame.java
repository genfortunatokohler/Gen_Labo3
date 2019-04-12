package ch.heigvd.gen;

import java.util.ArrayList;

public class MonopolyGame {
    final private int N = 20;
    final private Board board;
    final private Cup cup;
    final private String[] pieces;
    final private ArrayList<Player> players;

    private int roundCnt;

    public MonopolyGame(String[] players) {
        this.board = new Board();
        this.cup = new Cup(new Die[]{new Die(), new Die()});
        this.players = new ArrayList<>();
        pieces = new String[]{"Iron", "Horseshoe"};

        int cnt = 0;
        for(String name : players) {
            this.players.add(new Player(board, cup, name, pieces[cnt],2500));
            ++cnt;
        }
    }

    public ArrayList<Player> getPlayers() {
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
        String[] players = new String[]{"Pierre", "Filipe"};
        MonopolyGame monopolyGame = new MonopolyGame(players);

        monopolyGame.playGame();
    }
}
