package decorator.decorator1;

import decorator.decorator1.abstracts.Beverage;
import decorator.decorator1.abstracts.CondimentDecorator;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " with Whip";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + .10;
    }
}
