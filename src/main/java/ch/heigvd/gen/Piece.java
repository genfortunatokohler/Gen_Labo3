package ch.heigvd.gen;

public class Piece {
    final private String name;
    private Square location;

    public Piece(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Square getLocation() {
        return location;
    }

    public void setLocation(Square location) {
        this.location = location;
    }
}
