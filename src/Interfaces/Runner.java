package Interfaces;

public interface Runner {
    int x=10; // public + final + static
    void run(); //looks default but always public
    //Default defination of method using default keyword
    // Not default access modifier - default functions
    // No default keyword - Interface abstract methods cannot have body
    default void speed(){
        //speed calculation
        System.out.println("kjsnjsd");
    }
}
