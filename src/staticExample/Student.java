package staticExample;

public class Student {
    String name; // Will these exist if object not created
    int psp;
    private static int count;

    public Student(){
        count++;
    }

    static void fun(){
        //Without creating object
        //Static method can access only static
        System.out.println("Static method fun");

    }

    static void fun2(Student s){
        //Without creating object
        //Static method can access only static
        System.out.println("Static method fun" + s.name);

    }

    void funSomething(){
        // Will you be able to call this method of object is not created?
        // non static method can access both static and non static
        count = 10;
    }
}
