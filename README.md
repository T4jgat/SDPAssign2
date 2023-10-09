# Decorator Design pattern
The Decorator design pattern is a structural pattern in software design that allows you to dynamically add new behaviors or responsibilities to objects without altering their existing code. It involves creating a set of decorator classes that wrap concrete components and add additional functionality to them. This pattern promotes flexibility, code reusability, and separation of concerns while adhering to the Open-Closed Principle, making it useful for building extensible and maintainable systems.


## Use case
I used the pattern to wrap the basic version of coffee with different additives

**Coffee Interface**
```java
public interface Coffee {
    public abstract String getDescription(); // Description of the coffee
    public abstract double cost();  // cost of the coffee
}
```
**Base decorator**:
```java
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
```
**One of the specific decorations extending the base decorator**
```java
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
```
# Additional insights
- I learned about a new method of extending the functionality of objects
- Learned some useful techniques and tricks of the language and IDEs