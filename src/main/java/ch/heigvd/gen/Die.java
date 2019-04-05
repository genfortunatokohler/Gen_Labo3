package ch.heigvd.gen;

import java.util.Random;

public class Die {
    private Random random;
    private int faceValue;

    public Die() {
        random = new Random();
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void roll() {
        faceValue = random.nextInt(6) + 1;
    }
}
