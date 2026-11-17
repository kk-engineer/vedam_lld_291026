package com.robosathi.agent.design_patterns.strategy.strategies;

import java.nio.file.Path;

public class CarPathCalculator implements PathCalculator {
    @Override
    public void findPath(String src, String dst) {
        System.out.println("Car path calculator from source: " + src + " to destination " + dst);

    }
}
