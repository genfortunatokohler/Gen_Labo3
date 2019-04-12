package ch.heigvd.gen;

public class IncomeTaxSquare extends Square {

    public IncomeTaxSquare() {
        super("Income Tax");
    }

    @Override
    public void landedOn(Player p) {
        int w = p.getNetWorth();
        p.reduceCash(Math.min(200, (int)(w * 0.1)));
    }
}
