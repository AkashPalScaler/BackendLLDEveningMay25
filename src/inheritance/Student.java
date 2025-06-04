package inheritance;

import java.util.Queue;
import java.util.Stack;

public class Student extends User{
    private String batch;
    public int psp;

    public Student(){
        //super() - behind the scenes
        super("122", "Alash");
        System.out.println("Student default constructor called");
    }

    public void doSomething(){
        this.batch= "kshdb";
        this.getId();
    }

    static void doSome(){
        System.out.println("Student do something");
    }
}
