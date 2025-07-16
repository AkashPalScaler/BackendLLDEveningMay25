package DesignPatterns.Decorator;

public class Milk extends Addon{
    Beverage base;
    //AddOns should always have a base beverage
    public Milk(Beverage base){
        if(base == null){
            throw new RuntimeException("No base beverage selected");
        }
        this.base = base;
    }

    public int getCost(){
        return base.getCost() + 20 - this.getComboDiscount();
    }

    public void getDescription(){
        System.out.print("Milk + ");
        base.getDescription();  
    }

    public int getComboDiscount(){
        return 10;
    }
}
