package DesignPatterns.Strategy;

public class Client {
    public static void main(String[] args) {
        GoogleMaps gm = new GoogleMaps();
        gm.findPath("Mumbai", "Pune", TravelMode.CAR);
    }
}
