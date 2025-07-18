package DesignPatterns.Strategy.PathCalculatorStrategies;

import DesignPatterns.Strategy.TravelMode;

public interface PathCalculatorStrategy {
    void calculatePath(String source, String dest, TravelMode mode);
}
