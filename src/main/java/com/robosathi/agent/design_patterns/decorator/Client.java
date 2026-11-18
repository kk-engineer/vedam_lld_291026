package com.robosathi.agent.design_patterns.decorator;

public class Client {
    public static void main(String[] args) {
        demoDecorator();
    }

    private static void demoDecorator() {
        // Crate a base ice-cream
        IceCream iceCream1 = new OrangeCone();

        //Add toppings
        iceCream1 = new Vanilla(iceCream1);

        System.out.println("Description " + iceCream1.getDescription());

        IceCream iceCream2 = new OrangeCone();
        iceCream2 = new ButterScotch(iceCream2);
        iceCream2 = new ChocoChips(iceCream2);

        System.out.println("Description: " + iceCream2.getDescription());
        System.out.println("IceCream Price: " + iceCream2.getCost());
    }
}
