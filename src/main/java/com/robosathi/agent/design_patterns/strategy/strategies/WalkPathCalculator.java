package com.robosathi.agent.design_patterns.strategy.strategies;

import java.nio.file.Path;

public class WalkPathCalculator implements PathCalculator {
    @Override
    public void findPath(String src, String dst) {
        System.out.println("Walk path calculator from source: " + src + " to destination " + dst);
    }
}
