package SOLID;

public abstract class Bird {
    String name;
    String type;

    void eat(){
        System.out.println("Bird is eating");
    }

    abstract void makeSound();
}
