package DesignPatterns.Decorator;

public class Client {
    public static void main(String[] args) {
        Beverage item1 = new Espresso();


        item1 = new Milk(new Milk(new Cream(item1)));
    
        System.out.println("Cost : " + item1.getCost());
        item1.getDescription();


        Beverage item2 = new Hazelnut();
        // item2 = new Espresso(item1); // Not have 2 beverage as base

    }
    
}
