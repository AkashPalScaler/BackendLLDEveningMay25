package DesignPatterns.Observer.observers;

import DesignPatterns.Observer.Observer;
import DesignPatterns.Observer.Publisher;

public class CurrentDisplay implements Observer {
    Integer curTemp = 0;
    Float curPrec = 0.0f;
    Integer curAQI = 0;

    public void subscribe(Publisher publisher){
        publisher.registerObserver(this);
    }
    public void unsubscribe(Publisher publisher){
        publisher.removeObserver(this);
    }
    
    public void notify(Integer temp, Float prec, Integer AQI){
        curAQI = AQI;
        curPrec = prec;
         curTemp = temp;

        display();
    }

    public void display(){
        System.out.println("****** CURRENT DISPLAY *******");
        System.out.println("Current Temperature : " + curTemp);
        System.out.println("Current Precipitation : " + curPrec);
        System.out.println("Current Air Quality Index : " + curAQI);
    }
}
