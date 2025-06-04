package inheritance;

public class User {
    private String id;
    public String name;

    public User(){
        System.out.println("User default constructor called");
    }

    public User(String id, String name){
        this.id = id;
        this.name = name;
        System.out.println("User param constructor called");
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        if (id != null) {
            this.id = id;
        }
    }

    static void doSome(){
        System.out.println("User do something");
    }
}
