package decorator.decorator1;

import decorator.decorator1.abstracts.Beverage;
import decorator.decorator1.abstracts.CondimentDecorator;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " with Soy";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.15;
    }
}
