package ch.heigvd.gen;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    static String name = "Toto";
    static Piece piece = new Piece("name");
    static Die[] die = {new Die()};
    static Board board;
    static Player player;

    @BeforeAll
    static void setUp() {
        board = new Board();
        player = new Player(board, die, name, piece);
    }

    @Test
    void getName() {
        assertEquals(name, player.getName());
    }

    @Test
    void getPiece() {
        assertEquals(piece, player.getPiece());
    }
    
    @RepeatedTest(100)
    void takeTurn() {
        int oldLoc = board.getSquares().indexOf(player.getPiece().getLocation());

        player.takeTurn();

        int newLoc = board.getSquares().indexOf(player.getPiece().getLocation());

        int shift = Math.floorMod((newLoc - oldLoc), board.getSquares().size());
        assertTrue(shift > 0 && shift <= 12, Integer.toString(shift));
    }
}