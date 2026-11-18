package com.robosathi.agent.design_patterns.decorator;

public class ButterScotch extends ToppingDecorator{

    public ButterScotch(IceCream iceCream) {
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return iceCream.getCost() + 120;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() +  ", ButterScotch";
    }
}
