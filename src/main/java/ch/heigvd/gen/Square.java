package ch.heigvd.gen;

abstract class Square {
    final String name;

    public Square(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void landedOn(Player p);

    @Override
    public boolean equals(Object obj) {
        return getClass().getCanonicalName().equals(obj.getClass().getCanonicalName()) && name.equals(((Square) obj).name);
    }
}

