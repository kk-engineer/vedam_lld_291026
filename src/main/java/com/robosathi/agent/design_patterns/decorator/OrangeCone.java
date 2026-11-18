package com.robosathi.agent.design_patterns.decorator;

public class OrangeCone implements IceCream {

    @Override
    public int getCost() {
        return 50;
    }

    @Override
    public String getDescription() {
        return "Orange Cone ";
    }
}
