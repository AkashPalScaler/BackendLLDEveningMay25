package DesignPatterns.Observer.observers;

import DesignPatterns.Observer.Observer;
import DesignPatterns.Observer.Publisher;

public class AverageDisplay implements Observer {
    Float avgTemp = 0.0f;
    Float avgPrec = 0.0f;
    Float avgAQI = 0.0f;

    public void subscribe(Publisher publisher){
        publisher.registerObserver(this);
    }
    public void unsubscribe(Publisher publisher){
        publisher.removeObserver(this);
    }
    
    public void notify(Integer temp, Float prec, Integer AQI){
        avgTemp += temp;
        avgTemp /= 2;

        avgPrec += prec;
        avgPrec /= 2;

        avgAQI += AQI;
        avgAQI /= 2;

        display();
    }

    public void display(){
        System.out.println("****** AVERAGE DISPLAY *******");
        System.out.println("Average Temperature : " + avgTemp);
        System.out.println("Average Precipitation : " + avgPrec);
        System.out.println("Average Air Quality Index : " + avgAQI);
    }
}
