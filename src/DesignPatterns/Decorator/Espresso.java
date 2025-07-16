package DesignPatterns.Decorator;

public class Espresso extends Beverage {
    // No param constructor - so can't have any other addons/beverage as dependency
    public int getCost(){
        return 60;
    }

    public void getDescription(){
        System.out.println("Espresso base beverage");
    }

    public int getComboDiscount(){
        return 0;
    }
}
