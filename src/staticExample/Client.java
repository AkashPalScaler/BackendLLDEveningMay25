package staticExample;

public class Client {
    public static void main(String[] args) {
        System.out.println("Count of students : ");

        Student.fun(); // Builder Pattern - You want to call a function before actual object creation
        Student s = new Student();
        Student.fun2(s);
//        Student s1 = new Student(); // 1
//        Student s2 = new Student(); // 2
//        Student s3 = new Student(); // 3



        System.out.println("DEBUG");
    }
}
