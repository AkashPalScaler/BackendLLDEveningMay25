package DesignPatterns.Observer;

public interface Publisher {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
