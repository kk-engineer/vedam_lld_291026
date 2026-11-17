package com.robosathi.agent.design_patterns.strategy.strategies.factory;

import com.robosathi.agent.design_patterns.strategy.strategies.*;

public class PathCalculatorFactory {
    public static PathCalculator getPathCalculator(ModeType mode) {
        return switch (mode) {
            case CAR -> new CarPathCalculator();
            case BIKE -> new BikePathCalculator();
            case WALK -> new WalkPathCalculator();
        };
    }
}
