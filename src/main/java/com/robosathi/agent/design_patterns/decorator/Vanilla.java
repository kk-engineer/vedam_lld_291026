package com.robosathi.agent.design_patterns.decorator;

public class Vanilla extends ToppingDecorator{

    public Vanilla(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 100;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + ", Vanilla ";
    }
}
