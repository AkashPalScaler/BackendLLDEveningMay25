package SOLID;

public class Eagle extends Bird implements Flyable{
    FlyingBehaviour fb;

    public Eagle(FlyingBehaviour fb){
        this.fb = fb;
    }
    public void makeSound(){
        System.out.println("Eagle making sound");
    }

    @Override
    public void fly(){
        // System.out.println("Eagle is high flying");
        //some code not common
        fb.fly(this.name);
        //some more code not common
        fb.glide();
    }

}
