package com.robosathi.agent.design_patterns.observer;

public class InventoryService implements Subscriber{
    @Override
    public void update() {
        System.out.println("Inventory has been updated.");
    }
}
