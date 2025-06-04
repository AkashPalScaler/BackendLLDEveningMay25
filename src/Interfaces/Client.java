package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void startRace(List<Runner> runners){
        for(Runner r: runners){
            r.run();
        }
    }

    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>();
        runners.add(new Cat());
        runners.add(new Dog());
        runners.add(new RobotDog());
//        runners.add(new Dolphin());
        startRace(runners);
        // Interface reference can point to it's implement class' object
        Runner r = new Dog();
        // Parent reference can point to their child class object
        Animal a = new Dog();

        Dog d  =new Dog();
        d.speed(); // default method

        System.out.println(Runner.x); // Interface vars are public final static
    }
}
