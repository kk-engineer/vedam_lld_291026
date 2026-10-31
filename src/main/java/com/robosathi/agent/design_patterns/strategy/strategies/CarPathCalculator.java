package com.robosathi.agent.design_patterns.strategy.strategies;

public class CarPathCalculator implements PathCalculator{
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Car path calculator from source: " + source + " to destination: " + destination );
    }
}
