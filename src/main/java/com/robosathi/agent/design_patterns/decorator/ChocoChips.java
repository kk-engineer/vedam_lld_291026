package com.robosathi.agent.design_patterns.decorator;

public class ChocoChips extends ToppingDecorator{

    public ChocoChips(IceCream iceCream) {
        this.iceCream = iceCream;

    }
    @Override
    public int getCost() {
        return iceCream.getCost() + 30;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " , Choco Chips";
    }
}
