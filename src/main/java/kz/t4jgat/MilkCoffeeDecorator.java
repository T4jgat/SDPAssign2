package kz.t4jgat;

// decorator for adding milk
public class MilkCoffeeDecorator extends CoffeeDecorator{
    private final double optionCost = 0.49;
    public MilkCoffeeDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + optionCost; // milk is added to the total cost
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\t\s\s+Milk ($"+ optionCost +")\n"; // milk is shown in the description
    }
}
