package kz.t4jgat;

// A class describing an americano object without wrappers
public class Americano implements Coffee {
    String description = "Americano ($" + cost() +")\n";
    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return 1.49;
    }
}
