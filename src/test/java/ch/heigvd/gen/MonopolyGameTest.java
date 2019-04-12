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
    static String[] players;
    static MonopolyGame monopolyGame;

    @BeforeEach
    void reset() {
        players = new String[]{"Pierre", "Filipe"};
        monopolyGame = new MonopolyGame(players);
    }

    @Test
    void startPlayersAreDifferent() {
        assertNotEquals(monopolyGame.getPlayers().get(0), monopolyGame.getPlayers().get(1));
    }

    @Test
    void playGame() {
        assertTimeoutPreemptively(Duration.ofSeconds(2), () -> {
            monopolyGame.playGame();
        });
    }
}