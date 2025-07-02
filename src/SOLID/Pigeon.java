package SOLID;

public class Pigeon extends Bird implements Flyable{
    FlyingBehaviour fb;

    public Pigeon(FlyingBehaviour fb){
        this.fb = fb;
    }
    public void makeSound(){
        System.out.println("Pigeon making sound");
    }

    @Override
    public void fly(){
        System.out.println("Pigeon is low flying");
        //if(at low altitude)
        fb.fly(this.name);
        //else
        fb.glide();
    }

}
