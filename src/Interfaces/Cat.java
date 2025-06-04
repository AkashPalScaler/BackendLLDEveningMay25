package Interfaces;

// Interfaces.Cat inherits unrelated defaults for speed() from types Interfaces.Runner and Interfaces.Runner
public class Cat extends Animal implements Runner{
    void purr(){
        System.out.println("Cat is purring");
    }


    // Inherited functions can have less restrictive access modifiers
    // Parent class/Interface - Private | child can have -> Protected/default/public
    @Override
    public void run() {
        System.out.println("Cat is running");
    }
}
// Break till 10:30 AM

// Abstract classes
// Static method inheritance