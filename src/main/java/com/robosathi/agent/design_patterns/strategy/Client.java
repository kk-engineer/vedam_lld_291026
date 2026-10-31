package com.robosathi.agent.design_patterns.strategy;


import com.robosathi.agent.design_patterns.strategy.factory.PathCalculatorFactory;
import com.robosathi.agent.design_patterns.strategy.strategies.PathCalculator;

public class Client {
    public static void main(String[] args) {
        demoStrategy();
    }

    private static void demoStrategy() {
        PathCalculator pathCalculator = PathCalculatorFactory.getPathCalculator(ModeType.BIKE);
        GoogleMap googleMap = new GoogleMap(pathCalculator);
        googleMap.findPath("Kashmir", "Kanyakumari");
    }
}
