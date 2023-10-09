package kz.t4jgat;

public class Americano extends Coffee {
    String description = "Americano\n";
    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return 1.49;
    }
}
