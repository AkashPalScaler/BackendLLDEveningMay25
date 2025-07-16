package DesignPatterns.Decorator;

public class Cream extends Addon {
    Beverage base;
    

    public Cream(Beverage base){
        if(base == null){
            throw new RuntimeException("No base beverage selected");
        }
        this.base = base;
    }
    public int getCost(){
        return base.getCost() + 30; 
    }

    public void getDescription(){
        System.out.print("Cream + ");
        base.getDescription();        
    }

    public int getComboDiscount(){
        return 0;
    }

}
