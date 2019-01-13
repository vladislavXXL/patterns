package java.decorator.decorator1.abstracts;

public abstract class Beverage {
    public String description;

    public Beverage() {

    }

    public Beverage(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();
}
