package ch.heigvd.gen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    String name = "Toto";
    Piece piece = new Piece("name");
    Player player;

    @BeforeEach
    void setUp() {
        player = new Player(name, piece);
    }

    @Test
    void getName() {
        assertEquals(name, player.getName());
    }

    @Test
    void getPiece() {
        assertEquals(piece, player.getPiece());
    }
}