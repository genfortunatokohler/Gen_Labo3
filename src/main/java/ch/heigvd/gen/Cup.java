package ch.heigvd.gen;

public class Cup {
    private Die[] dice;

    public Cup(Die[] dice) {
        this.dice = dice;
    }

    public void roll() {
        for (Die die : dice)
            die.roll();
    }

    public int getTotal() {
        int total = 0;
        for (Die die : dice)
            total += die.getFaceValue();
        return total;
    }
}
