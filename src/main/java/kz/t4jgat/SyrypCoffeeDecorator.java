package kz.t4jgat;

import java.util.Scanner;

public class SyrypCoffeeDecorator extends CoffeeDecorator{
    private String syrup = null;
    private final Double optionCost = 0.79;
    public SyrypCoffeeDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        if (syrup != null) {
            return super.getDescription() + "\t\s\s+Syrup \"" + syrup + "\" ($"+ optionCost +")\n";
        } else {
            return super.getDescription();
        }
    }

    @Override
    public double cost() {
        if (syrup != null) {
            return super.cost() + optionCost;
        } else {
            return super.cost();
        }
    }

    public void setSyrup() {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                \n[1] Chocolate
                [2] Caramel
                [3] Coconut
                Select syrup taste:\s""");
        String syrupTaste = sc.next();

        switch (syrupTaste) {
            case "1" -> {
                syrup = "chocolate";
            }
            case "2" -> {
                syrup = "caramel";
            }
            case "3" -> {
                syrup = "coconut";
            }
            default -> {
                System.out.println("unexpected option");
            }
        }
    }
}
