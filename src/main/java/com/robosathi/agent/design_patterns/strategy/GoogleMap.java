package com.robosathi.agent.design_patterns.strategy;

import com.robosathi.agent.design_patterns.strategy.strategies.PathCalculator;

public class GoogleMap {
    private PathCalculator pathCalculator;

    public GoogleMap(PathCalculator pathCalculator) {
        this.pathCalculator = pathCalculator;
    }

    public void findPath(String source, String destination) {
        pathCalculator.findPath(source, destination);
    }
}
