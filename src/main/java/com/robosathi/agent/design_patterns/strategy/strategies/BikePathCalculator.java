package com.robosathi.agent.design_patterns.strategy.strategies;

public class BikePathCalculator implements PathCalculator{
    @Override
    public void findPath(String src, String dst) {
        System.out.println("Bike path calculator from source: " + src + " to destination " + dst);
    }
}
