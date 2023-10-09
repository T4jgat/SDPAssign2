package kz.t4jgat;

public class CoffeeDecorator implements Coffee {
    // base coffee object that will be dynamically wrapped in decorators
    protected Coffee coffee;

    // constructor
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    // initial cost method for wrapping
    @Override
    public double cost() {
        return coffee.cost();
    }

    // initial description method for wrapping
    @Override
    public String getDescription() {
        return coffee.getDescription();
    }
}
