package inheritance;

public class Client {
    public static void main(String[] args) {
//        User u =  new User();
//        Student s = new Student();

//        u.name = "Akash";



        User.doSome(); // User class level static func
        Student.doSome();  // Student class level static func

        User u =  new User();
        Student s = new Student();
        User ust = new Student();
        u.doSome(); // user do something
        s.doSome(); // student do something // method hiding not overriding
        ust.doSome(); //  Correct : User do something | Wrong : student do something - X :



        System.out.println("DEBUG");
    }
}
