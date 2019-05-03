package ch.heigvd.gen;

public class GoToJailSquare extends Square {
    private Square jail;

    public GoToJailSquare(Square jail) {
        super("Go To Jail");

        this.jail = jail;
    }

    @Override
    public void landedOn(Player p) {
        p.setLocation(jail);
    }
}
