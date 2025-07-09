package DesignPatterns.PrototypeAndRegistry;

public class Client {
    public static void main(String[] args) {
        AcademyStudent ast = new AcademyStudent(null);
        Student st = new Student(null);

        PrototypeRegistry registry = new PrototypeRegistry();

        registry.register("Student", st);
        registry.register("AcademicStudent", ast);

        Student stCopy0 = registry.get("Student");

        AcademyStudent stCopy = (AcademyStudent) registry.get("AcademicStudent");
    }
    
}
