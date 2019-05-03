package ch.heigvd.gen;

public class GoSquare extends Square {

    public GoSquare() {
        super("Go");
    }

    @Override
    public void landedOn(Player p) {
        p.addCash(200);
    }
}
