package DesignPatterns.Decorator;

public class Hazelnut extends Beverage {
    public int getCost(){
        return 100;
    }

    public void getDescription(){
        System.out.println("Hazelnut base beverage");
    }

    public int getComboDiscount(){
        return 0;
    }

}
