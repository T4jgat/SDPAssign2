package kz.t4jgat;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CoffeeCLI {
    static DecimalFormat df = new DecimalFormat("0.00");
    static Scanner sc = new Scanner(System.in);
    public static void cli() {
        Coffee coffee = null;
        String action = "-";

        while (!action.equals("e")) {
            System.out.print("""
                    \n[1] Select base
                    [2] Add supplements
                    [3] Show total
                    >>\s""");
            action = sc.next();

            switch (action) {
                case "1" -> {
                    coffee = baseSelection();
                    break;
                }
                case "2" -> {
                    if (coffee == null) {
                        System.out.println("\nError: The base was not selected");
                    } else {
                        coffee = supplementSelection(coffee);
                    }
                    break;
                }
                case "3" -> {
                    assert coffee != null;
                    System.out.println("\nOrder:" + "\n\t" +coffee.getDescription());
                    System.out.println("Total cost: $" + df.format(coffee.cost()));
                    break;
                }
                case "e"-> {
                    System.out.println("EXIT...");
                }
                default -> {
                    System.out.println("Unexpected value!");
                }
            }
        }
    }

    private static Coffee baseSelection() {
        System.out.print("""
                \n[1] Latte
                [2] Americano
                >>\s""");
        if (sc.next().equals("1")) {
            return new Latte();
        } else {
            return new Americano();
        }
    }

    private static Coffee supplementSelection(Coffee coffee) {
        String selection;
        System.out.print("""
                \n[1] Milk
                [2] Sugar
                [3] Syrup
                >>\s""");
        selection = sc.next();
        switch (selection) {
            case "1" -> {
                return new MilkCoffeeDecorator(coffee);
            }
            case "2" -> {
                return new SugarCoffeeDecorator(coffee);
            }
            case "3" -> {
                SyrypCoffeeDecorator syrupCoffee = new SyrypCoffeeDecorator(coffee);
                syrupCoffee.setSyrup();
                return syrupCoffee;
            }
            default -> {
                System.out.println("Unexpected value!");
                return null;
            }
        }
    }
}
