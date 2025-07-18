package DesignPatterns.Strategy;

import DesignPatterns.Strategy.PathCalculatorStrategies.BikePathCalculatorStrategy;
import DesignPatterns.Strategy.PathCalculatorStrategies.CarPathCalculatorStrategy;
import DesignPatterns.Strategy.PathCalculatorStrategies.PathCalculatorStrategy;
import DesignPatterns.Strategy.PathCalculatorStrategies.PathCalculatorStrategyFactory;
import DesignPatterns.Strategy.PathCalculatorStrategies.WalkPathCalculatorStrategy;

public class GoogleMaps {
    PathCalculatorStrategy pc;

    // public GoogleMaps(PathCalculatorStrategy strategy){
    //     this.pc = strategy;
    // }
    void findPath(String source, String dest, TravelMode mode ){
        //Other logics
        pc = PathCalculatorStrategyFactory.getStrategy(mode);
        pc.calculatePath(source, dest, mode);       
    }
}
