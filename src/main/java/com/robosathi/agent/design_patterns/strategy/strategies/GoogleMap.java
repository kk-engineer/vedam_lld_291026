package com.robosathi.agent.design_patterns.strategy.strategies;

public class GoogleMap {
    private PathCalculator pathCalculator;

    public GoogleMap(PathCalculator pathCalculator) {
        System.out.println("Google Map Constructor");
        this.pathCalculator = pathCalculator;
    }

    public void findPath(String src, String dst){
        pathCalculator.findPath(src, dst);
    }
}
