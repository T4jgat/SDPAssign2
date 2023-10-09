package kz.t4jgat;

// Decorator for adding sugar
public class SugarCoffeeDecorator extends CoffeeDecorator {
    private final Double optionCost = 0.29;

    public SugarCoffeeDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\t\s\s+Sugar ($"+ optionCost +")\n"; // sugar is shown in the description
    }

    @Override
    public double cost() {
        return super.cost() + optionCost; // sugar is added to the total cost
    }
}