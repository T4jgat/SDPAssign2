package kz.t4jgat;

public class Latte extends Coffee {
    String description = "Latte\n";

    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return 2.49;
    }
}
