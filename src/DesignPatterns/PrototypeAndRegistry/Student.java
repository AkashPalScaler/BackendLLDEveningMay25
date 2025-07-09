package DesignPatterns.PrototypeAndRegistry;

public class Student implements Prototype<Student>{
    int id;
    String name;
    int age;
    float psp;

    public Student(Student st){
        this.id = st.id;
        this.name = st.name;
        this.age = st.age;
        this.psp = st.psp;
    }

    public Student copy(){
        return new Student(this);
    }
}
