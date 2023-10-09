package kz.t4jgat;

public class SugarCoffeeDecorator extends CoffeeDecorator {
    private final Double optionCost = 0.29;

    public SugarCoffeeDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\t+Sugar ($"+ optionCost +")\n";
    }

    @Override
    public double cost() {
        return super.cost() + optionCost;
    }
}