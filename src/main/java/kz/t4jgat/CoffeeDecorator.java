package kz.t4jgat;

public class CoffeeDecorator extends Coffee {
    protected Coffee coffee;
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return coffee.cost();
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }
}
