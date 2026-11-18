package com.robosathi.agent.design_patterns.observer;

public class LogisticService implements Subscriber{
    @Override
    public void update() {
        System.out.println("Package shipped.");
    }
}
