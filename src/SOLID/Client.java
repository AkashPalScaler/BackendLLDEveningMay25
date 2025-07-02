package SOLID;

public class Client {
    public static void main(String[] args) {
        Bird b1 = new Pigeon(new LowFly());
        Bird b2 = new Eagle(new MidFly());

        Bird b3 = new Pigeon(new HighFly());
    }
    
}
