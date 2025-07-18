package DesignPatterns.Strategy.PathCalculatorStrategies;

import DesignPatterns.Strategy.TravelMode;

public class PathCalculatorStrategyFactory {
    public static PathCalculatorStrategy getStrategy(TravelMode mode){
        if(mode == TravelMode.CAR){
            return new CarPathCalculatorStrategy();
        }else if(mode == TravelMode.BIKE){
            return new BikePathCalculatorStrategy();
        }else if(mode == TravelMode.WALK){
            return new WalkPathCalculatorStrategy();
        }else{
            throw new RuntimeException("Travel Mode not supported");
        }
    }
}
