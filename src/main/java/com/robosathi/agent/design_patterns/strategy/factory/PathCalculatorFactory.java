package com.robosathi.agent.design_patterns.strategy.factory;
import com.robosathi.agent.design_patterns.strategy.ModeType;
import com.robosathi.agent.design_patterns.strategy.strategies.BikePathCalculator;
import com.robosathi.agent.design_patterns.strategy.strategies.CarPathCalculator;
import com.robosathi.agent.design_patterns.strategy.strategies.PathCalculator;
import com.robosathi.agent.design_patterns.strategy.strategies.WalkPathCalculator;

public class PathCalculatorFactory {

    public static PathCalculator getPathCalculator(ModeType mode) {
        return switch (mode) {
            case CAR  -> new CarPathCalculator();
            case BIKE -> new BikePathCalculator();
            case WALK -> new WalkPathCalculator();
        };
    }
}
