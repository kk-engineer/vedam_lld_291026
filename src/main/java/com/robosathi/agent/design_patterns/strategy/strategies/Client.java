package com.robosathi.agent.design_patterns.strategy.strategies;

import com.robosathi.agent.design_patterns.strategy.strategies.factory.PathCalculatorFactory;

public class Client {
    public static void main(String[] args){
        demoStrategy();
    }

    private static void demoStrategy() {
        PathCalculator pathCalculator = PathCalculatorFactory.getPathCalculator(
                ModeType.WALK
        );
        GoogleMap googleMap = new GoogleMap(pathCalculator);
        googleMap.findPath("Kashmir", "Kanyakumari");
    }
}
