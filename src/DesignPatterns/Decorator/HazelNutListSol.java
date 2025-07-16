package DesignPatterns.Decorator;

import java.util.List;

public class HazelNutListSol extends Beverage {
    List<Addon> addons;

    public int getCost(){
        int sum = 0;
        for(Addon addon: addons){
            sum += addon.getCost();
        }
        return sum;
    }

    public void getDescription(){
        System.out.println("Hazelnut base beverage");
    }

    public int getComboDiscount(){
        int milkCount = 0;
        for(Addon addon: addons){
            if(addon.name == "Milk"){
                milkCount ++;
                if(milkCount > 2){
                    return addon.getComboDiscount() + 10;
                }
            }else if(addon.name == "Cream"){
                
            }
        }
        return 0;
    }
    
}
