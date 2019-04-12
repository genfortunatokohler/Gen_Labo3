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

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Piece))
            return false;
        Piece p = (Piece) obj;
        return name.equals(p.name) && location.equals(p.location);
    }
}
