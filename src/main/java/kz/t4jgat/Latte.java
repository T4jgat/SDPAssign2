package kz.t4jgat;

// A class describing a latte object without wrappers
public class Latte implements Coffee {
    String description = "Latte ($" + cost() + ")\n";

    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return 2.49;
    }
}
