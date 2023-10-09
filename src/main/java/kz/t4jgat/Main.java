package kz.t4jgat;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Coffee latte = new SugarCoffeeDecorator(new MilkCoffeeDecorator(new Latte()));

        System.out.println(latte.getDescription() + df.format(latte.cost()));
    }
}