package DesignPatterns.Strategy.PathCalculatorStrategies;

import DesignPatterns.Strategy.TravelMode;

public class CarPathCalculatorStrategy implements PathCalculatorStrategy {
    public void calculatePath(String source, String dest, TravelMode mode){
        System.out.println("Going from "+ source + " to " + dest + " by " + mode);
    }
}
