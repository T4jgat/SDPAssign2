package kz.t4jgat;

public class Americano extends Coffee {
    @Override
    public String getDescription() {
        return "Americano";
    }

    @Override
    public double cost() {
        return 1.49;
    }
}
