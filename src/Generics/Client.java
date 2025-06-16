package Generics;

import java.util.ArrayList;
import java.util.List;

public class Client {

    static void startEating(List<? extends Animal> animals){
        for(Animal a: animals){
            a.eat();
        }
    }
    public static void main(String[] args) {
        Pair<Double, Double> p1 = new Pair<>();
        p1.first = 5.0;
        p1.second = 6.0;

        Pair<String, Integer> p2 = new Pair<>();
        List<Integer> a = new ArrayList<>(); 
        // List alist = new ArrayList<>();
        // HashMap map = new HashMap<>();

        Pair<String, Integer> p3 = new Pair<>("Sam", 10);

        p2.first="Akash";
        p2.second = 7;

        Pair p = new Pair<>(); // Pair<Object, Object>
        Pair<Object, Object> p4 = new Pair<>();

        p.first = "Akash";
        p.second = 13;

        Pair.<String, String>doSomething("Akash", "sdj");
        Pair.<String, Object>doSomething("Akash", "sdj");
        Pair.doSomething2(); // Pair.<Object>doSomething2()

        System.out.println("DEBUG");

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());

        startEating(dogs);
        startEating(cats);
    
    }
}

// Wildcards - gives you upper bound
// Super - gives a lower bound

