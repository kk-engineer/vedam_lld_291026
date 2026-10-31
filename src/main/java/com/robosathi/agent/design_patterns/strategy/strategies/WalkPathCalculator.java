package com.robosathi.agent.design_patterns.strategy.strategies;

public class WalkPathCalculator implements PathCalculator {
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Walk path calculator from source: " + source + " to destination: " + destination );
    }
}
