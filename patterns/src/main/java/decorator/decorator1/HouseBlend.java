package decorator.decorator1;

import decorator.decorator1.abstracts.Beverage;

public class HouseBlend extends Beverage {

    private static final double COST = .89;

    public HouseBlend() {
        super("House Blend Coffee");
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public double cost() {
        return 0;
    }
}
