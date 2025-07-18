package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Publisher{
    Integer temp;
    Float prec;
    Integer AQI;
    List<Observer> observers = new ArrayList<>();

    void setWeatherData(Integer temp, Float prec, Integer AQI){
        this.temp = temp;
        this.prec = prec;
        this.AQI = AQI;

        notifyObserver();
    }

    public void registerObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    public void notifyObserver(){
        for(Observer observer : observers){
            observer.notify(temp, prec, AQI);
        }
    }

}
