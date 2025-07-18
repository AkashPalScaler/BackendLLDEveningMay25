package DesignPatterns.Observer.observers;

import DesignPatterns.Observer.Observer;
import DesignPatterns.Observer.Publisher;

public class ForeCastDisplay implements Observer{

    public void subscribe(Publisher publisher){
        publisher.registerObserver(this);
    }
    public void unsubscribe(Publisher publisher){
        publisher.removeObserver(this);
    }
    public void notify(Integer temp, Float prec, Integer AQI){
        // Some logic to ingest the data to a ML pipeline
        // Fetch forecast data ML service 
        display();
    }

    public void display(){
        System.out.println("****** FORECAST DISPLAY *******");
        System.out.println("Forecast data is being shown");
    }
}
