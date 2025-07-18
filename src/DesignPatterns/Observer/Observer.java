package DesignPatterns.Observer;

public interface Observer {
    void notify(Integer temp, Float prec, Integer AQI);
    void subscribe(Publisher publisher);
    void unsubscribe(Publisher publisher);
}
