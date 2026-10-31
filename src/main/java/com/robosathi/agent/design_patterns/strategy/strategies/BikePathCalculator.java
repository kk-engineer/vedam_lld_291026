package com.robosathi.agent.design_patterns.strategy.strategies;

public class BikePathCalculator implements PathCalculator {
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Bike path calculator from source: " + source + " to destination: " + destination );
    }
}