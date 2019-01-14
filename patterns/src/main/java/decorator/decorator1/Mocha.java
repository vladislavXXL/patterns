package decorator.decorator1;

import decorator.decorator1.abstracts.Beverage;
import decorator.decorator1.abstracts.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " with Mocha";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + .20;
    }
}
