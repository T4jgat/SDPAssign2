package kz.t4jgat;

public class MilkCoffeeDecorator extends CoffeeDecorator{
    private final double optionCost = 0.49;
    public MilkCoffeeDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + optionCost;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\t\s\s+Milk ($"+ optionCost +")\n";
    }
}
