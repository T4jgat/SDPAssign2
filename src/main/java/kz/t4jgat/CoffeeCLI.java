package kz.t4jgat;

import java.text.DecimalFormat;
import java.util.Scanner;

// Console interface of the program
public class CoffeeCLI {
    static DecimalFormat df = new DecimalFormat("0.00"); // formatting floating point numbers
    static Scanner sc = new Scanner(System.in);

    // Show CLI
    public static void cli() {
        Coffee coffee = null; // Empty coffee object that will gradually fill up

        String action = "-"; // Action variable

        // the method will be executed until the user exits it
        while (!action.equals("e")) {
            System.out.print("""
                    \n[1] Select base
                    [2] Add supplements
                    [3] Show total
                    >>\s""");
            action = sc.next();

            // action options
            switch (action) {
                case "1" -> {
                    coffee = baseSelection();
                    break;
                }
                case "2" -> {
                    //In another case, you can opt for a coffee additive
                    if (coffee != null) {
                        coffee = additiveSelection(coffee);
                    // If no coffee base is selected, an error is displayed
                    } else {
                        System.out.println("\nError: The base was not selected");
                    }
                    break;
                }
                case "3" -> {
                    // shows the total order if the coffee object is not empty
                    if (coffee != null) {
                        System.out.println("\nOrder:" + "\n\t" + coffee.getDescription());
                        System.out.println("Total cost: $" + df.format(coffee.cost()));
                    }else{
                        System.out.println("\nError: The coffee was not selected");
                    }
                    break;
                }
                //  method exit
                case "e"-> {
                    System.out.println("EXIT...");
                }
                default -> {
                    System.out.println("Unexpected value!");
                }
            }
        }
    }

    // Set the base coffee
    private static Coffee baseSelection() {
        System.out.print("""
                \n[1] Latte
                [2] Americano
                >>\s""");
        String selection = sc.next();
        if (selection.equals("1")) {
            return new Latte();
        } else  if (selection.equals("2")){
            return new Americano();
        } else {
            return null;
        }
    }

    // adding options
    private static Coffee additiveSelection(Coffee coffee) {
        String selection;
        System.out.print("""
                \n[1] Milk
                [2] Sugar
                [3] Syrup
                >>\s""");
        selection = sc.next();

        // the decorator adds a wrapper depending on the selection
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
