package decorator.decorator1;

import decorator.decorator1.abstracts.Beverage;
import org.junit.BeforeClass;
import org.junit.Test;

public class CoffeeTest {

    private static Beverage coffee;

    @BeforeClass
    public static void precondition() {
        coffee = new Esspresso();
        coffee = new Whip(coffee);
        coffee = new Soy(coffee);
    }

    @Test
    public void printInfo() {
        System.out.println(coffee.getDescription() + ", cost: " + coffee.cost());
    }


}