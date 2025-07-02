package SOLID;

public class Penguin extends Bird implements Swimmable{
    public void makeSound(){
        System.out.println("Penguin making sound");
    }

    @Override
    public void swim(){
        System.out.println("Penguin is swimming");
    }

}
