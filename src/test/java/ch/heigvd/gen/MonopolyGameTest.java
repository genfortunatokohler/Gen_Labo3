package ch.heigvd.gen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

class MonopolyGameTest {
    static Board board;
    static Die[] die;
    static Piece[] pieces;
    static Player[] players;
    static MonopolyGame monopolyGame;

    @BeforeEach
    void reset() {
        board = new Board();
        die = new Die[]{new Die(), new Die()};
        pieces = new Piece[]{new Piece("Iron"), new Piece("Horseshoe")};
        players = new Player[]{new Player(board, die, "Pierre", pieces[0], 2500), new Player(board, die, "Filipe", pieces[1], 2500)};
        monopolyGame = new MonopolyGame(board, die, players);
    }

    @Test
    void startPlayersAreDifferent() {
        assertNotEquals(monopolyGame.getPlayers()[0], monopolyGame.getPlayers()[1]);
    }

    @Test
    void playGame() {
        assertTimeoutPreemptively(Duration.ofSeconds(2), () -> {
            monopolyGame.playGame();
        });
    }
}