package DesignPatterns.Observer;

import java.util.concurrent.ForkJoinPool;

import DesignPatterns.Observer.observers.AverageDisplay;
import DesignPatterns.Observer.observers.CurrentDisplay;
import DesignPatterns.Observer.observers.ForeCastDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        AverageDisplay averageDisplay = new AverageDisplay();
        averageDisplay.subscribe(weatherData);

        CurrentDisplay currentDisplay = new CurrentDisplay();
        currentDisplay.subscribe(weatherData);

        weatherData.setWeatherData(10, 5.0f, 219);
        System.out.println();
        weatherData.setWeatherData(19, 5.5f, 109);
        System.out.println();
        ForeCastDisplay foreCastDisplay = new ForeCastDisplay();
        foreCastDisplay.subscribe(weatherData);
        weatherData.setWeatherData(13, 7f, 119);
        System.out.println();

        weatherData.setWeatherData(12, 5f, 129);
        System.out.println();

        currentDisplay.unsubscribe(weatherData);
        weatherData.setWeatherData(20, 2.9f, 140);
        System.out.println();
        weatherData.setWeatherData(21, 3f, 110);
        System.out.println();
        weatherData.setWeatherData(9, 6f, 109);
        System.out.println();
    }
}
