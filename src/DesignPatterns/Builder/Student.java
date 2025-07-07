package DesignPatterns.Builder;

public class Student {
    String name;
    Integer age;
    Float psp;
    String batch;
    String course;

    
    // void validate(StudentBuilder studentBuilder){
    //     if(studentBuilder.name == null){
    //         throw new RuntimeException("Name can't be null");
    //     }
    //     if(studentBuilder.age < 18){
    //         throw new RuntimeException("Student must be an adult");
    //     }
    // }

    private Student(StudentBuilder studentBuilder){
        // validate(studentBuilder);
        if(studentBuilder==null){
            throw new RuntimeException();
        }
        this.name = studentBuilder.name;
        this.age = studentBuilder.age;
        this.batch = studentBuilder.batch;
        this.psp = studentBuilder.psp;
        this.course = "Academy";

    }
    // public StudentBuilder nonStaticGetBuilder(){
    //     return new StudentBuilder();
    // }

    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }
    //Car class: CarBuilder getBuilder(String type){
        // if(type == "Sedan"){
        //     return new SedanCarBuilder();
        // }elseif(type =="SUV"){
        //     return new SUVCarBuilder();
        // }
    // }

    public static class StudentBuilder {
        String name;
        Integer age;
        Float psp;
        String batch;
    
        StudentBuilder setName(String name){
            this.name = name;
            return this;
        }
    
        StudentBuilder setAge(Integer age){
            this.age = age;
            return this;
        }
        
        StudentBuilder setPSP(Float psp){
            this.psp = psp;
            return this;
    
        }
        StudentBuilder setBatch(String batch){
            this.batch = batch;
            return this;
    
        }
    
        Student build(){
            if(this.name == null){
                throw new RuntimeException("Name can't be null");
            }
            if(this.age < 18){
                throw new RuntimeException("Student must be an adult");
            }
            return new Student(this);
        }
    }
}
