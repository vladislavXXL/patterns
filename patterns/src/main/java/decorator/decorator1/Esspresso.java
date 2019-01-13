package java.decorator.decorator1;

import java.decorator.decorator1.abstracts.Beverage;

public class Esspresso extends Beverage {

    public static final double COST = 1.99;

    public Esspresso() {
        super("Esspresso");
    }

    public double cost() {
        return COST;
    }
}
